package com.slaughterhouse.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: slaughterhouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductToPartServiceGrpc {

  private ProductToPartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "via.pro3.slaughterhouse.ProductToPartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateProductToPartRequest,
      com.slaughterhouse.grpc.CreateProductToPartResponse> getCreateProductToPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProductToPart",
      requestType = com.slaughterhouse.grpc.CreateProductToPartRequest.class,
      responseType = com.slaughterhouse.grpc.CreateProductToPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateProductToPartRequest,
      com.slaughterhouse.grpc.CreateProductToPartResponse> getCreateProductToPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateProductToPartRequest, com.slaughterhouse.grpc.CreateProductToPartResponse> getCreateProductToPartMethod;
    if ((getCreateProductToPartMethod = ProductToPartServiceGrpc.getCreateProductToPartMethod) == null) {
      synchronized (ProductToPartServiceGrpc.class) {
        if ((getCreateProductToPartMethod = ProductToPartServiceGrpc.getCreateProductToPartMethod) == null) {
          ProductToPartServiceGrpc.getCreateProductToPartMethod = getCreateProductToPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.CreateProductToPartRequest, com.slaughterhouse.grpc.CreateProductToPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProductToPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateProductToPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateProductToPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductToPartServiceMethodDescriptorSupplier("CreateProductToPart"))
              .build();
        }
      }
    }
    return getCreateProductToPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.ProductToPart> getGetProductToPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductToPart",
      requestType = com.slaughterhouse.grpc.GetByIdRequest.class,
      responseType = com.slaughterhouse.grpc.ProductToPart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.ProductToPart> getGetProductToPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.ProductToPart> getGetProductToPartMethod;
    if ((getGetProductToPartMethod = ProductToPartServiceGrpc.getGetProductToPartMethod) == null) {
      synchronized (ProductToPartServiceGrpc.class) {
        if ((getGetProductToPartMethod = ProductToPartServiceGrpc.getGetProductToPartMethod) == null) {
          ProductToPartServiceGrpc.getGetProductToPartMethod = getGetProductToPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.ProductToPart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductToPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.ProductToPart.getDefaultInstance()))
              .setSchemaDescriptor(new ProductToPartServiceMethodDescriptorSupplier("GetProductToPart"))
              .build();
        }
      }
    }
    return getGetProductToPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteProductToPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProductToPart",
      requestType = com.slaughterhouse.grpc.DeleteByIdRequest.class,
      responseType = com.slaughterhouse.grpc.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteProductToPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse> getDeleteProductToPartMethod;
    if ((getDeleteProductToPartMethod = ProductToPartServiceGrpc.getDeleteProductToPartMethod) == null) {
      synchronized (ProductToPartServiceGrpc.class) {
        if ((getDeleteProductToPartMethod = ProductToPartServiceGrpc.getDeleteProductToPartMethod) == null) {
          ProductToPartServiceGrpc.getDeleteProductToPartMethod = getDeleteProductToPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProductToPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductToPartServiceMethodDescriptorSupplier("DeleteProductToPart"))
              .build();
        }
      }
    }
    return getDeleteProductToPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListProductToPartResponse> getListProductToPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProductToPart",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.slaughterhouse.grpc.ListProductToPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListProductToPartResponse> getListProductToPartMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListProductToPartResponse> getListProductToPartMethod;
    if ((getListProductToPartMethod = ProductToPartServiceGrpc.getListProductToPartMethod) == null) {
      synchronized (ProductToPartServiceGrpc.class) {
        if ((getListProductToPartMethod = ProductToPartServiceGrpc.getListProductToPartMethod) == null) {
          ProductToPartServiceGrpc.getListProductToPartMethod = getListProductToPartMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListProductToPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProductToPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.ListProductToPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductToPartServiceMethodDescriptorSupplier("ListProductToPart"))
              .build();
        }
      }
    }
    return getListProductToPartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductToPartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceStub>() {
        @java.lang.Override
        public ProductToPartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductToPartServiceStub(channel, callOptions);
        }
      };
    return ProductToPartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductToPartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceBlockingStub>() {
        @java.lang.Override
        public ProductToPartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductToPartServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductToPartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductToPartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductToPartServiceFutureStub>() {
        @java.lang.Override
        public ProductToPartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductToPartServiceFutureStub(channel, callOptions);
        }
      };
    return ProductToPartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createProductToPart(com.slaughterhouse.grpc.CreateProductToPartRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateProductToPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductToPartMethod(), responseObserver);
    }

    /**
     */
    default void getProductToPart(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ProductToPart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductToPartMethod(), responseObserver);
    }

    /**
     */
    default void deleteProductToPart(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductToPartMethod(), responseObserver);
    }

    /**
     */
    default void listProductToPart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListProductToPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProductToPartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductToPartService.
   */
  public static abstract class ProductToPartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductToPartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductToPartService.
   */
  public static final class ProductToPartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductToPartServiceStub> {
    private ProductToPartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductToPartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductToPartServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProductToPart(com.slaughterhouse.grpc.CreateProductToPartRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateProductToPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductToPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductToPart(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ProductToPart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductToPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProductToPart(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductToPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProductToPart(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListProductToPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProductToPartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductToPartService.
   */
  public static final class ProductToPartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductToPartServiceBlockingStub> {
    private ProductToPartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductToPartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductToPartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.slaughterhouse.grpc.CreateProductToPartResponse createProductToPart(com.slaughterhouse.grpc.CreateProductToPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductToPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.ProductToPart getProductToPart(com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductToPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.DeleteResponse deleteProductToPart(com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductToPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.ListProductToPartResponse listProductToPart(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProductToPartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductToPartService.
   */
  public static final class ProductToPartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductToPartServiceFutureStub> {
    private ProductToPartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductToPartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductToPartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.CreateProductToPartResponse> createProductToPart(
        com.slaughterhouse.grpc.CreateProductToPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductToPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.ProductToPart> getProductToPart(
        com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductToPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.DeleteResponse> deleteProductToPart(
        com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductToPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.ListProductToPartResponse> listProductToPart(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProductToPartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT_TO_PART = 0;
  private static final int METHODID_GET_PRODUCT_TO_PART = 1;
  private static final int METHODID_DELETE_PRODUCT_TO_PART = 2;
  private static final int METHODID_LIST_PRODUCT_TO_PART = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT_TO_PART:
          serviceImpl.createProductToPart((com.slaughterhouse.grpc.CreateProductToPartRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateProductToPartResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_TO_PART:
          serviceImpl.getProductToPart((com.slaughterhouse.grpc.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ProductToPart>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT_TO_PART:
          serviceImpl.deleteProductToPart((com.slaughterhouse.grpc.DeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_PRODUCT_TO_PART:
          serviceImpl.listProductToPart((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListProductToPartResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateProductToPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.CreateProductToPartRequest,
              com.slaughterhouse.grpc.CreateProductToPartResponse>(
                service, METHODID_CREATE_PRODUCT_TO_PART)))
        .addMethod(
          getGetProductToPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.GetByIdRequest,
              com.slaughterhouse.grpc.ProductToPart>(
                service, METHODID_GET_PRODUCT_TO_PART)))
        .addMethod(
          getDeleteProductToPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.DeleteByIdRequest,
              com.slaughterhouse.grpc.DeleteResponse>(
                service, METHODID_DELETE_PRODUCT_TO_PART)))
        .addMethod(
          getListProductToPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.slaughterhouse.grpc.ListProductToPartResponse>(
                service, METHODID_LIST_PRODUCT_TO_PART)))
        .build();
  }

  private static abstract class ProductToPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductToPartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.slaughterhouse.grpc.SlaughterhouseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductToPartService");
    }
  }

  private static final class ProductToPartServiceFileDescriptorSupplier
      extends ProductToPartServiceBaseDescriptorSupplier {
    ProductToPartServiceFileDescriptorSupplier() {}
  }

  private static final class ProductToPartServiceMethodDescriptorSupplier
      extends ProductToPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductToPartServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductToPartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductToPartServiceFileDescriptorSupplier())
              .addMethod(getCreateProductToPartMethod())
              .addMethod(getGetProductToPartMethod())
              .addMethod(getDeleteProductToPartMethod())
              .addMethod(getListProductToPartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
