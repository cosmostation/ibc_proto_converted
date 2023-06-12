// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_coinswap_query_pb = require('../../irismod/coinswap/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_irismod_coinswap_QueryLiquidityPoolRequest(arg) {
  if (!(arg instanceof irismod_coinswap_query_pb.QueryLiquidityPoolRequest)) {
    throw new Error('Expected argument of type irismod.coinswap.QueryLiquidityPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_QueryLiquidityPoolRequest(buffer_arg) {
  return irismod_coinswap_query_pb.QueryLiquidityPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_QueryLiquidityPoolResponse(arg) {
  if (!(arg instanceof irismod_coinswap_query_pb.QueryLiquidityPoolResponse)) {
    throw new Error('Expected argument of type irismod.coinswap.QueryLiquidityPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_QueryLiquidityPoolResponse(buffer_arg) {
  return irismod_coinswap_query_pb.QueryLiquidityPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_QueryLiquidityPoolsRequest(arg) {
  if (!(arg instanceof irismod_coinswap_query_pb.QueryLiquidityPoolsRequest)) {
    throw new Error('Expected argument of type irismod.coinswap.QueryLiquidityPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_QueryLiquidityPoolsRequest(buffer_arg) {
  return irismod_coinswap_query_pb.QueryLiquidityPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_QueryLiquidityPoolsResponse(arg) {
  if (!(arg instanceof irismod_coinswap_query_pb.QueryLiquidityPoolsResponse)) {
    throw new Error('Expected argument of type irismod.coinswap.QueryLiquidityPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_QueryLiquidityPoolsResponse(buffer_arg) {
  return irismod_coinswap_query_pb.QueryLiquidityPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with coinswap as rpc
var QueryService = exports.QueryService = {
  // LiquidityPool returns the liquidity pool for the provided
// lpt_denom
liquidityPool: {
    path: '/irismod.coinswap.Query/LiquidityPool',
    requestStream: false,
    responseStream: false,
    requestType: irismod_coinswap_query_pb.QueryLiquidityPoolRequest,
    responseType: irismod_coinswap_query_pb.QueryLiquidityPoolResponse,
    requestSerialize: serialize_irismod_coinswap_QueryLiquidityPoolRequest,
    requestDeserialize: deserialize_irismod_coinswap_QueryLiquidityPoolRequest,
    responseSerialize: serialize_irismod_coinswap_QueryLiquidityPoolResponse,
    responseDeserialize: deserialize_irismod_coinswap_QueryLiquidityPoolResponse,
  },
  // LiquidityPools returns all the liquidity pools available
liquidityPools: {
    path: '/irismod.coinswap.Query/LiquidityPools',
    requestStream: false,
    responseStream: false,
    requestType: irismod_coinswap_query_pb.QueryLiquidityPoolsRequest,
    responseType: irismod_coinswap_query_pb.QueryLiquidityPoolsResponse,
    requestSerialize: serialize_irismod_coinswap_QueryLiquidityPoolsRequest,
    requestDeserialize: deserialize_irismod_coinswap_QueryLiquidityPoolsRequest,
    responseSerialize: serialize_irismod_coinswap_QueryLiquidityPoolsResponse,
    responseDeserialize: deserialize_irismod_coinswap_QueryLiquidityPoolsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
