// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_group_v1alpha1_tx_pb = require('../../../regen/group/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var regen_group_v1alpha1_types_pb = require('../../../regen/group/v1alpha1/types_pb.js');

function serialize_regen_group_v1alpha1_MsgCreateGroup(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateGroup)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateGroup(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgCreateGroupAccount(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateGroupAccount)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateGroupAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateGroupAccount(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateGroupAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgCreateGroupAccountResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateGroupAccountResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateGroupAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateGroupAccountResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateGroupAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgCreateGroupResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateGroupResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateGroupResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgCreateProposal(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateProposal)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateProposal(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgCreateProposalResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgCreateProposalResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgCreateProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgCreateProposalResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgCreateProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgExec(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgExec)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgExec');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgExec(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgExec.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgExecResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgExecResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgExecResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgExecResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgExecResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdmin(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdmin)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdmin(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdminResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicy(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicy)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountDecisionPolicy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicy(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicyResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicyResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountDecisionPolicyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicyResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadata(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadata)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadata(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadataResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadataResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAccountMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadataResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAdmin(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdmin)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAdmin(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupAdminResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdminResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupAdminResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupMembers(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembers)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupMembers');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupMembers(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembers.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupMembersResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembersResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupMembersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupMembersResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupMetadata(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadata)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupMetadata(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgUpdateGroupMetadataResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadataResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgUpdateGroupMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgUpdateGroupMetadataResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgVote(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgVote)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgVote(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_MsgVoteResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_tx_pb.MsgVoteResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.MsgVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_MsgVoteResponse(buffer_arg) {
  return regen_group_v1alpha1_tx_pb.MsgVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg is the regen.group.v1alpha1 Msg service.
var MsgService = exports.MsgService = {
  // CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
createGroup: {
    path: '/regen.group.v1alpha1.Msg/CreateGroup',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgCreateGroup,
    responseType: regen_group_v1alpha1_tx_pb.MsgCreateGroupResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgCreateGroup,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgCreateGroup,
    responseSerialize: serialize_regen_group_v1alpha1_MsgCreateGroupResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgCreateGroupResponse,
  },
  // UpdateGroupMembers updates the group members with given group id and admin address.
updateGroupMembers: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupMembers',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembers,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupMembersResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupMembers,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupMembers,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupMembersResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupMembersResponse,
  },
  // UpdateGroupAdmin updates the group admin with given group id and previous admin address.
updateGroupAdmin: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupAdmin',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdmin,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAdminResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAdmin,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAdmin,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAdminResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAdminResponse,
  },
  // UpdateGroupMetadata updates the group metadata with given group id and admin address.
updateGroupMetadata: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupMetadata',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadata,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupMetadataResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupMetadata,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupMetadata,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupMetadataResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupMetadataResponse,
  },
  // CreateGroupAccount creates a new group account using given DecisionPolicy. 
createGroupAccount: {
    path: '/regen.group.v1alpha1.Msg/CreateGroupAccount',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgCreateGroupAccount,
    responseType: regen_group_v1alpha1_tx_pb.MsgCreateGroupAccountResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgCreateGroupAccount,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgCreateGroupAccount,
    responseSerialize: serialize_regen_group_v1alpha1_MsgCreateGroupAccountResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgCreateGroupAccountResponse,
  },
  // UpdateGroupAccountAdmin updates a group account admin. 
updateGroupAccountAdmin: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupAccountAdmin',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdmin,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountAdminResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdmin,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdmin,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountAdminResponse,
  },
  // UpdateGroupAccountDecisionPolicy allows a group account decision policy to be updated.
updateGroupAccountDecisionPolicy: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupAccountDecisionPolicy',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicy,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountDecisionPolicyResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicy,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicy,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicyResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountDecisionPolicyResponse,
  },
  // UpdateGroupAccountMetadata updates a group account metadata.
updateGroupAccountMetadata: {
    path: '/regen.group.v1alpha1.Msg/UpdateGroupAccountMetadata',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadata,
    responseType: regen_group_v1alpha1_tx_pb.MsgUpdateGroupAccountMetadataResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadata,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadata,
    responseSerialize: serialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadataResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgUpdateGroupAccountMetadataResponse,
  },
  // CreateProposal submits a new proposal.
createProposal: {
    path: '/regen.group.v1alpha1.Msg/CreateProposal',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgCreateProposal,
    responseType: regen_group_v1alpha1_tx_pb.MsgCreateProposalResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgCreateProposal,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgCreateProposal,
    responseSerialize: serialize_regen_group_v1alpha1_MsgCreateProposalResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgCreateProposalResponse,
  },
  // Vote allows a voter to vote on a proposal.
vote: {
    path: '/regen.group.v1alpha1.Msg/Vote',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgVote,
    responseType: regen_group_v1alpha1_tx_pb.MsgVoteResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgVote,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgVote,
    responseSerialize: serialize_regen_group_v1alpha1_MsgVoteResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgVoteResponse,
  },
  // Exec executes a proposal.
exec: {
    path: '/regen.group.v1alpha1.Msg/Exec',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_tx_pb.MsgExec,
    responseType: regen_group_v1alpha1_tx_pb.MsgExecResponse,
    requestSerialize: serialize_regen_group_v1alpha1_MsgExec,
    requestDeserialize: deserialize_regen_group_v1alpha1_MsgExec,
    responseSerialize: serialize_regen_group_v1alpha1_MsgExecResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_MsgExecResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
