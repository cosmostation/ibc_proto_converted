package com.comdex.tokenmint.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/tokenmint/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.tokenmint.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> getQueryAllTokenMintedForAllAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllTokenMintedForAllApps",
      requestType = com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest.class,
      responseType = com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> getQueryAllTokenMintedForAllAppsMethod() {
    io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> getQueryAllTokenMintedForAllAppsMethod;
    if ((getQueryAllTokenMintedForAllAppsMethod = QueryGrpc.getQueryAllTokenMintedForAllAppsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllTokenMintedForAllAppsMethod = QueryGrpc.getQueryAllTokenMintedForAllAppsMethod) == null) {
          QueryGrpc.getQueryAllTokenMintedForAllAppsMethod = getQueryAllTokenMintedForAllAppsMethod =
              io.grpc.MethodDescriptor.<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllTokenMintedForAllApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllTokenMintedForAllApps"))
              .build();
        }
      }
    }
    return getQueryAllTokenMintedForAllAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> getQueryTokenMintedByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedByApp",
      requestType = com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest.class,
      responseType = com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> getQueryTokenMintedByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> getQueryTokenMintedByAppMethod;
    if ((getQueryTokenMintedByAppMethod = QueryGrpc.getQueryTokenMintedByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedByAppMethod = QueryGrpc.getQueryTokenMintedByAppMethod) == null) {
          QueryGrpc.getQueryTokenMintedByAppMethod = getQueryTokenMintedByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedByApp"))
              .build();
        }
      }
    }
    return getQueryTokenMintedByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> getQueryTokenMintedByAppAndAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedByAppAndAsset",
      requestType = com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest.class,
      responseType = com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest,
      com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> getQueryTokenMintedByAppAndAssetMethod() {
    io.grpc.MethodDescriptor<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> getQueryTokenMintedByAppAndAssetMethod;
    if ((getQueryTokenMintedByAppAndAssetMethod = QueryGrpc.getQueryTokenMintedByAppAndAssetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedByAppAndAssetMethod = QueryGrpc.getQueryTokenMintedByAppAndAssetMethod) == null) {
          QueryGrpc.getQueryTokenMintedByAppAndAssetMethod = getQueryTokenMintedByAppAndAssetMethod =
              io.grpc.MethodDescriptor.<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest, com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedByAppAndAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedByAppAndAsset"))
              .build();
        }
      }
    }
    return getQueryTokenMintedByAppAndAssetMethod;
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
    default void queryAllTokenMintedForAllApps(com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllTokenMintedForAllAppsMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedByApp(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedByAppAndAsset(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedByAppAndAssetMethod(), responseObserver);
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
    public void queryAllTokenMintedForAllApps(com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllTokenMintedForAllAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedByApp(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedByAppAndAsset(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndAssetMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse queryAllTokenMintedForAllApps(com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllTokenMintedForAllAppsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse queryTokenMintedByApp(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse queryTokenMintedByAppAndAsset(com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedByAppAndAssetMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse> queryAllTokenMintedForAllApps(
        com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllTokenMintedForAllAppsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse> queryTokenMintedByApp(
        com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse> queryTokenMintedByAppAndAsset(
        com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndAssetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_ALL_TOKEN_MINTED_FOR_ALL_APPS = 0;
  private static final int METHODID_QUERY_TOKEN_MINTED_BY_APP = 1;
  private static final int METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_ASSET = 2;

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
        case METHODID_QUERY_ALL_TOKEN_MINTED_FOR_ALL_APPS:
          serviceImpl.queryAllTokenMintedForAllApps((com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_BY_APP:
          serviceImpl.queryTokenMintedByApp((com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_ASSET:
          serviceImpl.queryTokenMintedByAppAndAsset((com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse>) responseObserver);
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
          getQueryAllTokenMintedForAllAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsRequest,
              com.comdex.tokenmint.v1beta1.QueryProto.QueryAllTokenMintedForAllAppsResponse>(
                service, METHODID_QUERY_ALL_TOKEN_MINTED_FOR_ALL_APPS)))
        .addMethod(
          getQueryTokenMintedByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppRequest,
              com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_BY_APP)))
        .addMethod(
          getQueryTokenMintedByAppAndAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetRequest,
              com.comdex.tokenmint.v1beta1.QueryProto.QueryTokenMintedByAppAndAssetResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_ASSET)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.tokenmint.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQueryAllTokenMintedForAllAppsMethod())
              .addMethod(getQueryTokenMintedByAppMethod())
              .addMethod(getQueryTokenMintedByAppAndAssetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
