package com.ixo.iid.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/iid/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ixo.iid.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentsRequest,
      com.ixo.iid.v1beta1.QueryIidDocumentsResponse> getIidDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IidDocuments",
      requestType = com.ixo.iid.v1beta1.QueryIidDocumentsRequest.class,
      responseType = com.ixo.iid.v1beta1.QueryIidDocumentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentsRequest,
      com.ixo.iid.v1beta1.QueryIidDocumentsResponse> getIidDocumentsMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentsRequest, com.ixo.iid.v1beta1.QueryIidDocumentsResponse> getIidDocumentsMethod;
    if ((getIidDocumentsMethod = QueryGrpc.getIidDocumentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIidDocumentsMethod = QueryGrpc.getIidDocumentsMethod) == null) {
          QueryGrpc.getIidDocumentsMethod = getIidDocumentsMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.QueryIidDocumentsRequest, com.ixo.iid.v1beta1.QueryIidDocumentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IidDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.QueryIidDocumentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.QueryIidDocumentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IidDocuments"))
              .build();
        }
      }
    }
    return getIidDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentRequest,
      com.ixo.iid.v1beta1.QueryIidDocumentResponse> getIidDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IidDocument",
      requestType = com.ixo.iid.v1beta1.QueryIidDocumentRequest.class,
      responseType = com.ixo.iid.v1beta1.QueryIidDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentRequest,
      com.ixo.iid.v1beta1.QueryIidDocumentResponse> getIidDocumentMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.QueryIidDocumentRequest, com.ixo.iid.v1beta1.QueryIidDocumentResponse> getIidDocumentMethod;
    if ((getIidDocumentMethod = QueryGrpc.getIidDocumentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIidDocumentMethod = QueryGrpc.getIidDocumentMethod) == null) {
          QueryGrpc.getIidDocumentMethod = getIidDocumentMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.QueryIidDocumentRequest, com.ixo.iid.v1beta1.QueryIidDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IidDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.QueryIidDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.QueryIidDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IidDocument"))
              .build();
        }
      }
    }
    return getIidDocumentMethod;
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
     * IidDocuments queries all iid documents that match the given status.
     * </pre>
     */
    default void iidDocuments(com.ixo.iid.v1beta1.QueryIidDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIidDocumentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IidDocument queries a iid documents with an id.
     * </pre>
     */
    default void iidDocument(com.ixo.iid.v1beta1.QueryIidDocumentRequest request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIidDocumentMethod(), responseObserver);
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
     * IidDocuments queries all iid documents that match the given status.
     * </pre>
     */
    public void iidDocuments(com.ixo.iid.v1beta1.QueryIidDocumentsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIidDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IidDocument queries a iid documents with an id.
     * </pre>
     */
    public void iidDocument(com.ixo.iid.v1beta1.QueryIidDocumentRequest request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIidDocumentMethod(), getCallOptions()), request, responseObserver);
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
     * IidDocuments queries all iid documents that match the given status.
     * </pre>
     */
    public com.ixo.iid.v1beta1.QueryIidDocumentsResponse iidDocuments(com.ixo.iid.v1beta1.QueryIidDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIidDocumentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IidDocument queries a iid documents with an id.
     * </pre>
     */
    public com.ixo.iid.v1beta1.QueryIidDocumentResponse iidDocument(com.ixo.iid.v1beta1.QueryIidDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIidDocumentMethod(), getCallOptions(), request);
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
     * IidDocuments queries all iid documents that match the given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.QueryIidDocumentsResponse> iidDocuments(
        com.ixo.iid.v1beta1.QueryIidDocumentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIidDocumentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IidDocument queries a iid documents with an id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.QueryIidDocumentResponse> iidDocument(
        com.ixo.iid.v1beta1.QueryIidDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIidDocumentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IID_DOCUMENTS = 0;
  private static final int METHODID_IID_DOCUMENT = 1;

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
        case METHODID_IID_DOCUMENTS:
          serviceImpl.iidDocuments((com.ixo.iid.v1beta1.QueryIidDocumentsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentsResponse>) responseObserver);
          break;
        case METHODID_IID_DOCUMENT:
          serviceImpl.iidDocument((com.ixo.iid.v1beta1.QueryIidDocumentRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.QueryIidDocumentResponse>) responseObserver);
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
          getIidDocumentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.QueryIidDocumentsRequest,
              com.ixo.iid.v1beta1.QueryIidDocumentsResponse>(
                service, METHODID_IID_DOCUMENTS)))
        .addMethod(
          getIidDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.QueryIidDocumentRequest,
              com.ixo.iid.v1beta1.QueryIidDocumentResponse>(
                service, METHODID_IID_DOCUMENT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.iid.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getIidDocumentsMethod())
              .addMethod(getIidDocumentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
