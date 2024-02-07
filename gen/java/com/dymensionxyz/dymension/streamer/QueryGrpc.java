package com.dymensionxyz.dymension.streamer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: dymension/streamer/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "dymensionxyz.dymension.streamer.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleToDistributeCoins",
      requestType = com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest.class,
      responseType = com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest, com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;
    if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
          QueryGrpc.getModuleToDistributeCoinsMethod = getModuleToDistributeCoinsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest, com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleToDistributeCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleToDistributeCoins"))
              .build();
        }
      }
    }
    return getModuleToDistributeCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> getStreamByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamByID",
      requestType = com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest.class,
      responseType = com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> getStreamByIDMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest, com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> getStreamByIDMethod;
    if ((getStreamByIDMethod = QueryGrpc.getStreamByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStreamByIDMethod = QueryGrpc.getStreamByIDMethod) == null) {
          QueryGrpc.getStreamByIDMethod = getStreamByIDMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest, com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StreamByID"))
              .build();
        }
      }
    }
    return getStreamByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> getStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Streams",
      requestType = com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest.class,
      responseType = com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> getStreamsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> getStreamsMethod;
    if ((getStreamsMethod = QueryGrpc.getStreamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStreamsMethod = QueryGrpc.getStreamsMethod) == null) {
          QueryGrpc.getStreamsMethod = getStreamsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Streams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Streams"))
              .build();
        }
      }
    }
    return getStreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> getActiveStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveStreams",
      requestType = com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest.class,
      responseType = com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> getActiveStreamsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> getActiveStreamsMethod;
    if ((getActiveStreamsMethod = QueryGrpc.getActiveStreamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveStreamsMethod = QueryGrpc.getActiveStreamsMethod) == null) {
          QueryGrpc.getActiveStreamsMethod = getActiveStreamsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveStreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveStreams"))
              .build();
        }
      }
    }
    return getActiveStreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> getUpcomingStreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingStreams",
      requestType = com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest.class,
      responseType = com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest,
      com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> getUpcomingStreamsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> getUpcomingStreamsMethod;
    if ((getUpcomingStreamsMethod = QueryGrpc.getUpcomingStreamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingStreamsMethod = QueryGrpc.getUpcomingStreamsMethod) == null) {
          QueryGrpc.getUpcomingStreamsMethod = getUpcomingStreamsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest, com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingStreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingStreams"))
              .build();
        }
      }
    }
    return getUpcomingStreamsMethod;
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
    default void moduleToDistributeCoins(com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleToDistributeCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamByID returns streams by their respective ID
     * </pre>
     */
    default void streamByID(com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams returns both upcoming and active streams
     * </pre>
     */
    default void streams(com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveStreams returns active streams
     * </pre>
     */
    default void activeStreams(com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveStreamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled streams that have not yet occurred
     * </pre>
     */
    default void upcomingStreams(com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingStreamsMethod(), responseObserver);
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
    public void moduleToDistributeCoins(com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamByID returns streams by their respective ID
     * </pre>
     */
    public void streamByID(com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStreamByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams returns both upcoming and active streams
     * </pre>
     */
    public void streams(com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveStreams returns active streams
     * </pre>
     */
    public void activeStreams(com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveStreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled streams that have not yet occurred
     * </pre>
     */
    public void upcomingStreams(com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingStreamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse moduleToDistributeCoins(com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleToDistributeCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamByID returns streams by their respective ID
     * </pre>
     */
    public com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse streamByID(com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStreamByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams returns both upcoming and active streams
     * </pre>
     */
    public com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse streams(com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveStreams returns active streams
     * </pre>
     */
    public com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse activeStreams(com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveStreamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns scheduled streams that have not yet occurred
     * </pre>
     */
    public com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse upcomingStreams(com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingStreamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse> moduleToDistributeCoins(
        com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StreamByID returns streams by their respective ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse> streamByID(
        com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStreamByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Streams returns both upcoming and active streams
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse> streams(
        com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStreamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveStreams returns active streams
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse> activeStreams(
        com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveStreamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns scheduled streams that have not yet occurred
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse> upcomingStreams(
        com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingStreamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_TO_DISTRIBUTE_COINS = 0;
  private static final int METHODID_STREAM_BY_ID = 1;
  private static final int METHODID_STREAMS = 2;
  private static final int METHODID_ACTIVE_STREAMS = 3;
  private static final int METHODID_UPCOMING_STREAMS = 4;

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
          serviceImpl.moduleToDistributeCoins((com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse>) responseObserver);
          break;
        case METHODID_STREAM_BY_ID:
          serviceImpl.streamByID((com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse>) responseObserver);
          break;
        case METHODID_STREAMS:
          serviceImpl.streams((com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_STREAMS:
          serviceImpl.activeStreams((com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_STREAMS:
          serviceImpl.upcomingStreams((com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse>) responseObserver);
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
              com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsRequest,
              com.dymensionxyz.dymension.streamer.QueryProto.ModuleToDistributeCoinsResponse>(
                service, METHODID_MODULE_TO_DISTRIBUTE_COINS)))
        .addMethod(
          getStreamByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDRequest,
              com.dymensionxyz.dymension.streamer.QueryProto.StreamByIDResponse>(
                service, METHODID_STREAM_BY_ID)))
        .addMethod(
          getStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.streamer.QueryProto.StreamsRequest,
              com.dymensionxyz.dymension.streamer.QueryProto.StreamsResponse>(
                service, METHODID_STREAMS)))
        .addMethod(
          getActiveStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsRequest,
              com.dymensionxyz.dymension.streamer.QueryProto.ActiveStreamsResponse>(
                service, METHODID_ACTIVE_STREAMS)))
        .addMethod(
          getUpcomingStreamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsRequest,
              com.dymensionxyz.dymension.streamer.QueryProto.UpcomingStreamsResponse>(
                service, METHODID_UPCOMING_STREAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dymensionxyz.dymension.streamer.QueryProto.getDescriptor();
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
              .addMethod(getStreamByIDMethod())
              .addMethod(getStreamsMethod())
              .addMethod(getActiveStreamsMethod())
              .addMethod(getUpcomingStreamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
