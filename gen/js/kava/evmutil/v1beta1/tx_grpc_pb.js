// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_evmutil_v1beta1_tx_pb = require('../../../kava/evmutil/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertCoinToERC20');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20Response(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20Response)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertCoinToERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20Response(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertCosmosCoinToERC20');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20Response(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20Response)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertCosmosCoinToERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20Response(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoin(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoin)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertERC20ToCoin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoin(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoinResponse(arg) {
  if (!(arg instanceof kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoinResponse)) {
    throw new Error('Expected argument of type kava.evmutil.v1beta1.MsgConvertERC20ToCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoinResponse(buffer_arg) {
  return kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the evmutil Msg service.
var MsgService = exports.MsgService = {
  // ConvertCoinToERC20 defines a method for converting sdk.Coin to Kava ERC20.
convertCoinToERC20: {
    path: '/kava.evmutil.v1beta1.Msg/ConvertCoinToERC20',
    requestStream: false,
    responseStream: false,
    requestType: kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20,
    responseType: kava_evmutil_v1beta1_tx_pb.MsgConvertCoinToERC20Response,
    requestSerialize: serialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20,
    requestDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20,
    responseSerialize: serialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20Response,
    responseDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertCoinToERC20Response,
  },
  // ConvertERC20ToCoin defines a method for converting Kava ERC20 to sdk.Coin.
convertERC20ToCoin: {
    path: '/kava.evmutil.v1beta1.Msg/ConvertERC20ToCoin',
    requestStream: false,
    responseStream: false,
    requestType: kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoin,
    responseType: kava_evmutil_v1beta1_tx_pb.MsgConvertERC20ToCoinResponse,
    requestSerialize: serialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoin,
    requestDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoin,
    responseSerialize: serialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoinResponse,
    responseDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertERC20ToCoinResponse,
  },
  // ConvertCosmosCoinToERC20 defines a method for converting a cosmos sdk.Coin to an ERC20.
convertCosmosCoinToERC20: {
    path: '/kava.evmutil.v1beta1.Msg/ConvertCosmosCoinToERC20',
    requestStream: false,
    responseStream: false,
    requestType: kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20,
    responseType: kava_evmutil_v1beta1_tx_pb.MsgConvertCosmosCoinToERC20Response,
    requestSerialize: serialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20,
    requestDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20,
    responseSerialize: serialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20Response,
    responseDeserialize: deserialize_kava_evmutil_v1beta1_MsgConvertCosmosCoinToERC20Response,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
