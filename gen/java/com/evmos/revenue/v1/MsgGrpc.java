package com.evmos.revenue.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the fees Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: evmos/revenue/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "evmos.revenue.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgRegisterRevenue,
      com.evmos.revenue.v1.MsgRegisterRevenueResponse> getRegisterRevenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterRevenue",
      requestType = com.evmos.revenue.v1.MsgRegisterRevenue.class,
      responseType = com.evmos.revenue.v1.MsgRegisterRevenueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgRegisterRevenue,
      com.evmos.revenue.v1.MsgRegisterRevenueResponse> getRegisterRevenueMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgRegisterRevenue, com.evmos.revenue.v1.MsgRegisterRevenueResponse> getRegisterRevenueMethod;
    if ((getRegisterRevenueMethod = MsgGrpc.getRegisterRevenueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterRevenueMethod = MsgGrpc.getRegisterRevenueMethod) == null) {
          MsgGrpc.getRegisterRevenueMethod = getRegisterRevenueMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.MsgRegisterRevenue, com.evmos.revenue.v1.MsgRegisterRevenueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterRevenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgRegisterRevenue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgRegisterRevenueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterRevenue"))
              .build();
        }
      }
    }
    return getRegisterRevenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateRevenue,
      com.evmos.revenue.v1.MsgUpdateRevenueResponse> getUpdateRevenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRevenue",
      requestType = com.evmos.revenue.v1.MsgUpdateRevenue.class,
      responseType = com.evmos.revenue.v1.MsgUpdateRevenueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateRevenue,
      com.evmos.revenue.v1.MsgUpdateRevenueResponse> getUpdateRevenueMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateRevenue, com.evmos.revenue.v1.MsgUpdateRevenueResponse> getUpdateRevenueMethod;
    if ((getUpdateRevenueMethod = MsgGrpc.getUpdateRevenueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRevenueMethod = MsgGrpc.getUpdateRevenueMethod) == null) {
          MsgGrpc.getUpdateRevenueMethod = getUpdateRevenueMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.MsgUpdateRevenue, com.evmos.revenue.v1.MsgUpdateRevenueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRevenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgUpdateRevenue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgUpdateRevenueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRevenue"))
              .build();
        }
      }
    }
    return getUpdateRevenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgCancelRevenue,
      com.evmos.revenue.v1.MsgCancelRevenueResponse> getCancelRevenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelRevenue",
      requestType = com.evmos.revenue.v1.MsgCancelRevenue.class,
      responseType = com.evmos.revenue.v1.MsgCancelRevenueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgCancelRevenue,
      com.evmos.revenue.v1.MsgCancelRevenueResponse> getCancelRevenueMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgCancelRevenue, com.evmos.revenue.v1.MsgCancelRevenueResponse> getCancelRevenueMethod;
    if ((getCancelRevenueMethod = MsgGrpc.getCancelRevenueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelRevenueMethod = MsgGrpc.getCancelRevenueMethod) == null) {
          MsgGrpc.getCancelRevenueMethod = getCancelRevenueMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.MsgCancelRevenue, com.evmos.revenue.v1.MsgCancelRevenueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelRevenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgCancelRevenue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgCancelRevenueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelRevenue"))
              .build();
        }
      }
    }
    return getCancelRevenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateParams,
      com.evmos.revenue.v1.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.evmos.revenue.v1.MsgUpdateParams.class,
      responseType = com.evmos.revenue.v1.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateParams,
      com.evmos.revenue.v1.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.evmos.revenue.v1.MsgUpdateParams, com.evmos.revenue.v1.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.evmos.revenue.v1.MsgUpdateParams, com.evmos.revenue.v1.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.revenue.v1.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
   * Msg defines the fees Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RegisterRevenue registers a new contract for receiving transaction fees
     * </pre>
     */
    default void registerRevenue(com.evmos.revenue.v1.MsgRegisterRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgRegisterRevenueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterRevenueMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRevenue updates the withdrawer address of a revenue
     * </pre>
     */
    default void updateRevenue(com.evmos.revenue.v1.MsgUpdateRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateRevenueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRevenueMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelRevenue cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    default void cancelRevenue(com.evmos.revenue.v1.MsgCancelRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgCancelRevenueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelRevenueMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/revenue module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    default void updateParams(com.evmos.revenue.v1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
   * Msg defines the fees Msg service.
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
     * RegisterRevenue registers a new contract for receiving transaction fees
     * </pre>
     */
    public void registerRevenue(com.evmos.revenue.v1.MsgRegisterRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgRegisterRevenueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterRevenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRevenue updates the withdrawer address of a revenue
     * </pre>
     */
    public void updateRevenue(com.evmos.revenue.v1.MsgUpdateRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateRevenueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRevenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelRevenue cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public void cancelRevenue(com.evmos.revenue.v1.MsgCancelRevenue request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgCancelRevenueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelRevenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/revenue module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public void updateParams(com.evmos.revenue.v1.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterRevenue registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.evmos.revenue.v1.MsgRegisterRevenueResponse registerRevenue(com.evmos.revenue.v1.MsgRegisterRevenue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterRevenueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRevenue updates the withdrawer address of a revenue
     * </pre>
     */
    public com.evmos.revenue.v1.MsgUpdateRevenueResponse updateRevenue(com.evmos.revenue.v1.MsgUpdateRevenue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRevenueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelRevenue cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public com.evmos.revenue.v1.MsgCancelRevenueResponse cancelRevenue(com.evmos.revenue.v1.MsgCancelRevenue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelRevenueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/revenue module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.evmos.revenue.v1.MsgUpdateParamsResponse updateParams(com.evmos.revenue.v1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the fees Msg service.
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
     * RegisterRevenue registers a new contract for receiving transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.MsgRegisterRevenueResponse> registerRevenue(
        com.evmos.revenue.v1.MsgRegisterRevenue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterRevenueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRevenue updates the withdrawer address of a revenue
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.MsgUpdateRevenueResponse> updateRevenue(
        com.evmos.revenue.v1.MsgUpdateRevenue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRevenueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelRevenue cancels a contract's fee registration and further receival
     * of transaction fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.MsgCancelRevenueResponse> cancelRevenue(
        com.evmos.revenue.v1.MsgCancelRevenue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelRevenueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/revenue module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.revenue.v1.MsgUpdateParamsResponse> updateParams(
        com.evmos.revenue.v1.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_REVENUE = 0;
  private static final int METHODID_UPDATE_REVENUE = 1;
  private static final int METHODID_CANCEL_REVENUE = 2;
  private static final int METHODID_UPDATE_PARAMS = 3;

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
        case METHODID_REGISTER_REVENUE:
          serviceImpl.registerRevenue((com.evmos.revenue.v1.MsgRegisterRevenue) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgRegisterRevenueResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REVENUE:
          serviceImpl.updateRevenue((com.evmos.revenue.v1.MsgUpdateRevenue) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateRevenueResponse>) responseObserver);
          break;
        case METHODID_CANCEL_REVENUE:
          serviceImpl.cancelRevenue((com.evmos.revenue.v1.MsgCancelRevenue) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgCancelRevenueResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.evmos.revenue.v1.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.evmos.revenue.v1.MsgUpdateParamsResponse>) responseObserver);
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
          getRegisterRevenueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.MsgRegisterRevenue,
              com.evmos.revenue.v1.MsgRegisterRevenueResponse>(
                service, METHODID_REGISTER_REVENUE)))
        .addMethod(
          getUpdateRevenueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.MsgUpdateRevenue,
              com.evmos.revenue.v1.MsgUpdateRevenueResponse>(
                service, METHODID_UPDATE_REVENUE)))
        .addMethod(
          getCancelRevenueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.MsgCancelRevenue,
              com.evmos.revenue.v1.MsgCancelRevenueResponse>(
                service, METHODID_CANCEL_REVENUE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.revenue.v1.MsgUpdateParams,
              com.evmos.revenue.v1.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evmos.revenue.v1.TxProto.getDescriptor();
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
              .addMethod(getRegisterRevenueMethod())
              .addMethod(getUpdateRevenueMethod())
              .addMethod(getCancelRevenueMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
