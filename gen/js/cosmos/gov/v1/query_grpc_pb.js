// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.46
'use strict';
var grpc = require('grpc');
var cosmos_gov_v1_query_pb = require('../../../cosmos/gov/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_gov_v1_gov_pb = require('../../../cosmos/gov/v1/gov_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_cosmos_gov_v1_QueryDepositRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryDepositRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryDepositRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryDepositResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryDepositResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryDepositResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryDepositsRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryDepositsRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryDepositsResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryDepositsResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryParamsRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryParamsResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryProposalRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryProposalRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryProposalRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryProposalResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryProposalResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryProposalResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryProposalsRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryProposalsRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryProposalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryProposalsRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryProposalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryProposalsResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryProposalsResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryProposalsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryProposalsResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryProposalsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryTallyResultRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryTallyResultRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryTallyResultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryTallyResultRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryTallyResultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryTallyResultResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryTallyResultResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryTallyResultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryTallyResultResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryTallyResultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryVoteRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryVoteRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryVoteRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryVoteResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryVoteResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryVoteResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryVotesRequest(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryVotesRequest)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryVotesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryVotesRequest(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryVotesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_QueryVotesResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_query_pb.QueryVotesResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.QueryVotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_QueryVotesResponse(buffer_arg) {
  return cosmos_gov_v1_query_pb.QueryVotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for gov module
var QueryService = exports.QueryService = {
  // Proposal queries proposal details based on ProposalID.
proposal: {
    path: '/cosmos.gov.v1.Query/Proposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryProposalRequest,
    responseType: cosmos_gov_v1_query_pb.QueryProposalResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryProposalRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryProposalRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryProposalResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryProposalResponse,
  },
  // Proposals queries all proposals based on given status.
proposals: {
    path: '/cosmos.gov.v1.Query/Proposals',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryProposalsRequest,
    responseType: cosmos_gov_v1_query_pb.QueryProposalsResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryProposalsRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryProposalsRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryProposalsResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryProposalsResponse,
  },
  // Vote queries voted information based on proposalID, voterAddr.
vote: {
    path: '/cosmos.gov.v1.Query/Vote',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryVoteRequest,
    responseType: cosmos_gov_v1_query_pb.QueryVoteResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryVoteRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryVoteRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryVoteResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryVoteResponse,
  },
  // Votes queries votes of a given proposal.
votes: {
    path: '/cosmos.gov.v1.Query/Votes',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryVotesRequest,
    responseType: cosmos_gov_v1_query_pb.QueryVotesResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryVotesRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryVotesRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryVotesResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryVotesResponse,
  },
  // Params queries all parameters of the gov module.
params: {
    path: '/cosmos.gov.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryParamsRequest,
    responseType: cosmos_gov_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryParamsRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryParamsRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryParamsResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryParamsResponse,
  },
  // Deposit queries single deposit information based proposalID, depositAddr.
deposit: {
    path: '/cosmos.gov.v1.Query/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryDepositRequest,
    responseType: cosmos_gov_v1_query_pb.QueryDepositResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryDepositRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryDepositRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryDepositResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryDepositResponse,
  },
  // Deposits queries all deposits of a single proposal.
deposits: {
    path: '/cosmos.gov.v1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryDepositsRequest,
    responseType: cosmos_gov_v1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryDepositsRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryDepositsRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryDepositsResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryDepositsResponse,
  },
  // TallyResult queries the tally of a proposal vote.
tallyResult: {
    path: '/cosmos.gov.v1.Query/TallyResult',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_query_pb.QueryTallyResultRequest,
    responseType: cosmos_gov_v1_query_pb.QueryTallyResultResponse,
    requestSerialize: serialize_cosmos_gov_v1_QueryTallyResultRequest,
    requestDeserialize: deserialize_cosmos_gov_v1_QueryTallyResultRequest,
    responseSerialize: serialize_cosmos_gov_v1_QueryTallyResultResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_QueryTallyResultResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
