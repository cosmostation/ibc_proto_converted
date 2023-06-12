package com.injective.exchange.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: injective/exchange/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.exchange.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeParamsRequest,
      com.injective.exchange.v1beta1.QueryExchangeParamsResponse> getQueryExchangeParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExchangeParams",
      requestType = com.injective.exchange.v1beta1.QueryExchangeParamsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryExchangeParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeParamsRequest,
      com.injective.exchange.v1beta1.QueryExchangeParamsResponse> getQueryExchangeParamsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeParamsRequest, com.injective.exchange.v1beta1.QueryExchangeParamsResponse> getQueryExchangeParamsMethod;
    if ((getQueryExchangeParamsMethod = QueryGrpc.getQueryExchangeParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExchangeParamsMethod = QueryGrpc.getQueryExchangeParamsMethod) == null) {
          QueryGrpc.getQueryExchangeParamsMethod = getQueryExchangeParamsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryExchangeParamsRequest, com.injective.exchange.v1beta1.QueryExchangeParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExchangeParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExchangeParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExchangeParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExchangeParams"))
              .build();
        }
      }
    }
    return getQueryExchangeParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest,
      com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountDeposits",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest,
      com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest, com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod;
    if ((getSubaccountDepositsMethod = QueryGrpc.getSubaccountDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountDepositsMethod = QueryGrpc.getSubaccountDepositsMethod) == null) {
          QueryGrpc.getSubaccountDepositsMethod = getSubaccountDepositsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest, com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountDeposits"))
              .build();
        }
      }
    }
    return getSubaccountDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositRequest,
      com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> getSubaccountDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountDeposit",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountDepositRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositRequest,
      com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> getSubaccountDepositMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountDepositRequest, com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> getSubaccountDepositMethod;
    if ((getSubaccountDepositMethod = QueryGrpc.getSubaccountDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountDepositMethod = QueryGrpc.getSubaccountDepositMethod) == null) {
          QueryGrpc.getSubaccountDepositMethod = getSubaccountDepositMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountDepositRequest, com.injective.exchange.v1beta1.QuerySubaccountDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountDeposit"))
              .build();
        }
      }
    }
    return getSubaccountDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeBalancesRequest,
      com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> getExchangeBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeBalances",
      requestType = com.injective.exchange.v1beta1.QueryExchangeBalancesRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryExchangeBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeBalancesRequest,
      com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> getExchangeBalancesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExchangeBalancesRequest, com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> getExchangeBalancesMethod;
    if ((getExchangeBalancesMethod = QueryGrpc.getExchangeBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeBalancesMethod = QueryGrpc.getExchangeBalancesMethod) == null) {
          QueryGrpc.getExchangeBalancesMethod = getExchangeBalancesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryExchangeBalancesRequest, com.injective.exchange.v1beta1.QueryExchangeBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExchangeBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExchangeBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeBalances"))
              .build();
        }
      }
    }
    return getExchangeBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumeRequest,
      com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> getAggregateVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVolume",
      requestType = com.injective.exchange.v1beta1.QueryAggregateVolumeRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAggregateVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumeRequest,
      com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> getAggregateVolumeMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumeRequest, com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> getAggregateVolumeMethod;
    if ((getAggregateVolumeMethod = QueryGrpc.getAggregateVolumeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVolumeMethod = QueryGrpc.getAggregateVolumeMethod) == null) {
          QueryGrpc.getAggregateVolumeMethod = getAggregateVolumeMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAggregateVolumeRequest, com.injective.exchange.v1beta1.QueryAggregateVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVolume"))
              .build();
        }
      }
    }
    return getAggregateVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumesRequest,
      com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> getAggregateVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVolumes",
      requestType = com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAggregateVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumesRequest,
      com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> getAggregateVolumesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateVolumesRequest, com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> getAggregateVolumesMethod;
    if ((getAggregateVolumesMethod = QueryGrpc.getAggregateVolumesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVolumesMethod = QueryGrpc.getAggregateVolumesMethod) == null) {
          QueryGrpc.getAggregateVolumesMethod = getAggregateVolumesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAggregateVolumesRequest, com.injective.exchange.v1beta1.QueryAggregateVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVolumes"))
              .build();
        }
      }
    }
    return getAggregateVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest,
      com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateMarketVolume",
      requestType = com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest,
      com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest, com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod;
    if ((getAggregateMarketVolumeMethod = QueryGrpc.getAggregateMarketVolumeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateMarketVolumeMethod = QueryGrpc.getAggregateMarketVolumeMethod) == null) {
          QueryGrpc.getAggregateMarketVolumeMethod = getAggregateMarketVolumeMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest, com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateMarketVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateMarketVolume"))
              .build();
        }
      }
    }
    return getAggregateMarketVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest,
      com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateMarketVolumes",
      requestType = com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest,
      com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest, com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod;
    if ((getAggregateMarketVolumesMethod = QueryGrpc.getAggregateMarketVolumesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateMarketVolumesMethod = QueryGrpc.getAggregateMarketVolumesMethod) == null) {
          QueryGrpc.getAggregateMarketVolumesMethod = getAggregateMarketVolumesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest, com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateMarketVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateMarketVolumes"))
              .build();
        }
      }
    }
    return getAggregateMarketVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalRequest,
      com.injective.exchange.v1beta1.QueryDenomDecimalResponse> getDenomDecimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomDecimal",
      requestType = com.injective.exchange.v1beta1.QueryDenomDecimalRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDenomDecimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalRequest,
      com.injective.exchange.v1beta1.QueryDenomDecimalResponse> getDenomDecimalMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalRequest, com.injective.exchange.v1beta1.QueryDenomDecimalResponse> getDenomDecimalMethod;
    if ((getDenomDecimalMethod = QueryGrpc.getDenomDecimalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomDecimalMethod = QueryGrpc.getDenomDecimalMethod) == null) {
          QueryGrpc.getDenomDecimalMethod = getDenomDecimalMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDenomDecimalRequest, com.injective.exchange.v1beta1.QueryDenomDecimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomDecimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDenomDecimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDenomDecimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomDecimal"))
              .build();
        }
      }
    }
    return getDenomDecimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalsRequest,
      com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> getDenomDecimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomDecimals",
      requestType = com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDenomDecimalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalsRequest,
      com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> getDenomDecimalsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDenomDecimalsRequest, com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> getDenomDecimalsMethod;
    if ((getDenomDecimalsMethod = QueryGrpc.getDenomDecimalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomDecimalsMethod = QueryGrpc.getDenomDecimalsMethod) == null) {
          QueryGrpc.getDenomDecimalsMethod = getDenomDecimalsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDenomDecimalsRequest, com.injective.exchange.v1beta1.QueryDenomDecimalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomDecimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDenomDecimalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomDecimals"))
              .build();
        }
      }
    }
    return getDenomDecimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketsRequest,
      com.injective.exchange.v1beta1.QuerySpotMarketsResponse> getSpotMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMarkets",
      requestType = com.injective.exchange.v1beta1.QuerySpotMarketsRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySpotMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketsRequest,
      com.injective.exchange.v1beta1.QuerySpotMarketsResponse> getSpotMarketsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketsRequest, com.injective.exchange.v1beta1.QuerySpotMarketsResponse> getSpotMarketsMethod;
    if ((getSpotMarketsMethod = QueryGrpc.getSpotMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMarketsMethod = QueryGrpc.getSpotMarketsMethod) == null) {
          QueryGrpc.getSpotMarketsMethod = getSpotMarketsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySpotMarketsRequest, com.injective.exchange.v1beta1.QuerySpotMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMarkets"))
              .build();
        }
      }
    }
    return getSpotMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketRequest,
      com.injective.exchange.v1beta1.QuerySpotMarketResponse> getSpotMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMarket",
      requestType = com.injective.exchange.v1beta1.QuerySpotMarketRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySpotMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketRequest,
      com.injective.exchange.v1beta1.QuerySpotMarketResponse> getSpotMarketMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMarketRequest, com.injective.exchange.v1beta1.QuerySpotMarketResponse> getSpotMarketMethod;
    if ((getSpotMarketMethod = QueryGrpc.getSpotMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMarketMethod = QueryGrpc.getSpotMarketMethod) == null) {
          QueryGrpc.getSpotMarketMethod = getSpotMarketMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySpotMarketRequest, com.injective.exchange.v1beta1.QuerySpotMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMarket"))
              .build();
        }
      }
    }
    return getSpotMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest,
      com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullSpotMarkets",
      requestType = com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest,
      com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest, com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod;
    if ((getFullSpotMarketsMethod = QueryGrpc.getFullSpotMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFullSpotMarketsMethod = QueryGrpc.getFullSpotMarketsMethod) == null) {
          QueryGrpc.getFullSpotMarketsMethod = getFullSpotMarketsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest, com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullSpotMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FullSpotMarkets"))
              .build();
        }
      }
    }
    return getFullSpotMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketRequest,
      com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> getFullSpotMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullSpotMarket",
      requestType = com.injective.exchange.v1beta1.QueryFullSpotMarketRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketRequest,
      com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> getFullSpotMarketMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFullSpotMarketRequest, com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> getFullSpotMarketMethod;
    if ((getFullSpotMarketMethod = QueryGrpc.getFullSpotMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFullSpotMarketMethod = QueryGrpc.getFullSpotMarketMethod) == null) {
          QueryGrpc.getFullSpotMarketMethod = getFullSpotMarketMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryFullSpotMarketRequest, com.injective.exchange.v1beta1.QueryFullSpotMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullSpotMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFullSpotMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFullSpotMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FullSpotMarket"))
              .build();
        }
      }
    }
    return getFullSpotMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrderbookRequest,
      com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> getSpotOrderbookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotOrderbook",
      requestType = com.injective.exchange.v1beta1.QuerySpotOrderbookRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySpotOrderbookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrderbookRequest,
      com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> getSpotOrderbookMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrderbookRequest, com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> getSpotOrderbookMethod;
    if ((getSpotOrderbookMethod = QueryGrpc.getSpotOrderbookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotOrderbookMethod = QueryGrpc.getSpotOrderbookMethod) == null) {
          QueryGrpc.getSpotOrderbookMethod = getSpotOrderbookMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySpotOrderbookRequest, com.injective.exchange.v1beta1.QuerySpotOrderbookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotOrderbook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotOrderbookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotOrderbookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotOrderbook"))
              .build();
        }
      }
    }
    return getSpotOrderbookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderSpotOrders",
      requestType = com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest, com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod;
    if ((getTraderSpotOrdersMethod = QueryGrpc.getTraderSpotOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderSpotOrdersMethod = QueryGrpc.getTraderSpotOrdersMethod) == null) {
          QueryGrpc.getTraderSpotOrdersMethod = getTraderSpotOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest, com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderSpotOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderSpotOrders"))
              .build();
        }
      }
    }
    return getTraderSpotOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAddressSpotOrders",
      requestType = com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest, com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod;
    if ((getAccountAddressSpotOrdersMethod = QueryGrpc.getAccountAddressSpotOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountAddressSpotOrdersMethod = QueryGrpc.getAccountAddressSpotOrdersMethod) == null) {
          QueryGrpc.getAccountAddressSpotOrdersMethod = getAccountAddressSpotOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest, com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAddressSpotOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountAddressSpotOrders"))
              .build();
        }
      }
    }
    return getAccountAddressSpotOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest,
      com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotOrdersByHashes",
      requestType = com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest,
      com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest, com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod;
    if ((getSpotOrdersByHashesMethod = QueryGrpc.getSpotOrdersByHashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotOrdersByHashesMethod = QueryGrpc.getSpotOrdersByHashesMethod) == null) {
          QueryGrpc.getSpotOrdersByHashesMethod = getSpotOrdersByHashesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest, com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotOrdersByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotOrdersByHashes"))
              .build();
        }
      }
    }
    return getSpotOrdersByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest,
      com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountOrders",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest,
      com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest, com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod;
    if ((getSubaccountOrdersMethod = QueryGrpc.getSubaccountOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountOrdersMethod = QueryGrpc.getSubaccountOrdersMethod) == null) {
          QueryGrpc.getSubaccountOrdersMethod = getSubaccountOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest, com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountOrders"))
              .build();
        }
      }
    }
    return getSubaccountOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderSpotTransientOrders",
      requestType = com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest, com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod;
    if ((getTraderSpotTransientOrdersMethod = QueryGrpc.getTraderSpotTransientOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderSpotTransientOrdersMethod = QueryGrpc.getTraderSpotTransientOrdersMethod) == null) {
          QueryGrpc.getTraderSpotTransientOrdersMethod = getTraderSpotTransientOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest, com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderSpotTransientOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderSpotTransientOrders"))
              .build();
        }
      }
    }
    return getTraderSpotTransientOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest,
      com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMidPriceAndTOB",
      requestType = com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest,
      com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest, com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod;
    if ((getSpotMidPriceAndTOBMethod = QueryGrpc.getSpotMidPriceAndTOBMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMidPriceAndTOBMethod = QueryGrpc.getSpotMidPriceAndTOBMethod) == null) {
          QueryGrpc.getSpotMidPriceAndTOBMethod = getSpotMidPriceAndTOBMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest, com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMidPriceAndTOB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMidPriceAndTOB"))
              .build();
        }
      }
    }
    return getSpotMidPriceAndTOBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMidPriceAndTOB",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest, com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod;
    if ((getDerivativeMidPriceAndTOBMethod = QueryGrpc.getDerivativeMidPriceAndTOBMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMidPriceAndTOBMethod = QueryGrpc.getDerivativeMidPriceAndTOBMethod) == null) {
          QueryGrpc.getDerivativeMidPriceAndTOBMethod = getDerivativeMidPriceAndTOBMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest, com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMidPriceAndTOB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMidPriceAndTOB"))
              .build();
        }
      }
    }
    return getDerivativeMidPriceAndTOBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest,
      com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeOrderbook",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest,
      com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest, com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod;
    if ((getDerivativeOrderbookMethod = QueryGrpc.getDerivativeOrderbookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeOrderbookMethod = QueryGrpc.getDerivativeOrderbookMethod) == null) {
          QueryGrpc.getDerivativeOrderbookMethod = getDerivativeOrderbookMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest, com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeOrderbook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeOrderbook"))
              .build();
        }
      }
    }
    return getDerivativeOrderbookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeOrders",
      requestType = com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod;
    if ((getTraderDerivativeOrdersMethod = QueryGrpc.getTraderDerivativeOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeOrdersMethod = QueryGrpc.getTraderDerivativeOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeOrdersMethod = getTraderDerivativeOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAddressDerivativeOrders",
      requestType = com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod;
    if ((getAccountAddressDerivativeOrdersMethod = QueryGrpc.getAccountAddressDerivativeOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountAddressDerivativeOrdersMethod = QueryGrpc.getAccountAddressDerivativeOrdersMethod) == null) {
          QueryGrpc.getAccountAddressDerivativeOrdersMethod = getAccountAddressDerivativeOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAddressDerivativeOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountAddressDerivativeOrders"))
              .build();
        }
      }
    }
    return getAccountAddressDerivativeOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest,
      com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeOrdersByHashes",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest,
      com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest, com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod;
    if ((getDerivativeOrdersByHashesMethod = QueryGrpc.getDerivativeOrdersByHashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeOrdersByHashesMethod = QueryGrpc.getDerivativeOrdersByHashesMethod) == null) {
          QueryGrpc.getDerivativeOrdersByHashesMethod = getDerivativeOrdersByHashesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest, com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeOrdersByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeOrdersByHashes"))
              .build();
        }
      }
    }
    return getDerivativeOrdersByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeTransientOrders",
      requestType = com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod;
    if ((getTraderDerivativeTransientOrdersMethod = QueryGrpc.getTraderDerivativeTransientOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeTransientOrdersMethod = QueryGrpc.getTraderDerivativeTransientOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeTransientOrdersMethod = getTraderDerivativeTransientOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeTransientOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeTransientOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeTransientOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarkets",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod;
    if ((getDerivativeMarketsMethod = QueryGrpc.getDerivativeMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketsMethod = QueryGrpc.getDerivativeMarketsMethod) == null) {
          QueryGrpc.getDerivativeMarketsMethod = getDerivativeMarketsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarkets"))
              .build();
        }
      }
    }
    return getDerivativeMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> getDerivativeMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarket",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeMarketRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> getDerivativeMarketMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> getDerivativeMarketMethod;
    if ((getDerivativeMarketMethod = QueryGrpc.getDerivativeMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketMethod = QueryGrpc.getDerivativeMarketMethod) == null) {
          QueryGrpc.getDerivativeMarketMethod = getDerivativeMarketMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeMarketRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarket"))
              .build();
        }
      }
    }
    return getDerivativeMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarketAddress",
      requestType = com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest,
      com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod;
    if ((getDerivativeMarketAddressMethod = QueryGrpc.getDerivativeMarketAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketAddressMethod = QueryGrpc.getDerivativeMarketAddressMethod) == null) {
          QueryGrpc.getDerivativeMarketAddressMethod = getDerivativeMarketAddressMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest, com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarketAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarketAddress"))
              .build();
        }
      }
    }
    return getDerivativeMarketAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest,
      com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountTradeNonce",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest,
      com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest, com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod;
    if ((getSubaccountTradeNonceMethod = QueryGrpc.getSubaccountTradeNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountTradeNonceMethod = QueryGrpc.getSubaccountTradeNonceMethod) == null) {
          QueryGrpc.getSubaccountTradeNonceMethod = getSubaccountTradeNonceMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest, com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountTradeNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountTradeNonce"))
              .build();
        }
      }
    }
    return getSubaccountTradeNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryModuleStateRequest,
      com.injective.exchange.v1beta1.QueryModuleStateResponse> getExchangeModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeModuleState",
      requestType = com.injective.exchange.v1beta1.QueryModuleStateRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryModuleStateRequest,
      com.injective.exchange.v1beta1.QueryModuleStateResponse> getExchangeModuleStateMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryModuleStateRequest, com.injective.exchange.v1beta1.QueryModuleStateResponse> getExchangeModuleStateMethod;
    if ((getExchangeModuleStateMethod = QueryGrpc.getExchangeModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeModuleStateMethod = QueryGrpc.getExchangeModuleStateMethod) == null) {
          QueryGrpc.getExchangeModuleStateMethod = getExchangeModuleStateMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryModuleStateRequest, com.injective.exchange.v1beta1.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeModuleState"))
              .build();
        }
      }
    }
    return getExchangeModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPositionsRequest,
      com.injective.exchange.v1beta1.QueryPositionsResponse> getPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Positions",
      requestType = com.injective.exchange.v1beta1.QueryPositionsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPositionsRequest,
      com.injective.exchange.v1beta1.QueryPositionsResponse> getPositionsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPositionsRequest, com.injective.exchange.v1beta1.QueryPositionsResponse> getPositionsMethod;
    if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
          QueryGrpc.getPositionsMethod = getPositionsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryPositionsRequest, com.injective.exchange.v1beta1.QueryPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Positions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Positions"))
              .build();
        }
      }
    }
    return getPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest,
      com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountPositions",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest,
      com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest, com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod;
    if ((getSubaccountPositionsMethod = QueryGrpc.getSubaccountPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountPositionsMethod = QueryGrpc.getSubaccountPositionsMethod) == null) {
          QueryGrpc.getSubaccountPositionsMethod = getSubaccountPositionsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest, com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountPositions"))
              .build();
        }
      }
    }
    return getSubaccountPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest,
      com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountPositionInMarket",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest,
      com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest, com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod;
    if ((getSubaccountPositionInMarketMethod = QueryGrpc.getSubaccountPositionInMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountPositionInMarketMethod = QueryGrpc.getSubaccountPositionInMarketMethod) == null) {
          QueryGrpc.getSubaccountPositionInMarketMethod = getSubaccountPositionInMarketMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest, com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountPositionInMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountPositionInMarket"))
              .build();
        }
      }
    }
    return getSubaccountPositionInMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest,
      com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountEffectivePositionInMarket",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest,
      com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest, com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod;
    if ((getSubaccountEffectivePositionInMarketMethod = QueryGrpc.getSubaccountEffectivePositionInMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountEffectivePositionInMarketMethod = QueryGrpc.getSubaccountEffectivePositionInMarketMethod) == null) {
          QueryGrpc.getSubaccountEffectivePositionInMarketMethod = getSubaccountEffectivePositionInMarketMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest, com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountEffectivePositionInMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountEffectivePositionInMarket"))
              .build();
        }
      }
    }
    return getSubaccountEffectivePositionInMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest,
      com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerpetualMarketInfo",
      requestType = com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest,
      com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest, com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod;
    if ((getPerpetualMarketInfoMethod = QueryGrpc.getPerpetualMarketInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPerpetualMarketInfoMethod = QueryGrpc.getPerpetualMarketInfoMethod) == null) {
          QueryGrpc.getPerpetualMarketInfoMethod = getPerpetualMarketInfoMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest, com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerpetualMarketInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PerpetualMarketInfo"))
              .build();
        }
      }
    }
    return getPerpetualMarketInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest,
      com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpiryFuturesMarketInfo",
      requestType = com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest,
      com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest, com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod;
    if ((getExpiryFuturesMarketInfoMethod = QueryGrpc.getExpiryFuturesMarketInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExpiryFuturesMarketInfoMethod = QueryGrpc.getExpiryFuturesMarketInfoMethod) == null) {
          QueryGrpc.getExpiryFuturesMarketInfoMethod = getExpiryFuturesMarketInfoMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest, com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExpiryFuturesMarketInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExpiryFuturesMarketInfo"))
              .build();
        }
      }
    }
    return getExpiryFuturesMarketInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest,
      com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerpetualMarketFunding",
      requestType = com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest,
      com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest, com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod;
    if ((getPerpetualMarketFundingMethod = QueryGrpc.getPerpetualMarketFundingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPerpetualMarketFundingMethod = QueryGrpc.getPerpetualMarketFundingMethod) == null) {
          QueryGrpc.getPerpetualMarketFundingMethod = getPerpetualMarketFundingMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest, com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerpetualMarketFunding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PerpetualMarketFunding"))
              .build();
        }
      }
    }
    return getPerpetualMarketFundingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest,
      com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountOrderMetadata",
      requestType = com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest.class,
      responseType = com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest,
      com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest, com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod;
    if ((getSubaccountOrderMetadataMethod = QueryGrpc.getSubaccountOrderMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountOrderMetadataMethod = QueryGrpc.getSubaccountOrderMetadataMethod) == null) {
          QueryGrpc.getSubaccountOrderMetadataMethod = getSubaccountOrderMetadataMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest, com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountOrderMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountOrderMetadata"))
              .build();
        }
      }
    }
    return getSubaccountOrderMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TradeRewardPoints",
      requestType = com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod;
    if ((getTradeRewardPointsMethod = QueryGrpc.getTradeRewardPointsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTradeRewardPointsMethod = QueryGrpc.getTradeRewardPointsMethod) == null) {
          QueryGrpc.getTradeRewardPointsMethod = getTradeRewardPointsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TradeRewardPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TradeRewardPoints"))
              .build();
        }
      }
    }
    return getTradeRewardPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingTradeRewardPoints",
      requestType = com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod;
    if ((getPendingTradeRewardPointsMethod = QueryGrpc.getPendingTradeRewardPointsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingTradeRewardPointsMethod = QueryGrpc.getPendingTradeRewardPointsMethod) == null) {
          QueryGrpc.getPendingTradeRewardPointsMethod = getPendingTradeRewardPointsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest, com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingTradeRewardPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingTradeRewardPoints"))
              .build();
        }
      }
    }
    return getPendingTradeRewardPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TradeRewardCampaign",
      requestType = com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest,
      com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest, com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod;
    if ((getTradeRewardCampaignMethod = QueryGrpc.getTradeRewardCampaignMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTradeRewardCampaignMethod = QueryGrpc.getTradeRewardCampaignMethod) == null) {
          QueryGrpc.getTradeRewardCampaignMethod = getTradeRewardCampaignMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest, com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TradeRewardCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TradeRewardCampaign"))
              .build();
        }
      }
    }
    return getTradeRewardCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountAccountInfo",
      requestType = com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest, com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod;
    if ((getFeeDiscountAccountInfoMethod = QueryGrpc.getFeeDiscountAccountInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountAccountInfoMethod = QueryGrpc.getFeeDiscountAccountInfoMethod) == null) {
          QueryGrpc.getFeeDiscountAccountInfoMethod = getFeeDiscountAccountInfoMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest, com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountAccountInfo"))
              .build();
        }
      }
    }
    return getFeeDiscountAccountInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountSchedule",
      requestType = com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest, com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod;
    if ((getFeeDiscountScheduleMethod = QueryGrpc.getFeeDiscountScheduleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountScheduleMethod = QueryGrpc.getFeeDiscountScheduleMethod) == null) {
          QueryGrpc.getFeeDiscountScheduleMethod = getFeeDiscountScheduleMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest, com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountSchedule"))
              .build();
        }
      }
    }
    return getFeeDiscountScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest,
      com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BalanceMismatches",
      requestType = com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest,
      com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest, com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod;
    if ((getBalanceMismatchesMethod = QueryGrpc.getBalanceMismatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMismatchesMethod = QueryGrpc.getBalanceMismatchesMethod) == null) {
          QueryGrpc.getBalanceMismatchesMethod = getBalanceMismatchesMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest, com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BalanceMismatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BalanceMismatches"))
              .build();
        }
      }
    }
    return getBalanceMismatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest,
      com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BalanceWithBalanceHolds",
      requestType = com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest,
      com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest, com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod;
    if ((getBalanceWithBalanceHoldsMethod = QueryGrpc.getBalanceWithBalanceHoldsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceWithBalanceHoldsMethod = QueryGrpc.getBalanceWithBalanceHoldsMethod) == null) {
          QueryGrpc.getBalanceWithBalanceHoldsMethod = getBalanceWithBalanceHoldsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest, com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BalanceWithBalanceHolds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BalanceWithBalanceHolds"))
              .build();
        }
      }
    }
    return getBalanceWithBalanceHoldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountTierStatistics",
      requestType = com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest,
      com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest, com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod;
    if ((getFeeDiscountTierStatisticsMethod = QueryGrpc.getFeeDiscountTierStatisticsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountTierStatisticsMethod = QueryGrpc.getFeeDiscountTierStatisticsMethod) == null) {
          QueryGrpc.getFeeDiscountTierStatisticsMethod = getFeeDiscountTierStatisticsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest, com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountTierStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountTierStatistics"))
              .build();
        }
      }
    }
    return getFeeDiscountTierStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.MitoVaultInfosRequest,
      com.injective.exchange.v1beta1.MitoVaultInfosResponse> getMitoVaultInfosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MitoVaultInfos",
      requestType = com.injective.exchange.v1beta1.MitoVaultInfosRequest.class,
      responseType = com.injective.exchange.v1beta1.MitoVaultInfosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.MitoVaultInfosRequest,
      com.injective.exchange.v1beta1.MitoVaultInfosResponse> getMitoVaultInfosMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.MitoVaultInfosRequest, com.injective.exchange.v1beta1.MitoVaultInfosResponse> getMitoVaultInfosMethod;
    if ((getMitoVaultInfosMethod = QueryGrpc.getMitoVaultInfosMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMitoVaultInfosMethod = QueryGrpc.getMitoVaultInfosMethod) == null) {
          QueryGrpc.getMitoVaultInfosMethod = getMitoVaultInfosMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.MitoVaultInfosRequest, com.injective.exchange.v1beta1.MitoVaultInfosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MitoVaultInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.MitoVaultInfosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.MitoVaultInfosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MitoVaultInfos"))
              .build();
        }
      }
    }
    return getMitoVaultInfosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest,
      com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryMarketIDFromVault",
      requestType = com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest,
      com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest, com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod;
    if ((getQueryMarketIDFromVaultMethod = QueryGrpc.getQueryMarketIDFromVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryMarketIDFromVaultMethod = QueryGrpc.getQueryMarketIDFromVaultMethod) == null) {
          QueryGrpc.getQueryMarketIDFromVaultMethod = getQueryMarketIDFromVaultMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest, com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryMarketIDFromVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryMarketIDFromVault"))
              .build();
        }
      }
    }
    return getQueryMarketIDFromVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest,
      com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalTradeRecords",
      requestType = com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest,
      com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest, com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod;
    if ((getHistoricalTradeRecordsMethod = QueryGrpc.getHistoricalTradeRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalTradeRecordsMethod = QueryGrpc.getHistoricalTradeRecordsMethod) == null) {
          QueryGrpc.getHistoricalTradeRecordsMethod = getHistoricalTradeRecordsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest, com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalTradeRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalTradeRecords"))
              .build();
        }
      }
    }
    return getHistoricalTradeRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest,
      com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsOptedOutOfRewards",
      requestType = com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest,
      com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest, com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod;
    if ((getIsOptedOutOfRewardsMethod = QueryGrpc.getIsOptedOutOfRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsOptedOutOfRewardsMethod = QueryGrpc.getIsOptedOutOfRewardsMethod) == null) {
          QueryGrpc.getIsOptedOutOfRewardsMethod = getIsOptedOutOfRewardsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest, com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsOptedOutOfRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsOptedOutOfRewards"))
              .build();
        }
      }
    }
    return getIsOptedOutOfRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest,
      com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptedOutOfRewardsAccounts",
      requestType = com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest,
      com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest, com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod;
    if ((getOptedOutOfRewardsAccountsMethod = QueryGrpc.getOptedOutOfRewardsAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOptedOutOfRewardsAccountsMethod = QueryGrpc.getOptedOutOfRewardsAccountsMethod) == null) {
          QueryGrpc.getOptedOutOfRewardsAccountsMethod = getOptedOutOfRewardsAccountsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest, com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptedOutOfRewardsAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OptedOutOfRewardsAccounts"))
              .build();
        }
      }
    }
    return getOptedOutOfRewardsAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketVolatilityRequest,
      com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> getMarketVolatilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketVolatility",
      requestType = com.injective.exchange.v1beta1.QueryMarketVolatilityRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryMarketVolatilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketVolatilityRequest,
      com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> getMarketVolatilityMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketVolatilityRequest, com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> getMarketVolatilityMethod;
    if ((getMarketVolatilityMethod = QueryGrpc.getMarketVolatilityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketVolatilityMethod = QueryGrpc.getMarketVolatilityMethod) == null) {
          QueryGrpc.getMarketVolatilityMethod = getMarketVolatilityMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryMarketVolatilityRequest, com.injective.exchange.v1beta1.QueryMarketVolatilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketVolatility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketVolatilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketVolatilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketVolatility"))
              .build();
        }
      }
    }
    return getMarketVolatilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBinaryMarketsRequest,
      com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BinaryOptionsMarkets",
      requestType = com.injective.exchange.v1beta1.QueryBinaryMarketsRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryBinaryMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBinaryMarketsRequest,
      com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryBinaryMarketsRequest, com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod;
    if ((getBinaryOptionsMarketsMethod = QueryGrpc.getBinaryOptionsMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBinaryOptionsMarketsMethod = QueryGrpc.getBinaryOptionsMarketsMethod) == null) {
          QueryGrpc.getBinaryOptionsMarketsMethod = getBinaryOptionsMarketsMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryBinaryMarketsRequest, com.injective.exchange.v1beta1.QueryBinaryMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BinaryOptionsMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBinaryMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryBinaryMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BinaryOptionsMarkets"))
              .build();
        }
      }
    }
    return getBinaryOptionsMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeConditionalOrders",
      requestType = com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest,
      com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod;
    if ((getTraderDerivativeConditionalOrdersMethod = QueryGrpc.getTraderDerivativeConditionalOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeConditionalOrdersMethod = QueryGrpc.getTraderDerivativeConditionalOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeConditionalOrdersMethod = getTraderDerivativeConditionalOrdersMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest, com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeConditionalOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeConditionalOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeConditionalOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest,
      com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketAtomicExecutionFeeMultiplier",
      requestType = com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest.class,
      responseType = com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest,
      com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod() {
    io.grpc.MethodDescriptor<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest, com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod;
    if ((getMarketAtomicExecutionFeeMultiplierMethod = QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketAtomicExecutionFeeMultiplierMethod = QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod) == null) {
          QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod = getMarketAtomicExecutionFeeMultiplierMethod =
              io.grpc.MethodDescriptor.<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest, com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketAtomicExecutionFeeMultiplier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketAtomicExecutionFeeMultiplier"))
              .build();
        }
      }
    }
    return getMarketAtomicExecutionFeeMultiplierMethod;
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
     * Retrieves exchange params
     * </pre>
     */
    default void queryExchangeParams(com.injective.exchange.v1beta1.QueryExchangeParamsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExchangeParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    default void subaccountDeposits(com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    default void subaccountDeposit(com.injective.exchange.v1beta1.QuerySubaccountDepositRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    default void exchangeBalances(com.injective.exchange.v1beta1.QueryExchangeBalancesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    default void aggregateVolume(com.injective.exchange.v1beta1.QueryAggregateVolumeRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    default void aggregateVolumes(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVolumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    default void aggregateMarketVolume(com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateMarketVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    default void aggregateMarketVolumes(com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateMarketVolumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    default void denomDecimal(com.injective.exchange.v1beta1.QueryDenomDecimalRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomDecimalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    default void denomDecimals(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomDecimalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    default void spotMarkets(com.injective.exchange.v1beta1.QuerySpotMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    default void spotMarket(com.injective.exchange.v1beta1.QuerySpotMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    default void fullSpotMarkets(com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullSpotMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    default void fullSpotMarket(com.injective.exchange.v1beta1.QueryFullSpotMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullSpotMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    default void spotOrderbook(com.injective.exchange.v1beta1.QuerySpotOrderbookRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotOrderbookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    default void traderSpotOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderSpotOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    default void accountAddressSpotOrders(com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountAddressSpotOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    default void spotOrdersByHashes(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotOrdersByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    default void subaccountOrders(com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    default void traderSpotTransientOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderSpotTransientOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    default void spotMidPriceAndTOB(com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMidPriceAndTOBMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    default void derivativeMidPriceAndTOB(com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMidPriceAndTOBMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    default void derivativeOrderbook(com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeOrderbookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    default void traderDerivativeOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    default void accountAddressDerivativeOrders(com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountAddressDerivativeOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    default void derivativeOrdersByHashes(com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeOrdersByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    default void traderDerivativeTransientOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeTransientOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    default void derivativeMarkets(com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    default void derivativeMarket(com.injective.exchange.v1beta1.QueryDerivativeMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    default void derivativeMarketAddress(com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    default void subaccountTradeNonce(com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountTradeNonceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    default void exchangeModuleState(com.injective.exchange.v1beta1.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeModuleStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    default void positions(com.injective.exchange.v1beta1.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    default void subaccountPositions(com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    default void subaccountPositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountPositionInMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    default void subaccountEffectivePositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountEffectivePositionInMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    default void perpetualMarketInfo(com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerpetualMarketInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    default void expiryFuturesMarketInfo(com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpiryFuturesMarketInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    default void perpetualMarketFunding(com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerpetualMarketFundingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    default void subaccountOrderMetadata(com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountOrderMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    default void tradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradeRewardPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    default void pendingTradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingTradeRewardPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    default void tradeRewardCampaign(com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradeRewardCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    default void feeDiscountAccountInfo(com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountAccountInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    default void feeDiscountSchedule(com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    default void balanceMismatches(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMismatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    default void balanceWithBalanceHolds(com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceWithBalanceHoldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    default void feeDiscountTierStatistics(com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountTierStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    default void mitoVaultInfos(com.injective.exchange.v1beta1.MitoVaultInfosRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.MitoVaultInfosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMitoVaultInfosMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount ID
     * </pre>
     */
    default void queryMarketIDFromVault(com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMarketIDFromVaultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    default void historicalTradeRecords(com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalTradeRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    default void isOptedOutOfRewards(com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsOptedOutOfRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    default void optedOutOfRewardsAccounts(com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptedOutOfRewardsAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    default void marketVolatility(com.injective.exchange.v1beta1.QueryMarketVolatilityRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketVolatilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    default void binaryOptionsMarkets(com.injective.exchange.v1beta1.QueryBinaryMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryOptionsMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    default void traderDerivativeConditionalOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeConditionalOrdersMethod(), responseObserver);
    }

    /**
     */
    default void marketAtomicExecutionFeeMultiplier(com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketAtomicExecutionFeeMultiplierMethod(), responseObserver);
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
     * Retrieves exchange params
     * </pre>
     */
    public void queryExchangeParams(com.injective.exchange.v1beta1.QueryExchangeParamsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExchangeParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public void subaccountDeposits(com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public void subaccountDeposit(com.injective.exchange.v1beta1.QuerySubaccountDepositRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public void exchangeBalances(com.injective.exchange.v1beta1.QueryExchangeBalancesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public void aggregateVolume(com.injective.exchange.v1beta1.QueryAggregateVolumeRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public void aggregateVolumes(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public void aggregateMarketVolume(com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateMarketVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public void aggregateMarketVolumes(com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateMarketVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public void denomDecimal(com.injective.exchange.v1beta1.QueryDenomDecimalRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomDecimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public void denomDecimals(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomDecimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public void spotMarkets(com.injective.exchange.v1beta1.QuerySpotMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public void spotMarket(com.injective.exchange.v1beta1.QuerySpotMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public void fullSpotMarkets(com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFullSpotMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public void fullSpotMarket(com.injective.exchange.v1beta1.QueryFullSpotMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFullSpotMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public void spotOrderbook(com.injective.exchange.v1beta1.QuerySpotOrderbookRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotOrderbookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public void traderSpotOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderSpotOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public void accountAddressSpotOrders(com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountAddressSpotOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public void spotOrdersByHashes(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotOrdersByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public void subaccountOrders(com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public void traderSpotTransientOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderSpotTransientOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public void spotMidPriceAndTOB(com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMidPriceAndTOBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public void derivativeMidPriceAndTOB(com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMidPriceAndTOBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public void derivativeOrderbook(com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeOrderbookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public void traderDerivativeOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public void accountAddressDerivativeOrders(com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountAddressDerivativeOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public void derivativeOrdersByHashes(com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeOrdersByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public void traderDerivativeTransientOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeTransientOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public void derivativeMarkets(com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public void derivativeMarket(com.injective.exchange.v1beta1.QueryDerivativeMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public void derivativeMarketAddress(com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public void subaccountTradeNonce(com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountTradeNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public void exchangeModuleState(com.injective.exchange.v1beta1.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public void positions(com.injective.exchange.v1beta1.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public void subaccountPositions(com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public void subaccountPositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountPositionInMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public void subaccountEffectivePositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountEffectivePositionInMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public void perpetualMarketInfo(com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerpetualMarketInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public void expiryFuturesMarketInfo(com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExpiryFuturesMarketInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public void perpetualMarketFunding(com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerpetualMarketFundingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public void subaccountOrderMetadata(com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountOrderMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public void tradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradeRewardPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public void pendingTradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingTradeRewardPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public void tradeRewardCampaign(com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradeRewardCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public void feeDiscountAccountInfo(com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public void feeDiscountSchedule(com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public void balanceMismatches(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMismatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public void balanceWithBalanceHolds(com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceWithBalanceHoldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public void feeDiscountTierStatistics(com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountTierStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public void mitoVaultInfos(com.injective.exchange.v1beta1.MitoVaultInfosRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.MitoVaultInfosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMitoVaultInfosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount ID
     * </pre>
     */
    public void queryMarketIDFromVault(com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMarketIDFromVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public void historicalTradeRecords(com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalTradeRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public void isOptedOutOfRewards(com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsOptedOutOfRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public void optedOutOfRewardsAccounts(com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptedOutOfRewardsAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public void marketVolatility(com.injective.exchange.v1beta1.QueryMarketVolatilityRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketVolatilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public void binaryOptionsMarkets(com.injective.exchange.v1beta1.QueryBinaryMarketsRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBinaryOptionsMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public void traderDerivativeConditionalOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeConditionalOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketAtomicExecutionFeeMultiplier(com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest request,
        io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions()), request, responseObserver);
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
     * Retrieves exchange params
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryExchangeParamsResponse queryExchangeParams(com.injective.exchange.v1beta1.QueryExchangeParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExchangeParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse subaccountDeposits(com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountDepositResponse subaccountDeposit(com.injective.exchange.v1beta1.QuerySubaccountDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryExchangeBalancesResponse exchangeBalances(com.injective.exchange.v1beta1.QueryExchangeBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAggregateVolumeResponse aggregateVolume(com.injective.exchange.v1beta1.QueryAggregateVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAggregateVolumesResponse aggregateVolumes(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVolumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse aggregateMarketVolume(com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateMarketVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse aggregateMarketVolumes(com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateMarketVolumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDenomDecimalResponse denomDecimal(com.injective.exchange.v1beta1.QueryDenomDecimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomDecimalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDenomDecimalsResponse denomDecimals(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomDecimalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySpotMarketsResponse spotMarkets(com.injective.exchange.v1beta1.QuerySpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySpotMarketResponse spotMarket(com.injective.exchange.v1beta1.QuerySpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse fullSpotMarkets(com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFullSpotMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryFullSpotMarketResponse fullSpotMarket(com.injective.exchange.v1beta1.QueryFullSpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFullSpotMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySpotOrderbookResponse spotOrderbook(com.injective.exchange.v1beta1.QuerySpotOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotOrderbookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse traderSpotOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderSpotOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse accountAddressSpotOrders(com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountAddressSpotOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse spotOrdersByHashes(com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotOrdersByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse subaccountOrders(com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse traderSpotTransientOrders(com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderSpotTransientOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse spotMidPriceAndTOB(com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMidPriceAndTOBMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse derivativeMidPriceAndTOB(com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMidPriceAndTOBMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse derivativeOrderbook(com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeOrderbookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse traderDerivativeOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse accountAddressDerivativeOrders(com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountAddressDerivativeOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse derivativeOrdersByHashes(com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeOrdersByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse traderDerivativeTransientOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeTransientOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse derivativeMarkets(com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeMarketResponse derivativeMarket(com.injective.exchange.v1beta1.QueryDerivativeMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse derivativeMarketAddress(com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse subaccountTradeNonce(com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountTradeNonceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryModuleStateResponse exchangeModuleState(com.injective.exchange.v1beta1.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeModuleStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryPositionsResponse positions(com.injective.exchange.v1beta1.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse subaccountPositions(com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse subaccountPositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountPositionInMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse subaccountEffectivePositionInMarket(com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountEffectivePositionInMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse perpetualMarketInfo(com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerpetualMarketInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse expiryFuturesMarketInfo(com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExpiryFuturesMarketInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse perpetualMarketFunding(com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerpetualMarketFundingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse subaccountOrderMetadata(com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountOrderMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse tradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradeRewardPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse pendingTradeRewardPoints(com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingTradeRewardPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse tradeRewardCampaign(com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradeRewardCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse feeDiscountAccountInfo(com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse feeDiscountSchedule(com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse balanceMismatches(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMismatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse balanceWithBalanceHolds(com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceWithBalanceHoldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse feeDiscountTierStatistics(com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountTierStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public com.injective.exchange.v1beta1.MitoVaultInfosResponse mitoVaultInfos(com.injective.exchange.v1beta1.MitoVaultInfosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMitoVaultInfosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount ID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse queryMarketIDFromVault(com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMarketIDFromVaultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse historicalTradeRecords(com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalTradeRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse isOptedOutOfRewards(com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsOptedOutOfRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse optedOutOfRewardsAccounts(com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptedOutOfRewardsAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryMarketVolatilityResponse marketVolatility(com.injective.exchange.v1beta1.QueryMarketVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketVolatilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryBinaryMarketsResponse binaryOptionsMarkets(com.injective.exchange.v1beta1.QueryBinaryMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBinaryOptionsMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse traderDerivativeConditionalOrders(com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeConditionalOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse marketAtomicExecutionFeeMultiplier(com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions(), request);
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
     * Retrieves exchange params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryExchangeParamsResponse> queryExchangeParams(
        com.injective.exchange.v1beta1.QueryExchangeParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExchangeParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse> subaccountDeposits(
        com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountDepositResponse> subaccountDeposit(
        com.injective.exchange.v1beta1.QuerySubaccountDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryExchangeBalancesResponse> exchangeBalances(
        com.injective.exchange.v1beta1.QueryExchangeBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAggregateVolumeResponse> aggregateVolume(
        com.injective.exchange.v1beta1.QueryAggregateVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAggregateVolumesResponse> aggregateVolumes(
        com.injective.exchange.v1beta1.QueryAggregateVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVolumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse> aggregateMarketVolume(
        com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateMarketVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse> aggregateMarketVolumes(
        com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateMarketVolumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDenomDecimalResponse> denomDecimal(
        com.injective.exchange.v1beta1.QueryDenomDecimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomDecimalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDenomDecimalsResponse> denomDecimals(
        com.injective.exchange.v1beta1.QueryDenomDecimalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomDecimalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySpotMarketsResponse> spotMarkets(
        com.injective.exchange.v1beta1.QuerySpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySpotMarketResponse> spotMarket(
        com.injective.exchange.v1beta1.QuerySpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse> fullSpotMarkets(
        com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFullSpotMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryFullSpotMarketResponse> fullSpotMarket(
        com.injective.exchange.v1beta1.QueryFullSpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFullSpotMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySpotOrderbookResponse> spotOrderbook(
        com.injective.exchange.v1beta1.QuerySpotOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotOrderbookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> traderSpotOrders(
        com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderSpotOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse> accountAddressSpotOrders(
        com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountAddressSpotOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse> spotOrdersByHashes(
        com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotOrdersByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse> subaccountOrders(
        com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse> traderSpotTransientOrders(
        com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderSpotTransientOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse> spotMidPriceAndTOB(
        com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMidPriceAndTOBMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse> derivativeMidPriceAndTOB(
        com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMidPriceAndTOBMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse> derivativeOrderbook(
        com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeOrderbookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> traderDerivativeOrders(
        com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse> accountAddressDerivativeOrders(
        com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountAddressDerivativeOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse> derivativeOrdersByHashes(
        com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeOrdersByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse> traderDerivativeTransientOrders(
        com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeTransientOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse> derivativeMarkets(
        com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeMarketResponse> derivativeMarket(
        com.injective.exchange.v1beta1.QueryDerivativeMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse> derivativeMarketAddress(
        com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse> subaccountTradeNonce(
        com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountTradeNonceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryModuleStateResponse> exchangeModuleState(
        com.injective.exchange.v1beta1.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeModuleStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryPositionsResponse> positions(
        com.injective.exchange.v1beta1.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse> subaccountPositions(
        com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse> subaccountPositionInMarket(
        com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountPositionInMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse> subaccountEffectivePositionInMarket(
        com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountEffectivePositionInMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse> perpetualMarketInfo(
        com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerpetualMarketInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse> expiryFuturesMarketInfo(
        com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExpiryFuturesMarketInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse> perpetualMarketFunding(
        com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerpetualMarketFundingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse> subaccountOrderMetadata(
        com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountOrderMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> tradeRewardPoints(
        com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradeRewardPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse> pendingTradeRewardPoints(
        com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingTradeRewardPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse> tradeRewardCampaign(
        com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradeRewardCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse> feeDiscountAccountInfo(
        com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse> feeDiscountSchedule(
        com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse> balanceMismatches(
        com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMismatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse> balanceWithBalanceHolds(
        com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceWithBalanceHoldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse> feeDiscountTierStatistics(
        com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountTierStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.MitoVaultInfosResponse> mitoVaultInfos(
        com.injective.exchange.v1beta1.MitoVaultInfosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMitoVaultInfosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse> queryMarketIDFromVault(
        com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMarketIDFromVaultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse> historicalTradeRecords(
        com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalTradeRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse> isOptedOutOfRewards(
        com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsOptedOutOfRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse> optedOutOfRewardsAccounts(
        com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptedOutOfRewardsAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryMarketVolatilityResponse> marketVolatility(
        com.injective.exchange.v1beta1.QueryMarketVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketVolatilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryBinaryMarketsResponse> binaryOptionsMarkets(
        com.injective.exchange.v1beta1.QueryBinaryMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBinaryOptionsMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse> traderDerivativeConditionalOrders(
        com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeConditionalOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse> marketAtomicExecutionFeeMultiplier(
        com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_EXCHANGE_PARAMS = 0;
  private static final int METHODID_SUBACCOUNT_DEPOSITS = 1;
  private static final int METHODID_SUBACCOUNT_DEPOSIT = 2;
  private static final int METHODID_EXCHANGE_BALANCES = 3;
  private static final int METHODID_AGGREGATE_VOLUME = 4;
  private static final int METHODID_AGGREGATE_VOLUMES = 5;
  private static final int METHODID_AGGREGATE_MARKET_VOLUME = 6;
  private static final int METHODID_AGGREGATE_MARKET_VOLUMES = 7;
  private static final int METHODID_DENOM_DECIMAL = 8;
  private static final int METHODID_DENOM_DECIMALS = 9;
  private static final int METHODID_SPOT_MARKETS = 10;
  private static final int METHODID_SPOT_MARKET = 11;
  private static final int METHODID_FULL_SPOT_MARKETS = 12;
  private static final int METHODID_FULL_SPOT_MARKET = 13;
  private static final int METHODID_SPOT_ORDERBOOK = 14;
  private static final int METHODID_TRADER_SPOT_ORDERS = 15;
  private static final int METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS = 16;
  private static final int METHODID_SPOT_ORDERS_BY_HASHES = 17;
  private static final int METHODID_SUBACCOUNT_ORDERS = 18;
  private static final int METHODID_TRADER_SPOT_TRANSIENT_ORDERS = 19;
  private static final int METHODID_SPOT_MID_PRICE_AND_TOB = 20;
  private static final int METHODID_DERIVATIVE_MID_PRICE_AND_TOB = 21;
  private static final int METHODID_DERIVATIVE_ORDERBOOK = 22;
  private static final int METHODID_TRADER_DERIVATIVE_ORDERS = 23;
  private static final int METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS = 24;
  private static final int METHODID_DERIVATIVE_ORDERS_BY_HASHES = 25;
  private static final int METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS = 26;
  private static final int METHODID_DERIVATIVE_MARKETS = 27;
  private static final int METHODID_DERIVATIVE_MARKET = 28;
  private static final int METHODID_DERIVATIVE_MARKET_ADDRESS = 29;
  private static final int METHODID_SUBACCOUNT_TRADE_NONCE = 30;
  private static final int METHODID_EXCHANGE_MODULE_STATE = 31;
  private static final int METHODID_POSITIONS = 32;
  private static final int METHODID_SUBACCOUNT_POSITIONS = 33;
  private static final int METHODID_SUBACCOUNT_POSITION_IN_MARKET = 34;
  private static final int METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET = 35;
  private static final int METHODID_PERPETUAL_MARKET_INFO = 36;
  private static final int METHODID_EXPIRY_FUTURES_MARKET_INFO = 37;
  private static final int METHODID_PERPETUAL_MARKET_FUNDING = 38;
  private static final int METHODID_SUBACCOUNT_ORDER_METADATA = 39;
  private static final int METHODID_TRADE_REWARD_POINTS = 40;
  private static final int METHODID_PENDING_TRADE_REWARD_POINTS = 41;
  private static final int METHODID_TRADE_REWARD_CAMPAIGN = 42;
  private static final int METHODID_FEE_DISCOUNT_ACCOUNT_INFO = 43;
  private static final int METHODID_FEE_DISCOUNT_SCHEDULE = 44;
  private static final int METHODID_BALANCE_MISMATCHES = 45;
  private static final int METHODID_BALANCE_WITH_BALANCE_HOLDS = 46;
  private static final int METHODID_FEE_DISCOUNT_TIER_STATISTICS = 47;
  private static final int METHODID_MITO_VAULT_INFOS = 48;
  private static final int METHODID_QUERY_MARKET_IDFROM_VAULT = 49;
  private static final int METHODID_HISTORICAL_TRADE_RECORDS = 50;
  private static final int METHODID_IS_OPTED_OUT_OF_REWARDS = 51;
  private static final int METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS = 52;
  private static final int METHODID_MARKET_VOLATILITY = 53;
  private static final int METHODID_BINARY_OPTIONS_MARKETS = 54;
  private static final int METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS = 55;
  private static final int METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER = 56;

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
        case METHODID_QUERY_EXCHANGE_PARAMS:
          serviceImpl.queryExchangeParams((com.injective.exchange.v1beta1.QueryExchangeParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeParamsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_DEPOSITS:
          serviceImpl.subaccountDeposits((com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_DEPOSIT:
          serviceImpl.subaccountDeposit((com.injective.exchange.v1beta1.QuerySubaccountDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountDepositResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_BALANCES:
          serviceImpl.exchangeBalances((com.injective.exchange.v1beta1.QueryExchangeBalancesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExchangeBalancesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOLUME:
          serviceImpl.aggregateVolume((com.injective.exchange.v1beta1.QueryAggregateVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumeResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOLUMES:
          serviceImpl.aggregateVolumes((com.injective.exchange.v1beta1.QueryAggregateVolumesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateVolumesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_MARKET_VOLUME:
          serviceImpl.aggregateMarketVolume((com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_MARKET_VOLUMES:
          serviceImpl.aggregateMarketVolumes((com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse>) responseObserver);
          break;
        case METHODID_DENOM_DECIMAL:
          serviceImpl.denomDecimal((com.injective.exchange.v1beta1.QueryDenomDecimalRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalResponse>) responseObserver);
          break;
        case METHODID_DENOM_DECIMALS:
          serviceImpl.denomDecimals((com.injective.exchange.v1beta1.QueryDenomDecimalsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDenomDecimalsResponse>) responseObserver);
          break;
        case METHODID_SPOT_MARKETS:
          serviceImpl.spotMarkets((com.injective.exchange.v1beta1.QuerySpotMarketsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketsResponse>) responseObserver);
          break;
        case METHODID_SPOT_MARKET:
          serviceImpl.spotMarket((com.injective.exchange.v1beta1.QuerySpotMarketRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMarketResponse>) responseObserver);
          break;
        case METHODID_FULL_SPOT_MARKETS:
          serviceImpl.fullSpotMarkets((com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse>) responseObserver);
          break;
        case METHODID_FULL_SPOT_MARKET:
          serviceImpl.fullSpotMarket((com.injective.exchange.v1beta1.QueryFullSpotMarketRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFullSpotMarketResponse>) responseObserver);
          break;
        case METHODID_SPOT_ORDERBOOK:
          serviceImpl.spotOrderbook((com.injective.exchange.v1beta1.QuerySpotOrderbookRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrderbookResponse>) responseObserver);
          break;
        case METHODID_TRADER_SPOT_ORDERS:
          serviceImpl.traderSpotOrders((com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS:
          serviceImpl.accountAddressSpotOrders((com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_SPOT_ORDERS_BY_HASHES:
          serviceImpl.spotOrdersByHashes((com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_ORDERS:
          serviceImpl.subaccountOrders((com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse>) responseObserver);
          break;
        case METHODID_TRADER_SPOT_TRANSIENT_ORDERS:
          serviceImpl.traderSpotTransientOrders((com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_SPOT_MID_PRICE_AND_TOB:
          serviceImpl.spotMidPriceAndTOB((com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MID_PRICE_AND_TOB:
          serviceImpl.derivativeMidPriceAndTOB((com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_ORDERBOOK:
          serviceImpl.derivativeOrderbook((com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_ORDERS:
          serviceImpl.traderDerivativeOrders((com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS:
          serviceImpl.accountAddressDerivativeOrders((com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_ORDERS_BY_HASHES:
          serviceImpl.derivativeOrdersByHashes((com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS:
          serviceImpl.traderDerivativeTransientOrders((com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKETS:
          serviceImpl.derivativeMarkets((com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKET:
          serviceImpl.derivativeMarket((com.injective.exchange.v1beta1.QueryDerivativeMarketRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKET_ADDRESS:
          serviceImpl.derivativeMarketAddress((com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_TRADE_NONCE:
          serviceImpl.subaccountTradeNonce((com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_MODULE_STATE:
          serviceImpl.exchangeModuleState((com.injective.exchange.v1beta1.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryModuleStateResponse>) responseObserver);
          break;
        case METHODID_POSITIONS:
          serviceImpl.positions((com.injective.exchange.v1beta1.QueryPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPositionsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_POSITIONS:
          serviceImpl.subaccountPositions((com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_POSITION_IN_MARKET:
          serviceImpl.subaccountPositionInMarket((com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET:
          serviceImpl.subaccountEffectivePositionInMarket((com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse>) responseObserver);
          break;
        case METHODID_PERPETUAL_MARKET_INFO:
          serviceImpl.perpetualMarketInfo((com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse>) responseObserver);
          break;
        case METHODID_EXPIRY_FUTURES_MARKET_INFO:
          serviceImpl.expiryFuturesMarketInfo((com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse>) responseObserver);
          break;
        case METHODID_PERPETUAL_MARKET_FUNDING:
          serviceImpl.perpetualMarketFunding((com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_ORDER_METADATA:
          serviceImpl.subaccountOrderMetadata((com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse>) responseObserver);
          break;
        case METHODID_TRADE_REWARD_POINTS:
          serviceImpl.tradeRewardPoints((com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>) responseObserver);
          break;
        case METHODID_PENDING_TRADE_REWARD_POINTS:
          serviceImpl.pendingTradeRewardPoints((com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>) responseObserver);
          break;
        case METHODID_TRADE_REWARD_CAMPAIGN:
          serviceImpl.tradeRewardCampaign((com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_ACCOUNT_INFO:
          serviceImpl.feeDiscountAccountInfo((com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_SCHEDULE:
          serviceImpl.feeDiscountSchedule((com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse>) responseObserver);
          break;
        case METHODID_BALANCE_MISMATCHES:
          serviceImpl.balanceMismatches((com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse>) responseObserver);
          break;
        case METHODID_BALANCE_WITH_BALANCE_HOLDS:
          serviceImpl.balanceWithBalanceHolds((com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_TIER_STATISTICS:
          serviceImpl.feeDiscountTierStatistics((com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse>) responseObserver);
          break;
        case METHODID_MITO_VAULT_INFOS:
          serviceImpl.mitoVaultInfos((com.injective.exchange.v1beta1.MitoVaultInfosRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.MitoVaultInfosResponse>) responseObserver);
          break;
        case METHODID_QUERY_MARKET_IDFROM_VAULT:
          serviceImpl.queryMarketIDFromVault((com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_TRADE_RECORDS:
          serviceImpl.historicalTradeRecords((com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse>) responseObserver);
          break;
        case METHODID_IS_OPTED_OUT_OF_REWARDS:
          serviceImpl.isOptedOutOfRewards((com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse>) responseObserver);
          break;
        case METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS:
          serviceImpl.optedOutOfRewardsAccounts((com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse>) responseObserver);
          break;
        case METHODID_MARKET_VOLATILITY:
          serviceImpl.marketVolatility((com.injective.exchange.v1beta1.QueryMarketVolatilityRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketVolatilityResponse>) responseObserver);
          break;
        case METHODID_BINARY_OPTIONS_MARKETS:
          serviceImpl.binaryOptionsMarkets((com.injective.exchange.v1beta1.QueryBinaryMarketsRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryBinaryMarketsResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS:
          serviceImpl.traderDerivativeConditionalOrders((com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse>) responseObserver);
          break;
        case METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER:
          serviceImpl.marketAtomicExecutionFeeMultiplier((com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest) request,
              (io.grpc.stub.StreamObserver<com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse>) responseObserver);
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
          getQueryExchangeParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryExchangeParamsRequest,
              com.injective.exchange.v1beta1.QueryExchangeParamsResponse>(
                service, METHODID_QUERY_EXCHANGE_PARAMS)))
        .addMethod(
          getSubaccountDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountDepositsRequest,
              com.injective.exchange.v1beta1.QuerySubaccountDepositsResponse>(
                service, METHODID_SUBACCOUNT_DEPOSITS)))
        .addMethod(
          getSubaccountDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountDepositRequest,
              com.injective.exchange.v1beta1.QuerySubaccountDepositResponse>(
                service, METHODID_SUBACCOUNT_DEPOSIT)))
        .addMethod(
          getExchangeBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryExchangeBalancesRequest,
              com.injective.exchange.v1beta1.QueryExchangeBalancesResponse>(
                service, METHODID_EXCHANGE_BALANCES)))
        .addMethod(
          getAggregateVolumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAggregateVolumeRequest,
              com.injective.exchange.v1beta1.QueryAggregateVolumeResponse>(
                service, METHODID_AGGREGATE_VOLUME)))
        .addMethod(
          getAggregateVolumesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAggregateVolumesRequest,
              com.injective.exchange.v1beta1.QueryAggregateVolumesResponse>(
                service, METHODID_AGGREGATE_VOLUMES)))
        .addMethod(
          getAggregateMarketVolumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest,
              com.injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse>(
                service, METHODID_AGGREGATE_MARKET_VOLUME)))
        .addMethod(
          getAggregateMarketVolumesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest,
              com.injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse>(
                service, METHODID_AGGREGATE_MARKET_VOLUMES)))
        .addMethod(
          getDenomDecimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDenomDecimalRequest,
              com.injective.exchange.v1beta1.QueryDenomDecimalResponse>(
                service, METHODID_DENOM_DECIMAL)))
        .addMethod(
          getDenomDecimalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDenomDecimalsRequest,
              com.injective.exchange.v1beta1.QueryDenomDecimalsResponse>(
                service, METHODID_DENOM_DECIMALS)))
        .addMethod(
          getSpotMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySpotMarketsRequest,
              com.injective.exchange.v1beta1.QuerySpotMarketsResponse>(
                service, METHODID_SPOT_MARKETS)))
        .addMethod(
          getSpotMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySpotMarketRequest,
              com.injective.exchange.v1beta1.QuerySpotMarketResponse>(
                service, METHODID_SPOT_MARKET)))
        .addMethod(
          getFullSpotMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryFullSpotMarketsRequest,
              com.injective.exchange.v1beta1.QueryFullSpotMarketsResponse>(
                service, METHODID_FULL_SPOT_MARKETS)))
        .addMethod(
          getFullSpotMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryFullSpotMarketRequest,
              com.injective.exchange.v1beta1.QueryFullSpotMarketResponse>(
                service, METHODID_FULL_SPOT_MARKET)))
        .addMethod(
          getSpotOrderbookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySpotOrderbookRequest,
              com.injective.exchange.v1beta1.QuerySpotOrderbookResponse>(
                service, METHODID_SPOT_ORDERBOOK)))
        .addMethod(
          getTraderSpotOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
              com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>(
                service, METHODID_TRADER_SPOT_ORDERS)))
        .addMethod(
          getAccountAddressSpotOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest,
              com.injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse>(
                service, METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS)))
        .addMethod(
          getSpotOrdersByHashesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest,
              com.injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse>(
                service, METHODID_SPOT_ORDERS_BY_HASHES)))
        .addMethod(
          getSubaccountOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountOrdersRequest,
              com.injective.exchange.v1beta1.QuerySubaccountOrdersResponse>(
                service, METHODID_SUBACCOUNT_ORDERS)))
        .addMethod(
          getTraderSpotTransientOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTraderSpotOrdersRequest,
              com.injective.exchange.v1beta1.QueryTraderSpotOrdersResponse>(
                service, METHODID_TRADER_SPOT_TRANSIENT_ORDERS)))
        .addMethod(
          getSpotMidPriceAndTOBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest,
              com.injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse>(
                service, METHODID_SPOT_MID_PRICE_AND_TOB)))
        .addMethod(
          getDerivativeMidPriceAndTOBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest,
              com.injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse>(
                service, METHODID_DERIVATIVE_MID_PRICE_AND_TOB)))
        .addMethod(
          getDerivativeOrderbookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeOrderbookRequest,
              com.injective.exchange.v1beta1.QueryDerivativeOrderbookResponse>(
                service, METHODID_DERIVATIVE_ORDERBOOK)))
        .addMethod(
          getTraderDerivativeOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
              com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_ORDERS)))
        .addMethod(
          getAccountAddressDerivativeOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest,
              com.injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse>(
                service, METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS)))
        .addMethod(
          getDerivativeOrdersByHashesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest,
              com.injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse>(
                service, METHODID_DERIVATIVE_ORDERS_BY_HASHES)))
        .addMethod(
          getTraderDerivativeTransientOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest,
              com.injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS)))
        .addMethod(
          getDerivativeMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeMarketsRequest,
              com.injective.exchange.v1beta1.QueryDerivativeMarketsResponse>(
                service, METHODID_DERIVATIVE_MARKETS)))
        .addMethod(
          getDerivativeMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeMarketRequest,
              com.injective.exchange.v1beta1.QueryDerivativeMarketResponse>(
                service, METHODID_DERIVATIVE_MARKET)))
        .addMethod(
          getDerivativeMarketAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest,
              com.injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse>(
                service, METHODID_DERIVATIVE_MARKET_ADDRESS)))
        .addMethod(
          getSubaccountTradeNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest,
              com.injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse>(
                service, METHODID_SUBACCOUNT_TRADE_NONCE)))
        .addMethod(
          getExchangeModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryModuleStateRequest,
              com.injective.exchange.v1beta1.QueryModuleStateResponse>(
                service, METHODID_EXCHANGE_MODULE_STATE)))
        .addMethod(
          getPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryPositionsRequest,
              com.injective.exchange.v1beta1.QueryPositionsResponse>(
                service, METHODID_POSITIONS)))
        .addMethod(
          getSubaccountPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountPositionsRequest,
              com.injective.exchange.v1beta1.QuerySubaccountPositionsResponse>(
                service, METHODID_SUBACCOUNT_POSITIONS)))
        .addMethod(
          getSubaccountPositionInMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest,
              com.injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse>(
                service, METHODID_SUBACCOUNT_POSITION_IN_MARKET)))
        .addMethod(
          getSubaccountEffectivePositionInMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest,
              com.injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse>(
                service, METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET)))
        .addMethod(
          getPerpetualMarketInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest,
              com.injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse>(
                service, METHODID_PERPETUAL_MARKET_INFO)))
        .addMethod(
          getExpiryFuturesMarketInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest,
              com.injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse>(
                service, METHODID_EXPIRY_FUTURES_MARKET_INFO)))
        .addMethod(
          getPerpetualMarketFundingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest,
              com.injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse>(
                service, METHODID_PERPETUAL_MARKET_FUNDING)))
        .addMethod(
          getSubaccountOrderMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest,
              com.injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse>(
                service, METHODID_SUBACCOUNT_ORDER_METADATA)))
        .addMethod(
          getTradeRewardPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
              com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>(
                service, METHODID_TRADE_REWARD_POINTS)))
        .addMethod(
          getPendingTradeRewardPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTradeRewardPointsRequest,
              com.injective.exchange.v1beta1.QueryTradeRewardPointsResponse>(
                service, METHODID_PENDING_TRADE_REWARD_POINTS)))
        .addMethod(
          getTradeRewardCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTradeRewardCampaignRequest,
              com.injective.exchange.v1beta1.QueryTradeRewardCampaignResponse>(
                service, METHODID_TRADE_REWARD_CAMPAIGN)))
        .addMethod(
          getFeeDiscountAccountInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest,
              com.injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse>(
                service, METHODID_FEE_DISCOUNT_ACCOUNT_INFO)))
        .addMethod(
          getFeeDiscountScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest,
              com.injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse>(
                service, METHODID_FEE_DISCOUNT_SCHEDULE)))
        .addMethod(
          getBalanceMismatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest,
              com.injective.exchange.v1beta1.QueryBalanceMismatchesResponse>(
                service, METHODID_BALANCE_MISMATCHES)))
        .addMethod(
          getBalanceWithBalanceHoldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest,
              com.injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse>(
                service, METHODID_BALANCE_WITH_BALANCE_HOLDS)))
        .addMethod(
          getFeeDiscountTierStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest,
              com.injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse>(
                service, METHODID_FEE_DISCOUNT_TIER_STATISTICS)))
        .addMethod(
          getMitoVaultInfosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.MitoVaultInfosRequest,
              com.injective.exchange.v1beta1.MitoVaultInfosResponse>(
                service, METHODID_MITO_VAULT_INFOS)))
        .addMethod(
          getQueryMarketIDFromVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryMarketIDFromVaultRequest,
              com.injective.exchange.v1beta1.QueryMarketIDFromVaultResponse>(
                service, METHODID_QUERY_MARKET_IDFROM_VAULT)))
        .addMethod(
          getHistoricalTradeRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest,
              com.injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse>(
                service, METHODID_HISTORICAL_TRADE_RECORDS)))
        .addMethod(
          getIsOptedOutOfRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest,
              com.injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse>(
                service, METHODID_IS_OPTED_OUT_OF_REWARDS)))
        .addMethod(
          getOptedOutOfRewardsAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest,
              com.injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse>(
                service, METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS)))
        .addMethod(
          getMarketVolatilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryMarketVolatilityRequest,
              com.injective.exchange.v1beta1.QueryMarketVolatilityResponse>(
                service, METHODID_MARKET_VOLATILITY)))
        .addMethod(
          getBinaryOptionsMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryBinaryMarketsRequest,
              com.injective.exchange.v1beta1.QueryBinaryMarketsResponse>(
                service, METHODID_BINARY_OPTIONS_MARKETS)))
        .addMethod(
          getTraderDerivativeConditionalOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest,
              com.injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS)))
        .addMethod(
          getMarketAtomicExecutionFeeMultiplierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest,
              com.injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse>(
                service, METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQueryExchangeParamsMethod())
              .addMethod(getSubaccountDepositsMethod())
              .addMethod(getSubaccountDepositMethod())
              .addMethod(getExchangeBalancesMethod())
              .addMethod(getAggregateVolumeMethod())
              .addMethod(getAggregateVolumesMethod())
              .addMethod(getAggregateMarketVolumeMethod())
              .addMethod(getAggregateMarketVolumesMethod())
              .addMethod(getDenomDecimalMethod())
              .addMethod(getDenomDecimalsMethod())
              .addMethod(getSpotMarketsMethod())
              .addMethod(getSpotMarketMethod())
              .addMethod(getFullSpotMarketsMethod())
              .addMethod(getFullSpotMarketMethod())
              .addMethod(getSpotOrderbookMethod())
              .addMethod(getTraderSpotOrdersMethod())
              .addMethod(getAccountAddressSpotOrdersMethod())
              .addMethod(getSpotOrdersByHashesMethod())
              .addMethod(getSubaccountOrdersMethod())
              .addMethod(getTraderSpotTransientOrdersMethod())
              .addMethod(getSpotMidPriceAndTOBMethod())
              .addMethod(getDerivativeMidPriceAndTOBMethod())
              .addMethod(getDerivativeOrderbookMethod())
              .addMethod(getTraderDerivativeOrdersMethod())
              .addMethod(getAccountAddressDerivativeOrdersMethod())
              .addMethod(getDerivativeOrdersByHashesMethod())
              .addMethod(getTraderDerivativeTransientOrdersMethod())
              .addMethod(getDerivativeMarketsMethod())
              .addMethod(getDerivativeMarketMethod())
              .addMethod(getDerivativeMarketAddressMethod())
              .addMethod(getSubaccountTradeNonceMethod())
              .addMethod(getExchangeModuleStateMethod())
              .addMethod(getPositionsMethod())
              .addMethod(getSubaccountPositionsMethod())
              .addMethod(getSubaccountPositionInMarketMethod())
              .addMethod(getSubaccountEffectivePositionInMarketMethod())
              .addMethod(getPerpetualMarketInfoMethod())
              .addMethod(getExpiryFuturesMarketInfoMethod())
              .addMethod(getPerpetualMarketFundingMethod())
              .addMethod(getSubaccountOrderMetadataMethod())
              .addMethod(getTradeRewardPointsMethod())
              .addMethod(getPendingTradeRewardPointsMethod())
              .addMethod(getTradeRewardCampaignMethod())
              .addMethod(getFeeDiscountAccountInfoMethod())
              .addMethod(getFeeDiscountScheduleMethod())
              .addMethod(getBalanceMismatchesMethod())
              .addMethod(getBalanceWithBalanceHoldsMethod())
              .addMethod(getFeeDiscountTierStatisticsMethod())
              .addMethod(getMitoVaultInfosMethod())
              .addMethod(getQueryMarketIDFromVaultMethod())
              .addMethod(getHistoricalTradeRecordsMethod())
              .addMethod(getIsOptedOutOfRewardsMethod())
              .addMethod(getOptedOutOfRewardsAccountsMethod())
              .addMethod(getMarketVolatilityMethod())
              .addMethod(getBinaryOptionsMarketsMethod())
              .addMethod(getTraderDerivativeConditionalOrdersMethod())
              .addMethod(getMarketAtomicExecutionFeeMultiplierMethod())
              .build();
        }
      }
    }
    return result;
  }
}
