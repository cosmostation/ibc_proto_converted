package com.coreum.asset.ft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: coreum/asset/ft/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.ft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgIssue,
      com.coreum.asset.ft.v1.EmptyResponse> getIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Issue",
      requestType = com.coreum.asset.ft.v1.MsgIssue.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgIssue,
      com.coreum.asset.ft.v1.EmptyResponse> getIssueMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgIssue, com.coreum.asset.ft.v1.EmptyResponse> getIssueMethod;
    if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueMethod = MsgGrpc.getIssueMethod) == null) {
          MsgGrpc.getIssueMethod = getIssueMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgIssue, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Issue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgIssue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Issue"))
              .build();
        }
      }
    }
    return getIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgMint,
      com.coreum.asset.ft.v1.EmptyResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = com.coreum.asset.ft.v1.MsgMint.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgMint,
      com.coreum.asset.ft.v1.EmptyResponse> getMintMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgMint, com.coreum.asset.ft.v1.EmptyResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgMint, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgBurn,
      com.coreum.asset.ft.v1.EmptyResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = com.coreum.asset.ft.v1.MsgBurn.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgBurn,
      com.coreum.asset.ft.v1.EmptyResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgBurn, com.coreum.asset.ft.v1.EmptyResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgBurn, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgFreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Freeze",
      requestType = com.coreum.asset.ft.v1.MsgFreeze.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgFreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getFreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgFreeze, com.coreum.asset.ft.v1.EmptyResponse> getFreezeMethod;
    if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
          MsgGrpc.getFreezeMethod = getFreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgFreeze, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Freeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Freeze"))
              .build();
        }
      }
    }
    return getFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgUnfreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfreeze",
      requestType = com.coreum.asset.ft.v1.MsgUnfreeze.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgUnfreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getUnfreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgUnfreeze, com.coreum.asset.ft.v1.EmptyResponse> getUnfreezeMethod;
    if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
          MsgGrpc.getUnfreezeMethod = getUnfreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgUnfreeze, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfreeze"))
              .build();
        }
      }
    }
    return getUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyFreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getGloballyFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GloballyFreeze",
      requestType = com.coreum.asset.ft.v1.MsgGloballyFreeze.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyFreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getGloballyFreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyFreeze, com.coreum.asset.ft.v1.EmptyResponse> getGloballyFreezeMethod;
    if ((getGloballyFreezeMethod = MsgGrpc.getGloballyFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGloballyFreezeMethod = MsgGrpc.getGloballyFreezeMethod) == null) {
          MsgGrpc.getGloballyFreezeMethod = getGloballyFreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgGloballyFreeze, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GloballyFreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgGloballyFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GloballyFreeze"))
              .build();
        }
      }
    }
    return getGloballyFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyUnfreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getGloballyUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GloballyUnfreeze",
      requestType = com.coreum.asset.ft.v1.MsgGloballyUnfreeze.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyUnfreeze,
      com.coreum.asset.ft.v1.EmptyResponse> getGloballyUnfreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgGloballyUnfreeze, com.coreum.asset.ft.v1.EmptyResponse> getGloballyUnfreezeMethod;
    if ((getGloballyUnfreezeMethod = MsgGrpc.getGloballyUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGloballyUnfreezeMethod = MsgGrpc.getGloballyUnfreezeMethod) == null) {
          MsgGrpc.getGloballyUnfreezeMethod = getGloballyUnfreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgGloballyUnfreeze, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GloballyUnfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgGloballyUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GloballyUnfreeze"))
              .build();
        }
      }
    }
    return getGloballyUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgSetWhitelistedLimit,
      com.coreum.asset.ft.v1.EmptyResponse> getSetWhitelistedLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWhitelistedLimit",
      requestType = com.coreum.asset.ft.v1.MsgSetWhitelistedLimit.class,
      responseType = com.coreum.asset.ft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgSetWhitelistedLimit,
      com.coreum.asset.ft.v1.EmptyResponse> getSetWhitelistedLimitMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.MsgSetWhitelistedLimit, com.coreum.asset.ft.v1.EmptyResponse> getSetWhitelistedLimitMethod;
    if ((getSetWhitelistedLimitMethod = MsgGrpc.getSetWhitelistedLimitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWhitelistedLimitMethod = MsgGrpc.getSetWhitelistedLimitMethod) == null) {
          MsgGrpc.getSetWhitelistedLimitMethod = getSetWhitelistedLimitMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.MsgSetWhitelistedLimit, com.coreum.asset.ft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWhitelistedLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.MsgSetWhitelistedLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWhitelistedLimit"))
              .build();
        }
      }
    }
    return getSetWhitelistedLimitMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    default void issue(com.coreum.asset.ft.v1.MsgIssue request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    default void mint(com.coreum.asset.ft.v1.MsgMint request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    default void burn(com.coreum.asset.ft.v1.MsgBurn request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    default void freeze(com.coreum.asset.ft.v1.MsgFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    default void unfreeze(com.coreum.asset.ft.v1.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    default void globallyFreeze(com.coreum.asset.ft.v1.MsgGloballyFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGloballyFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    default void globallyUnfreeze(com.coreum.asset.ft.v1.MsgGloballyUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGloballyUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    default void setWhitelistedLimit(com.coreum.asset.ft.v1.MsgSetWhitelistedLimit request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWhitelistedLimitMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public void issue(com.coreum.asset.ft.v1.MsgIssue request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public void mint(com.coreum.asset.ft.v1.MsgMint request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public void burn(com.coreum.asset.ft.v1.MsgBurn request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public void freeze(com.coreum.asset.ft.v1.MsgFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public void unfreeze(com.coreum.asset.ft.v1.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public void globallyFreeze(com.coreum.asset.ft.v1.MsgGloballyFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGloballyFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public void globallyUnfreeze(com.coreum.asset.ft.v1.MsgGloballyUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGloballyUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public void setWhitelistedLimit(com.coreum.asset.ft.v1.MsgSetWhitelistedLimit request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWhitelistedLimitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse issue(com.coreum.asset.ft.v1.MsgIssue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse mint(com.coreum.asset.ft.v1.MsgMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse burn(com.coreum.asset.ft.v1.MsgBurn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse freeze(com.coreum.asset.ft.v1.MsgFreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse unfreeze(com.coreum.asset.ft.v1.MsgUnfreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse globallyFreeze(com.coreum.asset.ft.v1.MsgGloballyFreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGloballyFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse globallyUnfreeze(com.coreum.asset.ft.v1.MsgGloballyUnfreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGloballyUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public com.coreum.asset.ft.v1.EmptyResponse setWhitelistedLimit(com.coreum.asset.ft.v1.MsgSetWhitelistedLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWhitelistedLimitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * Issue defines a method to issue a new fungible token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> issue(
        com.coreum.asset.ft.v1.MsgIssue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint mints new fungible tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> mint(
        com.coreum.asset.ft.v1.MsgMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> burn(
        com.coreum.asset.ft.v1.MsgBurn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Freeze freezes a part of the fungible tokens in an
     * account, only if the freezable feature is enabled on that token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> freeze(
        com.coreum.asset.ft.v1.MsgFreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unfreeze unfreezes a part of the frozen fungible tokens in an
     * account, only if there are such frozen tokens on that account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> unfreeze(
        com.coreum.asset.ft.v1.MsgUnfreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
     * This operation is idempotent so global freeze of already frozen token does nothing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> globallyFreeze(
        com.coreum.asset.ft.v1.MsgGloballyFreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGloballyFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
     * This operation is idempotent so global unfreezing of non-frozen token does nothing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> globallyUnfreeze(
        com.coreum.asset.ft.v1.MsgGloballyUnfreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGloballyUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.EmptyResponse> setWhitelistedLimit(
        com.coreum.asset.ft.v1.MsgSetWhitelistedLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWhitelistedLimitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_FREEZE = 3;
  private static final int METHODID_UNFREEZE = 4;
  private static final int METHODID_GLOBALLY_FREEZE = 5;
  private static final int METHODID_GLOBALLY_UNFREEZE = 6;
  private static final int METHODID_SET_WHITELISTED_LIMIT = 7;

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
          serviceImpl.issue((com.coreum.asset.ft.v1.MsgIssue) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((com.coreum.asset.ft.v1.MsgMint) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((com.coreum.asset.ft.v1.MsgBurn) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_FREEZE:
          serviceImpl.freeze((com.coreum.asset.ft.v1.MsgFreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_UNFREEZE:
          serviceImpl.unfreeze((com.coreum.asset.ft.v1.MsgUnfreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_GLOBALLY_FREEZE:
          serviceImpl.globallyFreeze((com.coreum.asset.ft.v1.MsgGloballyFreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_GLOBALLY_UNFREEZE:
          serviceImpl.globallyUnfreeze((com.coreum.asset.ft.v1.MsgGloballyUnfreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_SET_WHITELISTED_LIMIT:
          serviceImpl.setWhitelistedLimit((com.coreum.asset.ft.v1.MsgSetWhitelistedLimit) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.EmptyResponse>) responseObserver);
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
              com.coreum.asset.ft.v1.MsgIssue,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_ISSUE)))
        .addMethod(
          getMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgMint,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_MINT)))
        .addMethod(
          getBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgBurn,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_BURN)))
        .addMethod(
          getFreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgFreeze,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_FREEZE)))
        .addMethod(
          getUnfreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgUnfreeze,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_UNFREEZE)))
        .addMethod(
          getGloballyFreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgGloballyFreeze,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_GLOBALLY_FREEZE)))
        .addMethod(
          getGloballyUnfreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgGloballyUnfreeze,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_GLOBALLY_UNFREEZE)))
        .addMethod(
          getSetWhitelistedLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.MsgSetWhitelistedLimit,
              com.coreum.asset.ft.v1.EmptyResponse>(
                service, METHODID_SET_WHITELISTED_LIMIT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coreum.asset.ft.v1.TxProto.getDescriptor();
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
              .addMethod(getFreezeMethod())
              .addMethod(getUnfreezeMethod())
              .addMethod(getGloballyFreezeMethod())
              .addMethod(getGloballyUnfreezeMethod())
              .addMethod(getSetWhitelistedLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
