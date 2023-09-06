package com.comdex.rewards.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: comdex/rewards/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "comdex.rewards.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge,
      com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGauge",
      requestType = com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge.class,
      responseType = com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge,
      com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge, com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod;
    if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
          MsgGrpc.getCreateGaugeMethod = getCreateGaugeMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge, com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGauge"))
              .build();
        }
      }
    }
    return getCreateGaugeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> getExternalRewardsLockersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalRewardsLockers",
      requestType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers.class,
      responseType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> getExternalRewardsLockersMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> getExternalRewardsLockersMethod;
    if ((getExternalRewardsLockersMethod = MsgGrpc.getExternalRewardsLockersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExternalRewardsLockersMethod = MsgGrpc.getExternalRewardsLockersMethod) == null) {
          MsgGrpc.getExternalRewardsLockersMethod = getExternalRewardsLockersMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalRewardsLockers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExternalRewardsLockers"))
              .build();
        }
      }
    }
    return getExternalRewardsLockersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> getExternalRewardsVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalRewardsVault",
      requestType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault.class,
      responseType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> getExternalRewardsVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> getExternalRewardsVaultMethod;
    if ((getExternalRewardsVaultMethod = MsgGrpc.getExternalRewardsVaultMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExternalRewardsVaultMethod = MsgGrpc.getExternalRewardsVaultMethod) == null) {
          MsgGrpc.getExternalRewardsVaultMethod = getExternalRewardsVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalRewardsVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExternalRewardsVault"))
              .build();
        }
      }
    }
    return getExternalRewardsVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> getExternalRewardsLendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalRewardsLend",
      requestType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend.class,
      responseType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> getExternalRewardsLendMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> getExternalRewardsLendMethod;
    if ((getExternalRewardsLendMethod = MsgGrpc.getExternalRewardsLendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExternalRewardsLendMethod = MsgGrpc.getExternalRewardsLendMethod) == null) {
          MsgGrpc.getExternalRewardsLendMethod = getExternalRewardsLendMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalRewardsLend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExternalRewardsLend"))
              .build();
        }
      }
    }
    return getExternalRewardsLendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> getExternalRewardsStableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalRewardsStableMint",
      requestType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint.class,
      responseType = com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint,
      com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> getExternalRewardsStableMintMethod() {
    io.grpc.MethodDescriptor<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> getExternalRewardsStableMintMethod;
    if ((getExternalRewardsStableMintMethod = MsgGrpc.getExternalRewardsStableMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExternalRewardsStableMintMethod = MsgGrpc.getExternalRewardsStableMintMethod) == null) {
          MsgGrpc.getExternalRewardsStableMintMethod = getExternalRewardsStableMintMethod =
              io.grpc.MethodDescriptor.<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint, com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalRewardsStableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExternalRewardsStableMint"))
              .build();
        }
      }
    }
    return getExternalRewardsStableMintMethod;
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
    default void createGauge(com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGaugeMethod(), responseObserver);
    }

    /**
     */
    default void externalRewardsLockers(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalRewardsLockersMethod(), responseObserver);
    }

    /**
     */
    default void externalRewardsVault(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalRewardsVaultMethod(), responseObserver);
    }

    /**
     */
    default void externalRewardsLend(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalRewardsLendMethod(), responseObserver);
    }

    /**
     */
    default void externalRewardsStableMint(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalRewardsStableMintMethod(), responseObserver);
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
    public void createGauge(com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void externalRewardsLockers(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalRewardsLockersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void externalRewardsVault(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalRewardsVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void externalRewardsLend(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalRewardsLendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void externalRewardsStableMint(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint request,
        io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalRewardsStableMintMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse createGauge(com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGaugeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse externalRewardsLockers(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalRewardsLockersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse externalRewardsVault(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalRewardsVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse externalRewardsLend(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalRewardsLendMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse externalRewardsStableMint(com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalRewardsStableMintMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse> createGauge(
        com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse> externalRewardsLockers(
        com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalRewardsLockersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse> externalRewardsVault(
        com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalRewardsVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse> externalRewardsLend(
        com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalRewardsLendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse> externalRewardsStableMint(
        com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalRewardsStableMintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GAUGE = 0;
  private static final int METHODID_EXTERNAL_REWARDS_LOCKERS = 1;
  private static final int METHODID_EXTERNAL_REWARDS_VAULT = 2;
  private static final int METHODID_EXTERNAL_REWARDS_LEND = 3;
  private static final int METHODID_EXTERNAL_REWARDS_STABLE_MINT = 4;

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
        case METHODID_CREATE_GAUGE:
          serviceImpl.createGauge((com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_REWARDS_LOCKERS:
          serviceImpl.externalRewardsLockers((com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_REWARDS_VAULT:
          serviceImpl.externalRewardsVault((com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_REWARDS_LEND:
          serviceImpl.externalRewardsLend((com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_REWARDS_STABLE_MINT:
          serviceImpl.externalRewardsStableMint((com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint) request,
              (io.grpc.stub.StreamObserver<com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse>) responseObserver);
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
          getCreateGaugeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.TxProto.MsgCreateGauge,
              com.comdex.rewards.v1beta1.TxProto.MsgCreateGaugeResponse>(
                service, METHODID_CREATE_GAUGE)))
        .addMethod(
          getExternalRewardsLockersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockers,
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLockersResponse>(
                service, METHODID_EXTERNAL_REWARDS_LOCKERS)))
        .addMethod(
          getExternalRewardsVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVault,
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsVaultResponse>(
                service, METHODID_EXTERNAL_REWARDS_VAULT)))
        .addMethod(
          getExternalRewardsLendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLend,
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsLendResponse>(
                service, METHODID_EXTERNAL_REWARDS_LEND)))
        .addMethod(
          getExternalRewardsStableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMint,
              com.comdex.rewards.v1beta1.TxProto.ActivateExternalRewardsStableMintResponse>(
                service, METHODID_EXTERNAL_REWARDS_STABLE_MINT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.rewards.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateGaugeMethod())
              .addMethod(getExternalRewardsLockersMethod())
              .addMethod(getExternalRewardsVaultMethod())
              .addMethod(getExternalRewardsLendMethod())
              .addMethod(getExternalRewardsStableMintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
