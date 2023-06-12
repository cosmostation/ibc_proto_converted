// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_leverage_v1_query_pb = require('../../../umee/leverage/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var umee_leverage_v1_genesis_pb = require('../../../umee/leverage/v1/genesis_pb.js');
var umee_leverage_v1_leverage_pb = require('../../../umee/leverage/v1/leverage_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_umee_leverage_v1_QueryAccountBalances(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryAccountBalances)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryAccountBalances');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryAccountBalances(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryAccountBalances.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryAccountBalancesResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryAccountBalancesResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryAccountBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryAccountBalancesResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryAccountBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryAccountSummary(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryAccountSummary)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryAccountSummary');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryAccountSummary(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryAccountSummary.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryAccountSummaryResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryAccountSummaryResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryAccountSummaryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryAccountSummaryResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryAccountSummaryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryBadDebts(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryBadDebts)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryBadDebts');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryBadDebts(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryBadDebts.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryBadDebtsResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryBadDebtsResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryBadDebtsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryBadDebtsResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryBadDebtsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryLiquidationTargets(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryLiquidationTargets)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryLiquidationTargets');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryLiquidationTargets(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryLiquidationTargets.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryLiquidationTargetsResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryLiquidationTargetsResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryLiquidationTargetsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryLiquidationTargetsResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryLiquidationTargetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMarketSummary(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMarketSummary)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMarketSummary');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMarketSummary(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMarketSummary.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMarketSummaryResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMarketSummaryResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMarketSummaryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMarketSummaryResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMarketSummaryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMaxBorrow(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMaxBorrow)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMaxBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMaxBorrow(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMaxBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMaxBorrowResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMaxBorrowResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMaxBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMaxBorrowResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMaxBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMaxWithdraw(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMaxWithdraw)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMaxWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMaxWithdraw(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMaxWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryMaxWithdrawResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryMaxWithdrawResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryMaxWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryMaxWithdrawResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryMaxWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryParams(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryParams)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryParams(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryParamsResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryRegisteredTokens(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryRegisteredTokens)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryRegisteredTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryRegisteredTokens(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryRegisteredTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_QueryRegisteredTokensResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_query_pb.QueryRegisteredTokensResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.QueryRegisteredTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_QueryRegisteredTokensResponse(buffer_arg) {
  return umee_leverage_v1_query_pb.QueryRegisteredTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of the x/leverage module.
params: {
    path: '/umee.leverage.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryParams,
    responseType: umee_leverage_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryParams,
    requestDeserialize: deserialize_umee_leverage_v1_QueryParams,
    responseSerialize: serialize_umee_leverage_v1_QueryParamsResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryParamsResponse,
  },
  // RegisteredTokens queries for all the registered tokens.
registeredTokens: {
    path: '/umee.leverage.v1.Query/RegisteredTokens',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryRegisteredTokens,
    responseType: umee_leverage_v1_query_pb.QueryRegisteredTokensResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryRegisteredTokens,
    requestDeserialize: deserialize_umee_leverage_v1_QueryRegisteredTokens,
    responseSerialize: serialize_umee_leverage_v1_QueryRegisteredTokensResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryRegisteredTokensResponse,
  },
  // MarketSummary queries a base asset's current borrowing and supplying conditions.
marketSummary: {
    path: '/umee.leverage.v1.Query/MarketSummary',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryMarketSummary,
    responseType: umee_leverage_v1_query_pb.QueryMarketSummaryResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryMarketSummary,
    requestDeserialize: deserialize_umee_leverage_v1_QueryMarketSummary,
    responseSerialize: serialize_umee_leverage_v1_QueryMarketSummaryResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryMarketSummaryResponse,
  },
  // AccountBalances queries an account's current supply, collateral, and borrow positions.
accountBalances: {
    path: '/umee.leverage.v1.Query/AccountBalances',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryAccountBalances,
    responseType: umee_leverage_v1_query_pb.QueryAccountBalancesResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryAccountBalances,
    requestDeserialize: deserialize_umee_leverage_v1_QueryAccountBalances,
    responseSerialize: serialize_umee_leverage_v1_QueryAccountBalancesResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryAccountBalancesResponse,
  },
  // AccountSummary queries USD values representing an account's total positions and borrowing limits. It requires oracle prices to return successfully.
accountSummary: {
    path: '/umee.leverage.v1.Query/AccountSummary',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryAccountSummary,
    responseType: umee_leverage_v1_query_pb.QueryAccountSummaryResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryAccountSummary,
    requestDeserialize: deserialize_umee_leverage_v1_QueryAccountSummary,
    responseSerialize: serialize_umee_leverage_v1_QueryAccountSummaryResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryAccountSummaryResponse,
  },
  // LiquidationTargets queries a list of all borrower account addresses eligible for liquidation.
liquidationTargets: {
    path: '/umee.leverage.v1.Query/LiquidationTargets',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryLiquidationTargets,
    responseType: umee_leverage_v1_query_pb.QueryLiquidationTargetsResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryLiquidationTargets,
    requestDeserialize: deserialize_umee_leverage_v1_QueryLiquidationTargets,
    responseSerialize: serialize_umee_leverage_v1_QueryLiquidationTargetsResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryLiquidationTargetsResponse,
  },
  // BadDebts queries a list of borrow positions that have been marked for bad debt repayment.
badDebts: {
    path: '/umee.leverage.v1.Query/BadDebts',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryBadDebts,
    responseType: umee_leverage_v1_query_pb.QueryBadDebtsResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryBadDebts,
    requestDeserialize: deserialize_umee_leverage_v1_QueryBadDebts,
    responseSerialize: serialize_umee_leverage_v1_QueryBadDebtsResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryBadDebtsResponse,
  },
  // MaxWithdraw queries the maximum amount of a given token an address can withdraw.
maxWithdraw: {
    path: '/umee.leverage.v1.Query/MaxWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryMaxWithdraw,
    responseType: umee_leverage_v1_query_pb.QueryMaxWithdrawResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryMaxWithdraw,
    requestDeserialize: deserialize_umee_leverage_v1_QueryMaxWithdraw,
    responseSerialize: serialize_umee_leverage_v1_QueryMaxWithdrawResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryMaxWithdrawResponse,
  },
  // MaxBorrow queries the maximum amount of a given token an address can borrow.
maxBorrow: {
    path: '/umee.leverage.v1.Query/MaxBorrow',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_query_pb.QueryMaxBorrow,
    responseType: umee_leverage_v1_query_pb.QueryMaxBorrowResponse,
    requestSerialize: serialize_umee_leverage_v1_QueryMaxBorrow,
    requestDeserialize: deserialize_umee_leverage_v1_QueryMaxBorrow,
    responseSerialize: serialize_umee_leverage_v1_QueryMaxBorrowResponse,
    responseDeserialize: deserialize_umee_leverage_v1_QueryMaxBorrowResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
