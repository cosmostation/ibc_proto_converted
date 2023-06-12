// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_market_v1_tx_pb = require('../../../em/market/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var em_market_v1_market_pb = require('../../../em/market/v1/market_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_em_market_v1_MsgAddLimitOrder(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgAddLimitOrder)) {
    throw new Error('Expected argument of type em.market.v1.MsgAddLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgAddLimitOrder(buffer_arg) {
  return em_market_v1_tx_pb.MsgAddLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgAddLimitOrderResponse(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgAddLimitOrderResponse)) {
    throw new Error('Expected argument of type em.market.v1.MsgAddLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgAddLimitOrderResponse(buffer_arg) {
  return em_market_v1_tx_pb.MsgAddLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgAddMarketOrder(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgAddMarketOrder)) {
    throw new Error('Expected argument of type em.market.v1.MsgAddMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgAddMarketOrder(buffer_arg) {
  return em_market_v1_tx_pb.MsgAddMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgAddMarketOrderResponse(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgAddMarketOrderResponse)) {
    throw new Error('Expected argument of type em.market.v1.MsgAddMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgAddMarketOrderResponse(buffer_arg) {
  return em_market_v1_tx_pb.MsgAddMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelOrder(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelOrder)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelOrder(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelOrderResponse(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelOrderResponse)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelOrderResponse(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelReplaceLimitOrder(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelReplaceLimitOrder)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelReplaceLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelReplaceLimitOrder(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelReplaceLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelReplaceLimitOrderResponse(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelReplaceLimitOrderResponse)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelReplaceLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelReplaceLimitOrderResponse(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelReplaceLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelReplaceMarketOrder(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelReplaceMarketOrder)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelReplaceMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelReplaceMarketOrder(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelReplaceMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_MsgCancelReplaceMarketOrderResponse(arg) {
  if (!(arg instanceof em_market_v1_tx_pb.MsgCancelReplaceMarketOrderResponse)) {
    throw new Error('Expected argument of type em.market.v1.MsgCancelReplaceMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_MsgCancelReplaceMarketOrderResponse(buffer_arg) {
  return em_market_v1_tx_pb.MsgCancelReplaceMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  addLimitOrder: {
    path: '/em.market.v1.Msg/AddLimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_tx_pb.MsgAddLimitOrder,
    responseType: em_market_v1_tx_pb.MsgAddLimitOrderResponse,
    requestSerialize: serialize_em_market_v1_MsgAddLimitOrder,
    requestDeserialize: deserialize_em_market_v1_MsgAddLimitOrder,
    responseSerialize: serialize_em_market_v1_MsgAddLimitOrderResponse,
    responseDeserialize: deserialize_em_market_v1_MsgAddLimitOrderResponse,
  },
  addMarketOrder: {
    path: '/em.market.v1.Msg/AddMarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_tx_pb.MsgAddMarketOrder,
    responseType: em_market_v1_tx_pb.MsgAddMarketOrderResponse,
    requestSerialize: serialize_em_market_v1_MsgAddMarketOrder,
    requestDeserialize: deserialize_em_market_v1_MsgAddMarketOrder,
    responseSerialize: serialize_em_market_v1_MsgAddMarketOrderResponse,
    responseDeserialize: deserialize_em_market_v1_MsgAddMarketOrderResponse,
  },
  cancelOrder: {
    path: '/em.market.v1.Msg/CancelOrder',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_tx_pb.MsgCancelOrder,
    responseType: em_market_v1_tx_pb.MsgCancelOrderResponse,
    requestSerialize: serialize_em_market_v1_MsgCancelOrder,
    requestDeserialize: deserialize_em_market_v1_MsgCancelOrder,
    responseSerialize: serialize_em_market_v1_MsgCancelOrderResponse,
    responseDeserialize: deserialize_em_market_v1_MsgCancelOrderResponse,
  },
  cancelReplaceLimitOrder: {
    path: '/em.market.v1.Msg/CancelReplaceLimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_tx_pb.MsgCancelReplaceLimitOrder,
    responseType: em_market_v1_tx_pb.MsgCancelReplaceLimitOrderResponse,
    requestSerialize: serialize_em_market_v1_MsgCancelReplaceLimitOrder,
    requestDeserialize: deserialize_em_market_v1_MsgCancelReplaceLimitOrder,
    responseSerialize: serialize_em_market_v1_MsgCancelReplaceLimitOrderResponse,
    responseDeserialize: deserialize_em_market_v1_MsgCancelReplaceLimitOrderResponse,
  },
  cancelReplaceMarketOrder: {
    path: '/em.market.v1.Msg/CancelReplaceMarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_tx_pb.MsgCancelReplaceMarketOrder,
    responseType: em_market_v1_tx_pb.MsgCancelReplaceMarketOrderResponse,
    requestSerialize: serialize_em_market_v1_MsgCancelReplaceMarketOrder,
    requestDeserialize: deserialize_em_market_v1_MsgCancelReplaceMarketOrder,
    responseSerialize: serialize_em_market_v1_MsgCancelReplaceMarketOrderResponse,
    responseDeserialize: deserialize_em_market_v1_MsgCancelReplaceMarketOrderResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
