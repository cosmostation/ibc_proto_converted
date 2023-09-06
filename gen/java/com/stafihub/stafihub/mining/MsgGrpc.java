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
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakePool,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> getAddStakePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakePool",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddStakePool.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakePool,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> getAddStakePoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakePool, com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> getAddStakePoolMethod;
    if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakePoolMethod = MsgGrpc.getAddStakePoolMethod) == null) {
          MsgGrpc.getAddStakePoolMethod = getAddStakePoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddStakePool, com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakePool"))
              .build();
        }
      }
    }
    return getAddStakePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> getAddStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeItem",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> getAddStakeItemMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem, com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> getAddStakeItemMethod;
    if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeItemMethod = MsgGrpc.getAddStakeItemMethod) == null) {
          MsgGrpc.getAddStakeItemMethod = getAddStakeItemMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem, com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeItem"))
              .build();
        }
      }
    }
    return getAddStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> getAddRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardPool",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> getAddRewardPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool, com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> getAddRewardPoolMethod;
    if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardPoolMethod = MsgGrpc.getAddRewardPoolMethod) == null) {
          MsgGrpc.getAddRewardPoolMethod = getAddRewardPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool, com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardPool"))
              .build();
        }
      }
    }
    return getAddRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgStake,
      com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> getStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stake",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgStake.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgStake,
      com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> getStakeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgStake, com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> getStakeMethod;
    if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
          MsgGrpc.getStakeMethod = getStakeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgStake, com.stafihub.stafihub.mining.TxProto.MsgStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Stake"))
              .build();
        }
      }
    }
    return getStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgClaimReward,
      com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> getClaimRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimReward",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgClaimReward.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgClaimReward,
      com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> getClaimRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgClaimReward, com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> getClaimRewardMethod;
    if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimRewardMethod = MsgGrpc.getClaimRewardMethod) == null) {
          MsgGrpc.getClaimRewardMethod = getClaimRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgClaimReward, com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgClaimReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimReward"))
              .build();
        }
      }
    }
    return getClaimRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdraw,
      com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgWithdraw.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdraw,
      com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdraw, com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgWithdraw, com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem,
      com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStakeItem",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem,
      com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem, com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> getUpdateStakeItemMethod;
    if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateStakeItemMethod = MsgGrpc.getUpdateStakeItemMethod) == null) {
          MsgGrpc.getUpdateStakeItemMethod = getUpdateStakeItemMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem, com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStakeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateStakeItem"))
              .build();
        }
      }
    }
    return getUpdateStakeItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider,
      com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> getAddMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMiningProvider",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider,
      com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> getAddMiningProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider, com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> getAddMiningProviderMethod;
    if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMiningProviderMethod = MsgGrpc.getAddMiningProviderMethod) == null) {
          MsgGrpc.getAddMiningProviderMethod = getAddMiningProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider, com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMiningProvider"))
              .build();
        }
      }
    }
    return getAddMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider,
      com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> getRmMiningProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmMiningProvider",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider,
      com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> getRmMiningProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider, com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> getRmMiningProviderMethod;
    if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmMiningProviderMethod = MsgGrpc.getRmMiningProviderMethod) == null) {
          MsgGrpc.getRmMiningProviderMethod = getRmMiningProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider, com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmMiningProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmMiningProvider"))
              .build();
        }
      }
    }
    return getRmMiningProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> getAddRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRewardToken",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> getAddRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken, com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> getAddRewardTokenMethod;
    if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardTokenMethod = MsgGrpc.getAddRewardTokenMethod) == null) {
          MsgGrpc.getAddRewardTokenMethod = getAddRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken, com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRewardToken"))
              .build();
        }
      }
    }
    return getAddRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber,
      com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxRewardPoolNumber",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber,
      com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber, com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> getSetMaxRewardPoolNumberMethod;
    if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxRewardPoolNumberMethod = MsgGrpc.getSetMaxRewardPoolNumberMethod) == null) {
          MsgGrpc.getSetMaxRewardPoolNumberMethod = getSetMaxRewardPoolNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber, com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxRewardPoolNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxRewardPoolNumber"))
              .build();
        }
      }
    }
    return getSetMaxRewardPoolNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool,
      com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRewardPool",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool,
      com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool, com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> getUpdateRewardPoolMethod;
    if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRewardPoolMethod = MsgGrpc.getUpdateRewardPoolMethod) == null) {
          MsgGrpc.getUpdateRewardPoolMethod = getUpdateRewardPoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool, com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRewardPool"))
              .build();
        }
      }
    }
    return getUpdateRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch,
      com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleProviderSwitch",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch,
      com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch, com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;
    if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
          MsgGrpc.getToggleProviderSwitchMethod = getToggleProviderSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch, com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleProviderSwitch"))
              .build();
        }
      }
    }
    return getToggleProviderSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber,
      com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxStakeItemNumber",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber,
      com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber, com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> getSetMaxStakeItemNumberMethod;
    if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxStakeItemNumberMethod = MsgGrpc.getSetMaxStakeItemNumberMethod) == null) {
          MsgGrpc.getSetMaxStakeItemNumberMethod = getSetMaxStakeItemNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber, com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxStakeItemNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxStakeItemNumber"))
              .build();
        }
      }
    }
    return getSetMaxStakeItemNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddReward,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> getAddRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReward",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddReward.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddReward,
      com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> getAddRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddReward, com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> getAddRewardMethod;
    if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRewardMethod = MsgGrpc.getAddRewardMethod) == null) {
          MsgGrpc.getAddRewardMethod = getAddRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddReward, com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddReward"))
              .build();
        }
      }
    }
    return getAddRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch,
      com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleEmergencySwitch",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch,
      com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch, com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> getToggleEmergencySwitchMethod;
    if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleEmergencySwitchMethod = MsgGrpc.getToggleEmergencySwitchMethod) == null) {
          MsgGrpc.getToggleEmergencySwitchMethod = getToggleEmergencySwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch, com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleEmergencySwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleEmergencySwitch"))
              .build();
        }
      }
    }
    return getToggleEmergencySwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw,
      com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyWithdraw",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw,
      com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw, com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> getEmergencyWithdrawMethod;
    if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEmergencyWithdrawMethod = MsgGrpc.getEmergencyWithdrawMethod) == null) {
          MsgGrpc.getEmergencyWithdrawMethod = getEmergencyWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw, com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmergencyWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EmergencyWithdraw"))
              .build();
        }
      }
    }
    return getEmergencyWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> getAddStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStakeToken",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken,
      com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> getAddStakeTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken, com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> getAddStakeTokenMethod;
    if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddStakeTokenMethod = MsgGrpc.getAddStakeTokenMethod) == null) {
          MsgGrpc.getAddStakeTokenMethod = getAddStakeTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken, com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddStakeToken"))
              .build();
        }
      }
    }
    return getAddStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> getRmRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmRewardToken",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> getRmRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken, com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> getRmRewardTokenMethod;
    if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmRewardTokenMethod = MsgGrpc.getRmRewardTokenMethod) == null) {
          MsgGrpc.getRmRewardTokenMethod = getRmRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken, com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmRewardToken"))
              .build();
        }
      }
    }
    return getRmRewardTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken,
      com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> getRmStakeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmStakeToken",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken,
      com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> getRmStakeTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken, com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> getRmStakeTokenMethod;
    if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmStakeTokenMethod = MsgGrpc.getRmStakeTokenMethod) == null) {
          MsgGrpc.getRmStakeTokenMethod = getRmStakeTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken, com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmStakeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmStakeToken"))
              .build();
        }
      }
    }
    return getRmStakeTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit,
      com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetStakeItemLimit",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit,
      com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit, com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> getSetStakeItemLimitMethod;
    if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetStakeItemLimitMethod = MsgGrpc.getSetStakeItemLimitMethod) == null) {
          MsgGrpc.getSetStakeItemLimitMethod = getSetStakeItemLimitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit, com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetStakeItemLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetStakeItemLimit"))
              .build();
        }
      }
    }
    return getSetStakeItemLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewardToken",
      requestType = com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken.class,
      responseType = com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken,
      com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken, com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> getWithdrawRewardTokenMethod;
    if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardTokenMethod = MsgGrpc.getWithdrawRewardTokenMethod) == null) {
          MsgGrpc.getWithdrawRewardTokenMethod = getWithdrawRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken, com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse.getDefaultInstance()))
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
    default void addStakePool(com.stafihub.stafihub.mining.TxProto.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakePoolMethod(), responseObserver);
    }

    /**
     */
    default void addStakeItem(com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakeItemMethod(), responseObserver);
    }

    /**
     */
    default void addRewardPool(com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardPoolMethod(), responseObserver);
    }

    /**
     */
    default void stake(com.stafihub.stafihub.mining.TxProto.MsgStake request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeMethod(), responseObserver);
    }

    /**
     */
    default void claimReward(com.stafihub.stafihub.mining.TxProto.MsgClaimReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRewardMethod(), responseObserver);
    }

    /**
     */
    default void withdraw(com.stafihub.stafihub.mining.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void updateStakeItem(com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStakeItemMethod(), responseObserver);
    }

    /**
     */
    default void addMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMiningProviderMethod(), responseObserver);
    }

    /**
     */
    default void rmMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmMiningProviderMethod(), responseObserver);
    }

    /**
     */
    default void addRewardToken(com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardTokenMethod(), responseObserver);
    }

    /**
     */
    default void setMaxRewardPoolNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxRewardPoolNumberMethod(), responseObserver);
    }

    /**
     */
    default void updateRewardPool(com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRewardPoolMethod(), responseObserver);
    }

    /**
     */
    default void toggleProviderSwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleProviderSwitchMethod(), responseObserver);
    }

    /**
     */
    default void setMaxStakeItemNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxStakeItemNumberMethod(), responseObserver);
    }

    /**
     */
    default void addReward(com.stafihub.stafihub.mining.TxProto.MsgAddReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRewardMethod(), responseObserver);
    }

    /**
     */
    default void toggleEmergencySwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleEmergencySwitchMethod(), responseObserver);
    }

    /**
     */
    default void emergencyWithdraw(com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmergencyWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void addStakeToken(com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStakeTokenMethod(), responseObserver);
    }

    /**
     */
    default void rmRewardToken(com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmRewardTokenMethod(), responseObserver);
    }

    /**
     */
    default void rmStakeToken(com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmStakeTokenMethod(), responseObserver);
    }

    /**
     */
    default void setStakeItemLimit(com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetStakeItemLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void withdrawRewardToken(com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> responseObserver) {
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
    public void addStakePool(com.stafihub.stafihub.mining.TxProto.MsgAddStakePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeItem(com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardPool(com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stake(com.stafihub.stafihub.mining.TxProto.MsgStake request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimReward(com.stafihub.stafihub.mining.TxProto.MsgClaimReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(com.stafihub.stafihub.mining.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStakeItem(com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRewardToken(com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxRewardPoolNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRewardPool(com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMaxStakeItemNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReward(com.stafihub.stafihub.mining.TxProto.MsgAddReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleEmergencySwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emergencyWithdraw(com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStakeToken(com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmRewardToken(com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmStakeToken(com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setStakeItemLimit(com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawRewardToken(com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> responseObserver) {
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
    public com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse addStakePool(com.stafihub.stafihub.mining.TxProto.MsgAddStakePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse addStakeItem(com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse addRewardPool(com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgStakeResponse stake(com.stafihub.stafihub.mining.TxProto.MsgStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse claimReward(com.stafihub.stafihub.mining.TxProto.MsgClaimReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse withdraw(com.stafihub.stafihub.mining.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse updateStakeItem(com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStakeItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse addMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse rmMiningProvider(com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmMiningProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse addRewardToken(com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse setMaxRewardPoolNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxRewardPoolNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse updateRewardPool(com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse toggleProviderSwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleProviderSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse setMaxStakeItemNumber(com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxStakeItemNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse addReward(com.stafihub.stafihub.mining.TxProto.MsgAddReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse toggleEmergencySwitch(com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleEmergencySwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse emergencyWithdraw(com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmergencyWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse addStakeToken(com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse rmRewardToken(com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmRewardTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse rmStakeToken(com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmStakeTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse setStakeItemLimit(com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetStakeItemLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse withdrawRewardToken(com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse> addStakePool(
        com.stafihub.stafihub.mining.TxProto.MsgAddStakePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse> addStakeItem(
        com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse> addRewardPool(
        com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgStakeResponse> stake(
        com.stafihub.stafihub.mining.TxProto.MsgStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse> claimReward(
        com.stafihub.stafihub.mining.TxProto.MsgClaimReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse> withdraw(
        com.stafihub.stafihub.mining.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse> updateStakeItem(
        com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStakeItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse> addMiningProvider(
        com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse> rmMiningProvider(
        com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmMiningProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse> addRewardToken(
        com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse> setMaxRewardPoolNumber(
        com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxRewardPoolNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse> updateRewardPool(
        com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse> toggleProviderSwitch(
        com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse> setMaxStakeItemNumber(
        com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxStakeItemNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse> addReward(
        com.stafihub.stafihub.mining.TxProto.MsgAddReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse> toggleEmergencySwitch(
        com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleEmergencySwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse> emergencyWithdraw(
        com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmergencyWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse> addStakeToken(
        com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse> rmRewardToken(
        com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmRewardTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse> rmStakeToken(
        com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmStakeTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse> setStakeItemLimit(
        com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetStakeItemLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse> withdrawRewardToken(
        com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken request) {
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
          serviceImpl.addStakePool((com.stafihub.stafihub.mining.TxProto.MsgAddStakePool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_ITEM:
          serviceImpl.addStakeItem((com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_POOL:
          serviceImpl.addRewardPool((com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse>) responseObserver);
          break;
        case METHODID_STAKE:
          serviceImpl.stake((com.stafihub.stafihub.mining.TxProto.MsgStake) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgStakeResponse>) responseObserver);
          break;
        case METHODID_CLAIM_REWARD:
          serviceImpl.claimReward((com.stafihub.stafihub.mining.TxProto.MsgClaimReward) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.stafihub.stafihub.mining.TxProto.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STAKE_ITEM:
          serviceImpl.updateStakeItem((com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse>) responseObserver);
          break;
        case METHODID_ADD_MINING_PROVIDER:
          serviceImpl.addMiningProvider((com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse>) responseObserver);
          break;
        case METHODID_RM_MINING_PROVIDER:
          serviceImpl.rmMiningProvider((com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD_TOKEN:
          serviceImpl.addRewardToken((com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_REWARD_POOL_NUMBER:
          serviceImpl.setMaxRewardPoolNumber((com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REWARD_POOL:
          serviceImpl.updateRewardPool((com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_PROVIDER_SWITCH:
          serviceImpl.toggleProviderSwitch((com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_STAKE_ITEM_NUMBER:
          serviceImpl.setMaxStakeItemNumber((com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse>) responseObserver);
          break;
        case METHODID_ADD_REWARD:
          serviceImpl.addReward((com.stafihub.stafihub.mining.TxProto.MsgAddReward) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_EMERGENCY_SWITCH:
          serviceImpl.toggleEmergencySwitch((com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_WITHDRAW:
          serviceImpl.emergencyWithdraw((com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_STAKE_TOKEN:
          serviceImpl.addStakeToken((com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse>) responseObserver);
          break;
        case METHODID_RM_REWARD_TOKEN:
          serviceImpl.rmRewardToken((com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse>) responseObserver);
          break;
        case METHODID_RM_STAKE_TOKEN:
          serviceImpl.rmStakeToken((com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse>) responseObserver);
          break;
        case METHODID_SET_STAKE_ITEM_LIMIT:
          serviceImpl.setStakeItemLimit((com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARD_TOKEN:
          serviceImpl.withdrawRewardToken((com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse>) responseObserver);
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
              com.stafihub.stafihub.mining.TxProto.MsgAddStakePool,
              com.stafihub.stafihub.mining.TxProto.MsgAddStakePoolResponse>(
                service, METHODID_ADD_STAKE_POOL)))
        .addMethod(
          getAddStakeItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddStakeItem,
              com.stafihub.stafihub.mining.TxProto.MsgAddStakeItemResponse>(
                service, METHODID_ADD_STAKE_ITEM)))
        .addMethod(
          getAddRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddRewardPool,
              com.stafihub.stafihub.mining.TxProto.MsgAddRewardPoolResponse>(
                service, METHODID_ADD_REWARD_POOL)))
        .addMethod(
          getStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgStake,
              com.stafihub.stafihub.mining.TxProto.MsgStakeResponse>(
                service, METHODID_STAKE)))
        .addMethod(
          getClaimRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgClaimReward,
              com.stafihub.stafihub.mining.TxProto.MsgClaimRewardResponse>(
                service, METHODID_CLAIM_REWARD)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgWithdraw,
              com.stafihub.stafihub.mining.TxProto.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getUpdateStakeItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItem,
              com.stafihub.stafihub.mining.TxProto.MsgUpdateStakeItemResponse>(
                service, METHODID_UPDATE_STAKE_ITEM)))
        .addMethod(
          getAddMiningProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddMiningProvider,
              com.stafihub.stafihub.mining.TxProto.MsgAddMiningProviderResponse>(
                service, METHODID_ADD_MINING_PROVIDER)))
        .addMethod(
          getRmMiningProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgRmMiningProvider,
              com.stafihub.stafihub.mining.TxProto.MsgRmMiningProviderResponse>(
                service, METHODID_RM_MINING_PROVIDER)))
        .addMethod(
          getAddRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddRewardToken,
              com.stafihub.stafihub.mining.TxProto.MsgAddRewardTokenResponse>(
                service, METHODID_ADD_REWARD_TOKEN)))
        .addMethod(
          getSetMaxRewardPoolNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumber,
              com.stafihub.stafihub.mining.TxProto.MsgSetMaxRewardPoolNumberResponse>(
                service, METHODID_SET_MAX_REWARD_POOL_NUMBER)))
        .addMethod(
          getUpdateRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPool,
              com.stafihub.stafihub.mining.TxProto.MsgUpdateRewardPoolResponse>(
                service, METHODID_UPDATE_REWARD_POOL)))
        .addMethod(
          getToggleProviderSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitch,
              com.stafihub.stafihub.mining.TxProto.MsgToggleProviderSwitchResponse>(
                service, METHODID_TOGGLE_PROVIDER_SWITCH)))
        .addMethod(
          getSetMaxStakeItemNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumber,
              com.stafihub.stafihub.mining.TxProto.MsgSetMaxStakeItemNumberResponse>(
                service, METHODID_SET_MAX_STAKE_ITEM_NUMBER)))
        .addMethod(
          getAddRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddReward,
              com.stafihub.stafihub.mining.TxProto.MsgAddRewardResponse>(
                service, METHODID_ADD_REWARD)))
        .addMethod(
          getToggleEmergencySwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitch,
              com.stafihub.stafihub.mining.TxProto.MsgToggleEmergencySwitchResponse>(
                service, METHODID_TOGGLE_EMERGENCY_SWITCH)))
        .addMethod(
          getEmergencyWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdraw,
              com.stafihub.stafihub.mining.TxProto.MsgEmergencyWithdrawResponse>(
                service, METHODID_EMERGENCY_WITHDRAW)))
        .addMethod(
          getAddStakeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgAddStakeToken,
              com.stafihub.stafihub.mining.TxProto.MsgAddStakeTokenResponse>(
                service, METHODID_ADD_STAKE_TOKEN)))
        .addMethod(
          getRmRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgRmRewardToken,
              com.stafihub.stafihub.mining.TxProto.MsgRmRewardTokenResponse>(
                service, METHODID_RM_REWARD_TOKEN)))
        .addMethod(
          getRmStakeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgRmStakeToken,
              com.stafihub.stafihub.mining.TxProto.MsgRmStakeTokenResponse>(
                service, METHODID_RM_STAKE_TOKEN)))
        .addMethod(
          getSetStakeItemLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimit,
              com.stafihub.stafihub.mining.TxProto.MsgSetStakeItemLimitResponse>(
                service, METHODID_SET_STAKE_ITEM_LIMIT)))
        .addMethod(
          getWithdrawRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardToken,
              com.stafihub.stafihub.mining.TxProto.MsgWithdrawRewardTokenResponse>(
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
