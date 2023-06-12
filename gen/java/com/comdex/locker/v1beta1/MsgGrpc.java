package com.comdex.locker.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *For CLI Command &amp; Proposals 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/locker/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "comdex.locker.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCreateLockerRequest,
      com.comdex.locker.v1beta1.MsgCreateLockerResponse> getMsgCreateLockerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCreateLocker",
      requestType = com.comdex.locker.v1beta1.MsgCreateLockerRequest.class,
      responseType = com.comdex.locker.v1beta1.MsgCreateLockerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCreateLockerRequest,
      com.comdex.locker.v1beta1.MsgCreateLockerResponse> getMsgCreateLockerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCreateLockerRequest, com.comdex.locker.v1beta1.MsgCreateLockerResponse> getMsgCreateLockerMethod;
    if ((getMsgCreateLockerMethod = MsgGrpc.getMsgCreateLockerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCreateLockerMethod = MsgGrpc.getMsgCreateLockerMethod) == null) {
          MsgGrpc.getMsgCreateLockerMethod = getMsgCreateLockerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.MsgCreateLockerRequest, com.comdex.locker.v1beta1.MsgCreateLockerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCreateLocker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgCreateLockerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgCreateLockerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgCreateLocker"))
              .build();
        }
      }
    }
    return getMsgCreateLockerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgDepositAssetRequest,
      com.comdex.locker.v1beta1.MsgDepositAssetResponse> getMsgDepositAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgDepositAsset",
      requestType = com.comdex.locker.v1beta1.MsgDepositAssetRequest.class,
      responseType = com.comdex.locker.v1beta1.MsgDepositAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgDepositAssetRequest,
      com.comdex.locker.v1beta1.MsgDepositAssetResponse> getMsgDepositAssetMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgDepositAssetRequest, com.comdex.locker.v1beta1.MsgDepositAssetResponse> getMsgDepositAssetMethod;
    if ((getMsgDepositAssetMethod = MsgGrpc.getMsgDepositAssetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgDepositAssetMethod = MsgGrpc.getMsgDepositAssetMethod) == null) {
          MsgGrpc.getMsgDepositAssetMethod = getMsgDepositAssetMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.MsgDepositAssetRequest, com.comdex.locker.v1beta1.MsgDepositAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgDepositAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgDepositAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgDepositAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgDepositAsset"))
              .build();
        }
      }
    }
    return getMsgDepositAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgWithdrawAssetRequest,
      com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> getMsgWithdrawAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgWithdrawAsset",
      requestType = com.comdex.locker.v1beta1.MsgWithdrawAssetRequest.class,
      responseType = com.comdex.locker.v1beta1.MsgWithdrawAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgWithdrawAssetRequest,
      com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> getMsgWithdrawAssetMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgWithdrawAssetRequest, com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> getMsgWithdrawAssetMethod;
    if ((getMsgWithdrawAssetMethod = MsgGrpc.getMsgWithdrawAssetMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgWithdrawAssetMethod = MsgGrpc.getMsgWithdrawAssetMethod) == null) {
          MsgGrpc.getMsgWithdrawAssetMethod = getMsgWithdrawAssetMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.MsgWithdrawAssetRequest, com.comdex.locker.v1beta1.MsgWithdrawAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgWithdrawAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgWithdrawAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgWithdrawAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgWithdrawAsset"))
              .build();
        }
      }
    }
    return getMsgWithdrawAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCloseLockerRequest,
      com.comdex.locker.v1beta1.MsgCloseLockerResponse> getMsgCloseLockerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCloseLocker",
      requestType = com.comdex.locker.v1beta1.MsgCloseLockerRequest.class,
      responseType = com.comdex.locker.v1beta1.MsgCloseLockerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCloseLockerRequest,
      com.comdex.locker.v1beta1.MsgCloseLockerResponse> getMsgCloseLockerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgCloseLockerRequest, com.comdex.locker.v1beta1.MsgCloseLockerResponse> getMsgCloseLockerMethod;
    if ((getMsgCloseLockerMethod = MsgGrpc.getMsgCloseLockerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCloseLockerMethod = MsgGrpc.getMsgCloseLockerMethod) == null) {
          MsgGrpc.getMsgCloseLockerMethod = getMsgCloseLockerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.MsgCloseLockerRequest, com.comdex.locker.v1beta1.MsgCloseLockerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCloseLocker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgCloseLockerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgCloseLockerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgCloseLocker"))
              .build();
        }
      }
    }
    return getMsgCloseLockerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest,
      com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> getMsgLockerRewardCalcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgLockerRewardCalc",
      requestType = com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest.class,
      responseType = com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest,
      com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> getMsgLockerRewardCalcMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest, com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> getMsgLockerRewardCalcMethod;
    if ((getMsgLockerRewardCalcMethod = MsgGrpc.getMsgLockerRewardCalcMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgLockerRewardCalcMethod = MsgGrpc.getMsgLockerRewardCalcMethod) == null) {
          MsgGrpc.getMsgLockerRewardCalcMethod = getMsgLockerRewardCalcMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest, com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgLockerRewardCalc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgLockerRewardCalc"))
              .build();
        }
      }
    }
    return getMsgLockerRewardCalcMethod;
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
   *For CLI Command &amp; Proposals 
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void msgCreateLocker(com.comdex.locker.v1beta1.MsgCreateLockerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCreateLockerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCreateLockerMethod(), responseObserver);
    }

    /**
     */
    default void msgDepositAsset(com.comdex.locker.v1beta1.MsgDepositAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgDepositAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgDepositAssetMethod(), responseObserver);
    }

    /**
     */
    default void msgWithdrawAsset(com.comdex.locker.v1beta1.MsgWithdrawAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgWithdrawAssetMethod(), responseObserver);
    }

    /**
     */
    default void msgCloseLocker(com.comdex.locker.v1beta1.MsgCloseLockerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCloseLockerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCloseLockerMethod(), responseObserver);
    }

    /**
     */
    default void msgLockerRewardCalc(com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgLockerRewardCalcMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   *For CLI Command &amp; Proposals 
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
   *For CLI Command &amp; Proposals 
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
    public void msgCreateLocker(com.comdex.locker.v1beta1.MsgCreateLockerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCreateLockerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCreateLockerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgDepositAsset(com.comdex.locker.v1beta1.MsgDepositAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgDepositAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgDepositAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgWithdrawAsset(com.comdex.locker.v1beta1.MsgWithdrawAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgWithdrawAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgCloseLocker(com.comdex.locker.v1beta1.MsgCloseLockerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCloseLockerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCloseLockerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgLockerRewardCalc(com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgLockerRewardCalcMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   *For CLI Command &amp; Proposals 
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
    public com.comdex.locker.v1beta1.MsgCreateLockerResponse msgCreateLocker(com.comdex.locker.v1beta1.MsgCreateLockerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCreateLockerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.MsgDepositAssetResponse msgDepositAsset(com.comdex.locker.v1beta1.MsgDepositAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgDepositAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.MsgWithdrawAssetResponse msgWithdrawAsset(com.comdex.locker.v1beta1.MsgWithdrawAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgWithdrawAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.MsgCloseLockerResponse msgCloseLocker(com.comdex.locker.v1beta1.MsgCloseLockerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCloseLockerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse msgLockerRewardCalc(com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgLockerRewardCalcMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   *For CLI Command &amp; Proposals 
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.MsgCreateLockerResponse> msgCreateLocker(
        com.comdex.locker.v1beta1.MsgCreateLockerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCreateLockerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.MsgDepositAssetResponse> msgDepositAsset(
        com.comdex.locker.v1beta1.MsgDepositAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgDepositAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.MsgWithdrawAssetResponse> msgWithdrawAsset(
        com.comdex.locker.v1beta1.MsgWithdrawAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgWithdrawAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.MsgCloseLockerResponse> msgCloseLocker(
        com.comdex.locker.v1beta1.MsgCloseLockerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCloseLockerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse> msgLockerRewardCalc(
        com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgLockerRewardCalcMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_CREATE_LOCKER = 0;
  private static final int METHODID_MSG_DEPOSIT_ASSET = 1;
  private static final int METHODID_MSG_WITHDRAW_ASSET = 2;
  private static final int METHODID_MSG_CLOSE_LOCKER = 3;
  private static final int METHODID_MSG_LOCKER_REWARD_CALC = 4;

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
        case METHODID_MSG_CREATE_LOCKER:
          serviceImpl.msgCreateLocker((com.comdex.locker.v1beta1.MsgCreateLockerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCreateLockerResponse>) responseObserver);
          break;
        case METHODID_MSG_DEPOSIT_ASSET:
          serviceImpl.msgDepositAsset((com.comdex.locker.v1beta1.MsgDepositAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgDepositAssetResponse>) responseObserver);
          break;
        case METHODID_MSG_WITHDRAW_ASSET:
          serviceImpl.msgWithdrawAsset((com.comdex.locker.v1beta1.MsgWithdrawAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgWithdrawAssetResponse>) responseObserver);
          break;
        case METHODID_MSG_CLOSE_LOCKER:
          serviceImpl.msgCloseLocker((com.comdex.locker.v1beta1.MsgCloseLockerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgCloseLockerResponse>) responseObserver);
          break;
        case METHODID_MSG_LOCKER_REWARD_CALC:
          serviceImpl.msgLockerRewardCalc((com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse>) responseObserver);
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
          getMsgCreateLockerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.MsgCreateLockerRequest,
              com.comdex.locker.v1beta1.MsgCreateLockerResponse>(
                service, METHODID_MSG_CREATE_LOCKER)))
        .addMethod(
          getMsgDepositAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.MsgDepositAssetRequest,
              com.comdex.locker.v1beta1.MsgDepositAssetResponse>(
                service, METHODID_MSG_DEPOSIT_ASSET)))
        .addMethod(
          getMsgWithdrawAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.MsgWithdrawAssetRequest,
              com.comdex.locker.v1beta1.MsgWithdrawAssetResponse>(
                service, METHODID_MSG_WITHDRAW_ASSET)))
        .addMethod(
          getMsgCloseLockerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.MsgCloseLockerRequest,
              com.comdex.locker.v1beta1.MsgCloseLockerResponse>(
                service, METHODID_MSG_CLOSE_LOCKER)))
        .addMethod(
          getMsgLockerRewardCalcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.MsgLockerRewardCalcRequest,
              com.comdex.locker.v1beta1.MsgLockerRewardCalcResponse>(
                service, METHODID_MSG_LOCKER_REWARD_CALC)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.locker.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getMsgCreateLockerMethod())
              .addMethod(getMsgDepositAssetMethod())
              .addMethod(getMsgWithdrawAssetMethod())
              .addMethod(getMsgCloseLockerMethod())
              .addMethod(getMsgLockerRewardCalcMethod())
              .build();
        }
      }
    }
    return result;
  }
}
