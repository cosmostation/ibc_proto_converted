package com.osmosis.poolmanager.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/poolmanager/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.poolmanager.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountIn",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInMethod;
    if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountInMethod = QueryGrpc.getEstimateSwapExactAmountInMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountInMethod = getEstimateSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountIn"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSinglePoolSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSinglePoolSwapExactAmountIn",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSinglePoolSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSinglePoolSwapExactAmountInMethod;
    if ((getEstimateSinglePoolSwapExactAmountInMethod = QueryGrpc.getEstimateSinglePoolSwapExactAmountInMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSinglePoolSwapExactAmountInMethod = QueryGrpc.getEstimateSinglePoolSwapExactAmountInMethod) == null) {
          QueryGrpc.getEstimateSinglePoolSwapExactAmountInMethod = getEstimateSinglePoolSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSinglePoolSwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSinglePoolSwapExactAmountIn"))
              .build();
        }
      }
    }
    return getEstimateSinglePoolSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountOut",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutMethod;
    if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountOutMethod = QueryGrpc.getEstimateSwapExactAmountOutMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountOutMethod = getEstimateSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountOut"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSinglePoolSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSinglePoolSwapExactAmountOut",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSinglePoolSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSinglePoolSwapExactAmountOutMethod;
    if ((getEstimateSinglePoolSwapExactAmountOutMethod = QueryGrpc.getEstimateSinglePoolSwapExactAmountOutMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSinglePoolSwapExactAmountOutMethod = QueryGrpc.getEstimateSinglePoolSwapExactAmountOutMethod) == null) {
          QueryGrpc.getEstimateSinglePoolSwapExactAmountOutMethod = getEstimateSinglePoolSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSinglePoolSwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSinglePoolSwapExactAmountOut"))
              .build();
        }
      }
    }
    return getEstimateSinglePoolSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> getNumPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NumPools",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> getNumPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> getNumPoolsMethod;
    if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNumPoolsMethod = QueryGrpc.getNumPoolsMethod) == null) {
          QueryGrpc.getNumPoolsMethod = getNumPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NumPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NumPools"))
              .build();
        }
      }
    }
    return getNumPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest, com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest, com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> getAllPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllPools",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> getAllPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> getAllPoolsMethod;
    if ((getAllPoolsMethod = QueryGrpc.getAllPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllPoolsMethod = QueryGrpc.getAllPoolsMethod) == null) {
          QueryGrpc.getAllPoolsMethod = getAllPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllPools"))
              .build();
        }
      }
    }
    return getAllPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> getSpotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotPrice",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> getSpotPriceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest, com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> getSpotPriceMethod;
    if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotPriceMethod = QueryGrpc.getSpotPriceMethod) == null) {
          QueryGrpc.getSpotPriceMethod = getSpotPriceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest, com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotPrice"))
              .build();
        }
      }
    }
    return getSpotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalPoolLiquidity",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> getTotalPoolLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> getTotalPoolLiquidityMethod;
    if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalPoolLiquidityMethod = QueryGrpc.getTotalPoolLiquidityMethod) == null) {
          QueryGrpc.getTotalPoolLiquidityMethod = getTotalPoolLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalPoolLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalPoolLiquidity"))
              .build();
        }
      }
    }
    return getTotalPoolLiquidityMethod;
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
    default void params(com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Estimates swap amount out given in.
     * </pre>
     */
    default void estimateSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountInMethod(), responseObserver);
    }

    /**
     */
    default void estimateSinglePoolSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSinglePoolSwapExactAmountInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    default void estimateSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void estimateSinglePoolSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSinglePoolSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the total number of pools existing in Osmosis.
     * </pre>
     */
    default void numPools(com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNumPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool returns the Pool specified by the pool id
     * </pre>
     */
    default void pool(com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllPools returns all pools on the Osmosis chain sorted by IDs.
     * </pre>
     */
    default void allPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    default void spotPrice(com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotPriceMethod(), responseObserver);
    }

    /**
     */
    default void totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalPoolLiquidityMethod(), responseObserver);
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
    public void params(com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Estimates swap amount out given in.
     * </pre>
     */
    public void estimateSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateSinglePoolSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSinglePoolSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public void estimateSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateSinglePoolSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSinglePoolSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the total number of pools existing in Osmosis.
     * </pre>
     */
    public void numPools(com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool returns the Pool specified by the pool id
     * </pre>
     */
    public void pool(com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllPools returns all pools on the Osmosis chain sorted by IDs.
     * </pre>
     */
    public void allPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    public void spotPrice(com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse params(com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Estimates swap amount out given in.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse estimateSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse estimateSinglePoolSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSinglePoolSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse estimateSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse estimateSinglePoolSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSinglePoolSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the total number of pools existing in Osmosis.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse numPools(com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNumPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool returns the Pool specified by the pool id
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse pool(com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllPools returns all pools on the Osmosis chain sorted by IDs.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse allPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse spotPrice(com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalPoolLiquidityMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse> params(
        com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Estimates swap amount out given in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> estimateSwapExactAmountIn(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> estimateSinglePoolSwapExactAmountIn(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSinglePoolSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> estimateSwapExactAmountOut(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> estimateSinglePoolSwapExactAmountOut(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSinglePoolSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the total number of pools existing in Osmosis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse> numPools(
        com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNumPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool returns the Pool specified by the pool id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse> pool(
        com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllPools returns all pools on the Osmosis chain sorted by IDs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse> allPools(
        com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpotPrice defines a gRPC query handler that returns the spot price given
     * a base denomination and a quote denomination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse> spotPrice(
        com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> totalPoolLiquidity(
        com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN = 1;
  private static final int METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_IN = 2;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT = 3;
  private static final int METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_OUT = 4;
  private static final int METHODID_NUM_POOLS = 5;
  private static final int METHODID_POOL = 6;
  private static final int METHODID_ALL_POOLS = 7;
  private static final int METHODID_SPOT_PRICE = 8;
  private static final int METHODID_TOTAL_POOL_LIQUIDITY = 9;

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
          serviceImpl.params((com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.estimateSwapExactAmountIn((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.estimateSinglePoolSwapExactAmountIn((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.estimateSwapExactAmountOut((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.estimateSinglePoolSwapExactAmountOut((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_NUM_POOLS:
          serviceImpl.numPools((com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse>) responseObserver);
          break;
        case METHODID_ALL_POOLS:
          serviceImpl.allPools((com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse>) responseObserver);
          break;
        case METHODID_SPOT_PRICE:
          serviceImpl.spotPrice((com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse>) responseObserver);
          break;
        case METHODID_TOTAL_POOL_LIQUIDITY:
          serviceImpl.totalPoolLiquidity((com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse>) responseObserver);
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
              com.osmosis.poolmanager.v1beta1.QueryProto.ParamsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getEstimateSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getEstimateSinglePoolSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountInRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>(
                service, METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getEstimateSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getEstimateSinglePoolSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSinglePoolSwapExactAmountOutRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>(
                service, METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getNumPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.NumPoolsResponse>(
                service, METHODID_NUM_POOLS)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.PoolRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.PoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getAllPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.AllPoolsResponse>(
                service, METHODID_ALL_POOLS)))
        .addMethod(
          getSpotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse>(
                service, METHODID_SPOT_PRICE)))
        .addMethod(
          getTotalPoolLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse>(
                service, METHODID_TOTAL_POOL_LIQUIDITY)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.poolmanager.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getEstimateSwapExactAmountInMethod())
              .addMethod(getEstimateSinglePoolSwapExactAmountInMethod())
              .addMethod(getEstimateSwapExactAmountOutMethod())
              .addMethod(getEstimateSinglePoolSwapExactAmountOutMethod())
              .addMethod(getNumPoolsMethod())
              .addMethod(getPoolMethod())
              .addMethod(getAllPoolsMethod())
              .addMethod(getSpotPriceMethod())
              .addMethod(getTotalPoolLiquidityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
