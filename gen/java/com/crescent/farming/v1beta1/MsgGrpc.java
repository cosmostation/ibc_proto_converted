package com.crescent.farming.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the farming Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: crescent/farming/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "crescent.farming.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan,
      com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> getCreateFixedAmountPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFixedAmountPlan",
      requestType = com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan.class,
      responseType = com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan,
      com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> getCreateFixedAmountPlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan, com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> getCreateFixedAmountPlanMethod;
    if ((getCreateFixedAmountPlanMethod = MsgGrpc.getCreateFixedAmountPlanMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateFixedAmountPlanMethod = MsgGrpc.getCreateFixedAmountPlanMethod) == null) {
          MsgGrpc.getCreateFixedAmountPlanMethod = getCreateFixedAmountPlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan, com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFixedAmountPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateFixedAmountPlan"))
              .build();
        }
      }
    }
    return getCreateFixedAmountPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateRatioPlan,
      com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> getCreateRatioPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRatioPlan",
      requestType = com.crescent.farming.v1beta1.MsgCreateRatioPlan.class,
      responseType = com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateRatioPlan,
      com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> getCreateRatioPlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgCreateRatioPlan, com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> getCreateRatioPlanMethod;
    if ((getCreateRatioPlanMethod = MsgGrpc.getCreateRatioPlanMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRatioPlanMethod = MsgGrpc.getCreateRatioPlanMethod) == null) {
          MsgGrpc.getCreateRatioPlanMethod = getCreateRatioPlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgCreateRatioPlan, com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRatioPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgCreateRatioPlan.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRatioPlan"))
              .build();
        }
      }
    }
    return getCreateRatioPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgStake,
      com.crescent.farming.v1beta1.MsgStakeResponse> getStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stake",
      requestType = com.crescent.farming.v1beta1.MsgStake.class,
      responseType = com.crescent.farming.v1beta1.MsgStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgStake,
      com.crescent.farming.v1beta1.MsgStakeResponse> getStakeMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgStake, com.crescent.farming.v1beta1.MsgStakeResponse> getStakeMethod;
    if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
          MsgGrpc.getStakeMethod = getStakeMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgStake, com.crescent.farming.v1beta1.MsgStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Stake"))
              .build();
        }
      }
    }
    return getStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgUnstake,
      com.crescent.farming.v1beta1.MsgUnstakeResponse> getUnstakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unstake",
      requestType = com.crescent.farming.v1beta1.MsgUnstake.class,
      responseType = com.crescent.farming.v1beta1.MsgUnstakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgUnstake,
      com.crescent.farming.v1beta1.MsgUnstakeResponse> getUnstakeMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgUnstake, com.crescent.farming.v1beta1.MsgUnstakeResponse> getUnstakeMethod;
    if ((getUnstakeMethod = MsgGrpc.getUnstakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnstakeMethod = MsgGrpc.getUnstakeMethod) == null) {
          MsgGrpc.getUnstakeMethod = getUnstakeMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgUnstake, com.crescent.farming.v1beta1.MsgUnstakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unstake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgUnstake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgUnstakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unstake"))
              .build();
        }
      }
    }
    return getUnstakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgHarvest,
      com.crescent.farming.v1beta1.MsgHarvestResponse> getHarvestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Harvest",
      requestType = com.crescent.farming.v1beta1.MsgHarvest.class,
      responseType = com.crescent.farming.v1beta1.MsgHarvestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgHarvest,
      com.crescent.farming.v1beta1.MsgHarvestResponse> getHarvestMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgHarvest, com.crescent.farming.v1beta1.MsgHarvestResponse> getHarvestMethod;
    if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
          MsgGrpc.getHarvestMethod = getHarvestMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgHarvest, com.crescent.farming.v1beta1.MsgHarvestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Harvest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgHarvest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgHarvestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Harvest"))
              .build();
        }
      }
    }
    return getHarvestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgRemovePlan,
      com.crescent.farming.v1beta1.MsgRemovePlanResponse> getRemovePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePlan",
      requestType = com.crescent.farming.v1beta1.MsgRemovePlan.class,
      responseType = com.crescent.farming.v1beta1.MsgRemovePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgRemovePlan,
      com.crescent.farming.v1beta1.MsgRemovePlanResponse> getRemovePlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgRemovePlan, com.crescent.farming.v1beta1.MsgRemovePlanResponse> getRemovePlanMethod;
    if ((getRemovePlanMethod = MsgGrpc.getRemovePlanMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePlanMethod = MsgGrpc.getRemovePlanMethod) == null) {
          MsgGrpc.getRemovePlanMethod = getRemovePlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgRemovePlan, com.crescent.farming.v1beta1.MsgRemovePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgRemovePlan.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgRemovePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePlan"))
              .build();
        }
      }
    }
    return getRemovePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgAdvanceEpoch,
      com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> getAdvanceEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdvanceEpoch",
      requestType = com.crescent.farming.v1beta1.MsgAdvanceEpoch.class,
      responseType = com.crescent.farming.v1beta1.MsgAdvanceEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgAdvanceEpoch,
      com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> getAdvanceEpochMethod() {
    io.grpc.MethodDescriptor<com.crescent.farming.v1beta1.MsgAdvanceEpoch, com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> getAdvanceEpochMethod;
    if ((getAdvanceEpochMethod = MsgGrpc.getAdvanceEpochMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAdvanceEpochMethod = MsgGrpc.getAdvanceEpochMethod) == null) {
          MsgGrpc.getAdvanceEpochMethod = getAdvanceEpochMethod =
              io.grpc.MethodDescriptor.<com.crescent.farming.v1beta1.MsgAdvanceEpoch, com.crescent.farming.v1beta1.MsgAdvanceEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdvanceEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgAdvanceEpoch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.farming.v1beta1.MsgAdvanceEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AdvanceEpoch"))
              .build();
        }
      }
    }
    return getAdvanceEpochMethod;
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
   * Msg defines the farming Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateFixedAmountPlan defines a method for creating a new fixed amount
     * farming plan
     * </pre>
     */
    default void createFixedAmountPlan(com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFixedAmountPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRatioPlan defines a method for creating a new ratio farming plan
     * </pre>
     */
    default void createRatioPlan(com.crescent.farming.v1beta1.MsgCreateRatioPlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRatioPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stake defines a method for staking coins into the farming plan
     * </pre>
     */
    default void stake(com.crescent.farming.v1beta1.MsgStake request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking coins from the farming plan
     * </pre>
     */
    default void unstake(com.crescent.farming.v1beta1.MsgUnstake request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgUnstakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnstakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Harvest defines a method for claiming farming rewards
     * </pre>
     */
    default void harvest(com.crescent.farming.v1beta1.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHarvestMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemovePlan defines a method for removing a terminated plan.
     * </pre>
     */
    default void removePlan(com.crescent.farming.v1beta1.MsgRemovePlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgRemovePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdvanceEpoch defines a method for advancing epoch by one, just for testing purpose
     * and shouldn't be used in real world
     * </pre>
     */
    default void advanceEpoch(com.crescent.farming.v1beta1.MsgAdvanceEpoch request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdvanceEpochMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the farming Msg service.
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
   * Msg defines the farming Msg service.
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
     * CreateFixedAmountPlan defines a method for creating a new fixed amount
     * farming plan
     * </pre>
     */
    public void createFixedAmountPlan(com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFixedAmountPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRatioPlan defines a method for creating a new ratio farming plan
     * </pre>
     */
    public void createRatioPlan(com.crescent.farming.v1beta1.MsgCreateRatioPlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRatioPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stake defines a method for staking coins into the farming plan
     * </pre>
     */
    public void stake(com.crescent.farming.v1beta1.MsgStake request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking coins from the farming plan
     * </pre>
     */
    public void unstake(com.crescent.farming.v1beta1.MsgUnstake request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgUnstakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnstakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Harvest defines a method for claiming farming rewards
     * </pre>
     */
    public void harvest(com.crescent.farming.v1beta1.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemovePlan defines a method for removing a terminated plan.
     * </pre>
     */
    public void removePlan(com.crescent.farming.v1beta1.MsgRemovePlan request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgRemovePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdvanceEpoch defines a method for advancing epoch by one, just for testing purpose
     * and shouldn't be used in real world
     * </pre>
     */
    public void advanceEpoch(com.crescent.farming.v1beta1.MsgAdvanceEpoch request,
        io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdvanceEpochMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the farming Msg service.
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
     * CreateFixedAmountPlan defines a method for creating a new fixed amount
     * farming plan
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse createFixedAmountPlan(com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFixedAmountPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRatioPlan defines a method for creating a new ratio farming plan
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse createRatioPlan(com.crescent.farming.v1beta1.MsgCreateRatioPlan request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRatioPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stake defines a method for staking coins into the farming plan
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgStakeResponse stake(com.crescent.farming.v1beta1.MsgStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking coins from the farming plan
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgUnstakeResponse unstake(com.crescent.farming.v1beta1.MsgUnstake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnstakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Harvest defines a method for claiming farming rewards
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgHarvestResponse harvest(com.crescent.farming.v1beta1.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHarvestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemovePlan defines a method for removing a terminated plan.
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgRemovePlanResponse removePlan(com.crescent.farming.v1beta1.MsgRemovePlan request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdvanceEpoch defines a method for advancing epoch by one, just for testing purpose
     * and shouldn't be used in real world
     * </pre>
     */
    public com.crescent.farming.v1beta1.MsgAdvanceEpochResponse advanceEpoch(com.crescent.farming.v1beta1.MsgAdvanceEpoch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdvanceEpochMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the farming Msg service.
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
     * CreateFixedAmountPlan defines a method for creating a new fixed amount
     * farming plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse> createFixedAmountPlan(
        com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFixedAmountPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRatioPlan defines a method for creating a new ratio farming plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse> createRatioPlan(
        com.crescent.farming.v1beta1.MsgCreateRatioPlan request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRatioPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stake defines a method for staking coins into the farming plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgStakeResponse> stake(
        com.crescent.farming.v1beta1.MsgStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking coins from the farming plan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgUnstakeResponse> unstake(
        com.crescent.farming.v1beta1.MsgUnstake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnstakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Harvest defines a method for claiming farming rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgHarvestResponse> harvest(
        com.crescent.farming.v1beta1.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemovePlan defines a method for removing a terminated plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgRemovePlanResponse> removePlan(
        com.crescent.farming.v1beta1.MsgRemovePlan request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdvanceEpoch defines a method for advancing epoch by one, just for testing purpose
     * and shouldn't be used in real world
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.farming.v1beta1.MsgAdvanceEpochResponse> advanceEpoch(
        com.crescent.farming.v1beta1.MsgAdvanceEpoch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdvanceEpochMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FIXED_AMOUNT_PLAN = 0;
  private static final int METHODID_CREATE_RATIO_PLAN = 1;
  private static final int METHODID_STAKE = 2;
  private static final int METHODID_UNSTAKE = 3;
  private static final int METHODID_HARVEST = 4;
  private static final int METHODID_REMOVE_PLAN = 5;
  private static final int METHODID_ADVANCE_EPOCH = 6;

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
        case METHODID_CREATE_FIXED_AMOUNT_PLAN:
          serviceImpl.createFixedAmountPlan((com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_RATIO_PLAN:
          serviceImpl.createRatioPlan((com.crescent.farming.v1beta1.MsgCreateRatioPlan) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse>) responseObserver);
          break;
        case METHODID_STAKE:
          serviceImpl.stake((com.crescent.farming.v1beta1.MsgStake) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgStakeResponse>) responseObserver);
          break;
        case METHODID_UNSTAKE:
          serviceImpl.unstake((com.crescent.farming.v1beta1.MsgUnstake) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgUnstakeResponse>) responseObserver);
          break;
        case METHODID_HARVEST:
          serviceImpl.harvest((com.crescent.farming.v1beta1.MsgHarvest) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgHarvestResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PLAN:
          serviceImpl.removePlan((com.crescent.farming.v1beta1.MsgRemovePlan) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgRemovePlanResponse>) responseObserver);
          break;
        case METHODID_ADVANCE_EPOCH:
          serviceImpl.advanceEpoch((com.crescent.farming.v1beta1.MsgAdvanceEpoch) request,
              (io.grpc.stub.StreamObserver<com.crescent.farming.v1beta1.MsgAdvanceEpochResponse>) responseObserver);
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
          getCreateFixedAmountPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgCreateFixedAmountPlan,
              com.crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse>(
                service, METHODID_CREATE_FIXED_AMOUNT_PLAN)))
        .addMethod(
          getCreateRatioPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgCreateRatioPlan,
              com.crescent.farming.v1beta1.MsgCreateRatioPlanResponse>(
                service, METHODID_CREATE_RATIO_PLAN)))
        .addMethod(
          getStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgStake,
              com.crescent.farming.v1beta1.MsgStakeResponse>(
                service, METHODID_STAKE)))
        .addMethod(
          getUnstakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgUnstake,
              com.crescent.farming.v1beta1.MsgUnstakeResponse>(
                service, METHODID_UNSTAKE)))
        .addMethod(
          getHarvestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgHarvest,
              com.crescent.farming.v1beta1.MsgHarvestResponse>(
                service, METHODID_HARVEST)))
        .addMethod(
          getRemovePlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgRemovePlan,
              com.crescent.farming.v1beta1.MsgRemovePlanResponse>(
                service, METHODID_REMOVE_PLAN)))
        .addMethod(
          getAdvanceEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.farming.v1beta1.MsgAdvanceEpoch,
              com.crescent.farming.v1beta1.MsgAdvanceEpochResponse>(
                service, METHODID_ADVANCE_EPOCH)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.farming.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateFixedAmountPlanMethod())
              .addMethod(getCreateRatioPlanMethod())
              .addMethod(getStakeMethod())
              .addMethod(getUnstakeMethod())
              .addMethod(getHarvestMethod())
              .addMethod(getRemovePlanMethod())
              .addMethod(getAdvanceEpochMethod())
              .build();
        }
      }
    }
    return result;
  }
}
