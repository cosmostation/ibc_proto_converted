// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_hard_v1beta1_tx_pb = require('../../../kava/hard/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_hard_v1beta1_MsgBorrow(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgBorrow)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgBorrow(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgBorrowResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgBorrowResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgBorrowResponse(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgDeposit(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgDepositResponse(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgLiquidate(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgLiquidate)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgLiquidate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgLiquidate(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgLiquidate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgLiquidateResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgLiquidateResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgLiquidateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgLiquidateResponse(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgLiquidateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgRepay(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgRepay)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgRepay');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgRepay(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgRepay.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgRepayResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgRepayResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgRepayResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgRepayResponse(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgRepayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgWithdraw(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return kava_hard_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the hard Msg service.
var MsgService = exports.MsgService = {
  // Deposit defines a method for depositing funds to hard liquidity pool.
deposit: {
    path: '/kava.hard.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_tx_pb.MsgDeposit,
    responseType: kava_hard_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_kava_hard_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_kava_hard_v1beta1_MsgDeposit,
    responseSerialize: serialize_kava_hard_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing funds from hard liquidity pool.
withdraw: {
    path: '/kava.hard.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_tx_pb.MsgWithdraw,
    responseType: kava_hard_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_kava_hard_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_kava_hard_v1beta1_MsgWithdraw,
    responseSerialize: serialize_kava_hard_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_MsgWithdrawResponse,
  },
  // Borrow defines a method for borrowing funds from hard liquidity pool.
borrow: {
    path: '/kava.hard.v1beta1.Msg/Borrow',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_tx_pb.MsgBorrow,
    responseType: kava_hard_v1beta1_tx_pb.MsgBorrowResponse,
    requestSerialize: serialize_kava_hard_v1beta1_MsgBorrow,
    requestDeserialize: deserialize_kava_hard_v1beta1_MsgBorrow,
    responseSerialize: serialize_kava_hard_v1beta1_MsgBorrowResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_MsgBorrowResponse,
  },
  // Repay defines a method for repaying funds borrowed from hard liquidity pool.
repay: {
    path: '/kava.hard.v1beta1.Msg/Repay',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_tx_pb.MsgRepay,
    responseType: kava_hard_v1beta1_tx_pb.MsgRepayResponse,
    requestSerialize: serialize_kava_hard_v1beta1_MsgRepay,
    requestDeserialize: deserialize_kava_hard_v1beta1_MsgRepay,
    responseSerialize: serialize_kava_hard_v1beta1_MsgRepayResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_MsgRepayResponse,
  },
  // Liquidate defines a method for attempting to liquidate a borrower that is over their loan-to-value.
liquidate: {
    path: '/kava.hard.v1beta1.Msg/Liquidate',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_tx_pb.MsgLiquidate,
    responseType: kava_hard_v1beta1_tx_pb.MsgLiquidateResponse,
    requestSerialize: serialize_kava_hard_v1beta1_MsgLiquidate,
    requestDeserialize: deserialize_kava_hard_v1beta1_MsgLiquidate,
    responseSerialize: serialize_kava_hard_v1beta1_MsgLiquidateResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_MsgLiquidateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
