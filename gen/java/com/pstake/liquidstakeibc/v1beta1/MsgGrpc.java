package com.pstake.liquidstakeibc.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the liquidstakeibc services.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: pstake/liquidstakeibc/v1beta1/msgs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "pstake.liquidstakeibc.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain,
      com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> getRegisterHostChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterHostChain",
      requestType = com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain,
      com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> getRegisterHostChainMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain, com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> getRegisterHostChainMethod;
    if ((getRegisterHostChainMethod = MsgGrpc.getRegisterHostChainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterHostChainMethod = MsgGrpc.getRegisterHostChainMethod) == null) {
          MsgGrpc.getRegisterHostChainMethod = getRegisterHostChainMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain, com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterHostChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterHostChain"))
              .build();
        }
      }
    }
    return getRegisterHostChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain,
      com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> getUpdateHostChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHostChain",
      requestType = com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain,
      com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> getUpdateHostChainMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain, com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> getUpdateHostChainMethod;
    if ((getUpdateHostChainMethod = MsgGrpc.getUpdateHostChainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateHostChainMethod = MsgGrpc.getUpdateHostChainMethod) == null) {
          MsgGrpc.getUpdateHostChainMethod = getUpdateHostChainMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain, com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHostChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateHostChain"))
              .build();
        }
      }
    }
    return getUpdateHostChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake,
      com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidStake",
      requestType = com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake,
      com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake, com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;
    if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
          MsgGrpc.getLiquidStakeMethod = getLiquidStakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake, com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidStake"))
              .build();
        }
      }
    }
    return getLiquidStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake,
      com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidUnstake",
      requestType = com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake,
      com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake, com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;
    if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
          MsgGrpc.getLiquidUnstakeMethod = getLiquidUnstakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake, com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidUnstake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidUnstake"))
              .build();
        }
      }
    }
    return getLiquidUnstakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRedeem,
      com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> getRedeemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redeem",
      requestType = com.pstake.liquidstakeibc.v1beta1.MsgRedeem.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRedeem,
      com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> getRedeemMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.MsgRedeem, com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> getRedeemMethod;
    if ((getRedeemMethod = MsgGrpc.getRedeemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemMethod = MsgGrpc.getRedeemMethod) == null) {
          MsgGrpc.getRedeemMethod = getRedeemMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.MsgRedeem, com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redeem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgRedeem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Redeem"))
              .build();
        }
      }
    }
    return getRedeemMethod;
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
   * <pre>
   * Msg defines the liquidstakeibc services.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void registerHostChain(com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterHostChainMethod(), responseObserver);
    }

    /**
     */
    default void updateHostChain(com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHostChainMethod(), responseObserver);
    }

    /**
     */
    default void liquidStake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidStakeMethod(), responseObserver);
    }

    /**
     */
    default void liquidUnstake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidUnstakeMethod(), responseObserver);
    }

    /**
     */
    default void redeem(com.pstake.liquidstakeibc.v1beta1.MsgRedeem request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeemMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the liquidstakeibc services.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the liquidstakeibc services.
   * </pre>
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
    public void registerHostChain(com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterHostChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHostChain(com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHostChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void liquidStake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void liquidUnstake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeem(com.pstake.liquidstakeibc.v1beta1.MsgRedeem request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the liquidstakeibc services.
   * </pre>
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
    public com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse registerHostChain(com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterHostChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse updateHostChain(com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHostChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse liquidStake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse liquidUnstake(com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidUnstakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse redeem(com.pstake.liquidstakeibc.v1beta1.MsgRedeem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeemMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the liquidstakeibc services.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse> registerHostChain(
        com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterHostChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse> updateHostChain(
        com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHostChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse> liquidStake(
        com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse> liquidUnstake(
        com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse> redeem(
        com.pstake.liquidstakeibc.v1beta1.MsgRedeem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_HOST_CHAIN = 0;
  private static final int METHODID_UPDATE_HOST_CHAIN = 1;
  private static final int METHODID_LIQUID_STAKE = 2;
  private static final int METHODID_LIQUID_UNSTAKE = 3;
  private static final int METHODID_REDEEM = 4;

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
        case METHODID_REGISTER_HOST_CHAIN:
          serviceImpl.registerHostChain((com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HOST_CHAIN:
          serviceImpl.updateHostChain((com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse>) responseObserver);
          break;
        case METHODID_LIQUID_STAKE:
          serviceImpl.liquidStake((com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse>) responseObserver);
          break;
        case METHODID_LIQUID_UNSTAKE:
          serviceImpl.liquidUnstake((com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse>) responseObserver);
          break;
        case METHODID_REDEEM:
          serviceImpl.redeem((com.pstake.liquidstakeibc.v1beta1.MsgRedeem) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse>) responseObserver);
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
          getRegisterHostChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain,
              com.pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse>(
                service, METHODID_REGISTER_HOST_CHAIN)))
        .addMethod(
          getUpdateHostChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain,
              com.pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse>(
                service, METHODID_UPDATE_HOST_CHAIN)))
        .addMethod(
          getLiquidStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.MsgLiquidStake,
              com.pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse>(
                service, METHODID_LIQUID_STAKE)))
        .addMethod(
          getLiquidUnstakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake,
              com.pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse>(
                service, METHODID_LIQUID_UNSTAKE)))
        .addMethod(
          getRedeemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.MsgRedeem,
              com.pstake.liquidstakeibc.v1beta1.MsgRedeemResponse>(
                service, METHODID_REDEEM)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.MsgsProto.getDescriptor();
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
              .addMethod(getRegisterHostChainMethod())
              .addMethod(getUpdateHostChainMethod())
              .addMethod(getLiquidStakeMethod())
              .addMethod(getLiquidUnstakeMethod())
              .addMethod(getRedeemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
