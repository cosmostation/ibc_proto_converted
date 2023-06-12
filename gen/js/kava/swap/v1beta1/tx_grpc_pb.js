// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_swap_v1beta1_tx_pb = require('../../../kava/swap/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_swap_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgDeposit(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgDepositResponse(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgSwapExactForTokens(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgSwapExactForTokens)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgSwapExactForTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgSwapExactForTokens(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgSwapExactForTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgSwapExactForTokensResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgSwapExactForTokensResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgSwapExactForTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgSwapExactForTokensResponse(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgSwapExactForTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgSwapForExactTokens(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgSwapForExactTokens)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgSwapForExactTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgSwapForExactTokens(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgSwapForExactTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgSwapForExactTokensResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgSwapForExactTokensResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgSwapForExactTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgSwapForExactTokensResponse(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgSwapForExactTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgWithdraw(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return kava_swap_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the swap Msg service.
var MsgService = exports.MsgService = {
  // Deposit defines a method for depositing liquidity into a pool
deposit: {
    path: '/kava.swap.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_tx_pb.MsgDeposit,
    responseType: kava_swap_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_kava_swap_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_kava_swap_v1beta1_MsgDeposit,
    responseSerialize: serialize_kava_swap_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing liquidity into a pool
withdraw: {
    path: '/kava.swap.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_tx_pb.MsgWithdraw,
    responseType: kava_swap_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_kava_swap_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_kava_swap_v1beta1_MsgWithdraw,
    responseSerialize: serialize_kava_swap_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_MsgWithdrawResponse,
  },
  // SwapExactForTokens represents a message for trading exact coinA for coinB
swapExactForTokens: {
    path: '/kava.swap.v1beta1.Msg/SwapExactForTokens',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_tx_pb.MsgSwapExactForTokens,
    responseType: kava_swap_v1beta1_tx_pb.MsgSwapExactForTokensResponse,
    requestSerialize: serialize_kava_swap_v1beta1_MsgSwapExactForTokens,
    requestDeserialize: deserialize_kava_swap_v1beta1_MsgSwapExactForTokens,
    responseSerialize: serialize_kava_swap_v1beta1_MsgSwapExactForTokensResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_MsgSwapExactForTokensResponse,
  },
  // SwapForExactTokens represents a message for trading coinA for an exact coinB
swapForExactTokens: {
    path: '/kava.swap.v1beta1.Msg/SwapForExactTokens',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_tx_pb.MsgSwapForExactTokens,
    responseType: kava_swap_v1beta1_tx_pb.MsgSwapForExactTokensResponse,
    requestSerialize: serialize_kava_swap_v1beta1_MsgSwapForExactTokens,
    requestDeserialize: deserialize_kava_swap_v1beta1_MsgSwapForExactTokens,
    responseSerialize: serialize_kava_swap_v1beta1_MsgSwapForExactTokensResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_MsgSwapForExactTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
