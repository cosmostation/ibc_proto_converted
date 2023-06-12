// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_group_v1alpha1_query_pb = require('../../../regen/group/v1alpha1/query_pb.js');
var regen_group_v1alpha1_types_pb = require('../../../regen/group/v1alpha1/types_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_regen_group_v1alpha1_QueryGroupAccountInfoRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountInfoRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountInfoRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupAccountInfoResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountInfoResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountInfoResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupAccountsByAdminRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountsByAdminRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountsByAdminRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupAccountsByAdminResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountsByAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountsByAdminResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupAccountsByGroupRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountsByGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountsByGroupRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupAccountsByGroupResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupAccountsByGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupAccountsByGroupResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupInfoRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupInfoRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupInfoRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupInfoResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupInfoResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupInfoResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupMembersRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupMembersRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupMembersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupMembersRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupMembersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupMembersResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupMembersResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupMembersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupMembersResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupMembersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupsByAdminRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupsByAdminRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupsByAdminRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupsByAdminRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupsByAdminRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryGroupsByAdminResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryGroupsByAdminResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryGroupsByAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryGroupsByAdminResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryGroupsByAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryProposalRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryProposalRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryProposalRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryProposalResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryProposalResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryProposalResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryProposalsByGroupAccountRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryProposalsByGroupAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryProposalsByGroupAccountRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryProposalsByGroupAccountResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryProposalsByGroupAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryProposalsByGroupAccountResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVoteByProposalVoterRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVoteByProposalVoterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVoteByProposalVoterRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVoteByProposalVoterResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVoteByProposalVoterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVoteByProposalVoterResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVotesByProposalRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVotesByProposalRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVotesByProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVotesByProposalRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVotesByProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVotesByProposalResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVotesByProposalResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVotesByProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVotesByProposalResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVotesByProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVotesByVoterRequest(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVotesByVoterRequest)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVotesByVoterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVotesByVoterRequest(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVotesByVoterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_group_v1alpha1_QueryVotesByVoterResponse(arg) {
  if (!(arg instanceof regen_group_v1alpha1_query_pb.QueryVotesByVoterResponse)) {
    throw new Error('Expected argument of type regen.group.v1alpha1.QueryVotesByVoterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_group_v1alpha1_QueryVotesByVoterResponse(buffer_arg) {
  return regen_group_v1alpha1_query_pb.QueryVotesByVoterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query is the regen.group.v1alpha1 Query service.
var QueryService = exports.QueryService = {
  // GroupInfo queries group info based on group id.
groupInfo: {
    path: '/regen.group.v1alpha1.Query/GroupInfo',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupInfoRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupInfoResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupInfoRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupInfoRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupInfoResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupInfoResponse,
  },
  // GroupAccountInfo queries group account info based on group account address.
groupAccountInfo: {
    path: '/regen.group.v1alpha1.Query/GroupAccountInfo',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupAccountInfoRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupAccountInfoResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountInfoRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountInfoRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountInfoResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountInfoResponse,
  },
  // GroupMembers queries members of a group
groupMembers: {
    path: '/regen.group.v1alpha1.Query/GroupMembers',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupMembersRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupMembersResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupMembersRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupMembersRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupMembersResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupMembersResponse,
  },
  // GroupsByAdmin queries groups by admin address.
groupsByAdmin: {
    path: '/regen.group.v1alpha1.Query/GroupsByAdmin',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupsByAdminRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupsByAdminResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupsByAdminRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupsByAdminRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupsByAdminResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupsByAdminResponse,
  },
  // GroupAccountsByGroup queries group accounts by group id.
groupAccountsByGroup: {
    path: '/regen.group.v1alpha1.Query/GroupAccountsByGroup',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupAccountsByGroupResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountsByGroupRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountsByGroupRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountsByGroupResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountsByGroupResponse,
  },
  // GroupsByAdmin queries group accounts by admin address.
groupAccountsByAdmin: {
    path: '/regen.group.v1alpha1.Query/GroupAccountsByAdmin',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryGroupAccountsByAdminResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountsByAdminRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountsByAdminRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryGroupAccountsByAdminResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryGroupAccountsByAdminResponse,
  },
  // Proposal queries a proposal based on proposal id.
proposal: {
    path: '/regen.group.v1alpha1.Query/Proposal',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryProposalRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryProposalResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryProposalRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryProposalRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryProposalResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryProposalResponse,
  },
  // ProposalsByGroupAccount queries proposals based on group account address.
proposalsByGroupAccount: {
    path: '/regen.group.v1alpha1.Query/ProposalsByGroupAccount',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryProposalsByGroupAccountResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryProposalsByGroupAccountRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryProposalsByGroupAccountRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryProposalsByGroupAccountResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryProposalsByGroupAccountResponse,
  },
  // VoteByProposalVoter queries a vote by proposal id and voter.
voteByProposalVoter: {
    path: '/regen.group.v1alpha1.Query/VoteByProposalVoter',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryVoteByProposalVoterResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryVoteByProposalVoterRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryVoteByProposalVoterRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryVoteByProposalVoterResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryVoteByProposalVoterResponse,
  },
  // VotesByProposal queries a vote by proposal.
votesByProposal: {
    path: '/regen.group.v1alpha1.Query/VotesByProposal',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryVotesByProposalRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryVotesByProposalResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryVotesByProposalRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryVotesByProposalRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryVotesByProposalResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryVotesByProposalResponse,
  },
  // VotesByVoter queries a vote by voter.
votesByVoter: {
    path: '/regen.group.v1alpha1.Query/VotesByVoter',
    requestStream: false,
    responseStream: false,
    requestType: regen_group_v1alpha1_query_pb.QueryVotesByVoterRequest,
    responseType: regen_group_v1alpha1_query_pb.QueryVotesByVoterResponse,
    requestSerialize: serialize_regen_group_v1alpha1_QueryVotesByVoterRequest,
    requestDeserialize: deserialize_regen_group_v1alpha1_QueryVotesByVoterRequest,
    responseSerialize: serialize_regen_group_v1alpha1_QueryVotesByVoterResponse,
    responseDeserialize: deserialize_regen_group_v1alpha1_QueryVotesByVoterResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
