package com.teritori.airdrop.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: teritori/airdrop/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "teritori.airdrop.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation,
      com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> getClaimAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAllocation",
      requestType = com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation.class,
      responseType = com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation,
      com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> getClaimAllocationMethod() {
    io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation, com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> getClaimAllocationMethod;
    if ((getClaimAllocationMethod = MsgGrpc.getClaimAllocationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAllocationMethod = MsgGrpc.getClaimAllocationMethod) == null) {
          MsgGrpc.getClaimAllocationMethod = getClaimAllocationMethod =
              io.grpc.MethodDescriptor.<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation, com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAllocation"))
              .build();
        }
      }
    }
    return getClaimAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation,
      com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> getSetAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllocation",
      requestType = com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation.class,
      responseType = com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation,
      com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> getSetAllocationMethod() {
    io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation, com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> getSetAllocationMethod;
    if ((getSetAllocationMethod = MsgGrpc.getSetAllocationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAllocationMethod = MsgGrpc.getSetAllocationMethod) == null) {
          MsgGrpc.getSetAllocationMethod = getSetAllocationMethod =
              io.grpc.MethodDescriptor.<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation, com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAllocation"))
              .build();
        }
      }
    }
    return getSetAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership,
      com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferModuleOwnership",
      requestType = com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership.class,
      responseType = com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership,
      com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod() {
    io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership, com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> getTransferModuleOwnershipMethod;
    if ((getTransferModuleOwnershipMethod = MsgGrpc.getTransferModuleOwnershipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferModuleOwnershipMethod = MsgGrpc.getTransferModuleOwnershipMethod) == null) {
          MsgGrpc.getTransferModuleOwnershipMethod = getTransferModuleOwnershipMethod =
              io.grpc.MethodDescriptor.<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership, com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferModuleOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferModuleOwnership"))
              .build();
        }
      }
    }
    return getTransferModuleOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens,
      com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> getDepositTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositTokens",
      requestType = com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens.class,
      responseType = com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens,
      com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> getDepositTokensMethod() {
    io.grpc.MethodDescriptor<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens, com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> getDepositTokensMethod;
    if ((getDepositTokensMethod = MsgGrpc.getDepositTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositTokensMethod = MsgGrpc.getDepositTokensMethod) == null) {
          MsgGrpc.getDepositTokensMethod = getDepositTokensMethod =
              io.grpc.MethodDescriptor.<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens, com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositTokens"))
              .build();
        }
      }
    }
    return getDepositTokensMethod;
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    default void claimAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimAllocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    default void setAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAllocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    default void transferModuleOwnership(com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferModuleOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    default void depositTokens(com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
   * Msg defines the staking Msg service.
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
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public void claimAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public void setAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public void transferModuleOwnership(com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferModuleOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public void depositTokens(com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens request,
        io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse claimAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimAllocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse setAllocation(com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAllocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse transferModuleOwnership(com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferModuleOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse depositTokens(com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * ClaimAllocation defines a method to claim allocation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse> claimAllocation(
        com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimAllocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAllocation defines a method to set allocation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse> setAllocation(
        com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAllocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferModuleOwnership defines a method to transfer module ownership to other address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse> transferModuleOwnership(
        com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferModuleOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositTokens defines a method to deposit tokens to the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse> depositTokens(
        com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_ALLOCATION = 0;
  private static final int METHODID_SET_ALLOCATION = 1;
  private static final int METHODID_TRANSFER_MODULE_OWNERSHIP = 2;
  private static final int METHODID_DEPOSIT_TOKENS = 3;

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
        case METHODID_CLAIM_ALLOCATION:
          serviceImpl.claimAllocation((com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation) request,
              (io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse>) responseObserver);
          break;
        case METHODID_SET_ALLOCATION:
          serviceImpl.setAllocation((com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation) request,
              (io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_MODULE_OWNERSHIP:
          serviceImpl.transferModuleOwnership((com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership) request,
              (io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_TOKENS:
          serviceImpl.depositTokens((com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens) request,
              (io.grpc.stub.StreamObserver<com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse>) responseObserver);
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
          getClaimAllocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocation,
              com.teritori.airdrop.v1beta1.TxProto.MsgClaimAllocationResponse>(
                service, METHODID_CLAIM_ALLOCATION)))
        .addMethod(
          getSetAllocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocation,
              com.teritori.airdrop.v1beta1.TxProto.MsgSetAllocationResponse>(
                service, METHODID_SET_ALLOCATION)))
        .addMethod(
          getTransferModuleOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnership,
              com.teritori.airdrop.v1beta1.TxProto.MsgTransferModuleOwnershipResponse>(
                service, METHODID_TRANSFER_MODULE_OWNERSHIP)))
        .addMethod(
          getDepositTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokens,
              com.teritori.airdrop.v1beta1.TxProto.MsgDepositTokensResponse>(
                service, METHODID_DEPOSIT_TOKENS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.teritori.airdrop.v1beta1.TxProto.getDescriptor();
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
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getClaimAllocationMethod())
              .addMethod(getSetAllocationMethod())
              .addMethod(getTransferModuleOwnershipMethod())
              .addMethod(getDepositTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
