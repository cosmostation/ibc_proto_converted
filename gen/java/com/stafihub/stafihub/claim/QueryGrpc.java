package com.stafihub.stafihub.claim;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/claim/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.claim.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryParamsRequest,
      com.stafihub.stafihub.claim.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.claim.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.claim.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryParamsRequest,
      com.stafihub.stafihub.claim.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryParamsRequest, com.stafihub.stafihub.claim.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.QueryParamsRequest, com.stafihub.stafihub.claim.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryIsClaimedRequest,
      com.stafihub.stafihub.claim.QueryIsClaimedResponse> getIsClaimedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsClaimed",
      requestType = com.stafihub.stafihub.claim.QueryIsClaimedRequest.class,
      responseType = com.stafihub.stafihub.claim.QueryIsClaimedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryIsClaimedRequest,
      com.stafihub.stafihub.claim.QueryIsClaimedResponse> getIsClaimedMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryIsClaimedRequest, com.stafihub.stafihub.claim.QueryIsClaimedResponse> getIsClaimedMethod;
    if ((getIsClaimedMethod = QueryGrpc.getIsClaimedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsClaimedMethod = QueryGrpc.getIsClaimedMethod) == null) {
          QueryGrpc.getIsClaimedMethod = getIsClaimedMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.QueryIsClaimedRequest, com.stafihub.stafihub.claim.QueryIsClaimedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsClaimed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryIsClaimedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryIsClaimedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsClaimed"))
              .build();
        }
      }
    }
    return getIsClaimedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryClaimSwitchRequest,
      com.stafihub.stafihub.claim.QueryClaimSwitchResponse> getClaimSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimSwitch",
      requestType = com.stafihub.stafihub.claim.QueryClaimSwitchRequest.class,
      responseType = com.stafihub.stafihub.claim.QueryClaimSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryClaimSwitchRequest,
      com.stafihub.stafihub.claim.QueryClaimSwitchResponse> getClaimSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.QueryClaimSwitchRequest, com.stafihub.stafihub.claim.QueryClaimSwitchResponse> getClaimSwitchMethod;
    if ((getClaimSwitchMethod = QueryGrpc.getClaimSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimSwitchMethod = QueryGrpc.getClaimSwitchMethod) == null) {
          QueryGrpc.getClaimSwitchMethod = getClaimSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.QueryClaimSwitchRequest, com.stafihub.stafihub.claim.QueryClaimSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryClaimSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.QueryClaimSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimSwitch"))
              .build();
        }
      }
    }
    return getClaimSwitchMethod;
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
    default void params(com.stafihub.stafihub.claim.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    default void isClaimed(com.stafihub.stafihub.claim.QueryIsClaimedRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryIsClaimedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsClaimedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    default void claimSwitch(com.stafihub.stafihub.claim.QueryClaimSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryClaimSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimSwitchMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.claim.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public void isClaimed(com.stafihub.stafihub.claim.QueryIsClaimedRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryIsClaimedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsClaimedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public void claimSwitch(com.stafihub.stafihub.claim.QueryClaimSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryClaimSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.claim.QueryParamsResponse params(com.stafihub.stafihub.claim.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public com.stafihub.stafihub.claim.QueryIsClaimedResponse isClaimed(com.stafihub.stafihub.claim.QueryIsClaimedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsClaimedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.claim.QueryClaimSwitchResponse claimSwitch(com.stafihub.stafihub.claim.QueryClaimSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.QueryParamsResponse> params(
        com.stafihub.stafihub.claim.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of IsClaimed items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.QueryIsClaimedResponse> isClaimed(
        com.stafihub.stafihub.claim.QueryIsClaimedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsClaimedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.QueryClaimSwitchResponse> claimSwitch(
        com.stafihub.stafihub.claim.QueryClaimSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_IS_CLAIMED = 1;
  private static final int METHODID_CLAIM_SWITCH = 2;

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
          serviceImpl.params((com.stafihub.stafihub.claim.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_IS_CLAIMED:
          serviceImpl.isClaimed((com.stafihub.stafihub.claim.QueryIsClaimedRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryIsClaimedResponse>) responseObserver);
          break;
        case METHODID_CLAIM_SWITCH:
          serviceImpl.claimSwitch((com.stafihub.stafihub.claim.QueryClaimSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.QueryClaimSwitchResponse>) responseObserver);
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
              com.stafihub.stafihub.claim.QueryParamsRequest,
              com.stafihub.stafihub.claim.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getIsClaimedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.QueryIsClaimedRequest,
              com.stafihub.stafihub.claim.QueryIsClaimedResponse>(
                service, METHODID_IS_CLAIMED)))
        .addMethod(
          getClaimSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.QueryClaimSwitchRequest,
              com.stafihub.stafihub.claim.QueryClaimSwitchResponse>(
                service, METHODID_CLAIM_SWITCH)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.claim.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getIsClaimedMethod())
              .addMethod(getClaimSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
