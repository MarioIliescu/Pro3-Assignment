package com.slaughterhouse.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: slaughterhouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrayServiceGrpc {

  private TrayServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "via.pro3.slaughterhouse.TrayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateTrayRequest,
      com.slaughterhouse.grpc.CreateTrayResponse> getCreateTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTray",
      requestType = com.slaughterhouse.grpc.CreateTrayRequest.class,
      responseType = com.slaughterhouse.grpc.CreateTrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateTrayRequest,
      com.slaughterhouse.grpc.CreateTrayResponse> getCreateTrayMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateTrayRequest, com.slaughterhouse.grpc.CreateTrayResponse> getCreateTrayMethod;
    if ((getCreateTrayMethod = TrayServiceGrpc.getCreateTrayMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getCreateTrayMethod = TrayServiceGrpc.getCreateTrayMethod) == null) {
          TrayServiceGrpc.getCreateTrayMethod = getCreateTrayMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.CreateTrayRequest, com.slaughterhouse.grpc.CreateTrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateTrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateTrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("CreateTray"))
              .build();
        }
      }
    }
    return getCreateTrayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.TrayProto> getGetTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTray",
      requestType = com.slaughterhouse.grpc.GetByIdRequest.class,
      responseType = com.slaughterhouse.grpc.TrayProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.TrayProto> getGetTrayMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.TrayProto> getGetTrayMethod;
    if ((getGetTrayMethod = TrayServiceGrpc.getGetTrayMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getGetTrayMethod = TrayServiceGrpc.getGetTrayMethod) == null) {
          TrayServiceGrpc.getGetTrayMethod = getGetTrayMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.TrayProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.TrayProto.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("GetTray"))
              .build();
        }
      }
    }
    return getGetTrayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTray",
      requestType = com.slaughterhouse.grpc.DeleteByIdRequest.class,
      responseType = com.slaughterhouse.grpc.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteTrayMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse> getDeleteTrayMethod;
    if ((getDeleteTrayMethod = TrayServiceGrpc.getDeleteTrayMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getDeleteTrayMethod = TrayServiceGrpc.getDeleteTrayMethod) == null) {
          TrayServiceGrpc.getDeleteTrayMethod = getDeleteTrayMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("DeleteTray"))
              .build();
        }
      }
    }
    return getDeleteTrayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListTraysResponse> getListTraysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrays",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.slaughterhouse.grpc.ListTraysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListTraysResponse> getListTraysMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListTraysResponse> getListTraysMethod;
    if ((getListTraysMethod = TrayServiceGrpc.getListTraysMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getListTraysMethod = TrayServiceGrpc.getListTraysMethod) == null) {
          TrayServiceGrpc.getListTraysMethod = getListTraysMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListTraysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.ListTraysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("ListTrays"))
              .build();
        }
      }
    }
    return getListTraysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub>() {
        @java.lang.Override
        public TrayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceStub(channel, callOptions);
        }
      };
    return TrayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub>() {
        @java.lang.Override
        public TrayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceBlockingStub(channel, callOptions);
        }
      };
    return TrayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub>() {
        @java.lang.Override
        public TrayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceFutureStub(channel, callOptions);
        }
      };
    return TrayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTray(com.slaughterhouse.grpc.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTrayMethod(), responseObserver);
    }

    /**
     */
    default void getTray(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.TrayProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrayMethod(), responseObserver);
    }

    /**
     */
    default void deleteTray(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTrayMethod(), responseObserver);
    }

    /**
     */
    default void listTrays(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListTraysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTraysMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrayService.
   */
  public static abstract class TrayServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrayServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrayService.
   */
  public static final class TrayServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TrayServiceStub> {
    private TrayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTray(com.slaughterhouse.grpc.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTrayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTray(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.TrayProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTray(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTrayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTrays(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListTraysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTraysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrayService.
   */
  public static final class TrayServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrayServiceBlockingStub> {
    private TrayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.slaughterhouse.grpc.CreateTrayResponse createTray(com.slaughterhouse.grpc.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTrayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.TrayProto getTray(com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.DeleteResponse deleteTray(com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTrayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.ListTraysResponse listTrays(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTraysMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrayService.
   */
  public static final class TrayServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrayServiceFutureStub> {
    private TrayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.CreateTrayResponse> createTray(
        com.slaughterhouse.grpc.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTrayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.TrayProto> getTray(
        com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.DeleteResponse> deleteTray(
        com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTrayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.ListTraysResponse> listTrays(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTraysMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRAY = 0;
  private static final int METHODID_GET_TRAY = 1;
  private static final int METHODID_DELETE_TRAY = 2;
  private static final int METHODID_LIST_TRAYS = 3;

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
        case METHODID_CREATE_TRAY:
          serviceImpl.createTray((com.slaughterhouse.grpc.CreateTrayRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateTrayResponse>) responseObserver);
          break;
        case METHODID_GET_TRAY:
          serviceImpl.getTray((com.slaughterhouse.grpc.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.TrayProto>) responseObserver);
          break;
        case METHODID_DELETE_TRAY:
          serviceImpl.deleteTray((com.slaughterhouse.grpc.DeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_TRAYS:
          serviceImpl.listTrays((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListTraysResponse>) responseObserver);
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
          getCreateTrayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.CreateTrayRequest,
              com.slaughterhouse.grpc.CreateTrayResponse>(
                service, METHODID_CREATE_TRAY)))
        .addMethod(
          getGetTrayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.GetByIdRequest,
              com.slaughterhouse.grpc.TrayProto>(
                service, METHODID_GET_TRAY)))
        .addMethod(
          getDeleteTrayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.DeleteByIdRequest,
              com.slaughterhouse.grpc.DeleteResponse>(
                service, METHODID_DELETE_TRAY)))
        .addMethod(
          getListTraysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.slaughterhouse.grpc.ListTraysResponse>(
                service, METHODID_LIST_TRAYS)))
        .build();
  }

  private static abstract class TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.slaughterhouse.grpc.SlaughterhouseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrayService");
    }
  }

  private static final class TrayServiceFileDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier {
    TrayServiceFileDescriptorSupplier() {}
  }

  private static final class TrayServiceMethodDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrayServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrayServiceFileDescriptorSupplier())
              .addMethod(getCreateTrayMethod())
              .addMethod(getGetTrayMethod())
              .addMethod(getDeleteTrayMethod())
              .addMethod(getListTraysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
