package com.sentinel.session.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/session/v2/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.session.v2.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgStartRequest,
      com.sentinel.session.v2.MsgStartResponse> getMsgStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgStart",
      requestType = com.sentinel.session.v2.MsgStartRequest.class,
      responseType = com.sentinel.session.v2.MsgStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgStartRequest,
      com.sentinel.session.v2.MsgStartResponse> getMsgStartMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgStartRequest, com.sentinel.session.v2.MsgStartResponse> getMsgStartMethod;
    if ((getMsgStartMethod = MsgServiceGrpc.getMsgStartMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgStartMethod = MsgServiceGrpc.getMsgStartMethod) == null) {
          MsgServiceGrpc.getMsgStartMethod = getMsgStartMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.MsgStartRequest, com.sentinel.session.v2.MsgStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgStartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgStart"))
              .build();
        }
      }
    }
    return getMsgStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgUpdateDetailsRequest,
      com.sentinel.session.v2.MsgUpdateDetailsResponse> getMsgUpdateDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUpdateDetails",
      requestType = com.sentinel.session.v2.MsgUpdateDetailsRequest.class,
      responseType = com.sentinel.session.v2.MsgUpdateDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgUpdateDetailsRequest,
      com.sentinel.session.v2.MsgUpdateDetailsResponse> getMsgUpdateDetailsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgUpdateDetailsRequest, com.sentinel.session.v2.MsgUpdateDetailsResponse> getMsgUpdateDetailsMethod;
    if ((getMsgUpdateDetailsMethod = MsgServiceGrpc.getMsgUpdateDetailsMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUpdateDetailsMethod = MsgServiceGrpc.getMsgUpdateDetailsMethod) == null) {
          MsgServiceGrpc.getMsgUpdateDetailsMethod = getMsgUpdateDetailsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.MsgUpdateDetailsRequest, com.sentinel.session.v2.MsgUpdateDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUpdateDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgUpdateDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgUpdateDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUpdateDetails"))
              .build();
        }
      }
    }
    return getMsgUpdateDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgEndRequest,
      com.sentinel.session.v2.MsgEndResponse> getMsgEndMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgEnd",
      requestType = com.sentinel.session.v2.MsgEndRequest.class,
      responseType = com.sentinel.session.v2.MsgEndResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgEndRequest,
      com.sentinel.session.v2.MsgEndResponse> getMsgEndMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.MsgEndRequest, com.sentinel.session.v2.MsgEndResponse> getMsgEndMethod;
    if ((getMsgEndMethod = MsgServiceGrpc.getMsgEndMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgEndMethod = MsgServiceGrpc.getMsgEndMethod) == null) {
          MsgServiceGrpc.getMsgEndMethod = getMsgEndMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.MsgEndRequest, com.sentinel.session.v2.MsgEndResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgEnd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgEndRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.MsgEndResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgEnd"))
              .build();
        }
      }
    }
    return getMsgEndMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void msgStart(com.sentinel.session.v2.MsgStartRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgStartMethod(), responseObserver);
    }

    /**
     */
    default void msgUpdateDetails(com.sentinel.session.v2.MsgUpdateDetailsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgUpdateDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUpdateDetailsMethod(), responseObserver);
    }

    /**
     */
    default void msgEnd(com.sentinel.session.v2.MsgEndRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgEndResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgEndMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void msgStart(com.sentinel.session.v2.MsgStartRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUpdateDetails(com.sentinel.session.v2.MsgUpdateDetailsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgUpdateDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUpdateDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgEnd(com.sentinel.session.v2.MsgEndRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgEndResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgEndMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sentinel.session.v2.MsgStartResponse msgStart(com.sentinel.session.v2.MsgStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.MsgUpdateDetailsResponse msgUpdateDetails(com.sentinel.session.v2.MsgUpdateDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUpdateDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.MsgEndResponse msgEnd(com.sentinel.session.v2.MsgEndRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgEndMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.MsgStartResponse> msgStart(
        com.sentinel.session.v2.MsgStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.MsgUpdateDetailsResponse> msgUpdateDetails(
        com.sentinel.session.v2.MsgUpdateDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUpdateDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.MsgEndResponse> msgEnd(
        com.sentinel.session.v2.MsgEndRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgEndMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_START = 0;
  private static final int METHODID_MSG_UPDATE_DETAILS = 1;
  private static final int METHODID_MSG_END = 2;

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
        case METHODID_MSG_START:
          serviceImpl.msgStart((com.sentinel.session.v2.MsgStartRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgStartResponse>) responseObserver);
          break;
        case METHODID_MSG_UPDATE_DETAILS:
          serviceImpl.msgUpdateDetails((com.sentinel.session.v2.MsgUpdateDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgUpdateDetailsResponse>) responseObserver);
          break;
        case METHODID_MSG_END:
          serviceImpl.msgEnd((com.sentinel.session.v2.MsgEndRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.MsgEndResponse>) responseObserver);
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
          getMsgStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.MsgStartRequest,
              com.sentinel.session.v2.MsgStartResponse>(
                service, METHODID_MSG_START)))
        .addMethod(
          getMsgUpdateDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.MsgUpdateDetailsRequest,
              com.sentinel.session.v2.MsgUpdateDetailsResponse>(
                service, METHODID_MSG_UPDATE_DETAILS)))
        .addMethod(
          getMsgEndMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.MsgEndRequest,
              com.sentinel.session.v2.MsgEndResponse>(
                service, METHODID_MSG_END)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.session.v2.MsgProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getMsgStartMethod())
              .addMethod(getMsgUpdateDetailsMethod())
              .addMethod(getMsgEndMethod())
              .build();
        }
      }
    }
    return result;
  }
}
