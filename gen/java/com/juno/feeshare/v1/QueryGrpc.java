package com.juno.feeshare.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: juno/feeshare/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "juno.feeshare.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> getFeeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeShares",
      requestType = com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest.class,
      responseType = com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> getFeeSharesMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> getFeeSharesMethod;
    if ((getFeeSharesMethod = QueryGrpc.getFeeSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeSharesMethod = QueryGrpc.getFeeSharesMethod) == null) {
          QueryGrpc.getFeeSharesMethod = getFeeSharesMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeShares"))
              .build();
        }
      }
    }
    return getFeeSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest,
      com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> getFeeShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeShare",
      requestType = com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest.class,
      responseType = com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest,
      com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> getFeeShareMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest, com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> getFeeShareMethod;
    if ((getFeeShareMethod = QueryGrpc.getFeeShareMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeShareMethod = QueryGrpc.getFeeShareMethod) == null) {
          QueryGrpc.getFeeShareMethod = getFeeShareMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest, com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeShare"))
              .build();
        }
      }
    }
    return getFeeShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryParamsRequest,
      com.juno.feeshare.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.juno.feeshare.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.juno.feeshare.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryParamsRequest,
      com.juno.feeshare.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryParamsRequest, com.juno.feeshare.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.QueryProto.QueryParamsRequest, com.juno.feeshare.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> getDeployerFeeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployerFeeShares",
      requestType = com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest.class,
      responseType = com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> getDeployerFeeSharesMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> getDeployerFeeSharesMethod;
    if ((getDeployerFeeSharesMethod = QueryGrpc.getDeployerFeeSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeployerFeeSharesMethod = QueryGrpc.getDeployerFeeSharesMethod) == null) {
          QueryGrpc.getDeployerFeeSharesMethod = getDeployerFeeSharesMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployerFeeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DeployerFeeShares"))
              .build();
        }
      }
    }
    return getDeployerFeeSharesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> getWithdrawerFeeSharesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawerFeeShares",
      requestType = com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest.class,
      responseType = com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest,
      com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> getWithdrawerFeeSharesMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> getWithdrawerFeeSharesMethod;
    if ((getWithdrawerFeeSharesMethod = QueryGrpc.getWithdrawerFeeSharesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawerFeeSharesMethod = QueryGrpc.getWithdrawerFeeSharesMethod) == null) {
          QueryGrpc.getWithdrawerFeeSharesMethod = getWithdrawerFeeSharesMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest, com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawerFeeShares"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawerFeeShares"))
              .build();
        }
      }
    }
    return getWithdrawerFeeSharesMethod;
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
     * FeeShares retrieves all registered FeeShares
     * </pre>
     */
    default void feeShares(com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeeShare retrieves a registered FeeShare for a given contract address
     * </pre>
     */
    default void feeShare(com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the FeeShare module params
     * </pre>
     */
    default void params(com.juno.feeshare.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeployerFeeShares retrieves all FeeShares that a given deployer has
     * registered
     * </pre>
     */
    default void deployerFeeShares(com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployerFeeSharesMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawerFeeShares retrieves all FeeShares with a given withdrawer
     * address
     * </pre>
     */
    default void withdrawerFeeShares(com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawerFeeSharesMethod(), responseObserver);
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
     * FeeShares retrieves all registered FeeShares
     * </pre>
     */
    public void feeShares(com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeeShare retrieves a registered FeeShare for a given contract address
     * </pre>
     */
    public void feeShare(com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the FeeShare module params
     * </pre>
     */
    public void params(com.juno.feeshare.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeployerFeeShares retrieves all FeeShares that a given deployer has
     * registered
     * </pre>
     */
    public void deployerFeeShares(com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployerFeeSharesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawerFeeShares retrieves all FeeShares with a given withdrawer
     * address
     * </pre>
     */
    public void withdrawerFeeShares(com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawerFeeSharesMethod(), getCallOptions()), request, responseObserver);
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
     * FeeShares retrieves all registered FeeShares
     * </pre>
     */
    public com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse feeShares(com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeeShare retrieves a registered FeeShare for a given contract address
     * </pre>
     */
    public com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse feeShare(com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the FeeShare module params
     * </pre>
     */
    public com.juno.feeshare.v1.QueryProto.QueryParamsResponse params(com.juno.feeshare.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeployerFeeShares retrieves all FeeShares that a given deployer has
     * registered
     * </pre>
     */
    public com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse deployerFeeShares(com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployerFeeSharesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawerFeeShares retrieves all FeeShares with a given withdrawer
     * address
     * </pre>
     */
    public com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse withdrawerFeeShares(com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawerFeeSharesMethod(), getCallOptions(), request);
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
     * FeeShares retrieves all registered FeeShares
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse> feeShares(
        com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeeShare retrieves a registered FeeShare for a given contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse> feeShare(
        com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the FeeShare module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.QueryProto.QueryParamsResponse> params(
        com.juno.feeshare.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeployerFeeShares retrieves all FeeShares that a given deployer has
     * registered
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse> deployerFeeShares(
        com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployerFeeSharesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawerFeeShares retrieves all FeeShares with a given withdrawer
     * address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse> withdrawerFeeShares(
        com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawerFeeSharesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEE_SHARES = 0;
  private static final int METHODID_FEE_SHARE = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_DEPLOYER_FEE_SHARES = 3;
  private static final int METHODID_WITHDRAWER_FEE_SHARES = 4;

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
        case METHODID_FEE_SHARES:
          serviceImpl.feeShares((com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse>) responseObserver);
          break;
        case METHODID_FEE_SHARE:
          serviceImpl.feeShare((com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.juno.feeshare.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPLOYER_FEE_SHARES:
          serviceImpl.deployerFeeShares((com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWER_FEE_SHARES:
          serviceImpl.withdrawerFeeShares((com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse>) responseObserver);
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
          getFeeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.QueryProto.QueryFeeSharesRequest,
              com.juno.feeshare.v1.QueryProto.QueryFeeSharesResponse>(
                service, METHODID_FEE_SHARES)))
        .addMethod(
          getFeeShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.QueryProto.QueryFeeShareRequest,
              com.juno.feeshare.v1.QueryProto.QueryFeeShareResponse>(
                service, METHODID_FEE_SHARE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.QueryProto.QueryParamsRequest,
              com.juno.feeshare.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDeployerFeeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesRequest,
              com.juno.feeshare.v1.QueryProto.QueryDeployerFeeSharesResponse>(
                service, METHODID_DEPLOYER_FEE_SHARES)))
        .addMethod(
          getWithdrawerFeeSharesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesRequest,
              com.juno.feeshare.v1.QueryProto.QueryWithdrawerFeeSharesResponse>(
                service, METHODID_WITHDRAWER_FEE_SHARES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.juno.feeshare.v1.QueryProto.getDescriptor();
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
              .addMethod(getFeeSharesMethod())
              .addMethod(getFeeShareMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDeployerFeeSharesMethod())
              .addMethod(getWithdrawerFeeSharesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
