// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_vesting_v1_tx_pb = require('../../../evmos/vesting/v1/tx_pb.js');
var cosmos_vesting_v1beta1_vesting_pb = require('../../../cosmos/vesting/v1beta1/vesting_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_evmos_vesting_v1_MsgClawback(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgClawback)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgClawback');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgClawback(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgClawback.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgClawbackResponse(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgClawbackResponse)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgClawbackResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgClawbackResponse(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgClawbackResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgConvertVestingAccount(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgConvertVestingAccount)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgConvertVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgConvertVestingAccount(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgConvertVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgConvertVestingAccountResponse(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgConvertVestingAccountResponse)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgConvertVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgConvertVestingAccountResponse(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgConvertVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgCreateClawbackVestingAccount(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgCreateClawbackVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgCreateClawbackVestingAccount(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgCreateClawbackVestingAccountResponse(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgCreateClawbackVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgCreateClawbackVestingAccountResponse(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgUpdateVestingFunder(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgUpdateVestingFunder)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgUpdateVestingFunder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgUpdateVestingFunder(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgUpdateVestingFunder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_MsgUpdateVestingFunderResponse(arg) {
  if (!(arg instanceof evmos_vesting_v1_tx_pb.MsgUpdateVestingFunderResponse)) {
    throw new Error('Expected argument of type evmos.vesting.v1.MsgUpdateVestingFunderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_MsgUpdateVestingFunderResponse(buffer_arg) {
  return evmos_vesting_v1_tx_pb.MsgUpdateVestingFunderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the vesting Msg service.
var MsgService = exports.MsgService = {
  // CreateClawbackVestingAccount creats a vesting account that is subject to
// clawback and the configuration of vesting and lockup schedules.
createClawbackVestingAccount: {
    path: '/evmos.vesting.v1.Msg/CreateClawbackVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccount,
    responseType: evmos_vesting_v1_tx_pb.MsgCreateClawbackVestingAccountResponse,
    requestSerialize: serialize_evmos_vesting_v1_MsgCreateClawbackVestingAccount,
    requestDeserialize: deserialize_evmos_vesting_v1_MsgCreateClawbackVestingAccount,
    responseSerialize: serialize_evmos_vesting_v1_MsgCreateClawbackVestingAccountResponse,
    responseDeserialize: deserialize_evmos_vesting_v1_MsgCreateClawbackVestingAccountResponse,
  },
  // Clawback removes the unvested tokens from a ClawbackVestingAccount.
clawback: {
    path: '/evmos.vesting.v1.Msg/Clawback',
    requestStream: false,
    responseStream: false,
    requestType: evmos_vesting_v1_tx_pb.MsgClawback,
    responseType: evmos_vesting_v1_tx_pb.MsgClawbackResponse,
    requestSerialize: serialize_evmos_vesting_v1_MsgClawback,
    requestDeserialize: deserialize_evmos_vesting_v1_MsgClawback,
    responseSerialize: serialize_evmos_vesting_v1_MsgClawbackResponse,
    responseDeserialize: deserialize_evmos_vesting_v1_MsgClawbackResponse,
  },
  // UpdateVestingFunder updates the funder address of an existing
// ClawbackVestingAccount.
updateVestingFunder: {
    path: '/evmos.vesting.v1.Msg/UpdateVestingFunder',
    requestStream: false,
    responseStream: false,
    requestType: evmos_vesting_v1_tx_pb.MsgUpdateVestingFunder,
    responseType: evmos_vesting_v1_tx_pb.MsgUpdateVestingFunderResponse,
    requestSerialize: serialize_evmos_vesting_v1_MsgUpdateVestingFunder,
    requestDeserialize: deserialize_evmos_vesting_v1_MsgUpdateVestingFunder,
    responseSerialize: serialize_evmos_vesting_v1_MsgUpdateVestingFunderResponse,
    responseDeserialize: deserialize_evmos_vesting_v1_MsgUpdateVestingFunderResponse,
  },
  // ConvertVestingAccount converts a ClawbackVestingAccount to a Eth account
convertVestingAccount: {
    path: '/evmos.vesting.v1.Msg/ConvertVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: evmos_vesting_v1_tx_pb.MsgConvertVestingAccount,
    responseType: evmos_vesting_v1_tx_pb.MsgConvertVestingAccountResponse,
    requestSerialize: serialize_evmos_vesting_v1_MsgConvertVestingAccount,
    requestDeserialize: deserialize_evmos_vesting_v1_MsgConvertVestingAccount,
    responseSerialize: serialize_evmos_vesting_v1_MsgConvertVestingAccountResponse,
    responseDeserialize: deserialize_evmos_vesting_v1_MsgConvertVestingAccountResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
