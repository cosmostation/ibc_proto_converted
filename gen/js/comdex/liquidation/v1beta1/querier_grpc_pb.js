// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_liquidation_v1beta1_querier_pb = require('../../../comdex/liquidation/v1beta1/querier_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var comdex_liquidation_v1beta1_params_pb = require('../../../comdex/liquidation/v1beta1/params_pb.js');
var comdex_liquidation_v1beta1_locked_vault_pb = require('../../../comdex/liquidation/v1beta1/locked_vault_pb.js');

function serialize_comdex_liquidation_v1beta1_QueryAppIdsRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryAppIdsRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryAppIdsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryAppIdsRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryAppIdsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryAppIdsResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryAppIdsResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryAppIdsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryAppIdsResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryAppIdsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLiquidationParamsRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLiquidationParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLiquidationParamsRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLiquidationParamsResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLiquidationParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLiquidationParamsResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryLockedVaultsResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryLockedVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryLockedVault: {
    path: '/comdex.liquidation.v1beta1.Query/QueryLockedVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultResponse,
  },
  queryLockedVaults: {
    path: '/comdex.liquidation.v1beta1.Query/QueryLockedVaults',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsResponse,
  },
  queryLiquidationParams: {
    path: '/comdex.liquidation.v1beta1.Query/QueryLiquidationParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryLiquidationParamsResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryLiquidationParamsRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLiquidationParamsRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryLiquidationParamsResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLiquidationParamsResponse,
  },
  queryLockedVaultsHistory: {
    path: '/comdex.liquidation.v1beta1.Query/QueryLockedVaultsHistory',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsHistoryResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsHistoryResponse,
  },
  queryUserLockedVaults: {
    path: '/comdex.liquidation.v1beta1.Query/QueryUserLockedVaults',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsResponse,
  },
  queryUserLockedVaultsHistory: {
    path: '/comdex.liquidation.v1beta1.Query/QueryUserLockedVaultsHistory',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryUserLockedVaultsHistoryResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryUserLockedVaultsHistoryResponse,
  },
  queryLockedVaultsPair: {
    path: '/comdex.liquidation.v1beta1.Query/QueryLockedVaultsPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryLockedVaultsPairResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryLockedVaultsPairResponse,
  },
  queryAppIds: {
    path: '/comdex.liquidation.v1beta1.Query/QueryAppIds',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_querier_pb.QueryAppIdsRequest,
    responseType: comdex_liquidation_v1beta1_querier_pb.QueryAppIdsResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_QueryAppIdsRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_QueryAppIdsRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_QueryAppIdsResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_QueryAppIdsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
