package com.secret.intertx.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: secret/intertx/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "secret.intertx.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest,
      com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> getInterchainAccountFromAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InterchainAccountFromAddress",
      requestType = com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest.class,
      responseType = com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest,
      com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> getInterchainAccountFromAddressMethod() {
    io.grpc.MethodDescriptor<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest, com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> getInterchainAccountFromAddressMethod;
    if ((getInterchainAccountFromAddressMethod = QueryGrpc.getInterchainAccountFromAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInterchainAccountFromAddressMethod = QueryGrpc.getInterchainAccountFromAddressMethod) == null) {
          QueryGrpc.getInterchainAccountFromAddressMethod = getInterchainAccountFromAddressMethod =
              io.grpc.MethodDescriptor.<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest, com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InterchainAccountFromAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InterchainAccountFromAddress"))
              .build();
        }
      }
    }
    return getInterchainAccountFromAddressMethod;
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
     * <pre>
     * QueryInterchainAccountFromAddress returns the interchain account for given owner address on a given connection pair
     * </pre>
     */
    default void interchainAccountFromAddress(com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInterchainAccountFromAddressMethod(), responseObserver);
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
     * <pre>
     * QueryInterchainAccountFromAddress returns the interchain account for given owner address on a given connection pair
     * </pre>
     */
    public void interchainAccountFromAddress(com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest request,
        io.grpc.stub.StreamObserver<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInterchainAccountFromAddressMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * QueryInterchainAccountFromAddress returns the interchain account for given owner address on a given connection pair
     * </pre>
     */
    public com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse interchainAccountFromAddress(com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInterchainAccountFromAddressMethod(), getCallOptions(), request);
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
     * <pre>
     * QueryInterchainAccountFromAddress returns the interchain account for given owner address on a given connection pair
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse> interchainAccountFromAddress(
        com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInterchainAccountFromAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTERCHAIN_ACCOUNT_FROM_ADDRESS = 0;

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
        case METHODID_INTERCHAIN_ACCOUNT_FROM_ADDRESS:
          serviceImpl.interchainAccountFromAddress((com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse>) responseObserver);
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
          getInterchainAccountFromAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressRequest,
              com.secret.intertx.v1beta1.QueryProto.QueryInterchainAccountFromAddressResponse>(
                service, METHODID_INTERCHAIN_ACCOUNT_FROM_ADDRESS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.secret.intertx.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getInterchainAccountFromAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
