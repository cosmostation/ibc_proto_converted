package com.evmos.erc20.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: evmos/erc20/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "evmos.erc20.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest,
      com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> getTokenPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenPairs",
      requestType = com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest.class,
      responseType = com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest,
      com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> getTokenPairsMethod() {
    io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest, com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> getTokenPairsMethod;
    if ((getTokenPairsMethod = QueryGrpc.getTokenPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenPairsMethod = QueryGrpc.getTokenPairsMethod) == null) {
          QueryGrpc.getTokenPairsMethod = getTokenPairsMethod =
              io.grpc.MethodDescriptor.<com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest, com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenPairs"))
              .build();
        }
      }
    }
    return getTokenPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest,
      com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> getTokenPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenPair",
      requestType = com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest.class,
      responseType = com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest,
      com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> getTokenPairMethod() {
    io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest, com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> getTokenPairMethod;
    if ((getTokenPairMethod = QueryGrpc.getTokenPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenPairMethod = QueryGrpc.getTokenPairMethod) == null) {
          QueryGrpc.getTokenPairMethod = getTokenPairMethod =
              io.grpc.MethodDescriptor.<com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest, com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenPair"))
              .build();
        }
      }
    }
    return getTokenPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryParamsRequest,
      com.evmos.erc20.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.evmos.erc20.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.evmos.erc20.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryParamsRequest,
      com.evmos.erc20.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.evmos.erc20.v1.QueryProto.QueryParamsRequest, com.evmos.erc20.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.evmos.erc20.v1.QueryProto.QueryParamsRequest, com.evmos.erc20.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.erc20.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
     * TokenPairs retrieves registered token pairs
     * </pre>
     */
    default void tokenPairs(com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenPairsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TokenPair retrieves a registered token pair
     * </pre>
     */
    default void tokenPair(com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenPairMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the erc20 module params
     * </pre>
     */
    default void params(com.evmos.erc20.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
     * TokenPairs retrieves registered token pairs
     * </pre>
     */
    public void tokenPairs(com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TokenPair retrieves a registered token pair
     * </pre>
     */
    public void tokenPair(com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the erc20 module params
     * </pre>
     */
    public void params(com.evmos.erc20.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
     * TokenPairs retrieves registered token pairs
     * </pre>
     */
    public com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse tokenPairs(com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenPairsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TokenPair retrieves a registered token pair
     * </pre>
     */
    public com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse tokenPair(com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the erc20 module params
     * </pre>
     */
    public com.evmos.erc20.v1.QueryProto.QueryParamsResponse params(com.evmos.erc20.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
     * TokenPairs retrieves registered token pairs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse> tokenPairs(
        com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenPairsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TokenPair retrieves a registered token pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse> tokenPair(
        com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the erc20 module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.erc20.v1.QueryProto.QueryParamsResponse> params(
        com.evmos.erc20.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKEN_PAIRS = 0;
  private static final int METHODID_TOKEN_PAIR = 1;
  private static final int METHODID_PARAMS = 2;

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
        case METHODID_TOKEN_PAIRS:
          serviceImpl.tokenPairs((com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse>) responseObserver);
          break;
        case METHODID_TOKEN_PAIR:
          serviceImpl.tokenPair((com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.evmos.erc20.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.erc20.v1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getTokenPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.erc20.v1.QueryProto.QueryTokenPairsRequest,
              com.evmos.erc20.v1.QueryProto.QueryTokenPairsResponse>(
                service, METHODID_TOKEN_PAIRS)))
        .addMethod(
          getTokenPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.erc20.v1.QueryProto.QueryTokenPairRequest,
              com.evmos.erc20.v1.QueryProto.QueryTokenPairResponse>(
                service, METHODID_TOKEN_PAIR)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.erc20.v1.QueryProto.QueryParamsRequest,
              com.evmos.erc20.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evmos.erc20.v1.QueryProto.getDescriptor();
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
              .addMethod(getTokenPairsMethod())
              .addMethod(getTokenPairMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
