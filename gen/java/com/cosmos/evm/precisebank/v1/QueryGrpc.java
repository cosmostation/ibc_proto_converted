package com.cosmos.evm.precisebank.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for precisebank module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/evm/precisebank/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.evm.precisebank.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest,
      com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> getRemainderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remainder",
      requestType = com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest.class,
      responseType = com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest,
      com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> getRemainderMethod() {
    io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest, com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> getRemainderMethod;
    if ((getRemainderMethod = QueryGrpc.getRemainderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRemainderMethod = QueryGrpc.getRemainderMethod) == null) {
          QueryGrpc.getRemainderMethod = getRemainderMethod =
              io.grpc.MethodDescriptor.<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest, com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remainder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Remainder"))
              .build();
        }
      }
    }
    return getRemainderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest,
      com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> getFractionalBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FractionalBalance",
      requestType = com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest.class,
      responseType = com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest,
      com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> getFractionalBalanceMethod() {
    io.grpc.MethodDescriptor<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest, com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> getFractionalBalanceMethod;
    if ((getFractionalBalanceMethod = QueryGrpc.getFractionalBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFractionalBalanceMethod = QueryGrpc.getFractionalBalanceMethod) == null) {
          QueryGrpc.getFractionalBalanceMethod = getFractionalBalanceMethod =
              io.grpc.MethodDescriptor.<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest, com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FractionalBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FractionalBalance"))
              .build();
        }
      }
    }
    return getFractionalBalanceMethod;
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
   * Query defines the gRPC querier service for precisebank module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Remainder returns the amount backed by the reserve, but not yet owned by
     * any account, i.e. not in circulation.
     * </pre>
     */
    default void remainder(com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemainderMethod(), responseObserver);
    }

    /**
     * <pre>
     * FractionalBalance returns only the fractional balance of an address. This
     * does not include any integer balance.
     * </pre>
     */
    default void fractionalBalance(com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFractionalBalanceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for precisebank module
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
   * Query defines the gRPC querier service for precisebank module
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
     * Remainder returns the amount backed by the reserve, but not yet owned by
     * any account, i.e. not in circulation.
     * </pre>
     */
    public void remainder(com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemainderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FractionalBalance returns only the fractional balance of an address. This
     * does not include any integer balance.
     * </pre>
     */
    public void fractionalBalance(com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFractionalBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for precisebank module
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
     * Remainder returns the amount backed by the reserve, but not yet owned by
     * any account, i.e. not in circulation.
     * </pre>
     */
    public com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse remainder(com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemainderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FractionalBalance returns only the fractional balance of an address. This
     * does not include any integer balance.
     * </pre>
     */
    public com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse fractionalBalance(com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFractionalBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for precisebank module
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
     * Remainder returns the amount backed by the reserve, but not yet owned by
     * any account, i.e. not in circulation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse> remainder(
        com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemainderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FractionalBalance returns only the fractional balance of an address. This
     * does not include any integer balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse> fractionalBalance(
        com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFractionalBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMAINDER = 0;
  private static final int METHODID_FRACTIONAL_BALANCE = 1;

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
        case METHODID_REMAINDER:
          serviceImpl.remainder((com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse>) responseObserver);
          break;
        case METHODID_FRACTIONAL_BALANCE:
          serviceImpl.fractionalBalance((com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse>) responseObserver);
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
          getRemainderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderRequest,
              com.cosmos.evm.precisebank.v1.QueryProto.QueryRemainderResponse>(
                service, METHODID_REMAINDER)))
        .addMethod(
          getFractionalBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceRequest,
              com.cosmos.evm.precisebank.v1.QueryProto.QueryFractionalBalanceResponse>(
                service, METHODID_FRACTIONAL_BALANCE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.evm.precisebank.v1.QueryProto.getDescriptor();
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
              .addMethod(getRemainderMethod())
              .addMethod(getFractionalBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
