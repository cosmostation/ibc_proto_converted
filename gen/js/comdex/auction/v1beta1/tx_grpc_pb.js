// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_auction_v1beta1_tx_pb = require('../../../comdex/auction/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_comdex_auction_v1beta1_MsgPlaceDebtBidRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDebtBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDebtBidRequest(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceDebtBidResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDebtBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDebtBidResponse(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceDutchBidRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDutchBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDutchBidRequest(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceDutchBidResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDutchBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDutchBidResponse(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidRequest(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidResponse(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceSurplusBidRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceSurplusBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceSurplusBidRequest(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_MsgPlaceSurplusBidResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.MsgPlaceSurplusBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_MsgPlaceSurplusBidResponse(buffer_arg) {
  return comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  msgPlaceSurplusBid: {
    path: '/comdex.auction.v1beta1.Msg/MsgPlaceSurplusBid',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidRequest,
    responseType: comdex_auction_v1beta1_tx_pb.MsgPlaceSurplusBidResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_MsgPlaceSurplusBidRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceSurplusBidRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_MsgPlaceSurplusBidResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceSurplusBidResponse,
  },
  msgPlaceDebtBid: {
    path: '/comdex.auction.v1beta1.Msg/MsgPlaceDebtBid',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidRequest,
    responseType: comdex_auction_v1beta1_tx_pb.MsgPlaceDebtBidResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDebtBidRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDebtBidRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDebtBidResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDebtBidResponse,
  },
  msgPlaceDutchBid: {
    path: '/comdex.auction.v1beta1.Msg/MsgPlaceDutchBid',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidRequest,
    responseType: comdex_auction_v1beta1_tx_pb.MsgPlaceDutchBidResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDutchBidRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDutchBidRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDutchBidResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDutchBidResponse,
  },
  msgPlaceDutchLendBid: {
    path: '/comdex.auction.v1beta1.Msg/MsgPlaceDutchLendBid',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidRequest,
    responseType: comdex_auction_v1beta1_tx_pb.MsgPlaceDutchLendBidResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_MsgPlaceDutchLendBidResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
