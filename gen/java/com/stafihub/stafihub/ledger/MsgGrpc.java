package com.stafihub.stafihub.ledger;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/ledger/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.ledger.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit,
      com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEraUnbondLimit",
      requestType = com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit,
      com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit, com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> getSetEraUnbondLimitMethod;
    if ((getSetEraUnbondLimitMethod = MsgGrpc.getSetEraUnbondLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetEraUnbondLimitMethod = MsgGrpc.getSetEraUnbondLimitMethod) == null) {
          MsgGrpc.getSetEraUnbondLimitMethod = getSetEraUnbondLimitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit, com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEraUnbondLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetEraUnbondLimit"))
              .build();
        }
      }
    }
    return getSetEraUnbondLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolDetail,
      com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> getSetPoolDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPoolDetail",
      requestType = com.stafihub.stafihub.ledger.MsgSetPoolDetail.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolDetail,
      com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> getSetPoolDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolDetail, com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> getSetPoolDetailMethod;
    if ((getSetPoolDetailMethod = MsgGrpc.getSetPoolDetailMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPoolDetailMethod = MsgGrpc.getSetPoolDetailMethod) == null) {
          MsgGrpc.getSetPoolDetailMethod = getSetPoolDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetPoolDetail, com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPoolDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetPoolDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPoolDetail"))
              .build();
        }
      }
    }
    return getSetPoolDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetLeastBond,
      com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> getSetLeastBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLeastBond",
      requestType = com.stafihub.stafihub.ledger.MsgSetLeastBond.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetLeastBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetLeastBond,
      com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> getSetLeastBondMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetLeastBond, com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> getSetLeastBondMethod;
    if ((getSetLeastBondMethod = MsgGrpc.getSetLeastBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetLeastBondMethod = MsgGrpc.getSetLeastBondMethod) == null) {
          MsgGrpc.getSetLeastBondMethod = getSetLeastBondMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetLeastBond, com.stafihub.stafihub.ledger.MsgSetLeastBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLeastBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetLeastBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetLeastBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetLeastBond"))
              .build();
        }
      }
    }
    return getSetLeastBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots,
      com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearCurrentEraSnapShots",
      requestType = com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots.class,
      responseType = com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots,
      com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots, com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> getClearCurrentEraSnapShotsMethod;
    if ((getClearCurrentEraSnapShotsMethod = MsgGrpc.getClearCurrentEraSnapShotsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearCurrentEraSnapShotsMethod = MsgGrpc.getClearCurrentEraSnapShotsMethod) == null) {
          MsgGrpc.getClearCurrentEraSnapShotsMethod = getClearCurrentEraSnapShotsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots, com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearCurrentEraSnapShots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearCurrentEraSnapShots"))
              .build();
        }
      }
    }
    return getClearCurrentEraSnapShotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission,
      com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStakingRewardCommission",
      requestType = com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission,
      com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission, com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> getSetStakingRewardCommissionMethod;
    if ((getSetStakingRewardCommissionMethod = MsgGrpc.getSetStakingRewardCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetStakingRewardCommissionMethod = MsgGrpc.getSetStakingRewardCommissionMethod) == null) {
          MsgGrpc.getSetStakingRewardCommissionMethod = getSetStakingRewardCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission, com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStakingRewardCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetStakingRewardCommission"))
              .build();
        }
      }
    }
    return getSetStakingRewardCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver,
      com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetProtocolFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver,
      com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver, com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> getSetProtocolFeeReceiverMethod;
    if ((getSetProtocolFeeReceiverMethod = MsgGrpc.getSetProtocolFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetProtocolFeeReceiverMethod = MsgGrpc.getSetProtocolFeeReceiverMethod) == null) {
          MsgGrpc.getSetProtocolFeeReceiverMethod = getSetProtocolFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver, com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetProtocolFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetProtocolFeeReceiver"))
              .build();
        }
      }
    }
    return getSetProtocolFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee,
      com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUnbondRelayFee",
      requestType = com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee,
      com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee, com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> getSetUnbondRelayFeeMethod;
    if ((getSetUnbondRelayFeeMethod = MsgGrpc.getSetUnbondRelayFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUnbondRelayFeeMethod = MsgGrpc.getSetUnbondRelayFeeMethod) == null) {
          MsgGrpc.getSetUnbondRelayFeeMethod = getSetUnbondRelayFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee, com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUnbondRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUnbondRelayFee"))
              .build();
        }
      }
    }
    return getSetUnbondRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgLiquidityUnbond,
      com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityUnbond",
      requestType = com.stafihub.stafihub.ledger.MsgLiquidityUnbond.class,
      responseType = com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgLiquidityUnbond,
      com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgLiquidityUnbond, com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> getLiquidityUnbondMethod;
    if ((getLiquidityUnbondMethod = MsgGrpc.getLiquidityUnbondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidityUnbondMethod = MsgGrpc.getLiquidityUnbondMethod) == null) {
          MsgGrpc.getLiquidityUnbondMethod = getLiquidityUnbondMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgLiquidityUnbond, com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityUnbond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgLiquidityUnbond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidityUnbond"))
              .build();
        }
      }
    }
    return getLiquidityUnbondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondCommission,
      com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUnbondCommission",
      requestType = com.stafihub.stafihub.ledger.MsgSetUnbondCommission.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondCommission,
      com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetUnbondCommission, com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> getSetUnbondCommissionMethod;
    if ((getSetUnbondCommissionMethod = MsgGrpc.getSetUnbondCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUnbondCommissionMethod = MsgGrpc.getSetUnbondCommissionMethod) == null) {
          MsgGrpc.getSetUnbondCommissionMethod = getSetUnbondCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetUnbondCommission, com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUnbondCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetUnbondCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUnbondCommission"))
              .build();
        }
      }
    }
    return getSetUnbondCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSubmitSignature,
      com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> getSubmitSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitSignature",
      requestType = com.stafihub.stafihub.ledger.MsgSubmitSignature.class,
      responseType = com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSubmitSignature,
      com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> getSubmitSignatureMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSubmitSignature, com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> getSubmitSignatureMethod;
    if ((getSubmitSignatureMethod = MsgGrpc.getSubmitSignatureMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitSignatureMethod = MsgGrpc.getSubmitSignatureMethod) == null) {
          MsgGrpc.getSubmitSignatureMethod = getSubmitSignatureMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSubmitSignature, com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSubmitSignature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitSignature"))
              .build();
        }
      }
    }
    return getSubmitSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRParams,
      com.stafihub.stafihub.ledger.MsgSetRParamsResponse> getSetRParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRParams",
      requestType = com.stafihub.stafihub.ledger.MsgSetRParams.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetRParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRParams,
      com.stafihub.stafihub.ledger.MsgSetRParamsResponse> getSetRParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRParams, com.stafihub.stafihub.ledger.MsgSetRParamsResponse> getSetRParamsMethod;
    if ((getSetRParamsMethod = MsgGrpc.getSetRParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRParamsMethod = MsgGrpc.getSetRParamsMethod) == null) {
          MsgGrpc.getSetRParamsMethod = getSetRParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetRParams, com.stafihub.stafihub.ledger.MsgSetRParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRParams"))
              .build();
        }
      }
    }
    return getSetRParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver,
      com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver,
      com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver, com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;
    if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
          MsgGrpc.getSetRelayFeeReceiverMethod = getSetRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver, com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFeeReceiver"))
              .build();
        }
      }
    }
    return getSetRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayGasPrice,
      com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayGasPrice",
      requestType = com.stafihub.stafihub.ledger.MsgSetRelayGasPrice.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayGasPrice,
      com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetRelayGasPrice, com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> getSetRelayGasPriceMethod;
    if ((getSetRelayGasPriceMethod = MsgGrpc.getSetRelayGasPriceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayGasPriceMethod = MsgGrpc.getSetRelayGasPriceMethod) == null) {
          MsgGrpc.getSetRelayGasPriceMethod = getSetRelayGasPriceMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetRelayGasPrice, com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRelayGasPrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayGasPrice"))
              .build();
        }
      }
    }
    return getSetRelayGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraSeconds,
      com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> getSetEraSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEraSeconds",
      requestType = com.stafihub.stafihub.ledger.MsgSetEraSeconds.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraSeconds,
      com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> getSetEraSecondsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetEraSeconds, com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> getSetEraSecondsMethod;
    if ((getSetEraSecondsMethod = MsgGrpc.getSetEraSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetEraSecondsMethod = MsgGrpc.getSetEraSecondsMethod) == null) {
          MsgGrpc.getSetEraSecondsMethod = getSetEraSecondsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetEraSeconds, com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEraSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetEraSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetEraSeconds"))
              .build();
        }
      }
    }
    return getSetEraSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRmBondedPool,
      com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> getRmBondedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmBondedPool",
      requestType = com.stafihub.stafihub.ledger.MsgRmBondedPool.class,
      responseType = com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRmBondedPool,
      com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> getRmBondedPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRmBondedPool, com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> getRmBondedPoolMethod;
    if ((getRmBondedPoolMethod = MsgGrpc.getRmBondedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmBondedPoolMethod = MsgGrpc.getRmBondedPoolMethod) == null) {
          MsgGrpc.getRmBondedPoolMethod = getRmBondedPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgRmBondedPool, com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmBondedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgRmBondedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmBondedPool"))
              .build();
        }
      }
    }
    return getRmBondedPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateInit,
      com.stafihub.stafihub.ledger.MsgMigrateInitResponse> getMigrateInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateInit",
      requestType = com.stafihub.stafihub.ledger.MsgMigrateInit.class,
      responseType = com.stafihub.stafihub.ledger.MsgMigrateInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateInit,
      com.stafihub.stafihub.ledger.MsgMigrateInitResponse> getMigrateInitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateInit, com.stafihub.stafihub.ledger.MsgMigrateInitResponse> getMigrateInitMethod;
    if ((getMigrateInitMethod = MsgGrpc.getMigrateInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateInitMethod = MsgGrpc.getMigrateInitMethod) == null) {
          MsgGrpc.getMigrateInitMethod = getMigrateInitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgMigrateInit, com.stafihub.stafihub.ledger.MsgMigrateInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgMigrateInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgMigrateInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateInit"))
              .build();
        }
      }
    }
    return getMigrateInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateUnbondings,
      com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateUnbondings",
      requestType = com.stafihub.stafihub.ledger.MsgMigrateUnbondings.class,
      responseType = com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateUnbondings,
      com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgMigrateUnbondings, com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> getMigrateUnbondingsMethod;
    if ((getMigrateUnbondingsMethod = MsgGrpc.getMigrateUnbondingsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateUnbondingsMethod = MsgGrpc.getMigrateUnbondingsMethod) == null) {
          MsgGrpc.getMigrateUnbondingsMethod = getMigrateUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgMigrateUnbondings, com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgMigrateUnbondings.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateUnbondings"))
              .build();
        }
      }
    }
    return getMigrateUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch,
      com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleUnbondSwitch",
      requestType = com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch.class,
      responseType = com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch,
      com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch, com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> getToggleUnbondSwitchMethod;
    if ((getToggleUnbondSwitchMethod = MsgGrpc.getToggleUnbondSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleUnbondSwitchMethod = MsgGrpc.getToggleUnbondSwitchMethod) == null) {
          MsgGrpc.getToggleUnbondSwitchMethod = getToggleUnbondSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch, com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleUnbondSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleUnbondSwitch"))
              .build();
        }
      }
    }
    return getToggleUnbondSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgUnsealMigrateInit,
      com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsealMigrateInit",
      requestType = com.stafihub.stafihub.ledger.MsgUnsealMigrateInit.class,
      responseType = com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgUnsealMigrateInit,
      com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgUnsealMigrateInit, com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> getUnsealMigrateInitMethod;
    if ((getUnsealMigrateInitMethod = MsgGrpc.getUnsealMigrateInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnsealMigrateInitMethod = MsgGrpc.getUnsealMigrateInitMethod) == null) {
          MsgGrpc.getUnsealMigrateInitMethod = getUnsealMigrateInitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgUnsealMigrateInit, com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsealMigrateInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgUnsealMigrateInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnsealMigrateInit"))
              .build();
        }
      }
    }
    return getUnsealMigrateInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRegisterIcaPool,
      com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterIcaPool",
      requestType = com.stafihub.stafihub.ledger.MsgRegisterIcaPool.class,
      responseType = com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRegisterIcaPool,
      com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgRegisterIcaPool, com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> getRegisterIcaPoolMethod;
    if ((getRegisterIcaPoolMethod = MsgGrpc.getRegisterIcaPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterIcaPoolMethod = MsgGrpc.getRegisterIcaPoolMethod) == null) {
          MsgGrpc.getRegisterIcaPoolMethod = getRegisterIcaPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgRegisterIcaPool, com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterIcaPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgRegisterIcaPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterIcaPool"))
              .build();
        }
      }
    }
    return getRegisterIcaPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr,
      com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawalAddr",
      requestType = com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr,
      com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr, com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> getSetWithdrawalAddrMethod;
    if ((getSetWithdrawalAddrMethod = MsgGrpc.getSetWithdrawalAddrMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawalAddrMethod = MsgGrpc.getSetWithdrawalAddrMethod) == null) {
          MsgGrpc.getSetWithdrawalAddrMethod = getSetWithdrawalAddrMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr, com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWithdrawalAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawalAddr"))
              .build();
        }
      }
    }
    return getSetWithdrawalAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgInitPool,
      com.stafihub.stafihub.ledger.MsgInitPoolResponse> getInitPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPool",
      requestType = com.stafihub.stafihub.ledger.MsgInitPool.class,
      responseType = com.stafihub.stafihub.ledger.MsgInitPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgInitPool,
      com.stafihub.stafihub.ledger.MsgInitPoolResponse> getInitPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgInitPool, com.stafihub.stafihub.ledger.MsgInitPoolResponse> getInitPoolMethod;
    if ((getInitPoolMethod = MsgGrpc.getInitPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInitPoolMethod = MsgGrpc.getInitPoolMethod) == null) {
          MsgGrpc.getInitPoolMethod = getInitPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgInitPool, com.stafihub.stafihub.ledger.MsgInitPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgInitPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgInitPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InitPool"))
              .build();
        }
      }
    }
    return getInitPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolStatus,
      com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> getSetPoolStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPoolStatus",
      requestType = com.stafihub.stafihub.ledger.MsgSetPoolStatus.class,
      responseType = com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolStatus,
      com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> getSetPoolStatusMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.MsgSetPoolStatus, com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> getSetPoolStatusMethod;
    if ((getSetPoolStatusMethod = MsgGrpc.getSetPoolStatusMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPoolStatusMethod = MsgGrpc.getSetPoolStatusMethod) == null) {
          MsgGrpc.getSetPoolStatusMethod = getSetPoolStatusMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.MsgSetPoolStatus, com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPoolStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetPoolStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPoolStatus"))
              .build();
        }
      }
    }
    return getSetPoolStatusMethod;
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
     */
    default void setEraUnbondLimit(com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEraUnbondLimitMethod(), responseObserver);
    }

    /**
     */
    default void setPoolDetail(com.stafihub.stafihub.ledger.MsgSetPoolDetail request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPoolDetailMethod(), responseObserver);
    }

    /**
     */
    default void setLeastBond(com.stafihub.stafihub.ledger.MsgSetLeastBond request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetLeastBondMethod(), responseObserver);
    }

    /**
     */
    default void clearCurrentEraSnapShots(com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearCurrentEraSnapShotsMethod(), responseObserver);
    }

    /**
     */
    default void setStakingRewardCommission(com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetStakingRewardCommissionMethod(), responseObserver);
    }

    /**
     */
    default void setProtocolFeeReceiver(com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetProtocolFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    default void setUnbondRelayFee(com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUnbondRelayFeeMethod(), responseObserver);
    }

    /**
     */
    default void liquidityUnbond(com.stafihub.stafihub.ledger.MsgLiquidityUnbond request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityUnbondMethod(), responseObserver);
    }

    /**
     */
    default void setUnbondCommission(com.stafihub.stafihub.ledger.MsgSetUnbondCommission request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUnbondCommissionMethod(), responseObserver);
    }

    /**
     */
    default void submitSignature(com.stafihub.stafihub.ledger.MsgSubmitSignature request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitSignatureMethod(), responseObserver);
    }

    /**
     */
    default void setRParams(com.stafihub.stafihub.ledger.MsgSetRParams request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRParamsMethod(), responseObserver);
    }

    /**
     */
    default void setRelayFeeReceiver(com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    default void setRelayGasPrice(com.stafihub.stafihub.ledger.MsgSetRelayGasPrice request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelayGasPriceMethod(), responseObserver);
    }

    /**
     */
    default void setEraSeconds(com.stafihub.stafihub.ledger.MsgSetEraSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEraSecondsMethod(), responseObserver);
    }

    /**
     */
    default void rmBondedPool(com.stafihub.stafihub.ledger.MsgRmBondedPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmBondedPoolMethod(), responseObserver);
    }

    /**
     */
    default void migrateInit(com.stafihub.stafihub.ledger.MsgMigrateInit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateInitMethod(), responseObserver);
    }

    /**
     */
    default void migrateUnbondings(com.stafihub.stafihub.ledger.MsgMigrateUnbondings request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateUnbondingsMethod(), responseObserver);
    }

    /**
     */
    default void toggleUnbondSwitch(com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleUnbondSwitchMethod(), responseObserver);
    }

    /**
     */
    default void unsealMigrateInit(com.stafihub.stafihub.ledger.MsgUnsealMigrateInit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsealMigrateInitMethod(), responseObserver);
    }

    /**
     */
    default void registerIcaPool(com.stafihub.stafihub.ledger.MsgRegisterIcaPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterIcaPoolMethod(), responseObserver);
    }

    /**
     */
    default void setWithdrawalAddr(com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWithdrawalAddrMethod(), responseObserver);
    }

    /**
     */
    default void initPool(com.stafihub.stafihub.ledger.MsgInitPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgInitPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void setPoolStatus(com.stafihub.stafihub.ledger.MsgSetPoolStatus request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPoolStatusMethod(), responseObserver);
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
     */
    public void setEraUnbondLimit(com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEraUnbondLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPoolDetail(com.stafihub.stafihub.ledger.MsgSetPoolDetail request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPoolDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setLeastBond(com.stafihub.stafihub.ledger.MsgSetLeastBond request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetLeastBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCurrentEraSnapShots(com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearCurrentEraSnapShotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStakingRewardCommission(com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetStakingRewardCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setProtocolFeeReceiver(com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetProtocolFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUnbondRelayFee(com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUnbondRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void liquidityUnbond(com.stafihub.stafihub.ledger.MsgLiquidityUnbond request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityUnbondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUnbondCommission(com.stafihub.stafihub.ledger.MsgSetUnbondCommission request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUnbondCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitSignature(com.stafihub.stafihub.ledger.MsgSubmitSignature request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRParams(com.stafihub.stafihub.ledger.MsgSetRParams request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayGasPrice(com.stafihub.stafihub.ledger.MsgSetRelayGasPrice request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelayGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setEraSeconds(com.stafihub.stafihub.ledger.MsgSetEraSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEraSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmBondedPool(com.stafihub.stafihub.ledger.MsgRmBondedPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmBondedPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateInit(com.stafihub.stafihub.ledger.MsgMigrateInit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void migrateUnbondings(com.stafihub.stafihub.ledger.MsgMigrateUnbondings request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleUnbondSwitch(com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleUnbondSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsealMigrateInit(com.stafihub.stafihub.ledger.MsgUnsealMigrateInit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsealMigrateInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerIcaPool(com.stafihub.stafihub.ledger.MsgRegisterIcaPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterIcaPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setWithdrawalAddr(com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWithdrawalAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initPool(com.stafihub.stafihub.ledger.MsgInitPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgInitPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setPoolStatus(com.stafihub.stafihub.ledger.MsgSetPoolStatus request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPoolStatusMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse setEraUnbondLimit(com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEraUnbondLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse setPoolDetail(com.stafihub.stafihub.ledger.MsgSetPoolDetail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPoolDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetLeastBondResponse setLeastBond(com.stafihub.stafihub.ledger.MsgSetLeastBond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetLeastBondMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse clearCurrentEraSnapShots(com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearCurrentEraSnapShotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse setStakingRewardCommission(com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetStakingRewardCommissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse setProtocolFeeReceiver(com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetProtocolFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse setUnbondRelayFee(com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUnbondRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse liquidityUnbond(com.stafihub.stafihub.ledger.MsgLiquidityUnbond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityUnbondMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse setUnbondCommission(com.stafihub.stafihub.ledger.MsgSetUnbondCommission request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUnbondCommissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse submitSignature(com.stafihub.stafihub.ledger.MsgSubmitSignature request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitSignatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetRParamsResponse setRParams(com.stafihub.stafihub.ledger.MsgSetRParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse setRelayFeeReceiver(com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse setRelayGasPrice(com.stafihub.stafihub.ledger.MsgSetRelayGasPrice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelayGasPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse setEraSeconds(com.stafihub.stafihub.ledger.MsgSetEraSeconds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEraSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse rmBondedPool(com.stafihub.stafihub.ledger.MsgRmBondedPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmBondedPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgMigrateInitResponse migrateInit(com.stafihub.stafihub.ledger.MsgMigrateInit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateInitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse migrateUnbondings(com.stafihub.stafihub.ledger.MsgMigrateUnbondings request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse toggleUnbondSwitch(com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleUnbondSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse unsealMigrateInit(com.stafihub.stafihub.ledger.MsgUnsealMigrateInit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsealMigrateInitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse registerIcaPool(com.stafihub.stafihub.ledger.MsgRegisterIcaPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterIcaPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse setWithdrawalAddr(com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWithdrawalAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.ledger.MsgInitPoolResponse initPool(com.stafihub.stafihub.ledger.MsgInitPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse setPoolStatus(com.stafihub.stafihub.ledger.MsgSetPoolStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPoolStatusMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse> setEraUnbondLimit(
        com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEraUnbondLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse> setPoolDetail(
        com.stafihub.stafihub.ledger.MsgSetPoolDetail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPoolDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetLeastBondResponse> setLeastBond(
        com.stafihub.stafihub.ledger.MsgSetLeastBond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetLeastBondMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse> clearCurrentEraSnapShots(
        com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearCurrentEraSnapShotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse> setStakingRewardCommission(
        com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetStakingRewardCommissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse> setProtocolFeeReceiver(
        com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetProtocolFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse> setUnbondRelayFee(
        com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUnbondRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse> liquidityUnbond(
        com.stafihub.stafihub.ledger.MsgLiquidityUnbond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityUnbondMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse> setUnbondCommission(
        com.stafihub.stafihub.ledger.MsgSetUnbondCommission request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUnbondCommissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse> submitSignature(
        com.stafihub.stafihub.ledger.MsgSubmitSignature request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetRParamsResponse> setRParams(
        com.stafihub.stafihub.ledger.MsgSetRParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse> setRelayFeeReceiver(
        com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse> setRelayGasPrice(
        com.stafihub.stafihub.ledger.MsgSetRelayGasPrice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelayGasPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse> setEraSeconds(
        com.stafihub.stafihub.ledger.MsgSetEraSeconds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEraSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse> rmBondedPool(
        com.stafihub.stafihub.ledger.MsgRmBondedPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmBondedPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgMigrateInitResponse> migrateInit(
        com.stafihub.stafihub.ledger.MsgMigrateInit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateInitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse> migrateUnbondings(
        com.stafihub.stafihub.ledger.MsgMigrateUnbondings request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse> toggleUnbondSwitch(
        com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleUnbondSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse> unsealMigrateInit(
        com.stafihub.stafihub.ledger.MsgUnsealMigrateInit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsealMigrateInitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse> registerIcaPool(
        com.stafihub.stafihub.ledger.MsgRegisterIcaPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterIcaPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse> setWithdrawalAddr(
        com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWithdrawalAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgInitPoolResponse> initPool(
        com.stafihub.stafihub.ledger.MsgInitPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse> setPoolStatus(
        com.stafihub.stafihub.ledger.MsgSetPoolStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPoolStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ERA_UNBOND_LIMIT = 0;
  private static final int METHODID_SET_POOL_DETAIL = 1;
  private static final int METHODID_SET_LEAST_BOND = 2;
  private static final int METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS = 3;
  private static final int METHODID_SET_STAKING_REWARD_COMMISSION = 4;
  private static final int METHODID_SET_PROTOCOL_FEE_RECEIVER = 5;
  private static final int METHODID_SET_UNBOND_RELAY_FEE = 6;
  private static final int METHODID_LIQUIDITY_UNBOND = 7;
  private static final int METHODID_SET_UNBOND_COMMISSION = 8;
  private static final int METHODID_SUBMIT_SIGNATURE = 9;
  private static final int METHODID_SET_RPARAMS = 10;
  private static final int METHODID_SET_RELAY_FEE_RECEIVER = 11;
  private static final int METHODID_SET_RELAY_GAS_PRICE = 12;
  private static final int METHODID_SET_ERA_SECONDS = 13;
  private static final int METHODID_RM_BONDED_POOL = 14;
  private static final int METHODID_MIGRATE_INIT = 15;
  private static final int METHODID_MIGRATE_UNBONDINGS = 16;
  private static final int METHODID_TOGGLE_UNBOND_SWITCH = 17;
  private static final int METHODID_UNSEAL_MIGRATE_INIT = 18;
  private static final int METHODID_REGISTER_ICA_POOL = 19;
  private static final int METHODID_SET_WITHDRAWAL_ADDR = 20;
  private static final int METHODID_INIT_POOL = 21;
  private static final int METHODID_SET_POOL_STATUS = 22;

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
        case METHODID_SET_ERA_UNBOND_LIMIT:
          serviceImpl.setEraUnbondLimit((com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse>) responseObserver);
          break;
        case METHODID_SET_POOL_DETAIL:
          serviceImpl.setPoolDetail((com.stafihub.stafihub.ledger.MsgSetPoolDetail) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse>) responseObserver);
          break;
        case METHODID_SET_LEAST_BOND:
          serviceImpl.setLeastBond((com.stafihub.stafihub.ledger.MsgSetLeastBond) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetLeastBondResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS:
          serviceImpl.clearCurrentEraSnapShots((com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse>) responseObserver);
          break;
        case METHODID_SET_STAKING_REWARD_COMMISSION:
          serviceImpl.setStakingRewardCommission((com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse>) responseObserver);
          break;
        case METHODID_SET_PROTOCOL_FEE_RECEIVER:
          serviceImpl.setProtocolFeeReceiver((com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_UNBOND_RELAY_FEE:
          serviceImpl.setUnbondRelayFee((com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_UNBOND:
          serviceImpl.liquidityUnbond((com.stafihub.stafihub.ledger.MsgLiquidityUnbond) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse>) responseObserver);
          break;
        case METHODID_SET_UNBOND_COMMISSION:
          serviceImpl.setUnbondCommission((com.stafihub.stafihub.ledger.MsgSetUnbondCommission) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_SIGNATURE:
          serviceImpl.submitSignature((com.stafihub.stafihub.ledger.MsgSubmitSignature) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse>) responseObserver);
          break;
        case METHODID_SET_RPARAMS:
          serviceImpl.setRParams((com.stafihub.stafihub.ledger.MsgSetRParams) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRParamsResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE_RECEIVER:
          serviceImpl.setRelayFeeReceiver((com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_GAS_PRICE:
          serviceImpl.setRelayGasPrice((com.stafihub.stafihub.ledger.MsgSetRelayGasPrice) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse>) responseObserver);
          break;
        case METHODID_SET_ERA_SECONDS:
          serviceImpl.setEraSeconds((com.stafihub.stafihub.ledger.MsgSetEraSeconds) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse>) responseObserver);
          break;
        case METHODID_RM_BONDED_POOL:
          serviceImpl.rmBondedPool((com.stafihub.stafihub.ledger.MsgRmBondedPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_INIT:
          serviceImpl.migrateInit((com.stafihub.stafihub.ledger.MsgMigrateInit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateInitResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_UNBONDINGS:
          serviceImpl.migrateUnbondings((com.stafihub.stafihub.ledger.MsgMigrateUnbondings) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_UNBOND_SWITCH:
          serviceImpl.toggleUnbondSwitch((com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse>) responseObserver);
          break;
        case METHODID_UNSEAL_MIGRATE_INIT:
          serviceImpl.unsealMigrateInit((com.stafihub.stafihub.ledger.MsgUnsealMigrateInit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ICA_POOL:
          serviceImpl.registerIcaPool((com.stafihub.stafihub.ledger.MsgRegisterIcaPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse>) responseObserver);
          break;
        case METHODID_SET_WITHDRAWAL_ADDR:
          serviceImpl.setWithdrawalAddr((com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse>) responseObserver);
          break;
        case METHODID_INIT_POOL:
          serviceImpl.initPool((com.stafihub.stafihub.ledger.MsgInitPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgInitPoolResponse>) responseObserver);
          break;
        case METHODID_SET_POOL_STATUS:
          serviceImpl.setPoolStatus((com.stafihub.stafihub.ledger.MsgSetPoolStatus) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse>) responseObserver);
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
          getSetEraUnbondLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetEraUnbondLimit,
              com.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse>(
                service, METHODID_SET_ERA_UNBOND_LIMIT)))
        .addMethod(
          getSetPoolDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetPoolDetail,
              com.stafihub.stafihub.ledger.MsgSetPoolDetailResponse>(
                service, METHODID_SET_POOL_DETAIL)))
        .addMethod(
          getSetLeastBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetLeastBond,
              com.stafihub.stafihub.ledger.MsgSetLeastBondResponse>(
                service, METHODID_SET_LEAST_BOND)))
        .addMethod(
          getClearCurrentEraSnapShotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots,
              com.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse>(
                service, METHODID_CLEAR_CURRENT_ERA_SNAP_SHOTS)))
        .addMethod(
          getSetStakingRewardCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetStakingRewardCommission,
              com.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse>(
                service, METHODID_SET_STAKING_REWARD_COMMISSION)))
        .addMethod(
          getSetProtocolFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver,
              com.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse>(
                service, METHODID_SET_PROTOCOL_FEE_RECEIVER)))
        .addMethod(
          getSetUnbondRelayFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetUnbondRelayFee,
              com.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse>(
                service, METHODID_SET_UNBOND_RELAY_FEE)))
        .addMethod(
          getLiquidityUnbondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgLiquidityUnbond,
              com.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse>(
                service, METHODID_LIQUIDITY_UNBOND)))
        .addMethod(
          getSetUnbondCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetUnbondCommission,
              com.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse>(
                service, METHODID_SET_UNBOND_COMMISSION)))
        .addMethod(
          getSubmitSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSubmitSignature,
              com.stafihub.stafihub.ledger.MsgSubmitSignatureResponse>(
                service, METHODID_SUBMIT_SIGNATURE)))
        .addMethod(
          getSetRParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetRParams,
              com.stafihub.stafihub.ledger.MsgSetRParamsResponse>(
                service, METHODID_SET_RPARAMS)))
        .addMethod(
          getSetRelayFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver,
              com.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse>(
                service, METHODID_SET_RELAY_FEE_RECEIVER)))
        .addMethod(
          getSetRelayGasPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetRelayGasPrice,
              com.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse>(
                service, METHODID_SET_RELAY_GAS_PRICE)))
        .addMethod(
          getSetEraSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetEraSeconds,
              com.stafihub.stafihub.ledger.MsgSetEraSecondsResponse>(
                service, METHODID_SET_ERA_SECONDS)))
        .addMethod(
          getRmBondedPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgRmBondedPool,
              com.stafihub.stafihub.ledger.MsgRmBondedPoolResponse>(
                service, METHODID_RM_BONDED_POOL)))
        .addMethod(
          getMigrateInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgMigrateInit,
              com.stafihub.stafihub.ledger.MsgMigrateInitResponse>(
                service, METHODID_MIGRATE_INIT)))
        .addMethod(
          getMigrateUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgMigrateUnbondings,
              com.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse>(
                service, METHODID_MIGRATE_UNBONDINGS)))
        .addMethod(
          getToggleUnbondSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgToggleUnbondSwitch,
              com.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse>(
                service, METHODID_TOGGLE_UNBOND_SWITCH)))
        .addMethod(
          getUnsealMigrateInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgUnsealMigrateInit,
              com.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse>(
                service, METHODID_UNSEAL_MIGRATE_INIT)))
        .addMethod(
          getRegisterIcaPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgRegisterIcaPool,
              com.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse>(
                service, METHODID_REGISTER_ICA_POOL)))
        .addMethod(
          getSetWithdrawalAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetWithdrawalAddr,
              com.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse>(
                service, METHODID_SET_WITHDRAWAL_ADDR)))
        .addMethod(
          getInitPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgInitPool,
              com.stafihub.stafihub.ledger.MsgInitPoolResponse>(
                service, METHODID_INIT_POOL)))
        .addMethod(
          getSetPoolStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.MsgSetPoolStatus,
              com.stafihub.stafihub.ledger.MsgSetPoolStatusResponse>(
                service, METHODID_SET_POOL_STATUS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.ledger.TxProto.getDescriptor();
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
              .addMethod(getSetEraUnbondLimitMethod())
              .addMethod(getSetPoolDetailMethod())
              .addMethod(getSetLeastBondMethod())
              .addMethod(getClearCurrentEraSnapShotsMethod())
              .addMethod(getSetStakingRewardCommissionMethod())
              .addMethod(getSetProtocolFeeReceiverMethod())
              .addMethod(getSetUnbondRelayFeeMethod())
              .addMethod(getLiquidityUnbondMethod())
              .addMethod(getSetUnbondCommissionMethod())
              .addMethod(getSubmitSignatureMethod())
              .addMethod(getSetRParamsMethod())
              .addMethod(getSetRelayFeeReceiverMethod())
              .addMethod(getSetRelayGasPriceMethod())
              .addMethod(getSetEraSecondsMethod())
              .addMethod(getRmBondedPoolMethod())
              .addMethod(getMigrateInitMethod())
              .addMethod(getMigrateUnbondingsMethod())
              .addMethod(getToggleUnbondSwitchMethod())
              .addMethod(getUnsealMigrateInitMethod())
              .addMethod(getRegisterIcaPoolMethod())
              .addMethod(getSetWithdrawalAddrMethod())
              .addMethod(getInitPoolMethod())
              .addMethod(getSetPoolStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
