package com.panacea.datadeal.v2alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/datadeal/v2alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.datadeal.v2alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> getDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deal",
      requestType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest.class,
      responseType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> getDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> getDealMethod;
    if ((getDealMethod = QueryGrpc.getDealMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDealMethod = QueryGrpc.getDealMethod) == null) {
          QueryGrpc.getDealMethod = getDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deal"))
              .build();
        }
      }
    }
    return getDealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> getDealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deals",
      requestType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest.class,
      responseType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> getDealsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> getDealsMethod;
    if ((getDealsMethod = QueryGrpc.getDealsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDealsMethod = QueryGrpc.getDealsMethod) == null) {
          QueryGrpc.getDealsMethod = getDealsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deals"))
              .build();
        }
      }
    }
    return getDealsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> getDataCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataCert",
      requestType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest.class,
      responseType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> getDataCertMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> getDataCertMethod;
    if ((getDataCertMethod = QueryGrpc.getDataCertMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataCertMethod = QueryGrpc.getDataCertMethod) == null) {
          QueryGrpc.getDataCertMethod = getDataCertMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataCert"))
              .build();
        }
      }
    }
    return getDataCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataCerts",
      requestType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest.class,
      responseType = com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest,
      com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod;
    if ((getDataCertsMethod = QueryGrpc.getDataCertsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataCertsMethod = QueryGrpc.getDataCertsMethod) == null) {
          QueryGrpc.getDataCertsMethod = getDataCertsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest, com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataCerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataCerts"))
              .build();
        }
      }
    }
    return getDataCertsMethod;
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
     * Deal returns a Deal.
     * </pre>
     */
    default void deal(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDealMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deals returns multiple deals
     * </pre>
     */
    default void deals(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDealsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataCert returns a DataCert.
     * </pre>
     */
    default void dataCert(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataCertMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataCerts return DataCerts.
     * </pre>
     */
    default void dataCerts(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataCertsMethod(), responseObserver);
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
     * Deal returns a Deal.
     * </pre>
     */
    public void deal(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deals returns multiple deals
     * </pre>
     */
    public void deals(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDealsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataCert returns a DataCert.
     * </pre>
     */
    public void dataCert(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataCerts return DataCerts.
     * </pre>
     */
    public void dataCerts(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataCertsMethod(), getCallOptions()), request, responseObserver);
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
     * Deal returns a Deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse deal(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deals returns multiple deals
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse deals(com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDealsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataCert returns a DataCert.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse dataCert(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataCertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataCerts return DataCerts.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse dataCerts(com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataCertsMethod(), getCallOptions(), request);
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
     * Deal returns a Deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse> deal(
        com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deals returns multiple deals
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse> deals(
        com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDealsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataCert returns a DataCert.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse> dataCert(
        com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataCertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataCerts return DataCerts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse> dataCerts(
        com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataCertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEAL = 0;
  private static final int METHODID_DEALS = 1;
  private static final int METHODID_DATA_CERT = 2;
  private static final int METHODID_DATA_CERTS = 3;

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
        case METHODID_DEAL:
          serviceImpl.deal((com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse>) responseObserver);
          break;
        case METHODID_DEALS:
          serviceImpl.deals((com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse>) responseObserver);
          break;
        case METHODID_DATA_CERT:
          serviceImpl.dataCert((com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse>) responseObserver);
          break;
        case METHODID_DATA_CERTS:
          serviceImpl.dataCerts((com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse>) responseObserver);
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
          getDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDealRequest,
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDealResponse>(
                service, METHODID_DEAL)))
        .addMethod(
          getDealsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsRequest,
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDealsResponse>(
                service, METHODID_DEALS)))
        .addMethod(
          getDataCertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertRequest,
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertResponse>(
                service, METHODID_DATA_CERT)))
        .addMethod(
          getDataCertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsRequest,
              com.panacea.datadeal.v2alpha1.QueryProto.QueryDataCertsResponse>(
                service, METHODID_DATA_CERTS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datadeal.v2alpha1.QueryProto.getDescriptor();
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
              .addMethod(getDealMethod())
              .addMethod(getDealsMethod())
              .addMethod(getDataCertMethod())
              .addMethod(getDataCertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
