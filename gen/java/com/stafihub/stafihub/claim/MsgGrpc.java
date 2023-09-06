package com.stafihub.stafihub.claim;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/claim/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.claim.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot,
      com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> getSetMerkleRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMerkleRoot",
      requestType = com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot.class,
      responseType = com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot,
      com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> getSetMerkleRootMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot, com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> getSetMerkleRootMethod;
    if ((getSetMerkleRootMethod = MsgGrpc.getSetMerkleRootMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMerkleRootMethod = MsgGrpc.getSetMerkleRootMethod) == null) {
          MsgGrpc.getSetMerkleRootMethod = getSetMerkleRootMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot, com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMerkleRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMerkleRoot"))
              .build();
        }
      }
    }
    return getSetMerkleRootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgClaim,
      com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = com.stafihub.stafihub.claim.TxProto.MsgClaim.class,
      responseType = com.stafihub.stafihub.claim.TxProto.MsgClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgClaim,
      com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgClaim, com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> getClaimMethod;
    if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
          MsgGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.TxProto.MsgClaim, com.stafihub.stafihub.claim.TxProto.MsgClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch,
      com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleClaimSwitch",
      requestType = com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch.class,
      responseType = com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch,
      com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch, com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> getToggleClaimSwitchMethod;
    if ((getToggleClaimSwitchMethod = MsgGrpc.getToggleClaimSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleClaimSwitchMethod = MsgGrpc.getToggleClaimSwitchMethod) == null) {
          MsgGrpc.getToggleClaimSwitchMethod = getToggleClaimSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch, com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleClaimSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleClaimSwitch"))
              .build();
        }
      }
    }
    return getToggleClaimSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgProvideToken,
      com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> getProvideTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideToken",
      requestType = com.stafihub.stafihub.claim.TxProto.MsgProvideToken.class,
      responseType = com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgProvideToken,
      com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> getProvideTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgProvideToken, com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> getProvideTokenMethod;
    if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
          MsgGrpc.getProvideTokenMethod = getProvideTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.TxProto.MsgProvideToken, com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgProvideToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideToken"))
              .build();
        }
      }
    }
    return getProvideTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken,
      com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> getWithdrawTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawToken",
      requestType = com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken.class,
      responseType = com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken,
      com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> getWithdrawTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken, com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> getWithdrawTokenMethod;
    if ((getWithdrawTokenMethod = MsgGrpc.getWithdrawTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawTokenMethod = MsgGrpc.getWithdrawTokenMethod) == null) {
          MsgGrpc.getWithdrawTokenMethod = getWithdrawTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken, com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawToken"))
              .build();
        }
      }
    }
    return getWithdrawTokenMethod;
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
    default void setMerkleRoot(com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMerkleRootMethod(), responseObserver);
    }

    /**
     */
    default void claim(com.stafihub.stafihub.claim.TxProto.MsgClaim request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     */
    default void toggleClaimSwitch(com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleClaimSwitchMethod(), responseObserver);
    }

    /**
     */
    default void provideToken(com.stafihub.stafihub.claim.TxProto.MsgProvideToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void withdrawToken(com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawTokenMethod(), responseObserver);
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
    public void setMerkleRoot(com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMerkleRootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(com.stafihub.stafihub.claim.TxProto.MsgClaim request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleClaimSwitch(com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleClaimSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void provideToken(com.stafihub.stafihub.claim.TxProto.MsgProvideToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void withdrawToken(com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawTokenMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse setMerkleRoot(com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMerkleRootMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.claim.TxProto.MsgClaimResponse claim(com.stafihub.stafihub.claim.TxProto.MsgClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse toggleClaimSwitch(com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleClaimSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse provideToken(com.stafihub.stafihub.claim.TxProto.MsgProvideToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse withdrawToken(com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawTokenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse> setMerkleRoot(
        com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMerkleRootMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.TxProto.MsgClaimResponse> claim(
        com.stafihub.stafihub.claim.TxProto.MsgClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse> toggleClaimSwitch(
        com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleClaimSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse> provideToken(
        com.stafihub.stafihub.claim.TxProto.MsgProvideToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse> withdrawToken(
        com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_MERKLE_ROOT = 0;
  private static final int METHODID_CLAIM = 1;
  private static final int METHODID_TOGGLE_CLAIM_SWITCH = 2;
  private static final int METHODID_PROVIDE_TOKEN = 3;
  private static final int METHODID_WITHDRAW_TOKEN = 4;

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
        case METHODID_SET_MERKLE_ROOT:
          serviceImpl.setMerkleRoot((com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((com.stafihub.stafihub.claim.TxProto.MsgClaim) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgClaimResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_CLAIM_SWITCH:
          serviceImpl.toggleClaimSwitch((com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_TOKEN:
          serviceImpl.provideToken((com.stafihub.stafihub.claim.TxProto.MsgProvideToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_TOKEN:
          serviceImpl.withdrawToken((com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse>) responseObserver);
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
          getSetMerkleRootMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRoot,
              com.stafihub.stafihub.claim.TxProto.MsgSetMerkleRootResponse>(
                service, METHODID_SET_MERKLE_ROOT)))
        .addMethod(
          getClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.TxProto.MsgClaim,
              com.stafihub.stafihub.claim.TxProto.MsgClaimResponse>(
                service, METHODID_CLAIM)))
        .addMethod(
          getToggleClaimSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitch,
              com.stafihub.stafihub.claim.TxProto.MsgToggleClaimSwitchResponse>(
                service, METHODID_TOGGLE_CLAIM_SWITCH)))
        .addMethod(
          getProvideTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.TxProto.MsgProvideToken,
              com.stafihub.stafihub.claim.TxProto.MsgProvideTokenResponse>(
                service, METHODID_PROVIDE_TOKEN)))
        .addMethod(
          getWithdrawTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.claim.TxProto.MsgWithdrawToken,
              com.stafihub.stafihub.claim.TxProto.MsgWithdrawTokenResponse>(
                service, METHODID_WITHDRAW_TOKEN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.claim.TxProto.getDescriptor();
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
              .addMethod(getSetMerkleRootMethod())
              .addMethod(getClaimMethod())
              .addMethod(getToggleClaimSwitchMethod())
              .addMethod(getProvideTokenMethod())
              .addMethod(getWithdrawTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
