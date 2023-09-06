package com.comdex.liquidation.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: comdex/liquidation/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "comdex.liquidation.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest,
      com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> getMsgLiquidateVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgLiquidateVault",
      requestType = com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest.class,
      responseType = com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest,
      com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> getMsgLiquidateVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest, com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> getMsgLiquidateVaultMethod;
    if ((getMsgLiquidateVaultMethod = MsgGrpc.getMsgLiquidateVaultMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgLiquidateVaultMethod = MsgGrpc.getMsgLiquidateVaultMethod) == null) {
          MsgGrpc.getMsgLiquidateVaultMethod = getMsgLiquidateVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest, com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgLiquidateVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgLiquidateVault"))
              .build();
        }
      }
    }
    return getMsgLiquidateVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest,
      com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> getMsgLiquidateBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgLiquidateBorrow",
      requestType = com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest.class,
      responseType = com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest,
      com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> getMsgLiquidateBorrowMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest, com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> getMsgLiquidateBorrowMethod;
    if ((getMsgLiquidateBorrowMethod = MsgGrpc.getMsgLiquidateBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgLiquidateBorrowMethod = MsgGrpc.getMsgLiquidateBorrowMethod) == null) {
          MsgGrpc.getMsgLiquidateBorrowMethod = getMsgLiquidateBorrowMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest, com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgLiquidateBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgLiquidateBorrow"))
              .build();
        }
      }
    }
    return getMsgLiquidateBorrowMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void msgLiquidateVault(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgLiquidateVaultMethod(), responseObserver);
    }

    /**
     */
    default void msgLiquidateBorrow(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgLiquidateBorrowMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
     */
    public void msgLiquidateVault(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgLiquidateVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgLiquidateBorrow(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgLiquidateBorrowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
     */
    public com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse msgLiquidateVault(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgLiquidateVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse msgLiquidateBorrow(com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgLiquidateBorrowMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse> msgLiquidateVault(
        com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgLiquidateVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse> msgLiquidateBorrow(
        com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgLiquidateBorrowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_LIQUIDATE_VAULT = 0;
  private static final int METHODID_MSG_LIQUIDATE_BORROW = 1;

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
        case METHODID_MSG_LIQUIDATE_VAULT:
          serviceImpl.msgLiquidateVault((com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse>) responseObserver);
          break;
        case METHODID_MSG_LIQUIDATE_BORROW:
          serviceImpl.msgLiquidateBorrow((com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse>) responseObserver);
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
          getMsgLiquidateVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultRequest,
              com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateVaultResponse>(
                service, METHODID_MSG_LIQUIDATE_VAULT)))
        .addMethod(
          getMsgLiquidateBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowRequest,
              com.comdex.liquidation.v1beta1.TxProto.MsgLiquidateBorrowResponse>(
                service, METHODID_MSG_LIQUIDATE_BORROW)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.liquidation.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getMsgLiquidateVaultMethod())
              .addMethod(getMsgLiquidateBorrowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
