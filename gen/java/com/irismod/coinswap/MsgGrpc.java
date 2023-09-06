package com.irismod.coinswap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the coinswap Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/coinswap/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.coinswap.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgAddLiquidity,
      com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLiquidity",
      requestType = com.irismod.coinswap.TxProto.MsgAddLiquidity.class,
      responseType = com.irismod.coinswap.TxProto.MsgAddLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgAddLiquidity,
      com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod() {
    io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgAddLiquidity, com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod;
    if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
          MsgGrpc.getAddLiquidityMethod = getAddLiquidityMethod =
              io.grpc.MethodDescriptor.<com.irismod.coinswap.TxProto.MsgAddLiquidity, com.irismod.coinswap.TxProto.MsgAddLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgAddLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgAddLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLiquidity"))
              .build();
        }
      }
    }
    return getAddLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgRemoveLiquidity,
      com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLiquidity",
      requestType = com.irismod.coinswap.TxProto.MsgRemoveLiquidity.class,
      responseType = com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgRemoveLiquidity,
      com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod() {
    io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgRemoveLiquidity, com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;
    if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
          MsgGrpc.getRemoveLiquidityMethod = getRemoveLiquidityMethod =
              io.grpc.MethodDescriptor.<com.irismod.coinswap.TxProto.MsgRemoveLiquidity, com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgRemoveLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveLiquidity"))
              .build();
        }
      }
    }
    return getRemoveLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgSwapOrder,
      com.irismod.coinswap.TxProto.MsgSwapCoinResponse> getSwapCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapCoin",
      requestType = com.irismod.coinswap.TxProto.MsgSwapOrder.class,
      responseType = com.irismod.coinswap.TxProto.MsgSwapCoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgSwapOrder,
      com.irismod.coinswap.TxProto.MsgSwapCoinResponse> getSwapCoinMethod() {
    io.grpc.MethodDescriptor<com.irismod.coinswap.TxProto.MsgSwapOrder, com.irismod.coinswap.TxProto.MsgSwapCoinResponse> getSwapCoinMethod;
    if ((getSwapCoinMethod = MsgGrpc.getSwapCoinMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapCoinMethod = MsgGrpc.getSwapCoinMethod) == null) {
          MsgGrpc.getSwapCoinMethod = getSwapCoinMethod =
              io.grpc.MethodDescriptor.<com.irismod.coinswap.TxProto.MsgSwapOrder, com.irismod.coinswap.TxProto.MsgSwapCoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgSwapOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.TxProto.MsgSwapCoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapCoin"))
              .build();
        }
      }
    }
    return getSwapCoinMethod;
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
   * Msg defines the coinswap Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AddLiquidity defines a method for depositing some tokens to the liquidity pool
     * </pre>
     */
    default void addLiquidity(com.irismod.coinswap.TxProto.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveLiquidity defines a method for withdraw some tokens from the liquidity pool
     * </pre>
     */
    default void removeLiquidity(com.irismod.coinswap.TxProto.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapCoin defines a method for swapping a token with the other token from the liquidity pool
     * </pre>
     */
    default void swapCoin(com.irismod.coinswap.TxProto.MsgSwapOrder request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgSwapCoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapCoinMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the coinswap Msg service
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
   * Msg defines the coinswap Msg service
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
     * <pre>
     * AddLiquidity defines a method for depositing some tokens to the liquidity pool
     * </pre>
     */
    public void addLiquidity(com.irismod.coinswap.TxProto.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveLiquidity defines a method for withdraw some tokens from the liquidity pool
     * </pre>
     */
    public void removeLiquidity(com.irismod.coinswap.TxProto.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapCoin defines a method for swapping a token with the other token from the liquidity pool
     * </pre>
     */
    public void swapCoin(com.irismod.coinswap.TxProto.MsgSwapOrder request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgSwapCoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapCoinMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the coinswap Msg service
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
     * <pre>
     * AddLiquidity defines a method for depositing some tokens to the liquidity pool
     * </pre>
     */
    public com.irismod.coinswap.TxProto.MsgAddLiquidityResponse addLiquidity(com.irismod.coinswap.TxProto.MsgAddLiquidity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveLiquidity defines a method for withdraw some tokens from the liquidity pool
     * </pre>
     */
    public com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse removeLiquidity(com.irismod.coinswap.TxProto.MsgRemoveLiquidity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapCoin defines a method for swapping a token with the other token from the liquidity pool
     * </pre>
     */
    public com.irismod.coinswap.TxProto.MsgSwapCoinResponse swapCoin(com.irismod.coinswap.TxProto.MsgSwapOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapCoinMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the coinswap Msg service
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
     * <pre>
     * AddLiquidity defines a method for depositing some tokens to the liquidity pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.coinswap.TxProto.MsgAddLiquidityResponse> addLiquidity(
        com.irismod.coinswap.TxProto.MsgAddLiquidity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveLiquidity defines a method for withdraw some tokens from the liquidity pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse> removeLiquidity(
        com.irismod.coinswap.TxProto.MsgRemoveLiquidity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapCoin defines a method for swapping a token with the other token from the liquidity pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.coinswap.TxProto.MsgSwapCoinResponse> swapCoin(
        com.irismod.coinswap.TxProto.MsgSwapOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapCoinMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_LIQUIDITY = 0;
  private static final int METHODID_REMOVE_LIQUIDITY = 1;
  private static final int METHODID_SWAP_COIN = 2;

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
        case METHODID_ADD_LIQUIDITY:
          serviceImpl.addLiquidity((com.irismod.coinswap.TxProto.MsgAddLiquidity) request,
              (io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgAddLiquidityResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LIQUIDITY:
          serviceImpl.removeLiquidity((com.irismod.coinswap.TxProto.MsgRemoveLiquidity) request,
              (io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse>) responseObserver);
          break;
        case METHODID_SWAP_COIN:
          serviceImpl.swapCoin((com.irismod.coinswap.TxProto.MsgSwapOrder) request,
              (io.grpc.stub.StreamObserver<com.irismod.coinswap.TxProto.MsgSwapCoinResponse>) responseObserver);
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
          getAddLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.coinswap.TxProto.MsgAddLiquidity,
              com.irismod.coinswap.TxProto.MsgAddLiquidityResponse>(
                service, METHODID_ADD_LIQUIDITY)))
        .addMethod(
          getRemoveLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.coinswap.TxProto.MsgRemoveLiquidity,
              com.irismod.coinswap.TxProto.MsgRemoveLiquidityResponse>(
                service, METHODID_REMOVE_LIQUIDITY)))
        .addMethod(
          getSwapCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.coinswap.TxProto.MsgSwapOrder,
              com.irismod.coinswap.TxProto.MsgSwapCoinResponse>(
                service, METHODID_SWAP_COIN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.coinswap.TxProto.getDescriptor();
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
              .addMethod(getAddLiquidityMethod())
              .addMethod(getRemoveLiquidityMethod())
              .addMethod(getSwapCoinMethod())
              .build();
        }
      }
    }
    return result;
  }
}
