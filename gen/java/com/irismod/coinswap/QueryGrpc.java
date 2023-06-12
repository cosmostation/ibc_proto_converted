package com.irismod.coinswap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query creates service with coinswap as rpc
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/coinswap/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.coinswap.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolRequest,
      com.irismod.coinswap.QueryLiquidityPoolResponse> getLiquidityPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityPool",
      requestType = com.irismod.coinswap.QueryLiquidityPoolRequest.class,
      responseType = com.irismod.coinswap.QueryLiquidityPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolRequest,
      com.irismod.coinswap.QueryLiquidityPoolResponse> getLiquidityPoolMethod() {
    io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolRequest, com.irismod.coinswap.QueryLiquidityPoolResponse> getLiquidityPoolMethod;
    if ((getLiquidityPoolMethod = QueryGrpc.getLiquidityPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityPoolMethod = QueryGrpc.getLiquidityPoolMethod) == null) {
          QueryGrpc.getLiquidityPoolMethod = getLiquidityPoolMethod =
              io.grpc.MethodDescriptor.<com.irismod.coinswap.QueryLiquidityPoolRequest, com.irismod.coinswap.QueryLiquidityPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.QueryLiquidityPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.QueryLiquidityPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityPool"))
              .build();
        }
      }
    }
    return getLiquidityPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolsRequest,
      com.irismod.coinswap.QueryLiquidityPoolsResponse> getLiquidityPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityPools",
      requestType = com.irismod.coinswap.QueryLiquidityPoolsRequest.class,
      responseType = com.irismod.coinswap.QueryLiquidityPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolsRequest,
      com.irismod.coinswap.QueryLiquidityPoolsResponse> getLiquidityPoolsMethod() {
    io.grpc.MethodDescriptor<com.irismod.coinswap.QueryLiquidityPoolsRequest, com.irismod.coinswap.QueryLiquidityPoolsResponse> getLiquidityPoolsMethod;
    if ((getLiquidityPoolsMethod = QueryGrpc.getLiquidityPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityPoolsMethod = QueryGrpc.getLiquidityPoolsMethod) == null) {
          QueryGrpc.getLiquidityPoolsMethod = getLiquidityPoolsMethod =
              io.grpc.MethodDescriptor.<com.irismod.coinswap.QueryLiquidityPoolsRequest, com.irismod.coinswap.QueryLiquidityPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.QueryLiquidityPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.coinswap.QueryLiquidityPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityPools"))
              .build();
        }
      }
    }
    return getLiquidityPoolsMethod;
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
   * Query creates service with coinswap as rpc
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * LiquidityPool returns the liquidity pool for the provided
     * lpt_denom
     * </pre>
     */
    default void liquidityPool(com.irismod.coinswap.QueryLiquidityPoolRequest request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidityPools returns all the liquidity pools available
     * </pre>
     */
    default void liquidityPools(com.irismod.coinswap.QueryLiquidityPoolsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityPoolsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query creates service with coinswap as rpc
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
   * Query creates service with coinswap as rpc
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
     * LiquidityPool returns the liquidity pool for the provided
     * lpt_denom
     * </pre>
     */
    public void liquidityPool(com.irismod.coinswap.QueryLiquidityPoolRequest request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidityPools returns all the liquidity pools available
     * </pre>
     */
    public void liquidityPools(com.irismod.coinswap.QueryLiquidityPoolsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityPoolsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query creates service with coinswap as rpc
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
     * LiquidityPool returns the liquidity pool for the provided
     * lpt_denom
     * </pre>
     */
    public com.irismod.coinswap.QueryLiquidityPoolResponse liquidityPool(com.irismod.coinswap.QueryLiquidityPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidityPools returns all the liquidity pools available
     * </pre>
     */
    public com.irismod.coinswap.QueryLiquidityPoolsResponse liquidityPools(com.irismod.coinswap.QueryLiquidityPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityPoolsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query creates service with coinswap as rpc
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
     * LiquidityPool returns the liquidity pool for the provided
     * lpt_denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.coinswap.QueryLiquidityPoolResponse> liquidityPool(
        com.irismod.coinswap.QueryLiquidityPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidityPools returns all the liquidity pools available
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.coinswap.QueryLiquidityPoolsResponse> liquidityPools(
        com.irismod.coinswap.QueryLiquidityPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityPoolsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUIDITY_POOL = 0;
  private static final int METHODID_LIQUIDITY_POOLS = 1;

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
        case METHODID_LIQUIDITY_POOL:
          serviceImpl.liquidityPool((com.irismod.coinswap.QueryLiquidityPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_POOLS:
          serviceImpl.liquidityPools((com.irismod.coinswap.QueryLiquidityPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.coinswap.QueryLiquidityPoolsResponse>) responseObserver);
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
          getLiquidityPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.coinswap.QueryLiquidityPoolRequest,
              com.irismod.coinswap.QueryLiquidityPoolResponse>(
                service, METHODID_LIQUIDITY_POOL)))
        .addMethod(
          getLiquidityPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.coinswap.QueryLiquidityPoolsRequest,
              com.irismod.coinswap.QueryLiquidityPoolsResponse>(
                service, METHODID_LIQUIDITY_POOLS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.coinswap.QueryProto.getDescriptor();
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
              .addMethod(getLiquidityPoolMethod())
              .addMethod(getLiquidityPoolsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
