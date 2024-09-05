package com.osmosis.smartaccount.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/smartaccount/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.smartaccount.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> getAddAuthenticatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAuthenticator",
      requestType = com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator.class,
      responseType = com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> getAddAuthenticatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator, com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> getAddAuthenticatorMethod;
    if ((getAddAuthenticatorMethod = MsgGrpc.getAddAuthenticatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAuthenticatorMethod = MsgGrpc.getAddAuthenticatorMethod) == null) {
          MsgGrpc.getAddAuthenticatorMethod = getAddAuthenticatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator, com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAuthenticator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAuthenticator"))
              .build();
        }
      }
    }
    return getAddAuthenticatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> getRemoveAuthenticatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAuthenticator",
      requestType = com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator.class,
      responseType = com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> getRemoveAuthenticatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator, com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> getRemoveAuthenticatorMethod;
    if ((getRemoveAuthenticatorMethod = MsgGrpc.getRemoveAuthenticatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveAuthenticatorMethod = MsgGrpc.getRemoveAuthenticatorMethod) == null) {
          MsgGrpc.getRemoveAuthenticatorMethod = getRemoveAuthenticatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator, com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAuthenticator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveAuthenticator"))
              .build();
        }
      }
    }
    return getRemoveAuthenticatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> getSetActiveStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetActiveState",
      requestType = com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState.class,
      responseType = com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState,
      com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> getSetActiveStateMethod() {
    io.grpc.MethodDescriptor<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState, com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> getSetActiveStateMethod;
    if ((getSetActiveStateMethod = MsgGrpc.getSetActiveStateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetActiveStateMethod = MsgGrpc.getSetActiveStateMethod) == null) {
          MsgGrpc.getSetActiveStateMethod = getSetActiveStateMethod =
              io.grpc.MethodDescriptor.<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState, com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetActiveState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetActiveState"))
              .build();
        }
      }
    }
    return getSetActiveStateMethod;
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
     */
    default void addAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAuthenticatorMethod(), responseObserver);
    }

    /**
     */
    default void removeAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAuthenticatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetActiveState sets the active state of the authenticator.
     * Primarily used for circuit breaking.
     * </pre>
     */
    default void setActiveState(com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetActiveStateMethod(), responseObserver);
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
     */
    public void addAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAuthenticatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAuthenticatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetActiveState sets the active state of the authenticator.
     * Primarily used for circuit breaking.
     * </pre>
     */
    public void setActiveState(com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState request,
        io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetActiveStateMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse addAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAuthenticatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse removeAuthenticator(com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAuthenticatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetActiveState sets the active state of the authenticator.
     * Primarily used for circuit breaking.
     * </pre>
     */
    public com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse setActiveState(com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetActiveStateMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse> addAuthenticator(
        com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAuthenticatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse> removeAuthenticator(
        com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAuthenticatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetActiveState sets the active state of the authenticator.
     * Primarily used for circuit breaking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse> setActiveState(
        com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetActiveStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_AUTHENTICATOR = 0;
  private static final int METHODID_REMOVE_AUTHENTICATOR = 1;
  private static final int METHODID_SET_ACTIVE_STATE = 2;

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
        case METHODID_ADD_AUTHENTICATOR:
          serviceImpl.addAuthenticator((com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator) request,
              (io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse>) responseObserver);
          break;
        case METHODID_REMOVE_AUTHENTICATOR:
          serviceImpl.removeAuthenticator((com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator) request,
              (io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse>) responseObserver);
          break;
        case METHODID_SET_ACTIVE_STATE:
          serviceImpl.setActiveState((com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState) request,
              (io.grpc.stub.StreamObserver<com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse>) responseObserver);
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
          getAddAuthenticatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticator,
              com.osmosis.smartaccount.v1beta1.TxProto.MsgAddAuthenticatorResponse>(
                service, METHODID_ADD_AUTHENTICATOR)))
        .addMethod(
          getRemoveAuthenticatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticator,
              com.osmosis.smartaccount.v1beta1.TxProto.MsgRemoveAuthenticatorResponse>(
                service, METHODID_REMOVE_AUTHENTICATOR)))
        .addMethod(
          getSetActiveStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveState,
              com.osmosis.smartaccount.v1beta1.TxProto.MsgSetActiveStateResponse>(
                service, METHODID_SET_ACTIVE_STATE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.smartaccount.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getAddAuthenticatorMethod())
              .addMethod(getRemoveAuthenticatorMethod())
              .addMethod(getSetActiveStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
