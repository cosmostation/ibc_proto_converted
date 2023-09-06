package com.mars.envoy.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the module's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: mars/envoy/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mars.envoy.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount,
      com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAccount",
      requestType = com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount.class,
      responseType = com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount,
      com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount, com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
          MsgGrpc.getRegisterAccountMethod = getRegisterAccountMethod =
              io.grpc.MethodDescriptor.<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount, com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterAccount"))
              .build();
        }
      }
    }
    return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendFunds,
      com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> getSendFundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendFunds",
      requestType = com.mars.envoy.v1beta1.TxProto.MsgSendFunds.class,
      responseType = com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendFunds,
      com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> getSendFundsMethod() {
    io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendFunds, com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> getSendFundsMethod;
    if ((getSendFundsMethod = MsgGrpc.getSendFundsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendFundsMethod = MsgGrpc.getSendFundsMethod) == null) {
          MsgGrpc.getSendFundsMethod = getSendFundsMethod =
              io.grpc.MethodDescriptor.<com.mars.envoy.v1beta1.TxProto.MsgSendFunds, com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendFunds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgSendFunds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendFunds"))
              .build();
        }
      }
    }
    return getSendFundsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendMessages,
      com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> getSendMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessages",
      requestType = com.mars.envoy.v1beta1.TxProto.MsgSendMessages.class,
      responseType = com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendMessages,
      com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> getSendMessagesMethod() {
    io.grpc.MethodDescriptor<com.mars.envoy.v1beta1.TxProto.MsgSendMessages, com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> getSendMessagesMethod;
    if ((getSendMessagesMethod = MsgGrpc.getSendMessagesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendMessagesMethod = MsgGrpc.getSendMessagesMethod) == null) {
          MsgGrpc.getSendMessagesMethod = getSendMessagesMethod =
              io.grpc.MethodDescriptor.<com.mars.envoy.v1beta1.TxProto.MsgSendMessages, com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgSendMessages.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendMessages"))
              .build();
        }
      }
    }
    return getSendMessagesMethod;
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
   * Msg defines the module's gRPC message service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    default void registerAccount(com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    default void sendFunds(com.mars.envoy.v1beta1.TxProto.MsgSendFunds request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendFundsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    default void sendMessages(com.mars.envoy.v1beta1.TxProto.MsgSendMessages request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the module's gRPC message service.
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
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public void registerAccount(com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public void sendFunds(com.mars.envoy.v1beta1.TxProto.MsgSendFunds request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendFundsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public void sendMessages(com.mars.envoy.v1beta1.TxProto.MsgSendMessages request,
        io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse registerAccount(com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse sendFunds(com.mars.envoy.v1beta1.TxProto.MsgSendFunds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendFundsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse sendMessages(com.mars.envoy.v1beta1.TxProto.MsgSendMessages request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the module's gRPC message service.
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
     * RegisterAccount creates a new interchain account on the given connection,
     * or if an interchain account already exists but its channel is closed (due
     * to a packet having timed out), open a new channel for this account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse> registerAccount(
        com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendFunds is a governance operation for sending funds to an interchain
     * account via ICS-20.
     * The envoy module will first attempt to use the balance held in its own
     * module account. If the balance is not sufficient, it will attempt to draw
     * the difference from the community pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse> sendFunds(
        com.mars.envoy.v1beta1.TxProto.MsgSendFunds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendFundsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendMessages is a governance operation for sending one or more messages to
     * the host chain to be executed by the interchain account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse> sendMessages(
        com.mars.envoy.v1beta1.TxProto.MsgSendMessages request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ACCOUNT = 0;
  private static final int METHODID_SEND_FUNDS = 1;
  private static final int METHODID_SEND_MESSAGES = 2;

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
        case METHODID_REGISTER_ACCOUNT:
          serviceImpl.registerAccount((com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount) request,
              (io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse>) responseObserver);
          break;
        case METHODID_SEND_FUNDS:
          serviceImpl.sendFunds((com.mars.envoy.v1beta1.TxProto.MsgSendFunds) request,
              (io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGES:
          serviceImpl.sendMessages((com.mars.envoy.v1beta1.TxProto.MsgSendMessages) request,
              (io.grpc.stub.StreamObserver<com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse>) responseObserver);
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
          getRegisterAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.envoy.v1beta1.TxProto.MsgRegisterAccount,
              com.mars.envoy.v1beta1.TxProto.MsgRegisterAccountResponse>(
                service, METHODID_REGISTER_ACCOUNT)))
        .addMethod(
          getSendFundsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.envoy.v1beta1.TxProto.MsgSendFunds,
              com.mars.envoy.v1beta1.TxProto.MsgSendFundsResponse>(
                service, METHODID_SEND_FUNDS)))
        .addMethod(
          getSendMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.envoy.v1beta1.TxProto.MsgSendMessages,
              com.mars.envoy.v1beta1.TxProto.MsgSendMessagesResponse>(
                service, METHODID_SEND_MESSAGES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mars.envoy.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getRegisterAccountMethod())
              .addMethod(getSendFundsMethod())
              .addMethod(getSendMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
