package com.irismod.oracle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/oracle/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.oracle.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.oracle.MsgCreateFeed,
      com.irismod.oracle.MsgCreateFeedResponse> getCreateFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFeed",
      requestType = com.irismod.oracle.MsgCreateFeed.class,
      responseType = com.irismod.oracle.MsgCreateFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.oracle.MsgCreateFeed,
      com.irismod.oracle.MsgCreateFeedResponse> getCreateFeedMethod() {
    io.grpc.MethodDescriptor<com.irismod.oracle.MsgCreateFeed, com.irismod.oracle.MsgCreateFeedResponse> getCreateFeedMethod;
    if ((getCreateFeedMethod = MsgGrpc.getCreateFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateFeedMethod = MsgGrpc.getCreateFeedMethod) == null) {
          MsgGrpc.getCreateFeedMethod = getCreateFeedMethod =
              io.grpc.MethodDescriptor.<com.irismod.oracle.MsgCreateFeed, com.irismod.oracle.MsgCreateFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgCreateFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgCreateFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateFeed"))
              .build();
        }
      }
    }
    return getCreateFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.oracle.MsgEditFeed,
      com.irismod.oracle.MsgEditFeedResponse> getEditFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditFeed",
      requestType = com.irismod.oracle.MsgEditFeed.class,
      responseType = com.irismod.oracle.MsgEditFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.oracle.MsgEditFeed,
      com.irismod.oracle.MsgEditFeedResponse> getEditFeedMethod() {
    io.grpc.MethodDescriptor<com.irismod.oracle.MsgEditFeed, com.irismod.oracle.MsgEditFeedResponse> getEditFeedMethod;
    if ((getEditFeedMethod = MsgGrpc.getEditFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditFeedMethod = MsgGrpc.getEditFeedMethod) == null) {
          MsgGrpc.getEditFeedMethod = getEditFeedMethod =
              io.grpc.MethodDescriptor.<com.irismod.oracle.MsgEditFeed, com.irismod.oracle.MsgEditFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgEditFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgEditFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditFeed"))
              .build();
        }
      }
    }
    return getEditFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.oracle.MsgStartFeed,
      com.irismod.oracle.MsgStartFeedResponse> getStartFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFeed",
      requestType = com.irismod.oracle.MsgStartFeed.class,
      responseType = com.irismod.oracle.MsgStartFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.oracle.MsgStartFeed,
      com.irismod.oracle.MsgStartFeedResponse> getStartFeedMethod() {
    io.grpc.MethodDescriptor<com.irismod.oracle.MsgStartFeed, com.irismod.oracle.MsgStartFeedResponse> getStartFeedMethod;
    if ((getStartFeedMethod = MsgGrpc.getStartFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStartFeedMethod = MsgGrpc.getStartFeedMethod) == null) {
          MsgGrpc.getStartFeedMethod = getStartFeedMethod =
              io.grpc.MethodDescriptor.<com.irismod.oracle.MsgStartFeed, com.irismod.oracle.MsgStartFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgStartFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgStartFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StartFeed"))
              .build();
        }
      }
    }
    return getStartFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.oracle.MsgPauseFeed,
      com.irismod.oracle.MsgPauseFeedResponse> getPauseFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseFeed",
      requestType = com.irismod.oracle.MsgPauseFeed.class,
      responseType = com.irismod.oracle.MsgPauseFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.oracle.MsgPauseFeed,
      com.irismod.oracle.MsgPauseFeedResponse> getPauseFeedMethod() {
    io.grpc.MethodDescriptor<com.irismod.oracle.MsgPauseFeed, com.irismod.oracle.MsgPauseFeedResponse> getPauseFeedMethod;
    if ((getPauseFeedMethod = MsgGrpc.getPauseFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseFeedMethod = MsgGrpc.getPauseFeedMethod) == null) {
          MsgGrpc.getPauseFeedMethod = getPauseFeedMethod =
              io.grpc.MethodDescriptor.<com.irismod.oracle.MsgPauseFeed, com.irismod.oracle.MsgPauseFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgPauseFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.oracle.MsgPauseFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseFeed"))
              .build();
        }
      }
    }
    return getPauseFeedMethod;
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
   * Msg defines the oracle Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateFeed defines a method for creating a new feed
     * </pre>
     */
    default void createFeed(com.irismod.oracle.MsgCreateFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgCreateFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditFeed defines a method for editing a feed
     * </pre>
     */
    default void editFeed(com.irismod.oracle.MsgEditFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgEditFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartFeed defines a method for starting a feed
     * </pre>
     */
    default void startFeed(com.irismod.oracle.MsgStartFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgStartFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * PauseFeed defines a method for pausing a feed
     * </pre>
     */
    default void pauseFeed(com.irismod.oracle.MsgPauseFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgPauseFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseFeedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
   * Msg defines the oracle Msg service
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
     * CreateFeed defines a method for creating a new feed
     * </pre>
     */
    public void createFeed(com.irismod.oracle.MsgCreateFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgCreateFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditFeed defines a method for editing a feed
     * </pre>
     */
    public void editFeed(com.irismod.oracle.MsgEditFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgEditFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartFeed defines a method for starting a feed
     * </pre>
     */
    public void startFeed(com.irismod.oracle.MsgStartFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgStartFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PauseFeed defines a method for pausing a feed
     * </pre>
     */
    public void pauseFeed(com.irismod.oracle.MsgPauseFeed request,
        io.grpc.stub.StreamObserver<com.irismod.oracle.MsgPauseFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseFeedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
     * CreateFeed defines a method for creating a new feed
     * </pre>
     */
    public com.irismod.oracle.MsgCreateFeedResponse createFeed(com.irismod.oracle.MsgCreateFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditFeed defines a method for editing a feed
     * </pre>
     */
    public com.irismod.oracle.MsgEditFeedResponse editFeed(com.irismod.oracle.MsgEditFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartFeed defines a method for starting a feed
     * </pre>
     */
    public com.irismod.oracle.MsgStartFeedResponse startFeed(com.irismod.oracle.MsgStartFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PauseFeed defines a method for pausing a feed
     * </pre>
     */
    public com.irismod.oracle.MsgPauseFeedResponse pauseFeed(com.irismod.oracle.MsgPauseFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseFeedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
     * CreateFeed defines a method for creating a new feed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.oracle.MsgCreateFeedResponse> createFeed(
        com.irismod.oracle.MsgCreateFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditFeed defines a method for editing a feed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.oracle.MsgEditFeedResponse> editFeed(
        com.irismod.oracle.MsgEditFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartFeed defines a method for starting a feed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.oracle.MsgStartFeedResponse> startFeed(
        com.irismod.oracle.MsgStartFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PauseFeed defines a method for pausing a feed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.oracle.MsgPauseFeedResponse> pauseFeed(
        com.irismod.oracle.MsgPauseFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseFeedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FEED = 0;
  private static final int METHODID_EDIT_FEED = 1;
  private static final int METHODID_START_FEED = 2;
  private static final int METHODID_PAUSE_FEED = 3;

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
        case METHODID_CREATE_FEED:
          serviceImpl.createFeed((com.irismod.oracle.MsgCreateFeed) request,
              (io.grpc.stub.StreamObserver<com.irismod.oracle.MsgCreateFeedResponse>) responseObserver);
          break;
        case METHODID_EDIT_FEED:
          serviceImpl.editFeed((com.irismod.oracle.MsgEditFeed) request,
              (io.grpc.stub.StreamObserver<com.irismod.oracle.MsgEditFeedResponse>) responseObserver);
          break;
        case METHODID_START_FEED:
          serviceImpl.startFeed((com.irismod.oracle.MsgStartFeed) request,
              (io.grpc.stub.StreamObserver<com.irismod.oracle.MsgStartFeedResponse>) responseObserver);
          break;
        case METHODID_PAUSE_FEED:
          serviceImpl.pauseFeed((com.irismod.oracle.MsgPauseFeed) request,
              (io.grpc.stub.StreamObserver<com.irismod.oracle.MsgPauseFeedResponse>) responseObserver);
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
          getCreateFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.oracle.MsgCreateFeed,
              com.irismod.oracle.MsgCreateFeedResponse>(
                service, METHODID_CREATE_FEED)))
        .addMethod(
          getEditFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.oracle.MsgEditFeed,
              com.irismod.oracle.MsgEditFeedResponse>(
                service, METHODID_EDIT_FEED)))
        .addMethod(
          getStartFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.oracle.MsgStartFeed,
              com.irismod.oracle.MsgStartFeedResponse>(
                service, METHODID_START_FEED)))
        .addMethod(
          getPauseFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.oracle.MsgPauseFeed,
              com.irismod.oracle.MsgPauseFeedResponse>(
                service, METHODID_PAUSE_FEED)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.oracle.TxProto.getDescriptor();
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
              .addMethod(getCreateFeedMethod())
              .addMethod(getEditFeedMethod())
              .addMethod(getStartFeedMethod())
              .addMethod(getPauseFeedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
