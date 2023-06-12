package com.comdex.liquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/liquidity/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "comdex.liquidity.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePair,
      com.comdex.liquidity.v1beta1.MsgCreatePairResponse> getCreatePairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePair",
      requestType = com.comdex.liquidity.v1beta1.MsgCreatePair.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCreatePairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePair,
      com.comdex.liquidity.v1beta1.MsgCreatePairResponse> getCreatePairMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePair, com.comdex.liquidity.v1beta1.MsgCreatePairResponse> getCreatePairMethod;
    if ((getCreatePairMethod = MsgGrpc.getCreatePairMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePairMethod = MsgGrpc.getCreatePairMethod) == null) {
          MsgGrpc.getCreatePairMethod = getCreatePairMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCreatePair, com.comdex.liquidity.v1beta1.MsgCreatePairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreatePair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreatePairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePair"))
              .build();
        }
      }
    }
    return getCreatePairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePool,
      com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.comdex.liquidity.v1beta1.MsgCreatePool.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePool,
      com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreatePool, com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCreatePool, com.comdex.liquidity.v1beta1.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreateRangedPool,
      com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRangedPool",
      requestType = com.comdex.liquidity.v1beta1.MsgCreateRangedPool.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreateRangedPool,
      com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCreateRangedPool, com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> getCreateRangedPoolMethod;
    if ((getCreateRangedPoolMethod = MsgGrpc.getCreateRangedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRangedPoolMethod = MsgGrpc.getCreateRangedPoolMethod) == null) {
          MsgGrpc.getCreateRangedPoolMethod = getCreateRangedPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCreateRangedPool, com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRangedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreateRangedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRangedPool"))
              .build();
        }
      }
    }
    return getCreateRangedPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDeposit,
      com.comdex.liquidity.v1beta1.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.comdex.liquidity.v1beta1.MsgDeposit.class,
      responseType = com.comdex.liquidity.v1beta1.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDeposit,
      com.comdex.liquidity.v1beta1.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDeposit, com.comdex.liquidity.v1beta1.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgDeposit, com.comdex.liquidity.v1beta1.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgWithdraw,
      com.comdex.liquidity.v1beta1.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.comdex.liquidity.v1beta1.MsgWithdraw.class,
      responseType = com.comdex.liquidity.v1beta1.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgWithdraw,
      com.comdex.liquidity.v1beta1.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgWithdraw, com.comdex.liquidity.v1beta1.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgWithdraw, com.comdex.liquidity.v1beta1.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgLimitOrder,
      com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> getLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrder",
      requestType = com.comdex.liquidity.v1beta1.MsgLimitOrder.class,
      responseType = com.comdex.liquidity.v1beta1.MsgLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgLimitOrder,
      com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> getLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgLimitOrder, com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> getLimitOrderMethod;
    if ((getLimitOrderMethod = MsgGrpc.getLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLimitOrderMethod = MsgGrpc.getLimitOrderMethod) == null) {
          MsgGrpc.getLimitOrderMethod = getLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgLimitOrder, com.comdex.liquidity.v1beta1.MsgLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LimitOrder"))
              .build();
        }
      }
    }
    return getLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMarketOrder,
      com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> getMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketOrder",
      requestType = com.comdex.liquidity.v1beta1.MsgMarketOrder.class,
      responseType = com.comdex.liquidity.v1beta1.MsgMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMarketOrder,
      com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> getMarketOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMarketOrder, com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> getMarketOrderMethod;
    if ((getMarketOrderMethod = MsgGrpc.getMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMarketOrderMethod = MsgGrpc.getMarketOrderMethod) == null) {
          MsgGrpc.getMarketOrderMethod = getMarketOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgMarketOrder, com.comdex.liquidity.v1beta1.MsgMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MarketOrder"))
              .build();
        }
      }
    }
    return getMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMMOrder,
      com.comdex.liquidity.v1beta1.MsgMMOrderResponse> getMMOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MMOrder",
      requestType = com.comdex.liquidity.v1beta1.MsgMMOrder.class,
      responseType = com.comdex.liquidity.v1beta1.MsgMMOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMMOrder,
      com.comdex.liquidity.v1beta1.MsgMMOrderResponse> getMMOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgMMOrder, com.comdex.liquidity.v1beta1.MsgMMOrderResponse> getMMOrderMethod;
    if ((getMMOrderMethod = MsgGrpc.getMMOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMMOrderMethod = MsgGrpc.getMMOrderMethod) == null) {
          MsgGrpc.getMMOrderMethod = getMMOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgMMOrder, com.comdex.liquidity.v1beta1.MsgMMOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MMOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgMMOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgMMOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MMOrder"))
              .build();
        }
      }
    }
    return getMMOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelOrder,
      com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = com.comdex.liquidity.v1beta1.MsgCancelOrder.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCancelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelOrder,
      com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelOrder, com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> getCancelOrderMethod;
    if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
          MsgGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCancelOrder, com.comdex.liquidity.v1beta1.MsgCancelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelAllOrders,
      com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAllOrders",
      requestType = com.comdex.liquidity.v1beta1.MsgCancelAllOrders.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelAllOrders,
      com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelAllOrders, com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> getCancelAllOrdersMethod;
    if ((getCancelAllOrdersMethod = MsgGrpc.getCancelAllOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelAllOrdersMethod = MsgGrpc.getCancelAllOrdersMethod) == null) {
          MsgGrpc.getCancelAllOrdersMethod = getCancelAllOrdersMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCancelAllOrders, com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelAllOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelAllOrders"))
              .build();
        }
      }
    }
    return getCancelAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelMMOrder,
      com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> getCancelMMOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMMOrder",
      requestType = com.comdex.liquidity.v1beta1.MsgCancelMMOrder.class,
      responseType = com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelMMOrder,
      com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> getCancelMMOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgCancelMMOrder, com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> getCancelMMOrderMethod;
    if ((getCancelMMOrderMethod = MsgGrpc.getCancelMMOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelMMOrderMethod = MsgGrpc.getCancelMMOrderMethod) == null) {
          MsgGrpc.getCancelMMOrderMethod = getCancelMMOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgCancelMMOrder, com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMMOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelMMOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelMMOrder"))
              .build();
        }
      }
    }
    return getCancelMMOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgFarm,
      com.comdex.liquidity.v1beta1.MsgFarmResponse> getFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Farm",
      requestType = com.comdex.liquidity.v1beta1.MsgFarm.class,
      responseType = com.comdex.liquidity.v1beta1.MsgFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgFarm,
      com.comdex.liquidity.v1beta1.MsgFarmResponse> getFarmMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgFarm, com.comdex.liquidity.v1beta1.MsgFarmResponse> getFarmMethod;
    if ((getFarmMethod = MsgGrpc.getFarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFarmMethod = MsgGrpc.getFarmMethod) == null) {
          MsgGrpc.getFarmMethod = getFarmMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgFarm, com.comdex.liquidity.v1beta1.MsgFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Farm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgFarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Farm"))
              .build();
        }
      }
    }
    return getFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarm,
      com.comdex.liquidity.v1beta1.MsgUnfarmResponse> getUnfarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfarm",
      requestType = com.comdex.liquidity.v1beta1.MsgUnfarm.class,
      responseType = com.comdex.liquidity.v1beta1.MsgUnfarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarm,
      com.comdex.liquidity.v1beta1.MsgUnfarmResponse> getUnfarmMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarm, com.comdex.liquidity.v1beta1.MsgUnfarmResponse> getUnfarmMethod;
    if ((getUnfarmMethod = MsgGrpc.getUnfarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfarmMethod = MsgGrpc.getUnfarmMethod) == null) {
          MsgGrpc.getUnfarmMethod = getUnfarmMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgUnfarm, com.comdex.liquidity.v1beta1.MsgUnfarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgUnfarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgUnfarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfarm"))
              .build();
        }
      }
    }
    return getUnfarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDepositAndFarm,
      com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> getDepositAndFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositAndFarm",
      requestType = com.comdex.liquidity.v1beta1.MsgDepositAndFarm.class,
      responseType = com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDepositAndFarm,
      com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> getDepositAndFarmMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgDepositAndFarm, com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> getDepositAndFarmMethod;
    if ((getDepositAndFarmMethod = MsgGrpc.getDepositAndFarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositAndFarmMethod = MsgGrpc.getDepositAndFarmMethod) == null) {
          MsgGrpc.getDepositAndFarmMethod = getDepositAndFarmMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgDepositAndFarm, com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositAndFarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgDepositAndFarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositAndFarm"))
              .build();
        }
      }
    }
    return getDepositAndFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw,
      com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> getUnfarmAndWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnfarmAndWithdraw",
      requestType = com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.class,
      responseType = com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw,
      com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> getUnfarmAndWithdrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw, com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> getUnfarmAndWithdrawMethod;
    if ((getUnfarmAndWithdrawMethod = MsgGrpc.getUnfarmAndWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfarmAndWithdrawMethod = MsgGrpc.getUnfarmAndWithdrawMethod) == null) {
          MsgGrpc.getUnfarmAndWithdrawMethod = getUnfarmAndWithdrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw, com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnfarmAndWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnfarmAndWithdraw"))
              .build();
        }
      }
    }
    return getUnfarmAndWithdrawMethod;
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
    default void createPair(com.comdex.liquidity.v1beta1.MsgCreatePair request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePairMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    default void createPool(com.comdex.liquidity.v1beta1.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    default void createRangedPool(com.comdex.liquidity.v1beta1.MsgCreateRangedPool request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRangedPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    default void deposit(com.comdex.liquidity.v1beta1.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    default void withdraw(com.comdex.liquidity.v1beta1.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    default void limitOrder(com.comdex.liquidity.v1beta1.MsgLimitOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    default void marketOrder(com.comdex.liquidity.v1beta1.MsgMarketOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    default void mMOrder(com.comdex.liquidity.v1beta1.MsgMMOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMMOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMMOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    default void cancelOrder(com.comdex.liquidity.v1beta1.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    default void cancelAllOrders(com.comdex.liquidity.v1beta1.MsgCancelAllOrders request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAllOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelMMOrder defines a method for cancelling previously placed market making orders
     * </pre>
     */
    default void cancelMMOrder(com.comdex.liquidity.v1beta1.MsgCancelMMOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMMOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgFarm defines a method to farm the pool token, for incentivization
     * </pre>
     */
    default void farm(com.comdex.liquidity.v1beta1.MsgFarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unfarm defines a method to unfarm the farmed pool token
     * </pre>
     */
    default void unfarm(com.comdex.liquidity.v1beta1.MsgUnfarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositAndFarm defines an SDK message for depositing coins to the pool and farming the pool coin
     * </pre>
     */
    default void depositAndFarm(com.comdex.liquidity.v1beta1.MsgDepositAndFarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositAndFarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnfarmAndWithdraw defines a SDK message for performing unfarm of the farmed coins and withdrawing liquidity from pool
     * </pre>
     */
    default void unfarmAndWithdraw(com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfarmAndWithdrawMethod(), responseObserver);
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
    public void createPair(com.comdex.liquidity.v1beta1.MsgCreatePair request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public void createPool(com.comdex.liquidity.v1beta1.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public void createRangedPool(com.comdex.liquidity.v1beta1.MsgCreateRangedPool request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRangedPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public void deposit(com.comdex.liquidity.v1beta1.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public void withdraw(com.comdex.liquidity.v1beta1.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public void limitOrder(com.comdex.liquidity.v1beta1.MsgLimitOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public void marketOrder(com.comdex.liquidity.v1beta1.MsgMarketOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public void mMOrder(com.comdex.liquidity.v1beta1.MsgMMOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMMOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMMOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public void cancelOrder(com.comdex.liquidity.v1beta1.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public void cancelAllOrders(com.comdex.liquidity.v1beta1.MsgCancelAllOrders request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelMMOrder defines a method for cancelling previously placed market making orders
     * </pre>
     */
    public void cancelMMOrder(com.comdex.liquidity.v1beta1.MsgCancelMMOrder request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMMOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgFarm defines a method to farm the pool token, for incentivization
     * </pre>
     */
    public void farm(com.comdex.liquidity.v1beta1.MsgFarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unfarm defines a method to unfarm the farmed pool token
     * </pre>
     */
    public void unfarm(com.comdex.liquidity.v1beta1.MsgUnfarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositAndFarm defines an SDK message for depositing coins to the pool and farming the pool coin
     * </pre>
     */
    public void depositAndFarm(com.comdex.liquidity.v1beta1.MsgDepositAndFarm request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositAndFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnfarmAndWithdraw defines a SDK message for performing unfarm of the farmed coins and withdrawing liquidity from pool
     * </pre>
     */
    public void unfarmAndWithdraw(com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfarmAndWithdrawMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.liquidity.v1beta1.MsgCreatePairResponse createPair(com.comdex.liquidity.v1beta1.MsgCreatePair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgCreatePoolResponse createPool(com.comdex.liquidity.v1beta1.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse createRangedPool(com.comdex.liquidity.v1beta1.MsgCreateRangedPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRangedPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgDepositResponse deposit(com.comdex.liquidity.v1beta1.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgWithdrawResponse withdraw(com.comdex.liquidity.v1beta1.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgLimitOrderResponse limitOrder(com.comdex.liquidity.v1beta1.MsgLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgMarketOrderResponse marketOrder(com.comdex.liquidity.v1beta1.MsgMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgMMOrderResponse mMOrder(com.comdex.liquidity.v1beta1.MsgMMOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMMOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgCancelOrderResponse cancelOrder(com.comdex.liquidity.v1beta1.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse cancelAllOrders(com.comdex.liquidity.v1beta1.MsgCancelAllOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelMMOrder defines a method for cancelling previously placed market making orders
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse cancelMMOrder(com.comdex.liquidity.v1beta1.MsgCancelMMOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMMOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgFarm defines a method to farm the pool token, for incentivization
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgFarmResponse farm(com.comdex.liquidity.v1beta1.MsgFarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unfarm defines a method to unfarm the farmed pool token
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgUnfarmResponse unfarm(com.comdex.liquidity.v1beta1.MsgUnfarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositAndFarm defines an SDK message for depositing coins to the pool and farming the pool coin
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse depositAndFarm(com.comdex.liquidity.v1beta1.MsgDepositAndFarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositAndFarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnfarmAndWithdraw defines a SDK message for performing unfarm of the farmed coins and withdrawing liquidity from pool
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse unfarmAndWithdraw(com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfarmAndWithdrawMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCreatePairResponse> createPair(
        com.comdex.liquidity.v1beta1.MsgCreatePair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePool defines a method for creating a pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCreatePoolResponse> createPool(
        com.comdex.liquidity.v1beta1.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRangePool defines a method for creating a ranged pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse> createRangedPool(
        com.comdex.liquidity.v1beta1.MsgCreateRangedPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRangedPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposit defines a method for depositing coins to the pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgDepositResponse> deposit(
        com.comdex.liquidity.v1beta1.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing pool coin from the pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgWithdrawResponse> withdraw(
        com.comdex.liquidity.v1beta1.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LimitOrder defines a method for making a limit order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgLimitOrderResponse> limitOrder(
        com.comdex.liquidity.v1beta1.MsgLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketOrder defines a method for making a market order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgMarketOrderResponse> marketOrder(
        com.comdex.liquidity.v1beta1.MsgMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgMMOrder defines a method for making a MM(market making) order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgMMOrderResponse> mMOrder(
        com.comdex.liquidity.v1beta1.MsgMMOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMMOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelOrder defines a method for cancelling an order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCancelOrderResponse> cancelOrder(
        com.comdex.liquidity.v1beta1.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelAllOrders defines a method for cancelling all orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse> cancelAllOrders(
        com.comdex.liquidity.v1beta1.MsgCancelAllOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAllOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelMMOrder defines a method for cancelling previously placed market making orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse> cancelMMOrder(
        com.comdex.liquidity.v1beta1.MsgCancelMMOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMMOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgFarm defines a method to farm the pool token, for incentivization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgFarmResponse> farm(
        com.comdex.liquidity.v1beta1.MsgFarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unfarm defines a method to unfarm the farmed pool token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgUnfarmResponse> unfarm(
        com.comdex.liquidity.v1beta1.MsgUnfarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositAndFarm defines an SDK message for depositing coins to the pool and farming the pool coin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse> depositAndFarm(
        com.comdex.liquidity.v1beta1.MsgDepositAndFarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositAndFarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnfarmAndWithdraw defines a SDK message for performing unfarm of the farmed coins and withdrawing liquidity from pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse> unfarmAndWithdraw(
        com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfarmAndWithdrawMethod(), getCallOptions()), request);
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
  private static final int METHODID_CANCEL_MMORDER = 10;
  private static final int METHODID_FARM = 11;
  private static final int METHODID_UNFARM = 12;
  private static final int METHODID_DEPOSIT_AND_FARM = 13;
  private static final int METHODID_UNFARM_AND_WITHDRAW = 14;

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
          serviceImpl.createPair((com.comdex.liquidity.v1beta1.MsgCreatePair) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePairResponse>) responseObserver);
          break;
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.comdex.liquidity.v1beta1.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_CREATE_RANGED_POOL:
          serviceImpl.createRangedPool((com.comdex.liquidity.v1beta1.MsgCreateRangedPool) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.comdex.liquidity.v1beta1.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.comdex.liquidity.v1beta1.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER:
          serviceImpl.limitOrder((com.comdex.liquidity.v1beta1.MsgLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgLimitOrderResponse>) responseObserver);
          break;
        case METHODID_MARKET_ORDER:
          serviceImpl.marketOrder((com.comdex.liquidity.v1beta1.MsgMarketOrder) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMarketOrderResponse>) responseObserver);
          break;
        case METHODID_MMORDER:
          serviceImpl.mMOrder((com.comdex.liquidity.v1beta1.MsgMMOrder) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgMMOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((com.comdex.liquidity.v1beta1.MsgCancelOrder) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ALL_ORDERS:
          serviceImpl.cancelAllOrders((com.comdex.liquidity.v1beta1.MsgCancelAllOrders) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MMORDER:
          serviceImpl.cancelMMOrder((com.comdex.liquidity.v1beta1.MsgCancelMMOrder) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse>) responseObserver);
          break;
        case METHODID_FARM:
          serviceImpl.farm((com.comdex.liquidity.v1beta1.MsgFarm) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgFarmResponse>) responseObserver);
          break;
        case METHODID_UNFARM:
          serviceImpl.unfarm((com.comdex.liquidity.v1beta1.MsgUnfarm) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_AND_FARM:
          serviceImpl.depositAndFarm((com.comdex.liquidity.v1beta1.MsgDepositAndFarm) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse>) responseObserver);
          break;
        case METHODID_UNFARM_AND_WITHDRAW:
          serviceImpl.unfarmAndWithdraw((com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse>) responseObserver);
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
              com.comdex.liquidity.v1beta1.MsgCreatePair,
              com.comdex.liquidity.v1beta1.MsgCreatePairResponse>(
                service, METHODID_CREATE_PAIR)))
        .addMethod(
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgCreatePool,
              com.comdex.liquidity.v1beta1.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getCreateRangedPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgCreateRangedPool,
              com.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse>(
                service, METHODID_CREATE_RANGED_POOL)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgDeposit,
              com.comdex.liquidity.v1beta1.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgWithdraw,
              com.comdex.liquidity.v1beta1.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgLimitOrder,
              com.comdex.liquidity.v1beta1.MsgLimitOrderResponse>(
                service, METHODID_LIMIT_ORDER)))
        .addMethod(
          getMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgMarketOrder,
              com.comdex.liquidity.v1beta1.MsgMarketOrderResponse>(
                service, METHODID_MARKET_ORDER)))
        .addMethod(
          getMMOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgMMOrder,
              com.comdex.liquidity.v1beta1.MsgMMOrderResponse>(
                service, METHODID_MMORDER)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgCancelOrder,
              com.comdex.liquidity.v1beta1.MsgCancelOrderResponse>(
                service, METHODID_CANCEL_ORDER)))
        .addMethod(
          getCancelAllOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgCancelAllOrders,
              com.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse>(
                service, METHODID_CANCEL_ALL_ORDERS)))
        .addMethod(
          getCancelMMOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgCancelMMOrder,
              com.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse>(
                service, METHODID_CANCEL_MMORDER)))
        .addMethod(
          getFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgFarm,
              com.comdex.liquidity.v1beta1.MsgFarmResponse>(
                service, METHODID_FARM)))
        .addMethod(
          getUnfarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgUnfarm,
              com.comdex.liquidity.v1beta1.MsgUnfarmResponse>(
                service, METHODID_UNFARM)))
        .addMethod(
          getDepositAndFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgDepositAndFarm,
              com.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse>(
                service, METHODID_DEPOSIT_AND_FARM)))
        .addMethod(
          getUnfarmAndWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw,
              com.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse>(
                service, METHODID_UNFARM_AND_WITHDRAW)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.liquidity.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCancelMMOrderMethod())
              .addMethod(getFarmMethod())
              .addMethod(getUnfarmMethod())
              .addMethod(getDepositAndFarmMethod())
              .addMethod(getUnfarmAndWithdrawMethod())
              .build();
        }
      }
    }
    return result;
  }
}
