package com.noble.fiattokenfactory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: noble/fiattokenfactory/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "noble.fiattokenfactory.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter,
      com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMasterMinter",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter,
      com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter, com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> getUpdateMasterMinterMethod;
    if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateMasterMinterMethod = MsgGrpc.getUpdateMasterMinterMethod) == null) {
          MsgGrpc.getUpdateMasterMinterMethod = getUpdateMasterMinterMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter, com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateMasterMinter"))
              .build();
        }
      }
    }
    return getUpdateMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdatePauser,
      com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> getUpdatePauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePauser",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUpdatePauser.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdatePauser,
      com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> getUpdatePauserMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdatePauser, com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> getUpdatePauserMethod;
    if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePauserMethod = MsgGrpc.getUpdatePauserMethod) == null) {
          MsgGrpc.getUpdatePauserMethod = getUpdatePauserMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUpdatePauser, com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdatePauser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePauser"))
              .build();
        }
      }
    }
    return getUpdatePauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister,
      com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlacklister",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister,
      com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister, com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> getUpdateBlacklisterMethod;
    if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBlacklisterMethod = MsgGrpc.getUpdateBlacklisterMethod) == null) {
          MsgGrpc.getUpdateBlacklisterMethod = getUpdateBlacklisterMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister, com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBlacklister"))
              .build();
        }
      }
    }
    return getUpdateBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateOwner,
      com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOwner",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUpdateOwner.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateOwner,
      com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUpdateOwner, com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateOwnerMethod = MsgGrpc.getUpdateOwnerMethod) == null) {
          MsgGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUpdateOwner, com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateOwner"))
              .build();
        }
      }
    }
    return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgAcceptOwner,
      com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> getAcceptOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptOwner",
      requestType = com.noble.fiattokenfactory.TxProto.MsgAcceptOwner.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgAcceptOwner,
      com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> getAcceptOwnerMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgAcceptOwner, com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> getAcceptOwnerMethod;
    if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcceptOwnerMethod = MsgGrpc.getAcceptOwnerMethod) == null) {
          MsgGrpc.getAcceptOwnerMethod = getAcceptOwnerMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgAcceptOwner, com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgAcceptOwner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AcceptOwner"))
              .build();
        }
      }
    }
    return getAcceptOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinter,
      com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> getConfigureMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinter",
      requestType = com.noble.fiattokenfactory.TxProto.MsgConfigureMinter.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinter,
      com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> getConfigureMinterMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinter, com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> getConfigureMinterMethod;
    if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterMethod = MsgGrpc.getConfigureMinterMethod) == null) {
          MsgGrpc.getConfigureMinterMethod = getConfigureMinterMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgConfigureMinter, com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgConfigureMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinter"))
              .build();
        }
      }
    }
    return getConfigureMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinter,
      com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> getRemoveMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinter",
      requestType = com.noble.fiattokenfactory.TxProto.MsgRemoveMinter.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinter,
      com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> getRemoveMinterMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinter, com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> getRemoveMinterMethod;
    if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterMethod = MsgGrpc.getRemoveMinterMethod) == null) {
          MsgGrpc.getRemoveMinterMethod = getRemoveMinterMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgRemoveMinter, com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgRemoveMinter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMinter"))
              .build();
        }
      }
    }
    return getRemoveMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgMint,
      com.noble.fiattokenfactory.TxProto.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = com.noble.fiattokenfactory.TxProto.MsgMint.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgMint,
      com.noble.fiattokenfactory.TxProto.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgMint, com.noble.fiattokenfactory.TxProto.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgMint, com.noble.fiattokenfactory.TxProto.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBurn,
      com.noble.fiattokenfactory.TxProto.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = com.noble.fiattokenfactory.TxProto.MsgBurn.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBurn,
      com.noble.fiattokenfactory.TxProto.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBurn, com.noble.fiattokenfactory.TxProto.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgBurn, com.noble.fiattokenfactory.TxProto.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgBurn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBlacklist,
      com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> getBlacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklist",
      requestType = com.noble.fiattokenfactory.TxProto.MsgBlacklist.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBlacklist,
      com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> getBlacklistMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgBlacklist, com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> getBlacklistMethod;
    if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBlacklistMethod = MsgGrpc.getBlacklistMethod) == null) {
          MsgGrpc.getBlacklistMethod = getBlacklistMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgBlacklist, com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgBlacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Blacklist"))
              .build();
        }
      }
    }
    return getBlacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnblacklist,
      com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> getUnblacklistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unblacklist",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUnblacklist.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnblacklist,
      com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> getUnblacklistMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnblacklist, com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> getUnblacklistMethod;
    if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnblacklistMethod = MsgGrpc.getUnblacklistMethod) == null) {
          MsgGrpc.getUnblacklistMethod = getUnblacklistMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUnblacklist, com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unblacklist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUnblacklist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unblacklist"))
              .build();
        }
      }
    }
    return getUnblacklistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgPause,
      com.noble.fiattokenfactory.TxProto.MsgPauseResponse> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = com.noble.fiattokenfactory.TxProto.MsgPause.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgPauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgPause,
      com.noble.fiattokenfactory.TxProto.MsgPauseResponse> getPauseMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgPause, com.noble.fiattokenfactory.TxProto.MsgPauseResponse> getPauseMethod;
    if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseMethod = MsgGrpc.getPauseMethod) == null) {
          MsgGrpc.getPauseMethod = getPauseMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgPause, com.noble.fiattokenfactory.TxProto.MsgPauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgPause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgPauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Pause"))
              .build();
        }
      }
    }
    return getPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnpause,
      com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> getUnpauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unpause",
      requestType = com.noble.fiattokenfactory.TxProto.MsgUnpause.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnpause,
      com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> getUnpauseMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgUnpause, com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> getUnpauseMethod;
    if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnpauseMethod = MsgGrpc.getUnpauseMethod) == null) {
          MsgGrpc.getUnpauseMethod = getUnpauseMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgUnpause, com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unpause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUnpause.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unpause"))
              .build();
        }
      }
    }
    return getUnpauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController,
      com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureMinterController",
      requestType = com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController,
      com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController, com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> getConfigureMinterControllerMethod;
    if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfigureMinterControllerMethod = MsgGrpc.getConfigureMinterControllerMethod) == null) {
          MsgGrpc.getConfigureMinterControllerMethod = getConfigureMinterControllerMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController, com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfigureMinterController"))
              .build();
        }
      }
    }
    return getConfigureMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController,
      com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMinterController",
      requestType = com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController.class,
      responseType = com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController,
      com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod() {
    io.grpc.MethodDescriptor<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController, com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> getRemoveMinterControllerMethod;
    if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveMinterControllerMethod = MsgGrpc.getRemoveMinterControllerMethod) == null) {
          MsgGrpc.getRemoveMinterControllerMethod = getRemoveMinterControllerMethod =
              io.grpc.MethodDescriptor.<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController, com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveMinterController"))
              .build();
        }
      }
    }
    return getRemoveMinterControllerMethod;
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
     */
    default void updateMasterMinter(com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMasterMinterMethod(), responseObserver);
    }

    /**
     */
    default void updatePauser(com.noble.fiattokenfactory.TxProto.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePauserMethod(), responseObserver);
    }

    /**
     */
    default void updateBlacklister(com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBlacklisterMethod(), responseObserver);
    }

    /**
     */
    default void updateOwner(com.noble.fiattokenfactory.TxProto.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    default void acceptOwner(com.noble.fiattokenfactory.TxProto.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptOwnerMethod(), responseObserver);
    }

    /**
     */
    default void configureMinter(com.noble.fiattokenfactory.TxProto.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureMinterMethod(), responseObserver);
    }

    /**
     */
    default void removeMinter(com.noble.fiattokenfactory.TxProto.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMinterMethod(), responseObserver);
    }

    /**
     */
    default void mint(com.noble.fiattokenfactory.TxProto.MsgMint request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     */
    default void burn(com.noble.fiattokenfactory.TxProto.MsgBurn request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     */
    default void blacklist(com.noble.fiattokenfactory.TxProto.MsgBlacklist request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlacklistMethod(), responseObserver);
    }

    /**
     */
    default void unblacklist(com.noble.fiattokenfactory.TxProto.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnblacklistMethod(), responseObserver);
    }

    /**
     */
    default void pause(com.noble.fiattokenfactory.TxProto.MsgPause request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgPauseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    /**
     */
    default void unpause(com.noble.fiattokenfactory.TxProto.MsgUnpause request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnpauseMethod(), responseObserver);
    }

    /**
     */
    default void configureMinterController(com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void removeMinterController(com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMinterControllerMethod(), responseObserver);
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
     */
    public void updateMasterMinter(com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePauser(com.noble.fiattokenfactory.TxProto.MsgUpdatePauser request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlacklister(com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(com.noble.fiattokenfactory.TxProto.MsgUpdateOwner request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void acceptOwner(com.noble.fiattokenfactory.TxProto.MsgAcceptOwner request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinter(com.noble.fiattokenfactory.TxProto.MsgConfigureMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeMinter(com.noble.fiattokenfactory.TxProto.MsgRemoveMinter request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mint(com.noble.fiattokenfactory.TxProto.MsgMint request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burn(com.noble.fiattokenfactory.TxProto.MsgBurn request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void blacklist(com.noble.fiattokenfactory.TxProto.MsgBlacklist request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unblacklist(com.noble.fiattokenfactory.TxProto.MsgUnblacklist request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pause(com.noble.fiattokenfactory.TxProto.MsgPause request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgPauseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unpause(com.noble.fiattokenfactory.TxProto.MsgUnpause request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureMinterController(com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeMinterController(com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController request,
        io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMinterControllerMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse updateMasterMinter(com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse updatePauser(com.noble.fiattokenfactory.TxProto.MsgUpdatePauser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePauserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse updateBlacklister(com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse updateOwner(com.noble.fiattokenfactory.TxProto.MsgUpdateOwner request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse acceptOwner(com.noble.fiattokenfactory.TxProto.MsgAcceptOwner request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse configureMinter(com.noble.fiattokenfactory.TxProto.MsgConfigureMinter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse removeMinter(com.noble.fiattokenfactory.TxProto.MsgRemoveMinter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgMintResponse mint(com.noble.fiattokenfactory.TxProto.MsgMint request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgBurnResponse burn(com.noble.fiattokenfactory.TxProto.MsgBurn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse blacklist(com.noble.fiattokenfactory.TxProto.MsgBlacklist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse unblacklist(com.noble.fiattokenfactory.TxProto.MsgUnblacklist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnblacklistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgPauseResponse pause(com.noble.fiattokenfactory.TxProto.MsgPause request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse unpause(com.noble.fiattokenfactory.TxProto.MsgUnpause request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnpauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse configureMinterController(com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse removeMinterController(com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMinterControllerMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse> updateMasterMinter(
        com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse> updatePauser(
        com.noble.fiattokenfactory.TxProto.MsgUpdatePauser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePauserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse> updateBlacklister(
        com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse> updateOwner(
        com.noble.fiattokenfactory.TxProto.MsgUpdateOwner request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse> acceptOwner(
        com.noble.fiattokenfactory.TxProto.MsgAcceptOwner request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse> configureMinter(
        com.noble.fiattokenfactory.TxProto.MsgConfigureMinter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse> removeMinter(
        com.noble.fiattokenfactory.TxProto.MsgRemoveMinter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMinterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgMintResponse> mint(
        com.noble.fiattokenfactory.TxProto.MsgMint request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgBurnResponse> burn(
        com.noble.fiattokenfactory.TxProto.MsgBurn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse> blacklist(
        com.noble.fiattokenfactory.TxProto.MsgBlacklist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse> unblacklist(
        com.noble.fiattokenfactory.TxProto.MsgUnblacklist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnblacklistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgPauseResponse> pause(
        com.noble.fiattokenfactory.TxProto.MsgPause request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse> unpause(
        com.noble.fiattokenfactory.TxProto.MsgUnpause request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnpauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse> configureMinterController(
        com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse> removeMinterController(
        com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMinterControllerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_MASTER_MINTER = 0;
  private static final int METHODID_UPDATE_PAUSER = 1;
  private static final int METHODID_UPDATE_BLACKLISTER = 2;
  private static final int METHODID_UPDATE_OWNER = 3;
  private static final int METHODID_ACCEPT_OWNER = 4;
  private static final int METHODID_CONFIGURE_MINTER = 5;
  private static final int METHODID_REMOVE_MINTER = 6;
  private static final int METHODID_MINT = 7;
  private static final int METHODID_BURN = 8;
  private static final int METHODID_BLACKLIST = 9;
  private static final int METHODID_UNBLACKLIST = 10;
  private static final int METHODID_PAUSE = 11;
  private static final int METHODID_UNPAUSE = 12;
  private static final int METHODID_CONFIGURE_MINTER_CONTROLLER = 13;
  private static final int METHODID_REMOVE_MINTER_CONTROLLER = 14;

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
        case METHODID_UPDATE_MASTER_MINTER:
          serviceImpl.updateMasterMinter((com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAUSER:
          serviceImpl.updatePauser((com.noble.fiattokenfactory.TxProto.MsgUpdatePauser) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLACKLISTER:
          serviceImpl.updateBlacklister((com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((com.noble.fiattokenfactory.TxProto.MsgUpdateOwner) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_OWNER:
          serviceImpl.acceptOwner((com.noble.fiattokenfactory.TxProto.MsgAcceptOwner) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER:
          serviceImpl.configureMinter((com.noble.fiattokenfactory.TxProto.MsgConfigureMinter) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER:
          serviceImpl.removeMinter((com.noble.fiattokenfactory.TxProto.MsgRemoveMinter) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((com.noble.fiattokenfactory.TxProto.MsgMint) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((com.noble.fiattokenfactory.TxProto.MsgBurn) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_BLACKLIST:
          serviceImpl.blacklist((com.noble.fiattokenfactory.TxProto.MsgBlacklist) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse>) responseObserver);
          break;
        case METHODID_UNBLACKLIST:
          serviceImpl.unblacklist((com.noble.fiattokenfactory.TxProto.MsgUnblacklist) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse>) responseObserver);
          break;
        case METHODID_PAUSE:
          serviceImpl.pause((com.noble.fiattokenfactory.TxProto.MsgPause) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgPauseResponse>) responseObserver);
          break;
        case METHODID_UNPAUSE:
          serviceImpl.unpause((com.noble.fiattokenfactory.TxProto.MsgUnpause) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_MINTER_CONTROLLER:
          serviceImpl.configureMinterController((com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MINTER_CONTROLLER:
          serviceImpl.removeMinterController((com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController) request,
              (io.grpc.stub.StreamObserver<com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse>) responseObserver);
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
          getUpdateMasterMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinter,
              com.noble.fiattokenfactory.TxProto.MsgUpdateMasterMinterResponse>(
                service, METHODID_UPDATE_MASTER_MINTER)))
        .addMethod(
          getUpdatePauserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUpdatePauser,
              com.noble.fiattokenfactory.TxProto.MsgUpdatePauserResponse>(
                service, METHODID_UPDATE_PAUSER)))
        .addMethod(
          getUpdateBlacklisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklister,
              com.noble.fiattokenfactory.TxProto.MsgUpdateBlacklisterResponse>(
                service, METHODID_UPDATE_BLACKLISTER)))
        .addMethod(
          getUpdateOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUpdateOwner,
              com.noble.fiattokenfactory.TxProto.MsgUpdateOwnerResponse>(
                service, METHODID_UPDATE_OWNER)))
        .addMethod(
          getAcceptOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgAcceptOwner,
              com.noble.fiattokenfactory.TxProto.MsgAcceptOwnerResponse>(
                service, METHODID_ACCEPT_OWNER)))
        .addMethod(
          getConfigureMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgConfigureMinter,
              com.noble.fiattokenfactory.TxProto.MsgConfigureMinterResponse>(
                service, METHODID_CONFIGURE_MINTER)))
        .addMethod(
          getRemoveMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgRemoveMinter,
              com.noble.fiattokenfactory.TxProto.MsgRemoveMinterResponse>(
                service, METHODID_REMOVE_MINTER)))
        .addMethod(
          getMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgMint,
              com.noble.fiattokenfactory.TxProto.MsgMintResponse>(
                service, METHODID_MINT)))
        .addMethod(
          getBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgBurn,
              com.noble.fiattokenfactory.TxProto.MsgBurnResponse>(
                service, METHODID_BURN)))
        .addMethod(
          getBlacklistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgBlacklist,
              com.noble.fiattokenfactory.TxProto.MsgBlacklistResponse>(
                service, METHODID_BLACKLIST)))
        .addMethod(
          getUnblacklistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUnblacklist,
              com.noble.fiattokenfactory.TxProto.MsgUnblacklistResponse>(
                service, METHODID_UNBLACKLIST)))
        .addMethod(
          getPauseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgPause,
              com.noble.fiattokenfactory.TxProto.MsgPauseResponse>(
                service, METHODID_PAUSE)))
        .addMethod(
          getUnpauseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgUnpause,
              com.noble.fiattokenfactory.TxProto.MsgUnpauseResponse>(
                service, METHODID_UNPAUSE)))
        .addMethod(
          getConfigureMinterControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgConfigureMinterController,
              com.noble.fiattokenfactory.TxProto.MsgConfigureMinterControllerResponse>(
                service, METHODID_CONFIGURE_MINTER_CONTROLLER)))
        .addMethod(
          getRemoveMinterControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.fiattokenfactory.TxProto.MsgRemoveMinterController,
              com.noble.fiattokenfactory.TxProto.MsgRemoveMinterControllerResponse>(
                service, METHODID_REMOVE_MINTER_CONTROLLER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.noble.fiattokenfactory.TxProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getUpdateMasterMinterMethod())
              .addMethod(getUpdatePauserMethod())
              .addMethod(getUpdateBlacklisterMethod())
              .addMethod(getUpdateOwnerMethod())
              .addMethod(getAcceptOwnerMethod())
              .addMethod(getConfigureMinterMethod())
              .addMethod(getRemoveMinterMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getBlacklistMethod())
              .addMethod(getUnblacklistMethod())
              .addMethod(getPauseMethod())
              .addMethod(getUnpauseMethod())
              .addMethod(getConfigureMinterControllerMethod())
              .addMethod(getRemoveMinterControllerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
