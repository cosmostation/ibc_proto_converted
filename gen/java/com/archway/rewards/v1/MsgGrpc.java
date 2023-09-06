package com.archway.rewards.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the module messaging service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: archway/rewards/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "archway.rewards.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetContractMetadata,
      com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> getSetContractMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetContractMetadata",
      requestType = com.archway.rewards.v1.TxProto.MsgSetContractMetadata.class,
      responseType = com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetContractMetadata,
      com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> getSetContractMetadataMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetContractMetadata, com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> getSetContractMetadataMethod;
    if ((getSetContractMetadataMethod = MsgGrpc.getSetContractMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetContractMetadataMethod = MsgGrpc.getSetContractMetadataMethod) == null) {
          MsgGrpc.getSetContractMetadataMethod = getSetContractMetadataMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.TxProto.MsgSetContractMetadata, com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetContractMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgSetContractMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetContractMetadata"))
              .build();
        }
      }
    }
    return getSetContractMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgWithdrawRewards,
      com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawRewards",
      requestType = com.archway.rewards.v1.TxProto.MsgWithdrawRewards.class,
      responseType = com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgWithdrawRewards,
      com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgWithdrawRewards, com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> getWithdrawRewardsMethod;
    if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardsMethod = MsgGrpc.getWithdrawRewardsMethod) == null) {
          MsgGrpc.getWithdrawRewardsMethod = getWithdrawRewardsMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.TxProto.MsgWithdrawRewards, com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgWithdrawRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawRewards"))
              .build();
        }
      }
    }
    return getWithdrawRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetFlatFee,
      com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> getSetFlatFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFlatFee",
      requestType = com.archway.rewards.v1.TxProto.MsgSetFlatFee.class,
      responseType = com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetFlatFee,
      com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> getSetFlatFeeMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.TxProto.MsgSetFlatFee, com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> getSetFlatFeeMethod;
    if ((getSetFlatFeeMethod = MsgGrpc.getSetFlatFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetFlatFeeMethod = MsgGrpc.getSetFlatFeeMethod) == null) {
          MsgGrpc.getSetFlatFeeMethod = getSetFlatFeeMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.TxProto.MsgSetFlatFee, com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetFlatFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgSetFlatFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetFlatFee"))
              .build();
        }
      }
    }
    return getSetFlatFeeMethod;
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
   * Msg defines the module messaging service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SetContractMetadata creates or updates an existing contract metadata.
     * Method is authorized to the contract owner (admin if no metadata exists).
     * </pre>
     */
    default void setContractMetadata(com.archway.rewards.v1.TxProto.MsgSetContractMetadata request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetContractMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawRewards performs collected rewards distribution.
     * Rewards might be credited from multiple contracts (rewards_address must be
     * set in the corresponding contract metadata).
     * </pre>
     */
    default void withdrawRewards(com.archway.rewards.v1.TxProto.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetFlatFee sets or updates or removes the flat fee to interact with the
     * contract Method is authorized to the contract owner.
     * </pre>
     */
    default void setFlatFee(com.archway.rewards.v1.TxProto.MsgSetFlatFee request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFlatFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the module messaging service.
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
   * Msg defines the module messaging service.
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
     * SetContractMetadata creates or updates an existing contract metadata.
     * Method is authorized to the contract owner (admin if no metadata exists).
     * </pre>
     */
    public void setContractMetadata(com.archway.rewards.v1.TxProto.MsgSetContractMetadata request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetContractMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawRewards performs collected rewards distribution.
     * Rewards might be credited from multiple contracts (rewards_address must be
     * set in the corresponding contract metadata).
     * </pre>
     */
    public void withdrawRewards(com.archway.rewards.v1.TxProto.MsgWithdrawRewards request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetFlatFee sets or updates or removes the flat fee to interact with the
     * contract Method is authorized to the contract owner.
     * </pre>
     */
    public void setFlatFee(com.archway.rewards.v1.TxProto.MsgSetFlatFee request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFlatFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the module messaging service.
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
     * SetContractMetadata creates or updates an existing contract metadata.
     * Method is authorized to the contract owner (admin if no metadata exists).
     * </pre>
     */
    public com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse setContractMetadata(com.archway.rewards.v1.TxProto.MsgSetContractMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetContractMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawRewards performs collected rewards distribution.
     * Rewards might be credited from multiple contracts (rewards_address must be
     * set in the corresponding contract metadata).
     * </pre>
     */
    public com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse withdrawRewards(com.archway.rewards.v1.TxProto.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetFlatFee sets or updates or removes the flat fee to interact with the
     * contract Method is authorized to the contract owner.
     * </pre>
     */
    public com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse setFlatFee(com.archway.rewards.v1.TxProto.MsgSetFlatFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFlatFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the module messaging service.
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
     * SetContractMetadata creates or updates an existing contract metadata.
     * Method is authorized to the contract owner (admin if no metadata exists).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse> setContractMetadata(
        com.archway.rewards.v1.TxProto.MsgSetContractMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetContractMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawRewards performs collected rewards distribution.
     * Rewards might be credited from multiple contracts (rewards_address must be
     * set in the corresponding contract metadata).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse> withdrawRewards(
        com.archway.rewards.v1.TxProto.MsgWithdrawRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetFlatFee sets or updates or removes the flat fee to interact with the
     * contract Method is authorized to the contract owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse> setFlatFee(
        com.archway.rewards.v1.TxProto.MsgSetFlatFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFlatFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_CONTRACT_METADATA = 0;
  private static final int METHODID_WITHDRAW_REWARDS = 1;
  private static final int METHODID_SET_FLAT_FEE = 2;

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
        case METHODID_SET_CONTRACT_METADATA:
          serviceImpl.setContractMetadata((com.archway.rewards.v1.TxProto.MsgSetContractMetadata) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARDS:
          serviceImpl.withdrawRewards((com.archway.rewards.v1.TxProto.MsgWithdrawRewards) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse>) responseObserver);
          break;
        case METHODID_SET_FLAT_FEE:
          serviceImpl.setFlatFee((com.archway.rewards.v1.TxProto.MsgSetFlatFee) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse>) responseObserver);
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
          getSetContractMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.TxProto.MsgSetContractMetadata,
              com.archway.rewards.v1.TxProto.MsgSetContractMetadataResponse>(
                service, METHODID_SET_CONTRACT_METADATA)))
        .addMethod(
          getWithdrawRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.TxProto.MsgWithdrawRewards,
              com.archway.rewards.v1.TxProto.MsgWithdrawRewardsResponse>(
                service, METHODID_WITHDRAW_REWARDS)))
        .addMethod(
          getSetFlatFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.TxProto.MsgSetFlatFee,
              com.archway.rewards.v1.TxProto.MsgSetFlatFeeResponse>(
                service, METHODID_SET_FLAT_FEE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.archway.rewards.v1.TxProto.getDescriptor();
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
              .addMethod(getSetContractMetadataMethod())
              .addMethod(getWithdrawRewardsMethod())
              .addMethod(getSetFlatFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
