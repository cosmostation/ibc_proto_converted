package com.neutron.dex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/dex/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "neutron.dex.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgDeposit,
      com.neutron.dex.TxProto.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.neutron.dex.TxProto.MsgDeposit.class,
      responseType = com.neutron.dex.TxProto.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgDeposit,
      com.neutron.dex.TxProto.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgDeposit, com.neutron.dex.TxProto.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgDeposit, com.neutron.dex.TxProto.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawal,
      com.neutron.dex.TxProto.MsgWithdrawalResponse> getWithdrawalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdrawal",
      requestType = com.neutron.dex.TxProto.MsgWithdrawal.class,
      responseType = com.neutron.dex.TxProto.MsgWithdrawalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawal,
      com.neutron.dex.TxProto.MsgWithdrawalResponse> getWithdrawalMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawal, com.neutron.dex.TxProto.MsgWithdrawalResponse> getWithdrawalMethod;
    if ((getWithdrawalMethod = MsgGrpc.getWithdrawalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawalMethod = MsgGrpc.getWithdrawalMethod) == null) {
          MsgGrpc.getWithdrawalMethod = getWithdrawalMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgWithdrawal, com.neutron.dex.TxProto.MsgWithdrawalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdrawal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgWithdrawal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgWithdrawalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdrawal"))
              .build();
        }
      }
    }
    return getWithdrawalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgPlaceLimitOrder,
      com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> getPlaceLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceLimitOrder",
      requestType = com.neutron.dex.TxProto.MsgPlaceLimitOrder.class,
      responseType = com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgPlaceLimitOrder,
      com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> getPlaceLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgPlaceLimitOrder, com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> getPlaceLimitOrderMethod;
    if ((getPlaceLimitOrderMethod = MsgGrpc.getPlaceLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPlaceLimitOrderMethod = MsgGrpc.getPlaceLimitOrderMethod) == null) {
          MsgGrpc.getPlaceLimitOrderMethod = getPlaceLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgPlaceLimitOrder, com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgPlaceLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PlaceLimitOrder"))
              .build();
        }
      }
    }
    return getPlaceLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder,
      com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> getWithdrawFilledLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawFilledLimitOrder",
      requestType = com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder.class,
      responseType = com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder,
      com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> getWithdrawFilledLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder, com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> getWithdrawFilledLimitOrderMethod;
    if ((getWithdrawFilledLimitOrderMethod = MsgGrpc.getWithdrawFilledLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawFilledLimitOrderMethod = MsgGrpc.getWithdrawFilledLimitOrderMethod) == null) {
          MsgGrpc.getWithdrawFilledLimitOrderMethod = getWithdrawFilledLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder, com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawFilledLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawFilledLimitOrder"))
              .build();
        }
      }
    }
    return getWithdrawFilledLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgCancelLimitOrder,
      com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> getCancelLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelLimitOrder",
      requestType = com.neutron.dex.TxProto.MsgCancelLimitOrder.class,
      responseType = com.neutron.dex.TxProto.MsgCancelLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgCancelLimitOrder,
      com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> getCancelLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgCancelLimitOrder, com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> getCancelLimitOrderMethod;
    if ((getCancelLimitOrderMethod = MsgGrpc.getCancelLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelLimitOrderMethod = MsgGrpc.getCancelLimitOrderMethod) == null) {
          MsgGrpc.getCancelLimitOrderMethod = getCancelLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgCancelLimitOrder, com.neutron.dex.TxProto.MsgCancelLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgCancelLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgCancelLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelLimitOrder"))
              .build();
        }
      }
    }
    return getCancelLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgMultiHopSwap,
      com.neutron.dex.TxProto.MsgMultiHopSwapResponse> getMultiHopSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiHopSwap",
      requestType = com.neutron.dex.TxProto.MsgMultiHopSwap.class,
      responseType = com.neutron.dex.TxProto.MsgMultiHopSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgMultiHopSwap,
      com.neutron.dex.TxProto.MsgMultiHopSwapResponse> getMultiHopSwapMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgMultiHopSwap, com.neutron.dex.TxProto.MsgMultiHopSwapResponse> getMultiHopSwapMethod;
    if ((getMultiHopSwapMethod = MsgGrpc.getMultiHopSwapMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMultiHopSwapMethod = MsgGrpc.getMultiHopSwapMethod) == null) {
          MsgGrpc.getMultiHopSwapMethod = getMultiHopSwapMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgMultiHopSwap, com.neutron.dex.TxProto.MsgMultiHopSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiHopSwap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgMultiHopSwap.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgMultiHopSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MultiHopSwap"))
              .build();
        }
      }
    }
    return getMultiHopSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgUpdateParams,
      com.neutron.dex.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.neutron.dex.TxProto.MsgUpdateParams.class,
      responseType = com.neutron.dex.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgUpdateParams,
      com.neutron.dex.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.dex.TxProto.MsgUpdateParams, com.neutron.dex.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.dex.TxProto.MsgUpdateParams, com.neutron.dex.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.dex.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void deposit(com.neutron.dex.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    default void withdrawal(com.neutron.dex.TxProto.MsgWithdrawal request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawalMethod(), responseObserver);
    }

    /**
     */
    default void placeLimitOrder(com.neutron.dex.TxProto.MsgPlaceLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceLimitOrderMethod(), responseObserver);
    }

    /**
     */
    default void withdrawFilledLimitOrder(com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawFilledLimitOrderMethod(), responseObserver);
    }

    /**
     */
    default void cancelLimitOrder(com.neutron.dex.TxProto.MsgCancelLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelLimitOrderMethod(), responseObserver);
    }

    /**
     */
    default void multiHopSwap(com.neutron.dex.TxProto.MsgMultiHopSwap request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgMultiHopSwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiHopSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void updateParams(com.neutron.dex.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     */
    public void deposit(com.neutron.dex.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawal(com.neutron.dex.TxProto.MsgWithdrawal request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void placeLimitOrder(com.neutron.dex.TxProto.MsgPlaceLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawFilledLimitOrder(com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawFilledLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelLimitOrder(com.neutron.dex.TxProto.MsgCancelLimitOrder request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiHopSwap(com.neutron.dex.TxProto.MsgMultiHopSwap request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgMultiHopSwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiHopSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void updateParams(com.neutron.dex.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.neutron.dex.TxProto.MsgDepositResponse deposit(com.neutron.dex.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.dex.TxProto.MsgWithdrawalResponse withdrawal(com.neutron.dex.TxProto.MsgWithdrawal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse placeLimitOrder(com.neutron.dex.TxProto.MsgPlaceLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse withdrawFilledLimitOrder(com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawFilledLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.dex.TxProto.MsgCancelLimitOrderResponse cancelLimitOrder(com.neutron.dex.TxProto.MsgCancelLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.dex.TxProto.MsgMultiHopSwapResponse multiHopSwap(com.neutron.dex.TxProto.MsgMultiHopSwap request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiHopSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.neutron.dex.TxProto.MsgUpdateParamsResponse updateParams(com.neutron.dex.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgDepositResponse> deposit(
        com.neutron.dex.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgWithdrawalResponse> withdrawal(
        com.neutron.dex.TxProto.MsgWithdrawal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse> placeLimitOrder(
        com.neutron.dex.TxProto.MsgPlaceLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse> withdrawFilledLimitOrder(
        com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawFilledLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgCancelLimitOrderResponse> cancelLimitOrder(
        com.neutron.dex.TxProto.MsgCancelLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgMultiHopSwapResponse> multiHopSwap(
        com.neutron.dex.TxProto.MsgMultiHopSwap request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiHopSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.dex.TxProto.MsgUpdateParamsResponse> updateParams(
        com.neutron.dex.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAWAL = 1;
  private static final int METHODID_PLACE_LIMIT_ORDER = 2;
  private static final int METHODID_WITHDRAW_FILLED_LIMIT_ORDER = 3;
  private static final int METHODID_CANCEL_LIMIT_ORDER = 4;
  private static final int METHODID_MULTI_HOP_SWAP = 5;
  private static final int METHODID_UPDATE_PARAMS = 6;

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
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.neutron.dex.TxProto.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWAL:
          serviceImpl.withdrawal((com.neutron.dex.TxProto.MsgWithdrawal) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawalResponse>) responseObserver);
          break;
        case METHODID_PLACE_LIMIT_ORDER:
          serviceImpl.placeLimitOrder((com.neutron.dex.TxProto.MsgPlaceLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_FILLED_LIMIT_ORDER:
          serviceImpl.withdrawFilledLimitOrder((com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_LIMIT_ORDER:
          serviceImpl.cancelLimitOrder((com.neutron.dex.TxProto.MsgCancelLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgCancelLimitOrderResponse>) responseObserver);
          break;
        case METHODID_MULTI_HOP_SWAP:
          serviceImpl.multiHopSwap((com.neutron.dex.TxProto.MsgMultiHopSwap) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgMultiHopSwapResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.neutron.dex.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.neutron.dex.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgDeposit,
              com.neutron.dex.TxProto.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getWithdrawalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgWithdrawal,
              com.neutron.dex.TxProto.MsgWithdrawalResponse>(
                service, METHODID_WITHDRAWAL)))
        .addMethod(
          getPlaceLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgPlaceLimitOrder,
              com.neutron.dex.TxProto.MsgPlaceLimitOrderResponse>(
                service, METHODID_PLACE_LIMIT_ORDER)))
        .addMethod(
          getWithdrawFilledLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrder,
              com.neutron.dex.TxProto.MsgWithdrawFilledLimitOrderResponse>(
                service, METHODID_WITHDRAW_FILLED_LIMIT_ORDER)))
        .addMethod(
          getCancelLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgCancelLimitOrder,
              com.neutron.dex.TxProto.MsgCancelLimitOrderResponse>(
                service, METHODID_CANCEL_LIMIT_ORDER)))
        .addMethod(
          getMultiHopSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgMultiHopSwap,
              com.neutron.dex.TxProto.MsgMultiHopSwapResponse>(
                service, METHODID_MULTI_HOP_SWAP)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.dex.TxProto.MsgUpdateParams,
              com.neutron.dex.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.dex.TxProto.getDescriptor();
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
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawalMethod())
              .addMethod(getPlaceLimitOrderMethod())
              .addMethod(getWithdrawFilledLimitOrderMethod())
              .addMethod(getCancelLimitOrderMethod())
              .addMethod(getMultiHopSwapMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
