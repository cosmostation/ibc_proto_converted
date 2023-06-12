package com.confio.poe.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: confio/poe/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "confio.poe.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgCreateValidator,
      com.confio.poe.v1beta1.MsgCreateValidatorResponse> getCreateValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateValidator",
      requestType = com.confio.poe.v1beta1.MsgCreateValidator.class,
      responseType = com.confio.poe.v1beta1.MsgCreateValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgCreateValidator,
      com.confio.poe.v1beta1.MsgCreateValidatorResponse> getCreateValidatorMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgCreateValidator, com.confio.poe.v1beta1.MsgCreateValidatorResponse> getCreateValidatorMethod;
    if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
          MsgGrpc.getCreateValidatorMethod = getCreateValidatorMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.MsgCreateValidator, com.confio.poe.v1beta1.MsgCreateValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgCreateValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgCreateValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateValidator"))
              .build();
        }
      }
    }
    return getCreateValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUpdateValidator,
      com.confio.poe.v1beta1.MsgUpdateValidatorResponse> getUpdateValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateValidator",
      requestType = com.confio.poe.v1beta1.MsgUpdateValidator.class,
      responseType = com.confio.poe.v1beta1.MsgUpdateValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUpdateValidator,
      com.confio.poe.v1beta1.MsgUpdateValidatorResponse> getUpdateValidatorMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUpdateValidator, com.confio.poe.v1beta1.MsgUpdateValidatorResponse> getUpdateValidatorMethod;
    if ((getUpdateValidatorMethod = MsgGrpc.getUpdateValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateValidatorMethod = MsgGrpc.getUpdateValidatorMethod) == null) {
          MsgGrpc.getUpdateValidatorMethod = getUpdateValidatorMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.MsgUpdateValidator, com.confio.poe.v1beta1.MsgUpdateValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgUpdateValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgUpdateValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateValidator"))
              .build();
        }
      }
    }
    return getUpdateValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgDelegate,
      com.confio.poe.v1beta1.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = com.confio.poe.v1beta1.MsgDelegate.class,
      responseType = com.confio.poe.v1beta1.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgDelegate,
      com.confio.poe.v1beta1.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgDelegate, com.confio.poe.v1beta1.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.MsgDelegate, com.confio.poe.v1beta1.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUndelegate,
      com.confio.poe.v1beta1.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = com.confio.poe.v1beta1.MsgUndelegate.class,
      responseType = com.confio.poe.v1beta1.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUndelegate,
      com.confio.poe.v1beta1.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.MsgUndelegate, com.confio.poe.v1beta1.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.MsgUndelegate, com.confio.poe.v1beta1.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    default void createValidator(com.confio.poe.v1beta1.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgCreateValidator defines a method for updating validator metadata
     * </pre>
     */
    default void updateValidator(com.confio.poe.v1beta1.MsgUpdateValidator request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUpdateValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a self delegation of coins
     * by a node operator
     * </pre>
     */
    default void delegate(com.confio.poe.v1beta1.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * node operator
     * </pre>
     */
    default void undelegate(com.confio.poe.v1beta1.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public void createValidator(com.confio.poe.v1beta1.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgCreateValidator defines a method for updating validator metadata
     * </pre>
     */
    public void updateValidator(com.confio.poe.v1beta1.MsgUpdateValidator request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUpdateValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a self delegation of coins
     * by a node operator
     * </pre>
     */
    public void delegate(com.confio.poe.v1beta1.MsgDelegate request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * node operator
     * </pre>
     */
    public void undelegate(com.confio.poe.v1beta1.MsgUndelegate request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public com.confio.poe.v1beta1.MsgCreateValidatorResponse createValidator(com.confio.poe.v1beta1.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgCreateValidator defines a method for updating validator metadata
     * </pre>
     */
    public com.confio.poe.v1beta1.MsgUpdateValidatorResponse updateValidator(com.confio.poe.v1beta1.MsgUpdateValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a self delegation of coins
     * by a node operator
     * </pre>
     */
    public com.confio.poe.v1beta1.MsgDelegateResponse delegate(com.confio.poe.v1beta1.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * node operator
     * </pre>
     */
    public com.confio.poe.v1beta1.MsgUndelegateResponse undelegate(com.confio.poe.v1beta1.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.MsgCreateValidatorResponse> createValidator(
        com.confio.poe.v1beta1.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgCreateValidator defines a method for updating validator metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.MsgUpdateValidatorResponse> updateValidator(
        com.confio.poe.v1beta1.MsgUpdateValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a self delegation of coins
     * by a node operator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.MsgDelegateResponse> delegate(
        com.confio.poe.v1beta1.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * node operator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.MsgUndelegateResponse> undelegate(
        com.confio.poe.v1beta1.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VALIDATOR = 0;
  private static final int METHODID_UPDATE_VALIDATOR = 1;
  private static final int METHODID_DELEGATE = 2;
  private static final int METHODID_UNDELEGATE = 3;

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
        case METHODID_CREATE_VALIDATOR:
          serviceImpl.createValidator((com.confio.poe.v1beta1.MsgCreateValidator) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgCreateValidatorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VALIDATOR:
          serviceImpl.updateValidator((com.confio.poe.v1beta1.MsgUpdateValidator) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUpdateValidatorResponse>) responseObserver);
          break;
        case METHODID_DELEGATE:
          serviceImpl.delegate((com.confio.poe.v1beta1.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((com.confio.poe.v1beta1.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.MsgUndelegateResponse>) responseObserver);
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
          getCreateValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.MsgCreateValidator,
              com.confio.poe.v1beta1.MsgCreateValidatorResponse>(
                service, METHODID_CREATE_VALIDATOR)))
        .addMethod(
          getUpdateValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.MsgUpdateValidator,
              com.confio.poe.v1beta1.MsgUpdateValidatorResponse>(
                service, METHODID_UPDATE_VALIDATOR)))
        .addMethod(
          getDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.MsgDelegate,
              com.confio.poe.v1beta1.MsgDelegateResponse>(
                service, METHODID_DELEGATE)))
        .addMethod(
          getUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.MsgUndelegate,
              com.confio.poe.v1beta1.MsgUndelegateResponse>(
                service, METHODID_UNDELEGATE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.confio.poe.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateValidatorMethod())
              .addMethod(getUpdateValidatorMethod())
              .addMethod(getDelegateMethod())
              .addMethod(getUndelegateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
