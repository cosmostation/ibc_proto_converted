// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_millions_query_pb = require('../../lum-network/millions/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var lum$network_millions_deposit_pb = require('../../lum-network/millions/deposit_pb.js');
var lum$network_millions_draw_pb = require('../../lum-network/millions/draw_pb.js');
var lum$network_millions_params_pb = require('../../lum-network/millions/params_pb.js');
var lum$network_millions_pool_pb = require('../../lum-network/millions/pool_pb.js');
var lum$network_millions_prize_pb = require('../../lum-network/millions/prize_pb.js');
var lum$network_millions_withdrawal_pb = require('../../lum-network/millions/withdrawal_pb.js');

function serialize_lum_network_millions_QueryAccountDepositsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountDepositsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountDepositsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountPoolDepositsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountPoolDepositsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountPoolDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountPoolDepositsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountPoolDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountPoolDrawPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountPoolDrawPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountPoolDrawPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountPoolDrawPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountPoolDrawPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountPoolPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountPoolPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountPoolPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountPoolPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountPoolPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountPoolWithdrawalsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountPoolWithdrawalsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountPoolWithdrawalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountPoolWithdrawalsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountPoolWithdrawalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryAccountWithdrawalsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryAccountWithdrawalsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryAccountWithdrawalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryAccountWithdrawalsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryAccountWithdrawalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDepositResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDepositResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDepositResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDepositsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDepositsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDepositsResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDepositsResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDrawResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDrawResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDrawResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryDrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDrawsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDrawsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDrawsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDrawsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryDrawsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryDrawsResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryDrawsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryDrawsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryDrawsResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryDrawsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryParamsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryParamsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryParamsResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryParamsResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDepositRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDepositRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDepositRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDepositsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDepositsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDepositsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDrawPrizeRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDrawPrizeRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDrawPrizeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDrawPrizeRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDrawPrizeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDrawPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDrawPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDrawPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDrawPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDrawPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDrawRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDrawRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDrawRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDrawRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDrawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolDrawsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolDrawsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolDrawsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolDrawsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolDrawsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolWithdrawalRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolWithdrawalRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolWithdrawalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolWithdrawalRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolWithdrawalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolWithdrawalsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolWithdrawalsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolWithdrawalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolWithdrawalsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolWithdrawalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPoolsResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPoolsResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPrizeResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPrizeResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPrizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPrizeResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryPrizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPrizesRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPrizesRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPrizesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPrizesRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryPrizesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryPrizesResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryPrizesResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryPrizesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryPrizesResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryPrizesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryWithdrawalResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryWithdrawalResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryWithdrawalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryWithdrawalResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryWithdrawalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryWithdrawalsRequest(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryWithdrawalsRequest)) {
    throw new Error('Expected argument of type lum.network.millions.QueryWithdrawalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryWithdrawalsRequest(buffer_arg) {
  return lum$network_millions_query_pb.QueryWithdrawalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_QueryWithdrawalsResponse(arg) {
  if (!(arg instanceof lum$network_millions_query_pb.QueryWithdrawalsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.QueryWithdrawalsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_QueryWithdrawalsResponse(buffer_arg) {
  return lum$network_millions_query_pb.QueryWithdrawalsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/lum.network.millions.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryParamsRequest,
    responseType: lum$network_millions_query_pb.QueryParamsResponse,
    requestSerialize: serialize_lum_network_millions_QueryParamsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryParamsRequest,
    responseSerialize: serialize_lum_network_millions_QueryParamsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryParamsResponse,
  },
  pools: {
    path: '/lum.network.millions.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolsRequest,
    responseType: lum$network_millions_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolsRequest,
    responseSerialize: serialize_lum_network_millions_QueryPoolsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPoolsResponse,
  },
  pool: {
    path: '/lum.network.millions.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolRequest,
    responseType: lum$network_millions_query_pb.QueryPoolResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolRequest,
    responseSerialize: serialize_lum_network_millions_QueryPoolResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPoolResponse,
  },
  deposits: {
    path: '/lum.network.millions.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryDepositsRequest,
    responseType: lum$network_millions_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_lum_network_millions_QueryDepositsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryDepositsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDepositsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDepositsResponse,
  },
  poolDeposits: {
    path: '/lum.network.millions.Query/PoolDeposits',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDepositsRequest,
    responseType: lum$network_millions_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDepositsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDepositsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDepositsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDepositsResponse,
  },
  poolDeposit: {
    path: '/lum.network.millions.Query/PoolDeposit',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDepositRequest,
    responseType: lum$network_millions_query_pb.QueryDepositResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDepositRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDepositRequest,
    responseSerialize: serialize_lum_network_millions_QueryDepositResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDepositResponse,
  },
  accountDeposits: {
    path: '/lum.network.millions.Query/AccountDeposits',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountDepositsRequest,
    responseType: lum$network_millions_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountDepositsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountDepositsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDepositsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDepositsResponse,
  },
  accountPoolDeposits: {
    path: '/lum.network.millions.Query/AccountPoolDeposits',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountPoolDepositsRequest,
    responseType: lum$network_millions_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountPoolDepositsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountPoolDepositsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDepositsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDepositsResponse,
  },
  draws: {
    path: '/lum.network.millions.Query/Draws',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryDrawsRequest,
    responseType: lum$network_millions_query_pb.QueryDrawsResponse,
    requestSerialize: serialize_lum_network_millions_QueryDrawsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryDrawsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDrawsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDrawsResponse,
  },
  poolDraws: {
    path: '/lum.network.millions.Query/PoolDraws',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDrawsRequest,
    responseType: lum$network_millions_query_pb.QueryDrawsResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDrawsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDrawsRequest,
    responseSerialize: serialize_lum_network_millions_QueryDrawsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDrawsResponse,
  },
  poolDraw: {
    path: '/lum.network.millions.Query/PoolDraw',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDrawRequest,
    responseType: lum$network_millions_query_pb.QueryDrawResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDrawRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDrawRequest,
    responseSerialize: serialize_lum_network_millions_QueryDrawResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryDrawResponse,
  },
  prizes: {
    path: '/lum.network.millions.Query/Prizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  poolPrizes: {
    path: '/lum.network.millions.Query/PoolPrizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  poolDrawPrizes: {
    path: '/lum.network.millions.Query/PoolDrawPrizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDrawPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDrawPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDrawPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  poolDrawPrize: {
    path: '/lum.network.millions.Query/PoolDrawPrize',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolDrawPrizeRequest,
    responseType: lum$network_millions_query_pb.QueryPrizeResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolDrawPrizeRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolDrawPrizeRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizeResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizeResponse,
  },
  accountPrizes: {
    path: '/lum.network.millions.Query/AccountPrizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  accountPoolPrizes: {
    path: '/lum.network.millions.Query/AccountPoolPrizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountPoolPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountPoolPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountPoolPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  accountPoolDrawPrizes: {
    path: '/lum.network.millions.Query/AccountPoolDrawPrizes',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountPoolDrawPrizesRequest,
    responseType: lum$network_millions_query_pb.QueryPrizesResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountPoolDrawPrizesRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountPoolDrawPrizesRequest,
    responseSerialize: serialize_lum_network_millions_QueryPrizesResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryPrizesResponse,
  },
  withdrawals: {
    path: '/lum.network.millions.Query/Withdrawals',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryWithdrawalsRequest,
    responseType: lum$network_millions_query_pb.QueryWithdrawalsResponse,
    requestSerialize: serialize_lum_network_millions_QueryWithdrawalsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryWithdrawalsRequest,
    responseSerialize: serialize_lum_network_millions_QueryWithdrawalsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryWithdrawalsResponse,
  },
  poolWithdrawals: {
    path: '/lum.network.millions.Query/PoolWithdrawals',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolWithdrawalsRequest,
    responseType: lum$network_millions_query_pb.QueryWithdrawalsResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolWithdrawalsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolWithdrawalsRequest,
    responseSerialize: serialize_lum_network_millions_QueryWithdrawalsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryWithdrawalsResponse,
  },
  poolWithdrawal: {
    path: '/lum.network.millions.Query/PoolWithdrawal',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryPoolWithdrawalRequest,
    responseType: lum$network_millions_query_pb.QueryWithdrawalResponse,
    requestSerialize: serialize_lum_network_millions_QueryPoolWithdrawalRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryPoolWithdrawalRequest,
    responseSerialize: serialize_lum_network_millions_QueryWithdrawalResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryWithdrawalResponse,
  },
  accountWithdrawals: {
    path: '/lum.network.millions.Query/AccountWithdrawals',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountWithdrawalsRequest,
    responseType: lum$network_millions_query_pb.QueryWithdrawalsResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountWithdrawalsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountWithdrawalsRequest,
    responseSerialize: serialize_lum_network_millions_QueryWithdrawalsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryWithdrawalsResponse,
  },
  accountPoolWithdrawals: {
    path: '/lum.network.millions.Query/AccountPoolWithdrawals',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_query_pb.QueryAccountPoolWithdrawalsRequest,
    responseType: lum$network_millions_query_pb.QueryWithdrawalsResponse,
    requestSerialize: serialize_lum_network_millions_QueryAccountPoolWithdrawalsRequest,
    requestDeserialize: deserialize_lum_network_millions_QueryAccountPoolWithdrawalsRequest,
    responseSerialize: serialize_lum_network_millions_QueryWithdrawalsResponse,
    responseDeserialize: deserialize_lum_network_millions_QueryWithdrawalsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
