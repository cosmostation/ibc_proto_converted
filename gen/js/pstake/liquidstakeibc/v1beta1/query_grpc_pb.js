// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var pstake_liquidstakeibc_v1beta1_query_pb = require('../../../pstake/liquidstakeibc/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var pstake_liquidstakeibc_v1beta1_params_pb = require('../../../pstake/liquidstakeibc/v1beta1/params_pb.js');
var pstake_liquidstakeibc_v1beta1_liquidstakeibc_pb = require('../../../pstake/liquidstakeibc/v1beta1/liquidstakeibc_pb.js');

function serialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryDepositAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryDepositAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryExchangeRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryExchangeRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryHostChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryHostChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryHostChainsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryLSMDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryLSMDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryParamsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryParamsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUnbondingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUserUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryUserUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingRequest(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingRequest)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryValidatorUnbondingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingRequest(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.QueryValidatorUnbondingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries the parameters of the module.
params: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryParamsResponse,
  },
  // Queries a HostChain by id.
hostChain: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/HostChain',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainResponse,
  },
  // Queries for all the HostChains.
hostChains: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/HostChains',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryHostChainsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryHostChainsResponse,
  },
  // Queries for all the deposits for a host chain.
deposits: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositsResponse,
  },
  // Queries for all the deposits for a host chain.
lSMDeposits: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/LSMDeposits',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryLSMDepositsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryLSMDepositsResponse,
  },
  // Queries all unbondings for a host chain.
unbondings: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/Unbondings',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingsResponse,
  },
  // Queries an unbonding for a host chain.
unbonding: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/Unbonding',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUnbondingResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUnbondingResponse,
  },
  // Queries all unbondings for a delegator address.
userUnbondings: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/UserUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryUserUnbondingsResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryUserUnbondingsResponse,
  },
  // Queries all validator unbondings for a host chain.
validatorUnbondings: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/ValidatorUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryValidatorUnbondingResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryValidatorUnbondingResponse,
  },
  // Queries for a host chain deposit account balance.
depositAccountBalance: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/DepositAccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryDepositAccountBalanceResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryDepositAccountBalanceResponse,
  },
  // Queries for a host chain exchange rate between the host token and the stk token.
exchangeRate: {
    path: '/pstake.liquidstakeibc.v1beta1.Query/ExchangeRate',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateRequest,
    responseType: pstake_liquidstakeibc_v1beta1_query_pb.QueryExchangeRateResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateRequest,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateRequest,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_QueryExchangeRateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
