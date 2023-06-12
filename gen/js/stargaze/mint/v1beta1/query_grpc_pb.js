// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_mint_v1beta1_query_pb = require('../../../stargaze/mint/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var stargaze_mint_v1beta1_mint_pb = require('../../../stargaze/mint/v1beta1/mint_pb.js');

function serialize_stargaze_mint_v1beta1_QueryAnnualProvisionsRequest(arg) {
  if (!(arg instanceof stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsRequest)) {
    throw new Error('Expected argument of type stargaze.mint.v1beta1.QueryAnnualProvisionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stargaze_mint_v1beta1_QueryAnnualProvisionsRequest(buffer_arg) {
  return stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stargaze_mint_v1beta1_QueryAnnualProvisionsResponse(arg) {
  if (!(arg instanceof stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsResponse)) {
    throw new Error('Expected argument of type stargaze.mint.v1beta1.QueryAnnualProvisionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stargaze_mint_v1beta1_QueryAnnualProvisionsResponse(buffer_arg) {
  return stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stargaze_mint_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof stargaze_mint_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stargaze.mint.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stargaze_mint_v1beta1_QueryParamsRequest(buffer_arg) {
  return stargaze_mint_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stargaze_mint_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof stargaze_mint_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stargaze.mint.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stargaze_mint_v1beta1_QueryParamsResponse(buffer_arg) {
  return stargaze_mint_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of minting parameters.
params: {
    path: '/stargaze.mint.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_mint_v1beta1_query_pb.QueryParamsRequest,
    responseType: stargaze_mint_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stargaze_mint_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_stargaze_mint_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_stargaze_mint_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_stargaze_mint_v1beta1_QueryParamsResponse,
  },
  // AnnualProvisions current minting annual provisions value.
annualProvisions: {
    path: '/stargaze.mint.v1beta1.Query/AnnualProvisions',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsRequest,
    responseType: stargaze_mint_v1beta1_query_pb.QueryAnnualProvisionsResponse,
    requestSerialize: serialize_stargaze_mint_v1beta1_QueryAnnualProvisionsRequest,
    requestDeserialize: deserialize_stargaze_mint_v1beta1_QueryAnnualProvisionsRequest,
    responseSerialize: serialize_stargaze_mint_v1beta1_QueryAnnualProvisionsResponse,
    responseDeserialize: deserialize_stargaze_mint_v1beta1_QueryAnnualProvisionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
