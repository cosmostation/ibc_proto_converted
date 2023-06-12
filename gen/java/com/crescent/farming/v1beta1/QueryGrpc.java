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
  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryParamsRequest,
      com.crescent.farming.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.farming.v1beta1.QueryParamsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryParamsRequest,
      com.crescent.farming.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryParamsRequest, com.crescent.farming.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryParamsRequest, com.crescent.farming.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlansRequest,
      com.crescent.farming.v1beta1.QueryPlansResponse> getPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plans",
      requestType = com.crescent.farming.v1beta1.QueryPlansRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlansRequest,
      com.crescent.farming.v1beta1.QueryPlansResponse> getPlansMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlansRequest, com.crescent.farming.v1beta1.QueryPlansResponse> getPlansMethod;
    if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlansMethod = QueryGrpc.getPlansMethod) == null) {
          QueryGrpc.getPlansMethod = getPlansMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryPlansRequest, com.crescent.farming.v1beta1.QueryPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plans"))
              .build();
        }
      }
    }
    return getPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlanRequest,
      com.crescent.farming.v1beta1.QueryPlanResponse> getPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Plan",
      requestType = com.crescent.farming.v1beta1.QueryPlanRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlanRequest,
      com.crescent.farming.v1beta1.QueryPlanResponse> getPlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPlanRequest, com.crescent.farming.v1beta1.QueryPlanResponse> getPlanMethod;
    if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlanMethod = QueryGrpc.getPlanMethod) == null) {
          QueryGrpc.getPlanMethod = getPlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryPlanRequest, com.crescent.farming.v1beta1.QueryPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Plan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Plan"))
              .build();
        }
      }
    }
    return getPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPositionRequest,
      com.crescent.farming.v1beta1.QueryPositionResponse> getPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Position",
      requestType = com.crescent.farming.v1beta1.QueryPositionRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPositionRequest,
      com.crescent.farming.v1beta1.QueryPositionResponse> getPositionMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryPositionRequest, com.crescent.farming.v1beta1.QueryPositionResponse> getPositionMethod;
    if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionMethod = QueryGrpc.getPositionMethod) == null) {
          QueryGrpc.getPositionMethod = getPositionMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryPositionRequest, com.crescent.farming.v1beta1.QueryPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Position"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Position"))
              .build();
        }
      }
    }
    return getPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryStakingsRequest,
      com.crescent.farming.v1beta1.QueryStakingsResponse> getStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stakings",
      requestType = com.crescent.farming.v1beta1.QueryStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryStakingsRequest,
      com.crescent.farming.v1beta1.QueryStakingsResponse> getStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryStakingsRequest, com.crescent.farming.v1beta1.QueryStakingsResponse> getStakingsMethod;
    if ((getStakingsMethod = QueryGrpc.getStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStakingsMethod = QueryGrpc.getStakingsMethod) == null) {
          QueryGrpc.getStakingsMethod = getStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryStakingsRequest, com.crescent.farming.v1beta1.QueryStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Stakings"))
              .build();
        }
      }
    }
    return getStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryQueuedStakingsRequest,
      com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> getQueuedStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueuedStakings",
      requestType = com.crescent.farming.v1beta1.QueryQueuedStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryQueuedStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryQueuedStakingsRequest,
      com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> getQueuedStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryQueuedStakingsRequest, com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> getQueuedStakingsMethod;
    if ((getQueuedStakingsMethod = QueryGrpc.getQueuedStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueuedStakingsMethod = QueryGrpc.getQueuedStakingsMethod) == null) {
          QueryGrpc.getQueuedStakingsMethod = getQueuedStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryQueuedStakingsRequest, com.crescent.farming.v1beta1.QueryQueuedStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueuedStakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryQueuedStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryQueuedStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueuedStakings"))
              .build();
        }
      }
    }
    return getQueuedStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryTotalStakingsRequest,
      com.crescent.farming.v1beta1.QueryTotalStakingsResponse> getTotalStakingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalStakings",
      requestType = com.crescent.farming.v1beta1.QueryTotalStakingsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryTotalStakingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryTotalStakingsRequest,
      com.crescent.farming.v1beta1.QueryTotalStakingsResponse> getTotalStakingsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryTotalStakingsRequest, com.crescent.farming.v1beta1.QueryTotalStakingsResponse> getTotalStakingsMethod;
    if ((getTotalStakingsMethod = QueryGrpc.getTotalStakingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalStakingsMethod = QueryGrpc.getTotalStakingsMethod) == null) {
          QueryGrpc.getTotalStakingsMethod = getTotalStakingsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryTotalStakingsRequest, com.crescent.farming.v1beta1.QueryTotalStakingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalStakings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryTotalStakingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryTotalStakingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalStakings"))
              .build();
        }
      }
    }
    return getTotalStakingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryRewardsRequest,
      com.crescent.farming.v1beta1.QueryRewardsResponse> getRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rewards",
      requestType = com.crescent.farming.v1beta1.QueryRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryRewardsRequest,
      com.crescent.farming.v1beta1.QueryRewardsResponse> getRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryRewardsRequest, com.crescent.farming.v1beta1.QueryRewardsResponse> getRewardsMethod;
    if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
          QueryGrpc.getRewardsMethod = getRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryRewardsRequest, com.crescent.farming.v1beta1.QueryRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Rewards"))
              .build();
        }
      }
    }
    return getRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest,
      com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnharvestedRewards",
      requestType = com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest,
      com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest, com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> getUnharvestedRewardsMethod;
    if ((getUnharvestedRewardsMethod = QueryGrpc.getUnharvestedRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnharvestedRewardsMethod = QueryGrpc.getUnharvestedRewardsMethod) == null) {
          QueryGrpc.getUnharvestedRewardsMethod = getUnharvestedRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest, com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnharvestedRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnharvestedRewards"))
              .build();
        }
      }
    }
    return getUnharvestedRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest,
      com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentEpochDays",
      requestType = com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest,
      com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest, com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> getCurrentEpochDaysMethod;
    if ((getCurrentEpochDaysMethod = QueryGrpc.getCurrentEpochDaysMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentEpochDaysMethod = QueryGrpc.getCurrentEpochDaysMethod) == null) {
          QueryGrpc.getCurrentEpochDaysMethod = getCurrentEpochDaysMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest, com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentEpochDays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentEpochDays"))
              .build();
        }
      }
    }
    return getCurrentEpochDaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest,
      com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalRewards",
      requestType = com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest.class,
      responseType = com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest,
      com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest, com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> getHistoricalRewardsMethod;
    if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalRewardsMethod = QueryGrpc.getHistoricalRewardsMethod) == null) {
          QueryGrpc.getHistoricalRewardsMethod = getHistoricalRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest, com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse.getDefaultInstance()))
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
    default void params(com.crescent.farming.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    default void plans(com.crescent.farming.v1beta1.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    default void plan(com.crescent.farming.v1beta1.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanMethod(), responseObserver);
    }

    /**
     */
    default void position(com.crescent.farming.v1beta1.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    default void stakings(com.crescent.farming.v1beta1.QueryStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    default void queuedStakings(com.crescent.farming.v1beta1.QueryQueuedStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueuedStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    default void totalStakings(com.crescent.farming.v1beta1.QueryTotalStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryTotalStakingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalStakingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    default void rewards(com.crescent.farming.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    default void unharvestedRewards(com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnharvestedRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    default void currentEpochDays(com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentEpochDaysMethod(), responseObserver);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    default void historicalRewards(com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> responseObserver) {
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
    public void params(com.crescent.farming.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public void plans(com.crescent.farming.v1beta1.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public void plan(com.crescent.farming.v1beta1.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void position(com.crescent.farming.v1beta1.QueryPositionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public void stakings(com.crescent.farming.v1beta1.QueryStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public void queuedStakings(com.crescent.farming.v1beta1.QueryQueuedStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueuedStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public void totalStakings(com.crescent.farming.v1beta1.QueryTotalStakingsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryTotalStakingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalStakingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public void rewards(com.crescent.farming.v1beta1.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public void unharvestedRewards(com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnharvestedRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public void currentEpochDays(com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentEpochDaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public void historicalRewards(com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> responseObserver) {
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
    public com.crescent.farming.v1beta1.QueryParamsResponse params(com.crescent.farming.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryPlansResponse plans(com.crescent.farming.v1beta1.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryPlanResponse plan(com.crescent.farming.v1beta1.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.farming.v1beta1.QueryPositionResponse position(com.crescent.farming.v1beta1.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryStakingsResponse stakings(com.crescent.farming.v1beta1.QueryStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryQueuedStakingsResponse queuedStakings(com.crescent.farming.v1beta1.QueryQueuedStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueuedStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryTotalStakingsResponse totalStakings(com.crescent.farming.v1beta1.QueryTotalStakingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalStakingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryRewardsResponse rewards(com.crescent.farming.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse unharvestedRewards(com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnharvestedRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse currentEpochDays(com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentEpochDaysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse historicalRewards(com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryParamsResponse> params(
        com.crescent.farming.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Plans returns all plans.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryPlansResponse> plans(
        com.crescent.farming.v1beta1.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Plan returns a specific plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryPlanResponse> plan(
        com.crescent.farming.v1beta1.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryPositionResponse> position(
        com.crescent.farming.v1beta1.QueryPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stakings returns all stakings by a farmer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryStakingsResponse> stakings(
        com.crescent.farming.v1beta1.QueryStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryStakings returns all queued stakings by a farmer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryQueuedStakingsResponse> queuedStakings(
        com.crescent.farming.v1beta1.QueryQueuedStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueuedStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalStakings returns total staking amount for a staking coin denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryTotalStakingsResponse> totalStakings(
        com.crescent.farming.v1beta1.QueryTotalStakingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalStakingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rewards returns rewards for a farmer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryRewardsResponse> rewards(
        com.crescent.farming.v1beta1.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnharvestedRewards returns unharvested rewards for a farmer
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse> unharvestedRewards(
        com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnharvestedRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentEpochDays returns current epoch days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse> currentEpochDays(
        com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentEpochDaysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HistoricalRewards returns HistoricalRewards records for a staking coin denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse> historicalRewards(
        com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest request) {
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
          serviceImpl.params((com.crescent.farming.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_PLANS:
          serviceImpl.plans((com.crescent.farming.v1beta1.QueryPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlansResponse>) responseObserver);
          break;
        case METHODID_PLAN:
          serviceImpl.plan((com.crescent.farming.v1beta1.QueryPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPlanResponse>) responseObserver);
          break;
        case METHODID_POSITION:
          serviceImpl.position((com.crescent.farming.v1beta1.QueryPositionRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryPositionResponse>) responseObserver);
          break;
        case METHODID_STAKINGS:
          serviceImpl.stakings((com.crescent.farming.v1beta1.QueryStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryStakingsResponse>) responseObserver);
          break;
        case METHODID_QUEUED_STAKINGS:
          serviceImpl.queuedStakings((com.crescent.farming.v1beta1.QueryQueuedStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryQueuedStakingsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_STAKINGS:
          serviceImpl.totalStakings((com.crescent.farming.v1beta1.QueryTotalStakingsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryTotalStakingsResponse>) responseObserver);
          break;
        case METHODID_REWARDS:
          serviceImpl.rewards((com.crescent.farming.v1beta1.QueryRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryRewardsResponse>) responseObserver);
          break;
        case METHODID_UNHARVESTED_REWARDS:
          serviceImpl.unharvestedRewards((com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_EPOCH_DAYS:
          serviceImpl.currentEpochDays((com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_REWARDS:
          serviceImpl.historicalRewards((com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse>) responseObserver);
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
              com.crescent.farming.v1beta1.QueryParamsRequest,
              com.crescent.farming.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryPlansRequest,
              com.crescent.farming.v1beta1.QueryPlansResponse>(
                service, METHODID_PLANS)))
        .addMethod(
          getPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryPlanRequest,
              com.crescent.farming.v1beta1.QueryPlanResponse>(
                service, METHODID_PLAN)))
        .addMethod(
          getPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryPositionRequest,
              com.crescent.farming.v1beta1.QueryPositionResponse>(
                service, METHODID_POSITION)))
        .addMethod(
          getStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryStakingsRequest,
              com.crescent.farming.v1beta1.QueryStakingsResponse>(
                service, METHODID_STAKINGS)))
        .addMethod(
          getQueuedStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryQueuedStakingsRequest,
              com.crescent.farming.v1beta1.QueryQueuedStakingsResponse>(
                service, METHODID_QUEUED_STAKINGS)))
        .addMethod(
          getTotalStakingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryTotalStakingsRequest,
              com.crescent.farming.v1beta1.QueryTotalStakingsResponse>(
                service, METHODID_TOTAL_STAKINGS)))
        .addMethod(
          getRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryRewardsRequest,
              com.crescent.farming.v1beta1.QueryRewardsResponse>(
                service, METHODID_REWARDS)))
        .addMethod(
          getUnharvestedRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryUnharvestedRewardsRequest,
              com.crescent.farming.v1beta1.QueryUnharvestedRewardsResponse>(
                service, METHODID_UNHARVESTED_REWARDS)))
        .addMethod(
          getCurrentEpochDaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryCurrentEpochDaysRequest,
              com.crescent.farming.v1beta1.QueryCurrentEpochDaysResponse>(
                service, METHODID_CURRENT_EPOCH_DAYS)))
        .addMethod(
          getHistoricalRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.QueryHistoricalRewardsRequest,
              com.crescent.farming.v1beta1.QueryHistoricalRewardsResponse>(
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
