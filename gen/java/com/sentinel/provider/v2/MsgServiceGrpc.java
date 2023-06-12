package com.sentinel.provider.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/provider/v2/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.provider.v2.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgRegisterRequest,
      com.sentinel.provider.v2.MsgRegisterResponse> getMsgRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgRegister",
      requestType = com.sentinel.provider.v2.MsgRegisterRequest.class,
      responseType = com.sentinel.provider.v2.MsgRegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgRegisterRequest,
      com.sentinel.provider.v2.MsgRegisterResponse> getMsgRegisterMethod() {
    io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgRegisterRequest, com.sentinel.provider.v2.MsgRegisterResponse> getMsgRegisterMethod;
    if ((getMsgRegisterMethod = MsgServiceGrpc.getMsgRegisterMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgRegisterMethod = MsgServiceGrpc.getMsgRegisterMethod) == null) {
          MsgServiceGrpc.getMsgRegisterMethod = getMsgRegisterMethod =
              io.grpc.MethodDescriptor.<com.sentinel.provider.v2.MsgRegisterRequest, com.sentinel.provider.v2.MsgRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.provider.v2.MsgRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.provider.v2.MsgRegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgRegister"))
              .build();
        }
      }
    }
    return getMsgRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgUpdateRequest,
      com.sentinel.provider.v2.MsgUpdateResponse> getMsgUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUpdate",
      requestType = com.sentinel.provider.v2.MsgUpdateRequest.class,
      responseType = com.sentinel.provider.v2.MsgUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgUpdateRequest,
      com.sentinel.provider.v2.MsgUpdateResponse> getMsgUpdateMethod() {
    io.grpc.MethodDescriptor<com.sentinel.provider.v2.MsgUpdateRequest, com.sentinel.provider.v2.MsgUpdateResponse> getMsgUpdateMethod;
    if ((getMsgUpdateMethod = MsgServiceGrpc.getMsgUpdateMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUpdateMethod = MsgServiceGrpc.getMsgUpdateMethod) == null) {
          MsgServiceGrpc.getMsgUpdateMethod = getMsgUpdateMethod =
              io.grpc.MethodDescriptor.<com.sentinel.provider.v2.MsgUpdateRequest, com.sentinel.provider.v2.MsgUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.provider.v2.MsgUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.provider.v2.MsgUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUpdate"))
              .build();
        }
      }
    }
    return getMsgUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void msgRegister(com.sentinel.provider.v2.MsgRegisterRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgRegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgRegisterMethod(), responseObserver);
    }

    /**
     */
    default void msgUpdate(com.sentinel.provider.v2.MsgUpdateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void msgRegister(com.sentinel.provider.v2.MsgRegisterRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgRegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUpdate(com.sentinel.provider.v2.MsgUpdateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sentinel.provider.v2.MsgRegisterResponse msgRegister(com.sentinel.provider.v2.MsgRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.provider.v2.MsgUpdateResponse msgUpdate(com.sentinel.provider.v2.MsgUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.provider.v2.MsgRegisterResponse> msgRegister(
        com.sentinel.provider.v2.MsgRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.provider.v2.MsgUpdateResponse> msgUpdate(
        com.sentinel.provider.v2.MsgUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_REGISTER = 0;
  private static final int METHODID_MSG_UPDATE = 1;

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
        case METHODID_MSG_REGISTER:
          serviceImpl.msgRegister((com.sentinel.provider.v2.MsgRegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgRegisterResponse>) responseObserver);
          break;
        case METHODID_MSG_UPDATE:
          serviceImpl.msgUpdate((com.sentinel.provider.v2.MsgUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.provider.v2.MsgUpdateResponse>) responseObserver);
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
          getMsgRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.provider.v2.MsgRegisterRequest,
              com.sentinel.provider.v2.MsgRegisterResponse>(
                service, METHODID_MSG_REGISTER)))
        .addMethod(
          getMsgUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.provider.v2.MsgUpdateRequest,
              com.sentinel.provider.v2.MsgUpdateResponse>(
                service, METHODID_MSG_UPDATE)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.provider.v2.MsgProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getMsgRegisterMethod())
              .addMethod(getMsgUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
