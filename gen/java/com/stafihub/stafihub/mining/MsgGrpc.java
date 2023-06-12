package com.stafihub.stafihub.mining;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/mining/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.mining.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakePool,
      com.stafihub.stafihub.mining.MsgAddStakePoolResponse> getAddStakePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakePool",
      requestType = com.stafihub.stafihub.mining.MsgAddStakePool.class,
      responseType = com.stafihub.stafihub.mining.MsgAddStakePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakePool,
      com.stafihub.stafihub.mining.MsgAddStakePoolResponse> getAddStakePoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakePool, com.stafihub.stafihub.mining.MsgAddStakePoolResponse> getAddStakePoolMethod;
    if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
          MsgGrpc.getAddStakePoolMethod = getAddStakePoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddStakePool, com.stafihub.stafihub.mining.MsgAddStakePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakePool"))
              .build();
        }
      }
    }
    return getAddStakePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeItem,
      com.stafihub.stafihub.mining.MsgAddStakeItemResponse> getAddStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeItem",
      requestType = com.stafihub.stafihub.mining.MsgAddStakeItem.class,
      responseType = com.stafihub.stafihub.mining.MsgAddStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeItem,
      com.stafihub.stafihub.mining.MsgAddStakeItemResponse> getAddStakeItemMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeItem, com.stafihub.stafihub.mining.MsgAddStakeItemResponse> getAddStakeItemMethod;
    if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
          MsgGrpc.getAddStakeItemMethod = getAddStakeItemMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddStakeItem, com.stafihub.stafihub.mining.MsgAddStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeItem"))
              .build();
        }
      }
    }
    return getAddStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardPool,
      com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> getAddRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardPool",
      requestType = com.stafihub.stafihub.mining.MsgAddRewardPool.class,
      responseType = com.stafihub.stafihub.mining.MsgAddRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardPool,
      com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> getAddRewardPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardPool, com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> getAddRewardPoolMethod;
    if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
          MsgGrpc.getAddRewardPoolMethod = getAddRewardPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddRewardPool, com.stafihub.stafihub.mining.MsgAddRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardPool"))
              .build();
        }
      }
    }
    return getAddRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgStake,
      com.stafihub.stafihub.mining.MsgStakeResponse> getStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stake",
      requestType = com.stafihub.stafihub.mining.MsgStake.class,
      responseType = com.stafihub.stafihub.mining.MsgStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgStake,
      com.stafihub.stafihub.mining.MsgStakeResponse> getStakeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgStake, com.stafihub.stafihub.mining.MsgStakeResponse> getStakeMethod;
    if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
          MsgGrpc.getStakeMethod = getStakeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgStake, com.stafihub.stafihub.mining.MsgStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Stake"))
              .build();
        }
      }
    }
    return getStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgClaimReward,
      com.stafihub.stafihub.mining.MsgClaimRewardResponse> getClaimRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimReward",
      requestType = com.stafihub.stafihub.mining.MsgClaimReward.class,
      responseType = com.stafihub.stafihub.mining.MsgClaimRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgClaimReward,
      com.stafihub.stafihub.mining.MsgClaimRewardResponse> getClaimRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgClaimReward, com.stafihub.stafihub.mining.MsgClaimRewardResponse> getClaimRewardMethod;
    if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
          MsgGrpc.getClaimRewardMethod = getClaimRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgClaimReward, com.stafihub.stafihub.mining.MsgClaimRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgClaimReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgClaimRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimReward"))
              .build();
        }
      }
    }
    return getClaimRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdraw,
      com.stafihub.stafihub.mining.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.stafihub.stafihub.mining.MsgWithdraw.class,
      responseType = com.stafihub.stafihub.mining.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdraw,
      com.stafihub.stafihub.mining.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdraw, com.stafihub.stafihub.mining.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgWithdraw, com.stafihub.stafihub.mining.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateStakeItem,
      com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStakeItem",
      requestType = com.stafihub.stafihub.mining.MsgUpdateStakeItem.class,
      responseType = com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateStakeItem,
      com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateStakeItem, com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;
    if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
          MsgGrpc.getUpdateStakeItemMethod = getUpdateStakeItemMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgUpdateStakeItem, com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgUpdateStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateStakeItem"))
              .build();
        }
      }
    }
    return getUpdateStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddMiningProvider,
      com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> getAddMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMiningProvider",
      requestType = com.stafihub.stafihub.mining.MsgAddMiningProvider.class,
      responseType = com.stafihub.stafihub.mining.MsgAddMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddMiningProvider,
      com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> getAddMiningProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddMiningProvider, com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> getAddMiningProviderMethod;
    if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
          MsgGrpc.getAddMiningProviderMethod = getAddMiningProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddMiningProvider, com.stafihub.stafihub.mining.MsgAddMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMiningProvider"))
              .build();
        }
      }
    }
    return getAddMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmMiningProvider,
      com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> getRmMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmMiningProvider",
      requestType = com.stafihub.stafihub.mining.MsgRmMiningProvider.class,
      responseType = com.stafihub.stafihub.mining.MsgRmMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmMiningProvider,
      com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> getRmMiningProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmMiningProvider, com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> getRmMiningProviderMethod;
    if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
          MsgGrpc.getRmMiningProviderMethod = getRmMiningProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgRmMiningProvider, com.stafihub.stafihub.mining.MsgRmMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmMiningProvider"))
              .build();
        }
      }
    }
    return getRmMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardToken,
      com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> getAddRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardToken",
      requestType = com.stafihub.stafihub.mining.MsgAddRewardToken.class,
      responseType = com.stafihub.stafihub.mining.MsgAddRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardToken,
      com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> getAddRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddRewardToken, com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> getAddRewardTokenMethod;
    if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
          MsgGrpc.getAddRewardTokenMethod = getAddRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddRewardToken, com.stafihub.stafihub.mining.MsgAddRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardToken"))
              .build();
        }
      }
    }
    return getAddRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber,
      com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxRewardPoolNumber",
      requestType = com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber.class,
      responseType = com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber,
      com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber, com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;
    if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
          MsgGrpc.getSetMaxRewardPoolNumberMethod = getSetMaxRewardPoolNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber, com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxRewardPoolNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxRewardPoolNumber"))
              .build();
        }
      }
    }
    return getSetMaxRewardPoolNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateRewardPool,
      com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRewardPool",
      requestType = com.stafihub.stafihub.mining.MsgUpdateRewardPool.class,
      responseType = com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateRewardPool,
      com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgUpdateRewardPool, com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;
    if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
          MsgGrpc.getUpdateRewardPoolMethod = getUpdateRewardPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgUpdateRewardPool, com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgUpdateRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRewardPool"))
              .build();
        }
      }
    }
    return getUpdateRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleProviderSwitch,
      com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleProviderSwitch",
      requestType = com.stafihub.stafihub.mining.MsgToggleProviderSwitch.class,
      responseType = com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleProviderSwitch,
      com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleProviderSwitch, com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;
    if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
          MsgGrpc.getToggleProviderSwitchMethod = getToggleProviderSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgToggleProviderSwitch, com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgToggleProviderSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleProviderSwitch"))
              .build();
        }
      }
    }
    return getToggleProviderSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber,
      com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxStakeItemNumber",
      requestType = com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber.class,
      responseType = com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber,
      com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber, com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;
    if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
          MsgGrpc.getSetMaxStakeItemNumberMethod = getSetMaxStakeItemNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber, com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxStakeItemNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxStakeItemNumber"))
              .build();
        }
      }
    }
    return getSetMaxStakeItemNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddReward,
      com.stafihub.stafihub.mining.MsgAddRewardResponse> getAddRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReward",
      requestType = com.stafihub.stafihub.mining.MsgAddReward.class,
      responseType = com.stafihub.stafihub.mining.MsgAddRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddReward,
      com.stafihub.stafihub.mining.MsgAddRewardResponse> getAddRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddReward, com.stafihub.stafihub.mining.MsgAddRewardResponse> getAddRewardMethod;
    if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
          MsgGrpc.getAddRewardMethod = getAddRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddReward, com.stafihub.stafihub.mining.MsgAddRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddReward"))
              .build();
        }
      }
    }
    return getAddRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleEmergencySwitch,
      com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleEmergencySwitch",
      requestType = com.stafihub.stafihub.mining.MsgToggleEmergencySwitch.class,
      responseType = com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleEmergencySwitch,
      com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgToggleEmergencySwitch, com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;
    if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
          MsgGrpc.getToggleEmergencySwitchMethod = getToggleEmergencySwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgToggleEmergencySwitch, com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleEmergencySwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgToggleEmergencySwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleEmergencySwitch"))
              .build();
        }
      }
    }
    return getToggleEmergencySwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgEmergencyWithdraw,
      com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyWithdraw",
      requestType = com.stafihub.stafihub.mining.MsgEmergencyWithdraw.class,
      responseType = com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgEmergencyWithdraw,
      com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgEmergencyWithdraw, com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;
    if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
          MsgGrpc.getEmergencyWithdrawMethod = getEmergencyWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgEmergencyWithdraw, com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmergencyWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgEmergencyWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EmergencyWithdraw"))
              .build();
        }
      }
    }
    return getEmergencyWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeToken,
      com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> getAddStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeToken",
      requestType = com.stafihub.stafihub.mining.MsgAddStakeToken.class,
      responseType = com.stafihub.stafihub.mining.MsgAddStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeToken,
      com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> getAddStakeTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgAddStakeToken, com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> getAddStakeTokenMethod;
    if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
          MsgGrpc.getAddStakeTokenMethod = getAddStakeTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgAddStakeToken, com.stafihub.stafihub.mining.MsgAddStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgAddStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeToken"))
              .build();
        }
      }
    }
    return getAddStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmRewardToken,
      com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> getRmRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmRewardToken",
      requestType = com.stafihub.stafihub.mining.MsgRmRewardToken.class,
      responseType = com.stafihub.stafihub.mining.MsgRmRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmRewardToken,
      com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> getRmRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmRewardToken, com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> getRmRewardTokenMethod;
    if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
          MsgGrpc.getRmRewardTokenMethod = getRmRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgRmRewardToken, com.stafihub.stafihub.mining.MsgRmRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmRewardToken"))
              .build();
        }
      }
    }
    return getRmRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmStakeToken,
      com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> getRmStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmStakeToken",
      requestType = com.stafihub.stafihub.mining.MsgRmStakeToken.class,
      responseType = com.stafihub.stafihub.mining.MsgRmStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmStakeToken,
      com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> getRmStakeTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgRmStakeToken, com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> getRmStakeTokenMethod;
    if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
          MsgGrpc.getRmStakeTokenMethod = getRmStakeTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgRmStakeToken, com.stafihub.stafihub.mining.MsgRmStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgRmStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmStakeToken"))
              .build();
        }
      }
    }
    return getRmStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetStakeItemLimit,
      com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStakeItemLimit",
      requestType = com.stafihub.stafihub.mining.MsgSetStakeItemLimit.class,
      responseType = com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetStakeItemLimit,
      com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgSetStakeItemLimit, com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;
    if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
          MsgGrpc.getSetStakeItemLimitMethod = getSetStakeItemLimitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgSetStakeItemLimit, com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStakeItemLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetStakeItemLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetStakeItemLimit"))
              .build();
        }
      }
    }
    return getSetStakeItemLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdrawRewardToken,
      com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewardToken",
      requestType = com.stafihub.stafihub.mining.MsgWithdrawRewardToken.class,
      responseType = com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdrawRewardToken,
      com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.MsgWithdrawRewardToken, com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;
    if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
          MsgGrpc.getWithdrawRewardTokenMethod = getWithdrawRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.MsgWithdrawRewardToken, com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgWithdrawRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewardToken"))
              .build();
        }
      }
    }
    return getWithdrawRewardTokenMethod;
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
    default void addStakePool(com.stafihub.stafihub.mining.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakePoolMethod(), responseObserver);
    }

    /**
     */
    default void addStakeItem(com.stafihub.stafihub.mining.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakeItemMethod(), responseObserver);
    }

    /**
     */
    default void addRewardPool(com.stafihub.stafihub.mining.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardPoolMethod(), responseObserver);
    }

    /**
     */
    default void stake(com.stafihub.stafihub.mining.MsgStake request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeMethod(), responseObserver);
    }

    /**
     */
    default void claimReward(com.stafihub.stafihub.mining.MsgClaimReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgClaimRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRewardMethod(), responseObserver);
    }

    /**
     */
    default void withdraw(com.stafihub.stafihub.mining.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void updateStakeItem(com.stafihub.stafihub.mining.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStakeItemMethod(), responseObserver);
    }

    /**
     */
    default void addMiningProvider(com.stafihub.stafihub.mining.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMiningProviderMethod(), responseObserver);
    }

    /**
     */
    default void rmMiningProvider(com.stafihub.stafihub.mining.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmMiningProviderMethod(), responseObserver);
    }

    /**
     */
    default void addRewardToken(com.stafihub.stafihub.mining.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardTokenMethod(), responseObserver);
    }

    /**
     */
    default void setMaxRewardPoolNumber(com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxRewardPoolNumberMethod(), responseObserver);
    }

    /**
     */
    default void updateRewardPool(com.stafihub.stafihub.mining.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRewardPoolMethod(), responseObserver);
    }

    /**
     */
    default void toggleProviderSwitch(com.stafihub.stafihub.mining.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleProviderSwitchMethod(), responseObserver);
    }

    /**
     */
    default void setMaxStakeItemNumber(com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxStakeItemNumberMethod(), responseObserver);
    }

    /**
     */
    default void addReward(com.stafihub.stafihub.mining.MsgAddReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardMethod(), responseObserver);
    }

    /**
     */
    default void toggleEmergencySwitch(com.stafihub.stafihub.mining.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleEmergencySwitchMethod(), responseObserver);
    }

    /**
     */
    default void emergencyWithdraw(com.stafihub.stafihub.mining.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmergencyWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void addStakeToken(com.stafihub.stafihub.mining.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakeTokenMethod(), responseObserver);
    }

    /**
     */
    default void rmRewardToken(com.stafihub.stafihub.mining.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmRewardTokenMethod(), responseObserver);
    }

    /**
     */
    default void rmStakeToken(com.stafihub.stafihub.mining.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmStakeTokenMethod(), responseObserver);
    }

    /**
     */
    default void setStakeItemLimit(com.stafihub.stafihub.mining.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetStakeItemLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void withdrawRewardToken(com.stafihub.stafihub.mining.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRewardTokenMethod(), responseObserver);
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
    public void addStakePool(com.stafihub.stafihub.mining.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeItem(com.stafihub.stafihub.mining.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardPool(com.stafihub.stafihub.mining.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stake(com.stafihub.stafihub.mining.MsgStake request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimReward(com.stafihub.stafihub.mining.MsgClaimReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgClaimRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(com.stafihub.stafihub.mining.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStakeItem(com.stafihub.stafihub.mining.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMiningProvider(com.stafihub.stafihub.mining.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmMiningProvider(com.stafihub.stafihub.mining.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardToken(com.stafihub.stafihub.mining.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxRewardPoolNumber(com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRewardPool(com.stafihub.stafihub.mining.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(com.stafihub.stafihub.mining.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxStakeItemNumber(com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReward(com.stafihub.stafihub.mining.MsgAddReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleEmergencySwitch(com.stafihub.stafihub.mining.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyWithdraw(com.stafihub.stafihub.mining.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeToken(com.stafihub.stafihub.mining.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmRewardToken(com.stafihub.stafihub.mining.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmStakeToken(com.stafihub.stafihub.mining.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStakeItemLimit(com.stafihub.stafihub.mining.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawRewardToken(com.stafihub.stafihub.mining.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardTokenMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.mining.MsgAddStakePoolResponse addStakePool(com.stafihub.stafihub.mining.MsgAddStakePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddStakeItemResponse addStakeItem(com.stafihub.stafihub.mining.MsgAddStakeItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddRewardPoolResponse addRewardPool(com.stafihub.stafihub.mining.MsgAddRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgStakeResponse stake(com.stafihub.stafihub.mining.MsgStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgClaimRewardResponse claimReward(com.stafihub.stafihub.mining.MsgClaimReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgWithdrawResponse withdraw(com.stafihub.stafihub.mining.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse updateStakeItem(com.stafihub.stafihub.mining.MsgUpdateStakeItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddMiningProviderResponse addMiningProvider(com.stafihub.stafihub.mining.MsgAddMiningProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgRmMiningProviderResponse rmMiningProvider(com.stafihub.stafihub.mining.MsgRmMiningProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddRewardTokenResponse addRewardToken(com.stafihub.stafihub.mining.MsgAddRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse setMaxRewardPoolNumber(com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxRewardPoolNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse updateRewardPool(com.stafihub.stafihub.mining.MsgUpdateRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse toggleProviderSwitch(com.stafihub.stafihub.mining.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleProviderSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse setMaxStakeItemNumber(com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxStakeItemNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddRewardResponse addReward(com.stafihub.stafihub.mining.MsgAddReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse toggleEmergencySwitch(com.stafihub.stafihub.mining.MsgToggleEmergencySwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleEmergencySwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse emergencyWithdraw(com.stafihub.stafihub.mining.MsgEmergencyWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmergencyWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgAddStakeTokenResponse addStakeToken(com.stafihub.stafihub.mining.MsgAddStakeToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgRmRewardTokenResponse rmRewardToken(com.stafihub.stafihub.mining.MsgRmRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgRmStakeTokenResponse rmStakeToken(com.stafihub.stafihub.mining.MsgRmStakeToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse setStakeItemLimit(com.stafihub.stafihub.mining.MsgSetStakeItemLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetStakeItemLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse withdrawRewardToken(com.stafihub.stafihub.mining.MsgWithdrawRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRewardTokenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddStakePoolResponse> addStakePool(
        com.stafihub.stafihub.mining.MsgAddStakePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddStakeItemResponse> addStakeItem(
        com.stafihub.stafihub.mining.MsgAddStakeItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddRewardPoolResponse> addRewardPool(
        com.stafihub.stafihub.mining.MsgAddRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgStakeResponse> stake(
        com.stafihub.stafihub.mining.MsgStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgClaimRewardResponse> claimReward(
        com.stafihub.stafihub.mining.MsgClaimReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgWithdrawResponse> withdraw(
        com.stafihub.stafihub.mining.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse> updateStakeItem(
        com.stafihub.stafihub.mining.MsgUpdateStakeItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddMiningProviderResponse> addMiningProvider(
        com.stafihub.stafihub.mining.MsgAddMiningProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgRmMiningProviderResponse> rmMiningProvider(
        com.stafihub.stafihub.mining.MsgRmMiningProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddRewardTokenResponse> addRewardToken(
        com.stafihub.stafihub.mining.MsgAddRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse> setMaxRewardPoolNumber(
        com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse> updateRewardPool(
        com.stafihub.stafihub.mining.MsgUpdateRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse> toggleProviderSwitch(
        com.stafihub.stafihub.mining.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse> setMaxStakeItemNumber(
        com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddRewardResponse> addReward(
        com.stafihub.stafihub.mining.MsgAddReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse> toggleEmergencySwitch(
        com.stafihub.stafihub.mining.MsgToggleEmergencySwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse> emergencyWithdraw(
        com.stafihub.stafihub.mining.MsgEmergencyWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgAddStakeTokenResponse> addStakeToken(
        com.stafihub.stafihub.mining.MsgAddStakeToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgRmRewardTokenResponse> rmRewardToken(
        com.stafihub.stafihub.mining.MsgRmRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgRmStakeTokenResponse> rmStakeToken(
        com.stafihub.stafihub.mining.MsgRmStakeToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse> setStakeItemLimit(
        com.stafihub.stafihub.mining.MsgSetStakeItemLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse> withdrawRewardToken(
        com.stafihub.stafihub.mining.MsgWithdrawRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRewardTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STAKE_POOL = 0;
  private static final int METHODID_ADD_STAKE_ITEM = 1;
  private static final int METHODID_ADD_REWARD_POOL = 2;
  private static final int METHODID_STAKE = 3;
  private static final int METHODID_CLAIM_REWARD = 4;
  private static final int METHODID_WITHDRAW = 5;
  private static final int METHODID_UPDATE_STAKE_ITEM = 6;
  private static final int METHODID_ADD_MINING_PROVIDER = 7;
  private static final int METHODID_RM_MINING_PROVIDER = 8;
  private static final int METHODID_ADD_REWARD_TOKEN = 9;
  private static final int METHODID_SET_MAX_REWARD_POOL_NUMBER = 10;
  private static final int METHODID_UPDATE_REWARD_POOL = 11;
  private static final int METHODID_TOGGLE_PROVIDER_SWITCH = 12;
  private static final int METHODID_SET_MAX_STAKE_ITEM_NUMBER = 13;
  private static final int METHODID_ADD_REWARD = 14;
  private static final int METHODID_TOGGLE_EMERGENCY_SWITCH = 15;
  private static final int METHODID_EMERGENCY_WITHDRAW = 16;
  private static final int METHODID_ADD_STAKE_TOKEN = 17;
  private static final int METHODID_RM_REWARD_TOKEN = 18;
  private static final int METHODID_RM_STAKE_TOKEN = 19;
  private static final int METHODID_SET_STAKE_ITEM_LIMIT = 20;
  private static final int METHODID_WITHDRAW_REWARD_TOKEN = 21;

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
        case METHODID_ADD_STAKE_POOL:
          serviceImpl.addStakePool((com.stafihub.stafihub.mining.MsgAddStakePool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakePoolResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_ITEM:
          serviceImpl.addStakeItem((com.stafihub.stafihub.mining.MsgAddStakeItem) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_POOL:
          serviceImpl.addRewardPool((com.stafihub.stafihub.mining.MsgAddRewardPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardPoolResponse>) responseObserver);
          break;
        case METHODID_STAKE:
          serviceImpl.stake((com.stafihub.stafihub.mining.MsgStake) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgStakeResponse>) responseObserver);
          break;
        case METHODID_CLAIM_REWARD:
          serviceImpl.claimReward((com.stafihub.stafihub.mining.MsgClaimReward) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgClaimRewardResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.stafihub.stafihub.mining.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STAKE_ITEM:
          serviceImpl.updateStakeItem((com.stafihub.stafihub.mining.MsgUpdateStakeItem) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_MINING_PROVIDER:
          serviceImpl.addMiningProvider((com.stafihub.stafihub.mining.MsgAddMiningProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddMiningProviderResponse>) responseObserver);
          break;
        case METHODID_RM_MINING_PROVIDER:
          serviceImpl.rmMiningProvider((com.stafihub.stafihub.mining.MsgRmMiningProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmMiningProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_TOKEN:
          serviceImpl.addRewardToken((com.stafihub.stafihub.mining.MsgAddRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardTokenResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_REWARD_POOL_NUMBER:
          serviceImpl.setMaxRewardPoolNumber((com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REWARD_POOL:
          serviceImpl.updateRewardPool((com.stafihub.stafihub.mining.MsgUpdateRewardPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_PROVIDER_SWITCH:
          serviceImpl.toggleProviderSwitch((com.stafihub.stafihub.mining.MsgToggleProviderSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_STAKE_ITEM_NUMBER:
          serviceImpl.setMaxStakeItemNumber((com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD:
          serviceImpl.addReward((com.stafihub.stafihub.mining.MsgAddReward) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddRewardResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_EMERGENCY_SWITCH:
          serviceImpl.toggleEmergencySwitch((com.stafihub.stafihub.mining.MsgToggleEmergencySwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_WITHDRAW:
          serviceImpl.emergencyWithdraw((com.stafihub.stafihub.mining.MsgEmergencyWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_TOKEN:
          serviceImpl.addStakeToken((com.stafihub.stafihub.mining.MsgAddStakeToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgAddStakeTokenResponse>) responseObserver);
          break;
        case METHODID_RM_REWARD_TOKEN:
          serviceImpl.rmRewardToken((com.stafihub.stafihub.mining.MsgRmRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmRewardTokenResponse>) responseObserver);
          break;
        case METHODID_RM_STAKE_TOKEN:
          serviceImpl.rmStakeToken((com.stafihub.stafihub.mining.MsgRmStakeToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgRmStakeTokenResponse>) responseObserver);
          break;
        case METHODID_SET_STAKE_ITEM_LIMIT:
          serviceImpl.setStakeItemLimit((com.stafihub.stafihub.mining.MsgSetStakeItemLimit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARD_TOKEN:
          serviceImpl.withdrawRewardToken((com.stafihub.stafihub.mining.MsgWithdrawRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse>) responseObserver);
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
          getAddStakePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddStakePool,
              com.stafihub.stafihub.mining.MsgAddStakePoolResponse>(
                service, METHODID_ADD_STAKE_POOL)))
        .addMethod(
          getAddStakeItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddStakeItem,
              com.stafihub.stafihub.mining.MsgAddStakeItemResponse>(
                service, METHODID_ADD_STAKE_ITEM)))
        .addMethod(
          getAddRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddRewardPool,
              com.stafihub.stafihub.mining.MsgAddRewardPoolResponse>(
                service, METHODID_ADD_REWARD_POOL)))
        .addMethod(
          getStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgStake,
              com.stafihub.stafihub.mining.MsgStakeResponse>(
                service, METHODID_STAKE)))
        .addMethod(
          getClaimRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgClaimReward,
              com.stafihub.stafihub.mining.MsgClaimRewardResponse>(
                service, METHODID_CLAIM_REWARD)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgWithdraw,
              com.stafihub.stafihub.mining.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getUpdateStakeItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgUpdateStakeItem,
              com.stafihub.stafihub.mining.MsgUpdateStakeItemResponse>(
                service, METHODID_UPDATE_STAKE_ITEM)))
        .addMethod(
          getAddMiningProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddMiningProvider,
              com.stafihub.stafihub.mining.MsgAddMiningProviderResponse>(
                service, METHODID_ADD_MINING_PROVIDER)))
        .addMethod(
          getRmMiningProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgRmMiningProvider,
              com.stafihub.stafihub.mining.MsgRmMiningProviderResponse>(
                service, METHODID_RM_MINING_PROVIDER)))
        .addMethod(
          getAddRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddRewardToken,
              com.stafihub.stafihub.mining.MsgAddRewardTokenResponse>(
                service, METHODID_ADD_REWARD_TOKEN)))
        .addMethod(
          getSetMaxRewardPoolNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber,
              com.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse>(
                service, METHODID_SET_MAX_REWARD_POOL_NUMBER)))
        .addMethod(
          getUpdateRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgUpdateRewardPool,
              com.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse>(
                service, METHODID_UPDATE_REWARD_POOL)))
        .addMethod(
          getToggleProviderSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgToggleProviderSwitch,
              com.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse>(
                service, METHODID_TOGGLE_PROVIDER_SWITCH)))
        .addMethod(
          getSetMaxStakeItemNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber,
              com.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse>(
                service, METHODID_SET_MAX_STAKE_ITEM_NUMBER)))
        .addMethod(
          getAddRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddReward,
              com.stafihub.stafihub.mining.MsgAddRewardResponse>(
                service, METHODID_ADD_REWARD)))
        .addMethod(
          getToggleEmergencySwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgToggleEmergencySwitch,
              com.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse>(
                service, METHODID_TOGGLE_EMERGENCY_SWITCH)))
        .addMethod(
          getEmergencyWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgEmergencyWithdraw,
              com.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse>(
                service, METHODID_EMERGENCY_WITHDRAW)))
        .addMethod(
          getAddStakeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgAddStakeToken,
              com.stafihub.stafihub.mining.MsgAddStakeTokenResponse>(
                service, METHODID_ADD_STAKE_TOKEN)))
        .addMethod(
          getRmRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgRmRewardToken,
              com.stafihub.stafihub.mining.MsgRmRewardTokenResponse>(
                service, METHODID_RM_REWARD_TOKEN)))
        .addMethod(
          getRmStakeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgRmStakeToken,
              com.stafihub.stafihub.mining.MsgRmStakeTokenResponse>(
                service, METHODID_RM_STAKE_TOKEN)))
        .addMethod(
          getSetStakeItemLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgSetStakeItemLimit,
              com.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse>(
                service, METHODID_SET_STAKE_ITEM_LIMIT)))
        .addMethod(
          getWithdrawRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.MsgWithdrawRewardToken,
              com.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse>(
                service, METHODID_WITHDRAW_REWARD_TOKEN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.mining.TxProto.getDescriptor();
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
              .addMethod(getAddStakePoolMethod())
              .addMethod(getAddStakeItemMethod())
              .addMethod(getAddRewardPoolMethod())
              .addMethod(getStakeMethod())
              .addMethod(getClaimRewardMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getUpdateStakeItemMethod())
              .addMethod(getAddMiningProviderMethod())
              .addMethod(getRmMiningProviderMethod())
              .addMethod(getAddRewardTokenMethod())
              .addMethod(getSetMaxRewardPoolNumberMethod())
              .addMethod(getUpdateRewardPoolMethod())
              .addMethod(getToggleProviderSwitchMethod())
              .addMethod(getSetMaxStakeItemNumberMethod())
              .addMethod(getAddRewardMethod())
              .addMethod(getToggleEmergencySwitchMethod())
              .addMethod(getEmergencyWithdrawMethod())
              .addMethod(getAddStakeTokenMethod())
              .addMethod(getRmRewardTokenMethod())
              .addMethod(getRmStakeTokenMethod())
              .addMethod(getSetStakeItemLimitMethod())
              .addMethod(getWithdrawRewardTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
