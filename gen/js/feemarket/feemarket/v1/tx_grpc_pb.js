// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var feemarket_feemarket_v1_tx_pb = require('../../../feemarket/feemarket/v1/tx_pb.js');
var feemarket_feemarket_v1_params_pb = require('../../../feemarket/feemarket/v1/params_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_feemarket_feemarket_v1_MsgParams(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_tx_pb.MsgParams)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.MsgParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_MsgParams(buffer_arg) {
  return feemarket_feemarket_v1_tx_pb.MsgParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_MsgParamsResponse(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_tx_pb.MsgParamsResponse)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.MsgParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_MsgParamsResponse(buffer_arg) {
  return feemarket_feemarket_v1_tx_pb.MsgParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Message service defines the types of messages supported by the feemarket
// module.
var MsgService = exports.MsgService = {
  // Params defines a method for updating the feemarket module parameters.
params: {
    path: '/feemarket.feemarket.v1.Msg/Params',
    requestStream: false,
    responseStream: false,
    requestType: feemarket_feemarket_v1_tx_pb.MsgParams,
    responseType: feemarket_feemarket_v1_tx_pb.MsgParamsResponse,
    requestSerialize: serialize_feemarket_feemarket_v1_MsgParams,
    requestDeserialize: deserialize_feemarket_feemarket_v1_MsgParams,
    responseSerialize: serialize_feemarket_feemarket_v1_MsgParamsResponse,
    responseDeserialize: deserialize_feemarket_feemarket_v1_MsgParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
