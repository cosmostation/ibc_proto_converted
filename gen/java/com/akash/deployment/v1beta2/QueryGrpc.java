package com.akash.deployment.v1beta2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/deployment/v1beta2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "akash.deployment.v1beta2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> getDeploymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deployments",
      requestType = com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest.class,
      responseType = com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> getDeploymentsMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest, com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> getDeploymentsMethod;
    if ((getDeploymentsMethod = QueryGrpc.getDeploymentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeploymentsMethod = QueryGrpc.getDeploymentsMethod) == null) {
          QueryGrpc.getDeploymentsMethod = getDeploymentsMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest, com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deployments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deployments"))
              .build();
        }
      }
    }
    return getDeploymentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> getDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deployment",
      requestType = com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest.class,
      responseType = com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> getDeploymentMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest, com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> getDeploymentMethod;
    if ((getDeploymentMethod = QueryGrpc.getDeploymentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeploymentMethod = QueryGrpc.getDeploymentMethod) == null) {
          QueryGrpc.getDeploymentMethod = getDeploymentMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest, com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deployment"))
              .build();
        }
      }
    }
    return getDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> getGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Group",
      requestType = com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest.class,
      responseType = com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest,
      com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> getGroupMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest, com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> getGroupMethod;
    if ((getGroupMethod = QueryGrpc.getGroupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupMethod = QueryGrpc.getGroupMethod) == null) {
          QueryGrpc.getGroupMethod = getGroupMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest, com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Group"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Group"))
              .build();
        }
      }
    }
    return getGroupMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deployments queries deployments
     * </pre>
     */
    default void deployments(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeploymentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deployment queries deployment details
     * </pre>
     */
    default void deployment(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Group queries group details
     * </pre>
     */
    default void group(com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public void deployments(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeploymentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deployment queries deployment details
     * </pre>
     */
    public void deployment(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Group queries group details
     * </pre>
     */
    public void group(com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse deployments(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeploymentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deployment queries deployment details
     * </pre>
     */
    public com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse deployment(com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Group queries group details
     * </pre>
     */
    public com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse group(com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse> deployments(
        com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeploymentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deployment queries deployment details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse> deployment(
        com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Group queries group details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse> group(
        com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPLOYMENTS = 0;
  private static final int METHODID_DEPLOYMENT = 1;
  private static final int METHODID_GROUP = 2;

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
        case METHODID_DEPLOYMENTS:
          serviceImpl.deployments((com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse>) responseObserver);
          break;
        case METHODID_DEPLOYMENT:
          serviceImpl.deployment((com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse>) responseObserver);
          break;
        case METHODID_GROUP:
          serviceImpl.group((com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse>) responseObserver);
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
          getDeploymentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsRequest,
              com.akash.deployment.v1beta2.QueryProto.QueryDeploymentsResponse>(
                service, METHODID_DEPLOYMENTS)))
        .addMethod(
          getDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta2.QueryProto.QueryDeploymentRequest,
              com.akash.deployment.v1beta2.QueryProto.QueryDeploymentResponse>(
                service, METHODID_DEPLOYMENT)))
        .addMethod(
          getGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta2.QueryProto.QueryGroupRequest,
              com.akash.deployment.v1beta2.QueryProto.QueryGroupResponse>(
                service, METHODID_GROUP)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.deployment.v1beta2.QueryProto.getDescriptor();
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
              .addMethod(getDeploymentsMethod())
              .addMethod(getDeploymentMethod())
              .addMethod(getGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
