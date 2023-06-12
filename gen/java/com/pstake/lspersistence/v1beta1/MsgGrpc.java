package com.pstake.lspersistence.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the liquid staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: pstake/lspersistence/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "pstake.lspersistence.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidStake,
      com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidStake",
      requestType = com.pstake.lspersistence.v1beta1.MsgLiquidStake.class,
      responseType = com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidStake,
      com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidStake, com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;
    if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
          MsgGrpc.getLiquidStakeMethod = getLiquidStakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.MsgLiquidStake, com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgLiquidStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidStake"))
              .build();
        }
      }
    }
    return getLiquidStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidUnstake,
      com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidUnstake",
      requestType = com.pstake.lspersistence.v1beta1.MsgLiquidUnstake.class,
      responseType = com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidUnstake,
      com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgLiquidUnstake, com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;
    if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
          MsgGrpc.getLiquidUnstakeMethod = getLiquidUnstakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.MsgLiquidUnstake, com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidUnstake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgLiquidUnstake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidUnstake"))
              .build();
        }
      }
    }
    return getLiquidUnstakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgUpdateParams,
      com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.pstake.lspersistence.v1beta1.MsgUpdateParams.class,
      responseType = com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgUpdateParams,
      com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lspersistence.v1beta1.MsgUpdateParams, com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lspersistence.v1beta1.MsgUpdateParams, com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the liquid staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * LiquidStake defines a method for performing a delegation of coins
     * from a delegator to whitelisted validators.
     * </pre>
     */
    default void liquidStake(com.pstake.lspersistence.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidStakeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidUnstake defines a method for performing an undelegation of liquid staking from a
     * delegate.
     * </pre>
     */
    default void liquidUnstake(com.pstake.lspersistence.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidUnstakeMethod(), responseObserver);
    }

    /**
     */
    default void updateParams(com.pstake.lspersistence.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the liquid staking Msg service.
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
   * Msg defines the liquid staking Msg service.
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
     * LiquidStake defines a method for performing a delegation of coins
     * from a delegator to whitelisted validators.
     * </pre>
     */
    public void liquidStake(com.pstake.lspersistence.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidUnstake defines a method for performing an undelegation of liquid staking from a
     * delegate.
     * </pre>
     */
    public void liquidUnstake(com.pstake.lspersistence.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParams(com.pstake.lspersistence.v1beta1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the liquid staking Msg service.
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
     * LiquidStake defines a method for performing a delegation of coins
     * from a delegator to whitelisted validators.
     * </pre>
     */
    public com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse liquidStake(com.pstake.lspersistence.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidStakeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidUnstake defines a method for performing an undelegation of liquid staking from a
     * delegate.
     * </pre>
     */
    public com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse liquidUnstake(com.pstake.lspersistence.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidUnstakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse updateParams(com.pstake.lspersistence.v1beta1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the liquid staking Msg service.
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
     * LiquidStake defines a method for performing a delegation of coins
     * from a delegator to whitelisted validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse> liquidStake(
        com.pstake.lspersistence.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidUnstake defines a method for performing an undelegation of liquid staking from a
     * delegate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse> liquidUnstake(
        com.pstake.lspersistence.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse> updateParams(
        com.pstake.lspersistence.v1beta1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUID_STAKE = 0;
  private static final int METHODID_LIQUID_UNSTAKE = 1;
  private static final int METHODID_UPDATE_PARAMS = 2;

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
        case METHODID_LIQUID_STAKE:
          serviceImpl.liquidStake((com.pstake.lspersistence.v1beta1.MsgLiquidStake) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse>) responseObserver);
          break;
        case METHODID_LIQUID_UNSTAKE:
          serviceImpl.liquidUnstake((com.pstake.lspersistence.v1beta1.MsgLiquidUnstake) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.pstake.lspersistence.v1beta1.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse>) responseObserver);
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
          getLiquidStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lspersistence.v1beta1.MsgLiquidStake,
              com.pstake.lspersistence.v1beta1.MsgLiquidStakeResponse>(
                service, METHODID_LIQUID_STAKE)))
        .addMethod(
          getLiquidUnstakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lspersistence.v1beta1.MsgLiquidUnstake,
              com.pstake.lspersistence.v1beta1.MsgLiquidUnstakeResponse>(
                service, METHODID_LIQUID_UNSTAKE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lspersistence.v1beta1.MsgUpdateParams,
              com.pstake.lspersistence.v1beta1.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.lspersistence.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getLiquidStakeMethod())
              .addMethod(getLiquidUnstakeMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
