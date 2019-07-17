package com.yandex.ydb.table;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import javax.annotation.WillClose;

import com.yandex.ydb.core.Result;
import com.yandex.ydb.table.impl.TableClientBuilderImpl;
import com.yandex.ydb.table.rpc.TableRpc;
import com.yandex.ydb.table.settings.CreateSessionSettings;


/**
 * @author Sergey Polovko
 */
public interface TableClient extends AutoCloseable {

    static Builder newClient(@WillClose TableRpc tableRpc) {
        return new TableClientBuilderImpl(tableRpc);
    }

    /**
     * Create new session.
     */
    CompletableFuture<Result<Session>> createSession(CreateSessionSettings settings);

    default CompletableFuture<Result<Session>> createSession() {
        return createSession(new CreateSessionSettings());
    }

    /**
     * Returns session from session pool, if all sessions are occupied new session will be created.
     */
    CompletableFuture<Result<Session>> getOrCreateSession();

    @Override
    void close();

    /**
     * BUILDER
     */
    interface Builder {

        Builder queryCacheSize(int size);

        Builder sessionPoolSize(int minSize, int maxSize);

        Builder sessionKeepAliveTime(long time, TimeUnit timeUnit);

        Builder sessionMaxIdleTime(long time, TimeUnit timeUnit);

        Builder sessionCreationMaxRetries(int maxRetries);

        TableClient build();
    }
}
