// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_liquidity_v1beta1_tx_pb = require('../../../comdex/liquidity/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var comdex_liquidity_v1beta1_liquidity_pb = require('../../../comdex/liquidity/v1beta1/liquidity_pb.js');

function serialize_comdex_liquidity_v1beta1_MsgCancelAllOrders(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrders)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelAllOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelAllOrders(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCancelAllOrdersResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelAllOrdersResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCancelMMOrder(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrder)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelMMOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelMMOrder(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCancelMMOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelMMOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelMMOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCancelOrder(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelOrder)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelOrder(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCancelOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCancelOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCancelOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreatePair(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreatePair)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreatePair');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreatePair(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreatePair.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreatePairResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreatePairResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreatePairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreatePairResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreatePairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreatePool(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreatePool(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreatePoolResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreateRangedPool(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPool)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreateRangedPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreateRangedPool(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgCreateRangedPoolResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgCreateRangedPoolResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgDeposit(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgDepositAndFarm(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarm)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgDepositAndFarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgDepositAndFarm(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgDepositAndFarmResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarmResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgDepositAndFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgDepositAndFarmResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgDepositResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgFarm(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgFarm)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgFarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgFarm(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgFarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgFarmResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgFarmResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgFarmResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgLimitOrder(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgLimitOrder)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgLimitOrder(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgLimitOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgLimitOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgMMOrder(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgMMOrder)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgMMOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgMMOrder(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgMMOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgMMOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgMMOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgMMOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgMMOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgMMOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgMarketOrder(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgMarketOrder)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgMarketOrder(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgMarketOrderResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgMarketOrderResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgUnfarm(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgUnfarm)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgUnfarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgUnfarm(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgUnfarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdraw(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdraw)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdraw(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdrawResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdrawResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdrawResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgUnfarmResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgUnfarmResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgUnfarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgUnfarmResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgUnfarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgWithdraw(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidity_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof comdex_liquidity_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type comdex.liquidity.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidity_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return comdex_liquidity_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreatePair defines a method for creating a pair
createPair: {
    path: '/comdex.liquidity.v1beta1.Msg/CreatePair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCreatePair,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCreatePairResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCreatePair,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreatePair,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCreatePairResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreatePairResponse,
  },
  // CreatePool defines a method for creating a pool
createPool: {
    path: '/comdex.liquidity.v1beta1.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCreatePool,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCreatePool,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreatePool,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCreatePoolResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreatePoolResponse,
  },
  // CreateRangePool defines a method for creating a ranged pool
createRangedPool: {
    path: '/comdex.liquidity.v1beta1.Msg/CreateRangedPool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPool,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCreateRangedPool,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreateRangedPool,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCreateRangedPoolResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCreateRangedPoolResponse,
  },
  // Deposit defines a method for depositing coins to the pool
deposit: {
    path: '/comdex.liquidity.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgDeposit,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgDeposit,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing pool coin from the pool
withdraw: {
    path: '/comdex.liquidity.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgWithdraw,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgWithdraw,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgWithdrawResponse,
  },
  // LimitOrder defines a method for making a limit order
limitOrder: {
    path: '/comdex.liquidity.v1beta1.Msg/LimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgLimitOrder,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgLimitOrder,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgLimitOrder,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgLimitOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgLimitOrderResponse,
  },
  // MarketOrder defines a method for making a market order
marketOrder: {
    path: '/comdex.liquidity.v1beta1.Msg/MarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgMarketOrder,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgMarketOrder,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgMarketOrder,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgMarketOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgMarketOrderResponse,
  },
  // MsgMMOrder defines a method for making a MM(market making) order
mMOrder: {
    path: '/comdex.liquidity.v1beta1.Msg/MMOrder',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgMMOrder,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgMMOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgMMOrder,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgMMOrder,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgMMOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgMMOrderResponse,
  },
  // CancelOrder defines a method for cancelling an order
cancelOrder: {
    path: '/comdex.liquidity.v1beta1.Msg/CancelOrder',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCancelOrder,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelOrder,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelOrder,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelOrderResponse,
  },
  // CancelAllOrders defines a method for cancelling all orders
cancelAllOrders: {
    path: '/comdex.liquidity.v1beta1.Msg/CancelAllOrders',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrders,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelAllOrders,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelAllOrders,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelAllOrdersResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelAllOrdersResponse,
  },
  // CancelMMOrder defines a method for cancelling previously placed market making orders
cancelMMOrder: {
    path: '/comdex.liquidity.v1beta1.Msg/CancelMMOrder',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrder,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgCancelMMOrderResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelMMOrder,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelMMOrder,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgCancelMMOrderResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgCancelMMOrderResponse,
  },
  // MsgFarm defines a method to farm the pool token, for incentivization
farm: {
    path: '/comdex.liquidity.v1beta1.Msg/Farm',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgFarm,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgFarmResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgFarm,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgFarm,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgFarmResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgFarmResponse,
  },
  // Unfarm defines a method to unfarm the farmed pool token
unfarm: {
    path: '/comdex.liquidity.v1beta1.Msg/Unfarm',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgUnfarm,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgUnfarmResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgUnfarm,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgUnfarm,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgUnfarmResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgUnfarmResponse,
  },
  // DepositAndFarm defines an SDK message for depositing coins to the pool and farming the pool coin
depositAndFarm: {
    path: '/comdex.liquidity.v1beta1.Msg/DepositAndFarm',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarm,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgDepositAndFarmResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgDepositAndFarm,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgDepositAndFarm,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgDepositAndFarmResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgDepositAndFarmResponse,
  },
  // UnfarmAndWithdraw defines a SDK message for performing unfarm of the farmed coins and withdrawing liquidity from pool
unfarmAndWithdraw: {
    path: '/comdex.liquidity.v1beta1.Msg/UnfarmAndWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdraw,
    responseType: comdex_liquidity_v1beta1_tx_pb.MsgUnfarmAndWithdrawResponse,
    requestSerialize: serialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdraw,
    requestDeserialize: deserialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdraw,
    responseSerialize: serialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdrawResponse,
    responseDeserialize: deserialize_comdex_liquidity_v1beta1_MsgUnfarmAndWithdrawResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
