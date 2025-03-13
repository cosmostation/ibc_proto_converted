package com.stratos.sds.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the sds module Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/sds/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stratos.sds.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgFileUpload,
      com.stratos.sds.v1.TxProto.MsgFileUploadResponse> getHandleMsgFileUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgFileUpload",
      requestType = com.stratos.sds.v1.TxProto.MsgFileUpload.class,
      responseType = com.stratos.sds.v1.TxProto.MsgFileUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgFileUpload,
      com.stratos.sds.v1.TxProto.MsgFileUploadResponse> getHandleMsgFileUploadMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgFileUpload, com.stratos.sds.v1.TxProto.MsgFileUploadResponse> getHandleMsgFileUploadMethod;
    if ((getHandleMsgFileUploadMethod = MsgGrpc.getHandleMsgFileUploadMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgFileUploadMethod = MsgGrpc.getHandleMsgFileUploadMethod) == null) {
          MsgGrpc.getHandleMsgFileUploadMethod = getHandleMsgFileUploadMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.TxProto.MsgFileUpload, com.stratos.sds.v1.TxProto.MsgFileUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgFileUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgFileUpload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgFileUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgFileUpload"))
              .build();
        }
      }
    }
    return getHandleMsgFileUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgPrepay,
      com.stratos.sds.v1.TxProto.MsgPrepayResponse> getHandleMsgPrepayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgPrepay",
      requestType = com.stratos.sds.v1.TxProto.MsgPrepay.class,
      responseType = com.stratos.sds.v1.TxProto.MsgPrepayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgPrepay,
      com.stratos.sds.v1.TxProto.MsgPrepayResponse> getHandleMsgPrepayMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgPrepay, com.stratos.sds.v1.TxProto.MsgPrepayResponse> getHandleMsgPrepayMethod;
    if ((getHandleMsgPrepayMethod = MsgGrpc.getHandleMsgPrepayMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgPrepayMethod = MsgGrpc.getHandleMsgPrepayMethod) == null) {
          MsgGrpc.getHandleMsgPrepayMethod = getHandleMsgPrepayMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.TxProto.MsgPrepay, com.stratos.sds.v1.TxProto.MsgPrepayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgPrepay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgPrepay.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgPrepayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgPrepay"))
              .build();
        }
      }
    }
    return getHandleMsgPrepayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgUpdateParams,
      com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.stratos.sds.v1.TxProto.MsgUpdateParams.class,
      responseType = com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgUpdateParams,
      com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.TxProto.MsgUpdateParams, com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.TxProto.MsgUpdateParams, com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the sds module Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * HandleMsgFileUpload defines a method for file uploading
     * </pre>
     */
    default void handleMsgFileUpload(com.stratos.sds.v1.TxProto.MsgFileUpload request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgFileUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgFileUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * HandleMsgPrepay defines a method for prepay
     * </pre>
     */
    default void handleMsgPrepay(com.stratos.sds.v1.TxProto.MsgPrepay request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgPrepayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgPrepayMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/sds module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    default void updateParams(com.stratos.sds.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the sds module Msg service.
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
   * Msg defines the sds module Msg service.
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
     * HandleMsgFileUpload defines a method for file uploading
     * </pre>
     */
    public void handleMsgFileUpload(com.stratos.sds.v1.TxProto.MsgFileUpload request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgFileUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgFileUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HandleMsgPrepay defines a method for prepay
     * </pre>
     */
    public void handleMsgPrepay(com.stratos.sds.v1.TxProto.MsgPrepay request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgPrepayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgPrepayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/sds module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public void updateParams(com.stratos.sds.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the sds module Msg service.
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
     * HandleMsgFileUpload defines a method for file uploading
     * </pre>
     */
    public com.stratos.sds.v1.TxProto.MsgFileUploadResponse handleMsgFileUpload(com.stratos.sds.v1.TxProto.MsgFileUpload request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgFileUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HandleMsgPrepay defines a method for prepay
     * </pre>
     */
    public com.stratos.sds.v1.TxProto.MsgPrepayResponse handleMsgPrepay(com.stratos.sds.v1.TxProto.MsgPrepay request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgPrepayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/sds module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse updateParams(com.stratos.sds.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the sds module Msg service.
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
     * HandleMsgFileUpload defines a method for file uploading
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.TxProto.MsgFileUploadResponse> handleMsgFileUpload(
        com.stratos.sds.v1.TxProto.MsgFileUpload request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgFileUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HandleMsgPrepay defines a method for prepay
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.TxProto.MsgPrepayResponse> handleMsgPrepay(
        com.stratos.sds.v1.TxProto.MsgPrepay request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgPrepayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/sds module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.stratos.sds.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_MSG_FILE_UPLOAD = 0;
  private static final int METHODID_HANDLE_MSG_PREPAY = 1;
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
        case METHODID_HANDLE_MSG_FILE_UPLOAD:
          serviceImpl.handleMsgFileUpload((com.stratos.sds.v1.TxProto.MsgFileUpload) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgFileUploadResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_PREPAY:
          serviceImpl.handleMsgPrepay((com.stratos.sds.v1.TxProto.MsgPrepay) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgPrepayResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.stratos.sds.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getHandleMsgFileUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.TxProto.MsgFileUpload,
              com.stratos.sds.v1.TxProto.MsgFileUploadResponse>(
                service, METHODID_HANDLE_MSG_FILE_UPLOAD)))
        .addMethod(
          getHandleMsgPrepayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.TxProto.MsgPrepay,
              com.stratos.sds.v1.TxProto.MsgPrepayResponse>(
                service, METHODID_HANDLE_MSG_PREPAY)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.TxProto.MsgUpdateParams,
              com.stratos.sds.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.sds.v1.TxProto.getDescriptor();
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
              .addMethod(getHandleMsgFileUploadMethod())
              .addMethod(getHandleMsgPrepayMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
