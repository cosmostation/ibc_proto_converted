// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_vesting_v1beta1_tx_pb = require('../../../cosmos/vesting/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_vesting_v1beta1_vesting_pb = require('../../../cosmos/vesting/v1beta1/vesting_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccount(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccount)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreatePeriodicVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccount(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccountResponse(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccountResponse)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreatePeriodicVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccountResponse(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccount(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccount)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreatePermanentLockedAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccount(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccountResponse(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccountResponse)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreatePermanentLockedAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccountResponse(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_vesting_v1beta1_MsgCreateVestingAccount(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccount)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreateVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreateVestingAccount(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse(arg) {
  if (!(arg instanceof cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccountResponse)) {
    throw new Error('Expected argument of type cosmos.vesting.v1beta1.MsgCreateVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse(buffer_arg) {
  return cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // CreateVestingAccount defines a method that enables creating a vesting
// account.
createVestingAccount: {
    path: '/cosmos.vesting.v1beta1.Msg/CreateVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccount,
    responseType: cosmos_vesting_v1beta1_tx_pb.MsgCreateVestingAccountResponse,
    requestSerialize: serialize_cosmos_vesting_v1beta1_MsgCreateVestingAccount,
    requestDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreateVestingAccount,
    responseSerialize: serialize_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse,
    responseDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreateVestingAccountResponse,
  },
  // CreatePermanentLockedAccount defines a method that enables creating a permanent
// locked account.
//
// Since: cosmos-sdk 0.46
createPermanentLockedAccount: {
    path: '/cosmos.vesting.v1beta1.Msg/CreatePermanentLockedAccount',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccount,
    responseType: cosmos_vesting_v1beta1_tx_pb.MsgCreatePermanentLockedAccountResponse,
    requestSerialize: serialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccount,
    requestDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccount,
    responseSerialize: serialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccountResponse,
    responseDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreatePermanentLockedAccountResponse,
  },
  // CreatePeriodicVestingAccount defines a method that enables creating a
// periodic vesting account.
//
// Since: cosmos-sdk 0.46
createPeriodicVestingAccount: {
    path: '/cosmos.vesting.v1beta1.Msg/CreatePeriodicVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccount,
    responseType: cosmos_vesting_v1beta1_tx_pb.MsgCreatePeriodicVestingAccountResponse,
    requestSerialize: serialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccount,
    requestDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccount,
    responseSerialize: serialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccountResponse,
    responseDeserialize: deserialize_cosmos_vesting_v1beta1_MsgCreatePeriodicVestingAccountResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
