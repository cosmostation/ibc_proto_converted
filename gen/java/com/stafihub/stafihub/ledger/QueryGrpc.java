package com.stafihub.stafihub.ledger;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: stafihub/ledger/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stafihub.stafihub.ledger.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> getGetExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeRate",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> getGetExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> getGetExchangeRateMethod;
    if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetExchangeRateMethod = QueryGrpc.getGetExchangeRateMethod) == null) {
          QueryGrpc.getGetExchangeRateMethod = getGetExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetExchangeRate"))
              .build();
        }
      }
    }
    return getGetExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> getExchangeRateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRateAll",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> getExchangeRateAllMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest, com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> getExchangeRateAllMethod;
    if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateAllMethod = QueryGrpc.getExchangeRateAllMethod) == null) {
          QueryGrpc.getExchangeRateAllMethod = getExchangeRateAllMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest, com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRateAll"))
              .build();
        }
      }
    }
    return getExchangeRateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraExchangeRate",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> getGetEraExchangeRateMethod;
    if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraExchangeRateMethod = QueryGrpc.getGetEraExchangeRateMethod) == null) {
          QueryGrpc.getGetEraExchangeRateMethod = getGetEraExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraExchangeRate"))
              .build();
        }
      }
    }
    return getGetEraExchangeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EraExchangeRatesByDenom",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest, com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> getEraExchangeRatesByDenomMethod;
    if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEraExchangeRatesByDenomMethod = QueryGrpc.getEraExchangeRatesByDenomMethod) == null) {
          QueryGrpc.getEraExchangeRatesByDenomMethod = getEraExchangeRatesByDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest, com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EraExchangeRatesByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EraExchangeRatesByDenom"))
              .build();
        }
      }
    }
    return getEraExchangeRatesByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondedPoolsByDenom",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest, com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> getBondedPoolsByDenomMethod;
    if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondedPoolsByDenomMethod = QueryGrpc.getBondedPoolsByDenomMethod) == null) {
          QueryGrpc.getBondedPoolsByDenomMethod = getBondedPoolsByDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest, com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondedPoolsByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondedPoolsByDenom"))
              .build();
        }
      }
    }
    return getBondedPoolsByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> getGetPoolDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPoolDetail",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> getGetPoolDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> getGetPoolDetailMethod;
    if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPoolDetailMethod = QueryGrpc.getGetPoolDetailMethod) == null) {
          QueryGrpc.getGetPoolDetailMethod = getGetPoolDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPoolDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPoolDetail"))
              .build();
        }
      }
    }
    return getGetPoolDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> getGetChainEraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainEra",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> getGetChainEraMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> getGetChainEraMethod;
    if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetChainEraMethod = QueryGrpc.getGetChainEraMethod) == null) {
          QueryGrpc.getGetChainEraMethod = getGetChainEraMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainEra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetChainEra"))
              .build();
        }
      }
    }
    return getGetChainEraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentEraSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> getGetCurrentEraSnapshotMethod;
    if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetCurrentEraSnapshotMethod = QueryGrpc.getGetCurrentEraSnapshotMethod) == null) {
          QueryGrpc.getGetCurrentEraSnapshotMethod = getGetCurrentEraSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetCurrentEraSnapshot"))
              .build();
        }
      }
    }
    return getGetCurrentEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtocolFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> getGetProtocolFeeReceiverMethod;
    if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtocolFeeReceiverMethod = QueryGrpc.getGetProtocolFeeReceiverMethod) == null) {
          QueryGrpc.getGetProtocolFeeReceiverMethod = getGetProtocolFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtocolFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtocolFeeReceiver"))
              .build();
        }
      }
    }
    return getGetProtocolFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStakingRewardCommission",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> getGetStakingRewardCommissionMethod;
    if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetStakingRewardCommissionMethod = QueryGrpc.getGetStakingRewardCommissionMethod) == null) {
          QueryGrpc.getGetStakingRewardCommissionMethod = getGetStakingRewardCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStakingRewardCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetStakingRewardCommission"))
              .build();
        }
      }
    }
    return getGetStakingRewardCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondRelayFee",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> getGetUnbondRelayFeeMethod;
    if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondRelayFeeMethod = QueryGrpc.getGetUnbondRelayFeeMethod) == null) {
          QueryGrpc.getGetUnbondRelayFeeMethod = getGetUnbondRelayFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondRelayFee"))
              .build();
        }
      }
    }
    return getGetUnbondRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnbondCommission",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> getGetUnbondCommissionMethod;
    if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetUnbondCommissionMethod = QueryGrpc.getGetUnbondCommissionMethod) == null) {
          QueryGrpc.getGetUnbondCommissionMethod = getGetUnbondCommissionMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnbondCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetUnbondCommission"))
              .build();
        }
      }
    }
    return getGetUnbondCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraUnbondLimit",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> getGetEraUnbondLimitMethod;
    if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraUnbondLimitMethod = QueryGrpc.getGetEraUnbondLimitMethod) == null) {
          QueryGrpc.getGetEraUnbondLimitMethod = getGetEraUnbondLimitMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraUnbondLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraUnbondLimit"))
              .build();
        }
      }
    }
    return getGetEraUnbondLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> getGetBondPipelineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondPipeline",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> getGetBondPipelineMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> getGetBondPipelineMethod;
    if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondPipelineMethod = QueryGrpc.getGetBondPipelineMethod) == null) {
          QueryGrpc.getGetBondPipelineMethod = getGetBondPipelineMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondPipeline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondPipeline"))
              .build();
        }
      }
    }
    return getGetBondPipelineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEraSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> getGetEraSnapshotMethod;
    if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEraSnapshotMethod = QueryGrpc.getGetEraSnapshotMethod) == null) {
          QueryGrpc.getGetEraSnapshotMethod = getGetEraSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEraSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEraSnapshot"))
              .build();
        }
      }
    }
    return getGetEraSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> getGetSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSnapshot",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> getGetSnapshotMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> getGetSnapshotMethod;
    if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSnapshotMethod = QueryGrpc.getGetSnapshotMethod) == null) {
          QueryGrpc.getGetSnapshotMethod = getGetSnapshotMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSnapshot"))
              .build();
        }
      }
    }
    return getGetSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTotalExpectedActive",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> getGetTotalExpectedActiveMethod;
    if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetTotalExpectedActiveMethod = QueryGrpc.getGetTotalExpectedActiveMethod) == null) {
          QueryGrpc.getGetTotalExpectedActiveMethod = getGetTotalExpectedActiveMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTotalExpectedActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetTotalExpectedActive"))
              .build();
        }
      }
    }
    return getGetTotalExpectedActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> getGetBondRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondRecord",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> getGetBondRecordMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> getGetBondRecordMethod;
    if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetBondRecordMethod = QueryGrpc.getGetBondRecordMethod) == null) {
          QueryGrpc.getGetBondRecordMethod = getGetBondRecordMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBondRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetBondRecord"))
              .build();
        }
      }
    }
    return getGetBondRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> getGetSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSignature",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> getGetSignatureMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> getGetSignatureMethod;
    if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetSignatureMethod = QueryGrpc.getGetSignatureMethod) == null) {
          QueryGrpc.getGetSignatureMethod = getGetSignatureMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetSignature"))
              .build();
        }
      }
    }
    return getGetSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> getGetRParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRParams",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> getGetRParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> getGetRParamsMethod;
    if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetRParamsMethod = QueryGrpc.getGetRParamsMethod) == null) {
          QueryGrpc.getGetRParamsMethod = getGetRParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest, com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetRParams"))
              .build();
        }
      }
    }
    return getGetRParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalProtocolFee",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest, com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> getTotalProtocolFeeMethod;
    if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalProtocolFeeMethod = QueryGrpc.getTotalProtocolFeeMethod) == null) {
          QueryGrpc.getTotalProtocolFeeMethod = getTotalProtocolFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest, com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalProtocolFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalProtocolFee"))
              .build();
        }
      }
    }
    return getTotalProtocolFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFeeReceiver",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;
    if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
          QueryGrpc.getRelayFeeReceiverMethod = getRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFeeReceiver"))
              .build();
        }
      }
    }
    return getRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> getUnbondSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondSwitch",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> getUnbondSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest, com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> getUnbondSwitchMethod;
    if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondSwitchMethod = QueryGrpc.getUnbondSwitchMethod) == null) {
          QueryGrpc.getUnbondSwitchMethod = getUnbondSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest, com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondSwitch"))
              .build();
        }
      }
    }
    return getUnbondSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondNextSequence",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest, com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> getPoolUnbondNextSequenceMethod;
    if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondNextSequenceMethod = QueryGrpc.getPoolUnbondNextSequenceMethod) == null) {
          QueryGrpc.getPoolUnbondNextSequenceMethod = getPoolUnbondNextSequenceMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest, com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondNextSequence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondNextSequence"))
              .build();
        }
      }
    }
    return getPoolUnbondNextSequenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolUnbondings",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest, com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> getPoolUnbondingsMethod;
    if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolUnbondingsMethod = QueryGrpc.getPoolUnbondingsMethod) == null) {
          QueryGrpc.getPoolUnbondingsMethod = getPoolUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest, com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolUnbondings"))
              .build();
        }
      }
    }
    return getPoolUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> getIcaPoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IcaPoolList",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> getIcaPoolListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest, com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> getIcaPoolListMethod;
    if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIcaPoolListMethod = QueryGrpc.getIcaPoolListMethod) == null) {
          QueryGrpc.getIcaPoolListMethod = getIcaPoolListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest, com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IcaPoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IcaPoolList"))
              .build();
        }
      }
    }
    return getIcaPoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterchainTxStatus",
      requestType = com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest.class,
      responseType = com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest,
      com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest, com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> getInterchainTxStatusMethod;
    if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInterchainTxStatusMethod = QueryGrpc.getInterchainTxStatusMethod) == null) {
          QueryGrpc.getInterchainTxStatusMethod = getInterchainTxStatusMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest, com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InterchainTxStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse.getDefaultInstance()))
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
    default void getExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    default void exchangeRateAll(com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    default void getEraExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraExchangeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    default void eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEraExchangeRatesByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    default void bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondedPoolsByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    default void getPoolDetail(com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPoolDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    default void getChainEra(com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainEraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    default void getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    default void getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtocolFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    default void getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStakingRewardCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    default void getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnbondRelayFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    default void getUnbondCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnbondCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    default void getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraUnbondLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    default void getBondPipeline(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBondPipelineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    default void getEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEraSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    default void getSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    default void getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTotalExpectedActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    default void getBondRecord(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBondRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    default void getSignature(com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    default void getRParams(com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    default void totalProtocolFee(com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalProtocolFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    default void relayFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    default void unbondSwitch(com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    default void poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolUnbondNextSequenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    default void poolUnbondings(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    default void icaPoolList(com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIcaPoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    default void interchainTxStatus(com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> responseObserver) {
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
    public void getExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public void exchangeRateAll(com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public void getEraExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public void eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public void bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public void getPoolDetail(com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public void getChainEra(com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public void getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public void getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public void getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public void getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public void getUnbondCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public void getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public void getBondPipeline(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public void getEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public void getSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public void getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public void getBondRecord(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public void getSignature(com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public void getRParams(com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public void totalProtocolFee(com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public void unbondSwitch(com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public void poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public void poolUnbondings(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public void icaPoolList(com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public void interchainTxStatus(com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> responseObserver) {
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
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse getExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse exchangeRateAll(com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse getEraExchangeRate(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraExchangeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse eraExchangeRatesByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEraExchangeRatesByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse bondedPoolsByDenom(com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondedPoolsByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse getPoolDetail(com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPoolDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse getChainEra(com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainEraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse getCurrentEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse getProtocolFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtocolFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse getStakingRewardCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStakingRewardCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse getUnbondRelayFee(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnbondRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse getUnbondCommission(com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnbondCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse getEraUnbondLimit(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraUnbondLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse getBondPipeline(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBondPipelineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse getEraSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEraSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse getSnapshot(com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse getTotalExpectedActive(com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTotalExpectedActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse getBondRecord(com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBondRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse getSignature(com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse getRParams(com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse totalProtocolFee(com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalProtocolFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse relayFeeReceiver(com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse unbondSwitch(com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse poolUnbondNextSequence(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolUnbondNextSequenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse poolUnbondings(com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse icaPoolList(com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIcaPoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse interchainTxStatus(com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse> getExchangeRate(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of exchangeRateAll items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse> exchangeRateAll(
        com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraExchangeRate items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse> getEraExchangeRate(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraExchangeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of eraExchangeRatesByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse> eraExchangeRatesByDenom(
        com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEraExchangeRatesByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of bondedPoolsByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse> bondedPoolsByDenom(
        com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondedPoolsByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getPoolDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse> getPoolDetail(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPoolDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getChainEra items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse> getChainEra(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainEraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCurrentEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse> getCurrentEraSnapshot(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse> getProtocolFeeReceiver(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtocolFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse> getStakingRewardCommission(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStakingRewardCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondFee items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse> getUnbondRelayFee(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnbondRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getUnbondCommission items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse> getUnbondCommission(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnbondCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraUnbondLimit items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse> getEraUnbondLimit(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraUnbondLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondPipeline items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse> getBondPipeline(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBondPipelineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getEraSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse> getEraSnapshot(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEraSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSnapshot items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse> getSnapshot(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSnapshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getTotalExpectedActive items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse> getTotalExpectedActive(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTotalExpectedActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getBondRecord items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse> getBondRecord(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBondRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getSignature items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse> getSignature(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of GetRParams items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse> getRParams(
        com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of TotalFeeList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse> totalProtocolFee(
        com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalProtocolFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse> relayFeeReceiver(
        com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UnbondSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse> unbondSwitch(
        com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondNextSequence items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse> poolUnbondNextSequence(
        com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolUnbondNextSequenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolUnbondings items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse> poolUnbondings(
        com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of IcaPoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse> icaPoolList(
        com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIcaPoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InterchainTxStatus items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse> interchainTxStatus(
        com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest request) {
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
          serviceImpl.getExchangeRate((com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE_ALL:
          serviceImpl.exchangeRateAll((com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_EXCHANGE_RATE:
          serviceImpl.getEraExchangeRate((com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse>) responseObserver);
          break;
        case METHODID_ERA_EXCHANGE_RATES_BY_DENOM:
          serviceImpl.eraExchangeRatesByDenom((com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse>) responseObserver);
          break;
        case METHODID_BONDED_POOLS_BY_DENOM:
          serviceImpl.bondedPoolsByDenom((com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse>) responseObserver);
          break;
        case METHODID_GET_POOL_DETAIL:
          serviceImpl.getPoolDetail((com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse>) responseObserver);
          break;
        case METHODID_GET_CHAIN_ERA:
          serviceImpl.getChainEra((com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_ERA_SNAPSHOT:
          serviceImpl.getCurrentEraSnapshot((com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_PROTOCOL_FEE_RECEIVER:
          serviceImpl.getProtocolFeeReceiver((com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_GET_STAKING_REWARD_COMMISSION:
          serviceImpl.getStakingRewardCommission((com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_RELAY_FEE:
          serviceImpl.getUnbondRelayFee((com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse>) responseObserver);
          break;
        case METHODID_GET_UNBOND_COMMISSION:
          serviceImpl.getUnbondCommission((com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_UNBOND_LIMIT:
          serviceImpl.getEraUnbondLimit((com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_PIPELINE:
          serviceImpl.getBondPipeline((com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse>) responseObserver);
          break;
        case METHODID_GET_ERA_SNAPSHOT:
          serviceImpl.getEraSnapshot((com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_SNAPSHOT:
          serviceImpl.getSnapshot((com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_EXPECTED_ACTIVE:
          serviceImpl.getTotalExpectedActive((com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse>) responseObserver);
          break;
        case METHODID_GET_BOND_RECORD:
          serviceImpl.getBondRecord((com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse>) responseObserver);
          break;
        case METHODID_GET_SIGNATURE:
          serviceImpl.getSignature((com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse>) responseObserver);
          break;
        case METHODID_GET_RPARAMS:
          serviceImpl.getRParams((com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_PROTOCOL_FEE:
          serviceImpl.totalProtocolFee((com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE_RECEIVER:
          serviceImpl.relayFeeReceiver((com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_UNBOND_SWITCH:
          serviceImpl.unbondSwitch((com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBOND_NEXT_SEQUENCE:
          serviceImpl.poolUnbondNextSequence((com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse>) responseObserver);
          break;
        case METHODID_POOL_UNBONDINGS:
          serviceImpl.poolUnbondings((com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ICA_POOL_LIST:
          serviceImpl.icaPoolList((com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse>) responseObserver);
          break;
        case METHODID_INTERCHAIN_TX_STATUS:
          serviceImpl.interchainTxStatus((com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse>) responseObserver);
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
              com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetExchangeRateResponse>(
                service, METHODID_GET_EXCHANGE_RATE)))
        .addMethod(
          getExchangeRateAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryExchangeRateAllResponse>(
                service, METHODID_EXCHANGE_RATE_ALL)))
        .addMethod(
          getGetEraExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraExchangeRateResponse>(
                service, METHODID_GET_ERA_EXCHANGE_RATE)))
        .addMethod(
          getEraExchangeRatesByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryEraExchangeRatesByDenomResponse>(
                service, METHODID_ERA_EXCHANGE_RATES_BY_DENOM)))
        .addMethod(
          getBondedPoolsByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryBondedPoolsByDenomResponse>(
                service, METHODID_BONDED_POOLS_BY_DENOM)))
        .addMethod(
          getGetPoolDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetPoolDetailResponse>(
                service, METHODID_GET_POOL_DETAIL)))
        .addMethod(
          getGetChainEraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetChainEraResponse>(
                service, METHODID_GET_CHAIN_ERA)))
        .addMethod(
          getGetCurrentEraSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetCurrentEraSnapshotResponse>(
                service, METHODID_GET_CURRENT_ERA_SNAPSHOT)))
        .addMethod(
          getGetProtocolFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetProtocolFeeReceiverResponse>(
                service, METHODID_GET_PROTOCOL_FEE_RECEIVER)))
        .addMethod(
          getGetStakingRewardCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetStakingRewardCommissionResponse>(
                service, METHODID_GET_STAKING_REWARD_COMMISSION)))
        .addMethod(
          getGetUnbondRelayFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondRelayFeeResponse>(
                service, METHODID_GET_UNBOND_RELAY_FEE)))
        .addMethod(
          getGetUnbondCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetUnbondCommissionResponse>(
                service, METHODID_GET_UNBOND_COMMISSION)))
        .addMethod(
          getGetEraUnbondLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraUnbondLimitResponse>(
                service, METHODID_GET_ERA_UNBOND_LIMIT)))
        .addMethod(
          getGetBondPipelineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetBondPipelineResponse>(
                service, METHODID_GET_BOND_PIPELINE)))
        .addMethod(
          getGetEraSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetEraSnapshotResponse>(
                service, METHODID_GET_ERA_SNAPSHOT)))
        .addMethod(
          getGetSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetSnapshotResponse>(
                service, METHODID_GET_SNAPSHOT)))
        .addMethod(
          getGetTotalExpectedActiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetTotalExpectedActiveResponse>(
                service, METHODID_GET_TOTAL_EXPECTED_ACTIVE)))
        .addMethod(
          getGetBondRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetBondRecordResponse>(
                service, METHODID_GET_BOND_RECORD)))
        .addMethod(
          getGetSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetSignatureResponse>(
                service, METHODID_GET_SIGNATURE)))
        .addMethod(
          getGetRParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryGetRParamsResponse>(
                service, METHODID_GET_RPARAMS)))
        .addMethod(
          getTotalProtocolFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryTotalProtocolFeeResponse>(
                service, METHODID_TOTAL_PROTOCOL_FEE)))
        .addMethod(
          getRelayFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryRelayFeeReceiverResponse>(
                service, METHODID_RELAY_FEE_RECEIVER)))
        .addMethod(
          getUnbondSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryUnbondSwitchResponse>(
                service, METHODID_UNBOND_SWITCH)))
        .addMethod(
          getPoolUnbondNextSequenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondNextSequenceResponse>(
                service, METHODID_POOL_UNBOND_NEXT_SEQUENCE)))
        .addMethod(
          getPoolUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryPoolUnbondingsResponse>(
                service, METHODID_POOL_UNBONDINGS)))
        .addMethod(
          getIcaPoolListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryIcaPoolListResponse>(
                service, METHODID_ICA_POOL_LIST)))
        .addMethod(
          getInterchainTxStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusRequest,
              com.stafihub.stafihub.ledger.QueryProto.QueryInterchainTxStatusResponse>(
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
