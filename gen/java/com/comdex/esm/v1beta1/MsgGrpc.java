package com.comdex.esm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/esm/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "comdex.esm.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgDepositESM,
      com.comdex.esm.v1beta1.MsgDepositESMResponse> getDepositESMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositESM",
      requestType = com.comdex.esm.v1beta1.MsgDepositESM.class,
      responseType = com.comdex.esm.v1beta1.MsgDepositESMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgDepositESM,
      com.comdex.esm.v1beta1.MsgDepositESMResponse> getDepositESMMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgDepositESM, com.comdex.esm.v1beta1.MsgDepositESMResponse> getDepositESMMethod;
    if ((getDepositESMMethod = MsgGrpc.getDepositESMMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositESMMethod = MsgGrpc.getDepositESMMethod) == null) {
          MsgGrpc.getDepositESMMethod = getDepositESMMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.MsgDepositESM, com.comdex.esm.v1beta1.MsgDepositESMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositESM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgDepositESM.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgDepositESMResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositESM"))
              .build();
        }
      }
    }
    return getDepositESMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgExecuteESM,
      com.comdex.esm.v1beta1.MsgExecuteESMResponse> getExecuteESMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteESM",
      requestType = com.comdex.esm.v1beta1.MsgExecuteESM.class,
      responseType = com.comdex.esm.v1beta1.MsgExecuteESMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgExecuteESM,
      com.comdex.esm.v1beta1.MsgExecuteESMResponse> getExecuteESMMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgExecuteESM, com.comdex.esm.v1beta1.MsgExecuteESMResponse> getExecuteESMMethod;
    if ((getExecuteESMMethod = MsgGrpc.getExecuteESMMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteESMMethod = MsgGrpc.getExecuteESMMethod) == null) {
          MsgGrpc.getExecuteESMMethod = getExecuteESMMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.MsgExecuteESM, com.comdex.esm.v1beta1.MsgExecuteESMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteESM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgExecuteESM.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgExecuteESMResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteESM"))
              .build();
        }
      }
    }
    return getExecuteESMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgKillRequest,
      com.comdex.esm.v1beta1.MsgKillResponse> getMsgKillSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgKillSwitch",
      requestType = com.comdex.esm.v1beta1.MsgKillRequest.class,
      responseType = com.comdex.esm.v1beta1.MsgKillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgKillRequest,
      com.comdex.esm.v1beta1.MsgKillResponse> getMsgKillSwitchMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgKillRequest, com.comdex.esm.v1beta1.MsgKillResponse> getMsgKillSwitchMethod;
    if ((getMsgKillSwitchMethod = MsgGrpc.getMsgKillSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgKillSwitchMethod = MsgGrpc.getMsgKillSwitchMethod) == null) {
          MsgGrpc.getMsgKillSwitchMethod = getMsgKillSwitchMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.MsgKillRequest, com.comdex.esm.v1beta1.MsgKillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgKillSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgKillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgKillResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgKillSwitch"))
              .build();
        }
      }
    }
    return getMsgKillSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest,
      com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> getMsgCollateralRedemptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCollateralRedemption",
      requestType = com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest.class,
      responseType = com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest,
      com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> getMsgCollateralRedemptionMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest, com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> getMsgCollateralRedemptionMethod;
    if ((getMsgCollateralRedemptionMethod = MsgGrpc.getMsgCollateralRedemptionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCollateralRedemptionMethod = MsgGrpc.getMsgCollateralRedemptionMethod) == null) {
          MsgGrpc.getMsgCollateralRedemptionMethod = getMsgCollateralRedemptionMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest, com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCollateralRedemption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgCollateralRedemption"))
              .build();
        }
      }
    }
    return getMsgCollateralRedemptionMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void depositESM(com.comdex.esm.v1beta1.MsgDepositESM request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgDepositESMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositESMMethod(), responseObserver);
    }

    /**
     */
    default void executeESM(com.comdex.esm.v1beta1.MsgExecuteESM request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgExecuteESMResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteESMMethod(), responseObserver);
    }

    /**
     */
    default void msgKillSwitch(com.comdex.esm.v1beta1.MsgKillRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgKillResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgKillSwitchMethod(), responseObserver);
    }

    /**
     */
    default void msgCollateralRedemption(com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCollateralRedemptionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
    public void depositESM(com.comdex.esm.v1beta1.MsgDepositESM request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgDepositESMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositESMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeESM(com.comdex.esm.v1beta1.MsgExecuteESM request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgExecuteESMResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteESMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgKillSwitch(com.comdex.esm.v1beta1.MsgKillRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgKillResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgKillSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgCollateralRedemption(com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCollateralRedemptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
    public com.comdex.esm.v1beta1.MsgDepositESMResponse depositESM(com.comdex.esm.v1beta1.MsgDepositESM request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositESMMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.MsgExecuteESMResponse executeESM(com.comdex.esm.v1beta1.MsgExecuteESM request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteESMMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.MsgKillResponse msgKillSwitch(com.comdex.esm.v1beta1.MsgKillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgKillSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse msgCollateralRedemption(com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCollateralRedemptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.MsgDepositESMResponse> depositESM(
        com.comdex.esm.v1beta1.MsgDepositESM request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositESMMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.MsgExecuteESMResponse> executeESM(
        com.comdex.esm.v1beta1.MsgExecuteESM request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteESMMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.MsgKillResponse> msgKillSwitch(
        com.comdex.esm.v1beta1.MsgKillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgKillSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse> msgCollateralRedemption(
        com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCollateralRedemptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT_ESM = 0;
  private static final int METHODID_EXECUTE_ESM = 1;
  private static final int METHODID_MSG_KILL_SWITCH = 2;
  private static final int METHODID_MSG_COLLATERAL_REDEMPTION = 3;

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
        case METHODID_DEPOSIT_ESM:
          serviceImpl.depositESM((com.comdex.esm.v1beta1.MsgDepositESM) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgDepositESMResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ESM:
          serviceImpl.executeESM((com.comdex.esm.v1beta1.MsgExecuteESM) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgExecuteESMResponse>) responseObserver);
          break;
        case METHODID_MSG_KILL_SWITCH:
          serviceImpl.msgKillSwitch((com.comdex.esm.v1beta1.MsgKillRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgKillResponse>) responseObserver);
          break;
        case METHODID_MSG_COLLATERAL_REDEMPTION:
          serviceImpl.msgCollateralRedemption((com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse>) responseObserver);
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
          getDepositESMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.MsgDepositESM,
              com.comdex.esm.v1beta1.MsgDepositESMResponse>(
                service, METHODID_DEPOSIT_ESM)))
        .addMethod(
          getExecuteESMMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.MsgExecuteESM,
              com.comdex.esm.v1beta1.MsgExecuteESMResponse>(
                service, METHODID_EXECUTE_ESM)))
        .addMethod(
          getMsgKillSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.MsgKillRequest,
              com.comdex.esm.v1beta1.MsgKillResponse>(
                service, METHODID_MSG_KILL_SWITCH)))
        .addMethod(
          getMsgCollateralRedemptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.MsgCollateralRedemptionRequest,
              com.comdex.esm.v1beta1.MsgCollateralRedemptionResponse>(
                service, METHODID_MSG_COLLATERAL_REDEMPTION)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.esm.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getDepositESMMethod())
              .addMethod(getExecuteESMMethod())
              .addMethod(getMsgKillSwitchMethod())
              .addMethod(getMsgCollateralRedemptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
