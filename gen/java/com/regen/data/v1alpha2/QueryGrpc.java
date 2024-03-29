package com.regen.data.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query is the regen.data.v1alpha2 Query service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/data/v1alpha2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "regen.data.v1alpha2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest,
      com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> getByIRIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ByIRI",
      requestType = com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest.class,
      responseType = com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest,
      com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> getByIRIMethod() {
    io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest, com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> getByIRIMethod;
    if ((getByIRIMethod = QueryGrpc.getByIRIMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getByIRIMethod = QueryGrpc.getByIRIMethod) == null) {
          QueryGrpc.getByIRIMethod = getByIRIMethod =
              io.grpc.MethodDescriptor.<com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest, com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ByIRI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ByIRI"))
              .build();
        }
      }
    }
    return getByIRIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest,
      com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> getBySignerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BySigner",
      requestType = com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest.class,
      responseType = com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest,
      com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> getBySignerMethod() {
    io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest, com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> getBySignerMethod;
    if ((getBySignerMethod = QueryGrpc.getBySignerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBySignerMethod = QueryGrpc.getBySignerMethod) == null) {
          QueryGrpc.getBySignerMethod = getBySignerMethod =
              io.grpc.MethodDescriptor.<com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest, com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BySigner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BySigner"))
              .build();
        }
      }
    }
    return getBySignerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QuerySignersRequest,
      com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> getSignersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Signers",
      requestType = com.regen.data.v1alpha2.QueryProto.QuerySignersRequest.class,
      responseType = com.regen.data.v1alpha2.QueryProto.QuerySignersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QuerySignersRequest,
      com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> getSignersMethod() {
    io.grpc.MethodDescriptor<com.regen.data.v1alpha2.QueryProto.QuerySignersRequest, com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> getSignersMethod;
    if ((getSignersMethod = QueryGrpc.getSignersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignersMethod = QueryGrpc.getSignersMethod) == null) {
          QueryGrpc.getSignersMethod = getSignersMethod =
              io.grpc.MethodDescriptor.<com.regen.data.v1alpha2.QueryProto.QuerySignersRequest, com.regen.data.v1alpha2.QueryProto.QuerySignersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Signers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QuerySignersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.QueryProto.QuerySignersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Signers"))
              .build();
        }
      }
    }
    return getSignersMethod;
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
   * Query is the regen.data.v1alpha2 Query service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ByHash queries data based on its ContentHash.
     * </pre>
     */
    default void byIRI(com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getByIRIMethod(), responseObserver);
    }

    /**
     * <pre>
     * BySigner queries data based on signers.
     * </pre>
     */
    default void bySigner(com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBySignerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Signers queries signers based on IRI.
     * </pre>
     */
    default void signers(com.regen.data.v1alpha2.QueryProto.QuerySignersRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query is the regen.data.v1alpha2 Query service
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
   * Query is the regen.data.v1alpha2 Query service
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
     * ByHash queries data based on its ContentHash.
     * </pre>
     */
    public void byIRI(com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getByIRIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BySigner queries data based on signers.
     * </pre>
     */
    public void bySigner(com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBySignerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signers queries signers based on IRI.
     * </pre>
     */
    public void signers(com.regen.data.v1alpha2.QueryProto.QuerySignersRequest request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query is the regen.data.v1alpha2 Query service
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
     * ByHash queries data based on its ContentHash.
     * </pre>
     */
    public com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse byIRI(com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getByIRIMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BySigner queries data based on signers.
     * </pre>
     */
    public com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse bySigner(com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBySignerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Signers queries signers based on IRI.
     * </pre>
     */
    public com.regen.data.v1alpha2.QueryProto.QuerySignersResponse signers(com.regen.data.v1alpha2.QueryProto.QuerySignersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query is the regen.data.v1alpha2 Query service
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
     * ByHash queries data based on its ContentHash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse> byIRI(
        com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getByIRIMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BySigner queries data based on signers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse> bySigner(
        com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBySignerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Signers queries signers based on IRI.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.data.v1alpha2.QueryProto.QuerySignersResponse> signers(
        com.regen.data.v1alpha2.QueryProto.QuerySignersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BY_IRI = 0;
  private static final int METHODID_BY_SIGNER = 1;
  private static final int METHODID_SIGNERS = 2;

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
        case METHODID_BY_IRI:
          serviceImpl.byIRI((com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse>) responseObserver);
          break;
        case METHODID_BY_SIGNER:
          serviceImpl.bySigner((com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse>) responseObserver);
          break;
        case METHODID_SIGNERS:
          serviceImpl.signers((com.regen.data.v1alpha2.QueryProto.QuerySignersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.QueryProto.QuerySignersResponse>) responseObserver);
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
          getByIRIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.data.v1alpha2.QueryProto.QueryByIRIRequest,
              com.regen.data.v1alpha2.QueryProto.QueryByIRIResponse>(
                service, METHODID_BY_IRI)))
        .addMethod(
          getBySignerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.data.v1alpha2.QueryProto.QueryBySignerRequest,
              com.regen.data.v1alpha2.QueryProto.QueryBySignerResponse>(
                service, METHODID_BY_SIGNER)))
        .addMethod(
          getSignersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.data.v1alpha2.QueryProto.QuerySignersRequest,
              com.regen.data.v1alpha2.QueryProto.QuerySignersResponse>(
                service, METHODID_SIGNERS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.data.v1alpha2.QueryProto.getDescriptor();
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
              .addMethod(getByIRIMethod())
              .addMethod(getBySignerMethod())
              .addMethod(getSignersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
