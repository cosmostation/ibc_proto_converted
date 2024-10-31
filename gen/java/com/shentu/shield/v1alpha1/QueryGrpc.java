package com.shentu.shield.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for shield module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/shield/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "shentu.shield.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Provider",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod;
    if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
          QueryGrpc.getProviderMethod = getProviderMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Provider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Provider"))
              .build();
        }
      }
    }
    return getProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Providers",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod;
    if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
          QueryGrpc.getProvidersMethod = getProvidersMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Providers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Providers"))
              .build();
        }
      }
    }
    return getProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShieldStatus",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod;
    if ((getShieldStatusMethod = QueryGrpc.getShieldStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShieldStatusMethod = QueryGrpc.getShieldStatusMethod) == null) {
          QueryGrpc.getShieldStatusMethod = getShieldStatusMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShieldStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShieldStatus"))
              .build();
        }
      }
    }
    return getShieldStatusMethod;
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
   * Query defines the gRPC querier service for shield module
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderMethod(), responseObserver);
    }

    /**
     */
    default void providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvidersMethod(), responseObserver);
    }

    /**
     */
    default void shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShieldStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
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
   * Query defines the gRPC querier service for shield module
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
    public void provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShieldStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
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
    public com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvidersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShieldStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> provider(
        com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> providers(
        com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> shieldStatus(
        com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShieldStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROVIDER = 0;
  private static final int METHODID_PROVIDERS = 1;
  private static final int METHODID_SHIELD_STATUS = 2;

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
        case METHODID_PROVIDER:
          serviceImpl.provider((com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>) responseObserver);
          break;
        case METHODID_PROVIDERS:
          serviceImpl.providers((com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_SHIELD_STATUS:
          serviceImpl.shieldStatus((com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>) responseObserver);
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
          getProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>(
                service, METHODID_PROVIDER)))
        .addMethod(
          getProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>(
                service, METHODID_PROVIDERS)))
        .addMethod(
          getShieldStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>(
                service, METHODID_SHIELD_STATUS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.shield.v1alpha1.QueryProto.getDescriptor();
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
              .addMethod(getProviderMethod())
              .addMethod(getProvidersMethod())
              .addMethod(getShieldStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
