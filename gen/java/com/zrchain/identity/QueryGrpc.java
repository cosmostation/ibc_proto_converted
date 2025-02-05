package com.zrchain.identity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/identity/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "zrchain.identity.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryParamsRequest,
      com.zrchain.identity.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.zrchain.identity.QueryProto.QueryParamsRequest.class,
      responseType = com.zrchain.identity.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryParamsRequest,
      com.zrchain.identity.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryParamsRequest, com.zrchain.identity.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.QueryProto.QueryParamsRequest, com.zrchain.identity.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspacesRequest,
      com.zrchain.identity.QueryProto.QueryWorkspacesResponse> getWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Workspaces",
      requestType = com.zrchain.identity.QueryProto.QueryWorkspacesRequest.class,
      responseType = com.zrchain.identity.QueryProto.QueryWorkspacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspacesRequest,
      com.zrchain.identity.QueryProto.QueryWorkspacesResponse> getWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspacesRequest, com.zrchain.identity.QueryProto.QueryWorkspacesResponse> getWorkspacesMethod;
    if ((getWorkspacesMethod = QueryGrpc.getWorkspacesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWorkspacesMethod = QueryGrpc.getWorkspacesMethod) == null) {
          QueryGrpc.getWorkspacesMethod = getWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.QueryProto.QueryWorkspacesRequest, com.zrchain.identity.QueryProto.QueryWorkspacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Workspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryWorkspacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryWorkspacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Workspaces"))
              .build();
        }
      }
    }
    return getWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest,
      com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> getWorkspaceByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WorkspaceByAddress",
      requestType = com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest.class,
      responseType = com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest,
      com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> getWorkspaceByAddressMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest, com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> getWorkspaceByAddressMethod;
    if ((getWorkspaceByAddressMethod = QueryGrpc.getWorkspaceByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWorkspaceByAddressMethod = QueryGrpc.getWorkspaceByAddressMethod) == null) {
          QueryGrpc.getWorkspaceByAddressMethod = getWorkspaceByAddressMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest, com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WorkspaceByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WorkspaceByAddress"))
              .build();
        }
      }
    }
    return getWorkspaceByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringsRequest,
      com.zrchain.identity.QueryProto.QueryKeyringsResponse> getKeyringsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Keyrings",
      requestType = com.zrchain.identity.QueryProto.QueryKeyringsRequest.class,
      responseType = com.zrchain.identity.QueryProto.QueryKeyringsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringsRequest,
      com.zrchain.identity.QueryProto.QueryKeyringsResponse> getKeyringsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringsRequest, com.zrchain.identity.QueryProto.QueryKeyringsResponse> getKeyringsMethod;
    if ((getKeyringsMethod = QueryGrpc.getKeyringsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyringsMethod = QueryGrpc.getKeyringsMethod) == null) {
          QueryGrpc.getKeyringsMethod = getKeyringsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.QueryProto.QueryKeyringsRequest, com.zrchain.identity.QueryProto.QueryKeyringsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Keyrings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryKeyringsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryKeyringsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Keyrings"))
              .build();
        }
      }
    }
    return getKeyringsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest,
      com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> getKeyringByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyringByAddress",
      requestType = com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest.class,
      responseType = com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest,
      com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> getKeyringByAddressMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest, com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> getKeyringByAddressMethod;
    if ((getKeyringByAddressMethod = QueryGrpc.getKeyringByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyringByAddressMethod = QueryGrpc.getKeyringByAddressMethod) == null) {
          QueryGrpc.getKeyringByAddressMethod = getKeyringByAddressMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest, com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyringByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("KeyringByAddress"))
              .build();
        }
      }
    }
    return getKeyringByAddressMethod;
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
    default void params(com.zrchain.identity.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Workspaces items.
     * </pre>
     */
    default void workspaces(com.zrchain.identity.QueryProto.QueryWorkspacesRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WorkspaceByAddress items.
     * </pre>
     */
    default void workspaceByAddress(com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWorkspaceByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Keyrings items.
     * </pre>
     */
    default void keyrings(com.zrchain.identity.QueryProto.QueryKeyringsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyringsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyringByAddress items.
     * </pre>
     */
    default void keyringByAddress(com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyringByAddressMethod(), responseObserver);
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
    public void params(com.zrchain.identity.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Workspaces items.
     * </pre>
     */
    public void workspaces(com.zrchain.identity.QueryProto.QueryWorkspacesRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WorkspaceByAddress items.
     * </pre>
     */
    public void workspaceByAddress(com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWorkspaceByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Keyrings items.
     * </pre>
     */
    public void keyrings(com.zrchain.identity.QueryProto.QueryKeyringsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyringsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyringByAddress items.
     * </pre>
     */
    public void keyringByAddress(com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyringByAddressMethod(), getCallOptions()), request, responseObserver);
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
    public com.zrchain.identity.QueryProto.QueryParamsResponse params(com.zrchain.identity.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Workspaces items.
     * </pre>
     */
    public com.zrchain.identity.QueryProto.QueryWorkspacesResponse workspaces(com.zrchain.identity.QueryProto.QueryWorkspacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of WorkspaceByAddress items.
     * </pre>
     */
    public com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse workspaceByAddress(com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWorkspaceByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Keyrings items.
     * </pre>
     */
    public com.zrchain.identity.QueryProto.QueryKeyringsResponse keyrings(com.zrchain.identity.QueryProto.QueryKeyringsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyringsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of KeyringByAddress items.
     * </pre>
     */
    public com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse keyringByAddress(com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyringByAddressMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.QueryProto.QueryParamsResponse> params(
        com.zrchain.identity.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Workspaces items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.QueryProto.QueryWorkspacesResponse> workspaces(
        com.zrchain.identity.QueryProto.QueryWorkspacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of WorkspaceByAddress items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse> workspaceByAddress(
        com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWorkspaceByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Keyrings items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.QueryProto.QueryKeyringsResponse> keyrings(
        com.zrchain.identity.QueryProto.QueryKeyringsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyringsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of KeyringByAddress items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse> keyringByAddress(
        com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyringByAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_WORKSPACES = 1;
  private static final int METHODID_WORKSPACE_BY_ADDRESS = 2;
  private static final int METHODID_KEYRINGS = 3;
  private static final int METHODID_KEYRING_BY_ADDRESS = 4;

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
          serviceImpl.params((com.zrchain.identity.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_WORKSPACES:
          serviceImpl.workspaces((com.zrchain.identity.QueryProto.QueryWorkspacesRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspacesResponse>) responseObserver);
          break;
        case METHODID_WORKSPACE_BY_ADDRESS:
          serviceImpl.workspaceByAddress((com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse>) responseObserver);
          break;
        case METHODID_KEYRINGS:
          serviceImpl.keyrings((com.zrchain.identity.QueryProto.QueryKeyringsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringsResponse>) responseObserver);
          break;
        case METHODID_KEYRING_BY_ADDRESS:
          serviceImpl.keyringByAddress((com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse>) responseObserver);
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
              com.zrchain.identity.QueryProto.QueryParamsRequest,
              com.zrchain.identity.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getWorkspacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.QueryProto.QueryWorkspacesRequest,
              com.zrchain.identity.QueryProto.QueryWorkspacesResponse>(
                service, METHODID_WORKSPACES)))
        .addMethod(
          getWorkspaceByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.QueryProto.QueryWorkspaceByAddressRequest,
              com.zrchain.identity.QueryProto.QueryWorkspaceByAddressResponse>(
                service, METHODID_WORKSPACE_BY_ADDRESS)))
        .addMethod(
          getKeyringsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.QueryProto.QueryKeyringsRequest,
              com.zrchain.identity.QueryProto.QueryKeyringsResponse>(
                service, METHODID_KEYRINGS)))
        .addMethod(
          getKeyringByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.QueryProto.QueryKeyringByAddressRequest,
              com.zrchain.identity.QueryProto.QueryKeyringByAddressResponse>(
                service, METHODID_KEYRING_BY_ADDRESS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.identity.QueryProto.getDescriptor();
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
              .addMethod(getWorkspacesMethod())
              .addMethod(getWorkspaceByAddressMethod())
              .addMethod(getKeyringsMethod())
              .addMethod(getKeyringByAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
