// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_bank_v1alpha1_tx_pb = require('../../../shentu/bank/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');

function serialize_shentu_bank_v1alpha1_MsgLockedSend(arg) {
  if (!(arg instanceof shentu_bank_v1alpha1_tx_pb.MsgLockedSend)) {
    throw new Error('Expected argument of type shentu.bank.v1alpha1.MsgLockedSend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_bank_v1alpha1_MsgLockedSend(buffer_arg) {
  return shentu_bank_v1alpha1_tx_pb.MsgLockedSend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_bank_v1alpha1_MsgLockedSendResponse(arg) {
  if (!(arg instanceof shentu_bank_v1alpha1_tx_pb.MsgLockedSendResponse)) {
    throw new Error('Expected argument of type shentu.bank.v1alpha1.MsgLockedSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_bank_v1alpha1_MsgLockedSendResponse(buffer_arg) {
  return shentu_bank_v1alpha1_tx_pb.MsgLockedSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // LockedSend defines a method for sending coins and locking them from one
// account to another account.
lockedSend: {
    path: '/shentu.bank.v1alpha1.Msg/LockedSend',
    requestStream: false,
    responseStream: false,
    requestType: shentu_bank_v1alpha1_tx_pb.MsgLockedSend,
    responseType: shentu_bank_v1alpha1_tx_pb.MsgLockedSendResponse,
    requestSerialize: serialize_shentu_bank_v1alpha1_MsgLockedSend,
    requestDeserialize: deserialize_shentu_bank_v1alpha1_MsgLockedSend,
    responseSerialize: serialize_shentu_bank_v1alpha1_MsgLockedSendResponse,
    responseDeserialize: deserialize_shentu_bank_v1alpha1_MsgLockedSendResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
