package com.mars.incentives.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for the incentives module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: mars/incentives/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mars.incentives.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest,
      com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> getScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedule",
      requestType = com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest.class,
      responseType = com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest,
      com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> getScheduleMethod() {
    io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest, com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> getScheduleMethod;
    if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScheduleMethod = QueryGrpc.getScheduleMethod) == null) {
          QueryGrpc.getScheduleMethod = getScheduleMethod =
              io.grpc.MethodDescriptor.<com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest, com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedule"))
              .build();
        }
      }
    }
    return getScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest,
      com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> getSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedules",
      requestType = com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest.class,
      responseType = com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest,
      com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> getSchedulesMethod() {
    io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest, com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> getSchedulesMethod;
    if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchedulesMethod = QueryGrpc.getSchedulesMethod) == null) {
          QueryGrpc.getSchedulesMethod = getSchedulesMethod =
              io.grpc.MethodDescriptor.<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest, com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schedules"))
              .build();
        }
      }
    }
    return getSchedulesMethod;
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
   * Query defines the gRPC querier service for the incentives module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Schedule queries an incentives schedule by identifier
     * </pre>
     */
    default void schedule(com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedules queries all incentives schedules
     * </pre>
     */
    default void schedules(com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for the incentives module
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
   * Query defines the gRPC querier service for the incentives module
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
     * Schedule queries an incentives schedule by identifier
     * </pre>
     */
    public void schedule(com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedules queries all incentives schedules
     * </pre>
     */
    public void schedules(com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for the incentives module
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
     * Schedule queries an incentives schedule by identifier
     * </pre>
     */
    public com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse schedule(com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedules queries all incentives schedules
     * </pre>
     */
    public com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse schedules(com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for the incentives module
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
     * Schedule queries an incentives schedule by identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse> schedule(
        com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedules queries all incentives schedules
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse> schedules(
        com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCHEDULE = 0;
  private static final int METHODID_SCHEDULES = 1;

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
        case METHODID_SCHEDULE:
          serviceImpl.schedule((com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse>) responseObserver);
          break;
        case METHODID_SCHEDULES:
          serviceImpl.schedules((com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest) request,
              (io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse>) responseObserver);
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
          getScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.incentives.v1beta1.QueryProto.QueryScheduleRequest,
              com.mars.incentives.v1beta1.QueryProto.QueryScheduleResponse>(
                service, METHODID_SCHEDULE)))
        .addMethod(
          getSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.incentives.v1beta1.QueryProto.QuerySchedulesRequest,
              com.mars.incentives.v1beta1.QueryProto.QuerySchedulesResponse>(
                service, METHODID_SCHEDULES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mars.incentives.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getScheduleMethod())
              .addMethod(getSchedulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
