package com.osmosis.gamm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/gamm/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.gamm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.osmosis.gamm.v1beta1.QueryPoolsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsRequest, com.osmosis.gamm.v1beta1.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryPoolsRequest, com.osmosis.gamm.v1beta1.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryNumPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> getNumPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NumPools",
      requestType = com.osmosis.gamm.v1beta1.QueryNumPoolsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryNumPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryNumPoolsRequest,
      com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> getNumPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryNumPoolsRequest, com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> getNumPoolsMethod;
    if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
          QueryGrpc.getNumPoolsMethod = getNumPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryNumPoolsRequest, com.osmosis.gamm.v1beta1.QueryNumPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NumPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryNumPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryNumPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NumPools"))
              .build();
        }
      }
    }
    return getNumPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> getTotalLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalLiquidity",
      requestType = com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> getTotalLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest, com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> getTotalLiquidityMethod;
    if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
          QueryGrpc.getTotalLiquidityMethod = getTotalLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest, com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalLiquidity"))
              .build();
        }
      }
    }
    return getTotalLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest,
      com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolsWithFilter",
      requestType = com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest,
      com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest, com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> getPoolsWithFilterMethod;
    if ((getPoolsWithFilterMethod = QueryGrpc.getPoolsWithFilterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsWithFilterMethod = QueryGrpc.getPoolsWithFilterMethod) == null) {
          QueryGrpc.getPoolsWithFilterMethod = getPoolsWithFilterMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest, com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolsWithFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolsWithFilter"))
              .build();
        }
      }
    }
    return getPoolsWithFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolRequest,
      com.osmosis.gamm.v1beta1.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.osmosis.gamm.v1beta1.QueryPoolRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolRequest,
      com.osmosis.gamm.v1beta1.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolRequest, com.osmosis.gamm.v1beta1.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryPoolRequest, com.osmosis.gamm.v1beta1.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolTypeRequest,
      com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> getPoolTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolType",
      requestType = com.osmosis.gamm.v1beta1.QueryPoolTypeRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryPoolTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolTypeRequest,
      com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> getPoolTypeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolTypeRequest, com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> getPoolTypeMethod;
    if ((getPoolTypeMethod = QueryGrpc.getPoolTypeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolTypeMethod = QueryGrpc.getPoolTypeMethod) == null) {
          QueryGrpc.getPoolTypeMethod = getPoolTypeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryPoolTypeRequest, com.osmosis.gamm.v1beta1.QueryPoolTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolType"))
              .build();
        }
      }
    }
    return getPoolTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcJoinPoolNoSwapShares",
      requestType = com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> getCalcJoinPoolNoSwapSharesMethod;
    if ((getCalcJoinPoolNoSwapSharesMethod = QueryGrpc.getCalcJoinPoolNoSwapSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcJoinPoolNoSwapSharesMethod = QueryGrpc.getCalcJoinPoolNoSwapSharesMethod) == null) {
          QueryGrpc.getCalcJoinPoolNoSwapSharesMethod = getCalcJoinPoolNoSwapSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcJoinPoolNoSwapShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcJoinPoolNoSwapShares"))
              .build();
        }
      }
    }
    return getCalcJoinPoolNoSwapSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcJoinPoolShares",
      requestType = com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> getCalcJoinPoolSharesMethod;
    if ((getCalcJoinPoolSharesMethod = QueryGrpc.getCalcJoinPoolSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcJoinPoolSharesMethod = QueryGrpc.getCalcJoinPoolSharesMethod) == null) {
          QueryGrpc.getCalcJoinPoolSharesMethod = getCalcJoinPoolSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcJoinPoolShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcJoinPoolShares"))
              .build();
        }
      }
    }
    return getCalcJoinPoolSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalcExitPoolCoinsFromShares",
      requestType = com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest,
      com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> getCalcExitPoolCoinsFromSharesMethod;
    if ((getCalcExitPoolCoinsFromSharesMethod = QueryGrpc.getCalcExitPoolCoinsFromSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalcExitPoolCoinsFromSharesMethod = QueryGrpc.getCalcExitPoolCoinsFromSharesMethod) == null) {
          QueryGrpc.getCalcExitPoolCoinsFromSharesMethod = getCalcExitPoolCoinsFromSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest, com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcExitPoolCoinsFromShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalcExitPoolCoinsFromShares"))
              .build();
        }
      }
    }
    return getCalcExitPoolCoinsFromSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolParamsRequest,
      com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> getPoolParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolParams",
      requestType = com.osmosis.gamm.v1beta1.QueryPoolParamsRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolParamsRequest,
      com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> getPoolParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryPoolParamsRequest, com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> getPoolParamsMethod;
    if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
          QueryGrpc.getPoolParamsMethod = getPoolParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryPoolParamsRequest, com.osmosis.gamm.v1beta1.QueryPoolParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryPoolParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolParams"))
              .build();
        }
      }
    }
    return getPoolParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalPoolLiquidity",
      requestType = com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest,
      com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest, com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;
    if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
          QueryGrpc.getTotalPoolLiquidityMethod = getTotalPoolLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest, com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalPoolLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalPoolLiquidity"))
              .build();
        }
      }
    }
    return getTotalPoolLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalSharesRequest,
      com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> getTotalSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalShares",
      requestType = com.osmosis.gamm.v1beta1.QueryTotalSharesRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryTotalSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalSharesRequest,
      com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> getTotalSharesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryTotalSharesRequest, com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> getTotalSharesMethod;
    if ((getTotalSharesMethod = QueryGrpc.getTotalSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSharesMethod = QueryGrpc.getTotalSharesMethod) == null) {
          QueryGrpc.getTotalSharesMethod = getTotalSharesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryTotalSharesRequest, com.osmosis.gamm.v1beta1.QueryTotalSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryTotalSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalShares"))
              .build();
        }
      }
    }
    return getTotalSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySpotPriceRequest,
      com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> getSpotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotPrice",
      requestType = com.osmosis.gamm.v1beta1.QuerySpotPriceRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QuerySpotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySpotPriceRequest,
      com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> getSpotPriceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySpotPriceRequest, com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> getSpotPriceMethod;
    if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
          QueryGrpc.getSpotPriceMethod = getSpotPriceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QuerySpotPriceRequest, com.osmosis.gamm.v1beta1.QuerySpotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySpotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySpotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotPrice"))
              .build();
        }
      }
    }
    return getSpotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest,
      com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountIn",
      requestType = com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest,
      com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest, com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;
    if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountInMethod = getEstimateSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest, com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountIn"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest,
      com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountOut",
      requestType = com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest,
      com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest, com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;
    if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountOutMethod = getEstimateSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest, com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountOut"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest,
      com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConcentratedPoolIdLinkFromCFMM",
      requestType = com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest.class,
      responseType = com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest,
      com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest, com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> getConcentratedPoolIdLinkFromCFMMMethod;
    if ((getConcentratedPoolIdLinkFromCFMMMethod = QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConcentratedPoolIdLinkFromCFMMMethod = QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod) == null) {
          QueryGrpc.getConcentratedPoolIdLinkFromCFMMMethod = getConcentratedPoolIdLinkFromCFMMMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest, com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConcentratedPoolIdLinkFromCFMM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse.getDefaultInstance()))
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
    default void pools(com.osmosis.gamm.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void numPools(com.osmosis.gamm.v1beta1.QueryNumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNumPoolsMethod(), responseObserver);
    }

    /**
     */
    default void totalLiquidity(com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    default void poolsWithFilter(com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsWithFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void pool(com.osmosis.gamm.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolType returns the type of the pool.
     * Returns "Balancer" as a string literal when the pool is a balancer pool.
     * Errors if the pool is failed to be type caseted.
     * </pre>
     */
    default void poolType(com.osmosis.gamm.v1beta1.QueryPoolTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    default void calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcJoinPoolNoSwapSharesMethod(), responseObserver);
    }

    /**
     */
    default void calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcJoinPoolSharesMethod(), responseObserver);
    }

    /**
     */
    default void calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcExitPoolCoinsFromSharesMethod(), responseObserver);
    }

    /**
     */
    default void poolParams(com.osmosis.gamm.v1beta1.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalPoolLiquidityMethod(), responseObserver);
    }

    /**
     */
    default void totalShares(com.osmosis.gamm.v1beta1.QueryTotalSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    @java.lang.Deprecated
    default void spotPrice(com.osmosis.gamm.v1beta1.QuerySpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    default void estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    default void concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> responseObserver) {
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
    public void pools(com.osmosis.gamm.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void numPools(com.osmosis.gamm.v1beta1.QueryNumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalLiquidity(com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public void poolsWithFilter(com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsWithFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void pool(com.osmosis.gamm.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolResponse> responseObserver) {
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
    public void poolType(com.osmosis.gamm.v1beta1.QueryPoolTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public void calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcJoinPoolNoSwapSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcJoinPoolSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalcExitPoolCoinsFromSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolParams(com.osmosis.gamm.v1beta1.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalShares(com.osmosis.gamm.v1beta1.QueryTotalSharesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> responseObserver) {
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
    public void spotPrice(com.osmosis.gamm.v1beta1.QuerySpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public void estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public void concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> responseObserver) {
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
    public com.osmosis.gamm.v1beta1.QueryPoolsResponse pools(com.osmosis.gamm.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryNumPoolsResponse numPools(com.osmosis.gamm.v1beta1.QueryNumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNumPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse totalLiquidity(com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse poolsWithFilter(com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsWithFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryPoolResponse pool(com.osmosis.gamm.v1beta1.QueryPoolRequest request) {
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
    public com.osmosis.gamm.v1beta1.QueryPoolTypeResponse poolType(com.osmosis.gamm.v1beta1.QueryPoolTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse calcJoinPoolNoSwapShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcJoinPoolNoSwapSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse calcJoinPoolShares(com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcJoinPoolSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse calcExitPoolCoinsFromShares(com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalcExitPoolCoinsFromSharesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryPoolParamsResponse poolParams(com.osmosis.gamm.v1beta1.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse totalPoolLiquidity(com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalPoolLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.QueryTotalSharesResponse totalShares(com.osmosis.gamm.v1beta1.QueryTotalSharesRequest request) {
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
    public com.osmosis.gamm.v1beta1.QuerySpotPriceResponse spotPrice(com.osmosis.gamm.v1beta1.QuerySpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse estimateSwapExactAmountIn(com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse estimateSwapExactAmountOut(com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse concentratedPoolIdLinkFromCFMM(com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryPoolsResponse> pools(
        com.osmosis.gamm.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryNumPoolsResponse> numPools(
        com.osmosis.gamm.v1beta1.QueryNumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse> totalLiquidity(
        com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolsWithFilter allows you to query specific pools with requested
     * parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse> poolsWithFilter(
        com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsWithFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryPoolResponse> pool(
        com.osmosis.gamm.v1beta1.QueryPoolRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryPoolTypeResponse> poolType(
        com.osmosis.gamm.v1beta1.QueryPoolTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simulates joining pool without a swap. Returns the amount of shares you'd
     * get and tokens needed to provide
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse> calcJoinPoolNoSwapShares(
        com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcJoinPoolNoSwapSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse> calcJoinPoolShares(
        com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcJoinPoolSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse> calcExitPoolCoinsFromShares(
        com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalcExitPoolCoinsFromSharesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryPoolParamsResponse> poolParams(
        com.osmosis.gamm.v1beta1.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse> totalPoolLiquidity(
        com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryTotalSharesResponse> totalShares(
        com.osmosis.gamm.v1beta1.QueryTotalSharesRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QuerySpotPriceResponse> spotPrice(
        com.osmosis.gamm.v1beta1.QuerySpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse> estimateSwapExactAmountIn(
        com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: please use the alternative in x/poolmanager
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse> estimateSwapExactAmountOut(
        com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
     * pool that is linked with the given CFMM pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse> concentratedPoolIdLinkFromCFMM(
        com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest request) {
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
          serviceImpl.pools((com.osmosis.gamm.v1beta1.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_NUM_POOLS:
          serviceImpl.numPools((com.osmosis.gamm.v1beta1.QueryNumPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryNumPoolsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_LIQUIDITY:
          serviceImpl.totalLiquidity((com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse>) responseObserver);
          break;
        case METHODID_POOLS_WITH_FILTER:
          serviceImpl.poolsWithFilter((com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.osmosis.gamm.v1beta1.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_TYPE:
          serviceImpl.poolType((com.osmosis.gamm.v1beta1.QueryPoolTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolTypeResponse>) responseObserver);
          break;
        case METHODID_CALC_JOIN_POOL_NO_SWAP_SHARES:
          serviceImpl.calcJoinPoolNoSwapShares((com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse>) responseObserver);
          break;
        case METHODID_CALC_JOIN_POOL_SHARES:
          serviceImpl.calcJoinPoolShares((com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse>) responseObserver);
          break;
        case METHODID_CALC_EXIT_POOL_COINS_FROM_SHARES:
          serviceImpl.calcExitPoolCoinsFromShares((com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse>) responseObserver);
          break;
        case METHODID_POOL_PARAMS:
          serviceImpl.poolParams((com.osmosis.gamm.v1beta1.QueryPoolParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryPoolParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_POOL_LIQUIDITY:
          serviceImpl.totalPoolLiquidity((com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SHARES:
          serviceImpl.totalShares((com.osmosis.gamm.v1beta1.QueryTotalSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryTotalSharesResponse>) responseObserver);
          break;
        case METHODID_SPOT_PRICE:
          serviceImpl.spotPrice((com.osmosis.gamm.v1beta1.QuerySpotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySpotPriceResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.estimateSwapExactAmountIn((com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.estimateSwapExactAmountOut((com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_CONCENTRATED_POOL_ID_LINK_FROM_CFMM:
          serviceImpl.concentratedPoolIdLinkFromCFMM((com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse>) responseObserver);
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
              com.osmosis.gamm.v1beta1.QueryPoolsRequest,
              com.osmosis.gamm.v1beta1.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getNumPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryNumPoolsRequest,
              com.osmosis.gamm.v1beta1.QueryNumPoolsResponse>(
                service, METHODID_NUM_POOLS)))
        .addMethod(
          getTotalLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryTotalLiquidityRequest,
              com.osmosis.gamm.v1beta1.QueryTotalLiquidityResponse>(
                service, METHODID_TOTAL_LIQUIDITY)))
        .addMethod(
          getPoolsWithFilterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest,
              com.osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse>(
                service, METHODID_POOLS_WITH_FILTER)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryPoolRequest,
              com.osmosis.gamm.v1beta1.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getPoolTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryPoolTypeRequest,
              com.osmosis.gamm.v1beta1.QueryPoolTypeResponse>(
                service, METHODID_POOL_TYPE)))
        .addMethod(
          getCalcJoinPoolNoSwapSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest,
              com.osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse>(
                service, METHODID_CALC_JOIN_POOL_NO_SWAP_SHARES)))
        .addMethod(
          getCalcJoinPoolSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest,
              com.osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse>(
                service, METHODID_CALC_JOIN_POOL_SHARES)))
        .addMethod(
          getCalcExitPoolCoinsFromSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest,
              com.osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse>(
                service, METHODID_CALC_EXIT_POOL_COINS_FROM_SHARES)))
        .addMethod(
          getPoolParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryPoolParamsRequest,
              com.osmosis.gamm.v1beta1.QueryPoolParamsResponse>(
                service, METHODID_POOL_PARAMS)))
        .addMethod(
          getTotalPoolLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest,
              com.osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse>(
                service, METHODID_TOTAL_POOL_LIQUIDITY)))
        .addMethod(
          getTotalSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryTotalSharesRequest,
              com.osmosis.gamm.v1beta1.QueryTotalSharesResponse>(
                service, METHODID_TOTAL_SHARES)))
        .addMethod(
          getSpotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QuerySpotPriceRequest,
              com.osmosis.gamm.v1beta1.QuerySpotPriceResponse>(
                service, METHODID_SPOT_PRICE)))
        .addMethod(
          getEstimateSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest,
              com.osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getEstimateSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest,
              com.osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getConcentratedPoolIdLinkFromCFMMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest,
              com.osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse>(
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
