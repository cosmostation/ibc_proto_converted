package com.juno.feeshare.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the fees Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: juno/feeshare/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "juno.feeshare.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare,
      com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> getRegisterFeeShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterFeeShare",
      requestType = com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare.class,
      responseType = com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare,
      com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> getRegisterFeeShareMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare, com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> getRegisterFeeShareMethod;
    if ((getRegisterFeeShareMethod = MsgGrpc.getRegisterFeeShareMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterFeeShareMethod = MsgGrpc.getRegisterFeeShareMethod) == null) {
          MsgGrpc.getRegisterFeeShareMethod = getRegisterFeeShareMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare, com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterFeeShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterFeeShare"))
              .build();
        }
      }
    }
    return getRegisterFeeShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare,
      com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> getUpdateFeeShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFeeShare",
      requestType = com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare.class,
      responseType = com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare,
      com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> getUpdateFeeShareMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare, com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> getUpdateFeeShareMethod;
    if ((getUpdateFeeShareMethod = MsgGrpc.getUpdateFeeShareMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateFeeShareMethod = MsgGrpc.getUpdateFeeShareMethod) == null) {
          MsgGrpc.getUpdateFeeShareMethod = getUpdateFeeShareMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare, com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFeeShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateFeeShare"))
              .build();
        }
      }
    }
    return getUpdateFeeShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgCancelFeeShare,
      com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> getCancelFeeShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFeeShare",
      requestType = com.juno.feeshare.v1.TxProto.MsgCancelFeeShare.class,
      responseType = com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgCancelFeeShare,
      com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> getCancelFeeShareMethod() {
    io.grpc.MethodDescriptor<com.juno.feeshare.v1.TxProto.MsgCancelFeeShare, com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> getCancelFeeShareMethod;
    if ((getCancelFeeShareMethod = MsgGrpc.getCancelFeeShareMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelFeeShareMethod = MsgGrpc.getCancelFeeShareMethod) == null) {
          MsgGrpc.getCancelFeeShareMethod = getCancelFeeShareMethod =
              io.grpc.MethodDescriptor.<com.juno.feeshare.v1.TxProto.MsgCancelFeeShare, com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFeeShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgCancelFeeShare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelFeeShare"))
              .build();
        }
      }
    }
    return getCancelFeeShareMethod;
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
     * RegisterFeeShare registers a new contract for receiving transaction fees
     * </pre>
     */
    default void registerFeeShare(com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterFeeShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFeeShare updates the withdrawer address of a FeeShare
     * </pre>
     */
    default void updateFeeShare(com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFeeShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelFeeShare cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    default void cancelFeeShare(com.juno.feeshare.v1.TxProto.MsgCancelFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFeeShareMethod(), responseObserver);
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
     * RegisterFeeShare registers a new contract for receiving transaction fees
     * </pre>
     */
    public void registerFeeShare(com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterFeeShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFeeShare updates the withdrawer address of a FeeShare
     * </pre>
     */
    public void updateFeeShare(com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFeeShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelFeeShare cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public void cancelFeeShare(com.juno.feeshare.v1.TxProto.MsgCancelFeeShare request,
        io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFeeShareMethod(), getCallOptions()), request, responseObserver);
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
     * RegisterFeeShare registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse registerFeeShare(com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterFeeShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFeeShare updates the withdrawer address of a FeeShare
     * </pre>
     */
    public com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse updateFeeShare(com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFeeShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelFeeShare cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse cancelFeeShare(com.juno.feeshare.v1.TxProto.MsgCancelFeeShare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFeeShareMethod(), getCallOptions(), request);
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
     * RegisterFeeShare registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse> registerFeeShare(
        com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterFeeShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFeeShare updates the withdrawer address of a FeeShare
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse> updateFeeShare(
        com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFeeShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelFeeShare cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse> cancelFeeShare(
        com.juno.feeshare.v1.TxProto.MsgCancelFeeShare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFeeShareMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_FEE_SHARE = 0;
  private static final int METHODID_UPDATE_FEE_SHARE = 1;
  private static final int METHODID_CANCEL_FEE_SHARE = 2;

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
        case METHODID_REGISTER_FEE_SHARE:
          serviceImpl.registerFeeShare((com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEE_SHARE:
          serviceImpl.updateFeeShare((com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse>) responseObserver);
          break;
        case METHODID_CANCEL_FEE_SHARE:
          serviceImpl.cancelFeeShare((com.juno.feeshare.v1.TxProto.MsgCancelFeeShare) request,
              (io.grpc.stub.StreamObserver<com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse>) responseObserver);
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
          getRegisterFeeShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.TxProto.MsgRegisterFeeShare,
              com.juno.feeshare.v1.TxProto.MsgRegisterFeeShareResponse>(
                service, METHODID_REGISTER_FEE_SHARE)))
        .addMethod(
          getUpdateFeeShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.TxProto.MsgUpdateFeeShare,
              com.juno.feeshare.v1.TxProto.MsgUpdateFeeShareResponse>(
                service, METHODID_UPDATE_FEE_SHARE)))
        .addMethod(
          getCancelFeeShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.juno.feeshare.v1.TxProto.MsgCancelFeeShare,
              com.juno.feeshare.v1.TxProto.MsgCancelFeeShareResponse>(
                service, METHODID_CANCEL_FEE_SHARE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.juno.feeshare.v1.TxProto.getDescriptor();
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
              .addMethod(getRegisterFeeShareMethod())
              .addMethod(getUpdateFeeShareMethod())
              .addMethod(getCancelFeeShareMethod())
              .build();
        }
      }
    }
    return result;
  }
}
