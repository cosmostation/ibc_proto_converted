package com.pubsub.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: sommelier/pubsub/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "pubsub.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherRequest,
      com.pubsub.v1.TxProto.MsgRemovePublisherResponse> getRemovePublisherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePublisher",
      requestType = com.pubsub.v1.TxProto.MsgRemovePublisherRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgRemovePublisherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherRequest,
      com.pubsub.v1.TxProto.MsgRemovePublisherResponse> getRemovePublisherMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherRequest, com.pubsub.v1.TxProto.MsgRemovePublisherResponse> getRemovePublisherMethod;
    if ((getRemovePublisherMethod = MsgGrpc.getRemovePublisherMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePublisherMethod = MsgGrpc.getRemovePublisherMethod) == null) {
          MsgGrpc.getRemovePublisherMethod = getRemovePublisherMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgRemovePublisherRequest, com.pubsub.v1.TxProto.MsgRemovePublisherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePublisher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemovePublisherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemovePublisherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePublisher"))
              .build();
        }
      }
    }
    return getRemovePublisherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberRequest,
      com.pubsub.v1.TxProto.MsgAddSubscriberResponse> getAddSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscriber",
      requestType = com.pubsub.v1.TxProto.MsgAddSubscriberRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgAddSubscriberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberRequest,
      com.pubsub.v1.TxProto.MsgAddSubscriberResponse> getAddSubscriberMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberRequest, com.pubsub.v1.TxProto.MsgAddSubscriberResponse> getAddSubscriberMethod;
    if ((getAddSubscriberMethod = MsgGrpc.getAddSubscriberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddSubscriberMethod = MsgGrpc.getAddSubscriberMethod) == null) {
          MsgGrpc.getAddSubscriberMethod = getAddSubscriberMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgAddSubscriberRequest, com.pubsub.v1.TxProto.MsgAddSubscriberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddSubscriberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddSubscriberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddSubscriber"))
              .build();
        }
      }
    }
    return getAddSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest,
      com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubscriber",
      requestType = com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest,
      com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest, com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> getRemoveSubscriberMethod;
    if ((getRemoveSubscriberMethod = MsgGrpc.getRemoveSubscriberMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveSubscriberMethod = MsgGrpc.getRemoveSubscriberMethod) == null) {
          MsgGrpc.getRemoveSubscriberMethod = getRemoveSubscriberMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest, com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveSubscriber"))
              .build();
        }
      }
    }
    return getRemoveSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest,
      com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPublisherIntent",
      requestType = com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest,
      com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest, com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> getAddPublisherIntentMethod;
    if ((getAddPublisherIntentMethod = MsgGrpc.getAddPublisherIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPublisherIntentMethod = MsgGrpc.getAddPublisherIntentMethod) == null) {
          MsgGrpc.getAddPublisherIntentMethod = getAddPublisherIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest, com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPublisherIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPublisherIntent"))
              .build();
        }
      }
    }
    return getAddPublisherIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest,
      com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePublisherIntent",
      requestType = com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest,
      com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest, com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> getRemovePublisherIntentMethod;
    if ((getRemovePublisherIntentMethod = MsgGrpc.getRemovePublisherIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePublisherIntentMethod = MsgGrpc.getRemovePublisherIntentMethod) == null) {
          MsgGrpc.getRemovePublisherIntentMethod = getRemovePublisherIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest, com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePublisherIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePublisherIntent"))
              .build();
        }
      }
    }
    return getRemovePublisherIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest,
      com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscriberIntent",
      requestType = com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest,
      com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest, com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> getAddSubscriberIntentMethod;
    if ((getAddSubscriberIntentMethod = MsgGrpc.getAddSubscriberIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddSubscriberIntentMethod = MsgGrpc.getAddSubscriberIntentMethod) == null) {
          MsgGrpc.getAddSubscriberIntentMethod = getAddSubscriberIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest, com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscriberIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddSubscriberIntent"))
              .build();
        }
      }
    }
    return getAddSubscriberIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest,
      com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubscriberIntent",
      requestType = com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest.class,
      responseType = com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest,
      com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest, com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> getRemoveSubscriberIntentMethod;
    if ((getRemoveSubscriberIntentMethod = MsgGrpc.getRemoveSubscriberIntentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveSubscriberIntentMethod = MsgGrpc.getRemoveSubscriberIntentMethod) == null) {
          MsgGrpc.getRemoveSubscriberIntentMethod = getRemoveSubscriberIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest, com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubscriberIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse.getDefaultInstance()))
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
    default void removePublisher(com.pubsub.v1.TxProto.MsgRemovePublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePublisherMethod(), responseObserver);
    }

    /**
     */
    default void addSubscriber(com.pubsub.v1.TxProto.MsgAddSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriberMethod(), responseObserver);
    }

    /**
     */
    default void removeSubscriber(com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSubscriberMethod(), responseObserver);
    }

    /**
     */
    default void addPublisherIntent(com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPublisherIntentMethod(), responseObserver);
    }

    /**
     */
    default void removePublisherIntent(com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePublisherIntentMethod(), responseObserver);
    }

    /**
     */
    default void addSubscriberIntent(com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriberIntentMethod(), responseObserver);
    }

    /**
     */
    default void removeSubscriberIntent(com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> responseObserver) {
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
    public void removePublisher(com.pubsub.v1.TxProto.MsgRemovePublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePublisherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriber(com.pubsub.v1.TxProto.MsgAddSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSubscriber(com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPublisherIntent(com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPublisherIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePublisherIntent(com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePublisherIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriberIntent(com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriberIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSubscriberIntent(com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> responseObserver) {
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
    public com.pubsub.v1.TxProto.MsgRemovePublisherResponse removePublisher(com.pubsub.v1.TxProto.MsgRemovePublisherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePublisherMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgAddSubscriberResponse addSubscriber(com.pubsub.v1.TxProto.MsgAddSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse removeSubscriber(com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse addPublisherIntent(com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPublisherIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse removePublisherIntent(com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePublisherIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse addSubscriberIntent(com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriberIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse removeSubscriberIntent(com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgRemovePublisherResponse> removePublisher(
        com.pubsub.v1.TxProto.MsgRemovePublisherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePublisherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgAddSubscriberResponse> addSubscriber(
        com.pubsub.v1.TxProto.MsgAddSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse> removeSubscriber(
        com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse> addPublisherIntent(
        com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPublisherIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse> removePublisherIntent(
        com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePublisherIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse> addSubscriberIntent(
        com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriberIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse> removeSubscriberIntent(
        com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest request) {
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
          serviceImpl.removePublisher((com.pubsub.v1.TxProto.MsgRemovePublisherRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER:
          serviceImpl.addSubscriber((com.pubsub.v1.TxProto.MsgAddSubscriberRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIBER:
          serviceImpl.removeSubscriber((com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse>) responseObserver);
          break;
        case METHODID_ADD_PUBLISHER_INTENT:
          serviceImpl.addPublisherIntent((com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PUBLISHER_INTENT:
          serviceImpl.removePublisherIntent((com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER_INTENT:
          serviceImpl.addSubscriberIntent((com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIBER_INTENT:
          serviceImpl.removeSubscriberIntent((com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse>) responseObserver);
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
              com.pubsub.v1.TxProto.MsgRemovePublisherRequest,
              com.pubsub.v1.TxProto.MsgRemovePublisherResponse>(
                service, METHODID_REMOVE_PUBLISHER)))
        .addMethod(
          getAddSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgAddSubscriberRequest,
              com.pubsub.v1.TxProto.MsgAddSubscriberResponse>(
                service, METHODID_ADD_SUBSCRIBER)))
        .addMethod(
          getRemoveSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgRemoveSubscriberRequest,
              com.pubsub.v1.TxProto.MsgRemoveSubscriberResponse>(
                service, METHODID_REMOVE_SUBSCRIBER)))
        .addMethod(
          getAddPublisherIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgAddPublisherIntentRequest,
              com.pubsub.v1.TxProto.MsgAddPublisherIntentResponse>(
                service, METHODID_ADD_PUBLISHER_INTENT)))
        .addMethod(
          getRemovePublisherIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgRemovePublisherIntentRequest,
              com.pubsub.v1.TxProto.MsgRemovePublisherIntentResponse>(
                service, METHODID_REMOVE_PUBLISHER_INTENT)))
        .addMethod(
          getAddSubscriberIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgAddSubscriberIntentRequest,
              com.pubsub.v1.TxProto.MsgAddSubscriberIntentResponse>(
                service, METHODID_ADD_SUBSCRIBER_INTENT)))
        .addMethod(
          getRemoveSubscriberIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentRequest,
              com.pubsub.v1.TxProto.MsgRemoveSubscriberIntentResponse>(
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
