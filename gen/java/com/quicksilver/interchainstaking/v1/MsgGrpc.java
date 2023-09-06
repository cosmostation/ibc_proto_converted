package com.quicksilver.interchainstaking.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the interchainstaking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: quicksilver/interchainstaking/v1/messages.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "quicksilver.interchainstaking.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption,
      com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> getRequestRedemptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRedemption",
      requestType = com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption.class,
      responseType = com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption,
      com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> getRequestRedemptionMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption, com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> getRequestRedemptionMethod;
    if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
          MsgGrpc.getRequestRedemptionMethod = getRequestRedemptionMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption, com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRedemption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestRedemption"))
              .build();
        }
      }
    }
    return getRequestRedemptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent,
      com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> getSignalIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignalIntent",
      requestType = com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent.class,
      responseType = com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent,
      com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> getSignalIntentMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent, com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> getSignalIntentMethod;
    if ((getSignalIntentMethod = MsgGrpc.getSignalIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSignalIntentMethod = MsgGrpc.getSignalIntentMethod) == null) {
          MsgGrpc.getSignalIntentMethod = getSignalIntentMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent, com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignalIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SignalIntent"))
              .build();
        }
      }
    }
    return getSignalIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel,
      com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> getGovCloseChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovCloseChannel",
      requestType = com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel.class,
      responseType = com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel,
      com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> getGovCloseChannelMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel, com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> getGovCloseChannelMethod;
    if ((getGovCloseChannelMethod = MsgGrpc.getGovCloseChannelMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovCloseChannelMethod = MsgGrpc.getGovCloseChannelMethod) == null) {
          MsgGrpc.getGovCloseChannelMethod = getGovCloseChannelMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel, com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovCloseChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovCloseChannel"))
              .build();
        }
      }
    }
    return getGovCloseChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel,
      com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> getGovReopenChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovReopenChannel",
      requestType = com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel.class,
      responseType = com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel,
      com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> getGovReopenChannelMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel, com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> getGovReopenChannelMethod;
    if ((getGovReopenChannelMethod = MsgGrpc.getGovReopenChannelMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovReopenChannelMethod = MsgGrpc.getGovReopenChannelMethod) == null) {
          MsgGrpc.getGovReopenChannelMethod = getGovReopenChannelMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel, com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovReopenChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovReopenChannel"))
              .build();
        }
      }
    }
    return getGovReopenChannelMethod;
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
   * Msg defines the interchainstaking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    default void requestRedemption(com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestRedemptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    default void signalIntent(com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignalIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    default void govCloseChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovCloseChannelMethod(), responseObserver);
    }

    /**
     */
    default void govReopenChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovReopenChannelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public void requestRedemption(com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public void signalIntent(com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignalIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public void govCloseChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovCloseChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void govReopenChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovReopenChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse requestRedemption(com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestRedemptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse signalIntent(com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignalIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse govCloseChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovCloseChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse govReopenChannel(com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovReopenChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the interchainstaking Msg service.
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
     * RequestRedemption defines a method for requesting burning of qAssets for
     * native assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse> requestRedemption(
        com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse> signalIntent(
        com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignalIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SignalIntent defines a method for signalling voting intent for one or more
     * validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse> govCloseChannel(
        com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovCloseChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse> govReopenChannel(
        com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovReopenChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_REDEMPTION = 0;
  private static final int METHODID_SIGNAL_INTENT = 1;
  private static final int METHODID_GOV_CLOSE_CHANNEL = 2;
  private static final int METHODID_GOV_REOPEN_CHANNEL = 3;

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
        case METHODID_REQUEST_REDEMPTION:
          serviceImpl.requestRedemption((com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse>) responseObserver);
          break;
        case METHODID_SIGNAL_INTENT:
          serviceImpl.signalIntent((com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse>) responseObserver);
          break;
        case METHODID_GOV_CLOSE_CHANNEL:
          serviceImpl.govCloseChannel((com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse>) responseObserver);
          break;
        case METHODID_GOV_REOPEN_CHANNEL:
          serviceImpl.govReopenChannel((com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse>) responseObserver);
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
          getRequestRedemptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemption,
              com.quicksilver.interchainstaking.v1.MessagesProto.MsgRequestRedemptionResponse>(
                service, METHODID_REQUEST_REDEMPTION)))
        .addMethod(
          getSignalIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntent,
              com.quicksilver.interchainstaking.v1.MessagesProto.MsgSignalIntentResponse>(
                service, METHODID_SIGNAL_INTENT)))
        .addMethod(
          getGovCloseChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannel,
              com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovCloseChannelResponse>(
                service, METHODID_GOV_CLOSE_CHANNEL)))
        .addMethod(
          getGovReopenChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannel,
              com.quicksilver.interchainstaking.v1.ProposalsProto.MsgGovReopenChannelResponse>(
                service, METHODID_GOV_REOPEN_CHANNEL)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.quicksilver.interchainstaking.v1.MessagesProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getRequestRedemptionMethod())
              .addMethod(getSignalIntentMethod())
              .addMethod(getGovCloseChannelMethod())
              .addMethod(getGovReopenChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
