// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var juno_mint_query_pb = require('../../juno/mint/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var juno_mint_mint_pb = require('../../juno/mint/mint_pb.js');

function serialize_juno_mint_QueryAnnualProvisionsRequest(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryAnnualProvisionsRequest)) {
    throw new Error('Expected argument of type juno.mint.QueryAnnualProvisionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryAnnualProvisionsRequest(buffer_arg) {
  return juno_mint_query_pb.QueryAnnualProvisionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_mint_QueryAnnualProvisionsResponse(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryAnnualProvisionsResponse)) {
    throw new Error('Expected argument of type juno.mint.QueryAnnualProvisionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryAnnualProvisionsResponse(buffer_arg) {
  return juno_mint_query_pb.QueryAnnualProvisionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_mint_QueryInflationRequest(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryInflationRequest)) {
    throw new Error('Expected argument of type juno.mint.QueryInflationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryInflationRequest(buffer_arg) {
  return juno_mint_query_pb.QueryInflationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_mint_QueryInflationResponse(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryInflationResponse)) {
    throw new Error('Expected argument of type juno.mint.QueryInflationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryInflationResponse(buffer_arg) {
  return juno_mint_query_pb.QueryInflationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_mint_QueryParamsRequest(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type juno.mint.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryParamsRequest(buffer_arg) {
  return juno_mint_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_mint_QueryParamsResponse(arg) {
  if (!(arg instanceof juno_mint_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type juno.mint.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_mint_QueryParamsResponse(buffer_arg) {
  return juno_mint_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of minting parameters.
params: {
    path: '/juno.mint.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: juno_mint_query_pb.QueryParamsRequest,
    responseType: juno_mint_query_pb.QueryParamsResponse,
    requestSerialize: serialize_juno_mint_QueryParamsRequest,
    requestDeserialize: deserialize_juno_mint_QueryParamsRequest,
    responseSerialize: serialize_juno_mint_QueryParamsResponse,
    responseDeserialize: deserialize_juno_mint_QueryParamsResponse,
  },
  // Inflation returns the current minting inflation value.
inflation: {
    path: '/juno.mint.Query/Inflation',
    requestStream: false,
    responseStream: false,
    requestType: juno_mint_query_pb.QueryInflationRequest,
    responseType: juno_mint_query_pb.QueryInflationResponse,
    requestSerialize: serialize_juno_mint_QueryInflationRequest,
    requestDeserialize: deserialize_juno_mint_QueryInflationRequest,
    responseSerialize: serialize_juno_mint_QueryInflationResponse,
    responseDeserialize: deserialize_juno_mint_QueryInflationResponse,
  },
  // AnnualProvisions current minting annual provisions value.
annualProvisions: {
    path: '/juno.mint.Query/AnnualProvisions',
    requestStream: false,
    responseStream: false,
    requestType: juno_mint_query_pb.QueryAnnualProvisionsRequest,
    responseType: juno_mint_query_pb.QueryAnnualProvisionsResponse,
    requestSerialize: serialize_juno_mint_QueryAnnualProvisionsRequest,
    requestDeserialize: deserialize_juno_mint_QueryAnnualProvisionsRequest,
    responseSerialize: serialize_juno_mint_QueryAnnualProvisionsResponse,
    responseDeserialize: deserialize_juno_mint_QueryAnnualProvisionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
