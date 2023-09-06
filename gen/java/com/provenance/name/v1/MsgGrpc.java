package com.provenance.name.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the bank Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/name/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.name.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgBindNameRequest,
      com.provenance.name.v1.TxProto.MsgBindNameResponse> getBindNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindName",
      requestType = com.provenance.name.v1.TxProto.MsgBindNameRequest.class,
      responseType = com.provenance.name.v1.TxProto.MsgBindNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgBindNameRequest,
      com.provenance.name.v1.TxProto.MsgBindNameResponse> getBindNameMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgBindNameRequest, com.provenance.name.v1.TxProto.MsgBindNameResponse> getBindNameMethod;
    if ((getBindNameMethod = MsgGrpc.getBindNameMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindNameMethod = MsgGrpc.getBindNameMethod) == null) {
          MsgGrpc.getBindNameMethod = getBindNameMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.TxProto.MsgBindNameRequest, com.provenance.name.v1.TxProto.MsgBindNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgBindNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgBindNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindName"))
              .build();
        }
      }
    }
    return getBindNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgDeleteNameRequest,
      com.provenance.name.v1.TxProto.MsgDeleteNameResponse> getDeleteNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteName",
      requestType = com.provenance.name.v1.TxProto.MsgDeleteNameRequest.class,
      responseType = com.provenance.name.v1.TxProto.MsgDeleteNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgDeleteNameRequest,
      com.provenance.name.v1.TxProto.MsgDeleteNameResponse> getDeleteNameMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgDeleteNameRequest, com.provenance.name.v1.TxProto.MsgDeleteNameResponse> getDeleteNameMethod;
    if ((getDeleteNameMethod = MsgGrpc.getDeleteNameMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteNameMethod = MsgGrpc.getDeleteNameMethod) == null) {
          MsgGrpc.getDeleteNameMethod = getDeleteNameMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.TxProto.MsgDeleteNameRequest, com.provenance.name.v1.TxProto.MsgDeleteNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgDeleteNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgDeleteNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteName"))
              .build();
        }
      }
    }
    return getDeleteNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgModifyNameRequest,
      com.provenance.name.v1.TxProto.MsgModifyNameResponse> getModifyNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyName",
      requestType = com.provenance.name.v1.TxProto.MsgModifyNameRequest.class,
      responseType = com.provenance.name.v1.TxProto.MsgModifyNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgModifyNameRequest,
      com.provenance.name.v1.TxProto.MsgModifyNameResponse> getModifyNameMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgModifyNameRequest, com.provenance.name.v1.TxProto.MsgModifyNameResponse> getModifyNameMethod;
    if ((getModifyNameMethod = MsgGrpc.getModifyNameMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getModifyNameMethod = MsgGrpc.getModifyNameMethod) == null) {
          MsgGrpc.getModifyNameMethod = getModifyNameMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.TxProto.MsgModifyNameRequest, com.provenance.name.v1.TxProto.MsgModifyNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgModifyNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgModifyNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ModifyName"))
              .build();
        }
      }
    }
    return getModifyNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgCreateRootNameRequest,
      com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> getCreateRootNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRootName",
      requestType = com.provenance.name.v1.TxProto.MsgCreateRootNameRequest.class,
      responseType = com.provenance.name.v1.TxProto.MsgCreateRootNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgCreateRootNameRequest,
      com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> getCreateRootNameMethod() {
    io.grpc.MethodDescriptor<com.provenance.name.v1.TxProto.MsgCreateRootNameRequest, com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> getCreateRootNameMethod;
    if ((getCreateRootNameMethod = MsgGrpc.getCreateRootNameMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateRootNameMethod = MsgGrpc.getCreateRootNameMethod) == null) {
          MsgGrpc.getCreateRootNameMethod = getCreateRootNameMethod =
              io.grpc.MethodDescriptor.<com.provenance.name.v1.TxProto.MsgCreateRootNameRequest, com.provenance.name.v1.TxProto.MsgCreateRootNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRootName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgCreateRootNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.name.v1.TxProto.MsgCreateRootNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateRootName"))
              .build();
        }
      }
    }
    return getCreateRootNameMethod;
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
   * Msg defines the bank Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * BindName binds a name to an address under a root name.
     * </pre>
     */
    default void bindName(com.provenance.name.v1.TxProto.MsgBindNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgBindNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteName defines a method to verify a particular invariance.
     * </pre>
     */
    default void deleteName(com.provenance.name.v1.TxProto.MsgDeleteNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgDeleteNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * ModifyName defines a method to modify the attributes of an existing name.
     * </pre>
     */
    default void modifyName(com.provenance.name.v1.TxProto.MsgModifyNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgModifyNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateRootName defines a governance method for creating a root name.
     * </pre>
     */
    default void createRootName(com.provenance.name.v1.TxProto.MsgCreateRootNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRootNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the bank Msg service.
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
   * Msg defines the bank Msg service.
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
     * BindName binds a name to an address under a root name.
     * </pre>
     */
    public void bindName(com.provenance.name.v1.TxProto.MsgBindNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgBindNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteName defines a method to verify a particular invariance.
     * </pre>
     */
    public void deleteName(com.provenance.name.v1.TxProto.MsgDeleteNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgDeleteNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ModifyName defines a method to modify the attributes of an existing name.
     * </pre>
     */
    public void modifyName(com.provenance.name.v1.TxProto.MsgModifyNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgModifyNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateRootName defines a governance method for creating a root name.
     * </pre>
     */
    public void createRootName(com.provenance.name.v1.TxProto.MsgCreateRootNameRequest request,
        io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRootNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the bank Msg service.
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
     * BindName binds a name to an address under a root name.
     * </pre>
     */
    public com.provenance.name.v1.TxProto.MsgBindNameResponse bindName(com.provenance.name.v1.TxProto.MsgBindNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteName defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.name.v1.TxProto.MsgDeleteNameResponse deleteName(com.provenance.name.v1.TxProto.MsgDeleteNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ModifyName defines a method to modify the attributes of an existing name.
     * </pre>
     */
    public com.provenance.name.v1.TxProto.MsgModifyNameResponse modifyName(com.provenance.name.v1.TxProto.MsgModifyNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateRootName defines a governance method for creating a root name.
     * </pre>
     */
    public com.provenance.name.v1.TxProto.MsgCreateRootNameResponse createRootName(com.provenance.name.v1.TxProto.MsgCreateRootNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRootNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the bank Msg service.
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
     * BindName binds a name to an address under a root name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.TxProto.MsgBindNameResponse> bindName(
        com.provenance.name.v1.TxProto.MsgBindNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteName defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.TxProto.MsgDeleteNameResponse> deleteName(
        com.provenance.name.v1.TxProto.MsgDeleteNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ModifyName defines a method to modify the attributes of an existing name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.TxProto.MsgModifyNameResponse> modifyName(
        com.provenance.name.v1.TxProto.MsgModifyNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateRootName defines a governance method for creating a root name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.name.v1.TxProto.MsgCreateRootNameResponse> createRootName(
        com.provenance.name.v1.TxProto.MsgCreateRootNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRootNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BIND_NAME = 0;
  private static final int METHODID_DELETE_NAME = 1;
  private static final int METHODID_MODIFY_NAME = 2;
  private static final int METHODID_CREATE_ROOT_NAME = 3;

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
        case METHODID_BIND_NAME:
          serviceImpl.bindName((com.provenance.name.v1.TxProto.MsgBindNameRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgBindNameResponse>) responseObserver);
          break;
        case METHODID_DELETE_NAME:
          serviceImpl.deleteName((com.provenance.name.v1.TxProto.MsgDeleteNameRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgDeleteNameResponse>) responseObserver);
          break;
        case METHODID_MODIFY_NAME:
          serviceImpl.modifyName((com.provenance.name.v1.TxProto.MsgModifyNameRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgModifyNameResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROOT_NAME:
          serviceImpl.createRootName((com.provenance.name.v1.TxProto.MsgCreateRootNameRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.name.v1.TxProto.MsgCreateRootNameResponse>) responseObserver);
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
          getBindNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.TxProto.MsgBindNameRequest,
              com.provenance.name.v1.TxProto.MsgBindNameResponse>(
                service, METHODID_BIND_NAME)))
        .addMethod(
          getDeleteNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.TxProto.MsgDeleteNameRequest,
              com.provenance.name.v1.TxProto.MsgDeleteNameResponse>(
                service, METHODID_DELETE_NAME)))
        .addMethod(
          getModifyNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.TxProto.MsgModifyNameRequest,
              com.provenance.name.v1.TxProto.MsgModifyNameResponse>(
                service, METHODID_MODIFY_NAME)))
        .addMethod(
          getCreateRootNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.name.v1.TxProto.MsgCreateRootNameRequest,
              com.provenance.name.v1.TxProto.MsgCreateRootNameResponse>(
                service, METHODID_CREATE_ROOT_NAME)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.name.v1.TxProto.getDescriptor();
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
              .addMethod(getBindNameMethod())
              .addMethod(getDeleteNameMethod())
              .addMethod(getModifyNameMethod())
              .addMethod(getCreateRootNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
