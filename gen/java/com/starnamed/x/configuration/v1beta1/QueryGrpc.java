package com.starnamed.x.configuration.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: iov/configuration/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "starnamed.x.configuration.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest,
      com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> getConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Config",
      requestType = com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest.class,
      responseType = com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest,
      com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> getConfigMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest, com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> getConfigMethod;
    if ((getConfigMethod = QueryGrpc.getConfigMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConfigMethod = QueryGrpc.getConfigMethod) == null) {
          QueryGrpc.getConfigMethod = getConfigMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest, com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Config"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Config"))
              .build();
        }
      }
    }
    return getConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest,
      com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> getFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fees",
      requestType = com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest.class,
      responseType = com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest,
      com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> getFeesMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest, com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> getFeesMethod;
    if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
          QueryGrpc.getFeesMethod = getFeesMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest, com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fees"))
              .build();
        }
      }
    }
    return getFeesMethod;
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
     * Config gets starname configuration.
     * </pre>
     */
    default void config(com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fees gets starname product fees.
     * </pre>
     */
    default void fees(com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeesMethod(), responseObserver);
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
     * Config gets starname configuration.
     * </pre>
     */
    public void config(com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fees gets starname product fees.
     * </pre>
     */
    public void fees(com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request, responseObserver);
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
     * Config gets starname configuration.
     * </pre>
     */
    public com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse config(com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fees gets starname product fees.
     * </pre>
     */
    public com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse fees(com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeesMethod(), getCallOptions(), request);
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
     * Config gets starname configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse> config(
        com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fees gets starname product fees.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse> fees(
        com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIG = 0;
  private static final int METHODID_FEES = 1;

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
        case METHODID_CONFIG:
          serviceImpl.config((com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse>) responseObserver);
          break;
        case METHODID_FEES:
          serviceImpl.fees((com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse>) responseObserver);
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
          getConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigRequest,
              com.starnamed.x.configuration.v1beta1.QueryProto.QueryConfigResponse>(
                service, METHODID_CONFIG)))
        .addMethod(
          getFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesRequest,
              com.starnamed.x.configuration.v1beta1.QueryProto.QueryFeesResponse>(
                service, METHODID_FEES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.starnamed.x.configuration.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getConfigMethod())
              .addMethod(getFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
