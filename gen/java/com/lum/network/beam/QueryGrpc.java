package com.lum.network.beam;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: lum-network/beam/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "lum.network.beam.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryGetBeamRequest,
      com.lum.network.beam.QueryProto.QueryGetBeamResponse> getBeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Beam",
      requestType = com.lum.network.beam.QueryProto.QueryGetBeamRequest.class,
      responseType = com.lum.network.beam.QueryProto.QueryGetBeamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryGetBeamRequest,
      com.lum.network.beam.QueryProto.QueryGetBeamResponse> getBeamMethod() {
    io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryGetBeamRequest, com.lum.network.beam.QueryProto.QueryGetBeamResponse> getBeamMethod;
    if ((getBeamMethod = QueryGrpc.getBeamMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBeamMethod = QueryGrpc.getBeamMethod) == null) {
          QueryGrpc.getBeamMethod = getBeamMethod =
              io.grpc.MethodDescriptor.<com.lum.network.beam.QueryProto.QueryGetBeamRequest, com.lum.network.beam.QueryProto.QueryGetBeamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Beam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryGetBeamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryGetBeamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Beam"))
              .build();
        }
      }
    }
    return getBeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsRequest,
      com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> getBeamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Beams",
      requestType = com.lum.network.beam.QueryProto.QueryFetchBeamsRequest.class,
      responseType = com.lum.network.beam.QueryProto.QueryFetchBeamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsRequest,
      com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> getBeamsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsRequest, com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> getBeamsMethod;
    if ((getBeamsMethod = QueryGrpc.getBeamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBeamsMethod = QueryGrpc.getBeamsMethod) == null) {
          QueryGrpc.getBeamsMethod = getBeamsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.beam.QueryProto.QueryFetchBeamsRequest, com.lum.network.beam.QueryProto.QueryFetchBeamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Beams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryFetchBeamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryFetchBeamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Beams"))
              .build();
        }
      }
    }
    return getBeamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest,
      com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> getBeamsOpenQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeamsOpenQueue",
      requestType = com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest.class,
      responseType = com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest,
      com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> getBeamsOpenQueueMethod() {
    io.grpc.MethodDescriptor<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest, com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> getBeamsOpenQueueMethod;
    if ((getBeamsOpenQueueMethod = QueryGrpc.getBeamsOpenQueueMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBeamsOpenQueueMethod = QueryGrpc.getBeamsOpenQueueMethod) == null) {
          QueryGrpc.getBeamsOpenQueueMethod = getBeamsOpenQueueMethod =
              io.grpc.MethodDescriptor.<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest, com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeamsOpenQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BeamsOpenQueue"))
              .build();
        }
      }
    }
    return getBeamsOpenQueueMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void beam(com.lum.network.beam.QueryProto.QueryGetBeamRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryGetBeamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeamMethod(), responseObserver);
    }

    /**
     */
    default void beams(com.lum.network.beam.QueryProto.QueryFetchBeamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeamsMethod(), responseObserver);
    }

    /**
     */
    default void beamsOpenQueue(com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeamsOpenQueueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     */
    public void beam(com.lum.network.beam.QueryProto.QueryGetBeamRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryGetBeamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beams(com.lum.network.beam.QueryProto.QueryFetchBeamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beamsOpenQueue(com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeamsOpenQueueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     */
    public com.lum.network.beam.QueryProto.QueryGetBeamResponse beam(com.lum.network.beam.QueryProto.QueryGetBeamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.beam.QueryProto.QueryFetchBeamsResponse beams(com.lum.network.beam.QueryProto.QueryFetchBeamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse beamsOpenQueue(com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeamsOpenQueueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.beam.QueryProto.QueryGetBeamResponse> beam(
        com.lum.network.beam.QueryProto.QueryGetBeamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.beam.QueryProto.QueryFetchBeamsResponse> beams(
        com.lum.network.beam.QueryProto.QueryFetchBeamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse> beamsOpenQueue(
        com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeamsOpenQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BEAM = 0;
  private static final int METHODID_BEAMS = 1;
  private static final int METHODID_BEAMS_OPEN_QUEUE = 2;

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
        case METHODID_BEAM:
          serviceImpl.beam((com.lum.network.beam.QueryProto.QueryGetBeamRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryGetBeamResponse>) responseObserver);
          break;
        case METHODID_BEAMS:
          serviceImpl.beams((com.lum.network.beam.QueryProto.QueryFetchBeamsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsResponse>) responseObserver);
          break;
        case METHODID_BEAMS_OPEN_QUEUE:
          serviceImpl.beamsOpenQueue((com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse>) responseObserver);
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
          getBeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.beam.QueryProto.QueryGetBeamRequest,
              com.lum.network.beam.QueryProto.QueryGetBeamResponse>(
                service, METHODID_BEAM)))
        .addMethod(
          getBeamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.beam.QueryProto.QueryFetchBeamsRequest,
              com.lum.network.beam.QueryProto.QueryFetchBeamsResponse>(
                service, METHODID_BEAMS)))
        .addMethod(
          getBeamsOpenQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueRequest,
              com.lum.network.beam.QueryProto.QueryFetchBeamsOpenQueueResponse>(
                service, METHODID_BEAMS_OPEN_QUEUE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.beam.QueryProto.getDescriptor();
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
              .addMethod(getBeamMethod())
              .addMethod(getBeamsMethod())
              .addMethod(getBeamsOpenQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
