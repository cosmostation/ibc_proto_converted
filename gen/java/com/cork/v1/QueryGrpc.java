package com.cork.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC query service for the cork module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sommelier/cork/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cork.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryParamsRequest,
      com.cork.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.cork.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.cork.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryParamsRequest,
      com.cork.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryParamsRequest, com.cork.v1.QueryProto.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
          QueryGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryParamsRequest, com.cork.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QuerySubmittedCorksRequest,
      com.cork.v1.QueryProto.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubmittedCorks",
      requestType = com.cork.v1.QueryProto.QuerySubmittedCorksRequest.class,
      responseType = com.cork.v1.QueryProto.QuerySubmittedCorksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QuerySubmittedCorksRequest,
      com.cork.v1.QueryProto.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QuerySubmittedCorksRequest, com.cork.v1.QueryProto.QuerySubmittedCorksResponse> getQuerySubmittedCorksMethod;
    if ((getQuerySubmittedCorksMethod = QueryGrpc.getQuerySubmittedCorksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubmittedCorksMethod = QueryGrpc.getQuerySubmittedCorksMethod) == null) {
          QueryGrpc.getQuerySubmittedCorksMethod = getQuerySubmittedCorksMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QuerySubmittedCorksRequest, com.cork.v1.QueryProto.QuerySubmittedCorksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubmittedCorks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QuerySubmittedCorksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QuerySubmittedCorksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubmittedCorks"))
              .build();
        }
      }
    }
    return getQuerySubmittedCorksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCommitPeriodRequest,
      com.cork.v1.QueryProto.QueryCommitPeriodResponse> getQueryCommitPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCommitPeriod",
      requestType = com.cork.v1.QueryProto.QueryCommitPeriodRequest.class,
      responseType = com.cork.v1.QueryProto.QueryCommitPeriodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCommitPeriodRequest,
      com.cork.v1.QueryProto.QueryCommitPeriodResponse> getQueryCommitPeriodMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCommitPeriodRequest, com.cork.v1.QueryProto.QueryCommitPeriodResponse> getQueryCommitPeriodMethod;
    if ((getQueryCommitPeriodMethod = QueryGrpc.getQueryCommitPeriodMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCommitPeriodMethod = QueryGrpc.getQueryCommitPeriodMethod) == null) {
          QueryGrpc.getQueryCommitPeriodMethod = getQueryCommitPeriodMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryCommitPeriodRequest, com.cork.v1.QueryProto.QueryCommitPeriodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCommitPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryCommitPeriodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryCommitPeriodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCommitPeriod"))
              .build();
        }
      }
    }
    return getQueryCommitPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCellarIDsRequest,
      com.cork.v1.QueryProto.QueryCellarIDsResponse> getQueryCellarIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCellarIDs",
      requestType = com.cork.v1.QueryProto.QueryCellarIDsRequest.class,
      responseType = com.cork.v1.QueryProto.QueryCellarIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCellarIDsRequest,
      com.cork.v1.QueryProto.QueryCellarIDsResponse> getQueryCellarIDsMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryCellarIDsRequest, com.cork.v1.QueryProto.QueryCellarIDsResponse> getQueryCellarIDsMethod;
    if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCellarIDsMethod = QueryGrpc.getQueryCellarIDsMethod) == null) {
          QueryGrpc.getQueryCellarIDsMethod = getQueryCellarIDsMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryCellarIDsRequest, com.cork.v1.QueryProto.QueryCellarIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCellarIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryCellarIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryCellarIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCellarIDs"))
              .build();
        }
      }
    }
    return getQueryCellarIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksRequest,
      com.cork.v1.QueryProto.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorks",
      requestType = com.cork.v1.QueryProto.QueryScheduledCorksRequest.class,
      responseType = com.cork.v1.QueryProto.QueryScheduledCorksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksRequest,
      com.cork.v1.QueryProto.QueryScheduledCorksResponse> getQueryScheduledCorksMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksRequest, com.cork.v1.QueryProto.QueryScheduledCorksResponse> getQueryScheduledCorksMethod;
    if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksMethod = QueryGrpc.getQueryScheduledCorksMethod) == null) {
          QueryGrpc.getQueryScheduledCorksMethod = getQueryScheduledCorksMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryScheduledCorksRequest, com.cork.v1.QueryProto.QueryScheduledCorksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledCorksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledCorksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorks"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest,
      com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledBlockHeights",
      requestType = com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest.class,
      responseType = com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest,
      com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest, com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> getQueryScheduledBlockHeightsMethod;
    if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledBlockHeightsMethod = QueryGrpc.getQueryScheduledBlockHeightsMethod) == null) {
          QueryGrpc.getQueryScheduledBlockHeightsMethod = getQueryScheduledBlockHeightsMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest, com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledBlockHeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledBlockHeights"))
              .build();
        }
      }
    }
    return getQueryScheduledBlockHeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest,
      com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryScheduledCorksByBlockHeight",
      requestType = com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest.class,
      responseType = com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest,
      com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod() {
    io.grpc.MethodDescriptor<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest, com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> getQueryScheduledCorksByBlockHeightMethod;
    if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryScheduledCorksByBlockHeightMethod = QueryGrpc.getQueryScheduledCorksByBlockHeightMethod) == null) {
          QueryGrpc.getQueryScheduledCorksByBlockHeightMethod = getQueryScheduledCorksByBlockHeightMethod =
              io.grpc.MethodDescriptor.<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest, com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryScheduledCorksByBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryScheduledCorksByBlockHeight"))
              .build();
        }
      }
    }
    return getQueryScheduledCorksByBlockHeightMethod;
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
    default void queryParams(com.cork.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    default void querySubmittedCorks(com.cork.v1.QueryProto.QuerySubmittedCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QuerySubmittedCorksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubmittedCorksMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    default void queryCommitPeriod(com.cork.v1.QueryProto.QueryCommitPeriodRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCommitPeriodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCommitPeriodMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    default void queryCellarIDs(com.cork.v1.QueryProto.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCellarIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCellarIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    default void queryScheduledCorks(com.cork.v1.QueryProto.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledCorksMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    default void queryScheduledBlockHeights(com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledBlockHeightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    default void queryScheduledCorksByBlockHeight(com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryScheduledCorksByBlockHeightMethod(), responseObserver);
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
    public void queryParams(com.cork.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public void querySubmittedCorks(com.cork.v1.QueryProto.QuerySubmittedCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QuerySubmittedCorksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubmittedCorksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public void queryCommitPeriod(com.cork.v1.QueryProto.QueryCommitPeriodRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCommitPeriodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCommitPeriodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public void queryCellarIDs(com.cork.v1.QueryProto.QueryCellarIDsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCellarIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public void queryScheduledCorks(com.cork.v1.QueryProto.QueryScheduledCorksRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public void queryScheduledBlockHeights(com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public void queryScheduledCorksByBlockHeight(com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request, responseObserver);
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
    public com.cork.v1.QueryProto.QueryParamsResponse queryParams(com.cork.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public com.cork.v1.QueryProto.QuerySubmittedCorksResponse querySubmittedCorks(com.cork.v1.QueryProto.QuerySubmittedCorksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubmittedCorksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public com.cork.v1.QueryProto.QueryCommitPeriodResponse queryCommitPeriod(com.cork.v1.QueryProto.QueryCommitPeriodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCommitPeriodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public com.cork.v1.QueryProto.QueryCellarIDsResponse queryCellarIDs(com.cork.v1.QueryProto.QueryCellarIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCellarIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public com.cork.v1.QueryProto.QueryScheduledCorksResponse queryScheduledCorks(com.cork.v1.QueryProto.QueryScheduledCorksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledCorksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse queryScheduledBlockHeights(com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledBlockHeightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse queryScheduledCorksByBlockHeight(com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryScheduledCorksByBlockHeightMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryParamsResponse> queryParams(
        com.cork.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QuerySubmittedCorks queries the submitted corks awaiting vote
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QuerySubmittedCorksResponse> querySubmittedCorks(
        com.cork.v1.QueryProto.QuerySubmittedCorksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubmittedCorksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryCommitPeriod queries the heights for the current voting period (current, start and end)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryCommitPeriodResponse> queryCommitPeriod(
        com.cork.v1.QueryProto.QueryCommitPeriodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCommitPeriodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryCellarIDs returns all cellars and current tick ranges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryCellarIDsResponse> queryCellarIDs(
        com.cork.v1.QueryProto.QueryCellarIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCellarIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryScheduledCorksResponse> queryScheduledCorks(
        com.cork.v1.QueryProto.QueryScheduledCorksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledBlockHeights returns all scheduled block heights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse> queryScheduledBlockHeights(
        com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledBlockHeightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryScheduledCorks returns all scheduled corks at a block height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse> queryScheduledCorksByBlockHeight(
        com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryScheduledCorksByBlockHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PARAMS = 0;
  private static final int METHODID_QUERY_SUBMITTED_CORKS = 1;
  private static final int METHODID_QUERY_COMMIT_PERIOD = 2;
  private static final int METHODID_QUERY_CELLAR_IDS = 3;
  private static final int METHODID_QUERY_SCHEDULED_CORKS = 4;
  private static final int METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS = 5;
  private static final int METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT = 6;

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
          serviceImpl.queryParams((com.cork.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBMITTED_CORKS:
          serviceImpl.querySubmittedCorks((com.cork.v1.QueryProto.QuerySubmittedCorksRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QuerySubmittedCorksResponse>) responseObserver);
          break;
        case METHODID_QUERY_COMMIT_PERIOD:
          serviceImpl.queryCommitPeriod((com.cork.v1.QueryProto.QueryCommitPeriodRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCommitPeriodResponse>) responseObserver);
          break;
        case METHODID_QUERY_CELLAR_IDS:
          serviceImpl.queryCellarIDs((com.cork.v1.QueryProto.QueryCellarIDsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryCellarIDsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS:
          serviceImpl.queryScheduledCorks((com.cork.v1.QueryProto.QueryScheduledCorksRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS:
          serviceImpl.queryScheduledBlockHeights((com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT:
          serviceImpl.queryScheduledCorksByBlockHeight((com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse>) responseObserver);
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
              com.cork.v1.QueryProto.QueryParamsRequest,
              com.cork.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .addMethod(
          getQuerySubmittedCorksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QuerySubmittedCorksRequest,
              com.cork.v1.QueryProto.QuerySubmittedCorksResponse>(
                service, METHODID_QUERY_SUBMITTED_CORKS)))
        .addMethod(
          getQueryCommitPeriodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QueryCommitPeriodRequest,
              com.cork.v1.QueryProto.QueryCommitPeriodResponse>(
                service, METHODID_QUERY_COMMIT_PERIOD)))
        .addMethod(
          getQueryCellarIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QueryCellarIDsRequest,
              com.cork.v1.QueryProto.QueryCellarIDsResponse>(
                service, METHODID_QUERY_CELLAR_IDS)))
        .addMethod(
          getQueryScheduledCorksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QueryScheduledCorksRequest,
              com.cork.v1.QueryProto.QueryScheduledCorksResponse>(
                service, METHODID_QUERY_SCHEDULED_CORKS)))
        .addMethod(
          getQueryScheduledBlockHeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QueryScheduledBlockHeightsRequest,
              com.cork.v1.QueryProto.QueryScheduledBlockHeightsResponse>(
                service, METHODID_QUERY_SCHEDULED_BLOCK_HEIGHTS)))
        .addMethod(
          getQueryScheduledCorksByBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightRequest,
              com.cork.v1.QueryProto.QueryScheduledCorksByBlockHeightResponse>(
                service, METHODID_QUERY_SCHEDULED_CORKS_BY_BLOCK_HEIGHT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cork.v1.QueryProto.getDescriptor();
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
              .addMethod(getQuerySubmittedCorksMethod())
              .addMethod(getQueryCommitPeriodMethod())
              .addMethod(getQueryCellarIDsMethod())
              .addMethod(getQueryScheduledCorksMethod())
              .addMethod(getQueryScheduledBlockHeightsMethod())
              .addMethod(getQueryScheduledCorksByBlockHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}
