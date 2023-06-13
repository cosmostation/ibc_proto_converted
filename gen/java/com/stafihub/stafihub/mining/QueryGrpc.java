package com.stafihub.stafihub.mining;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/mining/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.mining.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest, com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest, com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> getStakePoolInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakePoolInfo",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> getStakePoolInfoMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> getStakePoolInfoMethod;
    if ((getStakePoolInfoMethod = QueryGrpc.getStakePoolInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakePoolInfoMethod = QueryGrpc.getStakePoolInfoMethod) == null) {
          QueryGrpc.getStakePoolInfoMethod = getStakePoolInfoMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakePoolInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakePoolInfo"))
              .build();
        }
      }
    }
    return getStakePoolInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> getStakeItemListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeItemList",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> getStakeItemListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> getStakeItemListMethod;
    if ((getStakeItemListMethod = QueryGrpc.getStakeItemListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeItemListMethod = QueryGrpc.getStakeItemListMethod) == null) {
          QueryGrpc.getStakeItemListMethod = getStakeItemListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeItemList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeItemList"))
              .build();
        }
      }
    }
    return getStakeItemListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> getStakeRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeReward",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> getStakeRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> getStakeRewardMethod;
    if ((getStakeRewardMethod = QueryGrpc.getStakeRewardMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRewardMethod = QueryGrpc.getStakeRewardMethod) == null) {
          QueryGrpc.getStakeRewardMethod = getStakeRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeReward"))
              .build();
        }
      }
    }
    return getStakeRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> getStakeRecordCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecordCount",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> getStakeRecordCountMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> getStakeRecordCountMethod;
    if ((getStakeRecordCountMethod = QueryGrpc.getStakeRecordCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordCountMethod = QueryGrpc.getStakeRecordCountMethod) == null) {
          QueryGrpc.getStakeRecordCountMethod = getStakeRecordCountMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecordCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecordCount"))
              .build();
        }
      }
    }
    return getStakeRecordCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> getStakeRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecord",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> getStakeRecordMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> getStakeRecordMethod;
    if ((getStakeRecordMethod = QueryGrpc.getStakeRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordMethod = QueryGrpc.getStakeRecordMethod) == null) {
          QueryGrpc.getStakeRecordMethod = getStakeRecordMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecord"))
              .build();
        }
      }
    }
    return getStakeRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> getStakeRecordListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakeRecordList",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> getStakeRecordListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> getStakeRecordListMethod;
    if ((getStakeRecordListMethod = QueryGrpc.getStakeRecordListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakeRecordListMethod = QueryGrpc.getStakeRecordListMethod) == null) {
          QueryGrpc.getStakeRecordListMethod = getStakeRecordListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakeRecordList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakeRecordList"))
              .build();
        }
      }
    }
    return getStakeRecordListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> getStakePoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakePoolList",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> getStakePoolListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> getStakePoolListMethod;
    if ((getStakePoolListMethod = QueryGrpc.getStakePoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakePoolListMethod = QueryGrpc.getStakePoolListMethod) == null) {
          QueryGrpc.getStakePoolListMethod = getStakePoolListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest, com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakePoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StakePoolList"))
              .build();
        }
      }
    }
    return getStakePoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> getMiningProviderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MiningProviderList",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> getMiningProviderListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest, com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> getMiningProviderListMethod;
    if ((getMiningProviderListMethod = QueryGrpc.getMiningProviderListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMiningProviderListMethod = QueryGrpc.getMiningProviderListMethod) == null) {
          QueryGrpc.getMiningProviderListMethod = getMiningProviderListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest, com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MiningProviderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MiningProviderList"))
              .build();
        }
      }
    }
    return getMiningProviderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> getRewardTokenListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardTokenList",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> getRewardTokenListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest, com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> getRewardTokenListMethod;
    if ((getRewardTokenListMethod = QueryGrpc.getRewardTokenListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardTokenListMethod = QueryGrpc.getRewardTokenListMethod) == null) {
          QueryGrpc.getRewardTokenListMethod = getRewardTokenListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest, com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardTokenList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardTokenList"))
              .build();
        }
      }
    }
    return getRewardTokenListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxRewardPoolNumber",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest, com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> getMaxRewardPoolNumberMethod;
    if ((getMaxRewardPoolNumberMethod = QueryGrpc.getMaxRewardPoolNumberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxRewardPoolNumberMethod = QueryGrpc.getMaxRewardPoolNumberMethod) == null) {
          QueryGrpc.getMaxRewardPoolNumberMethod = getMaxRewardPoolNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest, com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxRewardPoolNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxRewardPoolNumber"))
              .build();
        }
      }
    }
    return getMaxRewardPoolNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxStakeItemNumber",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest, com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> getMaxStakeItemNumberMethod;
    if ((getMaxStakeItemNumberMethod = QueryGrpc.getMaxStakeItemNumberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxStakeItemNumberMethod = QueryGrpc.getMaxStakeItemNumberMethod) == null) {
          QueryGrpc.getMaxStakeItemNumberMethod = getMaxStakeItemNumberMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest, com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxStakeItemNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxStakeItemNumber"))
              .build();
        }
      }
    }
    return getMaxStakeItemNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> getProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderSwitch",
      requestType = com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest.class,
      responseType = com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest,
      com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> getProviderSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest, com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> getProviderSwitchMethod;
    if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
          QueryGrpc.getProviderSwitchMethod = getProviderSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest, com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderSwitch"))
              .build();
        }
      }
    }
    return getProviderSwitchMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    default void stakePoolInfo(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakePoolInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    default void stakeItemList(com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeItemListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    default void stakeReward(com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    default void stakeRecordCount(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeRecordCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    default void stakeRecord(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    default void stakeRecordList(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeRecordListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    default void stakePoolList(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakePoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    default void miningProviderList(com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMiningProviderListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    default void rewardTokenList(com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardTokenListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    default void maxRewardPoolNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxRewardPoolNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    default void maxStakeItemNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxStakeItemNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    default void providerSwitch(com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderSwitchMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public void stakePoolInfo(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakePoolInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public void stakeItemList(com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeItemListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public void stakeReward(com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public void stakeRecordCount(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeRecordCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public void stakeRecord(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public void stakeRecordList(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeRecordListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public void stakePoolList(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakePoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public void miningProviderList(com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMiningProviderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public void rewardTokenList(com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardTokenListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public void maxRewardPoolNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxRewardPoolNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public void maxStakeItemNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxStakeItemNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse params(com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse stakePoolInfo(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakePoolInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse stakeItemList(com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeItemListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse stakeReward(com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse stakeRecordCount(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeRecordCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse stakeRecord(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse stakeRecordList(com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeRecordListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse stakePoolList(com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakePoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse miningProviderList(com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMiningProviderListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse rewardTokenList(com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardTokenListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse maxRewardPoolNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxRewardPoolNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse maxStakeItemNumber(com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxStakeItemNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse providerSwitch(com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderSwitchMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse> params(
        com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolInfo items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse> stakePoolInfo(
        com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakePoolInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeItemList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse> stakeItemList(
        com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeItemListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeReward items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse> stakeReward(
        com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse> stakeRecordCount(
        com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeRecordCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecord items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse> stakeRecord(
        com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakeRecordList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse> stakeRecordList(
        com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeRecordListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StakePoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse> stakePoolList(
        com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakePoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MiningProviderList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse> miningProviderList(
        com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMiningProviderListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RewardTokenList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse> rewardTokenList(
        com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardTokenListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MaxRewardPoolNumber items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse> maxRewardPoolNumber(
        com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxRewardPoolNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MaxStakeItemNumber items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse> maxStakeItemNumber(
        com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxStakeItemNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse> providerSwitch(
        com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_STAKE_POOL_INFO = 1;
  private static final int METHODID_STAKE_ITEM_LIST = 2;
  private static final int METHODID_STAKE_REWARD = 3;
  private static final int METHODID_STAKE_RECORD_COUNT = 4;
  private static final int METHODID_STAKE_RECORD = 5;
  private static final int METHODID_STAKE_RECORD_LIST = 6;
  private static final int METHODID_STAKE_POOL_LIST = 7;
  private static final int METHODID_MINING_PROVIDER_LIST = 8;
  private static final int METHODID_REWARD_TOKEN_LIST = 9;
  private static final int METHODID_MAX_REWARD_POOL_NUMBER = 10;
  private static final int METHODID_MAX_STAKE_ITEM_NUMBER = 11;
  private static final int METHODID_PROVIDER_SWITCH = 12;

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
          serviceImpl.params((com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_STAKE_POOL_INFO:
          serviceImpl.stakePoolInfo((com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse>) responseObserver);
          break;
        case METHODID_STAKE_ITEM_LIST:
          serviceImpl.stakeItemList((com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse>) responseObserver);
          break;
        case METHODID_STAKE_REWARD:
          serviceImpl.stakeReward((com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD_COUNT:
          serviceImpl.stakeRecordCount((com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD:
          serviceImpl.stakeRecord((com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse>) responseObserver);
          break;
        case METHODID_STAKE_RECORD_LIST:
          serviceImpl.stakeRecordList((com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse>) responseObserver);
          break;
        case METHODID_STAKE_POOL_LIST:
          serviceImpl.stakePoolList((com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse>) responseObserver);
          break;
        case METHODID_MINING_PROVIDER_LIST:
          serviceImpl.miningProviderList((com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse>) responseObserver);
          break;
        case METHODID_REWARD_TOKEN_LIST:
          serviceImpl.rewardTokenList((com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse>) responseObserver);
          break;
        case METHODID_MAX_REWARD_POOL_NUMBER:
          serviceImpl.maxRewardPoolNumber((com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse>) responseObserver);
          break;
        case METHODID_MAX_STAKE_ITEM_NUMBER:
          serviceImpl.maxStakeItemNumber((com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_SWITCH:
          serviceImpl.providerSwitch((com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse>) responseObserver);
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
              com.stafihub.stafihub.mining.QueryProto.QueryParamsRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getStakePoolInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakePoolInfoResponse>(
                service, METHODID_STAKE_POOL_INFO)))
        .addMethod(
          getStakeItemListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakeItemListResponse>(
                service, METHODID_STAKE_ITEM_LIST)))
        .addMethod(
          getStakeRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRewardResponse>(
                service, METHODID_STAKE_REWARD)))
        .addMethod(
          getStakeRecordCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordCountResponse>(
                service, METHODID_STAKE_RECORD_COUNT)))
        .addMethod(
          getStakeRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordResponse>(
                service, METHODID_STAKE_RECORD)))
        .addMethod(
          getStakeRecordListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakeRecordListResponse>(
                service, METHODID_STAKE_RECORD_LIST)))
        .addMethod(
          getStakePoolListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryStakePoolListResponse>(
                service, METHODID_STAKE_POOL_LIST)))
        .addMethod(
          getMiningProviderListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryMiningProviderListResponse>(
                service, METHODID_MINING_PROVIDER_LIST)))
        .addMethod(
          getRewardTokenListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryRewardTokenListResponse>(
                service, METHODID_REWARD_TOKEN_LIST)))
        .addMethod(
          getMaxRewardPoolNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryMaxRewardPoolNumberResponse>(
                service, METHODID_MAX_REWARD_POOL_NUMBER)))
        .addMethod(
          getMaxStakeItemNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryMaxStakeItemNumberResponse>(
                service, METHODID_MAX_STAKE_ITEM_NUMBER)))
        .addMethod(
          getProviderSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchRequest,
              com.stafihub.stafihub.mining.QueryProto.QueryProviderSwitchResponse>(
                service, METHODID_PROVIDER_SWITCH)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.mining.QueryProto.getDescriptor();
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
              .addMethod(getStakePoolInfoMethod())
              .addMethod(getStakeItemListMethod())
              .addMethod(getStakeRewardMethod())
              .addMethod(getStakeRecordCountMethod())
              .addMethod(getStakeRecordMethod())
              .addMethod(getStakeRecordListMethod())
              .addMethod(getStakePoolListMethod())
              .addMethod(getMiningProviderListMethod())
              .addMethod(getRewardTokenListMethod())
              .addMethod(getMaxRewardPoolNumberMethod())
              .addMethod(getMaxStakeItemNumberMethod())
              .addMethod(getProviderSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
