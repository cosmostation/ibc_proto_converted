package com.neutron.interchainqueries;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/interchainqueries/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "neutron.interchainqueries.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryParamsRequest,
      com.neutron.interchainqueries.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.neutron.interchainqueries.QueryParamsRequest.class,
      responseType = com.neutron.interchainqueries.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryParamsRequest,
      com.neutron.interchainqueries.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryParamsRequest, com.neutron.interchainqueries.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.QueryParamsRequest, com.neutron.interchainqueries.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueriesRequest,
      com.neutron.interchainqueries.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredQueries",
      requestType = com.neutron.interchainqueries.QueryRegisteredQueriesRequest.class,
      responseType = com.neutron.interchainqueries.QueryRegisteredQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueriesRequest,
      com.neutron.interchainqueries.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueriesRequest, com.neutron.interchainqueries.QueryRegisteredQueriesResponse> getRegisteredQueriesMethod;
    if ((getRegisteredQueriesMethod = QueryGrpc.getRegisteredQueriesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredQueriesMethod = QueryGrpc.getRegisteredQueriesMethod) == null) {
          QueryGrpc.getRegisteredQueriesMethod = getRegisteredQueriesMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.QueryRegisteredQueriesRequest, com.neutron.interchainqueries.QueryRegisteredQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredQueries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredQueries"))
              .build();
        }
      }
    }
    return getRegisteredQueriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryRequest,
      com.neutron.interchainqueries.QueryRegisteredQueryResponse> getRegisteredQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredQuery",
      requestType = com.neutron.interchainqueries.QueryRegisteredQueryRequest.class,
      responseType = com.neutron.interchainqueries.QueryRegisteredQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryRequest,
      com.neutron.interchainqueries.QueryRegisteredQueryResponse> getRegisteredQueryMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryRequest, com.neutron.interchainqueries.QueryRegisteredQueryResponse> getRegisteredQueryMethod;
    if ((getRegisteredQueryMethod = QueryGrpc.getRegisteredQueryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredQueryMethod = QueryGrpc.getRegisteredQueryMethod) == null) {
          QueryGrpc.getRegisteredQueryMethod = getRegisteredQueryMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.QueryRegisteredQueryRequest, com.neutron.interchainqueries.QueryRegisteredQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredQuery"))
              .build();
        }
      }
    }
    return getRegisteredQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryResultRequest,
      com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> getQueryResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryResult",
      requestType = com.neutron.interchainqueries.QueryRegisteredQueryResultRequest.class,
      responseType = com.neutron.interchainqueries.QueryRegisteredQueryResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryResultRequest,
      com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> getQueryResultMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryRegisteredQueryResultRequest, com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> getQueryResultMethod;
    if ((getQueryResultMethod = QueryGrpc.getQueryResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryResultMethod = QueryGrpc.getQueryResultMethod) == null) {
          QueryGrpc.getQueryResultMethod = getQueryResultMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.QueryRegisteredQueryResultRequest, com.neutron.interchainqueries.QueryRegisteredQueryResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueryResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryRegisteredQueryResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryResult"))
              .build();
        }
      }
    }
    return getQueryResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryLastRemoteHeight,
      com.neutron.interchainqueries.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastRemoteHeight",
      requestType = com.neutron.interchainqueries.QueryLastRemoteHeight.class,
      responseType = com.neutron.interchainqueries.QueryLastRemoteHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryLastRemoteHeight,
      com.neutron.interchainqueries.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.QueryLastRemoteHeight, com.neutron.interchainqueries.QueryLastRemoteHeightResponse> getLastRemoteHeightMethod;
    if ((getLastRemoteHeightMethod = QueryGrpc.getLastRemoteHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastRemoteHeightMethod = QueryGrpc.getLastRemoteHeightMethod) == null) {
          QueryGrpc.getLastRemoteHeightMethod = getLastRemoteHeightMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.QueryLastRemoteHeight, com.neutron.interchainqueries.QueryLastRemoteHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastRemoteHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryLastRemoteHeight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.QueryLastRemoteHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastRemoteHeight"))
              .build();
        }
      }
    }
    return getLastRemoteHeightMethod;
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
    default void params(com.neutron.interchainqueries.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void registeredQueries(com.neutron.interchainqueries.QueryRegisteredQueriesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisteredQueriesMethod(), responseObserver);
    }

    /**
     */
    default void registeredQuery(com.neutron.interchainqueries.QueryRegisteredQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisteredQueryMethod(), responseObserver);
    }

    /**
     */
    default void queryResult(com.neutron.interchainqueries.QueryRegisteredQueryResultRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryResultMethod(), responseObserver);
    }

    /**
     */
    default void lastRemoteHeight(com.neutron.interchainqueries.QueryLastRemoteHeight request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryLastRemoteHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastRemoteHeightMethod(), responseObserver);
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
    public void params(com.neutron.interchainqueries.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registeredQueries(com.neutron.interchainqueries.QueryRegisteredQueriesRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisteredQueriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registeredQuery(com.neutron.interchainqueries.QueryRegisteredQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisteredQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryResult(com.neutron.interchainqueries.QueryRegisteredQueryResultRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastRemoteHeight(com.neutron.interchainqueries.QueryLastRemoteHeight request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryLastRemoteHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastRemoteHeightMethod(), getCallOptions()), request, responseObserver);
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
    public com.neutron.interchainqueries.QueryParamsResponse params(com.neutron.interchainqueries.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.QueryRegisteredQueriesResponse registeredQueries(com.neutron.interchainqueries.QueryRegisteredQueriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisteredQueriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.QueryRegisteredQueryResponse registeredQuery(com.neutron.interchainqueries.QueryRegisteredQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisteredQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.QueryRegisteredQueryResultResponse queryResult(com.neutron.interchainqueries.QueryRegisteredQueryResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.QueryLastRemoteHeightResponse lastRemoteHeight(com.neutron.interchainqueries.QueryLastRemoteHeight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastRemoteHeightMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.QueryParamsResponse> params(
        com.neutron.interchainqueries.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.QueryRegisteredQueriesResponse> registeredQueries(
        com.neutron.interchainqueries.QueryRegisteredQueriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisteredQueriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.QueryRegisteredQueryResponse> registeredQuery(
        com.neutron.interchainqueries.QueryRegisteredQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisteredQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.QueryRegisteredQueryResultResponse> queryResult(
        com.neutron.interchainqueries.QueryRegisteredQueryResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.QueryLastRemoteHeightResponse> lastRemoteHeight(
        com.neutron.interchainqueries.QueryLastRemoteHeight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastRemoteHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_REGISTERED_QUERIES = 1;
  private static final int METHODID_REGISTERED_QUERY = 2;
  private static final int METHODID_QUERY_RESULT = 3;
  private static final int METHODID_LAST_REMOTE_HEIGHT = 4;

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
          serviceImpl.params((com.neutron.interchainqueries.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_QUERIES:
          serviceImpl.registeredQueries((com.neutron.interchainqueries.QueryRegisteredQueriesRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueriesResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_QUERY:
          serviceImpl.registeredQuery((com.neutron.interchainqueries.QueryRegisteredQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResponse>) responseObserver);
          break;
        case METHODID_QUERY_RESULT:
          serviceImpl.queryResult((com.neutron.interchainqueries.QueryRegisteredQueryResultRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryRegisteredQueryResultResponse>) responseObserver);
          break;
        case METHODID_LAST_REMOTE_HEIGHT:
          serviceImpl.lastRemoteHeight((com.neutron.interchainqueries.QueryLastRemoteHeight) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.QueryLastRemoteHeightResponse>) responseObserver);
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
              com.neutron.interchainqueries.QueryParamsRequest,
              com.neutron.interchainqueries.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRegisteredQueriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.QueryRegisteredQueriesRequest,
              com.neutron.interchainqueries.QueryRegisteredQueriesResponse>(
                service, METHODID_REGISTERED_QUERIES)))
        .addMethod(
          getRegisteredQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.QueryRegisteredQueryRequest,
              com.neutron.interchainqueries.QueryRegisteredQueryResponse>(
                service, METHODID_REGISTERED_QUERY)))
        .addMethod(
          getQueryResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.QueryRegisteredQueryResultRequest,
              com.neutron.interchainqueries.QueryRegisteredQueryResultResponse>(
                service, METHODID_QUERY_RESULT)))
        .addMethod(
          getLastRemoteHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.QueryLastRemoteHeight,
              com.neutron.interchainqueries.QueryLastRemoteHeightResponse>(
                service, METHODID_LAST_REMOTE_HEIGHT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.interchainqueries.QueryProto.getDescriptor();
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
              .addMethod(getRegisteredQueriesMethod())
              .addMethod(getRegisteredQueryMethod())
              .addMethod(getQueryResultMethod())
              .addMethod(getLastRemoteHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
