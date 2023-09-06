package com.axelar.snapshot.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the snapshot Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: axelar/snapshot/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "axelar.snapshot.v1beta1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest,
      com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> getRegisterProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterProxy",
      requestType = com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest.class,
      responseType = com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest,
      com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> getRegisterProxyMethod() {
    io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest, com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> getRegisterProxyMethod;
    if ((getRegisterProxyMethod = MsgServiceGrpc.getRegisterProxyMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRegisterProxyMethod = MsgServiceGrpc.getRegisterProxyMethod) == null) {
          MsgServiceGrpc.getRegisterProxyMethod = getRegisterProxyMethod =
              io.grpc.MethodDescriptor.<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest, com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RegisterProxy"))
              .build();
        }
      }
    }
    return getRegisterProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest,
      com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> getDeactivateProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateProxy",
      requestType = com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest.class,
      responseType = com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest,
      com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> getDeactivateProxyMethod() {
    io.grpc.MethodDescriptor<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest, com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> getDeactivateProxyMethod;
    if ((getDeactivateProxyMethod = MsgServiceGrpc.getDeactivateProxyMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getDeactivateProxyMethod = MsgServiceGrpc.getDeactivateProxyMethod) == null) {
          MsgServiceGrpc.getDeactivateProxyMethod = getDeactivateProxyMethod =
              io.grpc.MethodDescriptor.<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest, com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("DeactivateProxy"))
              .build();
        }
      }
    }
    return getDeactivateProxyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the snapshot Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RegisterProxy defines a method for registering a proxy account that can act
     * in a validator account's stead.
     * </pre>
     */
    default void registerProxy(com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterProxyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeactivateProxy defines a method for deregistering a proxy account.
     * </pre>
     */
    default void deactivateProxy(com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateProxyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   * <pre>
   * Msg defines the snapshot Msg service.
   * </pre>
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the snapshot Msg service.
   * </pre>
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterProxy defines a method for registering a proxy account that can act
     * in a validator account's stead.
     * </pre>
     */
    public void registerProxy(com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeactivateProxy defines a method for deregistering a proxy account.
     * </pre>
     */
    public void deactivateProxy(com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateProxyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the snapshot Msg service.
   * </pre>
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterProxy defines a method for registering a proxy account that can act
     * in a validator account's stead.
     * </pre>
     */
    public com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse registerProxy(com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterProxyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeactivateProxy defines a method for deregistering a proxy account.
     * </pre>
     */
    public com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse deactivateProxy(com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateProxyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   * <pre>
   * Msg defines the snapshot Msg service.
   * </pre>
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RegisterProxy defines a method for registering a proxy account that can act
     * in a validator account's stead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse> registerProxy(
        com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterProxyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeactivateProxy defines a method for deregistering a proxy account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse> deactivateProxy(
        com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateProxyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PROXY = 0;
  private static final int METHODID_DEACTIVATE_PROXY = 1;

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
        case METHODID_REGISTER_PROXY:
          serviceImpl.registerProxy((com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_PROXY:
          serviceImpl.deactivateProxy((com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse>) responseObserver);
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
          getRegisterProxyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.snapshot.v1beta1.TxProto.RegisterProxyRequest,
              com.axelar.snapshot.v1beta1.TxProto.RegisterProxyResponse>(
                service, METHODID_REGISTER_PROXY)))
        .addMethod(
          getDeactivateProxyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyRequest,
              com.axelar.snapshot.v1beta1.TxProto.DeactivateProxyResponse>(
                service, METHODID_DEACTIVATE_PROXY)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.snapshot.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MsgServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getRegisterProxyMethod())
              .addMethod(getDeactivateProxyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
