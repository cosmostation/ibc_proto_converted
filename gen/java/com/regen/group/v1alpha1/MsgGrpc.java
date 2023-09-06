package com.regen.group.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the regen.group.v1alpha1 Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/group/v1alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "regen.group.v1alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroup,
      com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = com.regen.group.v1alpha1.TxProto.MsgCreateGroup.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroup,
      com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroup, com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> getCreateGroupMethod;
    if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupMethod = MsgGrpc.getCreateGroupMethod) == null) {
          MsgGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgCreateGroup, com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupMembers",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> getUpdateGroupMembersMethod;
    if ((getUpdateGroupMembersMethod = MsgGrpc.getUpdateGroupMembersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupMembersMethod = MsgGrpc.getUpdateGroupMembersMethod) == null) {
          MsgGrpc.getUpdateGroupMembersMethod = getUpdateGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupMembers"))
              .build();
        }
      }
    }
    return getUpdateGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupAdmin",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> getUpdateGroupAdminMethod;
    if ((getUpdateGroupAdminMethod = MsgGrpc.getUpdateGroupAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupAdminMethod = MsgGrpc.getUpdateGroupAdminMethod) == null) {
          MsgGrpc.getUpdateGroupAdminMethod = getUpdateGroupAdminMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupAdmin"))
              .build();
        }
      }
    }
    return getUpdateGroupAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupMetadata",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> getUpdateGroupMetadataMethod;
    if ((getUpdateGroupMetadataMethod = MsgGrpc.getUpdateGroupMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupMetadataMethod = MsgGrpc.getUpdateGroupMetadataMethod) == null) {
          MsgGrpc.getUpdateGroupMetadataMethod = getUpdateGroupMetadataMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupMetadata"))
              .build();
        }
      }
    }
    return getUpdateGroupMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount,
      com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> getCreateGroupAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroupAccount",
      requestType = com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount,
      com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> getCreateGroupAccountMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount, com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> getCreateGroupAccountMethod;
    if ((getCreateGroupAccountMethod = MsgGrpc.getCreateGroupAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateGroupAccountMethod = MsgGrpc.getCreateGroupAccountMethod) == null) {
          MsgGrpc.getCreateGroupAccountMethod = getCreateGroupAccountMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount, com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroupAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateGroupAccount"))
              .build();
        }
      }
    }
    return getCreateGroupAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> getUpdateGroupAccountAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupAccountAdmin",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> getUpdateGroupAccountAdminMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> getUpdateGroupAccountAdminMethod;
    if ((getUpdateGroupAccountAdminMethod = MsgGrpc.getUpdateGroupAccountAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupAccountAdminMethod = MsgGrpc.getUpdateGroupAccountAdminMethod) == null) {
          MsgGrpc.getUpdateGroupAccountAdminMethod = getUpdateGroupAccountAdminMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupAccountAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupAccountAdmin"))
              .build();
        }
      }
    }
    return getUpdateGroupAccountAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> getUpdateGroupAccountDecisionPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupAccountDecisionPolicy",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> getUpdateGroupAccountDecisionPolicyMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> getUpdateGroupAccountDecisionPolicyMethod;
    if ((getUpdateGroupAccountDecisionPolicyMethod = MsgGrpc.getUpdateGroupAccountDecisionPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupAccountDecisionPolicyMethod = MsgGrpc.getUpdateGroupAccountDecisionPolicyMethod) == null) {
          MsgGrpc.getUpdateGroupAccountDecisionPolicyMethod = getUpdateGroupAccountDecisionPolicyMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupAccountDecisionPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupAccountDecisionPolicy"))
              .build();
        }
      }
    }
    return getUpdateGroupAccountDecisionPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> getUpdateGroupAccountMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroupAccountMetadata",
      requestType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata,
      com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> getUpdateGroupAccountMetadataMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> getUpdateGroupAccountMetadataMethod;
    if ((getUpdateGroupAccountMetadataMethod = MsgGrpc.getUpdateGroupAccountMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateGroupAccountMetadataMethod = MsgGrpc.getUpdateGroupAccountMetadataMethod) == null) {
          MsgGrpc.getUpdateGroupAccountMetadataMethod = getUpdateGroupAccountMetadataMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata, com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroupAccountMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateGroupAccountMetadata"))
              .build();
        }
      }
    }
    return getUpdateGroupAccountMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateProposal,
      com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> getCreateProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProposal",
      requestType = com.regen.group.v1alpha1.TxProto.MsgCreateProposal.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateProposal,
      com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> getCreateProposalMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgCreateProposal, com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> getCreateProposalMethod;
    if ((getCreateProposalMethod = MsgGrpc.getCreateProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateProposalMethod = MsgGrpc.getCreateProposalMethod) == null) {
          MsgGrpc.getCreateProposalMethod = getCreateProposalMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgCreateProposal, com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateProposal"))
              .build();
        }
      }
    }
    return getCreateProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgVote,
      com.regen.group.v1alpha1.TxProto.MsgVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = com.regen.group.v1alpha1.TxProto.MsgVote.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgVote,
      com.regen.group.v1alpha1.TxProto.MsgVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgVote, com.regen.group.v1alpha1.TxProto.MsgVoteResponse> getVoteMethod;
    if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteMethod = MsgGrpc.getVoteMethod) == null) {
          MsgGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgVote, com.regen.group.v1alpha1.TxProto.MsgVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgExec,
      com.regen.group.v1alpha1.TxProto.MsgExecResponse> getExecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exec",
      requestType = com.regen.group.v1alpha1.TxProto.MsgExec.class,
      responseType = com.regen.group.v1alpha1.TxProto.MsgExecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgExec,
      com.regen.group.v1alpha1.TxProto.MsgExecResponse> getExecMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.TxProto.MsgExec, com.regen.group.v1alpha1.TxProto.MsgExecResponse> getExecMethod;
    if ((getExecMethod = MsgGrpc.getExecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecMethod = MsgGrpc.getExecMethod) == null) {
          MsgGrpc.getExecMethod = getExecMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.TxProto.MsgExec, com.regen.group.v1alpha1.TxProto.MsgExecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgExec.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.TxProto.MsgExecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Exec"))
              .build();
        }
      }
    }
    return getExecMethod;
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
   * Msg is the regen.group.v1alpha1 Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    default void createGroup(com.regen.group.v1alpha1.TxProto.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    default void updateGroupMembers(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    default void updateGroupAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    default void updateGroupMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateGroupAccount creates a new group account using given DecisionPolicy. 
     * </pre>
     */
    default void createGroupAccount(com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateGroupAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountAdmin updates a group account admin. 
     * </pre>
     */
    default void updateGroupAccountAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupAccountAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountDecisionPolicy allows a group account decision policy to be updated.
     * </pre>
     */
    default void updateGroupAccountDecisionPolicy(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupAccountDecisionPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountMetadata updates a group account metadata.
     * </pre>
     */
    default void updateGroupAccountMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGroupAccountMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateProposal submits a new proposal.
     * </pre>
     */
    default void createProposal(com.regen.group.v1alpha1.TxProto.MsgCreateProposal request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    default void vote(com.regen.group.v1alpha1.TxProto.MsgVote request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    default void exec(com.regen.group.v1alpha1.TxProto.MsgExec request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgExecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg is the regen.group.v1alpha1 Msg service.
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
   * Msg is the regen.group.v1alpha1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public void createGroup(com.regen.group.v1alpha1.TxProto.MsgCreateGroup request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public void updateGroupMembers(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public void updateGroupAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public void updateGroupMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateGroupAccount creates a new group account using given DecisionPolicy. 
     * </pre>
     */
    public void createGroupAccount(com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateGroupAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountAdmin updates a group account admin. 
     * </pre>
     */
    public void updateGroupAccountAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupAccountAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountDecisionPolicy allows a group account decision policy to be updated.
     * </pre>
     */
    public void updateGroupAccountDecisionPolicy(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupAccountDecisionPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateGroupAccountMetadata updates a group account metadata.
     * </pre>
     */
    public void updateGroupAccountMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGroupAccountMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateProposal submits a new proposal.
     * </pre>
     */
    public void createProposal(com.regen.group.v1alpha1.TxProto.MsgCreateProposal request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public void vote(com.regen.group.v1alpha1.TxProto.MsgVote request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public void exec(com.regen.group.v1alpha1.TxProto.MsgExec request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgExecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg is the regen.group.v1alpha1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse createGroup(com.regen.group.v1alpha1.TxProto.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse updateGroupMembers(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse updateGroupAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse updateGroupMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateGroupAccount creates a new group account using given DecisionPolicy. 
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse createGroupAccount(com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateGroupAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountAdmin updates a group account admin. 
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse updateGroupAccountAdmin(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupAccountAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountDecisionPolicy allows a group account decision policy to be updated.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse updateGroupAccountDecisionPolicy(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupAccountDecisionPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountMetadata updates a group account metadata.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse updateGroupAccountMetadata(com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGroupAccountMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateProposal submits a new proposal.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse createProposal(com.regen.group.v1alpha1.TxProto.MsgCreateProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgVoteResponse vote(com.regen.group.v1alpha1.TxProto.MsgVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public com.regen.group.v1alpha1.TxProto.MsgExecResponse exec(com.regen.group.v1alpha1.TxProto.MsgExec request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg is the regen.group.v1alpha1 Msg service.
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
     * CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse> createGroup(
        com.regen.group.v1alpha1.TxProto.MsgCreateGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupMembers updates the group members with given group id and admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse> updateGroupMembers(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupAdmin updates the group admin with given group id and previous admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse> updateGroupAdmin(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupMetadata updates the group metadata with given group id and admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse> updateGroupMetadata(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateGroupAccount creates a new group account using given DecisionPolicy. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse> createGroupAccount(
        com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateGroupAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountAdmin updates a group account admin. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse> updateGroupAccountAdmin(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupAccountAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountDecisionPolicy allows a group account decision policy to be updated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse> updateGroupAccountDecisionPolicy(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupAccountDecisionPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateGroupAccountMetadata updates a group account metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse> updateGroupAccountMetadata(
        com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGroupAccountMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateProposal submits a new proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse> createProposal(
        com.regen.group.v1alpha1.TxProto.MsgCreateProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote allows a voter to vote on a proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgVoteResponse> vote(
        com.regen.group.v1alpha1.TxProto.MsgVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exec executes a proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.TxProto.MsgExecResponse> exec(
        com.regen.group.v1alpha1.TxProto.MsgExec request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GROUP = 0;
  private static final int METHODID_UPDATE_GROUP_MEMBERS = 1;
  private static final int METHODID_UPDATE_GROUP_ADMIN = 2;
  private static final int METHODID_UPDATE_GROUP_METADATA = 3;
  private static final int METHODID_CREATE_GROUP_ACCOUNT = 4;
  private static final int METHODID_UPDATE_GROUP_ACCOUNT_ADMIN = 5;
  private static final int METHODID_UPDATE_GROUP_ACCOUNT_DECISION_POLICY = 6;
  private static final int METHODID_UPDATE_GROUP_ACCOUNT_METADATA = 7;
  private static final int METHODID_CREATE_PROPOSAL = 8;
  private static final int METHODID_VOTE = 9;
  private static final int METHODID_EXEC = 10;

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
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((com.regen.group.v1alpha1.TxProto.MsgCreateGroup) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_MEMBERS:
          serviceImpl.updateGroupMembers((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_ADMIN:
          serviceImpl.updateGroupAdmin((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_METADATA:
          serviceImpl.updateGroupMetadata((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse>) responseObserver);
          break;
        case METHODID_CREATE_GROUP_ACCOUNT:
          serviceImpl.createGroupAccount((com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_ACCOUNT_ADMIN:
          serviceImpl.updateGroupAccountAdmin((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_ACCOUNT_DECISION_POLICY:
          serviceImpl.updateGroupAccountDecisionPolicy((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP_ACCOUNT_METADATA:
          serviceImpl.updateGroupAccountMetadata((com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROPOSAL:
          serviceImpl.createProposal((com.regen.group.v1alpha1.TxProto.MsgCreateProposal) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((com.regen.group.v1alpha1.TxProto.MsgVote) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgVoteResponse>) responseObserver);
          break;
        case METHODID_EXEC:
          serviceImpl.exec((com.regen.group.v1alpha1.TxProto.MsgExec) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.TxProto.MsgExecResponse>) responseObserver);
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
          getCreateGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgCreateGroup,
              com.regen.group.v1alpha1.TxProto.MsgCreateGroupResponse>(
                service, METHODID_CREATE_GROUP)))
        .addMethod(
          getUpdateGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembers,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMembersResponse>(
                service, METHODID_UPDATE_GROUP_MEMBERS)))
        .addMethod(
          getUpdateGroupAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdmin,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAdminResponse>(
                service, METHODID_UPDATE_GROUP_ADMIN)))
        .addMethod(
          getUpdateGroupMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadata,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupMetadataResponse>(
                service, METHODID_UPDATE_GROUP_METADATA)))
        .addMethod(
          getCreateGroupAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccount,
              com.regen.group.v1alpha1.TxProto.MsgCreateGroupAccountResponse>(
                service, METHODID_CREATE_GROUP_ACCOUNT)))
        .addMethod(
          getUpdateGroupAccountAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdmin,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountAdminResponse>(
                service, METHODID_UPDATE_GROUP_ACCOUNT_ADMIN)))
        .addMethod(
          getUpdateGroupAccountDecisionPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicy,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountDecisionPolicyResponse>(
                service, METHODID_UPDATE_GROUP_ACCOUNT_DECISION_POLICY)))
        .addMethod(
          getUpdateGroupAccountMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadata,
              com.regen.group.v1alpha1.TxProto.MsgUpdateGroupAccountMetadataResponse>(
                service, METHODID_UPDATE_GROUP_ACCOUNT_METADATA)))
        .addMethod(
          getCreateProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgCreateProposal,
              com.regen.group.v1alpha1.TxProto.MsgCreateProposalResponse>(
                service, METHODID_CREATE_PROPOSAL)))
        .addMethod(
          getVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgVote,
              com.regen.group.v1alpha1.TxProto.MsgVoteResponse>(
                service, METHODID_VOTE)))
        .addMethod(
          getExecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.TxProto.MsgExec,
              com.regen.group.v1alpha1.TxProto.MsgExecResponse>(
                service, METHODID_EXEC)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.group.v1alpha1.TxProto.getDescriptor();
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
              .addMethod(getCreateGroupMethod())
              .addMethod(getUpdateGroupMembersMethod())
              .addMethod(getUpdateGroupAdminMethod())
              .addMethod(getUpdateGroupMetadataMethod())
              .addMethod(getCreateGroupAccountMethod())
              .addMethod(getUpdateGroupAccountAdminMethod())
              .addMethod(getUpdateGroupAccountDecisionPolicyMethod())
              .addMethod(getUpdateGroupAccountMetadataMethod())
              .addMethod(getCreateProposalMethod())
              .addMethod(getVoteMethod())
              .addMethod(getExecMethod())
              .build();
        }
      }
    }
    return result;
  }
}
