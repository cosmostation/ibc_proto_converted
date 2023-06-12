// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irishub_mint_query_pb = require('../../irishub/mint/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var irishub_mint_mint_pb = require('../../irishub/mint/mint_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_irishub_mint_QueryParamsRequest(arg) {
  if (!(arg instanceof irishub_mint_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type irishub.mint.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_mint_QueryParamsRequest(buffer_arg) {
  return irishub_mint_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irishub_mint_QueryParamsResponse(arg) {
  if (!(arg instanceof irishub_mint_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type irishub.mint.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_mint_QueryParamsResponse(buffer_arg) {
  return irishub_mint_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with guardian as rpc
var QueryService = exports.QueryService = {
  // Params queries the mint parameters
params: {
    path: '/irishub.mint.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: irishub_mint_query_pb.QueryParamsRequest,
    responseType: irishub_mint_query_pb.QueryParamsResponse,
    requestSerialize: serialize_irishub_mint_QueryParamsRequest,
    requestDeserialize: deserialize_irishub_mint_QueryParamsRequest,
    responseSerialize: serialize_irishub_mint_QueryParamsResponse,
    responseDeserialize: deserialize_irishub_mint_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
