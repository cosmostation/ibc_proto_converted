package com.irismod.token;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query creates service with token as RPC
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/token/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.token.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokenRequest,
      com.irismod.token.QueryProto.QueryTokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = com.irismod.token.QueryProto.QueryTokenRequest.class,
      responseType = com.irismod.token.QueryProto.QueryTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokenRequest,
      com.irismod.token.QueryProto.QueryTokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokenRequest, com.irismod.token.QueryProto.QueryTokenResponse> getTokenMethod;
    if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
          QueryGrpc.getTokenMethod = getTokenMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.QueryProto.QueryTokenRequest, com.irismod.token.QueryProto.QueryTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Token"))
              .build();
        }
      }
    }
    return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokensRequest,
      com.irismod.token.QueryProto.QueryTokensResponse> getTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tokens",
      requestType = com.irismod.token.QueryProto.QueryTokensRequest.class,
      responseType = com.irismod.token.QueryProto.QueryTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokensRequest,
      com.irismod.token.QueryProto.QueryTokensResponse> getTokensMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTokensRequest, com.irismod.token.QueryProto.QueryTokensResponse> getTokensMethod;
    if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
          QueryGrpc.getTokensMethod = getTokensMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.QueryProto.QueryTokensRequest, com.irismod.token.QueryProto.QueryTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Tokens"))
              .build();
        }
      }
    }
    return getTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryFeesRequest,
      com.irismod.token.QueryProto.QueryFeesResponse> getFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fees",
      requestType = com.irismod.token.QueryProto.QueryFeesRequest.class,
      responseType = com.irismod.token.QueryProto.QueryFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryFeesRequest,
      com.irismod.token.QueryProto.QueryFeesResponse> getFeesMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryFeesRequest, com.irismod.token.QueryProto.QueryFeesResponse> getFeesMethod;
    if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
          QueryGrpc.getFeesMethod = getFeesMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.QueryProto.QueryFeesRequest, com.irismod.token.QueryProto.QueryFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fees"))
              .build();
        }
      }
    }
    return getFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryParamsRequest,
      com.irismod.token.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.irismod.token.QueryProto.QueryParamsRequest.class,
      responseType = com.irismod.token.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryParamsRequest,
      com.irismod.token.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryParamsRequest, com.irismod.token.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.QueryProto.QueryParamsRequest, com.irismod.token.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTotalBurnRequest,
      com.irismod.token.QueryProto.QueryTotalBurnResponse> getTotalBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalBurn",
      requestType = com.irismod.token.QueryProto.QueryTotalBurnRequest.class,
      responseType = com.irismod.token.QueryProto.QueryTotalBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTotalBurnRequest,
      com.irismod.token.QueryProto.QueryTotalBurnResponse> getTotalBurnMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.QueryProto.QueryTotalBurnRequest, com.irismod.token.QueryProto.QueryTotalBurnResponse> getTotalBurnMethod;
    if ((getTotalBurnMethod = QueryGrpc.getTotalBurnMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalBurnMethod = QueryGrpc.getTotalBurnMethod) == null) {
          QueryGrpc.getTotalBurnMethod = getTotalBurnMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.QueryProto.QueryTotalBurnRequest, com.irismod.token.QueryProto.QueryTotalBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalBurn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTotalBurnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.QueryProto.QueryTotalBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalBurn"))
              .build();
        }
      }
    }
    return getTotalBurnMethod;
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
   * Query creates service with token as RPC
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Token returns token with token name
     * </pre>
     */
    default void token(com.irismod.token.QueryProto.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tokens returns the token list
     * </pre>
     */
    default void tokens(com.irismod.token.QueryProto.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fees returns the fees to issue or mint a token
     * </pre>
     */
    default void fees(com.irismod.token.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the token parameters
     * </pre>
     */
    default void params(com.irismod.token.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalBurn queries all the burnt coins
     * </pre>
     */
    default void totalBurn(com.irismod.token.QueryProto.QueryTotalBurnRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTotalBurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalBurnMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query creates service with token as RPC
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
   * Query creates service with token as RPC
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
     * Token returns token with token name
     * </pre>
     */
    public void token(com.irismod.token.QueryProto.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tokens returns the token list
     * </pre>
     */
    public void tokens(com.irismod.token.QueryProto.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fees returns the fees to issue or mint a token
     * </pre>
     */
    public void fees(com.irismod.token.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the token parameters
     * </pre>
     */
    public void params(com.irismod.token.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalBurn queries all the burnt coins
     * </pre>
     */
    public void totalBurn(com.irismod.token.QueryProto.QueryTotalBurnRequest request,
        io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTotalBurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalBurnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query creates service with token as RPC
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
     * Token returns token with token name
     * </pre>
     */
    public com.irismod.token.QueryProto.QueryTokenResponse token(com.irismod.token.QueryProto.QueryTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tokens returns the token list
     * </pre>
     */
    public com.irismod.token.QueryProto.QueryTokensResponse tokens(com.irismod.token.QueryProto.QueryTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fees returns the fees to issue or mint a token
     * </pre>
     */
    public com.irismod.token.QueryProto.QueryFeesResponse fees(com.irismod.token.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the token parameters
     * </pre>
     */
    public com.irismod.token.QueryProto.QueryParamsResponse params(com.irismod.token.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalBurn queries all the burnt coins
     * </pre>
     */
    public com.irismod.token.QueryProto.QueryTotalBurnResponse totalBurn(com.irismod.token.QueryProto.QueryTotalBurnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalBurnMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query creates service with token as RPC
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
     * Token returns token with token name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.QueryProto.QueryTokenResponse> token(
        com.irismod.token.QueryProto.QueryTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tokens returns the token list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.QueryProto.QueryTokensResponse> tokens(
        com.irismod.token.QueryProto.QueryTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fees returns the fees to issue or mint a token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.QueryProto.QueryFeesResponse> fees(
        com.irismod.token.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the token parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.QueryProto.QueryParamsResponse> params(
        com.irismod.token.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalBurn queries all the burnt coins
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.QueryProto.QueryTotalBurnResponse> totalBurn(
        com.irismod.token.QueryProto.QueryTotalBurnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalBurnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOKEN = 0;
  private static final int METHODID_TOKENS = 1;
  private static final int METHODID_FEES = 2;
  private static final int METHODID_PARAMS = 3;
  private static final int METHODID_TOTAL_BURN = 4;

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
        case METHODID_TOKEN:
          serviceImpl.token((com.irismod.token.QueryProto.QueryTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokenResponse>) responseObserver);
          break;
        case METHODID_TOKENS:
          serviceImpl.tokens((com.irismod.token.QueryProto.QueryTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTokensResponse>) responseObserver);
          break;
        case METHODID_FEES:
          serviceImpl.fees((com.irismod.token.QueryProto.QueryFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryFeesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.irismod.token.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_BURN:
          serviceImpl.totalBurn((com.irismod.token.QueryProto.QueryTotalBurnRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.QueryProto.QueryTotalBurnResponse>) responseObserver);
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
          getTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.QueryProto.QueryTokenRequest,
              com.irismod.token.QueryProto.QueryTokenResponse>(
                service, METHODID_TOKEN)))
        .addMethod(
          getTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.QueryProto.QueryTokensRequest,
              com.irismod.token.QueryProto.QueryTokensResponse>(
                service, METHODID_TOKENS)))
        .addMethod(
          getFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.QueryProto.QueryFeesRequest,
              com.irismod.token.QueryProto.QueryFeesResponse>(
                service, METHODID_FEES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.QueryProto.QueryParamsRequest,
              com.irismod.token.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTotalBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.QueryProto.QueryTotalBurnRequest,
              com.irismod.token.QueryProto.QueryTotalBurnResponse>(
                service, METHODID_TOTAL_BURN)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.token.QueryProto.getDescriptor();
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
              .addMethod(getTokenMethod())
              .addMethod(getTokensMethod())
              .addMethod(getFeesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getTotalBurnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
