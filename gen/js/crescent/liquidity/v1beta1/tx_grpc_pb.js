// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_liquidity_v1beta1_tx_pb = require('../../../crescent/liquidity/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var crescent_liquidity_v1beta1_liquidity_pb = require('../../../crescent/liquidity/v1beta1/liquidity_pb.js');

function serialize_crescent_liquidity_v1beta1_MsgCancelAllOrders(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrders)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCancelAllOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCancelAllOrders(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCancelAllOrdersResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCancelAllOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCancelAllOrdersResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCancelOrder(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCancelOrder)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCancelOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCancelOrder(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCancelOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCancelOrderResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCancelOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCancelOrderResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreatePair(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreatePair)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreatePair');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreatePair(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreatePair.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreatePairResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreatePairResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreatePairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreatePairResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreatePairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreatePool(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreatePool(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreatePoolResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreateRangedPool(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPool)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreateRangedPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreateRangedPool(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgCreateRangedPoolResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgCreateRangedPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgCreateRangedPoolResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgDeposit(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgDepositResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgLimitOrder(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgLimitOrder)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgLimitOrder(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgLimitOrderResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgLimitOrderResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgMMOrder(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgMMOrder)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgMMOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgMMOrder(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgMMOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgMMOrderResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgMMOrderResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgMMOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgMMOrderResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgMMOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgMarketOrder(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgMarketOrder)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgMarketOrder(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgMarketOrderResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgMarketOrderResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgWithdraw(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidity_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof crescent_liquidity_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type crescent.liquidity.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidity_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return crescent_liquidity_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreatePair defines a method for creating a pair
createPair: {
    path: '/crescent.liquidity.v1beta1.Msg/CreatePair',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgCreatePair,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgCreatePairResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgCreatePair,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreatePair,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgCreatePairResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreatePairResponse,
  },
  // CreatePool defines a method for creating a pool
createPool: {
    path: '/crescent.liquidity.v1beta1.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgCreatePool,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgCreatePool,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreatePool,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgCreatePoolResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreatePoolResponse,
  },
  // CreateRangePool defines a method for creating a ranged pool
createRangedPool: {
    path: '/crescent.liquidity.v1beta1.Msg/CreateRangedPool',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPool,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgCreateRangedPoolResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgCreateRangedPool,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreateRangedPool,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgCreateRangedPoolResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCreateRangedPoolResponse,
  },
  // Deposit defines a method for depositing coins to the pool
deposit: {
    path: '/crescent.liquidity.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgDeposit,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgDeposit,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing pool coin from the pool
withdraw: {
    path: '/crescent.liquidity.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgWithdraw,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgWithdraw,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgWithdrawResponse,
  },
  // LimitOrder defines a method for making a limit order
limitOrder: {
    path: '/crescent.liquidity.v1beta1.Msg/LimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgLimitOrder,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgLimitOrderResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgLimitOrder,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgLimitOrder,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgLimitOrderResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgLimitOrderResponse,
  },
  // MarketOrder defines a method for making a market order
marketOrder: {
    path: '/crescent.liquidity.v1beta1.Msg/MarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgMarketOrder,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgMarketOrderResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgMarketOrder,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgMarketOrder,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgMarketOrderResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgMarketOrderResponse,
  },
  // MsgMMOrder defines a method for making a MM(market making) order
mMOrder: {
    path: '/crescent.liquidity.v1beta1.Msg/MMOrder',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgMMOrder,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgMMOrderResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgMMOrder,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgMMOrder,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgMMOrderResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgMMOrderResponse,
  },
  // CancelOrder defines a method for cancelling an order
cancelOrder: {
    path: '/crescent.liquidity.v1beta1.Msg/CancelOrder',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgCancelOrder,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgCancelOrderResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgCancelOrder,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCancelOrder,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgCancelOrderResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCancelOrderResponse,
  },
  // CancelAllOrders defines a method for cancelling all orders
cancelAllOrders: {
    path: '/crescent.liquidity.v1beta1.Msg/CancelAllOrders',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrders,
    responseType: crescent_liquidity_v1beta1_tx_pb.MsgCancelAllOrdersResponse,
    requestSerialize: serialize_crescent_liquidity_v1beta1_MsgCancelAllOrders,
    requestDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCancelAllOrders,
    responseSerialize: serialize_crescent_liquidity_v1beta1_MsgCancelAllOrdersResponse,
    responseDeserialize: deserialize_crescent_liquidity_v1beta1_MsgCancelAllOrdersResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
