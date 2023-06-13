package com.umee.uibc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the x/uibc module's Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: umee/uibc/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "umee.uibc.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovUpdateQuota,
      com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> getGovUpdateQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovUpdateQuota",
      requestType = com.umee.uibc.v1.TxProto.MsgGovUpdateQuota.class,
      responseType = com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovUpdateQuota,
      com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> getGovUpdateQuotaMethod() {
    io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovUpdateQuota, com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> getGovUpdateQuotaMethod;
    if ((getGovUpdateQuotaMethod = MsgGrpc.getGovUpdateQuotaMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovUpdateQuotaMethod = MsgGrpc.getGovUpdateQuotaMethod) == null) {
          MsgGrpc.getGovUpdateQuotaMethod = getGovUpdateQuotaMethod =
              io.grpc.MethodDescriptor.<com.umee.uibc.v1.TxProto.MsgGovUpdateQuota, com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovUpdateQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.uibc.v1.TxProto.MsgGovUpdateQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovUpdateQuota"))
              .build();
        }
      }
    }
    return getGovUpdateQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus,
      com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> getGovSetIBCStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovSetIBCStatus",
      requestType = com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus.class,
      responseType = com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus,
      com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> getGovSetIBCStatusMethod() {
    io.grpc.MethodDescriptor<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus, com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> getGovSetIBCStatusMethod;
    if ((getGovSetIBCStatusMethod = MsgGrpc.getGovSetIBCStatusMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovSetIBCStatusMethod = MsgGrpc.getGovSetIBCStatusMethod) == null) {
          MsgGrpc.getGovSetIBCStatusMethod = getGovSetIBCStatusMethod =
              io.grpc.MethodDescriptor.<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus, com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovSetIBCStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovSetIBCStatus"))
              .build();
        }
      }
    }
    return getGovSetIBCStatusMethod;
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
   * Msg defines the x/uibc module's Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GovUpdateQuota adds new quota for ibc denoms or
     * updates the quota for existed ibc denoms.
     * </pre>
     */
    default void govUpdateQuota(com.umee.uibc.v1.TxProto.MsgGovUpdateQuota request,
        io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovUpdateQuotaMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovSetIBCStatus sets IBC ICS20 status. Must be called by x/gov.
     * </pre>
     */
    default void govSetIBCStatus(com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus request,
        io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovSetIBCStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the x/uibc module's Msg service.
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
   * Msg defines the x/uibc module's Msg service.
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
     * GovUpdateQuota adds new quota for ibc denoms or
     * updates the quota for existed ibc denoms.
     * </pre>
     */
    public void govUpdateQuota(com.umee.uibc.v1.TxProto.MsgGovUpdateQuota request,
        io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovUpdateQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovSetIBCStatus sets IBC ICS20 status. Must be called by x/gov.
     * </pre>
     */
    public void govSetIBCStatus(com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus request,
        io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovSetIBCStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the x/uibc module's Msg service.
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
     * GovUpdateQuota adds new quota for ibc denoms or
     * updates the quota for existed ibc denoms.
     * </pre>
     */
    public com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse govUpdateQuota(com.umee.uibc.v1.TxProto.MsgGovUpdateQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovUpdateQuotaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovSetIBCStatus sets IBC ICS20 status. Must be called by x/gov.
     * </pre>
     */
    public com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse govSetIBCStatus(com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovSetIBCStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the x/uibc module's Msg service.
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
     * GovUpdateQuota adds new quota for ibc denoms or
     * updates the quota for existed ibc denoms.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse> govUpdateQuota(
        com.umee.uibc.v1.TxProto.MsgGovUpdateQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovUpdateQuotaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovSetIBCStatus sets IBC ICS20 status. Must be called by x/gov.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse> govSetIBCStatus(
        com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovSetIBCStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GOV_UPDATE_QUOTA = 0;
  private static final int METHODID_GOV_SET_IBCSTATUS = 1;

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
        case METHODID_GOV_UPDATE_QUOTA:
          serviceImpl.govUpdateQuota((com.umee.uibc.v1.TxProto.MsgGovUpdateQuota) request,
              (io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse>) responseObserver);
          break;
        case METHODID_GOV_SET_IBCSTATUS:
          serviceImpl.govSetIBCStatus((com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus) request,
              (io.grpc.stub.StreamObserver<com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse>) responseObserver);
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
          getGovUpdateQuotaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.uibc.v1.TxProto.MsgGovUpdateQuota,
              com.umee.uibc.v1.TxProto.MsgGovUpdateQuotaResponse>(
                service, METHODID_GOV_UPDATE_QUOTA)))
        .addMethod(
          getGovSetIBCStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.uibc.v1.TxProto.MsgGovSetIBCStatus,
              com.umee.uibc.v1.TxProto.MsgGovSetIBCStatusResponse>(
                service, METHODID_GOV_SET_IBCSTATUS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.uibc.v1.TxProto.getDescriptor();
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
              .addMethod(getGovUpdateQuotaMethod())
              .addMethod(getGovSetIBCStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
