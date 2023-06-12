// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.46
'use strict';
var grpc = require('grpc');
var cosmos_group_v1_tx_pb = require('../../../cosmos/group/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_group_v1_types_pb = require('../../../cosmos/group/v1/types_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_group_v1_MsgCreateGroup(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroup)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroup(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgCreateGroupPolicy(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroupPolicy)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroupPolicy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroupPolicy(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroupPolicy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgCreateGroupPolicyResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroupPolicyResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroupPolicyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroupPolicyResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroupPolicyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgCreateGroupResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroupResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroupResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgCreateGroupWithPolicy(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicy)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroupWithPolicy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroupWithPolicy(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgCreateGroupWithPolicyResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicyResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgCreateGroupWithPolicyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgCreateGroupWithPolicyResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgExec(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgExec)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgExec');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgExec(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgExec.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgExecResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgExecResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgExecResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgExecResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgExecResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgLeaveGroup(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgLeaveGroup)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgLeaveGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgLeaveGroup(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgLeaveGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgLeaveGroupResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgLeaveGroupResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgLeaveGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgLeaveGroupResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgLeaveGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgSubmitProposal(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgSubmitProposal)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgSubmitProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgSubmitProposal(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgSubmitProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgSubmitProposalResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgSubmitProposalResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgSubmitProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgSubmitProposalResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgSubmitProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupAdmin(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupAdmin)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupAdmin(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupAdminResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupAdminResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupAdminResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupMembers(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupMembers)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupMembers');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupMembers(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupMembers.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupMembersResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupMembersResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupMembersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupMembersResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupMembersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupMetadata(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupMetadata)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupMetadata(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupMetadataResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupMetadataResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupMetadataResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyAdmin(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdmin)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyAdmin(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyAdminResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdminResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyAdminResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicy(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicy)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyDecisionPolicy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicy(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicyResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicyResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyDecisionPolicyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicyResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadata(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadata)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadata(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadataResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadataResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgUpdateGroupPolicyMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadataResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgVote(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgVote)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgVote(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgVoteResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgVoteResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgVoteResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgWithdrawProposal(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgWithdrawProposal)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgWithdrawProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgWithdrawProposal(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgWithdrawProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_MsgWithdrawProposalResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_tx_pb.MsgWithdrawProposalResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.MsgWithdrawProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_MsgWithdrawProposalResponse(buffer_arg) {
  return cosmos_group_v1_tx_pb.MsgWithdrawProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg is the cosmos.group.v1 Msg service.
var MsgService = exports.MsgService = {
  // CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
createGroup: {
    path: '/cosmos.group.v1.Msg/CreateGroup',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgCreateGroup,
    responseType: cosmos_group_v1_tx_pb.MsgCreateGroupResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgCreateGroup,
    requestDeserialize: deserialize_cosmos_group_v1_MsgCreateGroup,
    responseSerialize: serialize_cosmos_group_v1_MsgCreateGroupResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgCreateGroupResponse,
  },
  // UpdateGroupMembers updates the group members with given group id and admin address.
updateGroupMembers: {
    path: '/cosmos.group.v1.Msg/UpdateGroupMembers',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupMembers,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupMembersResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupMembers,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupMembers,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupMembersResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupMembersResponse,
  },
  // UpdateGroupAdmin updates the group admin with given group id and previous admin address.
updateGroupAdmin: {
    path: '/cosmos.group.v1.Msg/UpdateGroupAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupAdmin,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupAdminResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupAdmin,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupAdmin,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupAdminResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupAdminResponse,
  },
  // UpdateGroupMetadata updates the group metadata with given group id and admin address.
updateGroupMetadata: {
    path: '/cosmos.group.v1.Msg/UpdateGroupMetadata',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupMetadata,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupMetadataResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupMetadata,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupMetadata,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupMetadataResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupMetadataResponse,
  },
  // CreateGroupPolicy creates a new group policy using given DecisionPolicy.
createGroupPolicy: {
    path: '/cosmos.group.v1.Msg/CreateGroupPolicy',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgCreateGroupPolicy,
    responseType: cosmos_group_v1_tx_pb.MsgCreateGroupPolicyResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgCreateGroupPolicy,
    requestDeserialize: deserialize_cosmos_group_v1_MsgCreateGroupPolicy,
    responseSerialize: serialize_cosmos_group_v1_MsgCreateGroupPolicyResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgCreateGroupPolicyResponse,
  },
  // CreateGroupWithPolicy creates a new group with policy.
createGroupWithPolicy: {
    path: '/cosmos.group.v1.Msg/CreateGroupWithPolicy',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicy,
    responseType: cosmos_group_v1_tx_pb.MsgCreateGroupWithPolicyResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgCreateGroupWithPolicy,
    requestDeserialize: deserialize_cosmos_group_v1_MsgCreateGroupWithPolicy,
    responseSerialize: serialize_cosmos_group_v1_MsgCreateGroupWithPolicyResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgCreateGroupWithPolicyResponse,
  },
  // UpdateGroupPolicyAdmin updates a group policy admin.
updateGroupPolicyAdmin: {
    path: '/cosmos.group.v1.Msg/UpdateGroupPolicyAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdmin,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyAdminResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyAdmin,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyAdmin,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyAdminResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyAdminResponse,
  },
  // UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
updateGroupPolicyDecisionPolicy: {
    path: '/cosmos.group.v1.Msg/UpdateGroupPolicyDecisionPolicy',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicy,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyDecisionPolicyResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicy,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicy,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicyResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyDecisionPolicyResponse,
  },
  // UpdateGroupPolicyMetadata updates a group policy metadata.
updateGroupPolicyMetadata: {
    path: '/cosmos.group.v1.Msg/UpdateGroupPolicyMetadata',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadata,
    responseType: cosmos_group_v1_tx_pb.MsgUpdateGroupPolicyMetadataResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadata,
    requestDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadata,
    responseSerialize: serialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadataResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgUpdateGroupPolicyMetadataResponse,
  },
  // SubmitProposal submits a new proposal.
submitProposal: {
    path: '/cosmos.group.v1.Msg/SubmitProposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgSubmitProposal,
    responseType: cosmos_group_v1_tx_pb.MsgSubmitProposalResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgSubmitProposal,
    requestDeserialize: deserialize_cosmos_group_v1_MsgSubmitProposal,
    responseSerialize: serialize_cosmos_group_v1_MsgSubmitProposalResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgSubmitProposalResponse,
  },
  // WithdrawProposal withdraws a proposal.
withdrawProposal: {
    path: '/cosmos.group.v1.Msg/WithdrawProposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgWithdrawProposal,
    responseType: cosmos_group_v1_tx_pb.MsgWithdrawProposalResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgWithdrawProposal,
    requestDeserialize: deserialize_cosmos_group_v1_MsgWithdrawProposal,
    responseSerialize: serialize_cosmos_group_v1_MsgWithdrawProposalResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgWithdrawProposalResponse,
  },
  // Vote allows a voter to vote on a proposal.
vote: {
    path: '/cosmos.group.v1.Msg/Vote',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgVote,
    responseType: cosmos_group_v1_tx_pb.MsgVoteResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgVote,
    requestDeserialize: deserialize_cosmos_group_v1_MsgVote,
    responseSerialize: serialize_cosmos_group_v1_MsgVoteResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgVoteResponse,
  },
  // Exec executes a proposal.
exec: {
    path: '/cosmos.group.v1.Msg/Exec',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgExec,
    responseType: cosmos_group_v1_tx_pb.MsgExecResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgExec,
    requestDeserialize: deserialize_cosmos_group_v1_MsgExec,
    responseSerialize: serialize_cosmos_group_v1_MsgExecResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgExecResponse,
  },
  // LeaveGroup allows a group member to leave the group.
leaveGroup: {
    path: '/cosmos.group.v1.Msg/LeaveGroup',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_tx_pb.MsgLeaveGroup,
    responseType: cosmos_group_v1_tx_pb.MsgLeaveGroupResponse,
    requestSerialize: serialize_cosmos_group_v1_MsgLeaveGroup,
    requestDeserialize: deserialize_cosmos_group_v1_MsgLeaveGroup,
    responseSerialize: serialize_cosmos_group_v1_MsgLeaveGroupResponse,
    responseDeserialize: deserialize_cosmos_group_v1_MsgLeaveGroupResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
