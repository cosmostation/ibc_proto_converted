package com.panacea.datapool.v2alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: panacea/datapool/v2alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "panacea.datapool.v2alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool,
      com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool.class,
      responseType = com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool,
      com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool, com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool, com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgSellData,
      com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellData",
      requestType = com.panacea.datapool.v2alpha1.TxProto.MsgSellData.class,
      responseType = com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgSellData,
      com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgSellData, com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod;
    if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
          MsgGrpc.getSellDataMethod = getSellDataMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.TxProto.MsgSellData, com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgSellData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SellData"))
              .build();
        }
      }
    }
    return getSellDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass,
      com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> getBuyDataPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyDataPass",
      requestType = com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass.class,
      responseType = com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass,
      com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> getBuyDataPassMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass, com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> getBuyDataPassMethod;
    if ((getBuyDataPassMethod = MsgGrpc.getBuyDataPassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyDataPassMethod = MsgGrpc.getBuyDataPassMethod) == null) {
          MsgGrpc.getBuyDataPassMethod = getBuyDataPassMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass, com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyDataPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BuyDataPass"))
              .build();
        }
      }
    }
    return getBuyDataPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass,
      com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> getRedeemDataPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedeemDataPass",
      requestType = com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass.class,
      responseType = com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass,
      com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> getRedeemDataPassMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass, com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> getRedeemDataPassMethod;
    if ((getRedeemDataPassMethod = MsgGrpc.getRedeemDataPassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemDataPassMethod = MsgGrpc.getRedeemDataPassMethod) == null) {
          MsgGrpc.getRedeemDataPassMethod = getRedeemDataPassMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass, com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedeemDataPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RedeemDataPass"))
              .build();
        }
      }
    }
    return getRedeemDataPassMethod;
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
     * CreatePool defines a method for creating data pool.
     * </pre>
     */
    default void createPool(com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling data
     * </pre>
     */
    default void sellData(com.panacea.datapool.v2alpha1.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyDataPass defines a method for buying data pass
     * </pre>
     */
    default void buyDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyDataPassMethod(), responseObserver);
    }

    /**
     * <pre>
     * RedeemDataPass defines a method for redeeming data pass to get data
     * </pre>
     */
    default void redeemDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeemDataPassMethod(), responseObserver);
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
     * CreatePool defines a method for creating data pool.
     * </pre>
     */
    public void createPool(com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling data
     * </pre>
     */
    public void sellData(com.panacea.datapool.v2alpha1.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyDataPass defines a method for buying data pass
     * </pre>
     */
    public void buyDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyDataPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RedeemDataPass defines a method for redeeming data pass to get data
     * </pre>
     */
    public void redeemDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeemDataPassMethod(), getCallOptions()), request, responseObserver);
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
     * CreatePool defines a method for creating data pool.
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse createPool(com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling data
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse sellData(com.panacea.datapool.v2alpha1.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyDataPass defines a method for buying data pass
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse buyDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyDataPassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RedeemDataPass defines a method for redeeming data pass to get data
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse redeemDataPass(com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeemDataPassMethod(), getCallOptions(), request);
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
     * CreatePool defines a method for creating data pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse> createPool(
        com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse> sellData(
        com.panacea.datapool.v2alpha1.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyDataPass defines a method for buying data pass
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse> buyDataPass(
        com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyDataPassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RedeemDataPass defines a method for redeeming data pass to get data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse> redeemDataPass(
        com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeemDataPassMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POOL = 0;
  private static final int METHODID_SELL_DATA = 1;
  private static final int METHODID_BUY_DATA_PASS = 2;
  private static final int METHODID_REDEEM_DATA_PASS = 3;

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
          serviceImpl.createPool((com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_SELL_DATA:
          serviceImpl.sellData((com.panacea.datapool.v2alpha1.TxProto.MsgSellData) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse>) responseObserver);
          break;
        case METHODID_BUY_DATA_PASS:
          serviceImpl.buyDataPass((com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse>) responseObserver);
          break;
        case METHODID_REDEEM_DATA_PASS:
          serviceImpl.redeemDataPass((com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse>) responseObserver);
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
              com.panacea.datapool.v2alpha1.TxProto.MsgCreatePool,
              com.panacea.datapool.v2alpha1.TxProto.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getSellDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.TxProto.MsgSellData,
              com.panacea.datapool.v2alpha1.TxProto.MsgSellDataResponse>(
                service, METHODID_SELL_DATA)))
        .addMethod(
          getBuyDataPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPass,
              com.panacea.datapool.v2alpha1.TxProto.MsgBuyDataPassResponse>(
                service, METHODID_BUY_DATA_PASS)))
        .addMethod(
          getRedeemDataPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPass,
              com.panacea.datapool.v2alpha1.TxProto.MsgRedeemDataPassResponse>(
                service, METHODID_REDEEM_DATA_PASS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datapool.v2alpha1.TxProto.getDescriptor();
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
              .addMethod(getSellDataMethod())
              .addMethod(getBuyDataPassMethod())
              .addMethod(getRedeemDataPassMethod())
              .build();
        }
      }
    }
    return result;
  }
}
