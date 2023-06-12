// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.46
'use strict';
var grpc = require('grpc');
var cosmos_group_v1_query_pb = require('../../../cosmos/group/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_group_v1_types_pb = require('../../../cosmos/group/v1/types_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_group_v1_QueryGroupInfoRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupInfoRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupInfoRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupInfoResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupInfoResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupInfoResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupMembersRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupMembersRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupMembersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupMembersRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupMembersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupMembersResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupMembersResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupMembersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupMembersResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupMembersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPoliciesByAdminRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPoliciesByAdminRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPoliciesByAdminRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPoliciesByAdminResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPoliciesByAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPoliciesByAdminResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPoliciesByGroupRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPoliciesByGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPoliciesByGroupRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPoliciesByGroupResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPoliciesByGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPoliciesByGroupResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPolicyInfoRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPolicyInfoRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPolicyInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPolicyInfoRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPolicyInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupPolicyInfoResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupPolicyInfoResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupPolicyInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupPolicyInfoResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupPolicyInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsByAdminRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsByAdminRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsByAdminRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsByAdminRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsByAdminRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsByAdminResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsByAdminResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsByAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsByAdminResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsByAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsByMemberRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsByMemberRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsByMemberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsByMemberRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsByMemberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsByMemberResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsByMemberResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsByMemberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsByMemberResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsByMemberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryGroupsResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryGroupsResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryGroupsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryGroupsResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryGroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryProposalRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryProposalRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryProposalRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryProposalResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryProposalResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryProposalResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryProposalsByGroupPolicyRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryProposalsByGroupPolicyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryProposalsByGroupPolicyRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryProposalsByGroupPolicyResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryProposalsByGroupPolicyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryProposalsByGroupPolicyResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryTallyResultRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryTallyResultRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryTallyResultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryTallyResultRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryTallyResultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryTallyResultResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryTallyResultResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryTallyResultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryTallyResultResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryTallyResultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVoteByProposalVoterRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVoteByProposalVoterRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVoteByProposalVoterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVoteByProposalVoterRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVoteByProposalVoterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVoteByProposalVoterResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVoteByProposalVoterResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVoteByProposalVoterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVoteByProposalVoterResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVoteByProposalVoterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVotesByProposalRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVotesByProposalRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVotesByProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVotesByProposalRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVotesByProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVotesByProposalResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVotesByProposalResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVotesByProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVotesByProposalResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVotesByProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVotesByVoterRequest(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVotesByVoterRequest)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVotesByVoterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVotesByVoterRequest(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVotesByVoterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_group_v1_QueryVotesByVoterResponse(arg) {
  if (!(arg instanceof cosmos_group_v1_query_pb.QueryVotesByVoterResponse)) {
    throw new Error('Expected argument of type cosmos.group.v1.QueryVotesByVoterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_group_v1_QueryVotesByVoterResponse(buffer_arg) {
  return cosmos_group_v1_query_pb.QueryVotesByVoterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query is the cosmos.group.v1 Query service.
var QueryService = exports.QueryService = {
  // GroupInfo queries group info based on group id.
groupInfo: {
    path: '/cosmos.group.v1.Query/GroupInfo',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupInfoRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupInfoResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupInfoRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupInfoRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupInfoResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupInfoResponse,
  },
  // GroupPolicyInfo queries group policy info based on account address of group policy.
groupPolicyInfo: {
    path: '/cosmos.group.v1.Query/GroupPolicyInfo',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupPolicyInfoRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupPolicyInfoResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupPolicyInfoRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupPolicyInfoRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupPolicyInfoResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupPolicyInfoResponse,
  },
  // GroupMembers queries members of a group by group id.
groupMembers: {
    path: '/cosmos.group.v1.Query/GroupMembers',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupMembersRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupMembersResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupMembersRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupMembersRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupMembersResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupMembersResponse,
  },
  // GroupsByAdmin queries groups by admin address.
groupsByAdmin: {
    path: '/cosmos.group.v1.Query/GroupsByAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupsByAdminRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupsByAdminResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupsByAdminRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupsByAdminRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupsByAdminResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupsByAdminResponse,
  },
  // GroupPoliciesByGroup queries group policies by group id.
groupPoliciesByGroup: {
    path: '/cosmos.group.v1.Query/GroupPoliciesByGroup',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupPoliciesByGroupResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupPoliciesByGroupRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupPoliciesByGroupRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupPoliciesByGroupResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupPoliciesByGroupResponse,
  },
  // GroupPoliciesByAdmin queries group policies by admin address.
groupPoliciesByAdmin: {
    path: '/cosmos.group.v1.Query/GroupPoliciesByAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupPoliciesByAdminResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupPoliciesByAdminRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupPoliciesByAdminRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupPoliciesByAdminResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupPoliciesByAdminResponse,
  },
  // Proposal queries a proposal based on proposal id.
proposal: {
    path: '/cosmos.group.v1.Query/Proposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryProposalRequest,
    responseType: cosmos_group_v1_query_pb.QueryProposalResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryProposalRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryProposalRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryProposalResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryProposalResponse,
  },
  // ProposalsByGroupPolicy queries proposals based on account address of group policy.
proposalsByGroupPolicy: {
    path: '/cosmos.group.v1.Query/ProposalsByGroupPolicy',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyRequest,
    responseType: cosmos_group_v1_query_pb.QueryProposalsByGroupPolicyResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryProposalsByGroupPolicyRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryProposalsByGroupPolicyRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryProposalsByGroupPolicyResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryProposalsByGroupPolicyResponse,
  },
  // VoteByProposalVoter queries a vote by proposal id and voter.
voteByProposalVoter: {
    path: '/cosmos.group.v1.Query/VoteByProposalVoter',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryVoteByProposalVoterRequest,
    responseType: cosmos_group_v1_query_pb.QueryVoteByProposalVoterResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryVoteByProposalVoterRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryVoteByProposalVoterRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryVoteByProposalVoterResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryVoteByProposalVoterResponse,
  },
  // VotesByProposal queries a vote by proposal id.
votesByProposal: {
    path: '/cosmos.group.v1.Query/VotesByProposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryVotesByProposalRequest,
    responseType: cosmos_group_v1_query_pb.QueryVotesByProposalResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryVotesByProposalRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryVotesByProposalRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryVotesByProposalResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryVotesByProposalResponse,
  },
  // VotesByVoter queries a vote by voter.
votesByVoter: {
    path: '/cosmos.group.v1.Query/VotesByVoter',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryVotesByVoterRequest,
    responseType: cosmos_group_v1_query_pb.QueryVotesByVoterResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryVotesByVoterRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryVotesByVoterRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryVotesByVoterResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryVotesByVoterResponse,
  },
  // GroupsByMember queries groups by member address.
groupsByMember: {
    path: '/cosmos.group.v1.Query/GroupsByMember',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupsByMemberRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupsByMemberResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupsByMemberRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupsByMemberRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupsByMemberResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupsByMemberResponse,
  },
  // TallyResult returns the tally result of a proposal. If the proposal is
// still in voting period, then this query computes the current tally state,
// which might not be final. On the other hand, if the proposal is final,
// then it simply returns the `final_tally_result` state stored in the
// proposal itself.
tallyResult: {
    path: '/cosmos.group.v1.Query/TallyResult',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryTallyResultRequest,
    responseType: cosmos_group_v1_query_pb.QueryTallyResultResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryTallyResultRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryTallyResultRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryTallyResultResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryTallyResultResponse,
  },
  // Groups queries all groups in state.
// 
// Since: cosmos-sdk 0.47.1
groups: {
    path: '/cosmos.group.v1.Query/Groups',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_group_v1_query_pb.QueryGroupsRequest,
    responseType: cosmos_group_v1_query_pb.QueryGroupsResponse,
    requestSerialize: serialize_cosmos_group_v1_QueryGroupsRequest,
    requestDeserialize: deserialize_cosmos_group_v1_QueryGroupsRequest,
    responseSerialize: serialize_cosmos_group_v1_QueryGroupsResponse,
    responseDeserialize: deserialize_cosmos_group_v1_QueryGroupsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
