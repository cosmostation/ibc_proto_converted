// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_mint_v1beta1_query_pb = require('../../../stride/mint/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var stride_mint_v1beta1_mint_pb = require('../../../stride/mint/v1beta1/mint_pb.js');

function serialize_stride_mint_v1beta1_QueryEpochProvisionsRequest(arg) {
  if (!(arg instanceof stride_mint_v1beta1_query_pb.QueryEpochProvisionsRequest)) {
    throw new Error('Expected argument of type stride.mint.v1beta1.QueryEpochProvisionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_mint_v1beta1_QueryEpochProvisionsRequest(buffer_arg) {
  return stride_mint_v1beta1_query_pb.QueryEpochProvisionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_mint_v1beta1_QueryEpochProvisionsResponse(arg) {
  if (!(arg instanceof stride_mint_v1beta1_query_pb.QueryEpochProvisionsResponse)) {
    throw new Error('Expected argument of type stride.mint.v1beta1.QueryEpochProvisionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_mint_v1beta1_QueryEpochProvisionsResponse(buffer_arg) {
  return stride_mint_v1beta1_query_pb.QueryEpochProvisionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_mint_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_mint_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.mint.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_mint_v1beta1_QueryParamsRequest(buffer_arg) {
  return stride_mint_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_mint_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_mint_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.mint.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_mint_v1beta1_QueryParamsResponse(buffer_arg) {
  return stride_mint_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of minting parameters.
params: {
    path: '/stride.mint.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_mint_v1beta1_query_pb.QueryParamsRequest,
    responseType: stride_mint_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_mint_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_stride_mint_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_stride_mint_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_stride_mint_v1beta1_QueryParamsResponse,
  },
  // EpochProvisions current minting epoch provisions value.
epochProvisions: {
    path: '/stride.mint.v1beta1.Query/EpochProvisions',
    requestStream: false,
    responseStream: false,
    requestType: stride_mint_v1beta1_query_pb.QueryEpochProvisionsRequest,
    responseType: stride_mint_v1beta1_query_pb.QueryEpochProvisionsResponse,
    requestSerialize: serialize_stride_mint_v1beta1_QueryEpochProvisionsRequest,
    requestDeserialize: deserialize_stride_mint_v1beta1_QueryEpochProvisionsRequest,
    responseSerialize: serialize_stride_mint_v1beta1_QueryEpochProvisionsResponse,
    responseDeserialize: deserialize_stride_mint_v1beta1_QueryEpochProvisionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
