package com.kyve.pool.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/pool/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.pool.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgFundPool,
      com.kyve.pool.v1beta1.MsgFundPoolResponse> getFundPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundPool",
      requestType = com.kyve.pool.v1beta1.MsgFundPool.class,
      responseType = com.kyve.pool.v1beta1.MsgFundPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgFundPool,
      com.kyve.pool.v1beta1.MsgFundPoolResponse> getFundPoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgFundPool, com.kyve.pool.v1beta1.MsgFundPoolResponse> getFundPoolMethod;
    if ((getFundPoolMethod = MsgGrpc.getFundPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundPoolMethod = MsgGrpc.getFundPoolMethod) == null) {
          MsgGrpc.getFundPoolMethod = getFundPoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgFundPool, com.kyve.pool.v1beta1.MsgFundPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgFundPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgFundPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundPool"))
              .build();
        }
      }
    }
    return getFundPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDefundPool,
      com.kyve.pool.v1beta1.MsgDefundPoolResponse> getDefundPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefundPool",
      requestType = com.kyve.pool.v1beta1.MsgDefundPool.class,
      responseType = com.kyve.pool.v1beta1.MsgDefundPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDefundPool,
      com.kyve.pool.v1beta1.MsgDefundPoolResponse> getDefundPoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDefundPool, com.kyve.pool.v1beta1.MsgDefundPoolResponse> getDefundPoolMethod;
    if ((getDefundPoolMethod = MsgGrpc.getDefundPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDefundPoolMethod = MsgGrpc.getDefundPoolMethod) == null) {
          MsgGrpc.getDefundPoolMethod = getDefundPoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgDefundPool, com.kyve.pool.v1beta1.MsgDefundPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefundPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgDefundPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgDefundPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DefundPool"))
              .build();
        }
      }
    }
    return getDefundPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCreatePool,
      com.kyve.pool.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.kyve.pool.v1beta1.MsgCreatePool.class,
      responseType = com.kyve.pool.v1beta1.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCreatePool,
      com.kyve.pool.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCreatePool, com.kyve.pool.v1beta1.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgCreatePool, com.kyve.pool.v1beta1.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgUpdatePool,
      com.kyve.pool.v1beta1.MsgUpdatePoolResponse> getUpdatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePool",
      requestType = com.kyve.pool.v1beta1.MsgUpdatePool.class,
      responseType = com.kyve.pool.v1beta1.MsgUpdatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgUpdatePool,
      com.kyve.pool.v1beta1.MsgUpdatePoolResponse> getUpdatePoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgUpdatePool, com.kyve.pool.v1beta1.MsgUpdatePoolResponse> getUpdatePoolMethod;
    if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePoolMethod = MsgGrpc.getUpdatePoolMethod) == null) {
          MsgGrpc.getUpdatePoolMethod = getUpdatePoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgUpdatePool, com.kyve.pool.v1beta1.MsgUpdatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgUpdatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgUpdatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePool"))
              .build();
        }
      }
    }
    return getUpdatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDisablePool,
      com.kyve.pool.v1beta1.MsgDisablePoolResponse> getDisablePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisablePool",
      requestType = com.kyve.pool.v1beta1.MsgDisablePool.class,
      responseType = com.kyve.pool.v1beta1.MsgDisablePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDisablePool,
      com.kyve.pool.v1beta1.MsgDisablePoolResponse> getDisablePoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgDisablePool, com.kyve.pool.v1beta1.MsgDisablePoolResponse> getDisablePoolMethod;
    if ((getDisablePoolMethod = MsgGrpc.getDisablePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisablePoolMethod = MsgGrpc.getDisablePoolMethod) == null) {
          MsgGrpc.getDisablePoolMethod = getDisablePoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgDisablePool, com.kyve.pool.v1beta1.MsgDisablePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisablePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgDisablePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgDisablePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisablePool"))
              .build();
        }
      }
    }
    return getDisablePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgEnablePool,
      com.kyve.pool.v1beta1.MsgEnablePoolResponse> getEnablePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnablePool",
      requestType = com.kyve.pool.v1beta1.MsgEnablePool.class,
      responseType = com.kyve.pool.v1beta1.MsgEnablePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgEnablePool,
      com.kyve.pool.v1beta1.MsgEnablePoolResponse> getEnablePoolMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgEnablePool, com.kyve.pool.v1beta1.MsgEnablePoolResponse> getEnablePoolMethod;
    if ((getEnablePoolMethod = MsgGrpc.getEnablePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnablePoolMethod = MsgGrpc.getEnablePoolMethod) == null) {
          MsgGrpc.getEnablePoolMethod = getEnablePoolMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgEnablePool, com.kyve.pool.v1beta1.MsgEnablePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnablePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgEnablePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgEnablePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnablePool"))
              .build();
        }
      }
    }
    return getEnablePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade,
      com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleRuntimeUpgrade",
      requestType = com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.class,
      responseType = com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade,
      com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade, com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> getScheduleRuntimeUpgradeMethod;
    if ((getScheduleRuntimeUpgradeMethod = MsgGrpc.getScheduleRuntimeUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScheduleRuntimeUpgradeMethod = MsgGrpc.getScheduleRuntimeUpgradeMethod) == null) {
          MsgGrpc.getScheduleRuntimeUpgradeMethod = getScheduleRuntimeUpgradeMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade, com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleRuntimeUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ScheduleRuntimeUpgrade"))
              .build();
        }
      }
    }
    return getScheduleRuntimeUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade,
      com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRuntimeUpgrade",
      requestType = com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade.class,
      responseType = com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade,
      com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod() {
    io.grpc.MethodDescriptor<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade, com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> getCancelRuntimeUpgradeMethod;
    if ((getCancelRuntimeUpgradeMethod = MsgGrpc.getCancelRuntimeUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelRuntimeUpgradeMethod = MsgGrpc.getCancelRuntimeUpgradeMethod) == null) {
          MsgGrpc.getCancelRuntimeUpgradeMethod = getCancelRuntimeUpgradeMethod =
              io.grpc.MethodDescriptor.<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade, com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelRuntimeUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelRuntimeUpgrade"))
              .build();
        }
      }
    }
    return getCancelRuntimeUpgradeMethod;
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
     * FundPool ...
     * </pre>
     */
    default void fundPool(com.kyve.pool.v1beta1.MsgFundPool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgFundPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFundPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    default void defundPool(com.kyve.pool.v1beta1.MsgDefundPool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDefundPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefundPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void createPool(com.kyve.pool.v1beta1.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void updatePool(com.kyve.pool.v1beta1.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgUpdatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void disablePool(com.kyve.pool.v1beta1.MsgDisablePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDisablePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisablePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void enablePool(com.kyve.pool.v1beta1.MsgEnablePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgEnablePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnablePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void scheduleRuntimeUpgrade(com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleRuntimeUpgradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void cancelRuntimeUpgrade(com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelRuntimeUpgradeMethod(), responseObserver);
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
     * FundPool ...
     * </pre>
     */
    public void fundPool(com.kyve.pool.v1beta1.MsgFundPool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgFundPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFundPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public void defundPool(com.kyve.pool.v1beta1.MsgDefundPool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDefundPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefundPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void createPool(com.kyve.pool.v1beta1.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updatePool(com.kyve.pool.v1beta1.MsgUpdatePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgUpdatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void disablePool(com.kyve.pool.v1beta1.MsgDisablePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDisablePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisablePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void enablePool(com.kyve.pool.v1beta1.MsgEnablePool request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgEnablePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnablePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void scheduleRuntimeUpgrade(com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleRuntimeUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void cancelRuntimeUpgrade(com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade request,
        io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelRuntimeUpgradeMethod(), getCallOptions()), request, responseObserver);
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
     * FundPool ...
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgFundPoolResponse fundPool(com.kyve.pool.v1beta1.MsgFundPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFundPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgDefundPoolResponse defundPool(com.kyve.pool.v1beta1.MsgDefundPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefundPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgCreatePoolResponse createPool(com.kyve.pool.v1beta1.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgUpdatePoolResponse updatePool(com.kyve.pool.v1beta1.MsgUpdatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgDisablePoolResponse disablePool(com.kyve.pool.v1beta1.MsgDisablePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisablePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgEnablePoolResponse enablePool(com.kyve.pool.v1beta1.MsgEnablePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnablePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse scheduleRuntimeUpgrade(com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleRuntimeUpgradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse cancelRuntimeUpgrade(com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelRuntimeUpgradeMethod(), getCallOptions(), request);
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
     * FundPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgFundPoolResponse> fundPool(
        com.kyve.pool.v1beta1.MsgFundPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFundPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DefundPool ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgDefundPoolResponse> defundPool(
        com.kyve.pool.v1beta1.MsgDefundPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefundPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePool defines a governance operation for creating a new pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgCreatePoolResponse> createPool(
        com.kyve.pool.v1beta1.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdatePool defines a governance operation for updating an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgUpdatePoolResponse> updatePool(
        com.kyve.pool.v1beta1.MsgUpdatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisablePool defines a governance operation for disabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgDisablePoolResponse> disablePool(
        com.kyve.pool.v1beta1.MsgDisablePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisablePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnablePool defines a governance operation for enabling an existing pool.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgEnablePoolResponse> enablePool(
        com.kyve.pool.v1beta1.MsgEnablePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnablePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse> scheduleRuntimeUpgrade(
        com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleRuntimeUpgradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
     * The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse> cancelRuntimeUpgrade(
        com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelRuntimeUpgradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUND_POOL = 0;
  private static final int METHODID_DEFUND_POOL = 1;
  private static final int METHODID_CREATE_POOL = 2;
  private static final int METHODID_UPDATE_POOL = 3;
  private static final int METHODID_DISABLE_POOL = 4;
  private static final int METHODID_ENABLE_POOL = 5;
  private static final int METHODID_SCHEDULE_RUNTIME_UPGRADE = 6;
  private static final int METHODID_CANCEL_RUNTIME_UPGRADE = 7;

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
        case METHODID_FUND_POOL:
          serviceImpl.fundPool((com.kyve.pool.v1beta1.MsgFundPool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgFundPoolResponse>) responseObserver);
          break;
        case METHODID_DEFUND_POOL:
          serviceImpl.defundPool((com.kyve.pool.v1beta1.MsgDefundPool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDefundPoolResponse>) responseObserver);
          break;
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.kyve.pool.v1beta1.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POOL:
          serviceImpl.updatePool((com.kyve.pool.v1beta1.MsgUpdatePool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgUpdatePoolResponse>) responseObserver);
          break;
        case METHODID_DISABLE_POOL:
          serviceImpl.disablePool((com.kyve.pool.v1beta1.MsgDisablePool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgDisablePoolResponse>) responseObserver);
          break;
        case METHODID_ENABLE_POOL:
          serviceImpl.enablePool((com.kyve.pool.v1beta1.MsgEnablePool) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgEnablePoolResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_RUNTIME_UPGRADE:
          serviceImpl.scheduleRuntimeUpgrade((com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse>) responseObserver);
          break;
        case METHODID_CANCEL_RUNTIME_UPGRADE:
          serviceImpl.cancelRuntimeUpgrade((com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade) request,
              (io.grpc.stub.StreamObserver<com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse>) responseObserver);
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
          getFundPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgFundPool,
              com.kyve.pool.v1beta1.MsgFundPoolResponse>(
                service, METHODID_FUND_POOL)))
        .addMethod(
          getDefundPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgDefundPool,
              com.kyve.pool.v1beta1.MsgDefundPoolResponse>(
                service, METHODID_DEFUND_POOL)))
        .addMethod(
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgCreatePool,
              com.kyve.pool.v1beta1.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getUpdatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgUpdatePool,
              com.kyve.pool.v1beta1.MsgUpdatePoolResponse>(
                service, METHODID_UPDATE_POOL)))
        .addMethod(
          getDisablePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgDisablePool,
              com.kyve.pool.v1beta1.MsgDisablePoolResponse>(
                service, METHODID_DISABLE_POOL)))
        .addMethod(
          getEnablePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgEnablePool,
              com.kyve.pool.v1beta1.MsgEnablePoolResponse>(
                service, METHODID_ENABLE_POOL)))
        .addMethod(
          getScheduleRuntimeUpgradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade,
              com.kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse>(
                service, METHODID_SCHEDULE_RUNTIME_UPGRADE)))
        .addMethod(
          getCancelRuntimeUpgradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.pool.v1beta1.MsgCancelRuntimeUpgrade,
              com.kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse>(
                service, METHODID_CANCEL_RUNTIME_UPGRADE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.pool.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getFundPoolMethod())
              .addMethod(getDefundPoolMethod())
              .addMethod(getCreatePoolMethod())
              .addMethod(getUpdatePoolMethod())
              .addMethod(getDisablePoolMethod())
              .addMethod(getEnablePoolMethod())
              .addMethod(getScheduleRuntimeUpgradeMethod())
              .addMethod(getCancelRuntimeUpgradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
