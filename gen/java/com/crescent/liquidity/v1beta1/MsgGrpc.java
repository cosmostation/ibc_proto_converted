package com.crescent.liquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/liquidity/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.liquidity.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> getCreatePairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePair",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> getCreatePairMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair, com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> getCreatePairMethod;
    if ((getCreatePairMethod = MsgGrpc.getCreatePairMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePairMethod = MsgGrpc.getCreatePairMethod) == null) {
          MsgGrpc.getCreatePairMethod = getCreatePairMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair, com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePair"))
              .build();
        }
      }
    }
    return getCreatePairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool, com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool, com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRangedPool",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool,
      com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool, com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod;
    if ((getCreateRangedPoolMethod = MsgGrpc.getCreateRangedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRangedPoolMethod = MsgGrpc.getCreateRangedPoolMethod) == null) {
          MsgGrpc.getCreateRangedPoolMethod = getCreateRangedPoolMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool, com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRangedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRangedPool"))
              .build();
        }
      }
    }
    return getCreateRangedPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgDeposit,
      com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgDeposit.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgDeposit,
      com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgDeposit, com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgDeposit, com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw,
      com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw,
      com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw, com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw, com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> getLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrder",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> getLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder, com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> getLimitOrderMethod;
    if ((getLimitOrderMethod = MsgGrpc.getLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLimitOrderMethod = MsgGrpc.getLimitOrderMethod) == null) {
          MsgGrpc.getLimitOrderMethod = getLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder, com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LimitOrder"))
              .build();
        }
      }
    }
    return getLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> getMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketOrder",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> getMarketOrderMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder, com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> getMarketOrderMethod;
    if ((getMarketOrderMethod = MsgGrpc.getMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMarketOrderMethod = MsgGrpc.getMarketOrderMethod) == null) {
          MsgGrpc.getMarketOrderMethod = getMarketOrderMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder, com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MarketOrder"))
              .build();
        }
      }
    }
    return getMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> getMMOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MMOrder",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> getMMOrderMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder, com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> getMMOrderMethod;
    if ((getMMOrderMethod = MsgGrpc.getMMOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMMOrderMethod = MsgGrpc.getMMOrderMethod) == null) {
          MsgGrpc.getMMOrderMethod = getMMOrderMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder, com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MMOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MMOrder"))
              .build();
        }
      }
    }
    return getMMOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder,
      com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder, com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod;
    if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
          MsgGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder, com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders,
      com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAllOrders",
      requestType = com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders.class,
      responseType = com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders,
      com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders, com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod;
    if ((getCancelAllOrdersMethod = MsgGrpc.getCancelAllOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelAllOrdersMethod = MsgGrpc.getCancelAllOrdersMethod) == null) {
          MsgGrpc.getCancelAllOrdersMethod = getCancelAllOrdersMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders, com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelAllOrders"))
              .build();
        }
      }
    }
    return getCancelAllOrdersMethod;
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
     * CreatePair defines a method for creating a pair
     * </pre>
     */
    default void createPair(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePairMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    default void createPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    default void createRangedPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRangedPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    default void deposit(com.crescent.liquidity.v1beta1.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    default void withdraw(com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    default void limitOrder(com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    default void marketOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    default void mMOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMMOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    default void cancelOrder(com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    default void cancelAllOrders(com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAllOrdersMethod(), responseObserver);
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
     * CreatePair defines a method for creating a pair
     * </pre>
     */
    public void createPair(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public void createPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public void createRangedPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRangedPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public void deposit(com.crescent.liquidity.v1beta1.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public void withdraw(com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public void limitOrder(com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public void marketOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public void mMOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMMOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public void cancelOrder(com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public void cancelAllOrders(com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAllOrdersMethod(), getCallOptions()), request, responseObserver);
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
     * CreatePair defines a method for creating a pair
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse createPair(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse createPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse createRangedPool(com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRangedPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse deposit(com.crescent.liquidity.v1beta1.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse withdraw(com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse limitOrder(com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse marketOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse mMOrder(com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMMOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse cancelOrder(com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse cancelAllOrders(com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAllOrdersMethod(), getCallOptions(), request);
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
     * CreatePair defines a method for creating a pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse> createPair(
        com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse> createPool(
        com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse> createRangedPool(
        com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRangedPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse> deposit(
        com.crescent.liquidity.v1beta1.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse> withdraw(
        com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse> limitOrder(
        com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse> marketOrder(
        com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse> mMOrder(
        com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMMOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse> cancelOrder(
        com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse> cancelAllOrders(
        com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAllOrdersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PAIR = 0;
  private static final int METHODID_CREATE_POOL = 1;
  private static final int METHODID_CREATE_RANGED_POOL = 2;
  private static final int METHODID_DEPOSIT = 3;
  private static final int METHODID_WITHDRAW = 4;
  private static final int METHODID_LIMIT_ORDER = 5;
  private static final int METHODID_MARKET_ORDER = 6;
  private static final int METHODID_MMORDER = 7;
  private static final int METHODID_CANCEL_ORDER = 8;
  private static final int METHODID_CANCEL_ALL_ORDERS = 9;

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
        case METHODID_CREATE_PAIR:
          serviceImpl.createPair((com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse>) responseObserver);
          break;
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_CREATE_RANGED_POOL:
          serviceImpl.createRangedPool((com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.crescent.liquidity.v1beta1.TxProto.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER:
          serviceImpl.limitOrder((com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse>) responseObserver);
          break;
        case METHODID_MARKET_ORDER:
          serviceImpl.marketOrder((com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse>) responseObserver);
          break;
        case METHODID_MMORDER:
          serviceImpl.mMOrder((com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ALL_ORDERS:
          serviceImpl.cancelAllOrders((com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse>) responseObserver);
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
          getCreatePairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgCreatePair,
              com.crescent.liquidity.v1beta1.TxProto.MsgCreatePairResponse>(
                service, METHODID_CREATE_PAIR)))
        .addMethod(
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgCreatePool,
              com.crescent.liquidity.v1beta1.TxProto.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getCreateRangedPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPool,
              com.crescent.liquidity.v1beta1.TxProto.MsgCreateRangedPoolResponse>(
                service, METHODID_CREATE_RANGED_POOL)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgDeposit,
              com.crescent.liquidity.v1beta1.TxProto.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgWithdraw,
              com.crescent.liquidity.v1beta1.TxProto.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrder,
              com.crescent.liquidity.v1beta1.TxProto.MsgLimitOrderResponse>(
                service, METHODID_LIMIT_ORDER)))
        .addMethod(
          getMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrder,
              com.crescent.liquidity.v1beta1.TxProto.MsgMarketOrderResponse>(
                service, METHODID_MARKET_ORDER)))
        .addMethod(
          getMMOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgMMOrder,
              com.crescent.liquidity.v1beta1.TxProto.MsgMMOrderResponse>(
                service, METHODID_MMORDER)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrder,
              com.crescent.liquidity.v1beta1.TxProto.MsgCancelOrderResponse>(
                service, METHODID_CANCEL_ORDER)))
        .addMethod(
          getCancelAllOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrders,
              com.crescent.liquidity.v1beta1.TxProto.MsgCancelAllOrdersResponse>(
                service, METHODID_CANCEL_ALL_ORDERS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.liquidity.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreatePairMethod())
              .addMethod(getCreatePoolMethod())
              .addMethod(getCreateRangedPoolMethod())
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getLimitOrderMethod())
              .addMethod(getMarketOrderMethod())
              .addMethod(getMMOrderMethod())
              .addMethod(getCancelOrderMethod())
              .addMethod(getCancelAllOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
