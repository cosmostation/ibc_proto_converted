package com.sentinel.node.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/node/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.node.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesRequest,
      com.sentinel.node.v2.QueryNodesResponse> getQueryNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNodes",
      requestType = com.sentinel.node.v2.QueryNodesRequest.class,
      responseType = com.sentinel.node.v2.QueryNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesRequest,
      com.sentinel.node.v2.QueryNodesResponse> getQueryNodesMethod() {
    io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesRequest, com.sentinel.node.v2.QueryNodesResponse> getQueryNodesMethod;
    if ((getQueryNodesMethod = QueryServiceGrpc.getQueryNodesMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodesMethod = QueryServiceGrpc.getQueryNodesMethod) == null) {
          QueryServiceGrpc.getQueryNodesMethod = getQueryNodesMethod =
              io.grpc.MethodDescriptor.<com.sentinel.node.v2.QueryNodesRequest, com.sentinel.node.v2.QueryNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNodes"))
              .build();
        }
      }
    }
    return getQueryNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesForPlanRequest,
      com.sentinel.node.v2.QueryNodesForPlanResponse> getQueryNodesForPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNodesForPlan",
      requestType = com.sentinel.node.v2.QueryNodesForPlanRequest.class,
      responseType = com.sentinel.node.v2.QueryNodesForPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesForPlanRequest,
      com.sentinel.node.v2.QueryNodesForPlanResponse> getQueryNodesForPlanMethod() {
    io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodesForPlanRequest, com.sentinel.node.v2.QueryNodesForPlanResponse> getQueryNodesForPlanMethod;
    if ((getQueryNodesForPlanMethod = QueryServiceGrpc.getQueryNodesForPlanMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodesForPlanMethod = QueryServiceGrpc.getQueryNodesForPlanMethod) == null) {
          QueryServiceGrpc.getQueryNodesForPlanMethod = getQueryNodesForPlanMethod =
              io.grpc.MethodDescriptor.<com.sentinel.node.v2.QueryNodesForPlanRequest, com.sentinel.node.v2.QueryNodesForPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNodesForPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodesForPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodesForPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNodesForPlan"))
              .build();
        }
      }
    }
    return getQueryNodesForPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodeRequest,
      com.sentinel.node.v2.QueryNodeResponse> getQueryNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryNode",
      requestType = com.sentinel.node.v2.QueryNodeRequest.class,
      responseType = com.sentinel.node.v2.QueryNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodeRequest,
      com.sentinel.node.v2.QueryNodeResponse> getQueryNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryNodeRequest, com.sentinel.node.v2.QueryNodeResponse> getQueryNodeMethod;
    if ((getQueryNodeMethod = QueryServiceGrpc.getQueryNodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryNodeMethod = QueryServiceGrpc.getQueryNodeMethod) == null) {
          QueryServiceGrpc.getQueryNodeMethod = getQueryNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.node.v2.QueryNodeRequest, com.sentinel.node.v2.QueryNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryNode"))
              .build();
        }
      }
    }
    return getQueryNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryParamsRequest,
      com.sentinel.node.v2.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.sentinel.node.v2.QueryParamsRequest.class,
      responseType = com.sentinel.node.v2.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryParamsRequest,
      com.sentinel.node.v2.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.node.v2.QueryParamsRequest, com.sentinel.node.v2.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
          QueryServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.node.v2.QueryParamsRequest, com.sentinel.node.v2.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.node.v2.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
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
    default void queryNodes(com.sentinel.node.v2.QueryNodesRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodesMethod(), responseObserver);
    }

    /**
     */
    default void queryNodesForPlan(com.sentinel.node.v2.QueryNodesForPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesForPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodesForPlanMethod(), responseObserver);
    }

    /**
     */
    default void queryNode(com.sentinel.node.v2.QueryNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryNodeMethod(), responseObserver);
    }

    /**
     */
    default void queryParams(com.sentinel.node.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
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
    public void queryNodes(com.sentinel.node.v2.QueryNodesRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryNodesForPlan(com.sentinel.node.v2.QueryNodesForPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesForPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodesForPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryNode(com.sentinel.node.v2.QueryNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParams(com.sentinel.node.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.sentinel.node.v2.QueryNodesResponse queryNodes(com.sentinel.node.v2.QueryNodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.node.v2.QueryNodesForPlanResponse queryNodesForPlan(com.sentinel.node.v2.QueryNodesForPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodesForPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.node.v2.QueryNodeResponse queryNode(com.sentinel.node.v2.QueryNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.node.v2.QueryParamsResponse queryParams(com.sentinel.node.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.node.v2.QueryNodesResponse> queryNodes(
        com.sentinel.node.v2.QueryNodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.node.v2.QueryNodesForPlanResponse> queryNodesForPlan(
        com.sentinel.node.v2.QueryNodesForPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodesForPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.node.v2.QueryNodeResponse> queryNode(
        com.sentinel.node.v2.QueryNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.node.v2.QueryParamsResponse> queryParams(
        com.sentinel.node.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_NODES = 0;
  private static final int METHODID_QUERY_NODES_FOR_PLAN = 1;
  private static final int METHODID_QUERY_NODE = 2;
  private static final int METHODID_QUERY_PARAMS = 3;

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
        case METHODID_QUERY_NODES:
          serviceImpl.queryNodes((com.sentinel.node.v2.QueryNodesRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesResponse>) responseObserver);
          break;
        case METHODID_QUERY_NODES_FOR_PLAN:
          serviceImpl.queryNodesForPlan((com.sentinel.node.v2.QueryNodesForPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodesForPlanResponse>) responseObserver);
          break;
        case METHODID_QUERY_NODE:
          serviceImpl.queryNode((com.sentinel.node.v2.QueryNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryNodeResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((com.sentinel.node.v2.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.node.v2.QueryParamsResponse>) responseObserver);
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
          getQueryNodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.node.v2.QueryNodesRequest,
              com.sentinel.node.v2.QueryNodesResponse>(
                service, METHODID_QUERY_NODES)))
        .addMethod(
          getQueryNodesForPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.node.v2.QueryNodesForPlanRequest,
              com.sentinel.node.v2.QueryNodesForPlanResponse>(
                service, METHODID_QUERY_NODES_FOR_PLAN)))
        .addMethod(
          getQueryNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.node.v2.QueryNodeRequest,
              com.sentinel.node.v2.QueryNodeResponse>(
                service, METHODID_QUERY_NODE)))
        .addMethod(
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.node.v2.QueryParamsRequest,
              com.sentinel.node.v2.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.node.v2.QuerierProto.getDescriptor();
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
              .addMethod(getQueryNodesMethod())
              .addMethod(getQueryNodesForPlanMethod())
              .addMethod(getQueryNodeMethod())
              .addMethod(getQueryParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
