// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_vesting_v1_tx_pb = require('../../../canto/vesting/v1/tx_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_vesting_v1beta1_vesting_pb = require('../../../cosmos/vesting/v1beta1/vesting_pb.js');

function serialize_canto_vesting_v1_MsgClawback(arg) {
  if (!(arg instanceof canto_vesting_v1_tx_pb.MsgClawback)) {
    throw new Error('Expected argument of type canto.vesting.v1.MsgClawback');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_vesting_v1_MsgClawback(buffer_arg) {
  return canto_vesting_v1_tx_pb.MsgClawback.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_vesting_v1_MsgClawbackResponse(arg) {
  if (!(arg instanceof canto_vesting_v1_tx_pb.MsgClawbackResponse)) {
    throw new Error('Expected argument of type canto.vesting.v1.MsgClawbackResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_vesting_v1_MsgClawbackResponse(buffer_arg) {
  return canto_vesting_v1_tx_pb.MsgClawbackResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_vesting_v1_MsgCreateClawbackVestingAccount(arg) {
  if (!(arg instanceof canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount)) {
    throw new Error('Expected argument of type canto.vesting.v1.MsgCreateClawbackVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_vesting_v1_MsgCreateClawbackVestingAccount(buffer_arg) {
  return canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_vesting_v1_MsgCreateClawbackVestingAccountResponse(arg) {
  if (!(arg instanceof canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse)) {
    throw new Error('Expected argument of type canto.vesting.v1.MsgCreateClawbackVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_vesting_v1_MsgCreateClawbackVestingAccountResponse(buffer_arg) {
  return canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the vesting Msg service.
var MsgService = exports.MsgService = {
  // CreateClawbackVestingAccount creats a vesting account that is subject to
// clawback and the configuration of vesting and lockup schedules.
createClawbackVestingAccount: {
    path: '/canto.vesting.v1.Msg/CreateClawbackVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount,
    responseType: canto_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse,
    requestSerialize: serialize_canto_vesting_v1_MsgCreateClawbackVestingAccount,
    requestDeserialize: deserialize_canto_vesting_v1_MsgCreateClawbackVestingAccount,
    responseSerialize: serialize_canto_vesting_v1_MsgCreateClawbackVestingAccountResponse,
    responseDeserialize: deserialize_canto_vesting_v1_MsgCreateClawbackVestingAccountResponse,
  },
  // Clawback removes the unvested tokens from a ClawbackVestingAccount.
clawback: {
    path: '/canto.vesting.v1.Msg/Clawback',
    requestStream: false,
    responseStream: false,
    requestType: canto_vesting_v1_tx_pb.MsgClawback,
    responseType: canto_vesting_v1_tx_pb.MsgClawbackResponse,
    requestSerialize: serialize_canto_vesting_v1_MsgClawback,
    requestDeserialize: deserialize_canto_vesting_v1_MsgClawback,
    responseSerialize: serialize_canto_vesting_v1_MsgClawbackResponse,
    responseDeserialize: deserialize_canto_vesting_v1_MsgClawbackResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
