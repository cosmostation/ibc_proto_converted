package com.lum.network.icqueries;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: lum-network/icqueries/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "lum.network.icqueries.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryQueriesRequest,
      com.lum.network.icqueries.QueryQueriesResponse> getQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Queries",
      requestType = com.lum.network.icqueries.QueryQueriesRequest.class,
      responseType = com.lum.network.icqueries.QueryQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryQueriesRequest,
      com.lum.network.icqueries.QueryQueriesResponse> getQueriesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryQueriesRequest, com.lum.network.icqueries.QueryQueriesResponse> getQueriesMethod;
    if ((getQueriesMethod = QueryServiceGrpc.getQueriesMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueriesMethod = QueryServiceGrpc.getQueriesMethod) == null) {
          QueryServiceGrpc.getQueriesMethod = getQueriesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.icqueries.QueryQueriesRequest, com.lum.network.icqueries.QueryQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Queries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.icqueries.QueryQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.icqueries.QueryQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Queries"))
              .build();
        }
      }
    }
    return getQueriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryPendingQueriesRequest,
      com.lum.network.icqueries.QueryPendingQueriesResponse> getPendingQueriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingQueries",
      requestType = com.lum.network.icqueries.QueryPendingQueriesRequest.class,
      responseType = com.lum.network.icqueries.QueryPendingQueriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryPendingQueriesRequest,
      com.lum.network.icqueries.QueryPendingQueriesResponse> getPendingQueriesMethod() {
    io.grpc.MethodDescriptor<com.lum.network.icqueries.QueryPendingQueriesRequest, com.lum.network.icqueries.QueryPendingQueriesResponse> getPendingQueriesMethod;
    if ((getPendingQueriesMethod = QueryServiceGrpc.getPendingQueriesMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getPendingQueriesMethod = QueryServiceGrpc.getPendingQueriesMethod) == null) {
          QueryServiceGrpc.getPendingQueriesMethod = getPendingQueriesMethod =
              io.grpc.MethodDescriptor.<com.lum.network.icqueries.QueryPendingQueriesRequest, com.lum.network.icqueries.QueryPendingQueriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingQueries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.icqueries.QueryPendingQueriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.icqueries.QueryPendingQueriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("PendingQueries"))
              .build();
        }
      }
    }
    return getPendingQueriesMethod;
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
    default void queries(com.lum.network.icqueries.QueryQueriesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryQueriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueriesMethod(), responseObserver);
    }

    /**
     */
    default void pendingQueries(com.lum.network.icqueries.QueryPendingQueriesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryPendingQueriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingQueriesMethod(), responseObserver);
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
    public void queries(com.lum.network.icqueries.QueryQueriesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryQueriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pendingQueries(com.lum.network.icqueries.QueryPendingQueriesRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryPendingQueriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingQueriesMethod(), getCallOptions()), request, responseObserver);
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
    public com.lum.network.icqueries.QueryQueriesResponse queries(com.lum.network.icqueries.QueryQueriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.icqueries.QueryPendingQueriesResponse pendingQueries(com.lum.network.icqueries.QueryPendingQueriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingQueriesMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.icqueries.QueryQueriesResponse> queries(
        com.lum.network.icqueries.QueryQueriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.icqueries.QueryPendingQueriesResponse> pendingQueries(
        com.lum.network.icqueries.QueryPendingQueriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingQueriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERIES = 0;
  private static final int METHODID_PENDING_QUERIES = 1;

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
        case METHODID_QUERIES:
          serviceImpl.queries((com.lum.network.icqueries.QueryQueriesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryQueriesResponse>) responseObserver);
          break;
        case METHODID_PENDING_QUERIES:
          serviceImpl.pendingQueries((com.lum.network.icqueries.QueryPendingQueriesRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.icqueries.QueryPendingQueriesResponse>) responseObserver);
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
          getQueriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.icqueries.QueryQueriesRequest,
              com.lum.network.icqueries.QueryQueriesResponse>(
                service, METHODID_QUERIES)))
        .addMethod(
          getPendingQueriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.icqueries.QueryPendingQueriesRequest,
              com.lum.network.icqueries.QueryPendingQueriesResponse>(
                service, METHODID_PENDING_QUERIES)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.icqueries.QueryProto.getDescriptor();
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
              .addMethod(getQueriesMethod())
              .addMethod(getPendingQueriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
