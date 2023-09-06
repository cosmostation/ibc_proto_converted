package com.canto.fees.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the fees Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: canto/fees/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "canto.fees.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgRegisterFee,
      com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> getRegisterFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterFee",
      requestType = com.canto.fees.v1.TxProto.MsgRegisterFee.class,
      responseType = com.canto.fees.v1.TxProto.MsgRegisterFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgRegisterFee,
      com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> getRegisterFeeMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgRegisterFee, com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> getRegisterFeeMethod;
    if ((getRegisterFeeMethod = MsgGrpc.getRegisterFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterFeeMethod = MsgGrpc.getRegisterFeeMethod) == null) {
          MsgGrpc.getRegisterFeeMethod = getRegisterFeeMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.TxProto.MsgRegisterFee, com.canto.fees.v1.TxProto.MsgRegisterFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgRegisterFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgRegisterFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterFee"))
              .build();
        }
      }
    }
    return getRegisterFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgCancelFee,
      com.canto.fees.v1.TxProto.MsgCancelFeeResponse> getCancelFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFee",
      requestType = com.canto.fees.v1.TxProto.MsgCancelFee.class,
      responseType = com.canto.fees.v1.TxProto.MsgCancelFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgCancelFee,
      com.canto.fees.v1.TxProto.MsgCancelFeeResponse> getCancelFeeMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgCancelFee, com.canto.fees.v1.TxProto.MsgCancelFeeResponse> getCancelFeeMethod;
    if ((getCancelFeeMethod = MsgGrpc.getCancelFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelFeeMethod = MsgGrpc.getCancelFeeMethod) == null) {
          MsgGrpc.getCancelFeeMethod = getCancelFeeMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.TxProto.MsgCancelFee, com.canto.fees.v1.TxProto.MsgCancelFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgCancelFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgCancelFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelFee"))
              .build();
        }
      }
    }
    return getCancelFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgUpdateFee,
      com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> getUpdateFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFee",
      requestType = com.canto.fees.v1.TxProto.MsgUpdateFee.class,
      responseType = com.canto.fees.v1.TxProto.MsgUpdateFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgUpdateFee,
      com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> getUpdateFeeMethod() {
    io.grpc.MethodDescriptor<com.canto.fees.v1.TxProto.MsgUpdateFee, com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> getUpdateFeeMethod;
    if ((getUpdateFeeMethod = MsgGrpc.getUpdateFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateFeeMethod = MsgGrpc.getUpdateFeeMethod) == null) {
          MsgGrpc.getUpdateFeeMethod = getUpdateFeeMethod =
              io.grpc.MethodDescriptor.<com.canto.fees.v1.TxProto.MsgUpdateFee, com.canto.fees.v1.TxProto.MsgUpdateFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgUpdateFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.fees.v1.TxProto.MsgUpdateFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateFee"))
              .build();
        }
      }
    }
    return getUpdateFeeMethod;
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
   * Msg defines the fees Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    default void registerFee(com.canto.fees.v1.TxProto.MsgRegisterFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    default void cancelFee(com.canto.fees.v1.TxProto.MsgCancelFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgCancelFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    default void updateFee(com.canto.fees.v1.TxProto.MsgUpdateFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public void registerFee(com.canto.fees.v1.TxProto.MsgRegisterFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public void cancelFee(com.canto.fees.v1.TxProto.MsgCancelFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgCancelFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public void updateFee(com.canto.fees.v1.TxProto.MsgUpdateFee request,
        io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.canto.fees.v1.TxProto.MsgRegisterFeeResponse registerFee(com.canto.fees.v1.TxProto.MsgRegisterFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public com.canto.fees.v1.TxProto.MsgCancelFeeResponse cancelFee(com.canto.fees.v1.TxProto.MsgCancelFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public com.canto.fees.v1.TxProto.MsgUpdateFeeResponse updateFee(com.canto.fees.v1.TxProto.MsgUpdateFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterFee registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.TxProto.MsgRegisterFeeResponse> registerFee(
        com.canto.fees.v1.TxProto.MsgRegisterFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelFee cancels a contract's fee registration and further receival of
     * transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.TxProto.MsgCancelFeeResponse> cancelFee(
        com.canto.fees.v1.TxProto.MsgCancelFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFee updates the withdraw address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.fees.v1.TxProto.MsgUpdateFeeResponse> updateFee(
        com.canto.fees.v1.TxProto.MsgUpdateFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_FEE = 0;
  private static final int METHODID_CANCEL_FEE = 1;
  private static final int METHODID_UPDATE_FEE = 2;

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
        case METHODID_REGISTER_FEE:
          serviceImpl.registerFee((com.canto.fees.v1.TxProto.MsgRegisterFee) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgRegisterFeeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_FEE:
          serviceImpl.cancelFee((com.canto.fees.v1.TxProto.MsgCancelFee) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgCancelFeeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEE:
          serviceImpl.updateFee((com.canto.fees.v1.TxProto.MsgUpdateFee) request,
              (io.grpc.stub.StreamObserver<com.canto.fees.v1.TxProto.MsgUpdateFeeResponse>) responseObserver);
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
          getRegisterFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.TxProto.MsgRegisterFee,
              com.canto.fees.v1.TxProto.MsgRegisterFeeResponse>(
                service, METHODID_REGISTER_FEE)))
        .addMethod(
          getCancelFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.TxProto.MsgCancelFee,
              com.canto.fees.v1.TxProto.MsgCancelFeeResponse>(
                service, METHODID_CANCEL_FEE)))
        .addMethod(
          getUpdateFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.fees.v1.TxProto.MsgUpdateFee,
              com.canto.fees.v1.TxProto.MsgUpdateFeeResponse>(
                service, METHODID_UPDATE_FEE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.fees.v1.TxProto.getDescriptor();
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
              .addMethod(getRegisterFeeMethod())
              .addMethod(getCancelFeeMethod())
              .addMethod(getUpdateFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
