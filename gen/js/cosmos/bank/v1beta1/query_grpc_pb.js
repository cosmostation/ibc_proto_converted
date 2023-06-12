// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_bank_v1beta1_query_pb = require('../../../cosmos/bank/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_query_v1_query_pb = require('../../../cosmos/query/v1/query_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_bank_v1beta1_QueryAllBalancesRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryAllBalancesRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryAllBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryAllBalancesRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryAllBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryAllBalancesResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryAllBalancesResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryAllBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryAllBalancesResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryAllBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryBalanceRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryBalanceRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryBalanceResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryBalanceResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomMetadataRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomMetadataRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomMetadataRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomMetadataResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomMetadataResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomMetadataResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomOwnersRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomOwnersRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomOwnersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomOwnersRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomOwnersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomOwnersResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomOwnersResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomOwnersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomOwnersResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomOwnersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomsMetadataRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomsMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomsMetadataRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryDenomsMetadataResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryDenomsMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryDenomsMetadataResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryParamsRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryParamsResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySendEnabledRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySendEnabledRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySendEnabledRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySendEnabledRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySendEnabledRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySendEnabledResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySendEnabledResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySendEnabledResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySendEnabledResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySendEnabledResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySpendableBalanceByDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySpendableBalanceByDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySpendableBalancesRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySpendableBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySpendableBalancesRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySpendableBalancesResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySpendableBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySpendableBalancesResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySupplyOfRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySupplyOfRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySupplyOfRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySupplyOfRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySupplyOfRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QuerySupplyOfResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QuerySupplyOfResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QuerySupplyOfResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QuerySupplyOfResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QuerySupplyOfResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryTotalSupplyRequest(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryTotalSupplyRequest)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryTotalSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryTotalSupplyRequest(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryTotalSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_QueryTotalSupplyResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_query_pb.QueryTotalSupplyResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.QueryTotalSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_QueryTotalSupplyResponse(buffer_arg) {
  return cosmos_bank_v1beta1_query_pb.QueryTotalSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Balance queries the balance of a single coin for a single account.
balance: {
    path: '/cosmos.bank.v1beta1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryBalanceRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryBalanceRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryBalanceRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryBalanceResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryBalanceResponse,
  },
  // AllBalances queries the balance of all coins for a single account.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
allBalances: {
    path: '/cosmos.bank.v1beta1.Query/AllBalances',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryAllBalancesRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryAllBalancesResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryAllBalancesRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryAllBalancesRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryAllBalancesResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryAllBalancesResponse,
  },
  // SpendableBalances queries the spendable balance of all coins for a single
// account.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
//
// Since: cosmos-sdk 0.46
spendableBalances: {
    path: '/cosmos.bank.v1beta1.Query/SpendableBalances',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QuerySpendableBalancesResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QuerySpendableBalancesRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QuerySpendableBalancesRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QuerySpendableBalancesResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QuerySpendableBalancesResponse,
  },
  // SpendableBalanceByDenom queries the spendable balance of a single denom for
// a single account.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
//
// Since: cosmos-sdk 0.47
spendableBalanceByDenom: {
    path: '/cosmos.bank.v1beta1.Query/SpendableBalanceByDenom',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QuerySpendableBalanceByDenomResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QuerySpendableBalanceByDenomResponse,
  },
  // TotalSupply queries the total supply of all coins.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
totalSupply: {
    path: '/cosmos.bank.v1beta1.Query/TotalSupply',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryTotalSupplyRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryTotalSupplyResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryTotalSupplyRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryTotalSupplyRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryTotalSupplyResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryTotalSupplyResponse,
  },
  // SupplyOf queries the supply of a single coin.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
supplyOf: {
    path: '/cosmos.bank.v1beta1.Query/SupplyOf',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QuerySupplyOfRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QuerySupplyOfResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QuerySupplyOfRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QuerySupplyOfRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QuerySupplyOfResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QuerySupplyOfResponse,
  },
  // Params queries the parameters of x/bank module.
params: {
    path: '/cosmos.bank.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryParamsRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryParamsResponse,
  },
  // DenomsMetadata queries the client metadata of a given coin denomination.
denomMetadata: {
    path: '/cosmos.bank.v1beta1.Query/DenomMetadata',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryDenomMetadataRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryDenomMetadataResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryDenomMetadataRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomMetadataRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryDenomMetadataResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomMetadataResponse,
  },
  // DenomsMetadata queries the client metadata for all registered coin
// denominations.
denomsMetadata: {
    path: '/cosmos.bank.v1beta1.Query/DenomsMetadata',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryDenomsMetadataResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryDenomsMetadataRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomsMetadataRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryDenomsMetadataResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomsMetadataResponse,
  },
  // DenomOwners queries for all account addresses that own a particular token
// denomination.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
//
// Since: cosmos-sdk 0.46
denomOwners: {
    path: '/cosmos.bank.v1beta1.Query/DenomOwners',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QueryDenomOwnersRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QueryDenomOwnersResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QueryDenomOwnersRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomOwnersRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QueryDenomOwnersResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QueryDenomOwnersResponse,
  },
  // SendEnabled queries for SendEnabled entries.
//
// This query only returns denominations that have specific SendEnabled settings.
// Any denomination that does not have a specific setting will use the default
// params.default_send_enabled, and will not be returned by this query.
//
// Since: cosmos-sdk 0.47
sendEnabled: {
    path: '/cosmos.bank.v1beta1.Query/SendEnabled',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_query_pb.QuerySendEnabledRequest,
    responseType: cosmos_bank_v1beta1_query_pb.QuerySendEnabledResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_QuerySendEnabledRequest,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_QuerySendEnabledRequest,
    responseSerialize: serialize_cosmos_bank_v1beta1_QuerySendEnabledResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_QuerySendEnabledResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
