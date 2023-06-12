// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_alloc_v1beta1_tx_pb = require('../../../stargaze/alloc/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccount(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccount)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccount(buffer_arg) {
  return stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccountResponse(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccountResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.MsgCreateVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccountResponse(buffer_arg) {
  return stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPool(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPool)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.MsgFundFairburnPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPool(buffer_arg) {
  return stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPoolResponse(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPoolResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.MsgFundFairburnPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPoolResponse(buffer_arg) {
  return stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the alloc Msg service.
var MsgService = exports.MsgService = {
  // CreateVestingAccount defines a method that enables creating a vesting
// account.
createVestingAccount: {
    path: '/publicawesome.stargaze.alloc.v1beta1.Msg/CreateVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccount,
    responseType: stargaze_alloc_v1beta1_tx_pb.MsgCreateVestingAccountResponse,
    requestSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccount,
    requestDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccount,
    responseSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccountResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_MsgCreateVestingAccountResponse,
  },
  // FundFairburnPool defines a method to allow an account to directly
// fund the fee collector module account.
fundFairburnPool: {
    path: '/publicawesome.stargaze.alloc.v1beta1.Msg/FundFairburnPool',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPool,
    responseType: stargaze_alloc_v1beta1_tx_pb.MsgFundFairburnPoolResponse,
    requestSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPool,
    requestDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPool,
    responseSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPoolResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_MsgFundFairburnPoolResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
