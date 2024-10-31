package com.neutron.dex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/dex/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.dex.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryParamsRequest,
      com.neutron.dex.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.neutron.dex.QueryProto.QueryParamsRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryParamsRequest,
      com.neutron.dex.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryParamsRequest, com.neutron.dex.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryParamsRequest, com.neutron.dex.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest,
      com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> getLimitOrderTrancheUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrderTrancheUser",
      requestType = com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest,
      com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> getLimitOrderTrancheUserMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest, com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> getLimitOrderTrancheUserMethod;
    if ((getLimitOrderTrancheUserMethod = QueryGrpc.getLimitOrderTrancheUserMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLimitOrderTrancheUserMethod = QueryGrpc.getLimitOrderTrancheUserMethod) == null) {
          QueryGrpc.getLimitOrderTrancheUserMethod = getLimitOrderTrancheUserMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest, com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrderTrancheUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LimitOrderTrancheUser"))
              .build();
        }
      }
    }
    return getLimitOrderTrancheUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> getLimitOrderTrancheUserAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrderTrancheUserAll",
      requestType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> getLimitOrderTrancheUserAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> getLimitOrderTrancheUserAllMethod;
    if ((getLimitOrderTrancheUserAllMethod = QueryGrpc.getLimitOrderTrancheUserAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLimitOrderTrancheUserAllMethod = QueryGrpc.getLimitOrderTrancheUserAllMethod) == null) {
          QueryGrpc.getLimitOrderTrancheUserAllMethod = getLimitOrderTrancheUserAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrderTrancheUserAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LimitOrderTrancheUserAll"))
              .build();
        }
      }
    }
    return getLimitOrderTrancheUserAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> getLimitOrderTrancheUserAllByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrderTrancheUserAllByAddress",
      requestType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> getLimitOrderTrancheUserAllByAddressMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> getLimitOrderTrancheUserAllByAddressMethod;
    if ((getLimitOrderTrancheUserAllByAddressMethod = QueryGrpc.getLimitOrderTrancheUserAllByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLimitOrderTrancheUserAllByAddressMethod = QueryGrpc.getLimitOrderTrancheUserAllByAddressMethod) == null) {
          QueryGrpc.getLimitOrderTrancheUserAllByAddressMethod = getLimitOrderTrancheUserAllByAddressMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrderTrancheUserAllByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LimitOrderTrancheUserAllByAddress"))
              .build();
        }
      }
    }
    return getLimitOrderTrancheUserAllByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> getLimitOrderTrancheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrderTranche",
      requestType = com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> getLimitOrderTrancheMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> getLimitOrderTrancheMethod;
    if ((getLimitOrderTrancheMethod = QueryGrpc.getLimitOrderTrancheMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLimitOrderTrancheMethod = QueryGrpc.getLimitOrderTrancheMethod) == null) {
          QueryGrpc.getLimitOrderTrancheMethod = getLimitOrderTrancheMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrderTranche"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LimitOrderTranche"))
              .build();
        }
      }
    }
    return getLimitOrderTrancheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> getLimitOrderTrancheAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LimitOrderTrancheAll",
      requestType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> getLimitOrderTrancheAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> getLimitOrderTrancheAllMethod;
    if ((getLimitOrderTrancheAllMethod = QueryGrpc.getLimitOrderTrancheAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLimitOrderTrancheAllMethod = QueryGrpc.getLimitOrderTrancheAllMethod) == null) {
          QueryGrpc.getLimitOrderTrancheAllMethod = getLimitOrderTrancheAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LimitOrderTrancheAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LimitOrderTrancheAll"))
              .build();
        }
      }
    }
    return getLimitOrderTrancheAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllUserDepositsRequest,
      com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> getUserDepositsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserDepositsAll",
      requestType = com.neutron.dex.QueryProto.QueryAllUserDepositsRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllUserDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllUserDepositsRequest,
      com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> getUserDepositsAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllUserDepositsRequest, com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> getUserDepositsAllMethod;
    if ((getUserDepositsAllMethod = QueryGrpc.getUserDepositsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserDepositsAllMethod = QueryGrpc.getUserDepositsAllMethod) == null) {
          QueryGrpc.getUserDepositsAllMethod = getUserDepositsAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllUserDepositsRequest, com.neutron.dex.QueryProto.QueryAllUserDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserDepositsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllUserDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllUserDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserDepositsAll"))
              .build();
        }
      }
    }
    return getUserDepositsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest,
      com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> getTickLiquidityAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TickLiquidityAll",
      requestType = com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest,
      com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> getTickLiquidityAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest, com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> getTickLiquidityAllMethod;
    if ((getTickLiquidityAllMethod = QueryGrpc.getTickLiquidityAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTickLiquidityAllMethod = QueryGrpc.getTickLiquidityAllMethod) == null) {
          QueryGrpc.getTickLiquidityAllMethod = getTickLiquidityAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest, com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TickLiquidityAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TickLiquidityAll"))
              .build();
        }
      }
    }
    return getTickLiquidityAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InactiveLimitOrderTranche",
      requestType = com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheMethod;
    if ((getInactiveLimitOrderTrancheMethod = QueryGrpc.getInactiveLimitOrderTrancheMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInactiveLimitOrderTrancheMethod = QueryGrpc.getInactiveLimitOrderTrancheMethod) == null) {
          QueryGrpc.getInactiveLimitOrderTrancheMethod = getInactiveLimitOrderTrancheMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InactiveLimitOrderTranche"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InactiveLimitOrderTranche"))
              .build();
        }
      }
    }
    return getInactiveLimitOrderTrancheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InactiveLimitOrderTrancheAll",
      requestType = com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest,
      com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> getInactiveLimitOrderTrancheAllMethod;
    if ((getInactiveLimitOrderTrancheAllMethod = QueryGrpc.getInactiveLimitOrderTrancheAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInactiveLimitOrderTrancheAllMethod = QueryGrpc.getInactiveLimitOrderTrancheAllMethod) == null) {
          QueryGrpc.getInactiveLimitOrderTrancheAllMethod = getInactiveLimitOrderTrancheAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest, com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InactiveLimitOrderTrancheAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InactiveLimitOrderTrancheAll"))
              .build();
        }
      }
    }
    return getInactiveLimitOrderTrancheAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolReservesRequest,
      com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> getPoolReservesAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolReservesAll",
      requestType = com.neutron.dex.QueryProto.QueryAllPoolReservesRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllPoolReservesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolReservesRequest,
      com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> getPoolReservesAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolReservesRequest, com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> getPoolReservesAllMethod;
    if ((getPoolReservesAllMethod = QueryGrpc.getPoolReservesAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolReservesAllMethod = QueryGrpc.getPoolReservesAllMethod) == null) {
          QueryGrpc.getPoolReservesAllMethod = getPoolReservesAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllPoolReservesRequest, com.neutron.dex.QueryProto.QueryAllPoolReservesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolReservesAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllPoolReservesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllPoolReservesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolReservesAll"))
              .build();
        }
      }
    }
    return getPoolReservesAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolReservesRequest,
      com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> getPoolReservesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolReserves",
      requestType = com.neutron.dex.QueryProto.QueryGetPoolReservesRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryGetPoolReservesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolReservesRequest,
      com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> getPoolReservesMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolReservesRequest, com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> getPoolReservesMethod;
    if ((getPoolReservesMethod = QueryGrpc.getPoolReservesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolReservesMethod = QueryGrpc.getPoolReservesMethod) == null) {
          QueryGrpc.getPoolReservesMethod = getPoolReservesMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryGetPoolReservesRequest, com.neutron.dex.QueryProto.QueryGetPoolReservesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolReserves"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetPoolReservesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetPoolReservesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolReserves"))
              .build();
        }
      }
    }
    return getPoolReservesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest,
      com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> getEstimateMultiHopSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateMultiHopSwap",
      requestType = com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest,
      com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> getEstimateMultiHopSwapMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest, com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> getEstimateMultiHopSwapMethod;
    if ((getEstimateMultiHopSwapMethod = QueryGrpc.getEstimateMultiHopSwapMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateMultiHopSwapMethod = QueryGrpc.getEstimateMultiHopSwapMethod) == null) {
          QueryGrpc.getEstimateMultiHopSwapMethod = getEstimateMultiHopSwapMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest, com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateMultiHopSwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateMultiHopSwap"))
              .build();
        }
      }
    }
    return getEstimateMultiHopSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest,
      com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> getEstimatePlaceLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimatePlaceLimitOrder",
      requestType = com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest,
      com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> getEstimatePlaceLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest, com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> getEstimatePlaceLimitOrderMethod;
    if ((getEstimatePlaceLimitOrderMethod = QueryGrpc.getEstimatePlaceLimitOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimatePlaceLimitOrderMethod = QueryGrpc.getEstimatePlaceLimitOrderMethod) == null) {
          QueryGrpc.getEstimatePlaceLimitOrderMethod = getEstimatePlaceLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest, com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimatePlaceLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimatePlaceLimitOrder"))
              .build();
        }
      }
    }
    return getEstimatePlaceLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolRequest,
      com.neutron.dex.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.neutron.dex.QueryProto.QueryPoolRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolRequest,
      com.neutron.dex.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolRequest, com.neutron.dex.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryPoolRequest, com.neutron.dex.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolByIDRequest,
      com.neutron.dex.QueryProto.QueryPoolResponse> getPoolByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolByID",
      requestType = com.neutron.dex.QueryProto.QueryPoolByIDRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolByIDRequest,
      com.neutron.dex.QueryProto.QueryPoolResponse> getPoolByIDMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryPoolByIDRequest, com.neutron.dex.QueryProto.QueryPoolResponse> getPoolByIDMethod;
    if ((getPoolByIDMethod = QueryGrpc.getPoolByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolByIDMethod = QueryGrpc.getPoolByIDMethod) == null) {
          QueryGrpc.getPoolByIDMethod = getPoolByIDMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryPoolByIDRequest, com.neutron.dex.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryPoolByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolByID"))
              .build();
        }
      }
    }
    return getPoolByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest,
      com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> getPoolMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolMetadata",
      requestType = com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest,
      com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> getPoolMetadataMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest, com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> getPoolMetadataMethod;
    if ((getPoolMetadataMethod = QueryGrpc.getPoolMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMetadataMethod = QueryGrpc.getPoolMetadataMethod) == null) {
          QueryGrpc.getPoolMetadataMethod = getPoolMetadataMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest, com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolMetadata"))
              .build();
        }
      }
    }
    return getPoolMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest,
      com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> getPoolMetadataAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolMetadataAll",
      requestType = com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest.class,
      responseType = com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest,
      com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> getPoolMetadataAllMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest, com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> getPoolMetadataAllMethod;
    if ((getPoolMetadataAllMethod = QueryGrpc.getPoolMetadataAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMetadataAllMethod = QueryGrpc.getPoolMetadataAllMethod) == null) {
          QueryGrpc.getPoolMetadataAllMethod = getPoolMetadataAllMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest, com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolMetadataAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolMetadataAll"))
              .build();
        }
      }
    }
    return getPoolMetadataAllMethod;
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
    default void params(com.neutron.dex.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a LimitOrderTrancheUser by index.
     * </pre>
     */
    default void limitOrderTrancheUser(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderTrancheUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranchUser items.
     * </pre>
     */
    default void limitOrderTrancheUserAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderTrancheUserAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTrancheUser items for a given address.
     * </pre>
     */
    default void limitOrderTrancheUserAllByAddress(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderTrancheUserAllByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a LimitOrderTranche by index.
     * </pre>
     */
    default void limitOrderTranche(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderTrancheMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranche items for a given pairID / TokenIn
     * combination.
     * </pre>
     */
    default void limitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLimitOrderTrancheAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserDeposits items.
     * </pre>
     */
    default void userDepositsAll(com.neutron.dex.QueryProto.QueryAllUserDepositsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserDepositsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TickLiquidity items.
     * </pre>
     */
    default void tickLiquidityAll(com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTickLiquidityAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a InactiveLimitOrderTranche by index.
     * </pre>
     */
    default void inactiveLimitOrderTranche(com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInactiveLimitOrderTrancheMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InactiveLimitOrderTranche items.
     * </pre>
     */
    default void inactiveLimitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInactiveLimitOrderTrancheAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolReserves items.
     * </pre>
     */
    default void poolReservesAll(com.neutron.dex.QueryProto.QueryAllPoolReservesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolReservesAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a PoolReserve by index
     * </pre>
     */
    default void poolReserves(com.neutron.dex.QueryProto.QueryGetPoolReservesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolReservesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the simulated result of a multihop swap
     * </pre>
     */
    default void estimateMultiHopSwap(com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateMultiHopSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the simulated result of a PlaceLimit order
     * </pre>
     */
    default void estimatePlaceLimitOrder(com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimatePlaceLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a pool by pair, tick and fee
     * </pre>
     */
    default void pool(com.neutron.dex.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a pool by ID
     * </pre>
     */
    default void poolByID(com.neutron.dex.QueryProto.QueryPoolByIDRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a PoolMetadata by ID
     * </pre>
     */
    default void poolMetadata(com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolMetadata items.
     * </pre>
     */
    default void poolMetadataAll(com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMetadataAllMethod(), responseObserver);
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
    public void params(com.neutron.dex.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a LimitOrderTrancheUser by index.
     * </pre>
     */
    public void limitOrderTrancheUser(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranchUser items.
     * </pre>
     */
    public void limitOrderTrancheUserAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTrancheUser items for a given address.
     * </pre>
     */
    public void limitOrderTrancheUserAllByAddress(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserAllByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a LimitOrderTranche by index.
     * </pre>
     */
    public void limitOrderTranche(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderTrancheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranche items for a given pairID / TokenIn
     * combination.
     * </pre>
     */
    public void limitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLimitOrderTrancheAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserDeposits items.
     * </pre>
     */
    public void userDepositsAll(com.neutron.dex.QueryProto.QueryAllUserDepositsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserDepositsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TickLiquidity items.
     * </pre>
     */
    public void tickLiquidityAll(com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTickLiquidityAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a InactiveLimitOrderTranche by index.
     * </pre>
     */
    public void inactiveLimitOrderTranche(com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInactiveLimitOrderTrancheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InactiveLimitOrderTranche items.
     * </pre>
     */
    public void inactiveLimitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInactiveLimitOrderTrancheAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolReserves items.
     * </pre>
     */
    public void poolReservesAll(com.neutron.dex.QueryProto.QueryAllPoolReservesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolReservesAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a PoolReserve by index
     * </pre>
     */
    public void poolReserves(com.neutron.dex.QueryProto.QueryGetPoolReservesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolReservesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the simulated result of a multihop swap
     * </pre>
     */
    public void estimateMultiHopSwap(com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateMultiHopSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the simulated result of a PlaceLimit order
     * </pre>
     */
    public void estimatePlaceLimitOrder(com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimatePlaceLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a pool by pair, tick and fee
     * </pre>
     */
    public void pool(com.neutron.dex.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a pool by ID
     * </pre>
     */
    public void poolByID(com.neutron.dex.QueryProto.QueryPoolByIDRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a PoolMetadata by ID
     * </pre>
     */
    public void poolMetadata(com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolMetadata items.
     * </pre>
     */
    public void poolMetadataAll(com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest request,
        io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMetadataAllMethod(), getCallOptions()), request, responseObserver);
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
    public com.neutron.dex.QueryProto.QueryParamsResponse params(com.neutron.dex.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a LimitOrderTrancheUser by index.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse limitOrderTrancheUser(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderTrancheUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranchUser items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse limitOrderTrancheUserAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderTrancheUserAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTrancheUser items for a given address.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse limitOrderTrancheUserAllByAddress(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderTrancheUserAllByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a LimitOrderTranche by index.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse limitOrderTranche(com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderTrancheMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranche items for a given pairID / TokenIn
     * combination.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse limitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLimitOrderTrancheAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UserDeposits items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllUserDepositsResponse userDepositsAll(com.neutron.dex.QueryProto.QueryAllUserDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserDepositsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of TickLiquidity items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse tickLiquidityAll(com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTickLiquidityAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a InactiveLimitOrderTranche by index.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse inactiveLimitOrderTranche(com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInactiveLimitOrderTrancheMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InactiveLimitOrderTranche items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse inactiveLimitOrderTrancheAll(com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInactiveLimitOrderTrancheAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolReserves items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllPoolReservesResponse poolReservesAll(com.neutron.dex.QueryProto.QueryAllPoolReservesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolReservesAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a PoolReserve by index
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryGetPoolReservesResponse poolReserves(com.neutron.dex.QueryProto.QueryGetPoolReservesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolReservesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the simulated result of a multihop swap
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse estimateMultiHopSwap(com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateMultiHopSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the simulated result of a PlaceLimit order
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse estimatePlaceLimitOrder(com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimatePlaceLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a pool by pair, tick and fee
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryPoolResponse pool(com.neutron.dex.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a pool by ID
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryPoolResponse poolByID(com.neutron.dex.QueryProto.QueryPoolByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a PoolMetadata by ID
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse poolMetadata(com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolMetadata items.
     * </pre>
     */
    public com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse poolMetadataAll(com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMetadataAllMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryParamsResponse> params(
        com.neutron.dex.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a LimitOrderTrancheUser by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse> limitOrderTrancheUser(
        com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranchUser items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse> limitOrderTrancheUserAll(
        com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTrancheUser items for a given address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse> limitOrderTrancheUserAllByAddress(
        com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderTrancheUserAllByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a LimitOrderTranche by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse> limitOrderTranche(
        com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderTrancheMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LimitOrderTranche items for a given pairID / TokenIn
     * combination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse> limitOrderTrancheAll(
        com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLimitOrderTrancheAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UserDeposits items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllUserDepositsResponse> userDepositsAll(
        com.neutron.dex.QueryProto.QueryAllUserDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserDepositsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of TickLiquidity items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse> tickLiquidityAll(
        com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTickLiquidityAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a InactiveLimitOrderTranche by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse> inactiveLimitOrderTranche(
        com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInactiveLimitOrderTrancheMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InactiveLimitOrderTranche items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse> inactiveLimitOrderTrancheAll(
        com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInactiveLimitOrderTrancheAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolReserves items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllPoolReservesResponse> poolReservesAll(
        com.neutron.dex.QueryProto.QueryAllPoolReservesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolReservesAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a PoolReserve by index
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryGetPoolReservesResponse> poolReserves(
        com.neutron.dex.QueryProto.QueryGetPoolReservesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolReservesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the simulated result of a multihop swap
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse> estimateMultiHopSwap(
        com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateMultiHopSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the simulated result of a PlaceLimit order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse> estimatePlaceLimitOrder(
        com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimatePlaceLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a pool by pair, tick and fee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryPoolResponse> pool(
        com.neutron.dex.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a pool by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryPoolResponse> poolByID(
        com.neutron.dex.QueryProto.QueryPoolByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a PoolMetadata by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse> poolMetadata(
        com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolMetadata items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse> poolMetadataAll(
        com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMetadataAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_LIMIT_ORDER_TRANCHE_USER = 1;
  private static final int METHODID_LIMIT_ORDER_TRANCHE_USER_ALL = 2;
  private static final int METHODID_LIMIT_ORDER_TRANCHE_USER_ALL_BY_ADDRESS = 3;
  private static final int METHODID_LIMIT_ORDER_TRANCHE = 4;
  private static final int METHODID_LIMIT_ORDER_TRANCHE_ALL = 5;
  private static final int METHODID_USER_DEPOSITS_ALL = 6;
  private static final int METHODID_TICK_LIQUIDITY_ALL = 7;
  private static final int METHODID_INACTIVE_LIMIT_ORDER_TRANCHE = 8;
  private static final int METHODID_INACTIVE_LIMIT_ORDER_TRANCHE_ALL = 9;
  private static final int METHODID_POOL_RESERVES_ALL = 10;
  private static final int METHODID_POOL_RESERVES = 11;
  private static final int METHODID_ESTIMATE_MULTI_HOP_SWAP = 12;
  private static final int METHODID_ESTIMATE_PLACE_LIMIT_ORDER = 13;
  private static final int METHODID_POOL = 14;
  private static final int METHODID_POOL_BY_ID = 15;
  private static final int METHODID_POOL_METADATA = 16;
  private static final int METHODID_POOL_METADATA_ALL = 17;

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
          serviceImpl.params((com.neutron.dex.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER_TRANCHE_USER:
          serviceImpl.limitOrderTrancheUser((com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER_TRANCHE_USER_ALL:
          serviceImpl.limitOrderTrancheUserAll((com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER_TRANCHE_USER_ALL_BY_ADDRESS:
          serviceImpl.limitOrderTrancheUserAllByAddress((com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER_TRANCHE:
          serviceImpl.limitOrderTranche((com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse>) responseObserver);
          break;
        case METHODID_LIMIT_ORDER_TRANCHE_ALL:
          serviceImpl.limitOrderTrancheAll((com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse>) responseObserver);
          break;
        case METHODID_USER_DEPOSITS_ALL:
          serviceImpl.userDepositsAll((com.neutron.dex.QueryProto.QueryAllUserDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllUserDepositsResponse>) responseObserver);
          break;
        case METHODID_TICK_LIQUIDITY_ALL:
          serviceImpl.tickLiquidityAll((com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse>) responseObserver);
          break;
        case METHODID_INACTIVE_LIMIT_ORDER_TRANCHE:
          serviceImpl.inactiveLimitOrderTranche((com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse>) responseObserver);
          break;
        case METHODID_INACTIVE_LIMIT_ORDER_TRANCHE_ALL:
          serviceImpl.inactiveLimitOrderTrancheAll((com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse>) responseObserver);
          break;
        case METHODID_POOL_RESERVES_ALL:
          serviceImpl.poolReservesAll((com.neutron.dex.QueryProto.QueryAllPoolReservesRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolReservesResponse>) responseObserver);
          break;
        case METHODID_POOL_RESERVES:
          serviceImpl.poolReserves((com.neutron.dex.QueryProto.QueryGetPoolReservesRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolReservesResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_MULTI_HOP_SWAP:
          serviceImpl.estimateMultiHopSwap((com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_PLACE_LIMIT_ORDER:
          serviceImpl.estimatePlaceLimitOrder((com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.neutron.dex.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_BY_ID:
          serviceImpl.poolByID((com.neutron.dex.QueryProto.QueryPoolByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_POOL_METADATA:
          serviceImpl.poolMetadata((com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse>) responseObserver);
          break;
        case METHODID_POOL_METADATA_ALL:
          serviceImpl.poolMetadataAll((com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse>) responseObserver);
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
              com.neutron.dex.QueryProto.QueryParamsRequest,
              com.neutron.dex.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLimitOrderTrancheUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserRequest,
              com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheUserResponse>(
                service, METHODID_LIMIT_ORDER_TRANCHE_USER)))
        .addMethod(
          getLimitOrderTrancheUserAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserRequest,
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserResponse>(
                service, METHODID_LIMIT_ORDER_TRANCHE_USER_ALL)))
        .addMethod(
          getLimitOrderTrancheUserAllByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressRequest,
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheUserByAddressResponse>(
                service, METHODID_LIMIT_ORDER_TRANCHE_USER_ALL_BY_ADDRESS)))
        .addMethod(
          getLimitOrderTrancheMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheRequest,
              com.neutron.dex.QueryProto.QueryGetLimitOrderTrancheResponse>(
                service, METHODID_LIMIT_ORDER_TRANCHE)))
        .addMethod(
          getLimitOrderTrancheAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheRequest,
              com.neutron.dex.QueryProto.QueryAllLimitOrderTrancheResponse>(
                service, METHODID_LIMIT_ORDER_TRANCHE_ALL)))
        .addMethod(
          getUserDepositsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllUserDepositsRequest,
              com.neutron.dex.QueryProto.QueryAllUserDepositsResponse>(
                service, METHODID_USER_DEPOSITS_ALL)))
        .addMethod(
          getTickLiquidityAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllTickLiquidityRequest,
              com.neutron.dex.QueryProto.QueryAllTickLiquidityResponse>(
                service, METHODID_TICK_LIQUIDITY_ALL)))
        .addMethod(
          getInactiveLimitOrderTrancheMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheRequest,
              com.neutron.dex.QueryProto.QueryGetInactiveLimitOrderTrancheResponse>(
                service, METHODID_INACTIVE_LIMIT_ORDER_TRANCHE)))
        .addMethod(
          getInactiveLimitOrderTrancheAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheRequest,
              com.neutron.dex.QueryProto.QueryAllInactiveLimitOrderTrancheResponse>(
                service, METHODID_INACTIVE_LIMIT_ORDER_TRANCHE_ALL)))
        .addMethod(
          getPoolReservesAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllPoolReservesRequest,
              com.neutron.dex.QueryProto.QueryAllPoolReservesResponse>(
                service, METHODID_POOL_RESERVES_ALL)))
        .addMethod(
          getPoolReservesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryGetPoolReservesRequest,
              com.neutron.dex.QueryProto.QueryGetPoolReservesResponse>(
                service, METHODID_POOL_RESERVES)))
        .addMethod(
          getEstimateMultiHopSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapRequest,
              com.neutron.dex.QueryProto.QueryEstimateMultiHopSwapResponse>(
                service, METHODID_ESTIMATE_MULTI_HOP_SWAP)))
        .addMethod(
          getEstimatePlaceLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderRequest,
              com.neutron.dex.QueryProto.QueryEstimatePlaceLimitOrderResponse>(
                service, METHODID_ESTIMATE_PLACE_LIMIT_ORDER)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryPoolRequest,
              com.neutron.dex.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getPoolByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryPoolByIDRequest,
              com.neutron.dex.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL_BY_ID)))
        .addMethod(
          getPoolMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryGetPoolMetadataRequest,
              com.neutron.dex.QueryProto.QueryGetPoolMetadataResponse>(
                service, METHODID_POOL_METADATA)))
        .addMethod(
          getPoolMetadataAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.QueryProto.QueryAllPoolMetadataRequest,
              com.neutron.dex.QueryProto.QueryAllPoolMetadataResponse>(
                service, METHODID_POOL_METADATA_ALL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.dex.QueryProto.getDescriptor();
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
              .addMethod(getLimitOrderTrancheUserMethod())
              .addMethod(getLimitOrderTrancheUserAllMethod())
              .addMethod(getLimitOrderTrancheUserAllByAddressMethod())
              .addMethod(getLimitOrderTrancheMethod())
              .addMethod(getLimitOrderTrancheAllMethod())
              .addMethod(getUserDepositsAllMethod())
              .addMethod(getTickLiquidityAllMethod())
              .addMethod(getInactiveLimitOrderTrancheMethod())
              .addMethod(getInactiveLimitOrderTrancheAllMethod())
              .addMethod(getPoolReservesAllMethod())
              .addMethod(getPoolReservesMethod())
              .addMethod(getEstimateMultiHopSwapMethod())
              .addMethod(getEstimatePlaceLimitOrderMethod())
              .addMethod(getPoolMethod())
              .addMethod(getPoolByIDMethod())
              .addMethod(getPoolMetadataMethod())
              .addMethod(getPoolMetadataAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
