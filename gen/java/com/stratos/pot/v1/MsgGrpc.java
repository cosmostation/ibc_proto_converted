package com.stratos.pot.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the pot Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/pot/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stratos.pot.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgVolumeReport,
      com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> getHandleMsgVolumeReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgVolumeReport",
      requestType = com.stratos.pot.v1.TxProto.MsgVolumeReport.class,
      responseType = com.stratos.pot.v1.TxProto.MsgVolumeReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgVolumeReport,
      com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> getHandleMsgVolumeReportMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgVolumeReport, com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> getHandleMsgVolumeReportMethod;
    if ((getHandleMsgVolumeReportMethod = MsgGrpc.getHandleMsgVolumeReportMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgVolumeReportMethod = MsgGrpc.getHandleMsgVolumeReportMethod) == null) {
          MsgGrpc.getHandleMsgVolumeReportMethod = getHandleMsgVolumeReportMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.TxProto.MsgVolumeReport, com.stratos.pot.v1.TxProto.MsgVolumeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgVolumeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgVolumeReport.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgVolumeReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgVolumeReport"))
              .build();
        }
      }
    }
    return getHandleMsgVolumeReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgWithdraw,
      com.stratos.pot.v1.TxProto.MsgWithdrawResponse> getHandleMsgWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgWithdraw",
      requestType = com.stratos.pot.v1.TxProto.MsgWithdraw.class,
      responseType = com.stratos.pot.v1.TxProto.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgWithdraw,
      com.stratos.pot.v1.TxProto.MsgWithdrawResponse> getHandleMsgWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgWithdraw, com.stratos.pot.v1.TxProto.MsgWithdrawResponse> getHandleMsgWithdrawMethod;
    if ((getHandleMsgWithdrawMethod = MsgGrpc.getHandleMsgWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgWithdrawMethod = MsgGrpc.getHandleMsgWithdrawMethod) == null) {
          MsgGrpc.getHandleMsgWithdrawMethod = getHandleMsgWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.TxProto.MsgWithdraw, com.stratos.pot.v1.TxProto.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgWithdraw"))
              .build();
        }
      }
    }
    return getHandleMsgWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgFoundationDeposit,
      com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> getHandleMsgFoundationDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgFoundationDeposit",
      requestType = com.stratos.pot.v1.TxProto.MsgFoundationDeposit.class,
      responseType = com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgFoundationDeposit,
      com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> getHandleMsgFoundationDepositMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgFoundationDeposit, com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> getHandleMsgFoundationDepositMethod;
    if ((getHandleMsgFoundationDepositMethod = MsgGrpc.getHandleMsgFoundationDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgFoundationDepositMethod = MsgGrpc.getHandleMsgFoundationDepositMethod) == null) {
          MsgGrpc.getHandleMsgFoundationDepositMethod = getHandleMsgFoundationDepositMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.TxProto.MsgFoundationDeposit, com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgFoundationDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgFoundationDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgFoundationDeposit"))
              .build();
        }
      }
    }
    return getHandleMsgFoundationDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgSlashingResourceNode,
      com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> getHandleMsgSlashingResourceNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgSlashingResourceNode",
      requestType = com.stratos.pot.v1.TxProto.MsgSlashingResourceNode.class,
      responseType = com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgSlashingResourceNode,
      com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> getHandleMsgSlashingResourceNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgSlashingResourceNode, com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> getHandleMsgSlashingResourceNodeMethod;
    if ((getHandleMsgSlashingResourceNodeMethod = MsgGrpc.getHandleMsgSlashingResourceNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgSlashingResourceNodeMethod = MsgGrpc.getHandleMsgSlashingResourceNodeMethod) == null) {
          MsgGrpc.getHandleMsgSlashingResourceNodeMethod = getHandleMsgSlashingResourceNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.TxProto.MsgSlashingResourceNode, com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgSlashingResourceNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgSlashingResourceNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgSlashingResourceNode"))
              .build();
        }
      }
    }
    return getHandleMsgSlashingResourceNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgUpdateParams,
      com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.stratos.pot.v1.TxProto.MsgUpdateParams.class,
      responseType = com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgUpdateParams,
      com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.TxProto.MsgUpdateParams, com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.TxProto.MsgUpdateParams, com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the pot Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void handleMsgVolumeReport(com.stratos.pot.v1.TxProto.MsgVolumeReport request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgVolumeReportMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgWithdraw(com.stratos.pot.v1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgFoundationDeposit(com.stratos.pot.v1.TxProto.MsgFoundationDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgFoundationDepositMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgSlashingResourceNode(com.stratos.pot.v1.TxProto.MsgSlashingResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgSlashingResourceNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/pot module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    default void updateParams(com.stratos.pot.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the pot Msg service.
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
   * Msg defines the pot Msg service.
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
     */
    public void handleMsgVolumeReport(com.stratos.pot.v1.TxProto.MsgVolumeReport request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgVolumeReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgWithdraw(com.stratos.pot.v1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgFoundationDeposit(com.stratos.pot.v1.TxProto.MsgFoundationDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgFoundationDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgSlashingResourceNode(com.stratos.pot.v1.TxProto.MsgSlashingResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgSlashingResourceNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/pot module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public void updateParams(com.stratos.pot.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the pot Msg service.
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
     */
    public com.stratos.pot.v1.TxProto.MsgVolumeReportResponse handleMsgVolumeReport(com.stratos.pot.v1.TxProto.MsgVolumeReport request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgVolumeReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.TxProto.MsgWithdrawResponse handleMsgWithdraw(com.stratos.pot.v1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse handleMsgFoundationDeposit(com.stratos.pot.v1.TxProto.MsgFoundationDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgFoundationDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse handleMsgSlashingResourceNode(com.stratos.pot.v1.TxProto.MsgSlashingResourceNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgSlashingResourceNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/pot module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse updateParams(com.stratos.pot.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the pot Msg service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.TxProto.MsgVolumeReportResponse> handleMsgVolumeReport(
        com.stratos.pot.v1.TxProto.MsgVolumeReport request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgVolumeReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.TxProto.MsgWithdrawResponse> handleMsgWithdraw(
        com.stratos.pot.v1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse> handleMsgFoundationDeposit(
        com.stratos.pot.v1.TxProto.MsgFoundationDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgFoundationDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse> handleMsgSlashingResourceNode(
        com.stratos.pot.v1.TxProto.MsgSlashingResourceNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgSlashingResourceNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/pot module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.stratos.pot.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_MSG_VOLUME_REPORT = 0;
  private static final int METHODID_HANDLE_MSG_WITHDRAW = 1;
  private static final int METHODID_HANDLE_MSG_FOUNDATION_DEPOSIT = 2;
  private static final int METHODID_HANDLE_MSG_SLASHING_RESOURCE_NODE = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_HANDLE_MSG_VOLUME_REPORT:
          serviceImpl.handleMsgVolumeReport((com.stratos.pot.v1.TxProto.MsgVolumeReport) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgVolumeReportResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_WITHDRAW:
          serviceImpl.handleMsgWithdraw((com.stratos.pot.v1.TxProto.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_FOUNDATION_DEPOSIT:
          serviceImpl.handleMsgFoundationDeposit((com.stratos.pot.v1.TxProto.MsgFoundationDeposit) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_SLASHING_RESOURCE_NODE:
          serviceImpl.handleMsgSlashingResourceNode((com.stratos.pot.v1.TxProto.MsgSlashingResourceNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.stratos.pot.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getHandleMsgVolumeReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.TxProto.MsgVolumeReport,
              com.stratos.pot.v1.TxProto.MsgVolumeReportResponse>(
                service, METHODID_HANDLE_MSG_VOLUME_REPORT)))
        .addMethod(
          getHandleMsgWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.TxProto.MsgWithdraw,
              com.stratos.pot.v1.TxProto.MsgWithdrawResponse>(
                service, METHODID_HANDLE_MSG_WITHDRAW)))
        .addMethod(
          getHandleMsgFoundationDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.TxProto.MsgFoundationDeposit,
              com.stratos.pot.v1.TxProto.MsgFoundationDepositResponse>(
                service, METHODID_HANDLE_MSG_FOUNDATION_DEPOSIT)))
        .addMethod(
          getHandleMsgSlashingResourceNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.TxProto.MsgSlashingResourceNode,
              com.stratos.pot.v1.TxProto.MsgSlashingResourceNodeResponse>(
                service, METHODID_HANDLE_MSG_SLASHING_RESOURCE_NODE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.TxProto.MsgUpdateParams,
              com.stratos.pot.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.pot.v1.TxProto.getDescriptor();
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
              .addMethod(getHandleMsgVolumeReportMethod())
              .addMethod(getHandleMsgWithdrawMethod())
              .addMethod(getHandleMsgFoundationDepositMethod())
              .addMethod(getHandleMsgSlashingResourceNodeMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
