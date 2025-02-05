package com.zrchain.policy;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/policy/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "zrchain.policy.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgUpdateParams,
      com.zrchain.policy.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.zrchain.policy.TxProto.MsgUpdateParams.class,
      responseType = com.zrchain.policy.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgUpdateParams,
      com.zrchain.policy.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgUpdateParams, com.zrchain.policy.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgUpdateParams, com.zrchain.policy.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgNewPolicy,
      com.zrchain.policy.TxProto.MsgNewPolicyResponse> getNewPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewPolicy",
      requestType = com.zrchain.policy.TxProto.MsgNewPolicy.class,
      responseType = com.zrchain.policy.TxProto.MsgNewPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgNewPolicy,
      com.zrchain.policy.TxProto.MsgNewPolicyResponse> getNewPolicyMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgNewPolicy, com.zrchain.policy.TxProto.MsgNewPolicyResponse> getNewPolicyMethod;
    if ((getNewPolicyMethod = MsgGrpc.getNewPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewPolicyMethod = MsgGrpc.getNewPolicyMethod) == null) {
          MsgGrpc.getNewPolicyMethod = getNewPolicyMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgNewPolicy, com.zrchain.policy.TxProto.MsgNewPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgNewPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgNewPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewPolicy"))
              .build();
        }
      }
    }
    return getNewPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRevokeAction,
      com.zrchain.policy.TxProto.MsgRevokeActionResponse> getRevokeActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAction",
      requestType = com.zrchain.policy.TxProto.MsgRevokeAction.class,
      responseType = com.zrchain.policy.TxProto.MsgRevokeActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRevokeAction,
      com.zrchain.policy.TxProto.MsgRevokeActionResponse> getRevokeActionMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRevokeAction, com.zrchain.policy.TxProto.MsgRevokeActionResponse> getRevokeActionMethod;
    if ((getRevokeActionMethod = MsgGrpc.getRevokeActionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeActionMethod = MsgGrpc.getRevokeActionMethod) == null) {
          MsgGrpc.getRevokeActionMethod = getRevokeActionMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgRevokeAction, com.zrchain.policy.TxProto.MsgRevokeActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRevokeAction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRevokeActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeAction"))
              .build();
        }
      }
    }
    return getRevokeActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgApproveAction,
      com.zrchain.policy.TxProto.MsgApproveActionResponse> getApproveActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveAction",
      requestType = com.zrchain.policy.TxProto.MsgApproveAction.class,
      responseType = com.zrchain.policy.TxProto.MsgApproveActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgApproveAction,
      com.zrchain.policy.TxProto.MsgApproveActionResponse> getApproveActionMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgApproveAction, com.zrchain.policy.TxProto.MsgApproveActionResponse> getApproveActionMethod;
    if ((getApproveActionMethod = MsgGrpc.getApproveActionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getApproveActionMethod = MsgGrpc.getApproveActionMethod) == null) {
          MsgGrpc.getApproveActionMethod = getApproveActionMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgApproveAction, com.zrchain.policy.TxProto.MsgApproveActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgApproveAction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgApproveActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ApproveAction"))
              .build();
        }
      }
    }
    return getApproveActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddSignMethod,
      com.zrchain.policy.TxProto.MsgAddSignMethodResponse> getAddSignMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSignMethod",
      requestType = com.zrchain.policy.TxProto.MsgAddSignMethod.class,
      responseType = com.zrchain.policy.TxProto.MsgAddSignMethodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddSignMethod,
      com.zrchain.policy.TxProto.MsgAddSignMethodResponse> getAddSignMethodMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddSignMethod, com.zrchain.policy.TxProto.MsgAddSignMethodResponse> getAddSignMethodMethod;
    if ((getAddSignMethodMethod = MsgGrpc.getAddSignMethodMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddSignMethodMethod = MsgGrpc.getAddSignMethodMethod) == null) {
          MsgGrpc.getAddSignMethodMethod = getAddSignMethodMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgAddSignMethod, com.zrchain.policy.TxProto.MsgAddSignMethodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSignMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgAddSignMethod.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgAddSignMethodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddSignMethod"))
              .build();
        }
      }
    }
    return getAddSignMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveSignMethod,
      com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> getRemoveSignMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSignMethod",
      requestType = com.zrchain.policy.TxProto.MsgRemoveSignMethod.class,
      responseType = com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveSignMethod,
      com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> getRemoveSignMethodMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveSignMethod, com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> getRemoveSignMethodMethod;
    if ((getRemoveSignMethodMethod = MsgGrpc.getRemoveSignMethodMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveSignMethodMethod = MsgGrpc.getRemoveSignMethodMethod) == null) {
          MsgGrpc.getRemoveSignMethodMethod = getRemoveSignMethodMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgRemoveSignMethod, com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSignMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRemoveSignMethod.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveSignMethod"))
              .build();
        }
      }
    }
    return getRemoveSignMethodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddMultiGrant,
      com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> getAddMultiGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultiGrant",
      requestType = com.zrchain.policy.TxProto.MsgAddMultiGrant.class,
      responseType = com.zrchain.policy.TxProto.MsgAddMultiGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddMultiGrant,
      com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> getAddMultiGrantMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgAddMultiGrant, com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> getAddMultiGrantMethod;
    if ((getAddMultiGrantMethod = MsgGrpc.getAddMultiGrantMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMultiGrantMethod = MsgGrpc.getAddMultiGrantMethod) == null) {
          MsgGrpc.getAddMultiGrantMethod = getAddMultiGrantMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgAddMultiGrant, com.zrchain.policy.TxProto.MsgAddMultiGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultiGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgAddMultiGrant.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgAddMultiGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMultiGrant"))
              .build();
        }
      }
    }
    return getAddMultiGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveMultiGrant,
      com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> getRemoveMultiGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMultiGrant",
      requestType = com.zrchain.policy.TxProto.MsgRemoveMultiGrant.class,
      responseType = com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveMultiGrant,
      com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> getRemoveMultiGrantMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.TxProto.MsgRemoveMultiGrant, com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> getRemoveMultiGrantMethod;
    if ((getRemoveMultiGrantMethod = MsgGrpc.getRemoveMultiGrantMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMultiGrantMethod = MsgGrpc.getRemoveMultiGrantMethod) == null) {
          MsgGrpc.getRemoveMultiGrantMethod = getRemoveMultiGrantMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.TxProto.MsgRemoveMultiGrant, com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMultiGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRemoveMultiGrant.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMultiGrant"))
              .build();
        }
      }
    }
    return getRemoveMultiGrantMethod;
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
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    default void updateParams(com.zrchain.policy.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewPolicy defines the operation for creating a new policy.
     * </pre>
     */
    default void newPolicy(com.zrchain.policy.TxProto.MsgNewPolicy request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgNewPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeAction defines the operation for revoking an action.
     * </pre>
     */
    default void revokeAction(com.zrchain.policy.TxProto.MsgRevokeAction request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRevokeActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApproveAction defines the operation for approving an action.
     * </pre>
     */
    default void approveAction(com.zrchain.policy.TxProto.MsgApproveAction request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgApproveActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddSignMethod defines the operation for adding a sign method.
     * </pre>
     */
    default void addSignMethod(com.zrchain.policy.TxProto.MsgAddSignMethod request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddSignMethodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSignMethodMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveSignMethod defines the operation for removing a sign method.
     * </pre>
     */
    default void removeSignMethod(com.zrchain.policy.TxProto.MsgRemoveSignMethod request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSignMethodMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddMultiGrant defines the operation for adding multiple grants
     * </pre>
     */
    default void addMultiGrant(com.zrchain.policy.TxProto.MsgAddMultiGrant request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultiGrantMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveMultiGrant defines the operation for removing multiple grants
     * </pre>
     */
    default void removeMultiGrant(com.zrchain.policy.TxProto.MsgRemoveMultiGrant request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMultiGrantMethod(), responseObserver);
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
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public void updateParams(com.zrchain.policy.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewPolicy defines the operation for creating a new policy.
     * </pre>
     */
    public void newPolicy(com.zrchain.policy.TxProto.MsgNewPolicy request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgNewPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeAction defines the operation for revoking an action.
     * </pre>
     */
    public void revokeAction(com.zrchain.policy.TxProto.MsgRevokeAction request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRevokeActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApproveAction defines the operation for approving an action.
     * </pre>
     */
    public void approveAction(com.zrchain.policy.TxProto.MsgApproveAction request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgApproveActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddSignMethod defines the operation for adding a sign method.
     * </pre>
     */
    public void addSignMethod(com.zrchain.policy.TxProto.MsgAddSignMethod request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddSignMethodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSignMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveSignMethod defines the operation for removing a sign method.
     * </pre>
     */
    public void removeSignMethod(com.zrchain.policy.TxProto.MsgRemoveSignMethod request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSignMethodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddMultiGrant defines the operation for adding multiple grants
     * </pre>
     */
    public void addMultiGrant(com.zrchain.policy.TxProto.MsgAddMultiGrant request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultiGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveMultiGrant defines the operation for removing multiple grants
     * </pre>
     */
    public void removeMultiGrant(com.zrchain.policy.TxProto.MsgRemoveMultiGrant request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMultiGrantMethod(), getCallOptions()), request, responseObserver);
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
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgUpdateParamsResponse updateParams(com.zrchain.policy.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewPolicy defines the operation for creating a new policy.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgNewPolicyResponse newPolicy(com.zrchain.policy.TxProto.MsgNewPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeAction defines the operation for revoking an action.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgRevokeActionResponse revokeAction(com.zrchain.policy.TxProto.MsgRevokeAction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApproveAction defines the operation for approving an action.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgApproveActionResponse approveAction(com.zrchain.policy.TxProto.MsgApproveAction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddSignMethod defines the operation for adding a sign method.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgAddSignMethodResponse addSignMethod(com.zrchain.policy.TxProto.MsgAddSignMethod request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSignMethodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveSignMethod defines the operation for removing a sign method.
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse removeSignMethod(com.zrchain.policy.TxProto.MsgRemoveSignMethod request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSignMethodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddMultiGrant defines the operation for adding multiple grants
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgAddMultiGrantResponse addMultiGrant(com.zrchain.policy.TxProto.MsgAddMultiGrant request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultiGrantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveMultiGrant defines the operation for removing multiple grants
     * </pre>
     */
    public com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse removeMultiGrant(com.zrchain.policy.TxProto.MsgRemoveMultiGrant request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMultiGrantMethod(), getCallOptions(), request);
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
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgUpdateParamsResponse> updateParams(
        com.zrchain.policy.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewPolicy defines the operation for creating a new policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgNewPolicyResponse> newPolicy(
        com.zrchain.policy.TxProto.MsgNewPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeAction defines the operation for revoking an action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgRevokeActionResponse> revokeAction(
        com.zrchain.policy.TxProto.MsgRevokeAction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApproveAction defines the operation for approving an action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgApproveActionResponse> approveAction(
        com.zrchain.policy.TxProto.MsgApproveAction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddSignMethod defines the operation for adding a sign method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgAddSignMethodResponse> addSignMethod(
        com.zrchain.policy.TxProto.MsgAddSignMethod request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSignMethodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveSignMethod defines the operation for removing a sign method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse> removeSignMethod(
        com.zrchain.policy.TxProto.MsgRemoveSignMethod request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSignMethodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddMultiGrant defines the operation for adding multiple grants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgAddMultiGrantResponse> addMultiGrant(
        com.zrchain.policy.TxProto.MsgAddMultiGrant request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultiGrantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveMultiGrant defines the operation for removing multiple grants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse> removeMultiGrant(
        com.zrchain.policy.TxProto.MsgRemoveMultiGrant request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMultiGrantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_PARAMS = 0;
  private static final int METHODID_NEW_POLICY = 1;
  private static final int METHODID_REVOKE_ACTION = 2;
  private static final int METHODID_APPROVE_ACTION = 3;
  private static final int METHODID_ADD_SIGN_METHOD = 4;
  private static final int METHODID_REMOVE_SIGN_METHOD = 5;
  private static final int METHODID_ADD_MULTI_GRANT = 6;
  private static final int METHODID_REMOVE_MULTI_GRANT = 7;

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
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.zrchain.policy.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_NEW_POLICY:
          serviceImpl.newPolicy((com.zrchain.policy.TxProto.MsgNewPolicy) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgNewPolicyResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ACTION:
          serviceImpl.revokeAction((com.zrchain.policy.TxProto.MsgRevokeAction) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRevokeActionResponse>) responseObserver);
          break;
        case METHODID_APPROVE_ACTION:
          serviceImpl.approveAction((com.zrchain.policy.TxProto.MsgApproveAction) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgApproveActionResponse>) responseObserver);
          break;
        case METHODID_ADD_SIGN_METHOD:
          serviceImpl.addSignMethod((com.zrchain.policy.TxProto.MsgAddSignMethod) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddSignMethodResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SIGN_METHOD:
          serviceImpl.removeSignMethod((com.zrchain.policy.TxProto.MsgRemoveSignMethod) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse>) responseObserver);
          break;
        case METHODID_ADD_MULTI_GRANT:
          serviceImpl.addMultiGrant((com.zrchain.policy.TxProto.MsgAddMultiGrant) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgAddMultiGrantResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MULTI_GRANT:
          serviceImpl.removeMultiGrant((com.zrchain.policy.TxProto.MsgRemoveMultiGrant) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse>) responseObserver);
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
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgUpdateParams,
              com.zrchain.policy.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getNewPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgNewPolicy,
              com.zrchain.policy.TxProto.MsgNewPolicyResponse>(
                service, METHODID_NEW_POLICY)))
        .addMethod(
          getRevokeActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgRevokeAction,
              com.zrchain.policy.TxProto.MsgRevokeActionResponse>(
                service, METHODID_REVOKE_ACTION)))
        .addMethod(
          getApproveActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgApproveAction,
              com.zrchain.policy.TxProto.MsgApproveActionResponse>(
                service, METHODID_APPROVE_ACTION)))
        .addMethod(
          getAddSignMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgAddSignMethod,
              com.zrchain.policy.TxProto.MsgAddSignMethodResponse>(
                service, METHODID_ADD_SIGN_METHOD)))
        .addMethod(
          getRemoveSignMethodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgRemoveSignMethod,
              com.zrchain.policy.TxProto.MsgRemoveSignMethodResponse>(
                service, METHODID_REMOVE_SIGN_METHOD)))
        .addMethod(
          getAddMultiGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgAddMultiGrant,
              com.zrchain.policy.TxProto.MsgAddMultiGrantResponse>(
                service, METHODID_ADD_MULTI_GRANT)))
        .addMethod(
          getRemoveMultiGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.TxProto.MsgRemoveMultiGrant,
              com.zrchain.policy.TxProto.MsgRemoveMultiGrantResponse>(
                service, METHODID_REMOVE_MULTI_GRANT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.policy.TxProto.getDescriptor();
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
              .addMethod(getUpdateParamsMethod())
              .addMethod(getNewPolicyMethod())
              .addMethod(getRevokeActionMethod())
              .addMethod(getApproveActionMethod())
              .addMethod(getAddSignMethodMethod())
              .addMethod(getRemoveSignMethodMethod())
              .addMethod(getAddMultiGrantMethod())
              .addMethod(getRemoveMultiGrantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
