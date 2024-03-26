package com.OmniFlix.itc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/itc/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.itc.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> getCreateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCampaign",
      requestType = com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign.class,
      responseType = com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> getCreateCampaignMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign, com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> getCreateCampaignMethod;
    if ((getCreateCampaignMethod = MsgGrpc.getCreateCampaignMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateCampaignMethod = MsgGrpc.getCreateCampaignMethod) == null) {
          MsgGrpc.getCreateCampaignMethod = getCreateCampaignMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign, com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateCampaign"))
              .build();
        }
      }
    }
    return getCreateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> getCancelCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelCampaign",
      requestType = com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign.class,
      responseType = com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> getCancelCampaignMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign, com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> getCancelCampaignMethod;
    if ((getCancelCampaignMethod = MsgGrpc.getCancelCampaignMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelCampaignMethod = MsgGrpc.getCancelCampaignMethod) == null) {
          MsgGrpc.getCancelCampaignMethod = getCancelCampaignMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign, com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelCampaign"))
              .build();
        }
      }
    }
    return getCancelCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgClaim,
      com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = com.OmniFlix.itc.v1.TxProto.MsgClaim.class,
      responseType = com.OmniFlix.itc.v1.TxProto.MsgClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgClaim,
      com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgClaim, com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> getClaimMethod;
    if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
          MsgGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.TxProto.MsgClaim, com.OmniFlix.itc.v1.TxProto.MsgClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> getDepositCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositCampaign",
      requestType = com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign.class,
      responseType = com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign,
      com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> getDepositCampaignMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign, com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> getDepositCampaignMethod;
    if ((getDepositCampaignMethod = MsgGrpc.getDepositCampaignMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositCampaignMethod = MsgGrpc.getDepositCampaignMethod) == null) {
          MsgGrpc.getDepositCampaignMethod = getDepositCampaignMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign, com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositCampaign"))
              .build();
        }
      }
    }
    return getDepositCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgUpdateParams,
      com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.OmniFlix.itc.v1.TxProto.MsgUpdateParams.class,
      responseType = com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgUpdateParams,
      com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.TxProto.MsgUpdateParams, com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.TxProto.MsgUpdateParams, com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
   */
  public interface AsyncService {

    /**
     */
    default void createCampaign(com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     */
    default void cancelCampaign(com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelCampaignMethod(), responseObserver);
    }

    /**
     */
    default void claim(com.OmniFlix.itc.v1.TxProto.MsgClaim request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     */
    default void depositCampaign(com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/itc module
     * parameters. The authority is hard-coded to the x/gov module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(com.OmniFlix.itc.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
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
    public void createCampaign(com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelCampaign(com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(com.OmniFlix.itc.v1.TxProto.MsgClaim request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void depositCampaign(com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/itc module
     * parameters. The authority is hard-coded to the x/gov module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(com.OmniFlix.itc.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse createCampaign(com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse cancelCampaign(com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.TxProto.MsgClaimResponse claim(com.OmniFlix.itc.v1.TxProto.MsgClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse depositCampaign(com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/itc module
     * parameters. The authority is hard-coded to the x/gov module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse updateParams(com.OmniFlix.itc.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse> createCampaign(
        com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse> cancelCampaign(
        com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.TxProto.MsgClaimResponse> claim(
        com.OmniFlix.itc.v1.TxProto.MsgClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse> depositCampaign(
        com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/itc module
     * parameters. The authority is hard-coded to the x/gov module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.OmniFlix.itc.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CAMPAIGN = 0;
  private static final int METHODID_CANCEL_CAMPAIGN = 1;
  private static final int METHODID_CLAIM = 2;
  private static final int METHODID_DEPOSIT_CAMPAIGN = 3;
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
        case METHODID_CREATE_CAMPAIGN:
          serviceImpl.createCampaign((com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse>) responseObserver);
          break;
        case METHODID_CANCEL_CAMPAIGN:
          serviceImpl.cancelCampaign((com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((com.OmniFlix.itc.v1.TxProto.MsgClaim) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgClaimResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_CAMPAIGN:
          serviceImpl.depositCampaign((com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.OmniFlix.itc.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.TxProto.MsgCreateCampaign,
              com.OmniFlix.itc.v1.TxProto.MsgCreateCampaignResponse>(
                service, METHODID_CREATE_CAMPAIGN)))
        .addMethod(
          getCancelCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.TxProto.MsgCancelCampaign,
              com.OmniFlix.itc.v1.TxProto.MsgCancelCampaignResponse>(
                service, METHODID_CANCEL_CAMPAIGN)))
        .addMethod(
          getClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.TxProto.MsgClaim,
              com.OmniFlix.itc.v1.TxProto.MsgClaimResponse>(
                service, METHODID_CLAIM)))
        .addMethod(
          getDepositCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.TxProto.MsgDepositCampaign,
              com.OmniFlix.itc.v1.TxProto.MsgDepositCampaignResponse>(
                service, METHODID_DEPOSIT_CAMPAIGN)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.TxProto.MsgUpdateParams,
              com.OmniFlix.itc.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.itc.v1.TxProto.getDescriptor();
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
              .addMethod(getCreateCampaignMethod())
              .addMethod(getCancelCampaignMethod())
              .addMethod(getClaimMethod())
              .addMethod(getDepositCampaignMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
