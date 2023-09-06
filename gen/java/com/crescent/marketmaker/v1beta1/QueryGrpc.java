package com.crescent.marketmaker.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC query service for the marketmaker module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/marketmaker/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.marketmaker.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> getMarketMakersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketMakers",
      requestType = com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest.class,
      responseType = com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> getMarketMakersMethod() {
    io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> getMarketMakersMethod;
    if ((getMarketMakersMethod = QueryGrpc.getMarketMakersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketMakersMethod = QueryGrpc.getMarketMakersMethod) == null) {
          QueryGrpc.getMarketMakersMethod = getMarketMakersMethod =
              io.grpc.MethodDescriptor.<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketMakers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketMakers"))
              .build();
        }
      }
    }
    return getMarketMakersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> getIncentiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Incentive",
      requestType = com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest.class,
      responseType = com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest,
      com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> getIncentiveMethod() {
    io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> getIncentiveMethod;
    if ((getIncentiveMethod = QueryGrpc.getIncentiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentiveMethod = QueryGrpc.getIncentiveMethod) == null) {
          QueryGrpc.getIncentiveMethod = getIncentiveMethod =
              io.grpc.MethodDescriptor.<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest, com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Incentive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Incentive"))
              .build();
        }
      }
    }
    return getIncentiveMethod;
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
   * Query defines the gRPC query service for the marketmaker module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns parameters of the marketmaker module.
     * </pre>
     */
    default void params(com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketMakers returns all market makers.
     * </pre>
     */
    default void marketMakers(com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketMakersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Incentive returns a specific incentive.
     * </pre>
     */
    default void incentive(com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC query service for the marketmaker module.
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
   * Query defines the gRPC query service for the marketmaker module.
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
     * Params returns parameters of the marketmaker module.
     * </pre>
     */
    public void params(com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketMakers returns all market makers.
     * </pre>
     */
    public void marketMakers(com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketMakersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Incentive returns a specific incentive.
     * </pre>
     */
    public void incentive(com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the marketmaker module.
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
     * Params returns parameters of the marketmaker module.
     * </pre>
     */
    public com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse params(com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketMakers returns all market makers.
     * </pre>
     */
    public com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse marketMakers(com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketMakersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Incentive returns a specific incentive.
     * </pre>
     */
    public com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse incentive(com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC query service for the marketmaker module.
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
     * Params returns parameters of the marketmaker module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse> params(
        com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketMakers returns all market makers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse> marketMakers(
        com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketMakersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Incentive returns a specific incentive.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse> incentive(
        com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_MARKET_MAKERS = 1;
  private static final int METHODID_INCENTIVE = 2;

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
          serviceImpl.params((com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_MARKET_MAKERS:
          serviceImpl.marketMakers((com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse>) responseObserver);
          break;
        case METHODID_INCENTIVE:
          serviceImpl.incentive((com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse>) responseObserver);
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
              com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsRequest,
              com.crescent.marketmaker.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getMarketMakersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersRequest,
              com.crescent.marketmaker.v1beta1.QueryProto.QueryMarketMakersResponse>(
                service, METHODID_MARKET_MAKERS)))
        .addMethod(
          getIncentiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveRequest,
              com.crescent.marketmaker.v1beta1.QueryProto.QueryIncentiveResponse>(
                service, METHODID_INCENTIVE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.marketmaker.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getMarketMakersMethod())
              .addMethod(getIncentiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
