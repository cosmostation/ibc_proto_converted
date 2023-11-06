// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_counter_v1_tx_pb = require('../../../cosmos/counter/v1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_counter_v1_MsgIncreaseCountResponse(arg) {
  if (!(arg instanceof cosmos_counter_v1_tx_pb.MsgIncreaseCountResponse)) {
    throw new Error('Expected argument of type cosmos.counter.v1.MsgIncreaseCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_counter_v1_MsgIncreaseCountResponse(buffer_arg) {
  return cosmos_counter_v1_tx_pb.MsgIncreaseCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_counter_v1_MsgIncreaseCounter(arg) {
  if (!(arg instanceof cosmos_counter_v1_tx_pb.MsgIncreaseCounter)) {
    throw new Error('Expected argument of type cosmos.counter.v1.MsgIncreaseCounter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_counter_v1_MsgIncreaseCounter(buffer_arg) {
  return cosmos_counter_v1_tx_pb.MsgIncreaseCounter.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the counter Msg service.
var MsgService = exports.MsgService = {
  // IncreaseCount increments the counter by the specified amount.
increaseCount: {
    path: '/cosmos.counter.v1.Msg/IncreaseCount',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_counter_v1_tx_pb.MsgIncreaseCounter,
    responseType: cosmos_counter_v1_tx_pb.MsgIncreaseCountResponse,
    requestSerialize: serialize_cosmos_counter_v1_MsgIncreaseCounter,
    requestDeserialize: deserialize_cosmos_counter_v1_MsgIncreaseCounter,
    responseSerialize: serialize_cosmos_counter_v1_MsgIncreaseCountResponse,
    responseDeserialize: deserialize_cosmos_counter_v1_MsgIncreaseCountResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
