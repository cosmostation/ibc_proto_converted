package com.panacea.datadeal.v2alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/datadeal/v2alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.datadeal.v2alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal,
      com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> getCreateDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeal",
      requestType = com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal.class,
      responseType = com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal,
      com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> getCreateDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal, com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> getCreateDealMethod;
    if ((getCreateDealMethod = MsgGrpc.getCreateDealMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDealMethod = MsgGrpc.getCreateDealMethod) == null) {
          MsgGrpc.getCreateDealMethod = getCreateDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal, com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDeal"))
              .build();
        }
      }
    }
    return getCreateDealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgSellData,
      com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellData",
      requestType = com.panacea.datadeal.v2alpha1.TxProto.MsgSellData.class,
      responseType = com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgSellData,
      com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgSellData, com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> getSellDataMethod;
    if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
          MsgGrpc.getSellDataMethod = getSellDataMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.TxProto.MsgSellData, com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgSellData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SellData"))
              .build();
        }
      }
    }
    return getSellDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal,
      com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateDeal",
      requestType = com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal.class,
      responseType = com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal,
      com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal, com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod;
    if ((getDeactivateDealMethod = MsgGrpc.getDeactivateDealMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateDealMethod = MsgGrpc.getDeactivateDealMethod) == null) {
          MsgGrpc.getDeactivateDealMethod = getDeactivateDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal, com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateDeal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateDeal"))
              .build();
        }
      }
    }
    return getDeactivateDealMethod;
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
     * <pre>
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    default void createDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDealMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    default void sellData(com.panacea.datadeal.v2alpha1.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating a deal.
     * </pre>
     */
    default void deactivateDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateDealMethod(), responseObserver);
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
     * <pre>
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public void createDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public void sellData(com.panacea.datadeal.v2alpha1.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating a deal.
     * </pre>
     */
    public void deactivateDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateDealMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse createDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse sellData(com.panacea.datadeal.v2alpha1.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating a deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse deactivateDeal(com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateDealMethod(), getCallOptions(), request);
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
     * <pre>
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse> createDeal(
        com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse> sellData(
        com.panacea.datadeal.v2alpha1.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating a deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse> deactivateDeal(
        com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateDealMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEAL = 0;
  private static final int METHODID_SELL_DATA = 1;
  private static final int METHODID_DEACTIVATE_DEAL = 2;

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
        case METHODID_CREATE_DEAL:
          serviceImpl.createDeal((com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse>) responseObserver);
          break;
        case METHODID_SELL_DATA:
          serviceImpl.sellData((com.panacea.datadeal.v2alpha1.TxProto.MsgSellData) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_DEAL:
          serviceImpl.deactivateDeal((com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse>) responseObserver);
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
          getCreateDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDeal,
              com.panacea.datadeal.v2alpha1.TxProto.MsgCreateDealResponse>(
                service, METHODID_CREATE_DEAL)))
        .addMethod(
          getSellDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.TxProto.MsgSellData,
              com.panacea.datadeal.v2alpha1.TxProto.MsgSellDataResponse>(
                service, METHODID_SELL_DATA)))
        .addMethod(
          getDeactivateDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDeal,
              com.panacea.datadeal.v2alpha1.TxProto.MsgDeactivateDealResponse>(
                service, METHODID_DEACTIVATE_DEAL)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datadeal.v2alpha1.TxProto.getDescriptor();
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
              .addMethod(getCreateDealMethod())
              .addMethod(getSellDataMethod())
              .addMethod(getDeactivateDealMethod())
              .build();
        }
      }
    }
    return result;
  }
}
