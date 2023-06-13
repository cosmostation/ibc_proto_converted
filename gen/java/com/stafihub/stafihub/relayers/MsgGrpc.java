package com.stafihub.stafihub.relayers;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/relayers/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.relayers.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer,
      com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> getAddRelayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRelayer",
      requestType = com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer.class,
      responseType = com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer,
      com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> getAddRelayerMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer, com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> getAddRelayerMethod;
    if ((getAddRelayerMethod = MsgGrpc.getAddRelayerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRelayerMethod = MsgGrpc.getAddRelayerMethod) == null) {
          MsgGrpc.getAddRelayerMethod = getAddRelayerMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer, com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRelayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRelayer"))
              .build();
        }
      }
    }
    return getAddRelayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer,
      com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> getDeleteRelayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelayer",
      requestType = com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer.class,
      responseType = com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer,
      com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> getDeleteRelayerMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer, com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> getDeleteRelayerMethod;
    if ((getDeleteRelayerMethod = MsgGrpc.getDeleteRelayerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRelayerMethod = MsgGrpc.getDeleteRelayerMethod) == null) {
          MsgGrpc.getDeleteRelayerMethod = getDeleteRelayerMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer, com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRelayer"))
              .build();
        }
      }
    }
    return getDeleteRelayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold,
      com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> getSetThresholdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetThreshold",
      requestType = com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold.class,
      responseType = com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold,
      com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> getSetThresholdMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold, com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> getSetThresholdMethod;
    if ((getSetThresholdMethod = MsgGrpc.getSetThresholdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetThresholdMethod = MsgGrpc.getSetThresholdMethod) == null) {
          MsgGrpc.getSetThresholdMethod = getSetThresholdMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold, com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetThreshold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetThreshold"))
              .build();
        }
      }
    }
    return getSetThresholdMethod;
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
     */
    default void addRelayer(com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRelayerMethod(), responseObserver);
    }

    /**
     */
    default void deleteRelayer(com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRelayerMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void setThreshold(com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetThresholdMethod(), responseObserver);
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
     */
    public void addRelayer(com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRelayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRelayer(com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRelayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void setThreshold(com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse addRelayer(com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRelayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse deleteRelayer(com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRelayerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse setThreshold(com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetThresholdMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse> addRelayer(
        com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRelayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse> deleteRelayer(
        com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRelayerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse> setThreshold(
        com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetThresholdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RELAYER = 0;
  private static final int METHODID_DELETE_RELAYER = 1;
  private static final int METHODID_SET_THRESHOLD = 2;

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
        case METHODID_ADD_RELAYER:
          serviceImpl.addRelayer((com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELAYER:
          serviceImpl.deleteRelayer((com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse>) responseObserver);
          break;
        case METHODID_SET_THRESHOLD:
          serviceImpl.setThreshold((com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse>) responseObserver);
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
          getAddRelayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.relayers.TxProto.MsgAddRelayer,
              com.stafihub.stafihub.relayers.TxProto.MsgAddRelayerResponse>(
                service, METHODID_ADD_RELAYER)))
        .addMethod(
          getDeleteRelayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayer,
              com.stafihub.stafihub.relayers.TxProto.MsgDeleteRelayerResponse>(
                service, METHODID_DELETE_RELAYER)))
        .addMethod(
          getSetThresholdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.relayers.TxProto.MsgSetThreshold,
              com.stafihub.stafihub.relayers.TxProto.MsgSetThresholdResponse>(
                service, METHODID_SET_THRESHOLD)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.relayers.TxProto.getDescriptor();
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
              .addMethod(getAddRelayerMethod())
              .addMethod(getDeleteRelayerMethod())
              .addMethod(getSetThresholdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
