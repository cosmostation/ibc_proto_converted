// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var teritori_mint_v1beta1_tx_pb = require('../../../teritori/mint/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');

function serialize_teritori_mint_v1beta1_MsgBurnTokens(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_tx_pb.MsgBurnTokens)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.MsgBurnTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_MsgBurnTokens(buffer_arg) {
  return teritori_mint_v1beta1_tx_pb.MsgBurnTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_mint_v1beta1_MsgBurnTokensResponse(arg) {
  if (!(arg instanceof teritori_mint_v1beta1_tx_pb.MsgBurnTokensResponse)) {
    throw new Error('Expected argument of type teritori.mint.v1beta1.MsgBurnTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_mint_v1beta1_MsgBurnTokensResponse(buffer_arg) {
  return teritori_mint_v1beta1_tx_pb.MsgBurnTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the mint Msg service.
var MsgService = exports.MsgService = {
  // BurnTokens defines a method to burn tokens
burnTokens: {
    path: '/teritori.mint.v1beta1.Msg/BurnTokens',
    requestStream: false,
    responseStream: false,
    requestType: teritori_mint_v1beta1_tx_pb.MsgBurnTokens,
    responseType: teritori_mint_v1beta1_tx_pb.MsgBurnTokensResponse,
    requestSerialize: serialize_teritori_mint_v1beta1_MsgBurnTokens,
    requestDeserialize: deserialize_teritori_mint_v1beta1_MsgBurnTokens,
    responseSerialize: serialize_teritori_mint_v1beta1_MsgBurnTokensResponse,
    responseDeserialize: deserialize_teritori_mint_v1beta1_MsgBurnTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
