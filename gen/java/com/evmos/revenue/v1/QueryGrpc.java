package com.evmos.revenue.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: evmos/revenue/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "evmos.revenue.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenuesRequest,
      com.evmos.revenue.v1.QueryRevenuesResponse> getRevenuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revenues",
      requestType = com.evmos.revenue.v1.QueryRevenuesRequest.class,
      responseType = com.evmos.revenue.v1.QueryRevenuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenuesRequest,
      com.evmos.revenue.v1.QueryRevenuesResponse> getRevenuesMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenuesRequest, com.evmos.revenue.v1.QueryRevenuesResponse> getRevenuesMethod;
    if ((getRevenuesMethod = QueryGrpc.getRevenuesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRevenuesMethod = QueryGrpc.getRevenuesMethod) == null) {
          QueryGrpc.getRevenuesMethod = getRevenuesMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.QueryRevenuesRequest, com.evmos.revenue.v1.QueryRevenuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revenues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryRevenuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryRevenuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Revenues"))
              .build();
        }
      }
    }
    return getRevenuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenueRequest,
      com.evmos.revenue.v1.QueryRevenueResponse> getRevenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revenue",
      requestType = com.evmos.revenue.v1.QueryRevenueRequest.class,
      responseType = com.evmos.revenue.v1.QueryRevenueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenueRequest,
      com.evmos.revenue.v1.QueryRevenueResponse> getRevenueMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryRevenueRequest, com.evmos.revenue.v1.QueryRevenueResponse> getRevenueMethod;
    if ((getRevenueMethod = QueryGrpc.getRevenueMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRevenueMethod = QueryGrpc.getRevenueMethod) == null) {
          QueryGrpc.getRevenueMethod = getRevenueMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.QueryRevenueRequest, com.evmos.revenue.v1.QueryRevenueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryRevenueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryRevenueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Revenue"))
              .build();
        }
      }
    }
    return getRevenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryParamsRequest,
      com.evmos.revenue.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.evmos.revenue.v1.QueryParamsRequest.class,
      responseType = com.evmos.revenue.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryParamsRequest,
      com.evmos.revenue.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryParamsRequest, com.evmos.revenue.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.QueryParamsRequest, com.evmos.revenue.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryDeployerRevenuesRequest,
      com.evmos.revenue.v1.QueryDeployerRevenuesResponse> getDeployerRevenuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployerRevenues",
      requestType = com.evmos.revenue.v1.QueryDeployerRevenuesRequest.class,
      responseType = com.evmos.revenue.v1.QueryDeployerRevenuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryDeployerRevenuesRequest,
      com.evmos.revenue.v1.QueryDeployerRevenuesResponse> getDeployerRevenuesMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryDeployerRevenuesRequest, com.evmos.revenue.v1.QueryDeployerRevenuesResponse> getDeployerRevenuesMethod;
    if ((getDeployerRevenuesMethod = QueryGrpc.getDeployerRevenuesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeployerRevenuesMethod = QueryGrpc.getDeployerRevenuesMethod) == null) {
          QueryGrpc.getDeployerRevenuesMethod = getDeployerRevenuesMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.QueryDeployerRevenuesRequest, com.evmos.revenue.v1.QueryDeployerRevenuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployerRevenues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryDeployerRevenuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryDeployerRevenuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DeployerRevenues"))
              .build();
        }
      }
    }
    return getDeployerRevenuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest,
      com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> getWithdrawerRevenuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawerRevenues",
      requestType = com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest.class,
      responseType = com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest,
      com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> getWithdrawerRevenuesMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest, com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> getWithdrawerRevenuesMethod;
    if ((getWithdrawerRevenuesMethod = QueryGrpc.getWithdrawerRevenuesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawerRevenuesMethod = QueryGrpc.getWithdrawerRevenuesMethod) == null) {
          QueryGrpc.getWithdrawerRevenuesMethod = getWithdrawerRevenuesMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest, com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawerRevenues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawerRevenues"))
              .build();
        }
      }
    }
    return getWithdrawerRevenuesMethod;
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
     * Revenues retrieves all registered revenues
     * </pre>
     */
    default void revenues(com.evmos.revenue.v1.QueryRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevenuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revenue retrieves a registered revenue for a given contract address
     * </pre>
     */
    default void revenue(com.evmos.revenue.v1.QueryRevenueRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevenueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the revenue module params
     * </pre>
     */
    default void params(com.evmos.revenue.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeployerRevenues retrieves all revenues that a given deployer has
     * registered
     * </pre>
     */
    default void deployerRevenues(com.evmos.revenue.v1.QueryDeployerRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryDeployerRevenuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployerRevenuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawerRevenues retrieves all revenues with a given withdrawer
     * address
     * </pre>
     */
    default void withdrawerRevenues(com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawerRevenuesMethod(), responseObserver);
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
     * Revenues retrieves all registered revenues
     * </pre>
     */
    public void revenues(com.evmos.revenue.v1.QueryRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevenuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revenue retrieves a registered revenue for a given contract address
     * </pre>
     */
    public void revenue(com.evmos.revenue.v1.QueryRevenueRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the revenue module params
     * </pre>
     */
    public void params(com.evmos.revenue.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeployerRevenues retrieves all revenues that a given deployer has
     * registered
     * </pre>
     */
    public void deployerRevenues(com.evmos.revenue.v1.QueryDeployerRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryDeployerRevenuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployerRevenuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawerRevenues retrieves all revenues with a given withdrawer
     * address
     * </pre>
     */
    public void withdrawerRevenues(com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawerRevenuesMethod(), getCallOptions()), request, responseObserver);
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
     * Revenues retrieves all registered revenues
     * </pre>
     */
    public com.evmos.revenue.v1.QueryRevenuesResponse revenues(com.evmos.revenue.v1.QueryRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevenuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revenue retrieves a registered revenue for a given contract address
     * </pre>
     */
    public com.evmos.revenue.v1.QueryRevenueResponse revenue(com.evmos.revenue.v1.QueryRevenueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevenueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the revenue module params
     * </pre>
     */
    public com.evmos.revenue.v1.QueryParamsResponse params(com.evmos.revenue.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeployerRevenues retrieves all revenues that a given deployer has
     * registered
     * </pre>
     */
    public com.evmos.revenue.v1.QueryDeployerRevenuesResponse deployerRevenues(com.evmos.revenue.v1.QueryDeployerRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployerRevenuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawerRevenues retrieves all revenues with a given withdrawer
     * address
     * </pre>
     */
    public com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse withdrawerRevenues(com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawerRevenuesMethod(), getCallOptions(), request);
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
     * Revenues retrieves all registered revenues
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.QueryRevenuesResponse> revenues(
        com.evmos.revenue.v1.QueryRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevenuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revenue retrieves a registered revenue for a given contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.QueryRevenueResponse> revenue(
        com.evmos.revenue.v1.QueryRevenueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevenueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the revenue module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.QueryParamsResponse> params(
        com.evmos.revenue.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeployerRevenues retrieves all revenues that a given deployer has
     * registered
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.QueryDeployerRevenuesResponse> deployerRevenues(
        com.evmos.revenue.v1.QueryDeployerRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployerRevenuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawerRevenues retrieves all revenues with a given withdrawer
     * address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse> withdrawerRevenues(
        com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawerRevenuesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REVENUES = 0;
  private static final int METHODID_REVENUE = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_DEPLOYER_REVENUES = 3;
  private static final int METHODID_WITHDRAWER_REVENUES = 4;

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
        case METHODID_REVENUES:
          serviceImpl.revenues((com.evmos.revenue.v1.QueryRevenuesRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenuesResponse>) responseObserver);
          break;
        case METHODID_REVENUE:
          serviceImpl.revenue((com.evmos.revenue.v1.QueryRevenueRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryRevenueResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.evmos.revenue.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPLOYER_REVENUES:
          serviceImpl.deployerRevenues((com.evmos.revenue.v1.QueryDeployerRevenuesRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryDeployerRevenuesResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWER_REVENUES:
          serviceImpl.withdrawerRevenues((com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse>) responseObserver);
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
          getRevenuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.QueryRevenuesRequest,
              com.evmos.revenue.v1.QueryRevenuesResponse>(
                service, METHODID_REVENUES)))
        .addMethod(
          getRevenueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.QueryRevenueRequest,
              com.evmos.revenue.v1.QueryRevenueResponse>(
                service, METHODID_REVENUE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.QueryParamsRequest,
              com.evmos.revenue.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDeployerRevenuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.QueryDeployerRevenuesRequest,
              com.evmos.revenue.v1.QueryDeployerRevenuesResponse>(
                service, METHODID_DEPLOYER_REVENUES)))
        .addMethod(
          getWithdrawerRevenuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.QueryWithdrawerRevenuesRequest,
              com.evmos.revenue.v1.QueryWithdrawerRevenuesResponse>(
                service, METHODID_WITHDRAWER_REVENUES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evmos.revenue.v1.QueryProto.getDescriptor();
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
              .addMethod(getRevenuesMethod())
              .addMethod(getRevenueMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDeployerRevenuesMethod())
              .addMethod(getWithdrawerRevenuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
