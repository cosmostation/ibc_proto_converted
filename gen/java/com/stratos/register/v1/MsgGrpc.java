package com.stratos.register.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the register module Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/register/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stratos.register.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateResourceNode,
      com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> getHandleMsgCreateResourceNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgCreateResourceNode",
      requestType = com.stratos.register.v1.TxProto.MsgCreateResourceNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateResourceNode,
      com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> getHandleMsgCreateResourceNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateResourceNode, com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> getHandleMsgCreateResourceNodeMethod;
    if ((getHandleMsgCreateResourceNodeMethod = MsgGrpc.getHandleMsgCreateResourceNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgCreateResourceNodeMethod = MsgGrpc.getHandleMsgCreateResourceNodeMethod) == null) {
          MsgGrpc.getHandleMsgCreateResourceNodeMethod = getHandleMsgCreateResourceNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgCreateResourceNode, com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgCreateResourceNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgCreateResourceNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgCreateResourceNode"))
              .build();
        }
      }
    }
    return getHandleMsgCreateResourceNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveResourceNode,
      com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> getHandleMsgRemoveResourceNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgRemoveResourceNode",
      requestType = com.stratos.register.v1.TxProto.MsgRemoveResourceNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveResourceNode,
      com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> getHandleMsgRemoveResourceNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveResourceNode, com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> getHandleMsgRemoveResourceNodeMethod;
    if ((getHandleMsgRemoveResourceNodeMethod = MsgGrpc.getHandleMsgRemoveResourceNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgRemoveResourceNodeMethod = MsgGrpc.getHandleMsgRemoveResourceNodeMethod) == null) {
          MsgGrpc.getHandleMsgRemoveResourceNodeMethod = getHandleMsgRemoveResourceNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgRemoveResourceNode, com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgRemoveResourceNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgRemoveResourceNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgRemoveResourceNode"))
              .build();
        }
      }
    }
    return getHandleMsgRemoveResourceNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNode,
      com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> getHandleMsgUpdateResourceNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgUpdateResourceNode",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateResourceNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNode,
      com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> getHandleMsgUpdateResourceNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNode, com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> getHandleMsgUpdateResourceNodeMethod;
    if ((getHandleMsgUpdateResourceNodeMethod = MsgGrpc.getHandleMsgUpdateResourceNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgUpdateResourceNodeMethod = MsgGrpc.getHandleMsgUpdateResourceNodeMethod) == null) {
          MsgGrpc.getHandleMsgUpdateResourceNodeMethod = getHandleMsgUpdateResourceNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateResourceNode, com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgUpdateResourceNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateResourceNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgUpdateResourceNode"))
              .build();
        }
      }
    }
    return getHandleMsgUpdateResourceNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> getHandleMsgUpdateResourceNodeDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgUpdateResourceNodeDeposit",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> getHandleMsgUpdateResourceNodeDepositMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit, com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> getHandleMsgUpdateResourceNodeDepositMethod;
    if ((getHandleMsgUpdateResourceNodeDepositMethod = MsgGrpc.getHandleMsgUpdateResourceNodeDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgUpdateResourceNodeDepositMethod = MsgGrpc.getHandleMsgUpdateResourceNodeDepositMethod) == null) {
          MsgGrpc.getHandleMsgUpdateResourceNodeDepositMethod = getHandleMsgUpdateResourceNodeDepositMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit, com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgUpdateResourceNodeDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgUpdateResourceNodeDeposit"))
              .build();
        }
      }
    }
    return getHandleMsgUpdateResourceNodeDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> getHandleMsgUpdateEffectiveDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgUpdateEffectiveDeposit",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> getHandleMsgUpdateEffectiveDepositMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit, com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> getHandleMsgUpdateEffectiveDepositMethod;
    if ((getHandleMsgUpdateEffectiveDepositMethod = MsgGrpc.getHandleMsgUpdateEffectiveDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgUpdateEffectiveDepositMethod = MsgGrpc.getHandleMsgUpdateEffectiveDepositMethod) == null) {
          MsgGrpc.getHandleMsgUpdateEffectiveDepositMethod = getHandleMsgUpdateEffectiveDepositMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit, com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgUpdateEffectiveDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgUpdateEffectiveDeposit"))
              .build();
        }
      }
    }
    return getHandleMsgUpdateEffectiveDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateMetaNode,
      com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> getHandleMsgCreateMetaNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgCreateMetaNode",
      requestType = com.stratos.register.v1.TxProto.MsgCreateMetaNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateMetaNode,
      com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> getHandleMsgCreateMetaNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgCreateMetaNode, com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> getHandleMsgCreateMetaNodeMethod;
    if ((getHandleMsgCreateMetaNodeMethod = MsgGrpc.getHandleMsgCreateMetaNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgCreateMetaNodeMethod = MsgGrpc.getHandleMsgCreateMetaNodeMethod) == null) {
          MsgGrpc.getHandleMsgCreateMetaNodeMethod = getHandleMsgCreateMetaNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgCreateMetaNode, com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgCreateMetaNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgCreateMetaNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgCreateMetaNode"))
              .build();
        }
      }
    }
    return getHandleMsgCreateMetaNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveMetaNode,
      com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> getHandleMsgRemoveMetaNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgRemoveMetaNode",
      requestType = com.stratos.register.v1.TxProto.MsgRemoveMetaNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveMetaNode,
      com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> getHandleMsgRemoveMetaNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgRemoveMetaNode, com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> getHandleMsgRemoveMetaNodeMethod;
    if ((getHandleMsgRemoveMetaNodeMethod = MsgGrpc.getHandleMsgRemoveMetaNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgRemoveMetaNodeMethod = MsgGrpc.getHandleMsgRemoveMetaNodeMethod) == null) {
          MsgGrpc.getHandleMsgRemoveMetaNodeMethod = getHandleMsgRemoveMetaNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgRemoveMetaNode, com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgRemoveMetaNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgRemoveMetaNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgRemoveMetaNode"))
              .build();
        }
      }
    }
    return getHandleMsgRemoveMetaNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNode,
      com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> getHandleMsgUpdateMetaNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgUpdateMetaNode",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateMetaNode.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNode,
      com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> getHandleMsgUpdateMetaNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNode, com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> getHandleMsgUpdateMetaNodeMethod;
    if ((getHandleMsgUpdateMetaNodeMethod = MsgGrpc.getHandleMsgUpdateMetaNodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgUpdateMetaNodeMethod = MsgGrpc.getHandleMsgUpdateMetaNodeMethod) == null) {
          MsgGrpc.getHandleMsgUpdateMetaNodeMethod = getHandleMsgUpdateMetaNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateMetaNode, com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgUpdateMetaNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateMetaNode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgUpdateMetaNode"))
              .build();
        }
      }
    }
    return getHandleMsgUpdateMetaNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> getHandleMsgUpdateMetaNodeDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgUpdateMetaNodeDeposit",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit,
      com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> getHandleMsgUpdateMetaNodeDepositMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit, com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> getHandleMsgUpdateMetaNodeDepositMethod;
    if ((getHandleMsgUpdateMetaNodeDepositMethod = MsgGrpc.getHandleMsgUpdateMetaNodeDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgUpdateMetaNodeDepositMethod = MsgGrpc.getHandleMsgUpdateMetaNodeDepositMethod) == null) {
          MsgGrpc.getHandleMsgUpdateMetaNodeDepositMethod = getHandleMsgUpdateMetaNodeDepositMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit, com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgUpdateMetaNodeDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgUpdateMetaNodeDeposit"))
              .build();
        }
      }
    }
    return getHandleMsgUpdateMetaNodeDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote,
      com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> getHandleMsgMetaNodeRegistrationVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgMetaNodeRegistrationVote",
      requestType = com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote.class,
      responseType = com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote,
      com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> getHandleMsgMetaNodeRegistrationVoteMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote, com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> getHandleMsgMetaNodeRegistrationVoteMethod;
    if ((getHandleMsgMetaNodeRegistrationVoteMethod = MsgGrpc.getHandleMsgMetaNodeRegistrationVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgMetaNodeRegistrationVoteMethod = MsgGrpc.getHandleMsgMetaNodeRegistrationVoteMethod) == null) {
          MsgGrpc.getHandleMsgMetaNodeRegistrationVoteMethod = getHandleMsgMetaNodeRegistrationVoteMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote, com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgMetaNodeRegistrationVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgMetaNodeRegistrationVote"))
              .build();
        }
      }
    }
    return getHandleMsgMetaNodeRegistrationVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgKickMetaNodeVote,
      com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> getHandleMsgKickMetaNodeVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleMsgKickMetaNodeVote",
      requestType = com.stratos.register.v1.TxProto.MsgKickMetaNodeVote.class,
      responseType = com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgKickMetaNodeVote,
      com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> getHandleMsgKickMetaNodeVoteMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgKickMetaNodeVote, com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> getHandleMsgKickMetaNodeVoteMethod;
    if ((getHandleMsgKickMetaNodeVoteMethod = MsgGrpc.getHandleMsgKickMetaNodeVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHandleMsgKickMetaNodeVoteMethod = MsgGrpc.getHandleMsgKickMetaNodeVoteMethod) == null) {
          MsgGrpc.getHandleMsgKickMetaNodeVoteMethod = getHandleMsgKickMetaNodeVoteMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgKickMetaNodeVote, com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandleMsgKickMetaNodeVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgKickMetaNodeVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("HandleMsgKickMetaNodeVote"))
              .build();
        }
      }
    }
    return getHandleMsgKickMetaNodeVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateParams,
      com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.stratos.register.v1.TxProto.MsgUpdateParams.class,
      responseType = com.stratos.register.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateParams,
      com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.TxProto.MsgUpdateParams, com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.TxProto.MsgUpdateParams, com.stratos.register.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the register module Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateResourceNode defines a method for creating a new resource node.
     * </pre>
     */
    default void handleMsgCreateResourceNode(com.stratos.register.v1.TxProto.MsgCreateResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgCreateResourceNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgRemoveResourceNode(com.stratos.register.v1.TxProto.MsgRemoveResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgRemoveResourceNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgUpdateResourceNode(com.stratos.register.v1.TxProto.MsgUpdateResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgUpdateResourceNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgUpdateResourceNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgUpdateResourceNodeDepositMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgUpdateEffectiveDeposit(com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgUpdateEffectiveDepositMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgCreateMetaNode(com.stratos.register.v1.TxProto.MsgCreateMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgCreateMetaNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgRemoveMetaNode(com.stratos.register.v1.TxProto.MsgRemoveMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgRemoveMetaNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgUpdateMetaNode(com.stratos.register.v1.TxProto.MsgUpdateMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgUpdateMetaNodeMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgUpdateMetaNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgUpdateMetaNodeDepositMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgMetaNodeRegistrationVote(com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgMetaNodeRegistrationVoteMethod(), responseObserver);
    }

    /**
     */
    default void handleMsgKickMetaNodeVote(com.stratos.register.v1.TxProto.MsgKickMetaNodeVote request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleMsgKickMetaNodeVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/register module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    default void updateParams(com.stratos.register.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the register module Msg service.
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
   * Msg defines the register module Msg service.
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
     * CreateResourceNode defines a method for creating a new resource node.
     * </pre>
     */
    public void handleMsgCreateResourceNode(com.stratos.register.v1.TxProto.MsgCreateResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgCreateResourceNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgRemoveResourceNode(com.stratos.register.v1.TxProto.MsgRemoveResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgRemoveResourceNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgUpdateResourceNode(com.stratos.register.v1.TxProto.MsgUpdateResourceNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgUpdateResourceNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgUpdateResourceNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgUpdateResourceNodeDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgUpdateEffectiveDeposit(com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgUpdateEffectiveDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgCreateMetaNode(com.stratos.register.v1.TxProto.MsgCreateMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgCreateMetaNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgRemoveMetaNode(com.stratos.register.v1.TxProto.MsgRemoveMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgRemoveMetaNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgUpdateMetaNode(com.stratos.register.v1.TxProto.MsgUpdateMetaNode request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgUpdateMetaNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgUpdateMetaNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgUpdateMetaNodeDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgMetaNodeRegistrationVote(com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgMetaNodeRegistrationVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleMsgKickMetaNodeVote(com.stratos.register.v1.TxProto.MsgKickMetaNodeVote request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleMsgKickMetaNodeVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/register module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public void updateParams(com.stratos.register.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the register module Msg service.
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
     * CreateResourceNode defines a method for creating a new resource node.
     * </pre>
     */
    public com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse handleMsgCreateResourceNode(com.stratos.register.v1.TxProto.MsgCreateResourceNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgCreateResourceNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse handleMsgRemoveResourceNode(com.stratos.register.v1.TxProto.MsgRemoveResourceNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgRemoveResourceNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse handleMsgUpdateResourceNode(com.stratos.register.v1.TxProto.MsgUpdateResourceNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgUpdateResourceNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse handleMsgUpdateResourceNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgUpdateResourceNodeDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse handleMsgUpdateEffectiveDeposit(com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgUpdateEffectiveDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse handleMsgCreateMetaNode(com.stratos.register.v1.TxProto.MsgCreateMetaNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgCreateMetaNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse handleMsgRemoveMetaNode(com.stratos.register.v1.TxProto.MsgRemoveMetaNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgRemoveMetaNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse handleMsgUpdateMetaNode(com.stratos.register.v1.TxProto.MsgUpdateMetaNode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgUpdateMetaNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse handleMsgUpdateMetaNodeDeposit(com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgUpdateMetaNodeDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse handleMsgMetaNodeRegistrationVote(com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgMetaNodeRegistrationVoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse handleMsgKickMetaNodeVote(com.stratos.register.v1.TxProto.MsgKickMetaNodeVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleMsgKickMetaNodeVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/register module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.stratos.register.v1.TxProto.MsgUpdateParamsResponse updateParams(com.stratos.register.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the register module Msg service.
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
     * CreateResourceNode defines a method for creating a new resource node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse> handleMsgCreateResourceNode(
        com.stratos.register.v1.TxProto.MsgCreateResourceNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgCreateResourceNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse> handleMsgRemoveResourceNode(
        com.stratos.register.v1.TxProto.MsgRemoveResourceNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgRemoveResourceNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse> handleMsgUpdateResourceNode(
        com.stratos.register.v1.TxProto.MsgUpdateResourceNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgUpdateResourceNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse> handleMsgUpdateResourceNodeDeposit(
        com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgUpdateResourceNodeDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse> handleMsgUpdateEffectiveDeposit(
        com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgUpdateEffectiveDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse> handleMsgCreateMetaNode(
        com.stratos.register.v1.TxProto.MsgCreateMetaNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgCreateMetaNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse> handleMsgRemoveMetaNode(
        com.stratos.register.v1.TxProto.MsgRemoveMetaNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgRemoveMetaNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse> handleMsgUpdateMetaNode(
        com.stratos.register.v1.TxProto.MsgUpdateMetaNode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgUpdateMetaNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse> handleMsgUpdateMetaNodeDeposit(
        com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgUpdateMetaNodeDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse> handleMsgMetaNodeRegistrationVote(
        com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgMetaNodeRegistrationVoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse> handleMsgKickMetaNodeVote(
        com.stratos.register.v1.TxProto.MsgKickMetaNodeVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleMsgKickMetaNodeVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defined a governance operation for updating the x/register module parameters.
     * The authority is hard-coded to the Cosmos SDK x/gov module account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.stratos.register.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_MSG_CREATE_RESOURCE_NODE = 0;
  private static final int METHODID_HANDLE_MSG_REMOVE_RESOURCE_NODE = 1;
  private static final int METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE = 2;
  private static final int METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE_DEPOSIT = 3;
  private static final int METHODID_HANDLE_MSG_UPDATE_EFFECTIVE_DEPOSIT = 4;
  private static final int METHODID_HANDLE_MSG_CREATE_META_NODE = 5;
  private static final int METHODID_HANDLE_MSG_REMOVE_META_NODE = 6;
  private static final int METHODID_HANDLE_MSG_UPDATE_META_NODE = 7;
  private static final int METHODID_HANDLE_MSG_UPDATE_META_NODE_DEPOSIT = 8;
  private static final int METHODID_HANDLE_MSG_META_NODE_REGISTRATION_VOTE = 9;
  private static final int METHODID_HANDLE_MSG_KICK_META_NODE_VOTE = 10;
  private static final int METHODID_UPDATE_PARAMS = 11;

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
        case METHODID_HANDLE_MSG_CREATE_RESOURCE_NODE:
          serviceImpl.handleMsgCreateResourceNode((com.stratos.register.v1.TxProto.MsgCreateResourceNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_REMOVE_RESOURCE_NODE:
          serviceImpl.handleMsgRemoveResourceNode((com.stratos.register.v1.TxProto.MsgRemoveResourceNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE:
          serviceImpl.handleMsgUpdateResourceNode((com.stratos.register.v1.TxProto.MsgUpdateResourceNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE_DEPOSIT:
          serviceImpl.handleMsgUpdateResourceNodeDeposit((com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_UPDATE_EFFECTIVE_DEPOSIT:
          serviceImpl.handleMsgUpdateEffectiveDeposit((com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_CREATE_META_NODE:
          serviceImpl.handleMsgCreateMetaNode((com.stratos.register.v1.TxProto.MsgCreateMetaNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_REMOVE_META_NODE:
          serviceImpl.handleMsgRemoveMetaNode((com.stratos.register.v1.TxProto.MsgRemoveMetaNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_UPDATE_META_NODE:
          serviceImpl.handleMsgUpdateMetaNode((com.stratos.register.v1.TxProto.MsgUpdateMetaNode) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_UPDATE_META_NODE_DEPOSIT:
          serviceImpl.handleMsgUpdateMetaNodeDeposit((com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_META_NODE_REGISTRATION_VOTE:
          serviceImpl.handleMsgMetaNodeRegistrationVote((com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse>) responseObserver);
          break;
        case METHODID_HANDLE_MSG_KICK_META_NODE_VOTE:
          serviceImpl.handleMsgKickMetaNodeVote((com.stratos.register.v1.TxProto.MsgKickMetaNodeVote) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.stratos.register.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getHandleMsgCreateResourceNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgCreateResourceNode,
              com.stratos.register.v1.TxProto.MsgCreateResourceNodeResponse>(
                service, METHODID_HANDLE_MSG_CREATE_RESOURCE_NODE)))
        .addMethod(
          getHandleMsgRemoveResourceNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgRemoveResourceNode,
              com.stratos.register.v1.TxProto.MsgRemoveResourceNodeResponse>(
                service, METHODID_HANDLE_MSG_REMOVE_RESOURCE_NODE)))
        .addMethod(
          getHandleMsgUpdateResourceNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateResourceNode,
              com.stratos.register.v1.TxProto.MsgUpdateResourceNodeResponse>(
                service, METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE)))
        .addMethod(
          getHandleMsgUpdateResourceNodeDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDeposit,
              com.stratos.register.v1.TxProto.MsgUpdateResourceNodeDepositResponse>(
                service, METHODID_HANDLE_MSG_UPDATE_RESOURCE_NODE_DEPOSIT)))
        .addMethod(
          getHandleMsgUpdateEffectiveDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateEffectiveDeposit,
              com.stratos.register.v1.TxProto.MsgUpdateEffectiveDepositResponse>(
                service, METHODID_HANDLE_MSG_UPDATE_EFFECTIVE_DEPOSIT)))
        .addMethod(
          getHandleMsgCreateMetaNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgCreateMetaNode,
              com.stratos.register.v1.TxProto.MsgCreateMetaNodeResponse>(
                service, METHODID_HANDLE_MSG_CREATE_META_NODE)))
        .addMethod(
          getHandleMsgRemoveMetaNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgRemoveMetaNode,
              com.stratos.register.v1.TxProto.MsgRemoveMetaNodeResponse>(
                service, METHODID_HANDLE_MSG_REMOVE_META_NODE)))
        .addMethod(
          getHandleMsgUpdateMetaNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateMetaNode,
              com.stratos.register.v1.TxProto.MsgUpdateMetaNodeResponse>(
                service, METHODID_HANDLE_MSG_UPDATE_META_NODE)))
        .addMethod(
          getHandleMsgUpdateMetaNodeDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDeposit,
              com.stratos.register.v1.TxProto.MsgUpdateMetaNodeDepositResponse>(
                service, METHODID_HANDLE_MSG_UPDATE_META_NODE_DEPOSIT)))
        .addMethod(
          getHandleMsgMetaNodeRegistrationVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVote,
              com.stratos.register.v1.TxProto.MsgMetaNodeRegistrationVoteResponse>(
                service, METHODID_HANDLE_MSG_META_NODE_REGISTRATION_VOTE)))
        .addMethod(
          getHandleMsgKickMetaNodeVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgKickMetaNodeVote,
              com.stratos.register.v1.TxProto.MsgKickMetaNodeVoteResponse>(
                service, METHODID_HANDLE_MSG_KICK_META_NODE_VOTE)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.TxProto.MsgUpdateParams,
              com.stratos.register.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.register.v1.TxProto.getDescriptor();
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
              .addMethod(getHandleMsgCreateResourceNodeMethod())
              .addMethod(getHandleMsgRemoveResourceNodeMethod())
              .addMethod(getHandleMsgUpdateResourceNodeMethod())
              .addMethod(getHandleMsgUpdateResourceNodeDepositMethod())
              .addMethod(getHandleMsgUpdateEffectiveDepositMethod())
              .addMethod(getHandleMsgCreateMetaNodeMethod())
              .addMethod(getHandleMsgRemoveMetaNodeMethod())
              .addMethod(getHandleMsgUpdateMetaNodeMethod())
              .addMethod(getHandleMsgUpdateMetaNodeDepositMethod())
              .addMethod(getHandleMsgMetaNodeRegistrationVoteMethod())
              .addMethod(getHandleMsgKickMetaNodeVoteMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
