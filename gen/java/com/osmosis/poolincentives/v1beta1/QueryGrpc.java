package com.osmosis.poolincentives.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: osmosis/pool-incentives/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "osmosis.poolincentives.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> getGaugeIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GaugeIds",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> getGaugeIdsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> getGaugeIdsMethod;
    if ((getGaugeIdsMethod = QueryGrpc.getGaugeIdsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugeIdsMethod = QueryGrpc.getGaugeIdsMethod) == null) {
          QueryGrpc.getGaugeIdsMethod = getGaugeIdsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GaugeIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GaugeIds"))
              .build();
        }
      }
    }
    return getGaugeIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> getDistrInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DistrInfo",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> getDistrInfoMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> getDistrInfoMethod;
    if ((getDistrInfoMethod = QueryGrpc.getDistrInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDistrInfoMethod = QueryGrpc.getDistrInfoMethod) == null) {
          QueryGrpc.getDistrInfoMethod = getDistrInfoMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DistrInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DistrInfo"))
              .build();
        }
      }
    }
    return getDistrInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockableDurations",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod;
    if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
          QueryGrpc.getLockableDurationsMethod = getLockableDurationsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockableDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockableDurations"))
              .build();
        }
      }
    }
    return getLockableDurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPools",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;
    if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
          QueryGrpc.getIncentivizedPoolsMethod = getIncentivizedPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPools"))
              .build();
        }
      }
    }
    return getIncentivizedPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalIncentiveGauges",
      requestType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest.class,
      responseType = com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest,
      com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> getExternalIncentiveGaugesMethod;
    if ((getExternalIncentiveGaugesMethod = QueryGrpc.getExternalIncentiveGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExternalIncentiveGaugesMethod = QueryGrpc.getExternalIncentiveGaugesMethod) == null) {
          QueryGrpc.getExternalIncentiveGaugesMethod = getExternalIncentiveGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest, com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalIncentiveGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse.getDefaultInstance()))
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
    default void gaugeIds(com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugeIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    default void distrInfo(com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDistrInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    default void params(com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    default void lockableDurations(com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockableDurationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    default void incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    default void externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> responseObserver) {
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
    public void gaugeIds(com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugeIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public void distrInfo(com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDistrInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public void params(com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public void lockableDurations(com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public void incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public void externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> responseObserver) {
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
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse gaugeIds(com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugeIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse distrInfo(com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDistrInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse params(com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse lockableDurations(com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockableDurationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse incentivizedPools(com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse externalIncentiveGauges(com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse> gaugeIds(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugeIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DistrInfo returns the pool's matching gauge ids and weights.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse> distrInfo(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDistrInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns pool incentives params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse> params(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockableDurations returns lock durations for pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse> lockableDurations(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentivizedPools returns currently incentivized pools
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse> incentivizedPools(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExternalIncentiveGauges returns external incentive gauges.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse> externalIncentiveGauges(
        com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest request) {
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
          serviceImpl.gaugeIds((com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse>) responseObserver);
          break;
        case METHODID_DISTR_INFO:
          serviceImpl.distrInfo((com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LOCKABLE_DURATIONS:
          serviceImpl.lockableDurations((com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_POOLS:
          serviceImpl.incentivizedPools((com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_INCENTIVE_GAUGES:
          serviceImpl.externalIncentiveGauges((com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse>) responseObserver);
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
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryGaugeIdsResponse>(
                service, METHODID_GAUGE_IDS)))
        .addMethod(
          getDistrInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryDistrInfoResponse>(
                service, METHODID_DISTR_INFO)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLockableDurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryLockableDurationsResponse>(
                service, METHODID_LOCKABLE_DURATIONS)))
        .addMethod(
          getIncentivizedPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryIncentivizedPoolsResponse>(
                service, METHODID_INCENTIVIZED_POOLS)))
        .addMethod(
          getExternalIncentiveGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesRequest,
              com.osmosis.poolincentives.v1beta1.QueryProto.QueryExternalIncentiveGaugesResponse>(
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
