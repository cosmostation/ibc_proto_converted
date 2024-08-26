package com.babylon.finality.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: babylon/finality/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "babylon.finality.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgCommitPubRandList,
      com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> getCommitPubRandListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitPubRandList",
      requestType = com.babylon.finality.v1.TxProto.MsgCommitPubRandList.class,
      responseType = com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgCommitPubRandList,
      com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> getCommitPubRandListMethod() {
    io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgCommitPubRandList, com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> getCommitPubRandListMethod;
    if ((getCommitPubRandListMethod = MsgGrpc.getCommitPubRandListMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCommitPubRandListMethod = MsgGrpc.getCommitPubRandListMethod) == null) {
          MsgGrpc.getCommitPubRandListMethod = getCommitPubRandListMethod =
              io.grpc.MethodDescriptor.<com.babylon.finality.v1.TxProto.MsgCommitPubRandList, com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommitPubRandList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgCommitPubRandList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CommitPubRandList"))
              .build();
        }
      }
    }
    return getCommitPubRandListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgAddFinalitySig,
      com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> getAddFinalitySigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFinalitySig",
      requestType = com.babylon.finality.v1.TxProto.MsgAddFinalitySig.class,
      responseType = com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgAddFinalitySig,
      com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> getAddFinalitySigMethod() {
    io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgAddFinalitySig, com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> getAddFinalitySigMethod;
    if ((getAddFinalitySigMethod = MsgGrpc.getAddFinalitySigMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddFinalitySigMethod = MsgGrpc.getAddFinalitySigMethod) == null) {
          MsgGrpc.getAddFinalitySigMethod = getAddFinalitySigMethod =
              io.grpc.MethodDescriptor.<com.babylon.finality.v1.TxProto.MsgAddFinalitySig, com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFinalitySig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgAddFinalitySig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddFinalitySig"))
              .build();
        }
      }
    }
    return getAddFinalitySigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgUpdateParams,
      com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.babylon.finality.v1.TxProto.MsgUpdateParams.class,
      responseType = com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgUpdateParams,
      com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.babylon.finality.v1.TxProto.MsgUpdateParams, com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.babylon.finality.v1.TxProto.MsgUpdateParams, com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CommitPubRandList commits a list of public randomness for EOTS
     * </pre>
     */
    default void commitPubRandList(com.babylon.finality.v1.TxProto.MsgCommitPubRandList request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitPubRandListMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddFinalitySig adds a finality signature to a given block
     * </pre>
     */
    default void addFinalitySig(com.babylon.finality.v1.TxProto.MsgAddFinalitySig request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFinalitySigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO: msg for evidence of equivocation. this is not specified yet
     * UpdateParams updates the finality module parameters.
     * </pre>
     */
    default void updateParams(com.babylon.finality.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
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
     * CommitPubRandList commits a list of public randomness for EOTS
     * </pre>
     */
    public void commitPubRandList(com.babylon.finality.v1.TxProto.MsgCommitPubRandList request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitPubRandListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddFinalitySig adds a finality signature to a given block
     * </pre>
     */
    public void addFinalitySig(com.babylon.finality.v1.TxProto.MsgAddFinalitySig request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFinalitySigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: msg for evidence of equivocation. this is not specified yet
     * UpdateParams updates the finality module parameters.
     * </pre>
     */
    public void updateParams(com.babylon.finality.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
     * CommitPubRandList commits a list of public randomness for EOTS
     * </pre>
     */
    public com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse commitPubRandList(com.babylon.finality.v1.TxProto.MsgCommitPubRandList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitPubRandListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddFinalitySig adds a finality signature to a given block
     * </pre>
     */
    public com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse addFinalitySig(com.babylon.finality.v1.TxProto.MsgAddFinalitySig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFinalitySigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: msg for evidence of equivocation. this is not specified yet
     * UpdateParams updates the finality module parameters.
     * </pre>
     */
    public com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse updateParams(com.babylon.finality.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
     * CommitPubRandList commits a list of public randomness for EOTS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse> commitPubRandList(
        com.babylon.finality.v1.TxProto.MsgCommitPubRandList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitPubRandListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddFinalitySig adds a finality signature to a given block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse> addFinalitySig(
        com.babylon.finality.v1.TxProto.MsgAddFinalitySig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFinalitySigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: msg for evidence of equivocation. this is not specified yet
     * UpdateParams updates the finality module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.babylon.finality.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMIT_PUB_RAND_LIST = 0;
  private static final int METHODID_ADD_FINALITY_SIG = 1;
  private static final int METHODID_UPDATE_PARAMS = 2;

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
        case METHODID_COMMIT_PUB_RAND_LIST:
          serviceImpl.commitPubRandList((com.babylon.finality.v1.TxProto.MsgCommitPubRandList) request,
              (io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse>) responseObserver);
          break;
        case METHODID_ADD_FINALITY_SIG:
          serviceImpl.addFinalitySig((com.babylon.finality.v1.TxProto.MsgAddFinalitySig) request,
              (io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.babylon.finality.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getCommitPubRandListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.babylon.finality.v1.TxProto.MsgCommitPubRandList,
              com.babylon.finality.v1.TxProto.MsgCommitPubRandListResponse>(
                service, METHODID_COMMIT_PUB_RAND_LIST)))
        .addMethod(
          getAddFinalitySigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.babylon.finality.v1.TxProto.MsgAddFinalitySig,
              com.babylon.finality.v1.TxProto.MsgAddFinalitySigResponse>(
                service, METHODID_ADD_FINALITY_SIG)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.babylon.finality.v1.TxProto.MsgUpdateParams,
              com.babylon.finality.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.babylon.finality.v1.TxProto.getDescriptor();
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
              .addMethod(getCommitPubRandListMethod())
              .addMethod(getAddFinalitySigMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
