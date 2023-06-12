// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var rizon_tokenswap_tx_pb = require('../../rizon/tokenswap/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapRequest(arg) {
  if (!(arg instanceof rizon_tokenswap_tx_pb.MsgCreateTokenswapRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapRequest(buffer_arg) {
  return rizon_tokenswap_tx_pb.MsgCreateTokenswapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapResponse(arg) {
  if (!(arg instanceof rizon_tokenswap_tx_pb.MsgCreateTokenswapResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.tokenswap.MsgCreateTokenswapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapResponse(buffer_arg) {
  return rizon_tokenswap_tx_pb.MsgCreateTokenswapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the tokenswap Msg service.
var MsgService = exports.MsgService = {
  // CreateTokenswap defines a method for creating a new tokenswap
createTokenswap: {
    path: '/rizonworld.rizon.tokenswap.Msg/CreateTokenswap',
    requestStream: false,
    responseStream: false,
    requestType: rizon_tokenswap_tx_pb.MsgCreateTokenswapRequest,
    responseType: rizon_tokenswap_tx_pb.MsgCreateTokenswapResponse,
    requestSerialize: serialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapRequest,
    requestDeserialize: deserialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapRequest,
    responseSerialize: serialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapResponse,
    responseDeserialize: deserialize_rizonworld_rizon_tokenswap_MsgCreateTokenswapResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
