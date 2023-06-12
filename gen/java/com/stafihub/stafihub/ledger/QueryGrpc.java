package com.stafihub.stafihub.ledger;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/ledger/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.ledger.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> getGetExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeRate",
      requestType = com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> getGetExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest, com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> getGetExchangeRateMethod;
    if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
          QueryGrpc.getGetExchangeRateMethod = getGetExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest, com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetExchangeRate"))
              .build();
        }
      }
    }
    return getGetExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest,
      com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> getExchangeRateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRateAll",
      requestType = com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest,
      com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> getExchangeRateAllMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest, com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> getExchangeRateAllMethod;
    if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
          QueryGrpc.getExchangeRateAllMethod = getExchangeRateAllMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest, com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRateAll"))
              .build();
        }
      }
    }
    return getExchangeRateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraExchangeRate",
      requestType = com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest, com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;
    if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
          QueryGrpc.getGetEraExchangeRateMethod = getGetEraExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest, com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraExchangeRate"))
              .build();
        }
      }
    }
    return getGetEraExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest,
      com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EraExchangeRatesByDenom",
      requestType = com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest,
      com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest, com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;
    if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
          QueryGrpc.getEraExchangeRatesByDenomMethod = getEraExchangeRatesByDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest, com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EraExchangeRatesByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EraExchangeRatesByDenom"))
              .build();
        }
      }
    }
    return getEraExchangeRatesByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest,
      com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondedPoolsByDenom",
      requestType = com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest,
      com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest, com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;
    if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
          QueryGrpc.getBondedPoolsByDenomMethod = getBondedPoolsByDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest, com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondedPoolsByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondedPoolsByDenom"))
              .build();
        }
      }
    }
    return getBondedPoolsByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest,
      com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> getGetPoolDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPoolDetail",
      requestType = com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest,
      com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> getGetPoolDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest, com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> getGetPoolDetailMethod;
    if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
          QueryGrpc.getGetPoolDetailMethod = getGetPoolDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest, com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPoolDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPoolDetail"))
              .build();
        }
      }
    }
    return getGetPoolDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetChainEraRequest,
      com.stafihub.stafihub.ledger.QueryGetChainEraResponse> getGetChainEraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainEra",
      requestType = com.stafihub.stafihub.ledger.QueryGetChainEraRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetChainEraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetChainEraRequest,
      com.stafihub.stafihub.ledger.QueryGetChainEraResponse> getGetChainEraMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetChainEraRequest, com.stafihub.stafihub.ledger.QueryGetChainEraResponse> getGetChainEraMethod;
    if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
          QueryGrpc.getGetChainEraMethod = getGetChainEraMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetChainEraRequest, com.stafihub.stafihub.ledger.QueryGetChainEraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainEra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetChainEraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetChainEraResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetChainEra"))
              .build();
        }
      }
    }
    return getGetChainEraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentEraSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;
    if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
          QueryGrpc.getGetCurrentEraSnapshotMethod = getGetCurrentEraSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetCurrentEraSnapshot"))
              .build();
        }
      }
    }
    return getGetCurrentEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtocolFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;
    if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
          QueryGrpc.getGetProtocolFeeReceiverMethod = getGetProtocolFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtocolFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtocolFeeReceiver"))
              .build();
        }
      }
    }
    return getGetProtocolFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest,
      com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStakingRewardCommission",
      requestType = com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest,
      com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest, com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;
    if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
          QueryGrpc.getGetStakingRewardCommissionMethod = getGetStakingRewardCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest, com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStakingRewardCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetStakingRewardCommission"))
              .build();
        }
      }
    }
    return getGetStakingRewardCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest,
      com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondRelayFee",
      requestType = com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest,
      com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest, com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;
    if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
          QueryGrpc.getGetUnbondRelayFeeMethod = getGetUnbondRelayFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest, com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondRelayFee"))
              .build();
        }
      }
    }
    return getGetUnbondRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest,
      com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondCommission",
      requestType = com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest,
      com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest, com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;
    if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
          QueryGrpc.getGetUnbondCommissionMethod = getGetUnbondCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest, com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondCommission"))
              .build();
        }
      }
    }
    return getGetUnbondCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest,
      com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraUnbondLimit",
      requestType = com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest,
      com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest, com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;
    if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
          QueryGrpc.getGetEraUnbondLimitMethod = getGetEraUnbondLimitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest, com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraUnbondLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraUnbondLimit"))
              .build();
        }
      }
    }
    return getGetEraUnbondLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest,
      com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> getGetBondPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondPipeline",
      requestType = com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest,
      com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> getGetBondPipelineMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest, com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> getGetBondPipelineMethod;
    if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
          QueryGrpc.getGetBondPipelineMethod = getGetBondPipelineMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest, com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondPipeline"))
              .build();
        }
      }
    }
    return getGetBondPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;
    if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
          QueryGrpc.getGetEraSnapshotMethod = getGetEraSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraSnapshot"))
              .build();
        }
      }
    }
    return getGetEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> getGetSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryGetSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> getGetSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> getGetSnapshotMethod;
    if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
          QueryGrpc.getGetSnapshotMethod = getGetSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetSnapshotRequest, com.stafihub.stafihub.ledger.QueryGetSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSnapshot"))
              .build();
        }
      }
    }
    return getGetSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest,
      com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalExpectedActive",
      requestType = com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest,
      com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest, com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;
    if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
          QueryGrpc.getGetTotalExpectedActiveMethod = getGetTotalExpectedActiveMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest, com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalExpectedActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetTotalExpectedActive"))
              .build();
        }
      }
    }
    return getGetTotalExpectedActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondRecordRequest,
      com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> getGetBondRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondRecord",
      requestType = com.stafihub.stafihub.ledger.QueryGetBondRecordRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetBondRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondRecordRequest,
      com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> getGetBondRecordMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetBondRecordRequest, com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> getGetBondRecordMethod;
    if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
          QueryGrpc.getGetBondRecordMethod = getGetBondRecordMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetBondRecordRequest, com.stafihub.stafihub.ledger.QueryGetBondRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetBondRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetBondRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondRecord"))
              .build();
        }
      }
    }
    return getGetBondRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSignatureRequest,
      com.stafihub.stafihub.ledger.QueryGetSignatureResponse> getGetSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignature",
      requestType = com.stafihub.stafihub.ledger.QueryGetSignatureRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSignatureRequest,
      com.stafihub.stafihub.ledger.QueryGetSignatureResponse> getGetSignatureMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetSignatureRequest, com.stafihub.stafihub.ledger.QueryGetSignatureResponse> getGetSignatureMethod;
    if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
          QueryGrpc.getGetSignatureMethod = getGetSignatureMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetSignatureRequest, com.stafihub.stafihub.ledger.QueryGetSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSignature"))
              .build();
        }
      }
    }
    return getGetSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetRParamsRequest,
      com.stafihub.stafihub.ledger.QueryGetRParamsResponse> getGetRParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRParams",
      requestType = com.stafihub.stafihub.ledger.QueryGetRParamsRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryGetRParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetRParamsRequest,
      com.stafihub.stafihub.ledger.QueryGetRParamsResponse> getGetRParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryGetRParamsRequest, com.stafihub.stafihub.ledger.QueryGetRParamsResponse> getGetRParamsMethod;
    if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
          QueryGrpc.getGetRParamsMethod = getGetRParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryGetRParamsRequest, com.stafihub.stafihub.ledger.QueryGetRParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetRParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryGetRParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetRParams"))
              .build();
        }
      }
    }
    return getGetRParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest,
      com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalProtocolFee",
      requestType = com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest,
      com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest, com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;
    if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
          QueryGrpc.getTotalProtocolFeeMethod = getTotalProtocolFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest, com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalProtocolFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalProtocolFee"))
              .build();
        }
      }
    }
    return getTotalProtocolFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;
    if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
          QueryGrpc.getRelayFeeReceiverMethod = getRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFeeReceiver"))
              .build();
        }
      }
    }
    return getRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest,
      com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> getUnbondSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondSwitch",
      requestType = com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest,
      com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> getUnbondSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest, com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> getUnbondSwitchMethod;
    if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
          QueryGrpc.getUnbondSwitchMethod = getUnbondSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest, com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondSwitch"))
              .build();
        }
      }
    }
    return getUnbondSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest,
      com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondNextSequence",
      requestType = com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest,
      com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest, com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;
    if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
          QueryGrpc.getPoolUnbondNextSequenceMethod = getPoolUnbondNextSequenceMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest, com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondNextSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondNextSequence"))
              .build();
        }
      }
    }
    return getPoolUnbondNextSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest,
      com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondings",
      requestType = com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest,
      com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest, com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;
    if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
          QueryGrpc.getPoolUnbondingsMethod = getPoolUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest, com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondings"))
              .build();
        }
      }
    }
    return getPoolUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryIcaPoolListRequest,
      com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> getIcaPoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IcaPoolList",
      requestType = com.stafihub.stafihub.ledger.QueryIcaPoolListRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryIcaPoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryIcaPoolListRequest,
      com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> getIcaPoolListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryIcaPoolListRequest, com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> getIcaPoolListMethod;
    if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
          QueryGrpc.getIcaPoolListMethod = getIcaPoolListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryIcaPoolListRequest, com.stafihub.stafihub.ledger.QueryIcaPoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IcaPoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryIcaPoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryIcaPoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IcaPoolList"))
              .build();
        }
      }
    }
    return getIcaPoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest,
      com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterchainTxStatus",
      requestType = com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest,
      com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest, com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;
    if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
          QueryGrpc.getInterchainTxStatusMethod = getInterchainTxStatusMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest, com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InterchainTxStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InterchainTxStatus"))
              .build();
        }
      }
    }
    return getInterchainTxStatusMethod;
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    default void getExchangeRate(com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    default void exchangeRateAll(com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    default void getEraExchangeRate(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    default void eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEraExchangeRatesByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    default void bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondedPoolsByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    default void getPoolDetail(com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPoolDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    default void getChainEra(com.stafihub.stafihub.ledger.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetChainEraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainEraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    default void getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    default void getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtocolFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    default void getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStakingRewardCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    default void getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnbondRelayFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    default void getUnbondCommission(com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnbondCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    default void getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraUnbondLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    default void getBondPipeline(com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBondPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    default void getEraSnapshot(com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    default void getSnapshot(com.stafihub.stafihub.ledger.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    default void getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalExpectedActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    default void getBondRecord(com.stafihub.stafihub.ledger.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBondRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    default void getSignature(com.stafihub.stafihub.ledger.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSignatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    default void getRParams(com.stafihub.stafihub.ledger.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetRParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    default void totalProtocolFee(com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalProtocolFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    default void relayFeeReceiver(com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    default void unbondSwitch(com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    default void poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolUnbondNextSequenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    default void poolUnbondings(com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    default void icaPoolList(com.stafihub.stafihub.ledger.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIcaPoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    default void interchainTxStatus(com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInterchainTxStatusMethod(), responseObserver);
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public void getExchangeRate(com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public void exchangeRateAll(com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public void getEraExchangeRate(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public void eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public void bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public void getPoolDetail(com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public void getChainEra(com.stafihub.stafihub.ledger.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetChainEraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public void getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public void getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public void getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public void getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public void getUnbondCommission(com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public void getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public void getBondPipeline(com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public void getEraSnapshot(com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public void getSnapshot(com.stafihub.stafihub.ledger.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public void getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public void getBondRecord(com.stafihub.stafihub.ledger.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public void getSignature(com.stafihub.stafihub.ledger.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSignatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public void getRParams(com.stafihub.stafihub.ledger.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetRParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public void totalProtocolFee(com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public void unbondSwitch(com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public void poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public void poolUnbondings(com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public void icaPoolList(com.stafihub.stafihub.ledger.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public void interchainTxStatus(com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInterchainTxStatusMethod(), getCallOptions()), request, responseObserver);
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse getExchangeRate(com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse exchangeRateAll(com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse getEraExchangeRate(com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEraExchangeRatesByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondedPoolsByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse getPoolDetail(com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPoolDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetChainEraResponse getChainEra(com.stafihub.stafihub.ledger.QueryGetChainEraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainEraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtocolFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStakingRewardCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnbondRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse getUnbondCommission(com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnbondCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraUnbondLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse getBondPipeline(com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBondPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse getEraSnapshot(com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetSnapshotResponse getSnapshot(com.stafihub.stafihub.ledger.QueryGetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalExpectedActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetBondRecordResponse getBondRecord(com.stafihub.stafihub.ledger.QueryGetBondRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBondRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetSignatureResponse getSignature(com.stafihub.stafihub.ledger.QueryGetSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryGetRParamsResponse getRParams(com.stafihub.stafihub.ledger.QueryGetRParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse totalProtocolFee(com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalProtocolFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse relayFeeReceiver(com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse unbondSwitch(com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolUnbondNextSequenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse poolUnbondings(com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryIcaPoolListResponse icaPoolList(com.stafihub.stafihub.ledger.QueryIcaPoolListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIcaPoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse interchainTxStatus(com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInterchainTxStatusMethod(), getCallOptions(), request);
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
     * Queries a list of getExchangeRate items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse> getExchangeRate(
        com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse> exchangeRateAll(
        com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse> getEraExchangeRate(
        com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse> eraExchangeRatesByDenom(
        com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse> bondedPoolsByDenom(
        com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse> getPoolDetail(
        com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetChainEraResponse> getChainEra(
        com.stafihub.stafihub.ledger.QueryGetChainEraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse> getCurrentEraSnapshot(
        com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse> getProtocolFeeReceiver(
        com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse> getStakingRewardCommission(
        com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse> getUnbondRelayFee(
        com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse> getUnbondCommission(
        com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse> getEraUnbondLimit(
        com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse> getBondPipeline(
        com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse> getEraSnapshot(
        com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetSnapshotResponse> getSnapshot(
        com.stafihub.stafihub.ledger.QueryGetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse> getTotalExpectedActive(
        com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetBondRecordResponse> getBondRecord(
        com.stafihub.stafihub.ledger.QueryGetBondRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetSignatureResponse> getSignature(
        com.stafihub.stafihub.ledger.QueryGetSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryGetRParamsResponse> getRParams(
        com.stafihub.stafihub.ledger.QueryGetRParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse> totalProtocolFee(
        com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse> relayFeeReceiver(
        com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse> unbondSwitch(
        com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse> poolUnbondNextSequence(
        com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse> poolUnbondings(
        com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryIcaPoolListResponse> icaPoolList(
        com.stafihub.stafihub.ledger.QueryIcaPoolListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse> interchainTxStatus(
        com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInterchainTxStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EXCHANGE_RATE = 0;
  private static final int METHODID_EXCHANGE_RATE_ALL = 1;
  private static final int METHODID_GET_ERA_EXCHANGE_RATE = 2;
  private static final int METHODID_ERA_EXCHANGE_RATES_BY_DENOM = 3;
  private static final int METHODID_BONDED_POOLS_BY_DENOM = 4;
  private static final int METHODID_GET_POOL_DETAIL = 5;
  private static final int METHODID_GET_CHAIN_ERA = 6;
  private static final int METHODID_GET_CURRENT_ERA_SNAPSHOT = 7;
  private static final int METHODID_GET_PROTOCOL_FEE_RECEIVER = 8;
  private static final int METHODID_GET_STAKING_REWARD_COMMISSION = 9;
  private static final int METHODID_GET_UNBOND_RELAY_FEE = 10;
  private static final int METHODID_GET_UNBOND_COMMISSION = 11;
  private static final int METHODID_GET_ERA_UNBOND_LIMIT = 12;
  private static final int METHODID_GET_BOND_PIPELINE = 13;
  private static final int METHODID_GET_ERA_SNAPSHOT = 14;
  private static final int METHODID_GET_SNAPSHOT = 15;
  private static final int METHODID_GET_TOTAL_EXPECTED_ACTIVE = 16;
  private static final int METHODID_GET_BOND_RECORD = 17;
  private static final int METHODID_GET_SIGNATURE = 18;
  private static final int METHODID_GET_RPARAMS = 19;
  private static final int METHODID_TOTAL_PROTOCOL_FEE = 20;
  private static final int METHODID_RELAY_FEE_RECEIVER = 21;
  private static final int METHODID_UNBOND_SWITCH = 22;
  private static final int METHODID_POOL_UNBOND_NEXT_SEQUENCE = 23;
  private static final int METHODID_POOL_UNBONDINGS = 24;
  private static final int METHODID_ICA_POOL_LIST = 25;
  private static final int METHODID_INTERCHAIN_TX_STATUS = 26;

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
        case METHODID_GET_EXCHANGE_RATE:
          serviceImpl.getExchangeRate((com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE_ALL:
          serviceImpl.exchangeRateAll((com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_EXCHANGE_RATE:
          serviceImpl.getEraExchangeRate((com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse>) responseObserver);
          break;
        case METHODID_ERA_EXCHANGE_RATES_BY_DENOM:
          serviceImpl.eraExchangeRatesByDenom((com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse>) responseObserver);
          break;
        case METHODID_BONDED_POOLS_BY_DENOM:
          serviceImpl.bondedPoolsByDenom((com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse>) responseObserver);
          break;
        case METHODID_GET_POOL_DETAIL:
          serviceImpl.getPoolDetail((com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse>) responseObserver);
          break;
        case METHODID_GET_CHAIN_ERA:
          serviceImpl.getChainEra((com.stafihub.stafihub.ledger.QueryGetChainEraRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetChainEraResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_ERA_SNAPSHOT:
          serviceImpl.getCurrentEraSnapshot((com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_PROTOCOL_FEE_RECEIVER:
          serviceImpl.getProtocolFeeReceiver((com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_GET_STAKING_REWARD_COMMISSION:
          serviceImpl.getStakingRewardCommission((com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_RELAY_FEE:
          serviceImpl.getUnbondRelayFee((com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_COMMISSION:
          serviceImpl.getUnbondCommission((com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_UNBOND_LIMIT:
          serviceImpl.getEraUnbondLimit((com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_PIPELINE:
          serviceImpl.getBondPipeline((com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_SNAPSHOT:
          serviceImpl.getEraSnapshot((com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_SNAPSHOT:
          serviceImpl.getSnapshot((com.stafihub.stafihub.ledger.QueryGetSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_EXPECTED_ACTIVE:
          serviceImpl.getTotalExpectedActive((com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_RECORD:
          serviceImpl.getBondRecord((com.stafihub.stafihub.ledger.QueryGetBondRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetBondRecordResponse>) responseObserver);
          break;
        case METHODID_GET_SIGNATURE:
          serviceImpl.getSignature((com.stafihub.stafihub.ledger.QueryGetSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetSignatureResponse>) responseObserver);
          break;
        case METHODID_GET_RPARAMS:
          serviceImpl.getRParams((com.stafihub.stafihub.ledger.QueryGetRParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryGetRParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_PROTOCOL_FEE:
          serviceImpl.totalProtocolFee((com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE_RECEIVER:
          serviceImpl.relayFeeReceiver((com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_UNBOND_SWITCH:
          serviceImpl.unbondSwitch((com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBOND_NEXT_SEQUENCE:
          serviceImpl.poolUnbondNextSequence((com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBONDINGS:
          serviceImpl.poolUnbondings((com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ICA_POOL_LIST:
          serviceImpl.icaPoolList((com.stafihub.stafihub.ledger.QueryIcaPoolListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryIcaPoolListResponse>) responseObserver);
          break;
        case METHODID_INTERCHAIN_TX_STATUS:
          serviceImpl.interchainTxStatus((com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse>) responseObserver);
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
          getGetExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetExchangeRateRequest,
              com.stafihub.stafihub.ledger.QueryGetExchangeRateResponse>(
                service, METHODID_GET_EXCHANGE_RATE)))
        .addMethod(
          getExchangeRateAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryExchangeRateAllRequest,
              com.stafihub.stafihub.ledger.QueryExchangeRateAllResponse>(
                service, METHODID_EXCHANGE_RATE_ALL)))
        .addMethod(
          getGetEraExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest,
              com.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse>(
                service, METHODID_GET_ERA_EXCHANGE_RATE)))
        .addMethod(
          getEraExchangeRatesByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest,
              com.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse>(
                service, METHODID_ERA_EXCHANGE_RATES_BY_DENOM)))
        .addMethod(
          getBondedPoolsByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest,
              com.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse>(
                service, METHODID_BONDED_POOLS_BY_DENOM)))
        .addMethod(
          getGetPoolDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetPoolDetailRequest,
              com.stafihub.stafihub.ledger.QueryGetPoolDetailResponse>(
                service, METHODID_GET_POOL_DETAIL)))
        .addMethod(
          getGetChainEraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetChainEraRequest,
              com.stafihub.stafihub.ledger.QueryGetChainEraResponse>(
                service, METHODID_GET_CHAIN_ERA)))
        .addMethod(
          getGetCurrentEraSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse>(
                service, METHODID_GET_CURRENT_ERA_SNAPSHOT)))
        .addMethod(
          getGetProtocolFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest,
              com.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse>(
                service, METHODID_GET_PROTOCOL_FEE_RECEIVER)))
        .addMethod(
          getGetStakingRewardCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest,
              com.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse>(
                service, METHODID_GET_STAKING_REWARD_COMMISSION)))
        .addMethod(
          getGetUnbondRelayFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest,
              com.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse>(
                service, METHODID_GET_UNBOND_RELAY_FEE)))
        .addMethod(
          getGetUnbondCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest,
              com.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse>(
                service, METHODID_GET_UNBOND_COMMISSION)))
        .addMethod(
          getGetEraUnbondLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest,
              com.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse>(
                service, METHODID_GET_ERA_UNBOND_LIMIT)))
        .addMethod(
          getGetBondPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetBondPipelineRequest,
              com.stafihub.stafihub.ledger.QueryGetBondPipelineResponse>(
                service, METHODID_GET_BOND_PIPELINE)))
        .addMethod(
          getGetEraSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse>(
                service, METHODID_GET_ERA_SNAPSHOT)))
        .addMethod(
          getGetSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryGetSnapshotResponse>(
                service, METHODID_GET_SNAPSHOT)))
        .addMethod(
          getGetTotalExpectedActiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest,
              com.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse>(
                service, METHODID_GET_TOTAL_EXPECTED_ACTIVE)))
        .addMethod(
          getGetBondRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetBondRecordRequest,
              com.stafihub.stafihub.ledger.QueryGetBondRecordResponse>(
                service, METHODID_GET_BOND_RECORD)))
        .addMethod(
          getGetSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetSignatureRequest,
              com.stafihub.stafihub.ledger.QueryGetSignatureResponse>(
                service, METHODID_GET_SIGNATURE)))
        .addMethod(
          getGetRParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryGetRParamsRequest,
              com.stafihub.stafihub.ledger.QueryGetRParamsResponse>(
                service, METHODID_GET_RPARAMS)))
        .addMethod(
          getTotalProtocolFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest,
              com.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse>(
                service, METHODID_TOTAL_PROTOCOL_FEE)))
        .addMethod(
          getRelayFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest,
              com.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse>(
                service, METHODID_RELAY_FEE_RECEIVER)))
        .addMethod(
          getUnbondSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryUnbondSwitchRequest,
              com.stafihub.stafihub.ledger.QueryUnbondSwitchResponse>(
                service, METHODID_UNBOND_SWITCH)))
        .addMethod(
          getPoolUnbondNextSequenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest,
              com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse>(
                service, METHODID_POOL_UNBOND_NEXT_SEQUENCE)))
        .addMethod(
          getPoolUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest,
              com.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse>(
                service, METHODID_POOL_UNBONDINGS)))
        .addMethod(
          getIcaPoolListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryIcaPoolListRequest,
              com.stafihub.stafihub.ledger.QueryIcaPoolListResponse>(
                service, METHODID_ICA_POOL_LIST)))
        .addMethod(
          getInterchainTxStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest,
              com.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse>(
                service, METHODID_INTERCHAIN_TX_STATUS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.ledger.QueryProto.getDescriptor();
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
              .addMethod(getGetExchangeRateMethod())
              .addMethod(getExchangeRateAllMethod())
              .addMethod(getGetEraExchangeRateMethod())
              .addMethod(getEraExchangeRatesByDenomMethod())
              .addMethod(getBondedPoolsByDenomMethod())
              .addMethod(getGetPoolDetailMethod())
              .addMethod(getGetChainEraMethod())
              .addMethod(getGetCurrentEraSnapshotMethod())
              .addMethod(getGetProtocolFeeReceiverMethod())
              .addMethod(getGetStakingRewardCommissionMethod())
              .addMethod(getGetUnbondRelayFeeMethod())
              .addMethod(getGetUnbondCommissionMethod())
              .addMethod(getGetEraUnbondLimitMethod())
              .addMethod(getGetBondPipelineMethod())
              .addMethod(getGetEraSnapshotMethod())
              .addMethod(getGetSnapshotMethod())
              .addMethod(getGetTotalExpectedActiveMethod())
              .addMethod(getGetBondRecordMethod())
              .addMethod(getGetSignatureMethod())
              .addMethod(getGetRParamsMethod())
              .addMethod(getTotalProtocolFeeMethod())
              .addMethod(getRelayFeeReceiverMethod())
              .addMethod(getUnbondSwitchMethod())
              .addMethod(getPoolUnbondNextSequenceMethod())
              .addMethod(getPoolUnbondingsMethod())
              .addMethod(getIcaPoolListMethod())
              .addMethod(getInterchainTxStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
