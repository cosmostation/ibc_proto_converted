package com.provenance.reward.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/reward/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.reward.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest,
      com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> getCreateRewardProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRewardProgram",
      requestType = com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest.class,
      responseType = com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest,
      com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> getCreateRewardProgramMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest, com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> getCreateRewardProgramMethod;
    if ((getCreateRewardProgramMethod = MsgGrpc.getCreateRewardProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRewardProgramMethod = MsgGrpc.getCreateRewardProgramMethod) == null) {
          MsgGrpc.getCreateRewardProgramMethod = getCreateRewardProgramMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest, com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRewardProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRewardProgram"))
              .build();
        }
      }
    }
    return getCreateRewardProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest,
      com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> getEndRewardProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndRewardProgram",
      requestType = com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest.class,
      responseType = com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest,
      com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> getEndRewardProgramMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest, com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> getEndRewardProgramMethod;
    if ((getEndRewardProgramMethod = MsgGrpc.getEndRewardProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEndRewardProgramMethod = MsgGrpc.getEndRewardProgramMethod) == null) {
          MsgGrpc.getEndRewardProgramMethod = getEndRewardProgramMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest, com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndRewardProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EndRewardProgram"))
              .build();
        }
      }
    }
    return getEndRewardProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest,
      com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> getClaimRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRewards",
      requestType = com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest.class,
      responseType = com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest,
      com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> getClaimRewardsMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest, com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> getClaimRewardsMethod;
    if ((getClaimRewardsMethod = MsgGrpc.getClaimRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimRewardsMethod = MsgGrpc.getClaimRewardsMethod) == null) {
          MsgGrpc.getClaimRewardsMethod = getClaimRewardsMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest, com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimRewards"))
              .build();
        }
      }
    }
    return getClaimRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest,
      com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> getClaimAllRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimAllRewards",
      requestType = com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest.class,
      responseType = com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest,
      com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> getClaimAllRewardsMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest, com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> getClaimAllRewardsMethod;
    if ((getClaimAllRewardsMethod = MsgGrpc.getClaimAllRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimAllRewardsMethod = MsgGrpc.getClaimAllRewardsMethod) == null) {
          MsgGrpc.getClaimAllRewardsMethod = getClaimAllRewardsMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest, com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimAllRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimAllRewards"))
              .build();
        }
      }
    }
    return getClaimAllRewardsMethod;
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
   * Msg
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateRewardProgram is the RPC endpoint for creating a rewards program
     * </pre>
     */
    default void createRewardProgram(com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRewardProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * EndRewardProgram is the RPC endpoint for ending a rewards program
     * </pre>
     */
    default void endRewardProgram(com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndRewardProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
     * </pre>
     */
    default void claimRewards(com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
     * the signer of the tx.
     * </pre>
     */
    default void claimAllRewards(com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimAllRewardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg
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
   * Msg
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
     * CreateRewardProgram is the RPC endpoint for creating a rewards program
     * </pre>
     */
    public void createRewardProgram(com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRewardProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EndRewardProgram is the RPC endpoint for ending a rewards program
     * </pre>
     */
    public void endRewardProgram(com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndRewardProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
     * </pre>
     */
    public void claimRewards(com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
     * the signer of the tx.
     * </pre>
     */
    public void claimAllRewards(com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimAllRewardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg
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
     * CreateRewardProgram is the RPC endpoint for creating a rewards program
     * </pre>
     */
    public com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse createRewardProgram(com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRewardProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EndRewardProgram is the RPC endpoint for ending a rewards program
     * </pre>
     */
    public com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse endRewardProgram(com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndRewardProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
     * </pre>
     */
    public com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse claimRewards(com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
     * the signer of the tx.
     * </pre>
     */
    public com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse claimAllRewards(com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimAllRewardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg
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
     * CreateRewardProgram is the RPC endpoint for creating a rewards program
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse> createRewardProgram(
        com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRewardProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EndRewardProgram is the RPC endpoint for ending a rewards program
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse> endRewardProgram(
        com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndRewardProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse> claimRewards(
        com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
     * the signer of the tx.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse> claimAllRewards(
        com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimAllRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REWARD_PROGRAM = 0;
  private static final int METHODID_END_REWARD_PROGRAM = 1;
  private static final int METHODID_CLAIM_REWARDS = 2;
  private static final int METHODID_CLAIM_ALL_REWARDS = 3;

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
        case METHODID_CREATE_REWARD_PROGRAM:
          serviceImpl.createRewardProgram((com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse>) responseObserver);
          break;
        case METHODID_END_REWARD_PROGRAM:
          serviceImpl.endRewardProgram((com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse>) responseObserver);
          break;
        case METHODID_CLAIM_REWARDS:
          serviceImpl.claimRewards((com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_ALL_REWARDS:
          serviceImpl.claimAllRewards((com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse>) responseObserver);
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
          getCreateRewardProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.TxProto.MsgCreateRewardProgramRequest,
              com.provenance.reward.v1.TxProto.MsgCreateRewardProgramResponse>(
                service, METHODID_CREATE_REWARD_PROGRAM)))
        .addMethod(
          getEndRewardProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.TxProto.MsgEndRewardProgramRequest,
              com.provenance.reward.v1.TxProto.MsgEndRewardProgramResponse>(
                service, METHODID_END_REWARD_PROGRAM)))
        .addMethod(
          getClaimRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.TxProto.MsgClaimRewardsRequest,
              com.provenance.reward.v1.TxProto.MsgClaimRewardsResponse>(
                service, METHODID_CLAIM_REWARDS)))
        .addMethod(
          getClaimAllRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.TxProto.MsgClaimAllRewardsRequest,
              com.provenance.reward.v1.TxProto.MsgClaimAllRewardsResponse>(
                service, METHODID_CLAIM_ALL_REWARDS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.reward.v1.TxProto.getDescriptor();
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
              .addMethod(getCreateRewardProgramMethod())
              .addMethod(getEndRewardProgramMethod())
              .addMethod(getClaimRewardsMethod())
              .addMethod(getClaimAllRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
