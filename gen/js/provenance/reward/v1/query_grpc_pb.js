// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_reward_v1_query_pb = require('../../../provenance/reward/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var provenance_reward_v1_reward_pb = require('../../../provenance/reward/v1/reward_pb.js');

function serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDRequest(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsRequest(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsResponse(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardDistributionsByAddressRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardDistributionsByAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardDistributionsByAddressRequest(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardDistributionsByAddressResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardDistributionsByAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardDistributionsByAddressResponse(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardProgramByIDRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardProgramByIDRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardProgramByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardProgramByIDRequest(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardProgramByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardProgramByIDResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardProgramByIDResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardProgramByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardProgramByIDResponse(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardProgramByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardProgramsRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardProgramsRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardProgramsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardProgramsRequest(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardProgramsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_QueryRewardProgramsResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_query_pb.QueryRewardProgramsResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.QueryRewardProgramsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_QueryRewardProgramsResponse(buffer_arg) {
  return provenance_reward_v1_query_pb.QueryRewardProgramsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for reward module.
var QueryService = exports.QueryService = {
  // RewardProgramByID returns a reward program matching the ID.
rewardProgramByID: {
    path: '/provenance.reward.v1.Query/RewardProgramByID',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_query_pb.QueryRewardProgramByIDRequest,
    responseType: provenance_reward_v1_query_pb.QueryRewardProgramByIDResponse,
    requestSerialize: serialize_provenance_reward_v1_QueryRewardProgramByIDRequest,
    requestDeserialize: deserialize_provenance_reward_v1_QueryRewardProgramByIDRequest,
    responseSerialize: serialize_provenance_reward_v1_QueryRewardProgramByIDResponse,
    responseDeserialize: deserialize_provenance_reward_v1_QueryRewardProgramByIDResponse,
  },
  // RewardPrograms returns a list of reward programs matching the query type.
rewardPrograms: {
    path: '/provenance.reward.v1.Query/RewardPrograms',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_query_pb.QueryRewardProgramsRequest,
    responseType: provenance_reward_v1_query_pb.QueryRewardProgramsResponse,
    requestSerialize: serialize_provenance_reward_v1_QueryRewardProgramsRequest,
    requestDeserialize: deserialize_provenance_reward_v1_QueryRewardProgramsRequest,
    responseSerialize: serialize_provenance_reward_v1_QueryRewardProgramsResponse,
    responseDeserialize: deserialize_provenance_reward_v1_QueryRewardProgramsResponse,
  },
  // ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
claimPeriodRewardDistributions: {
    path: '/provenance.reward.v1.Query/ClaimPeriodRewardDistributions',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsRequest,
    responseType: provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsResponse,
    requestSerialize: serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsRequest,
    requestDeserialize: deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsRequest,
    responseSerialize: serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsResponse,
    responseDeserialize: deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsResponse,
  },
  // ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
claimPeriodRewardDistributionsByID: {
    path: '/provenance.reward.v1.Query/ClaimPeriodRewardDistributionsByID',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDRequest,
    responseType: provenance_reward_v1_query_pb.QueryClaimPeriodRewardDistributionsByIDResponse,
    requestSerialize: serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDRequest,
    requestDeserialize: deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDRequest,
    responseSerialize: serialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse,
    responseDeserialize: deserialize_provenance_reward_v1_QueryClaimPeriodRewardDistributionsByIDResponse,
  },
  // RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
// status.
rewardDistributionsByAddress: {
    path: '/provenance.reward.v1.Query/RewardDistributionsByAddress',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressRequest,
    responseType: provenance_reward_v1_query_pb.QueryRewardDistributionsByAddressResponse,
    requestSerialize: serialize_provenance_reward_v1_QueryRewardDistributionsByAddressRequest,
    requestDeserialize: deserialize_provenance_reward_v1_QueryRewardDistributionsByAddressRequest,
    responseSerialize: serialize_provenance_reward_v1_QueryRewardDistributionsByAddressResponse,
    responseDeserialize: deserialize_provenance_reward_v1_QueryRewardDistributionsByAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
