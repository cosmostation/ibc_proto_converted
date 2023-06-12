// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_auction_v1beta1_tx_pb = require('../../../injective/auction/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var injective_auction_v1beta1_auction_pb = require('../../../injective/auction/v1beta1/auction_pb.js');

function serialize_injective_auction_v1beta1_MsgBid(arg) {
  if (!(arg instanceof injective_auction_v1beta1_tx_pb.MsgBid)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.MsgBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_MsgBid(buffer_arg) {
  return injective_auction_v1beta1_tx_pb.MsgBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_MsgBidResponse(arg) {
  if (!(arg instanceof injective_auction_v1beta1_tx_pb.MsgBidResponse)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.MsgBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_MsgBidResponse(buffer_arg) {
  return injective_auction_v1beta1_tx_pb.MsgBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_auction_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_auction_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_auction_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_auction_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the auction Msg service.
var MsgService = exports.MsgService = {
  // Bid defines a method for placing a bid for an auction
bid: {
    path: '/injective.auction.v1beta1.Msg/Bid',
    requestStream: false,
    responseStream: false,
    requestType: injective_auction_v1beta1_tx_pb.MsgBid,
    responseType: injective_auction_v1beta1_tx_pb.MsgBidResponse,
    requestSerialize: serialize_injective_auction_v1beta1_MsgBid,
    requestDeserialize: deserialize_injective_auction_v1beta1_MsgBid,
    responseSerialize: serialize_injective_auction_v1beta1_MsgBidResponse,
    responseDeserialize: deserialize_injective_auction_v1beta1_MsgBidResponse,
  },
  updateParams: {
    path: '/injective.auction.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_auction_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_auction_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_auction_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_auction_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_auction_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_auction_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
