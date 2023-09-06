package com.comdex.bandoracle.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/bandoracle/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.bandoracle.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> getFetchPriceResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchPriceResult",
      requestType = com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest.class,
      responseType = com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> getFetchPriceResultMethod() {
    io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> getFetchPriceResultMethod;
    if ((getFetchPriceResultMethod = QueryGrpc.getFetchPriceResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFetchPriceResultMethod = QueryGrpc.getFetchPriceResultMethod) == null) {
          QueryGrpc.getFetchPriceResultMethod = getFetchPriceResultMethod =
              io.grpc.MethodDescriptor.<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchPriceResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FetchPriceResult"))
              .build();
        }
      }
    }
    return getFetchPriceResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> getLastFetchPriceIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastFetchPriceID",
      requestType = com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest.class,
      responseType = com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> getLastFetchPriceIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> getLastFetchPriceIDMethod;
    if ((getLastFetchPriceIDMethod = QueryGrpc.getLastFetchPriceIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastFetchPriceIDMethod = QueryGrpc.getLastFetchPriceIDMethod) == null) {
          QueryGrpc.getLastFetchPriceIDMethod = getLastFetchPriceIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastFetchPriceID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastFetchPriceID"))
              .build();
        }
      }
    }
    return getLastFetchPriceIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> getFetchPriceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchPriceData",
      requestType = com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest.class,
      responseType = com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> getFetchPriceDataMethod() {
    io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> getFetchPriceDataMethod;
    if ((getFetchPriceDataMethod = QueryGrpc.getFetchPriceDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFetchPriceDataMethod = QueryGrpc.getFetchPriceDataMethod) == null) {
          QueryGrpc.getFetchPriceDataMethod = getFetchPriceDataMethod =
              io.grpc.MethodDescriptor.<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchPriceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FetchPriceData"))
              .build();
        }
      }
    }
    return getFetchPriceDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> getDiscardDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DiscardData",
      requestType = com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest.class,
      responseType = com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest,
      com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> getDiscardDataMethod() {
    io.grpc.MethodDescriptor<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> getDiscardDataMethod;
    if ((getDiscardDataMethod = QueryGrpc.getDiscardDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDiscardDataMethod = QueryGrpc.getDiscardDataMethod) == null) {
          QueryGrpc.getDiscardDataMethod = getDiscardDataMethod =
              io.grpc.MethodDescriptor.<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest, com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DiscardData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DiscardData"))
              .build();
        }
      }
    }
    return getDiscardDataMethod;
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
    default void params(com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void fetchPriceResult(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchPriceResultMethod(), responseObserver);
    }

    /**
     */
    default void lastFetchPriceID(com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastFetchPriceIDMethod(), responseObserver);
    }

    /**
     */
    default void fetchPriceData(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchPriceDataMethod(), responseObserver);
    }

    /**
     */
    default void discardData(com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscardDataMethod(), responseObserver);
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
    public void params(com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchPriceResult(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchPriceResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastFetchPriceID(com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastFetchPriceIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchPriceData(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchPriceDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void discardData(com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscardDataMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse params(com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse fetchPriceResult(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchPriceResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse lastFetchPriceID(com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastFetchPriceIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse fetchPriceData(com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchPriceDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse discardData(com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscardDataMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse> params(
        com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse> fetchPriceResult(
        com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchPriceResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse> lastFetchPriceID(
        com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastFetchPriceIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse> fetchPriceData(
        com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchPriceDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse> discardData(
        com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscardDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_FETCH_PRICE_RESULT = 1;
  private static final int METHODID_LAST_FETCH_PRICE_ID = 2;
  private static final int METHODID_FETCH_PRICE_DATA = 3;
  private static final int METHODID_DISCARD_DATA = 4;

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
          serviceImpl.params((com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_FETCH_PRICE_RESULT:
          serviceImpl.fetchPriceResult((com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse>) responseObserver);
          break;
        case METHODID_LAST_FETCH_PRICE_ID:
          serviceImpl.lastFetchPriceID((com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse>) responseObserver);
          break;
        case METHODID_FETCH_PRICE_DATA:
          serviceImpl.fetchPriceData((com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse>) responseObserver);
          break;
        case METHODID_DISCARD_DATA:
          serviceImpl.discardData((com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse>) responseObserver);
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
              com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsRequest,
              com.comdex.bandoracle.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getFetchPriceResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceRequest,
              com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceResponse>(
                service, METHODID_FETCH_PRICE_RESULT)))
        .addMethod(
          getLastFetchPriceIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdRequest,
              com.comdex.bandoracle.v1beta1.QueryProto.QueryLastFetchPriceIdResponse>(
                service, METHODID_LAST_FETCH_PRICE_ID)))
        .addMethod(
          getFetchPriceDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataRequest,
              com.comdex.bandoracle.v1beta1.QueryProto.QueryFetchPriceDataResponse>(
                service, METHODID_FETCH_PRICE_DATA)))
        .addMethod(
          getDiscardDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataRequest,
              com.comdex.bandoracle.v1beta1.QueryProto.QueryDiscardDataResponse>(
                service, METHODID_DISCARD_DATA)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.bandoracle.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getFetchPriceResultMethod())
              .addMethod(getLastFetchPriceIDMethod())
              .addMethod(getFetchPriceDataMethod())
              .addMethod(getDiscardDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
