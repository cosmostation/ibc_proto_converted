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
  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleBalanceRequest,
      com.osmosis.lockup.ModuleBalanceResponse> getModuleBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleBalance",
      requestType = com.osmosis.lockup.ModuleBalanceRequest.class,
      responseType = com.osmosis.lockup.ModuleBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleBalanceRequest,
      com.osmosis.lockup.ModuleBalanceResponse> getModuleBalanceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleBalanceRequest, com.osmosis.lockup.ModuleBalanceResponse> getModuleBalanceMethod;
    if ((getModuleBalanceMethod = QueryGrpc.getModuleBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleBalanceMethod = QueryGrpc.getModuleBalanceMethod) == null) {
          QueryGrpc.getModuleBalanceMethod = getModuleBalanceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.ModuleBalanceRequest, com.osmosis.lockup.ModuleBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.ModuleBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.ModuleBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleBalance"))
              .build();
        }
      }
    }
    return getModuleBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleLockedAmountRequest,
      com.osmosis.lockup.ModuleLockedAmountResponse> getModuleLockedAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleLockedAmount",
      requestType = com.osmosis.lockup.ModuleLockedAmountRequest.class,
      responseType = com.osmosis.lockup.ModuleLockedAmountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleLockedAmountRequest,
      com.osmosis.lockup.ModuleLockedAmountResponse> getModuleLockedAmountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.ModuleLockedAmountRequest, com.osmosis.lockup.ModuleLockedAmountResponse> getModuleLockedAmountMethod;
    if ((getModuleLockedAmountMethod = QueryGrpc.getModuleLockedAmountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleLockedAmountMethod = QueryGrpc.getModuleLockedAmountMethod) == null) {
          QueryGrpc.getModuleLockedAmountMethod = getModuleLockedAmountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.ModuleLockedAmountRequest, com.osmosis.lockup.ModuleLockedAmountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleLockedAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.ModuleLockedAmountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.ModuleLockedAmountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleLockedAmount"))
              .build();
        }
      }
    }
    return getModuleLockedAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockableCoinsRequest,
      com.osmosis.lockup.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockableCoins",
      requestType = com.osmosis.lockup.AccountUnlockableCoinsRequest.class,
      responseType = com.osmosis.lockup.AccountUnlockableCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockableCoinsRequest,
      com.osmosis.lockup.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockableCoinsRequest, com.osmosis.lockup.AccountUnlockableCoinsResponse> getAccountUnlockableCoinsMethod;
    if ((getAccountUnlockableCoinsMethod = QueryGrpc.getAccountUnlockableCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockableCoinsMethod = QueryGrpc.getAccountUnlockableCoinsMethod) == null) {
          QueryGrpc.getAccountUnlockableCoinsMethod = getAccountUnlockableCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountUnlockableCoinsRequest, com.osmosis.lockup.AccountUnlockableCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockableCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockableCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockableCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockableCoins"))
              .build();
        }
      }
    }
    return getAccountUnlockableCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockingCoinsRequest,
      com.osmosis.lockup.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockingCoins",
      requestType = com.osmosis.lockup.AccountUnlockingCoinsRequest.class,
      responseType = com.osmosis.lockup.AccountUnlockingCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockingCoinsRequest,
      com.osmosis.lockup.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockingCoinsRequest, com.osmosis.lockup.AccountUnlockingCoinsResponse> getAccountUnlockingCoinsMethod;
    if ((getAccountUnlockingCoinsMethod = QueryGrpc.getAccountUnlockingCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockingCoinsMethod = QueryGrpc.getAccountUnlockingCoinsMethod) == null) {
          QueryGrpc.getAccountUnlockingCoinsMethod = getAccountUnlockingCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountUnlockingCoinsRequest, com.osmosis.lockup.AccountUnlockingCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockingCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockingCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockingCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockingCoins"))
              .build();
        }
      }
    }
    return getAccountUnlockingCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedCoinsRequest,
      com.osmosis.lockup.AccountLockedCoinsResponse> getAccountLockedCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedCoins",
      requestType = com.osmosis.lockup.AccountLockedCoinsRequest.class,
      responseType = com.osmosis.lockup.AccountLockedCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedCoinsRequest,
      com.osmosis.lockup.AccountLockedCoinsResponse> getAccountLockedCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedCoinsRequest, com.osmosis.lockup.AccountLockedCoinsResponse> getAccountLockedCoinsMethod;
    if ((getAccountLockedCoinsMethod = QueryGrpc.getAccountLockedCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedCoinsMethod = QueryGrpc.getAccountLockedCoinsMethod) == null) {
          QueryGrpc.getAccountLockedCoinsMethod = getAccountLockedCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedCoinsRequest, com.osmosis.lockup.AccountLockedCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedCoins"))
              .build();
        }
      }
    }
    return getAccountLockedCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeRequest,
      com.osmosis.lockup.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTime",
      requestType = com.osmosis.lockup.AccountLockedPastTimeRequest.class,
      responseType = com.osmosis.lockup.AccountLockedPastTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeRequest,
      com.osmosis.lockup.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeRequest, com.osmosis.lockup.AccountLockedPastTimeResponse> getAccountLockedPastTimeMethod;
    if ((getAccountLockedPastTimeMethod = QueryGrpc.getAccountLockedPastTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeMethod = QueryGrpc.getAccountLockedPastTimeMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeMethod = getAccountLockedPastTimeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedPastTimeRequest, com.osmosis.lockup.AccountLockedPastTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTime"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest,
      com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTimeNotUnlockingOnly",
      requestType = com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest.class,
      responseType = com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest,
      com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest, com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> getAccountLockedPastTimeNotUnlockingOnlyMethod;
    if ((getAccountLockedPastTimeNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeNotUnlockingOnlyMethod = getAccountLockedPastTimeNotUnlockingOnlyMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest, com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTimeNotUnlockingOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTimeNotUnlockingOnly"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeNotUnlockingOnlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockedBeforeTimeRequest,
      com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountUnlockedBeforeTime",
      requestType = com.osmosis.lockup.AccountUnlockedBeforeTimeRequest.class,
      responseType = com.osmosis.lockup.AccountUnlockedBeforeTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockedBeforeTimeRequest,
      com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountUnlockedBeforeTimeRequest, com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> getAccountUnlockedBeforeTimeMethod;
    if ((getAccountUnlockedBeforeTimeMethod = QueryGrpc.getAccountUnlockedBeforeTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountUnlockedBeforeTimeMethod = QueryGrpc.getAccountUnlockedBeforeTimeMethod) == null) {
          QueryGrpc.getAccountUnlockedBeforeTimeMethod = getAccountUnlockedBeforeTimeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountUnlockedBeforeTimeRequest, com.osmosis.lockup.AccountUnlockedBeforeTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountUnlockedBeforeTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockedBeforeTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountUnlockedBeforeTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountUnlockedBeforeTime"))
              .build();
        }
      }
    }
    return getAccountUnlockedBeforeTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeDenomRequest,
      com.osmosis.lockup.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedPastTimeDenom",
      requestType = com.osmosis.lockup.AccountLockedPastTimeDenomRequest.class,
      responseType = com.osmosis.lockup.AccountLockedPastTimeDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeDenomRequest,
      com.osmosis.lockup.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedPastTimeDenomRequest, com.osmosis.lockup.AccountLockedPastTimeDenomResponse> getAccountLockedPastTimeDenomMethod;
    if ((getAccountLockedPastTimeDenomMethod = QueryGrpc.getAccountLockedPastTimeDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedPastTimeDenomMethod = QueryGrpc.getAccountLockedPastTimeDenomMethod) == null) {
          QueryGrpc.getAccountLockedPastTimeDenomMethod = getAccountLockedPastTimeDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedPastTimeDenomRequest, com.osmosis.lockup.AccountLockedPastTimeDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedPastTimeDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedPastTimeDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedPastTimeDenom"))
              .build();
        }
      }
    }
    return getAccountLockedPastTimeDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.LockedDenomRequest,
      com.osmosis.lockup.LockedDenomResponse> getLockedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockedDenom",
      requestType = com.osmosis.lockup.LockedDenomRequest.class,
      responseType = com.osmosis.lockup.LockedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.LockedDenomRequest,
      com.osmosis.lockup.LockedDenomResponse> getLockedDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.LockedDenomRequest, com.osmosis.lockup.LockedDenomResponse> getLockedDenomMethod;
    if ((getLockedDenomMethod = QueryGrpc.getLockedDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockedDenomMethod = QueryGrpc.getLockedDenomMethod) == null) {
          QueryGrpc.getLockedDenomMethod = getLockedDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.LockedDenomRequest, com.osmosis.lockup.LockedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.LockedDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.LockedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockedDenom"))
              .build();
        }
      }
    }
    return getLockedDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.LockedRequest,
      com.osmosis.lockup.LockedResponse> getLockedByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockedByID",
      requestType = com.osmosis.lockup.LockedRequest.class,
      responseType = com.osmosis.lockup.LockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.LockedRequest,
      com.osmosis.lockup.LockedResponse> getLockedByIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.LockedRequest, com.osmosis.lockup.LockedResponse> getLockedByIDMethod;
    if ((getLockedByIDMethod = QueryGrpc.getLockedByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockedByIDMethod = QueryGrpc.getLockedByIDMethod) == null) {
          QueryGrpc.getLockedByIDMethod = getLockedByIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.LockedRequest, com.osmosis.lockup.LockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockedByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.LockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.LockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockedByID"))
              .build();
        }
      }
    }
    return getLockedByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.NextLockIDRequest,
      com.osmosis.lockup.NextLockIDResponse> getNextLockIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextLockID",
      requestType = com.osmosis.lockup.NextLockIDRequest.class,
      responseType = com.osmosis.lockup.NextLockIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.NextLockIDRequest,
      com.osmosis.lockup.NextLockIDResponse> getNextLockIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.NextLockIDRequest, com.osmosis.lockup.NextLockIDResponse> getNextLockIDMethod;
    if ((getNextLockIDMethod = QueryGrpc.getNextLockIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNextLockIDMethod = QueryGrpc.getNextLockIDMethod) == null) {
          QueryGrpc.getNextLockIDMethod = getNextLockIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.NextLockIDRequest, com.osmosis.lockup.NextLockIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextLockID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.NextLockIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.NextLockIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NextLockID"))
              .build();
        }
      }
    }
    return getNextLockIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupsByLockupIDRequest,
      com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyntheticLockupsByLockupID",
      requestType = com.osmosis.lockup.SyntheticLockupsByLockupIDRequest.class,
      responseType = com.osmosis.lockup.SyntheticLockupsByLockupIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupsByLockupIDRequest,
      com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupsByLockupIDRequest, com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> getSyntheticLockupsByLockupIDMethod;
    if ((getSyntheticLockupsByLockupIDMethod = QueryGrpc.getSyntheticLockupsByLockupIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSyntheticLockupsByLockupIDMethod = QueryGrpc.getSyntheticLockupsByLockupIDMethod) == null) {
          QueryGrpc.getSyntheticLockupsByLockupIDMethod = getSyntheticLockupsByLockupIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.SyntheticLockupsByLockupIDRequest, com.osmosis.lockup.SyntheticLockupsByLockupIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyntheticLockupsByLockupID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.SyntheticLockupsByLockupIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.SyntheticLockupsByLockupIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SyntheticLockupsByLockupID"))
              .build();
        }
      }
    }
    return getSyntheticLockupsByLockupIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupByLockupIDRequest,
      com.osmosis.lockup.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyntheticLockupByLockupID",
      requestType = com.osmosis.lockup.SyntheticLockupByLockupIDRequest.class,
      responseType = com.osmosis.lockup.SyntheticLockupByLockupIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupByLockupIDRequest,
      com.osmosis.lockup.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.SyntheticLockupByLockupIDRequest, com.osmosis.lockup.SyntheticLockupByLockupIDResponse> getSyntheticLockupByLockupIDMethod;
    if ((getSyntheticLockupByLockupIDMethod = QueryGrpc.getSyntheticLockupByLockupIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSyntheticLockupByLockupIDMethod = QueryGrpc.getSyntheticLockupByLockupIDMethod) == null) {
          QueryGrpc.getSyntheticLockupByLockupIDMethod = getSyntheticLockupByLockupIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.SyntheticLockupByLockupIDRequest, com.osmosis.lockup.SyntheticLockupByLockupIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyntheticLockupByLockupID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.SyntheticLockupByLockupIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.SyntheticLockupByLockupIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SyntheticLockupByLockupID"))
              .build();
        }
      }
    }
    return getSyntheticLockupByLockupIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationRequest,
      com.osmosis.lockup.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDuration",
      requestType = com.osmosis.lockup.AccountLockedLongerDurationRequest.class,
      responseType = com.osmosis.lockup.AccountLockedLongerDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationRequest,
      com.osmosis.lockup.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationRequest, com.osmosis.lockup.AccountLockedLongerDurationResponse> getAccountLockedLongerDurationMethod;
    if ((getAccountLockedLongerDurationMethod = QueryGrpc.getAccountLockedLongerDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationMethod = QueryGrpc.getAccountLockedLongerDurationMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationMethod = getAccountLockedLongerDurationMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedLongerDurationRequest, com.osmosis.lockup.AccountLockedLongerDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDuration"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedDurationRequest,
      com.osmosis.lockup.AccountLockedDurationResponse> getAccountLockedDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedDuration",
      requestType = com.osmosis.lockup.AccountLockedDurationRequest.class,
      responseType = com.osmosis.lockup.AccountLockedDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedDurationRequest,
      com.osmosis.lockup.AccountLockedDurationResponse> getAccountLockedDurationMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedDurationRequest, com.osmosis.lockup.AccountLockedDurationResponse> getAccountLockedDurationMethod;
    if ((getAccountLockedDurationMethod = QueryGrpc.getAccountLockedDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedDurationMethod = QueryGrpc.getAccountLockedDurationMethod) == null) {
          QueryGrpc.getAccountLockedDurationMethod = getAccountLockedDurationMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedDurationRequest, com.osmosis.lockup.AccountLockedDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedDuration"))
              .build();
        }
      }
    }
    return getAccountLockedDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest,
      com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDurationNotUnlockingOnly",
      requestType = com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest.class,
      responseType = com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest,
      com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest, com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> getAccountLockedLongerDurationNotUnlockingOnlyMethod;
    if ((getAccountLockedLongerDurationNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationNotUnlockingOnlyMethod = QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationNotUnlockingOnlyMethod = getAccountLockedLongerDurationNotUnlockingOnlyMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest, com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDurationNotUnlockingOnly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDurationNotUnlockingOnly"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationNotUnlockingOnlyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationDenomRequest,
      com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountLockedLongerDurationDenom",
      requestType = com.osmosis.lockup.AccountLockedLongerDurationDenomRequest.class,
      responseType = com.osmosis.lockup.AccountLockedLongerDurationDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationDenomRequest,
      com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.AccountLockedLongerDurationDenomRequest, com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> getAccountLockedLongerDurationDenomMethod;
    if ((getAccountLockedLongerDurationDenomMethod = QueryGrpc.getAccountLockedLongerDurationDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountLockedLongerDurationDenomMethod = QueryGrpc.getAccountLockedLongerDurationDenomMethod) == null) {
          QueryGrpc.getAccountLockedLongerDurationDenomMethod = getAccountLockedLongerDurationDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.AccountLockedLongerDurationDenomRequest, com.osmosis.lockup.AccountLockedLongerDurationDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountLockedLongerDurationDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.AccountLockedLongerDurationDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountLockedLongerDurationDenom"))
              .build();
        }
      }
    }
    return getAccountLockedLongerDurationDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.QueryParamsRequest,
      com.osmosis.lockup.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.lockup.QueryParamsRequest.class,
      responseType = com.osmosis.lockup.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.QueryParamsRequest,
      com.osmosis.lockup.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.QueryParamsRequest, com.osmosis.lockup.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.QueryParamsRequest, com.osmosis.lockup.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.QueryParamsResponse.getDefaultInstance()))
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
    default void moduleBalance(com.osmosis.lockup.ModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    default void moduleLockedAmount(com.osmosis.lockup.ModuleLockedAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleLockedAmountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleLockedAmountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    default void accountUnlockableCoins(com.osmosis.lockup.AccountUnlockableCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockableCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockableCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    default void accountUnlockingCoins(com.osmosis.lockup.AccountUnlockingCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockingCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockingCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    default void accountLockedCoins(com.osmosis.lockup.AccountLockedCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    default void accountLockedPastTime(com.osmosis.lockup.AccountLockedPastTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    default void accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    default void accountUnlockedBeforeTime(com.osmosis.lockup.AccountUnlockedBeforeTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountUnlockedBeforeTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    default void accountLockedPastTimeDenom(com.osmosis.lockup.AccountLockedPastTimeDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedPastTimeDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    default void lockedDenom(com.osmosis.lockup.LockedDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockedDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    default void lockedByID(com.osmosis.lockup.LockedRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockedByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    default void nextLockID(com.osmosis.lockup.NextLockIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.NextLockIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextLockIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * Deprecated: use SyntheticLockupByLockupID instead
     * </pre>
     */
    @java.lang.Deprecated
    default void syntheticLockupsByLockupID(com.osmosis.lockup.SyntheticLockupsByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyntheticLockupsByLockupIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    default void syntheticLockupByLockupID(com.osmosis.lockup.SyntheticLockupByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupByLockupIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyntheticLockupByLockupIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    default void accountLockedLongerDuration(com.osmosis.lockup.AccountLockedLongerDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    default void accountLockedDuration(com.osmosis.lockup.AccountLockedDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    default void accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    default void accountLockedLongerDurationDenom(com.osmosis.lockup.AccountLockedLongerDurationDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountLockedLongerDurationDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    default void params(com.osmosis.lockup.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryParamsResponse> responseObserver) {
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
    public void moduleBalance(com.osmosis.lockup.ModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public void moduleLockedAmount(com.osmosis.lockup.ModuleLockedAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleLockedAmountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleLockedAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public void accountUnlockableCoins(com.osmosis.lockup.AccountUnlockableCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockableCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockableCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public void accountUnlockingCoins(com.osmosis.lockup.AccountUnlockingCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockingCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockingCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public void accountLockedCoins(com.osmosis.lockup.AccountLockedCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public void accountLockedPastTime(com.osmosis.lockup.AccountLockedPastTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public void accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public void accountUnlockedBeforeTime(com.osmosis.lockup.AccountUnlockedBeforeTimeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountUnlockedBeforeTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public void accountLockedPastTimeDenom(com.osmosis.lockup.AccountLockedPastTimeDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public void lockedDenom(com.osmosis.lockup.LockedDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockedDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public void lockedByID(com.osmosis.lockup.LockedRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockedByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public void nextLockID(com.osmosis.lockup.NextLockIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.NextLockIDResponse> responseObserver) {
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
    public void syntheticLockupsByLockupID(com.osmosis.lockup.SyntheticLockupsByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyntheticLockupsByLockupIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public void syntheticLockupByLockupID(com.osmosis.lockup.SyntheticLockupByLockupIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupByLockupIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyntheticLockupByLockupIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public void accountLockedLongerDuration(com.osmosis.lockup.AccountLockedLongerDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public void accountLockedDuration(com.osmosis.lockup.AccountLockedDurationRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public void accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public void accountLockedLongerDurationDenom(com.osmosis.lockup.AccountLockedLongerDurationDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public void params(com.osmosis.lockup.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryParamsResponse> responseObserver) {
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
    public com.osmosis.lockup.ModuleBalanceResponse moduleBalance(com.osmosis.lockup.ModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public com.osmosis.lockup.ModuleLockedAmountResponse moduleLockedAmount(com.osmosis.lockup.ModuleLockedAmountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleLockedAmountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public com.osmosis.lockup.AccountUnlockableCoinsResponse accountUnlockableCoins(com.osmosis.lockup.AccountUnlockableCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockableCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public com.osmosis.lockup.AccountUnlockingCoinsResponse accountUnlockingCoins(com.osmosis.lockup.AccountUnlockingCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockingCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedCoinsResponse accountLockedCoins(com.osmosis.lockup.AccountLockedCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedPastTimeResponse accountLockedPastTime(com.osmosis.lockup.AccountLockedPastTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse accountLockedPastTimeNotUnlockingOnly(com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public com.osmosis.lockup.AccountUnlockedBeforeTimeResponse accountUnlockedBeforeTime(com.osmosis.lockup.AccountUnlockedBeforeTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountUnlockedBeforeTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedPastTimeDenomResponse accountLockedPastTimeDenom(com.osmosis.lockup.AccountLockedPastTimeDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedPastTimeDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public com.osmosis.lockup.LockedDenomResponse lockedDenom(com.osmosis.lockup.LockedDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockedDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public com.osmosis.lockup.LockedResponse lockedByID(com.osmosis.lockup.LockedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockedByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public com.osmosis.lockup.NextLockIDResponse nextLockID(com.osmosis.lockup.NextLockIDRequest request) {
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
    public com.osmosis.lockup.SyntheticLockupsByLockupIDResponse syntheticLockupsByLockupID(com.osmosis.lockup.SyntheticLockupsByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyntheticLockupsByLockupIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public com.osmosis.lockup.SyntheticLockupByLockupIDResponse syntheticLockupByLockupID(com.osmosis.lockup.SyntheticLockupByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyntheticLockupByLockupIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedLongerDurationResponse accountLockedLongerDuration(com.osmosis.lockup.AccountLockedLongerDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedDurationResponse accountLockedDuration(com.osmosis.lockup.AccountLockedDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse accountLockedLongerDurationNotUnlockingOnly(com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public com.osmosis.lockup.AccountLockedLongerDurationDenomResponse accountLockedLongerDurationDenom(com.osmosis.lockup.AccountLockedLongerDurationDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountLockedLongerDurationDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public com.osmosis.lockup.QueryParamsResponse params(com.osmosis.lockup.QueryParamsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.ModuleBalanceResponse> moduleBalance(
        com.osmosis.lockup.ModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return locked balance of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.ModuleLockedAmountResponse> moduleLockedAmount(
        com.osmosis.lockup.ModuleLockedAmountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleLockedAmountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlockable coins which are not withdrawn yet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountUnlockableCoinsResponse> accountUnlockableCoins(
        com.osmosis.lockup.AccountUnlockableCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockableCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlocking coins
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountUnlockingCoinsResponse> accountUnlockingCoins(
        com.osmosis.lockup.AccountUnlockingCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockingCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return a locked coins that can't be withdrawn
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedCoinsResponse> accountLockedCoins(
        com.osmosis.lockup.AccountLockedCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedPastTimeResponse> accountLockedPastTime(
        com.osmosis.lockup.AccountLockedPastTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns locked records of an account with unlock time beyond timestamp
     * excluding tokens started unlocking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse> accountLockedPastTimeNotUnlockingOnly(
        com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeNotUnlockingOnlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns unlocked records with unlock time before timestamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountUnlockedBeforeTimeResponse> accountUnlockedBeforeTime(
        com.osmosis.lockup.AccountUnlockedBeforeTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountUnlockedBeforeTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns lock records by address, timestamp, denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedPastTimeDenomResponse> accountLockedPastTimeDenom(
        com.osmosis.lockup.AccountLockedPastTimeDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedPastTimeDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns total locked per denom with longer past given time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.LockedDenomResponse> lockedDenom(
        com.osmosis.lockup.LockedDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockedDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns lock record by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.LockedResponse> lockedByID(
        com.osmosis.lockup.LockedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockedByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns next lock ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.NextLockIDResponse> nextLockID(
        com.osmosis.lockup.NextLockIDRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.SyntheticLockupsByLockupIDResponse> syntheticLockupsByLockupID(
        com.osmosis.lockup.SyntheticLockupsByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyntheticLockupsByLockupIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns synthetic lockup by native lockup id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.SyntheticLockupByLockupIDResponse> syntheticLockupByLockupID(
        com.osmosis.lockup.SyntheticLockupByLockupIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyntheticLockupByLockupIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedLongerDurationResponse> accountLockedLongerDuration(
        com.osmosis.lockup.AccountLockedLongerDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with a specific duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedDurationResponse> accountLockedDuration(
        com.osmosis.lockup.AccountLockedDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account locked records with longer duration excluding tokens
     * started unlocking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse> accountLockedLongerDurationNotUnlockingOnly(
        com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationNotUnlockingOnlyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns account's locked records for a denom with longer duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.AccountLockedLongerDurationDenomResponse> accountLockedLongerDurationDenom(
        com.osmosis.lockup.AccountLockedLongerDurationDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountLockedLongerDurationDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns lockup params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.QueryParamsResponse> params(
        com.osmosis.lockup.QueryParamsRequest request) {
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
          serviceImpl.moduleBalance((com.osmosis.lockup.ModuleBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleBalanceResponse>) responseObserver);
          break;
        case METHODID_MODULE_LOCKED_AMOUNT:
          serviceImpl.moduleLockedAmount((com.osmosis.lockup.ModuleLockedAmountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.ModuleLockedAmountResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKABLE_COINS:
          serviceImpl.accountUnlockableCoins((com.osmosis.lockup.AccountUnlockableCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockableCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKING_COINS:
          serviceImpl.accountUnlockingCoins((com.osmosis.lockup.AccountUnlockingCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockingCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_COINS:
          serviceImpl.accountLockedCoins((com.osmosis.lockup.AccountLockedCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedCoinsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME:
          serviceImpl.accountLockedPastTime((com.osmosis.lockup.AccountLockedPastTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME_NOT_UNLOCKING_ONLY:
          serviceImpl.accountLockedPastTimeNotUnlockingOnly((com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_UNLOCKED_BEFORE_TIME:
          serviceImpl.accountUnlockedBeforeTime((com.osmosis.lockup.AccountUnlockedBeforeTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountUnlockedBeforeTimeResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_PAST_TIME_DENOM:
          serviceImpl.accountLockedPastTimeDenom((com.osmosis.lockup.AccountLockedPastTimeDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedPastTimeDenomResponse>) responseObserver);
          break;
        case METHODID_LOCKED_DENOM:
          serviceImpl.lockedDenom((com.osmosis.lockup.LockedDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedDenomResponse>) responseObserver);
          break;
        case METHODID_LOCKED_BY_ID:
          serviceImpl.lockedByID((com.osmosis.lockup.LockedRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.LockedResponse>) responseObserver);
          break;
        case METHODID_NEXT_LOCK_ID:
          serviceImpl.nextLockID((com.osmosis.lockup.NextLockIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.NextLockIDResponse>) responseObserver);
          break;
        case METHODID_SYNTHETIC_LOCKUPS_BY_LOCKUP_ID:
          serviceImpl.syntheticLockupsByLockupID((com.osmosis.lockup.SyntheticLockupsByLockupIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupsByLockupIDResponse>) responseObserver);
          break;
        case METHODID_SYNTHETIC_LOCKUP_BY_LOCKUP_ID:
          serviceImpl.syntheticLockupByLockupID((com.osmosis.lockup.SyntheticLockupByLockupIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.SyntheticLockupByLockupIDResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION:
          serviceImpl.accountLockedLongerDuration((com.osmosis.lockup.AccountLockedLongerDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_DURATION:
          serviceImpl.accountLockedDuration((com.osmosis.lockup.AccountLockedDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedDurationResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION_NOT_UNLOCKING_ONLY:
          serviceImpl.accountLockedLongerDurationNotUnlockingOnly((com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_LOCKED_LONGER_DURATION_DENOM:
          serviceImpl.accountLockedLongerDurationDenom((com.osmosis.lockup.AccountLockedLongerDurationDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.AccountLockedLongerDurationDenomResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.lockup.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.QueryParamsResponse>) responseObserver);
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
              com.osmosis.lockup.ModuleBalanceRequest,
              com.osmosis.lockup.ModuleBalanceResponse>(
                service, METHODID_MODULE_BALANCE)))
        .addMethod(
          getModuleLockedAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.ModuleLockedAmountRequest,
              com.osmosis.lockup.ModuleLockedAmountResponse>(
                service, METHODID_MODULE_LOCKED_AMOUNT)))
        .addMethod(
          getAccountUnlockableCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountUnlockableCoinsRequest,
              com.osmosis.lockup.AccountUnlockableCoinsResponse>(
                service, METHODID_ACCOUNT_UNLOCKABLE_COINS)))
        .addMethod(
          getAccountUnlockingCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountUnlockingCoinsRequest,
              com.osmosis.lockup.AccountUnlockingCoinsResponse>(
                service, METHODID_ACCOUNT_UNLOCKING_COINS)))
        .addMethod(
          getAccountLockedCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedCoinsRequest,
              com.osmosis.lockup.AccountLockedCoinsResponse>(
                service, METHODID_ACCOUNT_LOCKED_COINS)))
        .addMethod(
          getAccountLockedPastTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedPastTimeRequest,
              com.osmosis.lockup.AccountLockedPastTimeResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME)))
        .addMethod(
          getAccountLockedPastTimeNotUnlockingOnlyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest,
              com.osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME_NOT_UNLOCKING_ONLY)))
        .addMethod(
          getAccountUnlockedBeforeTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountUnlockedBeforeTimeRequest,
              com.osmosis.lockup.AccountUnlockedBeforeTimeResponse>(
                service, METHODID_ACCOUNT_UNLOCKED_BEFORE_TIME)))
        .addMethod(
          getAccountLockedPastTimeDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedPastTimeDenomRequest,
              com.osmosis.lockup.AccountLockedPastTimeDenomResponse>(
                service, METHODID_ACCOUNT_LOCKED_PAST_TIME_DENOM)))
        .addMethod(
          getLockedDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.LockedDenomRequest,
              com.osmosis.lockup.LockedDenomResponse>(
                service, METHODID_LOCKED_DENOM)))
        .addMethod(
          getLockedByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.LockedRequest,
              com.osmosis.lockup.LockedResponse>(
                service, METHODID_LOCKED_BY_ID)))
        .addMethod(
          getNextLockIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.NextLockIDRequest,
              com.osmosis.lockup.NextLockIDResponse>(
                service, METHODID_NEXT_LOCK_ID)))
        .addMethod(
          getSyntheticLockupsByLockupIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.SyntheticLockupsByLockupIDRequest,
              com.osmosis.lockup.SyntheticLockupsByLockupIDResponse>(
                service, METHODID_SYNTHETIC_LOCKUPS_BY_LOCKUP_ID)))
        .addMethod(
          getSyntheticLockupByLockupIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.SyntheticLockupByLockupIDRequest,
              com.osmosis.lockup.SyntheticLockupByLockupIDResponse>(
                service, METHODID_SYNTHETIC_LOCKUP_BY_LOCKUP_ID)))
        .addMethod(
          getAccountLockedLongerDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedLongerDurationRequest,
              com.osmosis.lockup.AccountLockedLongerDurationResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION)))
        .addMethod(
          getAccountLockedDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedDurationRequest,
              com.osmosis.lockup.AccountLockedDurationResponse>(
                service, METHODID_ACCOUNT_LOCKED_DURATION)))
        .addMethod(
          getAccountLockedLongerDurationNotUnlockingOnlyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest,
              com.osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION_NOT_UNLOCKING_ONLY)))
        .addMethod(
          getAccountLockedLongerDurationDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.AccountLockedLongerDurationDenomRequest,
              com.osmosis.lockup.AccountLockedLongerDurationDenomResponse>(
                service, METHODID_ACCOUNT_LOCKED_LONGER_DURATION_DENOM)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.QueryParamsRequest,
              com.osmosis.lockup.QueryParamsResponse>(
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
