// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var rizon_treasury_tx_pb = require('../../rizon/treasury/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_rizonworld_rizon_treasury_MsgBurnRequest(arg) {
  if (!(arg instanceof rizon_treasury_tx_pb.MsgBurnRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.MsgBurnRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_MsgBurnRequest(buffer_arg) {
  return rizon_treasury_tx_pb.MsgBurnRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_MsgBurnResponse(arg) {
  if (!(arg instanceof rizon_treasury_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_MsgBurnResponse(buffer_arg) {
  return rizon_treasury_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_MsgMintRequest(arg) {
  if (!(arg instanceof rizon_treasury_tx_pb.MsgMintRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.MsgMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_MsgMintRequest(buffer_arg) {
  return rizon_treasury_tx_pb.MsgMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_MsgMintResponse(arg) {
  if (!(arg instanceof rizon_treasury_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_MsgMintResponse(buffer_arg) {
  return rizon_treasury_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the treasury Msg service.
var MsgService = exports.MsgService = {
  // Mint defines a method for minting coins
mint: {
    path: '/rizonworld.rizon.treasury.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_tx_pb.MsgMintRequest,
    responseType: rizon_treasury_tx_pb.MsgMintResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_MsgMintRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_MsgMintRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_MsgMintResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_MsgMintResponse,
  },
  // Burn defines a method for burning coins
burn: {
    path: '/rizonworld.rizon.treasury.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_tx_pb.MsgBurnRequest,
    responseType: rizon_treasury_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_MsgBurnRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_MsgBurnRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_MsgBurnResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_MsgBurnResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
