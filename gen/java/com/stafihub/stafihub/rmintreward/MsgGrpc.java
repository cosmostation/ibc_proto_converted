package com.stafihub.stafihub.rmintreward;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/rmintreward/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rmintreward.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct,
      com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> getAddMintRewardActMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMintRewardAct",
      requestType = com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.class,
      responseType = com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct,
      com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> getAddMintRewardActMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct, com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> getAddMintRewardActMethod;
    if ((getAddMintRewardActMethod = MsgGrpc.getAddMintRewardActMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMintRewardActMethod = MsgGrpc.getAddMintRewardActMethod) == null) {
          MsgGrpc.getAddMintRewardActMethod = getAddMintRewardActMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct, com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMintRewardAct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMintRewardAct"))
              .build();
        }
      }
    }
    return getAddMintRewardActMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct,
      com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMintRewardAct",
      requestType = com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct.class,
      responseType = com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct,
      com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct, com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> getUpdateMintRewardActMethod;
    if ((getUpdateMintRewardActMethod = MsgGrpc.getUpdateMintRewardActMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMintRewardActMethod = MsgGrpc.getUpdateMintRewardActMethod) == null) {
          MsgGrpc.getUpdateMintRewardActMethod = getUpdateMintRewardActMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct, com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMintRewardAct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMintRewardAct"))
              .build();
        }
      }
    }
    return getUpdateMintRewardActMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgClaimMintReward,
      com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> getClaimMintRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimMintReward",
      requestType = com.stafihub.stafihub.rmintreward.MsgClaimMintReward.class,
      responseType = com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgClaimMintReward,
      com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> getClaimMintRewardMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgClaimMintReward, com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> getClaimMintRewardMethod;
    if ((getClaimMintRewardMethod = MsgGrpc.getClaimMintRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMintRewardMethod = MsgGrpc.getClaimMintRewardMethod) == null) {
          MsgGrpc.getClaimMintRewardMethod = getClaimMintRewardMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.MsgClaimMintReward, com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimMintReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgClaimMintReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimMintReward"))
              .build();
        }
      }
    }
    return getClaimMintRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgProvideRewardToken,
      com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideRewardToken",
      requestType = com.stafihub.stafihub.rmintreward.MsgProvideRewardToken.class,
      responseType = com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgProvideRewardToken,
      com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.MsgProvideRewardToken, com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> getProvideRewardTokenMethod;
    if ((getProvideRewardTokenMethod = MsgGrpc.getProvideRewardTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideRewardTokenMethod = MsgGrpc.getProvideRewardTokenMethod) == null) {
          MsgGrpc.getProvideRewardTokenMethod = getProvideRewardTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.MsgProvideRewardToken, com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideRewardToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgProvideRewardToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideRewardToken"))
              .build();
        }
      }
    }
    return getProvideRewardTokenMethod;
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
    default void addMintRewardAct(com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMintRewardActMethod(), responseObserver);
    }

    /**
     */
    default void updateMintRewardAct(com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMintRewardActMethod(), responseObserver);
    }

    /**
     */
    default void claimMintReward(com.stafihub.stafihub.rmintreward.MsgClaimMintReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMintRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void provideRewardToken(com.stafihub.stafihub.rmintreward.MsgProvideRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideRewardTokenMethod(), responseObserver);
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
    public void addMintRewardAct(com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMintRewardActMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMintRewardAct(com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMintRewardActMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimMintReward(com.stafihub.stafihub.rmintreward.MsgClaimMintReward request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMintRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void provideRewardToken(com.stafihub.stafihub.rmintreward.MsgProvideRewardToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideRewardTokenMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse addMintRewardAct(com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMintRewardActMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse updateMintRewardAct(com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMintRewardActMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse claimMintReward(com.stafihub.stafihub.rmintreward.MsgClaimMintReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMintRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse provideRewardToken(com.stafihub.stafihub.rmintreward.MsgProvideRewardToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideRewardTokenMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse> addMintRewardAct(
        com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMintRewardActMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse> updateMintRewardAct(
        com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMintRewardActMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse> claimMintReward(
        com.stafihub.stafihub.rmintreward.MsgClaimMintReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMintRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse> provideRewardToken(
        com.stafihub.stafihub.rmintreward.MsgProvideRewardToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideRewardTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_MINT_REWARD_ACT = 0;
  private static final int METHODID_UPDATE_MINT_REWARD_ACT = 1;
  private static final int METHODID_CLAIM_MINT_REWARD = 2;
  private static final int METHODID_PROVIDE_REWARD_TOKEN = 3;

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
        case METHODID_ADD_MINT_REWARD_ACT:
          serviceImpl.addMintRewardAct((com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MINT_REWARD_ACT:
          serviceImpl.updateMintRewardAct((com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse>) responseObserver);
          break;
        case METHODID_CLAIM_MINT_REWARD:
          serviceImpl.claimMintReward((com.stafihub.stafihub.rmintreward.MsgClaimMintReward) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_REWARD_TOKEN:
          serviceImpl.provideRewardToken((com.stafihub.stafihub.rmintreward.MsgProvideRewardToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse>) responseObserver);
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
          getAddMintRewardActMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.MsgAddMintRewardAct,
              com.stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse>(
                service, METHODID_ADD_MINT_REWARD_ACT)))
        .addMethod(
          getUpdateMintRewardActMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct,
              com.stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse>(
                service, METHODID_UPDATE_MINT_REWARD_ACT)))
        .addMethod(
          getClaimMintRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.MsgClaimMintReward,
              com.stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse>(
                service, METHODID_CLAIM_MINT_REWARD)))
        .addMethod(
          getProvideRewardTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.MsgProvideRewardToken,
              com.stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse>(
                service, METHODID_PROVIDE_REWARD_TOKEN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rmintreward.TxProto.getDescriptor();
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
              .addMethod(getAddMintRewardActMethod())
              .addMethod(getUpdateMintRewardActMethod())
              .addMethod(getClaimMintRewardMethod())
              .addMethod(getProvideRewardTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
