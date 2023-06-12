// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var xpla_reward_v1beta1_query_pb = require('../../../xpla/reward/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var xpla_reward_v1beta1_reward_pb = require('../../../xpla/reward/v1beta1/reward_pb.js');

function serialize_xpla_reward_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_QueryParamsRequest(buffer_arg) {
  return xpla_reward_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_xpla_reward_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_QueryParamsResponse(buffer_arg) {
  return xpla_reward_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_xpla_reward_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_QueryPoolRequest(buffer_arg) {
  return xpla_reward_v1beta1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_xpla_reward_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_QueryPoolResponse(buffer_arg) {
  return xpla_reward_v1beta1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for reward module.
var QueryService = exports.QueryService = {
  // Params queries params of the reward module.
params: {
    path: '/xpla.reward.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: xpla_reward_v1beta1_query_pb.QueryParamsRequest,
    responseType: xpla_reward_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_xpla_reward_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_xpla_reward_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_xpla_reward_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_xpla_reward_v1beta1_QueryParamsResponse,
  },
  pool: {
    path: '/xpla.reward.v1beta1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: xpla_reward_v1beta1_query_pb.QueryPoolRequest,
    responseType: xpla_reward_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_xpla_reward_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_xpla_reward_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_xpla_reward_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_xpla_reward_v1beta1_QueryPoolResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
