// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_params_pb = require('../../../kyve/query/v1beta1/params_pb.js');
var cosmos_gov_v1_query_pb = require('../../../cosmos/gov/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_bundles_v1beta1_params_pb = require('../../../kyve/bundles/v1beta1/params_pb.js');
var kyve_delegation_v1beta1_params_pb = require('../../../kyve/delegation/v1beta1/params_pb.js');
var kyve_global_v1beta1_global_pb = require('../../../kyve/global/v1beta1/global_pb.js');
var kyve_stakers_v1beta1_params_pb = require('../../../kyve/stakers/v1beta1/params_pb.js');

function serialize_kyve_query_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_params_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryParamsRequest(buffer_arg) {
  return kyve_query_v1beta1_params_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_params_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryParamsResponse(buffer_arg) {
  return kyve_query_v1beta1_params_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryPool ...
var QueryParamsService = exports.QueryParamsService = {
  // Pools queries for all pools.
params: {
    path: '/kyve.query.v1beta1.QueryParams/Params',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_params_pb.QueryParamsRequest,
    responseType: kyve_query_v1beta1_params_pb.QueryParamsResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryParamsResponse,
  },
};

exports.QueryParamsClient = grpc.makeGenericClientConstructor(QueryParamsService);
