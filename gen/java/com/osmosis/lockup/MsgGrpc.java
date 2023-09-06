package com.osmosis.lockup;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/lockup/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.lockup.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgLockTokens,
      com.osmosis.lockup.TxProto.MsgLockTokensResponse> getLockTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockTokens",
      requestType = com.osmosis.lockup.TxProto.MsgLockTokens.class,
      responseType = com.osmosis.lockup.TxProto.MsgLockTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgLockTokens,
      com.osmosis.lockup.TxProto.MsgLockTokensResponse> getLockTokensMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgLockTokens, com.osmosis.lockup.TxProto.MsgLockTokensResponse> getLockTokensMethod;
    if ((getLockTokensMethod = MsgGrpc.getLockTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLockTokensMethod = MsgGrpc.getLockTokensMethod) == null) {
          MsgGrpc.getLockTokensMethod = getLockTokensMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgLockTokens, com.osmosis.lockup.TxProto.MsgLockTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgLockTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgLockTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LockTokens"))
              .build();
        }
      }
    }
    return getLockTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlockingAll,
      com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> getBeginUnlockingAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginUnlockingAll",
      requestType = com.osmosis.lockup.TxProto.MsgBeginUnlockingAll.class,
      responseType = com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlockingAll,
      com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> getBeginUnlockingAllMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlockingAll, com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> getBeginUnlockingAllMethod;
    if ((getBeginUnlockingAllMethod = MsgGrpc.getBeginUnlockingAllMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBeginUnlockingAllMethod = MsgGrpc.getBeginUnlockingAllMethod) == null) {
          MsgGrpc.getBeginUnlockingAllMethod = getBeginUnlockingAllMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgBeginUnlockingAll, com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginUnlockingAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgBeginUnlockingAll.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BeginUnlockingAll"))
              .build();
        }
      }
    }
    return getBeginUnlockingAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlocking,
      com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> getBeginUnlockingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginUnlocking",
      requestType = com.osmosis.lockup.TxProto.MsgBeginUnlocking.class,
      responseType = com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlocking,
      com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> getBeginUnlockingMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgBeginUnlocking, com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> getBeginUnlockingMethod;
    if ((getBeginUnlockingMethod = MsgGrpc.getBeginUnlockingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBeginUnlockingMethod = MsgGrpc.getBeginUnlockingMethod) == null) {
          MsgGrpc.getBeginUnlockingMethod = getBeginUnlockingMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgBeginUnlocking, com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginUnlocking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgBeginUnlocking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BeginUnlocking"))
              .build();
        }
      }
    }
    return getBeginUnlockingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgExtendLockup,
      com.osmosis.lockup.TxProto.MsgExtendLockupResponse> getExtendLockupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExtendLockup",
      requestType = com.osmosis.lockup.TxProto.MsgExtendLockup.class,
      responseType = com.osmosis.lockup.TxProto.MsgExtendLockupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgExtendLockup,
      com.osmosis.lockup.TxProto.MsgExtendLockupResponse> getExtendLockupMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgExtendLockup, com.osmosis.lockup.TxProto.MsgExtendLockupResponse> getExtendLockupMethod;
    if ((getExtendLockupMethod = MsgGrpc.getExtendLockupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExtendLockupMethod = MsgGrpc.getExtendLockupMethod) == null) {
          MsgGrpc.getExtendLockupMethod = getExtendLockupMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgExtendLockup, com.osmosis.lockup.TxProto.MsgExtendLockupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExtendLockup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgExtendLockup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgExtendLockupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExtendLockup"))
              .build();
        }
      }
    }
    return getExtendLockupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgForceUnlock,
      com.osmosis.lockup.TxProto.MsgForceUnlockResponse> getForceUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForceUnlock",
      requestType = com.osmosis.lockup.TxProto.MsgForceUnlock.class,
      responseType = com.osmosis.lockup.TxProto.MsgForceUnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgForceUnlock,
      com.osmosis.lockup.TxProto.MsgForceUnlockResponse> getForceUnlockMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgForceUnlock, com.osmosis.lockup.TxProto.MsgForceUnlockResponse> getForceUnlockMethod;
    if ((getForceUnlockMethod = MsgGrpc.getForceUnlockMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getForceUnlockMethod = MsgGrpc.getForceUnlockMethod) == null) {
          MsgGrpc.getForceUnlockMethod = getForceUnlockMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgForceUnlock, com.osmosis.lockup.TxProto.MsgForceUnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForceUnlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgForceUnlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgForceUnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ForceUnlock"))
              .build();
        }
      }
    }
    return getForceUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress,
      com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> getSetRewardReceiverAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRewardReceiverAddress",
      requestType = com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress.class,
      responseType = com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress,
      com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> getSetRewardReceiverAddressMethod() {
    io.grpc.MethodDescriptor<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress, com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> getSetRewardReceiverAddressMethod;
    if ((getSetRewardReceiverAddressMethod = MsgGrpc.getSetRewardReceiverAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRewardReceiverAddressMethod = MsgGrpc.getSetRewardReceiverAddressMethod) == null) {
          MsgGrpc.getSetRewardReceiverAddressMethod = getSetRewardReceiverAddressMethod =
              io.grpc.MethodDescriptor.<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress, com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRewardReceiverAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRewardReceiverAddress"))
              .build();
        }
      }
    }
    return getSetRewardReceiverAddressMethod;
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
     * LockTokens lock tokens
     * </pre>
     */
    default void lockTokens(com.osmosis.lockup.TxProto.MsgLockTokens request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgLockTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeginUnlockingAll begin unlocking all tokens
     * </pre>
     */
    default void beginUnlockingAll(com.osmosis.lockup.TxProto.MsgBeginUnlockingAll request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginUnlockingAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgBeginUnlocking begins unlocking tokens by lock ID
     * </pre>
     */
    default void beginUnlocking(com.osmosis.lockup.TxProto.MsgBeginUnlocking request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginUnlockingMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgEditLockup edits the existing lockups by lock ID
     * </pre>
     */
    default void extendLockup(com.osmosis.lockup.TxProto.MsgExtendLockup request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgExtendLockupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtendLockupMethod(), responseObserver);
    }

    /**
     */
    default void forceUnlock(com.osmosis.lockup.TxProto.MsgForceUnlock request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgForceUnlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForceUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetRewardReceiverAddress edits the reward receiver for the given lock ID
     * </pre>
     */
    default void setRewardReceiverAddress(com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRewardReceiverAddressMethod(), responseObserver);
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
     * LockTokens lock tokens
     * </pre>
     */
    public void lockTokens(com.osmosis.lockup.TxProto.MsgLockTokens request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgLockTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeginUnlockingAll begin unlocking all tokens
     * </pre>
     */
    public void beginUnlockingAll(com.osmosis.lockup.TxProto.MsgBeginUnlockingAll request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginUnlockingAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgBeginUnlocking begins unlocking tokens by lock ID
     * </pre>
     */
    public void beginUnlocking(com.osmosis.lockup.TxProto.MsgBeginUnlocking request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginUnlockingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgEditLockup edits the existing lockups by lock ID
     * </pre>
     */
    public void extendLockup(com.osmosis.lockup.TxProto.MsgExtendLockup request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgExtendLockupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtendLockupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forceUnlock(com.osmosis.lockup.TxProto.MsgForceUnlock request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgForceUnlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForceUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetRewardReceiverAddress edits the reward receiver for the given lock ID
     * </pre>
     */
    public void setRewardReceiverAddress(com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress request,
        io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRewardReceiverAddressMethod(), getCallOptions()), request, responseObserver);
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
     * LockTokens lock tokens
     * </pre>
     */
    public com.osmosis.lockup.TxProto.MsgLockTokensResponse lockTokens(com.osmosis.lockup.TxProto.MsgLockTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeginUnlockingAll begin unlocking all tokens
     * </pre>
     */
    public com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse beginUnlockingAll(com.osmosis.lockup.TxProto.MsgBeginUnlockingAll request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginUnlockingAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgBeginUnlocking begins unlocking tokens by lock ID
     * </pre>
     */
    public com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse beginUnlocking(com.osmosis.lockup.TxProto.MsgBeginUnlocking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginUnlockingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgEditLockup edits the existing lockups by lock ID
     * </pre>
     */
    public com.osmosis.lockup.TxProto.MsgExtendLockupResponse extendLockup(com.osmosis.lockup.TxProto.MsgExtendLockup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtendLockupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.lockup.TxProto.MsgForceUnlockResponse forceUnlock(com.osmosis.lockup.TxProto.MsgForceUnlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForceUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetRewardReceiverAddress edits the reward receiver for the given lock ID
     * </pre>
     */
    public com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse setRewardReceiverAddress(com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRewardReceiverAddressMethod(), getCallOptions(), request);
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
     * LockTokens lock tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgLockTokensResponse> lockTokens(
        com.osmosis.lockup.TxProto.MsgLockTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeginUnlockingAll begin unlocking all tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse> beginUnlockingAll(
        com.osmosis.lockup.TxProto.MsgBeginUnlockingAll request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginUnlockingAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgBeginUnlocking begins unlocking tokens by lock ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse> beginUnlocking(
        com.osmosis.lockup.TxProto.MsgBeginUnlocking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginUnlockingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgEditLockup edits the existing lockups by lock ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgExtendLockupResponse> extendLockup(
        com.osmosis.lockup.TxProto.MsgExtendLockup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtendLockupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgForceUnlockResponse> forceUnlock(
        com.osmosis.lockup.TxProto.MsgForceUnlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForceUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetRewardReceiverAddress edits the reward receiver for the given lock ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse> setRewardReceiverAddress(
        com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRewardReceiverAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOCK_TOKENS = 0;
  private static final int METHODID_BEGIN_UNLOCKING_ALL = 1;
  private static final int METHODID_BEGIN_UNLOCKING = 2;
  private static final int METHODID_EXTEND_LOCKUP = 3;
  private static final int METHODID_FORCE_UNLOCK = 4;
  private static final int METHODID_SET_REWARD_RECEIVER_ADDRESS = 5;

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
        case METHODID_LOCK_TOKENS:
          serviceImpl.lockTokens((com.osmosis.lockup.TxProto.MsgLockTokens) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgLockTokensResponse>) responseObserver);
          break;
        case METHODID_BEGIN_UNLOCKING_ALL:
          serviceImpl.beginUnlockingAll((com.osmosis.lockup.TxProto.MsgBeginUnlockingAll) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse>) responseObserver);
          break;
        case METHODID_BEGIN_UNLOCKING:
          serviceImpl.beginUnlocking((com.osmosis.lockup.TxProto.MsgBeginUnlocking) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse>) responseObserver);
          break;
        case METHODID_EXTEND_LOCKUP:
          serviceImpl.extendLockup((com.osmosis.lockup.TxProto.MsgExtendLockup) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgExtendLockupResponse>) responseObserver);
          break;
        case METHODID_FORCE_UNLOCK:
          serviceImpl.forceUnlock((com.osmosis.lockup.TxProto.MsgForceUnlock) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgForceUnlockResponse>) responseObserver);
          break;
        case METHODID_SET_REWARD_RECEIVER_ADDRESS:
          serviceImpl.setRewardReceiverAddress((com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress) request,
              (io.grpc.stub.StreamObserver<com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse>) responseObserver);
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
          getLockTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgLockTokens,
              com.osmosis.lockup.TxProto.MsgLockTokensResponse>(
                service, METHODID_LOCK_TOKENS)))
        .addMethod(
          getBeginUnlockingAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgBeginUnlockingAll,
              com.osmosis.lockup.TxProto.MsgBeginUnlockingAllResponse>(
                service, METHODID_BEGIN_UNLOCKING_ALL)))
        .addMethod(
          getBeginUnlockingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgBeginUnlocking,
              com.osmosis.lockup.TxProto.MsgBeginUnlockingResponse>(
                service, METHODID_BEGIN_UNLOCKING)))
        .addMethod(
          getExtendLockupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgExtendLockup,
              com.osmosis.lockup.TxProto.MsgExtendLockupResponse>(
                service, METHODID_EXTEND_LOCKUP)))
        .addMethod(
          getForceUnlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgForceUnlock,
              com.osmosis.lockup.TxProto.MsgForceUnlockResponse>(
                service, METHODID_FORCE_UNLOCK)))
        .addMethod(
          getSetRewardReceiverAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddress,
              com.osmosis.lockup.TxProto.MsgSetRewardReceiverAddressResponse>(
                service, METHODID_SET_REWARD_RECEIVER_ADDRESS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.lockup.TxProto.getDescriptor();
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
              .addMethod(getLockTokensMethod())
              .addMethod(getBeginUnlockingAllMethod())
              .addMethod(getBeginUnlockingMethod())
              .addMethod(getExtendLockupMethod())
              .addMethod(getForceUnlockMethod())
              .addMethod(getSetRewardReceiverAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
