package com.kyve.query.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryDelegation contains all rpc requests related to direct delegation data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: kyve/query/v1beta1/delegation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryDelegationGrpc {

  private QueryDelegationGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kyve.query.v1beta1.QueryDelegation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> getDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegator",
      requestType = com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest.class,
      responseType = com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> getDelegatorMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest, com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> getDelegatorMethod;
    if ((getDelegatorMethod = QueryDelegationGrpc.getDelegatorMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getDelegatorMethod = QueryDelegationGrpc.getDelegatorMethod) == null) {
          QueryDelegationGrpc.getDelegatorMethod = getDelegatorMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest, com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("Delegator"))
              .build();
        }
      }
    }
    return getDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorsByStaker",
      requestType = com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest.class,
      responseType = com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest, com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> getDelegatorsByStakerMethod;
    if ((getDelegatorsByStakerMethod = QueryDelegationGrpc.getDelegatorsByStakerMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getDelegatorsByStakerMethod = QueryDelegationGrpc.getDelegatorsByStakerMethod) == null) {
          QueryDelegationGrpc.getDelegatorsByStakerMethod = getDelegatorsByStakerMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest, com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorsByStaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("DelegatorsByStaker"))
              .build();
        }
      }
    }
    return getDelegatorsByStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StakersByDelegator",
      requestType = com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest.class,
      responseType = com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest,
      com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest, com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> getStakersByDelegatorMethod;
    if ((getStakersByDelegatorMethod = QueryDelegationGrpc.getStakersByDelegatorMethod) == null) {
      synchronized (QueryDelegationGrpc.class) {
        if ((getStakersByDelegatorMethod = QueryDelegationGrpc.getStakersByDelegatorMethod) == null) {
          QueryDelegationGrpc.getStakersByDelegatorMethod = getStakersByDelegatorMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest, com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StakersByDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryDelegationMethodDescriptorSupplier("StakersByDelegator"))
              .build();
        }
      }
    }
    return getStakersByDelegatorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryDelegationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationStub>() {
        @java.lang.Override
        public QueryDelegationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationStub(channel, callOptions);
        }
      };
    return QueryDelegationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryDelegationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationBlockingStub>() {
        @java.lang.Override
        public QueryDelegationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationBlockingStub(channel, callOptions);
        }
      };
    return QueryDelegationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryDelegationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryDelegationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryDelegationFutureStub>() {
        @java.lang.Override
        public QueryDelegationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryDelegationFutureStub(channel, callOptions);
        }
      };
    return QueryDelegationFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    default void delegator(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    default void delegatorsByStaker(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorsByStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    default void stakersByDelegator(com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakersByDelegatorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryDelegation.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryDelegationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryDelegationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryDelegation.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationStub
      extends io.grpc.stub.AbstractAsyncStub<QueryDelegationStub> {
    private QueryDelegationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public void delegator(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public void delegatorsByStaker(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorsByStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public void stakersByDelegator(com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakersByDelegatorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryDelegation.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryDelegationBlockingStub> {
    private QueryDelegationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse delegator(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse delegatorsByStaker(com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorsByStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse stakersByDelegator(com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakersByDelegatorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryDelegation.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryDelegationFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryDelegationFutureStub> {
    private QueryDelegationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryDelegationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryDelegationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Delegator returns delegation information for a specific delegator of a specific staker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse> delegator(
        com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorsByStaker returns all delegators that have delegated to the given staker
     * This query is paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse> delegatorsByStaker(
        com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorsByStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
     * This query is paginated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse> stakersByDelegator(
        com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakersByDelegatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELEGATOR = 0;
  private static final int METHODID_DELEGATORS_BY_STAKER = 1;
  private static final int METHODID_STAKERS_BY_DELEGATOR = 2;

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
        case METHODID_DELEGATOR:
          serviceImpl.delegator((com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse>) responseObserver);
          break;
        case METHODID_DELEGATORS_BY_STAKER:
          serviceImpl.delegatorsByStaker((com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse>) responseObserver);
          break;
        case METHODID_STAKERS_BY_DELEGATOR:
          serviceImpl.stakersByDelegator((com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse>) responseObserver);
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
          getDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.DelegationProto.QueryDelegatorRequest,
              com.kyve.query.v1beta1.DelegationProto.QueryDelegatorResponse>(
                service, METHODID_DELEGATOR)))
        .addMethod(
          getDelegatorsByStakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerRequest,
              com.kyve.query.v1beta1.DelegationProto.QueryDelegatorsByStakerResponse>(
                service, METHODID_DELEGATORS_BY_STAKER)))
        .addMethod(
          getStakersByDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorRequest,
              com.kyve.query.v1beta1.DelegationProto.QueryStakersByDelegatorResponse>(
                service, METHODID_STAKERS_BY_DELEGATOR)))
        .build();
  }

  private static abstract class QueryDelegationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryDelegationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.query.v1beta1.DelegationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryDelegation");
    }
  }

  private static final class QueryDelegationFileDescriptorSupplier
      extends QueryDelegationBaseDescriptorSupplier {
    QueryDelegationFileDescriptorSupplier() {}
  }

  private static final class QueryDelegationMethodDescriptorSupplier
      extends QueryDelegationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryDelegationMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryDelegationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryDelegationFileDescriptorSupplier())
              .addMethod(getDelegatorMethod())
              .addMethod(getDelegatorsByStakerMethod())
              .addMethod(getStakersByDelegatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
