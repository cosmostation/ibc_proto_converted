package com.canto.inflation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: canto/inflation/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "canto.inflation.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryPeriodRequest,
      com.canto.inflation.v1.QueryProto.QueryPeriodResponse> getPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Period",
      requestType = com.canto.inflation.v1.QueryProto.QueryPeriodRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QueryPeriodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryPeriodRequest,
      com.canto.inflation.v1.QueryProto.QueryPeriodResponse> getPeriodMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryPeriodRequest, com.canto.inflation.v1.QueryProto.QueryPeriodResponse> getPeriodMethod;
    if ((getPeriodMethod = QueryGrpc.getPeriodMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPeriodMethod = QueryGrpc.getPeriodMethod) == null) {
          QueryGrpc.getPeriodMethod = getPeriodMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QueryPeriodRequest, com.canto.inflation.v1.QueryProto.QueryPeriodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Period"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryPeriodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryPeriodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Period"))
              .build();
        }
      }
    }
    return getPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest,
      com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EpochMintProvision",
      requestType = com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest,
      com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest, com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> getEpochMintProvisionMethod;
    if ((getEpochMintProvisionMethod = QueryGrpc.getEpochMintProvisionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEpochMintProvisionMethod = QueryGrpc.getEpochMintProvisionMethod) == null) {
          QueryGrpc.getEpochMintProvisionMethod = getEpochMintProvisionMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest, com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EpochMintProvision"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EpochMintProvision"))
              .build();
        }
      }
    }
    return getEpochMintProvisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest,
      com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> getSkippedEpochsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SkippedEpochs",
      requestType = com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest,
      com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> getSkippedEpochsMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest, com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> getSkippedEpochsMethod;
    if ((getSkippedEpochsMethod = QueryGrpc.getSkippedEpochsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSkippedEpochsMethod = QueryGrpc.getSkippedEpochsMethod) == null) {
          QueryGrpc.getSkippedEpochsMethod = getSkippedEpochsMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest, com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SkippedEpochs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SkippedEpochs"))
              .build();
        }
      }
    }
    return getSkippedEpochsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest,
      com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CirculatingSupply",
      requestType = com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest,
      com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest, com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> getCirculatingSupplyMethod;
    if ((getCirculatingSupplyMethod = QueryGrpc.getCirculatingSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCirculatingSupplyMethod = QueryGrpc.getCirculatingSupplyMethod) == null) {
          QueryGrpc.getCirculatingSupplyMethod = getCirculatingSupplyMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest, com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CirculatingSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CirculatingSupply"))
              .build();
        }
      }
    }
    return getCirculatingSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryInflationRateRequest,
      com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> getInflationRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InflationRate",
      requestType = com.canto.inflation.v1.QueryProto.QueryInflationRateRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QueryInflationRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryInflationRateRequest,
      com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> getInflationRateMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryInflationRateRequest, com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> getInflationRateMethod;
    if ((getInflationRateMethod = QueryGrpc.getInflationRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInflationRateMethod = QueryGrpc.getInflationRateMethod) == null) {
          QueryGrpc.getInflationRateMethod = getInflationRateMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QueryInflationRateRequest, com.canto.inflation.v1.QueryProto.QueryInflationRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InflationRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryInflationRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryInflationRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InflationRate"))
              .build();
        }
      }
    }
    return getInflationRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryParamsRequest,
      com.canto.inflation.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.canto.inflation.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.canto.inflation.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryParamsRequest,
      com.canto.inflation.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.canto.inflation.v1.QueryProto.QueryParamsRequest, com.canto.inflation.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.canto.inflation.v1.QueryProto.QueryParamsRequest, com.canto.inflation.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.inflation.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
     * Period retrieves current period.
     * </pre>
     */
    default void period(com.canto.inflation.v1.QueryProto.QueryPeriodRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryPeriodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPeriodMethod(), responseObserver);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    default void epochMintProvision(com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEpochMintProvisionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    default void skippedEpochs(com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSkippedEpochsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    default void circulatingSupply(com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCirculatingSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    default void inflationRate(com.canto.inflation.v1.QueryProto.QueryInflationRateRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInflationRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    default void params(com.canto.inflation.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
     * Period retrieves current period.
     * </pre>
     */
    public void period(com.canto.inflation.v1.QueryProto.QueryPeriodRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryPeriodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPeriodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public void epochMintProvision(com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEpochMintProvisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public void skippedEpochs(com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSkippedEpochsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public void circulatingSupply(com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCirculatingSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public void inflationRate(com.canto.inflation.v1.QueryProto.QueryInflationRateRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInflationRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public void params(com.canto.inflation.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
     * Period retrieves current period.
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QueryPeriodResponse period(com.canto.inflation.v1.QueryProto.QueryPeriodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPeriodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse epochMintProvision(com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEpochMintProvisionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse skippedEpochs(com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSkippedEpochsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse circulatingSupply(com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCirculatingSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QueryInflationRateResponse inflationRate(com.canto.inflation.v1.QueryProto.QueryInflationRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInflationRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public com.canto.inflation.v1.QueryProto.QueryParamsResponse params(com.canto.inflation.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
     * Period retrieves current period.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QueryPeriodResponse> period(
        com.canto.inflation.v1.QueryProto.QueryPeriodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPeriodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EpochMintProvision retrieves current minting epoch provision value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse> epochMintProvision(
        com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEpochMintProvisionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SkippedEpochs retrieves the total number of skipped epochs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse> skippedEpochs(
        com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSkippedEpochsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CirculatingSupply retrieves the total number of tokens that are in
     * circulation (i.e. excluding unvested tokens).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse> circulatingSupply(
        com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCirculatingSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InflationRate retrieves the inflation rate of the current period.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QueryInflationRateResponse> inflationRate(
        com.canto.inflation.v1.QueryProto.QueryInflationRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInflationRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the total set of minting parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.inflation.v1.QueryProto.QueryParamsResponse> params(
        com.canto.inflation.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PERIOD = 0;
  private static final int METHODID_EPOCH_MINT_PROVISION = 1;
  private static final int METHODID_SKIPPED_EPOCHS = 2;
  private static final int METHODID_CIRCULATING_SUPPLY = 3;
  private static final int METHODID_INFLATION_RATE = 4;
  private static final int METHODID_PARAMS = 5;

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
        case METHODID_PERIOD:
          serviceImpl.period((com.canto.inflation.v1.QueryProto.QueryPeriodRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryPeriodResponse>) responseObserver);
          break;
        case METHODID_EPOCH_MINT_PROVISION:
          serviceImpl.epochMintProvision((com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse>) responseObserver);
          break;
        case METHODID_SKIPPED_EPOCHS:
          serviceImpl.skippedEpochs((com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse>) responseObserver);
          break;
        case METHODID_CIRCULATING_SUPPLY:
          serviceImpl.circulatingSupply((com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse>) responseObserver);
          break;
        case METHODID_INFLATION_RATE:
          serviceImpl.inflationRate((com.canto.inflation.v1.QueryProto.QueryInflationRateRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryInflationRateResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.canto.inflation.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.inflation.v1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getPeriodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QueryPeriodRequest,
              com.canto.inflation.v1.QueryProto.QueryPeriodResponse>(
                service, METHODID_PERIOD)))
        .addMethod(
          getEpochMintProvisionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionRequest,
              com.canto.inflation.v1.QueryProto.QueryEpochMintProvisionResponse>(
                service, METHODID_EPOCH_MINT_PROVISION)))
        .addMethod(
          getSkippedEpochsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QuerySkippedEpochsRequest,
              com.canto.inflation.v1.QueryProto.QuerySkippedEpochsResponse>(
                service, METHODID_SKIPPED_EPOCHS)))
        .addMethod(
          getCirculatingSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyRequest,
              com.canto.inflation.v1.QueryProto.QueryCirculatingSupplyResponse>(
                service, METHODID_CIRCULATING_SUPPLY)))
        .addMethod(
          getInflationRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QueryInflationRateRequest,
              com.canto.inflation.v1.QueryProto.QueryInflationRateResponse>(
                service, METHODID_INFLATION_RATE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.inflation.v1.QueryProto.QueryParamsRequest,
              com.canto.inflation.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.inflation.v1.QueryProto.getDescriptor();
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
              .addMethod(getPeriodMethod())
              .addMethod(getEpochMintProvisionMethod())
              .addMethod(getSkippedEpochsMethod())
              .addMethod(getCirculatingSupplyMethod())
              .addMethod(getInflationRateMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
