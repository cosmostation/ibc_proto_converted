package com.em.market.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: em/market/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "em.market.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryByAccountRequest,
      com.em.market.v1.QueryProto.QueryByAccountResponse> getByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ByAccount",
      requestType = com.em.market.v1.QueryProto.QueryByAccountRequest.class,
      responseType = com.em.market.v1.QueryProto.QueryByAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryByAccountRequest,
      com.em.market.v1.QueryProto.QueryByAccountResponse> getByAccountMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryByAccountRequest, com.em.market.v1.QueryProto.QueryByAccountResponse> getByAccountMethod;
    if ((getByAccountMethod = QueryGrpc.getByAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getByAccountMethod = QueryGrpc.getByAccountMethod) == null) {
          QueryGrpc.getByAccountMethod = getByAccountMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.QueryProto.QueryByAccountRequest, com.em.market.v1.QueryProto.QueryByAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryByAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryByAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ByAccount"))
              .build();
        }
      }
    }
    return getByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentsRequest,
      com.em.market.v1.QueryProto.QueryInstrumentsResponse> getInstrumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Instruments",
      requestType = com.em.market.v1.QueryProto.QueryInstrumentsRequest.class,
      responseType = com.em.market.v1.QueryProto.QueryInstrumentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentsRequest,
      com.em.market.v1.QueryProto.QueryInstrumentsResponse> getInstrumentsMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentsRequest, com.em.market.v1.QueryProto.QueryInstrumentsResponse> getInstrumentsMethod;
    if ((getInstrumentsMethod = QueryGrpc.getInstrumentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInstrumentsMethod = QueryGrpc.getInstrumentsMethod) == null) {
          QueryGrpc.getInstrumentsMethod = getInstrumentsMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.QueryProto.QueryInstrumentsRequest, com.em.market.v1.QueryProto.QueryInstrumentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Instruments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryInstrumentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryInstrumentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Instruments"))
              .build();
        }
      }
    }
    return getInstrumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentRequest,
      com.em.market.v1.QueryProto.QueryInstrumentResponse> getInstrumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Instrument",
      requestType = com.em.market.v1.QueryProto.QueryInstrumentRequest.class,
      responseType = com.em.market.v1.QueryProto.QueryInstrumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentRequest,
      com.em.market.v1.QueryProto.QueryInstrumentResponse> getInstrumentMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.QueryProto.QueryInstrumentRequest, com.em.market.v1.QueryProto.QueryInstrumentResponse> getInstrumentMethod;
    if ((getInstrumentMethod = QueryGrpc.getInstrumentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInstrumentMethod = QueryGrpc.getInstrumentMethod) == null) {
          QueryGrpc.getInstrumentMethod = getInstrumentMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.QueryProto.QueryInstrumentRequest, com.em.market.v1.QueryProto.QueryInstrumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Instrument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryInstrumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.QueryProto.QueryInstrumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Instrument"))
              .build();
        }
      }
    }
    return getInstrumentMethod;
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
    default void byAccount(com.em.market.v1.QueryProto.QueryByAccountRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryByAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getByAccountMethod(), responseObserver);
    }

    /**
     */
    default void instruments(com.em.market.v1.QueryProto.QueryInstrumentsRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstrumentsMethod(), responseObserver);
    }

    /**
     */
    default void instrument(com.em.market.v1.QueryProto.QueryInstrumentRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstrumentMethod(), responseObserver);
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
    public void byAccount(com.em.market.v1.QueryProto.QueryByAccountRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryByAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void instruments(com.em.market.v1.QueryProto.QueryInstrumentsRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstrumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void instrument(com.em.market.v1.QueryProto.QueryInstrumentRequest request,
        io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstrumentMethod(), getCallOptions()), request, responseObserver);
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
    public com.em.market.v1.QueryProto.QueryByAccountResponse byAccount(com.em.market.v1.QueryProto.QueryByAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.QueryProto.QueryInstrumentsResponse instruments(com.em.market.v1.QueryProto.QueryInstrumentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstrumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.QueryProto.QueryInstrumentResponse instrument(com.em.market.v1.QueryProto.QueryInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstrumentMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.QueryProto.QueryByAccountResponse> byAccount(
        com.em.market.v1.QueryProto.QueryByAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.QueryProto.QueryInstrumentsResponse> instruments(
        com.em.market.v1.QueryProto.QueryInstrumentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstrumentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.QueryProto.QueryInstrumentResponse> instrument(
        com.em.market.v1.QueryProto.QueryInstrumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstrumentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BY_ACCOUNT = 0;
  private static final int METHODID_INSTRUMENTS = 1;
  private static final int METHODID_INSTRUMENT = 2;

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
        case METHODID_BY_ACCOUNT:
          serviceImpl.byAccount((com.em.market.v1.QueryProto.QueryByAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryByAccountResponse>) responseObserver);
          break;
        case METHODID_INSTRUMENTS:
          serviceImpl.instruments((com.em.market.v1.QueryProto.QueryInstrumentsRequest) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentsResponse>) responseObserver);
          break;
        case METHODID_INSTRUMENT:
          serviceImpl.instrument((com.em.market.v1.QueryProto.QueryInstrumentRequest) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.QueryProto.QueryInstrumentResponse>) responseObserver);
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
          getByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.QueryProto.QueryByAccountRequest,
              com.em.market.v1.QueryProto.QueryByAccountResponse>(
                service, METHODID_BY_ACCOUNT)))
        .addMethod(
          getInstrumentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.QueryProto.QueryInstrumentsRequest,
              com.em.market.v1.QueryProto.QueryInstrumentsResponse>(
                service, METHODID_INSTRUMENTS)))
        .addMethod(
          getInstrumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.QueryProto.QueryInstrumentRequest,
              com.em.market.v1.QueryProto.QueryInstrumentResponse>(
                service, METHODID_INSTRUMENT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.market.v1.QueryProto.getDescriptor();
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
              .addMethod(getByAccountMethod())
              .addMethod(getInstrumentsMethod())
              .addMethod(getInstrumentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
