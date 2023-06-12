package com.kyve.stakers.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/stakers/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.stakers.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgCreateStaker,
      com.kyve.stakers.v1beta1.MsgCreateStakerResponse> getCreateStakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStaker",
      requestType = com.kyve.stakers.v1beta1.MsgCreateStaker.class,
      responseType = com.kyve.stakers.v1beta1.MsgCreateStakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgCreateStaker,
      com.kyve.stakers.v1beta1.MsgCreateStakerResponse> getCreateStakerMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgCreateStaker, com.kyve.stakers.v1beta1.MsgCreateStakerResponse> getCreateStakerMethod;
    if ((getCreateStakerMethod = MsgGrpc.getCreateStakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateStakerMethod = MsgGrpc.getCreateStakerMethod) == null) {
          MsgGrpc.getCreateStakerMethod = getCreateStakerMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgCreateStaker, com.kyve.stakers.v1beta1.MsgCreateStakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgCreateStaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgCreateStakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateStaker"))
              .build();
        }
      }
    }
    return getCreateStakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateMetadata,
      com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> getUpdateMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMetadata",
      requestType = com.kyve.stakers.v1beta1.MsgUpdateMetadata.class,
      responseType = com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateMetadata,
      com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> getUpdateMetadataMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateMetadata, com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> getUpdateMetadataMethod;
    if ((getUpdateMetadataMethod = MsgGrpc.getUpdateMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMetadataMethod = MsgGrpc.getUpdateMetadataMethod) == null) {
          MsgGrpc.getUpdateMetadataMethod = getUpdateMetadataMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgUpdateMetadata, com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMetadata"))
              .build();
        }
      }
    }
    return getUpdateMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateCommission,
      com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> getUpdateCommissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommission",
      requestType = com.kyve.stakers.v1beta1.MsgUpdateCommission.class,
      responseType = com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateCommission,
      com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> getUpdateCommissionMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateCommission, com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> getUpdateCommissionMethod;
    if ((getUpdateCommissionMethod = MsgGrpc.getUpdateCommissionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateCommissionMethod = MsgGrpc.getUpdateCommissionMethod) == null) {
          MsgGrpc.getUpdateCommissionMethod = getUpdateCommissionMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgUpdateCommission, com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateCommission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateCommission"))
              .build();
        }
      }
    }
    return getUpdateCommissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgClaimCommissionRewards,
      com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> getClaimCommissionRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimCommissionRewards",
      requestType = com.kyve.stakers.v1beta1.MsgClaimCommissionRewards.class,
      responseType = com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgClaimCommissionRewards,
      com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> getClaimCommissionRewardsMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgClaimCommissionRewards, com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> getClaimCommissionRewardsMethod;
    if ((getClaimCommissionRewardsMethod = MsgGrpc.getClaimCommissionRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimCommissionRewardsMethod = MsgGrpc.getClaimCommissionRewardsMethod) == null) {
          MsgGrpc.getClaimCommissionRewardsMethod = getClaimCommissionRewardsMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgClaimCommissionRewards, com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimCommissionRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgClaimCommissionRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimCommissionRewards"))
              .build();
        }
      }
    }
    return getClaimCommissionRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgJoinPool,
      com.kyve.stakers.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinPool",
      requestType = com.kyve.stakers.v1beta1.MsgJoinPool.class,
      responseType = com.kyve.stakers.v1beta1.MsgJoinPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgJoinPool,
      com.kyve.stakers.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgJoinPool, com.kyve.stakers.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod;
    if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
          MsgGrpc.getJoinPoolMethod = getJoinPoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgJoinPool, com.kyve.stakers.v1beta1.MsgJoinPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgJoinPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgJoinPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JoinPool"))
              .build();
        }
      }
    }
    return getJoinPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgLeavePool,
      com.kyve.stakers.v1beta1.MsgLeavePoolResponse> getLeavePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeavePool",
      requestType = com.kyve.stakers.v1beta1.MsgLeavePool.class,
      responseType = com.kyve.stakers.v1beta1.MsgLeavePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgLeavePool,
      com.kyve.stakers.v1beta1.MsgLeavePoolResponse> getLeavePoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgLeavePool, com.kyve.stakers.v1beta1.MsgLeavePoolResponse> getLeavePoolMethod;
    if ((getLeavePoolMethod = MsgGrpc.getLeavePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLeavePoolMethod = MsgGrpc.getLeavePoolMethod) == null) {
          MsgGrpc.getLeavePoolMethod = getLeavePoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgLeavePool, com.kyve.stakers.v1beta1.MsgLeavePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeavePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgLeavePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgLeavePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LeavePool"))
              .build();
        }
      }
    }
    return getLeavePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateParams,
      com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.kyve.stakers.v1beta1.MsgUpdateParams.class,
      responseType = com.kyve.stakers.v1beta1.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateParams,
      com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.kyve.stakers.v1beta1.MsgUpdateParams, com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.kyve.stakers.v1beta1.MsgUpdateParams, com.kyve.stakers.v1beta1.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.stakers.v1beta1.MsgUpdateParamsResponse.getDefaultInstance()))
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
     * CreateStaker ...
     * </pre>
     */
    default void createStaker(com.kyve.stakers.v1beta1.MsgCreateStaker request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgCreateStakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    default void updateMetadata(com.kyve.stakers.v1beta1.MsgUpdateMetadata request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    default void updateCommission(com.kyve.stakers.v1beta1.MsgUpdateCommission request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimCommissionRewards ...
     * </pre>
     */
    default void claimCommissionRewards(com.kyve.stakers.v1beta1.MsgClaimCommissionRewards request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimCommissionRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    default void joinPool(com.kyve.stakers.v1beta1.MsgJoinPool request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgJoinPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    default void leavePool(com.kyve.stakers.v1beta1.MsgLeavePool request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgLeavePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeavePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void updateParams(com.kyve.stakers.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> responseObserver) {
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
     * CreateStaker ...
     * </pre>
     */
    public void createStaker(com.kyve.stakers.v1beta1.MsgCreateStaker request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgCreateStakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public void updateMetadata(com.kyve.stakers.v1beta1.MsgUpdateMetadata request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public void updateCommission(com.kyve.stakers.v1beta1.MsgUpdateCommission request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimCommissionRewards ...
     * </pre>
     */
    public void claimCommissionRewards(com.kyve.stakers.v1beta1.MsgClaimCommissionRewards request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimCommissionRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public void joinPool(com.kyve.stakers.v1beta1.MsgJoinPool request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgJoinPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public void leavePool(com.kyve.stakers.v1beta1.MsgLeavePool request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgLeavePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeavePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(com.kyve.stakers.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> responseObserver) {
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
     * CreateStaker ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgCreateStakerResponse createStaker(com.kyve.stakers.v1beta1.MsgCreateStaker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse updateMetadata(com.kyve.stakers.v1beta1.MsgUpdateMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse updateCommission(com.kyve.stakers.v1beta1.MsgUpdateCommission request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimCommissionRewards ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse claimCommissionRewards(com.kyve.stakers.v1beta1.MsgClaimCommissionRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimCommissionRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgJoinPoolResponse joinPool(com.kyve.stakers.v1beta1.MsgJoinPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgLeavePoolResponse leavePool(com.kyve.stakers.v1beta1.MsgLeavePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeavePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.stakers.v1beta1.MsgUpdateParamsResponse updateParams(com.kyve.stakers.v1beta1.MsgUpdateParams request) {
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
     * CreateStaker ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgCreateStakerResponse> createStaker(
        com.kyve.stakers.v1beta1.MsgCreateStaker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMetadata ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse> updateMetadata(
        com.kyve.stakers.v1beta1.MsgUpdateMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCommission ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse> updateCommission(
        com.kyve.stakers.v1beta1.MsgUpdateCommission request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimCommissionRewards ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse> claimCommissionRewards(
        com.kyve.stakers.v1beta1.MsgClaimCommissionRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimCommissionRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * JoinPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgJoinPoolResponse> joinPool(
        com.kyve.stakers.v1beta1.MsgJoinPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeavePool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgLeavePoolResponse> leavePool(
        com.kyve.stakers.v1beta1.MsgLeavePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeavePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/stakers module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.stakers.v1beta1.MsgUpdateParamsResponse> updateParams(
        com.kyve.stakers.v1beta1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STAKER = 0;
  private static final int METHODID_UPDATE_METADATA = 1;
  private static final int METHODID_UPDATE_COMMISSION = 2;
  private static final int METHODID_CLAIM_COMMISSION_REWARDS = 3;
  private static final int METHODID_JOIN_POOL = 4;
  private static final int METHODID_LEAVE_POOL = 5;
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
        case METHODID_CREATE_STAKER:
          serviceImpl.createStaker((com.kyve.stakers.v1beta1.MsgCreateStaker) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgCreateStakerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_METADATA:
          serviceImpl.updateMetadata((com.kyve.stakers.v1beta1.MsgUpdateMetadata) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMMISSION:
          serviceImpl.updateCommission((com.kyve.stakers.v1beta1.MsgUpdateCommission) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse>) responseObserver);
          break;
        case METHODID_CLAIM_COMMISSION_REWARDS:
          serviceImpl.claimCommissionRewards((com.kyve.stakers.v1beta1.MsgClaimCommissionRewards) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse>) responseObserver);
          break;
        case METHODID_JOIN_POOL:
          serviceImpl.joinPool((com.kyve.stakers.v1beta1.MsgJoinPool) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgJoinPoolResponse>) responseObserver);
          break;
        case METHODID_LEAVE_POOL:
          serviceImpl.leavePool((com.kyve.stakers.v1beta1.MsgLeavePool) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgLeavePoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.kyve.stakers.v1beta1.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.kyve.stakers.v1beta1.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateStakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgCreateStaker,
              com.kyve.stakers.v1beta1.MsgCreateStakerResponse>(
                service, METHODID_CREATE_STAKER)))
        .addMethod(
          getUpdateMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgUpdateMetadata,
              com.kyve.stakers.v1beta1.MsgUpdateMetadataResponse>(
                service, METHODID_UPDATE_METADATA)))
        .addMethod(
          getUpdateCommissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgUpdateCommission,
              com.kyve.stakers.v1beta1.MsgUpdateCommissionResponse>(
                service, METHODID_UPDATE_COMMISSION)))
        .addMethod(
          getClaimCommissionRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgClaimCommissionRewards,
              com.kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse>(
                service, METHODID_CLAIM_COMMISSION_REWARDS)))
        .addMethod(
          getJoinPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgJoinPool,
              com.kyve.stakers.v1beta1.MsgJoinPoolResponse>(
                service, METHODID_JOIN_POOL)))
        .addMethod(
          getLeavePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgLeavePool,
              com.kyve.stakers.v1beta1.MsgLeavePoolResponse>(
                service, METHODID_LEAVE_POOL)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.stakers.v1beta1.MsgUpdateParams,
              com.kyve.stakers.v1beta1.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.stakers.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateStakerMethod())
              .addMethod(getUpdateMetadataMethod())
              .addMethod(getUpdateCommissionMethod())
              .addMethod(getClaimCommissionRewardsMethod())
              .addMethod(getJoinPoolMethod())
              .addMethod(getLeavePoolMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
