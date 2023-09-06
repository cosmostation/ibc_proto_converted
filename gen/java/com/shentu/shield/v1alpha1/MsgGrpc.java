package com.shentu.shield.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the shield Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: shentu/shield/v1alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "shentu.shield.v1alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgCreatePool,
      com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgCreatePool.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgCreatePool,
      com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgCreatePool, com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgCreatePool, com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool,
      com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> getUpdatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePool",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool,
      com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> getUpdatePoolMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool, com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> getUpdatePoolMethod;
    if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
          MsgGrpc.getUpdatePoolMethod = getUpdatePoolMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool, com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePool"))
              .build();
        }
      }
    }
    return getUpdatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPausePool,
      com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> getPausePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PausePool",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgPausePool.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPausePool,
      com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> getPausePoolMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPausePool, com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> getPausePoolMethod;
    if ((getPausePoolMethod = MsgGrpc.getPausePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPausePoolMethod = MsgGrpc.getPausePoolMethod) == null) {
          MsgGrpc.getPausePoolMethod = getPausePoolMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgPausePool, com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PausePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgPausePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PausePool"))
              .build();
        }
      }
    }
    return getPausePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgResumePool,
      com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> getResumePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumePool",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgResumePool.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgResumePool,
      com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> getResumePoolMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgResumePool, com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> getResumePoolMethod;
    if ((getResumePoolMethod = MsgGrpc.getResumePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getResumePoolMethod = MsgGrpc.getResumePoolMethod) == null) {
          MsgGrpc.getResumePoolMethod = getResumePoolMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgResumePool, com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgResumePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ResumePool"))
              .build();
        }
      }
    }
    return getResumePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral,
      com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> getDepositCollateralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositCollateral",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral,
      com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> getDepositCollateralMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral, com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> getDepositCollateralMethod;
    if ((getDepositCollateralMethod = MsgGrpc.getDepositCollateralMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositCollateralMethod = MsgGrpc.getDepositCollateralMethod) == null) {
          MsgGrpc.getDepositCollateralMethod = getDepositCollateralMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral, com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositCollateral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositCollateral"))
              .build();
        }
      }
    }
    return getDepositCollateralMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> getWithdrawCollateralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawCollateral",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> getWithdrawCollateralMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> getWithdrawCollateralMethod;
    if ((getWithdrawCollateralMethod = MsgGrpc.getWithdrawCollateralMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawCollateralMethod = MsgGrpc.getWithdrawCollateralMethod) == null) {
          MsgGrpc.getWithdrawCollateralMethod = getWithdrawCollateralMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawCollateral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawCollateral"))
              .build();
        }
      }
    }
    return getWithdrawCollateralMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewards",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;
    if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
          MsgGrpc.getWithdrawRewardsMethod = getWithdrawRewardsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewards"))
              .build();
        }
      }
    }
    return getWithdrawRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> getWithdrawForeignRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawForeignRewards",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> getWithdrawForeignRewardsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> getWithdrawForeignRewardsMethod;
    if ((getWithdrawForeignRewardsMethod = MsgGrpc.getWithdrawForeignRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawForeignRewardsMethod = MsgGrpc.getWithdrawForeignRewardsMethod) == null) {
          MsgGrpc.getWithdrawForeignRewardsMethod = getWithdrawForeignRewardsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawForeignRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawForeignRewards"))
              .build();
        }
      }
    }
    return getWithdrawForeignRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield,
      com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> getPurchaseShieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseShield",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield,
      com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> getPurchaseShieldMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield, com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> getPurchaseShieldMethod;
    if ((getPurchaseShieldMethod = MsgGrpc.getPurchaseShieldMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPurchaseShieldMethod = MsgGrpc.getPurchaseShieldMethod) == null) {
          MsgGrpc.getPurchaseShieldMethod = getPurchaseShieldMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield, com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PurchaseShield"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PurchaseShield"))
              .build();
        }
      }
    }
    return getPurchaseShieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> getWithdrawReimbursementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawReimbursement",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement,
      com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> getWithdrawReimbursementMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> getWithdrawReimbursementMethod;
    if ((getWithdrawReimbursementMethod = MsgGrpc.getWithdrawReimbursementMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawReimbursementMethod = MsgGrpc.getWithdrawReimbursementMethod) == null) {
          MsgGrpc.getWithdrawReimbursementMethod = getWithdrawReimbursementMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement, com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawReimbursement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawReimbursement"))
              .build();
        }
      }
    }
    return getWithdrawReimbursementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor,
      com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> getUpdateSponsorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSponsor",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor,
      com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> getUpdateSponsorMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor, com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> getUpdateSponsorMethod;
    if ((getUpdateSponsorMethod = MsgGrpc.getUpdateSponsorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateSponsorMethod = MsgGrpc.getUpdateSponsorMethod) == null) {
          MsgGrpc.getUpdateSponsorMethod = getUpdateSponsorMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor, com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSponsor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateSponsor"))
              .build();
        }
      }
    }
    return getUpdateSponsorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield,
      com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> getStakeForShieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeForShield",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield,
      com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> getStakeForShieldMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield, com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> getStakeForShieldMethod;
    if ((getStakeForShieldMethod = MsgGrpc.getStakeForShieldMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeForShieldMethod = MsgGrpc.getStakeForShieldMethod) == null) {
          MsgGrpc.getStakeForShieldMethod = getStakeForShieldMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield, com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeForShield"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StakeForShield"))
              .build();
        }
      }
    }
    return getStakeForShieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield,
      com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> getUnstakeFromShieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnstakeFromShield",
      requestType = com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield.class,
      responseType = com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield,
      com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> getUnstakeFromShieldMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield, com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> getUnstakeFromShieldMethod;
    if ((getUnstakeFromShieldMethod = MsgGrpc.getUnstakeFromShieldMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnstakeFromShieldMethod = MsgGrpc.getUnstakeFromShieldMethod) == null) {
          MsgGrpc.getUnstakeFromShieldMethod = getUnstakeFromShieldMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield, com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnstakeFromShield"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnstakeFromShield"))
              .build();
        }
      }
    }
    return getUnstakeFromShieldMethod;
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
   * Msg defines the shield Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createPool(com.shentu.shield.v1alpha1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     */
    default void updatePool(com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePoolMethod(), responseObserver);
    }

    /**
     */
    default void pausePool(com.shentu.shield.v1alpha1.TxProto.MsgPausePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPausePoolMethod(), responseObserver);
    }

    /**
     */
    default void resumePool(com.shentu.shield.v1alpha1.TxProto.MsgResumePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumePoolMethod(), responseObserver);
    }

    /**
     */
    default void depositCollateral(com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositCollateralMethod(), responseObserver);
    }

    /**
     */
    default void withdrawCollateral(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawCollateralMethod(), responseObserver);
    }

    /**
     */
    default void withdrawRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRewardsMethod(), responseObserver);
    }

    /**
     */
    default void withdrawForeignRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawForeignRewardsMethod(), responseObserver);
    }

    /**
     */
    default void purchaseShield(com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseShieldMethod(), responseObserver);
    }

    /**
     */
    default void withdrawReimbursement(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawReimbursementMethod(), responseObserver);
    }

    /**
     */
    default void updateSponsor(com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSponsorMethod(), responseObserver);
    }

    /**
     */
    default void stakeForShield(com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeForShieldMethod(), responseObserver);
    }

    /**
     */
    default void unstakeFromShield(com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnstakeFromShieldMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
   * Msg defines the shield Msg service.
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
    public void createPool(com.shentu.shield.v1alpha1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePool(com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pausePool(com.shentu.shield.v1alpha1.TxProto.MsgPausePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPausePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resumePool(com.shentu.shield.v1alpha1.TxProto.MsgResumePool request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void depositCollateral(com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositCollateralMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawCollateral(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawCollateralMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawForeignRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawForeignRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchaseShield(com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseShieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawReimbursement(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawReimbursementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSponsor(com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSponsorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stakeForShield(com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeForShieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unstakeFromShield(com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnstakeFromShieldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse createPool(com.shentu.shield.v1alpha1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse updatePool(com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse pausePool(com.shentu.shield.v1alpha1.TxProto.MsgPausePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPausePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse resumePool(com.shentu.shield.v1alpha1.TxProto.MsgResumePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse depositCollateral(com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositCollateralMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse withdrawCollateral(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawCollateralMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse withdrawRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse withdrawForeignRewards(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawForeignRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse purchaseShield(com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseShieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse withdrawReimbursement(com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawReimbursementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse updateSponsor(com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSponsorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse stakeForShield(com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeForShieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse unstakeFromShield(com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnstakeFromShieldMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse> createPool(
        com.shentu.shield.v1alpha1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse> updatePool(
        com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse> pausePool(
        com.shentu.shield.v1alpha1.TxProto.MsgPausePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPausePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse> resumePool(
        com.shentu.shield.v1alpha1.TxProto.MsgResumePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse> depositCollateral(
        com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositCollateralMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse> withdrawCollateral(
        com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawCollateralMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse> withdrawRewards(
        com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse> withdrawForeignRewards(
        com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawForeignRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse> purchaseShield(
        com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseShieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse> withdrawReimbursement(
        com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawReimbursementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse> updateSponsor(
        com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSponsorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse> stakeForShield(
        com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeForShieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse> unstakeFromShield(
        com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnstakeFromShieldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POOL = 0;
  private static final int METHODID_UPDATE_POOL = 1;
  private static final int METHODID_PAUSE_POOL = 2;
  private static final int METHODID_RESUME_POOL = 3;
  private static final int METHODID_DEPOSIT_COLLATERAL = 4;
  private static final int METHODID_WITHDRAW_COLLATERAL = 5;
  private static final int METHODID_WITHDRAW_REWARDS = 6;
  private static final int METHODID_WITHDRAW_FOREIGN_REWARDS = 7;
  private static final int METHODID_PURCHASE_SHIELD = 8;
  private static final int METHODID_WITHDRAW_REIMBURSEMENT = 9;
  private static final int METHODID_UPDATE_SPONSOR = 10;
  private static final int METHODID_STAKE_FOR_SHIELD = 11;
  private static final int METHODID_UNSTAKE_FROM_SHIELD = 12;

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
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.shentu.shield.v1alpha1.TxProto.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POOL:
          serviceImpl.updatePool((com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse>) responseObserver);
          break;
        case METHODID_PAUSE_POOL:
          serviceImpl.pausePool((com.shentu.shield.v1alpha1.TxProto.MsgPausePool) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse>) responseObserver);
          break;
        case METHODID_RESUME_POOL:
          serviceImpl.resumePool((com.shentu.shield.v1alpha1.TxProto.MsgResumePool) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_COLLATERAL:
          serviceImpl.depositCollateral((com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_COLLATERAL:
          serviceImpl.withdrawCollateral((com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARDS:
          serviceImpl.withdrawRewards((com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_FOREIGN_REWARDS:
          serviceImpl.withdrawForeignRewards((com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse>) responseObserver);
          break;
        case METHODID_PURCHASE_SHIELD:
          serviceImpl.purchaseShield((com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REIMBURSEMENT:
          serviceImpl.withdrawReimbursement((com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SPONSOR:
          serviceImpl.updateSponsor((com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse>) responseObserver);
          break;
        case METHODID_STAKE_FOR_SHIELD:
          serviceImpl.stakeForShield((com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse>) responseObserver);
          break;
        case METHODID_UNSTAKE_FROM_SHIELD:
          serviceImpl.unstakeFromShield((com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse>) responseObserver);
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
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgCreatePool,
              com.shentu.shield.v1alpha1.TxProto.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getUpdatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgUpdatePool,
              com.shentu.shield.v1alpha1.TxProto.MsgUpdatePoolResponse>(
                service, METHODID_UPDATE_POOL)))
        .addMethod(
          getPausePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgPausePool,
              com.shentu.shield.v1alpha1.TxProto.MsgPausePoolResponse>(
                service, METHODID_PAUSE_POOL)))
        .addMethod(
          getResumePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgResumePool,
              com.shentu.shield.v1alpha1.TxProto.MsgResumePoolResponse>(
                service, METHODID_RESUME_POOL)))
        .addMethod(
          getDepositCollateralMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateral,
              com.shentu.shield.v1alpha1.TxProto.MsgDepositCollateralResponse>(
                service, METHODID_DEPOSIT_COLLATERAL)))
        .addMethod(
          getWithdrawCollateralMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateral,
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawCollateralResponse>(
                service, METHODID_WITHDRAW_COLLATERAL)))
        .addMethod(
          getWithdrawRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewards,
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawRewardsResponse>(
                service, METHODID_WITHDRAW_REWARDS)))
        .addMethod(
          getWithdrawForeignRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewards,
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawForeignRewardsResponse>(
                service, METHODID_WITHDRAW_FOREIGN_REWARDS)))
        .addMethod(
          getPurchaseShieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShield,
              com.shentu.shield.v1alpha1.TxProto.MsgPurchaseShieldResponse>(
                service, METHODID_PURCHASE_SHIELD)))
        .addMethod(
          getWithdrawReimbursementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursement,
              com.shentu.shield.v1alpha1.TxProto.MsgWithdrawReimbursementResponse>(
                service, METHODID_WITHDRAW_REIMBURSEMENT)))
        .addMethod(
          getUpdateSponsorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsor,
              com.shentu.shield.v1alpha1.TxProto.MsgUpdateSponsorResponse>(
                service, METHODID_UPDATE_SPONSOR)))
        .addMethod(
          getStakeForShieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgStakeForShield,
              com.shentu.shield.v1alpha1.TxProto.MsgStakeForShieldResponse>(
                service, METHODID_STAKE_FOR_SHIELD)))
        .addMethod(
          getUnstakeFromShieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShield,
              com.shentu.shield.v1alpha1.TxProto.MsgUnstakeFromShieldResponse>(
                service, METHODID_UNSTAKE_FROM_SHIELD)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.shield.v1alpha1.TxProto.getDescriptor();
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
              .addMethod(getCreatePoolMethod())
              .addMethod(getUpdatePoolMethod())
              .addMethod(getPausePoolMethod())
              .addMethod(getResumePoolMethod())
              .addMethod(getDepositCollateralMethod())
              .addMethod(getWithdrawCollateralMethod())
              .addMethod(getWithdrawRewardsMethod())
              .addMethod(getWithdrawForeignRewardsMethod())
              .addMethod(getPurchaseShieldMethod())
              .addMethod(getWithdrawReimbursementMethod())
              .addMethod(getUpdateSponsorMethod())
              .addMethod(getStakeForShieldMethod())
              .addMethod(getUnstakeFromShieldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
