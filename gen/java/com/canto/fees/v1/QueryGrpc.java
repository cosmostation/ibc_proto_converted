package com.canto.fees.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: canto/fees/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "canto.fees.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeesRequest,
      com.canto.fees.v1.QueryProto.QueryFeesResponse> getFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fees",
      requestType = com.canto.fees.v1.QueryProto.QueryFeesRequest.class,
      responseType = com.canto.fees.v1.QueryProto.QueryFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeesRequest,
      com.canto.fees.v1.QueryProto.QueryFeesResponse> getFeesMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeesRequest, com.canto.fees.v1.QueryProto.QueryFeesResponse> getFeesMethod;
    if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeesMethod = QueryGrpc.getFeesMethod) == null) {
          QueryGrpc.getFeesMethod = getFeesMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.QueryProto.QueryFeesRequest, com.canto.fees.v1.QueryProto.QueryFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fees"))
              .build();
        }
      }
    }
    return getFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeeRequest,
      com.canto.fees.v1.QueryProto.QueryFeeResponse> getFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fee",
      requestType = com.canto.fees.v1.QueryProto.QueryFeeRequest.class,
      responseType = com.canto.fees.v1.QueryProto.QueryFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeeRequest,
      com.canto.fees.v1.QueryProto.QueryFeeResponse> getFeeMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryFeeRequest, com.canto.fees.v1.QueryProto.QueryFeeResponse> getFeeMethod;
    if ((getFeeMethod = QueryGrpc.getFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeMethod = QueryGrpc.getFeeMethod) == null) {
          QueryGrpc.getFeeMethod = getFeeMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.QueryProto.QueryFeeRequest, com.canto.fees.v1.QueryProto.QueryFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fee"))
              .build();
        }
      }
    }
    return getFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryParamsRequest,
      com.canto.fees.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.canto.fees.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.canto.fees.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryParamsRequest,
      com.canto.fees.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryParamsRequest, com.canto.fees.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.QueryProto.QueryParamsRequest, com.canto.fees.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest,
      com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> getDeployerFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployerFees",
      requestType = com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest.class,
      responseType = com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest,
      com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> getDeployerFeesMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest, com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> getDeployerFeesMethod;
    if ((getDeployerFeesMethod = QueryGrpc.getDeployerFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDeployerFeesMethod = QueryGrpc.getDeployerFeesMethod) == null) {
          QueryGrpc.getDeployerFeesMethod = getDeployerFeesMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest, com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployerFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DeployerFees"))
              .build();
        }
      }
    }
    return getDeployerFeesMethod;
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    default void fees(com.canto.fees.v1.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    default void fee(com.canto.fees.v1.QueryProto.QueryFeeRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    default void params(com.canto.fees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    default void deployerFees(com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployerFeesMethod(), responseObserver);
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public void fees(com.canto.fees.v1.QueryProto.QueryFeesRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public void fee(com.canto.fees.v1.QueryProto.QueryFeeRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public void params(com.canto.fees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public void deployerFees(com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployerFeesMethod(), getCallOptions()), request, responseObserver);
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public com.canto.fees.v1.QueryProto.QueryFeesResponse fees(com.canto.fees.v1.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public com.canto.fees.v1.QueryProto.QueryFeeResponse fee(com.canto.fees.v1.QueryProto.QueryFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public com.canto.fees.v1.QueryProto.QueryParamsResponse params(com.canto.fees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse deployerFees(com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployerFeesMethod(), getCallOptions(), request);
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
     * Fees retrieves all registered contracts for fee distribution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.QueryProto.QueryFeesResponse> fees(
        com.canto.fees.v1.QueryProto.QueryFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fee retrieves a registered contract for fee distribution for a given
     * address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.QueryProto.QueryFeeResponse> fee(
        com.canto.fees.v1.QueryProto.QueryFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the fees module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.QueryProto.QueryParamsResponse> params(
        com.canto.fees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeployerFees retrieves all contracts that a given deployer has registered
     * for fee distribution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse> deployerFees(
        com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployerFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEES = 0;
  private static final int METHODID_FEE = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_DEPLOYER_FEES = 3;

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
        case METHODID_FEES:
          serviceImpl.fees((com.canto.fees.v1.QueryProto.QueryFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeesResponse>) responseObserver);
          break;
        case METHODID_FEE:
          serviceImpl.fee((com.canto.fees.v1.QueryProto.QueryFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryFeeResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.canto.fees.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPLOYER_FEES:
          serviceImpl.deployerFees((com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse>) responseObserver);
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
          getFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.QueryProto.QueryFeesRequest,
              com.canto.fees.v1.QueryProto.QueryFeesResponse>(
                service, METHODID_FEES)))
        .addMethod(
          getFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.QueryProto.QueryFeeRequest,
              com.canto.fees.v1.QueryProto.QueryFeeResponse>(
                service, METHODID_FEE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.QueryProto.QueryParamsRequest,
              com.canto.fees.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDeployerFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.QueryProto.QueryDeployerFeesRequest,
              com.canto.fees.v1.QueryProto.QueryDeployerFeesResponse>(
                service, METHODID_DEPLOYER_FEES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.fees.v1.QueryProto.getDescriptor();
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
              .addMethod(getFeesMethod())
              .addMethod(getFeeMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDeployerFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
