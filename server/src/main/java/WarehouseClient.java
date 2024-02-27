import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import warehouse.WarehouseServiceGrpc;
import warehouse.Hello.WarehouseRequest;
import warehouse.Hello.WarehouseResponse;

public class WarehouseClient {

    public static void main(String[] args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        WarehouseServiceGrpc.WarehouseServiceBlockingStub stub = WarehouseServiceGrpc.newBlockingStub(channel);

        WarehouseRequest request = WarehouseRequest.newBuilder().setWarehouseID("W001").build();

        WarehouseResponse response = stub.getWarehouse(request);

        response.getWarehousesList().forEach(warehouse -> {
            System.out.println("Warehouse ID: " + warehouse.getWarehouseID());
            System.out.println("Warehouse Name: " + warehouse.getWarehouseName());
            System.out.println("Timestamp: " + warehouse.getTimestamp());
            System.out.println("Address: " + warehouse.getWarehouseAddress());
            warehouse.getProductsList().forEach(product -> {
                System.out.println("\tProduct ID: " + product.getProductID());
                System.out.println("\tProduct Name: " + product.getProductName());
                System.out.println("\tCategory: " + product.getProductCategory());
                System.out.println("\tQuantity: " + product.getProductQuantity());
                System.out.println("\tUnit: " + product.getProductUnit());
            });
        });

        channel.shutdownNow();
    }
}
