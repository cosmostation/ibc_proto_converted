package com.cellarfees.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: sommelier/cellarfees/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cellarfees.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryParamsRequest,
      com.cellarfees.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.cellarfees.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.cellarfees.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryParamsRequest,
      com.cellarfees.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryParamsRequest, com.cellarfees.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
          QueryGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.cellarfees.v1.QueryProto.QueryParamsRequest, com.cellarfees.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest,
      com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> getQueryModuleAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryModuleAccounts",
      requestType = com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest.class,
      responseType = com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest,
      com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> getQueryModuleAccountsMethod() {
    io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest, com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> getQueryModuleAccountsMethod;
    if ((getQueryModuleAccountsMethod = QueryGrpc.getQueryModuleAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryModuleAccountsMethod = QueryGrpc.getQueryModuleAccountsMethod) == null) {
          QueryGrpc.getQueryModuleAccountsMethod = getQueryModuleAccountsMethod =
              io.grpc.MethodDescriptor.<com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest, com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryModuleAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryModuleAccounts"))
              .build();
        }
      }
    }
    return getQueryModuleAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest,
      com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> getQueryLastRewardSupplyPeakMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLastRewardSupplyPeak",
      requestType = com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest.class,
      responseType = com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest,
      com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> getQueryLastRewardSupplyPeakMethod() {
    io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest, com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> getQueryLastRewardSupplyPeakMethod;
    if ((getQueryLastRewardSupplyPeakMethod = QueryGrpc.getQueryLastRewardSupplyPeakMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLastRewardSupplyPeakMethod = QueryGrpc.getQueryLastRewardSupplyPeakMethod) == null) {
          QueryGrpc.getQueryLastRewardSupplyPeakMethod = getQueryLastRewardSupplyPeakMethod =
              io.grpc.MethodDescriptor.<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest, com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLastRewardSupplyPeak"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLastRewardSupplyPeak"))
              .build();
        }
      }
    }
    return getQueryLastRewardSupplyPeakMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest,
      com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> getQueryFeeAccrualCountersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFeeAccrualCounters",
      requestType = com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest.class,
      responseType = com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest,
      com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> getQueryFeeAccrualCountersMethod() {
    io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest, com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> getQueryFeeAccrualCountersMethod;
    if ((getQueryFeeAccrualCountersMethod = QueryGrpc.getQueryFeeAccrualCountersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryFeeAccrualCountersMethod = QueryGrpc.getQueryFeeAccrualCountersMethod) == null) {
          QueryGrpc.getQueryFeeAccrualCountersMethod = getQueryFeeAccrualCountersMethod =
              io.grpc.MethodDescriptor.<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest, com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFeeAccrualCounters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryFeeAccrualCounters"))
              .build();
        }
      }
    }
    return getQueryFeeAccrualCountersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryAPYRequest,
      com.cellarfees.v1.QueryProto.QueryAPYResponse> getQueryAPYMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAPY",
      requestType = com.cellarfees.v1.QueryProto.QueryAPYRequest.class,
      responseType = com.cellarfees.v1.QueryProto.QueryAPYResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryAPYRequest,
      com.cellarfees.v1.QueryProto.QueryAPYResponse> getQueryAPYMethod() {
    io.grpc.MethodDescriptor<com.cellarfees.v1.QueryProto.QueryAPYRequest, com.cellarfees.v1.QueryProto.QueryAPYResponse> getQueryAPYMethod;
    if ((getQueryAPYMethod = QueryGrpc.getQueryAPYMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAPYMethod = QueryGrpc.getQueryAPYMethod) == null) {
          QueryGrpc.getQueryAPYMethod = getQueryAPYMethod =
              io.grpc.MethodDescriptor.<com.cellarfees.v1.QueryProto.QueryAPYRequest, com.cellarfees.v1.QueryProto.QueryAPYResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAPY"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryAPYRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cellarfees.v1.QueryProto.QueryAPYResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAPY"))
              .build();
        }
      }
    }
    return getQueryAPYMethod;
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
     */
    default void queryParams(com.cellarfees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryModuleAccounts(com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryModuleAccountsMethod(), responseObserver);
    }

    /**
     */
    default void queryLastRewardSupplyPeak(com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLastRewardSupplyPeakMethod(), responseObserver);
    }

    /**
     */
    default void queryFeeAccrualCounters(com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFeeAccrualCountersMethod(), responseObserver);
    }

    /**
     */
    default void queryAPY(com.cellarfees.v1.QueryProto.QueryAPYRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryAPYResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAPYMethod(), responseObserver);
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
     */
    public void queryParams(com.cellarfees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryModuleAccounts(com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryModuleAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLastRewardSupplyPeak(com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLastRewardSupplyPeakMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFeeAccrualCounters(com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFeeAccrualCountersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAPY(com.cellarfees.v1.QueryProto.QueryAPYRequest request,
        io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryAPYResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAPYMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.cellarfees.v1.QueryProto.QueryParamsResponse queryParams(com.cellarfees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse queryModuleAccounts(com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryModuleAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse queryLastRewardSupplyPeak(com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLastRewardSupplyPeakMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse queryFeeAccrualCounters(com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFeeAccrualCountersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cellarfees.v1.QueryProto.QueryAPYResponse queryAPY(com.cellarfees.v1.QueryProto.QueryAPYRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAPYMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cellarfees.v1.QueryProto.QueryParamsResponse> queryParams(
        com.cellarfees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse> queryModuleAccounts(
        com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryModuleAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse> queryLastRewardSupplyPeak(
        com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLastRewardSupplyPeakMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse> queryFeeAccrualCounters(
        com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFeeAccrualCountersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cellarfees.v1.QueryProto.QueryAPYResponse> queryAPY(
        com.cellarfees.v1.QueryProto.QueryAPYRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAPYMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PARAMS = 0;
  private static final int METHODID_QUERY_MODULE_ACCOUNTS = 1;
  private static final int METHODID_QUERY_LAST_REWARD_SUPPLY_PEAK = 2;
  private static final int METHODID_QUERY_FEE_ACCRUAL_COUNTERS = 3;
  private static final int METHODID_QUERY_APY = 4;

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
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((com.cellarfees.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_MODULE_ACCOUNTS:
          serviceImpl.queryModuleAccounts((com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse>) responseObserver);
          break;
        case METHODID_QUERY_LAST_REWARD_SUPPLY_PEAK:
          serviceImpl.queryLastRewardSupplyPeak((com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest) request,
              (io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse>) responseObserver);
          break;
        case METHODID_QUERY_FEE_ACCRUAL_COUNTERS:
          serviceImpl.queryFeeAccrualCounters((com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest) request,
              (io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse>) responseObserver);
          break;
        case METHODID_QUERY_APY:
          serviceImpl.queryAPY((com.cellarfees.v1.QueryProto.QueryAPYRequest) request,
              (io.grpc.stub.StreamObserver<com.cellarfees.v1.QueryProto.QueryAPYResponse>) responseObserver);
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
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cellarfees.v1.QueryProto.QueryParamsRequest,
              com.cellarfees.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .addMethod(
          getQueryModuleAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cellarfees.v1.QueryProto.QueryModuleAccountsRequest,
              com.cellarfees.v1.QueryProto.QueryModuleAccountsResponse>(
                service, METHODID_QUERY_MODULE_ACCOUNTS)))
        .addMethod(
          getQueryLastRewardSupplyPeakMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakRequest,
              com.cellarfees.v1.QueryProto.QueryLastRewardSupplyPeakResponse>(
                service, METHODID_QUERY_LAST_REWARD_SUPPLY_PEAK)))
        .addMethod(
          getQueryFeeAccrualCountersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersRequest,
              com.cellarfees.v1.QueryProto.QueryFeeAccrualCountersResponse>(
                service, METHODID_QUERY_FEE_ACCRUAL_COUNTERS)))
        .addMethod(
          getQueryAPYMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cellarfees.v1.QueryProto.QueryAPYRequest,
              com.cellarfees.v1.QueryProto.QueryAPYResponse>(
                service, METHODID_QUERY_APY)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cellarfees.v1.QueryProto.getDescriptor();
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
              .addMethod(getQueryParamsMethod())
              .addMethod(getQueryModuleAccountsMethod())
              .addMethod(getQueryLastRewardSupplyPeakMethod())
              .addMethod(getQueryFeeAccrualCountersMethod())
              .addMethod(getQueryAPYMethod())
              .build();
        }
      }
    }
    return result;
  }
}
