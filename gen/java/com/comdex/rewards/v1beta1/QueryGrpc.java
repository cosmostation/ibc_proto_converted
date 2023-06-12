package com.comdex.rewards.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/rewards/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.rewards.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryParamsRequest,
      com.comdex.rewards.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.rewards.v1beta1.QueryParamsRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryParamsRequest,
      com.comdex.rewards.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryParamsRequest, com.comdex.rewards.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryParamsRequest, com.comdex.rewards.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest,
      com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> getQueryAllEpochsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllEpochsInfo",
      requestType = com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest,
      com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> getQueryAllEpochsInfoMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest, com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> getQueryAllEpochsInfoMethod;
    if ((getQueryAllEpochsInfoMethod = QueryGrpc.getQueryAllEpochsInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllEpochsInfoMethod = QueryGrpc.getQueryAllEpochsInfoMethod) == null) {
          QueryGrpc.getQueryAllEpochsInfoMethod = getQueryAllEpochsInfoMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest, com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllEpochsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllEpochsInfo"))
              .build();
        }
      }
    }
    return getQueryAllEpochsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest,
      com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> getQueryEpochInfoByDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryEpochInfoByDuration",
      requestType = com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest,
      com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> getQueryEpochInfoByDurationMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest, com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> getQueryEpochInfoByDurationMethod;
    if ((getQueryEpochInfoByDurationMethod = QueryGrpc.getQueryEpochInfoByDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryEpochInfoByDurationMethod = QueryGrpc.getQueryEpochInfoByDurationMethod) == null) {
          QueryGrpc.getQueryEpochInfoByDurationMethod = getQueryEpochInfoByDurationMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest, com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryEpochInfoByDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryEpochInfoByDuration"))
              .build();
        }
      }
    }
    return getQueryEpochInfoByDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllGaugesRequest,
      com.comdex.rewards.v1beta1.QueryAllGaugesResponse> getQueryAllGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllGauges",
      requestType = com.comdex.rewards.v1beta1.QueryAllGaugesRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryAllGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllGaugesRequest,
      com.comdex.rewards.v1beta1.QueryAllGaugesResponse> getQueryAllGaugesMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryAllGaugesRequest, com.comdex.rewards.v1beta1.QueryAllGaugesResponse> getQueryAllGaugesMethod;
    if ((getQueryAllGaugesMethod = QueryGrpc.getQueryAllGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllGaugesMethod = QueryGrpc.getQueryAllGaugesMethod) == null) {
          QueryGrpc.getQueryAllGaugesMethod = getQueryAllGaugesMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryAllGaugesRequest, com.comdex.rewards.v1beta1.QueryAllGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryAllGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryAllGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllGauges"))
              .build();
        }
      }
    }
    return getQueryAllGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugeByIdRequest,
      com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> getQueryGaugeByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryGaugeByID",
      requestType = com.comdex.rewards.v1beta1.QueryGaugeByIdRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryGaugeByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugeByIdRequest,
      com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> getQueryGaugeByIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugeByIdRequest, com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> getQueryGaugeByIDMethod;
    if ((getQueryGaugeByIDMethod = QueryGrpc.getQueryGaugeByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryGaugeByIDMethod = QueryGrpc.getQueryGaugeByIDMethod) == null) {
          QueryGrpc.getQueryGaugeByIDMethod = getQueryGaugeByIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryGaugeByIdRequest, com.comdex.rewards.v1beta1.QueryGaugeByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryGaugeByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryGaugeByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryGaugeByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryGaugeByID"))
              .build();
        }
      }
    }
    return getQueryGaugeByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest,
      com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> getQueryGaugeByDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryGaugeByDuration",
      requestType = com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest,
      com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> getQueryGaugeByDurationMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest, com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> getQueryGaugeByDurationMethod;
    if ((getQueryGaugeByDurationMethod = QueryGrpc.getQueryGaugeByDurationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryGaugeByDurationMethod = QueryGrpc.getQueryGaugeByDurationMethod) == null) {
          QueryGrpc.getQueryGaugeByDurationMethod = getQueryGaugeByDurationMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest, com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryGaugeByDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryGaugeByDuration"))
              .build();
        }
      }
    }
    return getQueryGaugeByDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardsRequest,
      com.comdex.rewards.v1beta1.QueryRewardsResponse> getQueryRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryRewards",
      requestType = com.comdex.rewards.v1beta1.QueryRewardsRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardsRequest,
      com.comdex.rewards.v1beta1.QueryRewardsResponse> getQueryRewardsMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardsRequest, com.comdex.rewards.v1beta1.QueryRewardsResponse> getQueryRewardsMethod;
    if ((getQueryRewardsMethod = QueryGrpc.getQueryRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryRewardsMethod = QueryGrpc.getQueryRewardsMethod) == null) {
          QueryGrpc.getQueryRewardsMethod = getQueryRewardsMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryRewardsRequest, com.comdex.rewards.v1beta1.QueryRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryRewards"))
              .build();
        }
      }
    }
    return getQueryRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardRequest,
      com.comdex.rewards.v1beta1.QueryRewardResponse> getQueryRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryReward",
      requestType = com.comdex.rewards.v1beta1.QueryRewardRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardRequest,
      com.comdex.rewards.v1beta1.QueryRewardResponse> getQueryRewardMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryRewardRequest, com.comdex.rewards.v1beta1.QueryRewardResponse> getQueryRewardMethod;
    if ((getQueryRewardMethod = QueryGrpc.getQueryRewardMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryRewardMethod = QueryGrpc.getQueryRewardMethod) == null) {
          QueryGrpc.getQueryRewardMethod = getQueryRewardMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryRewardRequest, com.comdex.rewards.v1beta1.QueryRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryReward"))
              .build();
        }
      }
    }
    return getQueryRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> getQueryExternalRewardsLockersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExternalRewardsLockers",
      requestType = com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> getQueryExternalRewardsLockersMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest, com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> getQueryExternalRewardsLockersMethod;
    if ((getQueryExternalRewardsLockersMethod = QueryGrpc.getQueryExternalRewardsLockersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExternalRewardsLockersMethod = QueryGrpc.getQueryExternalRewardsLockersMethod) == null) {
          QueryGrpc.getQueryExternalRewardsLockersMethod = getQueryExternalRewardsLockersMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest, com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExternalRewardsLockers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExternalRewardsLockers"))
              .build();
        }
      }
    }
    return getQueryExternalRewardsLockersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> getQueryExternalRewardVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExternalRewardVaults",
      requestType = com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> getQueryExternalRewardVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest, com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> getQueryExternalRewardVaultsMethod;
    if ((getQueryExternalRewardVaultsMethod = QueryGrpc.getQueryExternalRewardVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExternalRewardVaultsMethod = QueryGrpc.getQueryExternalRewardVaultsMethod) == null) {
          QueryGrpc.getQueryExternalRewardVaultsMethod = getQueryExternalRewardVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest, com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExternalRewardVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExternalRewardVaults"))
              .build();
        }
      }
    }
    return getQueryExternalRewardVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest,
      com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> getQueryWhitelistedAppIdsVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWhitelistedAppIdsVault",
      requestType = com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest,
      com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> getQueryWhitelistedAppIdsVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest, com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> getQueryWhitelistedAppIdsVaultMethod;
    if ((getQueryWhitelistedAppIdsVaultMethod = QueryGrpc.getQueryWhitelistedAppIdsVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryWhitelistedAppIdsVaultMethod = QueryGrpc.getQueryWhitelistedAppIdsVaultMethod) == null) {
          QueryGrpc.getQueryWhitelistedAppIdsVaultMethod = getQueryWhitelistedAppIdsVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest, com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryWhitelistedAppIdsVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryWhitelistedAppIdsVault"))
              .build();
        }
      }
    }
    return getQueryWhitelistedAppIdsVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> getQueryExternalRewardLendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExternalRewardLends",
      requestType = com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> getQueryExternalRewardLendsMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest, com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> getQueryExternalRewardLendsMethod;
    if ((getQueryExternalRewardLendsMethod = QueryGrpc.getQueryExternalRewardLendsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExternalRewardLendsMethod = QueryGrpc.getQueryExternalRewardLendsMethod) == null) {
          QueryGrpc.getQueryExternalRewardLendsMethod = getQueryExternalRewardLendsMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest, com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExternalRewardLends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExternalRewardLends"))
              .build();
        }
      }
    }
    return getQueryExternalRewardLendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> getQueryExternalRewardStableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExternalRewardStableMint",
      requestType = com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest,
      com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> getQueryExternalRewardStableMintMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest, com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> getQueryExternalRewardStableMintMethod;
    if ((getQueryExternalRewardStableMintMethod = QueryGrpc.getQueryExternalRewardStableMintMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExternalRewardStableMintMethod = QueryGrpc.getQueryExternalRewardStableMintMethod) == null) {
          QueryGrpc.getQueryExternalRewardStableMintMethod = getQueryExternalRewardStableMintMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest, com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExternalRewardStableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExternalRewardStableMint"))
              .build();
        }
      }
    }
    return getQueryExternalRewardStableMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochTimeRequest,
      com.comdex.rewards.v1beta1.QueryEpochTimeResponse> getQueryEpochTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryEpochTime",
      requestType = com.comdex.rewards.v1beta1.QueryEpochTimeRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryEpochTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochTimeRequest,
      com.comdex.rewards.v1beta1.QueryEpochTimeResponse> getQueryEpochTimeMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryEpochTimeRequest, com.comdex.rewards.v1beta1.QueryEpochTimeResponse> getQueryEpochTimeMethod;
    if ((getQueryEpochTimeMethod = QueryGrpc.getQueryEpochTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryEpochTimeMethod = QueryGrpc.getQueryEpochTimeMethod) == null) {
          QueryGrpc.getQueryEpochTimeMethod = getQueryEpochTimeMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryEpochTimeRequest, com.comdex.rewards.v1beta1.QueryEpochTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryEpochTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryEpochTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryEpochTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryEpochTime"))
              .build();
        }
      }
    }
    return getQueryEpochTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest,
      com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> getQueryExtLendRewardsAPRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtLendRewardsAPR",
      requestType = com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest.class,
      responseType = com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest,
      com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> getQueryExtLendRewardsAPRMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest, com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> getQueryExtLendRewardsAPRMethod;
    if ((getQueryExtLendRewardsAPRMethod = QueryGrpc.getQueryExtLendRewardsAPRMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtLendRewardsAPRMethod = QueryGrpc.getQueryExtLendRewardsAPRMethod) == null) {
          QueryGrpc.getQueryExtLendRewardsAPRMethod = getQueryExtLendRewardsAPRMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest, com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtLendRewardsAPR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtLendRewardsAPR"))
              .build();
        }
      }
    }
    return getQueryExtLendRewardsAPRMethod;
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
     */
    default void params(com.comdex.rewards.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllEpochsInfo(com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllEpochsInfoMethod(), responseObserver);
    }

    /**
     */
    default void queryEpochInfoByDuration(com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryEpochInfoByDurationMethod(), responseObserver);
    }

    /**
     */
    default void queryAllGauges(com.comdex.rewards.v1beta1.QueryAllGaugesRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllGaugesMethod(), responseObserver);
    }

    /**
     */
    default void queryGaugeByID(com.comdex.rewards.v1beta1.QueryGaugeByIdRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryGaugeByIDMethod(), responseObserver);
    }

    /**
     */
    default void queryGaugeByDuration(com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryGaugeByDurationMethod(), responseObserver);
    }

    /**
     */
    default void queryRewards(com.comdex.rewards.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryRewardsMethod(), responseObserver);
    }

    /**
     */
    default void queryReward(com.comdex.rewards.v1beta1.QueryRewardRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryRewardMethod(), responseObserver);
    }

    /**
     */
    default void queryExternalRewardsLockers(com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExternalRewardsLockersMethod(), responseObserver);
    }

    /**
     */
    default void queryExternalRewardVaults(com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExternalRewardVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryWhitelistedAppIdsVault(com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryWhitelistedAppIdsVaultMethod(), responseObserver);
    }

    /**
     */
    default void queryExternalRewardLends(com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExternalRewardLendsMethod(), responseObserver);
    }

    /**
     */
    default void queryExternalRewardStableMint(com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExternalRewardStableMintMethod(), responseObserver);
    }

    /**
     */
    default void queryEpochTime(com.comdex.rewards.v1beta1.QueryEpochTimeRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryEpochTimeMethod(), responseObserver);
    }

    /**
     */
    default void queryExtLendRewardsAPR(com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtLendRewardsAPRMethod(), responseObserver);
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
     */
    public void params(com.comdex.rewards.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllEpochsInfo(com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllEpochsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryEpochInfoByDuration(com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryEpochInfoByDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllGauges(com.comdex.rewards.v1beta1.QueryAllGaugesRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryGaugeByID(com.comdex.rewards.v1beta1.QueryGaugeByIdRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryGaugeByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryGaugeByDuration(com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryGaugeByDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryRewards(com.comdex.rewards.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryReward(com.comdex.rewards.v1beta1.QueryRewardRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExternalRewardsLockers(com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExternalRewardsLockersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExternalRewardVaults(com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExternalRewardVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryWhitelistedAppIdsVault(com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryWhitelistedAppIdsVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExternalRewardLends(com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExternalRewardLendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExternalRewardStableMint(com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExternalRewardStableMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryEpochTime(com.comdex.rewards.v1beta1.QueryEpochTimeRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryEpochTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtLendRewardsAPR(com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtLendRewardsAPRMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.comdex.rewards.v1beta1.QueryParamsResponse params(com.comdex.rewards.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse queryAllEpochsInfo(com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllEpochsInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse queryEpochInfoByDuration(com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryEpochInfoByDurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryAllGaugesResponse queryAllGauges(com.comdex.rewards.v1beta1.QueryAllGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllGaugesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryGaugeByIdResponse queryGaugeByID(com.comdex.rewards.v1beta1.QueryGaugeByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryGaugeByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse queryGaugeByDuration(com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryGaugeByDurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryRewardsResponse queryRewards(com.comdex.rewards.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryRewardResponse queryReward(com.comdex.rewards.v1beta1.QueryRewardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse queryExternalRewardsLockers(com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExternalRewardsLockersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse queryExternalRewardVaults(com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExternalRewardVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse queryWhitelistedAppIdsVault(com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryWhitelistedAppIdsVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse queryExternalRewardLends(com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExternalRewardLendsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse queryExternalRewardStableMint(com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExternalRewardStableMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryEpochTimeResponse queryEpochTime(com.comdex.rewards.v1beta1.QueryEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryEpochTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse queryExtLendRewardsAPR(com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtLendRewardsAPRMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryParamsResponse> params(
        com.comdex.rewards.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse> queryAllEpochsInfo(
        com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllEpochsInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse> queryEpochInfoByDuration(
        com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryEpochInfoByDurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryAllGaugesResponse> queryAllGauges(
        com.comdex.rewards.v1beta1.QueryAllGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllGaugesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryGaugeByIdResponse> queryGaugeByID(
        com.comdex.rewards.v1beta1.QueryGaugeByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryGaugeByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse> queryGaugeByDuration(
        com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryGaugeByDurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryRewardsResponse> queryRewards(
        com.comdex.rewards.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryRewardResponse> queryReward(
        com.comdex.rewards.v1beta1.QueryRewardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse> queryExternalRewardsLockers(
        com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExternalRewardsLockersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse> queryExternalRewardVaults(
        com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExternalRewardVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse> queryWhitelistedAppIdsVault(
        com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryWhitelistedAppIdsVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse> queryExternalRewardLends(
        com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExternalRewardLendsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse> queryExternalRewardStableMint(
        com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExternalRewardStableMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryEpochTimeResponse> queryEpochTime(
        com.comdex.rewards.v1beta1.QueryEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryEpochTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse> queryExtLendRewardsAPR(
        com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtLendRewardsAPRMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_QUERY_ALL_EPOCHS_INFO = 1;
  private static final int METHODID_QUERY_EPOCH_INFO_BY_DURATION = 2;
  private static final int METHODID_QUERY_ALL_GAUGES = 3;
  private static final int METHODID_QUERY_GAUGE_BY_ID = 4;
  private static final int METHODID_QUERY_GAUGE_BY_DURATION = 5;
  private static final int METHODID_QUERY_REWARDS = 6;
  private static final int METHODID_QUERY_REWARD = 7;
  private static final int METHODID_QUERY_EXTERNAL_REWARDS_LOCKERS = 8;
  private static final int METHODID_QUERY_EXTERNAL_REWARD_VAULTS = 9;
  private static final int METHODID_QUERY_WHITELISTED_APP_IDS_VAULT = 10;
  private static final int METHODID_QUERY_EXTERNAL_REWARD_LENDS = 11;
  private static final int METHODID_QUERY_EXTERNAL_REWARD_STABLE_MINT = 12;
  private static final int METHODID_QUERY_EPOCH_TIME = 13;
  private static final int METHODID_QUERY_EXT_LEND_REWARDS_APR = 14;

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
        case METHODID_PARAMS:
          serviceImpl.params((com.comdex.rewards.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_EPOCHS_INFO:
          serviceImpl.queryAllEpochsInfo((com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_EPOCH_INFO_BY_DURATION:
          serviceImpl.queryEpochInfoByDuration((com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_GAUGES:
          serviceImpl.queryAllGauges((com.comdex.rewards.v1beta1.QueryAllGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryAllGaugesResponse>) responseObserver);
          break;
        case METHODID_QUERY_GAUGE_BY_ID:
          serviceImpl.queryGaugeByID((com.comdex.rewards.v1beta1.QueryGaugeByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByIdResponse>) responseObserver);
          break;
        case METHODID_QUERY_GAUGE_BY_DURATION:
          serviceImpl.queryGaugeByDuration((com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse>) responseObserver);
          break;
        case METHODID_QUERY_REWARDS:
          serviceImpl.queryRewards((com.comdex.rewards.v1beta1.QueryRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardsResponse>) responseObserver);
          break;
        case METHODID_QUERY_REWARD:
          serviceImpl.queryReward((com.comdex.rewards.v1beta1.QueryRewardRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryRewardResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTERNAL_REWARDS_LOCKERS:
          serviceImpl.queryExternalRewardsLockers((com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTERNAL_REWARD_VAULTS:
          serviceImpl.queryExternalRewardVaults((com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_WHITELISTED_APP_IDS_VAULT:
          serviceImpl.queryWhitelistedAppIdsVault((com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTERNAL_REWARD_LENDS:
          serviceImpl.queryExternalRewardLends((com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTERNAL_REWARD_STABLE_MINT:
          serviceImpl.queryExternalRewardStableMint((com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse>) responseObserver);
          break;
        case METHODID_QUERY_EPOCH_TIME:
          serviceImpl.queryEpochTime((com.comdex.rewards.v1beta1.QueryEpochTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryEpochTimeResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXT_LEND_REWARDS_APR:
          serviceImpl.queryExtLendRewardsAPR((com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryParamsRequest,
              com.comdex.rewards.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryAllEpochsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryAllEpochsInfoRequest,
              com.comdex.rewards.v1beta1.QueryAllEpochsInfoResponse>(
                service, METHODID_QUERY_ALL_EPOCHS_INFO)))
        .addMethod(
          getQueryEpochInfoByDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest,
              com.comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse>(
                service, METHODID_QUERY_EPOCH_INFO_BY_DURATION)))
        .addMethod(
          getQueryAllGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryAllGaugesRequest,
              com.comdex.rewards.v1beta1.QueryAllGaugesResponse>(
                service, METHODID_QUERY_ALL_GAUGES)))
        .addMethod(
          getQueryGaugeByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryGaugeByIdRequest,
              com.comdex.rewards.v1beta1.QueryGaugeByIdResponse>(
                service, METHODID_QUERY_GAUGE_BY_ID)))
        .addMethod(
          getQueryGaugeByDurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryGaugesByDurationRequest,
              com.comdex.rewards.v1beta1.QueryGaugeByDurationResponse>(
                service, METHODID_QUERY_GAUGE_BY_DURATION)))
        .addMethod(
          getQueryRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryRewardsRequest,
              com.comdex.rewards.v1beta1.QueryRewardsResponse>(
                service, METHODID_QUERY_REWARDS)))
        .addMethod(
          getQueryRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryRewardRequest,
              com.comdex.rewards.v1beta1.QueryRewardResponse>(
                service, METHODID_QUERY_REWARD)))
        .addMethod(
          getQueryExternalRewardsLockersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest,
              com.comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse>(
                service, METHODID_QUERY_EXTERNAL_REWARDS_LOCKERS)))
        .addMethod(
          getQueryExternalRewardVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest,
              com.comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse>(
                service, METHODID_QUERY_EXTERNAL_REWARD_VAULTS)))
        .addMethod(
          getQueryWhitelistedAppIdsVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest,
              com.comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse>(
                service, METHODID_QUERY_WHITELISTED_APP_IDS_VAULT)))
        .addMethod(
          getQueryExternalRewardLendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryExternalRewardLendsRequest,
              com.comdex.rewards.v1beta1.QueryExternalRewardLendsResponse>(
                service, METHODID_QUERY_EXTERNAL_REWARD_LENDS)))
        .addMethod(
          getQueryExternalRewardStableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest,
              com.comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse>(
                service, METHODID_QUERY_EXTERNAL_REWARD_STABLE_MINT)))
        .addMethod(
          getQueryEpochTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryEpochTimeRequest,
              com.comdex.rewards.v1beta1.QueryEpochTimeResponse>(
                service, METHODID_QUERY_EPOCH_TIME)))
        .addMethod(
          getQueryExtLendRewardsAPRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest,
              com.comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse>(
                service, METHODID_QUERY_EXT_LEND_REWARDS_APR)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.rewards.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getQueryAllEpochsInfoMethod())
              .addMethod(getQueryEpochInfoByDurationMethod())
              .addMethod(getQueryAllGaugesMethod())
              .addMethod(getQueryGaugeByIDMethod())
              .addMethod(getQueryGaugeByDurationMethod())
              .addMethod(getQueryRewardsMethod())
              .addMethod(getQueryRewardMethod())
              .addMethod(getQueryExternalRewardsLockersMethod())
              .addMethod(getQueryExternalRewardVaultsMethod())
              .addMethod(getQueryWhitelistedAppIdsVaultMethod())
              .addMethod(getQueryExternalRewardLendsMethod())
              .addMethod(getQueryExternalRewardStableMintMethod())
              .addMethod(getQueryEpochTimeMethod())
              .addMethod(getQueryExtLendRewardsAPRMethod())
              .build();
        }
      }
    }
    return result;
  }
}
