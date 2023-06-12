package com.akash.audit.v1beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/audit/v1beta3/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "akash.audit.v1beta3.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getAllProvidersAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllProvidersAttributes",
      requestType = com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest.class,
      responseType = com.akash.audit.v1beta3.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getAllProvidersAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse> getAllProvidersAttributesMethod;
    if ((getAllProvidersAttributesMethod = QueryGrpc.getAllProvidersAttributesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllProvidersAttributesMethod = QueryGrpc.getAllProvidersAttributesMethod) == null) {
          QueryGrpc.getAllProvidersAttributesMethod = getAllProvidersAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllProvidersAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllProvidersAttributes"))
              .build();
        }
      }
    }
    return getAllProvidersAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderAttributes",
      requestType = com.akash.audit.v1beta3.QueryProviderAttributesRequest.class,
      responseType = com.akash.audit.v1beta3.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAttributesMethod;
    if ((getProviderAttributesMethod = QueryGrpc.getProviderAttributesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderAttributesMethod = QueryGrpc.getProviderAttributesMethod) == null) {
          QueryGrpc.getProviderAttributesMethod = getProviderAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta3.QueryProviderAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProviderAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderAttributes"))
              .build();
        }
      }
    }
    return getProviderAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAuditorRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAuditorAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderAuditorAttributes",
      requestType = com.akash.audit.v1beta3.QueryProviderAuditorRequest.class,
      responseType = com.akash.audit.v1beta3.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAuditorRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAuditorAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryProviderAuditorRequest, com.akash.audit.v1beta3.QueryProvidersResponse> getProviderAuditorAttributesMethod;
    if ((getProviderAuditorAttributesMethod = QueryGrpc.getProviderAuditorAttributesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderAuditorAttributesMethod = QueryGrpc.getProviderAuditorAttributesMethod) == null) {
          QueryGrpc.getProviderAuditorAttributesMethod = getProviderAuditorAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta3.QueryProviderAuditorRequest, com.akash.audit.v1beta3.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderAuditorAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProviderAuditorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderAuditorAttributes"))
              .build();
        }
      }
    }
    return getProviderAuditorAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAuditorAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getAuditorAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuditorAttributes",
      requestType = com.akash.audit.v1beta3.QueryAuditorAttributesRequest.class,
      responseType = com.akash.audit.v1beta3.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAuditorAttributesRequest,
      com.akash.audit.v1beta3.QueryProvidersResponse> getAuditorAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta3.QueryAuditorAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse> getAuditorAttributesMethod;
    if ((getAuditorAttributesMethod = QueryGrpc.getAuditorAttributesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuditorAttributesMethod = QueryGrpc.getAuditorAttributesMethod) == null) {
          QueryGrpc.getAuditorAttributesMethod = getAuditorAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta3.QueryAuditorAttributesRequest, com.akash.audit.v1beta3.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuditorAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryAuditorAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta3.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AuditorAttributes"))
              .build();
        }
      }
    }
    return getAuditorAttributesMethod;
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
     * AllProvidersAttributes queries all providers
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    default void allProvidersAttributes(com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllProvidersAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProviderAttributes queries all provider signed attributes
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    default void providerAttributes(com.akash.audit.v1beta3.QueryProviderAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProviderAuditorAttributes queries provider signed attributes by specific auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    default void providerAuditorAttributes(com.akash.audit.v1beta3.QueryProviderAuditorRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderAuditorAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AuditorAttributes queries all providers signed by this auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    default void auditorAttributes(com.akash.audit.v1beta3.QueryAuditorAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuditorAttributesMethod(), responseObserver);
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
     * AllProvidersAttributes queries all providers
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public void allProvidersAttributes(com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllProvidersAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProviderAttributes queries all provider signed attributes
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public void providerAttributes(com.akash.audit.v1beta3.QueryProviderAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProviderAuditorAttributes queries provider signed attributes by specific auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public void providerAuditorAttributes(com.akash.audit.v1beta3.QueryProviderAuditorRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderAuditorAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AuditorAttributes queries all providers signed by this auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public void auditorAttributes(com.akash.audit.v1beta3.QueryAuditorAttributesRequest request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuditorAttributesMethod(), getCallOptions()), request, responseObserver);
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
     * AllProvidersAttributes queries all providers
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.akash.audit.v1beta3.QueryProvidersResponse allProvidersAttributes(com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllProvidersAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProviderAttributes queries all provider signed attributes
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.akash.audit.v1beta3.QueryProvidersResponse providerAttributes(com.akash.audit.v1beta3.QueryProviderAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProviderAuditorAttributes queries provider signed attributes by specific auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.akash.audit.v1beta3.QueryProvidersResponse providerAuditorAttributes(com.akash.audit.v1beta3.QueryProviderAuditorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderAuditorAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AuditorAttributes queries all providers signed by this auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.akash.audit.v1beta3.QueryProvidersResponse auditorAttributes(com.akash.audit.v1beta3.QueryAuditorAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuditorAttributesMethod(), getCallOptions(), request);
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
     * AllProvidersAttributes queries all providers
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta3.QueryProvidersResponse> allProvidersAttributes(
        com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllProvidersAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProviderAttributes queries all provider signed attributes
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta3.QueryProvidersResponse> providerAttributes(
        com.akash.audit.v1beta3.QueryProviderAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProviderAuditorAttributes queries provider signed attributes by specific auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta3.QueryProvidersResponse> providerAuditorAttributes(
        com.akash.audit.v1beta3.QueryProviderAuditorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderAuditorAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AuditorAttributes queries all providers signed by this auditor
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta3.QueryProvidersResponse> auditorAttributes(
        com.akash.audit.v1beta3.QueryAuditorAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuditorAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_PROVIDERS_ATTRIBUTES = 0;
  private static final int METHODID_PROVIDER_ATTRIBUTES = 1;
  private static final int METHODID_PROVIDER_AUDITOR_ATTRIBUTES = 2;
  private static final int METHODID_AUDITOR_ATTRIBUTES = 3;

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
        case METHODID_ALL_PROVIDERS_ATTRIBUTES:
          serviceImpl.allProvidersAttributes((com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_ATTRIBUTES:
          serviceImpl.providerAttributes((com.akash.audit.v1beta3.QueryProviderAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_AUDITOR_ATTRIBUTES:
          serviceImpl.providerAuditorAttributes((com.akash.audit.v1beta3.QueryProviderAuditorRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_AUDITOR_ATTRIBUTES:
          serviceImpl.auditorAttributes((com.akash.audit.v1beta3.QueryAuditorAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta3.QueryProvidersResponse>) responseObserver);
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
          getAllProvidersAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta3.QueryAllProvidersAttributesRequest,
              com.akash.audit.v1beta3.QueryProvidersResponse>(
                service, METHODID_ALL_PROVIDERS_ATTRIBUTES)))
        .addMethod(
          getProviderAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta3.QueryProviderAttributesRequest,
              com.akash.audit.v1beta3.QueryProvidersResponse>(
                service, METHODID_PROVIDER_ATTRIBUTES)))
        .addMethod(
          getProviderAuditorAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta3.QueryProviderAuditorRequest,
              com.akash.audit.v1beta3.QueryProvidersResponse>(
                service, METHODID_PROVIDER_AUDITOR_ATTRIBUTES)))
        .addMethod(
          getAuditorAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta3.QueryAuditorAttributesRequest,
              com.akash.audit.v1beta3.QueryProvidersResponse>(
                service, METHODID_AUDITOR_ATTRIBUTES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.audit.v1beta3.QueryProto.getDescriptor();
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
              .addMethod(getAllProvidersAttributesMethod())
              .addMethod(getProviderAttributesMethod())
              .addMethod(getProviderAuditorAttributesMethod())
              .addMethod(getAuditorAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
