// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_earn_v1beta1_tx_pb = require('../../../kava/earn/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var kava_earn_v1beta1_strategy_pb = require('../../../kava/earn/v1beta1/strategy_pb.js');
var kava_earn_v1beta1_vault_pb = require('../../../kava/earn/v1beta1/vault_pb.js');

function serialize_kava_earn_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof kava_earn_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_MsgDeposit(buffer_arg) {
  return kava_earn_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_MsgDepositResponse(buffer_arg) {
  return kava_earn_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof kava_earn_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_MsgWithdraw(buffer_arg) {
  return kava_earn_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_earn_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof kava_earn_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type kava.earn.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_earn_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return kava_earn_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the earn Msg service.
var MsgService = exports.MsgService = {
  // Deposit defines a method for depositing assets into a vault
deposit: {
    path: '/kava.earn.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_tx_pb.MsgDeposit,
    responseType: kava_earn_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_kava_earn_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_kava_earn_v1beta1_MsgDeposit,
    responseSerialize: serialize_kava_earn_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing assets into a vault
withdraw: {
    path: '/kava.earn.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: kava_earn_v1beta1_tx_pb.MsgWithdraw,
    responseType: kava_earn_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_kava_earn_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_kava_earn_v1beta1_MsgWithdraw,
    responseSerialize: serialize_kava_earn_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_kava_earn_v1beta1_MsgWithdrawResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
