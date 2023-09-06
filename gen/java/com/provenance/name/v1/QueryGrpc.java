package com.provenance.name.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for distribution module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/name/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.name.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryParamsRequest,
      com.provenance.name.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.provenance.name.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.provenance.name.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryParamsRequest,
      com.provenance.name.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryParamsRequest, com.provenance.name.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.QueryProto.QueryParamsRequest, com.provenance.name.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryResolveRequest,
      com.provenance.name.v1.QueryProto.QueryResolveResponse> getResolveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resolve",
      requestType = com.provenance.name.v1.QueryProto.QueryResolveRequest.class,
      responseType = com.provenance.name.v1.QueryProto.QueryResolveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryResolveRequest,
      com.provenance.name.v1.QueryProto.QueryResolveResponse> getResolveMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryResolveRequest, com.provenance.name.v1.QueryProto.QueryResolveResponse> getResolveMethod;
    if ((getResolveMethod = QueryGrpc.getResolveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResolveMethod = QueryGrpc.getResolveMethod) == null) {
          QueryGrpc.getResolveMethod = getResolveMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.QueryProto.QueryResolveRequest, com.provenance.name.v1.QueryProto.QueryResolveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resolve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryResolveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryResolveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Resolve"))
              .build();
        }
      }
    }
    return getResolveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryReverseLookupRequest,
      com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> getReverseLookupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReverseLookup",
      requestType = com.provenance.name.v1.QueryProto.QueryReverseLookupRequest.class,
      responseType = com.provenance.name.v1.QueryProto.QueryReverseLookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryReverseLookupRequest,
      com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> getReverseLookupMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.QueryProto.QueryReverseLookupRequest, com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> getReverseLookupMethod;
    if ((getReverseLookupMethod = QueryGrpc.getReverseLookupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReverseLookupMethod = QueryGrpc.getReverseLookupMethod) == null) {
          QueryGrpc.getReverseLookupMethod = getReverseLookupMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.QueryProto.QueryReverseLookupRequest, com.provenance.name.v1.QueryProto.QueryReverseLookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReverseLookup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryReverseLookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.QueryProto.QueryReverseLookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ReverseLookup"))
              .build();
        }
      }
    }
    return getReverseLookupMethod;
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
   * Query defines the gRPC querier service for distribution module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries params of the name module.
     * </pre>
     */
    default void params(com.provenance.name.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resolve queries for the address associated with a given name
     * </pre>
     */
    default void resolve(com.provenance.name.v1.QueryProto.QueryResolveRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryResolveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReverseLookup queries for all names bound against a given address
     * </pre>
     */
    default void reverseLookup(com.provenance.name.v1.QueryProto.QueryReverseLookupRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReverseLookupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the name module.
     * </pre>
     */
    public void params(com.provenance.name.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resolve queries for the address associated with a given name
     * </pre>
     */
    public void resolve(com.provenance.name.v1.QueryProto.QueryResolveRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryResolveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReverseLookup queries for all names bound against a given address
     * </pre>
     */
    public void reverseLookup(com.provenance.name.v1.QueryProto.QueryReverseLookupRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReverseLookupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the name module.
     * </pre>
     */
    public com.provenance.name.v1.QueryProto.QueryParamsResponse params(com.provenance.name.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resolve queries for the address associated with a given name
     * </pre>
     */
    public com.provenance.name.v1.QueryProto.QueryResolveResponse resolve(com.provenance.name.v1.QueryProto.QueryResolveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReverseLookup queries for all names bound against a given address
     * </pre>
     */
    public com.provenance.name.v1.QueryProto.QueryReverseLookupResponse reverseLookup(com.provenance.name.v1.QueryProto.QueryReverseLookupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReverseLookupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for distribution module.
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
     * Params queries params of the name module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.QueryProto.QueryParamsResponse> params(
        com.provenance.name.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resolve queries for the address associated with a given name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.QueryProto.QueryResolveResponse> resolve(
        com.provenance.name.v1.QueryProto.QueryResolveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReverseLookup queries for all names bound against a given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.QueryProto.QueryReverseLookupResponse> reverseLookup(
        com.provenance.name.v1.QueryProto.QueryReverseLookupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReverseLookupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_RESOLVE = 1;
  private static final int METHODID_REVERSE_LOOKUP = 2;

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
          serviceImpl.params((com.provenance.name.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_RESOLVE:
          serviceImpl.resolve((com.provenance.name.v1.QueryProto.QueryResolveRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryResolveResponse>) responseObserver);
          break;
        case METHODID_REVERSE_LOOKUP:
          serviceImpl.reverseLookup((com.provenance.name.v1.QueryProto.QueryReverseLookupRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.QueryProto.QueryReverseLookupResponse>) responseObserver);
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
              com.provenance.name.v1.QueryProto.QueryParamsRequest,
              com.provenance.name.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getResolveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.QueryProto.QueryResolveRequest,
              com.provenance.name.v1.QueryProto.QueryResolveResponse>(
                service, METHODID_RESOLVE)))
        .addMethod(
          getReverseLookupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.QueryProto.QueryReverseLookupRequest,
              com.provenance.name.v1.QueryProto.QueryReverseLookupResponse>(
                service, METHODID_REVERSE_LOOKUP)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.name.v1.QueryProto.getDescriptor();
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
    private final java.lang.String methodName;

    QueryMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getResolveMethod())
              .addMethod(getReverseLookupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
