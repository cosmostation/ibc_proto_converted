package com.ixo.bonds.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/bonds/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ixo.bonds.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> getBondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bonds",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> getBondsMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> getBondsMethod;
    if ((getBondsMethod = QueryGrpc.getBondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondsMethod = QueryGrpc.getBondsMethod) == null) {
          QueryGrpc.getBondsMethod = getBondsMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bonds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bonds"))
              .build();
        }
      }
    }
    return getBondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> getBondsDetailedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondsDetailed",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> getBondsDetailedMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> getBondsDetailedMethod;
    if ((getBondsDetailedMethod = QueryGrpc.getBondsDetailedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondsDetailedMethod = QueryGrpc.getBondsDetailedMethod) == null) {
          QueryGrpc.getBondsDetailedMethod = getBondsDetailedMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondsDetailed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondsDetailed"))
              .build();
        }
      }
    }
    return getBondsDetailedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> getBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bond",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> getBondMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> getBondMethod;
    if ((getBondMethod = QueryGrpc.getBondMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondMethod = QueryGrpc.getBondMethod) == null) {
          QueryGrpc.getBondMethod = getBondMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bond"))
              .build();
        }
      }
    }
    return getBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> getBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Batch",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> getBatchMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> getBatchMethod;
    if ((getBatchMethod = QueryGrpc.getBatchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchMethod = QueryGrpc.getBatchMethod) == null) {
          QueryGrpc.getBatchMethod = getBatchMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Batch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Batch"))
              .build();
        }
      }
    }
    return getBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> getLastBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastBatch",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> getLastBatchMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest, com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> getLastBatchMethod;
    if ((getLastBatchMethod = QueryGrpc.getLastBatchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastBatchMethod = QueryGrpc.getLastBatchMethod) == null) {
          QueryGrpc.getLastBatchMethod = getLastBatchMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest, com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastBatch"))
              .build();
        }
      }
    }
    return getLastBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> getCurrentPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentPrice",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> getCurrentPriceMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> getCurrentPriceMethod;
    if ((getCurrentPriceMethod = QueryGrpc.getCurrentPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentPriceMethod = QueryGrpc.getCurrentPriceMethod) == null) {
          QueryGrpc.getCurrentPriceMethod = getCurrentPriceMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentPrice"))
              .build();
        }
      }
    }
    return getCurrentPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> getCurrentReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentReserve",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> getCurrentReserveMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> getCurrentReserveMethod;
    if ((getCurrentReserveMethod = QueryGrpc.getCurrentReserveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentReserveMethod = QueryGrpc.getCurrentReserveMethod) == null) {
          QueryGrpc.getCurrentReserveMethod = getCurrentReserveMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentReserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentReserve"))
              .build();
        }
      }
    }
    return getCurrentReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> getAvailableReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AvailableReserve",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> getAvailableReserveMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest, com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> getAvailableReserveMethod;
    if ((getAvailableReserveMethod = QueryGrpc.getAvailableReserveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAvailableReserveMethod = QueryGrpc.getAvailableReserveMethod) == null) {
          QueryGrpc.getAvailableReserveMethod = getAvailableReserveMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest, com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AvailableReserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AvailableReserve"))
              .build();
        }
      }
    }
    return getAvailableReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> getCustomPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CustomPrice",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> getCustomPriceMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> getCustomPriceMethod;
    if ((getCustomPriceMethod = QueryGrpc.getCustomPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCustomPriceMethod = QueryGrpc.getCustomPriceMethod) == null) {
          QueryGrpc.getCustomPriceMethod = getCustomPriceMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CustomPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CustomPrice"))
              .build();
        }
      }
    }
    return getCustomPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> getBuyPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyPrice",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> getBuyPriceMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> getBuyPriceMethod;
    if ((getBuyPriceMethod = QueryGrpc.getBuyPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyPriceMethod = QueryGrpc.getBuyPriceMethod) == null) {
          QueryGrpc.getBuyPriceMethod = getBuyPriceMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest, com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyPrice"))
              .build();
        }
      }
    }
    return getBuyPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest,
      com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> getSellReturnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellReturn",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest,
      com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> getSellReturnMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest, com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> getSellReturnMethod;
    if ((getSellReturnMethod = QueryGrpc.getSellReturnMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellReturnMethod = QueryGrpc.getSellReturnMethod) == null) {
          QueryGrpc.getSellReturnMethod = getSellReturnMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest, com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellReturn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellReturn"))
              .build();
        }
      }
    }
    return getSellReturnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest,
      com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> getSwapReturnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapReturn",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest,
      com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> getSwapReturnMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest, com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> getSwapReturnMethod;
    if ((getSwapReturnMethod = QueryGrpc.getSwapReturnMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapReturnMethod = QueryGrpc.getSwapReturnMethod) == null) {
          QueryGrpc.getSwapReturnMethod = getSwapReturnMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest, com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapReturn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SwapReturn"))
              .build();
        }
      }
    }
    return getSwapReturnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> getAlphaMaximumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlphaMaximums",
      requestType = com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest.class,
      responseType = com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest,
      com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> getAlphaMaximumsMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> getAlphaMaximumsMethod;
    if ((getAlphaMaximumsMethod = QueryGrpc.getAlphaMaximumsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAlphaMaximumsMethod = QueryGrpc.getAlphaMaximumsMethod) == null) {
          QueryGrpc.getAlphaMaximumsMethod = getAlphaMaximumsMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest, com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlphaMaximums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AlphaMaximums"))
              .build();
        }
      }
    }
    return getAlphaMaximumsMethod;
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
     * Bonds returns all existing bonds.
     * </pre>
     */
    default void bonds(com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BondsDetailed returns a list of all existing bonds with some details about
     * their current state.
     * </pre>
     */
    default void bondsDetailed(com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondsDetailedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the paramaters of x/bonds module.
     * </pre>
     */
    default void params(com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bond queries info of a specific bond.
     * </pre>
     */
    default void bond(com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch queries info of a specific bond's current batch.
     * </pre>
     */
    default void batch(com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastBatch queries info of a specific bond's last batch.
     * </pre>
     */
    default void lastBatch(com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentPrice queries the current price/s of a specific bond.
     * </pre>
     */
    default void currentPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentReserve queries the current balance/s of the reserve pool for a
     * specific bond.
     * </pre>
     */
    default void currentReserve(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentReserveMethod(), responseObserver);
    }

    /**
     * <pre>
     * AvailableReserve queries current available balance/s of the reserve pool
     * for a specific bond.
     * </pre>
     */
    default void availableReserve(com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAvailableReserveMethod(), responseObserver);
    }

    /**
     * <pre>
     * CustomPrice queries price/s of a specific bond at a specific supply.
     * </pre>
     */
    default void customPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCustomPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyPrice queries price/s of buying an amount of tokens from a specific
     * bond.
     * </pre>
     */
    default void buyPrice(com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellReturn queries return/s on selling an amount of tokens of a specific
     * bond.
     * </pre>
     */
    default void sellReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellReturnMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapReturn queries return/s on swapping an amount of tokens to another
     * token of a specific bond.
     * </pre>
     */
    default void swapReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapReturnMethod(), responseObserver);
    }

    /**
     * <pre>
     * AlphaMaximums queries alpha maximums for a specific augmented bonding
     * curve.
     * </pre>
     */
    default void alphaMaximums(com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlphaMaximumsMethod(), responseObserver);
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
     * Bonds returns all existing bonds.
     * </pre>
     */
    public void bonds(com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BondsDetailed returns a list of all existing bonds with some details about
     * their current state.
     * </pre>
     */
    public void bondsDetailed(com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondsDetailedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the paramaters of x/bonds module.
     * </pre>
     */
    public void params(com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bond queries info of a specific bond.
     * </pre>
     */
    public void bond(com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch queries info of a specific bond's current batch.
     * </pre>
     */
    public void batch(com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastBatch queries info of a specific bond's last batch.
     * </pre>
     */
    public void lastBatch(com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentPrice queries the current price/s of a specific bond.
     * </pre>
     */
    public void currentPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentReserve queries the current balance/s of the reserve pool for a
     * specific bond.
     * </pre>
     */
    public void currentReserve(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AvailableReserve queries current available balance/s of the reserve pool
     * for a specific bond.
     * </pre>
     */
    public void availableReserve(com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAvailableReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CustomPrice queries price/s of a specific bond at a specific supply.
     * </pre>
     */
    public void customPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCustomPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyPrice queries price/s of buying an amount of tokens from a specific
     * bond.
     * </pre>
     */
    public void buyPrice(com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellReturn queries return/s on selling an amount of tokens of a specific
     * bond.
     * </pre>
     */
    public void sellReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellReturnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapReturn queries return/s on swapping an amount of tokens to another
     * token of a specific bond.
     * </pre>
     */
    public void swapReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapReturnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AlphaMaximums queries alpha maximums for a specific augmented bonding
     * curve.
     * </pre>
     */
    public void alphaMaximums(com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlphaMaximumsMethod(), getCallOptions()), request, responseObserver);
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
     * Bonds returns all existing bonds.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse bonds(com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BondsDetailed returns a list of all existing bonds with some details about
     * their current state.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse bondsDetailed(com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondsDetailedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the paramaters of x/bonds module.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse params(com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bond queries info of a specific bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse bond(com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch queries info of a specific bond's current batch.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse batch(com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastBatch queries info of a specific bond's last batch.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse lastBatch(com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentPrice queries the current price/s of a specific bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse currentPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentReserve queries the current balance/s of the reserve pool for a
     * specific bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse currentReserve(com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentReserveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AvailableReserve queries current available balance/s of the reserve pool
     * for a specific bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse availableReserve(com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAvailableReserveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CustomPrice queries price/s of a specific bond at a specific supply.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse customPrice(com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCustomPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyPrice queries price/s of buying an amount of tokens from a specific
     * bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse buyPrice(com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellReturn queries return/s on selling an amount of tokens of a specific
     * bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse sellReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellReturnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapReturn queries return/s on swapping an amount of tokens to another
     * token of a specific bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse swapReturn(com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapReturnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AlphaMaximums queries alpha maximums for a specific augmented bonding
     * curve.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse alphaMaximums(com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlphaMaximumsMethod(), getCallOptions(), request);
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
     * Bonds returns all existing bonds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse> bonds(
        com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BondsDetailed returns a list of all existing bonds with some details about
     * their current state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse> bondsDetailed(
        com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondsDetailedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the paramaters of x/bonds module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse> params(
        com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bond queries info of a specific bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse> bond(
        com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch queries info of a specific bond's current batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse> batch(
        com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastBatch queries info of a specific bond's last batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse> lastBatch(
        com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentPrice queries the current price/s of a specific bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse> currentPrice(
        com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentReserve queries the current balance/s of the reserve pool for a
     * specific bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse> currentReserve(
        com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentReserveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AvailableReserve queries current available balance/s of the reserve pool
     * for a specific bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse> availableReserve(
        com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAvailableReserveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CustomPrice queries price/s of a specific bond at a specific supply.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse> customPrice(
        com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCustomPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyPrice queries price/s of buying an amount of tokens from a specific
     * bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse> buyPrice(
        com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellReturn queries return/s on selling an amount of tokens of a specific
     * bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse> sellReturn(
        com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellReturnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapReturn queries return/s on swapping an amount of tokens to another
     * token of a specific bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse> swapReturn(
        com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapReturnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AlphaMaximums queries alpha maximums for a specific augmented bonding
     * curve.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse> alphaMaximums(
        com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlphaMaximumsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BONDS = 0;
  private static final int METHODID_BONDS_DETAILED = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_BOND = 3;
  private static final int METHODID_BATCH = 4;
  private static final int METHODID_LAST_BATCH = 5;
  private static final int METHODID_CURRENT_PRICE = 6;
  private static final int METHODID_CURRENT_RESERVE = 7;
  private static final int METHODID_AVAILABLE_RESERVE = 8;
  private static final int METHODID_CUSTOM_PRICE = 9;
  private static final int METHODID_BUY_PRICE = 10;
  private static final int METHODID_SELL_RETURN = 11;
  private static final int METHODID_SWAP_RETURN = 12;
  private static final int METHODID_ALPHA_MAXIMUMS = 13;

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
        case METHODID_BONDS:
          serviceImpl.bonds((com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse>) responseObserver);
          break;
        case METHODID_BONDS_DETAILED:
          serviceImpl.bondsDetailed((com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BOND:
          serviceImpl.bond((com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse>) responseObserver);
          break;
        case METHODID_BATCH:
          serviceImpl.batch((com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse>) responseObserver);
          break;
        case METHODID_LAST_BATCH:
          serviceImpl.lastBatch((com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse>) responseObserver);
          break;
        case METHODID_CURRENT_PRICE:
          serviceImpl.currentPrice((com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse>) responseObserver);
          break;
        case METHODID_CURRENT_RESERVE:
          serviceImpl.currentReserve((com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse>) responseObserver);
          break;
        case METHODID_AVAILABLE_RESERVE:
          serviceImpl.availableReserve((com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse>) responseObserver);
          break;
        case METHODID_CUSTOM_PRICE:
          serviceImpl.customPrice((com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse>) responseObserver);
          break;
        case METHODID_BUY_PRICE:
          serviceImpl.buyPrice((com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse>) responseObserver);
          break;
        case METHODID_SELL_RETURN:
          serviceImpl.sellReturn((com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse>) responseObserver);
          break;
        case METHODID_SWAP_RETURN:
          serviceImpl.swapReturn((com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse>) responseObserver);
          break;
        case METHODID_ALPHA_MAXIMUMS:
          serviceImpl.alphaMaximums((com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse>) responseObserver);
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
          getBondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryBondsRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryBondsResponse>(
                service, METHODID_BONDS)))
        .addMethod(
          getBondsDetailedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryBondsDetailedResponse>(
                service, METHODID_BONDS_DETAILED)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryParamsRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryBondRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryBondResponse>(
                service, METHODID_BOND)))
        .addMethod(
          getBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryBatchRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryBatchResponse>(
                service, METHODID_BATCH)))
        .addMethod(
          getLastBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryLastBatchResponse>(
                service, METHODID_LAST_BATCH)))
        .addMethod(
          getCurrentPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryCurrentPriceResponse>(
                service, METHODID_CURRENT_PRICE)))
        .addMethod(
          getCurrentReserveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryCurrentReserveResponse>(
                service, METHODID_CURRENT_RESERVE)))
        .addMethod(
          getAvailableReserveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryAvailableReserveResponse>(
                service, METHODID_AVAILABLE_RESERVE)))
        .addMethod(
          getCustomPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryCustomPriceResponse>(
                service, METHODID_CUSTOM_PRICE)))
        .addMethod(
          getBuyPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryBuyPriceResponse>(
                service, METHODID_BUY_PRICE)))
        .addMethod(
          getSellReturnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnRequest,
              com.ixo.bonds.v1beta1.QueryProto.QuerySellReturnResponse>(
                service, METHODID_SELL_RETURN)))
        .addMethod(
          getSwapReturnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnRequest,
              com.ixo.bonds.v1beta1.QueryProto.QuerySwapReturnResponse>(
                service, METHODID_SWAP_RETURN)))
        .addMethod(
          getAlphaMaximumsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsRequest,
              com.ixo.bonds.v1beta1.QueryProto.QueryAlphaMaximumsResponse>(
                service, METHODID_ALPHA_MAXIMUMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.bonds.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getBondsMethod())
              .addMethod(getBondsDetailedMethod())
              .addMethod(getParamsMethod())
              .addMethod(getBondMethod())
              .addMethod(getBatchMethod())
              .addMethod(getLastBatchMethod())
              .addMethod(getCurrentPriceMethod())
              .addMethod(getCurrentReserveMethod())
              .addMethod(getAvailableReserveMethod())
              .addMethod(getCustomPriceMethod())
              .addMethod(getBuyPriceMethod())
              .addMethod(getSellReturnMethod())
              .addMethod(getSwapReturnMethod())
              .addMethod(getAlphaMaximumsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
