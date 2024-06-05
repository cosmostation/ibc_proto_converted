package com.feemarket.feemarket.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query Service for the feemarket module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: feemarket/feemarket/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "feemarket.feemarket.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.ParamsRequest,
      com.feemarket.feemarket.v1.QueryProto.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.feemarket.feemarket.v1.QueryProto.ParamsRequest.class,
      responseType = com.feemarket.feemarket.v1.QueryProto.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.ParamsRequest,
      com.feemarket.feemarket.v1.QueryProto.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.ParamsRequest, com.feemarket.feemarket.v1.QueryProto.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.feemarket.feemarket.v1.QueryProto.ParamsRequest, com.feemarket.feemarket.v1.QueryProto.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.StateRequest,
      com.feemarket.feemarket.v1.QueryProto.StateResponse> getStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "State",
      requestType = com.feemarket.feemarket.v1.QueryProto.StateRequest.class,
      responseType = com.feemarket.feemarket.v1.QueryProto.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.StateRequest,
      com.feemarket.feemarket.v1.QueryProto.StateResponse> getStateMethod() {
    io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.StateRequest, com.feemarket.feemarket.v1.QueryProto.StateResponse> getStateMethod;
    if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStateMethod = QueryGrpc.getStateMethod) == null) {
          QueryGrpc.getStateMethod = getStateMethod =
              io.grpc.MethodDescriptor.<com.feemarket.feemarket.v1.QueryProto.StateRequest, com.feemarket.feemarket.v1.QueryProto.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "State"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.StateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("State"))
              .build();
        }
      }
    }
    return getStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest,
      com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> getBaseFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseFee",
      requestType = com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest.class,
      responseType = com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest,
      com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> getBaseFeeMethod() {
    io.grpc.MethodDescriptor<com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest, com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> getBaseFeeMethod;
    if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBaseFeeMethod = QueryGrpc.getBaseFeeMethod) == null) {
          QueryGrpc.getBaseFeeMethod = getBaseFeeMethod =
              io.grpc.MethodDescriptor.<com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest, com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BaseFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BaseFee"))
              .build();
        }
      }
    }
    return getBaseFeeMethod;
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
   * Query Service for the feemarket module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns the current feemarket module parameters.
     * </pre>
     */
    default void params(com.feemarket.feemarket.v1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * State returns the current feemarket module state.
     * </pre>
     */
    default void state(com.feemarket.feemarket.v1.QueryProto.StateRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.StateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * BaseFee returns the current feemarket module base fee.
     * </pre>
     */
    default void baseFee(com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBaseFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query Service for the feemarket module.
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
   * Query Service for the feemarket module.
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
     * Params returns the current feemarket module parameters.
     * </pre>
     */
    public void params(com.feemarket.feemarket.v1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * State returns the current feemarket module state.
     * </pre>
     */
    public void state(com.feemarket.feemarket.v1.QueryProto.StateRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.StateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BaseFee returns the current feemarket module base fee.
     * </pre>
     */
    public void baseFee(com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query Service for the feemarket module.
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
     * Params returns the current feemarket module parameters.
     * </pre>
     */
    public com.feemarket.feemarket.v1.QueryProto.ParamsResponse params(com.feemarket.feemarket.v1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * State returns the current feemarket module state.
     * </pre>
     */
    public com.feemarket.feemarket.v1.QueryProto.StateResponse state(com.feemarket.feemarket.v1.QueryProto.StateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BaseFee returns the current feemarket module base fee.
     * </pre>
     */
    public com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse baseFee(com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBaseFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query Service for the feemarket module.
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
     * Params returns the current feemarket module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feemarket.feemarket.v1.QueryProto.ParamsResponse> params(
        com.feemarket.feemarket.v1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * State returns the current feemarket module state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feemarket.feemarket.v1.QueryProto.StateResponse> state(
        com.feemarket.feemarket.v1.QueryProto.StateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BaseFee returns the current feemarket module base fee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse> baseFee(
        com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBaseFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_STATE = 1;
  private static final int METHODID_BASE_FEE = 2;

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
          serviceImpl.params((com.feemarket.feemarket.v1.QueryProto.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.ParamsResponse>) responseObserver);
          break;
        case METHODID_STATE:
          serviceImpl.state((com.feemarket.feemarket.v1.QueryProto.StateRequest) request,
              (io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.StateResponse>) responseObserver);
          break;
        case METHODID_BASE_FEE:
          serviceImpl.baseFee((com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse>) responseObserver);
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
              com.feemarket.feemarket.v1.QueryProto.ParamsRequest,
              com.feemarket.feemarket.v1.QueryProto.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.feemarket.feemarket.v1.QueryProto.StateRequest,
              com.feemarket.feemarket.v1.QueryProto.StateResponse>(
                service, METHODID_STATE)))
        .addMethod(
          getBaseFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.feemarket.feemarket.v1.QueryProto.BaseFeeRequest,
              com.feemarket.feemarket.v1.QueryProto.BaseFeeResponse>(
                service, METHODID_BASE_FEE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.feemarket.feemarket.v1.QueryProto.getDescriptor();
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
              .addMethod(getStateMethod())
              .addMethod(getBaseFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
