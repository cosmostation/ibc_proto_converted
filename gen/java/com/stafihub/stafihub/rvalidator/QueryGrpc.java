package com.stafihub.stafihub.rvalidator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: stafihub/rvalidator/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stafihub.stafihub.rvalidator.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> getRValidatorListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RValidatorList",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> getRValidatorListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> getRValidatorListMethod;
    if ((getRValidatorListMethod = QueryGrpc.getRValidatorListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRValidatorListMethod = QueryGrpc.getRValidatorListMethod) == null) {
          QueryGrpc.getRValidatorListMethod = getRValidatorListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RValidatorList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RValidatorList"))
              .build();
        }
      }
    }
    return getRValidatorListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> getCycleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CycleSeconds",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> getCycleSecondsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> getCycleSecondsMethod;
    if ((getCycleSecondsMethod = QueryGrpc.getCycleSecondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCycleSecondsMethod = QueryGrpc.getCycleSecondsMethod) == null) {
          QueryGrpc.getCycleSecondsMethod = getCycleSecondsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CycleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CycleSeconds"))
              .build();
        }
      }
    }
    return getCycleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> getShuffleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShuffleSeconds",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> getShuffleSecondsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> getShuffleSecondsMethod;
    if ((getShuffleSecondsMethod = QueryGrpc.getShuffleSecondsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShuffleSecondsMethod = QueryGrpc.getShuffleSecondsMethod) == null) {
          QueryGrpc.getShuffleSecondsMethod = getShuffleSecondsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShuffleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShuffleSeconds"))
              .build();
        }
      }
    }
    return getShuffleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestVotedCycle",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> getLatestVotedCycleMethod;
    if ((getLatestVotedCycleMethod = QueryGrpc.getLatestVotedCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLatestVotedCycleMethod = QueryGrpc.getLatestVotedCycleMethod) == null) {
          QueryGrpc.getLatestVotedCycleMethod = getLatestVotedCycleMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestVotedCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LatestVotedCycle"))
              .build();
        }
      }
    }
    return getLatestVotedCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestDealedCycle",
      requestType = com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest.class,
      responseType = com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest,
      com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> getLatestDealedCycleMethod;
    if ((getLatestDealedCycleMethod = QueryGrpc.getLatestDealedCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLatestDealedCycleMethod = QueryGrpc.getLatestDealedCycleMethod) == null) {
          QueryGrpc.getLatestDealedCycleMethod = getLatestDealedCycleMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest, com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestDealedCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LatestDealedCycle"))
              .build();
        }
      }
    }
    return getLatestDealedCycleMethod;
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
    default void params(com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    default void rValidatorList(com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRValidatorListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    default void cycleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCycleSecondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    default void shuffleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShuffleSecondsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    default void latestVotedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestVotedCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    default void latestDealedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestDealedCycleMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public void rValidatorList(com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRValidatorListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public void cycleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCycleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public void shuffleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShuffleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public void latestVotedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestVotedCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public void latestDealedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestDealedCycleMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse params(com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse rValidatorList(com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRValidatorListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse cycleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCycleSecondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse shuffleSeconds(com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShuffleSecondsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse latestVotedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestVotedCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse latestDealedCycle(com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestDealedCycleMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse> params(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RValidatorList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse> rValidatorList(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRValidatorListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of CycleSeconds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse> cycleSeconds(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCycleSecondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ShuffleSeconds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse> shuffleSeconds(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShuffleSecondsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LatestVotedCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse> latestVotedCycle(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestVotedCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of LatestDealedCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse> latestDealedCycle(
        com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestDealedCycleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_RVALIDATOR_LIST = 1;
  private static final int METHODID_CYCLE_SECONDS = 2;
  private static final int METHODID_SHUFFLE_SECONDS = 3;
  private static final int METHODID_LATEST_VOTED_CYCLE = 4;
  private static final int METHODID_LATEST_DEALED_CYCLE = 5;

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
          serviceImpl.params((com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_RVALIDATOR_LIST:
          serviceImpl.rValidatorList((com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse>) responseObserver);
          break;
        case METHODID_CYCLE_SECONDS:
          serviceImpl.cycleSeconds((com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse>) responseObserver);
          break;
        case METHODID_SHUFFLE_SECONDS:
          serviceImpl.shuffleSeconds((com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse>) responseObserver);
          break;
        case METHODID_LATEST_VOTED_CYCLE:
          serviceImpl.latestVotedCycle((com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse>) responseObserver);
          break;
        case METHODID_LATEST_DEALED_CYCLE:
          serviceImpl.latestDealedCycle((com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse>) responseObserver);
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
              com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRValidatorListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryRValidatorListResponse>(
                service, METHODID_RVALIDATOR_LIST)))
        .addMethod(
          getCycleSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryCycleSecondsResponse>(
                service, METHODID_CYCLE_SECONDS)))
        .addMethod(
          getShuffleSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryShuffleSecondsResponse>(
                service, METHODID_SHUFFLE_SECONDS)))
        .addMethod(
          getLatestVotedCycleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestVotedCycleResponse>(
                service, METHODID_LATEST_VOTED_CYCLE)))
        .addMethod(
          getLatestDealedCycleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleRequest,
              com.stafihub.stafihub.rvalidator.QueryProto.QueryLatestDealedCycleResponse>(
                service, METHODID_LATEST_DEALED_CYCLE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rvalidator.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getRValidatorListMethod())
              .addMethod(getCycleSecondsMethod())
              .addMethod(getShuffleSecondsMethod())
              .addMethod(getLatestVotedCycleMethod())
              .addMethod(getLatestDealedCycleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
