package com.stafihub.stafihub.relayers;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/relayers/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.relayers.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryRelayersRequest,
      com.stafihub.stafihub.relayers.QueryRelayersResponse> getRelayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relayers",
      requestType = com.stafihub.stafihub.relayers.QueryRelayersRequest.class,
      responseType = com.stafihub.stafihub.relayers.QueryRelayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryRelayersRequest,
      com.stafihub.stafihub.relayers.QueryRelayersResponse> getRelayersMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryRelayersRequest, com.stafihub.stafihub.relayers.QueryRelayersResponse> getRelayersMethod;
    if ((getRelayersMethod = QueryGrpc.getRelayersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayersMethod = QueryGrpc.getRelayersMethod) == null) {
          QueryGrpc.getRelayersMethod = getRelayersMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.relayers.QueryRelayersRequest, com.stafihub.stafihub.relayers.QueryRelayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.QueryRelayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.QueryRelayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Relayers"))
              .build();
        }
      }
    }
    return getRelayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryThresholdRequest,
      com.stafihub.stafihub.relayers.QueryThresholdResponse> getThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Threshold",
      requestType = com.stafihub.stafihub.relayers.QueryThresholdRequest.class,
      responseType = com.stafihub.stafihub.relayers.QueryThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryThresholdRequest,
      com.stafihub.stafihub.relayers.QueryThresholdResponse> getThresholdMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.QueryThresholdRequest, com.stafihub.stafihub.relayers.QueryThresholdResponse> getThresholdMethod;
    if ((getThresholdMethod = QueryGrpc.getThresholdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getThresholdMethod = QueryGrpc.getThresholdMethod) == null) {
          QueryGrpc.getThresholdMethod = getThresholdMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.relayers.QueryThresholdRequest, com.stafihub.stafihub.relayers.QueryThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Threshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.QueryThresholdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.QueryThresholdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Threshold"))
              .build();
        }
      }
    }
    return getThresholdMethod;
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
     * Queries a list of relayersByDenom items.
     * </pre>
     */
    default void relayers(com.stafihub.stafihub.relayers.QueryRelayersRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryRelayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a threshold by denom.
     * </pre>
     */
    default void threshold(com.stafihub.stafihub.relayers.QueryThresholdRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryThresholdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getThresholdMethod(), responseObserver);
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
     * Queries a list of relayersByDenom items.
     * </pre>
     */
    public void relayers(com.stafihub.stafihub.relayers.QueryRelayersRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryRelayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a threshold by denom.
     * </pre>
     */
    public void threshold(com.stafihub.stafihub.relayers.QueryThresholdRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryThresholdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getThresholdMethod(), getCallOptions()), request, responseObserver);
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
     * Queries a list of relayersByDenom items.
     * </pre>
     */
    public com.stafihub.stafihub.relayers.QueryRelayersResponse relayers(com.stafihub.stafihub.relayers.QueryRelayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a threshold by denom.
     * </pre>
     */
    public com.stafihub.stafihub.relayers.QueryThresholdResponse threshold(com.stafihub.stafihub.relayers.QueryThresholdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getThresholdMethod(), getCallOptions(), request);
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
     * Queries a list of relayersByDenom items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.relayers.QueryRelayersResponse> relayers(
        com.stafihub.stafihub.relayers.QueryRelayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a threshold by denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.relayers.QueryThresholdResponse> threshold(
        com.stafihub.stafihub.relayers.QueryThresholdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RELAYERS = 0;
  private static final int METHODID_THRESHOLD = 1;

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
        case METHODID_RELAYERS:
          serviceImpl.relayers((com.stafihub.stafihub.relayers.QueryRelayersRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryRelayersResponse>) responseObserver);
          break;
        case METHODID_THRESHOLD:
          serviceImpl.threshold((com.stafihub.stafihub.relayers.QueryThresholdRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.QueryThresholdResponse>) responseObserver);
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
          getRelayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.relayers.QueryRelayersRequest,
              com.stafihub.stafihub.relayers.QueryRelayersResponse>(
                service, METHODID_RELAYERS)))
        .addMethod(
          getThresholdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.relayers.QueryThresholdRequest,
              com.stafihub.stafihub.relayers.QueryThresholdResponse>(
                service, METHODID_THRESHOLD)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.relayers.QueryProto.getDescriptor();
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
              .addMethod(getRelayersMethod())
              .addMethod(getThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
