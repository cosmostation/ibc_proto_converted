// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_erc20_v1_query_pb = require('../../../canto/erc20/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var canto_erc20_v1_genesis_pb = require('../../../canto/erc20/v1/genesis_pb.js');
var canto_erc20_v1_erc20_pb = require('../../../canto/erc20/v1/erc20_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_canto_erc20_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryParamsRequest(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryParamsResponse(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_QueryTokenPairRequest(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryTokenPairRequest)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryTokenPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryTokenPairRequest(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryTokenPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_QueryTokenPairResponse(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryTokenPairResponse)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryTokenPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryTokenPairResponse(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryTokenPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_QueryTokenPairsRequest(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryTokenPairsRequest)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryTokenPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryTokenPairsRequest(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryTokenPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_QueryTokenPairsResponse(arg) {
  if (!(arg instanceof canto_erc20_v1_query_pb.QueryTokenPairsResponse)) {
    throw new Error('Expected argument of type canto.erc20.v1.QueryTokenPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_QueryTokenPairsResponse(buffer_arg) {
  return canto_erc20_v1_query_pb.QueryTokenPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // TokenPairs retrieves registered token pairs
tokenPairs: {
    path: '/canto.erc20.v1.Query/TokenPairs',
    requestStream: false,
    responseStream: false,
    requestType: canto_erc20_v1_query_pb.QueryTokenPairsRequest,
    responseType: canto_erc20_v1_query_pb.QueryTokenPairsResponse,
    requestSerialize: serialize_canto_erc20_v1_QueryTokenPairsRequest,
    requestDeserialize: deserialize_canto_erc20_v1_QueryTokenPairsRequest,
    responseSerialize: serialize_canto_erc20_v1_QueryTokenPairsResponse,
    responseDeserialize: deserialize_canto_erc20_v1_QueryTokenPairsResponse,
  },
  // TokenPair retrieves a registered token pair
tokenPair: {
    path: '/canto.erc20.v1.Query/TokenPair',
    requestStream: false,
    responseStream: false,
    requestType: canto_erc20_v1_query_pb.QueryTokenPairRequest,
    responseType: canto_erc20_v1_query_pb.QueryTokenPairResponse,
    requestSerialize: serialize_canto_erc20_v1_QueryTokenPairRequest,
    requestDeserialize: deserialize_canto_erc20_v1_QueryTokenPairRequest,
    responseSerialize: serialize_canto_erc20_v1_QueryTokenPairResponse,
    responseDeserialize: deserialize_canto_erc20_v1_QueryTokenPairResponse,
  },
  // Params retrieves the erc20 module params
params: {
    path: '/canto.erc20.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: canto_erc20_v1_query_pb.QueryParamsRequest,
    responseType: canto_erc20_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_canto_erc20_v1_QueryParamsRequest,
    requestDeserialize: deserialize_canto_erc20_v1_QueryParamsRequest,
    responseSerialize: serialize_canto_erc20_v1_QueryParamsResponse,
    responseDeserialize: deserialize_canto_erc20_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
