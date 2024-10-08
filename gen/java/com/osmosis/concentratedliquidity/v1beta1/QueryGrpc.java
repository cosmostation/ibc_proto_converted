package com.osmosis.concentratedliquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/concentratedliquidity/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.concentratedliquidity.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> getUserPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPositions",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> getUserPositionsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> getUserPositionsMethod;
    if ((getUserPositionsMethod = QueryGrpc.getUserPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserPositionsMethod = QueryGrpc.getUserPositionsMethod) == null) {
          QueryGrpc.getUserPositionsMethod = getUserPositionsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserPositions"))
              .build();
        }
      }
    }
    return getUserPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityPerTickRange",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod;
    if ((getLiquidityPerTickRangeMethod = QueryGrpc.getLiquidityPerTickRangeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityPerTickRangeMethod = QueryGrpc.getLiquidityPerTickRangeMethod) == null) {
          QueryGrpc.getLiquidityPerTickRangeMethod = getLiquidityPerTickRangeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityPerTickRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityPerTickRange"))
              .build();
        }
      }
    }
    return getLiquidityPerTickRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityNetInDirection",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod;
    if ((getLiquidityNetInDirectionMethod = QueryGrpc.getLiquidityNetInDirectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityNetInDirectionMethod = QueryGrpc.getLiquidityNetInDirectionMethod) == null) {
          QueryGrpc.getLiquidityNetInDirectionMethod = getLiquidityNetInDirectionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityNetInDirection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityNetInDirection"))
              .build();
        }
      }
    }
    return getLiquidityNetInDirectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimableSpreadRewards",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod;
    if ((getClaimableSpreadRewardsMethod = QueryGrpc.getClaimableSpreadRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimableSpreadRewardsMethod = QueryGrpc.getClaimableSpreadRewardsMethod) == null) {
          QueryGrpc.getClaimableSpreadRewardsMethod = getClaimableSpreadRewardsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimableSpreadRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimableSpreadRewards"))
              .build();
        }
      }
    }
    return getClaimableSpreadRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> getClaimableIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimableIncentives",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> getClaimableIncentivesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> getClaimableIncentivesMethod;
    if ((getClaimableIncentivesMethod = QueryGrpc.getClaimableIncentivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimableIncentivesMethod = QueryGrpc.getClaimableIncentivesMethod) == null) {
          QueryGrpc.getClaimableIncentivesMethod = getClaimableIncentivesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimableIncentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimableIncentives"))
              .build();
        }
      }
    }
    return getClaimableIncentivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> getPositionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PositionById",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> getPositionByIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> getPositionByIdMethod;
    if ((getPositionByIdMethod = QueryGrpc.getPositionByIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionByIdMethod = QueryGrpc.getPositionByIdMethod) == null) {
          QueryGrpc.getPositionByIdMethod = getPositionByIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PositionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PositionById"))
              .build();
        }
      }
    }
    return getPositionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> getPoolAccumulatorRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolAccumulatorRewards",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> getPoolAccumulatorRewardsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> getPoolAccumulatorRewardsMethod;
    if ((getPoolAccumulatorRewardsMethod = QueryGrpc.getPoolAccumulatorRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolAccumulatorRewardsMethod = QueryGrpc.getPoolAccumulatorRewardsMethod) == null) {
          QueryGrpc.getPoolAccumulatorRewardsMethod = getPoolAccumulatorRewardsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolAccumulatorRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolAccumulatorRewards"))
              .build();
        }
      }
    }
    return getPoolAccumulatorRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> getIncentiveRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentiveRecords",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> getIncentiveRecordsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> getIncentiveRecordsMethod;
    if ((getIncentiveRecordsMethod = QueryGrpc.getIncentiveRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentiveRecordsMethod = QueryGrpc.getIncentiveRecordsMethod) == null) {
          QueryGrpc.getIncentiveRecordsMethod = getIncentiveRecordsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentiveRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentiveRecords"))
              .build();
        }
      }
    }
    return getIncentiveRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> getTickAccumulatorTrackersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TickAccumulatorTrackers",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> getTickAccumulatorTrackersMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> getTickAccumulatorTrackersMethod;
    if ((getTickAccumulatorTrackersMethod = QueryGrpc.getTickAccumulatorTrackersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTickAccumulatorTrackersMethod = QueryGrpc.getTickAccumulatorTrackersMethod) == null) {
          QueryGrpc.getTickAccumulatorTrackersMethod = getTickAccumulatorTrackersMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TickAccumulatorTrackers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TickAccumulatorTrackers"))
              .build();
        }
      }
    }
    return getTickAccumulatorTrackersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> getCFMMPoolIdLinkFromConcentratedPoolIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CFMMPoolIdLinkFromConcentratedPoolId",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> getCFMMPoolIdLinkFromConcentratedPoolIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> getCFMMPoolIdLinkFromConcentratedPoolIdMethod;
    if ((getCFMMPoolIdLinkFromConcentratedPoolIdMethod = QueryGrpc.getCFMMPoolIdLinkFromConcentratedPoolIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCFMMPoolIdLinkFromConcentratedPoolIdMethod = QueryGrpc.getCFMMPoolIdLinkFromConcentratedPoolIdMethod) == null) {
          QueryGrpc.getCFMMPoolIdLinkFromConcentratedPoolIdMethod = getCFMMPoolIdLinkFromConcentratedPoolIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CFMMPoolIdLinkFromConcentratedPoolId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CFMMPoolIdLinkFromConcentratedPoolId"))
              .build();
        }
      }
    }
    return getCFMMPoolIdLinkFromConcentratedPoolIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> getUserUnbondingPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserUnbondingPositions",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> getUserUnbondingPositionsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> getUserUnbondingPositionsMethod;
    if ((getUserUnbondingPositionsMethod = QueryGrpc.getUserUnbondingPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserUnbondingPositionsMethod = QueryGrpc.getUserUnbondingPositionsMethod) == null) {
          QueryGrpc.getUserUnbondingPositionsMethod = getUserUnbondingPositionsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserUnbondingPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserUnbondingPositions"))
              .build();
        }
      }
    }
    return getUserUnbondingPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> getGetTotalLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalLiquidity",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> getGetTotalLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> getGetTotalLiquidityMethod;
    if ((getGetTotalLiquidityMethod = QueryGrpc.getGetTotalLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetTotalLiquidityMethod = QueryGrpc.getGetTotalLiquidityMethod) == null) {
          QueryGrpc.getGetTotalLiquidityMethod = getGetTotalLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetTotalLiquidity"))
              .build();
        }
      }
    }
    return getGetTotalLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> getNumNextInitializedTicksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NumNextInitializedTicks",
      requestType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest,
      com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> getNumNextInitializedTicksMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> getNumNextInitializedTicksMethod;
    if ((getNumNextInitializedTicksMethod = QueryGrpc.getNumNextInitializedTicksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNumNextInitializedTicksMethod = QueryGrpc.getNumNextInitializedTicksMethod) == null) {
          QueryGrpc.getNumNextInitializedTicksMethod = getNumNextInitializedTicksMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest, com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NumNextInitializedTicks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NumNextInitializedTicks"))
              .build();
        }
      }
    }
    return getNumNextInitializedTicksMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    default void pools(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    default void params(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated positions of some address.
     * </pre>
     */
    default void userPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    default void liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityPerTickRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    default void liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityNetInDirectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    default void claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimableSpreadRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    default void claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimableIncentivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    default void positionById(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolAccumulatorRewards returns the pool-global accumulator rewards.
     * Contains spread factor rewards and uptime rewards.
     * </pre>
     */
    default void poolAccumulatorRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolAccumulatorRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentiveRecords returns the incentive records for a given poolId
     * </pre>
     */
    default void incentiveRecords(com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentiveRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TickAccumulatorTrackers returns the tick accumulator trackers.
     * Contains spread factor and uptime accumulator trackers.
     * </pre>
     */
    default void tickAccumulatorTrackers(com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTickAccumulatorTrackersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CFMMPoolIdLinkFromConcentratedPoolId returns the pool id of the CFMM
     * pool that is linked with the given concentrated pool.
     * </pre>
     */
    default void cFMMPoolIdLinkFromConcentratedPoolId(com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCFMMPoolIdLinkFromConcentratedPoolIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserUnbondingPositions returns the position and lock info of unbonding
     * positions of the given address.
     * </pre>
     */
    default void userUnbondingPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserUnbondingPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTotalLiquidity returns total liquidity across all cl pools.
     * </pre>
     */
    default void getTotalLiquidity(com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * NumNextInitializedTicks returns the provided number of next initialized
     * ticks in the direction of swapping the token in denom.
     * </pre>
     */
    default void numNextInitializedTicks(com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNumNextInitializedTicksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public void pools(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public void params(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated positions of some address.
     * </pre>
     */
    public void userPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public void liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityPerTickRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public void liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityNetInDirectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public void claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimableSpreadRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public void claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimableIncentivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public void positionById(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolAccumulatorRewards returns the pool-global accumulator rewards.
     * Contains spread factor rewards and uptime rewards.
     * </pre>
     */
    public void poolAccumulatorRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolAccumulatorRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentiveRecords returns the incentive records for a given poolId
     * </pre>
     */
    public void incentiveRecords(com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentiveRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TickAccumulatorTrackers returns the tick accumulator trackers.
     * Contains spread factor and uptime accumulator trackers.
     * </pre>
     */
    public void tickAccumulatorTrackers(com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTickAccumulatorTrackersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CFMMPoolIdLinkFromConcentratedPoolId returns the pool id of the CFMM
     * pool that is linked with the given concentrated pool.
     * </pre>
     */
    public void cFMMPoolIdLinkFromConcentratedPoolId(com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCFMMPoolIdLinkFromConcentratedPoolIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserUnbondingPositions returns the position and lock info of unbonding
     * positions of the given address.
     * </pre>
     */
    public void userUnbondingPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserUnbondingPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTotalLiquidity returns total liquidity across all cl pools.
     * </pre>
     */
    public void getTotalLiquidity(com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NumNextInitializedTicks returns the provided number of next initialized
     * ticks in the direction of swapping the token in denom.
     * </pre>
     */
    public void numNextInitializedTicks(com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNumNextInitializedTicksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse pools(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse params(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated positions of some address.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse userPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityPerTickRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityNetInDirectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimableSpreadRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimableIncentivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse positionById(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolAccumulatorRewards returns the pool-global accumulator rewards.
     * Contains spread factor rewards and uptime rewards.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse poolAccumulatorRewards(com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolAccumulatorRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentiveRecords returns the incentive records for a given poolId
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse incentiveRecords(com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentiveRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TickAccumulatorTrackers returns the tick accumulator trackers.
     * Contains spread factor and uptime accumulator trackers.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse tickAccumulatorTrackers(com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTickAccumulatorTrackersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CFMMPoolIdLinkFromConcentratedPoolId returns the pool id of the CFMM
     * pool that is linked with the given concentrated pool.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse cFMMPoolIdLinkFromConcentratedPoolId(com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCFMMPoolIdLinkFromConcentratedPoolIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserUnbondingPositions returns the position and lock info of unbonding
     * positions of the given address.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse userUnbondingPositions(com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserUnbondingPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTotalLiquidity returns total liquidity across all cl pools.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse getTotalLiquidity(com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NumNextInitializedTicks returns the provided number of next initialized
     * ticks in the direction of swapping the token in denom.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse numNextInitializedTicks(com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNumNextInitializedTicksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse> pools(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse> params(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated positions of some address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse> userPositions(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse> liquidityPerTickRange(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityPerTickRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse> liquidityNetInDirection(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityNetInDirectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse> claimableSpreadRewards(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimableSpreadRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse> claimableIncentives(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimableIncentivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse> positionById(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolAccumulatorRewards returns the pool-global accumulator rewards.
     * Contains spread factor rewards and uptime rewards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse> poolAccumulatorRewards(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolAccumulatorRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentiveRecords returns the incentive records for a given poolId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse> incentiveRecords(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentiveRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TickAccumulatorTrackers returns the tick accumulator trackers.
     * Contains spread factor and uptime accumulator trackers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse> tickAccumulatorTrackers(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTickAccumulatorTrackersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CFMMPoolIdLinkFromConcentratedPoolId returns the pool id of the CFMM
     * pool that is linked with the given concentrated pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse> cFMMPoolIdLinkFromConcentratedPoolId(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCFMMPoolIdLinkFromConcentratedPoolIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserUnbondingPositions returns the position and lock info of unbonding
     * positions of the given address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse> userUnbondingPositions(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserUnbondingPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTotalLiquidity returns total liquidity across all cl pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse> getTotalLiquidity(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NumNextInitializedTicks returns the provided number of next initialized
     * ticks in the direction of swapping the token in denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse> numNextInitializedTicks(
        com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNumNextInitializedTicksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_USER_POSITIONS = 2;
  private static final int METHODID_LIQUIDITY_PER_TICK_RANGE = 3;
  private static final int METHODID_LIQUIDITY_NET_IN_DIRECTION = 4;
  private static final int METHODID_CLAIMABLE_SPREAD_REWARDS = 5;
  private static final int METHODID_CLAIMABLE_INCENTIVES = 6;
  private static final int METHODID_POSITION_BY_ID = 7;
  private static final int METHODID_POOL_ACCUMULATOR_REWARDS = 8;
  private static final int METHODID_INCENTIVE_RECORDS = 9;
  private static final int METHODID_TICK_ACCUMULATOR_TRACKERS = 10;
  private static final int METHODID_CFMMPOOL_ID_LINK_FROM_CONCENTRATED_POOL_ID = 11;
  private static final int METHODID_USER_UNBONDING_POSITIONS = 12;
  private static final int METHODID_GET_TOTAL_LIQUIDITY = 13;
  private static final int METHODID_NUM_NEXT_INITIALIZED_TICKS = 14;

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
        case METHODID_POOLS:
          serviceImpl.pools((com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse>) responseObserver);
          break;
        case METHODID_USER_POSITIONS:
          serviceImpl.userPositions((com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_PER_TICK_RANGE:
          serviceImpl.liquidityPerTickRange((com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_NET_IN_DIRECTION:
          serviceImpl.liquidityNetInDirection((com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse>) responseObserver);
          break;
        case METHODID_CLAIMABLE_SPREAD_REWARDS:
          serviceImpl.claimableSpreadRewards((com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse>) responseObserver);
          break;
        case METHODID_CLAIMABLE_INCENTIVES:
          serviceImpl.claimableIncentives((com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse>) responseObserver);
          break;
        case METHODID_POSITION_BY_ID:
          serviceImpl.positionById((com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse>) responseObserver);
          break;
        case METHODID_POOL_ACCUMULATOR_REWARDS:
          serviceImpl.poolAccumulatorRewards((com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVE_RECORDS:
          serviceImpl.incentiveRecords((com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse>) responseObserver);
          break;
        case METHODID_TICK_ACCUMULATOR_TRACKERS:
          serviceImpl.tickAccumulatorTrackers((com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse>) responseObserver);
          break;
        case METHODID_CFMMPOOL_ID_LINK_FROM_CONCENTRATED_POOL_ID:
          serviceImpl.cFMMPoolIdLinkFromConcentratedPoolId((com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse>) responseObserver);
          break;
        case METHODID_USER_UNBONDING_POSITIONS:
          serviceImpl.userUnbondingPositions((com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_LIQUIDITY:
          serviceImpl.getTotalLiquidity((com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse>) responseObserver);
          break;
        case METHODID_NUM_NEXT_INITIALIZED_TICKS:
          serviceImpl.numNextInitializedTicks((com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse>) responseObserver);
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
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getUserPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserPositionsResponse>(
                service, METHODID_USER_POSITIONS)))
        .addMethod(
          getLiquidityPerTickRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityPerTickRangeResponse>(
                service, METHODID_LIQUIDITY_PER_TICK_RANGE)))
        .addMethod(
          getLiquidityNetInDirectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.LiquidityNetInDirectionResponse>(
                service, METHODID_LIQUIDITY_NET_IN_DIRECTION)))
        .addMethod(
          getClaimableSpreadRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableSpreadRewardsResponse>(
                service, METHODID_CLAIMABLE_SPREAD_REWARDS)))
        .addMethod(
          getClaimableIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.ClaimableIncentivesResponse>(
                service, METHODID_CLAIMABLE_INCENTIVES)))
        .addMethod(
          getPositionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PositionByIdResponse>(
                service, METHODID_POSITION_BY_ID)))
        .addMethod(
          getPoolAccumulatorRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.PoolAccumulatorRewardsResponse>(
                service, METHODID_POOL_ACCUMULATOR_REWARDS)))
        .addMethod(
          getIncentiveRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.IncentiveRecordsResponse>(
                service, METHODID_INCENTIVE_RECORDS)))
        .addMethod(
          getTickAccumulatorTrackersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.TickAccumulatorTrackersResponse>(
                service, METHODID_TICK_ACCUMULATOR_TRACKERS)))
        .addMethod(
          getCFMMPoolIdLinkFromConcentratedPoolIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.CFMMPoolIdLinkFromConcentratedPoolIdResponse>(
                service, METHODID_CFMMPOOL_ID_LINK_FROM_CONCENTRATED_POOL_ID)))
        .addMethod(
          getUserUnbondingPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.UserUnbondingPositionsResponse>(
                service, METHODID_USER_UNBONDING_POSITIONS)))
        .addMethod(
          getGetTotalLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.GetTotalLiquidityResponse>(
                service, METHODID_GET_TOTAL_LIQUIDITY)))
        .addMethod(
          getNumNextInitializedTicksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksRequest,
              com.osmosis.concentratedliquidity.v1beta1.QueryProto.NumNextInitializedTicksResponse>(
                service, METHODID_NUM_NEXT_INITIALIZED_TICKS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getPoolsMethod())
              .addMethod(getParamsMethod())
              .addMethod(getUserPositionsMethod())
              .addMethod(getLiquidityPerTickRangeMethod())
              .addMethod(getLiquidityNetInDirectionMethod())
              .addMethod(getClaimableSpreadRewardsMethod())
              .addMethod(getClaimableIncentivesMethod())
              .addMethod(getPositionByIdMethod())
              .addMethod(getPoolAccumulatorRewardsMethod())
              .addMethod(getIncentiveRecordsMethod())
              .addMethod(getTickAccumulatorTrackersMethod())
              .addMethod(getCFMMPoolIdLinkFromConcentratedPoolIdMethod())
              .addMethod(getUserUnbondingPositionsMethod())
              .addMethod(getGetTotalLiquidityMethod())
              .addMethod(getNumNextInitializedTicksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
