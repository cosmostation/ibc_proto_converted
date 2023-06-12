// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_random_tx_pb = require('../../irismod/random/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_irismod_random_MsgRequestRandom(arg) {
  if (!(arg instanceof irismod_random_tx_pb.MsgRequestRandom)) {
    throw new Error('Expected argument of type irismod.random.MsgRequestRandom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_MsgRequestRandom(buffer_arg) {
  return irismod_random_tx_pb.MsgRequestRandom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_random_MsgRequestRandomResponse(arg) {
  if (!(arg instanceof irismod_random_tx_pb.MsgRequestRandomResponse)) {
    throw new Error('Expected argument of type irismod.random.MsgRequestRandomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_MsgRequestRandomResponse(buffer_arg) {
  return irismod_random_tx_pb.MsgRequestRandomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // RequestRandom defines a method for requesting a new random number
requestRandom: {
    path: '/irismod.random.Msg/RequestRandom',
    requestStream: false,
    responseStream: false,
    requestType: irismod_random_tx_pb.MsgRequestRandom,
    responseType: irismod_random_tx_pb.MsgRequestRandomResponse,
    requestSerialize: serialize_irismod_random_MsgRequestRandom,
    requestDeserialize: deserialize_irismod_random_MsgRequestRandom,
    responseSerialize: serialize_irismod_random_MsgRequestRandomResponse,
    responseDeserialize: deserialize_irismod_random_MsgRequestRandomResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
