// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_committee_v1beta1_query_pb = require('../../../kava/committee/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var kava_committee_v1beta1_genesis_pb = require('../../../kava/committee/v1beta1/genesis_pb.js');

function serialize_kava_committee_v1beta1_QueryCommitteeRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryCommitteeRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryCommitteeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryCommitteeRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryCommitteeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryCommitteeResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryCommitteeResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryCommitteeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryCommitteeResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryCommitteeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryCommitteesRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryCommitteesRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryCommitteesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryCommitteesRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryCommitteesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryCommitteesResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryCommitteesResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryCommitteesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryCommitteesResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryCommitteesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryNextProposalIDRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryNextProposalIDRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryNextProposalIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryNextProposalIDRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryNextProposalIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryNextProposalIDResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryNextProposalIDResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryNextProposalIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryNextProposalIDResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryNextProposalIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryProposalRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryProposalRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryProposalRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryProposalResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryProposalResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryProposalResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryProposalsRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryProposalsRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryProposalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryProposalsRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryProposalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryProposalsResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryProposalsResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryProposalsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryProposalsResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryProposalsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryRawParamsRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryRawParamsRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryRawParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryRawParamsRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryRawParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryRawParamsResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryRawParamsResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryRawParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryRawParamsResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryRawParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryTallyRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryTallyRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryTallyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryTallyRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryTallyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryTallyResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryTallyResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryTallyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryTallyResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryTallyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryVoteRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryVoteRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryVoteRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryVoteResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryVoteResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryVoteResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryVotesRequest(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryVotesRequest)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryVotesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryVotesRequest(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryVotesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_QueryVotesResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_query_pb.QueryVotesResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.QueryVotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_QueryVotesResponse(buffer_arg) {
  return kava_committee_v1beta1_query_pb.QueryVotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for committee module
var QueryService = exports.QueryService = {
  // Committees queries all committess of the committee module.
committees: {
    path: '/kava.committee.v1beta1.Query/Committees',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryCommitteesRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryCommitteesResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryCommitteesRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryCommitteesRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryCommitteesResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryCommitteesResponse,
  },
  // Committee queries a committee based on committee ID.
committee: {
    path: '/kava.committee.v1beta1.Query/Committee',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryCommitteeRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryCommitteeResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryCommitteeRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryCommitteeRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryCommitteeResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryCommitteeResponse,
  },
  // Proposals queries proposals based on committee ID.
proposals: {
    path: '/kava.committee.v1beta1.Query/Proposals',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryProposalsRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryProposalsResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryProposalsRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryProposalsRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryProposalsResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryProposalsResponse,
  },
  // Deposits queries a proposal based on proposal ID.
proposal: {
    path: '/kava.committee.v1beta1.Query/Proposal',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryProposalRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryProposalResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryProposalRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryProposalRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryProposalResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryProposalResponse,
  },
  // NextProposalID queries the next proposal ID of the committee module.
nextProposalID: {
    path: '/kava.committee.v1beta1.Query/NextProposalID',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryNextProposalIDRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryNextProposalIDResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryNextProposalIDRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryNextProposalIDRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryNextProposalIDResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryNextProposalIDResponse,
  },
  // Votes queries all votes for a single proposal ID.
votes: {
    path: '/kava.committee.v1beta1.Query/Votes',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryVotesRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryVotesResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryVotesRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryVotesRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryVotesResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryVotesResponse,
  },
  // Vote queries the vote of a single voter for a single proposal ID.
vote: {
    path: '/kava.committee.v1beta1.Query/Vote',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryVoteRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryVoteResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryVoteRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryVoteRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryVoteResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryVoteResponse,
  },
  // Tally queries the tally of a single proposal ID.
tally: {
    path: '/kava.committee.v1beta1.Query/Tally',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryTallyRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryTallyResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryTallyRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryTallyRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryTallyResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryTallyResponse,
  },
  // RawParams queries the raw params data of any subspace and key.
rawParams: {
    path: '/kava.committee.v1beta1.Query/RawParams',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_query_pb.QueryRawParamsRequest,
    responseType: kava_committee_v1beta1_query_pb.QueryRawParamsResponse,
    requestSerialize: serialize_kava_committee_v1beta1_QueryRawParamsRequest,
    requestDeserialize: deserialize_kava_committee_v1beta1_QueryRawParamsRequest,
    responseSerialize: serialize_kava_committee_v1beta1_QueryRawParamsResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_QueryRawParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
