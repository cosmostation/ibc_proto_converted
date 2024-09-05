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

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInWithPrimitiveTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountInWithPrimitiveTypes",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInWithPrimitiveTypesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> getEstimateSwapExactAmountInWithPrimitiveTypesMethod;
    if ((getEstimateSwapExactAmountInWithPrimitiveTypesMethod = QueryGrpc.getEstimateSwapExactAmountInWithPrimitiveTypesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountInWithPrimitiveTypesMethod = QueryGrpc.getEstimateSwapExactAmountInWithPrimitiveTypesMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountInWithPrimitiveTypesMethod = getEstimateSwapExactAmountInWithPrimitiveTypesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountInWithPrimitiveTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountInWithPrimitiveTypes"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountInWithPrimitiveTypesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutWithPrimitiveTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSwapExactAmountOutWithPrimitiveTypes",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutWithPrimitiveTypesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> getEstimateSwapExactAmountOutWithPrimitiveTypesMethod;
    if ((getEstimateSwapExactAmountOutWithPrimitiveTypesMethod = QueryGrpc.getEstimateSwapExactAmountOutWithPrimitiveTypesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSwapExactAmountOutWithPrimitiveTypesMethod = QueryGrpc.getEstimateSwapExactAmountOutWithPrimitiveTypesMethod) == null) {
          QueryGrpc.getEstimateSwapExactAmountOutWithPrimitiveTypesMethod = getEstimateSwapExactAmountOutWithPrimitiveTypesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSwapExactAmountOutWithPrimitiveTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSwapExactAmountOutWithPrimitiveTypes"))
              .build();
        }
      }
    }
    return getEstimateSwapExactAmountOutWithPrimitiveTypesMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> getListPoolsByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPoolsByDenom",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> getListPoolsByDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> getListPoolsByDenomMethod;
    if ((getListPoolsByDenomMethod = QueryGrpc.getListPoolsByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListPoolsByDenomMethod = QueryGrpc.getListPoolsByDenomMethod) == null) {
          QueryGrpc.getListPoolsByDenomMethod = getListPoolsByDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPoolsByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListPoolsByDenom"))
              .build();
        }
      }
    }
    return getListPoolsByDenomMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> getTotalLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalLiquidity",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> getTotalLiquidityMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> getTotalLiquidityMethod;
    if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalLiquidityMethod = QueryGrpc.getTotalLiquidityMethod) == null) {
          QueryGrpc.getTotalLiquidityMethod = getTotalLiquidityMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalLiquidity"))
              .build();
        }
      }
    }
    return getTotalLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> getTotalVolumeForPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalVolumeForPool",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> getTotalVolumeForPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> getTotalVolumeForPoolMethod;
    if ((getTotalVolumeForPoolMethod = QueryGrpc.getTotalVolumeForPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalVolumeForPoolMethod = QueryGrpc.getTotalVolumeForPoolMethod) == null) {
          QueryGrpc.getTotalVolumeForPoolMethod = getTotalVolumeForPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalVolumeForPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalVolumeForPool"))
              .build();
        }
      }
    }
    return getTotalVolumeForPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> getTradingPairTakerFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TradingPairTakerFee",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> getTradingPairTakerFeeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> getTradingPairTakerFeeMethod;
    if ((getTradingPairTakerFeeMethod = QueryGrpc.getTradingPairTakerFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTradingPairTakerFeeMethod = QueryGrpc.getTradingPairTakerFeeMethod) == null) {
          QueryGrpc.getTradingPairTakerFeeMethod = getTradingPairTakerFeeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TradingPairTakerFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TradingPairTakerFee"))
              .build();
        }
      }
    }
    return getTradingPairTakerFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> getEstimateTradeBasedOnPriceImpactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateTradeBasedOnPriceImpact",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> getEstimateTradeBasedOnPriceImpactMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> getEstimateTradeBasedOnPriceImpactMethod;
    if ((getEstimateTradeBasedOnPriceImpactMethod = QueryGrpc.getEstimateTradeBasedOnPriceImpactMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateTradeBasedOnPriceImpactMethod = QueryGrpc.getEstimateTradeBasedOnPriceImpactMethod) == null) {
          QueryGrpc.getEstimateTradeBasedOnPriceImpactMethod = getEstimateTradeBasedOnPriceImpactMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest, com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateTradeBasedOnPriceImpact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateTradeBasedOnPriceImpact"))
              .build();
        }
      }
    }
    return getEstimateTradeBasedOnPriceImpactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> getAllTakerFeeShareAgreementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllTakerFeeShareAgreements",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> getAllTakerFeeShareAgreementsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> getAllTakerFeeShareAgreementsMethod;
    if ((getAllTakerFeeShareAgreementsMethod = QueryGrpc.getAllTakerFeeShareAgreementsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllTakerFeeShareAgreementsMethod = QueryGrpc.getAllTakerFeeShareAgreementsMethod) == null) {
          QueryGrpc.getAllTakerFeeShareAgreementsMethod = getAllTakerFeeShareAgreementsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllTakerFeeShareAgreements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllTakerFeeShareAgreements"))
              .build();
        }
      }
    }
    return getAllTakerFeeShareAgreementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> getTakerFeeShareAgreementFromDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakerFeeShareAgreementFromDenom",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> getTakerFeeShareAgreementFromDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> getTakerFeeShareAgreementFromDenomMethod;
    if ((getTakerFeeShareAgreementFromDenomMethod = QueryGrpc.getTakerFeeShareAgreementFromDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTakerFeeShareAgreementFromDenomMethod = QueryGrpc.getTakerFeeShareAgreementFromDenomMethod) == null) {
          QueryGrpc.getTakerFeeShareAgreementFromDenomMethod = getTakerFeeShareAgreementFromDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakerFeeShareAgreementFromDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TakerFeeShareAgreementFromDenom"))
              .build();
        }
      }
    }
    return getTakerFeeShareAgreementFromDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> getTakerFeeShareDenomsToAccruedValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakerFeeShareDenomsToAccruedValue",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> getTakerFeeShareDenomsToAccruedValueMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> getTakerFeeShareDenomsToAccruedValueMethod;
    if ((getTakerFeeShareDenomsToAccruedValueMethod = QueryGrpc.getTakerFeeShareDenomsToAccruedValueMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTakerFeeShareDenomsToAccruedValueMethod = QueryGrpc.getTakerFeeShareDenomsToAccruedValueMethod) == null) {
          QueryGrpc.getTakerFeeShareDenomsToAccruedValueMethod = getTakerFeeShareDenomsToAccruedValueMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest, com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakerFeeShareDenomsToAccruedValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TakerFeeShareDenomsToAccruedValue"))
              .build();
        }
      }
    }
    return getTakerFeeShareDenomsToAccruedValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> getAllTakerFeeShareAccumulatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllTakerFeeShareAccumulators",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> getAllTakerFeeShareAccumulatorsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> getAllTakerFeeShareAccumulatorsMethod;
    if ((getAllTakerFeeShareAccumulatorsMethod = QueryGrpc.getAllTakerFeeShareAccumulatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllTakerFeeShareAccumulatorsMethod = QueryGrpc.getAllTakerFeeShareAccumulatorsMethod) == null) {
          QueryGrpc.getAllTakerFeeShareAccumulatorsMethod = getAllTakerFeeShareAccumulatorsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllTakerFeeShareAccumulators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllTakerFeeShareAccumulators"))
              .build();
        }
      }
    }
    return getAllTakerFeeShareAccumulatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> getRegisteredAlloyedPoolFromDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredAlloyedPoolFromDenom",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> getRegisteredAlloyedPoolFromDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> getRegisteredAlloyedPoolFromDenomMethod;
    if ((getRegisteredAlloyedPoolFromDenomMethod = QueryGrpc.getRegisteredAlloyedPoolFromDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredAlloyedPoolFromDenomMethod = QueryGrpc.getRegisteredAlloyedPoolFromDenomMethod) == null) {
          QueryGrpc.getRegisteredAlloyedPoolFromDenomMethod = getRegisteredAlloyedPoolFromDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest, com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredAlloyedPoolFromDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredAlloyedPoolFromDenom"))
              .build();
        }
      }
    }
    return getRegisteredAlloyedPoolFromDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> getRegisteredAlloyedPoolFromPoolIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredAlloyedPoolFromPoolId",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> getRegisteredAlloyedPoolFromPoolIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest, com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> getRegisteredAlloyedPoolFromPoolIdMethod;
    if ((getRegisteredAlloyedPoolFromPoolIdMethod = QueryGrpc.getRegisteredAlloyedPoolFromPoolIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredAlloyedPoolFromPoolIdMethod = QueryGrpc.getRegisteredAlloyedPoolFromPoolIdMethod) == null) {
          QueryGrpc.getRegisteredAlloyedPoolFromPoolIdMethod = getRegisteredAlloyedPoolFromPoolIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest, com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredAlloyedPoolFromPoolId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredAlloyedPoolFromPoolId"))
              .build();
        }
      }
    }
    return getRegisteredAlloyedPoolFromPoolIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> getAllRegisteredAlloyedPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllRegisteredAlloyedPools",
      requestType = com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest.class,
      responseType = com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest,
      com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> getAllRegisteredAlloyedPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> getAllRegisteredAlloyedPoolsMethod;
    if ((getAllRegisteredAlloyedPoolsMethod = QueryGrpc.getAllRegisteredAlloyedPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllRegisteredAlloyedPoolsMethod = QueryGrpc.getAllRegisteredAlloyedPoolsMethod) == null) {
          QueryGrpc.getAllRegisteredAlloyedPoolsMethod = getAllRegisteredAlloyedPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest, com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllRegisteredAlloyedPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllRegisteredAlloyedPools"))
              .build();
        }
      }
    }
    return getAllRegisteredAlloyedPoolsMethod;
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
     * <pre>
     * EstimateSwapExactAmountInWithPrimitiveTypes is an alternative query for
     * EstimateSwapExactAmountIn. Supports query via GRPC-Gateway by using
     * primitive types instead of repeated structs. Each index in the
     * routes_pool_id field corresponds to the respective routes_token_out_denom
     * value, thus they are required to have the same length and are grouped
     * together as pairs.
     * example usage:
     * http://0.0.0.0:1317/osmosis/poolmanager/v1beta1/1/estimate/
     * swap_exact_amount_in_with_primitive_types?token_in=100000stake&amp;routes_token_out_denom=uatom
     * &amp;routes_token_out_denom=uion&amp;routes_pool_id=1&amp;routes_pool_id=2
     * </pre>
     */
    default void estimateSwapExactAmountInWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountInWithPrimitiveTypesMethod(), responseObserver);
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
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    default void estimateSwapExactAmountOutWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSwapExactAmountOutWithPrimitiveTypesMethod(), responseObserver);
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
     * ListPoolsByDenom return all pools by denom
     * </pre>
     */
    default void listPoolsByDenom(com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoolsByDenomMethod(), responseObserver);
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
     * <pre>
     * TotalPoolLiquidity returns the total liquidity of the specified pool.
     * </pre>
     */
    default void totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalPoolLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalLiquidity returns the total liquidity across all pools.
     * </pre>
     */
    default void totalLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalLiquidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalVolumeForPool returns the total volume of the specified pool.
     * </pre>
     */
    default void totalVolumeForPool(com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalVolumeForPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * TradingPairTakerFee returns the taker fee for a given set of denoms
     * </pre>
     */
    default void tradingPairTakerFee(com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradingPairTakerFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateTradeBasedOnPriceImpact returns an estimated trade based on price
     * impact, if a trade cannot be estimated a 0 input and 0 output would be
     * returned.
     * </pre>
     */
    default void estimateTradeBasedOnPriceImpact(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateTradeBasedOnPriceImpactMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllTakerFeeShareAgreements returns all taker fee share agreements.
     * A taker fee share agreement includes the denom of the denom getting the
     * taker fees, the percent of the taker fees that the denom gets when it is
     * in the route being traded against, and the address that the taker fees are
     * sent to at epoch.
     * </pre>
     */
    default void allTakerFeeShareAgreements(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllTakerFeeShareAgreementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TakerFeeShareAgreementFromDenom returns the taker fee share agreement for a
     * given denom. A taker fee share agreement includes the denom of the denom
     * getting the taker fees, the percent of the taker fees that the denom gets
     * when it is in the route being traded against, and the address that the
     * taker fees are sent to at epoch.
     * </pre>
     */
    default void takerFeeShareAgreementFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakerFeeShareAgreementFromDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * TakerFeeShareDenomsToAccruedValue returns the accrued value (as an Int) of
     * the given taker fee denom (the collected fees) for the given fee share
     * denom (the denom with the taker fee share agreement)
     * </pre>
     */
    default void takerFeeShareDenomsToAccruedValue(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakerFeeShareDenomsToAccruedValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllTakerFeeShareAccumulators returns all taker fee share accumulators. A
     * taker fee share accumulator includes the denom of the denom getting the
     * taker fees, and an accumulated value of coins that the denom has accrued
     * since the last time it was distributed in the epoch prior.
     * </pre>
     */
    default void allTakerFeeShareAccumulators(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllTakerFeeShareAccumulatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromDenom returns the registered alloyed pool state
     * from the given denom. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    default void registeredAlloyedPoolFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisteredAlloyedPoolFromDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromPoolId returns the registered alloyed pool state
     * from the given pool id. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    default void registeredAlloyedPoolFromPoolId(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisteredAlloyedPoolFromPoolIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllRegisteredAlloyedPools returns all registered alloyed pools. The
     * registered alloyed pool contains the pool's contract address, along with
     * the current distribution composition of taker fee share denoms within the
     * alloyed pool.
     * </pre>
     */
    default void allRegisteredAlloyedPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllRegisteredAlloyedPoolsMethod(), responseObserver);
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
     * <pre>
     * EstimateSwapExactAmountInWithPrimitiveTypes is an alternative query for
     * EstimateSwapExactAmountIn. Supports query via GRPC-Gateway by using
     * primitive types instead of repeated structs. Each index in the
     * routes_pool_id field corresponds to the respective routes_token_out_denom
     * value, thus they are required to have the same length and are grouped
     * together as pairs.
     * example usage:
     * http://0.0.0.0:1317/osmosis/poolmanager/v1beta1/1/estimate/
     * swap_exact_amount_in_with_primitive_types?token_in=100000stake&amp;routes_token_out_denom=uatom
     * &amp;routes_token_out_denom=uion&amp;routes_pool_id=1&amp;routes_pool_id=2
     * </pre>
     */
    public void estimateSwapExactAmountInWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInWithPrimitiveTypesMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public void estimateSwapExactAmountOutWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutWithPrimitiveTypesMethod(), getCallOptions()), request, responseObserver);
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
     * ListPoolsByDenom return all pools by denom
     * </pre>
     */
    public void listPoolsByDenom(com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPoolsByDenomMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * TotalPoolLiquidity returns the total liquidity of the specified pool.
     * </pre>
     */
    public void totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalLiquidity returns the total liquidity across all pools.
     * </pre>
     */
    public void totalLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalVolumeForPool returns the total volume of the specified pool.
     * </pre>
     */
    public void totalVolumeForPool(com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalVolumeForPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TradingPairTakerFee returns the taker fee for a given set of denoms
     * </pre>
     */
    public void tradingPairTakerFee(com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradingPairTakerFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateTradeBasedOnPriceImpact returns an estimated trade based on price
     * impact, if a trade cannot be estimated a 0 input and 0 output would be
     * returned.
     * </pre>
     */
    public void estimateTradeBasedOnPriceImpact(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateTradeBasedOnPriceImpactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllTakerFeeShareAgreements returns all taker fee share agreements.
     * A taker fee share agreement includes the denom of the denom getting the
     * taker fees, the percent of the taker fees that the denom gets when it is
     * in the route being traded against, and the address that the taker fees are
     * sent to at epoch.
     * </pre>
     */
    public void allTakerFeeShareAgreements(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllTakerFeeShareAgreementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TakerFeeShareAgreementFromDenom returns the taker fee share agreement for a
     * given denom. A taker fee share agreement includes the denom of the denom
     * getting the taker fees, the percent of the taker fees that the denom gets
     * when it is in the route being traded against, and the address that the
     * taker fees are sent to at epoch.
     * </pre>
     */
    public void takerFeeShareAgreementFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakerFeeShareAgreementFromDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TakerFeeShareDenomsToAccruedValue returns the accrued value (as an Int) of
     * the given taker fee denom (the collected fees) for the given fee share
     * denom (the denom with the taker fee share agreement)
     * </pre>
     */
    public void takerFeeShareDenomsToAccruedValue(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakerFeeShareDenomsToAccruedValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllTakerFeeShareAccumulators returns all taker fee share accumulators. A
     * taker fee share accumulator includes the denom of the denom getting the
     * taker fees, and an accumulated value of coins that the denom has accrued
     * since the last time it was distributed in the epoch prior.
     * </pre>
     */
    public void allTakerFeeShareAccumulators(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllTakerFeeShareAccumulatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromDenom returns the registered alloyed pool state
     * from the given denom. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public void registeredAlloyedPoolFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisteredAlloyedPoolFromDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromPoolId returns the registered alloyed pool state
     * from the given pool id. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public void registeredAlloyedPoolFromPoolId(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisteredAlloyedPoolFromPoolIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllRegisteredAlloyedPools returns all registered alloyed pools. The
     * registered alloyed pool contains the pool's contract address, along with
     * the current distribution composition of taker fee share denoms within the
     * alloyed pool.
     * </pre>
     */
    public void allRegisteredAlloyedPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllRegisteredAlloyedPoolsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * EstimateSwapExactAmountInWithPrimitiveTypes is an alternative query for
     * EstimateSwapExactAmountIn. Supports query via GRPC-Gateway by using
     * primitive types instead of repeated structs. Each index in the
     * routes_pool_id field corresponds to the respective routes_token_out_denom
     * value, thus they are required to have the same length and are grouped
     * together as pairs.
     * example usage:
     * http://0.0.0.0:1317/osmosis/poolmanager/v1beta1/1/estimate/
     * swap_exact_amount_in_with_primitive_types?token_in=100000stake&amp;routes_token_out_denom=uatom
     * &amp;routes_token_out_denom=uion&amp;routes_pool_id=1&amp;routes_pool_id=2
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse estimateSwapExactAmountInWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountInWithPrimitiveTypesMethod(), getCallOptions(), request);
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
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse estimateSwapExactAmountOutWithPrimitiveTypes(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSwapExactAmountOutWithPrimitiveTypesMethod(), getCallOptions(), request);
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
     * ListPoolsByDenom return all pools by denom
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse listPoolsByDenom(com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPoolsByDenomMethod(), getCallOptions(), request);
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
     * <pre>
     * TotalPoolLiquidity returns the total liquidity of the specified pool.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse totalPoolLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalPoolLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalLiquidity returns the total liquidity across all pools.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse totalLiquidity(com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalLiquidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalVolumeForPool returns the total volume of the specified pool.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse totalVolumeForPool(com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalVolumeForPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TradingPairTakerFee returns the taker fee for a given set of denoms
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse tradingPairTakerFee(com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradingPairTakerFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateTradeBasedOnPriceImpact returns an estimated trade based on price
     * impact, if a trade cannot be estimated a 0 input and 0 output would be
     * returned.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse estimateTradeBasedOnPriceImpact(com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateTradeBasedOnPriceImpactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllTakerFeeShareAgreements returns all taker fee share agreements.
     * A taker fee share agreement includes the denom of the denom getting the
     * taker fees, the percent of the taker fees that the denom gets when it is
     * in the route being traded against, and the address that the taker fees are
     * sent to at epoch.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse allTakerFeeShareAgreements(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllTakerFeeShareAgreementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TakerFeeShareAgreementFromDenom returns the taker fee share agreement for a
     * given denom. A taker fee share agreement includes the denom of the denom
     * getting the taker fees, the percent of the taker fees that the denom gets
     * when it is in the route being traded against, and the address that the
     * taker fees are sent to at epoch.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse takerFeeShareAgreementFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakerFeeShareAgreementFromDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TakerFeeShareDenomsToAccruedValue returns the accrued value (as an Int) of
     * the given taker fee denom (the collected fees) for the given fee share
     * denom (the denom with the taker fee share agreement)
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse takerFeeShareDenomsToAccruedValue(com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakerFeeShareDenomsToAccruedValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllTakerFeeShareAccumulators returns all taker fee share accumulators. A
     * taker fee share accumulator includes the denom of the denom getting the
     * taker fees, and an accumulated value of coins that the denom has accrued
     * since the last time it was distributed in the epoch prior.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse allTakerFeeShareAccumulators(com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllTakerFeeShareAccumulatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromDenom returns the registered alloyed pool state
     * from the given denom. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse registeredAlloyedPoolFromDenom(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisteredAlloyedPoolFromDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromPoolId returns the registered alloyed pool state
     * from the given pool id. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse registeredAlloyedPoolFromPoolId(com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisteredAlloyedPoolFromPoolIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllRegisteredAlloyedPools returns all registered alloyed pools. The
     * registered alloyed pool contains the pool's contract address, along with
     * the current distribution composition of taker fee share denoms within the
     * alloyed pool.
     * </pre>
     */
    public com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse allRegisteredAlloyedPools(com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllRegisteredAlloyedPoolsMethod(), getCallOptions(), request);
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
     * <pre>
     * EstimateSwapExactAmountInWithPrimitiveTypes is an alternative query for
     * EstimateSwapExactAmountIn. Supports query via GRPC-Gateway by using
     * primitive types instead of repeated structs. Each index in the
     * routes_pool_id field corresponds to the respective routes_token_out_denom
     * value, thus they are required to have the same length and are grouped
     * together as pairs.
     * example usage:
     * http://0.0.0.0:1317/osmosis/poolmanager/v1beta1/1/estimate/
     * swap_exact_amount_in_with_primitive_types?token_in=100000stake&amp;routes_token_out_denom=uatom
     * &amp;routes_token_out_denom=uion&amp;routes_pool_id=1&amp;routes_pool_id=2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse> estimateSwapExactAmountInWithPrimitiveTypes(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountInWithPrimitiveTypesMethod(), getCallOptions()), request);
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
     * <pre>
     * Estimates swap amount in given out.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse> estimateSwapExactAmountOutWithPrimitiveTypes(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSwapExactAmountOutWithPrimitiveTypesMethod(), getCallOptions()), request);
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
     * ListPoolsByDenom return all pools by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse> listPoolsByDenom(
        com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPoolsByDenomMethod(), getCallOptions()), request);
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
     * <pre>
     * TotalPoolLiquidity returns the total liquidity of the specified pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse> totalPoolLiquidity(
        com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalPoolLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalLiquidity returns the total liquidity across all pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse> totalLiquidity(
        com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalLiquidityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalVolumeForPool returns the total volume of the specified pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse> totalVolumeForPool(
        com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalVolumeForPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TradingPairTakerFee returns the taker fee for a given set of denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse> tradingPairTakerFee(
        com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradingPairTakerFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateTradeBasedOnPriceImpact returns an estimated trade based on price
     * impact, if a trade cannot be estimated a 0 input and 0 output would be
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse> estimateTradeBasedOnPriceImpact(
        com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateTradeBasedOnPriceImpactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllTakerFeeShareAgreements returns all taker fee share agreements.
     * A taker fee share agreement includes the denom of the denom getting the
     * taker fees, the percent of the taker fees that the denom gets when it is
     * in the route being traded against, and the address that the taker fees are
     * sent to at epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse> allTakerFeeShareAgreements(
        com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllTakerFeeShareAgreementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TakerFeeShareAgreementFromDenom returns the taker fee share agreement for a
     * given denom. A taker fee share agreement includes the denom of the denom
     * getting the taker fees, the percent of the taker fees that the denom gets
     * when it is in the route being traded against, and the address that the
     * taker fees are sent to at epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse> takerFeeShareAgreementFromDenom(
        com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakerFeeShareAgreementFromDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TakerFeeShareDenomsToAccruedValue returns the accrued value (as an Int) of
     * the given taker fee denom (the collected fees) for the given fee share
     * denom (the denom with the taker fee share agreement)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse> takerFeeShareDenomsToAccruedValue(
        com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakerFeeShareDenomsToAccruedValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllTakerFeeShareAccumulators returns all taker fee share accumulators. A
     * taker fee share accumulator includes the denom of the denom getting the
     * taker fees, and an accumulated value of coins that the denom has accrued
     * since the last time it was distributed in the epoch prior.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse> allTakerFeeShareAccumulators(
        com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllTakerFeeShareAccumulatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromDenom returns the registered alloyed pool state
     * from the given denom. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse> registeredAlloyedPoolFromDenom(
        com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisteredAlloyedPoolFromDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredAlloyedPoolFromPoolId returns the registered alloyed pool state
     * from the given pool id. The registered alloyed pool contains the pool's
     * contract address, along with the current distribution composition of taker
     * fee share denoms within the alloyed pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse> registeredAlloyedPoolFromPoolId(
        com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisteredAlloyedPoolFromPoolIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllRegisteredAlloyedPools returns all registered alloyed pools. The
     * registered alloyed pool contains the pool's contract address, along with
     * the current distribution composition of taker fee share denoms within the
     * alloyed pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse> allRegisteredAlloyedPools(
        com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllRegisteredAlloyedPoolsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN = 1;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN_WITH_PRIMITIVE_TYPES = 2;
  private static final int METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_IN = 3;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT = 4;
  private static final int METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT_WITH_PRIMITIVE_TYPES = 5;
  private static final int METHODID_ESTIMATE_SINGLE_POOL_SWAP_EXACT_AMOUNT_OUT = 6;
  private static final int METHODID_NUM_POOLS = 7;
  private static final int METHODID_POOL = 8;
  private static final int METHODID_ALL_POOLS = 9;
  private static final int METHODID_LIST_POOLS_BY_DENOM = 10;
  private static final int METHODID_SPOT_PRICE = 11;
  private static final int METHODID_TOTAL_POOL_LIQUIDITY = 12;
  private static final int METHODID_TOTAL_LIQUIDITY = 13;
  private static final int METHODID_TOTAL_VOLUME_FOR_POOL = 14;
  private static final int METHODID_TRADING_PAIR_TAKER_FEE = 15;
  private static final int METHODID_ESTIMATE_TRADE_BASED_ON_PRICE_IMPACT = 16;
  private static final int METHODID_ALL_TAKER_FEE_SHARE_AGREEMENTS = 17;
  private static final int METHODID_TAKER_FEE_SHARE_AGREEMENT_FROM_DENOM = 18;
  private static final int METHODID_TAKER_FEE_SHARE_DENOMS_TO_ACCRUED_VALUE = 19;
  private static final int METHODID_ALL_TAKER_FEE_SHARE_ACCUMULATORS = 20;
  private static final int METHODID_REGISTERED_ALLOYED_POOL_FROM_DENOM = 21;
  private static final int METHODID_REGISTERED_ALLOYED_POOL_FROM_POOL_ID = 22;
  private static final int METHODID_ALL_REGISTERED_ALLOYED_POOLS = 23;

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
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN_WITH_PRIMITIVE_TYPES:
          serviceImpl.estimateSwapExactAmountInWithPrimitiveTypes((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest) request,
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
        case METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT_WITH_PRIMITIVE_TYPES:
          serviceImpl.estimateSwapExactAmountOutWithPrimitiveTypes((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest) request,
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
        case METHODID_LIST_POOLS_BY_DENOM:
          serviceImpl.listPoolsByDenom((com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse>) responseObserver);
          break;
        case METHODID_SPOT_PRICE:
          serviceImpl.spotPrice((com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.SpotPriceResponse>) responseObserver);
          break;
        case METHODID_TOTAL_POOL_LIQUIDITY:
          serviceImpl.totalPoolLiquidity((com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalPoolLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOTAL_LIQUIDITY:
          serviceImpl.totalLiquidity((com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOTAL_VOLUME_FOR_POOL:
          serviceImpl.totalVolumeForPool((com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse>) responseObserver);
          break;
        case METHODID_TRADING_PAIR_TAKER_FEE:
          serviceImpl.tradingPairTakerFee((com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_TRADE_BASED_ON_PRICE_IMPACT:
          serviceImpl.estimateTradeBasedOnPriceImpact((com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse>) responseObserver);
          break;
        case METHODID_ALL_TAKER_FEE_SHARE_AGREEMENTS:
          serviceImpl.allTakerFeeShareAgreements((com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse>) responseObserver);
          break;
        case METHODID_TAKER_FEE_SHARE_AGREEMENT_FROM_DENOM:
          serviceImpl.takerFeeShareAgreementFromDenom((com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse>) responseObserver);
          break;
        case METHODID_TAKER_FEE_SHARE_DENOMS_TO_ACCRUED_VALUE:
          serviceImpl.takerFeeShareDenomsToAccruedValue((com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse>) responseObserver);
          break;
        case METHODID_ALL_TAKER_FEE_SHARE_ACCUMULATORS:
          serviceImpl.allTakerFeeShareAccumulators((com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_ALLOYED_POOL_FROM_DENOM:
          serviceImpl.registeredAlloyedPoolFromDenom((com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_ALLOYED_POOL_FROM_POOL_ID:
          serviceImpl.registeredAlloyedPoolFromPoolId((com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse>) responseObserver);
          break;
        case METHODID_ALL_REGISTERED_ALLOYED_POOLS:
          serviceImpl.allRegisteredAlloyedPools((com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse>) responseObserver);
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
          getEstimateSwapExactAmountInWithPrimitiveTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInWithPrimitiveTypesRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountInResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_IN_WITH_PRIMITIVE_TYPES)))
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
          getEstimateSwapExactAmountOutWithPrimitiveTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutWithPrimitiveTypesRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateSwapExactAmountOutResponse>(
                service, METHODID_ESTIMATE_SWAP_EXACT_AMOUNT_OUT_WITH_PRIMITIVE_TYPES)))
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
          getListPoolsByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.ListPoolsByDenomResponse>(
                service, METHODID_LIST_POOLS_BY_DENOM)))
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
        .addMethod(
          getTotalLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalLiquidityResponse>(
                service, METHODID_TOTAL_LIQUIDITY)))
        .addMethod(
          getTotalVolumeForPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TotalVolumeForPoolResponse>(
                service, METHODID_TOTAL_VOLUME_FOR_POOL)))
        .addMethod(
          getTradingPairTakerFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TradingPairTakerFeeResponse>(
                service, METHODID_TRADING_PAIR_TAKER_FEE)))
        .addMethod(
          getEstimateTradeBasedOnPriceImpactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.EstimateTradeBasedOnPriceImpactResponse>(
                service, METHODID_ESTIMATE_TRADE_BASED_ON_PRICE_IMPACT)))
        .addMethod(
          getAllTakerFeeShareAgreementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAgreementsResponse>(
                service, METHODID_ALL_TAKER_FEE_SHARE_AGREEMENTS)))
        .addMethod(
          getTakerFeeShareAgreementFromDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareAgreementFromDenomResponse>(
                service, METHODID_TAKER_FEE_SHARE_AGREEMENT_FROM_DENOM)))
        .addMethod(
          getTakerFeeShareDenomsToAccruedValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.TakerFeeShareDenomsToAccruedValueResponse>(
                service, METHODID_TAKER_FEE_SHARE_DENOMS_TO_ACCRUED_VALUE)))
        .addMethod(
          getAllTakerFeeShareAccumulatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.AllTakerFeeShareAccumulatorsResponse>(
                service, METHODID_ALL_TAKER_FEE_SHARE_ACCUMULATORS)))
        .addMethod(
          getRegisteredAlloyedPoolFromDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromDenomResponse>(
                service, METHODID_REGISTERED_ALLOYED_POOL_FROM_DENOM)))
        .addMethod(
          getRegisteredAlloyedPoolFromPoolIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.RegisteredAlloyedPoolFromPoolIdResponse>(
                service, METHODID_REGISTERED_ALLOYED_POOL_FROM_POOL_ID)))
        .addMethod(
          getAllRegisteredAlloyedPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsRequest,
              com.osmosis.poolmanager.v1beta1.QueryProto.AllRegisteredAlloyedPoolsResponse>(
                service, METHODID_ALL_REGISTERED_ALLOYED_POOLS)))
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
              .addMethod(getEstimateSwapExactAmountInWithPrimitiveTypesMethod())
              .addMethod(getEstimateSinglePoolSwapExactAmountInMethod())
              .addMethod(getEstimateSwapExactAmountOutMethod())
              .addMethod(getEstimateSwapExactAmountOutWithPrimitiveTypesMethod())
              .addMethod(getEstimateSinglePoolSwapExactAmountOutMethod())
              .addMethod(getNumPoolsMethod())
              .addMethod(getPoolMethod())
              .addMethod(getAllPoolsMethod())
              .addMethod(getListPoolsByDenomMethod())
              .addMethod(getSpotPriceMethod())
              .addMethod(getTotalPoolLiquidityMethod())
              .addMethod(getTotalLiquidityMethod())
              .addMethod(getTotalVolumeForPoolMethod())
              .addMethod(getTradingPairTakerFeeMethod())
              .addMethod(getEstimateTradeBasedOnPriceImpactMethod())
              .addMethod(getAllTakerFeeShareAgreementsMethod())
              .addMethod(getTakerFeeShareAgreementFromDenomMethod())
              .addMethod(getTakerFeeShareDenomsToAccruedValueMethod())
              .addMethod(getAllTakerFeeShareAccumulatorsMethod())
              .addMethod(getRegisteredAlloyedPoolFromDenomMethod())
              .addMethod(getRegisteredAlloyedPoolFromPoolIdMethod())
              .addMethod(getAllRegisteredAlloyedPoolsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
