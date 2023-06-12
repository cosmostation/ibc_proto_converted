package com.irismod.farm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the farm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/farm/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.farm.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgCreatePool,
      com.irismod.farm.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.irismod.farm.MsgCreatePool.class,
      responseType = com.irismod.farm.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgCreatePool,
      com.irismod.farm.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgCreatePool, com.irismod.farm.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgCreatePool, com.irismod.farm.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgDestroyPool,
      com.irismod.farm.MsgDestroyPoolResponse> getDestroyPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyPool",
      requestType = com.irismod.farm.MsgDestroyPool.class,
      responseType = com.irismod.farm.MsgDestroyPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgDestroyPool,
      com.irismod.farm.MsgDestroyPoolResponse> getDestroyPoolMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgDestroyPool, com.irismod.farm.MsgDestroyPoolResponse> getDestroyPoolMethod;
    if ((getDestroyPoolMethod = MsgGrpc.getDestroyPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDestroyPoolMethod = MsgGrpc.getDestroyPoolMethod) == null) {
          MsgGrpc.getDestroyPoolMethod = getDestroyPoolMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgDestroyPool, com.irismod.farm.MsgDestroyPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgDestroyPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgDestroyPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DestroyPool"))
              .build();
        }
      }
    }
    return getDestroyPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgAdjustPool,
      com.irismod.farm.MsgAdjustPoolResponse> getAdjustPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustPool",
      requestType = com.irismod.farm.MsgAdjustPool.class,
      responseType = com.irismod.farm.MsgAdjustPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgAdjustPool,
      com.irismod.farm.MsgAdjustPoolResponse> getAdjustPoolMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgAdjustPool, com.irismod.farm.MsgAdjustPoolResponse> getAdjustPoolMethod;
    if ((getAdjustPoolMethod = MsgGrpc.getAdjustPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAdjustPoolMethod = MsgGrpc.getAdjustPoolMethod) == null) {
          MsgGrpc.getAdjustPoolMethod = getAdjustPoolMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgAdjustPool, com.irismod.farm.MsgAdjustPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgAdjustPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgAdjustPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AdjustPool"))
              .build();
        }
      }
    }
    return getAdjustPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgStake,
      com.irismod.farm.MsgStakeResponse> getStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stake",
      requestType = com.irismod.farm.MsgStake.class,
      responseType = com.irismod.farm.MsgStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgStake,
      com.irismod.farm.MsgStakeResponse> getStakeMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgStake, com.irismod.farm.MsgStakeResponse> getStakeMethod;
    if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStakeMethod = MsgGrpc.getStakeMethod) == null) {
          MsgGrpc.getStakeMethod = getStakeMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgStake, com.irismod.farm.MsgStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Stake"))
              .build();
        }
      }
    }
    return getStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgUnstake,
      com.irismod.farm.MsgUnstakeResponse> getUnstakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unstake",
      requestType = com.irismod.farm.MsgUnstake.class,
      responseType = com.irismod.farm.MsgUnstakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgUnstake,
      com.irismod.farm.MsgUnstakeResponse> getUnstakeMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgUnstake, com.irismod.farm.MsgUnstakeResponse> getUnstakeMethod;
    if ((getUnstakeMethod = MsgGrpc.getUnstakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnstakeMethod = MsgGrpc.getUnstakeMethod) == null) {
          MsgGrpc.getUnstakeMethod = getUnstakeMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgUnstake, com.irismod.farm.MsgUnstakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unstake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgUnstake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgUnstakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unstake"))
              .build();
        }
      }
    }
    return getUnstakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.MsgHarvest,
      com.irismod.farm.MsgHarvestResponse> getHarvestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Harvest",
      requestType = com.irismod.farm.MsgHarvest.class,
      responseType = com.irismod.farm.MsgHarvestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.MsgHarvest,
      com.irismod.farm.MsgHarvestResponse> getHarvestMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.MsgHarvest, com.irismod.farm.MsgHarvestResponse> getHarvestMethod;
    if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
          MsgGrpc.getHarvestMethod = getHarvestMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.MsgHarvest, com.irismod.farm.MsgHarvestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Harvest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgHarvest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.MsgHarvestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Harvest"))
              .build();
        }
      }
    }
    return getHarvestMethod;
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
   * Msg defines the farm Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreatePool defines a method for creating a new farm pool
     * </pre>
     */
    default void createPool(com.irismod.farm.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DestroyPool defines a method for destroying a existed farm pool
     * </pre>
     */
    default void destroyPool(com.irismod.farm.MsgDestroyPool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgDestroyPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdjustPool defines a method for adjusting the farm pool params
     * </pre>
     */
    default void adjustPool(com.irismod.farm.MsgAdjustPool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgAdjustPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdjustPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stake defines a method for staking some lp token to a farm pool
     * </pre>
     */
    default void stake(com.irismod.farm.MsgStake request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking some lp token from a farm pool and
     * withdraw some reward
     * </pre>
     */
    default void unstake(com.irismod.farm.MsgUnstake request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgUnstakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnstakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Harvest defines a method withdraw some reward from a farm pool
     * </pre>
     */
    default void harvest(com.irismod.farm.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHarvestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the farm Msg service.
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
   * Msg defines the farm Msg service.
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
     * CreatePool defines a method for creating a new farm pool
     * </pre>
     */
    public void createPool(com.irismod.farm.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DestroyPool defines a method for destroying a existed farm pool
     * </pre>
     */
    public void destroyPool(com.irismod.farm.MsgDestroyPool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgDestroyPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdjustPool defines a method for adjusting the farm pool params
     * </pre>
     */
    public void adjustPool(com.irismod.farm.MsgAdjustPool request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgAdjustPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdjustPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stake defines a method for staking some lp token to a farm pool
     * </pre>
     */
    public void stake(com.irismod.farm.MsgStake request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking some lp token from a farm pool and
     * withdraw some reward
     * </pre>
     */
    public void unstake(com.irismod.farm.MsgUnstake request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgUnstakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnstakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Harvest defines a method withdraw some reward from a farm pool
     * </pre>
     */
    public void harvest(com.irismod.farm.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the farm Msg service.
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
     * CreatePool defines a method for creating a new farm pool
     * </pre>
     */
    public com.irismod.farm.MsgCreatePoolResponse createPool(com.irismod.farm.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DestroyPool defines a method for destroying a existed farm pool
     * </pre>
     */
    public com.irismod.farm.MsgDestroyPoolResponse destroyPool(com.irismod.farm.MsgDestroyPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdjustPool defines a method for adjusting the farm pool params
     * </pre>
     */
    public com.irismod.farm.MsgAdjustPoolResponse adjustPool(com.irismod.farm.MsgAdjustPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdjustPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stake defines a method for staking some lp token to a farm pool
     * </pre>
     */
    public com.irismod.farm.MsgStakeResponse stake(com.irismod.farm.MsgStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking some lp token from a farm pool and
     * withdraw some reward
     * </pre>
     */
    public com.irismod.farm.MsgUnstakeResponse unstake(com.irismod.farm.MsgUnstake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnstakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Harvest defines a method withdraw some reward from a farm pool
     * </pre>
     */
    public com.irismod.farm.MsgHarvestResponse harvest(com.irismod.farm.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHarvestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the farm Msg service.
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
     * CreatePool defines a method for creating a new farm pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgCreatePoolResponse> createPool(
        com.irismod.farm.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DestroyPool defines a method for destroying a existed farm pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgDestroyPoolResponse> destroyPool(
        com.irismod.farm.MsgDestroyPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdjustPool defines a method for adjusting the farm pool params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgAdjustPoolResponse> adjustPool(
        com.irismod.farm.MsgAdjustPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdjustPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stake defines a method for staking some lp token to a farm pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgStakeResponse> stake(
        com.irismod.farm.MsgStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unstake defines a method for unstaking some lp token from a farm pool and
     * withdraw some reward
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgUnstakeResponse> unstake(
        com.irismod.farm.MsgUnstake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnstakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Harvest defines a method withdraw some reward from a farm pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.MsgHarvestResponse> harvest(
        com.irismod.farm.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POOL = 0;
  private static final int METHODID_DESTROY_POOL = 1;
  private static final int METHODID_ADJUST_POOL = 2;
  private static final int METHODID_STAKE = 3;
  private static final int METHODID_UNSTAKE = 4;
  private static final int METHODID_HARVEST = 5;

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
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.irismod.farm.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_DESTROY_POOL:
          serviceImpl.destroyPool((com.irismod.farm.MsgDestroyPool) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgDestroyPoolResponse>) responseObserver);
          break;
        case METHODID_ADJUST_POOL:
          serviceImpl.adjustPool((com.irismod.farm.MsgAdjustPool) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgAdjustPoolResponse>) responseObserver);
          break;
        case METHODID_STAKE:
          serviceImpl.stake((com.irismod.farm.MsgStake) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgStakeResponse>) responseObserver);
          break;
        case METHODID_UNSTAKE:
          serviceImpl.unstake((com.irismod.farm.MsgUnstake) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgUnstakeResponse>) responseObserver);
          break;
        case METHODID_HARVEST:
          serviceImpl.harvest((com.irismod.farm.MsgHarvest) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.MsgHarvestResponse>) responseObserver);
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
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgCreatePool,
              com.irismod.farm.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getDestroyPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgDestroyPool,
              com.irismod.farm.MsgDestroyPoolResponse>(
                service, METHODID_DESTROY_POOL)))
        .addMethod(
          getAdjustPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgAdjustPool,
              com.irismod.farm.MsgAdjustPoolResponse>(
                service, METHODID_ADJUST_POOL)))
        .addMethod(
          getStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgStake,
              com.irismod.farm.MsgStakeResponse>(
                service, METHODID_STAKE)))
        .addMethod(
          getUnstakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgUnstake,
              com.irismod.farm.MsgUnstakeResponse>(
                service, METHODID_UNSTAKE)))
        .addMethod(
          getHarvestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.MsgHarvest,
              com.irismod.farm.MsgHarvestResponse>(
                service, METHODID_HARVEST)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.farm.TxProto.getDescriptor();
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
              .addMethod(getCreatePoolMethod())
              .addMethod(getDestroyPoolMethod())
              .addMethod(getAdjustPoolMethod())
              .addMethod(getStakeMethod())
              .addMethod(getUnstakeMethod())
              .addMethod(getHarvestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
