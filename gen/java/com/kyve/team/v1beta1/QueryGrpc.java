package com.kyve.team.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/team/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "kyve.team.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> getTeamInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamInfo",
      requestType = com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest.class,
      responseType = com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> getTeamInfoMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> getTeamInfoMethod;
    if ((getTeamInfoMethod = QueryGrpc.getTeamInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamInfoMethod = QueryGrpc.getTeamInfoMethod) == null) {
          QueryGrpc.getTeamInfoMethod = getTeamInfoMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamInfo"))
              .build();
        }
      }
    }
    return getTeamInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingAccounts",
      requestType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest.class,
      responseType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> getTeamVestingAccountsMethod;
    if ((getTeamVestingAccountsMethod = QueryGrpc.getTeamVestingAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingAccountsMethod = QueryGrpc.getTeamVestingAccountsMethod) == null) {
          QueryGrpc.getTeamVestingAccountsMethod = getTeamVestingAccountsMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingAccounts"))
              .build();
        }
      }
    }
    return getTeamVestingAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingAccount",
      requestType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest.class,
      responseType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> getTeamVestingAccountMethod;
    if ((getTeamVestingAccountMethod = QueryGrpc.getTeamVestingAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingAccountMethod = QueryGrpc.getTeamVestingAccountMethod) == null) {
          QueryGrpc.getTeamVestingAccountMethod = getTeamVestingAccountMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingAccount"))
              .build();
        }
      }
    }
    return getTeamVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingStatus",
      requestType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest.class,
      responseType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> getTeamVestingStatusMethod;
    if ((getTeamVestingStatusMethod = QueryGrpc.getTeamVestingStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingStatusMethod = QueryGrpc.getTeamVestingStatusMethod) == null) {
          QueryGrpc.getTeamVestingStatusMethod = getTeamVestingStatusMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingStatus"))
              .build();
        }
      }
    }
    return getTeamVestingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TeamVestingStatusByTime",
      requestType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest.class,
      responseType = com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest,
      com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> getTeamVestingStatusByTimeMethod;
    if ((getTeamVestingStatusByTimeMethod = QueryGrpc.getTeamVestingStatusByTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTeamVestingStatusByTimeMethod = QueryGrpc.getTeamVestingStatusByTimeMethod) == null) {
          QueryGrpc.getTeamVestingStatusByTimeMethod = getTeamVestingStatusByTimeMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest, com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TeamVestingStatusByTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TeamVestingStatusByTime"))
              .build();
        }
      }
    }
    return getTeamVestingStatusByTimeMethod;
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    default void teamInfo(com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeamInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    default void teamVestingAccounts(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeamVestingAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    default void teamVestingAccount(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeamVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    default void teamVestingStatus(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeamVestingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    default void teamVestingStatusByTime(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTeamVestingStatusByTimeMethod(), responseObserver);
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public void teamInfo(com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeamInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccounts(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeamVestingAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public void teamVestingAccount(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeamVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatus(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeamVestingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public void teamVestingStatusByTime(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTeamVestingStatusByTimeMethod(), getCallOptions()), request, responseObserver);
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse teamInfo(com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeamInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse teamVestingAccounts(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeamVestingAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse teamVestingAccount(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeamVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse teamVestingStatus(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeamVestingStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse teamVestingStatusByTime(com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTeamVestingStatusByTimeMethod(), getCallOptions(), request);
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
     * TeamInfo queries all important information from the team module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse> teamInfo(
        com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeamInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamVestingAccounts queries all team vesting accounts of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse> teamVestingAccounts(
        com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeamVestingAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamVestingAccount queries the team vesting accounts of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse> teamVestingAccount(
        com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeamVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse> teamVestingStatus(
        com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeamVestingStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse> teamVestingStatusByTime(
        com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTeamVestingStatusByTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEAM_INFO = 0;
  private static final int METHODID_TEAM_VESTING_ACCOUNTS = 1;
  private static final int METHODID_TEAM_VESTING_ACCOUNT = 2;
  private static final int METHODID_TEAM_VESTING_STATUS = 3;
  private static final int METHODID_TEAM_VESTING_STATUS_BY_TIME = 4;

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
        case METHODID_TEAM_INFO:
          serviceImpl.teamInfo((com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_ACCOUNTS:
          serviceImpl.teamVestingAccounts((com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_ACCOUNT:
          serviceImpl.teamVestingAccount((com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_STATUS:
          serviceImpl.teamVestingStatus((com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse>) responseObserver);
          break;
        case METHODID_TEAM_VESTING_STATUS_BY_TIME:
          serviceImpl.teamVestingStatusByTime((com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse>) responseObserver);
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
          getTeamInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.QueryProto.QueryTeamInfoRequest,
              com.kyve.team.v1beta1.QueryProto.QueryTeamInfoResponse>(
                service, METHODID_TEAM_INFO)))
        .addMethod(
          getTeamVestingAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsRequest,
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountsResponse>(
                service, METHODID_TEAM_VESTING_ACCOUNTS)))
        .addMethod(
          getTeamVestingAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountRequest,
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingAccountResponse>(
                service, METHODID_TEAM_VESTING_ACCOUNT)))
        .addMethod(
          getTeamVestingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusRequest,
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusResponse>(
                service, METHODID_TEAM_VESTING_STATUS)))
        .addMethod(
          getTeamVestingStatusByTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeRequest,
              com.kyve.team.v1beta1.QueryProto.QueryTeamVestingStatusByTimeResponse>(
                service, METHODID_TEAM_VESTING_STATUS_BY_TIME)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.team.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getTeamInfoMethod())
              .addMethod(getTeamVestingAccountsMethod())
              .addMethod(getTeamVestingAccountMethod())
              .addMethod(getTeamVestingStatusMethod())
              .addMethod(getTeamVestingStatusByTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
