// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rbank_tx_pb = require('../../stafihub/rbank/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../cosmos/bank/v1beta1/bank_pb.js');

function serialize_stafihub_stafihub_rbank_MsgAddDenom(arg) {
  if (!(arg instanceof stafihub_rbank_tx_pb.MsgAddDenom)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.MsgAddDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_MsgAddDenom(buffer_arg) {
  return stafihub_rbank_tx_pb.MsgAddDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rbank_MsgAddDenomResponse(arg) {
  if (!(arg instanceof stafihub_rbank_tx_pb.MsgAddDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.MsgAddDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_MsgAddDenomResponse(buffer_arg) {
  return stafihub_rbank_tx_pb.MsgAddDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  addDenom: {
    path: '/stafihub.stafihub.rbank.Msg/AddDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rbank_tx_pb.MsgAddDenom,
    responseType: stafihub_rbank_tx_pb.MsgAddDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_rbank_MsgAddDenom,
    requestDeserialize: deserialize_stafihub_stafihub_rbank_MsgAddDenom,
    responseSerialize: serialize_stafihub_stafihub_rbank_MsgAddDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rbank_MsgAddDenomResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
