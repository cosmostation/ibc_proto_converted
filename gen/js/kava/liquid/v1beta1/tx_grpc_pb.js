// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_liquid_v1beta1_tx_pb = require('../../../kava/liquid/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_liquid_v1beta1_MsgBurnDerivative(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_tx_pb.MsgBurnDerivative)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.MsgBurnDerivative');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_MsgBurnDerivative(buffer_arg) {
  return kava_liquid_v1beta1_tx_pb.MsgBurnDerivative.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_MsgBurnDerivativeResponse(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_tx_pb.MsgBurnDerivativeResponse)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.MsgBurnDerivativeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_MsgBurnDerivativeResponse(buffer_arg) {
  return kava_liquid_v1beta1_tx_pb.MsgBurnDerivativeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_MsgMintDerivative(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_tx_pb.MsgMintDerivative)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.MsgMintDerivative');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_MsgMintDerivative(buffer_arg) {
  return kava_liquid_v1beta1_tx_pb.MsgMintDerivative.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_MsgMintDerivativeResponse(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_tx_pb.MsgMintDerivativeResponse)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.MsgMintDerivativeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_MsgMintDerivativeResponse(buffer_arg) {
  return kava_liquid_v1beta1_tx_pb.MsgMintDerivativeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the liquid Msg service.
var MsgService = exports.MsgService = {
  // MintDerivative defines a method for converting a delegation into staking deriviatives.
mintDerivative: {
    path: '/kava.liquid.v1beta1.Msg/MintDerivative',
    requestStream: false,
    responseStream: false,
    requestType: kava_liquid_v1beta1_tx_pb.MsgMintDerivative,
    responseType: kava_liquid_v1beta1_tx_pb.MsgMintDerivativeResponse,
    requestSerialize: serialize_kava_liquid_v1beta1_MsgMintDerivative,
    requestDeserialize: deserialize_kava_liquid_v1beta1_MsgMintDerivative,
    responseSerialize: serialize_kava_liquid_v1beta1_MsgMintDerivativeResponse,
    responseDeserialize: deserialize_kava_liquid_v1beta1_MsgMintDerivativeResponse,
  },
  // BurnDerivative defines a method for converting staking deriviatives into a delegation.
burnDerivative: {
    path: '/kava.liquid.v1beta1.Msg/BurnDerivative',
    requestStream: false,
    responseStream: false,
    requestType: kava_liquid_v1beta1_tx_pb.MsgBurnDerivative,
    responseType: kava_liquid_v1beta1_tx_pb.MsgBurnDerivativeResponse,
    requestSerialize: serialize_kava_liquid_v1beta1_MsgBurnDerivative,
    requestDeserialize: deserialize_kava_liquid_v1beta1_MsgBurnDerivative,
    responseSerialize: serialize_kava_liquid_v1beta1_MsgBurnDerivativeResponse,
    responseDeserialize: deserialize_kava_liquid_v1beta1_MsgBurnDerivativeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
