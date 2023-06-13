package com.ixo.entity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the project Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/entity/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ixo.entity.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntity,
      com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> getCreateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntity",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgCreateEntity.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntity,
      com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> getCreateEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntity, com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> getCreateEntityMethod;
    if ((getCreateEntityMethod = MsgGrpc.getCreateEntityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateEntityMethod = MsgGrpc.getCreateEntityMethod) == null) {
          MsgGrpc.getCreateEntityMethod = getCreateEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgCreateEntity, com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgCreateEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateEntity"))
              .build();
        }
      }
    }
    return getCreateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity,
      com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> getUpdateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntity",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity,
      com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> getUpdateEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity, com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> getUpdateEntityMethod;
    if ((getUpdateEntityMethod = MsgGrpc.getUpdateEntityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateEntityMethod = MsgGrpc.getUpdateEntityMethod) == null) {
          MsgGrpc.getUpdateEntityMethod = getUpdateEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity, com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateEntity"))
              .build();
        }
      }
    }
    return getUpdateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified,
      com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> getUpdateEntityVerifiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntityVerified",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified,
      com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> getUpdateEntityVerifiedMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified, com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> getUpdateEntityVerifiedMethod;
    if ((getUpdateEntityVerifiedMethod = MsgGrpc.getUpdateEntityVerifiedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateEntityVerifiedMethod = MsgGrpc.getUpdateEntityVerifiedMethod) == null) {
          MsgGrpc.getUpdateEntityVerifiedMethod = getUpdateEntityVerifiedMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified, com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntityVerified"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateEntityVerified"))
              .build();
        }
      }
    }
    return getUpdateEntityVerifiedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgTransferEntity,
      com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> getTransferEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferEntity",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgTransferEntity.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgTransferEntity,
      com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> getTransferEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgTransferEntity, com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> getTransferEntityMethod;
    if ((getTransferEntityMethod = MsgGrpc.getTransferEntityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferEntityMethod = MsgGrpc.getTransferEntityMethod) == null) {
          MsgGrpc.getTransferEntityMethod = getTransferEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgTransferEntity, com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgTransferEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferEntity"))
              .build();
        }
      }
    }
    return getTransferEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount,
      com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> getCreateEntityAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntityAccount",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount,
      com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> getCreateEntityAccountMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount, com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> getCreateEntityAccountMethod;
    if ((getCreateEntityAccountMethod = MsgGrpc.getCreateEntityAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateEntityAccountMethod = MsgGrpc.getCreateEntityAccountMethod) == null) {
          MsgGrpc.getCreateEntityAccountMethod = getCreateEntityAccountMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount, com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntityAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateEntityAccount"))
              .build();
        }
      }
    }
    return getCreateEntityAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz,
      com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> getGrantEntityAccountAuthzMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantEntityAccountAuthz",
      requestType = com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz.class,
      responseType = com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz,
      com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> getGrantEntityAccountAuthzMethod() {
    io.grpc.MethodDescriptor<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz, com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> getGrantEntityAccountAuthzMethod;
    if ((getGrantEntityAccountAuthzMethod = MsgGrpc.getGrantEntityAccountAuthzMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGrantEntityAccountAuthzMethod = MsgGrpc.getGrantEntityAccountAuthzMethod) == null) {
          MsgGrpc.getGrantEntityAccountAuthzMethod = getGrantEntityAccountAuthzMethod =
              io.grpc.MethodDescriptor.<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz, com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantEntityAccountAuthz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GrantEntityAccountAuthz"))
              .build();
        }
      }
    }
    return getGrantEntityAccountAuthzMethod;
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
     * <pre>
     * CreateEntity defines a method for creating a entity.
     * </pre>
     */
    default void createEntity(com.ixo.entity.v1beta1.TxProto.MsgCreateEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEntity defines a method for updating a entity
     * </pre>
     */
    default void updateEntity(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEntityVerified defines a method for updating if an entity is verified
     * </pre>
     */
    default void updateEntityVerified(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEntityVerifiedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfers an entity and its nft to the recipient
     * </pre>
     */
    default void transferEntity(com.ixo.entity.v1beta1.TxProto.MsgTransferEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a module account for an entity,
     * </pre>
     */
    default void createEntityAccount(com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEntityAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a authz grant from entity account
     * </pre>
     */
    default void grantEntityAccountAuthz(com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantEntityAccountAuthzMethod(), responseObserver);
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
     * <pre>
     * CreateEntity defines a method for creating a entity.
     * </pre>
     */
    public void createEntity(com.ixo.entity.v1beta1.TxProto.MsgCreateEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEntity defines a method for updating a entity
     * </pre>
     */
    public void updateEntity(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEntityVerified defines a method for updating if an entity is verified
     * </pre>
     */
    public void updateEntityVerified(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEntityVerifiedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfers an entity and its nft to the recipient
     * </pre>
     */
    public void transferEntity(com.ixo.entity.v1beta1.TxProto.MsgTransferEntity request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a module account for an entity,
     * </pre>
     */
    public void createEntityAccount(com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEntityAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a authz grant from entity account
     * </pre>
     */
    public void grantEntityAccountAuthz(com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz request,
        io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantEntityAccountAuthzMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * CreateEntity defines a method for creating a entity.
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse createEntity(com.ixo.entity.v1beta1.TxProto.MsgCreateEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEntity defines a method for updating a entity
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse updateEntity(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEntityVerified defines a method for updating if an entity is verified
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse updateEntityVerified(com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEntityVerifiedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfers an entity and its nft to the recipient
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse transferEntity(com.ixo.entity.v1beta1.TxProto.MsgTransferEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a module account for an entity,
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse createEntityAccount(com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEntityAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a authz grant from entity account
     * </pre>
     */
    public com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse grantEntityAccountAuthz(com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantEntityAccountAuthzMethod(), getCallOptions(), request);
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
     * <pre>
     * CreateEntity defines a method for creating a entity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse> createEntity(
        com.ixo.entity.v1beta1.TxProto.MsgCreateEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEntity defines a method for updating a entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse> updateEntity(
        com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEntityVerified defines a method for updating if an entity is verified
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse> updateEntityVerified(
        com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEntityVerifiedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfers an entity and its nft to the recipient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse> transferEntity(
        com.ixo.entity.v1beta1.TxProto.MsgTransferEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a module account for an entity,
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse> createEntityAccount(
        com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEntityAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a authz grant from entity account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse> grantEntityAccountAuthz(
        com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantEntityAccountAuthzMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENTITY = 0;
  private static final int METHODID_UPDATE_ENTITY = 1;
  private static final int METHODID_UPDATE_ENTITY_VERIFIED = 2;
  private static final int METHODID_TRANSFER_ENTITY = 3;
  private static final int METHODID_CREATE_ENTITY_ACCOUNT = 4;
  private static final int METHODID_GRANT_ENTITY_ACCOUNT_AUTHZ = 5;

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
        case METHODID_CREATE_ENTITY:
          serviceImpl.createEntity((com.ixo.entity.v1beta1.TxProto.MsgCreateEntity) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY:
          serviceImpl.updateEntity((com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENTITY_VERIFIED:
          serviceImpl.updateEntityVerified((com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_ENTITY:
          serviceImpl.transferEntity((com.ixo.entity.v1beta1.TxProto.MsgTransferEntity) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENTITY_ACCOUNT:
          serviceImpl.createEntityAccount((com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse>) responseObserver);
          break;
        case METHODID_GRANT_ENTITY_ACCOUNT_AUTHZ:
          serviceImpl.grantEntityAccountAuthz((com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz) request,
              (io.grpc.stub.StreamObserver<com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse>) responseObserver);
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
          getCreateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgCreateEntity,
              com.ixo.entity.v1beta1.TxProto.MsgCreateEntityResponse>(
                service, METHODID_CREATE_ENTITY)))
        .addMethod(
          getUpdateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgUpdateEntity,
              com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityResponse>(
                service, METHODID_UPDATE_ENTITY)))
        .addMethod(
          getUpdateEntityVerifiedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerified,
              com.ixo.entity.v1beta1.TxProto.MsgUpdateEntityVerifiedResponse>(
                service, METHODID_UPDATE_ENTITY_VERIFIED)))
        .addMethod(
          getTransferEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgTransferEntity,
              com.ixo.entity.v1beta1.TxProto.MsgTransferEntityResponse>(
                service, METHODID_TRANSFER_ENTITY)))
        .addMethod(
          getCreateEntityAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccount,
              com.ixo.entity.v1beta1.TxProto.MsgCreateEntityAccountResponse>(
                service, METHODID_CREATE_ENTITY_ACCOUNT)))
        .addMethod(
          getGrantEntityAccountAuthzMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthz,
              com.ixo.entity.v1beta1.TxProto.MsgGrantEntityAccountAuthzResponse>(
                service, METHODID_GRANT_ENTITY_ACCOUNT_AUTHZ)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.entity.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateEntityMethod())
              .addMethod(getUpdateEntityMethod())
              .addMethod(getUpdateEntityVerifiedMethod())
              .addMethod(getTransferEntityMethod())
              .addMethod(getCreateEntityAccountMethod())
              .addMethod(getGrantEntityAccountAuthzMethod())
              .build();
        }
      }
    }
    return result;
  }
}
