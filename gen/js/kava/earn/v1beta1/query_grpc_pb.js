// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_earn_v1beta1_query_pb = require('../../../kava/earn/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_earn_v1beta1_params_pb = require('../../../kava/earn/v1beta1/params_pb.js');
var kava_earn_v1beta1_strategy_pb = require('../../../kava/earn/v1beta1/strategy_pb.js');
var kava_earn_v1beta1_vault_pb = require('../../../kava/earn/v1beta1/vault_pb.js');

function serialize_kava_earn_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryDepositsRequest(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryDepositsResponse(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryTotalSupplyRequest(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryTotalSupplyRequest)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryTotalSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryTotalSupplyRequest(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryTotalSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryTotalSupplyResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryTotalSupplyResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryTotalSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryTotalSupplyResponse(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryTotalSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryVaultRequest(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryVaultRequest)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryVaultRequest(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryVaultResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryVaultResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryVaultResponse(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryVaultsRequest(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryVaultsRequest)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryVaultsRequest(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_QueryVaultsResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_query_pb.QueryVaultsResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.QueryVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_QueryVaultsResponse(buffer_arg) {
  return kava_earn_v1beta1_query_pb.QueryVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for earn module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the earn module.
params: {
    path: '/kava.earn.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_earn_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_earn_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_earn_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_earn_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_QueryParamsResponse,
  },
  // Vaults queries all vaults
vaults: {
    path: '/kava.earn.v1beta1.Query/Vaults',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_query_pb.QueryVaultsRequest,
    responseType: kava_earn_v1beta1_query_pb.QueryVaultsResponse,
    requestSerialize: serialize_kava_earn_v1beta1_QueryVaultsRequest,
    requestDeserialize: deserialize_kava_earn_v1beta1_QueryVaultsRequest,
    responseSerialize: serialize_kava_earn_v1beta1_QueryVaultsResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_QueryVaultsResponse,
  },
  // Vault queries a single vault based on the vault denom
vault: {
    path: '/kava.earn.v1beta1.Query/Vault',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_query_pb.QueryVaultRequest,
    responseType: kava_earn_v1beta1_query_pb.QueryVaultResponse,
    requestSerialize: serialize_kava_earn_v1beta1_QueryVaultRequest,
    requestDeserialize: deserialize_kava_earn_v1beta1_QueryVaultRequest,
    responseSerialize: serialize_kava_earn_v1beta1_QueryVaultResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_QueryVaultResponse,
  },
  // Deposits queries deposit details based on depositor address and vault
deposits: {
    path: '/kava.earn.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_query_pb.QueryDepositsRequest,
    responseType: kava_earn_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_kava_earn_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_kava_earn_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_kava_earn_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_QueryDepositsResponse,
  },
  // TotalSupply returns the total sum of all coins currently locked into the earn module.
totalSupply: {
    path: '/kava.earn.v1beta1.Query/TotalSupply',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_query_pb.QueryTotalSupplyRequest,
    responseType: kava_earn_v1beta1_query_pb.QueryTotalSupplyResponse,
    requestSerialize: serialize_kava_earn_v1beta1_QueryTotalSupplyRequest,
    requestDeserialize: deserialize_kava_earn_v1beta1_QueryTotalSupplyRequest,
    responseSerialize: serialize_kava_earn_v1beta1_QueryTotalSupplyResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_QueryTotalSupplyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
