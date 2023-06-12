package com.osmosis.incentives;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/incentives/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.incentives.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.ModuleToDistributeCoinsRequest,
      com.osmosis.incentives.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleToDistributeCoins",
      requestType = com.osmosis.incentives.ModuleToDistributeCoinsRequest.class,
      responseType = com.osmosis.incentives.ModuleToDistributeCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.ModuleToDistributeCoinsRequest,
      com.osmosis.incentives.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.ModuleToDistributeCoinsRequest, com.osmosis.incentives.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;
    if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
          QueryGrpc.getModuleToDistributeCoinsMethod = getModuleToDistributeCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.ModuleToDistributeCoinsRequest, com.osmosis.incentives.ModuleToDistributeCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleToDistributeCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ModuleToDistributeCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ModuleToDistributeCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleToDistributeCoins"))
              .build();
        }
      }
    }
    return getModuleToDistributeCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.GaugeByIDRequest,
      com.osmosis.incentives.GaugeByIDResponse> getGaugeByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GaugeByID",
      requestType = com.osmosis.incentives.GaugeByIDRequest.class,
      responseType = com.osmosis.incentives.GaugeByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.GaugeByIDRequest,
      com.osmosis.incentives.GaugeByIDResponse> getGaugeByIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.GaugeByIDRequest, com.osmosis.incentives.GaugeByIDResponse> getGaugeByIDMethod;
    if ((getGaugeByIDMethod = QueryGrpc.getGaugeByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugeByIDMethod = QueryGrpc.getGaugeByIDMethod) == null) {
          QueryGrpc.getGaugeByIDMethod = getGaugeByIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.GaugeByIDRequest, com.osmosis.incentives.GaugeByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GaugeByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.GaugeByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.GaugeByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GaugeByID"))
              .build();
        }
      }
    }
    return getGaugeByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.GaugesRequest,
      com.osmosis.incentives.GaugesResponse> getGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Gauges",
      requestType = com.osmosis.incentives.GaugesRequest.class,
      responseType = com.osmosis.incentives.GaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.GaugesRequest,
      com.osmosis.incentives.GaugesResponse> getGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.GaugesRequest, com.osmosis.incentives.GaugesResponse> getGaugesMethod;
    if ((getGaugesMethod = QueryGrpc.getGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugesMethod = QueryGrpc.getGaugesMethod) == null) {
          QueryGrpc.getGaugesMethod = getGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.GaugesRequest, com.osmosis.incentives.GaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Gauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.GaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.GaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Gauges"))
              .build();
        }
      }
    }
    return getGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesRequest,
      com.osmosis.incentives.ActiveGaugesResponse> getActiveGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveGauges",
      requestType = com.osmosis.incentives.ActiveGaugesRequest.class,
      responseType = com.osmosis.incentives.ActiveGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesRequest,
      com.osmosis.incentives.ActiveGaugesResponse> getActiveGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesRequest, com.osmosis.incentives.ActiveGaugesResponse> getActiveGaugesMethod;
    if ((getActiveGaugesMethod = QueryGrpc.getActiveGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveGaugesMethod = QueryGrpc.getActiveGaugesMethod) == null) {
          QueryGrpc.getActiveGaugesMethod = getActiveGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.ActiveGaugesRequest, com.osmosis.incentives.ActiveGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ActiveGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ActiveGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveGauges"))
              .build();
        }
      }
    }
    return getActiveGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesPerDenomRequest,
      com.osmosis.incentives.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveGaugesPerDenom",
      requestType = com.osmosis.incentives.ActiveGaugesPerDenomRequest.class,
      responseType = com.osmosis.incentives.ActiveGaugesPerDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesPerDenomRequest,
      com.osmosis.incentives.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.ActiveGaugesPerDenomRequest, com.osmosis.incentives.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod;
    if ((getActiveGaugesPerDenomMethod = QueryGrpc.getActiveGaugesPerDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveGaugesPerDenomMethod = QueryGrpc.getActiveGaugesPerDenomMethod) == null) {
          QueryGrpc.getActiveGaugesPerDenomMethod = getActiveGaugesPerDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.ActiveGaugesPerDenomRequest, com.osmosis.incentives.ActiveGaugesPerDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveGaugesPerDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ActiveGaugesPerDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.ActiveGaugesPerDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveGaugesPerDenom"))
              .build();
        }
      }
    }
    return getActiveGaugesPerDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesRequest,
      com.osmosis.incentives.UpcomingGaugesResponse> getUpcomingGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingGauges",
      requestType = com.osmosis.incentives.UpcomingGaugesRequest.class,
      responseType = com.osmosis.incentives.UpcomingGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesRequest,
      com.osmosis.incentives.UpcomingGaugesResponse> getUpcomingGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesRequest, com.osmosis.incentives.UpcomingGaugesResponse> getUpcomingGaugesMethod;
    if ((getUpcomingGaugesMethod = QueryGrpc.getUpcomingGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingGaugesMethod = QueryGrpc.getUpcomingGaugesMethod) == null) {
          QueryGrpc.getUpcomingGaugesMethod = getUpcomingGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.UpcomingGaugesRequest, com.osmosis.incentives.UpcomingGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.UpcomingGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.UpcomingGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingGauges"))
              .build();
        }
      }
    }
    return getUpcomingGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesPerDenomRequest,
      com.osmosis.incentives.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingGaugesPerDenom",
      requestType = com.osmosis.incentives.UpcomingGaugesPerDenomRequest.class,
      responseType = com.osmosis.incentives.UpcomingGaugesPerDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesPerDenomRequest,
      com.osmosis.incentives.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.UpcomingGaugesPerDenomRequest, com.osmosis.incentives.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod;
    if ((getUpcomingGaugesPerDenomMethod = QueryGrpc.getUpcomingGaugesPerDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingGaugesPerDenomMethod = QueryGrpc.getUpcomingGaugesPerDenomMethod) == null) {
          QueryGrpc.getUpcomingGaugesPerDenomMethod = getUpcomingGaugesPerDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.UpcomingGaugesPerDenomRequest, com.osmosis.incentives.UpcomingGaugesPerDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingGaugesPerDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.UpcomingGaugesPerDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.UpcomingGaugesPerDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingGaugesPerDenom"))
              .build();
        }
      }
    }
    return getUpcomingGaugesPerDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.RewardsEstRequest,
      com.osmosis.incentives.RewardsEstResponse> getRewardsEstMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsEst",
      requestType = com.osmosis.incentives.RewardsEstRequest.class,
      responseType = com.osmosis.incentives.RewardsEstResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.RewardsEstRequest,
      com.osmosis.incentives.RewardsEstResponse> getRewardsEstMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.RewardsEstRequest, com.osmosis.incentives.RewardsEstResponse> getRewardsEstMethod;
    if ((getRewardsEstMethod = QueryGrpc.getRewardsEstMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsEstMethod = QueryGrpc.getRewardsEstMethod) == null) {
          QueryGrpc.getRewardsEstMethod = getRewardsEstMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.RewardsEstRequest, com.osmosis.incentives.RewardsEstResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsEst"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.RewardsEstRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.RewardsEstResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsEst"))
              .build();
        }
      }
    }
    return getRewardsEstMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryLockableDurationsRequest,
      com.osmosis.incentives.QueryLockableDurationsResponse> getLockableDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockableDurations",
      requestType = com.osmosis.incentives.QueryLockableDurationsRequest.class,
      responseType = com.osmosis.incentives.QueryLockableDurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryLockableDurationsRequest,
      com.osmosis.incentives.QueryLockableDurationsResponse> getLockableDurationsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryLockableDurationsRequest, com.osmosis.incentives.QueryLockableDurationsResponse> getLockableDurationsMethod;
    if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
          QueryGrpc.getLockableDurationsMethod = getLockableDurationsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryLockableDurationsRequest, com.osmosis.incentives.QueryLockableDurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockableDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryLockableDurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryLockableDurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockableDurations"))
              .build();
        }
      }
    }
    return getLockableDurationsMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    default void moduleToDistributeCoins(com.osmosis.incentives.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleToDistributeCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    default void gaugeByID(com.osmosis.incentives.GaugeByIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugeByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugeByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    default void gauges(com.osmosis.incentives.GaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    default void activeGauges(com.osmosis.incentives.ActiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    default void activeGaugesPerDenom(com.osmosis.incentives.ActiveGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveGaugesPerDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occured
     * </pre>
     */
    default void upcomingGauges(com.osmosis.incentives.UpcomingGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occured
     * by denom
     * </pre>
     */
    default void upcomingGaugesPerDenom(com.osmosis.incentives.UpcomingGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingGaugesPerDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    default void rewardsEst(com.osmosis.incentives.RewardsEstRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.RewardsEstResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsEstMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    default void lockableDurations(com.osmosis.incentives.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockableDurationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public void moduleToDistributeCoins(com.osmosis.incentives.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public void gaugeByID(com.osmosis.incentives.GaugeByIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugeByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugeByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public void gauges(com.osmosis.incentives.GaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public void activeGauges(com.osmosis.incentives.ActiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public void activeGaugesPerDenom(com.osmosis.incentives.ActiveGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveGaugesPerDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occured
     * </pre>
     */
    public void upcomingGauges(com.osmosis.incentives.UpcomingGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occured
     * by denom
     * </pre>
     */
    public void upcomingGaugesPerDenom(com.osmosis.incentives.UpcomingGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingGaugesPerDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public void rewardsEst(com.osmosis.incentives.RewardsEstRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.RewardsEstResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsEstMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public void lockableDurations(com.osmosis.incentives.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public com.osmosis.incentives.ModuleToDistributeCoinsResponse moduleToDistributeCoins(com.osmosis.incentives.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleToDistributeCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public com.osmosis.incentives.GaugeByIDResponse gaugeByID(com.osmosis.incentives.GaugeByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugeByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public com.osmosis.incentives.GaugesResponse gauges(com.osmosis.incentives.GaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public com.osmosis.incentives.ActiveGaugesResponse activeGauges(com.osmosis.incentives.ActiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public com.osmosis.incentives.ActiveGaugesPerDenomResponse activeGaugesPerDenom(com.osmosis.incentives.ActiveGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveGaugesPerDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occured
     * </pre>
     */
    public com.osmosis.incentives.UpcomingGaugesResponse upcomingGauges(com.osmosis.incentives.UpcomingGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occured
     * by denom
     * </pre>
     */
    public com.osmosis.incentives.UpcomingGaugesPerDenomResponse upcomingGaugesPerDenom(com.osmosis.incentives.UpcomingGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingGaugesPerDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public com.osmosis.incentives.RewardsEstResponse rewardsEst(com.osmosis.incentives.RewardsEstRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsEstMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public com.osmosis.incentives.QueryLockableDurationsResponse lockableDurations(com.osmosis.incentives.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockableDurationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.ModuleToDistributeCoinsResponse> moduleToDistributeCoins(
        com.osmosis.incentives.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.GaugeByIDResponse> gaugeByID(
        com.osmosis.incentives.GaugeByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugeByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.GaugesResponse> gauges(
        com.osmosis.incentives.GaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.ActiveGaugesResponse> activeGauges(
        com.osmosis.incentives.ActiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.ActiveGaugesPerDenomResponse> activeGaugesPerDenom(
        com.osmosis.incentives.ActiveGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveGaugesPerDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occured
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.UpcomingGaugesResponse> upcomingGauges(
        com.osmosis.incentives.UpcomingGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occured
     * by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.UpcomingGaugesPerDenomResponse> upcomingGaugesPerDenom(
        com.osmosis.incentives.UpcomingGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingGaugesPerDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.RewardsEstResponse> rewardsEst(
        com.osmosis.incentives.RewardsEstRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsEstMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryLockableDurationsResponse> lockableDurations(
        com.osmosis.incentives.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_TO_DISTRIBUTE_COINS = 0;
  private static final int METHODID_GAUGE_BY_ID = 1;
  private static final int METHODID_GAUGES = 2;
  private static final int METHODID_ACTIVE_GAUGES = 3;
  private static final int METHODID_ACTIVE_GAUGES_PER_DENOM = 4;
  private static final int METHODID_UPCOMING_GAUGES = 5;
  private static final int METHODID_UPCOMING_GAUGES_PER_DENOM = 6;
  private static final int METHODID_REWARDS_EST = 7;
  private static final int METHODID_LOCKABLE_DURATIONS = 8;

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
        case METHODID_MODULE_TO_DISTRIBUTE_COINS:
          serviceImpl.moduleToDistributeCoins((com.osmosis.incentives.ModuleToDistributeCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.ModuleToDistributeCoinsResponse>) responseObserver);
          break;
        case METHODID_GAUGE_BY_ID:
          serviceImpl.gaugeByID((com.osmosis.incentives.GaugeByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugeByIDResponse>) responseObserver);
          break;
        case METHODID_GAUGES:
          serviceImpl.gauges((com.osmosis.incentives.GaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.GaugesResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_GAUGES:
          serviceImpl.activeGauges((com.osmosis.incentives.ActiveGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_GAUGES_PER_DENOM:
          serviceImpl.activeGaugesPerDenom((com.osmosis.incentives.ActiveGaugesPerDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.ActiveGaugesPerDenomResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_GAUGES:
          serviceImpl.upcomingGauges((com.osmosis.incentives.UpcomingGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_GAUGES_PER_DENOM:
          serviceImpl.upcomingGaugesPerDenom((com.osmosis.incentives.UpcomingGaugesPerDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.UpcomingGaugesPerDenomResponse>) responseObserver);
          break;
        case METHODID_REWARDS_EST:
          serviceImpl.rewardsEst((com.osmosis.incentives.RewardsEstRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.RewardsEstResponse>) responseObserver);
          break;
        case METHODID_LOCKABLE_DURATIONS:
          serviceImpl.lockableDurations((com.osmosis.incentives.QueryLockableDurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryLockableDurationsResponse>) responseObserver);
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
          getModuleToDistributeCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.ModuleToDistributeCoinsRequest,
              com.osmosis.incentives.ModuleToDistributeCoinsResponse>(
                service, METHODID_MODULE_TO_DISTRIBUTE_COINS)))
        .addMethod(
          getGaugeByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.GaugeByIDRequest,
              com.osmosis.incentives.GaugeByIDResponse>(
                service, METHODID_GAUGE_BY_ID)))
        .addMethod(
          getGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.GaugesRequest,
              com.osmosis.incentives.GaugesResponse>(
                service, METHODID_GAUGES)))
        .addMethod(
          getActiveGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.ActiveGaugesRequest,
              com.osmosis.incentives.ActiveGaugesResponse>(
                service, METHODID_ACTIVE_GAUGES)))
        .addMethod(
          getActiveGaugesPerDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.ActiveGaugesPerDenomRequest,
              com.osmosis.incentives.ActiveGaugesPerDenomResponse>(
                service, METHODID_ACTIVE_GAUGES_PER_DENOM)))
        .addMethod(
          getUpcomingGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.UpcomingGaugesRequest,
              com.osmosis.incentives.UpcomingGaugesResponse>(
                service, METHODID_UPCOMING_GAUGES)))
        .addMethod(
          getUpcomingGaugesPerDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.UpcomingGaugesPerDenomRequest,
              com.osmosis.incentives.UpcomingGaugesPerDenomResponse>(
                service, METHODID_UPCOMING_GAUGES_PER_DENOM)))
        .addMethod(
          getRewardsEstMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.RewardsEstRequest,
              com.osmosis.incentives.RewardsEstResponse>(
                service, METHODID_REWARDS_EST)))
        .addMethod(
          getLockableDurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryLockableDurationsRequest,
              com.osmosis.incentives.QueryLockableDurationsResponse>(
                service, METHODID_LOCKABLE_DURATIONS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.incentives.QueryProto.getDescriptor();
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
              .addMethod(getModuleToDistributeCoinsMethod())
              .addMethod(getGaugeByIDMethod())
              .addMethod(getGaugesMethod())
              .addMethod(getActiveGaugesMethod())
              .addMethod(getActiveGaugesPerDenomMethod())
              .addMethod(getUpcomingGaugesMethod())
              .addMethod(getUpcomingGaugesPerDenomMethod())
              .addMethod(getRewardsEstMethod())
              .addMethod(getLockableDurationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
