package com.kyve.bundles.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/bundles/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kyve.bundles.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal,
      com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitBundleProposal",
      requestType = com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal.class,
      responseType = com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal,
      com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod() {
    io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal, com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> getSubmitBundleProposalMethod;
    if ((getSubmitBundleProposalMethod = MsgGrpc.getSubmitBundleProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitBundleProposalMethod = MsgGrpc.getSubmitBundleProposalMethod) == null) {
          MsgGrpc.getSubmitBundleProposalMethod = getSubmitBundleProposalMethod =
              io.grpc.MethodDescriptor.<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal, com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitBundleProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitBundleProposal"))
              .build();
        }
      }
    }
    return getSubmitBundleProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal,
      com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteBundleProposal",
      requestType = com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal.class,
      responseType = com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal,
      com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod() {
    io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal, com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> getVoteBundleProposalMethod;
    if ((getVoteBundleProposalMethod = MsgGrpc.getVoteBundleProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteBundleProposalMethod = MsgGrpc.getVoteBundleProposalMethod) == null) {
          MsgGrpc.getVoteBundleProposalMethod = getVoteBundleProposalMethod =
              io.grpc.MethodDescriptor.<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal, com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteBundleProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteBundleProposal"))
              .build();
        }
      }
    }
    return getVoteBundleProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole,
      com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimUploaderRole",
      requestType = com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole.class,
      responseType = com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole,
      com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod() {
    io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole, com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> getClaimUploaderRoleMethod;
    if ((getClaimUploaderRoleMethod = MsgGrpc.getClaimUploaderRoleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimUploaderRoleMethod = MsgGrpc.getClaimUploaderRoleMethod) == null) {
          MsgGrpc.getClaimUploaderRoleMethod = getClaimUploaderRoleMethod =
              io.grpc.MethodDescriptor.<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole, com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimUploaderRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimUploaderRole"))
              .build();
        }
      }
    }
    return getClaimUploaderRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole,
      com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SkipUploaderRole",
      requestType = com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole.class,
      responseType = com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole,
      com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod() {
    io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole, com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> getSkipUploaderRoleMethod;
    if ((getSkipUploaderRoleMethod = MsgGrpc.getSkipUploaderRoleMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSkipUploaderRoleMethod = MsgGrpc.getSkipUploaderRoleMethod) == null) {
          MsgGrpc.getSkipUploaderRoleMethod = getSkipUploaderRoleMethod =
              io.grpc.MethodDescriptor.<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole, com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SkipUploaderRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SkipUploaderRole"))
              .build();
        }
      }
    }
    return getSkipUploaderRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams,
      com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams.class,
      responseType = com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams,
      com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams, com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams, com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
     * SubmitBundleProposal ...
     * </pre>
     */
    default void submitBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitBundleProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    default void voteBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteBundleProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    default void claimUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimUploaderRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    default void skipUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSkipUploaderRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    default void updateParams(com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
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
     * SubmitBundleProposal ...
     * </pre>
     */
    public void submitBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitBundleProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public void voteBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteBundleProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public void claimUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimUploaderRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public void skipUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSkipUploaderRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public void updateParams(com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
     * SubmitBundleProposal ...
     * </pre>
     */
    public com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse submitBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitBundleProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse voteBundleProposal(com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteBundleProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse claimUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimUploaderRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse skipUploaderRole(com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSkipUploaderRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse updateParams(com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
     * SubmitBundleProposal ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse> submitBundleProposal(
        com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitBundleProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteBundleProposal ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse> voteBundleProposal(
        com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteBundleProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimUploaderRole ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse> claimUploaderRole(
        com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimUploaderRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SkipUploaderRole ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse> skipUploaderRole(
        com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSkipUploaderRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/bundles module
     * parameters. The authority is hard-coded to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_BUNDLE_PROPOSAL = 0;
  private static final int METHODID_VOTE_BUNDLE_PROPOSAL = 1;
  private static final int METHODID_CLAIM_UPLOADER_ROLE = 2;
  private static final int METHODID_SKIP_UPLOADER_ROLE = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_SUBMIT_BUNDLE_PROPOSAL:
          serviceImpl.submitBundleProposal((com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal) request,
              (io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse>) responseObserver);
          break;
        case METHODID_VOTE_BUNDLE_PROPOSAL:
          serviceImpl.voteBundleProposal((com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal) request,
              (io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse>) responseObserver);
          break;
        case METHODID_CLAIM_UPLOADER_ROLE:
          serviceImpl.claimUploaderRole((com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole) request,
              (io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse>) responseObserver);
          break;
        case METHODID_SKIP_UPLOADER_ROLE:
          serviceImpl.skipUploaderRole((com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole) request,
              (io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getSubmitBundleProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposal,
              com.kyve.bundles.v1beta1.TxProto.MsgSubmitBundleProposalResponse>(
                service, METHODID_SUBMIT_BUNDLE_PROPOSAL)))
        .addMethod(
          getVoteBundleProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposal,
              com.kyve.bundles.v1beta1.TxProto.MsgVoteBundleProposalResponse>(
                service, METHODID_VOTE_BUNDLE_PROPOSAL)))
        .addMethod(
          getClaimUploaderRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRole,
              com.kyve.bundles.v1beta1.TxProto.MsgClaimUploaderRoleResponse>(
                service, METHODID_CLAIM_UPLOADER_ROLE)))
        .addMethod(
          getSkipUploaderRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRole,
              com.kyve.bundles.v1beta1.TxProto.MsgSkipUploaderRoleResponse>(
                service, METHODID_SKIP_UPLOADER_ROLE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.bundles.v1beta1.TxProto.MsgUpdateParams,
              com.kyve.bundles.v1beta1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.bundles.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getSubmitBundleProposalMethod())
              .addMethod(getVoteBundleProposalMethod())
              .addMethod(getClaimUploaderRoleMethod())
              .addMethod(getSkipUploaderRoleMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
