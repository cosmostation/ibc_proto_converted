package com.panacea.oracle.v2alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/oracle/v2alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.oracle.v2alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle,
      com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterOracle",
      requestType = com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle.class,
      responseType = com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle,
      com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle, com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod;
    if ((getRegisterOracleMethod = MsgGrpc.getRegisterOracleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterOracleMethod = MsgGrpc.getRegisterOracleMethod) == null) {
          MsgGrpc.getRegisterOracleMethod = getRegisterOracleMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle, com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterOracle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterOracle"))
              .build();
        }
      }
    }
    return getRegisterOracleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle,
      com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> getUpdateOracleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOracle",
      requestType = com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle.class,
      responseType = com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle,
      com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> getUpdateOracleMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle, com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> getUpdateOracleMethod;
    if ((getUpdateOracleMethod = MsgGrpc.getUpdateOracleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOracleMethod = MsgGrpc.getUpdateOracleMethod) == null) {
          MsgGrpc.getUpdateOracleMethod = getUpdateOracleMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle, com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOracle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOracle"))
              .build();
        }
      }
    }
    return getUpdateOracleMethod;
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
     * RegisterOracle defines a method for registration of oracle.
     * </pre>
     */
    default void registerOracle(com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterOracleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOracle defines a method for updating of oracle.
     * </pre>
     */
    default void updateOracle(com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOracleMethod(), responseObserver);
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
     * RegisterOracle defines a method for registration of oracle.
     * </pre>
     */
    public void registerOracle(com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterOracleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateOracle defines a method for updating of oracle.
     * </pre>
     */
    public void updateOracle(com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOracleMethod(), getCallOptions()), request, responseObserver);
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
     * RegisterOracle defines a method for registration of oracle.
     * </pre>
     */
    public com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse registerOracle(com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterOracleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOracle defines a method for updating of oracle.
     * </pre>
     */
    public com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse updateOracle(com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOracleMethod(), getCallOptions(), request);
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
     * RegisterOracle defines a method for registration of oracle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse> registerOracle(
        com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterOracleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateOracle defines a method for updating of oracle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse> updateOracle(
        com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOracleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORACLE = 0;
  private static final int METHODID_UPDATE_ORACLE = 1;

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
        case METHODID_REGISTER_ORACLE:
          serviceImpl.registerOracle((com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORACLE:
          serviceImpl.updateOracle((com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse>) responseObserver);
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
          getRegisterOracleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracle,
              com.panacea.oracle.v2alpha1.TxProto.MsgRegisterOracleResponse>(
                service, METHODID_REGISTER_ORACLE)))
        .addMethod(
          getUpdateOracleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracle,
              com.panacea.oracle.v2alpha1.TxProto.MsgUpdateOracleResponse>(
                service, METHODID_UPDATE_ORACLE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.oracle.v2alpha1.TxProto.getDescriptor();
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
              .addMethod(getRegisterOracleMethod())
              .addMethod(getUpdateOracleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
