package com.juno.mint;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: juno/mint/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "juno.mint.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.juno.mint.QueryParamsRequest,
      com.juno.mint.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.juno.mint.QueryParamsRequest.class,
      responseType = com.juno.mint.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.mint.QueryParamsRequest,
      com.juno.mint.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.juno.mint.QueryParamsRequest, com.juno.mint.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.juno.mint.QueryParamsRequest, com.juno.mint.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.mint.QueryInflationRequest,
      com.juno.mint.QueryInflationResponse> getInflationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Inflation",
      requestType = com.juno.mint.QueryInflationRequest.class,
      responseType = com.juno.mint.QueryInflationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.mint.QueryInflationRequest,
      com.juno.mint.QueryInflationResponse> getInflationMethod() {
    io.grpc.MethodDescriptor<com.juno.mint.QueryInflationRequest, com.juno.mint.QueryInflationResponse> getInflationMethod;
    if ((getInflationMethod = QueryGrpc.getInflationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInflationMethod = QueryGrpc.getInflationMethod) == null) {
          QueryGrpc.getInflationMethod = getInflationMethod =
              io.grpc.MethodDescriptor.<com.juno.mint.QueryInflationRequest, com.juno.mint.QueryInflationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Inflation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryInflationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryInflationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Inflation"))
              .build();
        }
      }
    }
    return getInflationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.mint.QueryAnnualProvisionsRequest,
      com.juno.mint.QueryAnnualProvisionsResponse> getAnnualProvisionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnnualProvisions",
      requestType = com.juno.mint.QueryAnnualProvisionsRequest.class,
      responseType = com.juno.mint.QueryAnnualProvisionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.mint.QueryAnnualProvisionsRequest,
      com.juno.mint.QueryAnnualProvisionsResponse> getAnnualProvisionsMethod() {
    io.grpc.MethodDescriptor<com.juno.mint.QueryAnnualProvisionsRequest, com.juno.mint.QueryAnnualProvisionsResponse> getAnnualProvisionsMethod;
    if ((getAnnualProvisionsMethod = QueryGrpc.getAnnualProvisionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAnnualProvisionsMethod = QueryGrpc.getAnnualProvisionsMethod) == null) {
          QueryGrpc.getAnnualProvisionsMethod = getAnnualProvisionsMethod =
              io.grpc.MethodDescriptor.<com.juno.mint.QueryAnnualProvisionsRequest, com.juno.mint.QueryAnnualProvisionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnnualProvisions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryAnnualProvisionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.mint.QueryAnnualProvisionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AnnualProvisions"))
              .build();
        }
      }
    }
    return getAnnualProvisionsMethod;
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
     * Params returns the total set of minting parameters.
     * </pre>
     */
    default void params(com.juno.mint.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Inflation returns the current minting inflation value.
     * </pre>
     */
    default void inflation(com.juno.mint.QueryInflationRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryInflationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInflationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AnnualProvisions current minting annual provisions value.
     * </pre>
     */
    default void annualProvisions(com.juno.mint.QueryAnnualProvisionsRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryAnnualProvisionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnnualProvisionsMethod(), responseObserver);
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
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public void params(com.juno.mint.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Inflation returns the current minting inflation value.
     * </pre>
     */
    public void inflation(com.juno.mint.QueryInflationRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryInflationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInflationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AnnualProvisions current minting annual provisions value.
     * </pre>
     */
    public void annualProvisions(com.juno.mint.QueryAnnualProvisionsRequest request,
        io.grpc.stub.StreamObserver<com.juno.mint.QueryAnnualProvisionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnnualProvisionsMethod(), getCallOptions()), request, responseObserver);
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
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public com.juno.mint.QueryParamsResponse params(com.juno.mint.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Inflation returns the current minting inflation value.
     * </pre>
     */
    public com.juno.mint.QueryInflationResponse inflation(com.juno.mint.QueryInflationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInflationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AnnualProvisions current minting annual provisions value.
     * </pre>
     */
    public com.juno.mint.QueryAnnualProvisionsResponse annualProvisions(com.juno.mint.QueryAnnualProvisionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnnualProvisionsMethod(), getCallOptions(), request);
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
     * Params returns the total set of minting parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.mint.QueryParamsResponse> params(
        com.juno.mint.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Inflation returns the current minting inflation value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.mint.QueryInflationResponse> inflation(
        com.juno.mint.QueryInflationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInflationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AnnualProvisions current minting annual provisions value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.mint.QueryAnnualProvisionsResponse> annualProvisions(
        com.juno.mint.QueryAnnualProvisionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnnualProvisionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_INFLATION = 1;
  private static final int METHODID_ANNUAL_PROVISIONS = 2;

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
          serviceImpl.params((com.juno.mint.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.mint.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_INFLATION:
          serviceImpl.inflation((com.juno.mint.QueryInflationRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.mint.QueryInflationResponse>) responseObserver);
          break;
        case METHODID_ANNUAL_PROVISIONS:
          serviceImpl.annualProvisions((com.juno.mint.QueryAnnualProvisionsRequest) request,
              (io.grpc.stub.StreamObserver<com.juno.mint.QueryAnnualProvisionsResponse>) responseObserver);
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
              com.juno.mint.QueryParamsRequest,
              com.juno.mint.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getInflationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.mint.QueryInflationRequest,
              com.juno.mint.QueryInflationResponse>(
                service, METHODID_INFLATION)))
        .addMethod(
          getAnnualProvisionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.mint.QueryAnnualProvisionsRequest,
              com.juno.mint.QueryAnnualProvisionsResponse>(
                service, METHODID_ANNUAL_PROVISIONS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.juno.mint.QueryProto.getDescriptor();
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
              .addMethod(getInflationMethod())
              .addMethod(getAnnualProvisionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
