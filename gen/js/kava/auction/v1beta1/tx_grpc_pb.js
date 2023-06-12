// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_auction_v1beta1_tx_pb = require('../../../kava/auction/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_auction_v1beta1_MsgPlaceBid(arg) {
  if (!(arg instanceof kava_auction_v1beta1_tx_pb.MsgPlaceBid)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.MsgPlaceBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_MsgPlaceBid(buffer_arg) {
  return kava_auction_v1beta1_tx_pb.MsgPlaceBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_MsgPlaceBidResponse(arg) {
  if (!(arg instanceof kava_auction_v1beta1_tx_pb.MsgPlaceBidResponse)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.MsgPlaceBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_MsgPlaceBidResponse(buffer_arg) {
  return kava_auction_v1beta1_tx_pb.MsgPlaceBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the auction Msg service.
var MsgService = exports.MsgService = {
  // PlaceBid message type used by bidders to place bids on auctions
placeBid: {
    path: '/kava.auction.v1beta1.Msg/PlaceBid',
    requestStream: false,
    responseStream: false,
    requestType: kava_auction_v1beta1_tx_pb.MsgPlaceBid,
    responseType: kava_auction_v1beta1_tx_pb.MsgPlaceBidResponse,
    requestSerialize: serialize_kava_auction_v1beta1_MsgPlaceBid,
    requestDeserialize: deserialize_kava_auction_v1beta1_MsgPlaceBid,
    responseSerialize: serialize_kava_auction_v1beta1_MsgPlaceBidResponse,
    responseDeserialize: deserialize_kava_auction_v1beta1_MsgPlaceBidResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
