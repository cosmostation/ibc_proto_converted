package com.umee.oracle.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: umee/oracle/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "umee.oracle.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryExchangeRates,
      com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> getExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRates",
      requestType = com.umee.oracle.v1.QueryProto.QueryExchangeRates.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryExchangeRates,
      com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> getExchangeRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryExchangeRates, com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> getExchangeRatesMethod;
    if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRatesMethod = QueryGrpc.getExchangeRatesMethod) == null) {
          QueryGrpc.getExchangeRatesMethod = getExchangeRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryExchangeRates, com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryExchangeRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRates"))
              .build();
        }
      }
    }
    return getExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates,
      com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveExchangeRates",
      requestType = com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates,
      com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates, com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> getActiveExchangeRatesMethod;
    if ((getActiveExchangeRatesMethod = QueryGrpc.getActiveExchangeRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveExchangeRatesMethod = QueryGrpc.getActiveExchangeRatesMethod) == null) {
          QueryGrpc.getActiveExchangeRatesMethod = getActiveExchangeRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates, com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveExchangeRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveExchangeRates"))
              .build();
        }
      }
    }
    return getActiveExchangeRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryFeederDelegation,
      com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeederDelegation",
      requestType = com.umee.oracle.v1.QueryProto.QueryFeederDelegation.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryFeederDelegation,
      com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryFeederDelegation, com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> getFeederDelegationMethod;
    if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeederDelegationMethod = QueryGrpc.getFeederDelegationMethod) == null) {
          QueryGrpc.getFeederDelegationMethod = getFeederDelegationMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryFeederDelegation, com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeederDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryFeederDelegation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeederDelegation"))
              .build();
        }
      }
    }
    return getFeederDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMissCounter,
      com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> getMissCounterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissCounter",
      requestType = com.umee.oracle.v1.QueryProto.QueryMissCounter.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryMissCounterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMissCounter,
      com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> getMissCounterMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMissCounter, com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> getMissCounterMethod;
    if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMissCounterMethod = QueryGrpc.getMissCounterMethod) == null) {
          QueryGrpc.getMissCounterMethod = getMissCounterMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryMissCounter, com.umee.oracle.v1.QueryProto.QueryMissCounterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissCounter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMissCounter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMissCounterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MissCounter"))
              .build();
        }
      }
    }
    return getMissCounterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QuerySlashWindow,
      com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> getSlashWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlashWindow",
      requestType = com.umee.oracle.v1.QueryProto.QuerySlashWindow.class,
      responseType = com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QuerySlashWindow,
      com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> getSlashWindowMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QuerySlashWindow, com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> getSlashWindowMethod;
    if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSlashWindowMethod = QueryGrpc.getSlashWindowMethod) == null) {
          QueryGrpc.getSlashWindowMethod = getSlashWindowMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QuerySlashWindow, com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SlashWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QuerySlashWindow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SlashWindow"))
              .build();
        }
      }
    }
    return getSlashWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevote,
      com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevote",
      requestType = com.umee.oracle.v1.QueryProto.QueryAggregatePrevote.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevote,
      com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevote, com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> getAggregatePrevoteMethod;
    if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevoteMethod = QueryGrpc.getAggregatePrevoteMethod) == null) {
          QueryGrpc.getAggregatePrevoteMethod = getAggregatePrevoteMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryAggregatePrevote, com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregatePrevote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevote"))
              .build();
        }
      }
    }
    return getAggregatePrevoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes,
      com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregatePrevotes",
      requestType = com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes,
      com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes, com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> getAggregatePrevotesMethod;
    if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregatePrevotesMethod = QueryGrpc.getAggregatePrevotesMethod) == null) {
          QueryGrpc.getAggregatePrevotesMethod = getAggregatePrevotesMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes, com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregatePrevotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregatePrevotes"))
              .build();
        }
      }
    }
    return getAggregatePrevotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVote,
      com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVote",
      requestType = com.umee.oracle.v1.QueryProto.QueryAggregateVote.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVote,
      com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVote, com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> getAggregateVoteMethod;
    if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVoteMethod = QueryGrpc.getAggregateVoteMethod) == null) {
          QueryGrpc.getAggregateVoteMethod = getAggregateVoteMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryAggregateVote, com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregateVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVote"))
              .build();
        }
      }
    }
    return getAggregateVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVotes,
      com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVotes",
      requestType = com.umee.oracle.v1.QueryProto.QueryAggregateVotes.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVotes,
      com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAggregateVotes, com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> getAggregateVotesMethod;
    if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVotesMethod = QueryGrpc.getAggregateVotesMethod) == null) {
          QueryGrpc.getAggregateVotesMethod = getAggregateVotesMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryAggregateVotes, com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVotes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregateVotes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVotes"))
              .build();
        }
      }
    }
    return getAggregateVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryParams,
      com.umee.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.umee.oracle.v1.QueryProto.QueryParams.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryParams,
      com.umee.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryParams, com.umee.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryParams, com.umee.oracle.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedians,
      com.umee.oracle.v1.QueryProto.QueryMediansResponse> getMediansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Medians",
      requestType = com.umee.oracle.v1.QueryProto.QueryMedians.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryMediansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedians,
      com.umee.oracle.v1.QueryProto.QueryMediansResponse> getMediansMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedians, com.umee.oracle.v1.QueryProto.QueryMediansResponse> getMediansMethod;
    if ((getMediansMethod = QueryGrpc.getMediansMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMediansMethod = QueryGrpc.getMediansMethod) == null) {
          QueryGrpc.getMediansMethod = getMediansMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryMedians, com.umee.oracle.v1.QueryProto.QueryMediansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Medians"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMedians.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMediansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Medians"))
              .build();
        }
      }
    }
    return getMediansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedianDeviations,
      com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> getMedianDeviationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MedianDeviations",
      requestType = com.umee.oracle.v1.QueryProto.QueryMedianDeviations.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedianDeviations,
      com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> getMedianDeviationsMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryMedianDeviations, com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> getMedianDeviationsMethod;
    if ((getMedianDeviationsMethod = QueryGrpc.getMedianDeviationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMedianDeviationsMethod = QueryGrpc.getMedianDeviationsMethod) == null) {
          QueryGrpc.getMedianDeviationsMethod = getMedianDeviationsMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryMedianDeviations, com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MedianDeviations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMedianDeviations.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MedianDeviations"))
              .build();
        }
      }
    }
    return getMedianDeviationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAvgPrice,
      com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> getAvgPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AvgPrice",
      requestType = com.umee.oracle.v1.QueryProto.QueryAvgPrice.class,
      responseType = com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAvgPrice,
      com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> getAvgPriceMethod() {
    io.grpc.MethodDescriptor<com.umee.oracle.v1.QueryProto.QueryAvgPrice, com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> getAvgPriceMethod;
    if ((getAvgPriceMethod = QueryGrpc.getAvgPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAvgPriceMethod = QueryGrpc.getAvgPriceMethod) == null) {
          QueryGrpc.getAvgPriceMethod = getAvgPriceMethod =
              io.grpc.MethodDescriptor.<com.umee.oracle.v1.QueryProto.QueryAvgPrice, com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AvgPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAvgPrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AvgPrice"))
              .build();
        }
      }
    }
    return getAvgPriceMethod;
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
     * ExchangeRates returns exchange rates of all denoms,
     * or, if specified, returns a single denom
     * </pre>
     */
    default void exchangeRates(com.umee.oracle.v1.QueryProto.QueryExchangeRates request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    default void activeExchangeRates(com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveExchangeRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    default void feederDelegation(com.umee.oracle.v1.QueryProto.QueryFeederDelegation request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeederDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    default void missCounter(com.umee.oracle.v1.QueryProto.QueryMissCounter request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMissCounterMethod(), responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    default void slashWindow(com.umee.oracle.v1.QueryProto.QuerySlashWindow request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSlashWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    default void aggregatePrevote(com.umee.oracle.v1.QueryProto.QueryAggregatePrevote request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregatePrevoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    default void aggregatePrevotes(com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregatePrevotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    default void aggregateVote(com.umee.oracle.v1.QueryProto.QueryAggregateVote request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    default void aggregateVotes(com.umee.oracle.v1.QueryProto.QueryAggregateVotes request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(com.umee.oracle.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Medians returns medians of all denoms,
     * or, if specified, returns a single median
     * </pre>
     */
    default void medians(com.umee.oracle.v1.QueryProto.QueryMedians request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMediansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMediansMethod(), responseObserver);
    }

    /**
     * <pre>
     * MedianDeviations returns median deviations of all denoms,
     * or, if specified, returns a single median deviation
     * </pre>
     */
    default void medianDeviations(com.umee.oracle.v1.QueryProto.QueryMedianDeviations request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMedianDeviationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryAvgPrice returns avg price of a given denom (required).
     * </pre>
     */
    default void avgPrice(com.umee.oracle.v1.QueryProto.QueryAvgPrice request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAvgPriceMethod(), responseObserver);
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
     * ExchangeRates returns exchange rates of all denoms,
     * or, if specified, returns a single denom
     * </pre>
     */
    public void exchangeRates(com.umee.oracle.v1.QueryProto.QueryExchangeRates request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public void activeExchangeRates(com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveExchangeRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public void feederDelegation(com.umee.oracle.v1.QueryProto.QueryFeederDelegation request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public void missCounter(com.umee.oracle.v1.QueryProto.QueryMissCounter request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public void slashWindow(com.umee.oracle.v1.QueryProto.QuerySlashWindow request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public void aggregatePrevote(com.umee.oracle.v1.QueryProto.QueryAggregatePrevote request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public void aggregatePrevotes(com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public void aggregateVote(com.umee.oracle.v1.QueryProto.QueryAggregateVote request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public void aggregateVotes(com.umee.oracle.v1.QueryProto.QueryAggregateVotes request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(com.umee.oracle.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Medians returns medians of all denoms,
     * or, if specified, returns a single median
     * </pre>
     */
    public void medians(com.umee.oracle.v1.QueryProto.QueryMedians request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMediansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMediansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MedianDeviations returns median deviations of all denoms,
     * or, if specified, returns a single median deviation
     * </pre>
     */
    public void medianDeviations(com.umee.oracle.v1.QueryProto.QueryMedianDeviations request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMedianDeviationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryAvgPrice returns avg price of a given denom (required).
     * </pre>
     */
    public void avgPrice(com.umee.oracle.v1.QueryProto.QueryAvgPrice request,
        io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAvgPriceMethod(), getCallOptions()), request, responseObserver);
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
     * ExchangeRates returns exchange rates of all denoms,
     * or, if specified, returns a single denom
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse exchangeRates(com.umee.oracle.v1.QueryProto.QueryExchangeRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse activeExchangeRates(com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveExchangeRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse feederDelegation(com.umee.oracle.v1.QueryProto.QueryFeederDelegation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeederDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryMissCounterResponse missCounter(com.umee.oracle.v1.QueryProto.QueryMissCounter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMissCounterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse slashWindow(com.umee.oracle.v1.QueryProto.QuerySlashWindow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSlashWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse aggregatePrevote(com.umee.oracle.v1.QueryProto.QueryAggregatePrevote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregatePrevoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse aggregatePrevotes(com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregatePrevotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse aggregateVote(com.umee.oracle.v1.QueryProto.QueryAggregateVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse aggregateVotes(com.umee.oracle.v1.QueryProto.QueryAggregateVotes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryParamsResponse params(com.umee.oracle.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Medians returns medians of all denoms,
     * or, if specified, returns a single median
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryMediansResponse medians(com.umee.oracle.v1.QueryProto.QueryMedians request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMediansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MedianDeviations returns median deviations of all denoms,
     * or, if specified, returns a single median deviation
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse medianDeviations(com.umee.oracle.v1.QueryProto.QueryMedianDeviations request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMedianDeviationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryAvgPrice returns avg price of a given denom (required).
     * </pre>
     */
    public com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse avgPrice(com.umee.oracle.v1.QueryProto.QueryAvgPrice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAvgPriceMethod(), getCallOptions(), request);
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
     * ExchangeRates returns exchange rates of all denoms,
     * or, if specified, returns a single denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse> exchangeRates(
        com.umee.oracle.v1.QueryProto.QueryExchangeRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveExchangeRates returns all active denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse> activeExchangeRates(
        com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveExchangeRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeederDelegation returns feeder delegation of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse> feederDelegation(
        com.umee.oracle.v1.QueryProto.QueryFeederDelegation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeederDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MissCounter returns oracle miss counter of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryMissCounterResponse> missCounter(
        com.umee.oracle.v1.QueryProto.QueryMissCounter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMissCounterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SlashWindow returns slash window information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse> slashWindow(
        com.umee.oracle.v1.QueryProto.QuerySlashWindow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSlashWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevote returns an aggregate prevote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse> aggregatePrevote(
        com.umee.oracle.v1.QueryProto.QueryAggregatePrevote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregatePrevoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregatePrevotes returns aggregate prevotes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse> aggregatePrevotes(
        com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregatePrevotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVote returns an aggregate vote of a validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse> aggregateVote(
        com.umee.oracle.v1.QueryProto.QueryAggregateVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateVotes returns aggregate votes of all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse> aggregateVotes(
        com.umee.oracle.v1.QueryProto.QueryAggregateVotes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryParamsResponse> params(
        com.umee.oracle.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Medians returns medians of all denoms,
     * or, if specified, returns a single median
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryMediansResponse> medians(
        com.umee.oracle.v1.QueryProto.QueryMedians request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMediansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MedianDeviations returns median deviations of all denoms,
     * or, if specified, returns a single median deviation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse> medianDeviations(
        com.umee.oracle.v1.QueryProto.QueryMedianDeviations request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMedianDeviationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryAvgPrice returns avg price of a given denom (required).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse> avgPrice(
        com.umee.oracle.v1.QueryProto.QueryAvgPrice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAvgPriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_RATES = 0;
  private static final int METHODID_ACTIVE_EXCHANGE_RATES = 1;
  private static final int METHODID_FEEDER_DELEGATION = 2;
  private static final int METHODID_MISS_COUNTER = 3;
  private static final int METHODID_SLASH_WINDOW = 4;
  private static final int METHODID_AGGREGATE_PREVOTE = 5;
  private static final int METHODID_AGGREGATE_PREVOTES = 6;
  private static final int METHODID_AGGREGATE_VOTE = 7;
  private static final int METHODID_AGGREGATE_VOTES = 8;
  private static final int METHODID_PARAMS = 9;
  private static final int METHODID_MEDIANS = 10;
  private static final int METHODID_MEDIAN_DEVIATIONS = 11;
  private static final int METHODID_AVG_PRICE = 12;

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
        case METHODID_EXCHANGE_RATES:
          serviceImpl.exchangeRates((com.umee.oracle.v1.QueryProto.QueryExchangeRates) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_EXCHANGE_RATES:
          serviceImpl.activeExchangeRates((com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse>) responseObserver);
          break;
        case METHODID_FEEDER_DELEGATION:
          serviceImpl.feederDelegation((com.umee.oracle.v1.QueryProto.QueryFeederDelegation) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse>) responseObserver);
          break;
        case METHODID_MISS_COUNTER:
          serviceImpl.missCounter((com.umee.oracle.v1.QueryProto.QueryMissCounter) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMissCounterResponse>) responseObserver);
          break;
        case METHODID_SLASH_WINDOW:
          serviceImpl.slashWindow((com.umee.oracle.v1.QueryProto.QuerySlashWindow) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTE:
          serviceImpl.aggregatePrevote((com.umee.oracle.v1.QueryProto.QueryAggregatePrevote) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_PREVOTES:
          serviceImpl.aggregatePrevotes((com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTE:
          serviceImpl.aggregateVote((com.umee.oracle.v1.QueryProto.QueryAggregateVote) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOTES:
          serviceImpl.aggregateVotes((com.umee.oracle.v1.QueryProto.QueryAggregateVotes) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.umee.oracle.v1.QueryProto.QueryParams) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_MEDIANS:
          serviceImpl.medians((com.umee.oracle.v1.QueryProto.QueryMedians) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMediansResponse>) responseObserver);
          break;
        case METHODID_MEDIAN_DEVIATIONS:
          serviceImpl.medianDeviations((com.umee.oracle.v1.QueryProto.QueryMedianDeviations) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse>) responseObserver);
          break;
        case METHODID_AVG_PRICE:
          serviceImpl.avgPrice((com.umee.oracle.v1.QueryProto.QueryAvgPrice) request,
              (io.grpc.stub.StreamObserver<com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse>) responseObserver);
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
          getExchangeRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryExchangeRates,
              com.umee.oracle.v1.QueryProto.QueryExchangeRatesResponse>(
                service, METHODID_EXCHANGE_RATES)))
        .addMethod(
          getActiveExchangeRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryActiveExchangeRates,
              com.umee.oracle.v1.QueryProto.QueryActiveExchangeRatesResponse>(
                service, METHODID_ACTIVE_EXCHANGE_RATES)))
        .addMethod(
          getFeederDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryFeederDelegation,
              com.umee.oracle.v1.QueryProto.QueryFeederDelegationResponse>(
                service, METHODID_FEEDER_DELEGATION)))
        .addMethod(
          getMissCounterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryMissCounter,
              com.umee.oracle.v1.QueryProto.QueryMissCounterResponse>(
                service, METHODID_MISS_COUNTER)))
        .addMethod(
          getSlashWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QuerySlashWindow,
              com.umee.oracle.v1.QueryProto.QuerySlashWindowResponse>(
                service, METHODID_SLASH_WINDOW)))
        .addMethod(
          getAggregatePrevoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryAggregatePrevote,
              com.umee.oracle.v1.QueryProto.QueryAggregatePrevoteResponse>(
                service, METHODID_AGGREGATE_PREVOTE)))
        .addMethod(
          getAggregatePrevotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryAggregatePrevotes,
              com.umee.oracle.v1.QueryProto.QueryAggregatePrevotesResponse>(
                service, METHODID_AGGREGATE_PREVOTES)))
        .addMethod(
          getAggregateVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryAggregateVote,
              com.umee.oracle.v1.QueryProto.QueryAggregateVoteResponse>(
                service, METHODID_AGGREGATE_VOTE)))
        .addMethod(
          getAggregateVotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryAggregateVotes,
              com.umee.oracle.v1.QueryProto.QueryAggregateVotesResponse>(
                service, METHODID_AGGREGATE_VOTES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryParams,
              com.umee.oracle.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getMediansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryMedians,
              com.umee.oracle.v1.QueryProto.QueryMediansResponse>(
                service, METHODID_MEDIANS)))
        .addMethod(
          getMedianDeviationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryMedianDeviations,
              com.umee.oracle.v1.QueryProto.QueryMedianDeviationsResponse>(
                service, METHODID_MEDIAN_DEVIATIONS)))
        .addMethod(
          getAvgPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.oracle.v1.QueryProto.QueryAvgPrice,
              com.umee.oracle.v1.QueryProto.QueryAvgPriceResponse>(
                service, METHODID_AVG_PRICE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.oracle.v1.QueryProto.getDescriptor();
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
              .addMethod(getExchangeRatesMethod())
              .addMethod(getActiveExchangeRatesMethod())
              .addMethod(getFeederDelegationMethod())
              .addMethod(getMissCounterMethod())
              .addMethod(getSlashWindowMethod())
              .addMethod(getAggregatePrevoteMethod())
              .addMethod(getAggregatePrevotesMethod())
              .addMethod(getAggregateVoteMethod())
              .addMethod(getAggregateVotesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getMediansMethod())
              .addMethod(getMedianDeviationsMethod())
              .addMethod(getAvgPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
