package com.ixo.entity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/entity/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ixo.entity.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryParamsRequest,
      com.ixo.entity.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ixo.entity.v1beta1.QueryParamsRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryParamsRequest,
      com.ixo.entity.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryParamsRequest, com.ixo.entity.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryParamsRequest, com.ixo.entity.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityRequest,
      com.ixo.entity.v1beta1.QueryEntityResponse> getEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entity",
      requestType = com.ixo.entity.v1beta1.QueryEntityRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityRequest,
      com.ixo.entity.v1beta1.QueryEntityResponse> getEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityRequest, com.ixo.entity.v1beta1.QueryEntityResponse> getEntityMethod;
    if ((getEntityMethod = QueryGrpc.getEntityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEntityMethod = QueryGrpc.getEntityMethod) == null) {
          QueryGrpc.getEntityMethod = getEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryEntityRequest, com.ixo.entity.v1beta1.QueryEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Entity"))
              .build();
        }
      }
    }
    return getEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityMetadataRequest,
      com.ixo.entity.v1beta1.QueryEntityMetadataResponse> getEntityMetaDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EntityMetaData",
      requestType = com.ixo.entity.v1beta1.QueryEntityMetadataRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryEntityMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityMetadataRequest,
      com.ixo.entity.v1beta1.QueryEntityMetadataResponse> getEntityMetaDataMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityMetadataRequest, com.ixo.entity.v1beta1.QueryEntityMetadataResponse> getEntityMetaDataMethod;
    if ((getEntityMetaDataMethod = QueryGrpc.getEntityMetaDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEntityMetaDataMethod = QueryGrpc.getEntityMetaDataMethod) == null) {
          QueryGrpc.getEntityMetaDataMethod = getEntityMetaDataMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryEntityMetadataRequest, com.ixo.entity.v1beta1.QueryEntityMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EntityMetaData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EntityMetaData"))
              .build();
        }
      }
    }
    return getEntityMetaDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest,
      com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> getEntityIidDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EntityIidDocument",
      requestType = com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest,
      com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> getEntityIidDocumentMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest, com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> getEntityIidDocumentMethod;
    if ((getEntityIidDocumentMethod = QueryGrpc.getEntityIidDocumentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEntityIidDocumentMethod = QueryGrpc.getEntityIidDocumentMethod) == null) {
          QueryGrpc.getEntityIidDocumentMethod = getEntityIidDocumentMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest, com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EntityIidDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EntityIidDocument"))
              .build();
        }
      }
    }
    return getEntityIidDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityVerifiedRequest,
      com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> getEntityVerifiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EntityVerified",
      requestType = com.ixo.entity.v1beta1.QueryEntityVerifiedRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryEntityVerifiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityVerifiedRequest,
      com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> getEntityVerifiedMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityVerifiedRequest, com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> getEntityVerifiedMethod;
    if ((getEntityVerifiedMethod = QueryGrpc.getEntityVerifiedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEntityVerifiedMethod = QueryGrpc.getEntityVerifiedMethod) == null) {
          QueryGrpc.getEntityVerifiedMethod = getEntityVerifiedMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryEntityVerifiedRequest, com.ixo.entity.v1beta1.QueryEntityVerifiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EntityVerified"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityVerifiedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityVerifiedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EntityVerified"))
              .build();
        }
      }
    }
    return getEntityVerifiedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityListRequest,
      com.ixo.entity.v1beta1.QueryEntityListResponse> getEntityListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EntityList",
      requestType = com.ixo.entity.v1beta1.QueryEntityListRequest.class,
      responseType = com.ixo.entity.v1beta1.QueryEntityListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityListRequest,
      com.ixo.entity.v1beta1.QueryEntityListResponse> getEntityListMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.QueryEntityListRequest, com.ixo.entity.v1beta1.QueryEntityListResponse> getEntityListMethod;
    if ((getEntityListMethod = QueryGrpc.getEntityListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEntityListMethod = QueryGrpc.getEntityListMethod) == null) {
          QueryGrpc.getEntityListMethod = getEntityListMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.QueryEntityListRequest, com.ixo.entity.v1beta1.QueryEntityListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EntityList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.QueryEntityListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EntityList"))
              .build();
        }
      }
    }
    return getEntityListMethod;
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
    default void params(com.ixo.entity.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void entity(com.ixo.entity.v1beta1.QueryEntityRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntityMethod(), responseObserver);
    }

    /**
     */
    default void entityMetaData(com.ixo.entity.v1beta1.QueryEntityMetadataRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntityMetaDataMethod(), responseObserver);
    }

    /**
     */
    default void entityIidDocument(com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntityIidDocumentMethod(), responseObserver);
    }

    /**
     */
    default void entityVerified(com.ixo.entity.v1beta1.QueryEntityVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntityVerifiedMethod(), responseObserver);
    }

    /**
     */
    default void entityList(com.ixo.entity.v1beta1.QueryEntityListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntityListMethod(), responseObserver);
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
    public void params(com.ixo.entity.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void entity(com.ixo.entity.v1beta1.QueryEntityRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void entityMetaData(com.ixo.entity.v1beta1.QueryEntityMetadataRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntityMetaDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void entityIidDocument(com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntityIidDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void entityVerified(com.ixo.entity.v1beta1.QueryEntityVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntityVerifiedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void entityList(com.ixo.entity.v1beta1.QueryEntityListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEntityListMethod(), getCallOptions()), request, responseObserver);
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
    public com.ixo.entity.v1beta1.QueryParamsResponse params(com.ixo.entity.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.entity.v1beta1.QueryEntityResponse entity(com.ixo.entity.v1beta1.QueryEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.entity.v1beta1.QueryEntityMetadataResponse entityMetaData(com.ixo.entity.v1beta1.QueryEntityMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntityMetaDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse entityIidDocument(com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntityIidDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.entity.v1beta1.QueryEntityVerifiedResponse entityVerified(com.ixo.entity.v1beta1.QueryEntityVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntityVerifiedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.entity.v1beta1.QueryEntityListResponse entityList(com.ixo.entity.v1beta1.QueryEntityListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEntityListMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryParamsResponse> params(
        com.ixo.entity.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryEntityResponse> entity(
        com.ixo.entity.v1beta1.QueryEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryEntityMetadataResponse> entityMetaData(
        com.ixo.entity.v1beta1.QueryEntityMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntityMetaDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse> entityIidDocument(
        com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntityIidDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryEntityVerifiedResponse> entityVerified(
        com.ixo.entity.v1beta1.QueryEntityVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntityVerifiedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.QueryEntityListResponse> entityList(
        com.ixo.entity.v1beta1.QueryEntityListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEntityListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ENTITY = 1;
  private static final int METHODID_ENTITY_META_DATA = 2;
  private static final int METHODID_ENTITY_IID_DOCUMENT = 3;
  private static final int METHODID_ENTITY_VERIFIED = 4;
  private static final int METHODID_ENTITY_LIST = 5;

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
          serviceImpl.params((com.ixo.entity.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ENTITY:
          serviceImpl.entity((com.ixo.entity.v1beta1.QueryEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityResponse>) responseObserver);
          break;
        case METHODID_ENTITY_META_DATA:
          serviceImpl.entityMetaData((com.ixo.entity.v1beta1.QueryEntityMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityMetadataResponse>) responseObserver);
          break;
        case METHODID_ENTITY_IID_DOCUMENT:
          serviceImpl.entityIidDocument((com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse>) responseObserver);
          break;
        case METHODID_ENTITY_VERIFIED:
          serviceImpl.entityVerified((com.ixo.entity.v1beta1.QueryEntityVerifiedRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityVerifiedResponse>) responseObserver);
          break;
        case METHODID_ENTITY_LIST:
          serviceImpl.entityList((com.ixo.entity.v1beta1.QueryEntityListRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.QueryEntityListResponse>) responseObserver);
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
              com.ixo.entity.v1beta1.QueryParamsRequest,
              com.ixo.entity.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.QueryEntityRequest,
              com.ixo.entity.v1beta1.QueryEntityResponse>(
                service, METHODID_ENTITY)))
        .addMethod(
          getEntityMetaDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.QueryEntityMetadataRequest,
              com.ixo.entity.v1beta1.QueryEntityMetadataResponse>(
                service, METHODID_ENTITY_META_DATA)))
        .addMethod(
          getEntityIidDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.QueryEntityIidDocumentRequest,
              com.ixo.entity.v1beta1.QueryEntityIidDocumentResponse>(
                service, METHODID_ENTITY_IID_DOCUMENT)))
        .addMethod(
          getEntityVerifiedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.QueryEntityVerifiedRequest,
              com.ixo.entity.v1beta1.QueryEntityVerifiedResponse>(
                service, METHODID_ENTITY_VERIFIED)))
        .addMethod(
          getEntityListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.QueryEntityListRequest,
              com.ixo.entity.v1beta1.QueryEntityListResponse>(
                service, METHODID_ENTITY_LIST)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.entity.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getEntityMethod())
              .addMethod(getEntityMetaDataMethod())
              .addMethod(getEntityIidDocumentMethod())
              .addMethod(getEntityVerifiedMethod())
              .addMethod(getEntityListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
