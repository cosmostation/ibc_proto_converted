package com.osmosis.gamm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: osmosis/gamm/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "osmosis.gamm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> getNumPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NumPools",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> getNumPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> getNumPoolsMethod;
    if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
          QueryGrpc.getNumPoolsMethod = getNumPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NumPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NumPools"))
              .build();
        }
      }
    }
    return getNumPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> getTotalLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalLiquidity",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> getTotalLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> getTotalLiquidityMethod;
    if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
          QueryGrpc.getTotalLiquidityMethod = getTotalLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalLiquidity"))
              .build();
        }
      }
    }
    return getTotalLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolsWithFilter",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod;
    if ((getPoolsWithFilterMethod = QueryGrpc.getPoolsWithFilterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsWithFilterMethod = QueryGrpc.getPoolsWithFilterMethod) == null) {
          QueryGrpc.getPoolsWithFilterMethod = getPoolsWithFilterMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolsWithFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolsWithFilter"))
              .build();
        }
      }
    }
    return getPoolsWithFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> getPoolTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolType",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> getPoolTypeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> getPoolTypeMethod;
    if ((getPoolTypeMethod = QueryGrpc.getPoolTypeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolTypeMethod = QueryGrpc.getPoolTypeMethod) == null) {
          QueryGrpc.getPoolTypeMethod = getPoolTypeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolType"))
              .build();
        }
      }
    }
    return getPoolTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcJoinPoolNoSwapShares",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod;
    if ((getCalcJoinPoolNoSwapSharesMethod = QueryGrpc.getCalcJoinPoolNoSwapSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcJoinPoolNoSwapSharesMethod = QueryGrpc.getCalcJoinPoolNoSwapSharesMethod) == null) {
          QueryGrpc.getCalcJoinPoolNoSwapSharesMethod = getCalcJoinPoolNoSwapSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcJoinPoolNoSwapShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcJoinPoolNoSwapShares"))
              .build();
        }
      }
    }
    return getCalcJoinPoolNoSwapSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcJoinPoolShares",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod;
    if ((getCalcJoinPoolSharesMethod = QueryGrpc.getCalcJoinPoolSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcJoinPoolSharesMethod = QueryGrpc.getCalcJoinPoolSharesMethod) == null) {
          QueryGrpc.getCalcJoinPoolSharesMethod = getCalcJoinPoolSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcJoinPoolShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcJoinPoolShares"))
              .build();
        }
      }
    }
    return getCalcJoinPoolSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcExitPoolCoinsFromShares",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod;
    if ((getCalcExitPoolCoinsFromSharesMethod = QueryGrpc.getCalcExitPoolCoinsFromSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcExitPoolCoinsFromSharesMethod = QueryGrpc.getCalcExitPoolCoinsFromSharesMethod) == null) {
          QueryGrpc.getCalcExitPoolCoinsFromSharesMethod = getCalcExitPoolCoinsFromSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcExitPoolCoinsFromShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcExitPoolCoinsFromShares"))
              .build();
        }
      }
    }
    return getCalcExitPoolCoinsFromSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolParams",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod;
    if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
          QueryGrpc.getPoolParamsMethod = getPoolParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolParams"))
              .build();
        }
      }
    }
    return getPoolParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalPoolLiquidity",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;
    if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
          QueryGrpc.getTotalPoolLiquidityMethod = getTotalPoolLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalPoolLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalPoolLiquidity"))
              .build();
        }
      }
    }
    return getTotalPoolLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> getTotalSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalShares",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> getTotalSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> getTotalSharesMethod;
    if ((getTotalSharesMethod = QueryGrpc.getTotalSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSharesMethod = QueryGrpc.getTotalSharesMethod) == null) {
          QueryGrpc.getTotalSharesMethod = getTotalSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalShares"))
              .build();
        }
      }
    }
    return getTotalSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> getSpotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotPrice",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> getSpotPriceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> getSpotPriceMethod;
    if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
          QueryGrpc.getSpotPriceMethod = getSpotPriceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotPrice"))
              .build();
        }
      }
    }
    return getSpotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountIn",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;
    if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountInMethod = getEstimateSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountIn"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountOut",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;
    if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountOutMethod = getEstimateSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest, com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountOut"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConcentratedPoolIdLinkFromCFMM",
      requestType = com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest,
      com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod;
    if ((getConcentratedPoolIdLinkFromCFMMMethod = QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConcentratedPoolIdLinkFromCFMMMethod = QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod) == null) {
          QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod = getConcentratedPoolIdLinkFromCFMMMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest, com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConcentratedPoolIdLinkFromCFMM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConcentratedPoolIdLinkFromCFMM"))
              .build();
        }
      }
    }
    return getConcentratedPoolIdLinkFromCFMMMethod;
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
     */
    default void pools(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void numPools(com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNumPoolsMethod(), responseObserver);
    }

    /**
     */
    default void totalLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    default void poolsWithFilter(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsWithFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void pool(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolType returns the type of the pool.
     * Returns "Balancer" as a string literal when the pool is a balancer pool.
     * Errors if the pool is failed to be type caseted.
     * </pre>
     */
    default void poolType(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    default void calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcJoinPoolNoSwapSharesMethod(), responseObserver);
    }

    /**
     */
    default void calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcJoinPoolSharesMethod(), responseObserver);
    }

    /**
     */
    default void calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcExitPoolCoinsFromSharesMethod(), responseObserver);
    }

    /**
     */
    default void poolParams(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalPoolLiquidityMethod(), responseObserver);
    }

    /**
     */
    default void totalShares(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    @java.lang.Deprecated
    default void spotPrice(com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    default void concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConcentratedPoolIdLinkFromCFMMMethod(), responseObserver);
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
     */
    public void pools(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void numPools(com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public void poolsWithFilter(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsWithFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void pool(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolType returns the type of the pool.
     * Returns "Balancer" as a string literal when the pool is a balancer pool.
     * Errors if the pool is failed to be type caseted.
     * </pre>
     */
    public void poolType(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public void calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcJoinPoolNoSwapSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcJoinPoolSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcExitPoolCoinsFromSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolParams(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalShares(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    @java.lang.Deprecated
    public void spotPrice(com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public void concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConcentratedPoolIdLinkFromCFMMMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse pools(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse numPools(com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNumPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse totalLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse poolsWithFilter(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsWithFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse pool(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolType returns the type of the pool.
     * Returns "Balancer" as a string literal when the pool is a balancer pool.
     * Errors if the pool is failed to be type caseted.
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse poolType(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcJoinPoolNoSwapSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcJoinPoolSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcExitPoolCoinsFromSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse poolParams(com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalPoolLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse totalShares(com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse spotPrice(com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConcentratedPoolIdLinkFromCFMMMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse> pools(
        com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse> numPools(
        com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse> totalLiquidity(
        com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse> poolsWithFilter(
        com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsWithFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse> pool(
        com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolType returns the type of the pool.
     * Returns "Balancer" as a string literal when the pool is a balancer pool.
     * Errors if the pool is failed to be type caseted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse> poolType(
        com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse> calcJoinPoolNoSwapShares(
        com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcJoinPoolNoSwapSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse> calcJoinPoolShares(
        com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcJoinPoolSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse> calcExitPoolCoinsFromShares(
        com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcExitPoolCoinsFromSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse> poolParams(
        com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse> totalPoolLiquidity(
        com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse> totalShares(
        com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse> spotPrice(
        com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse> estimateSwapExactAmountIn(
        com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse> estimateSwapExactAmountOut(
        com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse> concentratedPoolIdLinkFromCFMM(
        com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConcentratedPoolIdLinkFromCFMMMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_NUM_POOLS = 1;
  private static final int METHODID_TOTAL_LIQUIDITY = 2;
  private static final int METHODID_POOLS_WITH_FILTER = 3;
  private static final int METHODID_POOL = 4;
  private static final int METHODID_POOL_TYPE = 5;
  private static final int METHODID_CALC_JOIN_POOL_NO_SWAP_SHARES = 6;
  private static final int METHODID_CALC_JOIN_POOL_SHARES = 7;
  private static final int METHODID_CALC_EXIT_POOL_COINS_FROM_SHARES = 8;
  private static final int METHODID_POOL_PARAMS = 9;
  private static final int METHODID_TOTAL_POOL_LIQUIDITY = 10;
  private static final int METHODID_TOTAL_SHARES = 11;
  private static final int METHODID_SPOT_PRICE = 12;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN = 13;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT = 14;
  private static final int METHODID_CONCENTRATED_POOL_ID_LINK_FROM_CFMM = 15;

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
          serviceImpl.pools((com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_NUM_POOLS:
          serviceImpl.numPools((com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_LIQUIDITY:
          serviceImpl.totalLiquidity((com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse>) responseObserver);
          break;
        case METHODID_POOLS_WITH_FILTER:
          serviceImpl.poolsWithFilter((com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_TYPE:
          serviceImpl.poolType((com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse>) responseObserver);
          break;
        case METHODID_CALC_JOIN_POOL_NO_SWAP_SHARES:
          serviceImpl.calcJoinPoolNoSwapShares((com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse>) responseObserver);
          break;
        case METHODID_CALC_JOIN_POOL_SHARES:
          serviceImpl.calcJoinPoolShares((com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse>) responseObserver);
          break;
        case METHODID_CALC_EXIT_POOL_COINS_FROM_SHARES:
          serviceImpl.calcExitPoolCoinsFromShares((com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse>) responseObserver);
          break;
        case METHODID_POOL_PARAMS:
          serviceImpl.poolParams((com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_POOL_LIQUIDITY:
          serviceImpl.totalPoolLiquidity((com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SHARES:
          serviceImpl.totalShares((com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse>) responseObserver);
          break;
        case METHODID_SPOT_PRICE:
          serviceImpl.spotPrice((com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.estimateSwapExactAmountIn((com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.estimateSwapExactAmountOut((com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_CONCENTRATED_POOL_ID_LINK_FROM_CFMM:
          serviceImpl.concentratedPoolIdLinkFromCFMM((com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse>) responseObserver);
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
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getNumPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryNumPoolsResponse>(
                service, METHODID_NUM_POOLS)))
        .addMethod(
          getTotalLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalLiquidityResponse>(
                service, METHODID_TOTAL_LIQUIDITY)))
        .addMethod(
          getPoolsWithFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolsWithFilterResponse>(
                service, METHODID_POOLS_WITH_FILTER)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getPoolTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolTypeResponse>(
                service, METHODID_POOL_TYPE)))
        .addMethod(
          getCalcJoinPoolNoSwapSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolNoSwapSharesResponse>(
                service, METHODID_CALC_JOIN_POOL_NO_SWAP_SHARES)))
        .addMethod(
          getCalcJoinPoolSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcJoinPoolSharesResponse>(
                service, METHODID_CALC_JOIN_POOL_SHARES)))
        .addMethod(
          getCalcExitPoolCoinsFromSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryCalcExitPoolCoinsFromSharesResponse>(
                service, METHODID_CALC_EXIT_POOL_COINS_FROM_SHARES)))
        .addMethod(
          getPoolParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryPoolParamsResponse>(
                service, METHODID_POOL_PARAMS)))
        .addMethod(
          getTotalPoolLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalPoolLiquidityResponse>(
                service, METHODID_TOTAL_POOL_LIQUIDITY)))
        .addMethod(
          getTotalSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryTotalSharesResponse>(
                service, METHODID_TOTAL_SHARES)))
        .addMethod(
          getSpotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QuerySpotPriceResponse>(
                service, METHODID_SPOT_PRICE)))
        .addMethod(
          getEstimateSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountInResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getEstimateSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QuerySwapExactAmountOutResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getConcentratedPoolIdLinkFromCFMMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMRequest,
              com.osmosis.gamm.v1beta1.QueryProto.QueryConcentratedPoolIdLinkFromCFMMResponse>(
                service, METHODID_CONCENTRATED_POOL_ID_LINK_FROM_CFMM)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.gamm.v1beta1.QueryProto.getDescriptor();
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
    private final java.lang.String methodName;

    QueryMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getNumPoolsMethod())
              .addMethod(getTotalLiquidityMethod())
              .addMethod(getPoolsWithFilterMethod())
              .addMethod(getPoolMethod())
              .addMethod(getPoolTypeMethod())
              .addMethod(getCalcJoinPoolNoSwapSharesMethod())
              .addMethod(getCalcJoinPoolSharesMethod())
              .addMethod(getCalcExitPoolCoinsFromSharesMethod())
              .addMethod(getPoolParamsMethod())
              .addMethod(getTotalPoolLiquidityMethod())
              .addMethod(getTotalSharesMethod())
              .addMethod(getSpotPriceMethod())
              .addMethod(getEstimateSwapExactAmountInMethod())
              .addMethod(getEstimateSwapExactAmountOutMethod())
              .addMethod(getConcentratedPoolIdLinkFromCFMMMethod())
              .build();
        }
      }
    }
    return result;
  }
}
