package com.bitsong.fantoken;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: bitsong/fantoken/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "bitsong.fantoken.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgIssue,
      com.bitsong.fantoken.MsgIssueResponse> getIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Issue",
      requestType = com.bitsong.fantoken.MsgIssue.class,
      responseType = com.bitsong.fantoken.MsgIssueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgIssue,
      com.bitsong.fantoken.MsgIssueResponse> getIssueMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgIssue, com.bitsong.fantoken.MsgIssueResponse> getIssueMethod;
    if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
          MsgGrpc.getIssueMethod = getIssueMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgIssue, com.bitsong.fantoken.MsgIssueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Issue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgIssue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgIssueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Issue"))
              .build();
        }
      }
    }
    return getIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgMint,
      com.bitsong.fantoken.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = com.bitsong.fantoken.MsgMint.class,
      responseType = com.bitsong.fantoken.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgMint,
      com.bitsong.fantoken.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgMint, com.bitsong.fantoken.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgMint, com.bitsong.fantoken.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgBurn,
      com.bitsong.fantoken.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = com.bitsong.fantoken.MsgBurn.class,
      responseType = com.bitsong.fantoken.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgBurn,
      com.bitsong.fantoken.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgBurn, com.bitsong.fantoken.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgBurn, com.bitsong.fantoken.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgDisableMint,
      com.bitsong.fantoken.MsgDisableMintResponse> getDisableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableMint",
      requestType = com.bitsong.fantoken.MsgDisableMint.class,
      responseType = com.bitsong.fantoken.MsgDisableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgDisableMint,
      com.bitsong.fantoken.MsgDisableMintResponse> getDisableMintMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgDisableMint, com.bitsong.fantoken.MsgDisableMintResponse> getDisableMintMethod;
    if ((getDisableMintMethod = MsgGrpc.getDisableMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisableMintMethod = MsgGrpc.getDisableMintMethod) == null) {
          MsgGrpc.getDisableMintMethod = getDisableMintMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgDisableMint, com.bitsong.fantoken.MsgDisableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgDisableMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgDisableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisableMint"))
              .build();
        }
      }
    }
    return getDisableMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetMinter,
      com.bitsong.fantoken.MsgSetMinterResponse> getSetMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMinter",
      requestType = com.bitsong.fantoken.MsgSetMinter.class,
      responseType = com.bitsong.fantoken.MsgSetMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetMinter,
      com.bitsong.fantoken.MsgSetMinterResponse> getSetMinterMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetMinter, com.bitsong.fantoken.MsgSetMinterResponse> getSetMinterMethod;
    if ((getSetMinterMethod = MsgGrpc.getSetMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMinterMethod = MsgGrpc.getSetMinterMethod) == null) {
          MsgGrpc.getSetMinterMethod = getSetMinterMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgSetMinter, com.bitsong.fantoken.MsgSetMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMinter"))
              .build();
        }
      }
    }
    return getSetMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetAuthority,
      com.bitsong.fantoken.MsgSetAuthorityResponse> getSetAuthorityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAuthority",
      requestType = com.bitsong.fantoken.MsgSetAuthority.class,
      responseType = com.bitsong.fantoken.MsgSetAuthorityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetAuthority,
      com.bitsong.fantoken.MsgSetAuthorityResponse> getSetAuthorityMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetAuthority, com.bitsong.fantoken.MsgSetAuthorityResponse> getSetAuthorityMethod;
    if ((getSetAuthorityMethod = MsgGrpc.getSetAuthorityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAuthorityMethod = MsgGrpc.getSetAuthorityMethod) == null) {
          MsgGrpc.getSetAuthorityMethod = getSetAuthorityMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgSetAuthority, com.bitsong.fantoken.MsgSetAuthorityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAuthority"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetAuthority.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetAuthorityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAuthority"))
              .build();
        }
      }
    }
    return getSetAuthorityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetUri,
      com.bitsong.fantoken.MsgSetUriResponse> getSetUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUri",
      requestType = com.bitsong.fantoken.MsgSetUri.class,
      responseType = com.bitsong.fantoken.MsgSetUriResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetUri,
      com.bitsong.fantoken.MsgSetUriResponse> getSetUriMethod() {
    io.grpc.MethodDescriptor<com.bitsong.fantoken.MsgSetUri, com.bitsong.fantoken.MsgSetUriResponse> getSetUriMethod;
    if ((getSetUriMethod = MsgGrpc.getSetUriMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUriMethod = MsgGrpc.getSetUriMethod) == null) {
          MsgGrpc.getSetUriMethod = getSetUriMethod =
              io.grpc.MethodDescriptor.<com.bitsong.fantoken.MsgSetUri, com.bitsong.fantoken.MsgSetUriResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetUri.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitsong.fantoken.MsgSetUriResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUri"))
              .build();
        }
      }
    }
    return getSetUriMethod;
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
     * Issue defines a method for issuing a new fan token
     * </pre>
     */
    default void issue(com.bitsong.fantoken.MsgIssue request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgIssueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint defines a method for minting some fan tokens
     * </pre>
     */
    default void mint(com.bitsong.fantoken.MsgMint request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn defines a method for burning some fan tokens
     * </pre>
     */
    default void burn(com.bitsong.fantoken.MsgBurn request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableMint defines a method for disable the mint function
     * </pre>
     */
    default void disableMint(com.bitsong.fantoken.MsgDisableMint request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgDisableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMintMethod(), responseObserver);
    }

    /**
     */
    default void setMinter(com.bitsong.fantoken.MsgSetMinter request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetMinterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMinterMethod(), responseObserver);
    }

    /**
     */
    default void setAuthority(com.bitsong.fantoken.MsgSetAuthority request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetAuthorityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAuthorityMethod(), responseObserver);
    }

    /**
     */
    default void setUri(com.bitsong.fantoken.MsgSetUri request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetUriResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUriMethod(), responseObserver);
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
     * Issue defines a method for issuing a new fan token
     * </pre>
     */
    public void issue(com.bitsong.fantoken.MsgIssue request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgIssueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint defines a method for minting some fan tokens
     * </pre>
     */
    public void mint(com.bitsong.fantoken.MsgMint request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn defines a method for burning some fan tokens
     * </pre>
     */
    public void burn(com.bitsong.fantoken.MsgBurn request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableMint defines a method for disable the mint function
     * </pre>
     */
    public void disableMint(com.bitsong.fantoken.MsgDisableMint request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgDisableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMinter(com.bitsong.fantoken.MsgSetMinter request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetMinterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAuthority(com.bitsong.fantoken.MsgSetAuthority request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetAuthorityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAuthorityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUri(com.bitsong.fantoken.MsgSetUri request,
        io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetUriResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUriMethod(), getCallOptions()), request, responseObserver);
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
     * Issue defines a method for issuing a new fan token
     * </pre>
     */
    public com.bitsong.fantoken.MsgIssueResponse issue(com.bitsong.fantoken.MsgIssue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint defines a method for minting some fan tokens
     * </pre>
     */
    public com.bitsong.fantoken.MsgMintResponse mint(com.bitsong.fantoken.MsgMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn defines a method for burning some fan tokens
     * </pre>
     */
    public com.bitsong.fantoken.MsgBurnResponse burn(com.bitsong.fantoken.MsgBurn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableMint defines a method for disable the mint function
     * </pre>
     */
    public com.bitsong.fantoken.MsgDisableMintResponse disableMint(com.bitsong.fantoken.MsgDisableMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitsong.fantoken.MsgSetMinterResponse setMinter(com.bitsong.fantoken.MsgSetMinter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitsong.fantoken.MsgSetAuthorityResponse setAuthority(com.bitsong.fantoken.MsgSetAuthority request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAuthorityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitsong.fantoken.MsgSetUriResponse setUri(com.bitsong.fantoken.MsgSetUri request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUriMethod(), getCallOptions(), request);
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
     * Issue defines a method for issuing a new fan token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgIssueResponse> issue(
        com.bitsong.fantoken.MsgIssue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint defines a method for minting some fan tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgMintResponse> mint(
        com.bitsong.fantoken.MsgMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn defines a method for burning some fan tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgBurnResponse> burn(
        com.bitsong.fantoken.MsgBurn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableMint defines a method for disable the mint function
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgDisableMintResponse> disableMint(
        com.bitsong.fantoken.MsgDisableMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgSetMinterResponse> setMinter(
        com.bitsong.fantoken.MsgSetMinter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgSetAuthorityResponse> setAuthority(
        com.bitsong.fantoken.MsgSetAuthority request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAuthorityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitsong.fantoken.MsgSetUriResponse> setUri(
        com.bitsong.fantoken.MsgSetUri request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUriMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_DISABLE_MINT = 3;
  private static final int METHODID_SET_MINTER = 4;
  private static final int METHODID_SET_AUTHORITY = 5;
  private static final int METHODID_SET_URI = 6;

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
        case METHODID_ISSUE:
          serviceImpl.issue((com.bitsong.fantoken.MsgIssue) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgIssueResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((com.bitsong.fantoken.MsgMint) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((com.bitsong.fantoken.MsgBurn) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_DISABLE_MINT:
          serviceImpl.disableMint((com.bitsong.fantoken.MsgDisableMint) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgDisableMintResponse>) responseObserver);
          break;
        case METHODID_SET_MINTER:
          serviceImpl.setMinter((com.bitsong.fantoken.MsgSetMinter) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetMinterResponse>) responseObserver);
          break;
        case METHODID_SET_AUTHORITY:
          serviceImpl.setAuthority((com.bitsong.fantoken.MsgSetAuthority) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetAuthorityResponse>) responseObserver);
          break;
        case METHODID_SET_URI:
          serviceImpl.setUri((com.bitsong.fantoken.MsgSetUri) request,
              (io.grpc.stub.StreamObserver<com.bitsong.fantoken.MsgSetUriResponse>) responseObserver);
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
          getIssueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgIssue,
              com.bitsong.fantoken.MsgIssueResponse>(
                service, METHODID_ISSUE)))
        .addMethod(
          getMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgMint,
              com.bitsong.fantoken.MsgMintResponse>(
                service, METHODID_MINT)))
        .addMethod(
          getBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgBurn,
              com.bitsong.fantoken.MsgBurnResponse>(
                service, METHODID_BURN)))
        .addMethod(
          getDisableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgDisableMint,
              com.bitsong.fantoken.MsgDisableMintResponse>(
                service, METHODID_DISABLE_MINT)))
        .addMethod(
          getSetMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgSetMinter,
              com.bitsong.fantoken.MsgSetMinterResponse>(
                service, METHODID_SET_MINTER)))
        .addMethod(
          getSetAuthorityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgSetAuthority,
              com.bitsong.fantoken.MsgSetAuthorityResponse>(
                service, METHODID_SET_AUTHORITY)))
        .addMethod(
          getSetUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitsong.fantoken.MsgSetUri,
              com.bitsong.fantoken.MsgSetUriResponse>(
                service, METHODID_SET_URI)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bitsong.fantoken.TxProto.getDescriptor();
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
              .addMethod(getIssueMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getDisableMintMethod())
              .addMethod(getSetMinterMethod())
              .addMethod(getSetAuthorityMethod())
              .addMethod(getSetUriMethod())
              .build();
        }
      }
    }
    return result;
  }
}
