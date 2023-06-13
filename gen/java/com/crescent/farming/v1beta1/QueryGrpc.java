package com.crescent.farming.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC query service for the farming module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: crescent/farming/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "crescent.farming.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest, com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest, com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> getPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plans",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> getPlansMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest, com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> getPlansMethod;
    if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
          QueryGrpc.getPlansMethod = getPlansMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest, com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plans"))
              .build();
        }
      }
    }
    return getPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> getPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plan",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> getPlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest, com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> getPlanMethod;
    if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
          QueryGrpc.getPlanMethod = getPlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest, com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plan"))
              .build();
        }
      }
    }
    return getPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> getPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Position",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> getPositionMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest, com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> getPositionMethod;
    if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
          QueryGrpc.getPositionMethod = getPositionMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest, com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Position"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Position"))
              .build();
        }
      }
    }
    return getPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> getStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stakings",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> getStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> getStakingsMethod;
    if ((getStakingsMethod = QueryGrpc.getStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakingsMethod = QueryGrpc.getStakingsMethod) == null) {
          QueryGrpc.getStakingsMethod = getStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Stakings"))
              .build();
        }
      }
    }
    return getStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> getQueuedStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueuedStakings",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> getQueuedStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> getQueuedStakingsMethod;
    if ((getQueuedStakingsMethod = QueryGrpc.getQueuedStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueuedStakingsMethod = QueryGrpc.getQueuedStakingsMethod) == null) {
          QueryGrpc.getQueuedStakingsMethod = getQueuedStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueuedStakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueuedStakings"))
              .build();
        }
      }
    }
    return getQueuedStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> getTotalStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalStakings",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> getTotalStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> getTotalStakingsMethod;
    if ((getTotalStakingsMethod = QueryGrpc.getTotalStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalStakingsMethod = QueryGrpc.getTotalStakingsMethod) == null) {
          QueryGrpc.getTotalStakingsMethod = getTotalStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest, com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalStakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalStakings"))
              .build();
        }
      }
    }
    return getTotalStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rewards",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod;
    if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
          QueryGrpc.getRewardsMethod = getRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Rewards"))
              .build();
        }
      }
    }
    return getRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnharvestedRewards",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod;
    if ((getUnharvestedRewardsMethod = QueryGrpc.getUnharvestedRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnharvestedRewardsMethod = QueryGrpc.getUnharvestedRewardsMethod) == null) {
          QueryGrpc.getUnharvestedRewardsMethod = getUnharvestedRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnharvestedRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnharvestedRewards"))
              .build();
        }
      }
    }
    return getUnharvestedRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentEpochDays",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest, com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod;
    if ((getCurrentEpochDaysMethod = QueryGrpc.getCurrentEpochDaysMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentEpochDaysMethod = QueryGrpc.getCurrentEpochDaysMethod) == null) {
          QueryGrpc.getCurrentEpochDaysMethod = getCurrentEpochDaysMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest, com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentEpochDays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentEpochDays"))
              .build();
        }
      }
    }
    return getCurrentEpochDaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalRewards",
      requestType = com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest,
      com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;
    if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
          QueryGrpc.getHistoricalRewardsMethod = getHistoricalRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest, com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalRewards"))
              .build();
        }
      }
    }
    return getHistoricalRewardsMethod;
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
   * Query defines the gRPC query service for the farming module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns parameters of the farming module.
     * </pre>
     */
    default void params(com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    default void plans(com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    default void plan(com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanMethod(), responseObserver);
    }

    /**
     */
    default void position(com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    default void stakings(com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    default void queuedStakings(com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueuedStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    default void totalStakings(com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    default void rewards(com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    default void unharvestedRewards(com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnharvestedRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    default void currentEpochDays(com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentEpochDaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    default void historicalRewards(com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalRewardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC query service for the farming module.
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
   * Query defines the gRPC query service for the farming module.
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
     * Params returns parameters of the farming module.
     * </pre>
     */
    public void params(com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public void plans(com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public void plan(com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void position(com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public void stakings(com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public void queuedStakings(com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueuedStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public void totalStakings(com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public void rewards(com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public void unharvestedRewards(com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnharvestedRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public void currentEpochDays(com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentEpochDaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public void historicalRewards(com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the farming module.
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
     * Params returns parameters of the farming module.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse params(com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse plans(com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse plan(com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse position(com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse stakings(com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse queuedStakings(com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueuedStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse totalStakings(com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse rewards(com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse unharvestedRewards(com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnharvestedRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse currentEpochDays(com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentEpochDaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse historicalRewards(com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the farming module.
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
     * Params returns parameters of the farming module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse> params(
        com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse> plans(
        com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse> plan(
        com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse> position(
        com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse> stakings(
        com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse> queuedStakings(
        com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueuedStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse> totalStakings(
        com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse> rewards(
        com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse> unharvestedRewards(
        com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnharvestedRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse> currentEpochDays(
        com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentEpochDaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse> historicalRewards(
        com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_PLANS = 1;
  private static final int METHODID_PLAN = 2;
  private static final int METHODID_POSITION = 3;
  private static final int METHODID_STAKINGS = 4;
  private static final int METHODID_QUEUED_STAKINGS = 5;
  private static final int METHODID_TOTAL_STAKINGS = 6;
  private static final int METHODID_REWARDS = 7;
  private static final int METHODID_UNHARVESTED_REWARDS = 8;
  private static final int METHODID_CURRENT_EPOCH_DAYS = 9;
  private static final int METHODID_HISTORICAL_REWARDS = 10;

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
          serviceImpl.params((com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_PLANS:
          serviceImpl.plans((com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse>) responseObserver);
          break;
        case METHODID_PLAN:
          serviceImpl.plan((com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse>) responseObserver);
          break;
        case METHODID_POSITION:
          serviceImpl.position((com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse>) responseObserver);
          break;
        case METHODID_STAKINGS:
          serviceImpl.stakings((com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse>) responseObserver);
          break;
        case METHODID_QUEUED_STAKINGS:
          serviceImpl.queuedStakings((com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_STAKINGS:
          serviceImpl.totalStakings((com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse>) responseObserver);
          break;
        case METHODID_REWARDS:
          serviceImpl.rewards((com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse>) responseObserver);
          break;
        case METHODID_UNHARVESTED_REWARDS:
          serviceImpl.unharvestedRewards((com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_EPOCH_DAYS:
          serviceImpl.currentEpochDays((com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_REWARDS:
          serviceImpl.historicalRewards((com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse>) responseObserver);
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
              com.crescent.farming.v1beta1.QueryProto.QueryParamsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryPlansRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryPlansResponse>(
                service, METHODID_PLANS)))
        .addMethod(
          getPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryPlanRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryPlanResponse>(
                service, METHODID_PLAN)))
        .addMethod(
          getPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryPositionRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryPositionResponse>(
                service, METHODID_POSITION)))
        .addMethod(
          getStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryStakingsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryStakingsResponse>(
                service, METHODID_STAKINGS)))
        .addMethod(
          getQueuedStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryQueuedStakingsResponse>(
                service, METHODID_QUEUED_STAKINGS)))
        .addMethod(
          getTotalStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryTotalStakingsResponse>(
                service, METHODID_TOTAL_STAKINGS)))
        .addMethod(
          getRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryRewardsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryRewardsResponse>(
                service, METHODID_REWARDS)))
        .addMethod(
          getUnharvestedRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryUnharvestedRewardsResponse>(
                service, METHODID_UNHARVESTED_REWARDS)))
        .addMethod(
          getCurrentEpochDaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryCurrentEpochDaysResponse>(
                service, METHODID_CURRENT_EPOCH_DAYS)))
        .addMethod(
          getHistoricalRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsRequest,
              com.crescent.farming.v1beta1.QueryProto.QueryHistoricalRewardsResponse>(
                service, METHODID_HISTORICAL_REWARDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.farming.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getPlansMethod())
              .addMethod(getPlanMethod())
              .addMethod(getPositionMethod())
              .addMethod(getStakingsMethod())
              .addMethod(getQueuedStakingsMethod())
              .addMethod(getTotalStakingsMethod())
              .addMethod(getRewardsMethod())
              .addMethod(getUnharvestedRewardsMethod())
              .addMethod(getCurrentEpochDaysMethod())
              .addMethod(getHistoricalRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
