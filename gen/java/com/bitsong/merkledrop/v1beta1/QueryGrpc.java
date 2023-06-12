package com.bitsong.merkledrop.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: bitsong/merkledrop/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "bitsong.merkledrop.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest,
      com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> getMerkledropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Merkledrop",
      requestType = com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest.class,
      responseType = com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest,
      com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> getMerkledropMethod() {
    io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest, com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> getMerkledropMethod;
    if ((getMerkledropMethod = QueryGrpc.getMerkledropMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMerkledropMethod = QueryGrpc.getMerkledropMethod) == null) {
          QueryGrpc.getMerkledropMethod = getMerkledropMethod =
              io.grpc.MethodDescriptor.<com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest, com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Merkledrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Merkledrop"))
              .build();
        }
      }
    }
    return getMerkledropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest,
      com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> getIndexClaimedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IndexClaimed",
      requestType = com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest.class,
      responseType = com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest,
      com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> getIndexClaimedMethod() {
    io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest, com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> getIndexClaimedMethod;
    if ((getIndexClaimedMethod = QueryGrpc.getIndexClaimedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIndexClaimedMethod = QueryGrpc.getIndexClaimedMethod) == null) {
          QueryGrpc.getIndexClaimedMethod = getIndexClaimedMethod =
              io.grpc.MethodDescriptor.<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest, com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IndexClaimed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IndexClaimed"))
              .build();
        }
      }
    }
    return getIndexClaimedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryParamsRequest,
      com.bitsong.merkledrop.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.bitsong.merkledrop.v1beta1.QueryParamsRequest.class,
      responseType = com.bitsong.merkledrop.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryParamsRequest,
      com.bitsong.merkledrop.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.bitsong.merkledrop.v1beta1.QueryParamsRequest, com.bitsong.merkledrop.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.bitsong.merkledrop.v1beta1.QueryParamsRequest, com.bitsong.merkledrop.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.merkledrop.v1beta1.QueryParamsResponse.getDefaultInstance()))
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
   */
  public interface AsyncService {

    /**
     */
    default void merkledrop(com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMerkledropMethod(), responseObserver);
    }

    /**
     */
    default void indexClaimed(com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexClaimedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the fantoken parameters
     * </pre>
     */
    default void params(com.bitsong.merkledrop.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
    public void merkledrop(com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMerkledropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void indexClaimed(com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexClaimedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the fantoken parameters
     * </pre>
     */
    public void params(com.bitsong.merkledrop.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse merkledrop(com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMerkledropMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse indexClaimed(com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexClaimedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the fantoken parameters
     * </pre>
     */
    public com.bitsong.merkledrop.v1beta1.QueryParamsResponse params(com.bitsong.merkledrop.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse> merkledrop(
        com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMerkledropMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse> indexClaimed(
        com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexClaimedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the fantoken parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.merkledrop.v1beta1.QueryParamsResponse> params(
        com.bitsong.merkledrop.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MERKLEDROP = 0;
  private static final int METHODID_INDEX_CLAIMED = 1;
  private static final int METHODID_PARAMS = 2;

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
        case METHODID_MERKLEDROP:
          serviceImpl.merkledrop((com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest) request,
              (io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse>) responseObserver);
          break;
        case METHODID_INDEX_CLAIMED:
          serviceImpl.indexClaimed((com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest) request,
              (io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.bitsong.merkledrop.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.bitsong.merkledrop.v1beta1.QueryParamsResponse>) responseObserver);
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
          getMerkledropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.merkledrop.v1beta1.QueryMerkledropRequest,
              com.bitsong.merkledrop.v1beta1.QueryMerkledropResponse>(
                service, METHODID_MERKLEDROP)))
        .addMethod(
          getIndexClaimedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest,
              com.bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse>(
                service, METHODID_INDEX_CLAIMED)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.merkledrop.v1beta1.QueryParamsRequest,
              com.bitsong.merkledrop.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bitsong.merkledrop.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getMerkledropMethod())
              .addMethod(getIndexClaimedMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
