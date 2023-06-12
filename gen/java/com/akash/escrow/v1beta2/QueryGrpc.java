package com.akash.escrow.v1beta2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/escrow/v1beta2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "akash.escrow.v1beta2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryAccountsRequest,
      com.akash.escrow.v1beta2.QueryAccountsResponse> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Accounts",
      requestType = com.akash.escrow.v1beta2.QueryAccountsRequest.class,
      responseType = com.akash.escrow.v1beta2.QueryAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryAccountsRequest,
      com.akash.escrow.v1beta2.QueryAccountsResponse> getAccountsMethod() {
    io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryAccountsRequest, com.akash.escrow.v1beta2.QueryAccountsResponse> getAccountsMethod;
    if ((getAccountsMethod = QueryGrpc.getAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountsMethod = QueryGrpc.getAccountsMethod) == null) {
          QueryGrpc.getAccountsMethod = getAccountsMethod =
              io.grpc.MethodDescriptor.<com.akash.escrow.v1beta2.QueryAccountsRequest, com.akash.escrow.v1beta2.QueryAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.escrow.v1beta2.QueryAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.escrow.v1beta2.QueryAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Accounts"))
              .build();
        }
      }
    }
    return getAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryPaymentsRequest,
      com.akash.escrow.v1beta2.QueryPaymentsResponse> getPaymentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Payments",
      requestType = com.akash.escrow.v1beta2.QueryPaymentsRequest.class,
      responseType = com.akash.escrow.v1beta2.QueryPaymentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryPaymentsRequest,
      com.akash.escrow.v1beta2.QueryPaymentsResponse> getPaymentsMethod() {
    io.grpc.MethodDescriptor<com.akash.escrow.v1beta2.QueryPaymentsRequest, com.akash.escrow.v1beta2.QueryPaymentsResponse> getPaymentsMethod;
    if ((getPaymentsMethod = QueryGrpc.getPaymentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPaymentsMethod = QueryGrpc.getPaymentsMethod) == null) {
          QueryGrpc.getPaymentsMethod = getPaymentsMethod =
              io.grpc.MethodDescriptor.<com.akash.escrow.v1beta2.QueryPaymentsRequest, com.akash.escrow.v1beta2.QueryPaymentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Payments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.escrow.v1beta2.QueryPaymentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.escrow.v1beta2.QueryPaymentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Payments"))
              .build();
        }
      }
    }
    return getPaymentsMethod;
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
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Accounts queries all accounts
     * </pre>
     */
    default void accounts(com.akash.escrow.v1beta2.QueryAccountsRequest request,
        io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Payments queries all payments
     * </pre>
     */
    default void payments(com.akash.escrow.v1beta2.QueryPaymentsRequest request,
        io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryPaymentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPaymentsMethod(), responseObserver);
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
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Accounts queries all accounts
     * </pre>
     */
    public void accounts(com.akash.escrow.v1beta2.QueryAccountsRequest request,
        io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Payments queries all payments
     * </pre>
     */
    public void payments(com.akash.escrow.v1beta2.QueryPaymentsRequest request,
        io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryPaymentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPaymentsMethod(), getCallOptions()), request, responseObserver);
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
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Accounts queries all accounts
     * </pre>
     */
    public com.akash.escrow.v1beta2.QueryAccountsResponse accounts(com.akash.escrow.v1beta2.QueryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Payments queries all payments
     * </pre>
     */
    public com.akash.escrow.v1beta2.QueryPaymentsResponse payments(com.akash.escrow.v1beta2.QueryPaymentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPaymentsMethod(), getCallOptions(), request);
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
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Accounts queries all accounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.escrow.v1beta2.QueryAccountsResponse> accounts(
        com.akash.escrow.v1beta2.QueryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * Payments queries all payments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.escrow.v1beta2.QueryPaymentsResponse> payments(
        com.akash.escrow.v1beta2.QueryPaymentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPaymentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNTS = 0;
  private static final int METHODID_PAYMENTS = 1;

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
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((com.akash.escrow.v1beta2.QueryAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryAccountsResponse>) responseObserver);
          break;
        case METHODID_PAYMENTS:
          serviceImpl.payments((com.akash.escrow.v1beta2.QueryPaymentsRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.escrow.v1beta2.QueryPaymentsResponse>) responseObserver);
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
          getAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.escrow.v1beta2.QueryAccountsRequest,
              com.akash.escrow.v1beta2.QueryAccountsResponse>(
                service, METHODID_ACCOUNTS)))
        .addMethod(
          getPaymentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.escrow.v1beta2.QueryPaymentsRequest,
              com.akash.escrow.v1beta2.QueryPaymentsResponse>(
                service, METHODID_PAYMENTS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.escrow.v1beta2.QueryProto.getDescriptor();
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
              .addMethod(getAccountsMethod())
              .addMethod(getPaymentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
