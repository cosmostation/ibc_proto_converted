package com.axelar.multisig.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the multisig Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/multisig/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.multisig.v1beta1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest,
      com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> getStartKeygenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartKeygen",
      requestType = com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest,
      com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> getStartKeygenMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest, com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> getStartKeygenMethod;
    if ((getStartKeygenMethod = MsgServiceGrpc.getStartKeygenMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getStartKeygenMethod = MsgServiceGrpc.getStartKeygenMethod) == null) {
          MsgServiceGrpc.getStartKeygenMethod = getStartKeygenMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest, com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartKeygen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("StartKeygen"))
              .build();
        }
      }
    }
    return getStartKeygenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest,
      com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> getSubmitPubKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitPubKey",
      requestType = com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest,
      com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> getSubmitPubKeyMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest, com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> getSubmitPubKeyMethod;
    if ((getSubmitPubKeyMethod = MsgServiceGrpc.getSubmitPubKeyMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getSubmitPubKeyMethod = MsgServiceGrpc.getSubmitPubKeyMethod) == null) {
          MsgServiceGrpc.getSubmitPubKeyMethod = getSubmitPubKeyMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest, com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitPubKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("SubmitPubKey"))
              .build();
        }
      }
    }
    return getSubmitPubKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest,
      com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> getSubmitSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitSignature",
      requestType = com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest,
      com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> getSubmitSignatureMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest, com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> getSubmitSignatureMethod;
    if ((getSubmitSignatureMethod = MsgServiceGrpc.getSubmitSignatureMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getSubmitSignatureMethod = MsgServiceGrpc.getSubmitSignatureMethod) == null) {
          MsgServiceGrpc.getSubmitSignatureMethod = getSubmitSignatureMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest, com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("SubmitSignature"))
              .build();
        }
      }
    }
    return getSubmitSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest,
      com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> getRotateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RotateKey",
      requestType = com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest,
      com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> getRotateKeyMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest, com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> getRotateKeyMethod;
    if ((getRotateKeyMethod = MsgServiceGrpc.getRotateKeyMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRotateKeyMethod = MsgServiceGrpc.getRotateKeyMethod) == null) {
          MsgServiceGrpc.getRotateKeyMethod = getRotateKeyMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest, com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RotateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RotateKey"))
              .build();
        }
      }
    }
    return getRotateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest,
      com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> getKeygenOptOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeygenOptOut",
      requestType = com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest,
      com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> getKeygenOptOutMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest, com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> getKeygenOptOutMethod;
    if ((getKeygenOptOutMethod = MsgServiceGrpc.getKeygenOptOutMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getKeygenOptOutMethod = MsgServiceGrpc.getKeygenOptOutMethod) == null) {
          MsgServiceGrpc.getKeygenOptOutMethod = getKeygenOptOutMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest, com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeygenOptOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("KeygenOptOut"))
              .build();
        }
      }
    }
    return getKeygenOptOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest,
      com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> getKeygenOptInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeygenOptIn",
      requestType = com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest.class,
      responseType = com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest,
      com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> getKeygenOptInMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest, com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> getKeygenOptInMethod;
    if ((getKeygenOptInMethod = MsgServiceGrpc.getKeygenOptInMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getKeygenOptInMethod = MsgServiceGrpc.getKeygenOptInMethod) == null) {
          MsgServiceGrpc.getKeygenOptInMethod = getKeygenOptInMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest, com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeygenOptIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("KeygenOptIn"))
              .build();
        }
      }
    }
    return getKeygenOptInMethod;
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
   * <pre>
   * Msg defines the multisig Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void startKeygen(com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartKeygenMethod(), responseObserver);
    }

    /**
     */
    default void submitPubKey(com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitPubKeyMethod(), responseObserver);
    }

    /**
     */
    default void submitSignature(com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitSignatureMethod(), responseObserver);
    }

    /**
     */
    default void rotateKey(com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRotateKeyMethod(), responseObserver);
    }

    /**
     */
    default void keygenOptOut(com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeygenOptOutMethod(), responseObserver);
    }

    /**
     */
    default void keygenOptIn(com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeygenOptInMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   * <pre>
   * Msg defines the multisig Msg service.
   * </pre>
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the multisig Msg service.
   * </pre>
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
    public void startKeygen(com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartKeygenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitPubKey(com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitPubKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitSignature(com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rotateKey(com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void keygenOptOut(com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeygenOptOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void keygenOptIn(com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeygenOptInMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the multisig Msg service.
   * </pre>
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
    public com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse startKeygen(com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartKeygenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse submitPubKey(com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitPubKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse submitSignature(com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitSignatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse rotateKey(com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRotateKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse keygenOptOut(com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeygenOptOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse keygenOptIn(com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeygenOptInMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   * <pre>
   * Msg defines the multisig Msg service.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse> startKeygen(
        com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartKeygenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse> submitPubKey(
        com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitPubKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse> submitSignature(
        com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitSignatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse> rotateKey(
        com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRotateKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse> keygenOptOut(
        com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeygenOptOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse> keygenOptIn(
        com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeygenOptInMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_KEYGEN = 0;
  private static final int METHODID_SUBMIT_PUB_KEY = 1;
  private static final int METHODID_SUBMIT_SIGNATURE = 2;
  private static final int METHODID_ROTATE_KEY = 3;
  private static final int METHODID_KEYGEN_OPT_OUT = 4;
  private static final int METHODID_KEYGEN_OPT_IN = 5;

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
        case METHODID_START_KEYGEN:
          serviceImpl.startKeygen((com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_PUB_KEY:
          serviceImpl.submitPubKey((com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_SIGNATURE:
          serviceImpl.submitSignature((com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse>) responseObserver);
          break;
        case METHODID_ROTATE_KEY:
          serviceImpl.rotateKey((com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse>) responseObserver);
          break;
        case METHODID_KEYGEN_OPT_OUT:
          serviceImpl.keygenOptOut((com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse>) responseObserver);
          break;
        case METHODID_KEYGEN_OPT_IN:
          serviceImpl.keygenOptIn((com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse>) responseObserver);
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
          getStartKeygenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.StartKeygenRequest,
              com.axelar.multisig.v1beta1.TxProto.StartKeygenResponse>(
                service, METHODID_START_KEYGEN)))
        .addMethod(
          getSubmitPubKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyRequest,
              com.axelar.multisig.v1beta1.TxProto.SubmitPubKeyResponse>(
                service, METHODID_SUBMIT_PUB_KEY)))
        .addMethod(
          getSubmitSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.SubmitSignatureRequest,
              com.axelar.multisig.v1beta1.TxProto.SubmitSignatureResponse>(
                service, METHODID_SUBMIT_SIGNATURE)))
        .addMethod(
          getRotateKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.RotateKeyRequest,
              com.axelar.multisig.v1beta1.TxProto.RotateKeyResponse>(
                service, METHODID_ROTATE_KEY)))
        .addMethod(
          getKeygenOptOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.KeygenOptOutRequest,
              com.axelar.multisig.v1beta1.TxProto.KeygenOptOutResponse>(
                service, METHODID_KEYGEN_OPT_OUT)))
        .addMethod(
          getKeygenOptInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.TxProto.KeygenOptInRequest,
              com.axelar.multisig.v1beta1.TxProto.KeygenOptInResponse>(
                service, METHODID_KEYGEN_OPT_IN)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.multisig.v1beta1.ServiceProto.getDescriptor();
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
              .addMethod(getStartKeygenMethod())
              .addMethod(getSubmitPubKeyMethod())
              .addMethod(getSubmitSignatureMethod())
              .addMethod(getRotateKeyMethod())
              .addMethod(getKeygenOptOutMethod())
              .addMethod(getKeygenOptInMethod())
              .build();
        }
      }
    }
    return result;
  }
}
