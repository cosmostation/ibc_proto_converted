package com.stride.stakeibc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stride/stakeibc/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stride.stakeibc.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgLiquidStake,
      com.stride.stakeibc.MsgLiquidStakeResponse> getLiquidStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidStake",
      requestType = com.stride.stakeibc.MsgLiquidStake.class,
      responseType = com.stride.stakeibc.MsgLiquidStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgLiquidStake,
      com.stride.stakeibc.MsgLiquidStakeResponse> getLiquidStakeMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgLiquidStake, com.stride.stakeibc.MsgLiquidStakeResponse> getLiquidStakeMethod;
    if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
          MsgGrpc.getLiquidStakeMethod = getLiquidStakeMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgLiquidStake, com.stride.stakeibc.MsgLiquidStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgLiquidStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgLiquidStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidStake"))
              .build();
        }
      }
    }
    return getLiquidStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRedeemStake,
      com.stride.stakeibc.MsgRedeemStakeResponse> getRedeemStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedeemStake",
      requestType = com.stride.stakeibc.MsgRedeemStake.class,
      responseType = com.stride.stakeibc.MsgRedeemStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRedeemStake,
      com.stride.stakeibc.MsgRedeemStakeResponse> getRedeemStakeMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRedeemStake, com.stride.stakeibc.MsgRedeemStakeResponse> getRedeemStakeMethod;
    if ((getRedeemStakeMethod = MsgGrpc.getRedeemStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemStakeMethod = MsgGrpc.getRedeemStakeMethod) == null) {
          MsgGrpc.getRedeemStakeMethod = getRedeemStakeMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgRedeemStake, com.stride.stakeibc.MsgRedeemStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedeemStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRedeemStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRedeemStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RedeemStake"))
              .build();
        }
      }
    }
    return getRedeemStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRegisterHostZone,
      com.stride.stakeibc.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterHostZone",
      requestType = com.stride.stakeibc.MsgRegisterHostZone.class,
      responseType = com.stride.stakeibc.MsgRegisterHostZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRegisterHostZone,
      com.stride.stakeibc.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRegisterHostZone, com.stride.stakeibc.MsgRegisterHostZoneResponse> getRegisterHostZoneMethod;
    if ((getRegisterHostZoneMethod = MsgGrpc.getRegisterHostZoneMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterHostZoneMethod = MsgGrpc.getRegisterHostZoneMethod) == null) {
          MsgGrpc.getRegisterHostZoneMethod = getRegisterHostZoneMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgRegisterHostZone, com.stride.stakeibc.MsgRegisterHostZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterHostZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRegisterHostZone.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRegisterHostZoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterHostZone"))
              .build();
        }
      }
    }
    return getRegisterHostZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClaimUndelegatedTokens,
      com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUndelegatedTokens",
      requestType = com.stride.stakeibc.MsgClaimUndelegatedTokens.class,
      responseType = com.stride.stakeibc.MsgClaimUndelegatedTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClaimUndelegatedTokens,
      com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClaimUndelegatedTokens, com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> getClaimUndelegatedTokensMethod;
    if ((getClaimUndelegatedTokensMethod = MsgGrpc.getClaimUndelegatedTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUndelegatedTokensMethod = MsgGrpc.getClaimUndelegatedTokensMethod) == null) {
          MsgGrpc.getClaimUndelegatedTokensMethod = getClaimUndelegatedTokensMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgClaimUndelegatedTokens, com.stride.stakeibc.MsgClaimUndelegatedTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUndelegatedTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgClaimUndelegatedTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgClaimUndelegatedTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUndelegatedTokens"))
              .build();
        }
      }
    }
    return getClaimUndelegatedTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRebalanceValidators,
      com.stride.stakeibc.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebalanceValidators",
      requestType = com.stride.stakeibc.MsgRebalanceValidators.class,
      responseType = com.stride.stakeibc.MsgRebalanceValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRebalanceValidators,
      com.stride.stakeibc.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRebalanceValidators, com.stride.stakeibc.MsgRebalanceValidatorsResponse> getRebalanceValidatorsMethod;
    if ((getRebalanceValidatorsMethod = MsgGrpc.getRebalanceValidatorsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRebalanceValidatorsMethod = MsgGrpc.getRebalanceValidatorsMethod) == null) {
          MsgGrpc.getRebalanceValidatorsMethod = getRebalanceValidatorsMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgRebalanceValidators, com.stride.stakeibc.MsgRebalanceValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RebalanceValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRebalanceValidators.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRebalanceValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RebalanceValidators"))
              .build();
        }
      }
    }
    return getRebalanceValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgAddValidators,
      com.stride.stakeibc.MsgAddValidatorsResponse> getAddValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValidators",
      requestType = com.stride.stakeibc.MsgAddValidators.class,
      responseType = com.stride.stakeibc.MsgAddValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgAddValidators,
      com.stride.stakeibc.MsgAddValidatorsResponse> getAddValidatorsMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgAddValidators, com.stride.stakeibc.MsgAddValidatorsResponse> getAddValidatorsMethod;
    if ((getAddValidatorsMethod = MsgGrpc.getAddValidatorsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddValidatorsMethod = MsgGrpc.getAddValidatorsMethod) == null) {
          MsgGrpc.getAddValidatorsMethod = getAddValidatorsMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgAddValidators, com.stride.stakeibc.MsgAddValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgAddValidators.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgAddValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddValidators"))
              .build();
        }
      }
    }
    return getAddValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgChangeValidatorWeight,
      com.stride.stakeibc.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeValidatorWeight",
      requestType = com.stride.stakeibc.MsgChangeValidatorWeight.class,
      responseType = com.stride.stakeibc.MsgChangeValidatorWeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgChangeValidatorWeight,
      com.stride.stakeibc.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgChangeValidatorWeight, com.stride.stakeibc.MsgChangeValidatorWeightResponse> getChangeValidatorWeightMethod;
    if ((getChangeValidatorWeightMethod = MsgGrpc.getChangeValidatorWeightMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeValidatorWeightMethod = MsgGrpc.getChangeValidatorWeightMethod) == null) {
          MsgGrpc.getChangeValidatorWeightMethod = getChangeValidatorWeightMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgChangeValidatorWeight, com.stride.stakeibc.MsgChangeValidatorWeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeValidatorWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgChangeValidatorWeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgChangeValidatorWeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeValidatorWeight"))
              .build();
        }
      }
    }
    return getChangeValidatorWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgDeleteValidator,
      com.stride.stakeibc.MsgDeleteValidatorResponse> getDeleteValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteValidator",
      requestType = com.stride.stakeibc.MsgDeleteValidator.class,
      responseType = com.stride.stakeibc.MsgDeleteValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgDeleteValidator,
      com.stride.stakeibc.MsgDeleteValidatorResponse> getDeleteValidatorMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgDeleteValidator, com.stride.stakeibc.MsgDeleteValidatorResponse> getDeleteValidatorMethod;
    if ((getDeleteValidatorMethod = MsgGrpc.getDeleteValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteValidatorMethod = MsgGrpc.getDeleteValidatorMethod) == null) {
          MsgGrpc.getDeleteValidatorMethod = getDeleteValidatorMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgDeleteValidator, com.stride.stakeibc.MsgDeleteValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgDeleteValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgDeleteValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteValidator"))
              .build();
        }
      }
    }
    return getDeleteValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRestoreInterchainAccount,
      com.stride.stakeibc.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreInterchainAccount",
      requestType = com.stride.stakeibc.MsgRestoreInterchainAccount.class,
      responseType = com.stride.stakeibc.MsgRestoreInterchainAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRestoreInterchainAccount,
      com.stride.stakeibc.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgRestoreInterchainAccount, com.stride.stakeibc.MsgRestoreInterchainAccountResponse> getRestoreInterchainAccountMethod;
    if ((getRestoreInterchainAccountMethod = MsgGrpc.getRestoreInterchainAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRestoreInterchainAccountMethod = MsgGrpc.getRestoreInterchainAccountMethod) == null) {
          MsgGrpc.getRestoreInterchainAccountMethod = getRestoreInterchainAccountMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgRestoreInterchainAccount, com.stride.stakeibc.MsgRestoreInterchainAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreInterchainAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRestoreInterchainAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgRestoreInterchainAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RestoreInterchainAccount"))
              .build();
        }
      }
    }
    return getRestoreInterchainAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgUpdateValidatorSharesExchRate,
      com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateValidatorSharesExchRate",
      requestType = com.stride.stakeibc.MsgUpdateValidatorSharesExchRate.class,
      responseType = com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgUpdateValidatorSharesExchRate,
      com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgUpdateValidatorSharesExchRate, com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> getUpdateValidatorSharesExchRateMethod;
    if ((getUpdateValidatorSharesExchRateMethod = MsgGrpc.getUpdateValidatorSharesExchRateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateValidatorSharesExchRateMethod = MsgGrpc.getUpdateValidatorSharesExchRateMethod) == null) {
          MsgGrpc.getUpdateValidatorSharesExchRateMethod = getUpdateValidatorSharesExchRateMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgUpdateValidatorSharesExchRate, com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateValidatorSharesExchRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgUpdateValidatorSharesExchRate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateValidatorSharesExchRate"))
              .build();
        }
      }
    }
    return getUpdateValidatorSharesExchRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClearBalance,
      com.stride.stakeibc.MsgClearBalanceResponse> getClearBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearBalance",
      requestType = com.stride.stakeibc.MsgClearBalance.class,
      responseType = com.stride.stakeibc.MsgClearBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClearBalance,
      com.stride.stakeibc.MsgClearBalanceResponse> getClearBalanceMethod() {
    io.grpc.MethodDescriptor<com.stride.stakeibc.MsgClearBalance, com.stride.stakeibc.MsgClearBalanceResponse> getClearBalanceMethod;
    if ((getClearBalanceMethod = MsgGrpc.getClearBalanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearBalanceMethod = MsgGrpc.getClearBalanceMethod) == null) {
          MsgGrpc.getClearBalanceMethod = getClearBalanceMethod =
              io.grpc.MethodDescriptor.<com.stride.stakeibc.MsgClearBalance, com.stride.stakeibc.MsgClearBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgClearBalance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stride.stakeibc.MsgClearBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearBalance"))
              .build();
        }
      }
    }
    return getClearBalanceMethod;
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
    default void liquidStake(com.stride.stakeibc.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidStakeMethod(), responseObserver);
    }

    /**
     */
    default void redeemStake(com.stride.stakeibc.MsgRedeemStake request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRedeemStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeemStakeMethod(), responseObserver);
    }

    /**
     */
    default void registerHostZone(com.stride.stakeibc.MsgRegisterHostZone request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRegisterHostZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterHostZoneMethod(), responseObserver);
    }

    /**
     */
    default void claimUndelegatedTokens(com.stride.stakeibc.MsgClaimUndelegatedTokens request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimUndelegatedTokensMethod(), responseObserver);
    }

    /**
     */
    default void rebalanceValidators(com.stride.stakeibc.MsgRebalanceValidators request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRebalanceValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebalanceValidatorsMethod(), responseObserver);
    }

    /**
     */
    default void addValidators(com.stride.stakeibc.MsgAddValidators request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgAddValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddValidatorsMethod(), responseObserver);
    }

    /**
     */
    default void changeValidatorWeight(com.stride.stakeibc.MsgChangeValidatorWeight request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgChangeValidatorWeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeValidatorWeightMethod(), responseObserver);
    }

    /**
     */
    default void deleteValidator(com.stride.stakeibc.MsgDeleteValidator request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgDeleteValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteValidatorMethod(), responseObserver);
    }

    /**
     */
    default void restoreInterchainAccount(com.stride.stakeibc.MsgRestoreInterchainAccount request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRestoreInterchainAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreInterchainAccountMethod(), responseObserver);
    }

    /**
     */
    default void updateValidatorSharesExchRate(com.stride.stakeibc.MsgUpdateValidatorSharesExchRate request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateValidatorSharesExchRateMethod(), responseObserver);
    }

    /**
     */
    default void clearBalance(com.stride.stakeibc.MsgClearBalance request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClearBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearBalanceMethod(), responseObserver);
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
    public void liquidStake(com.stride.stakeibc.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeemStake(com.stride.stakeibc.MsgRedeemStake request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRedeemStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeemStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerHostZone(com.stride.stakeibc.MsgRegisterHostZone request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRegisterHostZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterHostZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimUndelegatedTokens(com.stride.stakeibc.MsgClaimUndelegatedTokens request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimUndelegatedTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rebalanceValidators(com.stride.stakeibc.MsgRebalanceValidators request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRebalanceValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebalanceValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addValidators(com.stride.stakeibc.MsgAddValidators request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgAddValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeValidatorWeight(com.stride.stakeibc.MsgChangeValidatorWeight request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgChangeValidatorWeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeValidatorWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteValidator(com.stride.stakeibc.MsgDeleteValidator request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgDeleteValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restoreInterchainAccount(com.stride.stakeibc.MsgRestoreInterchainAccount request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRestoreInterchainAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateValidatorSharesExchRate(com.stride.stakeibc.MsgUpdateValidatorSharesExchRate request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateValidatorSharesExchRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearBalance(com.stride.stakeibc.MsgClearBalance request,
        io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClearBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearBalanceMethod(), getCallOptions()), request, responseObserver);
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
    public com.stride.stakeibc.MsgLiquidStakeResponse liquidStake(com.stride.stakeibc.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgRedeemStakeResponse redeemStake(com.stride.stakeibc.MsgRedeemStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeemStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgRegisterHostZoneResponse registerHostZone(com.stride.stakeibc.MsgRegisterHostZone request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterHostZoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgClaimUndelegatedTokensResponse claimUndelegatedTokens(com.stride.stakeibc.MsgClaimUndelegatedTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimUndelegatedTokensMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgRebalanceValidatorsResponse rebalanceValidators(com.stride.stakeibc.MsgRebalanceValidators request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebalanceValidatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgAddValidatorsResponse addValidators(com.stride.stakeibc.MsgAddValidators request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddValidatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgChangeValidatorWeightResponse changeValidatorWeight(com.stride.stakeibc.MsgChangeValidatorWeight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeValidatorWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgDeleteValidatorResponse deleteValidator(com.stride.stakeibc.MsgDeleteValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgRestoreInterchainAccountResponse restoreInterchainAccount(com.stride.stakeibc.MsgRestoreInterchainAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreInterchainAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse updateValidatorSharesExchRate(com.stride.stakeibc.MsgUpdateValidatorSharesExchRate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateValidatorSharesExchRateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stride.stakeibc.MsgClearBalanceResponse clearBalance(com.stride.stakeibc.MsgClearBalance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearBalanceMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgLiquidStakeResponse> liquidStake(
        com.stride.stakeibc.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgRedeemStakeResponse> redeemStake(
        com.stride.stakeibc.MsgRedeemStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeemStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgRegisterHostZoneResponse> registerHostZone(
        com.stride.stakeibc.MsgRegisterHostZone request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterHostZoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgClaimUndelegatedTokensResponse> claimUndelegatedTokens(
        com.stride.stakeibc.MsgClaimUndelegatedTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimUndelegatedTokensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgRebalanceValidatorsResponse> rebalanceValidators(
        com.stride.stakeibc.MsgRebalanceValidators request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebalanceValidatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgAddValidatorsResponse> addValidators(
        com.stride.stakeibc.MsgAddValidators request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddValidatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgChangeValidatorWeightResponse> changeValidatorWeight(
        com.stride.stakeibc.MsgChangeValidatorWeight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeValidatorWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgDeleteValidatorResponse> deleteValidator(
        com.stride.stakeibc.MsgDeleteValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgRestoreInterchainAccountResponse> restoreInterchainAccount(
        com.stride.stakeibc.MsgRestoreInterchainAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse> updateValidatorSharesExchRate(
        com.stride.stakeibc.MsgUpdateValidatorSharesExchRate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateValidatorSharesExchRateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stride.stakeibc.MsgClearBalanceResponse> clearBalance(
        com.stride.stakeibc.MsgClearBalance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUID_STAKE = 0;
  private static final int METHODID_REDEEM_STAKE = 1;
  private static final int METHODID_REGISTER_HOST_ZONE = 2;
  private static final int METHODID_CLAIM_UNDELEGATED_TOKENS = 3;
  private static final int METHODID_REBALANCE_VALIDATORS = 4;
  private static final int METHODID_ADD_VALIDATORS = 5;
  private static final int METHODID_CHANGE_VALIDATOR_WEIGHT = 6;
  private static final int METHODID_DELETE_VALIDATOR = 7;
  private static final int METHODID_RESTORE_INTERCHAIN_ACCOUNT = 8;
  private static final int METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE = 9;
  private static final int METHODID_CLEAR_BALANCE = 10;

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
        case METHODID_LIQUID_STAKE:
          serviceImpl.liquidStake((com.stride.stakeibc.MsgLiquidStake) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgLiquidStakeResponse>) responseObserver);
          break;
        case METHODID_REDEEM_STAKE:
          serviceImpl.redeemStake((com.stride.stakeibc.MsgRedeemStake) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRedeemStakeResponse>) responseObserver);
          break;
        case METHODID_REGISTER_HOST_ZONE:
          serviceImpl.registerHostZone((com.stride.stakeibc.MsgRegisterHostZone) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRegisterHostZoneResponse>) responseObserver);
          break;
        case METHODID_CLAIM_UNDELEGATED_TOKENS:
          serviceImpl.claimUndelegatedTokens((com.stride.stakeibc.MsgClaimUndelegatedTokens) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClaimUndelegatedTokensResponse>) responseObserver);
          break;
        case METHODID_REBALANCE_VALIDATORS:
          serviceImpl.rebalanceValidators((com.stride.stakeibc.MsgRebalanceValidators) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRebalanceValidatorsResponse>) responseObserver);
          break;
        case METHODID_ADD_VALIDATORS:
          serviceImpl.addValidators((com.stride.stakeibc.MsgAddValidators) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgAddValidatorsResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VALIDATOR_WEIGHT:
          serviceImpl.changeValidatorWeight((com.stride.stakeibc.MsgChangeValidatorWeight) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgChangeValidatorWeightResponse>) responseObserver);
          break;
        case METHODID_DELETE_VALIDATOR:
          serviceImpl.deleteValidator((com.stride.stakeibc.MsgDeleteValidator) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgDeleteValidatorResponse>) responseObserver);
          break;
        case METHODID_RESTORE_INTERCHAIN_ACCOUNT:
          serviceImpl.restoreInterchainAccount((com.stride.stakeibc.MsgRestoreInterchainAccount) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgRestoreInterchainAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE:
          serviceImpl.updateValidatorSharesExchRate((com.stride.stakeibc.MsgUpdateValidatorSharesExchRate) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse>) responseObserver);
          break;
        case METHODID_CLEAR_BALANCE:
          serviceImpl.clearBalance((com.stride.stakeibc.MsgClearBalance) request,
              (io.grpc.stub.StreamObserver<com.stride.stakeibc.MsgClearBalanceResponse>) responseObserver);
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
          getLiquidStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgLiquidStake,
              com.stride.stakeibc.MsgLiquidStakeResponse>(
                service, METHODID_LIQUID_STAKE)))
        .addMethod(
          getRedeemStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgRedeemStake,
              com.stride.stakeibc.MsgRedeemStakeResponse>(
                service, METHODID_REDEEM_STAKE)))
        .addMethod(
          getRegisterHostZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgRegisterHostZone,
              com.stride.stakeibc.MsgRegisterHostZoneResponse>(
                service, METHODID_REGISTER_HOST_ZONE)))
        .addMethod(
          getClaimUndelegatedTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgClaimUndelegatedTokens,
              com.stride.stakeibc.MsgClaimUndelegatedTokensResponse>(
                service, METHODID_CLAIM_UNDELEGATED_TOKENS)))
        .addMethod(
          getRebalanceValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgRebalanceValidators,
              com.stride.stakeibc.MsgRebalanceValidatorsResponse>(
                service, METHODID_REBALANCE_VALIDATORS)))
        .addMethod(
          getAddValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgAddValidators,
              com.stride.stakeibc.MsgAddValidatorsResponse>(
                service, METHODID_ADD_VALIDATORS)))
        .addMethod(
          getChangeValidatorWeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgChangeValidatorWeight,
              com.stride.stakeibc.MsgChangeValidatorWeightResponse>(
                service, METHODID_CHANGE_VALIDATOR_WEIGHT)))
        .addMethod(
          getDeleteValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgDeleteValidator,
              com.stride.stakeibc.MsgDeleteValidatorResponse>(
                service, METHODID_DELETE_VALIDATOR)))
        .addMethod(
          getRestoreInterchainAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgRestoreInterchainAccount,
              com.stride.stakeibc.MsgRestoreInterchainAccountResponse>(
                service, METHODID_RESTORE_INTERCHAIN_ACCOUNT)))
        .addMethod(
          getUpdateValidatorSharesExchRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgUpdateValidatorSharesExchRate,
              com.stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse>(
                service, METHODID_UPDATE_VALIDATOR_SHARES_EXCH_RATE)))
        .addMethod(
          getClearBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stride.stakeibc.MsgClearBalance,
              com.stride.stakeibc.MsgClearBalanceResponse>(
                service, METHODID_CLEAR_BALANCE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stride.stakeibc.TxProto.getDescriptor();
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
              .addMethod(getLiquidStakeMethod())
              .addMethod(getRedeemStakeMethod())
              .addMethod(getRegisterHostZoneMethod())
              .addMethod(getClaimUndelegatedTokensMethod())
              .addMethod(getRebalanceValidatorsMethod())
              .addMethod(getAddValidatorsMethod())
              .addMethod(getChangeValidatorWeightMethod())
              .addMethod(getDeleteValidatorMethod())
              .addMethod(getRestoreInterchainAccountMethod())
              .addMethod(getUpdateValidatorSharesExchRateMethod())
              .addMethod(getClearBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
