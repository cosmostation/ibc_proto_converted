package com.irismod.token;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/token/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.token.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.token.MsgIssueToken,
      com.irismod.token.MsgIssueTokenResponse> getIssueTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueToken",
      requestType = com.irismod.token.MsgIssueToken.class,
      responseType = com.irismod.token.MsgIssueTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.MsgIssueToken,
      com.irismod.token.MsgIssueTokenResponse> getIssueTokenMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.MsgIssueToken, com.irismod.token.MsgIssueTokenResponse> getIssueTokenMethod;
    if ((getIssueTokenMethod = MsgGrpc.getIssueTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueTokenMethod = MsgGrpc.getIssueTokenMethod) == null) {
          MsgGrpc.getIssueTokenMethod = getIssueTokenMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.MsgIssueToken, com.irismod.token.MsgIssueTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgIssueToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgIssueTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueToken"))
              .build();
        }
      }
    }
    return getIssueTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.MsgEditToken,
      com.irismod.token.MsgEditTokenResponse> getEditTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditToken",
      requestType = com.irismod.token.MsgEditToken.class,
      responseType = com.irismod.token.MsgEditTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.MsgEditToken,
      com.irismod.token.MsgEditTokenResponse> getEditTokenMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.MsgEditToken, com.irismod.token.MsgEditTokenResponse> getEditTokenMethod;
    if ((getEditTokenMethod = MsgGrpc.getEditTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditTokenMethod = MsgGrpc.getEditTokenMethod) == null) {
          MsgGrpc.getEditTokenMethod = getEditTokenMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.MsgEditToken, com.irismod.token.MsgEditTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgEditToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgEditTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditToken"))
              .build();
        }
      }
    }
    return getEditTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.MsgMintToken,
      com.irismod.token.MsgMintTokenResponse> getMintTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintToken",
      requestType = com.irismod.token.MsgMintToken.class,
      responseType = com.irismod.token.MsgMintTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.MsgMintToken,
      com.irismod.token.MsgMintTokenResponse> getMintTokenMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.MsgMintToken, com.irismod.token.MsgMintTokenResponse> getMintTokenMethod;
    if ((getMintTokenMethod = MsgGrpc.getMintTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintTokenMethod = MsgGrpc.getMintTokenMethod) == null) {
          MsgGrpc.getMintTokenMethod = getMintTokenMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.MsgMintToken, com.irismod.token.MsgMintTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgMintToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgMintTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintToken"))
              .build();
        }
      }
    }
    return getMintTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.MsgBurnToken,
      com.irismod.token.MsgBurnTokenResponse> getBurnTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnToken",
      requestType = com.irismod.token.MsgBurnToken.class,
      responseType = com.irismod.token.MsgBurnTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.MsgBurnToken,
      com.irismod.token.MsgBurnTokenResponse> getBurnTokenMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.MsgBurnToken, com.irismod.token.MsgBurnTokenResponse> getBurnTokenMethod;
    if ((getBurnTokenMethod = MsgGrpc.getBurnTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnTokenMethod = MsgGrpc.getBurnTokenMethod) == null) {
          MsgGrpc.getBurnTokenMethod = getBurnTokenMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.MsgBurnToken, com.irismod.token.MsgBurnTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgBurnToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgBurnTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnToken"))
              .build();
        }
      }
    }
    return getBurnTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.token.MsgTransferTokenOwner,
      com.irismod.token.MsgTransferTokenOwnerResponse> getTransferTokenOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferTokenOwner",
      requestType = com.irismod.token.MsgTransferTokenOwner.class,
      responseType = com.irismod.token.MsgTransferTokenOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.token.MsgTransferTokenOwner,
      com.irismod.token.MsgTransferTokenOwnerResponse> getTransferTokenOwnerMethod() {
    io.grpc.MethodDescriptor<com.irismod.token.MsgTransferTokenOwner, com.irismod.token.MsgTransferTokenOwnerResponse> getTransferTokenOwnerMethod;
    if ((getTransferTokenOwnerMethod = MsgGrpc.getTransferTokenOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferTokenOwnerMethod = MsgGrpc.getTransferTokenOwnerMethod) == null) {
          MsgGrpc.getTransferTokenOwnerMethod = getTransferTokenOwnerMethod =
              io.grpc.MethodDescriptor.<com.irismod.token.MsgTransferTokenOwner, com.irismod.token.MsgTransferTokenOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferTokenOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgTransferTokenOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.token.MsgTransferTokenOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferTokenOwner"))
              .build();
        }
      }
    }
    return getTransferTokenOwnerMethod;
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
     * IssueToken defines a method for issuing a new token
     * </pre>
     */
    default void issueToken(com.irismod.token.MsgIssueToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgIssueTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditToken defines a method for editing a token
     * </pre>
     */
    default void editToken(com.irismod.token.MsgEditToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgEditTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * MintToken defines a method for minting some tokens
     * </pre>
     */
    default void mintToken(com.irismod.token.MsgMintToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgMintTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * BurnToken defines a method for burning some tokens
     * </pre>
     */
    default void burnToken(com.irismod.token.MsgBurnToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgBurnTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferTokenOwner defines a method for minting some tokens
     * </pre>
     */
    default void transferTokenOwner(com.irismod.token.MsgTransferTokenOwner request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgTransferTokenOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferTokenOwnerMethod(), responseObserver);
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
     * IssueToken defines a method for issuing a new token
     * </pre>
     */
    public void issueToken(com.irismod.token.MsgIssueToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgIssueTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditToken defines a method for editing a token
     * </pre>
     */
    public void editToken(com.irismod.token.MsgEditToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgEditTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MintToken defines a method for minting some tokens
     * </pre>
     */
    public void mintToken(com.irismod.token.MsgMintToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgMintTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BurnToken defines a method for burning some tokens
     * </pre>
     */
    public void burnToken(com.irismod.token.MsgBurnToken request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgBurnTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferTokenOwner defines a method for minting some tokens
     * </pre>
     */
    public void transferTokenOwner(com.irismod.token.MsgTransferTokenOwner request,
        io.grpc.stub.StreamObserver<com.irismod.token.MsgTransferTokenOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferTokenOwnerMethod(), getCallOptions()), request, responseObserver);
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
     * IssueToken defines a method for issuing a new token
     * </pre>
     */
    public com.irismod.token.MsgIssueTokenResponse issueToken(com.irismod.token.MsgIssueToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditToken defines a method for editing a token
     * </pre>
     */
    public com.irismod.token.MsgEditTokenResponse editToken(com.irismod.token.MsgEditToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MintToken defines a method for minting some tokens
     * </pre>
     */
    public com.irismod.token.MsgMintTokenResponse mintToken(com.irismod.token.MsgMintToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BurnToken defines a method for burning some tokens
     * </pre>
     */
    public com.irismod.token.MsgBurnTokenResponse burnToken(com.irismod.token.MsgBurnToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferTokenOwner defines a method for minting some tokens
     * </pre>
     */
    public com.irismod.token.MsgTransferTokenOwnerResponse transferTokenOwner(com.irismod.token.MsgTransferTokenOwner request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferTokenOwnerMethod(), getCallOptions(), request);
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
     * IssueToken defines a method for issuing a new token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.MsgIssueTokenResponse> issueToken(
        com.irismod.token.MsgIssueToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditToken defines a method for editing a token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.MsgEditTokenResponse> editToken(
        com.irismod.token.MsgEditToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MintToken defines a method for minting some tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.MsgMintTokenResponse> mintToken(
        com.irismod.token.MsgMintToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BurnToken defines a method for burning some tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.MsgBurnTokenResponse> burnToken(
        com.irismod.token.MsgBurnToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferTokenOwner defines a method for minting some tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.token.MsgTransferTokenOwnerResponse> transferTokenOwner(
        com.irismod.token.MsgTransferTokenOwner request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferTokenOwnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_TOKEN = 0;
  private static final int METHODID_EDIT_TOKEN = 1;
  private static final int METHODID_MINT_TOKEN = 2;
  private static final int METHODID_BURN_TOKEN = 3;
  private static final int METHODID_TRANSFER_TOKEN_OWNER = 4;

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
        case METHODID_ISSUE_TOKEN:
          serviceImpl.issueToken((com.irismod.token.MsgIssueToken) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.MsgIssueTokenResponse>) responseObserver);
          break;
        case METHODID_EDIT_TOKEN:
          serviceImpl.editToken((com.irismod.token.MsgEditToken) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.MsgEditTokenResponse>) responseObserver);
          break;
        case METHODID_MINT_TOKEN:
          serviceImpl.mintToken((com.irismod.token.MsgMintToken) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.MsgMintTokenResponse>) responseObserver);
          break;
        case METHODID_BURN_TOKEN:
          serviceImpl.burnToken((com.irismod.token.MsgBurnToken) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.MsgBurnTokenResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_TOKEN_OWNER:
          serviceImpl.transferTokenOwner((com.irismod.token.MsgTransferTokenOwner) request,
              (io.grpc.stub.StreamObserver<com.irismod.token.MsgTransferTokenOwnerResponse>) responseObserver);
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
          getIssueTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.MsgIssueToken,
              com.irismod.token.MsgIssueTokenResponse>(
                service, METHODID_ISSUE_TOKEN)))
        .addMethod(
          getEditTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.MsgEditToken,
              com.irismod.token.MsgEditTokenResponse>(
                service, METHODID_EDIT_TOKEN)))
        .addMethod(
          getMintTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.MsgMintToken,
              com.irismod.token.MsgMintTokenResponse>(
                service, METHODID_MINT_TOKEN)))
        .addMethod(
          getBurnTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.MsgBurnToken,
              com.irismod.token.MsgBurnTokenResponse>(
                service, METHODID_BURN_TOKEN)))
        .addMethod(
          getTransferTokenOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.token.MsgTransferTokenOwner,
              com.irismod.token.MsgTransferTokenOwnerResponse>(
                service, METHODID_TRANSFER_TOKEN_OWNER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.token.TxProto.getDescriptor();
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
              .addMethod(getIssueTokenMethod())
              .addMethod(getEditTokenMethod())
              .addMethod(getMintTokenMethod())
              .addMethod(getBurnTokenMethod())
              .addMethod(getTransferTokenOwnerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
