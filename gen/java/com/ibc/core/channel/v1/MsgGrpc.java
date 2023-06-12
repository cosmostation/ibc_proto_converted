package com.ibc.core.channel.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the ibc/channel Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ibc/core/channel/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ibc.core.channel.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenInit,
      com.ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenInit",
      requestType = com.ibc.core.channel.v1.MsgChannelOpenInit.class,
      responseType = com.ibc.core.channel.v1.MsgChannelOpenInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenInit,
      com.ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenInit, com.ibc.core.channel.v1.MsgChannelOpenInitResponse> getChannelOpenInitMethod;
    if ((getChannelOpenInitMethod = MsgGrpc.getChannelOpenInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenInitMethod = MsgGrpc.getChannelOpenInitMethod) == null) {
          MsgGrpc.getChannelOpenInitMethod = getChannelOpenInitMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelOpenInit, com.ibc.core.channel.v1.MsgChannelOpenInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelOpenInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenInit"))
              .build();
        }
      }
    }
    return getChannelOpenInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenTry,
      com.ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenTry",
      requestType = com.ibc.core.channel.v1.MsgChannelOpenTry.class,
      responseType = com.ibc.core.channel.v1.MsgChannelOpenTryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenTry,
      com.ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenTry, com.ibc.core.channel.v1.MsgChannelOpenTryResponse> getChannelOpenTryMethod;
    if ((getChannelOpenTryMethod = MsgGrpc.getChannelOpenTryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenTryMethod = MsgGrpc.getChannelOpenTryMethod) == null) {
          MsgGrpc.getChannelOpenTryMethod = getChannelOpenTryMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelOpenTry, com.ibc.core.channel.v1.MsgChannelOpenTryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelOpenTry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenTry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenTryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenTry"))
              .build();
        }
      }
    }
    return getChannelOpenTryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenAck,
      com.ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenAck",
      requestType = com.ibc.core.channel.v1.MsgChannelOpenAck.class,
      responseType = com.ibc.core.channel.v1.MsgChannelOpenAckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenAck,
      com.ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenAck, com.ibc.core.channel.v1.MsgChannelOpenAckResponse> getChannelOpenAckMethod;
    if ((getChannelOpenAckMethod = MsgGrpc.getChannelOpenAckMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenAckMethod = MsgGrpc.getChannelOpenAckMethod) == null) {
          MsgGrpc.getChannelOpenAckMethod = getChannelOpenAckMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelOpenAck, com.ibc.core.channel.v1.MsgChannelOpenAckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelOpenAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenAck.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenAckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenAck"))
              .build();
        }
      }
    }
    return getChannelOpenAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenConfirm,
      com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelOpenConfirm",
      requestType = com.ibc.core.channel.v1.MsgChannelOpenConfirm.class,
      responseType = com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenConfirm,
      com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelOpenConfirm, com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> getChannelOpenConfirmMethod;
    if ((getChannelOpenConfirmMethod = MsgGrpc.getChannelOpenConfirmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelOpenConfirmMethod = MsgGrpc.getChannelOpenConfirmMethod) == null) {
          MsgGrpc.getChannelOpenConfirmMethod = getChannelOpenConfirmMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelOpenConfirm, com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelOpenConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenConfirm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelOpenConfirm"))
              .build();
        }
      }
    }
    return getChannelOpenConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseInit,
      com.ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelCloseInit",
      requestType = com.ibc.core.channel.v1.MsgChannelCloseInit.class,
      responseType = com.ibc.core.channel.v1.MsgChannelCloseInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseInit,
      com.ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseInit, com.ibc.core.channel.v1.MsgChannelCloseInitResponse> getChannelCloseInitMethod;
    if ((getChannelCloseInitMethod = MsgGrpc.getChannelCloseInitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelCloseInitMethod = MsgGrpc.getChannelCloseInitMethod) == null) {
          MsgGrpc.getChannelCloseInitMethod = getChannelCloseInitMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelCloseInit, com.ibc.core.channel.v1.MsgChannelCloseInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelCloseInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelCloseInit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelCloseInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelCloseInit"))
              .build();
        }
      }
    }
    return getChannelCloseInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseConfirm,
      com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelCloseConfirm",
      requestType = com.ibc.core.channel.v1.MsgChannelCloseConfirm.class,
      responseType = com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseConfirm,
      com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgChannelCloseConfirm, com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> getChannelCloseConfirmMethod;
    if ((getChannelCloseConfirmMethod = MsgGrpc.getChannelCloseConfirmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChannelCloseConfirmMethod = MsgGrpc.getChannelCloseConfirmMethod) == null) {
          MsgGrpc.getChannelCloseConfirmMethod = getChannelCloseConfirmMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgChannelCloseConfirm, com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelCloseConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelCloseConfirm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChannelCloseConfirm"))
              .build();
        }
      }
    }
    return getChannelCloseConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgRecvPacket,
      com.ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecvPacket",
      requestType = com.ibc.core.channel.v1.MsgRecvPacket.class,
      responseType = com.ibc.core.channel.v1.MsgRecvPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgRecvPacket,
      com.ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgRecvPacket, com.ibc.core.channel.v1.MsgRecvPacketResponse> getRecvPacketMethod;
    if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecvPacketMethod = MsgGrpc.getRecvPacketMethod) == null) {
          MsgGrpc.getRecvPacketMethod = getRecvPacketMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgRecvPacket, com.ibc.core.channel.v1.MsgRecvPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecvPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgRecvPacket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgRecvPacketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecvPacket"))
              .build();
        }
      }
    }
    return getRecvPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeout,
      com.ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Timeout",
      requestType = com.ibc.core.channel.v1.MsgTimeout.class,
      responseType = com.ibc.core.channel.v1.MsgTimeoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeout,
      com.ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeout, com.ibc.core.channel.v1.MsgTimeoutResponse> getTimeoutMethod;
    if ((getTimeoutMethod = MsgGrpc.getTimeoutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTimeoutMethod = MsgGrpc.getTimeoutMethod) == null) {
          MsgGrpc.getTimeoutMethod = getTimeoutMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgTimeout, com.ibc.core.channel.v1.MsgTimeoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Timeout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgTimeout.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgTimeoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Timeout"))
              .build();
        }
      }
    }
    return getTimeoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeoutOnClose,
      com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TimeoutOnClose",
      requestType = com.ibc.core.channel.v1.MsgTimeoutOnClose.class,
      responseType = com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeoutOnClose,
      com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgTimeoutOnClose, com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> getTimeoutOnCloseMethod;
    if ((getTimeoutOnCloseMethod = MsgGrpc.getTimeoutOnCloseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTimeoutOnCloseMethod = MsgGrpc.getTimeoutOnCloseMethod) == null) {
          MsgGrpc.getTimeoutOnCloseMethod = getTimeoutOnCloseMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgTimeoutOnClose, com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TimeoutOnClose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgTimeoutOnClose.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TimeoutOnClose"))
              .build();
        }
      }
    }
    return getTimeoutOnCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgAcknowledgement,
      com.ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Acknowledgement",
      requestType = com.ibc.core.channel.v1.MsgAcknowledgement.class,
      responseType = com.ibc.core.channel.v1.MsgAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgAcknowledgement,
      com.ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.MsgAcknowledgement, com.ibc.core.channel.v1.MsgAcknowledgementResponse> getAcknowledgementMethod;
    if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcknowledgementMethod = MsgGrpc.getAcknowledgementMethod) == null) {
          MsgGrpc.getAcknowledgementMethod = getAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.MsgAcknowledgement, com.ibc.core.channel.v1.MsgAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Acknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgAcknowledgement.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.MsgAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Acknowledgement"))
              .build();
        }
      }
    }
    return getAcknowledgementMethod;
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
   * Msg defines the ibc/channel Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    default void channelOpenInit(com.ibc.core.channel.v1.MsgChannelOpenInit request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelOpenInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    default void channelOpenTry(com.ibc.core.channel.v1.MsgChannelOpenTry request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenTryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelOpenTryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    default void channelOpenAck(com.ibc.core.channel.v1.MsgChannelOpenAck request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenAckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelOpenAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    default void channelOpenConfirm(com.ibc.core.channel.v1.MsgChannelOpenConfirm request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelOpenConfirmMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    default void channelCloseInit(com.ibc.core.channel.v1.MsgChannelCloseInit request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelCloseInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for
     * MsgChannelCloseConfirm.
     * </pre>
     */
    default void channelCloseConfirm(com.ibc.core.channel.v1.MsgChannelCloseConfirm request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelCloseConfirmMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    default void recvPacket(com.ibc.core.channel.v1.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgRecvPacketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecvPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    default void timeout(com.ibc.core.channel.v1.MsgTimeout request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTimeoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    default void timeoutOnClose(com.ibc.core.channel.v1.MsgTimeoutOnClose request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTimeoutOnCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    default void acknowledgement(com.ibc.core.channel.v1.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcknowledgementMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public void channelOpenInit(com.ibc.core.channel.v1.MsgChannelOpenInit request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelOpenInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public void channelOpenTry(com.ibc.core.channel.v1.MsgChannelOpenTry request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenTryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelOpenTryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public void channelOpenAck(com.ibc.core.channel.v1.MsgChannelOpenAck request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenAckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelOpenAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public void channelOpenConfirm(com.ibc.core.channel.v1.MsgChannelOpenConfirm request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelOpenConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public void channelCloseInit(com.ibc.core.channel.v1.MsgChannelCloseInit request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelCloseInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for
     * MsgChannelCloseConfirm.
     * </pre>
     */
    public void channelCloseConfirm(com.ibc.core.channel.v1.MsgChannelCloseConfirm request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelCloseConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public void recvPacket(com.ibc.core.channel.v1.MsgRecvPacket request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgRecvPacketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public void timeout(com.ibc.core.channel.v1.MsgTimeout request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public void timeoutOnClose(com.ibc.core.channel.v1.MsgTimeoutOnClose request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTimeoutOnCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public void acknowledgement(com.ibc.core.channel.v1.MsgAcknowledgement request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelOpenInitResponse channelOpenInit(com.ibc.core.channel.v1.MsgChannelOpenInit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelOpenInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelOpenTryResponse channelOpenTry(com.ibc.core.channel.v1.MsgChannelOpenTry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelOpenTryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelOpenAckResponse channelOpenAck(com.ibc.core.channel.v1.MsgChannelOpenAck request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelOpenAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse channelOpenConfirm(com.ibc.core.channel.v1.MsgChannelOpenConfirm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelOpenConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelCloseInitResponse channelCloseInit(com.ibc.core.channel.v1.MsgChannelCloseInit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelCloseInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for
     * MsgChannelCloseConfirm.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse channelCloseConfirm(com.ibc.core.channel.v1.MsgChannelCloseConfirm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelCloseConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgRecvPacketResponse recvPacket(com.ibc.core.channel.v1.MsgRecvPacket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecvPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgTimeoutResponse timeout(com.ibc.core.channel.v1.MsgTimeout request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTimeoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse timeoutOnClose(com.ibc.core.channel.v1.MsgTimeoutOnClose request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTimeoutOnCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public com.ibc.core.channel.v1.MsgAcknowledgementResponse acknowledgement(com.ibc.core.channel.v1.MsgAcknowledgement request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcknowledgementMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the ibc/channel Msg service.
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
     * ChannelOpenInit defines a rpc handler method for MsgChannelOpenInit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelOpenInitResponse> channelOpenInit(
        com.ibc.core.channel.v1.MsgChannelOpenInit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelOpenInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenTry defines a rpc handler method for MsgChannelOpenTry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelOpenTryResponse> channelOpenTry(
        com.ibc.core.channel.v1.MsgChannelOpenTry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelOpenTryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenAck defines a rpc handler method for MsgChannelOpenAck.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelOpenAckResponse> channelOpenAck(
        com.ibc.core.channel.v1.MsgChannelOpenAck request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelOpenAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelOpenConfirm defines a rpc handler method for MsgChannelOpenConfirm.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse> channelOpenConfirm(
        com.ibc.core.channel.v1.MsgChannelOpenConfirm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelOpenConfirmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelCloseInit defines a rpc handler method for MsgChannelCloseInit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelCloseInitResponse> channelCloseInit(
        com.ibc.core.channel.v1.MsgChannelCloseInit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelCloseInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelCloseConfirm defines a rpc handler method for
     * MsgChannelCloseConfirm.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse> channelCloseConfirm(
        com.ibc.core.channel.v1.MsgChannelCloseConfirm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelCloseConfirmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecvPacket defines a rpc handler method for MsgRecvPacket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgRecvPacketResponse> recvPacket(
        com.ibc.core.channel.v1.MsgRecvPacket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecvPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Timeout defines a rpc handler method for MsgTimeout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgTimeoutResponse> timeout(
        com.ibc.core.channel.v1.MsgTimeout request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TimeoutOnClose defines a rpc handler method for MsgTimeoutOnClose.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse> timeoutOnClose(
        com.ibc.core.channel.v1.MsgTimeoutOnClose request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTimeoutOnCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledgement defines a rpc handler method for MsgAcknowledgement.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.MsgAcknowledgementResponse> acknowledgement(
        com.ibc.core.channel.v1.MsgAcknowledgement request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcknowledgementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHANNEL_OPEN_INIT = 0;
  private static final int METHODID_CHANNEL_OPEN_TRY = 1;
  private static final int METHODID_CHANNEL_OPEN_ACK = 2;
  private static final int METHODID_CHANNEL_OPEN_CONFIRM = 3;
  private static final int METHODID_CHANNEL_CLOSE_INIT = 4;
  private static final int METHODID_CHANNEL_CLOSE_CONFIRM = 5;
  private static final int METHODID_RECV_PACKET = 6;
  private static final int METHODID_TIMEOUT = 7;
  private static final int METHODID_TIMEOUT_ON_CLOSE = 8;
  private static final int METHODID_ACKNOWLEDGEMENT = 9;

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
        case METHODID_CHANNEL_OPEN_INIT:
          serviceImpl.channelOpenInit((com.ibc.core.channel.v1.MsgChannelOpenInit) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenInitResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_TRY:
          serviceImpl.channelOpenTry((com.ibc.core.channel.v1.MsgChannelOpenTry) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenTryResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_ACK:
          serviceImpl.channelOpenAck((com.ibc.core.channel.v1.MsgChannelOpenAck) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenAckResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_OPEN_CONFIRM:
          serviceImpl.channelOpenConfirm((com.ibc.core.channel.v1.MsgChannelOpenConfirm) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CLOSE_INIT:
          serviceImpl.channelCloseInit((com.ibc.core.channel.v1.MsgChannelCloseInit) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseInitResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CLOSE_CONFIRM:
          serviceImpl.channelCloseConfirm((com.ibc.core.channel.v1.MsgChannelCloseConfirm) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse>) responseObserver);
          break;
        case METHODID_RECV_PACKET:
          serviceImpl.recvPacket((com.ibc.core.channel.v1.MsgRecvPacket) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgRecvPacketResponse>) responseObserver);
          break;
        case METHODID_TIMEOUT:
          serviceImpl.timeout((com.ibc.core.channel.v1.MsgTimeout) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutResponse>) responseObserver);
          break;
        case METHODID_TIMEOUT_ON_CLOSE:
          serviceImpl.timeoutOnClose((com.ibc.core.channel.v1.MsgTimeoutOnClose) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGEMENT:
          serviceImpl.acknowledgement((com.ibc.core.channel.v1.MsgAcknowledgement) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.MsgAcknowledgementResponse>) responseObserver);
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
          getChannelOpenInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelOpenInit,
              com.ibc.core.channel.v1.MsgChannelOpenInitResponse>(
                service, METHODID_CHANNEL_OPEN_INIT)))
        .addMethod(
          getChannelOpenTryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelOpenTry,
              com.ibc.core.channel.v1.MsgChannelOpenTryResponse>(
                service, METHODID_CHANNEL_OPEN_TRY)))
        .addMethod(
          getChannelOpenAckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelOpenAck,
              com.ibc.core.channel.v1.MsgChannelOpenAckResponse>(
                service, METHODID_CHANNEL_OPEN_ACK)))
        .addMethod(
          getChannelOpenConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelOpenConfirm,
              com.ibc.core.channel.v1.MsgChannelOpenConfirmResponse>(
                service, METHODID_CHANNEL_OPEN_CONFIRM)))
        .addMethod(
          getChannelCloseInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelCloseInit,
              com.ibc.core.channel.v1.MsgChannelCloseInitResponse>(
                service, METHODID_CHANNEL_CLOSE_INIT)))
        .addMethod(
          getChannelCloseConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgChannelCloseConfirm,
              com.ibc.core.channel.v1.MsgChannelCloseConfirmResponse>(
                service, METHODID_CHANNEL_CLOSE_CONFIRM)))
        .addMethod(
          getRecvPacketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgRecvPacket,
              com.ibc.core.channel.v1.MsgRecvPacketResponse>(
                service, METHODID_RECV_PACKET)))
        .addMethod(
          getTimeoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgTimeout,
              com.ibc.core.channel.v1.MsgTimeoutResponse>(
                service, METHODID_TIMEOUT)))
        .addMethod(
          getTimeoutOnCloseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgTimeoutOnClose,
              com.ibc.core.channel.v1.MsgTimeoutOnCloseResponse>(
                service, METHODID_TIMEOUT_ON_CLOSE)))
        .addMethod(
          getAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.MsgAcknowledgement,
              com.ibc.core.channel.v1.MsgAcknowledgementResponse>(
                service, METHODID_ACKNOWLEDGEMENT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ibc.core.channel.v1.TxProto.getDescriptor();
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
              .addMethod(getChannelOpenInitMethod())
              .addMethod(getChannelOpenTryMethod())
              .addMethod(getChannelOpenAckMethod())
              .addMethod(getChannelOpenConfirmMethod())
              .addMethod(getChannelCloseInitMethod())
              .addMethod(getChannelCloseConfirmMethod())
              .addMethod(getRecvPacketMethod())
              .addMethod(getTimeoutMethod())
              .addMethod(getTimeoutOnCloseMethod())
              .addMethod(getAcknowledgementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
