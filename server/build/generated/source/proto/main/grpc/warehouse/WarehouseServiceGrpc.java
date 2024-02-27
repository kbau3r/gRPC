package warehouse;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: hello.proto")
public final class WarehouseServiceGrpc {

  private WarehouseServiceGrpc() {}

  public static final String SERVICE_NAME = "warehouse.WarehouseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<warehouse.Hello.WarehouseRequest,
      warehouse.Hello.WarehouseResponse> getGetWarehouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWarehouse",
      requestType = warehouse.Hello.WarehouseRequest.class,
      responseType = warehouse.Hello.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse.Hello.WarehouseRequest,
      warehouse.Hello.WarehouseResponse> getGetWarehouseMethod() {
    io.grpc.MethodDescriptor<warehouse.Hello.WarehouseRequest, warehouse.Hello.WarehouseResponse> getGetWarehouseMethod;
    if ((getGetWarehouseMethod = WarehouseServiceGrpc.getGetWarehouseMethod) == null) {
      synchronized (WarehouseServiceGrpc.class) {
        if ((getGetWarehouseMethod = WarehouseServiceGrpc.getGetWarehouseMethod) == null) {
          WarehouseServiceGrpc.getGetWarehouseMethod = getGetWarehouseMethod =
              io.grpc.MethodDescriptor.<warehouse.Hello.WarehouseRequest, warehouse.Hello.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWarehouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.Hello.WarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse.Hello.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseServiceMethodDescriptorSupplier("GetWarehouse"))
              .build();
        }
      }
    }
    return getGetWarehouseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceStub>() {
        @java.lang.Override
        public WarehouseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceStub(channel, callOptions);
        }
      };
    return WarehouseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceBlockingStub>() {
        @java.lang.Override
        public WarehouseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceBlockingStub(channel, callOptions);
        }
      };
    return WarehouseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseServiceFutureStub>() {
        @java.lang.Override
        public WarehouseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseServiceFutureStub(channel, callOptions);
        }
      };
    return WarehouseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WarehouseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWarehouse(warehouse.Hello.WarehouseRequest request,
        io.grpc.stub.StreamObserver<warehouse.Hello.WarehouseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWarehouseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWarehouseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                warehouse.Hello.WarehouseRequest,
                warehouse.Hello.WarehouseResponse>(
                  this, METHODID_GET_WAREHOUSE)))
          .build();
    }
  }

  /**
   */
  public static final class WarehouseServiceStub extends io.grpc.stub.AbstractAsyncStub<WarehouseServiceStub> {
    private WarehouseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWarehouse(warehouse.Hello.WarehouseRequest request,
        io.grpc.stub.StreamObserver<warehouse.Hello.WarehouseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWarehouseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WarehouseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WarehouseServiceBlockingStub> {
    private WarehouseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public warehouse.Hello.WarehouseResponse getWarehouse(warehouse.Hello.WarehouseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWarehouseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WarehouseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WarehouseServiceFutureStub> {
    private WarehouseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse.Hello.WarehouseResponse> getWarehouse(
        warehouse.Hello.WarehouseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWarehouseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WAREHOUSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WarehouseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WarehouseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WAREHOUSE:
          serviceImpl.getWarehouse((warehouse.Hello.WarehouseRequest) request,
              (io.grpc.stub.StreamObserver<warehouse.Hello.WarehouseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarehouseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return warehouse.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WarehouseService");
    }
  }

  private static final class WarehouseServiceFileDescriptorSupplier
      extends WarehouseServiceBaseDescriptorSupplier {
    WarehouseServiceFileDescriptorSupplier() {}
  }

  private static final class WarehouseServiceMethodDescriptorSupplier
      extends WarehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WarehouseServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WarehouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseServiceFileDescriptorSupplier())
              .addMethod(getGetWarehouseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
