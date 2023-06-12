// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_auction_v1_tx_pb = require('../../../sommelier/auction/v1/tx_pb.js');
var sommelier_auction_v1_auction_pb = require('../../../sommelier/auction/v1/auction_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_auction_v1_MsgSubmitBidRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_tx_pb.MsgSubmitBidRequest)) {
    throw new Error('Expected argument of type auction.v1.MsgSubmitBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_MsgSubmitBidRequest(buffer_arg) {
  return sommelier_auction_v1_tx_pb.MsgSubmitBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_MsgSubmitBidResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_tx_pb.MsgSubmitBidResponse)) {
    throw new Error('Expected argument of type auction.v1.MsgSubmitBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_MsgSubmitBidResponse(buffer_arg) {
  return sommelier_auction_v1_tx_pb.MsgSubmitBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  submitBid: {
    path: '/auction.v1.Msg/SubmitBid',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_tx_pb.MsgSubmitBidRequest,
    responseType: sommelier_auction_v1_tx_pb.MsgSubmitBidResponse,
    requestSerialize: serialize_auction_v1_MsgSubmitBidRequest,
    requestDeserialize: deserialize_auction_v1_MsgSubmitBidRequest,
    responseSerialize: serialize_auction_v1_MsgSubmitBidResponse,
    responseDeserialize: deserialize_auction_v1_MsgSubmitBidResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
