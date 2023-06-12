package com.umee.incentive.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: umee/incentive/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "umee.incentive.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryParams,
      com.umee.incentive.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.umee.incentive.v1.QueryParams.class,
      responseType = com.umee.incentive.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryParams,
      com.umee.incentive.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryParams, com.umee.incentive.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryParams, com.umee.incentive.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalBonded,
      com.umee.incentive.v1.QueryTotalBondedResponse> getTotalBondedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalBonded",
      requestType = com.umee.incentive.v1.QueryTotalBonded.class,
      responseType = com.umee.incentive.v1.QueryTotalBondedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalBonded,
      com.umee.incentive.v1.QueryTotalBondedResponse> getTotalBondedMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalBonded, com.umee.incentive.v1.QueryTotalBondedResponse> getTotalBondedMethod;
    if ((getTotalBondedMethod = QueryGrpc.getTotalBondedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalBondedMethod = QueryGrpc.getTotalBondedMethod) == null) {
          QueryGrpc.getTotalBondedMethod = getTotalBondedMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryTotalBonded, com.umee.incentive.v1.QueryTotalBondedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalBonded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryTotalBonded.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryTotalBondedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalBonded"))
              .build();
        }
      }
    }
    return getTotalBondedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalUnbonding,
      com.umee.incentive.v1.QueryTotalUnbondingResponse> getTotalUnbondingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalUnbonding",
      requestType = com.umee.incentive.v1.QueryTotalUnbonding.class,
      responseType = com.umee.incentive.v1.QueryTotalUnbondingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalUnbonding,
      com.umee.incentive.v1.QueryTotalUnbondingResponse> getTotalUnbondingMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryTotalUnbonding, com.umee.incentive.v1.QueryTotalUnbondingResponse> getTotalUnbondingMethod;
    if ((getTotalUnbondingMethod = QueryGrpc.getTotalUnbondingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalUnbondingMethod = QueryGrpc.getTotalUnbondingMethod) == null) {
          QueryGrpc.getTotalUnbondingMethod = getTotalUnbondingMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryTotalUnbonding, com.umee.incentive.v1.QueryTotalUnbondingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalUnbonding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryTotalUnbonding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryTotalUnbondingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalUnbonding"))
              .build();
        }
      }
    }
    return getTotalUnbondingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryAccountBonds,
      com.umee.incentive.v1.QueryAccountBondsResponse> getAccountBondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBonds",
      requestType = com.umee.incentive.v1.QueryAccountBonds.class,
      responseType = com.umee.incentive.v1.QueryAccountBondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryAccountBonds,
      com.umee.incentive.v1.QueryAccountBondsResponse> getAccountBondsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryAccountBonds, com.umee.incentive.v1.QueryAccountBondsResponse> getAccountBondsMethod;
    if ((getAccountBondsMethod = QueryGrpc.getAccountBondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBondsMethod = QueryGrpc.getAccountBondsMethod) == null) {
          QueryGrpc.getAccountBondsMethod = getAccountBondsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryAccountBonds, com.umee.incentive.v1.QueryAccountBondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountBonds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryAccountBonds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryAccountBondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBonds"))
              .build();
        }
      }
    }
    return getAccountBondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryPendingRewards,
      com.umee.incentive.v1.QueryPendingRewardsResponse> getPendingRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingRewards",
      requestType = com.umee.incentive.v1.QueryPendingRewards.class,
      responseType = com.umee.incentive.v1.QueryPendingRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryPendingRewards,
      com.umee.incentive.v1.QueryPendingRewardsResponse> getPendingRewardsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryPendingRewards, com.umee.incentive.v1.QueryPendingRewardsResponse> getPendingRewardsMethod;
    if ((getPendingRewardsMethod = QueryGrpc.getPendingRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingRewardsMethod = QueryGrpc.getPendingRewardsMethod) == null) {
          QueryGrpc.getPendingRewardsMethod = getPendingRewardsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryPendingRewards, com.umee.incentive.v1.QueryPendingRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryPendingRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryPendingRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingRewards"))
              .build();
        }
      }
    }
    return getPendingRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCompletedIncentivePrograms,
      com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompletedIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryCompletedIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCompletedIncentivePrograms,
      com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCompletedIncentivePrograms, com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod;
    if ((getCompletedIncentiveProgramsMethod = QueryGrpc.getCompletedIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCompletedIncentiveProgramsMethod = QueryGrpc.getCompletedIncentiveProgramsMethod) == null) {
          QueryGrpc.getCompletedIncentiveProgramsMethod = getCompletedIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryCompletedIncentivePrograms, com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompletedIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryCompletedIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CompletedIncentivePrograms"))
              .build();
        }
      }
    }
    return getCompletedIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryOngoingIncentivePrograms,
      com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OngoingIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryOngoingIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryOngoingIncentivePrograms,
      com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryOngoingIncentivePrograms, com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod;
    if ((getOngoingIncentiveProgramsMethod = QueryGrpc.getOngoingIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOngoingIncentiveProgramsMethod = QueryGrpc.getOngoingIncentiveProgramsMethod) == null) {
          QueryGrpc.getOngoingIncentiveProgramsMethod = getOngoingIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryOngoingIncentivePrograms, com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OngoingIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryOngoingIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OngoingIncentivePrograms"))
              .build();
        }
      }
    }
    return getOngoingIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryUpcomingIncentivePrograms,
      com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryUpcomingIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryUpcomingIncentivePrograms,
      com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryUpcomingIncentivePrograms, com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod;
    if ((getUpcomingIncentiveProgramsMethod = QueryGrpc.getUpcomingIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingIncentiveProgramsMethod = QueryGrpc.getUpcomingIncentiveProgramsMethod) == null) {
          QueryGrpc.getUpcomingIncentiveProgramsMethod = getUpcomingIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryUpcomingIncentivePrograms, com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryUpcomingIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingIncentivePrograms"))
              .build();
        }
      }
    }
    return getUpcomingIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryIncentiveProgram,
      com.umee.incentive.v1.QueryIncentiveProgramResponse> getIncentiveProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentiveProgram",
      requestType = com.umee.incentive.v1.QueryIncentiveProgram.class,
      responseType = com.umee.incentive.v1.QueryIncentiveProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryIncentiveProgram,
      com.umee.incentive.v1.QueryIncentiveProgramResponse> getIncentiveProgramMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryIncentiveProgram, com.umee.incentive.v1.QueryIncentiveProgramResponse> getIncentiveProgramMethod;
    if ((getIncentiveProgramMethod = QueryGrpc.getIncentiveProgramMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentiveProgramMethod = QueryGrpc.getIncentiveProgramMethod) == null) {
          QueryGrpc.getIncentiveProgramMethod = getIncentiveProgramMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryIncentiveProgram, com.umee.incentive.v1.QueryIncentiveProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentiveProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryIncentiveProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryIncentiveProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentiveProgram"))
              .build();
        }
      }
    }
    return getIncentiveProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCurrentRates,
      com.umee.incentive.v1.QueryCurrentRatesResponse> getCurrentRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentRates",
      requestType = com.umee.incentive.v1.QueryCurrentRates.class,
      responseType = com.umee.incentive.v1.QueryCurrentRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCurrentRates,
      com.umee.incentive.v1.QueryCurrentRatesResponse> getCurrentRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryCurrentRates, com.umee.incentive.v1.QueryCurrentRatesResponse> getCurrentRatesMethod;
    if ((getCurrentRatesMethod = QueryGrpc.getCurrentRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentRatesMethod = QueryGrpc.getCurrentRatesMethod) == null) {
          QueryGrpc.getCurrentRatesMethod = getCurrentRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryCurrentRates, com.umee.incentive.v1.QueryCurrentRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryCurrentRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryCurrentRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentRates"))
              .build();
        }
      }
    }
    return getCurrentRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryActualRates,
      com.umee.incentive.v1.QueryActualRatesResponse> getActualRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActualRates",
      requestType = com.umee.incentive.v1.QueryActualRates.class,
      responseType = com.umee.incentive.v1.QueryActualRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryActualRates,
      com.umee.incentive.v1.QueryActualRatesResponse> getActualRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryActualRates, com.umee.incentive.v1.QueryActualRatesResponse> getActualRatesMethod;
    if ((getActualRatesMethod = QueryGrpc.getActualRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActualRatesMethod = QueryGrpc.getActualRatesMethod) == null) {
          QueryGrpc.getActualRatesMethod = getActualRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryActualRates, com.umee.incentive.v1.QueryActualRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActualRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryActualRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryActualRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActualRates"))
              .build();
        }
      }
    }
    return getActualRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryLastRewardTime,
      com.umee.incentive.v1.QueryLastRewardTimeResponse> getLastRewardTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastRewardTime",
      requestType = com.umee.incentive.v1.QueryLastRewardTime.class,
      responseType = com.umee.incentive.v1.QueryLastRewardTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryLastRewardTime,
      com.umee.incentive.v1.QueryLastRewardTimeResponse> getLastRewardTimeMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryLastRewardTime, com.umee.incentive.v1.QueryLastRewardTimeResponse> getLastRewardTimeMethod;
    if ((getLastRewardTimeMethod = QueryGrpc.getLastRewardTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastRewardTimeMethod = QueryGrpc.getLastRewardTimeMethod) == null) {
          QueryGrpc.getLastRewardTimeMethod = getLastRewardTimeMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryLastRewardTime, com.umee.incentive.v1.QueryLastRewardTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastRewardTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryLastRewardTime.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryLastRewardTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastRewardTime"))
              .build();
        }
      }
    }
    return getLastRewardTimeMethod;
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
     * Params queries the parameters of the x/incentive module.
     * </pre>
     */
    default void params(com.umee.incentive.v1.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    default void totalBonded(com.umee.incentive.v1.QueryTotalBonded request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalBondedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalBondedMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    default void totalUnbonding(com.umee.incentive.v1.QueryTotalUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalUnbondingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalUnbondingMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    default void accountBonds(com.umee.incentive.v1.QueryAccountBonds request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryAccountBondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountBondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    default void pendingRewards(com.umee.incentive.v1.QueryPendingRewards request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryPendingRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    default void completedIncentivePrograms(com.umee.incentive.v1.QueryCompletedIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletedIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    default void ongoingIncentivePrograms(com.umee.incentive.v1.QueryOngoingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOngoingIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    default void upcomingIncentivePrograms(com.umee.incentive.v1.QueryUpcomingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    default void incentiveProgram(com.umee.incentive.v1.QueryIncentiveProgram request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryIncentiveProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentiveProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Coins
     * of base token rewards, per reference amount (usually 10^exponent of the uToken.)
     * </pre>
     */
    default void currentRates(com.umee.incentive.v1.QueryCurrentRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCurrentRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActualRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Dec
     * representing an oracle-adjusted APY.
     * </pre>
     */
    default void actualRates(com.umee.incentive.v1.QueryActualRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryActualRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActualRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    default void lastRewardTime(com.umee.incentive.v1.QueryLastRewardTime request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryLastRewardTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastRewardTimeMethod(), responseObserver);
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
     * Params queries the parameters of the x/incentive module.
     * </pre>
     */
    public void params(com.umee.incentive.v1.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public void totalBonded(com.umee.incentive.v1.QueryTotalBonded request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalBondedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalBondedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public void totalUnbonding(com.umee.incentive.v1.QueryTotalUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalUnbondingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalUnbondingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public void accountBonds(com.umee.incentive.v1.QueryAccountBonds request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryAccountBondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountBondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public void pendingRewards(com.umee.incentive.v1.QueryPendingRewards request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryPendingRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public void completedIncentivePrograms(com.umee.incentive.v1.QueryCompletedIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompletedIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public void ongoingIncentivePrograms(com.umee.incentive.v1.QueryOngoingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOngoingIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public void upcomingIncentivePrograms(com.umee.incentive.v1.QueryUpcomingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public void incentiveProgram(com.umee.incentive.v1.QueryIncentiveProgram request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryIncentiveProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentiveProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Coins
     * of base token rewards, per reference amount (usually 10^exponent of the uToken.)
     * </pre>
     */
    public void currentRates(com.umee.incentive.v1.QueryCurrentRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCurrentRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActualRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Dec
     * representing an oracle-adjusted APY.
     * </pre>
     */
    public void actualRates(com.umee.incentive.v1.QueryActualRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryActualRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActualRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public void lastRewardTime(com.umee.incentive.v1.QueryLastRewardTime request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryLastRewardTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastRewardTimeMethod(), getCallOptions()), request, responseObserver);
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
     * Params queries the parameters of the x/incentive module.
     * </pre>
     */
    public com.umee.incentive.v1.QueryParamsResponse params(com.umee.incentive.v1.QueryParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public com.umee.incentive.v1.QueryTotalBondedResponse totalBonded(com.umee.incentive.v1.QueryTotalBonded request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalBondedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public com.umee.incentive.v1.QueryTotalUnbondingResponse totalUnbonding(com.umee.incentive.v1.QueryTotalUnbonding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalUnbondingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public com.umee.incentive.v1.QueryAccountBondsResponse accountBonds(com.umee.incentive.v1.QueryAccountBonds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountBondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public com.umee.incentive.v1.QueryPendingRewardsResponse pendingRewards(com.umee.incentive.v1.QueryPendingRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse completedIncentivePrograms(com.umee.incentive.v1.QueryCompletedIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompletedIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse ongoingIncentivePrograms(com.umee.incentive.v1.QueryOngoingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOngoingIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse upcomingIncentivePrograms(com.umee.incentive.v1.QueryUpcomingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public com.umee.incentive.v1.QueryIncentiveProgramResponse incentiveProgram(com.umee.incentive.v1.QueryIncentiveProgram request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentiveProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Coins
     * of base token rewards, per reference amount (usually 10^exponent of the uToken.)
     * </pre>
     */
    public com.umee.incentive.v1.QueryCurrentRatesResponse currentRates(com.umee.incentive.v1.QueryCurrentRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActualRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Dec
     * representing an oracle-adjusted APY.
     * </pre>
     */
    public com.umee.incentive.v1.QueryActualRatesResponse actualRates(com.umee.incentive.v1.QueryActualRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActualRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public com.umee.incentive.v1.QueryLastRewardTimeResponse lastRewardTime(com.umee.incentive.v1.QueryLastRewardTime request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastRewardTimeMethod(), getCallOptions(), request);
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
     * Params queries the parameters of the x/incentive module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryParamsResponse> params(
        com.umee.incentive.v1.QueryParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryTotalBondedResponse> totalBonded(
        com.umee.incentive.v1.QueryTotalBonded request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalBondedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryTotalUnbondingResponse> totalUnbonding(
        com.umee.incentive.v1.QueryTotalUnbonding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalUnbondingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryAccountBondsResponse> accountBonds(
        com.umee.incentive.v1.QueryAccountBonds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountBondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryPendingRewardsResponse> pendingRewards(
        com.umee.incentive.v1.QueryPendingRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse> completedIncentivePrograms(
        com.umee.incentive.v1.QueryCompletedIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompletedIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse> ongoingIncentivePrograms(
        com.umee.incentive.v1.QueryOngoingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOngoingIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse> upcomingIncentivePrograms(
        com.umee.incentive.v1.QueryUpcomingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryIncentiveProgramResponse> incentiveProgram(
        com.umee.incentive.v1.QueryIncentiveProgram request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentiveProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Coins
     * of base token rewards, per reference amount (usually 10^exponent of the uToken.)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryCurrentRatesResponse> currentRates(
        com.umee.incentive.v1.QueryCurrentRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActualRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Dec
     * representing an oracle-adjusted APY.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryActualRatesResponse> actualRates(
        com.umee.incentive.v1.QueryActualRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActualRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryLastRewardTimeResponse> lastRewardTime(
        com.umee.incentive.v1.QueryLastRewardTime request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastRewardTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_TOTAL_BONDED = 1;
  private static final int METHODID_TOTAL_UNBONDING = 2;
  private static final int METHODID_ACCOUNT_BONDS = 3;
  private static final int METHODID_PENDING_REWARDS = 4;
  private static final int METHODID_COMPLETED_INCENTIVE_PROGRAMS = 5;
  private static final int METHODID_ONGOING_INCENTIVE_PROGRAMS = 6;
  private static final int METHODID_UPCOMING_INCENTIVE_PROGRAMS = 7;
  private static final int METHODID_INCENTIVE_PROGRAM = 8;
  private static final int METHODID_CURRENT_RATES = 9;
  private static final int METHODID_ACTUAL_RATES = 10;
  private static final int METHODID_LAST_REWARD_TIME = 11;

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
          serviceImpl.params((com.umee.incentive.v1.QueryParams) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_BONDED:
          serviceImpl.totalBonded((com.umee.incentive.v1.QueryTotalBonded) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalBondedResponse>) responseObserver);
          break;
        case METHODID_TOTAL_UNBONDING:
          serviceImpl.totalUnbonding((com.umee.incentive.v1.QueryTotalUnbonding) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryTotalUnbondingResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BONDS:
          serviceImpl.accountBonds((com.umee.incentive.v1.QueryAccountBonds) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryAccountBondsResponse>) responseObserver);
          break;
        case METHODID_PENDING_REWARDS:
          serviceImpl.pendingRewards((com.umee.incentive.v1.QueryPendingRewards) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryPendingRewardsResponse>) responseObserver);
          break;
        case METHODID_COMPLETED_INCENTIVE_PROGRAMS:
          serviceImpl.completedIncentivePrograms((com.umee.incentive.v1.QueryCompletedIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_ONGOING_INCENTIVE_PROGRAMS:
          serviceImpl.ongoingIncentivePrograms((com.umee.incentive.v1.QueryOngoingIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_INCENTIVE_PROGRAMS:
          serviceImpl.upcomingIncentivePrograms((com.umee.incentive.v1.QueryUpcomingIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVE_PROGRAM:
          serviceImpl.incentiveProgram((com.umee.incentive.v1.QueryIncentiveProgram) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryIncentiveProgramResponse>) responseObserver);
          break;
        case METHODID_CURRENT_RATES:
          serviceImpl.currentRates((com.umee.incentive.v1.QueryCurrentRates) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryCurrentRatesResponse>) responseObserver);
          break;
        case METHODID_ACTUAL_RATES:
          serviceImpl.actualRates((com.umee.incentive.v1.QueryActualRates) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryActualRatesResponse>) responseObserver);
          break;
        case METHODID_LAST_REWARD_TIME:
          serviceImpl.lastRewardTime((com.umee.incentive.v1.QueryLastRewardTime) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryLastRewardTimeResponse>) responseObserver);
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
              com.umee.incentive.v1.QueryParams,
              com.umee.incentive.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTotalBondedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryTotalBonded,
              com.umee.incentive.v1.QueryTotalBondedResponse>(
                service, METHODID_TOTAL_BONDED)))
        .addMethod(
          getTotalUnbondingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryTotalUnbonding,
              com.umee.incentive.v1.QueryTotalUnbondingResponse>(
                service, METHODID_TOTAL_UNBONDING)))
        .addMethod(
          getAccountBondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryAccountBonds,
              com.umee.incentive.v1.QueryAccountBondsResponse>(
                service, METHODID_ACCOUNT_BONDS)))
        .addMethod(
          getPendingRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryPendingRewards,
              com.umee.incentive.v1.QueryPendingRewardsResponse>(
                service, METHODID_PENDING_REWARDS)))
        .addMethod(
          getCompletedIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryCompletedIncentivePrograms,
              com.umee.incentive.v1.QueryCompletedIncentiveProgramsResponse>(
                service, METHODID_COMPLETED_INCENTIVE_PROGRAMS)))
        .addMethod(
          getOngoingIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryOngoingIncentivePrograms,
              com.umee.incentive.v1.QueryOngoingIncentiveProgramsResponse>(
                service, METHODID_ONGOING_INCENTIVE_PROGRAMS)))
        .addMethod(
          getUpcomingIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryUpcomingIncentivePrograms,
              com.umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse>(
                service, METHODID_UPCOMING_INCENTIVE_PROGRAMS)))
        .addMethod(
          getIncentiveProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryIncentiveProgram,
              com.umee.incentive.v1.QueryIncentiveProgramResponse>(
                service, METHODID_INCENTIVE_PROGRAM)))
        .addMethod(
          getCurrentRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryCurrentRates,
              com.umee.incentive.v1.QueryCurrentRatesResponse>(
                service, METHODID_CURRENT_RATES)))
        .addMethod(
          getActualRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryActualRates,
              com.umee.incentive.v1.QueryActualRatesResponse>(
                service, METHODID_ACTUAL_RATES)))
        .addMethod(
          getLastRewardTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryLastRewardTime,
              com.umee.incentive.v1.QueryLastRewardTimeResponse>(
                service, METHODID_LAST_REWARD_TIME)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.incentive.v1.QueryProto.getDescriptor();
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
              .addMethod(getTotalBondedMethod())
              .addMethod(getTotalUnbondingMethod())
              .addMethod(getAccountBondsMethod())
              .addMethod(getPendingRewardsMethod())
              .addMethod(getCompletedIncentiveProgramsMethod())
              .addMethod(getOngoingIncentiveProgramsMethod())
              .addMethod(getUpcomingIncentiveProgramsMethod())
              .addMethod(getIncentiveProgramMethod())
              .addMethod(getCurrentRatesMethod())
              .addMethod(getActualRatesMethod())
              .addMethod(getLastRewardTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
