// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_cdp_v1beta1_tx_pb = require('../../../kava/cdp/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_cdp_v1beta1_MsgCreateCDP(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgCreateCDP)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgCreateCDP');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgCreateCDP(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgCreateCDP.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgCreateCDPResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgCreateCDPResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgCreateCDPResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgCreateCDPResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgCreateCDPResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgDeposit(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgDepositResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgDrawDebt(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgDrawDebt)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgDrawDebt');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgDrawDebt(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgDrawDebt.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgDrawDebtResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgDrawDebtResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgDrawDebtResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgDrawDebtResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgDrawDebtResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgLiquidate(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgLiquidate)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgLiquidate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgLiquidate(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgLiquidate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgLiquidateResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgLiquidateResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgLiquidateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgLiquidateResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgLiquidateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgRepayDebt(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgRepayDebt)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgRepayDebt');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgRepayDebt(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgRepayDebt.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgRepayDebtResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgRepayDebtResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgRepayDebtResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgRepayDebtResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgRepayDebtResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgWithdraw(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return kava_cdp_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the cdp Msg service.
var MsgService = exports.MsgService = {
  // CreateCDP defines a method to create a new CDP.
createCDP: {
    path: '/kava.cdp.v1beta1.Msg/CreateCDP',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgCreateCDP,
    responseType: kava_cdp_v1beta1_tx_pb.MsgCreateCDPResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgCreateCDP,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgCreateCDP,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgCreateCDPResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgCreateCDPResponse,
  },
  // Deposit defines a method to deposit to a CDP.
deposit: {
    path: '/kava.cdp.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgDeposit,
    responseType: kava_cdp_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgDeposit,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method to withdraw collateral from a CDP.
withdraw: {
    path: '/kava.cdp.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgWithdraw,
    responseType: kava_cdp_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgWithdraw,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgWithdrawResponse,
  },
  // DrawDebt defines a method to draw debt from a CDP.
drawDebt: {
    path: '/kava.cdp.v1beta1.Msg/DrawDebt',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgDrawDebt,
    responseType: kava_cdp_v1beta1_tx_pb.MsgDrawDebtResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgDrawDebt,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgDrawDebt,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgDrawDebtResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgDrawDebtResponse,
  },
  // RepayDebt defines a method to repay debt from a CDP.
repayDebt: {
    path: '/kava.cdp.v1beta1.Msg/RepayDebt',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgRepayDebt,
    responseType: kava_cdp_v1beta1_tx_pb.MsgRepayDebtResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgRepayDebt,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgRepayDebt,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgRepayDebtResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgRepayDebtResponse,
  },
  // Liquidate defines a method to attempt to liquidate a CDP whos
// collateralization ratio is under its liquidation ratio.
liquidate: {
    path: '/kava.cdp.v1beta1.Msg/Liquidate',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_tx_pb.MsgLiquidate,
    responseType: kava_cdp_v1beta1_tx_pb.MsgLiquidateResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_MsgLiquidate,
    requestDeserialize: deserialize_kava_cdp_v1beta1_MsgLiquidate,
    responseSerialize: serialize_kava_cdp_v1beta1_MsgLiquidateResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_MsgLiquidateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
