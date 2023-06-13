package com.panacea.oracle.v2alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: panacea/oracle/v2alpha2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "panacea.oracle.v2alpha2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle,
      com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterOracle",
      requestType = com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle.class,
      responseType = com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle,
      com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle, com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> getRegisterOracleMethod;
    if ((getRegisterOracleMethod = MsgGrpc.getRegisterOracleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterOracleMethod = MsgGrpc.getRegisterOracleMethod) == null) {
          MsgGrpc.getRegisterOracleMethod = getRegisterOracleMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle, com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterOracle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterOracle"))
              .build();
        }
      }
    }
    return getRegisterOracleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration,
      com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> getVoteOracleRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteOracleRegistration",
      requestType = com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration.class,
      responseType = com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration,
      com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> getVoteOracleRegistrationMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration, com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> getVoteOracleRegistrationMethod;
    if ((getVoteOracleRegistrationMethod = MsgGrpc.getVoteOracleRegistrationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteOracleRegistrationMethod = MsgGrpc.getVoteOracleRegistrationMethod) == null) {
          MsgGrpc.getVoteOracleRegistrationMethod = getVoteOracleRegistrationMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration, com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteOracleRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteOracleRegistration"))
              .build();
        }
      }
    }
    return getVoteOracleRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle,
      com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> getUpgradeOracleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeOracle",
      requestType = com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle.class,
      responseType = com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle,
      com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> getUpgradeOracleMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle, com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> getUpgradeOracleMethod;
    if ((getUpgradeOracleMethod = MsgGrpc.getUpgradeOracleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpgradeOracleMethod = MsgGrpc.getUpgradeOracleMethod) == null) {
          MsgGrpc.getUpgradeOracleMethod = getUpgradeOracleMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle, com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradeOracle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpgradeOracle"))
              .build();
        }
      }
    }
    return getUpgradeOracleMethod;
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
    default void registerOracle(com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterOracleMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteOracleRegistration  defines a method for voting registration of oracle.
     * </pre>
     */
    default void voteOracleRegistration(com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteOracleRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpgradeOracle defines a method for upgrade of oracle.
     * </pre>
     */
    default void upgradeOracle(com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpgradeOracleMethod(), responseObserver);
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
    public void registerOracle(com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterOracleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteOracleRegistration  defines a method for voting registration of oracle.
     * </pre>
     */
    public void voteOracleRegistration(com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteOracleRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpgradeOracle defines a method for upgrade of oracle.
     * </pre>
     */
    public void upgradeOracle(com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpgradeOracleMethod(), getCallOptions()), request, responseObserver);
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
    public com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse registerOracle(com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterOracleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteOracleRegistration  defines a method for voting registration of oracle.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse voteOracleRegistration(com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteOracleRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpgradeOracle defines a method for upgrade of oracle.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse upgradeOracle(com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradeOracleMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse> registerOracle(
        com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterOracleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteOracleRegistration  defines a method for voting registration of oracle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse> voteOracleRegistration(
        com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteOracleRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpgradeOracle defines a method for upgrade of oracle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse> upgradeOracle(
        com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpgradeOracleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORACLE = 0;
  private static final int METHODID_VOTE_ORACLE_REGISTRATION = 1;
  private static final int METHODID_UPGRADE_ORACLE = 2;

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
          serviceImpl.registerOracle((com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse>) responseObserver);
          break;
        case METHODID_VOTE_ORACLE_REGISTRATION:
          serviceImpl.voteOracleRegistration((com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse>) responseObserver);
          break;
        case METHODID_UPGRADE_ORACLE:
          serviceImpl.upgradeOracle((com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse>) responseObserver);
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
              com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracle,
              com.panacea.oracle.v2alpha2.TxProto.MsgRegisterOracleResponse>(
                service, METHODID_REGISTER_ORACLE)))
        .addMethod(
          getVoteOracleRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistration,
              com.panacea.oracle.v2alpha2.TxProto.MsgVoteOracleRegistrationResponse>(
                service, METHODID_VOTE_ORACLE_REGISTRATION)))
        .addMethod(
          getUpgradeOracleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracle,
              com.panacea.oracle.v2alpha2.TxProto.MsgUpgradeOracleResponse>(
                service, METHODID_UPGRADE_ORACLE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.oracle.v2alpha2.TxProto.getDescriptor();
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
              .addMethod(getRegisterOracleMethod())
              .addMethod(getVoteOracleRegistrationMethod())
              .addMethod(getUpgradeOracleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
