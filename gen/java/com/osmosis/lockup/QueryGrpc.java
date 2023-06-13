package com.osmosis.lockup;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/lockup/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.lockup.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleBalanceRequest,
      com.osmosis.lockup.QueryProto.ModuleBalanceResponse> getModuleBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleBalance",
      requestType = com.osmosis.lockup.QueryProto.ModuleBalanceRequest.class,
      responseType = com.osmosis.lockup.QueryProto.ModuleBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleBalanceRequest,
      com.osmosis.lockup.QueryProto.ModuleBalanceResponse> getModuleBalanceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleBalanceRequest, com.osmosis.lockup.QueryProto.ModuleBalanceResponse> getModuleBalanceMethod;
    if ((getModuleBalanceMethod = QueryGrpc.getModuleBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleBalanceMethod = QueryGrpc.getModuleBalanceMethod) == null) {
          QueryGrpc.getModuleBalanceMethod = getModuleBalanceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.ModuleBalanceRequest, com.osmosis.lockup.QueryProto.ModuleBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.ModuleBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.ModuleBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleBalance"))
              .build();
        }
      }
    }
    return getModuleBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest,
      com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> getModuleLockedAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleLockedAmount",
      requestType = com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest.class,
      responseType = com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest,
      com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> getModuleLockedAmountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest, com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> getModuleLockedAmountMethod;
    if ((getModuleLockedAmountMethod = QueryGrpc.getModuleLockedAmountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleLockedAmountMethod = QueryGrpc.getModuleLockedAmountMethod) == null) {
          QueryGrpc.getModuleLockedAmountMethod = getModuleLockedAmountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest, com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleLockedAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleLockedAmount"))
              .build();
        }
      }
    }
    return getModuleLockedAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockableCoins",
      requestType = com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest, com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod;
    if ((getAccountUnlockableCoinsMethod = QueryGrpc.getAccountUnlockableCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockableCoinsMethod = QueryGrpc.getAccountUnlockableCoinsMethod) == null) {
          QueryGrpc.getAccountUnlockableCoinsMethod = getAccountUnlockableCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest, com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockableCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockableCoins"))
              .build();
        }
      }
    }
    return getAccountUnlockableCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockingCoins",
      requestType = com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest, com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod;
    if ((getAccountUnlockingCoinsMethod = QueryGrpc.getAccountUnlockingCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockingCoinsMethod = QueryGrpc.getAccountUnlockingCoinsMethod) == null) {
          QueryGrpc.getAccountUnlockingCoinsMethod = getAccountUnlockingCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest, com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockingCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockingCoins"))
              .build();
        }
      }
    }
    return getAccountUnlockingCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> getAccountLockedCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedCoins",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest,
      com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> getAccountLockedCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest, com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> getAccountLockedCoinsMethod;
    if ((getAccountLockedCoinsMethod = QueryGrpc.getAccountLockedCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedCoinsMethod = QueryGrpc.getAccountLockedCoinsMethod) == null) {
          QueryGrpc.getAccountLockedCoinsMethod = getAccountLockedCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest, com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedCoins"))
              .build();
        }
      }
    }
    return getAccountLockedCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTime",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod;
    if ((getAccountLockedPastTimeMethod = QueryGrpc.getAccountLockedPastTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeMethod = QueryGrpc.getAccountLockedPastTimeMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeMethod = getAccountLockedPastTimeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTime"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTimeNotUnlockingOnly",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod;
    if ((getAccountLockedPastTimeNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod = getAccountLockedPastTimeNotUnlockingOnlyMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTimeNotUnlockingOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTimeNotUnlockingOnly"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeNotUnlockingOnlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockedBeforeTime",
      requestType = com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest,
      com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest, com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod;
    if ((getAccountUnlockedBeforeTimeMethod = QueryGrpc.getAccountUnlockedBeforeTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockedBeforeTimeMethod = QueryGrpc.getAccountUnlockedBeforeTimeMethod) == null) {
          QueryGrpc.getAccountUnlockedBeforeTimeMethod = getAccountUnlockedBeforeTimeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest, com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockedBeforeTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockedBeforeTime"))
              .build();
        }
      }
    }
    return getAccountUnlockedBeforeTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTimeDenom",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest,
      com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod;
    if ((getAccountLockedPastTimeDenomMethod = QueryGrpc.getAccountLockedPastTimeDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeDenomMethod = QueryGrpc.getAccountLockedPastTimeDenomMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeDenomMethod = getAccountLockedPastTimeDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest, com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTimeDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTimeDenom"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedDenomRequest,
      com.osmosis.lockup.QueryProto.LockedDenomResponse> getLockedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockedDenom",
      requestType = com.osmosis.lockup.QueryProto.LockedDenomRequest.class,
      responseType = com.osmosis.lockup.QueryProto.LockedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedDenomRequest,
      com.osmosis.lockup.QueryProto.LockedDenomResponse> getLockedDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedDenomRequest, com.osmosis.lockup.QueryProto.LockedDenomResponse> getLockedDenomMethod;
    if ((getLockedDenomMethod = QueryGrpc.getLockedDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockedDenomMethod = QueryGrpc.getLockedDenomMethod) == null) {
          QueryGrpc.getLockedDenomMethod = getLockedDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.LockedDenomRequest, com.osmosis.lockup.QueryProto.LockedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.LockedDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.LockedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockedDenom"))
              .build();
        }
      }
    }
    return getLockedDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedRequest,
      com.osmosis.lockup.QueryProto.LockedResponse> getLockedByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockedByID",
      requestType = com.osmosis.lockup.QueryProto.LockedRequest.class,
      responseType = com.osmosis.lockup.QueryProto.LockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedRequest,
      com.osmosis.lockup.QueryProto.LockedResponse> getLockedByIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.LockedRequest, com.osmosis.lockup.QueryProto.LockedResponse> getLockedByIDMethod;
    if ((getLockedByIDMethod = QueryGrpc.getLockedByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockedByIDMethod = QueryGrpc.getLockedByIDMethod) == null) {
          QueryGrpc.getLockedByIDMethod = getLockedByIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.LockedRequest, com.osmosis.lockup.QueryProto.LockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockedByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.LockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.LockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockedByID"))
              .build();
        }
      }
    }
    return getLockedByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.NextLockIDRequest,
      com.osmosis.lockup.QueryProto.NextLockIDResponse> getNextLockIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextLockID",
      requestType = com.osmosis.lockup.QueryProto.NextLockIDRequest.class,
      responseType = com.osmosis.lockup.QueryProto.NextLockIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.NextLockIDRequest,
      com.osmosis.lockup.QueryProto.NextLockIDResponse> getNextLockIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.NextLockIDRequest, com.osmosis.lockup.QueryProto.NextLockIDResponse> getNextLockIDMethod;
    if ((getNextLockIDMethod = QueryGrpc.getNextLockIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNextLockIDMethod = QueryGrpc.getNextLockIDMethod) == null) {
          QueryGrpc.getNextLockIDMethod = getNextLockIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.NextLockIDRequest, com.osmosis.lockup.QueryProto.NextLockIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextLockID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.NextLockIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.NextLockIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NextLockID"))
              .build();
        }
      }
    }
    return getNextLockIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest,
      com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyntheticLockupsByLockupID",
      requestType = com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest.class,
      responseType = com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest,
      com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest, com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod;
    if ((getSyntheticLockupsByLockupIDMethod = QueryGrpc.getSyntheticLockupsByLockupIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSyntheticLockupsByLockupIDMethod = QueryGrpc.getSyntheticLockupsByLockupIDMethod) == null) {
          QueryGrpc.getSyntheticLockupsByLockupIDMethod = getSyntheticLockupsByLockupIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest, com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyntheticLockupsByLockupID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SyntheticLockupsByLockupID"))
              .build();
        }
      }
    }
    return getSyntheticLockupsByLockupIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest,
      com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyntheticLockupByLockupID",
      requestType = com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest.class,
      responseType = com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest,
      com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest, com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod;
    if ((getSyntheticLockupByLockupIDMethod = QueryGrpc.getSyntheticLockupByLockupIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSyntheticLockupByLockupIDMethod = QueryGrpc.getSyntheticLockupByLockupIDMethod) == null) {
          QueryGrpc.getSyntheticLockupByLockupIDMethod = getSyntheticLockupByLockupIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest, com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyntheticLockupByLockupID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SyntheticLockupByLockupID"))
              .build();
        }
      }
    }
    return getSyntheticLockupByLockupIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDuration",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod;
    if ((getAccountLockedLongerDurationMethod = QueryGrpc.getAccountLockedLongerDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationMethod = QueryGrpc.getAccountLockedLongerDurationMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationMethod = getAccountLockedLongerDurationMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDuration"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedDurationRequest,
      com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> getAccountLockedDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedDuration",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedDurationRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedDurationRequest,
      com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> getAccountLockedDurationMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedDurationRequest, com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> getAccountLockedDurationMethod;
    if ((getAccountLockedDurationMethod = QueryGrpc.getAccountLockedDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedDurationMethod = QueryGrpc.getAccountLockedDurationMethod) == null) {
          QueryGrpc.getAccountLockedDurationMethod = getAccountLockedDurationMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedDurationRequest, com.osmosis.lockup.QueryProto.AccountLockedDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedDuration"))
              .build();
        }
      }
    }
    return getAccountLockedDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDurationNotUnlockingOnly",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod;
    if ((getAccountLockedLongerDurationNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod = getAccountLockedLongerDurationNotUnlockingOnlyMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDurationNotUnlockingOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDurationNotUnlockingOnly"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationNotUnlockingOnlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDurationDenom",
      requestType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest.class,
      responseType = com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest,
      com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod;
    if ((getAccountLockedLongerDurationDenomMethod = QueryGrpc.getAccountLockedLongerDurationDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationDenomMethod = QueryGrpc.getAccountLockedLongerDurationDenomMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationDenomMethod = getAccountLockedLongerDurationDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest, com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDurationDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDurationDenom"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.QueryParamsRequest,
      com.osmosis.lockup.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.lockup.QueryProto.QueryParamsRequest.class,
      responseType = com.osmosis.lockup.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.QueryParamsRequest,
      com.osmosis.lockup.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryProto.QueryParamsRequest, com.osmosis.lockup.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryProto.QueryParamsRequest, com.osmosis.lockup.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Return full balance of the module
     * </pre>
     */
    default void moduleBalance(com.osmosis.lockup.QueryProto.ModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    default void moduleLockedAmount(com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleLockedAmountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    default void accountUnlockableCoins(com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockableCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    default void accountUnlockingCoins(com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockingCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    default void accountLockedCoins(com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    default void accountLockedPastTime(com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    default void accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    default void accountUnlockedBeforeTime(com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockedBeforeTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    default void accountLockedPastTimeDenom(com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    default void lockedDenom(com.osmosis.lockup.QueryProto.LockedDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockedDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    default void lockedByID(com.osmosis.lockup.QueryProto.LockedRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockedByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    default void nextLockID(com.osmosis.lockup.QueryProto.NextLockIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.NextLockIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextLockIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * Deprecated: use SyntheticLockupByLockupID instead
     * </pre>
     */
    @java.lang.Deprecated
    default void syntheticLockupsByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyntheticLockupsByLockupIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    default void syntheticLockupByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyntheticLockupByLockupIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    default void accountLockedLongerDuration(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    default void accountLockedDuration(com.osmosis.lockup.QueryProto.AccountLockedDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    default void accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    default void accountLockedLongerDurationDenom(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    default void params(com.osmosis.lockup.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return full balance of the module
     * </pre>
     */
    public void moduleBalance(com.osmosis.lockup.QueryProto.ModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public void moduleLockedAmount(com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleLockedAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public void accountUnlockableCoins(com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockableCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public void accountUnlockingCoins(com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockingCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public void accountLockedCoins(com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public void accountLockedPastTime(com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public void accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public void accountUnlockedBeforeTime(com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockedBeforeTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public void accountLockedPastTimeDenom(com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public void lockedDenom(com.osmosis.lockup.QueryProto.LockedDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockedDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public void lockedByID(com.osmosis.lockup.QueryProto.LockedRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockedByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public void nextLockID(com.osmosis.lockup.QueryProto.NextLockIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.NextLockIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextLockIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * Deprecated: use SyntheticLockupByLockupID instead
     * </pre>
     */
    @java.lang.Deprecated
    public void syntheticLockupsByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyntheticLockupsByLockupIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public void syntheticLockupByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyntheticLockupByLockupIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public void accountLockedLongerDuration(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public void accountLockedDuration(com.osmosis.lockup.QueryProto.AccountLockedDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public void accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public void accountLockedLongerDurationDenom(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public void params(com.osmosis.lockup.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return full balance of the module
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.ModuleBalanceResponse moduleBalance(com.osmosis.lockup.QueryProto.ModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse moduleLockedAmount(com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleLockedAmountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse accountUnlockableCoins(com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockableCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse accountUnlockingCoins(com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockingCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse accountLockedCoins(com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse accountLockedPastTime(com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse accountUnlockedBeforeTime(com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockedBeforeTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse accountLockedPastTimeDenom(com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.LockedDenomResponse lockedDenom(com.osmosis.lockup.QueryProto.LockedDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockedDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.LockedResponse lockedByID(com.osmosis.lockup.QueryProto.LockedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockedByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.NextLockIDResponse nextLockID(com.osmosis.lockup.QueryProto.NextLockIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextLockIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * Deprecated: use SyntheticLockupByLockupID instead
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse syntheticLockupsByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyntheticLockupsByLockupIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse syntheticLockupByLockupID(com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyntheticLockupByLockupIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse accountLockedLongerDuration(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedDurationResponse accountLockedDuration(com.osmosis.lockup.QueryProto.AccountLockedDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse accountLockedLongerDurationDenom(com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public com.osmosis.lockup.QueryProto.QueryParamsResponse params(com.osmosis.lockup.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return full balance of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.ModuleBalanceResponse> moduleBalance(
        com.osmosis.lockup.QueryProto.ModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse> moduleLockedAmount(
        com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleLockedAmountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse> accountUnlockableCoins(
        com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockableCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse> accountUnlockingCoins(
        com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockingCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse> accountLockedCoins(
        com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse> accountLockedPastTime(
        com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse> accountLockedPastTimeNotUnlockingOnly(
        com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse> accountUnlockedBeforeTime(
        com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockedBeforeTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse> accountLockedPastTimeDenom(
        com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.LockedDenomResponse> lockedDenom(
        com.osmosis.lockup.QueryProto.LockedDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockedDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.LockedResponse> lockedByID(
        com.osmosis.lockup.QueryProto.LockedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockedByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.NextLockIDResponse> nextLockID(
        com.osmosis.lockup.QueryProto.NextLockIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextLockIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * Deprecated: use SyntheticLockupByLockupID instead
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse> syntheticLockupsByLockupID(
        com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyntheticLockupsByLockupIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse> syntheticLockupByLockupID(
        com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyntheticLockupByLockupIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse> accountLockedLongerDuration(
        com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedDurationResponse> accountLockedDuration(
        com.osmosis.lockup.QueryProto.AccountLockedDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse> accountLockedLongerDurationNotUnlockingOnly(
        com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse> accountLockedLongerDurationDenom(
        com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryProto.QueryParamsResponse> params(
        com.osmosis.lockup.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_BALANCE = 0;
  private static final int METHODID_MODULE_LOCKED_AMOUNT = 1;
  private static final int METHODID_ACCOUNT_UNLOCKABLE_COINS = 2;
  private static final int METHODID_ACCOUNT_UNLOCKING_COINS = 3;
  private static final int METHODID_ACCOUNT_LOCKED_COINS = 4;
  private static final int METHODID_ACCOUNT_LOCKED_PAST_TIME = 5;
  private static final int METHODID_ACCOUNT_LOCKED_PAST_TIME_NOT_UNLOCKING_ONLY = 6;
  private static final int METHODID_ACCOUNT_UNLOCKED_BEFORE_TIME = 7;
  private static final int METHODID_ACCOUNT_LOCKED_PAST_TIME_DENOM = 8;
  private static final int METHODID_LOCKED_DENOM = 9;
  private static final int METHODID_LOCKED_BY_ID = 10;
  private static final int METHODID_NEXT_LOCK_ID = 11;
  private static final int METHODID_SYNTHETIC_LOCKUPS_BY_LOCKUP_ID = 12;
  private static final int METHODID_SYNTHETIC_LOCKUP_BY_LOCKUP_ID = 13;
  private static final int METHODID_ACCOUNT_LOCKED_LONGER_DURATION = 14;
  private static final int METHODID_ACCOUNT_LOCKED_DURATION = 15;
  private static final int METHODID_ACCOUNT_LOCKED_LONGER_DURATION_NOT_UNLOCKING_ONLY = 16;
  private static final int METHODID_ACCOUNT_LOCKED_LONGER_DURATION_DENOM = 17;
  private static final int METHODID_PARAMS = 18;

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
        case METHODID_MODULE_BALANCE:
          serviceImpl.moduleBalance((com.osmosis.lockup.QueryProto.ModuleBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleBalanceResponse>) responseObserver);
          break;
        case METHODID_MODULE_LOCKED_AMOUNT:
          serviceImpl.moduleLockedAmount((com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKABLE_COINS:
          serviceImpl.accountUnlockableCoins((com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKING_COINS:
          serviceImpl.accountUnlockingCoins((com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_COINS:
          serviceImpl.accountLockedCoins((com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME:
          serviceImpl.accountLockedPastTime((com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME_NOT_UNLOCKING_ONLY:
          serviceImpl.accountLockedPastTimeNotUnlockingOnly((com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKED_BEFORE_TIME:
          serviceImpl.accountUnlockedBeforeTime((com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME_DENOM:
          serviceImpl.accountLockedPastTimeDenom((com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse>) responseObserver);
          break;
        case METHODID_LOCKED_DENOM:
          serviceImpl.lockedDenom((com.osmosis.lockup.QueryProto.LockedDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedDenomResponse>) responseObserver);
          break;
        case METHODID_LOCKED_BY_ID:
          serviceImpl.lockedByID((com.osmosis.lockup.QueryProto.LockedRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.LockedResponse>) responseObserver);
          break;
        case METHODID_NEXT_LOCK_ID:
          serviceImpl.nextLockID((com.osmosis.lockup.QueryProto.NextLockIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.NextLockIDResponse>) responseObserver);
          break;
        case METHODID_SYNTHETIC_LOCKUPS_BY_LOCKUP_ID:
          serviceImpl.syntheticLockupsByLockupID((com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse>) responseObserver);
          break;
        case METHODID_SYNTHETIC_LOCKUP_BY_LOCKUP_ID:
          serviceImpl.syntheticLockupByLockupID((com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION:
          serviceImpl.accountLockedLongerDuration((com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_DURATION:
          serviceImpl.accountLockedDuration((com.osmosis.lockup.QueryProto.AccountLockedDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedDurationResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION_NOT_UNLOCKING_ONLY:
          serviceImpl.accountLockedLongerDurationNotUnlockingOnly((com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION_DENOM:
          serviceImpl.accountLockedLongerDurationDenom((com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.lockup.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryProto.QueryParamsResponse>) responseObserver);
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
          getModuleBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.ModuleBalanceRequest,
              com.osmosis.lockup.QueryProto.ModuleBalanceResponse>(
                service, METHODID_MODULE_BALANCE)))
        .addMethod(
          getModuleLockedAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.ModuleLockedAmountRequest,
              com.osmosis.lockup.QueryProto.ModuleLockedAmountResponse>(
                service, METHODID_MODULE_LOCKED_AMOUNT)))
        .addMethod(
          getAccountUnlockableCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountUnlockableCoinsRequest,
              com.osmosis.lockup.QueryProto.AccountUnlockableCoinsResponse>(
                service, METHODID_ACCOUNT_UNLOCKABLE_COINS)))
        .addMethod(
          getAccountUnlockingCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountUnlockingCoinsRequest,
              com.osmosis.lockup.QueryProto.AccountUnlockingCoinsResponse>(
                service, METHODID_ACCOUNT_UNLOCKING_COINS)))
        .addMethod(
          getAccountLockedCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedCoinsRequest,
              com.osmosis.lockup.QueryProto.AccountLockedCoinsResponse>(
                service, METHODID_ACCOUNT_LOCKED_COINS)))
        .addMethod(
          getAccountLockedPastTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeRequest,
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME)))
        .addMethod(
          getAccountLockedPastTimeNotUnlockingOnlyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyRequest,
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeNotUnlockingOnlyResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME_NOT_UNLOCKING_ONLY)))
        .addMethod(
          getAccountUnlockedBeforeTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeRequest,
              com.osmosis.lockup.QueryProto.AccountUnlockedBeforeTimeResponse>(
                service, METHODID_ACCOUNT_UNLOCKED_BEFORE_TIME)))
        .addMethod(
          getAccountLockedPastTimeDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomRequest,
              com.osmosis.lockup.QueryProto.AccountLockedPastTimeDenomResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME_DENOM)))
        .addMethod(
          getLockedDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.LockedDenomRequest,
              com.osmosis.lockup.QueryProto.LockedDenomResponse>(
                service, METHODID_LOCKED_DENOM)))
        .addMethod(
          getLockedByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.LockedRequest,
              com.osmosis.lockup.QueryProto.LockedResponse>(
                service, METHODID_LOCKED_BY_ID)))
        .addMethod(
          getNextLockIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.NextLockIDRequest,
              com.osmosis.lockup.QueryProto.NextLockIDResponse>(
                service, METHODID_NEXT_LOCK_ID)))
        .addMethod(
          getSyntheticLockupsByLockupIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDRequest,
              com.osmosis.lockup.QueryProto.SyntheticLockupsByLockupIDResponse>(
                service, METHODID_SYNTHETIC_LOCKUPS_BY_LOCKUP_ID)))
        .addMethod(
          getSyntheticLockupByLockupIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDRequest,
              com.osmosis.lockup.QueryProto.SyntheticLockupByLockupIDResponse>(
                service, METHODID_SYNTHETIC_LOCKUP_BY_LOCKUP_ID)))
        .addMethod(
          getAccountLockedLongerDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationRequest,
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION)))
        .addMethod(
          getAccountLockedDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedDurationRequest,
              com.osmosis.lockup.QueryProto.AccountLockedDurationResponse>(
                service, METHODID_ACCOUNT_LOCKED_DURATION)))
        .addMethod(
          getAccountLockedLongerDurationNotUnlockingOnlyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyRequest,
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationNotUnlockingOnlyResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION_NOT_UNLOCKING_ONLY)))
        .addMethod(
          getAccountLockedLongerDurationDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomRequest,
              com.osmosis.lockup.QueryProto.AccountLockedLongerDurationDenomResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION_DENOM)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryProto.QueryParamsRequest,
              com.osmosis.lockup.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.lockup.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getModuleBalanceMethod())
              .addMethod(getModuleLockedAmountMethod())
              .addMethod(getAccountUnlockableCoinsMethod())
              .addMethod(getAccountUnlockingCoinsMethod())
              .addMethod(getAccountLockedCoinsMethod())
              .addMethod(getAccountLockedPastTimeMethod())
              .addMethod(getAccountLockedPastTimeNotUnlockingOnlyMethod())
              .addMethod(getAccountUnlockedBeforeTimeMethod())
              .addMethod(getAccountLockedPastTimeDenomMethod())
              .addMethod(getLockedDenomMethod())
              .addMethod(getLockedByIDMethod())
              .addMethod(getNextLockIDMethod())
              .addMethod(getSyntheticLockupsByLockupIDMethod())
              .addMethod(getSyntheticLockupByLockupIDMethod())
              .addMethod(getAccountLockedLongerDurationMethod())
              .addMethod(getAccountLockedDurationMethod())
              .addMethod(getAccountLockedLongerDurationNotUnlockingOnlyMethod())
              .addMethod(getAccountLockedLongerDurationDenomMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
