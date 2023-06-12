package com.coreum.asset.nft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: coreum/asset/nft/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.nft.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgIssueClass,
      com.coreum.asset.nft.v1.EmptyResponse> getIssueClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueClass",
      requestType = com.coreum.asset.nft.v1.MsgIssueClass.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgIssueClass,
      com.coreum.asset.nft.v1.EmptyResponse> getIssueClassMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgIssueClass, com.coreum.asset.nft.v1.EmptyResponse> getIssueClassMethod;
    if ((getIssueClassMethod = MsgGrpc.getIssueClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueClassMethod = MsgGrpc.getIssueClassMethod) == null) {
          MsgGrpc.getIssueClassMethod = getIssueClassMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgIssueClass, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgIssueClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueClass"))
              .build();
        }
      }
    }
    return getIssueClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgMint,
      com.coreum.asset.nft.v1.EmptyResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = com.coreum.asset.nft.v1.MsgMint.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgMint,
      com.coreum.asset.nft.v1.EmptyResponse> getMintMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgMint, com.coreum.asset.nft.v1.EmptyResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgMint, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgBurn,
      com.coreum.asset.nft.v1.EmptyResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = com.coreum.asset.nft.v1.MsgBurn.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgBurn,
      com.coreum.asset.nft.v1.EmptyResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgBurn, com.coreum.asset.nft.v1.EmptyResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgBurn, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgFreeze,
      com.coreum.asset.nft.v1.EmptyResponse> getFreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Freeze",
      requestType = com.coreum.asset.nft.v1.MsgFreeze.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgFreeze,
      com.coreum.asset.nft.v1.EmptyResponse> getFreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgFreeze, com.coreum.asset.nft.v1.EmptyResponse> getFreezeMethod;
    if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFreezeMethod = MsgGrpc.getFreezeMethod) == null) {
          MsgGrpc.getFreezeMethod = getFreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgFreeze, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Freeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgFreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Freeze"))
              .build();
        }
      }
    }
    return getFreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgUnfreeze,
      com.coreum.asset.nft.v1.EmptyResponse> getUnfreezeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfreeze",
      requestType = com.coreum.asset.nft.v1.MsgUnfreeze.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgUnfreeze,
      com.coreum.asset.nft.v1.EmptyResponse> getUnfreezeMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgUnfreeze, com.coreum.asset.nft.v1.EmptyResponse> getUnfreezeMethod;
    if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfreezeMethod = MsgGrpc.getUnfreezeMethod) == null) {
          MsgGrpc.getUnfreezeMethod = getUnfreezeMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgUnfreeze, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfreeze"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgUnfreeze.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfreeze"))
              .build();
        }
      }
    }
    return getUnfreezeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgAddToWhitelist,
      com.coreum.asset.nft.v1.EmptyResponse> getAddToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToWhitelist",
      requestType = com.coreum.asset.nft.v1.MsgAddToWhitelist.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgAddToWhitelist,
      com.coreum.asset.nft.v1.EmptyResponse> getAddToWhitelistMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgAddToWhitelist, com.coreum.asset.nft.v1.EmptyResponse> getAddToWhitelistMethod;
    if ((getAddToWhitelistMethod = MsgGrpc.getAddToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToWhitelistMethod = MsgGrpc.getAddToWhitelistMethod) == null) {
          MsgGrpc.getAddToWhitelistMethod = getAddToWhitelistMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgAddToWhitelist, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgAddToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToWhitelist"))
              .build();
        }
      }
    }
    return getAddToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgRemoveFromWhitelist,
      com.coreum.asset.nft.v1.EmptyResponse> getRemoveFromWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromWhitelist",
      requestType = com.coreum.asset.nft.v1.MsgRemoveFromWhitelist.class,
      responseType = com.coreum.asset.nft.v1.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgRemoveFromWhitelist,
      com.coreum.asset.nft.v1.EmptyResponse> getRemoveFromWhitelistMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.MsgRemoveFromWhitelist, com.coreum.asset.nft.v1.EmptyResponse> getRemoveFromWhitelistMethod;
    if ((getRemoveFromWhitelistMethod = MsgGrpc.getRemoveFromWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveFromWhitelistMethod = MsgGrpc.getRemoveFromWhitelistMethod) == null) {
          MsgGrpc.getRemoveFromWhitelistMethod = getRemoveFromWhitelistMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.MsgRemoveFromWhitelist, com.coreum.asset.nft.v1.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFromWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.MsgRemoveFromWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveFromWhitelist"))
              .build();
        }
      }
    }
    return getRemoveFromWhitelistMethod;
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
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    default void issueClass(com.coreum.asset.nft.v1.MsgIssueClass request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    default void mint(com.coreum.asset.nft.v1.MsgMint request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    default void burn(com.coreum.asset.nft.v1.MsgBurn request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    default void freeze(com.coreum.asset.nft.v1.MsgFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    default void unfreeze(com.coreum.asset.nft.v1.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfreezeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    default void addToWhitelist(com.coreum.asset.nft.v1.MsgAddToWhitelist request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    default void removeFromWhitelist(com.coreum.asset.nft.v1.MsgRemoveFromWhitelist request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFromWhitelistMethod(), responseObserver);
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
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public void issueClass(com.coreum.asset.nft.v1.MsgIssueClass request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public void mint(com.coreum.asset.nft.v1.MsgMint request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public void burn(com.coreum.asset.nft.v1.MsgBurn request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public void freeze(com.coreum.asset.nft.v1.MsgFreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public void unfreeze(com.coreum.asset.nft.v1.MsgUnfreeze request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public void addToWhitelist(com.coreum.asset.nft.v1.MsgAddToWhitelist request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public void removeFromWhitelist(com.coreum.asset.nft.v1.MsgRemoveFromWhitelist request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFromWhitelistMethod(), getCallOptions()), request, responseObserver);
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
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse issueClass(com.coreum.asset.nft.v1.MsgIssueClass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse mint(com.coreum.asset.nft.v1.MsgMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse burn(com.coreum.asset.nft.v1.MsgBurn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse freeze(com.coreum.asset.nft.v1.MsgFreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse unfreeze(com.coreum.asset.nft.v1.MsgUnfreeze request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfreezeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse addToWhitelist(com.coreum.asset.nft.v1.MsgAddToWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public com.coreum.asset.nft.v1.EmptyResponse removeFromWhitelist(com.coreum.asset.nft.v1.MsgRemoveFromWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFromWhitelistMethod(), getCallOptions(), request);
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
     * IssueClass creates new non-fungible token class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> issueClass(
        com.coreum.asset.nft.v1.MsgIssueClass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint mints new non-fungible token in the class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> mint(
        com.coreum.asset.nft.v1.MsgMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn burns the existing non-fungible token in the class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> burn(
        com.coreum.asset.nft.v1.MsgBurn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Freeze freezes an NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> freeze(
        com.coreum.asset.nft.v1.MsgFreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unfreeze removes the freeze effect already put on an NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> unfreeze(
        com.coreum.asset.nft.v1.MsgUnfreeze request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfreezeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToWhitelist sets the account as whitelisted to hold the NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> addToWhitelist(
        com.coreum.asset.nft.v1.MsgAddToWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveFromWhitelist removes an account from whitelisted list of the NFT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.EmptyResponse> removeFromWhitelist(
        com.coreum.asset.nft.v1.MsgRemoveFromWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFromWhitelistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_CLASS = 0;
  private static final int METHODID_MINT = 1;
  private static final int METHODID_BURN = 2;
  private static final int METHODID_FREEZE = 3;
  private static final int METHODID_UNFREEZE = 4;
  private static final int METHODID_ADD_TO_WHITELIST = 5;
  private static final int METHODID_REMOVE_FROM_WHITELIST = 6;

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
        case METHODID_ISSUE_CLASS:
          serviceImpl.issueClass((com.coreum.asset.nft.v1.MsgIssueClass) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((com.coreum.asset.nft.v1.MsgMint) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((com.coreum.asset.nft.v1.MsgBurn) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_FREEZE:
          serviceImpl.freeze((com.coreum.asset.nft.v1.MsgFreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_UNFREEZE:
          serviceImpl.unfreeze((com.coreum.asset.nft.v1.MsgUnfreeze) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_WHITELIST:
          serviceImpl.addToWhitelist((com.coreum.asset.nft.v1.MsgAddToWhitelist) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_WHITELIST:
          serviceImpl.removeFromWhitelist((com.coreum.asset.nft.v1.MsgRemoveFromWhitelist) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.EmptyResponse>) responseObserver);
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
          getIssueClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgIssueClass,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_ISSUE_CLASS)))
        .addMethod(
          getMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgMint,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_MINT)))
        .addMethod(
          getBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgBurn,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_BURN)))
        .addMethod(
          getFreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgFreeze,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_FREEZE)))
        .addMethod(
          getUnfreezeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgUnfreeze,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_UNFREEZE)))
        .addMethod(
          getAddToWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgAddToWhitelist,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_ADD_TO_WHITELIST)))
        .addMethod(
          getRemoveFromWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.MsgRemoveFromWhitelist,
              com.coreum.asset.nft.v1.EmptyResponse>(
                service, METHODID_REMOVE_FROM_WHITELIST)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coreum.asset.nft.v1.TxProto.getDescriptor();
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
              .addMethod(getIssueClassMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getFreezeMethod())
              .addMethod(getUnfreezeMethod())
              .addMethod(getAddToWhitelistMethod())
              .addMethod(getRemoveFromWhitelistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
