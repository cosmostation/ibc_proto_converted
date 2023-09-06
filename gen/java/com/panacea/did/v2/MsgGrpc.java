package com.panacea.did.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/did/v2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.did.v2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgCreateDID,
      com.panacea.did.v2.TxProto.MsgCreateDIDResponse> getCreateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDID",
      requestType = com.panacea.did.v2.TxProto.MsgCreateDID.class,
      responseType = com.panacea.did.v2.TxProto.MsgCreateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgCreateDID,
      com.panacea.did.v2.TxProto.MsgCreateDIDResponse> getCreateDIDMethod() {
    io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgCreateDID, com.panacea.did.v2.TxProto.MsgCreateDIDResponse> getCreateDIDMethod;
    if ((getCreateDIDMethod = MsgGrpc.getCreateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDIDMethod = MsgGrpc.getCreateDIDMethod) == null) {
          MsgGrpc.getCreateDIDMethod = getCreateDIDMethod =
              io.grpc.MethodDescriptor.<com.panacea.did.v2.TxProto.MsgCreateDID, com.panacea.did.v2.TxProto.MsgCreateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgCreateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgCreateDIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDID"))
              .build();
        }
      }
    }
    return getCreateDIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgUpdateDID,
      com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> getUpdateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDID",
      requestType = com.panacea.did.v2.TxProto.MsgUpdateDID.class,
      responseType = com.panacea.did.v2.TxProto.MsgUpdateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgUpdateDID,
      com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> getUpdateDIDMethod() {
    io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgUpdateDID, com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> getUpdateDIDMethod;
    if ((getUpdateDIDMethod = MsgGrpc.getUpdateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateDIDMethod = MsgGrpc.getUpdateDIDMethod) == null) {
          MsgGrpc.getUpdateDIDMethod = getUpdateDIDMethod =
              io.grpc.MethodDescriptor.<com.panacea.did.v2.TxProto.MsgUpdateDID, com.panacea.did.v2.TxProto.MsgUpdateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgUpdateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgUpdateDIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateDID"))
              .build();
        }
      }
    }
    return getUpdateDIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgDeactivateDID,
      com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> getDeactivateDIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateDID",
      requestType = com.panacea.did.v2.TxProto.MsgDeactivateDID.class,
      responseType = com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgDeactivateDID,
      com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> getDeactivateDIDMethod() {
    io.grpc.MethodDescriptor<com.panacea.did.v2.TxProto.MsgDeactivateDID, com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> getDeactivateDIDMethod;
    if ((getDeactivateDIDMethod = MsgGrpc.getDeactivateDIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateDIDMethod = MsgGrpc.getDeactivateDIDMethod) == null) {
          MsgGrpc.getDeactivateDIDMethod = getDeactivateDIDMethod =
              io.grpc.MethodDescriptor.<com.panacea.did.v2.TxProto.MsgDeactivateDID, com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateDID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgDeactivateDID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateDID"))
              .build();
        }
      }
    }
    return getDeactivateDIDMethod;
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
     * CreateDID defines a method for creating a DID.
     * </pre>
     */
    default void createDID(com.panacea.did.v2.TxProto.MsgCreateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgCreateDIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDID defines a method for updating a DID.
     * </pre>
     */
    default void updateDID(com.panacea.did.v2.TxProto.MsgUpdateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeactivateDID defines a method for deactivating a DID.
     * </pre>
     */
    default void deactivateDID(com.panacea.did.v2.TxProto.MsgDeactivateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateDIDMethod(), responseObserver);
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
     * CreateDID defines a method for creating a DID.
     * </pre>
     */
    public void createDID(com.panacea.did.v2.TxProto.MsgCreateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgCreateDIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDID defines a method for updating a DID.
     * </pre>
     */
    public void updateDID(com.panacea.did.v2.TxProto.MsgUpdateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeactivateDID defines a method for deactivating a DID.
     * </pre>
     */
    public void deactivateDID(com.panacea.did.v2.TxProto.MsgDeactivateDID request,
        io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateDIDMethod(), getCallOptions()), request, responseObserver);
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
     * CreateDID defines a method for creating a DID.
     * </pre>
     */
    public com.panacea.did.v2.TxProto.MsgCreateDIDResponse createDID(com.panacea.did.v2.TxProto.MsgCreateDID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDID defines a method for updating a DID.
     * </pre>
     */
    public com.panacea.did.v2.TxProto.MsgUpdateDIDResponse updateDID(com.panacea.did.v2.TxProto.MsgUpdateDID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeactivateDID defines a method for deactivating a DID.
     * </pre>
     */
    public com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse deactivateDID(com.panacea.did.v2.TxProto.MsgDeactivateDID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateDIDMethod(), getCallOptions(), request);
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
     * CreateDID defines a method for creating a DID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.did.v2.TxProto.MsgCreateDIDResponse> createDID(
        com.panacea.did.v2.TxProto.MsgCreateDID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDID defines a method for updating a DID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.did.v2.TxProto.MsgUpdateDIDResponse> updateDID(
        com.panacea.did.v2.TxProto.MsgUpdateDID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeactivateDID defines a method for deactivating a DID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse> deactivateDID(
        com.panacea.did.v2.TxProto.MsgDeactivateDID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateDIDMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DID = 0;
  private static final int METHODID_UPDATE_DID = 1;
  private static final int METHODID_DEACTIVATE_DID = 2;

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
        case METHODID_CREATE_DID:
          serviceImpl.createDID((com.panacea.did.v2.TxProto.MsgCreateDID) request,
              (io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgCreateDIDResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DID:
          serviceImpl.updateDID((com.panacea.did.v2.TxProto.MsgUpdateDID) request,
              (io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgUpdateDIDResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_DID:
          serviceImpl.deactivateDID((com.panacea.did.v2.TxProto.MsgDeactivateDID) request,
              (io.grpc.stub.StreamObserver<com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse>) responseObserver);
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
          getCreateDIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.did.v2.TxProto.MsgCreateDID,
              com.panacea.did.v2.TxProto.MsgCreateDIDResponse>(
                service, METHODID_CREATE_DID)))
        .addMethod(
          getUpdateDIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.did.v2.TxProto.MsgUpdateDID,
              com.panacea.did.v2.TxProto.MsgUpdateDIDResponse>(
                service, METHODID_UPDATE_DID)))
        .addMethod(
          getDeactivateDIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.did.v2.TxProto.MsgDeactivateDID,
              com.panacea.did.v2.TxProto.MsgDeactivateDIDResponse>(
                service, METHODID_DEACTIVATE_DID)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.did.v2.TxProto.getDescriptor();
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
              .addMethod(getCreateDIDMethod())
              .addMethod(getUpdateDIDMethod())
              .addMethod(getDeactivateDIDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
