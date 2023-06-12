package com.lum.network.millions;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: lum-network/millions/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "lum.network.millions.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryParamsRequest,
      com.lum.network.millions.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.lum.network.millions.QueryParamsRequest.class,
      responseType = com.lum.network.millions.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryParamsRequest,
      com.lum.network.millions.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryParamsRequest, com.lum.network.millions.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryParamsRequest, com.lum.network.millions.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolsRequest,
      com.lum.network.millions.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.lum.network.millions.QueryPoolsRequest.class,
      responseType = com.lum.network.millions.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolsRequest,
      com.lum.network.millions.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolsRequest, com.lum.network.millions.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolsRequest, com.lum.network.millions.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolRequest,
      com.lum.network.millions.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.lum.network.millions.QueryPoolRequest.class,
      responseType = com.lum.network.millions.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolRequest,
      com.lum.network.millions.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolRequest, com.lum.network.millions.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolRequest, com.lum.network.millions.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposits",
      requestType = com.lum.network.millions.QueryDepositsRequest.class,
      responseType = com.lum.network.millions.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getDepositsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryDepositsRequest, com.lum.network.millions.QueryDepositsResponse> getDepositsMethod;
    if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
          QueryGrpc.getDepositsMethod = getDepositsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryDepositsRequest, com.lum.network.millions.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposits"))
              .build();
        }
      }
    }
    return getDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getPoolDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDeposits",
      requestType = com.lum.network.millions.QueryPoolDepositsRequest.class,
      responseType = com.lum.network.millions.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getPoolDepositsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositsRequest, com.lum.network.millions.QueryDepositsResponse> getPoolDepositsMethod;
    if ((getPoolDepositsMethod = QueryGrpc.getPoolDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDepositsMethod = QueryGrpc.getPoolDepositsMethod) == null) {
          QueryGrpc.getPoolDepositsMethod = getPoolDepositsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDepositsRequest, com.lum.network.millions.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDeposits"))
              .build();
        }
      }
    }
    return getPoolDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositRequest,
      com.lum.network.millions.QueryDepositResponse> getPoolDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDeposit",
      requestType = com.lum.network.millions.QueryPoolDepositRequest.class,
      responseType = com.lum.network.millions.QueryDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositRequest,
      com.lum.network.millions.QueryDepositResponse> getPoolDepositMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDepositRequest, com.lum.network.millions.QueryDepositResponse> getPoolDepositMethod;
    if ((getPoolDepositMethod = QueryGrpc.getPoolDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDepositMethod = QueryGrpc.getPoolDepositMethod) == null) {
          QueryGrpc.getPoolDepositMethod = getPoolDepositMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDepositRequest, com.lum.network.millions.QueryDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDeposit"))
              .build();
        }
      }
    }
    return getPoolDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getAccountDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountDeposits",
      requestType = com.lum.network.millions.QueryAccountDepositsRequest.class,
      responseType = com.lum.network.millions.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getAccountDepositsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountDepositsRequest, com.lum.network.millions.QueryDepositsResponse> getAccountDepositsMethod;
    if ((getAccountDepositsMethod = QueryGrpc.getAccountDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountDepositsMethod = QueryGrpc.getAccountDepositsMethod) == null) {
          QueryGrpc.getAccountDepositsMethod = getAccountDepositsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountDepositsRequest, com.lum.network.millions.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountDeposits"))
              .build();
        }
      }
    }
    return getAccountDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getAccountPoolDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPoolDeposits",
      requestType = com.lum.network.millions.QueryAccountPoolDepositsRequest.class,
      responseType = com.lum.network.millions.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDepositsRequest,
      com.lum.network.millions.QueryDepositsResponse> getAccountPoolDepositsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDepositsRequest, com.lum.network.millions.QueryDepositsResponse> getAccountPoolDepositsMethod;
    if ((getAccountPoolDepositsMethod = QueryGrpc.getAccountPoolDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountPoolDepositsMethod = QueryGrpc.getAccountPoolDepositsMethod) == null) {
          QueryGrpc.getAccountPoolDepositsMethod = getAccountPoolDepositsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountPoolDepositsRequest, com.lum.network.millions.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPoolDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountPoolDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountPoolDeposits"))
              .build();
        }
      }
    }
    return getAccountPoolDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryDrawsRequest,
      com.lum.network.millions.QueryDrawsResponse> getDrawsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draws",
      requestType = com.lum.network.millions.QueryDrawsRequest.class,
      responseType = com.lum.network.millions.QueryDrawsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryDrawsRequest,
      com.lum.network.millions.QueryDrawsResponse> getDrawsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryDrawsRequest, com.lum.network.millions.QueryDrawsResponse> getDrawsMethod;
    if ((getDrawsMethod = QueryGrpc.getDrawsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDrawsMethod = QueryGrpc.getDrawsMethod) == null) {
          QueryGrpc.getDrawsMethod = getDrawsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryDrawsRequest, com.lum.network.millions.QueryDrawsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draws"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDrawsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDrawsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Draws"))
              .build();
        }
      }
    }
    return getDrawsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawsRequest,
      com.lum.network.millions.QueryDrawsResponse> getPoolDrawsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDraws",
      requestType = com.lum.network.millions.QueryPoolDrawsRequest.class,
      responseType = com.lum.network.millions.QueryDrawsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawsRequest,
      com.lum.network.millions.QueryDrawsResponse> getPoolDrawsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawsRequest, com.lum.network.millions.QueryDrawsResponse> getPoolDrawsMethod;
    if ((getPoolDrawsMethod = QueryGrpc.getPoolDrawsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDrawsMethod = QueryGrpc.getPoolDrawsMethod) == null) {
          QueryGrpc.getPoolDrawsMethod = getPoolDrawsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDrawsRequest, com.lum.network.millions.QueryDrawsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDraws"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDrawsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDrawsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDraws"))
              .build();
        }
      }
    }
    return getPoolDrawsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawRequest,
      com.lum.network.millions.QueryDrawResponse> getPoolDrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDraw",
      requestType = com.lum.network.millions.QueryPoolDrawRequest.class,
      responseType = com.lum.network.millions.QueryDrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawRequest,
      com.lum.network.millions.QueryDrawResponse> getPoolDrawMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawRequest, com.lum.network.millions.QueryDrawResponse> getPoolDrawMethod;
    if ((getPoolDrawMethod = QueryGrpc.getPoolDrawMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDrawMethod = QueryGrpc.getPoolDrawMethod) == null) {
          QueryGrpc.getPoolDrawMethod = getPoolDrawMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDrawRequest, com.lum.network.millions.QueryDrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryDrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDraw"))
              .build();
        }
      }
    }
    return getPoolDrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Prizes",
      requestType = com.lum.network.millions.QueryPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getPrizesMethod;
    if ((getPrizesMethod = QueryGrpc.getPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPrizesMethod = QueryGrpc.getPrizesMethod) == null) {
          QueryGrpc.getPrizesMethod = getPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Prizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Prizes"))
              .build();
        }
      }
    }
    return getPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPoolPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolPrizes",
      requestType = com.lum.network.millions.QueryPoolPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPoolPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getPoolPrizesMethod;
    if ((getPoolPrizesMethod = QueryGrpc.getPoolPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolPrizesMethod = QueryGrpc.getPoolPrizesMethod) == null) {
          QueryGrpc.getPoolPrizesMethod = getPoolPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolPrizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolPrizes"))
              .build();
        }
      }
    }
    return getPoolPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPoolDrawPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDrawPrizes",
      requestType = com.lum.network.millions.QueryPoolDrawPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getPoolDrawPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getPoolDrawPrizesMethod;
    if ((getPoolDrawPrizesMethod = QueryGrpc.getPoolDrawPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDrawPrizesMethod = QueryGrpc.getPoolDrawPrizesMethod) == null) {
          QueryGrpc.getPoolDrawPrizesMethod = getPoolDrawPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDrawPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDrawPrizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDrawPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDrawPrizes"))
              .build();
        }
      }
    }
    return getPoolDrawPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizeRequest,
      com.lum.network.millions.QueryPrizeResponse> getPoolDrawPrizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolDrawPrize",
      requestType = com.lum.network.millions.QueryPoolDrawPrizeRequest.class,
      responseType = com.lum.network.millions.QueryPrizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizeRequest,
      com.lum.network.millions.QueryPrizeResponse> getPoolDrawPrizeMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolDrawPrizeRequest, com.lum.network.millions.QueryPrizeResponse> getPoolDrawPrizeMethod;
    if ((getPoolDrawPrizeMethod = QueryGrpc.getPoolDrawPrizeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolDrawPrizeMethod = QueryGrpc.getPoolDrawPrizeMethod) == null) {
          QueryGrpc.getPoolDrawPrizeMethod = getPoolDrawPrizeMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolDrawPrizeRequest, com.lum.network.millions.QueryPrizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolDrawPrize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolDrawPrizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolDrawPrize"))
              .build();
        }
      }
    }
    return getPoolDrawPrizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPrizes",
      requestType = com.lum.network.millions.QueryAccountPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getAccountPrizesMethod;
    if ((getAccountPrizesMethod = QueryGrpc.getAccountPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountPrizesMethod = QueryGrpc.getAccountPrizesMethod) == null) {
          QueryGrpc.getAccountPrizesMethod = getAccountPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPrizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountPrizes"))
              .build();
        }
      }
    }
    return getAccountPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPoolPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPoolPrizes",
      requestType = com.lum.network.millions.QueryAccountPoolPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPoolPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getAccountPoolPrizesMethod;
    if ((getAccountPoolPrizesMethod = QueryGrpc.getAccountPoolPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountPoolPrizesMethod = QueryGrpc.getAccountPoolPrizesMethod) == null) {
          QueryGrpc.getAccountPoolPrizesMethod = getAccountPoolPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountPoolPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPoolPrizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountPoolPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountPoolPrizes"))
              .build();
        }
      }
    }
    return getAccountPoolPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDrawPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPoolDrawPrizesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPoolDrawPrizes",
      requestType = com.lum.network.millions.QueryAccountPoolDrawPrizesRequest.class,
      responseType = com.lum.network.millions.QueryPrizesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDrawPrizesRequest,
      com.lum.network.millions.QueryPrizesResponse> getAccountPoolDrawPrizesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolDrawPrizesRequest, com.lum.network.millions.QueryPrizesResponse> getAccountPoolDrawPrizesMethod;
    if ((getAccountPoolDrawPrizesMethod = QueryGrpc.getAccountPoolDrawPrizesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountPoolDrawPrizesMethod = QueryGrpc.getAccountPoolDrawPrizesMethod) == null) {
          QueryGrpc.getAccountPoolDrawPrizesMethod = getAccountPoolDrawPrizesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountPoolDrawPrizesRequest, com.lum.network.millions.QueryPrizesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPoolDrawPrizes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountPoolDrawPrizesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPrizesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountPoolDrawPrizes"))
              .build();
        }
      }
    }
    return getAccountPoolDrawPrizesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getWithdrawalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdrawals",
      requestType = com.lum.network.millions.QueryWithdrawalsRequest.class,
      responseType = com.lum.network.millions.QueryWithdrawalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getWithdrawalsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse> getWithdrawalsMethod;
    if ((getWithdrawalsMethod = QueryGrpc.getWithdrawalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawalsMethod = QueryGrpc.getWithdrawalsMethod) == null) {
          QueryGrpc.getWithdrawalsMethod = getWithdrawalsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdrawals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Withdrawals"))
              .build();
        }
      }
    }
    return getWithdrawalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getPoolWithdrawalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolWithdrawals",
      requestType = com.lum.network.millions.QueryPoolWithdrawalsRequest.class,
      responseType = com.lum.network.millions.QueryWithdrawalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getPoolWithdrawalsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse> getPoolWithdrawalsMethod;
    if ((getPoolWithdrawalsMethod = QueryGrpc.getPoolWithdrawalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolWithdrawalsMethod = QueryGrpc.getPoolWithdrawalsMethod) == null) {
          QueryGrpc.getPoolWithdrawalsMethod = getPoolWithdrawalsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolWithdrawals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolWithdrawalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolWithdrawals"))
              .build();
        }
      }
    }
    return getPoolWithdrawalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalRequest,
      com.lum.network.millions.QueryWithdrawalResponse> getPoolWithdrawalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolWithdrawal",
      requestType = com.lum.network.millions.QueryPoolWithdrawalRequest.class,
      responseType = com.lum.network.millions.QueryWithdrawalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalRequest,
      com.lum.network.millions.QueryWithdrawalResponse> getPoolWithdrawalMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryPoolWithdrawalRequest, com.lum.network.millions.QueryWithdrawalResponse> getPoolWithdrawalMethod;
    if ((getPoolWithdrawalMethod = QueryGrpc.getPoolWithdrawalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolWithdrawalMethod = QueryGrpc.getPoolWithdrawalMethod) == null) {
          QueryGrpc.getPoolWithdrawalMethod = getPoolWithdrawalMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryPoolWithdrawalRequest, com.lum.network.millions.QueryWithdrawalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolWithdrawal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryPoolWithdrawalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolWithdrawal"))
              .build();
        }
      }
    }
    return getPoolWithdrawalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getAccountWithdrawalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountWithdrawals",
      requestType = com.lum.network.millions.QueryAccountWithdrawalsRequest.class,
      responseType = com.lum.network.millions.QueryWithdrawalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getAccountWithdrawalsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse> getAccountWithdrawalsMethod;
    if ((getAccountWithdrawalsMethod = QueryGrpc.getAccountWithdrawalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountWithdrawalsMethod = QueryGrpc.getAccountWithdrawalsMethod) == null) {
          QueryGrpc.getAccountWithdrawalsMethod = getAccountWithdrawalsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountWithdrawals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountWithdrawalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountWithdrawals"))
              .build();
        }
      }
    }
    return getAccountWithdrawalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getAccountPoolWithdrawalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountPoolWithdrawals",
      requestType = com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.class,
      responseType = com.lum.network.millions.QueryWithdrawalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolWithdrawalsRequest,
      com.lum.network.millions.QueryWithdrawalsResponse> getAccountPoolWithdrawalsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.QueryAccountPoolWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse> getAccountPoolWithdrawalsMethod;
    if ((getAccountPoolWithdrawalsMethod = QueryGrpc.getAccountPoolWithdrawalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountPoolWithdrawalsMethod = QueryGrpc.getAccountPoolWithdrawalsMethod) == null) {
          QueryGrpc.getAccountPoolWithdrawalsMethod = getAccountPoolWithdrawalsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.QueryAccountPoolWithdrawalsRequest, com.lum.network.millions.QueryWithdrawalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountPoolWithdrawals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryAccountPoolWithdrawalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.QueryWithdrawalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountPoolWithdrawals"))
              .build();
        }
      }
    }
    return getAccountPoolWithdrawalsMethod;
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
    default void params(com.lum.network.millions.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void pools(com.lum.network.millions.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     */
    default void pool(com.lum.network.millions.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     */
    default void deposits(com.lum.network.millions.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositsMethod(), responseObserver);
    }

    /**
     */
    default void poolDeposits(com.lum.network.millions.QueryPoolDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDepositsMethod(), responseObserver);
    }

    /**
     */
    default void poolDeposit(com.lum.network.millions.QueryPoolDepositRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDepositMethod(), responseObserver);
    }

    /**
     */
    default void accountDeposits(com.lum.network.millions.QueryAccountDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDepositsMethod(), responseObserver);
    }

    /**
     */
    default void accountPoolDeposits(com.lum.network.millions.QueryAccountPoolDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPoolDepositsMethod(), responseObserver);
    }

    /**
     */
    default void draws(com.lum.network.millions.QueryDrawsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDrawsMethod(), responseObserver);
    }

    /**
     */
    default void poolDraws(com.lum.network.millions.QueryPoolDrawsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDrawsMethod(), responseObserver);
    }

    /**
     */
    default void poolDraw(com.lum.network.millions.QueryPoolDrawRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDrawMethod(), responseObserver);
    }

    /**
     */
    default void prizes(com.lum.network.millions.QueryPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrizesMethod(), responseObserver);
    }

    /**
     */
    default void poolPrizes(com.lum.network.millions.QueryPoolPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolPrizesMethod(), responseObserver);
    }

    /**
     */
    default void poolDrawPrizes(com.lum.network.millions.QueryPoolDrawPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDrawPrizesMethod(), responseObserver);
    }

    /**
     */
    default void poolDrawPrize(com.lum.network.millions.QueryPoolDrawPrizeRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolDrawPrizeMethod(), responseObserver);
    }

    /**
     */
    default void accountPrizes(com.lum.network.millions.QueryAccountPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPrizesMethod(), responseObserver);
    }

    /**
     */
    default void accountPoolPrizes(com.lum.network.millions.QueryAccountPoolPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPoolPrizesMethod(), responseObserver);
    }

    /**
     */
    default void accountPoolDrawPrizes(com.lum.network.millions.QueryAccountPoolDrawPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPoolDrawPrizesMethod(), responseObserver);
    }

    /**
     */
    default void withdrawals(com.lum.network.millions.QueryWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawalsMethod(), responseObserver);
    }

    /**
     */
    default void poolWithdrawals(com.lum.network.millions.QueryPoolWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolWithdrawalsMethod(), responseObserver);
    }

    /**
     */
    default void poolWithdrawal(com.lum.network.millions.QueryPoolWithdrawalRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolWithdrawalMethod(), responseObserver);
    }

    /**
     */
    default void accountWithdrawals(com.lum.network.millions.QueryAccountWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountWithdrawalsMethod(), responseObserver);
    }

    /**
     */
    default void accountPoolWithdrawals(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountPoolWithdrawalsMethod(), responseObserver);
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
    public void params(com.lum.network.millions.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pools(com.lum.network.millions.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pool(com.lum.network.millions.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposits(com.lum.network.millions.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDeposits(com.lum.network.millions.QueryPoolDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDeposit(com.lum.network.millions.QueryPoolDepositRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountDeposits(com.lum.network.millions.QueryAccountDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPoolDeposits(com.lum.network.millions.QueryAccountPoolDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPoolDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void draws(com.lum.network.millions.QueryDrawsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDrawsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDraws(com.lum.network.millions.QueryPoolDrawsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDrawsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDraw(com.lum.network.millions.QueryPoolDrawRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void prizes(com.lum.network.millions.QueryPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolPrizes(com.lum.network.millions.QueryPoolPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDrawPrizes(com.lum.network.millions.QueryPoolDrawPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDrawPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolDrawPrize(com.lum.network.millions.QueryPoolDrawPrizeRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolDrawPrizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPrizes(com.lum.network.millions.QueryAccountPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPoolPrizes(com.lum.network.millions.QueryAccountPoolPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPoolPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPoolDrawPrizes(com.lum.network.millions.QueryAccountPoolDrawPrizesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPoolDrawPrizesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawals(com.lum.network.millions.QueryWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolWithdrawals(com.lum.network.millions.QueryPoolWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolWithdrawalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolWithdrawal(com.lum.network.millions.QueryPoolWithdrawalRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolWithdrawalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountWithdrawals(com.lum.network.millions.QueryAccountWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountWithdrawalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accountPoolWithdrawals(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountPoolWithdrawalsMethod(), getCallOptions()), request, responseObserver);
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
    public com.lum.network.millions.QueryParamsResponse params(com.lum.network.millions.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPoolsResponse pools(com.lum.network.millions.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPoolResponse pool(com.lum.network.millions.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDepositsResponse deposits(com.lum.network.millions.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDepositsResponse poolDeposits(com.lum.network.millions.QueryPoolDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDepositsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDepositResponse poolDeposit(com.lum.network.millions.QueryPoolDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDepositsResponse accountDeposits(com.lum.network.millions.QueryAccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDepositsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDepositsResponse accountPoolDeposits(com.lum.network.millions.QueryAccountPoolDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPoolDepositsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDrawsResponse draws(com.lum.network.millions.QueryDrawsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDrawsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDrawsResponse poolDraws(com.lum.network.millions.QueryPoolDrawsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDrawsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryDrawResponse poolDraw(com.lum.network.millions.QueryPoolDrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse prizes(com.lum.network.millions.QueryPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse poolPrizes(com.lum.network.millions.QueryPoolPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse poolDrawPrizes(com.lum.network.millions.QueryPoolDrawPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDrawPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizeResponse poolDrawPrize(com.lum.network.millions.QueryPoolDrawPrizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolDrawPrizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse accountPrizes(com.lum.network.millions.QueryAccountPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse accountPoolPrizes(com.lum.network.millions.QueryAccountPoolPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPoolPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryPrizesResponse accountPoolDrawPrizes(com.lum.network.millions.QueryAccountPoolDrawPrizesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPoolDrawPrizesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryWithdrawalsResponse withdrawals(com.lum.network.millions.QueryWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryWithdrawalsResponse poolWithdrawals(com.lum.network.millions.QueryPoolWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolWithdrawalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryWithdrawalResponse poolWithdrawal(com.lum.network.millions.QueryPoolWithdrawalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolWithdrawalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryWithdrawalsResponse accountWithdrawals(com.lum.network.millions.QueryAccountWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountWithdrawalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.QueryWithdrawalsResponse accountPoolWithdrawals(com.lum.network.millions.QueryAccountPoolWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountPoolWithdrawalsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryParamsResponse> params(
        com.lum.network.millions.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPoolsResponse> pools(
        com.lum.network.millions.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPoolResponse> pool(
        com.lum.network.millions.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDepositsResponse> deposits(
        com.lum.network.millions.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDepositsResponse> poolDeposits(
        com.lum.network.millions.QueryPoolDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDepositsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDepositResponse> poolDeposit(
        com.lum.network.millions.QueryPoolDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDepositsResponse> accountDeposits(
        com.lum.network.millions.QueryAccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDepositsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDepositsResponse> accountPoolDeposits(
        com.lum.network.millions.QueryAccountPoolDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPoolDepositsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDrawsResponse> draws(
        com.lum.network.millions.QueryDrawsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDrawsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDrawsResponse> poolDraws(
        com.lum.network.millions.QueryPoolDrawsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDrawsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryDrawResponse> poolDraw(
        com.lum.network.millions.QueryPoolDrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> prizes(
        com.lum.network.millions.QueryPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> poolPrizes(
        com.lum.network.millions.QueryPoolPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> poolDrawPrizes(
        com.lum.network.millions.QueryPoolDrawPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDrawPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizeResponse> poolDrawPrize(
        com.lum.network.millions.QueryPoolDrawPrizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolDrawPrizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> accountPrizes(
        com.lum.network.millions.QueryAccountPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> accountPoolPrizes(
        com.lum.network.millions.QueryAccountPoolPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPoolPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryPrizesResponse> accountPoolDrawPrizes(
        com.lum.network.millions.QueryAccountPoolDrawPrizesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPoolDrawPrizesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryWithdrawalsResponse> withdrawals(
        com.lum.network.millions.QueryWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryWithdrawalsResponse> poolWithdrawals(
        com.lum.network.millions.QueryPoolWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolWithdrawalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryWithdrawalResponse> poolWithdrawal(
        com.lum.network.millions.QueryPoolWithdrawalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolWithdrawalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryWithdrawalsResponse> accountWithdrawals(
        com.lum.network.millions.QueryAccountWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountWithdrawalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.QueryWithdrawalsResponse> accountPoolWithdrawals(
        com.lum.network.millions.QueryAccountPoolWithdrawalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountPoolWithdrawalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_POOLS = 1;
  private static final int METHODID_POOL = 2;
  private static final int METHODID_DEPOSITS = 3;
  private static final int METHODID_POOL_DEPOSITS = 4;
  private static final int METHODID_POOL_DEPOSIT = 5;
  private static final int METHODID_ACCOUNT_DEPOSITS = 6;
  private static final int METHODID_ACCOUNT_POOL_DEPOSITS = 7;
  private static final int METHODID_DRAWS = 8;
  private static final int METHODID_POOL_DRAWS = 9;
  private static final int METHODID_POOL_DRAW = 10;
  private static final int METHODID_PRIZES = 11;
  private static final int METHODID_POOL_PRIZES = 12;
  private static final int METHODID_POOL_DRAW_PRIZES = 13;
  private static final int METHODID_POOL_DRAW_PRIZE = 14;
  private static final int METHODID_ACCOUNT_PRIZES = 15;
  private static final int METHODID_ACCOUNT_POOL_PRIZES = 16;
  private static final int METHODID_ACCOUNT_POOL_DRAW_PRIZES = 17;
  private static final int METHODID_WITHDRAWALS = 18;
  private static final int METHODID_POOL_WITHDRAWALS = 19;
  private static final int METHODID_POOL_WITHDRAWAL = 20;
  private static final int METHODID_ACCOUNT_WITHDRAWALS = 21;
  private static final int METHODID_ACCOUNT_POOL_WITHDRAWALS = 22;

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
          serviceImpl.params((com.lum.network.millions.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((com.lum.network.millions.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.lum.network.millions.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_DEPOSITS:
          serviceImpl.deposits((com.lum.network.millions.QueryDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_POOL_DEPOSITS:
          serviceImpl.poolDeposits((com.lum.network.millions.QueryPoolDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_POOL_DEPOSIT:
          serviceImpl.poolDeposit((com.lum.network.millions.QueryPoolDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DEPOSITS:
          serviceImpl.accountDeposits((com.lum.network.millions.QueryAccountDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_POOL_DEPOSITS:
          serviceImpl.accountPoolDeposits((com.lum.network.millions.QueryAccountPoolDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_DRAWS:
          serviceImpl.draws((com.lum.network.millions.QueryDrawsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse>) responseObserver);
          break;
        case METHODID_POOL_DRAWS:
          serviceImpl.poolDraws((com.lum.network.millions.QueryPoolDrawsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawsResponse>) responseObserver);
          break;
        case METHODID_POOL_DRAW:
          serviceImpl.poolDraw((com.lum.network.millions.QueryPoolDrawRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryDrawResponse>) responseObserver);
          break;
        case METHODID_PRIZES:
          serviceImpl.prizes((com.lum.network.millions.QueryPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_POOL_PRIZES:
          serviceImpl.poolPrizes((com.lum.network.millions.QueryPoolPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_POOL_DRAW_PRIZES:
          serviceImpl.poolDrawPrizes((com.lum.network.millions.QueryPoolDrawPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_POOL_DRAW_PRIZE:
          serviceImpl.poolDrawPrize((com.lum.network.millions.QueryPoolDrawPrizeRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizeResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_PRIZES:
          serviceImpl.accountPrizes((com.lum.network.millions.QueryAccountPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_POOL_PRIZES:
          serviceImpl.accountPoolPrizes((com.lum.network.millions.QueryAccountPoolPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_POOL_DRAW_PRIZES:
          serviceImpl.accountPoolDrawPrizes((com.lum.network.millions.QueryAccountPoolDrawPrizesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryPrizesResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWALS:
          serviceImpl.withdrawals((com.lum.network.millions.QueryWithdrawalsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse>) responseObserver);
          break;
        case METHODID_POOL_WITHDRAWALS:
          serviceImpl.poolWithdrawals((com.lum.network.millions.QueryPoolWithdrawalsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse>) responseObserver);
          break;
        case METHODID_POOL_WITHDRAWAL:
          serviceImpl.poolWithdrawal((com.lum.network.millions.QueryPoolWithdrawalRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_WITHDRAWALS:
          serviceImpl.accountWithdrawals((com.lum.network.millions.QueryAccountWithdrawalsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_POOL_WITHDRAWALS:
          serviceImpl.accountPoolWithdrawals((com.lum.network.millions.QueryAccountPoolWithdrawalsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.QueryWithdrawalsResponse>) responseObserver);
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
              com.lum.network.millions.QueryParamsRequest,
              com.lum.network.millions.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolsRequest,
              com.lum.network.millions.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolRequest,
              com.lum.network.millions.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryDepositsRequest,
              com.lum.network.millions.QueryDepositsResponse>(
                service, METHODID_DEPOSITS)))
        .addMethod(
          getPoolDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDepositsRequest,
              com.lum.network.millions.QueryDepositsResponse>(
                service, METHODID_POOL_DEPOSITS)))
        .addMethod(
          getPoolDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDepositRequest,
              com.lum.network.millions.QueryDepositResponse>(
                service, METHODID_POOL_DEPOSIT)))
        .addMethod(
          getAccountDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountDepositsRequest,
              com.lum.network.millions.QueryDepositsResponse>(
                service, METHODID_ACCOUNT_DEPOSITS)))
        .addMethod(
          getAccountPoolDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountPoolDepositsRequest,
              com.lum.network.millions.QueryDepositsResponse>(
                service, METHODID_ACCOUNT_POOL_DEPOSITS)))
        .addMethod(
          getDrawsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryDrawsRequest,
              com.lum.network.millions.QueryDrawsResponse>(
                service, METHODID_DRAWS)))
        .addMethod(
          getPoolDrawsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDrawsRequest,
              com.lum.network.millions.QueryDrawsResponse>(
                service, METHODID_POOL_DRAWS)))
        .addMethod(
          getPoolDrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDrawRequest,
              com.lum.network.millions.QueryDrawResponse>(
                service, METHODID_POOL_DRAW)))
        .addMethod(
          getPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_PRIZES)))
        .addMethod(
          getPoolPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_POOL_PRIZES)))
        .addMethod(
          getPoolDrawPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDrawPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_POOL_DRAW_PRIZES)))
        .addMethod(
          getPoolDrawPrizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolDrawPrizeRequest,
              com.lum.network.millions.QueryPrizeResponse>(
                service, METHODID_POOL_DRAW_PRIZE)))
        .addMethod(
          getAccountPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_ACCOUNT_PRIZES)))
        .addMethod(
          getAccountPoolPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountPoolPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_ACCOUNT_POOL_PRIZES)))
        .addMethod(
          getAccountPoolDrawPrizesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountPoolDrawPrizesRequest,
              com.lum.network.millions.QueryPrizesResponse>(
                service, METHODID_ACCOUNT_POOL_DRAW_PRIZES)))
        .addMethod(
          getWithdrawalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryWithdrawalsRequest,
              com.lum.network.millions.QueryWithdrawalsResponse>(
                service, METHODID_WITHDRAWALS)))
        .addMethod(
          getPoolWithdrawalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolWithdrawalsRequest,
              com.lum.network.millions.QueryWithdrawalsResponse>(
                service, METHODID_POOL_WITHDRAWALS)))
        .addMethod(
          getPoolWithdrawalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryPoolWithdrawalRequest,
              com.lum.network.millions.QueryWithdrawalResponse>(
                service, METHODID_POOL_WITHDRAWAL)))
        .addMethod(
          getAccountWithdrawalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountWithdrawalsRequest,
              com.lum.network.millions.QueryWithdrawalsResponse>(
                service, METHODID_ACCOUNT_WITHDRAWALS)))
        .addMethod(
          getAccountPoolWithdrawalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.QueryAccountPoolWithdrawalsRequest,
              com.lum.network.millions.QueryWithdrawalsResponse>(
                service, METHODID_ACCOUNT_POOL_WITHDRAWALS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.millions.QueryProto.getDescriptor();
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
              .addMethod(getPoolsMethod())
              .addMethod(getPoolMethod())
              .addMethod(getDepositsMethod())
              .addMethod(getPoolDepositsMethod())
              .addMethod(getPoolDepositMethod())
              .addMethod(getAccountDepositsMethod())
              .addMethod(getAccountPoolDepositsMethod())
              .addMethod(getDrawsMethod())
              .addMethod(getPoolDrawsMethod())
              .addMethod(getPoolDrawMethod())
              .addMethod(getPrizesMethod())
              .addMethod(getPoolPrizesMethod())
              .addMethod(getPoolDrawPrizesMethod())
              .addMethod(getPoolDrawPrizeMethod())
              .addMethod(getAccountPrizesMethod())
              .addMethod(getAccountPoolPrizesMethod())
              .addMethod(getAccountPoolDrawPrizesMethod())
              .addMethod(getWithdrawalsMethod())
              .addMethod(getPoolWithdrawalsMethod())
              .addMethod(getPoolWithdrawalMethod())
              .addMethod(getAccountWithdrawalsMethod())
              .addMethod(getAccountPoolWithdrawalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
