package com.sentinel.plan.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/plan/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.plan.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansRequest,
      com.sentinel.plan.v2.QueryPlansResponse> getQueryPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPlans",
      requestType = com.sentinel.plan.v2.QueryPlansRequest.class,
      responseType = com.sentinel.plan.v2.QueryPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansRequest,
      com.sentinel.plan.v2.QueryPlansResponse> getQueryPlansMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansRequest, com.sentinel.plan.v2.QueryPlansResponse> getQueryPlansMethod;
    if ((getQueryPlansMethod = QueryServiceGrpc.getQueryPlansMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPlansMethod = QueryServiceGrpc.getQueryPlansMethod) == null) {
          QueryServiceGrpc.getQueryPlansMethod = getQueryPlansMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.QueryPlansRequest, com.sentinel.plan.v2.QueryPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPlans"))
              .build();
        }
      }
    }
    return getQueryPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansForProviderRequest,
      com.sentinel.plan.v2.QueryPlansForProviderResponse> getQueryPlansForProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPlansForProvider",
      requestType = com.sentinel.plan.v2.QueryPlansForProviderRequest.class,
      responseType = com.sentinel.plan.v2.QueryPlansForProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansForProviderRequest,
      com.sentinel.plan.v2.QueryPlansForProviderResponse> getQueryPlansForProviderMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlansForProviderRequest, com.sentinel.plan.v2.QueryPlansForProviderResponse> getQueryPlansForProviderMethod;
    if ((getQueryPlansForProviderMethod = QueryServiceGrpc.getQueryPlansForProviderMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPlansForProviderMethod = QueryServiceGrpc.getQueryPlansForProviderMethod) == null) {
          QueryServiceGrpc.getQueryPlansForProviderMethod = getQueryPlansForProviderMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.QueryPlansForProviderRequest, com.sentinel.plan.v2.QueryPlansForProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPlansForProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlansForProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlansForProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPlansForProvider"))
              .build();
        }
      }
    }
    return getQueryPlansForProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlanRequest,
      com.sentinel.plan.v2.QueryPlanResponse> getQueryPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPlan",
      requestType = com.sentinel.plan.v2.QueryPlanRequest.class,
      responseType = com.sentinel.plan.v2.QueryPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlanRequest,
      com.sentinel.plan.v2.QueryPlanResponse> getQueryPlanMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.QueryPlanRequest, com.sentinel.plan.v2.QueryPlanResponse> getQueryPlanMethod;
    if ((getQueryPlanMethod = QueryServiceGrpc.getQueryPlanMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPlanMethod = QueryServiceGrpc.getQueryPlanMethod) == null) {
          QueryServiceGrpc.getQueryPlanMethod = getQueryPlanMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.QueryPlanRequest, com.sentinel.plan.v2.QueryPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.QueryPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPlan"))
              .build();
        }
      }
    }
    return getQueryPlanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void queryPlans(com.sentinel.plan.v2.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPlansMethod(), responseObserver);
    }

    /**
     */
    default void queryPlansForProvider(com.sentinel.plan.v2.QueryPlansForProviderRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansForProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPlansForProviderMethod(), responseObserver);
    }

    /**
     */
    default void queryPlan(com.sentinel.plan.v2.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPlanMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryPlans(com.sentinel.plan.v2.QueryPlansRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPlansForProvider(com.sentinel.plan.v2.QueryPlansForProviderRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansForProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPlansForProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPlan(com.sentinel.plan.v2.QueryPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPlanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sentinel.plan.v2.QueryPlansResponse queryPlans(com.sentinel.plan.v2.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPlansMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.QueryPlansForProviderResponse queryPlansForProvider(com.sentinel.plan.v2.QueryPlansForProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPlansForProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.QueryPlanResponse queryPlan(com.sentinel.plan.v2.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPlanMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.QueryPlansResponse> queryPlans(
        com.sentinel.plan.v2.QueryPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPlansMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.QueryPlansForProviderResponse> queryPlansForProvider(
        com.sentinel.plan.v2.QueryPlansForProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPlansForProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.QueryPlanResponse> queryPlan(
        com.sentinel.plan.v2.QueryPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPlanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PLANS = 0;
  private static final int METHODID_QUERY_PLANS_FOR_PROVIDER = 1;
  private static final int METHODID_QUERY_PLAN = 2;

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
        case METHODID_QUERY_PLANS:
          serviceImpl.queryPlans((com.sentinel.plan.v2.QueryPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansResponse>) responseObserver);
          break;
        case METHODID_QUERY_PLANS_FOR_PROVIDER:
          serviceImpl.queryPlansForProvider((com.sentinel.plan.v2.QueryPlansForProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlansForProviderResponse>) responseObserver);
          break;
        case METHODID_QUERY_PLAN:
          serviceImpl.queryPlan((com.sentinel.plan.v2.QueryPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.QueryPlanResponse>) responseObserver);
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
          getQueryPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.QueryPlansRequest,
              com.sentinel.plan.v2.QueryPlansResponse>(
                service, METHODID_QUERY_PLANS)))
        .addMethod(
          getQueryPlansForProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.QueryPlansForProviderRequest,
              com.sentinel.plan.v2.QueryPlansForProviderResponse>(
                service, METHODID_QUERY_PLANS_FOR_PROVIDER)))
        .addMethod(
          getQueryPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.QueryPlanRequest,
              com.sentinel.plan.v2.QueryPlanResponse>(
                service, METHODID_QUERY_PLAN)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.plan.v2.QuerierProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getQueryPlansMethod())
              .addMethod(getQueryPlansForProviderMethod())
              .addMethod(getQueryPlanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
