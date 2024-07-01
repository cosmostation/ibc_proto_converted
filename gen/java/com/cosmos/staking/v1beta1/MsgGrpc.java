package com.cosmos.staking.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/staking/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.staking.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> getCreateValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateValidator",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> getCreateValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator, com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> getCreateValidatorMethod;
    if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
          MsgGrpc.getCreateValidatorMethod = getCreateValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator, com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateValidator"))
              .build();
        }
      }
    }
    return getCreateValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEditValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> getEditValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditValidator",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgEditValidator.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEditValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> getEditValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEditValidator, com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> getEditValidatorMethod;
    if ((getEditValidatorMethod = MsgGrpc.getEditValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditValidatorMethod = MsgGrpc.getEditValidatorMethod) == null) {
          MsgGrpc.getEditValidatorMethod = getEditValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgEditValidator, com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgEditValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditValidator"))
              .build();
        }
      }
    }
    return getEditValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgDelegate.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDelegate, com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgDelegate, com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> getBeginRedelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginRedelegate",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> getBeginRedelegateMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate, com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> getBeginRedelegateMethod;
    if ((getBeginRedelegateMethod = MsgGrpc.getBeginRedelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBeginRedelegateMethod = MsgGrpc.getBeginRedelegateMethod) == null) {
          MsgGrpc.getBeginRedelegateMethod = getBeginRedelegateMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate, com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginRedelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BeginRedelegate"))
              .build();
        }
      }
    }
    return getBeginRedelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUndelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgUndelegate.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUndelegate,
      com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUndelegate, com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgUndelegate, com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation,
      com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelUnbondingDelegation",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation,
      com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation, com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod;
    if ((getCancelUnbondingDelegationMethod = MsgGrpc.getCancelUnbondingDelegationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelUnbondingDelegationMethod = MsgGrpc.getCancelUnbondingDelegationMethod) == null) {
          MsgGrpc.getCancelUnbondingDelegationMethod = getCancelUnbondingDelegationMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation, com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelUnbondingDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelUnbondingDelegation"))
              .build();
        }
      }
    }
    return getCancelUnbondingDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams,
      com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams,
      com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams, com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams, com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> getUnbondValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondValidator",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator,
      com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> getUnbondValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator, com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> getUnbondValidatorMethod;
    if ((getUnbondValidatorMethod = MsgGrpc.getUnbondValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnbondValidatorMethod = MsgGrpc.getUnbondValidatorMethod) == null) {
          MsgGrpc.getUnbondValidatorMethod = getUnbondValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator, com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnbondValidator"))
              .build();
        }
      }
    }
    return getUnbondValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> getTokenizeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenizeShares",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> getTokenizeSharesMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> getTokenizeSharesMethod;
    if ((getTokenizeSharesMethod = MsgGrpc.getTokenizeSharesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTokenizeSharesMethod = MsgGrpc.getTokenizeSharesMethod) == null) {
          MsgGrpc.getTokenizeSharesMethod = getTokenizeSharesMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenizeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TokenizeShares"))
              .build();
        }
      }
    }
    return getTokenizeSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares,
      com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> getRedeemTokensForSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedeemTokensForShares",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares,
      com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> getRedeemTokensForSharesMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares, com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> getRedeemTokensForSharesMethod;
    if ((getRedeemTokensForSharesMethod = MsgGrpc.getRedeemTokensForSharesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemTokensForSharesMethod = MsgGrpc.getRedeemTokensForSharesMethod) == null) {
          MsgGrpc.getRedeemTokensForSharesMethod = getRedeemTokensForSharesMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares, com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedeemTokensForShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RedeemTokensForShares"))
              .build();
        }
      }
    }
    return getRedeemTokensForSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord,
      com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> getTransferTokenizeShareRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferTokenizeShareRecord",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord,
      com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> getTransferTokenizeShareRecordMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord, com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> getTransferTokenizeShareRecordMethod;
    if ((getTransferTokenizeShareRecordMethod = MsgGrpc.getTransferTokenizeShareRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferTokenizeShareRecordMethod = MsgGrpc.getTransferTokenizeShareRecordMethod) == null) {
          MsgGrpc.getTransferTokenizeShareRecordMethod = getTransferTokenizeShareRecordMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord, com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferTokenizeShareRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferTokenizeShareRecord"))
              .build();
        }
      }
    }
    return getTransferTokenizeShareRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> getDisableTokenizeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableTokenizeShares",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> getDisableTokenizeSharesMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> getDisableTokenizeSharesMethod;
    if ((getDisableTokenizeSharesMethod = MsgGrpc.getDisableTokenizeSharesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisableTokenizeSharesMethod = MsgGrpc.getDisableTokenizeSharesMethod) == null) {
          MsgGrpc.getDisableTokenizeSharesMethod = getDisableTokenizeSharesMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableTokenizeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisableTokenizeShares"))
              .build();
        }
      }
    }
    return getDisableTokenizeSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> getEnableTokenizeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableTokenizeShares",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares,
      com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> getEnableTokenizeSharesMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> getEnableTokenizeSharesMethod;
    if ((getEnableTokenizeSharesMethod = MsgGrpc.getEnableTokenizeSharesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnableTokenizeSharesMethod = MsgGrpc.getEnableTokenizeSharesMethod) == null) {
          MsgGrpc.getEnableTokenizeSharesMethod = getEnableTokenizeSharesMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares, com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableTokenizeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnableTokenizeShares"))
              .build();
        }
      }
    }
    return getEnableTokenizeSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond,
      com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> getValidatorBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorBond",
      requestType = com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond.class,
      responseType = com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond,
      com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> getValidatorBondMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond, com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> getValidatorBondMethod;
    if ((getValidatorBondMethod = MsgGrpc.getValidatorBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getValidatorBondMethod = MsgGrpc.getValidatorBondMethod) == null) {
          MsgGrpc.getValidatorBondMethod = getValidatorBondMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond, com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ValidatorBond"))
              .build();
        }
      }
    }
    return getValidatorBondMethod;
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    default void createValidator(com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    default void editValidator(com.cosmos.staking.v1beta1.TxProto.MsgEditValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    default void delegate(com.cosmos.staking.v1beta1.TxProto.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    default void beginRedelegate(com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginRedelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    default void undelegate(com.cosmos.staking.v1beta1.TxProto.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    default void cancelUnbondingDelegation(com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelUnbondingDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondValidator defines a method for performing the status transition for a validator
     * from bonded to unbonding
     * This allows a validator to stop their services and jail themselves without
     * experiencing a slash
     * </pre>
     */
    default void unbondValidator(com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * TokenizeShares defines a method for tokenizing shares from a validator.
     * </pre>
     */
    default void tokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenizeSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RedeemTokensForShares defines a method for redeeming tokens from a validator for
     * shares.
     * </pre>
     */
    default void redeemTokensForShares(com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeemTokensForSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferTokenizeShareRecord defines a method to transfer ownership of
     * TokenizeShareRecord
     * </pre>
     */
    default void transferTokenizeShareRecord(com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferTokenizeShareRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableTokenizeShares defines a method to prevent the tokenization of an addresses stake
     * </pre>
     */
    default void disableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableTokenizeSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableTokenizeShares defines a method to re-enable the tokenization of an addresseses stake
     * after it has been disabled
     * </pre>
     */
    default void enableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableTokenizeSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorBond defines a method for performing a validator self-bond
     * </pre>
     */
    default void validatorBond(com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorBondMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public void createValidator(com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public void editValidator(com.cosmos.staking.v1beta1.TxProto.MsgEditValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public void delegate(com.cosmos.staking.v1beta1.TxProto.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public void beginRedelegate(com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginRedelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public void undelegate(com.cosmos.staking.v1beta1.TxProto.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void cancelUnbondingDelegation(com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelUnbondingDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondValidator defines a method for performing the status transition for a validator
     * from bonded to unbonding
     * This allows a validator to stop their services and jail themselves without
     * experiencing a slash
     * </pre>
     */
    public void unbondValidator(com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TokenizeShares defines a method for tokenizing shares from a validator.
     * </pre>
     */
    public void tokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenizeSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RedeemTokensForShares defines a method for redeeming tokens from a validator for
     * shares.
     * </pre>
     */
    public void redeemTokensForShares(com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeemTokensForSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferTokenizeShareRecord defines a method to transfer ownership of
     * TokenizeShareRecord
     * </pre>
     */
    public void transferTokenizeShareRecord(com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferTokenizeShareRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableTokenizeShares defines a method to prevent the tokenization of an addresses stake
     * </pre>
     */
    public void disableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableTokenizeSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableTokenizeShares defines a method to re-enable the tokenization of an addresseses stake
     * after it has been disabled
     * </pre>
     */
    public void enableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableTokenizeSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorBond defines a method for performing a validator self-bond
     * </pre>
     */
    public void validatorBond(com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorBondMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse createValidator(com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse editValidator(com.cosmos.staking.v1beta1.TxProto.MsgEditValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse delegate(com.cosmos.staking.v1beta1.TxProto.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse beginRedelegate(com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginRedelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse undelegate(com.cosmos.staking.v1beta1.TxProto.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse cancelUnbondingDelegation(com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelUnbondingDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse updateParams(com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondValidator defines a method for performing the status transition for a validator
     * from bonded to unbonding
     * This allows a validator to stop their services and jail themselves without
     * experiencing a slash
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse unbondValidator(com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TokenizeShares defines a method for tokenizing shares from a validator.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse tokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenizeSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RedeemTokensForShares defines a method for redeeming tokens from a validator for
     * shares.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse redeemTokensForShares(com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeemTokensForSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferTokenizeShareRecord defines a method to transfer ownership of
     * TokenizeShareRecord
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse transferTokenizeShareRecord(com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferTokenizeShareRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableTokenizeShares defines a method to prevent the tokenization of an addresses stake
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse disableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableTokenizeSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableTokenizeShares defines a method to re-enable the tokenization of an addresseses stake
     * after it has been disabled
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse enableTokenizeShares(com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableTokenizeSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorBond defines a method for performing a validator self-bond
     * </pre>
     */
    public com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse validatorBond(com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorBondMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse> createValidator(
        com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse> editValidator(
        com.cosmos.staking.v1beta1.TxProto.MsgEditValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse> delegate(
        com.cosmos.staking.v1beta1.TxProto.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse> beginRedelegate(
        com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginRedelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse> undelegate(
        com.cosmos.staking.v1beta1.TxProto.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse> cancelUnbondingDelegation(
        com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelUnbondingDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondValidator defines a method for performing the status transition for a validator
     * from bonded to unbonding
     * This allows a validator to stop their services and jail themselves without
     * experiencing a slash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse> unbondValidator(
        com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TokenizeShares defines a method for tokenizing shares from a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse> tokenizeShares(
        com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenizeSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RedeemTokensForShares defines a method for redeeming tokens from a validator for
     * shares.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse> redeemTokensForShares(
        com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeemTokensForSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferTokenizeShareRecord defines a method to transfer ownership of
     * TokenizeShareRecord
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse> transferTokenizeShareRecord(
        com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferTokenizeShareRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableTokenizeShares defines a method to prevent the tokenization of an addresses stake
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse> disableTokenizeShares(
        com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableTokenizeSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableTokenizeShares defines a method to re-enable the tokenization of an addresseses stake
     * after it has been disabled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse> enableTokenizeShares(
        com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableTokenizeSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorBond defines a method for performing a validator self-bond
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse> validatorBond(
        com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorBondMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VALIDATOR = 0;
  private static final int METHODID_EDIT_VALIDATOR = 1;
  private static final int METHODID_DELEGATE = 2;
  private static final int METHODID_BEGIN_REDELEGATE = 3;
  private static final int METHODID_UNDELEGATE = 4;
  private static final int METHODID_CANCEL_UNBONDING_DELEGATION = 5;
  private static final int METHODID_UPDATE_PARAMS = 6;
  private static final int METHODID_UNBOND_VALIDATOR = 7;
  private static final int METHODID_TOKENIZE_SHARES = 8;
  private static final int METHODID_REDEEM_TOKENS_FOR_SHARES = 9;
  private static final int METHODID_TRANSFER_TOKENIZE_SHARE_RECORD = 10;
  private static final int METHODID_DISABLE_TOKENIZE_SHARES = 11;
  private static final int METHODID_ENABLE_TOKENIZE_SHARES = 12;
  private static final int METHODID_VALIDATOR_BOND = 13;

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
        case METHODID_CREATE_VALIDATOR:
          serviceImpl.createValidator((com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse>) responseObserver);
          break;
        case METHODID_EDIT_VALIDATOR:
          serviceImpl.editValidator((com.cosmos.staking.v1beta1.TxProto.MsgEditValidator) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse>) responseObserver);
          break;
        case METHODID_DELEGATE:
          serviceImpl.delegate((com.cosmos.staking.v1beta1.TxProto.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_BEGIN_REDELEGATE:
          serviceImpl.beginRedelegate((com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((com.cosmos.staking.v1beta1.TxProto.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse>) responseObserver);
          break;
        case METHODID_CANCEL_UNBONDING_DELEGATION:
          serviceImpl.cancelUnbondingDelegation((com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_UNBOND_VALIDATOR:
          serviceImpl.unbondValidator((com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse>) responseObserver);
          break;
        case METHODID_TOKENIZE_SHARES:
          serviceImpl.tokenizeShares((com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse>) responseObserver);
          break;
        case METHODID_REDEEM_TOKENS_FOR_SHARES:
          serviceImpl.redeemTokensForShares((com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TOKENIZE_SHARE_RECORD:
          serviceImpl.transferTokenizeShareRecord((com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse>) responseObserver);
          break;
        case METHODID_DISABLE_TOKENIZE_SHARES:
          serviceImpl.disableTokenizeShares((com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse>) responseObserver);
          break;
        case METHODID_ENABLE_TOKENIZE_SHARES:
          serviceImpl.enableTokenizeShares((com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_BOND:
          serviceImpl.validatorBond((com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse>) responseObserver);
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
          getCreateValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgCreateValidator,
              com.cosmos.staking.v1beta1.TxProto.MsgCreateValidatorResponse>(
                service, METHODID_CREATE_VALIDATOR)))
        .addMethod(
          getEditValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgEditValidator,
              com.cosmos.staking.v1beta1.TxProto.MsgEditValidatorResponse>(
                service, METHODID_EDIT_VALIDATOR)))
        .addMethod(
          getDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgDelegate,
              com.cosmos.staking.v1beta1.TxProto.MsgDelegateResponse>(
                service, METHODID_DELEGATE)))
        .addMethod(
          getBeginRedelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegate,
              com.cosmos.staking.v1beta1.TxProto.MsgBeginRedelegateResponse>(
                service, METHODID_BEGIN_REDELEGATE)))
        .addMethod(
          getUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgUndelegate,
              com.cosmos.staking.v1beta1.TxProto.MsgUndelegateResponse>(
                service, METHODID_UNDELEGATE)))
        .addMethod(
          getCancelUnbondingDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegation,
              com.cosmos.staking.v1beta1.TxProto.MsgCancelUnbondingDelegationResponse>(
                service, METHODID_CANCEL_UNBONDING_DELEGATION)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgUpdateParams,
              com.cosmos.staking.v1beta1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getUnbondValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidator,
              com.cosmos.staking.v1beta1.TxProto.MsgUnbondValidatorResponse>(
                service, METHODID_UNBOND_VALIDATOR)))
        .addMethod(
          getTokenizeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgTokenizeShares,
              com.cosmos.staking.v1beta1.TxProto.MsgTokenizeSharesResponse>(
                service, METHODID_TOKENIZE_SHARES)))
        .addMethod(
          getRedeemTokensForSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForShares,
              com.cosmos.staking.v1beta1.TxProto.MsgRedeemTokensForSharesResponse>(
                service, METHODID_REDEEM_TOKENS_FOR_SHARES)))
        .addMethod(
          getTransferTokenizeShareRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecord,
              com.cosmos.staking.v1beta1.TxProto.MsgTransferTokenizeShareRecordResponse>(
                service, METHODID_TRANSFER_TOKENIZE_SHARE_RECORD)))
        .addMethod(
          getDisableTokenizeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeShares,
              com.cosmos.staking.v1beta1.TxProto.MsgDisableTokenizeSharesResponse>(
                service, METHODID_DISABLE_TOKENIZE_SHARES)))
        .addMethod(
          getEnableTokenizeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeShares,
              com.cosmos.staking.v1beta1.TxProto.MsgEnableTokenizeSharesResponse>(
                service, METHODID_ENABLE_TOKENIZE_SHARES)))
        .addMethod(
          getValidatorBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.TxProto.MsgValidatorBond,
              com.cosmos.staking.v1beta1.TxProto.MsgValidatorBondResponse>(
                service, METHODID_VALIDATOR_BOND)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.staking.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateValidatorMethod())
              .addMethod(getEditValidatorMethod())
              .addMethod(getDelegateMethod())
              .addMethod(getBeginRedelegateMethod())
              .addMethod(getUndelegateMethod())
              .addMethod(getCancelUnbondingDelegationMethod())
              .addMethod(getUpdateParamsMethod())
              .addMethod(getUnbondValidatorMethod())
              .addMethod(getTokenizeSharesMethod())
              .addMethod(getRedeemTokensForSharesMethod())
              .addMethod(getTransferTokenizeShareRecordMethod())
              .addMethod(getDisableTokenizeSharesMethod())
              .addMethod(getEnableTokenizeSharesMethod())
              .addMethod(getValidatorBondMethod())
              .build();
        }
      }
    }
    return result;
  }
}
