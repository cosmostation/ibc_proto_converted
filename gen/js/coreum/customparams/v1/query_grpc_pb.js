// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_customparams_v1_query_pb = require('../../../coreum/customparams/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var coreum_customparams_v1_params_pb = require('../../../coreum/customparams/v1/params_pb.js');

function serialize_coreum_customparams_v1_QueryStakingParamsRequest(arg) {
  if (!(arg instanceof coreum_customparams_v1_query_pb.QueryStakingParamsRequest)) {
    throw new Error('Expected argument of type coreum.customparams.v1.QueryStakingParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_customparams_v1_QueryStakingParamsRequest(buffer_arg) {
  return coreum_customparams_v1_query_pb.QueryStakingParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_customparams_v1_QueryStakingParamsResponse(arg) {
  if (!(arg instanceof coreum_customparams_v1_query_pb.QueryStakingParamsResponse)) {
    throw new Error('Expected argument of type coreum.customparams.v1.QueryStakingParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_customparams_v1_QueryStakingParamsResponse(buffer_arg) {
  return coreum_customparams_v1_query_pb.QueryStakingParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // StakingParams queries the staking parameters of the module.
stakingParams: {
    path: '/coreum.customparams.v1.Query/StakingParams',
    requestStream: false,
    responseStream: false,
    requestType: coreum_customparams_v1_query_pb.QueryStakingParamsRequest,
    responseType: coreum_customparams_v1_query_pb.QueryStakingParamsResponse,
    requestSerialize: serialize_coreum_customparams_v1_QueryStakingParamsRequest,
    requestDeserialize: deserialize_coreum_customparams_v1_QueryStakingParamsRequest,
    responseSerialize: serialize_coreum_customparams_v1_QueryStakingParamsResponse,
    responseDeserialize: deserialize_coreum_customparams_v1_QueryStakingParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
