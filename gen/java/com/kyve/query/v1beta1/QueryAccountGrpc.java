package com.kyve.query.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryDelegation contains all rpc requests related to direct delegation data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: kyve/query/v1beta1/account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryAccountGrpc {

  private QueryAccountGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kyve.query.v1beta1.QueryAccount";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> getAccountAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAssets",
      requestType = com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest.class,
      responseType = com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> getAccountAssetsMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> getAccountAssetsMethod;
    if ((getAccountAssetsMethod = QueryAccountGrpc.getAccountAssetsMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountAssetsMethod = QueryAccountGrpc.getAccountAssetsMethod) == null) {
          QueryAccountGrpc.getAccountAssetsMethod = getAccountAssetsMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountAssets"))
              .build();
        }
      }
    }
    return getAccountAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountDelegationUnbondings",
      requestType = com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest.class,
      responseType = com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> getAccountDelegationUnbondingsMethod;
    if ((getAccountDelegationUnbondingsMethod = QueryAccountGrpc.getAccountDelegationUnbondingsMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountDelegationUnbondingsMethod = QueryAccountGrpc.getAccountDelegationUnbondingsMethod) == null) {
          QueryAccountGrpc.getAccountDelegationUnbondingsMethod = getAccountDelegationUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountDelegationUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountDelegationUnbondings"))
              .build();
        }
      }
    }
    return getAccountDelegationUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> getAccountFundedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountFundedList",
      requestType = com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest.class,
      responseType = com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> getAccountFundedListMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> getAccountFundedListMethod;
    if ((getAccountFundedListMethod = QueryAccountGrpc.getAccountFundedListMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountFundedListMethod = QueryAccountGrpc.getAccountFundedListMethod) == null) {
          QueryAccountGrpc.getAccountFundedListMethod = getAccountFundedListMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountFundedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountFundedList"))
              .build();
        }
      }
    }
    return getAccountFundedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> getAccountRedelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountRedelegation",
      requestType = com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest.class,
      responseType = com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest,
      com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> getAccountRedelegationMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> getAccountRedelegationMethod;
    if ((getAccountRedelegationMethod = QueryAccountGrpc.getAccountRedelegationMethod) == null) {
      synchronized (QueryAccountGrpc.class) {
        if ((getAccountRedelegationMethod = QueryAccountGrpc.getAccountRedelegationMethod) == null) {
          QueryAccountGrpc.getAccountRedelegationMethod = getAccountRedelegationMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest, com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountRedelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryAccountMethodDescriptorSupplier("AccountRedelegation"))
              .build();
        }
      }
    }
    return getAccountRedelegationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryAccountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountStub>() {
        @java.lang.Override
        public QueryAccountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountStub(channel, callOptions);
        }
      };
    return QueryAccountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryAccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountBlockingStub>() {
        @java.lang.Override
        public QueryAccountBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountBlockingStub(channel, callOptions);
        }
      };
    return QueryAccountBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryAccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryAccountFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryAccountFutureStub>() {
        @java.lang.Override
        public QueryAccountFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryAccountFutureStub(channel, callOptions);
        }
      };
    return QueryAccountFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    default void accountAssets(com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountAssetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    default void accountDelegationUnbondings(com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDelegationUnbondingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    default void accountFundedList(com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountFundedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    default void accountRedelegation(com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountRedelegationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryAccount.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryAccountImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryAccountGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryAccount.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountStub
      extends io.grpc.stub.AbstractAsyncStub<QueryAccountStub> {
    private QueryAccountStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public void accountAssets(com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public void accountDelegationUnbondings(com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDelegationUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public void accountFundedList(com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountFundedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public void accountRedelegation(com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountRedelegationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryAccount.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryAccountBlockingStub> {
    private QueryAccountBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse accountAssets(com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountAssetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse accountDelegationUnbondings(com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDelegationUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse accountFundedList(com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountFundedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse accountRedelegation(com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountRedelegationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryAccount.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryAccountFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryAccountFutureStub> {
    private QueryAccountFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryAccountFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryAccountFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse> accountAssets(
        com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountAssetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountDelegationUnbondings ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse> accountDelegationUnbondings(
        com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDelegationUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountFundedList returns all pools the given user has funded into.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse> accountFundedList(
        com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountFundedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountRedelegation ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse> accountRedelegation(
        com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountRedelegationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNT_ASSETS = 0;
  private static final int METHODID_ACCOUNT_DELEGATION_UNBONDINGS = 1;
  private static final int METHODID_ACCOUNT_FUNDED_LIST = 2;
  private static final int METHODID_ACCOUNT_REDELEGATION = 3;

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
        case METHODID_ACCOUNT_ASSETS:
          serviceImpl.accountAssets((com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DELEGATION_UNBONDINGS:
          serviceImpl.accountDelegationUnbondings((com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_FUNDED_LIST:
          serviceImpl.accountFundedList((com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_REDELEGATION:
          serviceImpl.accountRedelegation((com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse>) responseObserver);
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
          getAccountAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsRequest,
              com.kyve.query.v1beta1.AccountProto.QueryAccountAssetsResponse>(
                service, METHODID_ACCOUNT_ASSETS)))
        .addMethod(
          getAccountDelegationUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsRequest,
              com.kyve.query.v1beta1.AccountProto.QueryAccountDelegationUnbondingsResponse>(
                service, METHODID_ACCOUNT_DELEGATION_UNBONDINGS)))
        .addMethod(
          getAccountFundedListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListRequest,
              com.kyve.query.v1beta1.AccountProto.QueryAccountFundedListResponse>(
                service, METHODID_ACCOUNT_FUNDED_LIST)))
        .addMethod(
          getAccountRedelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationRequest,
              com.kyve.query.v1beta1.AccountProto.QueryAccountRedelegationResponse>(
                service, METHODID_ACCOUNT_REDELEGATION)))
        .build();
  }

  private static abstract class QueryAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryAccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.query.v1beta1.AccountProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryAccount");
    }
  }

  private static final class QueryAccountFileDescriptorSupplier
      extends QueryAccountBaseDescriptorSupplier {
    QueryAccountFileDescriptorSupplier() {}
  }

  private static final class QueryAccountMethodDescriptorSupplier
      extends QueryAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryAccountMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryAccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryAccountFileDescriptorSupplier())
              .addMethod(getAccountAssetsMethod())
              .addMethod(getAccountDelegationUnbondingsMethod())
              .addMethod(getAccountFundedListMethod())
              .addMethod(getAccountRedelegationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
