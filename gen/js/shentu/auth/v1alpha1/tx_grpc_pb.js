// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_auth_v1alpha1_tx_pb = require('../../../shentu/auth/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_shentu_auth_v1alpha1_MsgUnlock(arg) {
  if (!(arg instanceof shentu_auth_v1alpha1_tx_pb.MsgUnlock)) {
    throw new Error('Expected argument of type shentu.auth.v1alpha1.MsgUnlock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_auth_v1alpha1_MsgUnlock(buffer_arg) {
  return shentu_auth_v1alpha1_tx_pb.MsgUnlock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_auth_v1alpha1_MsgUnlockResponse(arg) {
  if (!(arg instanceof shentu_auth_v1alpha1_tx_pb.MsgUnlockResponse)) {
    throw new Error('Expected argument of type shentu.auth.v1alpha1.MsgUnlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_auth_v1alpha1_MsgUnlockResponse(buffer_arg) {
  return shentu_auth_v1alpha1_tx_pb.MsgUnlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the auth Msg service.
var MsgService = exports.MsgService = {
  // Unlock defines a method for unlocking coins from a manual vesting
// account.
unlock: {
    path: '/shentu.auth.v1alpha1.Msg/Unlock',
    requestStream: false,
    responseStream: false,
    requestType: shentu_auth_v1alpha1_tx_pb.MsgUnlock,
    responseType: shentu_auth_v1alpha1_tx_pb.MsgUnlockResponse,
    requestSerialize: serialize_shentu_auth_v1alpha1_MsgUnlock,
    requestDeserialize: deserialize_shentu_auth_v1alpha1_MsgUnlock,
    responseSerialize: serialize_shentu_auth_v1alpha1_MsgUnlockResponse,
    responseDeserialize: deserialize_shentu_auth_v1alpha1_MsgUnlockResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
