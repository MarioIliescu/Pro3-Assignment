package com.slaughterhouse.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: slaughterhouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnimalPartServiceGrpc {

  private AnimalPartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "via.pro3.slaughterhouse.AnimalPartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalPartRequest,
      com.slaughterhouse.grpc.CreateAnimalPartResponse> getCreateAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAnimalPart",
      requestType = com.slaughterhouse.grpc.CreateAnimalPartRequest.class,
      responseType = com.slaughterhouse.grpc.CreateAnimalPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalPartRequest,
      com.slaughterhouse.grpc.CreateAnimalPartResponse> getCreateAnimalPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalPartRequest, com.slaughterhouse.grpc.CreateAnimalPartResponse> getCreateAnimalPartMethod;
    if ((getCreateAnimalPartMethod = AnimalPartServiceGrpc.getCreateAnimalPartMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getCreateAnimalPartMethod = AnimalPartServiceGrpc.getCreateAnimalPartMethod) == null) {
          AnimalPartServiceGrpc.getCreateAnimalPartMethod = getCreateAnimalPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.CreateAnimalPartRequest, com.slaughterhouse.grpc.CreateAnimalPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateAnimalPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateAnimalPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("CreateAnimalPart"))
              .build();
        }
      }
    }
    return getCreateAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.AnimalPart> getGetAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalPart",
      requestType = com.slaughterhouse.grpc.GetByIdRequest.class,
      responseType = com.slaughterhouse.grpc.AnimalPart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.AnimalPart> getGetAnimalPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.AnimalPart> getGetAnimalPartMethod;
    if ((getGetAnimalPartMethod = AnimalPartServiceGrpc.getGetAnimalPartMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getGetAnimalPartMethod = AnimalPartServiceGrpc.getGetAnimalPartMethod) == null) {
          AnimalPartServiceGrpc.getGetAnimalPartMethod = getGetAnimalPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.AnimalPart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.AnimalPart.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("GetAnimalPart"))
              .build();
        }
      }
    }
    return getGetAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnimalPart",
      requestType = com.slaughterhouse.grpc.DeleteByIdRequest.class,
      responseType = com.slaughterhouse.grpc.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalPartMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalPartMethod;
    if ((getDeleteAnimalPartMethod = AnimalPartServiceGrpc.getDeleteAnimalPartMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getDeleteAnimalPartMethod = AnimalPartServiceGrpc.getDeleteAnimalPartMethod) == null) {
          AnimalPartServiceGrpc.getDeleteAnimalPartMethod = getDeleteAnimalPartMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("DeleteAnimalPart"))
              .build();
        }
      }
    }
    return getDeleteAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListAnimalPartsResponse> getListAnimalPartsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnimalParts",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.slaughterhouse.grpc.ListAnimalPartsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListAnimalPartsResponse> getListAnimalPartsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListAnimalPartsResponse> getListAnimalPartsMethod;
    if ((getListAnimalPartsMethod = AnimalPartServiceGrpc.getListAnimalPartsMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getListAnimalPartsMethod = AnimalPartServiceGrpc.getListAnimalPartsMethod) == null) {
          AnimalPartServiceGrpc.getListAnimalPartsMethod = getListAnimalPartsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListAnimalPartsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnimalParts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.ListAnimalPartsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("ListAnimalParts"))
              .build();
        }
      }
    }
    return getListAnimalPartsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalPartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceStub>() {
        @java.lang.Override
        public AnimalPartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceStub(channel, callOptions);
        }
      };
    return AnimalPartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalPartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceBlockingStub>() {
        @java.lang.Override
        public AnimalPartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalPartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalPartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceFutureStub>() {
        @java.lang.Override
        public AnimalPartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalPartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAnimalPart(com.slaughterhouse.grpc.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalPartMethod(), responseObserver);
    }

    /**
     */
    default void getAnimalPart(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.AnimalPart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartMethod(), responseObserver);
    }

    /**
     */
    default void deleteAnimalPart(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnimalPartMethod(), responseObserver);
    }

    /**
     */
    default void listAnimalParts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalPartsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnimalPartsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnimalPartService.
   */
  public static abstract class AnimalPartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnimalPartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnimalPartService.
   */
  public static final class AnimalPartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnimalPartServiceStub> {
    private AnimalPartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimalPart(com.slaughterhouse.grpc.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalPart(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.AnimalPart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnimalPart(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAnimalParts(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalPartsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnimalPartsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnimalPartService.
   */
  public static final class AnimalPartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnimalPartServiceBlockingStub> {
    private AnimalPartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.slaughterhouse.grpc.CreateAnimalPartResponse createAnimalPart(com.slaughterhouse.grpc.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.AnimalPart getAnimalPart(com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.DeleteResponse deleteAnimalPart(com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.ListAnimalPartsResponse listAnimalParts(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnimalPartsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnimalPartService.
   */
  public static final class AnimalPartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnimalPartServiceFutureStub> {
    private AnimalPartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.CreateAnimalPartResponse> createAnimalPart(
        com.slaughterhouse.grpc.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.AnimalPart> getAnimalPart(
        com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.DeleteResponse> deleteAnimalPart(
        com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.ListAnimalPartsResponse> listAnimalParts(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnimalPartsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL_PART = 0;
  private static final int METHODID_GET_ANIMAL_PART = 1;
  private static final int METHODID_DELETE_ANIMAL_PART = 2;
  private static final int METHODID_LIST_ANIMAL_PARTS = 3;

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
        case METHODID_CREATE_ANIMAL_PART:
          serviceImpl.createAnimalPart((com.slaughterhouse.grpc.CreateAnimalPartRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalPartResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_PART:
          serviceImpl.getAnimalPart((com.slaughterhouse.grpc.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.AnimalPart>) responseObserver);
          break;
        case METHODID_DELETE_ANIMAL_PART:
          serviceImpl.deleteAnimalPart((com.slaughterhouse.grpc.DeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_ANIMAL_PARTS:
          serviceImpl.listAnimalParts((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalPartsResponse>) responseObserver);
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
          getCreateAnimalPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.CreateAnimalPartRequest,
              com.slaughterhouse.grpc.CreateAnimalPartResponse>(
                service, METHODID_CREATE_ANIMAL_PART)))
        .addMethod(
          getGetAnimalPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.GetByIdRequest,
              com.slaughterhouse.grpc.AnimalPart>(
                service, METHODID_GET_ANIMAL_PART)))
        .addMethod(
          getDeleteAnimalPartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.DeleteByIdRequest,
              com.slaughterhouse.grpc.DeleteResponse>(
                service, METHODID_DELETE_ANIMAL_PART)))
        .addMethod(
          getListAnimalPartsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.slaughterhouse.grpc.ListAnimalPartsResponse>(
                service, METHODID_LIST_ANIMAL_PARTS)))
        .build();
  }

  private static abstract class AnimalPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalPartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.slaughterhouse.grpc.SlaughterhouseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalPartService");
    }
  }

  private static final class AnimalPartServiceFileDescriptorSupplier
      extends AnimalPartServiceBaseDescriptorSupplier {
    AnimalPartServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalPartServiceMethodDescriptorSupplier
      extends AnimalPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AnimalPartServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AnimalPartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalPartServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalPartMethod())
              .addMethod(getGetAnimalPartMethod())
              .addMethod(getDeleteAnimalPartMethod())
              .addMethod(getListAnimalPartsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
