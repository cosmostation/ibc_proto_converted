package com.sentinel.subscription.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: sentinel/subscription/v2/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sentinel.subscription.v2.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgCancelRequest,
      com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> getMsgCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCancel",
      requestType = com.sentinel.subscription.v2.MsgProto.MsgCancelRequest.class,
      responseType = com.sentinel.subscription.v2.MsgProto.MsgCancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgCancelRequest,
      com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> getMsgCancelMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgCancelRequest, com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> getMsgCancelMethod;
    if ((getMsgCancelMethod = MsgServiceGrpc.getMsgCancelMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgCancelMethod = MsgServiceGrpc.getMsgCancelMethod) == null) {
          MsgServiceGrpc.getMsgCancelMethod = getMsgCancelMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.MsgProto.MsgCancelRequest, com.sentinel.subscription.v2.MsgProto.MsgCancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.MsgProto.MsgCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.MsgProto.MsgCancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgCancel"))
              .build();
        }
      }
    }
    return getMsgCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest,
      com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> getMsgAllocateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgAllocate",
      requestType = com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest.class,
      responseType = com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest,
      com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> getMsgAllocateMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest, com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> getMsgAllocateMethod;
    if ((getMsgAllocateMethod = MsgServiceGrpc.getMsgAllocateMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgAllocateMethod = MsgServiceGrpc.getMsgAllocateMethod) == null) {
          MsgServiceGrpc.getMsgAllocateMethod = getMsgAllocateMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest, com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgAllocate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgAllocate"))
              .build();
        }
      }
    }
    return getMsgAllocateMethod;
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
    default void msgCancel(com.sentinel.subscription.v2.MsgProto.MsgCancelRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCancelMethod(), responseObserver);
    }

    /**
     */
    default void msgAllocate(com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgAllocateMethod(), responseObserver);
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
    public void msgCancel(com.sentinel.subscription.v2.MsgProto.MsgCancelRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgAllocate(com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgAllocateMethod(), getCallOptions()), request, responseObserver);
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
    public com.sentinel.subscription.v2.MsgProto.MsgCancelResponse msgCancel(com.sentinel.subscription.v2.MsgProto.MsgCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse msgAllocate(com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgAllocateMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.MsgProto.MsgCancelResponse> msgCancel(
        com.sentinel.subscription.v2.MsgProto.MsgCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse> msgAllocate(
        com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgAllocateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_CANCEL = 0;
  private static final int METHODID_MSG_ALLOCATE = 1;

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
        case METHODID_MSG_CANCEL:
          serviceImpl.msgCancel((com.sentinel.subscription.v2.MsgProto.MsgCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgCancelResponse>) responseObserver);
          break;
        case METHODID_MSG_ALLOCATE:
          serviceImpl.msgAllocate((com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse>) responseObserver);
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
          getMsgCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.MsgProto.MsgCancelRequest,
              com.sentinel.subscription.v2.MsgProto.MsgCancelResponse>(
                service, METHODID_MSG_CANCEL)))
        .addMethod(
          getMsgAllocateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.MsgProto.MsgAllocateRequest,
              com.sentinel.subscription.v2.MsgProto.MsgAllocateResponse>(
                service, METHODID_MSG_ALLOCATE)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.subscription.v2.MsgProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMsgCancelMethod())
              .addMethod(getMsgAllocateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
