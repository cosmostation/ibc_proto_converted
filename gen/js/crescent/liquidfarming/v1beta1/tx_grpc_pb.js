// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_liquidfarming_v1beta1_tx_pb = require('../../../crescent/liquidfarming/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuction(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuction)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgAdvanceAuction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuction(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuctionResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuctionResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgAdvanceAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuctionResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidFarm(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarm)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidFarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidFarm(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidFarmResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarmResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidFarmResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarm(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarm)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidUnfarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarm(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdraw(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdraw)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidUnfarmAndWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdraw(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdrawResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdrawResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidUnfarmAndWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdrawResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgLiquidUnfarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgPlaceBid(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBid)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgPlaceBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgPlaceBid(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgPlaceBidResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBidResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgPlaceBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgPlaceBidResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgRefundBid(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBid)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgRefundBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgRefundBid(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_MsgRefundBidResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBidResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.MsgRefundBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_MsgRefundBidResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // LiquidFarm defines a method for farming pool coin for a liquid farm
liquidFarm: {
    path: '/crescent.liquidfarming.v1beta1.Msg/LiquidFarm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarm,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidFarmResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidFarm,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidFarm,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidFarmResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidFarmResponse,
  },
  // LiquidUnfarm defines a method for unfarming amount of LFCoin
liquidUnfarm: {
    path: '/crescent.liquidfarming.v1beta1.Msg/LiquidUnfarm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarm,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarm,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarm,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmResponse,
  },
  // LiquidUnfarmAndWithdraw defines a method for unfarming amount of LFCoin and withdraw pool coin from the pool
liquidUnfarmAndWithdraw: {
    path: '/crescent.liquidfarming.v1beta1.Msg/LiquidUnfarmAndWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdraw,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgLiquidUnfarmAndWithdrawResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdraw,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdraw,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdrawResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgLiquidUnfarmAndWithdrawResponse,
  },
  // PlaceBid defines a method for placing a bid for a rewards auction
placeBid: {
    path: '/crescent.liquidfarming.v1beta1.Msg/PlaceBid',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBid,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgPlaceBidResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgPlaceBid,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgPlaceBid,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgPlaceBidResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgPlaceBidResponse,
  },
  // RefundBid defines a method for refunding the bid that is not winning for the auction
refundBid: {
    path: '/crescent.liquidfarming.v1beta1.Msg/RefundBid',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBid,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgRefundBidResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgRefundBid,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgRefundBid,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgRefundBidResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgRefundBidResponse,
  },
  // AdvanceAuction defines a method for advancing rewards auction by one.
// This Msg is defined just for testing purpose and it shouldn't be used in production.
advanceAuction: {
    path: '/crescent.liquidfarming.v1beta1.Msg/AdvanceAuction',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuction,
    responseType: crescent_liquidfarming_v1beta1_tx_pb.MsgAdvanceAuctionResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuction,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuction,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuctionResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_MsgAdvanceAuctionResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
