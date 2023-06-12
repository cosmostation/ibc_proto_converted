package com.lum.network.airdrop;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: lum-network/airdrop/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "lum.network.airdrop.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryModuleAccountBalanceRequest,
      com.lum.network.airdrop.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleAccountBalance",
      requestType = com.lum.network.airdrop.QueryModuleAccountBalanceRequest.class,
      responseType = com.lum.network.airdrop.QueryModuleAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryModuleAccountBalanceRequest,
      com.lum.network.airdrop.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod() {
    io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryModuleAccountBalanceRequest, com.lum.network.airdrop.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod;
    if ((getModuleAccountBalanceMethod = QueryGrpc.getModuleAccountBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleAccountBalanceMethod = QueryGrpc.getModuleAccountBalanceMethod) == null) {
          QueryGrpc.getModuleAccountBalanceMethod = getModuleAccountBalanceMethod =
              io.grpc.MethodDescriptor.<com.lum.network.airdrop.QueryModuleAccountBalanceRequest, com.lum.network.airdrop.QueryModuleAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryModuleAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryModuleAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleAccountBalance"))
              .build();
        }
      }
    }
    return getModuleAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryParamsRequest,
      com.lum.network.airdrop.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.lum.network.airdrop.QueryParamsRequest.class,
      responseType = com.lum.network.airdrop.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryParamsRequest,
      com.lum.network.airdrop.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryParamsRequest, com.lum.network.airdrop.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.airdrop.QueryParamsRequest, com.lum.network.airdrop.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimRecordRequest,
      com.lum.network.airdrop.QueryClaimRecordResponse> getClaimRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecord",
      requestType = com.lum.network.airdrop.QueryClaimRecordRequest.class,
      responseType = com.lum.network.airdrop.QueryClaimRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimRecordRequest,
      com.lum.network.airdrop.QueryClaimRecordResponse> getClaimRecordMethod() {
    io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimRecordRequest, com.lum.network.airdrop.QueryClaimRecordResponse> getClaimRecordMethod;
    if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
          QueryGrpc.getClaimRecordMethod = getClaimRecordMethod =
              io.grpc.MethodDescriptor.<com.lum.network.airdrop.QueryClaimRecordRequest, com.lum.network.airdrop.QueryClaimRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryClaimRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryClaimRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecord"))
              .build();
        }
      }
    }
    return getClaimRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimableForActionRequest,
      com.lum.network.airdrop.QueryClaimableForActionResponse> getClaimableForActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimableForAction",
      requestType = com.lum.network.airdrop.QueryClaimableForActionRequest.class,
      responseType = com.lum.network.airdrop.QueryClaimableForActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimableForActionRequest,
      com.lum.network.airdrop.QueryClaimableForActionResponse> getClaimableForActionMethod() {
    io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryClaimableForActionRequest, com.lum.network.airdrop.QueryClaimableForActionResponse> getClaimableForActionMethod;
    if ((getClaimableForActionMethod = QueryGrpc.getClaimableForActionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimableForActionMethod = QueryGrpc.getClaimableForActionMethod) == null) {
          QueryGrpc.getClaimableForActionMethod = getClaimableForActionMethod =
              io.grpc.MethodDescriptor.<com.lum.network.airdrop.QueryClaimableForActionRequest, com.lum.network.airdrop.QueryClaimableForActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimableForAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryClaimableForActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryClaimableForActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimableForAction"))
              .build();
        }
      }
    }
    return getClaimableForActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryTotalClaimableRequest,
      com.lum.network.airdrop.QueryTotalClaimableResponse> getTotalClaimableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalClaimable",
      requestType = com.lum.network.airdrop.QueryTotalClaimableRequest.class,
      responseType = com.lum.network.airdrop.QueryTotalClaimableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryTotalClaimableRequest,
      com.lum.network.airdrop.QueryTotalClaimableResponse> getTotalClaimableMethod() {
    io.grpc.MethodDescriptor<com.lum.network.airdrop.QueryTotalClaimableRequest, com.lum.network.airdrop.QueryTotalClaimableResponse> getTotalClaimableMethod;
    if ((getTotalClaimableMethod = QueryGrpc.getTotalClaimableMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalClaimableMethod = QueryGrpc.getTotalClaimableMethod) == null) {
          QueryGrpc.getTotalClaimableMethod = getTotalClaimableMethod =
              io.grpc.MethodDescriptor.<com.lum.network.airdrop.QueryTotalClaimableRequest, com.lum.network.airdrop.QueryTotalClaimableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalClaimable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryTotalClaimableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.airdrop.QueryTotalClaimableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalClaimable"))
              .build();
        }
      }
    }
    return getTotalClaimableMethod;
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
     */
    default void moduleAccountBalance(com.lum.network.airdrop.QueryModuleAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryModuleAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    default void params(com.lum.network.airdrop.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void claimRecord(com.lum.network.airdrop.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRecordMethod(), responseObserver);
    }

    /**
     */
    default void claimableForAction(com.lum.network.airdrop.QueryClaimableForActionRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimableForActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimableForActionMethod(), responseObserver);
    }

    /**
     */
    default void totalClaimable(com.lum.network.airdrop.QueryTotalClaimableRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryTotalClaimableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalClaimableMethod(), responseObserver);
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
     */
    public void moduleAccountBalance(com.lum.network.airdrop.QueryModuleAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryModuleAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.lum.network.airdrop.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimRecord(com.lum.network.airdrop.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimableForAction(com.lum.network.airdrop.QueryClaimableForActionRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimableForActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimableForActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalClaimable(com.lum.network.airdrop.QueryTotalClaimableRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryTotalClaimableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalClaimableMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.lum.network.airdrop.QueryModuleAccountBalanceResponse moduleAccountBalance(com.lum.network.airdrop.QueryModuleAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.airdrop.QueryParamsResponse params(com.lum.network.airdrop.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.airdrop.QueryClaimRecordResponse claimRecord(com.lum.network.airdrop.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.airdrop.QueryClaimableForActionResponse claimableForAction(com.lum.network.airdrop.QueryClaimableForActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimableForActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.airdrop.QueryTotalClaimableResponse totalClaimable(com.lum.network.airdrop.QueryTotalClaimableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalClaimableMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.airdrop.QueryModuleAccountBalanceResponse> moduleAccountBalance(
        com.lum.network.airdrop.QueryModuleAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.airdrop.QueryParamsResponse> params(
        com.lum.network.airdrop.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.airdrop.QueryClaimRecordResponse> claimRecord(
        com.lum.network.airdrop.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.airdrop.QueryClaimableForActionResponse> claimableForAction(
        com.lum.network.airdrop.QueryClaimableForActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimableForActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.airdrop.QueryTotalClaimableResponse> totalClaimable(
        com.lum.network.airdrop.QueryTotalClaimableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalClaimableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_ACCOUNT_BALANCE = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_CLAIM_RECORD = 2;
  private static final int METHODID_CLAIMABLE_FOR_ACTION = 3;
  private static final int METHODID_TOTAL_CLAIMABLE = 4;

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
        case METHODID_MODULE_ACCOUNT_BALANCE:
          serviceImpl.moduleAccountBalance((com.lum.network.airdrop.QueryModuleAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryModuleAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.lum.network.airdrop.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORD:
          serviceImpl.claimRecord((com.lum.network.airdrop.QueryClaimRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimRecordResponse>) responseObserver);
          break;
        case METHODID_CLAIMABLE_FOR_ACTION:
          serviceImpl.claimableForAction((com.lum.network.airdrop.QueryClaimableForActionRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryClaimableForActionResponse>) responseObserver);
          break;
        case METHODID_TOTAL_CLAIMABLE:
          serviceImpl.totalClaimable((com.lum.network.airdrop.QueryTotalClaimableRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.airdrop.QueryTotalClaimableResponse>) responseObserver);
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
          getModuleAccountBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.airdrop.QueryModuleAccountBalanceRequest,
              com.lum.network.airdrop.QueryModuleAccountBalanceResponse>(
                service, METHODID_MODULE_ACCOUNT_BALANCE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.airdrop.QueryParamsRequest,
              com.lum.network.airdrop.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getClaimRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.airdrop.QueryClaimRecordRequest,
              com.lum.network.airdrop.QueryClaimRecordResponse>(
                service, METHODID_CLAIM_RECORD)))
        .addMethod(
          getClaimableForActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.airdrop.QueryClaimableForActionRequest,
              com.lum.network.airdrop.QueryClaimableForActionResponse>(
                service, METHODID_CLAIMABLE_FOR_ACTION)))
        .addMethod(
          getTotalClaimableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.airdrop.QueryTotalClaimableRequest,
              com.lum.network.airdrop.QueryTotalClaimableResponse>(
                service, METHODID_TOTAL_CLAIMABLE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.airdrop.QueryProto.getDescriptor();
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
              .addMethod(getModuleAccountBalanceMethod())
              .addMethod(getParamsMethod())
              .addMethod(getClaimRecordMethod())
              .addMethod(getClaimableForActionMethod())
              .addMethod(getTotalClaimableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
