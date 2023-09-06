package com.em.market.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: em/market/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "em.market.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddLimitOrder,
      com.em.market.v1.TxProto.MsgAddLimitOrderResponse> getAddLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLimitOrder",
      requestType = com.em.market.v1.TxProto.MsgAddLimitOrder.class,
      responseType = com.em.market.v1.TxProto.MsgAddLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddLimitOrder,
      com.em.market.v1.TxProto.MsgAddLimitOrderResponse> getAddLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddLimitOrder, com.em.market.v1.TxProto.MsgAddLimitOrderResponse> getAddLimitOrderMethod;
    if ((getAddLimitOrderMethod = MsgGrpc.getAddLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLimitOrderMethod = MsgGrpc.getAddLimitOrderMethod) == null) {
          MsgGrpc.getAddLimitOrderMethod = getAddLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.TxProto.MsgAddLimitOrder, com.em.market.v1.TxProto.MsgAddLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgAddLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgAddLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLimitOrder"))
              .build();
        }
      }
    }
    return getAddLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddMarketOrder,
      com.em.market.v1.TxProto.MsgAddMarketOrderResponse> getAddMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMarketOrder",
      requestType = com.em.market.v1.TxProto.MsgAddMarketOrder.class,
      responseType = com.em.market.v1.TxProto.MsgAddMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddMarketOrder,
      com.em.market.v1.TxProto.MsgAddMarketOrderResponse> getAddMarketOrderMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgAddMarketOrder, com.em.market.v1.TxProto.MsgAddMarketOrderResponse> getAddMarketOrderMethod;
    if ((getAddMarketOrderMethod = MsgGrpc.getAddMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMarketOrderMethod = MsgGrpc.getAddMarketOrderMethod) == null) {
          MsgGrpc.getAddMarketOrderMethod = getAddMarketOrderMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.TxProto.MsgAddMarketOrder, com.em.market.v1.TxProto.MsgAddMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgAddMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgAddMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMarketOrder"))
              .build();
        }
      }
    }
    return getAddMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelOrder,
      com.em.market.v1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = com.em.market.v1.TxProto.MsgCancelOrder.class,
      responseType = com.em.market.v1.TxProto.MsgCancelOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelOrder,
      com.em.market.v1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelOrder, com.em.market.v1.TxProto.MsgCancelOrderResponse> getCancelOrderMethod;
    if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelOrderMethod = MsgGrpc.getCancelOrderMethod) == null) {
          MsgGrpc.getCancelOrderMethod = getCancelOrderMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.TxProto.MsgCancelOrder, com.em.market.v1.TxProto.MsgCancelOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelOrder"))
              .build();
        }
      }
    }
    return getCancelOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder,
      com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> getCancelReplaceLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelReplaceLimitOrder",
      requestType = com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder.class,
      responseType = com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder,
      com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> getCancelReplaceLimitOrderMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder, com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> getCancelReplaceLimitOrderMethod;
    if ((getCancelReplaceLimitOrderMethod = MsgGrpc.getCancelReplaceLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelReplaceLimitOrderMethod = MsgGrpc.getCancelReplaceLimitOrderMethod) == null) {
          MsgGrpc.getCancelReplaceLimitOrderMethod = getCancelReplaceLimitOrderMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder, com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelReplaceLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelReplaceLimitOrder"))
              .build();
        }
      }
    }
    return getCancelReplaceLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder,
      com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> getCancelReplaceMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelReplaceMarketOrder",
      requestType = com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder.class,
      responseType = com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder,
      com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> getCancelReplaceMarketOrderMethod() {
    io.grpc.MethodDescriptor<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder, com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> getCancelReplaceMarketOrderMethod;
    if ((getCancelReplaceMarketOrderMethod = MsgGrpc.getCancelReplaceMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelReplaceMarketOrderMethod = MsgGrpc.getCancelReplaceMarketOrderMethod) == null) {
          MsgGrpc.getCancelReplaceMarketOrderMethod = getCancelReplaceMarketOrderMethod =
              io.grpc.MethodDescriptor.<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder, com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelReplaceMarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelReplaceMarketOrder"))
              .build();
        }
      }
    }
    return getCancelReplaceMarketOrderMethod;
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
    default void addLimitOrder(com.em.market.v1.TxProto.MsgAddLimitOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLimitOrderMethod(), responseObserver);
    }

    /**
     */
    default void addMarketOrder(com.em.market.v1.TxProto.MsgAddMarketOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMarketOrderMethod(), responseObserver);
    }

    /**
     */
    default void cancelOrder(com.em.market.v1.TxProto.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    /**
     */
    default void cancelReplaceLimitOrder(com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelReplaceLimitOrderMethod(), responseObserver);
    }

    /**
     */
    default void cancelReplaceMarketOrder(com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelReplaceMarketOrderMethod(), responseObserver);
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
    public void addLimitOrder(com.em.market.v1.TxProto.MsgAddLimitOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMarketOrder(com.em.market.v1.TxProto.MsgAddMarketOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOrder(com.em.market.v1.TxProto.MsgCancelOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelReplaceLimitOrder(com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelReplaceLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelReplaceMarketOrder(com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder request,
        io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelReplaceMarketOrderMethod(), getCallOptions()), request, responseObserver);
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
    public com.em.market.v1.TxProto.MsgAddLimitOrderResponse addLimitOrder(com.em.market.v1.TxProto.MsgAddLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.TxProto.MsgAddMarketOrderResponse addMarketOrder(com.em.market.v1.TxProto.MsgAddMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.TxProto.MsgCancelOrderResponse cancelOrder(com.em.market.v1.TxProto.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse cancelReplaceLimitOrder(com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelReplaceLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse cancelReplaceMarketOrder(com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelReplaceMarketOrderMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.TxProto.MsgAddLimitOrderResponse> addLimitOrder(
        com.em.market.v1.TxProto.MsgAddLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.TxProto.MsgAddMarketOrderResponse> addMarketOrder(
        com.em.market.v1.TxProto.MsgAddMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.TxProto.MsgCancelOrderResponse> cancelOrder(
        com.em.market.v1.TxProto.MsgCancelOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse> cancelReplaceLimitOrder(
        com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelReplaceLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse> cancelReplaceMarketOrder(
        com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelReplaceMarketOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_LIMIT_ORDER = 0;
  private static final int METHODID_ADD_MARKET_ORDER = 1;
  private static final int METHODID_CANCEL_ORDER = 2;
  private static final int METHODID_CANCEL_REPLACE_LIMIT_ORDER = 3;
  private static final int METHODID_CANCEL_REPLACE_MARKET_ORDER = 4;

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
        case METHODID_ADD_LIMIT_ORDER:
          serviceImpl.addLimitOrder((com.em.market.v1.TxProto.MsgAddLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddLimitOrderResponse>) responseObserver);
          break;
        case METHODID_ADD_MARKET_ORDER:
          serviceImpl.addMarketOrder((com.em.market.v1.TxProto.MsgAddMarketOrder) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgAddMarketOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((com.em.market.v1.TxProto.MsgCancelOrder) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_REPLACE_LIMIT_ORDER:
          serviceImpl.cancelReplaceLimitOrder((com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_REPLACE_MARKET_ORDER:
          serviceImpl.cancelReplaceMarketOrder((com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder) request,
              (io.grpc.stub.StreamObserver<com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse>) responseObserver);
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
          getAddLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.TxProto.MsgAddLimitOrder,
              com.em.market.v1.TxProto.MsgAddLimitOrderResponse>(
                service, METHODID_ADD_LIMIT_ORDER)))
        .addMethod(
          getAddMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.TxProto.MsgAddMarketOrder,
              com.em.market.v1.TxProto.MsgAddMarketOrderResponse>(
                service, METHODID_ADD_MARKET_ORDER)))
        .addMethod(
          getCancelOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.TxProto.MsgCancelOrder,
              com.em.market.v1.TxProto.MsgCancelOrderResponse>(
                service, METHODID_CANCEL_ORDER)))
        .addMethod(
          getCancelReplaceLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.TxProto.MsgCancelReplaceLimitOrder,
              com.em.market.v1.TxProto.MsgCancelReplaceLimitOrderResponse>(
                service, METHODID_CANCEL_REPLACE_LIMIT_ORDER)))
        .addMethod(
          getCancelReplaceMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.market.v1.TxProto.MsgCancelReplaceMarketOrder,
              com.em.market.v1.TxProto.MsgCancelReplaceMarketOrderResponse>(
                service, METHODID_CANCEL_REPLACE_MARKET_ORDER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.market.v1.TxProto.getDescriptor();
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
              .addMethod(getAddLimitOrderMethod())
              .addMethod(getAddMarketOrderMethod())
              .addMethod(getCancelOrderMethod())
              .addMethod(getCancelReplaceLimitOrderMethod())
              .addMethod(getCancelReplaceMarketOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
