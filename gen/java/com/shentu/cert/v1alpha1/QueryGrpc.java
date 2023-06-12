package com.shentu.cert.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for cert module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/cert/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "shentu.cert.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifierRequest,
      com.shentu.cert.v1alpha1.QueryCertifierResponse> getCertifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Certifier",
      requestType = com.shentu.cert.v1alpha1.QueryCertifierRequest.class,
      responseType = com.shentu.cert.v1alpha1.QueryCertifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifierRequest,
      com.shentu.cert.v1alpha1.QueryCertifierResponse> getCertifierMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifierRequest, com.shentu.cert.v1alpha1.QueryCertifierResponse> getCertifierMethod;
    if ((getCertifierMethod = QueryGrpc.getCertifierMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCertifierMethod = QueryGrpc.getCertifierMethod) == null) {
          QueryGrpc.getCertifierMethod = getCertifierMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.QueryCertifierRequest, com.shentu.cert.v1alpha1.QueryCertifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Certifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Certifier"))
              .build();
        }
      }
    }
    return getCertifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifiersRequest,
      com.shentu.cert.v1alpha1.QueryCertifiersResponse> getCertifiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Certifiers",
      requestType = com.shentu.cert.v1alpha1.QueryCertifiersRequest.class,
      responseType = com.shentu.cert.v1alpha1.QueryCertifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifiersRequest,
      com.shentu.cert.v1alpha1.QueryCertifiersResponse> getCertifiersMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertifiersRequest, com.shentu.cert.v1alpha1.QueryCertifiersResponse> getCertifiersMethod;
    if ((getCertifiersMethod = QueryGrpc.getCertifiersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCertifiersMethod = QueryGrpc.getCertifiersMethod) == null) {
          QueryGrpc.getCertifiersMethod = getCertifiersMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.QueryCertifiersRequest, com.shentu.cert.v1alpha1.QueryCertifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Certifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertifiersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Certifiers"))
              .build();
        }
      }
    }
    return getCertifiersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryPlatformRequest,
      com.shentu.cert.v1alpha1.QueryPlatformResponse> getPlatformMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Platform",
      requestType = com.shentu.cert.v1alpha1.QueryPlatformRequest.class,
      responseType = com.shentu.cert.v1alpha1.QueryPlatformResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryPlatformRequest,
      com.shentu.cert.v1alpha1.QueryPlatformResponse> getPlatformMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryPlatformRequest, com.shentu.cert.v1alpha1.QueryPlatformResponse> getPlatformMethod;
    if ((getPlatformMethod = QueryGrpc.getPlatformMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPlatformMethod = QueryGrpc.getPlatformMethod) == null) {
          QueryGrpc.getPlatformMethod = getPlatformMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.QueryPlatformRequest, com.shentu.cert.v1alpha1.QueryPlatformResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Platform"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryPlatformRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryPlatformResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Platform"))
              .build();
        }
      }
    }
    return getPlatformMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificateRequest,
      com.shentu.cert.v1alpha1.QueryCertificateResponse> getCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Certificate",
      requestType = com.shentu.cert.v1alpha1.QueryCertificateRequest.class,
      responseType = com.shentu.cert.v1alpha1.QueryCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificateRequest,
      com.shentu.cert.v1alpha1.QueryCertificateResponse> getCertificateMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificateRequest, com.shentu.cert.v1alpha1.QueryCertificateResponse> getCertificateMethod;
    if ((getCertificateMethod = QueryGrpc.getCertificateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCertificateMethod = QueryGrpc.getCertificateMethod) == null) {
          QueryGrpc.getCertificateMethod = getCertificateMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.QueryCertificateRequest, com.shentu.cert.v1alpha1.QueryCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Certificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Certificate"))
              .build();
        }
      }
    }
    return getCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificatesRequest,
      com.shentu.cert.v1alpha1.QueryCertificatesResponse> getCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Certificates",
      requestType = com.shentu.cert.v1alpha1.QueryCertificatesRequest.class,
      responseType = com.shentu.cert.v1alpha1.QueryCertificatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificatesRequest,
      com.shentu.cert.v1alpha1.QueryCertificatesResponse> getCertificatesMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.QueryCertificatesRequest, com.shentu.cert.v1alpha1.QueryCertificatesResponse> getCertificatesMethod;
    if ((getCertificatesMethod = QueryGrpc.getCertificatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCertificatesMethod = QueryGrpc.getCertificatesMethod) == null) {
          QueryGrpc.getCertificatesMethod = getCertificatesMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.QueryCertificatesRequest, com.shentu.cert.v1alpha1.QueryCertificatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Certificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertificatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.QueryCertificatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Certificates"))
              .build();
        }
      }
    }
    return getCertificatesMethod;
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
   * Query defines the gRPC querier service for cert module.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void certifier(com.shentu.cert.v1alpha1.QueryCertifierRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertifierMethod(), responseObserver);
    }

    /**
     */
    default void certifiers(com.shentu.cert.v1alpha1.QueryCertifiersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifiersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertifiersMethod(), responseObserver);
    }

    /**
     */
    default void platform(com.shentu.cert.v1alpha1.QueryPlatformRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryPlatformResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlatformMethod(), responseObserver);
    }

    /**
     */
    default void certificate(com.shentu.cert.v1alpha1.QueryCertificateRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertificateMethod(), responseObserver);
    }

    /**
     */
    default void certificates(com.shentu.cert.v1alpha1.QueryCertificatesRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertificatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for cert module.
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
   * Query defines the gRPC querier service for cert module.
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
    public void certifier(com.shentu.cert.v1alpha1.QueryCertifierRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void certifiers(com.shentu.cert.v1alpha1.QueryCertifiersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifiersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertifiersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platform(com.shentu.cert.v1alpha1.QueryPlatformRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryPlatformResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlatformMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void certificate(com.shentu.cert.v1alpha1.QueryCertificateRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void certificates(com.shentu.cert.v1alpha1.QueryCertificatesRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertificatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for cert module.
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
    public com.shentu.cert.v1alpha1.QueryCertifierResponse certifier(com.shentu.cert.v1alpha1.QueryCertifierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.QueryCertifiersResponse certifiers(com.shentu.cert.v1alpha1.QueryCertifiersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertifiersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.QueryPlatformResponse platform(com.shentu.cert.v1alpha1.QueryPlatformRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlatformMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.QueryCertificateResponse certificate(com.shentu.cert.v1alpha1.QueryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.QueryCertificatesResponse certificates(com.shentu.cert.v1alpha1.QueryCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertificatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for cert module.
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.QueryCertifierResponse> certifier(
        com.shentu.cert.v1alpha1.QueryCertifierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.QueryCertifiersResponse> certifiers(
        com.shentu.cert.v1alpha1.QueryCertifiersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertifiersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.QueryPlatformResponse> platform(
        com.shentu.cert.v1alpha1.QueryPlatformRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlatformMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.QueryCertificateResponse> certificate(
        com.shentu.cert.v1alpha1.QueryCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.QueryCertificatesResponse> certificates(
        com.shentu.cert.v1alpha1.QueryCertificatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertificatesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CERTIFIER = 0;
  private static final int METHODID_CERTIFIERS = 1;
  private static final int METHODID_PLATFORM = 2;
  private static final int METHODID_CERTIFICATE = 3;
  private static final int METHODID_CERTIFICATES = 4;

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
        case METHODID_CERTIFIER:
          serviceImpl.certifier((com.shentu.cert.v1alpha1.QueryCertifierRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifierResponse>) responseObserver);
          break;
        case METHODID_CERTIFIERS:
          serviceImpl.certifiers((com.shentu.cert.v1alpha1.QueryCertifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertifiersResponse>) responseObserver);
          break;
        case METHODID_PLATFORM:
          serviceImpl.platform((com.shentu.cert.v1alpha1.QueryPlatformRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryPlatformResponse>) responseObserver);
          break;
        case METHODID_CERTIFICATE:
          serviceImpl.certificate((com.shentu.cert.v1alpha1.QueryCertificateRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificateResponse>) responseObserver);
          break;
        case METHODID_CERTIFICATES:
          serviceImpl.certificates((com.shentu.cert.v1alpha1.QueryCertificatesRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.QueryCertificatesResponse>) responseObserver);
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
          getCertifierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.QueryCertifierRequest,
              com.shentu.cert.v1alpha1.QueryCertifierResponse>(
                service, METHODID_CERTIFIER)))
        .addMethod(
          getCertifiersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.QueryCertifiersRequest,
              com.shentu.cert.v1alpha1.QueryCertifiersResponse>(
                service, METHODID_CERTIFIERS)))
        .addMethod(
          getPlatformMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.QueryPlatformRequest,
              com.shentu.cert.v1alpha1.QueryPlatformResponse>(
                service, METHODID_PLATFORM)))
        .addMethod(
          getCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.QueryCertificateRequest,
              com.shentu.cert.v1alpha1.QueryCertificateResponse>(
                service, METHODID_CERTIFICATE)))
        .addMethod(
          getCertificatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.QueryCertificatesRequest,
              com.shentu.cert.v1alpha1.QueryCertificatesResponse>(
                service, METHODID_CERTIFICATES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.cert.v1alpha1.QueryProto.getDescriptor();
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
              .addMethod(getCertifierMethod())
              .addMethod(getCertifiersMethod())
              .addMethod(getPlatformMethod())
              .addMethod(getCertificateMethod())
              .addMethod(getCertificatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
