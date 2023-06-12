// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_liquidity_v1beta1_query_pb = require('../../../crescent/liquidity/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var crescent_liquidity_v1beta1_liquidity_pb = require('../../../crescent/liquidity/v1beta1/liquidity_pb.js');

function serialize_crescent_liquidity_v1beta1_QueryDepositRequestRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryDepositRequestRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryDepositRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryDepositRequestRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryDepositRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryDepositRequestResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryDepositRequestResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryDepositRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryDepositRequestResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryDepositRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryDepositRequestsRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryDepositRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryDepositRequestsRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryDepositRequestsResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryDepositRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryDepositRequestsResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryNumMMOrdersRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryNumMMOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryNumMMOrdersRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryNumMMOrdersResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryNumMMOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryNumMMOrdersResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrderBooksRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrderBooksRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrderBooksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrderBooksRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrderBooksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrderBooksResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrderBooksResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrderBooksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrderBooksResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrderBooksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrderRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrderRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrderRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrderResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrderResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrderResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrdersByOrdererRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrdersByOrdererRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrdersByOrdererRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrdersRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrdersRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrdersRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryOrdersResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryOrdersResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryOrdersResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPairRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPairRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPairRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPairResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPairResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPairResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPairsRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPairsRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPairsRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPairsResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPairsResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPairsResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolByPoolCoinDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolByReserveAddressRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolByReserveAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolByReserveAddressRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolsRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryPoolsResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryWithdrawRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryWithdrawRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsRequest(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryWithdrawRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsRequest(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.QueryWithdrawRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns parameters of the module.
params: {
    path: '/crescent.liquidity.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryParamsResponse,
  },
  // Pools returns all liquidity pools.
pools: {
    path: '/crescent.liquidity.v1beta1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPoolsRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolsResponse,
  },
  // Pool returns the specific liquidity pool.
pool: {
    path: '/crescent.liquidity.v1beta1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPoolRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolResponse,
  },
  // PoolByReserveAddress returns all pools that correspond to the reserve account.
poolByReserveAddress: {
    path: '/crescent.liquidity.v1beta1.Query/PoolByReserveAddress',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPoolByReserveAddressRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolByReserveAddressRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolByReserveAddressRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolResponse,
  },
  // PoolByPoolCoinDenom returns all pools that correspond to the pool coin denom.
poolByPoolCoinDenom: {
    path: '/crescent.liquidity.v1beta1.Query/PoolByPoolCoinDenom',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPoolByPoolCoinDenomRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolByPoolCoinDenomRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPoolResponse,
  },
  // Pairs returns all liquidity pairs.
pairs: {
    path: '/crescent.liquidity.v1beta1.Query/Pairs',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPairsRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPairsResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPairsRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPairsRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPairsResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPairsResponse,
  },
  // Pair returns the specific pair.
pair: {
    path: '/crescent.liquidity.v1beta1.Query/Pair',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryPairRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryPairResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryPairRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPairRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryPairResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryPairResponse,
  },
  // DepositRequests returns all deposit requests.
depositRequests: {
    path: '/crescent.liquidity.v1beta1.Query/DepositRequests',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryDepositRequestsResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryDepositRequestsRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryDepositRequestsRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryDepositRequestsResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryDepositRequestsResponse,
  },
  // DepositRequest returns the specific deposit request.
depositRequest: {
    path: '/crescent.liquidity.v1beta1.Query/DepositRequest',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryDepositRequestRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryDepositRequestResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryDepositRequestRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryDepositRequestRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryDepositRequestResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryDepositRequestResponse,
  },
  // WithdrawRequests returns all withdraw requests.
withdrawRequests: {
    path: '/crescent.liquidity.v1beta1.Query/WithdrawRequests',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestsResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestsResponse,
  },
  // WithdrawRequest returns the specific withdraw request.
withdrawRequest: {
    path: '/crescent.liquidity.v1beta1.Query/WithdrawRequest',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryWithdrawRequestResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryWithdrawRequestResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryWithdrawRequestResponse,
  },
  // Orders returns all orders within the pair.
orders: {
    path: '/crescent.liquidity.v1beta1.Query/Orders',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryOrdersRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryOrdersRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrdersRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryOrdersResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrdersResponse,
  },
  // Order returns the specific order.
order: {
    path: '/crescent.liquidity.v1beta1.Query/Order',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryOrderRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryOrderResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryOrderRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrderRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryOrderResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrderResponse,
  },
  // OrdersByOrderer returns orders made by an orderer.
ordersByOrderer: {
    path: '/crescent.liquidity.v1beta1.Query/OrdersByOrderer',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryOrdersByOrdererRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryOrdersByOrdererRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrdersByOrdererRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryOrdersResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrdersResponse,
  },
  orderBooks: {
    path: '/crescent.liquidity.v1beta1.Query/OrderBooks',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryOrderBooksRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryOrderBooksResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryOrderBooksRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrderBooksRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryOrderBooksResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryOrderBooksResponse,
  },
  numMMOrders: {
    path: '/crescent.liquidity.v1beta1.Query/NumMMOrders',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersRequest,
    responseType: crescent_liquidity_v1beta1_query_pb.QueryNumMMOrdersResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_QueryNumMMOrdersRequest,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_QueryNumMMOrdersRequest,
    responseSerialize: serialize_crescent_liquidity_v1beta1_QueryNumMMOrdersResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_QueryNumMMOrdersResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
