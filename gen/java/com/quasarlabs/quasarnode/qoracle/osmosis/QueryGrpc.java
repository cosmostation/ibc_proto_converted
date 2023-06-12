package com.quasarlabs.quasarnode.qoracle.osmosis;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: quasar/qoracle/osmosis/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quasarlabs.quasarnode.qoracle.osmosis.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest.class,
      responseType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest.class,
      responseType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> getStateMethod;
    if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
          QueryGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> getChainParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainParams",
      requestType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest.class,
      responseType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> getChainParamsMethod() {
    io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> getChainParamsMethod;
    if ((getChainParamsMethod = QueryGrpc.getChainParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChainParamsMethod = QueryGrpc.getChainParamsMethod) == null) {
          QueryGrpc.getChainParamsMethod = getChainParamsMethod =
              io.grpc.MethodDescriptor.<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChainParams"))
              .build();
        }
      }
    }
    return getChainParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPools",
      requestType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest.class,
      responseType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod() {
    io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> getIncentivizedPoolsMethod;
    if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPoolsMethod = QueryGrpc.getIncentivizedPoolsMethod) == null) {
          QueryGrpc.getIncentivizedPoolsMethod = getIncentivizedPoolsMethod =
              io.grpc.MethodDescriptor.<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPools"))
              .build();
        }
      }
    }
    return getIncentivizedPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest.class,
      responseType = com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest,
      com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest, com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    default void state(com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    default void chainParams(com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    default void incentivizedPools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    default void pools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public void state(com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public void chainParams(com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public void incentivizedPools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public void pools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse params(com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse state(com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse chainParams(com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse incentivizedPools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse pools(com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse> params(
        com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the state of oracle requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse> state(
        com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched params from osmosis chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse> chainParams(
        com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of incentivized pools from osmosis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse> incentivizedPools(
        com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries latest fetched list of pool details from osmosis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse> pools(
        com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_STATE = 1;
  private static final int METHODID_CHAIN_PARAMS = 2;
  private static final int METHODID_INCENTIVIZED_POOLS = 3;
  private static final int METHODID_POOLS = 4;

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
          serviceImpl.params((com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest) request,
              (io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse>) responseObserver);
          break;
        case METHODID_CHAIN_PARAMS:
          serviceImpl.chainParams((com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_POOLS:
          serviceImpl.incentivizedPools((com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse>) responseObserver);
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
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest,
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest,
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse>(
                service, METHODID_STATE)))
        .addMethod(
          getChainParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest,
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse>(
                service, METHODID_CHAIN_PARAMS)))
        .addMethod(
          getIncentivizedPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest,
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse>(
                service, METHODID_INCENTIVIZED_POOLS)))
        .addMethod(
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest,
              com.quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.quasarlabs.quasarnode.qoracle.osmosis.QueryProto.getDescriptor();
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
              .addMethod(getStateMethod())
              .addMethod(getChainParamsMethod())
              .addMethod(getIncentivizedPoolsMethod())
              .addMethod(getPoolsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
