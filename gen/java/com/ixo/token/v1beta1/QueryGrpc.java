package com.ixo.token.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/token/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ixo.token.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryParamsRequest,
      com.ixo.token.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ixo.token.v1beta1.QueryParamsRequest.class,
      responseType = com.ixo.token.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryParamsRequest,
      com.ixo.token.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryParamsRequest, com.ixo.token.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.QueryParamsRequest, com.ixo.token.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenListRequest,
      com.ixo.token.v1beta1.QueryTokenListResponse> getTokenListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenList",
      requestType = com.ixo.token.v1beta1.QueryTokenListRequest.class,
      responseType = com.ixo.token.v1beta1.QueryTokenListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenListRequest,
      com.ixo.token.v1beta1.QueryTokenListResponse> getTokenListMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenListRequest, com.ixo.token.v1beta1.QueryTokenListResponse> getTokenListMethod;
    if ((getTokenListMethod = QueryGrpc.getTokenListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenListMethod = QueryGrpc.getTokenListMethod) == null) {
          QueryGrpc.getTokenListMethod = getTokenListMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.QueryTokenListRequest, com.ixo.token.v1beta1.QueryTokenListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenList"))
              .build();
        }
      }
    }
    return getTokenListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenDocRequest,
      com.ixo.token.v1beta1.QueryTokenDocResponse> getTokenDocMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenDoc",
      requestType = com.ixo.token.v1beta1.QueryTokenDocRequest.class,
      responseType = com.ixo.token.v1beta1.QueryTokenDocResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenDocRequest,
      com.ixo.token.v1beta1.QueryTokenDocResponse> getTokenDocMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenDocRequest, com.ixo.token.v1beta1.QueryTokenDocResponse> getTokenDocMethod;
    if ((getTokenDocMethod = QueryGrpc.getTokenDocMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenDocMethod = QueryGrpc.getTokenDocMethod) == null) {
          QueryGrpc.getTokenDocMethod = getTokenDocMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.QueryTokenDocRequest, com.ixo.token.v1beta1.QueryTokenDocResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenDoc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenDocRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenDocResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenDoc"))
              .build();
        }
      }
    }
    return getTokenDocMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenMetadataRequest,
      com.ixo.token.v1beta1.QueryTokenMetadataResponse> getTokenMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenMetadata",
      requestType = com.ixo.token.v1beta1.QueryTokenMetadataRequest.class,
      responseType = com.ixo.token.v1beta1.QueryTokenMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenMetadataRequest,
      com.ixo.token.v1beta1.QueryTokenMetadataResponse> getTokenMetadataMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.QueryTokenMetadataRequest, com.ixo.token.v1beta1.QueryTokenMetadataResponse> getTokenMetadataMethod;
    if ((getTokenMetadataMethod = QueryGrpc.getTokenMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenMetadataMethod = QueryGrpc.getTokenMetadataMethod) == null) {
          QueryGrpc.getTokenMetadataMethod = getTokenMetadataMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.QueryTokenMetadataRequest, com.ixo.token.v1beta1.QueryTokenMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.QueryTokenMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TokenMetadata"))
              .build();
        }
      }
    }
    return getTokenMetadataMethod;
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
    default void params(com.ixo.token.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void tokenList(com.ixo.token.v1beta1.QueryTokenListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenListMethod(), responseObserver);
    }

    /**
     */
    default void tokenDoc(com.ixo.token.v1beta1.QueryTokenDocRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenDocResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenDocMethod(), responseObserver);
    }

    /**
     */
    default void tokenMetadata(com.ixo.token.v1beta1.QueryTokenMetadataRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenMetadataMethod(), responseObserver);
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
    public void params(com.ixo.token.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tokenList(com.ixo.token.v1beta1.QueryTokenListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tokenDoc(com.ixo.token.v1beta1.QueryTokenDocRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenDocResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenDocMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tokenMetadata(com.ixo.token.v1beta1.QueryTokenMetadataRequest request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenMetadataMethod(), getCallOptions()), request, responseObserver);
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
    public com.ixo.token.v1beta1.QueryParamsResponse params(com.ixo.token.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.QueryTokenListResponse tokenList(com.ixo.token.v1beta1.QueryTokenListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.QueryTokenDocResponse tokenDoc(com.ixo.token.v1beta1.QueryTokenDocRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenDocMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.QueryTokenMetadataResponse tokenMetadata(com.ixo.token.v1beta1.QueryTokenMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenMetadataMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.QueryParamsResponse> params(
        com.ixo.token.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.QueryTokenListResponse> tokenList(
        com.ixo.token.v1beta1.QueryTokenListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.QueryTokenDocResponse> tokenDoc(
        com.ixo.token.v1beta1.QueryTokenDocRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenDocMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.QueryTokenMetadataResponse> tokenMetadata(
        com.ixo.token.v1beta1.QueryTokenMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_TOKEN_LIST = 1;
  private static final int METHODID_TOKEN_DOC = 2;
  private static final int METHODID_TOKEN_METADATA = 3;

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
          serviceImpl.params((com.ixo.token.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOKEN_LIST:
          serviceImpl.tokenList((com.ixo.token.v1beta1.QueryTokenListRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenListResponse>) responseObserver);
          break;
        case METHODID_TOKEN_DOC:
          serviceImpl.tokenDoc((com.ixo.token.v1beta1.QueryTokenDocRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenDocResponse>) responseObserver);
          break;
        case METHODID_TOKEN_METADATA:
          serviceImpl.tokenMetadata((com.ixo.token.v1beta1.QueryTokenMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.QueryTokenMetadataResponse>) responseObserver);
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
              com.ixo.token.v1beta1.QueryParamsRequest,
              com.ixo.token.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTokenListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.QueryTokenListRequest,
              com.ixo.token.v1beta1.QueryTokenListResponse>(
                service, METHODID_TOKEN_LIST)))
        .addMethod(
          getTokenDocMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.QueryTokenDocRequest,
              com.ixo.token.v1beta1.QueryTokenDocResponse>(
                service, METHODID_TOKEN_DOC)))
        .addMethod(
          getTokenMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.QueryTokenMetadataRequest,
              com.ixo.token.v1beta1.QueryTokenMetadataResponse>(
                service, METHODID_TOKEN_METADATA)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.token.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getTokenListMethod())
              .addMethod(getTokenDocMethod())
              .addMethod(getTokenMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
