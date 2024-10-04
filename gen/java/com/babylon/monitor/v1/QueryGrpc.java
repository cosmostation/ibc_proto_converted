package com.babylon.monitor.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: babylon/monitor/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "babylon.monitor.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest,
      com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> getEndedEpochBtcHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndedEpochBtcHeight",
      requestType = com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest.class,
      responseType = com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest,
      com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> getEndedEpochBtcHeightMethod() {
    io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest, com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> getEndedEpochBtcHeightMethod;
    if ((getEndedEpochBtcHeightMethod = QueryGrpc.getEndedEpochBtcHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEndedEpochBtcHeightMethod = QueryGrpc.getEndedEpochBtcHeightMethod) == null) {
          QueryGrpc.getEndedEpochBtcHeightMethod = getEndedEpochBtcHeightMethod =
              io.grpc.MethodDescriptor.<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest, com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndedEpochBtcHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EndedEpochBtcHeight"))
              .build();
        }
      }
    }
    return getEndedEpochBtcHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest,
      com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> getReportedCheckpointBtcHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportedCheckpointBtcHeight",
      requestType = com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest.class,
      responseType = com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest,
      com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> getReportedCheckpointBtcHeightMethod() {
    io.grpc.MethodDescriptor<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest, com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> getReportedCheckpointBtcHeightMethod;
    if ((getReportedCheckpointBtcHeightMethod = QueryGrpc.getReportedCheckpointBtcHeightMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReportedCheckpointBtcHeightMethod = QueryGrpc.getReportedCheckpointBtcHeightMethod) == null) {
          QueryGrpc.getReportedCheckpointBtcHeightMethod = getReportedCheckpointBtcHeightMethod =
              io.grpc.MethodDescriptor.<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest, com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportedCheckpointBtcHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ReportedCheckpointBtcHeight"))
              .build();
        }
      }
    }
    return getReportedCheckpointBtcHeightMethod;
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
     * EndedEpochBtcHeight returns the BTC light client height at provided epoch
     * finish
     * </pre>
     */
    default void endedEpochBtcHeight(com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest request,
        io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndedEpochBtcHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReportedCheckpointBtcHeight returns the BTC light client height at which
     * the checkpoint with the given hash is reported back to Babylon
     * </pre>
     */
    default void reportedCheckpointBtcHeight(com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest request,
        io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportedCheckpointBtcHeightMethod(), responseObserver);
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
     * EndedEpochBtcHeight returns the BTC light client height at provided epoch
     * finish
     * </pre>
     */
    public void endedEpochBtcHeight(com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest request,
        io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndedEpochBtcHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReportedCheckpointBtcHeight returns the BTC light client height at which
     * the checkpoint with the given hash is reported back to Babylon
     * </pre>
     */
    public void reportedCheckpointBtcHeight(com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest request,
        io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportedCheckpointBtcHeightMethod(), getCallOptions()), request, responseObserver);
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
     * EndedEpochBtcHeight returns the BTC light client height at provided epoch
     * finish
     * </pre>
     */
    public com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse endedEpochBtcHeight(com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndedEpochBtcHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReportedCheckpointBtcHeight returns the BTC light client height at which
     * the checkpoint with the given hash is reported back to Babylon
     * </pre>
     */
    public com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse reportedCheckpointBtcHeight(com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportedCheckpointBtcHeightMethod(), getCallOptions(), request);
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
     * EndedEpochBtcHeight returns the BTC light client height at provided epoch
     * finish
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse> endedEpochBtcHeight(
        com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndedEpochBtcHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReportedCheckpointBtcHeight returns the BTC light client height at which
     * the checkpoint with the given hash is reported back to Babylon
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse> reportedCheckpointBtcHeight(
        com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportedCheckpointBtcHeightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENDED_EPOCH_BTC_HEIGHT = 0;
  private static final int METHODID_REPORTED_CHECKPOINT_BTC_HEIGHT = 1;

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
        case METHODID_ENDED_EPOCH_BTC_HEIGHT:
          serviceImpl.endedEpochBtcHeight((com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse>) responseObserver);
          break;
        case METHODID_REPORTED_CHECKPOINT_BTC_HEIGHT:
          serviceImpl.reportedCheckpointBtcHeight((com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse>) responseObserver);
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
          getEndedEpochBtcHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightRequest,
              com.babylon.monitor.v1.QueryProto.QueryEndedEpochBtcHeightResponse>(
                service, METHODID_ENDED_EPOCH_BTC_HEIGHT)))
        .addMethod(
          getReportedCheckpointBtcHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightRequest,
              com.babylon.monitor.v1.QueryProto.QueryReportedCheckpointBtcHeightResponse>(
                service, METHODID_REPORTED_CHECKPOINT_BTC_HEIGHT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.babylon.monitor.v1.QueryProto.getDescriptor();
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
              .addMethod(getEndedEpochBtcHeightMethod())
              .addMethod(getReportedCheckpointBtcHeightMethod())
              .build();
        }
      }
    }
    return result;
  }
}