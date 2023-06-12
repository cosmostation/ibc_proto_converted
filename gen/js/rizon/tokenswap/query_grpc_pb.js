// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var rizon_tokenswap_query_pb = require('../../rizon/tokenswap/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var rizon_tokenswap_tokenswap_pb = require('../../rizon/tokenswap/tokenswap_pb.js');
var rizon_tokenswap_params_pb = require('../../rizon/tokenswap/params_pb.js');

function serialize_rizonworld_rizon_tokenswap_QueryParamsRequest(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QueryParamsRequest(buffer_arg) {
  return rizon_tokenswap_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_QueryParamsResponse(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QueryParamsResponse(buffer_arg) {
  return rizon_tokenswap_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_QuerySwappedAmountRequest(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QuerySwappedAmountRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QuerySwappedAmountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QuerySwappedAmountRequest(buffer_arg) {
  return rizon_tokenswap_query_pb.QuerySwappedAmountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_QuerySwappedAmountResponse(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QuerySwappedAmountResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QuerySwappedAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QuerySwappedAmountResponse(buffer_arg) {
  return rizon_tokenswap_query_pb.QuerySwappedAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_QueryTokenswapRequest(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QueryTokenswapRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QueryTokenswapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QueryTokenswapRequest(buffer_arg) {
  return rizon_tokenswap_query_pb.QueryTokenswapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_QueryTokenswapResponse(arg) {
  if (!(arg instanceof rizon_tokenswap_query_pb.QueryTokenswapResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.QueryTokenswapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_QueryTokenswapResponse(buffer_arg) {
  return rizon_tokenswap_query_pb.QueryTokenswapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Tokenswap queries tokenswap item for given tx hash
tokenswap: {
    path: '/rizonworld.rizon.tokenswap.Query/Tokenswap',
    requestStream: false,
    responseStream: false,
    requestType: rizon_tokenswap_query_pb.QueryTokenswapRequest,
    responseType: rizon_tokenswap_query_pb.QueryTokenswapResponse,
    requestSerialize: serialize_rizonworld_rizon_tokenswap_QueryTokenswapRequest,
    requestDeserialize: deserialize_rizonworld_rizon_tokenswap_QueryTokenswapRequest,
    responseSerialize: serialize_rizonworld_rizon_tokenswap_QueryTokenswapResponse,
    responseDeserialize: deserialize_rizonworld_rizon_tokenswap_QueryTokenswapResponse,
  },
  // SwappedAmount queries current swapped amount of tokenswap
swappedAmount: {
    path: '/rizonworld.rizon.tokenswap.Query/SwappedAmount',
    requestStream: false,
    responseStream: false,
    requestType: rizon_tokenswap_query_pb.QuerySwappedAmountRequest,
    responseType: rizon_tokenswap_query_pb.QuerySwappedAmountResponse,
    requestSerialize: serialize_rizonworld_rizon_tokenswap_QuerySwappedAmountRequest,
    requestDeserialize: deserialize_rizonworld_rizon_tokenswap_QuerySwappedAmountRequest,
    responseSerialize: serialize_rizonworld_rizon_tokenswap_QuerySwappedAmountResponse,
    responseDeserialize: deserialize_rizonworld_rizon_tokenswap_QuerySwappedAmountResponse,
  },
  // Params queries parameters of tokenswap
params: {
    path: '/rizonworld.rizon.tokenswap.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: rizon_tokenswap_query_pb.QueryParamsRequest,
    responseType: rizon_tokenswap_query_pb.QueryParamsResponse,
    requestSerialize: serialize_rizonworld_rizon_tokenswap_QueryParamsRequest,
    requestDeserialize: deserialize_rizonworld_rizon_tokenswap_QueryParamsRequest,
    responseSerialize: serialize_rizonworld_rizon_tokenswap_QueryParamsResponse,
    responseDeserialize: deserialize_rizonworld_rizon_tokenswap_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
