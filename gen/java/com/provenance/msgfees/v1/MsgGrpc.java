package com.provenance.msgfees.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the msgfees Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: provenance/msgfees/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "provenance.msgfees.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest,
      com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> getAssessCustomMsgFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssessCustomMsgFee",
      requestType = com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest.class,
      responseType = com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest,
      com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> getAssessCustomMsgFeeMethod() {
    io.grpc.MethodDescriptor<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest, com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> getAssessCustomMsgFeeMethod;
    if ((getAssessCustomMsgFeeMethod = MsgGrpc.getAssessCustomMsgFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAssessCustomMsgFeeMethod = MsgGrpc.getAssessCustomMsgFeeMethod) == null) {
          MsgGrpc.getAssessCustomMsgFeeMethod = getAssessCustomMsgFeeMethod =
              io.grpc.MethodDescriptor.<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest, com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssessCustomMsgFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AssessCustomMsgFee"))
              .build();
        }
      }
    }
    return getAssessCustomMsgFeeMethod;
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
   * Msg defines the msgfees Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AssessCustomMsgFee endpoint executes the additional fee charges.
     * This will only emit the event and not persist it to the keeper.  Fees are handled with the custom msg fee handlers
     * Use Case: smart contracts will be able to charge additional fees and direct partial funds to specified recipient
     * for executing contracts
     * </pre>
     */
    default void assessCustomMsgFee(com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssessCustomMsgFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the msgfees Msg service.
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
   * Msg defines the msgfees Msg service.
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
     * AssessCustomMsgFee endpoint executes the additional fee charges.
     * This will only emit the event and not persist it to the keeper.  Fees are handled with the custom msg fee handlers
     * Use Case: smart contracts will be able to charge additional fees and direct partial funds to specified recipient
     * for executing contracts
     * </pre>
     */
    public void assessCustomMsgFee(com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssessCustomMsgFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the msgfees Msg service.
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
     * AssessCustomMsgFee endpoint executes the additional fee charges.
     * This will only emit the event and not persist it to the keeper.  Fees are handled with the custom msg fee handlers
     * Use Case: smart contracts will be able to charge additional fees and direct partial funds to specified recipient
     * for executing contracts
     * </pre>
     */
    public com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse assessCustomMsgFee(com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssessCustomMsgFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the msgfees Msg service.
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
     * AssessCustomMsgFee endpoint executes the additional fee charges.
     * This will only emit the event and not persist it to the keeper.  Fees are handled with the custom msg fee handlers
     * Use Case: smart contracts will be able to charge additional fees and direct partial funds to specified recipient
     * for executing contracts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse> assessCustomMsgFee(
        com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssessCustomMsgFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSESS_CUSTOM_MSG_FEE = 0;

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
        case METHODID_ASSESS_CUSTOM_MSG_FEE:
          serviceImpl.assessCustomMsgFee((com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse>) responseObserver);
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
          getAssessCustomMsgFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeRequest,
              com.provenance.msgfees.v1.TxProto.MsgAssessCustomMsgFeeResponse>(
                service, METHODID_ASSESS_CUSTOM_MSG_FEE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.msgfees.v1.TxProto.getDescriptor();
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
              .addMethod(getAssessCustomMsgFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
