package com.em.buyback.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: em/buyback/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "em.buyback.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBalanceRequest,
      com.em.buyback.v1.QueryProto.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.em.buyback.v1.QueryProto.QueryBalanceRequest.class,
      responseType = com.em.buyback.v1.QueryProto.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBalanceRequest,
      com.em.buyback.v1.QueryProto.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBalanceRequest, com.em.buyback.v1.QueryProto.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<com.em.buyback.v1.QueryProto.QueryBalanceRequest, com.em.buyback.v1.QueryProto.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.buyback.v1.QueryProto.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.buyback.v1.QueryProto.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest,
      com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> getBuybackTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuybackTime",
      requestType = com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest.class,
      responseType = com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest,
      com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> getBuybackTimeMethod() {
    io.grpc.MethodDescriptor<com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest, com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> getBuybackTimeMethod;
    if ((getBuybackTimeMethod = QueryGrpc.getBuybackTimeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuybackTimeMethod = QueryGrpc.getBuybackTimeMethod) == null) {
          QueryGrpc.getBuybackTimeMethod = getBuybackTimeMethod =
              io.grpc.MethodDescriptor.<com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest, com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuybackTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuybackTime"))
              .build();
        }
      }
    }
    return getBuybackTimeMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * Query for the current buyback balance
     * </pre>
     */
    default void balance(com.em.buyback.v1.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query for buyback time periods
     * </pre>
     */
    default void buybackTime(com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest request,
        io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuybackTimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     * Query for the current buyback balance
     * </pre>
     */
    public void balance(com.em.buyback.v1.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query for buyback time periods
     * </pre>
     */
    public void buybackTime(com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest request,
        io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuybackTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     * Query for the current buyback balance
     * </pre>
     */
    public com.em.buyback.v1.QueryProto.QueryBalanceResponse balance(com.em.buyback.v1.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query for buyback time periods
     * </pre>
     */
    public com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse buybackTime(com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuybackTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     * Query for the current buyback balance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.buyback.v1.QueryProto.QueryBalanceResponse> balance(
        com.em.buyback.v1.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query for buyback time periods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse> buybackTime(
        com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuybackTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BALANCE = 0;
  private static final int METHODID_BUYBACK_TIME = 1;

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
        case METHODID_BALANCE:
          serviceImpl.balance((com.em.buyback.v1.QueryProto.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_BUYBACK_TIME:
          serviceImpl.buybackTime((com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse>) responseObserver);
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
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.buyback.v1.QueryProto.QueryBalanceRequest,
              com.em.buyback.v1.QueryProto.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getBuybackTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.buyback.v1.QueryProto.QueryBuybackTimeRequest,
              com.em.buyback.v1.QueryProto.QueryBuybackTimeResponse>(
                service, METHODID_BUYBACK_TIME)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.buyback.v1.QueryProto.getDescriptor();
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
              .addMethod(getBalanceMethod())
              .addMethod(getBuybackTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
