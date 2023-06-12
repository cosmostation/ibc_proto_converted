package com.stafihub.stafihub.rdex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/rdex/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rdex.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryParamsRequest,
      com.stafihub.stafihub.rdex.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.rdex.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.rdex.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryParamsRequest,
      com.stafihub.stafihub.rdex.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryParamsRequest, com.stafihub.stafihub.rdex.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QueryParamsRequest, com.stafihub.stafihub.rdex.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest,
      com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolInfo",
      requestType = com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest.class,
      responseType = com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest,
      com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest, com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> getSwapPoolInfoMethod;
    if ((getSwapPoolInfoMethod = QueryGrpc.getSwapPoolInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapPoolInfoMethod = QueryGrpc.getSwapPoolInfoMethod) == null) {
          QueryGrpc.getSwapPoolInfoMethod = getSwapPoolInfoMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest, com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SwapPoolInfo"))
              .build();
        }
      }
    }
    return getSwapPoolInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolListRequest,
      com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> getSwapPoolListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapPoolList",
      requestType = com.stafihub.stafihub.rdex.QuerySwapPoolListRequest.class,
      responseType = com.stafihub.stafihub.rdex.QuerySwapPoolListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolListRequest,
      com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> getSwapPoolListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QuerySwapPoolListRequest, com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> getSwapPoolListMethod;
    if ((getSwapPoolListMethod = QueryGrpc.getSwapPoolListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapPoolListMethod = QueryGrpc.getSwapPoolListMethod) == null) {
          QueryGrpc.getSwapPoolListMethod = getSwapPoolListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QuerySwapPoolListRequest, com.stafihub.stafihub.rdex.QuerySwapPoolListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapPoolList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QuerySwapPoolListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QuerySwapPoolListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SwapPoolList"))
              .build();
        }
      }
    }
    return getSwapPoolListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderListRequest,
      com.stafihub.stafihub.rdex.QueryProviderListResponse> getProviderListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderList",
      requestType = com.stafihub.stafihub.rdex.QueryProviderListRequest.class,
      responseType = com.stafihub.stafihub.rdex.QueryProviderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderListRequest,
      com.stafihub.stafihub.rdex.QueryProviderListResponse> getProviderListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderListRequest, com.stafihub.stafihub.rdex.QueryProviderListResponse> getProviderListMethod;
    if ((getProviderListMethod = QueryGrpc.getProviderListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderListMethod = QueryGrpc.getProviderListMethod) == null) {
          QueryGrpc.getProviderListMethod = getProviderListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QueryProviderListRequest, com.stafihub.stafihub.rdex.QueryProviderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryProviderListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryProviderListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderList"))
              .build();
        }
      }
    }
    return getProviderListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest,
      com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> getPoolCreatorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolCreatorList",
      requestType = com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest.class,
      responseType = com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest,
      com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> getPoolCreatorListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest, com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> getPoolCreatorListMethod;
    if ((getPoolCreatorListMethod = QueryGrpc.getPoolCreatorListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolCreatorListMethod = QueryGrpc.getPoolCreatorListMethod) == null) {
          QueryGrpc.getPoolCreatorListMethod = getPoolCreatorListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest, com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolCreatorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolCreatorList"))
              .build();
        }
      }
    }
    return getPoolCreatorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderSwitchRequest,
      com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> getProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderSwitch",
      requestType = com.stafihub.stafihub.rdex.QueryProviderSwitchRequest.class,
      responseType = com.stafihub.stafihub.rdex.QueryProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderSwitchRequest,
      com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> getProviderSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.QueryProviderSwitchRequest, com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> getProviderSwitchMethod;
    if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderSwitchMethod = QueryGrpc.getProviderSwitchMethod) == null) {
          QueryGrpc.getProviderSwitchMethod = getProviderSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.QueryProviderSwitchRequest, com.stafihub.stafihub.rdex.QueryProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryProviderSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.QueryProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderSwitch"))
              .build();
        }
      }
    }
    return getProviderSwitchMethod;
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
    default void params(com.stafihub.stafihub.rdex.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    default void swapPoolInfo(com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    default void swapPoolList(com.stafihub.stafihub.rdex.QuerySwapPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapPoolListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    default void providerList(com.stafihub.stafihub.rdex.QueryProviderListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    default void poolCreatorList(com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolCreatorListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    default void providerSwitch(com.stafihub.stafihub.rdex.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderSwitchMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.rdex.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public void swapPoolInfo(com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public void swapPoolList(com.stafihub.stafihub.rdex.QuerySwapPoolListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapPoolListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public void providerList(com.stafihub.stafihub.rdex.QueryProviderListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public void poolCreatorList(com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolCreatorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public void providerSwitch(com.stafihub.stafihub.rdex.QueryProviderSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rdex.QueryParamsResponse params(com.stafihub.stafihub.rdex.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse swapPoolInfo(com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public com.stafihub.stafihub.rdex.QuerySwapPoolListResponse swapPoolList(com.stafihub.stafihub.rdex.QuerySwapPoolListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapPoolListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public com.stafihub.stafihub.rdex.QueryProviderListResponse providerList(com.stafihub.stafihub.rdex.QueryProviderListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse poolCreatorList(com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolCreatorListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.rdex.QueryProviderSwitchResponse providerSwitch(com.stafihub.stafihub.rdex.QueryProviderSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QueryParamsResponse> params(
        com.stafihub.stafihub.rdex.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolInfo items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse> swapPoolInfo(
        com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SwapPoolList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QuerySwapPoolListResponse> swapPoolList(
        com.stafihub.stafihub.rdex.QuerySwapPoolListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapPoolListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QueryProviderListResponse> providerList(
        com.stafihub.stafihub.rdex.QueryProviderListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoolCreatorList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse> poolCreatorList(
        com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolCreatorListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProviderSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.QueryProviderSwitchResponse> providerSwitch(
        com.stafihub.stafihub.rdex.QueryProviderSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SWAP_POOL_INFO = 1;
  private static final int METHODID_SWAP_POOL_LIST = 2;
  private static final int METHODID_PROVIDER_LIST = 3;
  private static final int METHODID_POOL_CREATOR_LIST = 4;
  private static final int METHODID_PROVIDER_SWITCH = 5;

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
          serviceImpl.params((com.stafihub.stafihub.rdex.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_INFO:
          serviceImpl.swapPoolInfo((com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse>) responseObserver);
          break;
        case METHODID_SWAP_POOL_LIST:
          serviceImpl.swapPoolList((com.stafihub.stafihub.rdex.QuerySwapPoolListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QuerySwapPoolListResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_LIST:
          serviceImpl.providerList((com.stafihub.stafihub.rdex.QueryProviderListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderListResponse>) responseObserver);
          break;
        case METHODID_POOL_CREATOR_LIST:
          serviceImpl.poolCreatorList((com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_SWITCH:
          serviceImpl.providerSwitch((com.stafihub.stafihub.rdex.QueryProviderSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.QueryProviderSwitchResponse>) responseObserver);
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
              com.stafihub.stafihub.rdex.QueryParamsRequest,
              com.stafihub.stafihub.rdex.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getSwapPoolInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.QuerySwapPoolInfoRequest,
              com.stafihub.stafihub.rdex.QuerySwapPoolInfoResponse>(
                service, METHODID_SWAP_POOL_INFO)))
        .addMethod(
          getSwapPoolListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.QuerySwapPoolListRequest,
              com.stafihub.stafihub.rdex.QuerySwapPoolListResponse>(
                service, METHODID_SWAP_POOL_LIST)))
        .addMethod(
          getProviderListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.QueryProviderListRequest,
              com.stafihub.stafihub.rdex.QueryProviderListResponse>(
                service, METHODID_PROVIDER_LIST)))
        .addMethod(
          getPoolCreatorListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.QueryPoolCreatorListRequest,
              com.stafihub.stafihub.rdex.QueryPoolCreatorListResponse>(
                service, METHODID_POOL_CREATOR_LIST)))
        .addMethod(
          getProviderSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.QueryProviderSwitchRequest,
              com.stafihub.stafihub.rdex.QueryProviderSwitchResponse>(
                service, METHODID_PROVIDER_SWITCH)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rdex.QueryProto.getDescriptor();
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
              .addMethod(getSwapPoolInfoMethod())
              .addMethod(getSwapPoolListMethod())
              .addMethod(getProviderListMethod())
              .addMethod(getPoolCreatorListMethod())
              .addMethod(getProviderSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
