package com.provenance.msgfees.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for marker module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/msgfees/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.msgfees.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryParamsRequest,
      com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.provenance.msgfees.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.provenance.msgfees.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryParamsRequest,
      com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryParamsRequest, com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.msgfees.v1.QueryProto.QueryParamsRequest, com.provenance.msgfees.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest,
      com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> getQueryAllMsgFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllMsgFees",
      requestType = com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest.class,
      responseType = com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest,
      com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> getQueryAllMsgFeesMethod() {
    io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest, com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> getQueryAllMsgFeesMethod;
    if ((getQueryAllMsgFeesMethod = QueryGrpc.getQueryAllMsgFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllMsgFeesMethod = QueryGrpc.getQueryAllMsgFeesMethod) == null) {
          QueryGrpc.getQueryAllMsgFeesMethod = getQueryAllMsgFeesMethod =
              io.grpc.MethodDescriptor.<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest, com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllMsgFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllMsgFees"))
              .build();
        }
      }
    }
    return getQueryAllMsgFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest,
      com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> getCalculateTxFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateTxFees",
      requestType = com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest.class,
      responseType = com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest,
      com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> getCalculateTxFeesMethod() {
    io.grpc.MethodDescriptor<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest, com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> getCalculateTxFeesMethod;
    if ((getCalculateTxFeesMethod = QueryGrpc.getCalculateTxFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCalculateTxFeesMethod = QueryGrpc.getCalculateTxFeesMethod) == null) {
          QueryGrpc.getCalculateTxFeesMethod = getCalculateTxFeesMethod =
              io.grpc.MethodDescriptor.<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest, com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateTxFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CalculateTxFees"))
              .build();
        }
      }
    }
    return getCalculateTxFeesMethod;
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
   * Query defines the gRPC querier service for marker module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries the parameters for x/msgfees
     * </pre>
     */
    default void params(com.provenance.msgfees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query all Msgs which have fees associated with them.
     * </pre>
     */
    default void queryAllMsgFees(com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllMsgFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CalculateTxFees simulates executing a transaction for estimating gas usage and additional fees.
     * </pre>
     */
    default void calculateTxFees(com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateTxFeesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters for x/msgfees
     * </pre>
     */
    public void params(com.provenance.msgfees.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query all Msgs which have fees associated with them.
     * </pre>
     */
    public void queryAllMsgFees(com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllMsgFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CalculateTxFees simulates executing a transaction for estimating gas usage and additional fees.
     * </pre>
     */
    public void calculateTxFees(com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateTxFeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters for x/msgfees
     * </pre>
     */
    public com.provenance.msgfees.v1.QueryProto.QueryParamsResponse params(com.provenance.msgfees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query all Msgs which have fees associated with them.
     * </pre>
     */
    public com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse queryAllMsgFees(com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllMsgFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CalculateTxFees simulates executing a transaction for estimating gas usage and additional fees.
     * </pre>
     */
    public com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse calculateTxFees(com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateTxFeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters for x/msgfees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.msgfees.v1.QueryProto.QueryParamsResponse> params(
        com.provenance.msgfees.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query all Msgs which have fees associated with them.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse> queryAllMsgFees(
        com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllMsgFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CalculateTxFees simulates executing a transaction for estimating gas usage and additional fees.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse> calculateTxFees(
        com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateTxFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_QUERY_ALL_MSG_FEES = 1;
  private static final int METHODID_CALCULATE_TX_FEES = 2;

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
          serviceImpl.params((com.provenance.msgfees.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_MSG_FEES:
          serviceImpl.queryAllMsgFees((com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_TX_FEES:
          serviceImpl.calculateTxFees((com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse>) responseObserver);
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
              com.provenance.msgfees.v1.QueryProto.QueryParamsRequest,
              com.provenance.msgfees.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryAllMsgFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesRequest,
              com.provenance.msgfees.v1.QueryProto.QueryAllMsgFeesResponse>(
                service, METHODID_QUERY_ALL_MSG_FEES)))
        .addMethod(
          getCalculateTxFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.msgfees.v1.QueryProto.CalculateTxFeesRequest,
              com.provenance.msgfees.v1.QueryProto.CalculateTxFeesResponse>(
                service, METHODID_CALCULATE_TX_FEES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.msgfees.v1.QueryProto.getDescriptor();
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
              .addMethod(getQueryAllMsgFeesMethod())
              .addMethod(getCalculateTxFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
