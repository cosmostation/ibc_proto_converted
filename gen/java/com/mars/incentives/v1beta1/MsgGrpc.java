package com.mars.incentives.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the incentives module's Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: mars/incentives/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mars.incentives.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule,
      com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> getCreateScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSchedule",
      requestType = com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule.class,
      responseType = com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule,
      com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> getCreateScheduleMethod() {
    io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule, com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> getCreateScheduleMethod;
    if ((getCreateScheduleMethod = MsgGrpc.getCreateScheduleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateScheduleMethod = MsgGrpc.getCreateScheduleMethod) == null) {
          MsgGrpc.getCreateScheduleMethod = getCreateScheduleMethod =
              io.grpc.MethodDescriptor.<com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule, com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSchedule"))
              .build();
        }
      }
    }
    return getCreateScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules,
      com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateSchedules",
      requestType = com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules.class,
      responseType = com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules,
      com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod() {
    io.grpc.MethodDescriptor<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules, com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> getTerminateSchedulesMethod;
    if ((getTerminateSchedulesMethod = MsgGrpc.getTerminateSchedulesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTerminateSchedulesMethod = MsgGrpc.getTerminateSchedulesMethod) == null) {
          MsgGrpc.getTerminateSchedulesMethod = getTerminateSchedulesMethod =
              io.grpc.MethodDescriptor.<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules, com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TerminateSchedules"))
              .build();
        }
      }
    }
    return getTerminateSchedulesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    default void createSchedule(com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    default void terminateSchedules(com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateSchedulesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public void createSchedule(com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public void terminateSchedules(com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules request,
        io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateSchedulesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse createSchedule(com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse terminateSchedules(com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateSchedulesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the incentives module's Msg service
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSchedule is a governance operation for creating a new incentives
     * schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse> createSchedule(
        com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TerminateSchedule is a governance operation for terminating one or more
     * existing incentives schedules.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse> terminateSchedules(
        com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateSchedulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SCHEDULE = 0;
  private static final int METHODID_TERMINATE_SCHEDULES = 1;

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
        case METHODID_CREATE_SCHEDULE:
          serviceImpl.createSchedule((com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule) request,
              (io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_SCHEDULES:
          serviceImpl.terminateSchedules((com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules) request,
              (io.grpc.stub.StreamObserver<com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse>) responseObserver);
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
          getCreateScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.incentives.v1beta1.TxProto.MsgCreateSchedule,
              com.mars.incentives.v1beta1.TxProto.MsgCreateScheduleResponse>(
                service, METHODID_CREATE_SCHEDULE)))
        .addMethod(
          getTerminateSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedules,
              com.mars.incentives.v1beta1.TxProto.MsgTerminateSchedulesResponse>(
                service, METHODID_TERMINATE_SCHEDULES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mars.incentives.v1beta1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getCreateScheduleMethod())
              .addMethod(getTerminateSchedulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
