// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_erc20_v1_tx_pb = require('../../../canto/erc20/v1/tx_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_canto_erc20_v1_MsgConvertCoin(arg) {
  if (!(arg instanceof canto_erc20_v1_tx_pb.MsgConvertCoin)) {
    throw new Error('Expected argument of type canto.erc20.v1.MsgConvertCoin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_MsgConvertCoin(buffer_arg) {
  return canto_erc20_v1_tx_pb.MsgConvertCoin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_MsgConvertCoinResponse(arg) {
  if (!(arg instanceof canto_erc20_v1_tx_pb.MsgConvertCoinResponse)) {
    throw new Error('Expected argument of type canto.erc20.v1.MsgConvertCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_MsgConvertCoinResponse(buffer_arg) {
  return canto_erc20_v1_tx_pb.MsgConvertCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_MsgConvertERC20(arg) {
  if (!(arg instanceof canto_erc20_v1_tx_pb.MsgConvertERC20)) {
    throw new Error('Expected argument of type canto.erc20.v1.MsgConvertERC20');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_MsgConvertERC20(buffer_arg) {
  return canto_erc20_v1_tx_pb.MsgConvertERC20.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_erc20_v1_MsgConvertERC20Response(arg) {
  if (!(arg instanceof canto_erc20_v1_tx_pb.MsgConvertERC20Response)) {
    throw new Error('Expected argument of type canto.erc20.v1.MsgConvertERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_erc20_v1_MsgConvertERC20Response(buffer_arg) {
  return canto_erc20_v1_tx_pb.MsgConvertERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the erc20 Msg service.
var MsgService = exports.MsgService = {
  // ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
// that is registered on the token mapping.
convertCoin: {
    path: '/canto.erc20.v1.Msg/ConvertCoin',
    requestStream: false,
    responseStream: false,
    requestType: canto_erc20_v1_tx_pb.MsgConvertCoin,
    responseType: canto_erc20_v1_tx_pb.MsgConvertCoinResponse,
    requestSerialize: serialize_canto_erc20_v1_MsgConvertCoin,
    requestDeserialize: deserialize_canto_erc20_v1_MsgConvertCoin,
    responseSerialize: serialize_canto_erc20_v1_MsgConvertCoinResponse,
    responseDeserialize: deserialize_canto_erc20_v1_MsgConvertCoinResponse,
  },
  // ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
// contract that is registered on the token mapping.
convertERC20: {
    path: '/canto.erc20.v1.Msg/ConvertERC20',
    requestStream: false,
    responseStream: false,
    requestType: canto_erc20_v1_tx_pb.MsgConvertERC20,
    responseType: canto_erc20_v1_tx_pb.MsgConvertERC20Response,
    requestSerialize: serialize_canto_erc20_v1_MsgConvertERC20,
    requestDeserialize: deserialize_canto_erc20_v1_MsgConvertERC20,
    responseSerialize: serialize_canto_erc20_v1_MsgConvertERC20Response,
    responseDeserialize: deserialize_canto_erc20_v1_MsgConvertERC20Response,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
