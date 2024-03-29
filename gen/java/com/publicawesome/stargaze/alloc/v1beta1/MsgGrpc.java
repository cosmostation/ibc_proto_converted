package com.publicawesome.stargaze.alloc.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the alloc Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stargaze/alloc/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "publicawesome.stargaze.alloc.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount,
      com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> getCreateVestingAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVestingAccount",
      requestType = com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount.class,
      responseType = com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount,
      com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> getCreateVestingAccountMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount, com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> getCreateVestingAccountMethod;
    if ((getCreateVestingAccountMethod = MsgGrpc.getCreateVestingAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateVestingAccountMethod = MsgGrpc.getCreateVestingAccountMethod) == null) {
          MsgGrpc.getCreateVestingAccountMethod = getCreateVestingAccountMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount, com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVestingAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateVestingAccount"))
              .build();
        }
      }
    }
    return getCreateVestingAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool,
      com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> getFundFairburnPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundFairburnPool",
      requestType = com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool.class,
      responseType = com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool,
      com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> getFundFairburnPoolMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool, com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> getFundFairburnPoolMethod;
    if ((getFundFairburnPoolMethod = MsgGrpc.getFundFairburnPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundFairburnPoolMethod = MsgGrpc.getFundFairburnPoolMethod) == null) {
          MsgGrpc.getFundFairburnPoolMethod = getFundFairburnPoolMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool, com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundFairburnPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundFairburnPool"))
              .build();
        }
      }
    }
    return getFundFairburnPoolMethod;
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
     * <pre>
     * CreateVestingAccount defines a method that enables creating a vesting
     * account.
     * </pre>
     */
    default void createVestingAccount(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVestingAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * FundFairburnPool defines a method to allow an account to directly
     * fund the fee collector module account.
     * </pre>
     */
    default void fundFairburnPool(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFundFairburnPoolMethod(), responseObserver);
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
     * <pre>
     * CreateVestingAccount defines a method that enables creating a vesting
     * account.
     * </pre>
     */
    public void createVestingAccount(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVestingAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FundFairburnPool defines a method to allow an account to directly
     * fund the fee collector module account.
     * </pre>
     */
    public void fundFairburnPool(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFundFairburnPoolMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * CreateVestingAccount defines a method that enables creating a vesting
     * account.
     * </pre>
     */
    public com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse createVestingAccount(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVestingAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FundFairburnPool defines a method to allow an account to directly
     * fund the fee collector module account.
     * </pre>
     */
    public com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse fundFairburnPool(com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFundFairburnPoolMethod(), getCallOptions(), request);
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
     * <pre>
     * CreateVestingAccount defines a method that enables creating a vesting
     * account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse> createVestingAccount(
        com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVestingAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FundFairburnPool defines a method to allow an account to directly
     * fund the fee collector module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse> fundFairburnPool(
        com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFundFairburnPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VESTING_ACCOUNT = 0;
  private static final int METHODID_FUND_FAIRBURN_POOL = 1;

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
        case METHODID_CREATE_VESTING_ACCOUNT:
          serviceImpl.createVestingAccount((com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse>) responseObserver);
          break;
        case METHODID_FUND_FAIRBURN_POOL:
          serviceImpl.fundFairburnPool((com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse>) responseObserver);
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
          getCreateVestingAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccount,
              com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgCreateVestingAccountResponse>(
                service, METHODID_CREATE_VESTING_ACCOUNT)))
        .addMethod(
          getFundFairburnPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPool,
              com.publicawesome.stargaze.alloc.v1beta1.TxProto.MsgFundFairburnPoolResponse>(
                service, METHODID_FUND_FAIRBURN_POOL)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.publicawesome.stargaze.alloc.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateVestingAccountMethod())
              .addMethod(getFundFairburnPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
