package com.starnamed.x.escrow.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: iov/escrow/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "starnamed.x.escrow.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest,
      com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> getEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Escrow",
      requestType = com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest.class,
      responseType = com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest,
      com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> getEscrowMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest, com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> getEscrowMethod;
    if ((getEscrowMethod = QueryGrpc.getEscrowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEscrowMethod = QueryGrpc.getEscrowMethod) == null) {
          QueryGrpc.getEscrowMethod = getEscrowMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest, com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Escrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Escrow"))
              .build();
        }
      }
    }
    return getEscrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest,
      com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> getEscrowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Escrows",
      requestType = com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest.class,
      responseType = com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest,
      com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> getEscrowsMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest, com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> getEscrowsMethod;
    if ((getEscrowsMethod = QueryGrpc.getEscrowsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEscrowsMethod = QueryGrpc.getEscrowsMethod) == null) {
          QueryGrpc.getEscrowsMethod = getEscrowsMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest, com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Escrows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Escrows"))
              .build();
        }
      }
    }
    return getEscrowsMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Escrow queries the escrow by the specified id
     * </pre>
     */
    default void escrow(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEscrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Escrows queries escrows by the specified key-value pairs
     * </pre>
     */
    default void escrows(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEscrowsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * Escrow queries the escrow by the specified id
     * </pre>
     */
    public void escrow(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEscrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Escrows queries escrows by the specified key-value pairs
     * </pre>
     */
    public void escrows(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEscrowsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Escrow queries the escrow by the specified id
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse escrow(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEscrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Escrows queries escrows by the specified key-value pairs
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse escrows(com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEscrowsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Escrow queries the escrow by the specified id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse> escrow(
        com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEscrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Escrows queries escrows by the specified key-value pairs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse> escrows(
        com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEscrowsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ESCROW = 0;
  private static final int METHODID_ESCROWS = 1;

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
        case METHODID_ESCROW:
          serviceImpl.escrow((com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse>) responseObserver);
          break;
        case METHODID_ESCROWS:
          serviceImpl.escrows((com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse>) responseObserver);
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
          getEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowRequest,
              com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowResponse>(
                service, METHODID_ESCROW)))
        .addMethod(
          getEscrowsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsRequest,
              com.starnamed.x.escrow.v1beta1.QueryProto.QueryEscrowsResponse>(
                service, METHODID_ESCROWS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.starnamed.x.escrow.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getEscrowMethod())
              .addMethod(getEscrowsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
