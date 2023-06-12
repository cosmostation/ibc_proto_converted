// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_asset_ft_v1_query_pb = require('../../../../coreum/asset/ft/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../../cosmos/base/query/v1beta1/pagination_pb.js');
var coreum_asset_ft_v1_token_pb = require('../../../../coreum/asset/ft/v1/token_pb.js');
var coreum_asset_ft_v1_params_pb = require('../../../../coreum/asset/ft/v1/params_pb.js');

function serialize_coreum_asset_ft_v1_QueryBalanceRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryBalanceRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryBalanceResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryBalanceResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryFrozenBalanceRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryFrozenBalanceRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryFrozenBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryFrozenBalanceRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryFrozenBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryFrozenBalanceResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryFrozenBalanceResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryFrozenBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryFrozenBalanceResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryFrozenBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryFrozenBalancesRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryFrozenBalancesRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryFrozenBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryFrozenBalancesRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryFrozenBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryFrozenBalancesResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryFrozenBalancesResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryFrozenBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryFrozenBalancesResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryFrozenBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryParamsRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryParamsResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryTokenRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryTokenRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryTokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryTokenRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryTokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryTokenResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryTokenResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryTokenResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryTokensRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryTokensRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryTokensRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryTokensResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryTokensResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryTokensResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryWhitelistedBalanceRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryWhitelistedBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryWhitelistedBalanceRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryWhitelistedBalanceResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryWhitelistedBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryWhitelistedBalanceResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryWhitelistedBalancesRequest(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesRequest)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryWhitelistedBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryWhitelistedBalancesRequest(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_QueryWhitelistedBalancesResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.QueryWhitelistedBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_QueryWhitelistedBalancesResponse(buffer_arg) {
  return coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/asset/ft module.
params: {
    path: '/coreum.asset.ft.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryParamsRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryParamsRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryParamsRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryParamsResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryParamsResponse,
  },
  // Tokens queries the fungible tokens of the module.
tokens: {
    path: '/coreum.asset.ft.v1.Query/Tokens',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryTokensRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryTokensResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryTokensRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryTokensRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryTokensResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryTokensResponse,
  },
  // Token queries the fungible token of the module.
token: {
    path: '/coreum.asset.ft.v1.Query/Token',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryTokenRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryTokenResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryTokenRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryTokenRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryTokenResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryTokenResponse,
  },
  // Balance returns balance of the denom for the account.
balance: {
    path: '/coreum.asset.ft.v1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryBalanceRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryBalanceRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryBalanceRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryBalanceResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryBalanceResponse,
  },
  // FrozenBalances returns all the frozen balances for the account.
frozenBalances: {
    path: '/coreum.asset.ft.v1.Query/FrozenBalances',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryFrozenBalancesRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryFrozenBalancesResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryFrozenBalancesRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryFrozenBalancesRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryFrozenBalancesResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryFrozenBalancesResponse,
  },
  // FrozenBalance returns frozen balance of the denom for the account.
frozenBalance: {
    path: '/coreum.asset.ft.v1.Query/FrozenBalance',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryFrozenBalanceRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryFrozenBalanceResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryFrozenBalanceRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryFrozenBalanceRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryFrozenBalanceResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryFrozenBalanceResponse,
  },
  // WhitelistedBalances returns all the whitelisted balances for the account.
whitelistedBalances: {
    path: '/coreum.asset.ft.v1.Query/WhitelistedBalances',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryWhitelistedBalancesResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryWhitelistedBalancesRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryWhitelistedBalancesRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryWhitelistedBalancesResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryWhitelistedBalancesResponse,
  },
  // WhitelistedBalance returns whitelisted balance of the denom for the account.
whitelistedBalance: {
    path: '/coreum.asset.ft.v1.Query/WhitelistedBalance',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceRequest,
    responseType: coreum_asset_ft_v1_query_pb.QueryWhitelistedBalanceResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_QueryWhitelistedBalanceRequest,
    requestDeserialize: deserialize_coreum_asset_ft_v1_QueryWhitelistedBalanceRequest,
    responseSerialize: serialize_coreum_asset_ft_v1_QueryWhitelistedBalanceResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_QueryWhitelistedBalanceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
