package com.osmosis.incentives;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/incentives/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.incentives.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGauge,
      com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGauge",
      requestType = com.osmosis.incentives.TxProto.MsgCreateGauge.class,
      responseType = com.osmosis.incentives.TxProto.MsgCreateGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGauge,
      com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGauge, com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> getCreateGaugeMethod;
    if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
          MsgGrpc.getCreateGaugeMethod = getCreateGaugeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.TxProto.MsgCreateGauge, com.osmosis.incentives.TxProto.MsgCreateGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgCreateGauge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgCreateGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGauge"))
              .build();
        }
      }
    }
    return getCreateGaugeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgAddToGauge,
      com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> getAddToGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToGauge",
      requestType = com.osmosis.incentives.TxProto.MsgAddToGauge.class,
      responseType = com.osmosis.incentives.TxProto.MsgAddToGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgAddToGauge,
      com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> getAddToGaugeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgAddToGauge, com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> getAddToGaugeMethod;
    if ((getAddToGaugeMethod = MsgGrpc.getAddToGaugeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToGaugeMethod = MsgGrpc.getAddToGaugeMethod) == null) {
          MsgGrpc.getAddToGaugeMethod = getAddToGaugeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.TxProto.MsgAddToGauge, com.osmosis.incentives.TxProto.MsgAddToGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgAddToGauge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgAddToGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToGauge"))
              .build();
        }
      }
    }
    return getAddToGaugeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGroup,
      com.osmosis.incentives.TxProto.MsgCreateGroupResponse> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = com.osmosis.incentives.TxProto.MsgCreateGroup.class,
      responseType = com.osmosis.incentives.TxProto.MsgCreateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGroup,
      com.osmosis.incentives.TxProto.MsgCreateGroupResponse> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.TxProto.MsgCreateGroup, com.osmosis.incentives.TxProto.MsgCreateGroupResponse> getCreateGroupMethod;
    if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
          MsgGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.TxProto.MsgCreateGroup, com.osmosis.incentives.TxProto.MsgCreateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgCreateGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.TxProto.MsgCreateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void createGauge(com.osmosis.incentives.TxProto.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGaugeMethod(), responseObserver);
    }

    /**
     */
    default void addToGauge(com.osmosis.incentives.TxProto.MsgAddToGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToGaugeMethod(), responseObserver);
    }

    /**
     */
    default void createGroup(com.osmosis.incentives.TxProto.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
    public void createGauge(com.osmosis.incentives.TxProto.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToGauge(com.osmosis.incentives.TxProto.MsgAddToGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToGaugeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGroup(com.osmosis.incentives.TxProto.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
    public com.osmosis.incentives.TxProto.MsgCreateGaugeResponse createGauge(com.osmosis.incentives.TxProto.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGaugeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.incentives.TxProto.MsgAddToGaugeResponse addToGauge(com.osmosis.incentives.TxProto.MsgAddToGauge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToGaugeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.incentives.TxProto.MsgCreateGroupResponse createGroup(com.osmosis.incentives.TxProto.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.TxProto.MsgCreateGaugeResponse> createGauge(
        com.osmosis.incentives.TxProto.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.TxProto.MsgAddToGaugeResponse> addToGauge(
        com.osmosis.incentives.TxProto.MsgAddToGauge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToGaugeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.TxProto.MsgCreateGroupResponse> createGroup(
        com.osmosis.incentives.TxProto.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GAUGE = 0;
  private static final int METHODID_ADD_TO_GAUGE = 1;
  private static final int METHODID_CREATE_GROUP = 2;

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
        case METHODID_CREATE_GAUGE:
          serviceImpl.createGauge((com.osmosis.incentives.TxProto.MsgCreateGauge) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGaugeResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_GAUGE:
          serviceImpl.addToGauge((com.osmosis.incentives.TxProto.MsgAddToGauge) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgAddToGaugeResponse>) responseObserver);
          break;
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.osmosis.incentives.TxProto.MsgCreateGroup) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.TxProto.MsgCreateGroupResponse>) responseObserver);
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
          getCreateGaugeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.TxProto.MsgCreateGauge,
              com.osmosis.incentives.TxProto.MsgCreateGaugeResponse>(
                service, METHODID_CREATE_GAUGE)))
        .addMethod(
          getAddToGaugeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.TxProto.MsgAddToGauge,
              com.osmosis.incentives.TxProto.MsgAddToGaugeResponse>(
                service, METHODID_ADD_TO_GAUGE)))
        .addMethod(
          getCreateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.TxProto.MsgCreateGroup,
              com.osmosis.incentives.TxProto.MsgCreateGroupResponse>(
                service, METHODID_CREATE_GROUP)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.incentives.TxProto.getDescriptor();
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
              .addMethod(getCreateGaugeMethod())
              .addMethod(getAddToGaugeMethod())
              .addMethod(getCreateGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
