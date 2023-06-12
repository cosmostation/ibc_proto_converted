// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var teritori_mint_v1beta1_query_pb = require('../../../teritori/mint/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var teritori_mint_v1beta1_mint_pb = require('../../../teritori/mint/v1beta1/mint_pb.js');

function serialize_teritori_mint_v1beta1_QueryBlockProvisionsRequest(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_query_pb.QueryBlockProvisionsRequest)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.QueryBlockProvisionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_QueryBlockProvisionsRequest(buffer_arg) {
  return teritori_mint_v1beta1_query_pb.QueryBlockProvisionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_mint_v1beta1_QueryBlockProvisionsResponse(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_query_pb.QueryBlockProvisionsResponse)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.QueryBlockProvisionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_QueryBlockProvisionsResponse(buffer_arg) {
  return teritori_mint_v1beta1_query_pb.QueryBlockProvisionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_mint_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_QueryParamsRequest(buffer_arg) {
  return teritori_mint_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_mint_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_QueryParamsResponse(buffer_arg) {
  return teritori_mint_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of minting parameters.
params: {
    path: '/teritori.mint.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: teritori_mint_v1beta1_query_pb.QueryParamsRequest,
    responseType: teritori_mint_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_teritori_mint_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_teritori_mint_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_teritori_mint_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_teritori_mint_v1beta1_QueryParamsResponse,
  },
  // BlockProvisions current minting epoch provisions value.
blockProvisions: {
    path: '/teritori.mint.v1beta1.Query/BlockProvisions',
    requestStream: false,
    responseStream: false,
    requestType: teritori_mint_v1beta1_query_pb.QueryBlockProvisionsRequest,
    responseType: teritori_mint_v1beta1_query_pb.QueryBlockProvisionsResponse,
    requestSerialize: serialize_teritori_mint_v1beta1_QueryBlockProvisionsRequest,
    requestDeserialize: deserialize_teritori_mint_v1beta1_QueryBlockProvisionsRequest,
    responseSerialize: serialize_teritori_mint_v1beta1_QueryBlockProvisionsResponse,
    responseDeserialize: deserialize_teritori_mint_v1beta1_QueryBlockProvisionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
