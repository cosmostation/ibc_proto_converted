package com.osmosis.valsetpref.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the valset-pref modules's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: osmosis/valset-pref/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "osmosis.valsetpref.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetValidatorSetPreference",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference, com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> getSetValidatorSetPreferenceMethod;
    if ((getSetValidatorSetPreferenceMethod = MsgGrpc.getSetValidatorSetPreferenceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetValidatorSetPreferenceMethod = MsgGrpc.getSetValidatorSetPreferenceMethod) == null) {
          MsgGrpc.getSetValidatorSetPreferenceMethod = getSetValidatorSetPreferenceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference, com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetValidatorSetPreference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetValidatorSetPreference"))
              .build();
        }
      }
    }
    return getSetValidatorSetPreferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateToValidatorSet",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> getDelegateToValidatorSetMethod;
    if ((getDelegateToValidatorSetMethod = MsgGrpc.getDelegateToValidatorSetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateToValidatorSetMethod = MsgGrpc.getDelegateToValidatorSetMethod) == null) {
          MsgGrpc.getDelegateToValidatorSetMethod = getDelegateToValidatorSetMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateToValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DelegateToValidatorSet"))
              .build();
        }
      }
    }
    return getDelegateToValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UndelegateFromValidatorSet",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> getUndelegateFromValidatorSetMethod;
    if ((getUndelegateFromValidatorSetMethod = MsgGrpc.getUndelegateFromValidatorSetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateFromValidatorSetMethod = MsgGrpc.getUndelegateFromValidatorSetMethod) == null) {
          MsgGrpc.getUndelegateFromValidatorSetMethod = getUndelegateFromValidatorSetMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UndelegateFromValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UndelegateFromValidatorSet"))
              .build();
        }
      }
    }
    return getUndelegateFromValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> getRedelegateValidatorSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedelegateValidatorSet",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> getRedelegateValidatorSetMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> getRedelegateValidatorSetMethod;
    if ((getRedelegateValidatorSetMethod = MsgGrpc.getRedelegateValidatorSetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedelegateValidatorSetMethod = MsgGrpc.getRedelegateValidatorSetMethod) == null) {
          MsgGrpc.getRedelegateValidatorSetMethod = getRedelegateValidatorSetMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet, com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedelegateValidatorSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RedelegateValidatorSet"))
              .build();
        }
      }
    }
    return getRedelegateValidatorSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawDelegationRewards",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards, com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> getWithdrawDelegationRewardsMethod;
    if ((getWithdrawDelegationRewardsMethod = MsgGrpc.getWithdrawDelegationRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawDelegationRewardsMethod = MsgGrpc.getWithdrawDelegationRewardsMethod) == null) {
          MsgGrpc.getWithdrawDelegationRewardsMethod = getWithdrawDelegationRewardsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards, com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawDelegationRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawDelegationRewards"))
              .build();
        }
      }
    }
    return getWithdrawDelegationRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> getDelegateBondedTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateBondedTokens",
      requestType = com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens.class,
      responseType = com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens,
      com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> getDelegateBondedTokensMethod() {
    io.grpc.MethodDescriptor<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens, com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> getDelegateBondedTokensMethod;
    if ((getDelegateBondedTokensMethod = MsgGrpc.getDelegateBondedTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateBondedTokensMethod = MsgGrpc.getDelegateBondedTokensMethod) == null) {
          MsgGrpc.getDelegateBondedTokensMethod = getDelegateBondedTokensMethod =
              io.grpc.MethodDescriptor.<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens, com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateBondedTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DelegateBondedTokens"))
              .build();
        }
      }
    }
    return getDelegateBondedTokensMethod;
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
   * Msg defines the valset-pref modules's gRPC message service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    default void setValidatorSetPreference(com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetValidatorSetPreferenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    default void delegateToValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateToValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    default void undelegateFromValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateFromValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RedelegateValidatorSet takes the existing validator set and redelegates to
     * a new set.
     * </pre>
     */
    default void redelegateValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedelegateValidatorSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    default void withdrawDelegationRewards(com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawDelegationRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegateBondedTokens allows users to break the lockup bond and delegate
     * osmo tokens to a predefined validator-set.
     * </pre>
     */
    default void delegateBondedTokens(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateBondedTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the valset-pref modules's gRPC message service.
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
   * Msg defines the valset-pref modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public void setValidatorSetPreference(com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetValidatorSetPreferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public void delegateToValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateToValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public void undelegateFromValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateFromValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RedelegateValidatorSet takes the existing validator set and redelegates to
     * a new set.
     * </pre>
     */
    public void redelegateValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedelegateValidatorSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public void withdrawDelegationRewards(com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawDelegationRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegateBondedTokens allows users to break the lockup bond and delegate
     * osmo tokens to a predefined validator-set.
     * </pre>
     */
    public void delegateBondedTokens(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens request,
        io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateBondedTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the valset-pref modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse setValidatorSetPreference(com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetValidatorSetPreferenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse delegateToValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateToValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse undelegateFromValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateFromValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RedelegateValidatorSet takes the existing validator set and redelegates to
     * a new set.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse redelegateValidatorSet(com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedelegateValidatorSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse withdrawDelegationRewards(com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawDelegationRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegateBondedTokens allows users to break the lockup bond and delegate
     * osmo tokens to a predefined validator-set.
     * </pre>
     */
    public com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse delegateBondedTokens(com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateBondedTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the valset-pref modules's gRPC message service.
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
     * SetValidatorSetPreference creates a set of validator preference.
     * This message will process both create + update request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse> setValidatorSetPreference(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetValidatorSetPreferenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegateToValidatorSet gets the owner, coins and delegates to a
     * validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse> delegateToValidatorSet(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateToValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UndelegateFromValidatorSet gets the owner and coins and undelegates from
     * validator-set. The unbonding logic will follow the `Undelegate` logic from
     * the sdk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse> undelegateFromValidatorSet(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateFromValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RedelegateValidatorSet takes the existing validator set and redelegates to
     * a new set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse> redelegateValidatorSet(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedelegateValidatorSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawDelegationRewards allows users to claim rewards from the
     * validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse> withdrawDelegationRewards(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawDelegationRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegateBondedTokens allows users to break the lockup bond and delegate
     * osmo tokens to a predefined validator-set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse> delegateBondedTokens(
        com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateBondedTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_VALIDATOR_SET_PREFERENCE = 0;
  private static final int METHODID_DELEGATE_TO_VALIDATOR_SET = 1;
  private static final int METHODID_UNDELEGATE_FROM_VALIDATOR_SET = 2;
  private static final int METHODID_REDELEGATE_VALIDATOR_SET = 3;
  private static final int METHODID_WITHDRAW_DELEGATION_REWARDS = 4;
  private static final int METHODID_DELEGATE_BONDED_TOKENS = 5;

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
        case METHODID_SET_VALIDATOR_SET_PREFERENCE:
          serviceImpl.setValidatorSetPreference((com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_TO_VALIDATOR_SET:
          serviceImpl.delegateToValidatorSet((com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE_FROM_VALIDATOR_SET:
          serviceImpl.undelegateFromValidatorSet((com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse>) responseObserver);
          break;
        case METHODID_REDELEGATE_VALIDATOR_SET:
          serviceImpl.redelegateValidatorSet((com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_DELEGATION_REWARDS:
          serviceImpl.withdrawDelegationRewards((com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_BONDED_TOKENS:
          serviceImpl.delegateBondedTokens((com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens) request,
              (io.grpc.stub.StreamObserver<com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse>) responseObserver);
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
          getSetValidatorSetPreferenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreference,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgSetValidatorSetPreferenceResponse>(
                service, METHODID_SET_VALIDATOR_SET_PREFERENCE)))
        .addMethod(
          getDelegateToValidatorSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSet,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateToValidatorSetResponse>(
                service, METHODID_DELEGATE_TO_VALIDATOR_SET)))
        .addMethod(
          getUndelegateFromValidatorSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSet,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgUndelegateFromValidatorSetResponse>(
                service, METHODID_UNDELEGATE_FROM_VALIDATOR_SET)))
        .addMethod(
          getRedelegateValidatorSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSet,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgRedelegateValidatorSetResponse>(
                service, METHODID_REDELEGATE_VALIDATOR_SET)))
        .addMethod(
          getWithdrawDelegationRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewards,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgWithdrawDelegationRewardsResponse>(
                service, METHODID_WITHDRAW_DELEGATION_REWARDS)))
        .addMethod(
          getDelegateBondedTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokens,
              com.osmosis.valsetpref.v1beta1.TxProto.MsgDelegateBondedTokensResponse>(
                service, METHODID_DELEGATE_BONDED_TOKENS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.valsetpref.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getSetValidatorSetPreferenceMethod())
              .addMethod(getDelegateToValidatorSetMethod())
              .addMethod(getUndelegateFromValidatorSetMethod())
              .addMethod(getRedelegateValidatorSetMethod())
              .addMethod(getWithdrawDelegationRewardsMethod())
              .addMethod(getDelegateBondedTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
