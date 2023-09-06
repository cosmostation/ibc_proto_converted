package com.crescent.liquidfarming.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/liquidfarming/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.liquidfarming.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> getLiquidFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidFarm",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> getLiquidFarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> getLiquidFarmMethod;
    if ((getLiquidFarmMethod = MsgGrpc.getLiquidFarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidFarmMethod = MsgGrpc.getLiquidFarmMethod) == null) {
          MsgGrpc.getLiquidFarmMethod = getLiquidFarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidFarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidFarm"))
              .build();
        }
      }
    }
    return getLiquidFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> getLiquidUnfarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidUnfarm",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> getLiquidUnfarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> getLiquidUnfarmMethod;
    if ((getLiquidUnfarmMethod = MsgGrpc.getLiquidUnfarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidUnfarmMethod = MsgGrpc.getLiquidUnfarmMethod) == null) {
          MsgGrpc.getLiquidUnfarmMethod = getLiquidUnfarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidUnfarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidUnfarm"))
              .build();
        }
      }
    }
    return getLiquidUnfarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> getLiquidUnfarmAndWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidUnfarmAndWithdraw",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> getLiquidUnfarmAndWithdrawMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> getLiquidUnfarmAndWithdrawMethod;
    if ((getLiquidUnfarmAndWithdrawMethod = MsgGrpc.getLiquidUnfarmAndWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidUnfarmAndWithdrawMethod = MsgGrpc.getLiquidUnfarmAndWithdrawMethod) == null) {
          MsgGrpc.getLiquidUnfarmAndWithdrawMethod = getLiquidUnfarmAndWithdrawMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw, com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidUnfarmAndWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidUnfarmAndWithdraw"))
              .build();
        }
      }
    }
    return getLiquidUnfarmAndWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceBid",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid, com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod;
    if ((getPlaceBidMethod = MsgGrpc.getPlaceBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPlaceBidMethod = MsgGrpc.getPlaceBidMethod) == null) {
          MsgGrpc.getPlaceBidMethod = getPlaceBidMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid, com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PlaceBid"))
              .build();
        }
      }
    }
    return getPlaceBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> getRefundBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundBid",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> getRefundBidMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid, com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> getRefundBidMethod;
    if ((getRefundBidMethod = MsgGrpc.getRefundBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRefundBidMethod = MsgGrpc.getRefundBidMethod) == null) {
          MsgGrpc.getRefundBidMethod = getRefundBidMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid, com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RefundBid"))
              .build();
        }
      }
    }
    return getRefundBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> getAdvanceAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdvanceAuction",
      requestType = com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction.class,
      responseType = com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction,
      com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> getAdvanceAuctionMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction, com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> getAdvanceAuctionMethod;
    if ((getAdvanceAuctionMethod = MsgGrpc.getAdvanceAuctionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAdvanceAuctionMethod = MsgGrpc.getAdvanceAuctionMethod) == null) {
          MsgGrpc.getAdvanceAuctionMethod = getAdvanceAuctionMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction, com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdvanceAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AdvanceAuction"))
              .build();
        }
      }
    }
    return getAdvanceAuctionMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * LiquidFarm defines a method for farming pool coin for a liquid farm
     * </pre>
     */
    default void liquidFarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidFarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidUnfarm defines a method for unfarming amount of LFCoin
     * </pre>
     */
    default void liquidUnfarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidUnfarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidUnfarmAndWithdraw defines a method for unfarming amount of LFCoin and withdraw pool coin from the pool
     * </pre>
     */
    default void liquidUnfarmAndWithdraw(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidUnfarmAndWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * PlaceBid defines a method for placing a bid for a rewards auction
     * </pre>
     */
    default void placeBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundBid defines a method for refunding the bid that is not winning for the auction
     * </pre>
     */
    default void refundBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdvanceAuction defines a method for advancing rewards auction by one.
     * This Msg is defined just for testing purpose and it shouldn't be used in production.
     * </pre>
     */
    default void advanceAuction(com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdvanceAuctionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     * LiquidFarm defines a method for farming pool coin for a liquid farm
     * </pre>
     */
    public void liquidFarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidUnfarm defines a method for unfarming amount of LFCoin
     * </pre>
     */
    public void liquidUnfarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidUnfarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidUnfarmAndWithdraw defines a method for unfarming amount of LFCoin and withdraw pool coin from the pool
     * </pre>
     */
    public void liquidUnfarmAndWithdraw(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidUnfarmAndWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PlaceBid defines a method for placing a bid for a rewards auction
     * </pre>
     */
    public void placeBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundBid defines a method for refunding the bid that is not winning for the auction
     * </pre>
     */
    public void refundBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdvanceAuction defines a method for advancing rewards auction by one.
     * This Msg is defined just for testing purpose and it shouldn't be used in production.
     * </pre>
     */
    public void advanceAuction(com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdvanceAuctionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * LiquidFarm defines a method for farming pool coin for a liquid farm
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse liquidFarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidFarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidUnfarm defines a method for unfarming amount of LFCoin
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse liquidUnfarm(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidUnfarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidUnfarmAndWithdraw defines a method for unfarming amount of LFCoin and withdraw pool coin from the pool
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse liquidUnfarmAndWithdraw(com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidUnfarmAndWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PlaceBid defines a method for placing a bid for a rewards auction
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse placeBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundBid defines a method for refunding the bid that is not winning for the auction
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse refundBid(com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdvanceAuction defines a method for advancing rewards auction by one.
     * This Msg is defined just for testing purpose and it shouldn't be used in production.
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse advanceAuction(com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdvanceAuctionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * LiquidFarm defines a method for farming pool coin for a liquid farm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse> liquidFarm(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidFarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidUnfarm defines a method for unfarming amount of LFCoin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse> liquidUnfarm(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidUnfarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidUnfarmAndWithdraw defines a method for unfarming amount of LFCoin and withdraw pool coin from the pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse> liquidUnfarmAndWithdraw(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidUnfarmAndWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PlaceBid defines a method for placing a bid for a rewards auction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse> placeBid(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundBid defines a method for refunding the bid that is not winning for the auction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse> refundBid(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdvanceAuction defines a method for advancing rewards auction by one.
     * This Msg is defined just for testing purpose and it shouldn't be used in production.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse> advanceAuction(
        com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdvanceAuctionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUID_FARM = 0;
  private static final int METHODID_LIQUID_UNFARM = 1;
  private static final int METHODID_LIQUID_UNFARM_AND_WITHDRAW = 2;
  private static final int METHODID_PLACE_BID = 3;
  private static final int METHODID_REFUND_BID = 4;
  private static final int METHODID_ADVANCE_AUCTION = 5;

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
        case METHODID_LIQUID_FARM:
          serviceImpl.liquidFarm((com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse>) responseObserver);
          break;
        case METHODID_LIQUID_UNFARM:
          serviceImpl.liquidUnfarm((com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse>) responseObserver);
          break;
        case METHODID_LIQUID_UNFARM_AND_WITHDRAW:
          serviceImpl.liquidUnfarmAndWithdraw((com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse>) responseObserver);
          break;
        case METHODID_PLACE_BID:
          serviceImpl.placeBid((com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse>) responseObserver);
          break;
        case METHODID_REFUND_BID:
          serviceImpl.refundBid((com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse>) responseObserver);
          break;
        case METHODID_ADVANCE_AUCTION:
          serviceImpl.advanceAuction((com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse>) responseObserver);
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
          getLiquidFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarm,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidFarmResponse>(
                service, METHODID_LIQUID_FARM)))
        .addMethod(
          getLiquidUnfarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarm,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmResponse>(
                service, METHODID_LIQUID_UNFARM)))
        .addMethod(
          getLiquidUnfarmAndWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdraw,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgLiquidUnfarmAndWithdrawResponse>(
                service, METHODID_LIQUID_UNFARM_AND_WITHDRAW)))
        .addMethod(
          getPlaceBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBid,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgPlaceBidResponse>(
                service, METHODID_PLACE_BID)))
        .addMethod(
          getRefundBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBid,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgRefundBidResponse>(
                service, METHODID_REFUND_BID)))
        .addMethod(
          getAdvanceAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuction,
              com.crescent.liquidfarming.v1beta1.TxProto.MsgAdvanceAuctionResponse>(
                service, METHODID_ADVANCE_AUCTION)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.liquidfarming.v1beta1.TxProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getLiquidFarmMethod())
              .addMethod(getLiquidUnfarmMethod())
              .addMethod(getLiquidUnfarmAndWithdrawMethod())
              .addMethod(getPlaceBidMethod())
              .addMethod(getRefundBidMethod())
              .addMethod(getAdvanceAuctionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
