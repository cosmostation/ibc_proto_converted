package com.umee.incentive.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: umee/incentive/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "umee.incentive.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryParams,
      com.umee.incentive.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.umee.incentive.v1.QueryProto.QueryParams.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryParams,
      com.umee.incentive.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryParams, com.umee.incentive.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryParams, com.umee.incentive.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalBonded,
      com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> getTotalBondedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalBonded",
      requestType = com.umee.incentive.v1.QueryProto.QueryTotalBonded.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalBonded,
      com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> getTotalBondedMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalBonded, com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> getTotalBondedMethod;
    if ((getTotalBondedMethod = QueryGrpc.getTotalBondedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalBondedMethod = QueryGrpc.getTotalBondedMethod) == null) {
          QueryGrpc.getTotalBondedMethod = getTotalBondedMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryTotalBonded, com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalBonded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryTotalBonded.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalBonded"))
              .build();
        }
      }
    }
    return getTotalBondedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalUnbonding,
      com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> getTotalUnbondingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalUnbonding",
      requestType = com.umee.incentive.v1.QueryProto.QueryTotalUnbonding.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalUnbonding,
      com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> getTotalUnbondingMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryTotalUnbonding, com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> getTotalUnbondingMethod;
    if ((getTotalUnbondingMethod = QueryGrpc.getTotalUnbondingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalUnbondingMethod = QueryGrpc.getTotalUnbondingMethod) == null) {
          QueryGrpc.getTotalUnbondingMethod = getTotalUnbondingMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryTotalUnbonding, com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalUnbonding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryTotalUnbonding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalUnbonding"))
              .build();
        }
      }
    }
    return getTotalUnbondingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryAccountBonds,
      com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> getAccountBondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBonds",
      requestType = com.umee.incentive.v1.QueryProto.QueryAccountBonds.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryAccountBonds,
      com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> getAccountBondsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryAccountBonds, com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> getAccountBondsMethod;
    if ((getAccountBondsMethod = QueryGrpc.getAccountBondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBondsMethod = QueryGrpc.getAccountBondsMethod) == null) {
          QueryGrpc.getAccountBondsMethod = getAccountBondsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryAccountBonds, com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountBonds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryAccountBonds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBonds"))
              .build();
        }
      }
    }
    return getAccountBondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryPendingRewards,
      com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> getPendingRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingRewards",
      requestType = com.umee.incentive.v1.QueryProto.QueryPendingRewards.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryPendingRewards,
      com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> getPendingRewardsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryPendingRewards, com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> getPendingRewardsMethod;
    if ((getPendingRewardsMethod = QueryGrpc.getPendingRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingRewardsMethod = QueryGrpc.getPendingRewardsMethod) == null) {
          QueryGrpc.getPendingRewardsMethod = getPendingRewardsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryPendingRewards, com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryPendingRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingRewards"))
              .build();
        }
      }
    }
    return getPendingRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompletedIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> getCompletedIncentiveProgramsMethod;
    if ((getCompletedIncentiveProgramsMethod = QueryGrpc.getCompletedIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCompletedIncentiveProgramsMethod = QueryGrpc.getCompletedIncentiveProgramsMethod) == null) {
          QueryGrpc.getCompletedIncentiveProgramsMethod = getCompletedIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompletedIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CompletedIncentivePrograms"))
              .build();
        }
      }
    }
    return getCompletedIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OngoingIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> getOngoingIncentiveProgramsMethod;
    if ((getOngoingIncentiveProgramsMethod = QueryGrpc.getOngoingIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOngoingIncentiveProgramsMethod = QueryGrpc.getOngoingIncentiveProgramsMethod) == null) {
          QueryGrpc.getOngoingIncentiveProgramsMethod = getOngoingIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OngoingIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OngoingIncentivePrograms"))
              .build();
        }
      }
    }
    return getOngoingIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingIncentivePrograms",
      requestType = com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms,
      com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> getUpcomingIncentiveProgramsMethod;
    if ((getUpcomingIncentiveProgramsMethod = QueryGrpc.getUpcomingIncentiveProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingIncentiveProgramsMethod = QueryGrpc.getUpcomingIncentiveProgramsMethod) == null) {
          QueryGrpc.getUpcomingIncentiveProgramsMethod = getUpcomingIncentiveProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms, com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingIncentivePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingIncentivePrograms"))
              .build();
        }
      }
    }
    return getUpcomingIncentiveProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryIncentiveProgram,
      com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> getIncentiveProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentiveProgram",
      requestType = com.umee.incentive.v1.QueryProto.QueryIncentiveProgram.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryIncentiveProgram,
      com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> getIncentiveProgramMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryIncentiveProgram, com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> getIncentiveProgramMethod;
    if ((getIncentiveProgramMethod = QueryGrpc.getIncentiveProgramMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentiveProgramMethod = QueryGrpc.getIncentiveProgramMethod) == null) {
          QueryGrpc.getIncentiveProgramMethod = getIncentiveProgramMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryIncentiveProgram, com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentiveProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryIncentiveProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentiveProgram"))
              .build();
        }
      }
    }
    return getIncentiveProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCurrentRates,
      com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> getCurrentRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentRates",
      requestType = com.umee.incentive.v1.QueryProto.QueryCurrentRates.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCurrentRates,
      com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> getCurrentRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryCurrentRates, com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> getCurrentRatesMethod;
    if ((getCurrentRatesMethod = QueryGrpc.getCurrentRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentRatesMethod = QueryGrpc.getCurrentRatesMethod) == null) {
          QueryGrpc.getCurrentRatesMethod = getCurrentRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryCurrentRates, com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryCurrentRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentRates"))
              .build();
        }
      }
    }
    return getCurrentRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryActualRates,
      com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> getActualRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActualRates",
      requestType = com.umee.incentive.v1.QueryProto.QueryActualRates.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryActualRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryActualRates,
      com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> getActualRatesMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryActualRates, com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> getActualRatesMethod;
    if ((getActualRatesMethod = QueryGrpc.getActualRatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActualRatesMethod = QueryGrpc.getActualRatesMethod) == null) {
          QueryGrpc.getActualRatesMethod = getActualRatesMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryActualRates, com.umee.incentive.v1.QueryProto.QueryActualRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActualRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryActualRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryActualRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActualRates"))
              .build();
        }
      }
    }
    return getActualRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryLastRewardTime,
      com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> getLastRewardTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastRewardTime",
      requestType = com.umee.incentive.v1.QueryProto.QueryLastRewardTime.class,
      responseType = com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryLastRewardTime,
      com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> getLastRewardTimeMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.QueryProto.QueryLastRewardTime, com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> getLastRewardTimeMethod;
    if ((getLastRewardTimeMethod = QueryGrpc.getLastRewardTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastRewardTimeMethod = QueryGrpc.getLastRewardTimeMethod) == null) {
          QueryGrpc.getLastRewardTimeMethod = getLastRewardTimeMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.QueryProto.QueryLastRewardTime, com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastRewardTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryLastRewardTime.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse.getDefaultInstance()))
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
    default void params(com.umee.incentive.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    default void totalBonded(com.umee.incentive.v1.QueryProto.QueryTotalBonded request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalBondedMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    default void totalUnbonding(com.umee.incentive.v1.QueryProto.QueryTotalUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalUnbondingMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    default void accountBonds(com.umee.incentive.v1.QueryProto.QueryAccountBonds request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountBondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    default void pendingRewards(com.umee.incentive.v1.QueryProto.QueryPendingRewards request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    default void completedIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompletedIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    default void ongoingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOngoingIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    default void upcomingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingIncentiveProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    default void incentiveProgram(com.umee.incentive.v1.QueryProto.QueryIncentiveProgram request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentiveProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Coins
     * of base token rewards, per reference amount (usually 10^exponent of the uToken.)
     * </pre>
     */
    default void currentRates(com.umee.incentive.v1.QueryProto.QueryCurrentRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActualRates queries the hypothetical return of a bonded uToken denomination
     * if current incentive rewards continued for one year. The response is an sdk.Dec
     * representing an oracle-adjusted APY.
     * </pre>
     */
    default void actualRates(com.umee.incentive.v1.QueryProto.QueryActualRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActualRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    default void lastRewardTime(com.umee.incentive.v1.QueryProto.QueryLastRewardTime request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> responseObserver) {
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
    public void params(com.umee.incentive.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public void totalBonded(com.umee.incentive.v1.QueryProto.QueryTotalBonded request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalBondedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public void totalUnbonding(com.umee.incentive.v1.QueryProto.QueryTotalUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalUnbondingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public void accountBonds(com.umee.incentive.v1.QueryProto.QueryAccountBonds request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountBondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public void pendingRewards(com.umee.incentive.v1.QueryProto.QueryPendingRewards request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public void completedIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompletedIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public void ongoingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOngoingIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public void upcomingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingIncentiveProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public void incentiveProgram(com.umee.incentive.v1.QueryProto.QueryIncentiveProgram request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> responseObserver) {
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
    public void currentRates(com.umee.incentive.v1.QueryProto.QueryCurrentRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> responseObserver) {
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
    public void actualRates(com.umee.incentive.v1.QueryProto.QueryActualRates request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActualRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public void lastRewardTime(com.umee.incentive.v1.QueryProto.QueryLastRewardTime request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> responseObserver) {
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
    public com.umee.incentive.v1.QueryProto.QueryParamsResponse params(com.umee.incentive.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse totalBonded(com.umee.incentive.v1.QueryProto.QueryTotalBonded request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalBondedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse totalUnbonding(com.umee.incentive.v1.QueryProto.QueryTotalUnbonding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalUnbondingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse accountBonds(com.umee.incentive.v1.QueryProto.QueryAccountBonds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountBondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse pendingRewards(com.umee.incentive.v1.QueryProto.QueryPendingRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse completedIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompletedIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse ongoingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOngoingIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse upcomingIncentivePrograms(com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingIncentiveProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse incentiveProgram(com.umee.incentive.v1.QueryProto.QueryIncentiveProgram request) {
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
    public com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse currentRates(com.umee.incentive.v1.QueryProto.QueryCurrentRates request) {
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
    public com.umee.incentive.v1.QueryProto.QueryActualRatesResponse actualRates(com.umee.incentive.v1.QueryProto.QueryActualRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActualRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse lastRewardTime(com.umee.incentive.v1.QueryProto.QueryLastRewardTime request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryParamsResponse> params(
        com.umee.incentive.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalBonded queries the sum of all bonded collateral uTokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse> totalBonded(
        com.umee.incentive.v1.QueryProto.QueryTotalBonded request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalBondedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalUnbonding queries the sum of all unbonding collateral uTokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse> totalUnbonding(
        com.umee.incentive.v1.QueryProto.QueryTotalUnbonding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalUnbondingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountBonds queries all bonded collateral and unbondings associated with an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse> accountBonds(
        com.umee.incentive.v1.QueryProto.QueryAccountBonds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountBondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PendingRewards queries unclaimed incentive rewards associated with an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse> pendingRewards(
        com.umee.incentive.v1.QueryProto.QueryPendingRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CompletedIncentivePrograms queries for all incentives programs that have been passed
     * by governance, and either run to completion or expired immediately due to not being funded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse> completedIncentivePrograms(
        com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompletedIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OngoingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, funded, and started but not yet completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse> ongoingIncentivePrograms(
        com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOngoingIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpcomingIncentivePrograms queries for all incentives programs that have been passed
     * by governance, but not yet started. They may or may not have been funded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse> upcomingIncentivePrograms(
        com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingIncentiveProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentiveProgram queries a single incentive program by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse> incentiveProgram(
        com.umee.incentive.v1.QueryProto.QueryIncentiveProgram request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse> currentRates(
        com.umee.incentive.v1.QueryProto.QueryCurrentRates request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryActualRatesResponse> actualRates(
        com.umee.incentive.v1.QueryProto.QueryActualRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActualRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastRewardTime queries the last block time at which incentive rewards were calculated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse> lastRewardTime(
        com.umee.incentive.v1.QueryProto.QueryLastRewardTime request) {
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
          serviceImpl.params((com.umee.incentive.v1.QueryProto.QueryParams) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_BONDED:
          serviceImpl.totalBonded((com.umee.incentive.v1.QueryProto.QueryTotalBonded) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse>) responseObserver);
          break;
        case METHODID_TOTAL_UNBONDING:
          serviceImpl.totalUnbonding((com.umee.incentive.v1.QueryProto.QueryTotalUnbonding) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BONDS:
          serviceImpl.accountBonds((com.umee.incentive.v1.QueryProto.QueryAccountBonds) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse>) responseObserver);
          break;
        case METHODID_PENDING_REWARDS:
          serviceImpl.pendingRewards((com.umee.incentive.v1.QueryProto.QueryPendingRewards) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse>) responseObserver);
          break;
        case METHODID_COMPLETED_INCENTIVE_PROGRAMS:
          serviceImpl.completedIncentivePrograms((com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_ONGOING_INCENTIVE_PROGRAMS:
          serviceImpl.ongoingIncentivePrograms((com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_INCENTIVE_PROGRAMS:
          serviceImpl.upcomingIncentivePrograms((com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVE_PROGRAM:
          serviceImpl.incentiveProgram((com.umee.incentive.v1.QueryProto.QueryIncentiveProgram) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse>) responseObserver);
          break;
        case METHODID_CURRENT_RATES:
          serviceImpl.currentRates((com.umee.incentive.v1.QueryProto.QueryCurrentRates) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse>) responseObserver);
          break;
        case METHODID_ACTUAL_RATES:
          serviceImpl.actualRates((com.umee.incentive.v1.QueryProto.QueryActualRates) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryActualRatesResponse>) responseObserver);
          break;
        case METHODID_LAST_REWARD_TIME:
          serviceImpl.lastRewardTime((com.umee.incentive.v1.QueryProto.QueryLastRewardTime) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse>) responseObserver);
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
              com.umee.incentive.v1.QueryProto.QueryParams,
              com.umee.incentive.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTotalBondedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryTotalBonded,
              com.umee.incentive.v1.QueryProto.QueryTotalBondedResponse>(
                service, METHODID_TOTAL_BONDED)))
        .addMethod(
          getTotalUnbondingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryTotalUnbonding,
              com.umee.incentive.v1.QueryProto.QueryTotalUnbondingResponse>(
                service, METHODID_TOTAL_UNBONDING)))
        .addMethod(
          getAccountBondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryAccountBonds,
              com.umee.incentive.v1.QueryProto.QueryAccountBondsResponse>(
                service, METHODID_ACCOUNT_BONDS)))
        .addMethod(
          getPendingRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryPendingRewards,
              com.umee.incentive.v1.QueryProto.QueryPendingRewardsResponse>(
                service, METHODID_PENDING_REWARDS)))
        .addMethod(
          getCompletedIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryCompletedIncentivePrograms,
              com.umee.incentive.v1.QueryProto.QueryCompletedIncentiveProgramsResponse>(
                service, METHODID_COMPLETED_INCENTIVE_PROGRAMS)))
        .addMethod(
          getOngoingIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryOngoingIncentivePrograms,
              com.umee.incentive.v1.QueryProto.QueryOngoingIncentiveProgramsResponse>(
                service, METHODID_ONGOING_INCENTIVE_PROGRAMS)))
        .addMethod(
          getUpcomingIncentiveProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryUpcomingIncentivePrograms,
              com.umee.incentive.v1.QueryProto.QueryUpcomingIncentiveProgramsResponse>(
                service, METHODID_UPCOMING_INCENTIVE_PROGRAMS)))
        .addMethod(
          getIncentiveProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryIncentiveProgram,
              com.umee.incentive.v1.QueryProto.QueryIncentiveProgramResponse>(
                service, METHODID_INCENTIVE_PROGRAM)))
        .addMethod(
          getCurrentRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryCurrentRates,
              com.umee.incentive.v1.QueryProto.QueryCurrentRatesResponse>(
                service, METHODID_CURRENT_RATES)))
        .addMethod(
          getActualRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryActualRates,
              com.umee.incentive.v1.QueryProto.QueryActualRatesResponse>(
                service, METHODID_ACTUAL_RATES)))
        .addMethod(
          getLastRewardTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.QueryProto.QueryLastRewardTime,
              com.umee.incentive.v1.QueryProto.QueryLastRewardTimeResponse>(
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
