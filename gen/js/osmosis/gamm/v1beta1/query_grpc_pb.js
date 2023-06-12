// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_gamm_v1beta1_query_pb = require('../../../osmosis/gamm/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_gamm_v1beta1_tx_pb = require('../../../osmosis/gamm/v1beta1/tx_pb.js');
var osmosis_poolmanager_v1beta1_swap_route_pb = require('../../../osmosis/poolmanager/v1beta1/swap_route_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcExitPoolCoinsFromSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcJoinPoolNoSwapSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryCalcJoinPoolSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryConcentratedPoolIdLinkFromCFMMResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryNumPoolsRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryNumPoolsRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryNumPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryNumPoolsRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryNumPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryNumPoolsResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryNumPoolsResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryNumPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryNumPoolsResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryNumPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolParamsRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolParamsRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolParamsRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolParamsResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolParamsResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolParamsResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolTypeRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolTypeRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolTypeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolTypeRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolTypeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolTypeResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolTypeResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolTypeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolTypeResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolTypeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolsRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolsResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolsWithFilterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryPoolsWithFilterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySpotPriceRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySpotPriceRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySpotPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySpotPriceRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySpotPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySpotPriceResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySpotPriceResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySpotPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySpotPriceResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySpotPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySwapExactAmountInRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySwapExactAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySwapExactAmountOutRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QuerySwapExactAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalLiquidityRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalLiquidityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalLiquidityRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalLiquidityResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalLiquidityResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalPoolLiquidityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalPoolLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalSharesRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalSharesRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalSharesRequest(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_QueryTotalSharesResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_query_pb.QueryTotalSharesResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.QueryTotalSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_QueryTotalSharesResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_query_pb.QueryTotalSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  pools: {
    path: '/osmosis.gamm.v1beta1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryPoolsRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolsResponse,
  },
  // Deprecated: please use the alternative in x/poolmanager
numPools: {
    path: '/osmosis.gamm.v1beta1.Query/NumPools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryNumPoolsRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryNumPoolsResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryNumPoolsRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryNumPoolsRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryNumPoolsResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryNumPoolsResponse,
  },
  totalLiquidity: {
    path: '/osmosis.gamm.v1beta1.Query/TotalLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryTotalLiquidityResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalLiquidityRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalLiquidityRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalLiquidityResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalLiquidityResponse,
  },
  // PoolsWithFilter allows you to query specific pools with requested
// parameters
poolsWithFilter: {
    path: '/osmosis.gamm.v1beta1.Query/PoolsWithFilter',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryPoolsWithFilterResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolsWithFilterResponse,
  },
  // Deprecated: please use the alternative in x/poolmanager
pool: {
    path: '/osmosis.gamm.v1beta1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryPoolRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolResponse,
  },
  // PoolType returns the type of the pool.
// Returns "Balancer" as a string literal when the pool is a balancer pool.
// Errors if the pool is failed to be type caseted.
poolType: {
    path: '/osmosis.gamm.v1beta1.Query/PoolType',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryPoolTypeRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryPoolTypeResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolTypeRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolTypeRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolTypeResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolTypeResponse,
  },
  // Simulates joining pool without a swap. Returns the amount of shares you'd
// get and tokens needed to provide
calcJoinPoolNoSwapShares: {
    path: '/osmosis.gamm.v1beta1.Query/CalcJoinPoolNoSwapShares',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolNoSwapSharesResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolNoSwapSharesResponse,
  },
  calcJoinPoolShares: {
    path: '/osmosis.gamm.v1beta1.Query/CalcJoinPoolShares',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryCalcJoinPoolSharesResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcJoinPoolSharesResponse,
  },
  calcExitPoolCoinsFromShares: {
    path: '/osmosis.gamm.v1beta1.Query/CalcExitPoolCoinsFromShares',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryCalcExitPoolCoinsFromSharesResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryCalcExitPoolCoinsFromSharesResponse,
  },
  poolParams: {
    path: '/osmosis.gamm.v1beta1.Query/PoolParams',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryPoolParamsRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryPoolParamsResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolParamsRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolParamsRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryPoolParamsResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryPoolParamsResponse,
  },
  // Deprecated: please use the alternative in x/poolmanager
totalPoolLiquidity: {
    path: '/osmosis.gamm.v1beta1.Query/TotalPoolLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryTotalPoolLiquidityResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalPoolLiquidityResponse,
  },
  totalShares: {
    path: '/osmosis.gamm.v1beta1.Query/TotalShares',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryTotalSharesRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryTotalSharesResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalSharesRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalSharesRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryTotalSharesResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryTotalSharesResponse,
  },
  // SpotPrice defines a gRPC query handler that returns the spot price given
// a base denomination and a quote denomination.
spotPrice: {
    path: '/osmosis.gamm.v1beta1.Query/SpotPrice',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QuerySpotPriceRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QuerySpotPriceResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QuerySpotPriceRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySpotPriceRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QuerySpotPriceResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySpotPriceResponse,
  },
  // Deprecated: please use the alternative in x/poolmanager
estimateSwapExactAmountIn: {
    path: '/osmosis.gamm.v1beta1.Query/EstimateSwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountInResponse,
  },
  // Deprecated: please use the alternative in x/poolmanager
estimateSwapExactAmountOut: {
    path: '/osmosis.gamm.v1beta1.Query/EstimateSwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QuerySwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QuerySwapExactAmountOutResponse,
  },
  // ConcentratedPoolIdLinkFromBalancer returns the pool id of the concentrated
// pool that is linked with the given CFMM pool.
concentratedPoolIdLinkFromCFMM: {
    path: '/osmosis.gamm.v1beta1.Query/ConcentratedPoolIdLinkFromCFMM',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMRequest,
    responseType: osmosis_gamm_v1beta1_query_pb.QueryConcentratedPoolIdLinkFromCFMMResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMRequest,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMRequest,
    responseSerialize: serialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_QueryConcentratedPoolIdLinkFromCFMMResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
