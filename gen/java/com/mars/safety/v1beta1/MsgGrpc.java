package com.mars.safety.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the safety module's Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: mars/safety/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "mars.safety.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mars.safety.v1beta1.MsgSafetyFundSpend,
      com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> getSafetyFundSpendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SafetyFundSpend",
      requestType = com.mars.safety.v1beta1.MsgSafetyFundSpend.class,
      responseType = com.mars.safety.v1beta1.MsgSafetyFundSpendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mars.safety.v1beta1.MsgSafetyFundSpend,
      com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> getSafetyFundSpendMethod() {
    io.grpc.MethodDescriptor<com.mars.safety.v1beta1.MsgSafetyFundSpend, com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> getSafetyFundSpendMethod;
    if ((getSafetyFundSpendMethod = MsgGrpc.getSafetyFundSpendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSafetyFundSpendMethod = MsgGrpc.getSafetyFundSpendMethod) == null) {
          MsgGrpc.getSafetyFundSpendMethod = getSafetyFundSpendMethod =
              io.grpc.MethodDescriptor.<com.mars.safety.v1beta1.MsgSafetyFundSpend, com.mars.safety.v1beta1.MsgSafetyFundSpendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SafetyFundSpend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.safety.v1beta1.MsgSafetyFundSpend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mars.safety.v1beta1.MsgSafetyFundSpendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SafetyFundSpend"))
              .build();
        }
      }
    }
    return getSafetyFundSpendMethod;
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
   * Msg defines the safety module's Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SafetyFundSpend is a governance operation for sending tokens from the
     * safety fund module account to the designated recipient.
     * NOTE: For now, this is just a copy of the distribution module's
     * `CommunityFundSpend` method. The recipient is expected to be a multisig
     * consisting of trusted community members who are respondible for using the
     * funds appropriately to cover any bad debt.
     * In the long term, the goal is that the module
     * is able to detect bad debts incurred in the outposts via interchain query,
     * and automatically dispense the appropriate amount of funds, without having
     * to go through the governance process.
     * </pre>
     */
    default void safetyFundSpend(com.mars.safety.v1beta1.MsgSafetyFundSpend request,
        io.grpc.stub.StreamObserver<com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSafetyFundSpendMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the safety module's Msg service
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
   * Msg defines the safety module's Msg service
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
     * SafetyFundSpend is a governance operation for sending tokens from the
     * safety fund module account to the designated recipient.
     * NOTE: For now, this is just a copy of the distribution module's
     * `CommunityFundSpend` method. The recipient is expected to be a multisig
     * consisting of trusted community members who are respondible for using the
     * funds appropriately to cover any bad debt.
     * In the long term, the goal is that the module
     * is able to detect bad debts incurred in the outposts via interchain query,
     * and automatically dispense the appropriate amount of funds, without having
     * to go through the governance process.
     * </pre>
     */
    public void safetyFundSpend(com.mars.safety.v1beta1.MsgSafetyFundSpend request,
        io.grpc.stub.StreamObserver<com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSafetyFundSpendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the safety module's Msg service
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
     * SafetyFundSpend is a governance operation for sending tokens from the
     * safety fund module account to the designated recipient.
     * NOTE: For now, this is just a copy of the distribution module's
     * `CommunityFundSpend` method. The recipient is expected to be a multisig
     * consisting of trusted community members who are respondible for using the
     * funds appropriately to cover any bad debt.
     * In the long term, the goal is that the module
     * is able to detect bad debts incurred in the outposts via interchain query,
     * and automatically dispense the appropriate amount of funds, without having
     * to go through the governance process.
     * </pre>
     */
    public com.mars.safety.v1beta1.MsgSafetyFundSpendResponse safetyFundSpend(com.mars.safety.v1beta1.MsgSafetyFundSpend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSafetyFundSpendMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the safety module's Msg service
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
     * SafetyFundSpend is a governance operation for sending tokens from the
     * safety fund module account to the designated recipient.
     * NOTE: For now, this is just a copy of the distribution module's
     * `CommunityFundSpend` method. The recipient is expected to be a multisig
     * consisting of trusted community members who are respondible for using the
     * funds appropriately to cover any bad debt.
     * In the long term, the goal is that the module
     * is able to detect bad debts incurred in the outposts via interchain query,
     * and automatically dispense the appropriate amount of funds, without having
     * to go through the governance process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mars.safety.v1beta1.MsgSafetyFundSpendResponse> safetyFundSpend(
        com.mars.safety.v1beta1.MsgSafetyFundSpend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSafetyFundSpendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAFETY_FUND_SPEND = 0;

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
        case METHODID_SAFETY_FUND_SPEND:
          serviceImpl.safetyFundSpend((com.mars.safety.v1beta1.MsgSafetyFundSpend) request,
              (io.grpc.stub.StreamObserver<com.mars.safety.v1beta1.MsgSafetyFundSpendResponse>) responseObserver);
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
          getSafetyFundSpendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mars.safety.v1beta1.MsgSafetyFundSpend,
              com.mars.safety.v1beta1.MsgSafetyFundSpendResponse>(
                service, METHODID_SAFETY_FUND_SPEND)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mars.safety.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getSafetyFundSpendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
