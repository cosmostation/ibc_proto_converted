package com.cork.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC query service for the cork module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sommelier/cork/v2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cork.v2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryParamsRequest,
      com.cork.v2.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.cork.v2.QueryParamsRequest.class,
      responseType = com.cork.v2.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryParamsRequest,
      com.cork.v2.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryParamsRequest, com.cork.v2.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
          QueryGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryParamsRequest, com.cork.v2.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryCellarIDsRequest,
      com.cork.v2.QueryCellarIDsResponse> getQueryCellarIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCellarIDs",
      requestType = com.cork.v2.QueryCellarIDsRequest.class,
      responseType = com.cork.v2.QueryCellarIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryCellarIDsRequest,
      com.cork.v2.QueryCellarIDsResponse> getQueryCellarIDsMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryCellarIDsRequest, com.cork.v2.QueryCellarIDsResponse> getQueryCellarIDsMethod;
    if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
          QueryGrpc.getQueryCellarIDsMethod = getQueryCellarIDsMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryCellarIDsRequest, com.cork.v2.QueryCellarIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCellarIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCellarIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCellarIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCellarIDs"))
              .build();
        }
      }
    }
    return getQueryCellarIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksRequest,
      com.cork.v2.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorks",
      requestType = com.cork.v2.QueryScheduledCorksRequest.class,
      responseType = com.cork.v2.QueryScheduledCorksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksRequest,
      com.cork.v2.QueryScheduledCorksResponse> getQueryScheduledCorksMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksRequest, com.cork.v2.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;
    if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
          QueryGrpc.getQueryScheduledCorksMethod = getQueryScheduledCorksMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryScheduledCorksRequest, com.cork.v2.QueryScheduledCorksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorks"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledBlockHeightsRequest,
      com.cork.v2.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledBlockHeights",
      requestType = com.cork.v2.QueryScheduledBlockHeightsRequest.class,
      responseType = com.cork.v2.QueryScheduledBlockHeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledBlockHeightsRequest,
      com.cork.v2.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledBlockHeightsRequest, com.cork.v2.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;
    if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
          QueryGrpc.getQueryScheduledBlockHeightsMethod = getQueryScheduledBlockHeightsMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryScheduledBlockHeightsRequest, com.cork.v2.QueryScheduledBlockHeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledBlockHeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledBlockHeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledBlockHeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledBlockHeights"))
              .build();
        }
      }
    }
    return getQueryScheduledBlockHeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByBlockHeightRequest,
      com.cork.v2.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorksByBlockHeight",
      requestType = com.cork.v2.QueryScheduledCorksByBlockHeightRequest.class,
      responseType = com.cork.v2.QueryScheduledCorksByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByBlockHeightRequest,
      com.cork.v2.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByBlockHeightRequest, com.cork.v2.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;
    if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
          QueryGrpc.getQueryScheduledCorksByBlockHeightMethod = getQueryScheduledCorksByBlockHeightMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryScheduledCorksByBlockHeightRequest, com.cork.v2.QueryScheduledCorksByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorksByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorksByBlockHeight"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksByBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByIDRequest,
      com.cork.v2.QueryScheduledCorksByIDResponse> getQueryScheduledCorksByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorksByID",
      requestType = com.cork.v2.QueryScheduledCorksByIDRequest.class,
      responseType = com.cork.v2.QueryScheduledCorksByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByIDRequest,
      com.cork.v2.QueryScheduledCorksByIDResponse> getQueryScheduledCorksByIDMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryScheduledCorksByIDRequest, com.cork.v2.QueryScheduledCorksByIDResponse> getQueryScheduledCorksByIDMethod;
    if ((getQueryScheduledCorksByIDMethod = QueryGrpc.getQueryScheduledCorksByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksByIDMethod = QueryGrpc.getQueryScheduledCorksByIDMethod) == null) {
          QueryGrpc.getQueryScheduledCorksByIDMethod = getQueryScheduledCorksByIDMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryScheduledCorksByIDRequest, com.cork.v2.QueryScheduledCorksByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorksByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryScheduledCorksByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorksByID"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultRequest,
      com.cork.v2.QueryCorkResultResponse> getQueryCorkResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCorkResult",
      requestType = com.cork.v2.QueryCorkResultRequest.class,
      responseType = com.cork.v2.QueryCorkResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultRequest,
      com.cork.v2.QueryCorkResultResponse> getQueryCorkResultMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultRequest, com.cork.v2.QueryCorkResultResponse> getQueryCorkResultMethod;
    if ((getQueryCorkResultMethod = QueryGrpc.getQueryCorkResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCorkResultMethod = QueryGrpc.getQueryCorkResultMethod) == null) {
          QueryGrpc.getQueryCorkResultMethod = getQueryCorkResultMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryCorkResultRequest, com.cork.v2.QueryCorkResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCorkResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCorkResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCorkResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCorkResult"))
              .build();
        }
      }
    }
    return getQueryCorkResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultsRequest,
      com.cork.v2.QueryCorkResultsResponse> getQueryCorkResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCorkResults",
      requestType = com.cork.v2.QueryCorkResultsRequest.class,
      responseType = com.cork.v2.QueryCorkResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultsRequest,
      com.cork.v2.QueryCorkResultsResponse> getQueryCorkResultsMethod() {
    io.grpc.MethodDescriptor<com.cork.v2.QueryCorkResultsRequest, com.cork.v2.QueryCorkResultsResponse> getQueryCorkResultsMethod;
    if ((getQueryCorkResultsMethod = QueryGrpc.getQueryCorkResultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCorkResultsMethod = QueryGrpc.getQueryCorkResultsMethod) == null) {
          QueryGrpc.getQueryCorkResultsMethod = getQueryCorkResultsMethod =
              io.grpc.MethodDescriptor.<com.cork.v2.QueryCorkResultsRequest, com.cork.v2.QueryCorkResultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCorkResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCorkResultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v2.QueryCorkResultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCorkResults"))
              .build();
        }
      }
    }
    return getQueryCorkResultsMethod;
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
   * Query defines the gRPC query service for the cork module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    default void queryParams(com.cork.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    default void queryCellarIDs(com.cork.v2.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCellarIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCellarIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    default void queryScheduledCorks(com.cork.v2.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledCorksMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    default void queryScheduledBlockHeights(com.cork.v2.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledBlockHeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledBlockHeightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    default void queryScheduledCorksByBlockHeight(com.cork.v2.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledCorksByBlockHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks with the specified ID
     * </pre>
     */
    default void queryScheduledCorksByID(com.cork.v2.QueryScheduledCorksByIDRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledCorksByIDMethod(), responseObserver);
    }

    /**
     */
    default void queryCorkResult(com.cork.v2.QueryCorkResultRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCorkResultMethod(), responseObserver);
    }

    /**
     */
    default void queryCorkResults(com.cork.v2.QueryCorkResultsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCorkResultsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public void queryParams(com.cork.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public void queryCellarIDs(com.cork.v2.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCellarIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public void queryScheduledCorks(com.cork.v2.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public void queryScheduledBlockHeights(com.cork.v2.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledBlockHeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public void queryScheduledCorksByBlockHeight(com.cork.v2.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks with the specified ID
     * </pre>
     */
    public void queryScheduledCorksByID(com.cork.v2.QueryScheduledCorksByIDRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCorkResult(com.cork.v2.QueryCorkResultRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCorkResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCorkResults(com.cork.v2.QueryCorkResultsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCorkResultsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public com.cork.v2.QueryParamsResponse queryParams(com.cork.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public com.cork.v2.QueryCellarIDsResponse queryCellarIDs(com.cork.v2.QueryCellarIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCellarIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public com.cork.v2.QueryScheduledCorksResponse queryScheduledCorks(com.cork.v2.QueryScheduledCorksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledCorksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public com.cork.v2.QueryScheduledBlockHeightsResponse queryScheduledBlockHeights(com.cork.v2.QueryScheduledBlockHeightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledBlockHeightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public com.cork.v2.QueryScheduledCorksByBlockHeightResponse queryScheduledCorksByBlockHeight(com.cork.v2.QueryScheduledCorksByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledCorksByBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks with the specified ID
     * </pre>
     */
    public com.cork.v2.QueryScheduledCorksByIDResponse queryScheduledCorksByID(com.cork.v2.QueryScheduledCorksByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledCorksByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cork.v2.QueryCorkResultResponse queryCorkResult(com.cork.v2.QueryCorkResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCorkResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cork.v2.QueryCorkResultsResponse queryCorkResults(com.cork.v2.QueryCorkResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCorkResultsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the cork module.
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
     * QueryParams queries the allocation module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryParamsResponse> queryParams(
        com.cork.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryCellarIDsResponse> queryCellarIDs(
        com.cork.v2.QueryCellarIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryScheduledCorksResponse> queryScheduledCorks(
        com.cork.v2.QueryScheduledCorksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryScheduledBlockHeightsResponse> queryScheduledBlockHeights(
        com.cork.v2.QueryScheduledBlockHeightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryScheduledCorksByBlockHeightResponse> queryScheduledCorksByBlockHeight(
        com.cork.v2.QueryScheduledCorksByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks with the specified ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryScheduledCorksByIDResponse> queryScheduledCorksByID(
        com.cork.v2.QueryScheduledCorksByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryCorkResultResponse> queryCorkResult(
        com.cork.v2.QueryCorkResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCorkResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v2.QueryCorkResultsResponse> queryCorkResults(
        com.cork.v2.QueryCorkResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCorkResultsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PARAMS = 0;
  private static final int METHODID_QUERY_CELLAR_IDS = 1;
  private static final int METHODID_QUERY_SCHEDULED_CORKS = 2;
  private static final int METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS = 3;
  private static final int METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT = 4;
  private static final int METHODID_QUERY_SCHEDULED_CORKS_BY_ID = 5;
  private static final int METHODID_QUERY_CORK_RESULT = 6;
  private static final int METHODID_QUERY_CORK_RESULTS = 7;

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
          serviceImpl.queryParams((com.cork.v2.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_CELLAR_IDS:
          serviceImpl.queryCellarIDs((com.cork.v2.QueryCellarIDsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryCellarIDsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS:
          serviceImpl.queryScheduledCorks((com.cork.v2.QueryScheduledCorksRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS:
          serviceImpl.queryScheduledBlockHeights((com.cork.v2.QueryScheduledBlockHeightsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledBlockHeightsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT:
          serviceImpl.queryScheduledCorksByBlockHeight((com.cork.v2.QueryScheduledCorksByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByBlockHeightResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS_BY_ID:
          serviceImpl.queryScheduledCorksByID((com.cork.v2.QueryScheduledCorksByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryScheduledCorksByIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_CORK_RESULT:
          serviceImpl.queryCorkResult((com.cork.v2.QueryCorkResultRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultResponse>) responseObserver);
          break;
        case METHODID_QUERY_CORK_RESULTS:
          serviceImpl.queryCorkResults((com.cork.v2.QueryCorkResultsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v2.QueryCorkResultsResponse>) responseObserver);
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
              com.cork.v2.QueryParamsRequest,
              com.cork.v2.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .addMethod(
          getQueryCellarIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryCellarIDsRequest,
              com.cork.v2.QueryCellarIDsResponse>(
                service, METHODID_QUERY_CELLAR_IDS)))
        .addMethod(
          getQueryScheduledCorksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryScheduledCorksRequest,
              com.cork.v2.QueryScheduledCorksResponse>(
                service, METHODID_QUERY_SCHEDULED_CORKS)))
        .addMethod(
          getQueryScheduledBlockHeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryScheduledBlockHeightsRequest,
              com.cork.v2.QueryScheduledBlockHeightsResponse>(
                service, METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS)))
        .addMethod(
          getQueryScheduledCorksByBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryScheduledCorksByBlockHeightRequest,
              com.cork.v2.QueryScheduledCorksByBlockHeightResponse>(
                service, METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT)))
        .addMethod(
          getQueryScheduledCorksByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryScheduledCorksByIDRequest,
              com.cork.v2.QueryScheduledCorksByIDResponse>(
                service, METHODID_QUERY_SCHEDULED_CORKS_BY_ID)))
        .addMethod(
          getQueryCorkResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryCorkResultRequest,
              com.cork.v2.QueryCorkResultResponse>(
                service, METHODID_QUERY_CORK_RESULT)))
        .addMethod(
          getQueryCorkResultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v2.QueryCorkResultsRequest,
              com.cork.v2.QueryCorkResultsResponse>(
                service, METHODID_QUERY_CORK_RESULTS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cork.v2.QueryProto.getDescriptor();
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
              .addMethod(getQueryParamsMethod())
              .addMethod(getQueryCellarIDsMethod())
              .addMethod(getQueryScheduledCorksMethod())
              .addMethod(getQueryScheduledBlockHeightsMethod())
              .addMethod(getQueryScheduledCorksByBlockHeightMethod())
              .addMethod(getQueryScheduledCorksByIDMethod())
              .addMethod(getQueryCorkResultMethod())
              .addMethod(getQueryCorkResultsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
