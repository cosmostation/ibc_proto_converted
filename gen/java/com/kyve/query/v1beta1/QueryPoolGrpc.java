package com.kyve.query.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryPool ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/query/v1beta1/pools.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryPoolGrpc {

  private QueryPoolGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryPool";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolsRequest,
      com.kyve.query.v1beta1.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.kyve.query.v1beta1.QueryPoolsRequest.class,
      responseType = com.kyve.query.v1beta1.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolsRequest,
      com.kyve.query.v1beta1.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolsRequest, com.kyve.query.v1beta1.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryPoolGrpc.getPoolsMethod) == null) {
      synchronized (QueryPoolGrpc.class) {
        if ((getPoolsMethod = QueryPoolGrpc.getPoolsMethod) == null) {
          QueryPoolGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryPoolsRequest, com.kyve.query.v1beta1.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryPoolMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolRequest,
      com.kyve.query.v1beta1.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.kyve.query.v1beta1.QueryPoolRequest.class,
      responseType = com.kyve.query.v1beta1.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolRequest,
      com.kyve.query.v1beta1.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryPoolRequest, com.kyve.query.v1beta1.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryPoolGrpc.getPoolMethod) == null) {
      synchronized (QueryPoolGrpc.class) {
        if ((getPoolMethod = QueryPoolGrpc.getPoolMethod) == null) {
          QueryPoolGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryPoolRequest, com.kyve.query.v1beta1.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryPoolMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryPoolStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolStub>() {
        @java.lang.Override
        public QueryPoolStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolStub(channel, callOptions);
        }
      };
    return QueryPoolStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryPoolBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolBlockingStub>() {
        @java.lang.Override
        public QueryPoolBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolBlockingStub(channel, callOptions);
        }
      };
    return QueryPoolBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryPoolFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryPoolFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryPoolFutureStub>() {
        @java.lang.Override
        public QueryPoolFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryPoolFutureStub(channel, callOptions);
        }
      };
    return QueryPoolFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    default void pools(com.kyve.query.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    default void pool(com.kyve.query.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryPool.
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static abstract class QueryPoolImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryPoolGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryPool.
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolStub
      extends io.grpc.stub.AbstractAsyncStub<QueryPoolStub> {
    private QueryPoolStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public void pools(com.kyve.query.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public void pool(com.kyve.query.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryPool.
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryPoolBlockingStub> {
    private QueryPoolBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryPoolsResponse pools(com.kyve.query.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryPoolResponse pool(com.kyve.query.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryPool.
   * <pre>
   * QueryPool ...
   * </pre>
   */
  public static final class QueryPoolFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryPoolFutureStub> {
    private QueryPoolFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryPoolFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryPoolFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Pools queries for all pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryPoolsResponse> pools(
        com.kyve.query.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pool queries a pool by its Id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryPoolResponse> pool(
        com.kyve.query.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_POOL = 1;

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
        case METHODID_POOLS:
          serviceImpl.pools((com.kyve.query.v1beta1.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL:
          serviceImpl.pool((com.kyve.query.v1beta1.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryPoolResponse>) responseObserver);
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
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryPoolsRequest,
              com.kyve.query.v1beta1.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryPoolRequest,
              com.kyve.query.v1beta1.QueryPoolResponse>(
                service, METHODID_POOL)))
        .build();
  }

  private static abstract class QueryPoolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryPoolBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.query.v1beta1.PoolsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryPool");
    }
  }

  private static final class QueryPoolFileDescriptorSupplier
      extends QueryPoolBaseDescriptorSupplier {
    QueryPoolFileDescriptorSupplier() {}
  }

  private static final class QueryPoolMethodDescriptorSupplier
      extends QueryPoolBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryPoolMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryPoolGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryPoolFileDescriptorSupplier())
              .addMethod(getPoolsMethod())
              .addMethod(getPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
