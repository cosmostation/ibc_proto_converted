package com.kyve.delegation.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/delegation/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.delegation.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgDelegate,
      com.kyve.delegation.v1beta1.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = com.kyve.delegation.v1beta1.MsgDelegate.class,
      responseType = com.kyve.delegation.v1beta1.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgDelegate,
      com.kyve.delegation.v1beta1.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgDelegate, com.kyve.delegation.v1beta1.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<com.kyve.delegation.v1beta1.MsgDelegate, com.kyve.delegation.v1beta1.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgWithdrawRewards,
      com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewards",
      requestType = com.kyve.delegation.v1beta1.MsgWithdrawRewards.class,
      responseType = com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgWithdrawRewards,
      com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod() {
    io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgWithdrawRewards, com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;
    if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
          MsgGrpc.getWithdrawRewardsMethod = getWithdrawRewardsMethod =
              io.grpc.MethodDescriptor.<com.kyve.delegation.v1beta1.MsgWithdrawRewards, com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgWithdrawRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewards"))
              .build();
        }
      }
    }
    return getWithdrawRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUndelegate,
      com.kyve.delegation.v1beta1.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = com.kyve.delegation.v1beta1.MsgUndelegate.class,
      responseType = com.kyve.delegation.v1beta1.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUndelegate,
      com.kyve.delegation.v1beta1.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUndelegate, com.kyve.delegation.v1beta1.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<com.kyve.delegation.v1beta1.MsgUndelegate, com.kyve.delegation.v1beta1.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgRedelegate,
      com.kyve.delegation.v1beta1.MsgRedelegateResponse> getRedelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redelegate",
      requestType = com.kyve.delegation.v1beta1.MsgRedelegate.class,
      responseType = com.kyve.delegation.v1beta1.MsgRedelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgRedelegate,
      com.kyve.delegation.v1beta1.MsgRedelegateResponse> getRedelegateMethod() {
    io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgRedelegate, com.kyve.delegation.v1beta1.MsgRedelegateResponse> getRedelegateMethod;
    if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedelegateMethod = MsgGrpc.getRedelegateMethod) == null) {
          MsgGrpc.getRedelegateMethod = getRedelegateMethod =
              io.grpc.MethodDescriptor.<com.kyve.delegation.v1beta1.MsgRedelegate, com.kyve.delegation.v1beta1.MsgRedelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgRedelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgRedelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Redelegate"))
              .build();
        }
      }
    }
    return getRedelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUpdateParams,
      com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.kyve.delegation.v1beta1.MsgUpdateParams.class,
      responseType = com.kyve.delegation.v1beta1.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUpdateParams,
      com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.kyve.delegation.v1beta1.MsgUpdateParams, com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.kyve.delegation.v1beta1.MsgUpdateParams, com.kyve.delegation.v1beta1.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.delegation.v1beta1.MsgUpdateParamsResponse.getDefaultInstance()))
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
     * <pre>
     * Delegate ...
     * </pre>
     */
    default void delegate(com.kyve.delegation.v1beta1.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    default void withdrawRewards(com.kyve.delegation.v1beta1.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    default void undelegate(com.kyve.delegation.v1beta1.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    default void redelegate(com.kyve.delegation.v1beta1.MsgRedelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgRedelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void updateParams(com.kyve.delegation.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> responseObserver) {
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
     * <pre>
     * Delegate ...
     * </pre>
     */
    public void delegate(com.kyve.delegation.v1beta1.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public void withdrawRewards(com.kyve.delegation.v1beta1.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public void undelegate(com.kyve.delegation.v1beta1.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public void redelegate(com.kyve.delegation.v1beta1.MsgRedelegate request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgRedelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(com.kyve.delegation.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> responseObserver) {
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
     * <pre>
     * Delegate ...
     * </pre>
     */
    public com.kyve.delegation.v1beta1.MsgDelegateResponse delegate(com.kyve.delegation.v1beta1.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse withdrawRewards(com.kyve.delegation.v1beta1.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public com.kyve.delegation.v1beta1.MsgUndelegateResponse undelegate(com.kyve.delegation.v1beta1.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public com.kyve.delegation.v1beta1.MsgRedelegateResponse redelegate(com.kyve.delegation.v1beta1.MsgRedelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.delegation.v1beta1.MsgUpdateParamsResponse updateParams(com.kyve.delegation.v1beta1.MsgUpdateParams request) {
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
     * <pre>
     * Delegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.delegation.v1beta1.MsgDelegateResponse> delegate(
        com.kyve.delegation.v1beta1.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse> withdrawRewards(
        com.kyve.delegation.v1beta1.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.delegation.v1beta1.MsgUndelegateResponse> undelegate(
        com.kyve.delegation.v1beta1.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Redelegate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.delegation.v1beta1.MsgRedelegateResponse> redelegate(
        com.kyve.delegation.v1beta1.MsgRedelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/delegation module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.delegation.v1beta1.MsgUpdateParamsResponse> updateParams(
        com.kyve.delegation.v1beta1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELEGATE = 0;
  private static final int METHODID_WITHDRAW_REWARDS = 1;
  private static final int METHODID_UNDELEGATE = 2;
  private static final int METHODID_REDELEGATE = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_DELEGATE:
          serviceImpl.delegate((com.kyve.delegation.v1beta1.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARDS:
          serviceImpl.withdrawRewards((com.kyve.delegation.v1beta1.MsgWithdrawRewards) request,
              (io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((com.kyve.delegation.v1beta1.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUndelegateResponse>) responseObserver);
          break;
        case METHODID_REDELEGATE:
          serviceImpl.redelegate((com.kyve.delegation.v1beta1.MsgRedelegate) request,
              (io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgRedelegateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.kyve.delegation.v1beta1.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.kyve.delegation.v1beta1.MsgUpdateParamsResponse>) responseObserver);
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
          getDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.delegation.v1beta1.MsgDelegate,
              com.kyve.delegation.v1beta1.MsgDelegateResponse>(
                service, METHODID_DELEGATE)))
        .addMethod(
          getWithdrawRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.delegation.v1beta1.MsgWithdrawRewards,
              com.kyve.delegation.v1beta1.MsgWithdrawRewardsResponse>(
                service, METHODID_WITHDRAW_REWARDS)))
        .addMethod(
          getUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.delegation.v1beta1.MsgUndelegate,
              com.kyve.delegation.v1beta1.MsgUndelegateResponse>(
                service, METHODID_UNDELEGATE)))
        .addMethod(
          getRedelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.delegation.v1beta1.MsgRedelegate,
              com.kyve.delegation.v1beta1.MsgRedelegateResponse>(
                service, METHODID_REDELEGATE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.delegation.v1beta1.MsgUpdateParams,
              com.kyve.delegation.v1beta1.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.delegation.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getDelegateMethod())
              .addMethod(getWithdrawRewardsMethod())
              .addMethod(getUndelegateMethod())
              .addMethod(getRedelegateMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
