package com.kyve.team.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/team/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.team.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked,
      com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> getClaimUnlockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUnlocked",
      requestType = com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked.class,
      responseType = com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked,
      com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> getClaimUnlockedMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked, com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> getClaimUnlockedMethod;
    if ((getClaimUnlockedMethod = MsgGrpc.getClaimUnlockedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUnlockedMethod = MsgGrpc.getClaimUnlockedMethod) == null) {
          MsgGrpc.getClaimUnlockedMethod = getClaimUnlockedMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked, com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUnlocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUnlocked"))
              .build();
        }
      }
    }
    return getClaimUnlockedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClawback,
      com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> getClawbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clawback",
      requestType = com.kyve.team.v1beta1.TxProto.MsgClawback.class,
      responseType = com.kyve.team.v1beta1.TxProto.MsgClawbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClawback,
      com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> getClawbackMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClawback, com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> getClawbackMethod;
    if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
          MsgGrpc.getClawbackMethod = getClawbackMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.TxProto.MsgClawback, com.kyve.team.v1beta1.TxProto.MsgClawbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clawback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClawback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClawbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Clawback"))
              .build();
        }
      }
    }
    return getClawbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount,
      com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeamVestingAccount",
      requestType = com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount.class,
      responseType = com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount,
      com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount, com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> getCreateTeamVestingAccountMethod;
    if ((getCreateTeamVestingAccountMethod = MsgGrpc.getCreateTeamVestingAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTeamVestingAccountMethod = MsgGrpc.getCreateTeamVestingAccountMethod) == null) {
          MsgGrpc.getCreateTeamVestingAccountMethod = getCreateTeamVestingAccountMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount, com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeamVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTeamVestingAccount"))
              .build();
        }
      }
    }
    return getCreateTeamVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards,
      com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAuthorityRewards",
      requestType = com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards.class,
      responseType = com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards,
      com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards, com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> getClaimAuthorityRewardsMethod;
    if ((getClaimAuthorityRewardsMethod = MsgGrpc.getClaimAuthorityRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAuthorityRewardsMethod = MsgGrpc.getClaimAuthorityRewardsMethod) == null) {
          MsgGrpc.getClaimAuthorityRewardsMethod = getClaimAuthorityRewardsMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards, com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAuthorityRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAuthorityRewards"))
              .build();
        }
      }
    }
    return getClaimAuthorityRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards,
      com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAccountRewards",
      requestType = com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards.class,
      responseType = com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards,
      com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod() {
    io.grpc.MethodDescriptor<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards, com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> getClaimAccountRewardsMethod;
    if ((getClaimAccountRewardsMethod = MsgGrpc.getClaimAccountRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAccountRewardsMethod = MsgGrpc.getClaimAccountRewardsMethod) == null) {
          MsgGrpc.getClaimAccountRewardsMethod = getClaimAccountRewardsMethod =
              io.grpc.MethodDescriptor.<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards, com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAccountRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAccountRewards"))
              .build();
        }
      }
    }
    return getClaimAccountRewardsMethod;
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
     * ClaimUnlocked ...
     * </pre>
     */
    default void claimUnlocked(com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimUnlockedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    default void clawback(com.kyve.team.v1beta1.TxProto.MsgClawback request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClawbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    default void createTeamVestingAccount(com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    default void claimAuthorityRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimAuthorityRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    default void claimAccountRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimAccountRewardsMethod(), responseObserver);
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
     * ClaimUnlocked ...
     * </pre>
     */
    public void claimUnlocked(com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimUnlockedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public void clawback(com.kyve.team.v1beta1.TxProto.MsgClawback request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public void createTeamVestingAccount(com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public void claimAuthorityRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimAuthorityRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public void claimAccountRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards request,
        io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimAccountRewardsMethod(), getCallOptions()), request, responseObserver);
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
     * ClaimUnlocked ...
     * </pre>
     */
    public com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse claimUnlocked(com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimUnlockedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public com.kyve.team.v1beta1.TxProto.MsgClawbackResponse clawback(com.kyve.team.v1beta1.TxProto.MsgClawback request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClawbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse createTeamVestingAccount(com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse claimAuthorityRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimAuthorityRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse claimAccountRewards(com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimAccountRewardsMethod(), getCallOptions(), request);
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
     * ClaimUnlocked ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse> claimUnlocked(
        com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimUnlockedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clawback ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.TxProto.MsgClawbackResponse> clawback(
        com.kyve.team.v1beta1.TxProto.MsgClawback request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateTeamVestingAccount ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse> createTeamVestingAccount(
        com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimAuthorityRewards ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse> claimAuthorityRewards(
        com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimAuthorityRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimInflationRewards ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse> claimAccountRewards(
        com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimAccountRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM_UNLOCKED = 0;
  private static final int METHODID_CLAWBACK = 1;
  private static final int METHODID_CREATE_TEAM_VESTING_ACCOUNT = 2;
  private static final int METHODID_CLAIM_AUTHORITY_REWARDS = 3;
  private static final int METHODID_CLAIM_ACCOUNT_REWARDS = 4;

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
        case METHODID_CLAIM_UNLOCKED:
          serviceImpl.claimUnlocked((com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse>) responseObserver);
          break;
        case METHODID_CLAWBACK:
          serviceImpl.clawback((com.kyve.team.v1beta1.TxProto.MsgClawback) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClawbackResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEAM_VESTING_ACCOUNT:
          serviceImpl.createTeamVestingAccount((com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse>) responseObserver);
          break;
        case METHODID_CLAIM_AUTHORITY_REWARDS:
          serviceImpl.claimAuthorityRewards((com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_ACCOUNT_REWARDS:
          serviceImpl.claimAccountRewards((com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards) request,
              (io.grpc.stub.StreamObserver<com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse>) responseObserver);
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
          getClaimUnlockedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.TxProto.MsgClaimUnlocked,
              com.kyve.team.v1beta1.TxProto.MsgClaimUnlockedResponse>(
                service, METHODID_CLAIM_UNLOCKED)))
        .addMethod(
          getClawbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.TxProto.MsgClawback,
              com.kyve.team.v1beta1.TxProto.MsgClawbackResponse>(
                service, METHODID_CLAWBACK)))
        .addMethod(
          getCreateTeamVestingAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccount,
              com.kyve.team.v1beta1.TxProto.MsgCreateTeamVestingAccountResponse>(
                service, METHODID_CREATE_TEAM_VESTING_ACCOUNT)))
        .addMethod(
          getClaimAuthorityRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewards,
              com.kyve.team.v1beta1.TxProto.MsgClaimAuthorityRewardsResponse>(
                service, METHODID_CLAIM_AUTHORITY_REWARDS)))
        .addMethod(
          getClaimAccountRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewards,
              com.kyve.team.v1beta1.TxProto.MsgClaimAccountRewardsResponse>(
                service, METHODID_CLAIM_ACCOUNT_REWARDS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.team.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getClaimUnlockedMethod())
              .addMethod(getClawbackMethod())
              .addMethod(getCreateTeamVestingAccountMethod())
              .addMethod(getClaimAuthorityRewardsMethod())
              .addMethod(getClaimAccountRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
