package com.sentinel.swap.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/swap/v1/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.swap.v1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.swap.v1.MsgSwapRequest,
      com.sentinel.swap.v1.MsgSwapResponse> getMsgSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgSwap",
      requestType = com.sentinel.swap.v1.MsgSwapRequest.class,
      responseType = com.sentinel.swap.v1.MsgSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.swap.v1.MsgSwapRequest,
      com.sentinel.swap.v1.MsgSwapResponse> getMsgSwapMethod() {
    io.grpc.MethodDescriptor<com.sentinel.swap.v1.MsgSwapRequest, com.sentinel.swap.v1.MsgSwapResponse> getMsgSwapMethod;
    if ((getMsgSwapMethod = MsgServiceGrpc.getMsgSwapMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgSwapMethod = MsgServiceGrpc.getMsgSwapMethod) == null) {
          MsgServiceGrpc.getMsgSwapMethod = getMsgSwapMethod =
              io.grpc.MethodDescriptor.<com.sentinel.swap.v1.MsgSwapRequest, com.sentinel.swap.v1.MsgSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgSwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.swap.v1.MsgSwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.swap.v1.MsgSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgSwap"))
              .build();
        }
      }
    }
    return getMsgSwapMethod;
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
    default void msgSwap(com.sentinel.swap.v1.MsgSwapRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.swap.v1.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgSwapMethod(), responseObserver);
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
    public void msgSwap(com.sentinel.swap.v1.MsgSwapRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.swap.v1.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgSwapMethod(), getCallOptions()), request, responseObserver);
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
    public com.sentinel.swap.v1.MsgSwapResponse msgSwap(com.sentinel.swap.v1.MsgSwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgSwapMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.swap.v1.MsgSwapResponse> msgSwap(
        com.sentinel.swap.v1.MsgSwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgSwapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_SWAP = 0;

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
        case METHODID_MSG_SWAP:
          serviceImpl.msgSwap((com.sentinel.swap.v1.MsgSwapRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.swap.v1.MsgSwapResponse>) responseObserver);
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
          getMsgSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.swap.v1.MsgSwapRequest,
              com.sentinel.swap.v1.MsgSwapResponse>(
                service, METHODID_MSG_SWAP)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.swap.v1.MsgProto.getDescriptor();
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
              .addMethod(getMsgSwapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
