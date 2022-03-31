package com.yandex.ydb.example;

import com.yandex.ydb.core.auth.AuthProvider;
import com.yandex.ydb.core.auth.NopAuthProvider;
import com.yandex.ydb.core.grpc.GrpcTransport;
import com.yandex.ydb.table.Session;
import com.yandex.ydb.table.TableClient;
import com.yandex.ydb.table.result.ResultSetReader;
import com.yandex.ydb.table.rpc.grpc.GrpcTableRpc;
import com.yandex.ydb.table.transaction.TxControl;

import java.time.Duration;

public final class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java -jar ydb-anonimous-example.jar <connection-string>");
            return;
        }
        String connectionString = args[0];

        // Anonymous credentials
        AuthProvider authProvider = NopAuthProvider.INSTANCE;

        GrpcTransport transport = GrpcTransport.forConnectionString(connectionString)
                .withAuthProvider(authProvider) // Or this method could not be called at all
                .build();

        try (TableClient tableClient = TableClient
                .newClient(GrpcTableRpc.ownTransport(transport))
                .build()) {

            Session session = tableClient.getOrCreateSession(Duration.ofSeconds(10))
                    .join().expect("ok");

            ResultSetReader rsReader = session.executeDataQuery("SELECT 1;", TxControl.serializableRw())
                    .join().expect("ok").getResultSet(0);

            assert (rsReader.getRowCount() == 1);
            System.out.println("Result:");
            while (rsReader.next()) {
                System.out.println(rsReader.getColumn(0).getInt32());
            }

            session.release();
        }
    }
}
