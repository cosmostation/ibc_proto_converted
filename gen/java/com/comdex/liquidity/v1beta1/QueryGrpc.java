package com.comdex.liquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: comdex/liquidity/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "comdex.liquidity.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> getGenericParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenericParams",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> getGenericParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> getGenericParamsMethod;
    if ((getGenericParamsMethod = QueryGrpc.getGenericParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGenericParamsMethod = QueryGrpc.getGenericParamsMethod) == null) {
          QueryGrpc.getGenericParamsMethod = getGenericParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenericParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GenericParams"))
              .build();
        }
      }
    }
    return getGenericParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolByReserveAddress",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod;
    if ((getPoolByReserveAddressMethod = QueryGrpc.getPoolByReserveAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolByReserveAddressMethod = QueryGrpc.getPoolByReserveAddressMethod) == null) {
          QueryGrpc.getPoolByReserveAddressMethod = getPoolByReserveAddressMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolByReserveAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolByReserveAddress"))
              .build();
        }
      }
    }
    return getPoolByReserveAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolByPoolCoinDenom",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod;
    if ((getPoolByPoolCoinDenomMethod = QueryGrpc.getPoolByPoolCoinDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolByPoolCoinDenomMethod = QueryGrpc.getPoolByPoolCoinDenomMethod) == null) {
          QueryGrpc.getPoolByPoolCoinDenomMethod = getPoolByPoolCoinDenomMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolByPoolCoinDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolByPoolCoinDenom"))
              .build();
        }
      }
    }
    return getPoolByPoolCoinDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pairs",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod;
    if ((getPairsMethod = QueryGrpc.getPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPairsMethod = QueryGrpc.getPairsMethod) == null) {
          QueryGrpc.getPairsMethod = getPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pairs"))
              .build();
        }
      }
    }
    return getPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pair",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod;
    if ((getPairMethod = QueryGrpc.getPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPairMethod = QueryGrpc.getPairMethod) == null) {
          QueryGrpc.getPairMethod = getPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pair"))
              .build();
        }
      }
    }
    return getPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositRequests",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod;
    if ((getDepositRequestsMethod = QueryGrpc.getDepositRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositRequestsMethod = QueryGrpc.getDepositRequestsMethod) == null) {
          QueryGrpc.getDepositRequestsMethod = getDepositRequestsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositRequests"))
              .build();
        }
      }
    }
    return getDepositRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositRequest",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod;
    if ((getDepositRequestMethod = QueryGrpc.getDepositRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositRequestMethod = QueryGrpc.getDepositRequestMethod) == null) {
          QueryGrpc.getDepositRequestMethod = getDepositRequestMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositRequest"))
              .build();
        }
      }
    }
    return getDepositRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRequests",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod;
    if ((getWithdrawRequestsMethod = QueryGrpc.getWithdrawRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawRequestsMethod = QueryGrpc.getWithdrawRequestsMethod) == null) {
          QueryGrpc.getWithdrawRequestsMethod = getWithdrawRequestsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawRequests"))
              .build();
        }
      }
    }
    return getWithdrawRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRequest",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod;
    if ((getWithdrawRequestMethod = QueryGrpc.getWithdrawRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawRequestMethod = QueryGrpc.getWithdrawRequestMethod) == null) {
          QueryGrpc.getWithdrawRequestMethod = getWithdrawRequestMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawRequest"))
              .build();
        }
      }
    }
    return getWithdrawRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Orders",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod;
    if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
          QueryGrpc.getOrdersMethod = getOrdersMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Orders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Orders"))
              .build();
        }
      }
    }
    return getOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Order",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod;
    if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
          QueryGrpc.getOrderMethod = getOrderMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Order"))
              .build();
        }
      }
    }
    return getOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrdersByOrderer",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod;
    if ((getOrdersByOrdererMethod = QueryGrpc.getOrdersByOrdererMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrdersByOrdererMethod = QueryGrpc.getOrdersByOrdererMethod) == null) {
          QueryGrpc.getOrdersByOrdererMethod = getOrdersByOrdererMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrdersByOrderer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OrdersByOrderer"))
              .build();
        }
      }
    }
    return getOrdersByOrdererMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> getFarmerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Farmer",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> getFarmerMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> getFarmerMethod;
    if ((getFarmerMethod = QueryGrpc.getFarmerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmerMethod = QueryGrpc.getFarmerMethod) == null) {
          QueryGrpc.getFarmerMethod = getFarmerMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Farmer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Farmer"))
              .build();
        }
      }
    }
    return getFarmerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> getDeserializePoolCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeserializePoolCoin",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> getDeserializePoolCoinMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> getDeserializePoolCoinMethod;
    if ((getDeserializePoolCoinMethod = QueryGrpc.getDeserializePoolCoinMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeserializePoolCoinMethod = QueryGrpc.getDeserializePoolCoinMethod) == null) {
          QueryGrpc.getDeserializePoolCoinMethod = getDeserializePoolCoinMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeserializePoolCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DeserializePoolCoin"))
              .build();
        }
      }
    }
    return getDeserializePoolCoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> getPoolIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolIncentives",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> getPoolIncentivesMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> getPoolIncentivesMethod;
    if ((getPoolIncentivesMethod = QueryGrpc.getPoolIncentivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolIncentivesMethod = QueryGrpc.getPoolIncentivesMethod) == null) {
          QueryGrpc.getPoolIncentivesMethod = getPoolIncentivesMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolIncentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolIncentives"))
              .build();
        }
      }
    }
    return getPoolIncentivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> getFarmedPoolCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FarmedPoolCoin",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> getFarmedPoolCoinMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> getFarmedPoolCoinMethod;
    if ((getFarmedPoolCoinMethod = QueryGrpc.getFarmedPoolCoinMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmedPoolCoinMethod = QueryGrpc.getFarmedPoolCoinMethod) == null) {
          QueryGrpc.getFarmedPoolCoinMethod = getFarmedPoolCoinMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FarmedPoolCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FarmedPoolCoin"))
              .build();
        }
      }
    }
    return getFarmedPoolCoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> getTotalActiveAndQueuedPoolCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalActiveAndQueuedPoolCoin",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> getTotalActiveAndQueuedPoolCoinMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> getTotalActiveAndQueuedPoolCoinMethod;
    if ((getTotalActiveAndQueuedPoolCoinMethod = QueryGrpc.getTotalActiveAndQueuedPoolCoinMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalActiveAndQueuedPoolCoinMethod = QueryGrpc.getTotalActiveAndQueuedPoolCoinMethod) == null) {
          QueryGrpc.getTotalActiveAndQueuedPoolCoinMethod = getTotalActiveAndQueuedPoolCoinMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalActiveAndQueuedPoolCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalActiveAndQueuedPoolCoin"))
              .build();
        }
      }
    }
    return getTotalActiveAndQueuedPoolCoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrderBooks",
      requestType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest.class,
      responseType = com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
      com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod;
    if ((getOrderBooksMethod = QueryGrpc.getOrderBooksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrderBooksMethod = QueryGrpc.getOrderBooksMethod) == null) {
          QueryGrpc.getOrderBooksMethod = getOrderBooksMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest, com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrderBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OrderBooks"))
              .build();
        }
      }
    }
    return getOrderBooksMethod;
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
     * Params returns parameters of the module.
     * </pre>
     */
    default void params(com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GenericParams returns app parameters of the module.
     * </pre>
     */
    default void genericParams(com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenericParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    default void pools(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    default void pool(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    default void poolByReserveAddress(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolByReserveAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    default void poolByPoolCoinDenom(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolByPoolCoinDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    default void pairs(com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPairsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    default void pair(com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPairMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    default void depositRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    default void depositRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    default void withdrawRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    default void withdrawRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    default void orders(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    default void order(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    default void ordersByOrderer(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrdersByOrdererMethod(), responseObserver);
    }

    /**
     * <pre>
     * Farmer returns deposited poolcoin for farming .
     * </pre>
     */
    default void farmer(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeserializePoolCoin splits poolcoin into the actual provided pool assets .
     * </pre>
     */
    default void deserializePoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeserializePoolCoinMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolIncentives provides insights about available pool incentives.
     * </pre>
     */
    default void poolIncentives(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolIncentivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FarmedPoolCoin returns the total farmed pool coins.
     * </pre>
     */
    default void farmedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmedPoolCoinMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalActiveAndQueuedPoolCoin returns the total number of active and queued farmed pool coins in each pool.
     * </pre>
     */
    default void totalActiveAndQueuedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalActiveAndQueuedPoolCoinMethod(), responseObserver);
    }

    /**
     */
    default void orderBooks(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderBooksMethod(), responseObserver);
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
     * Params returns parameters of the module.
     * </pre>
     */
    public void params(com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GenericParams returns app parameters of the module.
     * </pre>
     */
    public void genericParams(com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenericParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public void pools(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public void pool(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public void poolByReserveAddress(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolByReserveAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public void poolByPoolCoinDenom(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolByPoolCoinDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public void pairs(com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public void pair(com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public void depositRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public void depositRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public void withdrawRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public void withdrawRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public void orders(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public void order(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public void ordersByOrderer(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrdersByOrdererMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Farmer returns deposited poolcoin for farming .
     * </pre>
     */
    public void farmer(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeserializePoolCoin splits poolcoin into the actual provided pool assets .
     * </pre>
     */
    public void deserializePoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeserializePoolCoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolIncentives provides insights about available pool incentives.
     * </pre>
     */
    public void poolIncentives(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolIncentivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FarmedPoolCoin returns the total farmed pool coins.
     * </pre>
     */
    public void farmedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmedPoolCoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalActiveAndQueuedPoolCoin returns the total number of active and queued farmed pool coins in each pool.
     * </pre>
     */
    public void totalActiveAndQueuedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalActiveAndQueuedPoolCoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void orderBooks(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderBooksMethod(), getCallOptions()), request, responseObserver);
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
     * Params returns parameters of the module.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse params(com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GenericParams returns app parameters of the module.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse genericParams(com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenericParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse pools(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse pool(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse poolByReserveAddress(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolByReserveAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse poolByPoolCoinDenom(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolByPoolCoinDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse pairs(com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPairsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse pair(com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse depositRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse depositRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse withdrawRequests(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse withdrawRequest(com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse orders(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse order(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse ordersByOrderer(com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrdersByOrdererMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Farmer returns deposited poolcoin for farming .
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse farmer(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeserializePoolCoin splits poolcoin into the actual provided pool assets .
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse deserializePoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeserializePoolCoinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolIncentives provides insights about available pool incentives.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse poolIncentives(com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolIncentivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FarmedPoolCoin returns the total farmed pool coins.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse farmedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmedPoolCoinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalActiveAndQueuedPoolCoin returns the total number of active and queued farmed pool coins in each pool.
     * </pre>
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse totalActiveAndQueuedPoolCoin(com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalActiveAndQueuedPoolCoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse orderBooks(com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderBooksMethod(), getCallOptions(), request);
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
     * Params returns parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse> params(
        com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GenericParams returns app parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse> genericParams(
        com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenericParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse> pools(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> pool(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> poolByReserveAddress(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolByReserveAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse> poolByPoolCoinDenom(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolByPoolCoinDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse> pairs(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPairsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse> pair(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> depositRequests(
        com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> depositRequest(
        com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> withdrawRequests(
        com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> withdrawRequest(
        com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> orders(
        com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse> order(
        com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse> ordersByOrderer(
        com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrdersByOrdererMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Farmer returns deposited poolcoin for farming .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse> farmer(
        com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeserializePoolCoin splits poolcoin into the actual provided pool assets .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse> deserializePoolCoin(
        com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeserializePoolCoinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolIncentives provides insights about available pool incentives.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse> poolIncentives(
        com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolIncentivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FarmedPoolCoin returns the total farmed pool coins.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse> farmedPoolCoin(
        com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmedPoolCoinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalActiveAndQueuedPoolCoin returns the total number of active and queued farmed pool coins in each pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse> totalActiveAndQueuedPoolCoin(
        com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalActiveAndQueuedPoolCoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> orderBooks(
        com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderBooksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_GENERIC_PARAMS = 1;
  private static final int METHODID_POOLS = 2;
  private static final int METHODID_POOL = 3;
  private static final int METHODID_POOL_BY_RESERVE_ADDRESS = 4;
  private static final int METHODID_POOL_BY_POOL_COIN_DENOM = 5;
  private static final int METHODID_PAIRS = 6;
  private static final int METHODID_PAIR = 7;
  private static final int METHODID_DEPOSIT_REQUESTS = 8;
  private static final int METHODID_DEPOSIT_REQUEST = 9;
  private static final int METHODID_WITHDRAW_REQUESTS = 10;
  private static final int METHODID_WITHDRAW_REQUEST = 11;
  private static final int METHODID_ORDERS = 12;
  private static final int METHODID_ORDER = 13;
  private static final int METHODID_ORDERS_BY_ORDERER = 14;
  private static final int METHODID_FARMER = 15;
  private static final int METHODID_DESERIALIZE_POOL_COIN = 16;
  private static final int METHODID_POOL_INCENTIVES = 17;
  private static final int METHODID_FARMED_POOL_COIN = 18;
  private static final int METHODID_TOTAL_ACTIVE_AND_QUEUED_POOL_COIN = 19;
  private static final int METHODID_ORDER_BOOKS = 20;

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
          serviceImpl.params((com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_GENERIC_PARAMS:
          serviceImpl.genericParams((com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_BY_RESERVE_ADDRESS:
          serviceImpl.poolByReserveAddress((com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_BY_POOL_COIN_DENOM:
          serviceImpl.poolByPoolCoinDenom((com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_PAIRS:
          serviceImpl.pairs((com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse>) responseObserver);
          break;
        case METHODID_PAIR:
          serviceImpl.pair((com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_REQUESTS:
          serviceImpl.depositRequests((com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_REQUEST:
          serviceImpl.depositRequest((com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REQUESTS:
          serviceImpl.withdrawRequests((com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REQUEST:
          serviceImpl.withdrawRequest((com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>) responseObserver);
          break;
        case METHODID_ORDERS:
          serviceImpl.orders((com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>) responseObserver);
          break;
        case METHODID_ORDER:
          serviceImpl.order((com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse>) responseObserver);
          break;
        case METHODID_ORDERS_BY_ORDERER:
          serviceImpl.ordersByOrderer((com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>) responseObserver);
          break;
        case METHODID_FARMER:
          serviceImpl.farmer((com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse>) responseObserver);
          break;
        case METHODID_DESERIALIZE_POOL_COIN:
          serviceImpl.deserializePoolCoin((com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse>) responseObserver);
          break;
        case METHODID_POOL_INCENTIVES:
          serviceImpl.poolIncentives((com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse>) responseObserver);
          break;
        case METHODID_FARMED_POOL_COIN:
          serviceImpl.farmedPoolCoin((com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse>) responseObserver);
          break;
        case METHODID_TOTAL_ACTIVE_AND_QUEUED_POOL_COIN:
          serviceImpl.totalActiveAndQueuedPoolCoin((com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse>) responseObserver);
          break;
        case METHODID_ORDER_BOOKS:
          serviceImpl.orderBooks((com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>) responseObserver);
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
              com.comdex.liquidity.v1beta1.QueryProto.QueryParamsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getGenericParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryGenericParamsResponse>(
                service, METHODID_GENERIC_PARAMS)))
        .addMethod(
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getPoolByReserveAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL_BY_RESERVE_ADDRESS)))
        .addMethod(
          getPoolByPoolCoinDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL_BY_POOL_COIN_DENOM)))
        .addMethod(
          getPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPairsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPairsResponse>(
                service, METHODID_PAIRS)))
        .addMethod(
          getPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPairRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPairResponse>(
                service, METHODID_PAIR)))
        .addMethod(
          getDepositRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>(
                service, METHODID_DEPOSIT_REQUESTS)))
        .addMethod(
          getDepositRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>(
                service, METHODID_DEPOSIT_REQUEST)))
        .addMethod(
          getWithdrawRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>(
                service, METHODID_WITHDRAW_REQUESTS)))
        .addMethod(
          getWithdrawRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>(
                service, METHODID_WITHDRAW_REQUEST)))
        .addMethod(
          getOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>(
                service, METHODID_ORDERS)))
        .addMethod(
          getOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrderRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrderResponse>(
                service, METHODID_ORDER)))
        .addMethod(
          getOrdersByOrdererMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrdersResponse>(
                service, METHODID_ORDERS_BY_ORDERER)))
        .addMethod(
          getFarmerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryFarmerResponse>(
                service, METHODID_FARMER)))
        .addMethod(
          getDeserializePoolCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryDeserializePoolCoinResponse>(
                service, METHODID_DESERIALIZE_POOL_COIN)))
        .addMethod(
          getPoolIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolsIncentivesRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryPoolIncentivesResponse>(
                service, METHODID_POOL_INCENTIVES)))
        .addMethod(
          getFarmedPoolCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryFarmedPoolCoinResponse>(
                service, METHODID_FARMED_POOL_COIN)))
        .addMethod(
          getTotalActiveAndQueuedPoolCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryAllFarmedPoolCoinsResponse>(
                service, METHODID_TOTAL_ACTIVE_AND_QUEUED_POOL_COIN)))
        .addMethod(
          getOrderBooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
              com.comdex.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>(
                service, METHODID_ORDER_BOOKS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.liquidity.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getGenericParamsMethod())
              .addMethod(getPoolsMethod())
              .addMethod(getPoolMethod())
              .addMethod(getPoolByReserveAddressMethod())
              .addMethod(getPoolByPoolCoinDenomMethod())
              .addMethod(getPairsMethod())
              .addMethod(getPairMethod())
              .addMethod(getDepositRequestsMethod())
              .addMethod(getDepositRequestMethod())
              .addMethod(getWithdrawRequestsMethod())
              .addMethod(getWithdrawRequestMethod())
              .addMethod(getOrdersMethod())
              .addMethod(getOrderMethod())
              .addMethod(getOrdersByOrdererMethod())
              .addMethod(getFarmerMethod())
              .addMethod(getDeserializePoolCoinMethod())
              .addMethod(getPoolIncentivesMethod())
              .addMethod(getFarmedPoolCoinMethod())
              .addMethod(getTotalActiveAndQueuedPoolCoinMethod())
              .addMethod(getOrderBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
