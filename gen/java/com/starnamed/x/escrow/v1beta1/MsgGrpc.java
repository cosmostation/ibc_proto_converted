package com.starnamed.x.escrow.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the escrow Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: iov/escrow/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "starnamed.x.escrow.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> getCreateEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEscrow",
      requestType = com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow.class,
      responseType = com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> getCreateEscrowMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> getCreateEscrowMethod;
    if ((getCreateEscrowMethod = MsgGrpc.getCreateEscrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateEscrowMethod = MsgGrpc.getCreateEscrowMethod) == null) {
          MsgGrpc.getCreateEscrowMethod = getCreateEscrowMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEscrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateEscrow"))
              .build();
        }
      }
    }
    return getCreateEscrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> getUpdateEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEscrow",
      requestType = com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow.class,
      responseType = com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> getUpdateEscrowMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> getUpdateEscrowMethod;
    if ((getUpdateEscrowMethod = MsgGrpc.getUpdateEscrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateEscrowMethod = MsgGrpc.getUpdateEscrowMethod) == null) {
          MsgGrpc.getUpdateEscrowMethod = getUpdateEscrowMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEscrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateEscrow"))
              .build();
        }
      }
    }
    return getUpdateEscrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> getTransferToEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferToEscrow",
      requestType = com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow.class,
      responseType = com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> getTransferToEscrowMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> getTransferToEscrowMethod;
    if ((getTransferToEscrowMethod = MsgGrpc.getTransferToEscrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferToEscrowMethod = MsgGrpc.getTransferToEscrowMethod) == null) {
          MsgGrpc.getTransferToEscrowMethod = getTransferToEscrowMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferToEscrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferToEscrow"))
              .build();
        }
      }
    }
    return getTransferToEscrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> getRefundEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundEscrow",
      requestType = com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow.class,
      responseType = com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow,
      com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> getRefundEscrowMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> getRefundEscrowMethod;
    if ((getRefundEscrowMethod = MsgGrpc.getRefundEscrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRefundEscrowMethod = MsgGrpc.getRefundEscrowMethod) == null) {
          MsgGrpc.getRefundEscrowMethod = getRefundEscrowMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow, com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundEscrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RefundEscrow"))
              .build();
        }
      }
    }
    return getRefundEscrowMethod;
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
   * Msg defines the escrow Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateEscrow defines a method for creating an escrow
     * </pre>
     */
    default void createEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEscrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEscrow defines a method for updating an escrow
     * </pre>
     */
    default void updateEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEscrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferToEscrow defines a method for a buyer to transfer funds to the
     * escrow
     * </pre>
     */
    default void transferToEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferToEscrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundEscrow defines a method for the seller to return the assets locked in
     * the escrow
     * </pre>
     */
    default void refundEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundEscrowMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the escrow Msg service
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
   * Msg defines the escrow Msg service
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
     * CreateEscrow defines a method for creating an escrow
     * </pre>
     */
    public void createEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEscrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEscrow defines a method for updating an escrow
     * </pre>
     */
    public void updateEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEscrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferToEscrow defines a method for a buyer to transfer funds to the
     * escrow
     * </pre>
     */
    public void transferToEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferToEscrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundEscrow defines a method for the seller to return the assets locked in
     * the escrow
     * </pre>
     */
    public void refundEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow request,
        io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundEscrowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the escrow Msg service
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
     * CreateEscrow defines a method for creating an escrow
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse createEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEscrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEscrow defines a method for updating an escrow
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse updateEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEscrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferToEscrow defines a method for a buyer to transfer funds to the
     * escrow
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse transferToEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferToEscrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundEscrow defines a method for the seller to return the assets locked in
     * the escrow
     * </pre>
     */
    public com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse refundEscrow(com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundEscrowMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the escrow Msg service
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
     * CreateEscrow defines a method for creating an escrow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse> createEscrow(
        com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEscrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEscrow defines a method for updating an escrow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse> updateEscrow(
        com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEscrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferToEscrow defines a method for a buyer to transfer funds to the
     * escrow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse> transferToEscrow(
        com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferToEscrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundEscrow defines a method for the seller to return the assets locked in
     * the escrow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse> refundEscrow(
        com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundEscrowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ESCROW = 0;
  private static final int METHODID_UPDATE_ESCROW = 1;
  private static final int METHODID_TRANSFER_TO_ESCROW = 2;
  private static final int METHODID_REFUND_ESCROW = 3;

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
        case METHODID_CREATE_ESCROW:
          serviceImpl.createEscrow((com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ESCROW:
          serviceImpl.updateEscrow((com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TO_ESCROW:
          serviceImpl.transferToEscrow((com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse>) responseObserver);
          break;
        case METHODID_REFUND_ESCROW:
          serviceImpl.refundEscrow((com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse>) responseObserver);
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
          getCreateEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrow,
              com.starnamed.x.escrow.v1beta1.TxProto.MsgCreateEscrowResponse>(
                service, METHODID_CREATE_ESCROW)))
        .addMethod(
          getUpdateEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrow,
              com.starnamed.x.escrow.v1beta1.TxProto.MsgUpdateEscrowResponse>(
                service, METHODID_UPDATE_ESCROW)))
        .addMethod(
          getTransferToEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrow,
              com.starnamed.x.escrow.v1beta1.TxProto.MsgTransferToEscrowResponse>(
                service, METHODID_TRANSFER_TO_ESCROW)))
        .addMethod(
          getRefundEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrow,
              com.starnamed.x.escrow.v1beta1.TxProto.MsgRefundEscrowResponse>(
                service, METHODID_REFUND_ESCROW)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.starnamed.x.escrow.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateEscrowMethod())
              .addMethod(getUpdateEscrowMethod())
              .addMethod(getTransferToEscrowMethod())
              .addMethod(getRefundEscrowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
