package com.pstake.liquidstakeibc.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: pstake/liquidstakeibc/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pstake.liquidstakeibc.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> getHostChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HostChain",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> getHostChainMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> getHostChainMethod;
    if ((getHostChainMethod = QueryGrpc.getHostChainMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHostChainMethod = QueryGrpc.getHostChainMethod) == null) {
          QueryGrpc.getHostChainMethod = getHostChainMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HostChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HostChain"))
              .build();
        }
      }
    }
    return getHostChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> getHostChainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HostChains",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> getHostChainsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> getHostChainsMethod;
    if ((getHostChainsMethod = QueryGrpc.getHostChainsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHostChainsMethod = QueryGrpc.getHostChainsMethod) == null) {
          QueryGrpc.getHostChainsMethod = getHostChainsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HostChains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HostChains"))
              .build();
        }
      }
    }
    return getHostChainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> getDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposits",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> getDepositsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> getDepositsMethod;
    if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
          QueryGrpc.getDepositsMethod = getDepositsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposits"))
              .build();
        }
      }
    }
    return getDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> getLSMDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LSMDeposits",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> getLSMDepositsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> getLSMDepositsMethod;
    if ((getLSMDepositsMethod = QueryGrpc.getLSMDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLSMDepositsMethod = QueryGrpc.getLSMDepositsMethod) == null) {
          QueryGrpc.getLSMDepositsMethod = getLSMDepositsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LSMDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LSMDeposits"))
              .build();
        }
      }
    }
    return getLSMDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> getUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unbondings",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> getUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> getUnbondingsMethod;
    if ((getUnbondingsMethod = QueryGrpc.getUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingsMethod = QueryGrpc.getUnbondingsMethod) == null) {
          QueryGrpc.getUnbondingsMethod = getUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Unbondings"))
              .build();
        }
      }
    }
    return getUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> getUnbondingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unbonding",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> getUnbondingMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> getUnbondingMethod;
    if ((getUnbondingMethod = QueryGrpc.getUnbondingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingMethod = QueryGrpc.getUnbondingMethod) == null) {
          QueryGrpc.getUnbondingMethod = getUnbondingMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unbonding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Unbonding"))
              .build();
        }
      }
    }
    return getUnbondingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> getUserUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserUnbondings",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> getUserUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> getUserUnbondingsMethod;
    if ((getUserUnbondingsMethod = QueryGrpc.getUserUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserUnbondingsMethod = QueryGrpc.getUserUnbondingsMethod) == null) {
          QueryGrpc.getUserUnbondingsMethod = getUserUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserUnbondings"))
              .build();
        }
      }
    }
    return getUserUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> getValidatorUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorUnbondings",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> getValidatorUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> getValidatorUnbondingsMethod;
    if ((getValidatorUnbondingsMethod = QueryGrpc.getValidatorUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorUnbondingsMethod = QueryGrpc.getValidatorUnbondingsMethod) == null) {
          QueryGrpc.getValidatorUnbondingsMethod = getValidatorUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorUnbondings"))
              .build();
        }
      }
    }
    return getValidatorUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> getDepositAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositAccountBalance",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> getDepositAccountBalanceMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> getDepositAccountBalanceMethod;
    if ((getDepositAccountBalanceMethod = QueryGrpc.getDepositAccountBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositAccountBalanceMethod = QueryGrpc.getDepositAccountBalanceMethod) == null) {
          QueryGrpc.getDepositAccountBalanceMethod = getDepositAccountBalanceMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositAccountBalance"))
              .build();
        }
      }
    }
    return getDepositAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest.class,
      responseType = com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest, com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
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
     * Queries the parameters of the module.
     * </pre>
     */
    default void params(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a HostChain by id.
     * </pre>
     */
    default void hostChain(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostChainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries for all the HostChains.
     * </pre>
     */
    default void hostChains(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostChainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    default void deposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    default void lSMDeposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLSMDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries all unbondings for a host chain.
     * </pre>
     */
    default void unbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries an unbonding for a host chain.
     * </pre>
     */
    default void unbonding(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries all unbondings for a delegator address.
     * </pre>
     */
    default void userUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries all validator unbondings for a host chain.
     * </pre>
     */
    default void validatorUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries for a host chain deposit account balance.
     * </pre>
     */
    default void depositAccountBalance(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositAccountBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries for a host chain exchange rate between the host token and the stk token.
     * </pre>
     */
    default void exchangeRate(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public void params(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a HostChain by id.
     * </pre>
     */
    public void hostChain(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for all the HostChains.
     * </pre>
     */
    public void hostChains(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostChainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public void deposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public void lSMDeposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLSMDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries all unbondings for a host chain.
     * </pre>
     */
    public void unbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries an unbonding for a host chain.
     * </pre>
     */
    public void unbonding(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries all unbondings for a delegator address.
     * </pre>
     */
    public void userUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries all validator unbondings for a host chain.
     * </pre>
     */
    public void validatorUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for a host chain deposit account balance.
     * </pre>
     */
    public void depositAccountBalance(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for a host chain exchange rate between the host token and the stk token.
     * </pre>
     */
    public void exchangeRate(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse params(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a HostChain by id.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse hostChain(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostChainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for all the HostChains.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse hostChains(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostChainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse deposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse lSMDeposits(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLSMDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries all unbondings for a host chain.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse unbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries an unbonding for a host chain.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse unbonding(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries all unbondings for a delegator address.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse userUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries all validator unbondings for a host chain.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse validatorUnbondings(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for a host chain deposit account balance.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse depositAccountBalance(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for a host chain exchange rate between the host token and the stk token.
     * </pre>
     */
    public com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse exchangeRate(com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
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
     * Queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse> params(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a HostChain by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse> hostChain(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostChainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for all the HostChains.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse> hostChains(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostChainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse> deposits(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for all the deposits for a host chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse> lSMDeposits(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLSMDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries all unbondings for a host chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse> unbondings(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries an unbonding for a host chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse> unbonding(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries all unbondings for a delegator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse> userUnbondings(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries all validator unbondings for a host chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse> validatorUnbondings(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for a host chain deposit account balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse> depositAccountBalance(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for a host chain exchange rate between the host token and the stk token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse> exchangeRate(
        com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_HOST_CHAIN = 1;
  private static final int METHODID_HOST_CHAINS = 2;
  private static final int METHODID_DEPOSITS = 3;
  private static final int METHODID_LSMDEPOSITS = 4;
  private static final int METHODID_UNBONDINGS = 5;
  private static final int METHODID_UNBONDING = 6;
  private static final int METHODID_USER_UNBONDINGS = 7;
  private static final int METHODID_VALIDATOR_UNBONDINGS = 8;
  private static final int METHODID_DEPOSIT_ACCOUNT_BALANCE = 9;
  private static final int METHODID_EXCHANGE_RATE = 10;

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
          serviceImpl.params((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_HOST_CHAIN:
          serviceImpl.hostChain((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse>) responseObserver);
          break;
        case METHODID_HOST_CHAINS:
          serviceImpl.hostChains((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse>) responseObserver);
          break;
        case METHODID_DEPOSITS:
          serviceImpl.deposits((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_LSMDEPOSITS:
          serviceImpl.lSMDeposits((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse>) responseObserver);
          break;
        case METHODID_UNBONDINGS:
          serviceImpl.unbondings((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse>) responseObserver);
          break;
        case METHODID_UNBONDING:
          serviceImpl.unbonding((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse>) responseObserver);
          break;
        case METHODID_USER_UNBONDINGS:
          serviceImpl.userUnbondings((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_UNBONDINGS:
          serviceImpl.validatorUnbondings((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_ACCOUNT_BALANCE:
          serviceImpl.depositAccountBalance((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE:
          serviceImpl.exchangeRate((com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse>) responseObserver);
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
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getHostChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainResponse>(
                service, METHODID_HOST_CHAIN)))
        .addMethod(
          getHostChainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryHostChainsResponse>(
                service, METHODID_HOST_CHAINS)))
        .addMethod(
          getDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositsResponse>(
                service, METHODID_DEPOSITS)))
        .addMethod(
          getLSMDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryLSMDepositsResponse>(
                service, METHODID_LSMDEPOSITS)))
        .addMethod(
          getUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingsResponse>(
                service, METHODID_UNBONDINGS)))
        .addMethod(
          getUnbondingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUnbondingResponse>(
                service, METHODID_UNBONDING)))
        .addMethod(
          getUserUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryUserUnbondingsResponse>(
                service, METHODID_USER_UNBONDINGS)))
        .addMethod(
          getValidatorUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryValidatorUnbondingResponse>(
                service, METHODID_VALIDATOR_UNBONDINGS)))
        .addMethod(
          getDepositAccountBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryDepositAccountBalanceResponse>(
                service, METHODID_DEPOSIT_ACCOUNT_BALANCE)))
        .addMethod(
          getExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateRequest,
              com.pstake.liquidstakeibc.v1beta1.QueryProto.QueryExchangeRateResponse>(
                service, METHODID_EXCHANGE_RATE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.liquidstakeibc.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getHostChainMethod())
              .addMethod(getHostChainsMethod())
              .addMethod(getDepositsMethod())
              .addMethod(getLSMDepositsMethod())
              .addMethod(getUnbondingsMethod())
              .addMethod(getUnbondingMethod())
              .addMethod(getUserUnbondingsMethod())
              .addMethod(getValidatorUnbondingsMethod())
              .addMethod(getDepositAccountBalanceMethod())
              .addMethod(getExchangeRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
