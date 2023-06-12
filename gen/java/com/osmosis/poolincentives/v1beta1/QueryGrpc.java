package com.osmosis.poolincentives.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/pool-incentives/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.poolincentives.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest,
      com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> getGaugeIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GaugeIds",
      requestType = com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest,
      com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> getGaugeIdsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest, com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> getGaugeIdsMethod;
    if ((getGaugeIdsMethod = QueryGrpc.getGaugeIdsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugeIdsMethod = QueryGrpc.getGaugeIdsMethod) == null) {
          QueryGrpc.getGaugeIdsMethod = getGaugeIdsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest, com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GaugeIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GaugeIds"))
              .build();
        }
      }
    }
    return getGaugeIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest,
      com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> getDistrInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DistrInfo",
      requestType = com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest,
      com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> getDistrInfoMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest, com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> getDistrInfoMethod;
    if ((getDistrInfoMethod = QueryGrpc.getDistrInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDistrInfoMethod = QueryGrpc.getDistrInfoMethod) == null) {
          QueryGrpc.getDistrInfoMethod = getDistrInfoMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest, com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DistrInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DistrInfo"))
              .build();
        }
      }
    }
    return getDistrInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryParamsRequest,
      com.osmosis.poolincentives.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.poolincentives.v1beta1.QueryParamsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryParamsRequest,
      com.osmosis.poolincentives.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryParamsRequest, com.osmosis.poolincentives.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryParamsRequest, com.osmosis.poolincentives.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest,
      com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> getLockableDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockableDurations",
      requestType = com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest,
      com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> getLockableDurationsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest, com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> getLockableDurationsMethod;
    if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
          QueryGrpc.getLockableDurationsMethod = getLockableDurationsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest, com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockableDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockableDurations"))
              .build();
        }
      }
    }
    return getLockableDurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest,
      com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPools",
      requestType = com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest,
      com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest, com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;
    if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
          QueryGrpc.getIncentivizedPoolsMethod = getIncentivizedPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest, com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPools"))
              .build();
        }
      }
    }
    return getIncentivizedPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest,
      com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalIncentiveGauges",
      requestType = com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest,
      com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest, com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod;
    if ((getExternalIncentiveGaugesMethod = QueryGrpc.getExternalIncentiveGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExternalIncentiveGaugesMethod = QueryGrpc.getExternalIncentiveGaugesMethod) == null) {
          QueryGrpc.getExternalIncentiveGaugesMethod = getExternalIncentiveGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest, com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalIncentiveGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExternalIncentiveGauges"))
              .build();
        }
      }
    }
    return getExternalIncentiveGaugesMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * GaugeIds takes the pool id and returns the matching gauge ids and durations
     * </pre>
     */
    default void gaugeIds(com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugeIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    default void distrInfo(com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDistrInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    default void params(com.osmosis.poolincentives.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    default void lockableDurations(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockableDurationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    default void incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    default void externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalIncentiveGaugesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     * GaugeIds takes the pool id and returns the matching gauge ids and durations
     * </pre>
     */
    public void gaugeIds(com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugeIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public void distrInfo(com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDistrInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public void params(com.osmosis.poolincentives.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public void lockableDurations(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public void incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public void externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalIncentiveGaugesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     * GaugeIds takes the pool id and returns the matching gauge ids and durations
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse gaugeIds(com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugeIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse distrInfo(com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDistrInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryParamsResponse params(com.osmosis.poolincentives.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse lockableDurations(com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockableDurationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalIncentiveGaugesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     * GaugeIds takes the pool id and returns the matching gauge ids and durations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse> gaugeIds(
        com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugeIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse> distrInfo(
        com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDistrInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryParamsResponse> params(
        com.osmosis.poolincentives.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse> lockableDurations(
        com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse> incentivizedPools(
        com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse> externalIncentiveGauges(
        com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalIncentiveGaugesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GAUGE_IDS = 0;
  private static final int METHODID_DISTR_INFO = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_LOCKABLE_DURATIONS = 3;
  private static final int METHODID_INCENTIVIZED_POOLS = 4;
  private static final int METHODID_EXTERNAL_INCENTIVE_GAUGES = 5;

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
        case METHODID_GAUGE_IDS:
          serviceImpl.gaugeIds((com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse>) responseObserver);
          break;
        case METHODID_DISTR_INFO:
          serviceImpl.distrInfo((com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.poolincentives.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LOCKABLE_DURATIONS:
          serviceImpl.lockableDurations((com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_POOLS:
          serviceImpl.incentivizedPools((com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_INCENTIVE_GAUGES:
          serviceImpl.externalIncentiveGauges((com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse>) responseObserver);
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
          getGaugeIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest,
              com.osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse>(
                service, METHODID_GAUGE_IDS)))
        .addMethod(
          getDistrInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryDistrInfoRequest,
              com.osmosis.poolincentives.v1beta1.QueryDistrInfoResponse>(
                service, METHODID_DISTR_INFO)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryParamsRequest,
              com.osmosis.poolincentives.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLockableDurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest,
              com.osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse>(
                service, METHODID_LOCKABLE_DURATIONS)))
        .addMethod(
          getIncentivizedPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest,
              com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse>(
                service, METHODID_INCENTIVIZED_POOLS)))
        .addMethod(
          getExternalIncentiveGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest,
              com.osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse>(
                service, METHODID_EXTERNAL_INCENTIVE_GAUGES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getGaugeIdsMethod())
              .addMethod(getDistrInfoMethod())
              .addMethod(getParamsMethod())
              .addMethod(getLockableDurationsMethod())
              .addMethod(getIncentivizedPoolsMethod())
              .addMethod(getExternalIncentiveGaugesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
