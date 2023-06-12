// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_nft_v1beta1_tx_pb = require('../../../cosmos/nft/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');

function serialize_cosmos_nft_v1beta1_MsgSend(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_tx_pb.MsgSend)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.MsgSend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_MsgSend(buffer_arg) {
  return cosmos_nft_v1beta1_tx_pb.MsgSend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_MsgSendResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_tx_pb.MsgSendResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.MsgSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_MsgSendResponse(buffer_arg) {
  return cosmos_nft_v1beta1_tx_pb.MsgSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the nft Msg service.
var MsgService = exports.MsgService = {
  // Send defines a method to send a nft from one account to another account.
send: {
    path: '/cosmos.nft.v1beta1.Msg/Send',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_tx_pb.MsgSend,
    responseType: cosmos_nft_v1beta1_tx_pb.MsgSendResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_MsgSend,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_MsgSend,
    responseSerialize: serialize_cosmos_nft_v1beta1_MsgSendResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_MsgSendResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
