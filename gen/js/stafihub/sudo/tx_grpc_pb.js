// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_sudo_tx_pb = require('../../stafihub/sudo/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../cosmos/bank/v1beta1/bank_pb.js');

function serialize_stafihub_stafihub_sudo_MsgUpdateAdmin(arg) {
  if (!(arg instanceof stafihub_sudo_tx_pb.MsgUpdateAdmin)) {
    throw new Error('Expected argument of type stafihub.stafihub.sudo.MsgUpdateAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_sudo_MsgUpdateAdmin(buffer_arg) {
  return stafihub_sudo_tx_pb.MsgUpdateAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_sudo_MsgUpdateAdminResponse(arg) {
  if (!(arg instanceof stafihub_sudo_tx_pb.MsgUpdateAdminResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.sudo.MsgUpdateAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_sudo_MsgUpdateAdminResponse(buffer_arg) {
  return stafihub_sudo_tx_pb.MsgUpdateAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  updateAdmin: {
    path: '/stafihub.stafihub.sudo.Msg/UpdateAdmin',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_sudo_tx_pb.MsgUpdateAdmin,
    responseType: stafihub_sudo_tx_pb.MsgUpdateAdminResponse,
    requestSerialize: serialize_stafihub_stafihub_sudo_MsgUpdateAdmin,
    requestDeserialize: deserialize_stafihub_stafihub_sudo_MsgUpdateAdmin,
    responseSerialize: serialize_stafihub_stafihub_sudo_MsgUpdateAdminResponse,
    responseDeserialize: deserialize_stafihub_stafihub_sudo_MsgUpdateAdminResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
