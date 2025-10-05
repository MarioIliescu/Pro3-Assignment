package com.slaughterhouse.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: slaughterhouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "via.pro3.slaughterhouse.AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalRequest,
      com.slaughterhouse.grpc.CreateAnimalResponse> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAnimal",
      requestType = com.slaughterhouse.grpc.CreateAnimalRequest.class,
      responseType = com.slaughterhouse.grpc.CreateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalRequest,
      com.slaughterhouse.grpc.CreateAnimalResponse> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.CreateAnimalRequest, com.slaughterhouse.grpc.CreateAnimalResponse> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
          AnimalServiceGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.CreateAnimalRequest, com.slaughterhouse.grpc.CreateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.CreateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("CreateAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.Animal> getGetAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimal",
      requestType = com.slaughterhouse.grpc.GetByIdRequest.class,
      responseType = com.slaughterhouse.grpc.Animal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest,
      com.slaughterhouse.grpc.Animal> getGetAnimalMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.Animal> getGetAnimalMethod;
    if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
          AnimalServiceGrpc.getGetAnimalMethod = getGetAnimalMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.GetByIdRequest, com.slaughterhouse.grpc.Animal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.Animal.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("GetAnimal"))
              .build();
        }
      }
    }
    return getGetAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnimal",
      requestType = com.slaughterhouse.grpc.DeleteByIdRequest.class,
      responseType = com.slaughterhouse.grpc.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest,
      com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalMethod() {
    io.grpc.MethodDescriptor<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse> getDeleteAnimalMethod;
    if ((getDeleteAnimalMethod = AnimalServiceGrpc.getDeleteAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getDeleteAnimalMethod = AnimalServiceGrpc.getDeleteAnimalMethod) == null) {
          AnimalServiceGrpc.getDeleteAnimalMethod = getDeleteAnimalMethod =
              io.grpc.MethodDescriptor.<com.slaughterhouse.grpc.DeleteByIdRequest, com.slaughterhouse.grpc.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("DeleteAnimal"))
              .build();
        }
      }
    }
    return getDeleteAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListAnimalsResponse> getListAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnimals",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.slaughterhouse.grpc.ListAnimalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.slaughterhouse.grpc.ListAnimalsResponse> getListAnimalsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListAnimalsResponse> getListAnimalsMethod;
    if ((getListAnimalsMethod = AnimalServiceGrpc.getListAnimalsMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getListAnimalsMethod = AnimalServiceGrpc.getListAnimalsMethod) == null) {
          AnimalServiceGrpc.getListAnimalsMethod = getListAnimalsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.slaughterhouse.grpc.ListAnimalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.slaughterhouse.grpc.ListAnimalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("ListAnimals"))
              .build();
        }
      }
    }
    return getListAnimalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAnimal(com.slaughterhouse.grpc.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    /**
     */
    default void getAnimal(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.Animal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalMethod(), responseObserver);
    }

    /**
     */
    default void deleteAnimal(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnimalMethod(), responseObserver);
    }

    /**
     */
    default void listAnimals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnimalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnimalService.
   */
  public static abstract class AnimalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnimalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimal(com.slaughterhouse.grpc.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimal(com.slaughterhouse.grpc.GetByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.Animal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnimal(com.slaughterhouse.grpc.DeleteByIdRequest request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAnimals(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnimalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnimalService.
   */
  public static final class AnimalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.slaughterhouse.grpc.CreateAnimalResponse createAnimal(com.slaughterhouse.grpc.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.Animal getAnimal(com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.DeleteResponse deleteAnimal(com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.slaughterhouse.grpc.ListAnimalsResponse listAnimals(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnimalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnimalService.
   */
  public static final class AnimalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.CreateAnimalResponse> createAnimal(
        com.slaughterhouse.grpc.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.Animal> getAnimal(
        com.slaughterhouse.grpc.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.DeleteResponse> deleteAnimal(
        com.slaughterhouse.grpc.DeleteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.slaughterhouse.grpc.ListAnimalsResponse> listAnimals(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnimalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL = 1;
  private static final int METHODID_DELETE_ANIMAL = 2;
  private static final int METHODID_LIST_ANIMALS = 3;

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
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((com.slaughterhouse.grpc.CreateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.CreateAnimalResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL:
          serviceImpl.getAnimal((com.slaughterhouse.grpc.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.Animal>) responseObserver);
          break;
        case METHODID_DELETE_ANIMAL:
          serviceImpl.deleteAnimal((com.slaughterhouse.grpc.DeleteByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.DeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_ANIMALS:
          serviceImpl.listAnimals((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.slaughterhouse.grpc.ListAnimalsResponse>) responseObserver);
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
          getCreateAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.CreateAnimalRequest,
              com.slaughterhouse.grpc.CreateAnimalResponse>(
                service, METHODID_CREATE_ANIMAL)))
        .addMethod(
          getGetAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.GetByIdRequest,
              com.slaughterhouse.grpc.Animal>(
                service, METHODID_GET_ANIMAL)))
        .addMethod(
          getDeleteAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.slaughterhouse.grpc.DeleteByIdRequest,
              com.slaughterhouse.grpc.DeleteResponse>(
                service, METHODID_DELETE_ANIMAL)))
        .addMethod(
          getListAnimalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.slaughterhouse.grpc.ListAnimalsResponse>(
                service, METHODID_LIST_ANIMALS)))
        .build();
  }

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.slaughterhouse.grpc.SlaughterhouseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AnimalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalMethod())
              .addMethod(getGetAnimalMethod())
              .addMethod(getDeleteAnimalMethod())
              .addMethod(getListAnimalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
