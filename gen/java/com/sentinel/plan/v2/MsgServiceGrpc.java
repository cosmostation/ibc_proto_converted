package com.sentinel.plan.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: sentinel/plan/v2/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sentinel.plan.v2.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgCreateRequest,
      com.sentinel.plan.v2.MsgProto.MsgCreateResponse> getMsgCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCreate",
      requestType = com.sentinel.plan.v2.MsgProto.MsgCreateRequest.class,
      responseType = com.sentinel.plan.v2.MsgProto.MsgCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgCreateRequest,
      com.sentinel.plan.v2.MsgProto.MsgCreateResponse> getMsgCreateMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgCreateRequest, com.sentinel.plan.v2.MsgProto.MsgCreateResponse> getMsgCreateMethod;
    if ((getMsgCreateMethod = MsgServiceGrpc.getMsgCreateMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgCreateMethod = MsgServiceGrpc.getMsgCreateMethod) == null) {
          MsgServiceGrpc.getMsgCreateMethod = getMsgCreateMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.MsgProto.MsgCreateRequest, com.sentinel.plan.v2.MsgProto.MsgCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgCreate"))
              .build();
        }
      }
    }
    return getMsgCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest,
      com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> getMsgUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUpdateStatus",
      requestType = com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest.class,
      responseType = com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest,
      com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> getMsgUpdateStatusMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest, com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> getMsgUpdateStatusMethod;
    if ((getMsgUpdateStatusMethod = MsgServiceGrpc.getMsgUpdateStatusMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUpdateStatusMethod = MsgServiceGrpc.getMsgUpdateStatusMethod) == null) {
          MsgServiceGrpc.getMsgUpdateStatusMethod = getMsgUpdateStatusMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest, com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUpdateStatus"))
              .build();
        }
      }
    }
    return getMsgUpdateStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest,
      com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> getMsgLinkNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgLinkNode",
      requestType = com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest.class,
      responseType = com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest,
      com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> getMsgLinkNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest, com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> getMsgLinkNodeMethod;
    if ((getMsgLinkNodeMethod = MsgServiceGrpc.getMsgLinkNodeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgLinkNodeMethod = MsgServiceGrpc.getMsgLinkNodeMethod) == null) {
          MsgServiceGrpc.getMsgLinkNodeMethod = getMsgLinkNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest, com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgLinkNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgLinkNode"))
              .build();
        }
      }
    }
    return getMsgLinkNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest,
      com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgUnlinkNode",
      requestType = com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest.class,
      responseType = com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest,
      com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest, com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> getMsgUnlinkNodeMethod;
    if ((getMsgUnlinkNodeMethod = MsgServiceGrpc.getMsgUnlinkNodeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgUnlinkNodeMethod = MsgServiceGrpc.getMsgUnlinkNodeMethod) == null) {
          MsgServiceGrpc.getMsgUnlinkNodeMethod = getMsgUnlinkNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest, com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgUnlinkNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgUnlinkNode"))
              .build();
        }
      }
    }
    return getMsgUnlinkNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest,
      com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> getMsgSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgSubscribe",
      requestType = com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest.class,
      responseType = com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest,
      com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> getMsgSubscribeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest, com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> getMsgSubscribeMethod;
    if ((getMsgSubscribeMethod = MsgServiceGrpc.getMsgSubscribeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getMsgSubscribeMethod = MsgServiceGrpc.getMsgSubscribeMethod) == null) {
          MsgServiceGrpc.getMsgSubscribeMethod = getMsgSubscribeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest, com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("MsgSubscribe"))
              .build();
        }
      }
    }
    return getMsgSubscribeMethod;
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
    default void msgCreate(com.sentinel.plan.v2.MsgProto.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCreateMethod(), responseObserver);
    }

    /**
     */
    default void msgUpdateStatus(com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUpdateStatusMethod(), responseObserver);
    }

    /**
     */
    default void msgLinkNode(com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgLinkNodeMethod(), responseObserver);
    }

    /**
     */
    default void msgUnlinkNode(com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgUnlinkNodeMethod(), responseObserver);
    }

    /**
     */
    default void msgSubscribe(com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgSubscribeMethod(), responseObserver);
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
    public void msgCreate(com.sentinel.plan.v2.MsgProto.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUpdateStatus(com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgLinkNode(com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgLinkNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgUnlinkNode(com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgUnlinkNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgSubscribe(com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgSubscribeMethod(), getCallOptions()), request, responseObserver);
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
    public com.sentinel.plan.v2.MsgProto.MsgCreateResponse msgCreate(com.sentinel.plan.v2.MsgProto.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse msgUpdateStatus(com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUpdateStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse msgLinkNode(com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgLinkNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse msgUnlinkNode(com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgUnlinkNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse msgSubscribe(com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgSubscribeMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.MsgProto.MsgCreateResponse> msgCreate(
        com.sentinel.plan.v2.MsgProto.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse> msgUpdateStatus(
        com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUpdateStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse> msgLinkNode(
        com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgLinkNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse> msgUnlinkNode(
        com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgUnlinkNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse> msgSubscribe(
        com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgSubscribeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_CREATE = 0;
  private static final int METHODID_MSG_UPDATE_STATUS = 1;
  private static final int METHODID_MSG_LINK_NODE = 2;
  private static final int METHODID_MSG_UNLINK_NODE = 3;
  private static final int METHODID_MSG_SUBSCRIBE = 4;

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
        case METHODID_MSG_CREATE:
          serviceImpl.msgCreate((com.sentinel.plan.v2.MsgProto.MsgCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgCreateResponse>) responseObserver);
          break;
        case METHODID_MSG_UPDATE_STATUS:
          serviceImpl.msgUpdateStatus((com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse>) responseObserver);
          break;
        case METHODID_MSG_LINK_NODE:
          serviceImpl.msgLinkNode((com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse>) responseObserver);
          break;
        case METHODID_MSG_UNLINK_NODE:
          serviceImpl.msgUnlinkNode((com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse>) responseObserver);
          break;
        case METHODID_MSG_SUBSCRIBE:
          serviceImpl.msgSubscribe((com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse>) responseObserver);
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
          getMsgCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.MsgProto.MsgCreateRequest,
              com.sentinel.plan.v2.MsgProto.MsgCreateResponse>(
                service, METHODID_MSG_CREATE)))
        .addMethod(
          getMsgUpdateStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.MsgProto.MsgUpdateStatusRequest,
              com.sentinel.plan.v2.MsgProto.MsgUpdateStatusResponse>(
                service, METHODID_MSG_UPDATE_STATUS)))
        .addMethod(
          getMsgLinkNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.MsgProto.MsgLinkNodeRequest,
              com.sentinel.plan.v2.MsgProto.MsgLinkNodeResponse>(
                service, METHODID_MSG_LINK_NODE)))
        .addMethod(
          getMsgUnlinkNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeRequest,
              com.sentinel.plan.v2.MsgProto.MsgUnlinkNodeResponse>(
                service, METHODID_MSG_UNLINK_NODE)))
        .addMethod(
          getMsgSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.plan.v2.MsgProto.MsgSubscribeRequest,
              com.sentinel.plan.v2.MsgProto.MsgSubscribeResponse>(
                service, METHODID_MSG_SUBSCRIBE)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.plan.v2.MsgProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMsgCreateMethod())
              .addMethod(getMsgUpdateStatusMethod())
              .addMethod(getMsgLinkNodeMethod())
              .addMethod(getMsgUnlinkNodeMethod())
              .addMethod(getMsgSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
