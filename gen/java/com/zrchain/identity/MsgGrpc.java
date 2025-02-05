package com.zrchain.identity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/identity/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "zrchain.identity.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateParams,
      com.zrchain.identity.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.zrchain.identity.TxProto.MsgUpdateParams.class,
      responseType = com.zrchain.identity.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateParams,
      com.zrchain.identity.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateParams, com.zrchain.identity.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgUpdateParams, com.zrchain.identity.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewWorkspace,
      com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> getNewWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewWorkspace",
      requestType = com.zrchain.identity.TxProto.MsgNewWorkspace.class,
      responseType = com.zrchain.identity.TxProto.MsgNewWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewWorkspace,
      com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> getNewWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewWorkspace, com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> getNewWorkspaceMethod;
    if ((getNewWorkspaceMethod = MsgGrpc.getNewWorkspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewWorkspaceMethod = MsgGrpc.getNewWorkspaceMethod) == null) {
          MsgGrpc.getNewWorkspaceMethod = getNewWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgNewWorkspace, com.zrchain.identity.TxProto.MsgNewWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewWorkspace"))
              .build();
        }
      }
    }
    return getNewWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddWorkspaceOwner,
      com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> getAddWorkspaceOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddWorkspaceOwner",
      requestType = com.zrchain.identity.TxProto.MsgAddWorkspaceOwner.class,
      responseType = com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddWorkspaceOwner,
      com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> getAddWorkspaceOwnerMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddWorkspaceOwner, com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> getAddWorkspaceOwnerMethod;
    if ((getAddWorkspaceOwnerMethod = MsgGrpc.getAddWorkspaceOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddWorkspaceOwnerMethod = MsgGrpc.getAddWorkspaceOwnerMethod) == null) {
          MsgGrpc.getAddWorkspaceOwnerMethod = getAddWorkspaceOwnerMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgAddWorkspaceOwner, com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddWorkspaceOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddWorkspaceOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddWorkspaceOwner"))
              .build();
        }
      }
    }
    return getAddWorkspaceOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAppendChildWorkspace,
      com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> getAppendChildWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendChildWorkspace",
      requestType = com.zrchain.identity.TxProto.MsgAppendChildWorkspace.class,
      responseType = com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAppendChildWorkspace,
      com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> getAppendChildWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAppendChildWorkspace, com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> getAppendChildWorkspaceMethod;
    if ((getAppendChildWorkspaceMethod = MsgGrpc.getAppendChildWorkspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAppendChildWorkspaceMethod = MsgGrpc.getAppendChildWorkspaceMethod) == null) {
          MsgGrpc.getAppendChildWorkspaceMethod = getAppendChildWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgAppendChildWorkspace, com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendChildWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAppendChildWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AppendChildWorkspace"))
              .build();
        }
      }
    }
    return getAppendChildWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewChildWorkspace,
      com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> getNewChildWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewChildWorkspace",
      requestType = com.zrchain.identity.TxProto.MsgNewChildWorkspace.class,
      responseType = com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewChildWorkspace,
      com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> getNewChildWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewChildWorkspace, com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> getNewChildWorkspaceMethod;
    if ((getNewChildWorkspaceMethod = MsgGrpc.getNewChildWorkspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewChildWorkspaceMethod = MsgGrpc.getNewChildWorkspaceMethod) == null) {
          MsgGrpc.getNewChildWorkspaceMethod = getNewChildWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgNewChildWorkspace, com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewChildWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewChildWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewChildWorkspace"))
              .build();
        }
      }
    }
    return getNewChildWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner,
      com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> getRemoveWorkspaceOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveWorkspaceOwner",
      requestType = com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner.class,
      responseType = com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner,
      com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> getRemoveWorkspaceOwnerMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner, com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> getRemoveWorkspaceOwnerMethod;
    if ((getRemoveWorkspaceOwnerMethod = MsgGrpc.getRemoveWorkspaceOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveWorkspaceOwnerMethod = MsgGrpc.getRemoveWorkspaceOwnerMethod) == null) {
          MsgGrpc.getRemoveWorkspaceOwnerMethod = getRemoveWorkspaceOwnerMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner, com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveWorkspaceOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveWorkspaceOwner"))
              .build();
        }
      }
    }
    return getRemoveWorkspaceOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewKeyring,
      com.zrchain.identity.TxProto.MsgNewKeyringResponse> getNewKeyringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewKeyring",
      requestType = com.zrchain.identity.TxProto.MsgNewKeyring.class,
      responseType = com.zrchain.identity.TxProto.MsgNewKeyringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewKeyring,
      com.zrchain.identity.TxProto.MsgNewKeyringResponse> getNewKeyringMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgNewKeyring, com.zrchain.identity.TxProto.MsgNewKeyringResponse> getNewKeyringMethod;
    if ((getNewKeyringMethod = MsgGrpc.getNewKeyringMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewKeyringMethod = MsgGrpc.getNewKeyringMethod) == null) {
          MsgGrpc.getNewKeyringMethod = getNewKeyringMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgNewKeyring, com.zrchain.identity.TxProto.MsgNewKeyringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewKeyring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewKeyring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgNewKeyringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewKeyring"))
              .build();
        }
      }
    }
    return getNewKeyringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringParty,
      com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> getAddKeyringPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKeyringParty",
      requestType = com.zrchain.identity.TxProto.MsgAddKeyringParty.class,
      responseType = com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringParty,
      com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> getAddKeyringPartyMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringParty, com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> getAddKeyringPartyMethod;
    if ((getAddKeyringPartyMethod = MsgGrpc.getAddKeyringPartyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddKeyringPartyMethod = MsgGrpc.getAddKeyringPartyMethod) == null) {
          MsgGrpc.getAddKeyringPartyMethod = getAddKeyringPartyMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgAddKeyringParty, com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKeyringParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddKeyringParty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddKeyringParty"))
              .build();
        }
      }
    }
    return getAddKeyringPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateKeyring,
      com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> getUpdateKeyringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateKeyring",
      requestType = com.zrchain.identity.TxProto.MsgUpdateKeyring.class,
      responseType = com.zrchain.identity.TxProto.MsgUpdateKeyringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateKeyring,
      com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> getUpdateKeyringMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateKeyring, com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> getUpdateKeyringMethod;
    if ((getUpdateKeyringMethod = MsgGrpc.getUpdateKeyringMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateKeyringMethod = MsgGrpc.getUpdateKeyringMethod) == null) {
          MsgGrpc.getUpdateKeyringMethod = getUpdateKeyringMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgUpdateKeyring, com.zrchain.identity.TxProto.MsgUpdateKeyringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateKeyring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateKeyring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateKeyringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateKeyring"))
              .build();
        }
      }
    }
    return getUpdateKeyringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringParty,
      com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> getRemoveKeyringPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveKeyringParty",
      requestType = com.zrchain.identity.TxProto.MsgRemoveKeyringParty.class,
      responseType = com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringParty,
      com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> getRemoveKeyringPartyMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringParty, com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> getRemoveKeyringPartyMethod;
    if ((getRemoveKeyringPartyMethod = MsgGrpc.getRemoveKeyringPartyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveKeyringPartyMethod = MsgGrpc.getRemoveKeyringPartyMethod) == null) {
          MsgGrpc.getRemoveKeyringPartyMethod = getRemoveKeyringPartyMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgRemoveKeyringParty, com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveKeyringParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveKeyringParty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveKeyringParty"))
              .build();
        }
      }
    }
    return getRemoveKeyringPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringAdmin,
      com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> getAddKeyringAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKeyringAdmin",
      requestType = com.zrchain.identity.TxProto.MsgAddKeyringAdmin.class,
      responseType = com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringAdmin,
      com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> getAddKeyringAdminMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgAddKeyringAdmin, com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> getAddKeyringAdminMethod;
    if ((getAddKeyringAdminMethod = MsgGrpc.getAddKeyringAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddKeyringAdminMethod = MsgGrpc.getAddKeyringAdminMethod) == null) {
          MsgGrpc.getAddKeyringAdminMethod = getAddKeyringAdminMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgAddKeyringAdmin, com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKeyringAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddKeyringAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddKeyringAdmin"))
              .build();
        }
      }
    }
    return getAddKeyringAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin,
      com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> getRemoveKeyringAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveKeyringAdmin",
      requestType = com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin.class,
      responseType = com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin,
      com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> getRemoveKeyringAdminMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin, com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> getRemoveKeyringAdminMethod;
    if ((getRemoveKeyringAdminMethod = MsgGrpc.getRemoveKeyringAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveKeyringAdminMethod = MsgGrpc.getRemoveKeyringAdminMethod) == null) {
          MsgGrpc.getRemoveKeyringAdminMethod = getRemoveKeyringAdminMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin, com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveKeyringAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveKeyringAdmin"))
              .build();
        }
      }
    }
    return getRemoveKeyringAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateWorkspace,
      com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> getUpdateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkspace",
      requestType = com.zrchain.identity.TxProto.MsgUpdateWorkspace.class,
      responseType = com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateWorkspace,
      com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> getUpdateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgUpdateWorkspace, com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> getUpdateWorkspaceMethod;
    if ((getUpdateWorkspaceMethod = MsgGrpc.getUpdateWorkspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateWorkspaceMethod = MsgGrpc.getUpdateWorkspaceMethod) == null) {
          MsgGrpc.getUpdateWorkspaceMethod = getUpdateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgUpdateWorkspace, com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateWorkspace"))
              .build();
        }
      }
    }
    return getUpdateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgDeactivateKeyring,
      com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> getDeactivateKeyringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateKeyring",
      requestType = com.zrchain.identity.TxProto.MsgDeactivateKeyring.class,
      responseType = com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgDeactivateKeyring,
      com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> getDeactivateKeyringMethod() {
    io.grpc.MethodDescriptor<com.zrchain.identity.TxProto.MsgDeactivateKeyring, com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> getDeactivateKeyringMethod;
    if ((getDeactivateKeyringMethod = MsgGrpc.getDeactivateKeyringMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateKeyringMethod = MsgGrpc.getDeactivateKeyringMethod) == null) {
          MsgGrpc.getDeactivateKeyringMethod = getDeactivateKeyringMethod =
              io.grpc.MethodDescriptor.<com.zrchain.identity.TxProto.MsgDeactivateKeyring, com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateKeyring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgDeactivateKeyring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateKeyring"))
              .build();
        }
      }
    }
    return getDeactivateKeyringMethod;
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
    default void updateParams(com.zrchain.identity.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewWorkspace defines an operation for creating a new workspace
     * </pre>
     */
    default void newWorkspace(com.zrchain.identity.TxProto.MsgNewWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddWorkspaceOwner defines an operation for adding a workspace owner
     * </pre>
     */
    default void addWorkspaceOwner(com.zrchain.identity.TxProto.MsgAddWorkspaceOwner request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddWorkspaceOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * AppendChildWorkspace defines an operation for appending a child workspace
     * </pre>
     */
    default void appendChildWorkspace(com.zrchain.identity.TxProto.MsgAppendChildWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendChildWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewChildWorkspace defines an operation for creating a new child workspace
     * </pre>
     */
    default void newChildWorkspace(com.zrchain.identity.TxProto.MsgNewChildWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewChildWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveWorkspaceOwner defines an operation for removing a workspace owner
     * </pre>
     */
    default void removeWorkspaceOwner(com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveWorkspaceOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * // NewKeyring defines an operation for creating a keyring
     * </pre>
     */
    default void newKeyring(com.zrchain.identity.TxProto.MsgNewKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewKeyringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewKeyringMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddKeyringParty defines an operation for adding a party to a keyring
     * </pre>
     */
    default void addKeyringParty(com.zrchain.identity.TxProto.MsgAddKeyringParty request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddKeyringPartyMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateKeyring defines an operation to update the keyring attributes
     * </pre>
     */
    default void updateKeyring(com.zrchain.identity.TxProto.MsgUpdateKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateKeyringMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveKeyringParty defines an operation to remove a party from a keyring
     * </pre>
     */
    default void removeKeyringParty(com.zrchain.identity.TxProto.MsgRemoveKeyringParty request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveKeyringPartyMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddKeyringAdmin defines an operation to add an admin to a keyring
     * </pre>
     */
    default void addKeyringAdmin(com.zrchain.identity.TxProto.MsgAddKeyringAdmin request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddKeyringAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveKeyringAdmin defines an operation to remove an admin from a keyring
     * </pre>
     */
    default void removeKeyringAdmin(com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveKeyringAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a workspace, e.g. changing the policies in use.
     * </pre>
     */
    default void updateWorkspace(com.zrchain.identity.TxProto.MsgUpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a keyring
     * </pre>
     */
    default void deactivateKeyring(com.zrchain.identity.TxProto.MsgDeactivateKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateKeyringMethod(), responseObserver);
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
    public void updateParams(com.zrchain.identity.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewWorkspace defines an operation for creating a new workspace
     * </pre>
     */
    public void newWorkspace(com.zrchain.identity.TxProto.MsgNewWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddWorkspaceOwner defines an operation for adding a workspace owner
     * </pre>
     */
    public void addWorkspaceOwner(com.zrchain.identity.TxProto.MsgAddWorkspaceOwner request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddWorkspaceOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AppendChildWorkspace defines an operation for appending a child workspace
     * </pre>
     */
    public void appendChildWorkspace(com.zrchain.identity.TxProto.MsgAppendChildWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendChildWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewChildWorkspace defines an operation for creating a new child workspace
     * </pre>
     */
    public void newChildWorkspace(com.zrchain.identity.TxProto.MsgNewChildWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewChildWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveWorkspaceOwner defines an operation for removing a workspace owner
     * </pre>
     */
    public void removeWorkspaceOwner(com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveWorkspaceOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * // NewKeyring defines an operation for creating a keyring
     * </pre>
     */
    public void newKeyring(com.zrchain.identity.TxProto.MsgNewKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewKeyringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewKeyringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddKeyringParty defines an operation for adding a party to a keyring
     * </pre>
     */
    public void addKeyringParty(com.zrchain.identity.TxProto.MsgAddKeyringParty request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddKeyringPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateKeyring defines an operation to update the keyring attributes
     * </pre>
     */
    public void updateKeyring(com.zrchain.identity.TxProto.MsgUpdateKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateKeyringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveKeyringParty defines an operation to remove a party from a keyring
     * </pre>
     */
    public void removeKeyringParty(com.zrchain.identity.TxProto.MsgRemoveKeyringParty request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveKeyringPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddKeyringAdmin defines an operation to add an admin to a keyring
     * </pre>
     */
    public void addKeyringAdmin(com.zrchain.identity.TxProto.MsgAddKeyringAdmin request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddKeyringAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveKeyringAdmin defines an operation to remove an admin from a keyring
     * </pre>
     */
    public void removeKeyringAdmin(com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveKeyringAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a workspace, e.g. changing the policies in use.
     * </pre>
     */
    public void updateWorkspace(com.zrchain.identity.TxProto.MsgUpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a keyring
     * </pre>
     */
    public void deactivateKeyring(com.zrchain.identity.TxProto.MsgDeactivateKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateKeyringMethod(), getCallOptions()), request, responseObserver);
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
    public com.zrchain.identity.TxProto.MsgUpdateParamsResponse updateParams(com.zrchain.identity.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewWorkspace defines an operation for creating a new workspace
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgNewWorkspaceResponse newWorkspace(com.zrchain.identity.TxProto.MsgNewWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddWorkspaceOwner defines an operation for adding a workspace owner
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse addWorkspaceOwner(com.zrchain.identity.TxProto.MsgAddWorkspaceOwner request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddWorkspaceOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AppendChildWorkspace defines an operation for appending a child workspace
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse appendChildWorkspace(com.zrchain.identity.TxProto.MsgAppendChildWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendChildWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewChildWorkspace defines an operation for creating a new child workspace
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse newChildWorkspace(com.zrchain.identity.TxProto.MsgNewChildWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewChildWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveWorkspaceOwner defines an operation for removing a workspace owner
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse removeWorkspaceOwner(com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveWorkspaceOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * // NewKeyring defines an operation for creating a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgNewKeyringResponse newKeyring(com.zrchain.identity.TxProto.MsgNewKeyring request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewKeyringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddKeyringParty defines an operation for adding a party to a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse addKeyringParty(com.zrchain.identity.TxProto.MsgAddKeyringParty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddKeyringPartyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateKeyring defines an operation to update the keyring attributes
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgUpdateKeyringResponse updateKeyring(com.zrchain.identity.TxProto.MsgUpdateKeyring request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateKeyringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveKeyringParty defines an operation to remove a party from a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse removeKeyringParty(com.zrchain.identity.TxProto.MsgRemoveKeyringParty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveKeyringPartyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddKeyringAdmin defines an operation to add an admin to a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse addKeyringAdmin(com.zrchain.identity.TxProto.MsgAddKeyringAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddKeyringAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveKeyringAdmin defines an operation to remove an admin from a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse removeKeyringAdmin(com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveKeyringAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a workspace, e.g. changing the policies in use.
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse updateWorkspace(com.zrchain.identity.TxProto.MsgUpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a keyring
     * </pre>
     */
    public com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse deactivateKeyring(com.zrchain.identity.TxProto.MsgDeactivateKeyring request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateKeyringMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgUpdateParamsResponse> updateParams(
        com.zrchain.identity.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewWorkspace defines an operation for creating a new workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgNewWorkspaceResponse> newWorkspace(
        com.zrchain.identity.TxProto.MsgNewWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddWorkspaceOwner defines an operation for adding a workspace owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse> addWorkspaceOwner(
        com.zrchain.identity.TxProto.MsgAddWorkspaceOwner request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddWorkspaceOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AppendChildWorkspace defines an operation for appending a child workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse> appendChildWorkspace(
        com.zrchain.identity.TxProto.MsgAppendChildWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendChildWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewChildWorkspace defines an operation for creating a new child workspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse> newChildWorkspace(
        com.zrchain.identity.TxProto.MsgNewChildWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewChildWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveWorkspaceOwner defines an operation for removing a workspace owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse> removeWorkspaceOwner(
        com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveWorkspaceOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * // NewKeyring defines an operation for creating a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgNewKeyringResponse> newKeyring(
        com.zrchain.identity.TxProto.MsgNewKeyring request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewKeyringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddKeyringParty defines an operation for adding a party to a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse> addKeyringParty(
        com.zrchain.identity.TxProto.MsgAddKeyringParty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddKeyringPartyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateKeyring defines an operation to update the keyring attributes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgUpdateKeyringResponse> updateKeyring(
        com.zrchain.identity.TxProto.MsgUpdateKeyring request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateKeyringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveKeyringParty defines an operation to remove a party from a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse> removeKeyringParty(
        com.zrchain.identity.TxProto.MsgRemoveKeyringParty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveKeyringPartyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddKeyringAdmin defines an operation to add an admin to a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse> addKeyringAdmin(
        com.zrchain.identity.TxProto.MsgAddKeyringAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddKeyringAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveKeyringAdmin defines an operation to remove an admin from a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse> removeKeyringAdmin(
        com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveKeyringAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a workspace, e.g. changing the policies in use.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse> updateWorkspace(
        com.zrchain.identity.TxProto.MsgUpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse> deactivateKeyring(
        com.zrchain.identity.TxProto.MsgDeactivateKeyring request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateKeyringMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_PARAMS = 0;
  private static final int METHODID_NEW_WORKSPACE = 1;
  private static final int METHODID_ADD_WORKSPACE_OWNER = 2;
  private static final int METHODID_APPEND_CHILD_WORKSPACE = 3;
  private static final int METHODID_NEW_CHILD_WORKSPACE = 4;
  private static final int METHODID_REMOVE_WORKSPACE_OWNER = 5;
  private static final int METHODID_NEW_KEYRING = 6;
  private static final int METHODID_ADD_KEYRING_PARTY = 7;
  private static final int METHODID_UPDATE_KEYRING = 8;
  private static final int METHODID_REMOVE_KEYRING_PARTY = 9;
  private static final int METHODID_ADD_KEYRING_ADMIN = 10;
  private static final int METHODID_REMOVE_KEYRING_ADMIN = 11;
  private static final int METHODID_UPDATE_WORKSPACE = 12;
  private static final int METHODID_DEACTIVATE_KEYRING = 13;

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
          serviceImpl.updateParams((com.zrchain.identity.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_NEW_WORKSPACE:
          serviceImpl.newWorkspace((com.zrchain.identity.TxProto.MsgNewWorkspace) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewWorkspaceResponse>) responseObserver);
          break;
        case METHODID_ADD_WORKSPACE_OWNER:
          serviceImpl.addWorkspaceOwner((com.zrchain.identity.TxProto.MsgAddWorkspaceOwner) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse>) responseObserver);
          break;
        case METHODID_APPEND_CHILD_WORKSPACE:
          serviceImpl.appendChildWorkspace((com.zrchain.identity.TxProto.MsgAppendChildWorkspace) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse>) responseObserver);
          break;
        case METHODID_NEW_CHILD_WORKSPACE:
          serviceImpl.newChildWorkspace((com.zrchain.identity.TxProto.MsgNewChildWorkspace) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_WORKSPACE_OWNER:
          serviceImpl.removeWorkspaceOwner((com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse>) responseObserver);
          break;
        case METHODID_NEW_KEYRING:
          serviceImpl.newKeyring((com.zrchain.identity.TxProto.MsgNewKeyring) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgNewKeyringResponse>) responseObserver);
          break;
        case METHODID_ADD_KEYRING_PARTY:
          serviceImpl.addKeyringParty((com.zrchain.identity.TxProto.MsgAddKeyringParty) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_KEYRING:
          serviceImpl.updateKeyring((com.zrchain.identity.TxProto.MsgUpdateKeyring) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateKeyringResponse>) responseObserver);
          break;
        case METHODID_REMOVE_KEYRING_PARTY:
          serviceImpl.removeKeyringParty((com.zrchain.identity.TxProto.MsgRemoveKeyringParty) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse>) responseObserver);
          break;
        case METHODID_ADD_KEYRING_ADMIN:
          serviceImpl.addKeyringAdmin((com.zrchain.identity.TxProto.MsgAddKeyringAdmin) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse>) responseObserver);
          break;
        case METHODID_REMOVE_KEYRING_ADMIN:
          serviceImpl.removeKeyringAdmin((com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKSPACE:
          serviceImpl.updateWorkspace((com.zrchain.identity.TxProto.MsgUpdateWorkspace) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_KEYRING:
          serviceImpl.deactivateKeyring((com.zrchain.identity.TxProto.MsgDeactivateKeyring) request,
              (io.grpc.stub.StreamObserver<com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse>) responseObserver);
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
              com.zrchain.identity.TxProto.MsgUpdateParams,
              com.zrchain.identity.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getNewWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgNewWorkspace,
              com.zrchain.identity.TxProto.MsgNewWorkspaceResponse>(
                service, METHODID_NEW_WORKSPACE)))
        .addMethod(
          getAddWorkspaceOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgAddWorkspaceOwner,
              com.zrchain.identity.TxProto.MsgAddWorkspaceOwnerResponse>(
                service, METHODID_ADD_WORKSPACE_OWNER)))
        .addMethod(
          getAppendChildWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgAppendChildWorkspace,
              com.zrchain.identity.TxProto.MsgAppendChildWorkspaceResponse>(
                service, METHODID_APPEND_CHILD_WORKSPACE)))
        .addMethod(
          getNewChildWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgNewChildWorkspace,
              com.zrchain.identity.TxProto.MsgNewChildWorkspaceResponse>(
                service, METHODID_NEW_CHILD_WORKSPACE)))
        .addMethod(
          getRemoveWorkspaceOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwner,
              com.zrchain.identity.TxProto.MsgRemoveWorkspaceOwnerResponse>(
                service, METHODID_REMOVE_WORKSPACE_OWNER)))
        .addMethod(
          getNewKeyringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgNewKeyring,
              com.zrchain.identity.TxProto.MsgNewKeyringResponse>(
                service, METHODID_NEW_KEYRING)))
        .addMethod(
          getAddKeyringPartyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgAddKeyringParty,
              com.zrchain.identity.TxProto.MsgAddKeyringPartyResponse>(
                service, METHODID_ADD_KEYRING_PARTY)))
        .addMethod(
          getUpdateKeyringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgUpdateKeyring,
              com.zrchain.identity.TxProto.MsgUpdateKeyringResponse>(
                service, METHODID_UPDATE_KEYRING)))
        .addMethod(
          getRemoveKeyringPartyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgRemoveKeyringParty,
              com.zrchain.identity.TxProto.MsgRemoveKeyringPartyResponse>(
                service, METHODID_REMOVE_KEYRING_PARTY)))
        .addMethod(
          getAddKeyringAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgAddKeyringAdmin,
              com.zrchain.identity.TxProto.MsgAddKeyringAdminResponse>(
                service, METHODID_ADD_KEYRING_ADMIN)))
        .addMethod(
          getRemoveKeyringAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgRemoveKeyringAdmin,
              com.zrchain.identity.TxProto.MsgRemoveKeyringAdminResponse>(
                service, METHODID_REMOVE_KEYRING_ADMIN)))
        .addMethod(
          getUpdateWorkspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgUpdateWorkspace,
              com.zrchain.identity.TxProto.MsgUpdateWorkspaceResponse>(
                service, METHODID_UPDATE_WORKSPACE)))
        .addMethod(
          getDeactivateKeyringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.identity.TxProto.MsgDeactivateKeyring,
              com.zrchain.identity.TxProto.MsgDeactivateKeyringResponse>(
                service, METHODID_DEACTIVATE_KEYRING)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.identity.TxProto.getDescriptor();
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
              .addMethod(getNewWorkspaceMethod())
              .addMethod(getAddWorkspaceOwnerMethod())
              .addMethod(getAppendChildWorkspaceMethod())
              .addMethod(getNewChildWorkspaceMethod())
              .addMethod(getRemoveWorkspaceOwnerMethod())
              .addMethod(getNewKeyringMethod())
              .addMethod(getAddKeyringPartyMethod())
              .addMethod(getUpdateKeyringMethod())
              .addMethod(getRemoveKeyringPartyMethod())
              .addMethod(getAddKeyringAdminMethod())
              .addMethod(getRemoveKeyringAdminMethod())
              .addMethod(getUpdateWorkspaceMethod())
              .addMethod(getDeactivateKeyringMethod())
              .build();
        }
      }
    }
    return result;
  }
}
