package com.osmosis.twap.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/twap/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.twap.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ParamsRequest,
      com.osmosis.twap.v1beta1.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.twap.v1beta1.ParamsRequest.class,
      responseType = com.osmosis.twap.v1beta1.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ParamsRequest,
      com.osmosis.twap.v1beta1.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ParamsRequest, com.osmosis.twap.v1beta1.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.twap.v1beta1.ParamsRequest, com.osmosis.twap.v1beta1.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapRequest,
      com.osmosis.twap.v1beta1.ArithmeticTwapResponse> getArithmeticTwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArithmeticTwap",
      requestType = com.osmosis.twap.v1beta1.ArithmeticTwapRequest.class,
      responseType = com.osmosis.twap.v1beta1.ArithmeticTwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapRequest,
      com.osmosis.twap.v1beta1.ArithmeticTwapResponse> getArithmeticTwapMethod() {
    io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapRequest, com.osmosis.twap.v1beta1.ArithmeticTwapResponse> getArithmeticTwapMethod;
    if ((getArithmeticTwapMethod = QueryGrpc.getArithmeticTwapMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getArithmeticTwapMethod = QueryGrpc.getArithmeticTwapMethod) == null) {
          QueryGrpc.getArithmeticTwapMethod = getArithmeticTwapMethod =
              io.grpc.MethodDescriptor.<com.osmosis.twap.v1beta1.ArithmeticTwapRequest, com.osmosis.twap.v1beta1.ArithmeticTwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArithmeticTwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ArithmeticTwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ArithmeticTwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ArithmeticTwap"))
              .build();
        }
      }
    }
    return getArithmeticTwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest,
      com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> getArithmeticTwapToNowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArithmeticTwapToNow",
      requestType = com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest.class,
      responseType = com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest,
      com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> getArithmeticTwapToNowMethod() {
    io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest, com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> getArithmeticTwapToNowMethod;
    if ((getArithmeticTwapToNowMethod = QueryGrpc.getArithmeticTwapToNowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getArithmeticTwapToNowMethod = QueryGrpc.getArithmeticTwapToNowMethod) == null) {
          QueryGrpc.getArithmeticTwapToNowMethod = getArithmeticTwapToNowMethod =
              io.grpc.MethodDescriptor.<com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest, com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArithmeticTwapToNow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ArithmeticTwapToNow"))
              .build();
        }
      }
    }
    return getArithmeticTwapToNowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapRequest,
      com.osmosis.twap.v1beta1.GeometricTwapResponse> getGeometricTwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeometricTwap",
      requestType = com.osmosis.twap.v1beta1.GeometricTwapRequest.class,
      responseType = com.osmosis.twap.v1beta1.GeometricTwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapRequest,
      com.osmosis.twap.v1beta1.GeometricTwapResponse> getGeometricTwapMethod() {
    io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapRequest, com.osmosis.twap.v1beta1.GeometricTwapResponse> getGeometricTwapMethod;
    if ((getGeometricTwapMethod = QueryGrpc.getGeometricTwapMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGeometricTwapMethod = QueryGrpc.getGeometricTwapMethod) == null) {
          QueryGrpc.getGeometricTwapMethod = getGeometricTwapMethod =
              io.grpc.MethodDescriptor.<com.osmosis.twap.v1beta1.GeometricTwapRequest, com.osmosis.twap.v1beta1.GeometricTwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeometricTwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.GeometricTwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.GeometricTwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GeometricTwap"))
              .build();
        }
      }
    }
    return getGeometricTwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapToNowRequest,
      com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> getGeometricTwapToNowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeometricTwapToNow",
      requestType = com.osmosis.twap.v1beta1.GeometricTwapToNowRequest.class,
      responseType = com.osmosis.twap.v1beta1.GeometricTwapToNowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapToNowRequest,
      com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> getGeometricTwapToNowMethod() {
    io.grpc.MethodDescriptor<com.osmosis.twap.v1beta1.GeometricTwapToNowRequest, com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> getGeometricTwapToNowMethod;
    if ((getGeometricTwapToNowMethod = QueryGrpc.getGeometricTwapToNowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGeometricTwapToNowMethod = QueryGrpc.getGeometricTwapToNowMethod) == null) {
          QueryGrpc.getGeometricTwapToNowMethod = getGeometricTwapToNowMethod =
              io.grpc.MethodDescriptor.<com.osmosis.twap.v1beta1.GeometricTwapToNowRequest, com.osmosis.twap.v1beta1.GeometricTwapToNowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GeometricTwapToNow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.GeometricTwapToNowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.twap.v1beta1.GeometricTwapToNowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GeometricTwapToNow"))
              .build();
        }
      }
    }
    return getGeometricTwapToNowMethod;
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
    default void params(com.osmosis.twap.v1beta1.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void arithmeticTwap(com.osmosis.twap.v1beta1.ArithmeticTwapRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArithmeticTwapMethod(), responseObserver);
    }

    /**
     */
    default void arithmeticTwapToNow(com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArithmeticTwapToNowMethod(), responseObserver);
    }

    /**
     */
    default void geometricTwap(com.osmosis.twap.v1beta1.GeometricTwapRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeometricTwapMethod(), responseObserver);
    }

    /**
     */
    default void geometricTwapToNow(com.osmosis.twap.v1beta1.GeometricTwapToNowRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGeometricTwapToNowMethod(), responseObserver);
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
    public void params(com.osmosis.twap.v1beta1.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void arithmeticTwap(com.osmosis.twap.v1beta1.ArithmeticTwapRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArithmeticTwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void arithmeticTwapToNow(com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArithmeticTwapToNowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void geometricTwap(com.osmosis.twap.v1beta1.GeometricTwapRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeometricTwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void geometricTwapToNow(com.osmosis.twap.v1beta1.GeometricTwapToNowRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGeometricTwapToNowMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.twap.v1beta1.ParamsResponse params(com.osmosis.twap.v1beta1.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.twap.v1beta1.ArithmeticTwapResponse arithmeticTwap(com.osmosis.twap.v1beta1.ArithmeticTwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArithmeticTwapMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse arithmeticTwapToNow(com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArithmeticTwapToNowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.twap.v1beta1.GeometricTwapResponse geometricTwap(com.osmosis.twap.v1beta1.GeometricTwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeometricTwapMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.twap.v1beta1.GeometricTwapToNowResponse geometricTwapToNow(com.osmosis.twap.v1beta1.GeometricTwapToNowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGeometricTwapToNowMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.twap.v1beta1.ParamsResponse> params(
        com.osmosis.twap.v1beta1.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.twap.v1beta1.ArithmeticTwapResponse> arithmeticTwap(
        com.osmosis.twap.v1beta1.ArithmeticTwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArithmeticTwapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse> arithmeticTwapToNow(
        com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArithmeticTwapToNowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.twap.v1beta1.GeometricTwapResponse> geometricTwap(
        com.osmosis.twap.v1beta1.GeometricTwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeometricTwapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.twap.v1beta1.GeometricTwapToNowResponse> geometricTwapToNow(
        com.osmosis.twap.v1beta1.GeometricTwapToNowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGeometricTwapToNowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ARITHMETIC_TWAP = 1;
  private static final int METHODID_ARITHMETIC_TWAP_TO_NOW = 2;
  private static final int METHODID_GEOMETRIC_TWAP = 3;
  private static final int METHODID_GEOMETRIC_TWAP_TO_NOW = 4;

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
          serviceImpl.params((com.osmosis.twap.v1beta1.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ParamsResponse>) responseObserver);
          break;
        case METHODID_ARITHMETIC_TWAP:
          serviceImpl.arithmeticTwap((com.osmosis.twap.v1beta1.ArithmeticTwapRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapResponse>) responseObserver);
          break;
        case METHODID_ARITHMETIC_TWAP_TO_NOW:
          serviceImpl.arithmeticTwapToNow((com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse>) responseObserver);
          break;
        case METHODID_GEOMETRIC_TWAP:
          serviceImpl.geometricTwap((com.osmosis.twap.v1beta1.GeometricTwapRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapResponse>) responseObserver);
          break;
        case METHODID_GEOMETRIC_TWAP_TO_NOW:
          serviceImpl.geometricTwapToNow((com.osmosis.twap.v1beta1.GeometricTwapToNowRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.twap.v1beta1.GeometricTwapToNowResponse>) responseObserver);
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
              com.osmosis.twap.v1beta1.ParamsRequest,
              com.osmosis.twap.v1beta1.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getArithmeticTwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.twap.v1beta1.ArithmeticTwapRequest,
              com.osmosis.twap.v1beta1.ArithmeticTwapResponse>(
                service, METHODID_ARITHMETIC_TWAP)))
        .addMethod(
          getArithmeticTwapToNowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.twap.v1beta1.ArithmeticTwapToNowRequest,
              com.osmosis.twap.v1beta1.ArithmeticTwapToNowResponse>(
                service, METHODID_ARITHMETIC_TWAP_TO_NOW)))
        .addMethod(
          getGeometricTwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.twap.v1beta1.GeometricTwapRequest,
              com.osmosis.twap.v1beta1.GeometricTwapResponse>(
                service, METHODID_GEOMETRIC_TWAP)))
        .addMethod(
          getGeometricTwapToNowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.twap.v1beta1.GeometricTwapToNowRequest,
              com.osmosis.twap.v1beta1.GeometricTwapToNowResponse>(
                service, METHODID_GEOMETRIC_TWAP_TO_NOW)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.twap.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getArithmeticTwapMethod())
              .addMethod(getArithmeticTwapToNowMethod())
              .addMethod(getGeometricTwapMethod())
              .addMethod(getGeometricTwapToNowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
