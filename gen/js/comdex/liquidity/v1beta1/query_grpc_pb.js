// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_liquidity_v1beta1_query_pb = require('../../../comdex/liquidity/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var comdex_liquidity_v1beta1_liquidity_pb = require('../../../comdex/liquidity/v1beta1/liquidity_pb.js');
var comdex_liquidity_v1beta1_params_pb = require('../../../comdex/liquidity/v1beta1/params_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');

function serialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryAllFarmedPoolCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryAllFarmedPoolCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDepositRequestRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDepositRequestRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDepositRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDepositRequestRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDepositRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDepositRequestResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDepositRequestResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDepositRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDepositRequestResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDepositRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDepositRequestsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDepositRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDepositRequestsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDepositRequestsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDepositRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDepositRequestsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDeserializePoolCoinRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryDeserializePoolCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryFarmedPoolCoinRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryFarmedPoolCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryFarmerRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryFarmerRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryFarmerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryFarmerRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryFarmerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryFarmerResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryFarmerResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryFarmerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryFarmerResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryFarmerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryGenericParamsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryGenericParamsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryGenericParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryGenericParamsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryGenericParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryGenericParamsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryGenericParamsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryGenericParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryGenericParamsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryGenericParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrderBooksRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrderBooksRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrderBooksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrderBooksRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrderBooksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrderBooksResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrderBooksResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrderBooksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrderBooksResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrderBooksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrderRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrderRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrderRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrdersByOrdererRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrdersByOrdererRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrdersByOrdererRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrdersRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrdersRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrdersRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryOrdersResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryOrdersResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryOrdersResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPairRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPairRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPairRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPairResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPairResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPairResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPairsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPairsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPairsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPairsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPairsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPairsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolByPoolCoinDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolByReserveAddressRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolByReserveAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolByReserveAddressRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolIncentivesResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolIncentivesResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolIncentivesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolIncentivesResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolIncentivesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolsIncentivesRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolsIncentivesRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolsIncentivesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolsIncentivesRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolsIncentivesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryPoolsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryWithdrawRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryWithdrawRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsRequest(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryWithdrawRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsRequest(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns parameters of the module.
params: {
    path: '/comdex.liquidity.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryParamsResponse,
  },
  // GenericParams returns app parameters of the module.
genericParams: {
    path: '/comdex.liquidity.v1beta1.Query/GenericParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryGenericParamsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryGenericParamsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryGenericParamsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryGenericParamsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryGenericParamsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryGenericParamsResponse,
  },
  // Pools returns all liquidity pools.
pools: {
    path: '/comdex.liquidity.v1beta1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPoolsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolsResponse,
  },
  // Pool returns the specific liquidity pool.
pool: {
    path: '/comdex.liquidity.v1beta1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPoolRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolResponse,
  },
  // PoolByReserveAddress returns all pools that correspond to the reserve account.
poolByReserveAddress: {
    path: '/comdex.liquidity.v1beta1.Query/PoolByReserveAddress',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolByReserveAddressRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolByReserveAddressRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolResponse,
  },
  // PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
poolByPoolCoinDenom: {
    path: '/comdex.liquidity.v1beta1.Query/PoolByPoolCoinDenom',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolResponse,
  },
  // Pairs returns all liquidity pairs.
pairs: {
    path: '/comdex.liquidity.v1beta1.Query/Pairs',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPairsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPairsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPairsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPairsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPairsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPairsResponse,
  },
  // Pair returns the specific pair.
pair: {
    path: '/comdex.liquidity.v1beta1.Query/Pair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPairRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPairResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPairRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPairRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPairResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPairResponse,
  },
  // DepositRequests returns all deposit requests.
depositRequests: {
    path: '/comdex.liquidity.v1beta1.Query/DepositRequests',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryDepositRequestsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDepositRequestsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryDepositRequestsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDepositRequestsResponse,
  },
  // DepositRequest returns the specific deposit request.
depositRequest: {
    path: '/comdex.liquidity.v1beta1.Query/DepositRequest',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryDepositRequestRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryDepositRequestResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryDepositRequestRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDepositRequestRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryDepositRequestResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDepositRequestResponse,
  },
  // WithdrawRequests returns all withdraw requests.
withdrawRequests: {
    path: '/comdex.liquidity.v1beta1.Query/WithdrawRequests',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestsResponse,
  },
  // WithdrawRequest returns the specific withdraw request.
withdrawRequest: {
    path: '/comdex.liquidity.v1beta1.Query/WithdrawRequest',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryWithdrawRequestResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryWithdrawRequestResponse,
  },
  // Orders returns all orders within the pair.
orders: {
    path: '/comdex.liquidity.v1beta1.Query/Orders',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryOrdersRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryOrdersRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrdersRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryOrdersResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrdersResponse,
  },
  // Order returns the specific order.
order: {
    path: '/comdex.liquidity.v1beta1.Query/Order',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryOrderRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryOrderRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrderRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrderResponse,
  },
  // OrdersByOrderer returns orders made by an orderer.
ordersByOrderer: {
    path: '/comdex.liquidity.v1beta1.Query/OrdersByOrderer',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryOrdersByOrdererRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrdersByOrdererRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryOrdersResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrdersResponse,
  },
  // Farmer returns deposited poolcoin for farming .
farmer: {
    path: '/comdex.liquidity.v1beta1.Query/Farmer',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryFarmerRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryFarmerResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryFarmerRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryFarmerRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryFarmerResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryFarmerResponse,
  },
  // DeserializePoolCoin splits poolcoin into the actual provided pool assets .
deserializePoolCoin: {
    path: '/comdex.liquidity.v1beta1.Query/DeserializePoolCoin',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryDeserializePoolCoinResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryDeserializePoolCoinResponse,
  },
  // PoolIncentives provides insights about available pool incentives.
poolIncentives: {
    path: '/comdex.liquidity.v1beta1.Query/PoolIncentives',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryPoolsIncentivesRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryPoolIncentivesResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolsIncentivesRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolsIncentivesRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryPoolIncentivesResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryPoolIncentivesResponse,
  },
  // FarmedPoolCoin returns the total farmed pool coins.
farmedPoolCoin: {
    path: '/comdex.liquidity.v1beta1.Query/FarmedPoolCoin',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryFarmedPoolCoinResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryFarmedPoolCoinResponse,
  },
  // TotalActiveAndQueuedPoolCoin returns the total number of active and queued farmed pool coins in each pool.
totalActiveAndQueuedPoolCoin: {
    path: '/comdex.liquidity.v1beta1.Query/TotalActiveAndQueuedPoolCoin',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryAllFarmedPoolCoinsResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryAllFarmedPoolCoinsResponse,
  },
  orderBooks: {
    path: '/comdex.liquidity.v1beta1.Query/OrderBooks',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_query_pb.QueryOrderBooksRequest,
    responseType: comdex_liquidity_v1beta1_query_pb.QueryOrderBooksResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_QueryOrderBooksRequest,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrderBooksRequest,
    responseSerialize: serialize_comdex_liquidity_v1beta1_QueryOrderBooksResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_QueryOrderBooksResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
