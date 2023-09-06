package com.axelar.permission.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the gov Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: axelar/permission/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "axelar.permission.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest,
      com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> getRegisterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterController",
      requestType = com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest.class,
      responseType = com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest,
      com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> getRegisterControllerMethod() {
    io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest, com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> getRegisterControllerMethod;
    if ((getRegisterControllerMethod = MsgGrpc.getRegisterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterControllerMethod = MsgGrpc.getRegisterControllerMethod) == null) {
          MsgGrpc.getRegisterControllerMethod = getRegisterControllerMethod =
              io.grpc.MethodDescriptor.<com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest, com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterController"))
              .build();
        }
      }
    }
    return getRegisterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest,
      com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> getDeregisterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeregisterController",
      requestType = com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest.class,
      responseType = com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest,
      com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> getDeregisterControllerMethod() {
    io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest, com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> getDeregisterControllerMethod;
    if ((getDeregisterControllerMethod = MsgGrpc.getDeregisterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeregisterControllerMethod = MsgGrpc.getDeregisterControllerMethod) == null) {
          MsgGrpc.getDeregisterControllerMethod = getDeregisterControllerMethod =
              io.grpc.MethodDescriptor.<com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest, com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeregisterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeregisterController"))
              .build();
        }
      }
    }
    return getDeregisterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest,
      com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> getUpdateGovernanceKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGovernanceKey",
      requestType = com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest.class,
      responseType = com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest,
      com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> getUpdateGovernanceKeyMethod() {
    io.grpc.MethodDescriptor<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest, com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> getUpdateGovernanceKeyMethod;
    if ((getUpdateGovernanceKeyMethod = MsgGrpc.getUpdateGovernanceKeyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGovernanceKeyMethod = MsgGrpc.getUpdateGovernanceKeyMethod) == null) {
          MsgGrpc.getUpdateGovernanceKeyMethod = getUpdateGovernanceKeyMethod =
              io.grpc.MethodDescriptor.<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest, com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGovernanceKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGovernanceKey"))
              .build();
        }
      }
    }
    return getUpdateGovernanceKeyMethod;
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
   * Msg defines the gov Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void registerController(com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterControllerMethod(), responseObserver);
    }

    /**
     */
    default void deregisterController(com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeregisterControllerMethod(), responseObserver);
    }

    /**
     */
    default void updateGovernanceKey(com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGovernanceKeyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
   * Msg defines the gov Msg service.
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
    public void registerController(com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deregisterController(com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeregisterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGovernanceKey(com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGovernanceKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
    public com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse registerController(com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse deregisterController(com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeregisterControllerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse updateGovernanceKey(com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGovernanceKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the gov Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse> registerController(
        com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse> deregisterController(
        com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeregisterControllerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse> updateGovernanceKey(
        com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGovernanceKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_CONTROLLER = 0;
  private static final int METHODID_DEREGISTER_CONTROLLER = 1;
  private static final int METHODID_UPDATE_GOVERNANCE_KEY = 2;

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
        case METHODID_REGISTER_CONTROLLER:
          serviceImpl.registerController((com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse>) responseObserver);
          break;
        case METHODID_DEREGISTER_CONTROLLER:
          serviceImpl.deregisterController((com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GOVERNANCE_KEY:
          serviceImpl.updateGovernanceKey((com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse>) responseObserver);
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
          getRegisterControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.permission.v1beta1.TxProto.RegisterControllerRequest,
              com.axelar.permission.v1beta1.TxProto.RegisterControllerResponse>(
                service, METHODID_REGISTER_CONTROLLER)))
        .addMethod(
          getDeregisterControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.permission.v1beta1.TxProto.DeregisterControllerRequest,
              com.axelar.permission.v1beta1.TxProto.DeregisterControllerResponse>(
                service, METHODID_DEREGISTER_CONTROLLER)))
        .addMethod(
          getUpdateGovernanceKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyRequest,
              com.axelar.permission.v1beta1.TxProto.UpdateGovernanceKeyResponse>(
                service, METHODID_UPDATE_GOVERNANCE_KEY)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.permission.v1beta1.ServiceProto.getDescriptor();
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
              .addMethod(getRegisterControllerMethod())
              .addMethod(getDeregisterControllerMethod())
              .addMethod(getUpdateGovernanceKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
