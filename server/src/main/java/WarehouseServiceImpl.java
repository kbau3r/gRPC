import io.grpc.stub.StreamObserver;
import warehouse.Hello.WarehouseRequest;
import warehouse.Hello.WarehouseResponse;
import warehouse.Hello.Warehouse;
import warehouse.Hello.Product;
import warehouse.WarehouseServiceGrpc;

import java.util.ArrayList;
import java.util.List;

class WarehouseServiceImpl extends WarehouseServiceGrpc.WarehouseServiceImplBase {
    @Override
    public void getWarehouse(WarehouseRequest req, StreamObserver<WarehouseResponse> responseObserver) {

        Product product = Product.newBuilder()
                .setProductID("P001")
                .setProductName("Beispielprodukt")
                .setProductCategory("Kategorie")
                .setProductQuantity(100)
                .setProductUnit("Stück")
                .build();

        Product product2 = Product.newBuilder()
                .setProductID("P002")
                .setProductName("Beispielprodukt")
                .setProductCategory("Kategorie")
                .setProductQuantity(100)
                .setProductUnit("Stück")
                .build();

        Product product3 = Product.newBuilder()
                .setProductID("P003")
                .setProductName("Beispielprodukt")
                .setProductCategory("Kategorie")
                .setProductQuantity(100)
                .setProductUnit("Stück")
                .build();

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);

        Warehouse warehouse = Warehouse.newBuilder()
                .setWarehouseID("W001")
                .setWarehouseName("Hauptlager")
                .setTimestamp("2023-01-01T00:00:00Z")
                .setWarehouseAddress("Lagerstraße 1, 12345 Lagerstadt")
                .addAllProducts(productList)
                .build();

        WarehouseResponse response = WarehouseResponse.newBuilder()
                .addWarehouses(warehouse)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}