package com.em.authority.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: em/authority/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "em.authority.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryGasPricesRequest,
      com.em.authority.v1.QueryProto.QueryGasPricesResponse> getGasPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GasPrices",
      requestType = com.em.authority.v1.QueryProto.QueryGasPricesRequest.class,
      responseType = com.em.authority.v1.QueryProto.QueryGasPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryGasPricesRequest,
      com.em.authority.v1.QueryProto.QueryGasPricesResponse> getGasPricesMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryGasPricesRequest, com.em.authority.v1.QueryProto.QueryGasPricesResponse> getGasPricesMethod;
    if ((getGasPricesMethod = QueryGrpc.getGasPricesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGasPricesMethod = QueryGrpc.getGasPricesMethod) == null) {
          QueryGrpc.getGasPricesMethod = getGasPricesMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.QueryProto.QueryGasPricesRequest, com.em.authority.v1.QueryProto.QueryGasPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GasPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.QueryProto.QueryGasPricesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.QueryProto.QueryGasPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GasPrices"))
              .build();
        }
      }
    }
    return getGasPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryUpgradePlanRequest,
      com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> getUpgradePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradePlan",
      requestType = com.em.authority.v1.QueryProto.QueryUpgradePlanRequest.class,
      responseType = com.em.authority.v1.QueryProto.QueryUpgradePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryUpgradePlanRequest,
      com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> getUpgradePlanMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.QueryProto.QueryUpgradePlanRequest, com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> getUpgradePlanMethod;
    if ((getUpgradePlanMethod = QueryGrpc.getUpgradePlanMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpgradePlanMethod = QueryGrpc.getUpgradePlanMethod) == null) {
          QueryGrpc.getUpgradePlanMethod = getUpgradePlanMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.QueryProto.QueryUpgradePlanRequest, com.em.authority.v1.QueryProto.QueryUpgradePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.QueryProto.QueryUpgradePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.QueryProto.QueryUpgradePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpgradePlan"))
              .build();
        }
      }
    }
    return getUpgradePlanMethod;
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
     */
    default void gasPrices(com.em.authority.v1.QueryProto.QueryGasPricesRequest request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryGasPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGasPricesMethod(), responseObserver);
    }

    /**
     */
    default void upgradePlan(com.em.authority.v1.QueryProto.QueryUpgradePlanRequest request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpgradePlanMethod(), responseObserver);
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
     */
    public void gasPrices(com.em.authority.v1.QueryProto.QueryGasPricesRequest request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryGasPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGasPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upgradePlan(com.em.authority.v1.QueryProto.QueryUpgradePlanRequest request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpgradePlanMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.em.authority.v1.QueryProto.QueryGasPricesResponse gasPrices(com.em.authority.v1.QueryProto.QueryGasPricesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGasPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.QueryProto.QueryUpgradePlanResponse upgradePlan(com.em.authority.v1.QueryProto.QueryUpgradePlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradePlanMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.QueryProto.QueryGasPricesResponse> gasPrices(
        com.em.authority.v1.QueryProto.QueryGasPricesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGasPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.QueryProto.QueryUpgradePlanResponse> upgradePlan(
        com.em.authority.v1.QueryProto.QueryUpgradePlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpgradePlanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GAS_PRICES = 0;
  private static final int METHODID_UPGRADE_PLAN = 1;

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
        case METHODID_GAS_PRICES:
          serviceImpl.gasPrices((com.em.authority.v1.QueryProto.QueryGasPricesRequest) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryGasPricesResponse>) responseObserver);
          break;
        case METHODID_UPGRADE_PLAN:
          serviceImpl.upgradePlan((com.em.authority.v1.QueryProto.QueryUpgradePlanRequest) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.QueryProto.QueryUpgradePlanResponse>) responseObserver);
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
          getGasPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.QueryProto.QueryGasPricesRequest,
              com.em.authority.v1.QueryProto.QueryGasPricesResponse>(
                service, METHODID_GAS_PRICES)))
        .addMethod(
          getUpgradePlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.QueryProto.QueryUpgradePlanRequest,
              com.em.authority.v1.QueryProto.QueryUpgradePlanResponse>(
                service, METHODID_UPGRADE_PLAN)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.authority.v1.QueryProto.getDescriptor();
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
              .addMethod(getGasPricesMethod())
              .addMethod(getUpgradePlanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
