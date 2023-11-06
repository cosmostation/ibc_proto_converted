// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.47
'use strict';
var grpc = require('grpc');
var cosmos_consensus_v1_query_pb = require('../../../cosmos/consensus/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var tendermint_types_params_pb = require('../../../tendermint/types/params_pb.js');

function serialize_cosmos_consensus_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof cosmos_consensus_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cosmos.consensus.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_consensus_v1_QueryParamsRequest(buffer_arg) {
  return cosmos_consensus_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_consensus_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof cosmos_consensus_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cosmos.consensus.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_consensus_v1_QueryParamsResponse(buffer_arg) {
  return cosmos_consensus_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/consensus module.
params: {
    path: '/cosmos.consensus.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_consensus_v1_query_pb.QueryParamsRequest,
    responseType: cosmos_consensus_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cosmos_consensus_v1_QueryParamsRequest,
    requestDeserialize: deserialize_cosmos_consensus_v1_QueryParamsRequest,
    responseSerialize: serialize_cosmos_consensus_v1_QueryParamsResponse,
    responseDeserialize: deserialize_cosmos_consensus_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
