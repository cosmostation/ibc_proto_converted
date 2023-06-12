package com.pubsub.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sommelier/pubsub/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "pubsub.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherRequest,
      com.pubsub.v1.MsgRemovePublisherResponse> getRemovePublisherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePublisher",
      requestType = com.pubsub.v1.MsgRemovePublisherRequest.class,
      responseType = com.pubsub.v1.MsgRemovePublisherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherRequest,
      com.pubsub.v1.MsgRemovePublisherResponse> getRemovePublisherMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherRequest, com.pubsub.v1.MsgRemovePublisherResponse> getRemovePublisherMethod;
    if ((getRemovePublisherMethod = MsgGrpc.getRemovePublisherMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePublisherMethod = MsgGrpc.getRemovePublisherMethod) == null) {
          MsgGrpc.getRemovePublisherMethod = getRemovePublisherMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgRemovePublisherRequest, com.pubsub.v1.MsgRemovePublisherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePublisher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemovePublisherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemovePublisherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePublisher"))
              .build();
        }
      }
    }
    return getRemovePublisherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberRequest,
      com.pubsub.v1.MsgAddSubscriberResponse> getAddSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscriber",
      requestType = com.pubsub.v1.MsgAddSubscriberRequest.class,
      responseType = com.pubsub.v1.MsgAddSubscriberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberRequest,
      com.pubsub.v1.MsgAddSubscriberResponse> getAddSubscriberMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberRequest, com.pubsub.v1.MsgAddSubscriberResponse> getAddSubscriberMethod;
    if ((getAddSubscriberMethod = MsgGrpc.getAddSubscriberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddSubscriberMethod = MsgGrpc.getAddSubscriberMethod) == null) {
          MsgGrpc.getAddSubscriberMethod = getAddSubscriberMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgAddSubscriberRequest, com.pubsub.v1.MsgAddSubscriberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddSubscriberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddSubscriberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddSubscriber"))
              .build();
        }
      }
    }
    return getAddSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberRequest,
      com.pubsub.v1.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubscriber",
      requestType = com.pubsub.v1.MsgRemoveSubscriberRequest.class,
      responseType = com.pubsub.v1.MsgRemoveSubscriberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberRequest,
      com.pubsub.v1.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberRequest, com.pubsub.v1.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod;
    if ((getRemoveSubscriberMethod = MsgGrpc.getRemoveSubscriberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveSubscriberMethod = MsgGrpc.getRemoveSubscriberMethod) == null) {
          MsgGrpc.getRemoveSubscriberMethod = getRemoveSubscriberMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgRemoveSubscriberRequest, com.pubsub.v1.MsgRemoveSubscriberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemoveSubscriberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemoveSubscriberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveSubscriber"))
              .build();
        }
      }
    }
    return getRemoveSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddPublisherIntentRequest,
      com.pubsub.v1.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPublisherIntent",
      requestType = com.pubsub.v1.MsgAddPublisherIntentRequest.class,
      responseType = com.pubsub.v1.MsgAddPublisherIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddPublisherIntentRequest,
      com.pubsub.v1.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddPublisherIntentRequest, com.pubsub.v1.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod;
    if ((getAddPublisherIntentMethod = MsgGrpc.getAddPublisherIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPublisherIntentMethod = MsgGrpc.getAddPublisherIntentMethod) == null) {
          MsgGrpc.getAddPublisherIntentMethod = getAddPublisherIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgAddPublisherIntentRequest, com.pubsub.v1.MsgAddPublisherIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPublisherIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddPublisherIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddPublisherIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPublisherIntent"))
              .build();
        }
      }
    }
    return getAddPublisherIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherIntentRequest,
      com.pubsub.v1.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePublisherIntent",
      requestType = com.pubsub.v1.MsgRemovePublisherIntentRequest.class,
      responseType = com.pubsub.v1.MsgRemovePublisherIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherIntentRequest,
      com.pubsub.v1.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemovePublisherIntentRequest, com.pubsub.v1.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod;
    if ((getRemovePublisherIntentMethod = MsgGrpc.getRemovePublisherIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePublisherIntentMethod = MsgGrpc.getRemovePublisherIntentMethod) == null) {
          MsgGrpc.getRemovePublisherIntentMethod = getRemovePublisherIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgRemovePublisherIntentRequest, com.pubsub.v1.MsgRemovePublisherIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePublisherIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemovePublisherIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemovePublisherIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePublisherIntent"))
              .build();
        }
      }
    }
    return getRemovePublisherIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberIntentRequest,
      com.pubsub.v1.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscriberIntent",
      requestType = com.pubsub.v1.MsgAddSubscriberIntentRequest.class,
      responseType = com.pubsub.v1.MsgAddSubscriberIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberIntentRequest,
      com.pubsub.v1.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgAddSubscriberIntentRequest, com.pubsub.v1.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod;
    if ((getAddSubscriberIntentMethod = MsgGrpc.getAddSubscriberIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddSubscriberIntentMethod = MsgGrpc.getAddSubscriberIntentMethod) == null) {
          MsgGrpc.getAddSubscriberIntentMethod = getAddSubscriberIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgAddSubscriberIntentRequest, com.pubsub.v1.MsgAddSubscriberIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscriberIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddSubscriberIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgAddSubscriberIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddSubscriberIntent"))
              .build();
        }
      }
    }
    return getAddSubscriberIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberIntentRequest,
      com.pubsub.v1.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubscriberIntent",
      requestType = com.pubsub.v1.MsgRemoveSubscriberIntentRequest.class,
      responseType = com.pubsub.v1.MsgRemoveSubscriberIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberIntentRequest,
      com.pubsub.v1.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.MsgRemoveSubscriberIntentRequest, com.pubsub.v1.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod;
    if ((getRemoveSubscriberIntentMethod = MsgGrpc.getRemoveSubscriberIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveSubscriberIntentMethod = MsgGrpc.getRemoveSubscriberIntentMethod) == null) {
          MsgGrpc.getRemoveSubscriberIntentMethod = getRemoveSubscriberIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.MsgRemoveSubscriberIntentRequest, com.pubsub.v1.MsgRemoveSubscriberIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubscriberIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemoveSubscriberIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.MsgRemoveSubscriberIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveSubscriberIntent"))
              .build();
        }
      }
    }
    return getRemoveSubscriberIntentMethod;
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
    default void removePublisher(com.pubsub.v1.MsgRemovePublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePublisherMethod(), responseObserver);
    }

    /**
     */
    default void addSubscriber(com.pubsub.v1.MsgAddSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriberMethod(), responseObserver);
    }

    /**
     */
    default void removeSubscriber(com.pubsub.v1.MsgRemoveSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSubscriberMethod(), responseObserver);
    }

    /**
     */
    default void addPublisherIntent(com.pubsub.v1.MsgAddPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPublisherIntentMethod(), responseObserver);
    }

    /**
     */
    default void removePublisherIntent(com.pubsub.v1.MsgRemovePublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePublisherIntentMethod(), responseObserver);
    }

    /**
     */
    default void addSubscriberIntent(com.pubsub.v1.MsgAddSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriberIntentMethod(), responseObserver);
    }

    /**
     */
    default void removeSubscriberIntent(com.pubsub.v1.MsgRemoveSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSubscriberIntentMethod(), responseObserver);
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
    public void removePublisher(com.pubsub.v1.MsgRemovePublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePublisherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriber(com.pubsub.v1.MsgAddSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSubscriber(com.pubsub.v1.MsgRemoveSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPublisherIntent(com.pubsub.v1.MsgAddPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPublisherIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePublisherIntent(com.pubsub.v1.MsgRemovePublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePublisherIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriberIntent(com.pubsub.v1.MsgAddSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriberIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSubscriberIntent(com.pubsub.v1.MsgRemoveSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSubscriberIntentMethod(), getCallOptions()), request, responseObserver);
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
    public com.pubsub.v1.MsgRemovePublisherResponse removePublisher(com.pubsub.v1.MsgRemovePublisherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePublisherMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgAddSubscriberResponse addSubscriber(com.pubsub.v1.MsgAddSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgRemoveSubscriberResponse removeSubscriber(com.pubsub.v1.MsgRemoveSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgAddPublisherIntentResponse addPublisherIntent(com.pubsub.v1.MsgAddPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPublisherIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgRemovePublisherIntentResponse removePublisherIntent(com.pubsub.v1.MsgRemovePublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePublisherIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgAddSubscriberIntentResponse addSubscriberIntent(com.pubsub.v1.MsgAddSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriberIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.MsgRemoveSubscriberIntentResponse removeSubscriberIntent(com.pubsub.v1.MsgRemoveSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSubscriberIntentMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgRemovePublisherResponse> removePublisher(
        com.pubsub.v1.MsgRemovePublisherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePublisherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgAddSubscriberResponse> addSubscriber(
        com.pubsub.v1.MsgAddSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgRemoveSubscriberResponse> removeSubscriber(
        com.pubsub.v1.MsgRemoveSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgAddPublisherIntentResponse> addPublisherIntent(
        com.pubsub.v1.MsgAddPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPublisherIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgRemovePublisherIntentResponse> removePublisherIntent(
        com.pubsub.v1.MsgRemovePublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePublisherIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgAddSubscriberIntentResponse> addSubscriberIntent(
        com.pubsub.v1.MsgAddSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriberIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.MsgRemoveSubscriberIntentResponse> removeSubscriberIntent(
        com.pubsub.v1.MsgRemoveSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSubscriberIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_PUBLISHER = 0;
  private static final int METHODID_ADD_SUBSCRIBER = 1;
  private static final int METHODID_REMOVE_SUBSCRIBER = 2;
  private static final int METHODID_ADD_PUBLISHER_INTENT = 3;
  private static final int METHODID_REMOVE_PUBLISHER_INTENT = 4;
  private static final int METHODID_ADD_SUBSCRIBER_INTENT = 5;
  private static final int METHODID_REMOVE_SUBSCRIBER_INTENT = 6;

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
        case METHODID_REMOVE_PUBLISHER:
          serviceImpl.removePublisher((com.pubsub.v1.MsgRemovePublisherRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER:
          serviceImpl.addSubscriber((com.pubsub.v1.MsgAddSubscriberRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIBER:
          serviceImpl.removeSubscriber((com.pubsub.v1.MsgRemoveSubscriberRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberResponse>) responseObserver);
          break;
        case METHODID_ADD_PUBLISHER_INTENT:
          serviceImpl.addPublisherIntent((com.pubsub.v1.MsgAddPublisherIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddPublisherIntentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PUBLISHER_INTENT:
          serviceImpl.removePublisherIntent((com.pubsub.v1.MsgRemovePublisherIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemovePublisherIntentResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER_INTENT:
          serviceImpl.addSubscriberIntent((com.pubsub.v1.MsgAddSubscriberIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgAddSubscriberIntentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIBER_INTENT:
          serviceImpl.removeSubscriberIntent((com.pubsub.v1.MsgRemoveSubscriberIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.MsgRemoveSubscriberIntentResponse>) responseObserver);
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
          getRemovePublisherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgRemovePublisherRequest,
              com.pubsub.v1.MsgRemovePublisherResponse>(
                service, METHODID_REMOVE_PUBLISHER)))
        .addMethod(
          getAddSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgAddSubscriberRequest,
              com.pubsub.v1.MsgAddSubscriberResponse>(
                service, METHODID_ADD_SUBSCRIBER)))
        .addMethod(
          getRemoveSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgRemoveSubscriberRequest,
              com.pubsub.v1.MsgRemoveSubscriberResponse>(
                service, METHODID_REMOVE_SUBSCRIBER)))
        .addMethod(
          getAddPublisherIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgAddPublisherIntentRequest,
              com.pubsub.v1.MsgAddPublisherIntentResponse>(
                service, METHODID_ADD_PUBLISHER_INTENT)))
        .addMethod(
          getRemovePublisherIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgRemovePublisherIntentRequest,
              com.pubsub.v1.MsgRemovePublisherIntentResponse>(
                service, METHODID_REMOVE_PUBLISHER_INTENT)))
        .addMethod(
          getAddSubscriberIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgAddSubscriberIntentRequest,
              com.pubsub.v1.MsgAddSubscriberIntentResponse>(
                service, METHODID_ADD_SUBSCRIBER_INTENT)))
        .addMethod(
          getRemoveSubscriberIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.MsgRemoveSubscriberIntentRequest,
              com.pubsub.v1.MsgRemoveSubscriberIntentResponse>(
                service, METHODID_REMOVE_SUBSCRIBER_INTENT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pubsub.v1.TxProto.getDescriptor();
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
              .addMethod(getRemovePublisherMethod())
              .addMethod(getAddSubscriberMethod())
              .addMethod(getRemoveSubscriberMethod())
              .addMethod(getAddPublisherIntentMethod())
              .addMethod(getRemovePublisherIntentMethod())
              .addMethod(getAddSubscriberIntentMethod())
              .addMethod(getRemoveSubscriberIntentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
