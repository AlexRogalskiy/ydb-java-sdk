package com.yandex.ydb.table.impl;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.yandex.ydb.core.Result;
import com.yandex.ydb.core.rpc.OperationTray;
import com.yandex.ydb.table.Session;
import com.yandex.ydb.table.TableClient;
import com.yandex.ydb.table.YdbTable;
import com.yandex.ydb.table.rpc.TableRpc;
import com.yandex.ydb.table.settings.CreateSessionSettings;


/**
 * @author Sergey Polovko
 */
final class TableClientImpl implements TableClient {

    private final TableRpc tableRpc;
    @Nullable
    private final SessionPool sessionPool;
    private final OperationTray operationTray;

    TableClientImpl(TableClientBuilderImpl builder) {
        this.tableRpc = builder.tableRpc;
        this.sessionPool = builder.sessionPoolOptions.getMaxSize() != 0
            ? new SessionPool(this, builder.sessionPoolOptions)
            : null;
        this.operationTray = tableRpc.getOperationTray();
    }

    @Override
    public CompletableFuture<Result<Session>> createSession(CreateSessionSettings settings) {
        return createSessionImpl(settings);
    }

    CompletableFuture<Result<Session>> createSessionImpl(CreateSessionSettings settings) {
        YdbTable.CreateSessionRequest request = YdbTable.CreateSessionRequest.newBuilder()
            .build();

        return tableRpc.createSession(request)
            .thenCompose(response -> {
                if (!response.isSuccess()) {
                    return CompletableFuture.completedFuture(response.cast());
                }
                return operationTray.waitResult(
                    response.expect("createSession()").getOperation(),
                    YdbTable.CreateSessionResult.class,
                    result -> new SessionImpl(result.getSessionId(), tableRpc, sessionPool));
            });
    }

    @Override
    public CompletableFuture<Result<Session>> getOrCreateSession() {
        if (sessionPool == null) {
            return createSessionImpl(new CreateSessionSettings());
        }
        return sessionPool.acquire()
            .handle((s, t) -> {
                if (t == null) return Result.success(s);
                return Result.error("cannot acquire session from pool", t);
            });
    }

    @Override
    public void close() {
        if (sessionPool != null) {
            sessionPool.close();
        }
        tableRpc.close();
    }
}
