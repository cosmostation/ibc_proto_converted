// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_incentive_v1beta1_query_pb = require('../../../kava/incentive/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_incentive_v1beta1_apy_pb = require('../../../kava/incentive/v1beta1/apy_pb.js');
var kava_incentive_v1beta1_claims_pb = require('../../../kava/incentive/v1beta1/claims_pb.js');
var kava_incentive_v1beta1_params_pb = require('../../../kava/incentive/v1beta1/params_pb.js');

function serialize_kava_incentive_v1beta1_QueryApyRequest(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryApyRequest)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryApyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryApyRequest(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryApyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryApyResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryApyResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryApyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryApyResponse(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryApyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryRewardFactorsRequest(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryRewardFactorsRequest)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryRewardFactorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryRewardFactorsRequest(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryRewardFactorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryRewardFactorsResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryRewardFactorsResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryRewardFactorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryRewardFactorsResponse(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryRewardFactorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryRewardsRequest(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryRewardsRequest)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryRewardsRequest(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_QueryRewardsResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_query_pb.QueryRewardsResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.QueryRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_QueryRewardsResponse(buffer_arg) {
  return kava_incentive_v1beta1_query_pb.QueryRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for incentive module.
var QueryService = exports.QueryService = {
  // Params queries module params.
params: {
    path: '/kava.incentive.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_incentive_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_incentive_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_incentive_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_QueryParamsResponse,
  },
  // Rewards queries reward information for a given user.
rewards: {
    path: '/kava.incentive.v1beta1.Query/Rewards',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_query_pb.QueryRewardsRequest,
    responseType: kava_incentive_v1beta1_query_pb.QueryRewardsResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_QueryRewardsRequest,
    requestDeserialize: deserialize_kava_incentive_v1beta1_QueryRewardsRequest,
    responseSerialize: serialize_kava_incentive_v1beta1_QueryRewardsResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_QueryRewardsResponse,
  },
  // Rewards queries the reward factors.
rewardFactors: {
    path: '/kava.incentive.v1beta1.Query/RewardFactors',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_query_pb.QueryRewardFactorsRequest,
    responseType: kava_incentive_v1beta1_query_pb.QueryRewardFactorsResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_QueryRewardFactorsRequest,
    requestDeserialize: deserialize_kava_incentive_v1beta1_QueryRewardFactorsRequest,
    responseSerialize: serialize_kava_incentive_v1beta1_QueryRewardFactorsResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_QueryRewardFactorsResponse,
  },
  // Apy queries incentive reward apy for a reward.
apy: {
    path: '/kava.incentive.v1beta1.Query/Apy',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_query_pb.QueryApyRequest,
    responseType: kava_incentive_v1beta1_query_pb.QueryApyResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_QueryApyRequest,
    requestDeserialize: deserialize_kava_incentive_v1beta1_QueryApyRequest,
    responseSerialize: serialize_kava_incentive_v1beta1_QueryApyResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_QueryApyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
