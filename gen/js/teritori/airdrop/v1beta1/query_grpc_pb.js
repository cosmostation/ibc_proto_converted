// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var teritori_airdrop_v1beta1_query_pb = require('../../../teritori/airdrop/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var teritori_airdrop_v1beta1_allocation_pb = require('../../../teritori/airdrop/v1beta1/allocation_pb.js');
var teritori_airdrop_v1beta1_params_pb = require('../../../teritori/airdrop/v1beta1/params_pb.js');

function serialize_teritori_airdrop_v1beta1_QueryAllocationRequest(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_query_pb.QueryAllocationRequest)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.QueryAllocationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_QueryAllocationRequest(buffer_arg) {
  return teritori_airdrop_v1beta1_query_pb.QueryAllocationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_QueryAllocationResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_query_pb.QueryAllocationResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.QueryAllocationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_QueryAllocationResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_query_pb.QueryAllocationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_QueryParamsRequest(buffer_arg) {
  return teritori_airdrop_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_QueryParamsResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  allocation: {
    path: '/teritori.airdrop.v1beta1.Query/Allocation',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_query_pb.QueryAllocationRequest,
    responseType: teritori_airdrop_v1beta1_query_pb.QueryAllocationResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_QueryAllocationRequest,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_QueryAllocationRequest,
    responseSerialize: serialize_teritori_airdrop_v1beta1_QueryAllocationResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_QueryAllocationResponse,
  },
  params: {
    path: '/teritori.airdrop.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_query_pb.QueryParamsRequest,
    responseType: teritori_airdrop_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_teritori_airdrop_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
