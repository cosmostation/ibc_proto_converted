package com.osmosis.superfluid;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/superfluid/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.superfluid.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> getSuperfluidDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidDelegate",
      requestType = com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate.class,
      responseType = com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> getSuperfluidDelegateMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> getSuperfluidDelegateMethod;
    if ((getSuperfluidDelegateMethod = MsgGrpc.getSuperfluidDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSuperfluidDelegateMethod = MsgGrpc.getSuperfluidDelegateMethod) == null) {
          MsgGrpc.getSuperfluidDelegateMethod = getSuperfluidDelegateMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidDelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SuperfluidDelegate"))
              .build();
        }
      }
    }
    return getSuperfluidDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> getSuperfluidUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidUndelegate",
      requestType = com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate.class,
      responseType = com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> getSuperfluidUndelegateMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate, com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> getSuperfluidUndelegateMethod;
    if ((getSuperfluidUndelegateMethod = MsgGrpc.getSuperfluidUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSuperfluidUndelegateMethod = MsgGrpc.getSuperfluidUndelegateMethod) == null) {
          MsgGrpc.getSuperfluidUndelegateMethod = getSuperfluidUndelegateMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate, com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidUndelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SuperfluidUndelegate"))
              .build();
        }
      }
    }
    return getSuperfluidUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> getSuperfluidUnbondLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidUnbondLock",
      requestType = com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock.class,
      responseType = com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> getSuperfluidUnbondLockMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock, com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> getSuperfluidUnbondLockMethod;
    if ((getSuperfluidUnbondLockMethod = MsgGrpc.getSuperfluidUnbondLockMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSuperfluidUnbondLockMethod = MsgGrpc.getSuperfluidUnbondLockMethod) == null) {
          MsgGrpc.getSuperfluidUnbondLockMethod = getSuperfluidUnbondLockMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock, com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidUnbondLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SuperfluidUnbondLock"))
              .build();
        }
      }
    }
    return getSuperfluidUnbondLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> getSuperfluidUndelegateAndUnbondLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidUndelegateAndUnbondLock",
      requestType = com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock.class,
      responseType = com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock,
      com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> getSuperfluidUndelegateAndUnbondLockMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock, com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> getSuperfluidUndelegateAndUnbondLockMethod;
    if ((getSuperfluidUndelegateAndUnbondLockMethod = MsgGrpc.getSuperfluidUndelegateAndUnbondLockMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSuperfluidUndelegateAndUnbondLockMethod = MsgGrpc.getSuperfluidUndelegateAndUnbondLockMethod) == null) {
          MsgGrpc.getSuperfluidUndelegateAndUnbondLockMethod = getSuperfluidUndelegateAndUnbondLockMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock, com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidUndelegateAndUnbondLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SuperfluidUndelegateAndUnbondLock"))
              .build();
        }
      }
    }
    return getSuperfluidUndelegateAndUnbondLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> getLockAndSuperfluidDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockAndSuperfluidDelegate",
      requestType = com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate.class,
      responseType = com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> getLockAndSuperfluidDelegateMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> getLockAndSuperfluidDelegateMethod;
    if ((getLockAndSuperfluidDelegateMethod = MsgGrpc.getLockAndSuperfluidDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLockAndSuperfluidDelegateMethod = MsgGrpc.getLockAndSuperfluidDelegateMethod) == null) {
          MsgGrpc.getLockAndSuperfluidDelegateMethod = getLockAndSuperfluidDelegateMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockAndSuperfluidDelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LockAndSuperfluidDelegate"))
              .build();
        }
      }
    }
    return getLockAndSuperfluidDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> getCreateFullRangePositionAndSuperfluidDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFullRangePositionAndSuperfluidDelegate",
      requestType = com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate.class,
      responseType = com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate,
      com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> getCreateFullRangePositionAndSuperfluidDelegateMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> getCreateFullRangePositionAndSuperfluidDelegateMethod;
    if ((getCreateFullRangePositionAndSuperfluidDelegateMethod = MsgGrpc.getCreateFullRangePositionAndSuperfluidDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateFullRangePositionAndSuperfluidDelegateMethod = MsgGrpc.getCreateFullRangePositionAndSuperfluidDelegateMethod) == null) {
          MsgGrpc.getCreateFullRangePositionAndSuperfluidDelegateMethod = getCreateFullRangePositionAndSuperfluidDelegateMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate, com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFullRangePositionAndSuperfluidDelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateFullRangePositionAndSuperfluidDelegate"))
              .build();
        }
      }
    }
    return getCreateFullRangePositionAndSuperfluidDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool,
      com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> getUnPoolWhitelistedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnPoolWhitelistedPool",
      requestType = com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool.class,
      responseType = com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool,
      com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> getUnPoolWhitelistedPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool, com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> getUnPoolWhitelistedPoolMethod;
    if ((getUnPoolWhitelistedPoolMethod = MsgGrpc.getUnPoolWhitelistedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnPoolWhitelistedPoolMethod = MsgGrpc.getUnPoolWhitelistedPoolMethod) == null) {
          MsgGrpc.getUnPoolWhitelistedPoolMethod = getUnPoolWhitelistedPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool, com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnPoolWhitelistedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnPoolWhitelistedPool"))
              .build();
        }
      }
    }
    return getUnPoolWhitelistedPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
      com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockAndMigrateSharesToFullRangeConcentratedPosition",
      requestType = com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition.class,
      responseType = com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
      com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition, com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod;
    if ((getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod = MsgGrpc.getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod = MsgGrpc.getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod) == null) {
          MsgGrpc.getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod = getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition, com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockAndMigrateSharesToFullRangeConcentratedPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnlockAndMigrateSharesToFullRangeConcentratedPosition"))
              .build();
        }
      }
    }
    return getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition,
      com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> getAddToConcentratedLiquiditySuperfluidPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToConcentratedLiquiditySuperfluidPosition",
      requestType = com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition.class,
      responseType = com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition,
      com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> getAddToConcentratedLiquiditySuperfluidPositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition, com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> getAddToConcentratedLiquiditySuperfluidPositionMethod;
    if ((getAddToConcentratedLiquiditySuperfluidPositionMethod = MsgGrpc.getAddToConcentratedLiquiditySuperfluidPositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToConcentratedLiquiditySuperfluidPositionMethod = MsgGrpc.getAddToConcentratedLiquiditySuperfluidPositionMethod) == null) {
          MsgGrpc.getAddToConcentratedLiquiditySuperfluidPositionMethod = getAddToConcentratedLiquiditySuperfluidPositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition, com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToConcentratedLiquiditySuperfluidPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToConcentratedLiquiditySuperfluidPosition"))
              .build();
        }
      }
    }
    return getAddToConcentratedLiquiditySuperfluidPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake,
      com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> getUnbondConvertAndStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondConvertAndStake",
      requestType = com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake.class,
      responseType = com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake,
      com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> getUnbondConvertAndStakeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake, com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> getUnbondConvertAndStakeMethod;
    if ((getUnbondConvertAndStakeMethod = MsgGrpc.getUnbondConvertAndStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnbondConvertAndStakeMethod = MsgGrpc.getUnbondConvertAndStakeMethod) == null) {
          MsgGrpc.getUnbondConvertAndStakeMethod = getUnbondConvertAndStakeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake, com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondConvertAndStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnbondConvertAndStake"))
              .build();
        }
      }
    }
    return getUnbondConvertAndStakeMethod;
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
     * Execute superfluid delegation for a lockup
     * </pre>
     */
    default void superfluidDelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute superfluid undelegation for a lockup
     * </pre>
     */
    default void superfluidUndelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidUndelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * For a given lock that is being superfluidly undelegated,
     * also unbond the underlying lock.
     * </pre>
     */
    default void superfluidUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidUnbondLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Superfluid undelegate and unbond partial amount of the underlying lock.
     * </pre>
     */
    default void superfluidUndelegateAndUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidUndelegateAndUnbondLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute lockup lock and superfluid delegation in a single msg
     * </pre>
     */
    default void lockAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockAndSuperfluidDelegateMethod(), responseObserver);
    }

    /**
     */
    default void createFullRangePositionAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFullRangePositionAndSuperfluidDelegateMethod(), responseObserver);
    }

    /**
     */
    default void unPoolWhitelistedPool(com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnPoolWhitelistedPoolMethod(), responseObserver);
    }

    /**
     */
    default void unlockAndMigrateSharesToFullRangeConcentratedPosition(com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod(), responseObserver);
    }

    /**
     */
    default void addToConcentratedLiquiditySuperfluidPosition(com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToConcentratedLiquiditySuperfluidPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondConvertAndStake breaks all locks / superfluid staked assets,
     * converts them to osmo then stakes the osmo to the designated validator.
     * </pre>
     */
    default void unbondConvertAndStake(com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondConvertAndStakeMethod(), responseObserver);
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
     * Execute superfluid delegation for a lockup
     * </pre>
     */
    public void superfluidDelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute superfluid undelegation for a lockup
     * </pre>
     */
    public void superfluidUndelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * For a given lock that is being superfluidly undelegated,
     * also unbond the underlying lock.
     * </pre>
     */
    public void superfluidUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidUnbondLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Superfluid undelegate and unbond partial amount of the underlying lock.
     * </pre>
     */
    public void superfluidUndelegateAndUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidUndelegateAndUnbondLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute lockup lock and superfluid delegation in a single msg
     * </pre>
     */
    public void lockAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockAndSuperfluidDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFullRangePositionAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFullRangePositionAndSuperfluidDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unPoolWhitelistedPool(com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnPoolWhitelistedPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlockAndMigrateSharesToFullRangeConcentratedPosition(com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToConcentratedLiquiditySuperfluidPosition(com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToConcentratedLiquiditySuperfluidPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondConvertAndStake breaks all locks / superfluid staked assets,
     * converts them to osmo then stakes the osmo to the designated validator.
     * </pre>
     */
    public void unbondConvertAndStake(com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondConvertAndStakeMethod(), getCallOptions()), request, responseObserver);
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
     * Execute superfluid delegation for a lockup
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse superfluidDelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute superfluid undelegation for a lockup
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse superfluidUndelegate(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidUndelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * For a given lock that is being superfluidly undelegated,
     * also unbond the underlying lock.
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse superfluidUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidUnbondLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Superfluid undelegate and unbond partial amount of the underlying lock.
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse superfluidUndelegateAndUnbondLock(com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidUndelegateAndUnbondLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute lockup lock and superfluid delegation in a single msg
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse lockAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockAndSuperfluidDelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse createFullRangePositionAndSuperfluidDelegate(com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFullRangePositionAndSuperfluidDelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse unPoolWhitelistedPool(com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnPoolWhitelistedPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse unlockAndMigrateSharesToFullRangeConcentratedPosition(com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse addToConcentratedLiquiditySuperfluidPosition(com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToConcentratedLiquiditySuperfluidPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondConvertAndStake breaks all locks / superfluid staked assets,
     * converts them to osmo then stakes the osmo to the designated validator.
     * </pre>
     */
    public com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse unbondConvertAndStake(com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondConvertAndStakeMethod(), getCallOptions(), request);
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
     * Execute superfluid delegation for a lockup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse> superfluidDelegate(
        com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute superfluid undelegation for a lockup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse> superfluidUndelegate(
        com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidUndelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * For a given lock that is being superfluidly undelegated,
     * also unbond the underlying lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse> superfluidUnbondLock(
        com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidUnbondLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Superfluid undelegate and unbond partial amount of the underlying lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse> superfluidUndelegateAndUnbondLock(
        com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidUndelegateAndUnbondLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute lockup lock and superfluid delegation in a single msg
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse> lockAndSuperfluidDelegate(
        com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockAndSuperfluidDelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse> createFullRangePositionAndSuperfluidDelegate(
        com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFullRangePositionAndSuperfluidDelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse> unPoolWhitelistedPool(
        com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnPoolWhitelistedPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse> unlockAndMigrateSharesToFullRangeConcentratedPosition(
        com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse> addToConcentratedLiquiditySuperfluidPosition(
        com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToConcentratedLiquiditySuperfluidPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondConvertAndStake breaks all locks / superfluid staked assets,
     * converts them to osmo then stakes the osmo to the designated validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse> unbondConvertAndStake(
        com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondConvertAndStakeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPERFLUID_DELEGATE = 0;
  private static final int METHODID_SUPERFLUID_UNDELEGATE = 1;
  private static final int METHODID_SUPERFLUID_UNBOND_LOCK = 2;
  private static final int METHODID_SUPERFLUID_UNDELEGATE_AND_UNBOND_LOCK = 3;
  private static final int METHODID_LOCK_AND_SUPERFLUID_DELEGATE = 4;
  private static final int METHODID_CREATE_FULL_RANGE_POSITION_AND_SUPERFLUID_DELEGATE = 5;
  private static final int METHODID_UN_POOL_WHITELISTED_POOL = 6;
  private static final int METHODID_UNLOCK_AND_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION = 7;
  private static final int METHODID_ADD_TO_CONCENTRATED_LIQUIDITY_SUPERFLUID_POSITION = 8;
  private static final int METHODID_UNBOND_CONVERT_AND_STAKE = 9;

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
        case METHODID_SUPERFLUID_DELEGATE:
          serviceImpl.superfluidDelegate((com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_UNDELEGATE:
          serviceImpl.superfluidUndelegate((com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_UNBOND_LOCK:
          serviceImpl.superfluidUnbondLock((com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_UNDELEGATE_AND_UNBOND_LOCK:
          serviceImpl.superfluidUndelegateAndUnbondLock((com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse>) responseObserver);
          break;
        case METHODID_LOCK_AND_SUPERFLUID_DELEGATE:
          serviceImpl.lockAndSuperfluidDelegate((com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse>) responseObserver);
          break;
        case METHODID_CREATE_FULL_RANGE_POSITION_AND_SUPERFLUID_DELEGATE:
          serviceImpl.createFullRangePositionAndSuperfluidDelegate((com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse>) responseObserver);
          break;
        case METHODID_UN_POOL_WHITELISTED_POOL:
          serviceImpl.unPoolWhitelistedPool((com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_AND_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION:
          serviceImpl.unlockAndMigrateSharesToFullRangeConcentratedPosition((com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_CONCENTRATED_LIQUIDITY_SUPERFLUID_POSITION:
          serviceImpl.addToConcentratedLiquiditySuperfluidPosition((com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse>) responseObserver);
          break;
        case METHODID_UNBOND_CONVERT_AND_STAKE:
          serviceImpl.unbondConvertAndStake((com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse>) responseObserver);
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
          getSuperfluidDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgSuperfluidDelegate,
              com.osmosis.superfluid.TxProto.MsgSuperfluidDelegateResponse>(
                service, METHODID_SUPERFLUID_DELEGATE)))
        .addMethod(
          getSuperfluidUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegate,
              com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateResponse>(
                service, METHODID_SUPERFLUID_UNDELEGATE)))
        .addMethod(
          getSuperfluidUnbondLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLock,
              com.osmosis.superfluid.TxProto.MsgSuperfluidUnbondLockResponse>(
                service, METHODID_SUPERFLUID_UNBOND_LOCK)))
        .addMethod(
          getSuperfluidUndelegateAndUnbondLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLock,
              com.osmosis.superfluid.TxProto.MsgSuperfluidUndelegateAndUnbondLockResponse>(
                service, METHODID_SUPERFLUID_UNDELEGATE_AND_UNBOND_LOCK)))
        .addMethod(
          getLockAndSuperfluidDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegate,
              com.osmosis.superfluid.TxProto.MsgLockAndSuperfluidDelegateResponse>(
                service, METHODID_LOCK_AND_SUPERFLUID_DELEGATE)))
        .addMethod(
          getCreateFullRangePositionAndSuperfluidDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegate,
              com.osmosis.superfluid.TxProto.MsgCreateFullRangePositionAndSuperfluidDelegateResponse>(
                service, METHODID_CREATE_FULL_RANGE_POSITION_AND_SUPERFLUID_DELEGATE)))
        .addMethod(
          getUnPoolWhitelistedPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPool,
              com.osmosis.superfluid.TxProto.MsgUnPoolWhitelistedPoolResponse>(
                service, METHODID_UN_POOL_WHITELISTED_POOL)))
        .addMethod(
          getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
              com.osmosis.superfluid.TxProto.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse>(
                service, METHODID_UNLOCK_AND_MIGRATE_SHARES_TO_FULL_RANGE_CONCENTRATED_POSITION)))
        .addMethod(
          getAddToConcentratedLiquiditySuperfluidPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPosition,
              com.osmosis.superfluid.TxProto.MsgAddToConcentratedLiquiditySuperfluidPositionResponse>(
                service, METHODID_ADD_TO_CONCENTRATED_LIQUIDITY_SUPERFLUID_POSITION)))
        .addMethod(
          getUnbondConvertAndStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStake,
              com.osmosis.superfluid.TxProto.MsgUnbondConvertAndStakeResponse>(
                service, METHODID_UNBOND_CONVERT_AND_STAKE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.superfluid.TxProto.getDescriptor();
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
              .addMethod(getSuperfluidDelegateMethod())
              .addMethod(getSuperfluidUndelegateMethod())
              .addMethod(getSuperfluidUnbondLockMethod())
              .addMethod(getSuperfluidUndelegateAndUnbondLockMethod())
              .addMethod(getLockAndSuperfluidDelegateMethod())
              .addMethod(getCreateFullRangePositionAndSuperfluidDelegateMethod())
              .addMethod(getUnPoolWhitelistedPoolMethod())
              .addMethod(getUnlockAndMigrateSharesToFullRangeConcentratedPositionMethod())
              .addMethod(getAddToConcentratedLiquiditySuperfluidPositionMethod())
              .addMethod(getUnbondConvertAndStakeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
