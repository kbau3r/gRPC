import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import warehouse.WarehouseServiceGrpc;
import warehouse.Hello.WarehouseRequest;
import warehouse.Hello.WarehouseResponse;
import warehouse.Hello.Warehouse;
import warehouse.Hello.Product;

import java.io.IOException;

public class WarehouseServer {

    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new WarehouseServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            WarehouseServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final WarehouseServer server = new WarehouseServer();
        server.start();
        server.blockUntilShutdown();
    }
}