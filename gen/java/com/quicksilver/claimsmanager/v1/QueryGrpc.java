package com.quicksilver.claimsmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: quicksilver/claimsmanager/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.claimsmanager.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claims",
      requestType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.class,
      responseType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getClaimsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getClaimsMethod;
    if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
          QueryGrpc.getClaimsMethod = getClaimsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Claims"))
              .build();
        }
      }
    }
    return getClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getLastEpochClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEpochClaims",
      requestType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.class,
      responseType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getLastEpochClaimsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getLastEpochClaimsMethod;
    if ((getLastEpochClaimsMethod = QueryGrpc.getLastEpochClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastEpochClaimsMethod = QueryGrpc.getLastEpochClaimsMethod) == null) {
          QueryGrpc.getLastEpochClaimsMethod = getLastEpochClaimsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEpochClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastEpochClaims"))
              .build();
        }
      }
    }
    return getLastEpochClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserClaims",
      requestType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.class,
      responseType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserClaimsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserClaimsMethod;
    if ((getUserClaimsMethod = QueryGrpc.getUserClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserClaimsMethod = QueryGrpc.getUserClaimsMethod) == null) {
          QueryGrpc.getUserClaimsMethod = getUserClaimsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserClaims"))
              .build();
        }
      }
    }
    return getUserClaimsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserLastEpochClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserLastEpochClaims",
      requestType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.class,
      responseType = com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
      com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserLastEpochClaimsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> getUserLastEpochClaimsMethod;
    if ((getUserLastEpochClaimsMethod = QueryGrpc.getUserLastEpochClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserLastEpochClaimsMethod = QueryGrpc.getUserLastEpochClaimsMethod) == null) {
          QueryGrpc.getUserLastEpochClaimsMethod = getUserLastEpochClaimsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest, com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserLastEpochClaims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserLastEpochClaims"))
              .build();
        }
      }
    }
    return getUserLastEpochClaimsMethod;
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
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Claims returns all zone claims from the current epoch.
     * </pre>
     */
    default void claims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEpochClaims returns all zone claims from the last epoch.
     * </pre>
     */
    default void lastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEpochClaimsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserClaims returns all zone claims for a given address from the current epoch.
     * </pre>
     */
    default void userClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserClaimsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserLastEpochClaims returns all zone claims for a given address from the last epoch.
     * </pre>
     */
    default void userLastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserLastEpochClaimsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
   * Query provides defines the gRPC querier service.
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
     * Claims returns all zone claims from the current epoch.
     * </pre>
     */
    public void claims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEpochClaims returns all zone claims from the last epoch.
     * </pre>
     */
    public void lastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEpochClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserClaims returns all zone claims for a given address from the current epoch.
     * </pre>
     */
    public void userClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserClaimsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserLastEpochClaims returns all zone claims for a given address from the last epoch.
     * </pre>
     */
    public void userLastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserLastEpochClaimsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Claims returns all zone claims from the current epoch.
     * </pre>
     */
    public com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse claims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEpochClaims returns all zone claims from the last epoch.
     * </pre>
     */
    public com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse lastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEpochClaimsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserClaims returns all zone claims for a given address from the current epoch.
     * </pre>
     */
    public com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse userClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserClaimsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserLastEpochClaims returns all zone claims for a given address from the last epoch.
     * </pre>
     */
    public com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse userLastEpochClaims(com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserLastEpochClaimsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Claims returns all zone claims from the current epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> claims(
        com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEpochClaims returns all zone claims from the last epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> lastEpochClaims(
        com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEpochClaimsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserClaims returns all zone claims for a given address from the current epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> userClaims(
        com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserClaimsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserLastEpochClaims returns all zone claims for a given address from the last epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse> userLastEpochClaims(
        com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserLastEpochClaimsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIMS = 0;
  private static final int METHODID_LAST_EPOCH_CLAIMS = 1;
  private static final int METHODID_USER_CLAIMS = 2;
  private static final int METHODID_USER_LAST_EPOCH_CLAIMS = 3;

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
        case METHODID_CLAIMS:
          serviceImpl.claims((com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_LAST_EPOCH_CLAIMS:
          serviceImpl.lastEpochClaims((com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_USER_CLAIMS:
          serviceImpl.userClaims((com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>) responseObserver);
          break;
        case METHODID_USER_LAST_EPOCH_CLAIMS:
          serviceImpl.userLastEpochClaims((com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>) responseObserver);
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
          getClaimsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>(
                service, METHODID_CLAIMS)))
        .addMethod(
          getLastEpochClaimsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>(
                service, METHODID_LAST_EPOCH_CLAIMS)))
        .addMethod(
          getUserClaimsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>(
                service, METHODID_USER_CLAIMS)))
        .addMethod(
          getUserLastEpochClaimsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsRequest,
              com.quicksilver.claimsmanager.v1.QueryProto.QueryClaimsResponse>(
                service, METHODID_USER_LAST_EPOCH_CLAIMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.quicksilver.claimsmanager.v1.QueryProto.getDescriptor();
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
              .addMethod(getClaimsMethod())
              .addMethod(getLastEpochClaimsMethod())
              .addMethod(getUserClaimsMethod())
              .addMethod(getUserLastEpochClaimsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
