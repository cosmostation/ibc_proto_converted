package com.ixo.token.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the project Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/token/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ixo.token.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCreateToken,
      com.ixo.token.v1beta1.MsgCreateTokenResponse> getCreateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateToken",
      requestType = com.ixo.token.v1beta1.MsgCreateToken.class,
      responseType = com.ixo.token.v1beta1.MsgCreateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCreateToken,
      com.ixo.token.v1beta1.MsgCreateTokenResponse> getCreateTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCreateToken, com.ixo.token.v1beta1.MsgCreateTokenResponse> getCreateTokenMethod;
    if ((getCreateTokenMethod = MsgGrpc.getCreateTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTokenMethod = MsgGrpc.getCreateTokenMethod) == null) {
          MsgGrpc.getCreateTokenMethod = getCreateTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgCreateToken, com.ixo.token.v1beta1.MsgCreateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgCreateToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgCreateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateToken"))
              .build();
        }
      }
    }
    return getCreateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgMintToken,
      com.ixo.token.v1beta1.MsgMintTokenResponse> getMintTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintToken",
      requestType = com.ixo.token.v1beta1.MsgMintToken.class,
      responseType = com.ixo.token.v1beta1.MsgMintTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgMintToken,
      com.ixo.token.v1beta1.MsgMintTokenResponse> getMintTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgMintToken, com.ixo.token.v1beta1.MsgMintTokenResponse> getMintTokenMethod;
    if ((getMintTokenMethod = MsgGrpc.getMintTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintTokenMethod = MsgGrpc.getMintTokenMethod) == null) {
          MsgGrpc.getMintTokenMethod = getMintTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgMintToken, com.ixo.token.v1beta1.MsgMintTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgMintToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgMintTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintToken"))
              .build();
        }
      }
    }
    return getMintTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgTransferToken,
      com.ixo.token.v1beta1.MsgTransferTokenResponse> getTransferTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferToken",
      requestType = com.ixo.token.v1beta1.MsgTransferToken.class,
      responseType = com.ixo.token.v1beta1.MsgTransferTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgTransferToken,
      com.ixo.token.v1beta1.MsgTransferTokenResponse> getTransferTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgTransferToken, com.ixo.token.v1beta1.MsgTransferTokenResponse> getTransferTokenMethod;
    if ((getTransferTokenMethod = MsgGrpc.getTransferTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferTokenMethod = MsgGrpc.getTransferTokenMethod) == null) {
          MsgGrpc.getTransferTokenMethod = getTransferTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgTransferToken, com.ixo.token.v1beta1.MsgTransferTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgTransferToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgTransferTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferToken"))
              .build();
        }
      }
    }
    return getTransferTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgRetireToken,
      com.ixo.token.v1beta1.MsgRetireTokenResponse> getRetireTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetireToken",
      requestType = com.ixo.token.v1beta1.MsgRetireToken.class,
      responseType = com.ixo.token.v1beta1.MsgRetireTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgRetireToken,
      com.ixo.token.v1beta1.MsgRetireTokenResponse> getRetireTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgRetireToken, com.ixo.token.v1beta1.MsgRetireTokenResponse> getRetireTokenMethod;
    if ((getRetireTokenMethod = MsgGrpc.getRetireTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRetireTokenMethod = MsgGrpc.getRetireTokenMethod) == null) {
          MsgGrpc.getRetireTokenMethod = getRetireTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgRetireToken, com.ixo.token.v1beta1.MsgRetireTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetireToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgRetireToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgRetireTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RetireToken"))
              .build();
        }
      }
    }
    return getRetireTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCancelToken,
      com.ixo.token.v1beta1.MsgCancelTokenResponse> getCancelTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelToken",
      requestType = com.ixo.token.v1beta1.MsgCancelToken.class,
      responseType = com.ixo.token.v1beta1.MsgCancelTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCancelToken,
      com.ixo.token.v1beta1.MsgCancelTokenResponse> getCancelTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgCancelToken, com.ixo.token.v1beta1.MsgCancelTokenResponse> getCancelTokenMethod;
    if ((getCancelTokenMethod = MsgGrpc.getCancelTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelTokenMethod = MsgGrpc.getCancelTokenMethod) == null) {
          MsgGrpc.getCancelTokenMethod = getCancelTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgCancelToken, com.ixo.token.v1beta1.MsgCancelTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgCancelToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgCancelTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelToken"))
              .build();
        }
      }
    }
    return getCancelTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgPauseToken,
      com.ixo.token.v1beta1.MsgPauseTokenResponse> getPauseTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseToken",
      requestType = com.ixo.token.v1beta1.MsgPauseToken.class,
      responseType = com.ixo.token.v1beta1.MsgPauseTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgPauseToken,
      com.ixo.token.v1beta1.MsgPauseTokenResponse> getPauseTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgPauseToken, com.ixo.token.v1beta1.MsgPauseTokenResponse> getPauseTokenMethod;
    if ((getPauseTokenMethod = MsgGrpc.getPauseTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseTokenMethod = MsgGrpc.getPauseTokenMethod) == null) {
          MsgGrpc.getPauseTokenMethod = getPauseTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgPauseToken, com.ixo.token.v1beta1.MsgPauseTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgPauseToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgPauseTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseToken"))
              .build();
        }
      }
    }
    return getPauseTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgStopToken,
      com.ixo.token.v1beta1.MsgStopTokenResponse> getStopTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopToken",
      requestType = com.ixo.token.v1beta1.MsgStopToken.class,
      responseType = com.ixo.token.v1beta1.MsgStopTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgStopToken,
      com.ixo.token.v1beta1.MsgStopTokenResponse> getStopTokenMethod() {
    io.grpc.MethodDescriptor<com.ixo.token.v1beta1.MsgStopToken, com.ixo.token.v1beta1.MsgStopTokenResponse> getStopTokenMethod;
    if ((getStopTokenMethod = MsgGrpc.getStopTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStopTokenMethod = MsgGrpc.getStopTokenMethod) == null) {
          MsgGrpc.getStopTokenMethod = getStopTokenMethod =
              io.grpc.MethodDescriptor.<com.ixo.token.v1beta1.MsgStopToken, com.ixo.token.v1beta1.MsgStopTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgStopToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.token.v1beta1.MsgStopTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StopToken"))
              .build();
        }
      }
    }
    return getStopTokenMethod;
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
   * Msg defines the project Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createToken(com.ixo.token.v1beta1.MsgCreateToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCreateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTokenMethod(), responseObserver);
    }

    /**
     */
    default void mintToken(com.ixo.token.v1beta1.MsgMintToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgMintTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintTokenMethod(), responseObserver);
    }

    /**
     */
    default void transferToken(com.ixo.token.v1beta1.MsgTransferToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgTransferTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferTokenMethod(), responseObserver);
    }

    /**
     */
    default void retireToken(com.ixo.token.v1beta1.MsgRetireToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgRetireTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetireTokenMethod(), responseObserver);
    }

    /**
     */
    default void cancelToken(com.ixo.token.v1beta1.MsgCancelToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCancelTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTokenMethod(), responseObserver);
    }

    /**
     */
    default void pauseToken(com.ixo.token.v1beta1.MsgPauseToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgPauseTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseTokenMethod(), responseObserver);
    }

    /**
     */
    default void stopToken(com.ixo.token.v1beta1.MsgStopToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgStopTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the project Msg service.
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
   * Msg defines the project Msg service.
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
    public void createToken(com.ixo.token.v1beta1.MsgCreateToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCreateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mintToken(com.ixo.token.v1beta1.MsgMintToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgMintTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferToken(com.ixo.token.v1beta1.MsgTransferToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgTransferTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retireToken(com.ixo.token.v1beta1.MsgRetireToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgRetireTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetireTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelToken(com.ixo.token.v1beta1.MsgCancelToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCancelTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pauseToken(com.ixo.token.v1beta1.MsgPauseToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgPauseTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopToken(com.ixo.token.v1beta1.MsgStopToken request,
        io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgStopTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the project Msg service.
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
    public com.ixo.token.v1beta1.MsgCreateTokenResponse createToken(com.ixo.token.v1beta1.MsgCreateToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgMintTokenResponse mintToken(com.ixo.token.v1beta1.MsgMintToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgTransferTokenResponse transferToken(com.ixo.token.v1beta1.MsgTransferToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgRetireTokenResponse retireToken(com.ixo.token.v1beta1.MsgRetireToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetireTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgCancelTokenResponse cancelToken(com.ixo.token.v1beta1.MsgCancelToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgPauseTokenResponse pauseToken(com.ixo.token.v1beta1.MsgPauseToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.token.v1beta1.MsgStopTokenResponse stopToken(com.ixo.token.v1beta1.MsgStopToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the project Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgCreateTokenResponse> createToken(
        com.ixo.token.v1beta1.MsgCreateToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgMintTokenResponse> mintToken(
        com.ixo.token.v1beta1.MsgMintToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgTransferTokenResponse> transferToken(
        com.ixo.token.v1beta1.MsgTransferToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgRetireTokenResponse> retireToken(
        com.ixo.token.v1beta1.MsgRetireToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetireTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgCancelTokenResponse> cancelToken(
        com.ixo.token.v1beta1.MsgCancelToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgPauseTokenResponse> pauseToken(
        com.ixo.token.v1beta1.MsgPauseToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.token.v1beta1.MsgStopTokenResponse> stopToken(
        com.ixo.token.v1beta1.MsgStopToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOKEN = 0;
  private static final int METHODID_MINT_TOKEN = 1;
  private static final int METHODID_TRANSFER_TOKEN = 2;
  private static final int METHODID_RETIRE_TOKEN = 3;
  private static final int METHODID_CANCEL_TOKEN = 4;
  private static final int METHODID_PAUSE_TOKEN = 5;
  private static final int METHODID_STOP_TOKEN = 6;

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
        case METHODID_CREATE_TOKEN:
          serviceImpl.createToken((com.ixo.token.v1beta1.MsgCreateToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCreateTokenResponse>) responseObserver);
          break;
        case METHODID_MINT_TOKEN:
          serviceImpl.mintToken((com.ixo.token.v1beta1.MsgMintToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgMintTokenResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TOKEN:
          serviceImpl.transferToken((com.ixo.token.v1beta1.MsgTransferToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgTransferTokenResponse>) responseObserver);
          break;
        case METHODID_RETIRE_TOKEN:
          serviceImpl.retireToken((com.ixo.token.v1beta1.MsgRetireToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgRetireTokenResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TOKEN:
          serviceImpl.cancelToken((com.ixo.token.v1beta1.MsgCancelToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgCancelTokenResponse>) responseObserver);
          break;
        case METHODID_PAUSE_TOKEN:
          serviceImpl.pauseToken((com.ixo.token.v1beta1.MsgPauseToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgPauseTokenResponse>) responseObserver);
          break;
        case METHODID_STOP_TOKEN:
          serviceImpl.stopToken((com.ixo.token.v1beta1.MsgStopToken) request,
              (io.grpc.stub.StreamObserver<com.ixo.token.v1beta1.MsgStopTokenResponse>) responseObserver);
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
          getCreateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgCreateToken,
              com.ixo.token.v1beta1.MsgCreateTokenResponse>(
                service, METHODID_CREATE_TOKEN)))
        .addMethod(
          getMintTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgMintToken,
              com.ixo.token.v1beta1.MsgMintTokenResponse>(
                service, METHODID_MINT_TOKEN)))
        .addMethod(
          getTransferTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgTransferToken,
              com.ixo.token.v1beta1.MsgTransferTokenResponse>(
                service, METHODID_TRANSFER_TOKEN)))
        .addMethod(
          getRetireTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgRetireToken,
              com.ixo.token.v1beta1.MsgRetireTokenResponse>(
                service, METHODID_RETIRE_TOKEN)))
        .addMethod(
          getCancelTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgCancelToken,
              com.ixo.token.v1beta1.MsgCancelTokenResponse>(
                service, METHODID_CANCEL_TOKEN)))
        .addMethod(
          getPauseTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgPauseToken,
              com.ixo.token.v1beta1.MsgPauseTokenResponse>(
                service, METHODID_PAUSE_TOKEN)))
        .addMethod(
          getStopTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.token.v1beta1.MsgStopToken,
              com.ixo.token.v1beta1.MsgStopTokenResponse>(
                service, METHODID_STOP_TOKEN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.token.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateTokenMethod())
              .addMethod(getMintTokenMethod())
              .addMethod(getTransferTokenMethod())
              .addMethod(getRetireTokenMethod())
              .addMethod(getCancelTokenMethod())
              .addMethod(getPauseTokenMethod())
              .addMethod(getStopTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
