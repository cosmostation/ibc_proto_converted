package com.crescent.liquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/liquidity/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.liquidity.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolByReserveAddress",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByReserveAddressMethod;
    if ((getPoolByReserveAddressMethod = QueryGrpc.getPoolByReserveAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolByReserveAddressMethod = QueryGrpc.getPoolByReserveAddressMethod) == null) {
          QueryGrpc.getPoolByReserveAddressMethod = getPoolByReserveAddressMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolByReserveAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolByReserveAddress"))
              .build();
        }
      }
    }
    return getPoolByReserveAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolByPoolCoinDenom",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> getPoolByPoolCoinDenomMethod;
    if ((getPoolByPoolCoinDenomMethod = QueryGrpc.getPoolByPoolCoinDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolByPoolCoinDenomMethod = QueryGrpc.getPoolByPoolCoinDenomMethod) == null) {
          QueryGrpc.getPoolByPoolCoinDenomMethod = getPoolByPoolCoinDenomMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolByPoolCoinDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolByPoolCoinDenom"))
              .build();
        }
      }
    }
    return getPoolByPoolCoinDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pairs",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> getPairsMethod;
    if ((getPairsMethod = QueryGrpc.getPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPairsMethod = QueryGrpc.getPairsMethod) == null) {
          QueryGrpc.getPairsMethod = getPairsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pairs"))
              .build();
        }
      }
    }
    return getPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pair",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> getPairMethod;
    if ((getPairMethod = QueryGrpc.getPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPairMethod = QueryGrpc.getPairMethod) == null) {
          QueryGrpc.getPairMethod = getPairMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pair"))
              .build();
        }
      }
    }
    return getPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositRequests",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> getDepositRequestsMethod;
    if ((getDepositRequestsMethod = QueryGrpc.getDepositRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositRequestsMethod = QueryGrpc.getDepositRequestsMethod) == null) {
          QueryGrpc.getDepositRequestsMethod = getDepositRequestsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositRequests"))
              .build();
        }
      }
    }
    return getDepositRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositRequest",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> getDepositRequestMethod;
    if ((getDepositRequestMethod = QueryGrpc.getDepositRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositRequestMethod = QueryGrpc.getDepositRequestMethod) == null) {
          QueryGrpc.getDepositRequestMethod = getDepositRequestMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositRequest"))
              .build();
        }
      }
    }
    return getDepositRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRequests",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> getWithdrawRequestsMethod;
    if ((getWithdrawRequestsMethod = QueryGrpc.getWithdrawRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawRequestsMethod = QueryGrpc.getWithdrawRequestsMethod) == null) {
          QueryGrpc.getWithdrawRequestsMethod = getWithdrawRequestsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawRequests"))
              .build();
        }
      }
    }
    return getWithdrawRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRequest",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> getWithdrawRequestMethod;
    if ((getWithdrawRequestMethod = QueryGrpc.getWithdrawRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawRequestMethod = QueryGrpc.getWithdrawRequestMethod) == null) {
          QueryGrpc.getWithdrawRequestMethod = getWithdrawRequestMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawRequest"))
              .build();
        }
      }
    }
    return getWithdrawRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Orders",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersMethod;
    if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
          QueryGrpc.getOrdersMethod = getOrdersMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Orders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Orders"))
              .build();
        }
      }
    }
    return getOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Order",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> getOrderMethod;
    if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
          QueryGrpc.getOrderMethod = getOrderMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Order"))
              .build();
        }
      }
    }
    return getOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrdersByOrderer",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> getOrdersByOrdererMethod;
    if ((getOrdersByOrdererMethod = QueryGrpc.getOrdersByOrdererMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrdersByOrdererMethod = QueryGrpc.getOrdersByOrdererMethod) == null) {
          QueryGrpc.getOrdersByOrdererMethod = getOrdersByOrdererMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrdersByOrderer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OrdersByOrderer"))
              .build();
        }
      }
    }
    return getOrdersByOrdererMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrderBooks",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> getOrderBooksMethod;
    if ((getOrderBooksMethod = QueryGrpc.getOrderBooksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrderBooksMethod = QueryGrpc.getOrderBooksMethod) == null) {
          QueryGrpc.getOrderBooksMethod = getOrderBooksMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrderBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OrderBooks"))
              .build();
        }
      }
    }
    return getOrderBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> getNumMMOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NumMMOrders",
      requestType = com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest.class,
      responseType = com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest,
      com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> getNumMMOrdersMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> getNumMMOrdersMethod;
    if ((getNumMMOrdersMethod = QueryGrpc.getNumMMOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNumMMOrdersMethod = QueryGrpc.getNumMMOrdersMethod) == null) {
          QueryGrpc.getNumMMOrdersMethod = getNumMMOrdersMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest, com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NumMMOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NumMMOrders"))
              .build();
        }
      }
    }
    return getNumMMOrdersMethod;
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
    default void params(com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    default void pools(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    default void pool(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    default void poolByReserveAddress(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolByReserveAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    default void poolByPoolCoinDenom(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolByPoolCoinDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    default void pairs(com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPairsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    default void pair(com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPairMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    default void depositRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    default void depositRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    default void withdrawRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    default void withdrawRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    default void orders(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    default void order(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    default void ordersByOrderer(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrdersByOrdererMethod(), responseObserver);
    }

    /**
     */
    default void orderBooks(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderBooksMethod(), responseObserver);
    }

    /**
     */
    default void numMMOrders(com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNumMMOrdersMethod(), responseObserver);
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
    public void params(com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public void pools(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public void pool(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public void poolByReserveAddress(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolByReserveAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public void poolByPoolCoinDenom(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolByPoolCoinDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public void pairs(com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public void pair(com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public void depositRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public void depositRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public void withdrawRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public void withdrawRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public void orders(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public void order(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public void ordersByOrderer(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrdersByOrdererMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void orderBooks(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void numMMOrders(com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNumMMOrdersMethod(), getCallOptions()), request, responseObserver);
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
    public com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse params(com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse pools(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse pool(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse poolByReserveAddress(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolByReserveAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse poolByPoolCoinDenom(com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolByPoolCoinDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse pairs(com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPairsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse pair(com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse depositRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse depositRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse withdrawRequests(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse withdrawRequest(com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse orders(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse order(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse ordersByOrderer(com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrdersByOrdererMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse orderBooks(com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse numMMOrders(com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNumMMOrdersMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse> params(
        com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pools returns all liquidity pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse> pools(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool returns the specific liquidity pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> pool(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolByReserveAddress returns all pools that correspond to the reserve account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> poolByReserveAddress(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolByReserveAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse> poolByPoolCoinDenom(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolByPoolCoinDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pairs returns all liquidity pairs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse> pairs(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPairsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pair returns the specific pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse> pair(
        com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositRequests returns all deposit requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse> depositRequests(
        com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositRequest returns the specific deposit request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse> depositRequest(
        com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawRequests returns all withdraw requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse> withdrawRequests(
        com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawRequest returns the specific withdraw request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse> withdrawRequest(
        com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Orders returns all orders within the pair.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> orders(
        com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Order returns the specific order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse> order(
        com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OrdersByOrderer returns orders made by an orderer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse> ordersByOrderer(
        com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrdersByOrdererMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse> orderBooks(
        com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderBooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse> numMMOrders(
        com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNumMMOrdersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_POOLS = 1;
  private static final int METHODID_POOL = 2;
  private static final int METHODID_POOL_BY_RESERVE_ADDRESS = 3;
  private static final int METHODID_POOL_BY_POOL_COIN_DENOM = 4;
  private static final int METHODID_PAIRS = 5;
  private static final int METHODID_PAIR = 6;
  private static final int METHODID_DEPOSIT_REQUESTS = 7;
  private static final int METHODID_DEPOSIT_REQUEST = 8;
  private static final int METHODID_WITHDRAW_REQUESTS = 9;
  private static final int METHODID_WITHDRAW_REQUEST = 10;
  private static final int METHODID_ORDERS = 11;
  private static final int METHODID_ORDER = 12;
  private static final int METHODID_ORDERS_BY_ORDERER = 13;
  private static final int METHODID_ORDER_BOOKS = 14;
  private static final int METHODID_NUM_MMORDERS = 15;

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
          serviceImpl.params((com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_BY_RESERVE_ADDRESS:
          serviceImpl.poolByReserveAddress((com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_BY_POOL_COIN_DENOM:
          serviceImpl.poolByPoolCoinDenom((com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_PAIRS:
          serviceImpl.pairs((com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse>) responseObserver);
          break;
        case METHODID_PAIR:
          serviceImpl.pair((com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_REQUESTS:
          serviceImpl.depositRequests((com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_REQUEST:
          serviceImpl.depositRequest((com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REQUESTS:
          serviceImpl.withdrawRequests((com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REQUEST:
          serviceImpl.withdrawRequest((com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>) responseObserver);
          break;
        case METHODID_ORDERS:
          serviceImpl.orders((com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>) responseObserver);
          break;
        case METHODID_ORDER:
          serviceImpl.order((com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse>) responseObserver);
          break;
        case METHODID_ORDERS_BY_ORDERER:
          serviceImpl.ordersByOrderer((com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>) responseObserver);
          break;
        case METHODID_ORDER_BOOKS:
          serviceImpl.orderBooks((com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>) responseObserver);
          break;
        case METHODID_NUM_MMORDERS:
          serviceImpl.numMMOrders((com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse>) responseObserver);
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
              com.crescent.liquidity.v1beta1.QueryProto.QueryParamsRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getPoolByReserveAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByReserveAddressRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL_BY_RESERVE_ADDRESS)))
        .addMethod(
          getPoolByPoolCoinDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolByPoolCoinDenomRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL_BY_POOL_COIN_DENOM)))
        .addMethod(
          getPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPairsRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPairsResponse>(
                service, METHODID_PAIRS)))
        .addMethod(
          getPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryPairRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryPairResponse>(
                service, METHODID_PAIR)))
        .addMethod(
          getDepositRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestsResponse>(
                service, METHODID_DEPOSIT_REQUESTS)))
        .addMethod(
          getDepositRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryDepositRequestResponse>(
                service, METHODID_DEPOSIT_REQUEST)))
        .addMethod(
          getWithdrawRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestsResponse>(
                service, METHODID_WITHDRAW_REQUESTS)))
        .addMethod(
          getWithdrawRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryWithdrawRequestResponse>(
                service, METHODID_WITHDRAW_REQUEST)))
        .addMethod(
          getOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>(
                service, METHODID_ORDERS)))
        .addMethod(
          getOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrderRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrderResponse>(
                service, METHODID_ORDER)))
        .addMethod(
          getOrdersByOrdererMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersByOrdererRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrdersResponse>(
                service, METHODID_ORDERS_BY_ORDERER)))
        .addMethod(
          getOrderBooksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryOrderBooksResponse>(
                service, METHODID_ORDER_BOOKS)))
        .addMethod(
          getNumMMOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersRequest,
              com.crescent.liquidity.v1beta1.QueryProto.QueryNumMMOrdersResponse>(
                service, METHODID_NUM_MMORDERS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.liquidity.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getOrderBooksMethod())
              .addMethod(getNumMMOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
