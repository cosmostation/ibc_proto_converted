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
  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.MsgCreateGauge,
      com.osmosis.incentives.MsgCreateGaugeResponse> getCreateGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGauge",
      requestType = com.osmosis.incentives.MsgCreateGauge.class,
      responseType = com.osmosis.incentives.MsgCreateGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.MsgCreateGauge,
      com.osmosis.incentives.MsgCreateGaugeResponse> getCreateGaugeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.MsgCreateGauge, com.osmosis.incentives.MsgCreateGaugeResponse> getCreateGaugeMethod;
    if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGaugeMethod = MsgGrpc.getCreateGaugeMethod) == null) {
          MsgGrpc.getCreateGaugeMethod = getCreateGaugeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.MsgCreateGauge, com.osmosis.incentives.MsgCreateGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.MsgCreateGauge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.MsgCreateGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGauge"))
              .build();
        }
      }
    }
    return getCreateGaugeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.MsgAddToGauge,
      com.osmosis.incentives.MsgAddToGaugeResponse> getAddToGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToGauge",
      requestType = com.osmosis.incentives.MsgAddToGauge.class,
      responseType = com.osmosis.incentives.MsgAddToGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.MsgAddToGauge,
      com.osmosis.incentives.MsgAddToGaugeResponse> getAddToGaugeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.MsgAddToGauge, com.osmosis.incentives.MsgAddToGaugeResponse> getAddToGaugeMethod;
    if ((getAddToGaugeMethod = MsgGrpc.getAddToGaugeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToGaugeMethod = MsgGrpc.getAddToGaugeMethod) == null) {
          MsgGrpc.getAddToGaugeMethod = getAddToGaugeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.MsgAddToGauge, com.osmosis.incentives.MsgAddToGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.MsgAddToGauge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.MsgAddToGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToGauge"))
              .build();
        }
      }
    }
    return getAddToGaugeMethod;
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
    default void createGauge(com.osmosis.incentives.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGaugeMethod(), responseObserver);
    }

    /**
     */
    default void addToGauge(com.osmosis.incentives.MsgAddToGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgAddToGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToGaugeMethod(), responseObserver);
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
    public void createGauge(com.osmosis.incentives.MsgCreateGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgCreateGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToGauge(com.osmosis.incentives.MsgAddToGauge request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgAddToGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToGaugeMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.incentives.MsgCreateGaugeResponse createGauge(com.osmosis.incentives.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGaugeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.incentives.MsgAddToGaugeResponse addToGauge(com.osmosis.incentives.MsgAddToGauge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToGaugeMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.MsgCreateGaugeResponse> createGauge(
        com.osmosis.incentives.MsgCreateGauge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGaugeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.MsgAddToGaugeResponse> addToGauge(
        com.osmosis.incentives.MsgAddToGauge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToGaugeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GAUGE = 0;
  private static final int METHODID_ADD_TO_GAUGE = 1;

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
          serviceImpl.createGauge((com.osmosis.incentives.MsgCreateGauge) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgCreateGaugeResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_GAUGE:
          serviceImpl.addToGauge((com.osmosis.incentives.MsgAddToGauge) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.MsgAddToGaugeResponse>) responseObserver);
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
              com.osmosis.incentives.MsgCreateGauge,
              com.osmosis.incentives.MsgCreateGaugeResponse>(
                service, METHODID_CREATE_GAUGE)))
        .addMethod(
          getAddToGaugeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.MsgAddToGauge,
              com.osmosis.incentives.MsgAddToGaugeResponse>(
                service, METHODID_ADD_TO_GAUGE)))
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
              .build();
        }
      }
    }
    return result;
  }
}
