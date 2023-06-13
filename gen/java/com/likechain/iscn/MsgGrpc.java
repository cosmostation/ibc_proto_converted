package com.likechain.iscn;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the bank Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: likechain/iscn/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "likechain.iscn.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgCreateIscnRecord,
      com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> getCreateIscnRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIscnRecord",
      requestType = com.likechain.iscn.TxProto.MsgCreateIscnRecord.class,
      responseType = com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgCreateIscnRecord,
      com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> getCreateIscnRecordMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgCreateIscnRecord, com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> getCreateIscnRecordMethod;
    if ((getCreateIscnRecordMethod = MsgGrpc.getCreateIscnRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateIscnRecordMethod = MsgGrpc.getCreateIscnRecordMethod) == null) {
          MsgGrpc.getCreateIscnRecordMethod = getCreateIscnRecordMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.TxProto.MsgCreateIscnRecord, com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIscnRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgCreateIscnRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateIscnRecord"))
              .build();
        }
      }
    }
    return getCreateIscnRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgUpdateIscnRecord,
      com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> getUpdateIscnRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIscnRecord",
      requestType = com.likechain.iscn.TxProto.MsgUpdateIscnRecord.class,
      responseType = com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgUpdateIscnRecord,
      com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> getUpdateIscnRecordMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgUpdateIscnRecord, com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> getUpdateIscnRecordMethod;
    if ((getUpdateIscnRecordMethod = MsgGrpc.getUpdateIscnRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateIscnRecordMethod = MsgGrpc.getUpdateIscnRecordMethod) == null) {
          MsgGrpc.getUpdateIscnRecordMethod = getUpdateIscnRecordMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.TxProto.MsgUpdateIscnRecord, com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIscnRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgUpdateIscnRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateIscnRecord"))
              .build();
        }
      }
    }
    return getUpdateIscnRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership,
      com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> getChangeIscnRecordOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeIscnRecordOwnership",
      requestType = com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership.class,
      responseType = com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership,
      com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> getChangeIscnRecordOwnershipMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership, com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> getChangeIscnRecordOwnershipMethod;
    if ((getChangeIscnRecordOwnershipMethod = MsgGrpc.getChangeIscnRecordOwnershipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeIscnRecordOwnershipMethod = MsgGrpc.getChangeIscnRecordOwnershipMethod) == null) {
          MsgGrpc.getChangeIscnRecordOwnershipMethod = getChangeIscnRecordOwnershipMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership, com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeIscnRecordOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeIscnRecordOwnership"))
              .build();
        }
      }
    }
    return getChangeIscnRecordOwnershipMethod;
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
     * CreateIscnRecord defines a method to create ISCN metadata
     * </pre>
     */
    default void createIscnRecord(com.likechain.iscn.TxProto.MsgCreateIscnRecord request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIscnRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateIscnRecord defines a method to update existing ISCN metadata
     * </pre>
     */
    default void updateIscnRecord(com.likechain.iscn.TxProto.MsgUpdateIscnRecord request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIscnRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
     * </pre>
     */
    default void changeIscnRecordOwnership(com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeIscnRecordOwnershipMethod(), responseObserver);
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
     * CreateIscnRecord defines a method to create ISCN metadata
     * </pre>
     */
    public void createIscnRecord(com.likechain.iscn.TxProto.MsgCreateIscnRecord request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIscnRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateIscnRecord defines a method to update existing ISCN metadata
     * </pre>
     */
    public void updateIscnRecord(com.likechain.iscn.TxProto.MsgUpdateIscnRecord request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIscnRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
     * </pre>
     */
    public void changeIscnRecordOwnership(com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeIscnRecordOwnershipMethod(), getCallOptions()), request, responseObserver);
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
     * CreateIscnRecord defines a method to create ISCN metadata
     * </pre>
     */
    public com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse createIscnRecord(com.likechain.iscn.TxProto.MsgCreateIscnRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIscnRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateIscnRecord defines a method to update existing ISCN metadata
     * </pre>
     */
    public com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse updateIscnRecord(com.likechain.iscn.TxProto.MsgUpdateIscnRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIscnRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
     * </pre>
     */
    public com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse changeIscnRecordOwnership(com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeIscnRecordOwnershipMethod(), getCallOptions(), request);
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
     * CreateIscnRecord defines a method to create ISCN metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse> createIscnRecord(
        com.likechain.iscn.TxProto.MsgCreateIscnRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIscnRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateIscnRecord defines a method to update existing ISCN metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse> updateIscnRecord(
        com.likechain.iscn.TxProto.MsgUpdateIscnRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIscnRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse> changeIscnRecordOwnership(
        com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeIscnRecordOwnershipMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ISCN_RECORD = 0;
  private static final int METHODID_UPDATE_ISCN_RECORD = 1;
  private static final int METHODID_CHANGE_ISCN_RECORD_OWNERSHIP = 2;

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
        case METHODID_CREATE_ISCN_RECORD:
          serviceImpl.createIscnRecord((com.likechain.iscn.TxProto.MsgCreateIscnRecord) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ISCN_RECORD:
          serviceImpl.updateIscnRecord((com.likechain.iscn.TxProto.MsgUpdateIscnRecord) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ISCN_RECORD_OWNERSHIP:
          serviceImpl.changeIscnRecordOwnership((com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse>) responseObserver);
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
          getCreateIscnRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.TxProto.MsgCreateIscnRecord,
              com.likechain.iscn.TxProto.MsgCreateIscnRecordResponse>(
                service, METHODID_CREATE_ISCN_RECORD)))
        .addMethod(
          getUpdateIscnRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.TxProto.MsgUpdateIscnRecord,
              com.likechain.iscn.TxProto.MsgUpdateIscnRecordResponse>(
                service, METHODID_UPDATE_ISCN_RECORD)))
        .addMethod(
          getChangeIscnRecordOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnership,
              com.likechain.iscn.TxProto.MsgChangeIscnRecordOwnershipResponse>(
                service, METHODID_CHANGE_ISCN_RECORD_OWNERSHIP)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.likechain.iscn.TxProto.getDescriptor();
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
              .addMethod(getCreateIscnRecordMethod())
              .addMethod(getUpdateIscnRecordMethod())
              .addMethod(getChangeIscnRecordOwnershipMethod())
              .build();
        }
      }
    }
    return result;
  }
}
