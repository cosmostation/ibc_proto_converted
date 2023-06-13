package com.osmosis.gamm.poolmodels.stableswap.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/gamm/pool-models/stableswap/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.gamm.poolmodels.stableswap.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool,
      com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStableswapPool",
      requestType = com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool.class,
      responseType = com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool,
      com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool, com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> getCreateStableswapPoolMethod;
    if ((getCreateStableswapPoolMethod = MsgGrpc.getCreateStableswapPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateStableswapPoolMethod = MsgGrpc.getCreateStableswapPoolMethod) == null) {
          MsgGrpc.getCreateStableswapPoolMethod = getCreateStableswapPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool, com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStableswapPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateStableswapPool"))
              .build();
        }
      }
    }
    return getCreateStableswapPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors,
      com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StableSwapAdjustScalingFactors",
      requestType = com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors.class,
      responseType = com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors,
      com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors, com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> getStableSwapAdjustScalingFactorsMethod;
    if ((getStableSwapAdjustScalingFactorsMethod = MsgGrpc.getStableSwapAdjustScalingFactorsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStableSwapAdjustScalingFactorsMethod = MsgGrpc.getStableSwapAdjustScalingFactorsMethod) == null) {
          MsgGrpc.getStableSwapAdjustScalingFactorsMethod = getStableSwapAdjustScalingFactorsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors, com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StableSwapAdjustScalingFactors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StableSwapAdjustScalingFactors"))
              .build();
        }
      }
    }
    return getStableSwapAdjustScalingFactorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createStableswapPool(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStableswapPoolMethod(), responseObserver);
    }

    /**
     */
    default void stableSwapAdjustScalingFactors(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStableSwapAdjustScalingFactorsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     */
    public void createStableswapPool(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStableswapPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stableSwapAdjustScalingFactors(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStableSwapAdjustScalingFactorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse createStableswapPool(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStableswapPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse stableSwapAdjustScalingFactors(com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStableSwapAdjustScalingFactorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse> createStableswapPool(
        com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStableswapPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse> stableSwapAdjustScalingFactors(
        com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStableSwapAdjustScalingFactorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STABLESWAP_POOL = 0;
  private static final int METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS = 1;

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
        case METHODID_CREATE_STABLESWAP_POOL:
          serviceImpl.createStableswapPool((com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse>) responseObserver);
          break;
        case METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS:
          serviceImpl.stableSwapAdjustScalingFactors((com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse>) responseObserver);
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
          getCreateStableswapPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPool,
              com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgCreateStableswapPoolResponse>(
                service, METHODID_CREATE_STABLESWAP_POOL)))
        .addMethod(
          getStableSwapAdjustScalingFactorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactors,
              com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.MsgStableSwapAdjustScalingFactorsResponse>(
                service, METHODID_STABLE_SWAP_ADJUST_SCALING_FACTORS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.gamm.poolmodels.stableswap.v1beta1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getCreateStableswapPoolMethod())
              .addMethod(getStableSwapAdjustScalingFactorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
