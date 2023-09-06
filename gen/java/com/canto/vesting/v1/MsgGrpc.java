package com.canto.vesting.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the vesting Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: canto/vesting/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "canto.vesting.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount,
      com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> getCreateClawbackVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClawbackVestingAccount",
      requestType = com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount.class,
      responseType = com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount,
      com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> getCreateClawbackVestingAccountMethod() {
    io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount, com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> getCreateClawbackVestingAccountMethod;
    if ((getCreateClawbackVestingAccountMethod = MsgGrpc.getCreateClawbackVestingAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateClawbackVestingAccountMethod = MsgGrpc.getCreateClawbackVestingAccountMethod) == null) {
          MsgGrpc.getCreateClawbackVestingAccountMethod = getCreateClawbackVestingAccountMethod =
              io.grpc.MethodDescriptor.<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount, com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClawbackVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateClawbackVestingAccount"))
              .build();
        }
      }
    }
    return getCreateClawbackVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgClawback,
      com.canto.vesting.v1.TxProto.MsgClawbackResponse> getClawbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clawback",
      requestType = com.canto.vesting.v1.TxProto.MsgClawback.class,
      responseType = com.canto.vesting.v1.TxProto.MsgClawbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgClawback,
      com.canto.vesting.v1.TxProto.MsgClawbackResponse> getClawbackMethod() {
    io.grpc.MethodDescriptor<com.canto.vesting.v1.TxProto.MsgClawback, com.canto.vesting.v1.TxProto.MsgClawbackResponse> getClawbackMethod;
    if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClawbackMethod = MsgGrpc.getClawbackMethod) == null) {
          MsgGrpc.getClawbackMethod = getClawbackMethod =
              io.grpc.MethodDescriptor.<com.canto.vesting.v1.TxProto.MsgClawback, com.canto.vesting.v1.TxProto.MsgClawbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clawback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.vesting.v1.TxProto.MsgClawback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.vesting.v1.TxProto.MsgClawbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Clawback"))
              .build();
        }
      }
    }
    return getClawbackMethod;
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
   * Msg defines the vesting Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateClawbackVestingAccount creats a vesting account that is subject to
     * clawback and the configuration of vesting and lockup schedules.
     * </pre>
     */
    default void createClawbackVestingAccount(com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount request,
        io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClawbackVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clawback removes the unvested tokens from a ClawbackVestingAccount.
     * </pre>
     */
    default void clawback(com.canto.vesting.v1.TxProto.MsgClawback request,
        io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgClawbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClawbackMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the vesting Msg service.
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
   * Msg defines the vesting Msg service.
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
     * CreateClawbackVestingAccount creats a vesting account that is subject to
     * clawback and the configuration of vesting and lockup schedules.
     * </pre>
     */
    public void createClawbackVestingAccount(com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount request,
        io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClawbackVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clawback removes the unvested tokens from a ClawbackVestingAccount.
     * </pre>
     */
    public void clawback(com.canto.vesting.v1.TxProto.MsgClawback request,
        io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgClawbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the vesting Msg service.
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
     * CreateClawbackVestingAccount creats a vesting account that is subject to
     * clawback and the configuration of vesting and lockup schedules.
     * </pre>
     */
    public com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse createClawbackVestingAccount(com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClawbackVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clawback removes the unvested tokens from a ClawbackVestingAccount.
     * </pre>
     */
    public com.canto.vesting.v1.TxProto.MsgClawbackResponse clawback(com.canto.vesting.v1.TxProto.MsgClawback request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClawbackMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the vesting Msg service.
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
     * CreateClawbackVestingAccount creats a vesting account that is subject to
     * clawback and the configuration of vesting and lockup schedules.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse> createClawbackVestingAccount(
        com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClawbackVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clawback removes the unvested tokens from a ClawbackVestingAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.vesting.v1.TxProto.MsgClawbackResponse> clawback(
        com.canto.vesting.v1.TxProto.MsgClawback request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClawbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLAWBACK_VESTING_ACCOUNT = 0;
  private static final int METHODID_CLAWBACK = 1;

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
        case METHODID_CREATE_CLAWBACK_VESTING_ACCOUNT:
          serviceImpl.createClawbackVestingAccount((com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount) request,
              (io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse>) responseObserver);
          break;
        case METHODID_CLAWBACK:
          serviceImpl.clawback((com.canto.vesting.v1.TxProto.MsgClawback) request,
              (io.grpc.stub.StreamObserver<com.canto.vesting.v1.TxProto.MsgClawbackResponse>) responseObserver);
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
          getCreateClawbackVestingAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccount,
              com.canto.vesting.v1.TxProto.MsgCreateClawbackVestingAccountResponse>(
                service, METHODID_CREATE_CLAWBACK_VESTING_ACCOUNT)))
        .addMethod(
          getClawbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.vesting.v1.TxProto.MsgClawback,
              com.canto.vesting.v1.TxProto.MsgClawbackResponse>(
                service, METHODID_CLAWBACK)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.vesting.v1.TxProto.getDescriptor();
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
              .addMethod(getCreateClawbackVestingAccountMethod())
              .addMethod(getClawbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
