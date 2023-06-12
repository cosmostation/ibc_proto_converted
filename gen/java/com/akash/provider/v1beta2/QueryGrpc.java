package com.akash.provider.v1beta2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/provider/v1beta2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "akash.provider.v1beta2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProvidersRequest,
      com.akash.provider.v1beta2.QueryProvidersResponse> getProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Providers",
      requestType = com.akash.provider.v1beta2.QueryProvidersRequest.class,
      responseType = com.akash.provider.v1beta2.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProvidersRequest,
      com.akash.provider.v1beta2.QueryProvidersResponse> getProvidersMethod() {
    io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProvidersRequest, com.akash.provider.v1beta2.QueryProvidersResponse> getProvidersMethod;
    if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
          QueryGrpc.getProvidersMethod = getProvidersMethod =
              io.grpc.MethodDescriptor.<com.akash.provider.v1beta2.QueryProvidersRequest, com.akash.provider.v1beta2.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Providers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.QueryProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Providers"))
              .build();
        }
      }
    }
    return getProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProviderRequest,
      com.akash.provider.v1beta2.QueryProviderResponse> getProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Provider",
      requestType = com.akash.provider.v1beta2.QueryProviderRequest.class,
      responseType = com.akash.provider.v1beta2.QueryProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProviderRequest,
      com.akash.provider.v1beta2.QueryProviderResponse> getProviderMethod() {
    io.grpc.MethodDescriptor<com.akash.provider.v1beta2.QueryProviderRequest, com.akash.provider.v1beta2.QueryProviderResponse> getProviderMethod;
    if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
          QueryGrpc.getProviderMethod = getProviderMethod =
              io.grpc.MethodDescriptor.<com.akash.provider.v1beta2.QueryProviderRequest, com.akash.provider.v1beta2.QueryProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Provider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.QueryProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.QueryProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Provider"))
              .build();
        }
      }
    }
    return getProviderMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Providers queries providers
     * </pre>
     */
    default void providers(com.akash.provider.v1beta2.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provider queries provider details
     * </pre>
     */
    default void provider(com.akash.provider.v1beta2.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * Providers queries providers
     * </pre>
     */
    public void providers(com.akash.provider.v1beta2.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provider queries provider details
     * </pre>
     */
    public void provider(com.akash.provider.v1beta2.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Providers queries providers
     * </pre>
     */
    public com.akash.provider.v1beta2.QueryProvidersResponse providers(com.akash.provider.v1beta2.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provider queries provider details
     * </pre>
     */
    public com.akash.provider.v1beta2.QueryProviderResponse provider(com.akash.provider.v1beta2.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Providers queries providers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.provider.v1beta2.QueryProvidersResponse> providers(
        com.akash.provider.v1beta2.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provider queries provider details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.provider.v1beta2.QueryProviderResponse> provider(
        com.akash.provider.v1beta2.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROVIDERS = 0;
  private static final int METHODID_PROVIDER = 1;

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
        case METHODID_PROVIDERS:
          serviceImpl.providers((com.akash.provider.v1beta2.QueryProvidersRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_PROVIDER:
          serviceImpl.provider((com.akash.provider.v1beta2.QueryProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.QueryProviderResponse>) responseObserver);
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
          getProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.provider.v1beta2.QueryProvidersRequest,
              com.akash.provider.v1beta2.QueryProvidersResponse>(
                service, METHODID_PROVIDERS)))
        .addMethod(
          getProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.provider.v1beta2.QueryProviderRequest,
              com.akash.provider.v1beta2.QueryProviderResponse>(
                service, METHODID_PROVIDER)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.provider.v1beta2.QueryProto.getDescriptor();
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
              .addMethod(getProvidersMethod())
              .addMethod(getProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
