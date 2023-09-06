package com.kyve.query.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryStakers ...
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: kyve/query/v1beta1/stakers.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryStakersGrpc {

  private QueryStakersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kyve.query.v1beta1.QueryStakers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> getStakersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stakers",
      requestType = com.kyve.query.v1beta1.StakersProto.QueryStakersRequest.class,
      responseType = com.kyve.query.v1beta1.StakersProto.QueryStakersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> getStakersMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> getStakersMethod;
    if ((getStakersMethod = QueryStakersGrpc.getStakersMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersMethod = QueryStakersGrpc.getStakersMethod) == null) {
          QueryStakersGrpc.getStakersMethod = getStakersMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.StakersProto.QueryStakersRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stakers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("Stakers"))
              .build();
        }
      }
    }
    return getStakersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakerRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> getStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Staker",
      requestType = com.kyve.query.v1beta1.StakersProto.QueryStakerRequest.class,
      responseType = com.kyve.query.v1beta1.StakersProto.QueryStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakerRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> getStakerMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakerRequest, com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> getStakerMethod;
    if ((getStakerMethod = QueryStakersGrpc.getStakerMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakerMethod = QueryStakersGrpc.getStakerMethod) == null) {
          QueryStakersGrpc.getStakerMethod = getStakerMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.StakersProto.QueryStakerRequest, com.kyve.query.v1beta1.StakersProto.QueryStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Staker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("Staker"))
              .build();
        }
      }
    }
    return getStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> getStakersByPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByPool",
      requestType = com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest.class,
      responseType = com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> getStakersByPoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> getStakersByPoolMethod;
    if ((getStakersByPoolMethod = QueryStakersGrpc.getStakersByPoolMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersByPoolMethod = QueryStakersGrpc.getStakersByPoolMethod) == null) {
          QueryStakersGrpc.getStakersByPoolMethod = getStakersByPoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("StakersByPool"))
              .build();
        }
      }
    }
    return getStakersByPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByPoolCount",
      requestType = com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest.class,
      responseType = com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest,
      com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> getStakersByPoolCountMethod;
    if ((getStakersByPoolCountMethod = QueryStakersGrpc.getStakersByPoolCountMethod) == null) {
      synchronized (QueryStakersGrpc.class) {
        if ((getStakersByPoolCountMethod = QueryStakersGrpc.getStakersByPoolCountMethod) == null) {
          QueryStakersGrpc.getStakersByPoolCountMethod = getStakersByPoolCountMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest, com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByPoolCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryStakersMethodDescriptorSupplier("StakersByPoolCount"))
              .build();
        }
      }
    }
    return getStakersByPoolCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStakersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersStub>() {
        @java.lang.Override
        public QueryStakersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersStub(channel, callOptions);
        }
      };
    return QueryStakersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryStakersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersBlockingStub>() {
        @java.lang.Override
        public QueryStakersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersBlockingStub(channel, callOptions);
        }
      };
    return QueryStakersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryStakersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStakersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStakersFutureStub>() {
        @java.lang.Override
        public QueryStakersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStakersFutureStub(channel, callOptions);
        }
      };
    return QueryStakersFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    default void stakers(com.kyve.query.v1beta1.StakersProto.QueryStakersRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    default void staker(com.kyve.query.v1beta1.StakersProto.QueryStakerRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    default void stakersByPool(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakersByPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    default void stakersByPoolCount(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakersByPoolCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryStakers.
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static abstract class QueryStakersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryStakersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryStakers.
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStakersStub> {
    private QueryStakersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public void stakers(com.kyve.query.v1beta1.StakersProto.QueryStakersRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public void staker(com.kyve.query.v1beta1.StakersProto.QueryStakerRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public void stakersByPool(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakersByPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public void stakersByPoolCount(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakersByPoolCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryStakers.
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryStakersBlockingStub> {
    private QueryStakersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public com.kyve.query.v1beta1.StakersProto.QueryStakersResponse stakers(com.kyve.query.v1beta1.StakersProto.QueryStakersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public com.kyve.query.v1beta1.StakersProto.QueryStakerResponse staker(com.kyve.query.v1beta1.StakersProto.QueryStakerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse stakersByPool(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakersByPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse stakersByPoolCount(com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakersByPoolCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryStakers.
   * <pre>
   * QueryStakers ...
   * </pre>
   */
  public static final class QueryStakersFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryStakersFutureStub> {
    private QueryStakersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStakersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStakersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Stakers queries for all stakers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.StakersProto.QueryStakersResponse> stakers(
        com.kyve.query.v1beta1.StakersProto.QueryStakersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Staker queries for all stakers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.StakersProto.QueryStakerResponse> staker(
        com.kyve.query.v1beta1.StakersProto.QueryStakerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers that are currently participating in the given pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse> stakersByPool(
        com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakersByPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPool queries for all stakers and sorted them first by number of pools participating and
     * then by delegation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse> stakersByPoolCount(
        com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakersByPoolCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STAKERS = 0;
  private static final int METHODID_STAKER = 1;
  private static final int METHODID_STAKERS_BY_POOL = 2;
  private static final int METHODID_STAKERS_BY_POOL_COUNT = 3;

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
        case METHODID_STAKERS:
          serviceImpl.stakers((com.kyve.query.v1beta1.StakersProto.QueryStakersRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersResponse>) responseObserver);
          break;
        case METHODID_STAKER:
          serviceImpl.staker((com.kyve.query.v1beta1.StakersProto.QueryStakerRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakerResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_POOL:
          serviceImpl.stakersByPool((com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_POOL_COUNT:
          serviceImpl.stakersByPoolCount((com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse>) responseObserver);
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
          getStakersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.StakersProto.QueryStakersRequest,
              com.kyve.query.v1beta1.StakersProto.QueryStakersResponse>(
                service, METHODID_STAKERS)))
        .addMethod(
          getStakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.StakersProto.QueryStakerRequest,
              com.kyve.query.v1beta1.StakersProto.QueryStakerResponse>(
                service, METHODID_STAKER)))
        .addMethod(
          getStakersByPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolRequest,
              com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolResponse>(
                service, METHODID_STAKERS_BY_POOL)))
        .addMethod(
          getStakersByPoolCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountRequest,
              com.kyve.query.v1beta1.StakersProto.QueryStakersByPoolCountResponse>(
                service, METHODID_STAKERS_BY_POOL_COUNT)))
        .build();
  }

  private static abstract class QueryStakersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryStakersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.query.v1beta1.StakersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryStakers");
    }
  }

  private static final class QueryStakersFileDescriptorSupplier
      extends QueryStakersBaseDescriptorSupplier {
    QueryStakersFileDescriptorSupplier() {}
  }

  private static final class QueryStakersMethodDescriptorSupplier
      extends QueryStakersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryStakersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryStakersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryStakersFileDescriptorSupplier())
              .addMethod(getStakersMethod())
              .addMethod(getStakerMethod())
              .addMethod(getStakersByPoolMethod())
              .addMethod(getStakersByPoolCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
