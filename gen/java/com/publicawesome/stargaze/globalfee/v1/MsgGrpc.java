package com.publicawesome.stargaze.globalfee.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the alloc Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stargaze/globalfee/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "publicawesome.stargaze.globalfee.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> getSetCodeAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCodeAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> getSetCodeAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> getSetCodeAuthorizationMethod;
    if ((getSetCodeAuthorizationMethod = MsgGrpc.getSetCodeAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetCodeAuthorizationMethod = MsgGrpc.getSetCodeAuthorizationMethod) == null) {
          MsgGrpc.getSetCodeAuthorizationMethod = getSetCodeAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCodeAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetCodeAuthorization"))
              .build();
        }
      }
    }
    return getSetCodeAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> getRemoveCodeAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCodeAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> getRemoveCodeAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> getRemoveCodeAuthorizationMethod;
    if ((getRemoveCodeAuthorizationMethod = MsgGrpc.getRemoveCodeAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveCodeAuthorizationMethod = MsgGrpc.getRemoveCodeAuthorizationMethod) == null) {
          MsgGrpc.getRemoveCodeAuthorizationMethod = getRemoveCodeAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCodeAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveCodeAuthorization"))
              .build();
        }
      }
    }
    return getRemoveCodeAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> getSetContractAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetContractAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> getSetContractAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> getSetContractAuthorizationMethod;
    if ((getSetContractAuthorizationMethod = MsgGrpc.getSetContractAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetContractAuthorizationMethod = MsgGrpc.getSetContractAuthorizationMethod) == null) {
          MsgGrpc.getSetContractAuthorizationMethod = getSetContractAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetContractAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetContractAuthorization"))
              .build();
        }
      }
    }
    return getSetContractAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> getRemoveContractAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveContractAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization,
      com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> getRemoveContractAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> getRemoveContractAuthorizationMethod;
    if ((getRemoveContractAuthorizationMethod = MsgGrpc.getRemoveContractAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveContractAuthorizationMethod = MsgGrpc.getRemoveContractAuthorizationMethod) == null) {
          MsgGrpc.getRemoveContractAuthorizationMethod = getRemoveContractAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization, com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveContractAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveContractAuthorization"))
              .build();
        }
      }
    }
    return getRemoveContractAuthorizationMethod;
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
   * Msg defines the alloc Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void setCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCodeAuthorizationMethod(), responseObserver);
    }

    /**
     */
    default void removeCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCodeAuthorizationMethod(), responseObserver);
    }

    /**
     */
    default void setContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetContractAuthorizationMethod(), responseObserver);
    }

    /**
     */
    default void removeContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveContractAuthorizationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the alloc Msg service.
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
   * Msg defines the alloc Msg service.
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
    public void setCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCodeAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCodeAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetContractAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveContractAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the alloc Msg service.
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
    public com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse setCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCodeAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse removeCodeAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCodeAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse setContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetContractAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse removeContractAuthorization(com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveContractAuthorizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the alloc Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse> setCodeAuthorization(
        com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCodeAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse> removeCodeAuthorization(
        com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCodeAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse> setContractAuthorization(
        com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetContractAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse> removeContractAuthorization(
        com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveContractAuthorizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_CODE_AUTHORIZATION = 0;
  private static final int METHODID_REMOVE_CODE_AUTHORIZATION = 1;
  private static final int METHODID_SET_CONTRACT_AUTHORIZATION = 2;
  private static final int METHODID_REMOVE_CONTRACT_AUTHORIZATION = 3;

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
        case METHODID_SET_CODE_AUTHORIZATION:
          serviceImpl.setCodeAuthorization((com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CODE_AUTHORIZATION:
          serviceImpl.removeCodeAuthorization((com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse>) responseObserver);
          break;
        case METHODID_SET_CONTRACT_AUTHORIZATION:
          serviceImpl.setContractAuthorization((com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse>) responseObserver);
          break;
        case METHODID_REMOVE_CONTRACT_AUTHORIZATION:
          serviceImpl.removeContractAuthorization((com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse>) responseObserver);
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
          getSetCodeAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization,
              com.publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse>(
                service, METHODID_SET_CODE_AUTHORIZATION)))
        .addMethod(
          getRemoveCodeAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization,
              com.publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse>(
                service, METHODID_REMOVE_CODE_AUTHORIZATION)))
        .addMethod(
          getSetContractAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization,
              com.publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse>(
                service, METHODID_SET_CONTRACT_AUTHORIZATION)))
        .addMethod(
          getRemoveContractAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization,
              com.publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse>(
                service, METHODID_REMOVE_CONTRACT_AUTHORIZATION)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.publicawesome.stargaze.globalfee.v1.TxProto.getDescriptor();
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
              .addMethod(getSetCodeAuthorizationMethod())
              .addMethod(getRemoveCodeAuthorizationMethod())
              .addMethod(getSetContractAuthorizationMethod())
              .addMethod(getRemoveContractAuthorizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
