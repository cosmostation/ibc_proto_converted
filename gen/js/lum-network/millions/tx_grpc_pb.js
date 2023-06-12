// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_millions_tx_pb = require('../../lum-network/millions/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var lum$network_millions_draw_schedule_pb = require('../../lum-network/millions/draw_schedule_pb.js');
var lum$network_millions_pool_pb = require('../../lum-network/millions/pool_pb.js');
var lum$network_millions_prize_strategy_pb = require('../../lum-network/millions/prize_strategy_pb.js');

function serialize_lum_network_millions_MsgClaimPrize(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgClaimPrize)) {
    throw new Error('Expected argument of type lum.network.millions.MsgClaimPrize');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgClaimPrize(buffer_arg) {
  return lum$network_millions_tx_pb.MsgClaimPrize.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgClaimPrizeResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgClaimPrizeResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgClaimPrizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgClaimPrizeResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgClaimPrizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDeposit(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDeposit(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDepositResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDepositResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDepositRetry(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDepositRetry)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDepositRetry');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDepositRetry(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDepositRetry.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDepositRetryResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDepositRetryResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDepositRetryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDepositRetryResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDepositRetryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDrawRetry(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDrawRetry)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDrawRetry');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDrawRetry(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDrawRetry.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgDrawRetryResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgDrawRetryResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgDrawRetryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgDrawRetryResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgDrawRetryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgRestoreInterchainAccounts(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgRestoreInterchainAccounts)) {
    throw new Error('Expected argument of type lum.network.millions.MsgRestoreInterchainAccounts');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgRestoreInterchainAccounts(buffer_arg) {
  return lum$network_millions_tx_pb.MsgRestoreInterchainAccounts.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgRestoreInterchainAccountsResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgRestoreInterchainAccountsResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgRestoreInterchainAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgRestoreInterchainAccountsResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgRestoreInterchainAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgWithdrawDeposit(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgWithdrawDeposit)) {
    throw new Error('Expected argument of type lum.network.millions.MsgWithdrawDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgWithdrawDeposit(buffer_arg) {
  return lum$network_millions_tx_pb.MsgWithdrawDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgWithdrawDepositResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgWithdrawDepositResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgWithdrawDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgWithdrawDepositResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgWithdrawDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgWithdrawDepositRetry(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgWithdrawDepositRetry)) {
    throw new Error('Expected argument of type lum.network.millions.MsgWithdrawDepositRetry');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgWithdrawDepositRetry(buffer_arg) {
  return lum$network_millions_tx_pb.MsgWithdrawDepositRetry.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_millions_MsgWithdrawDepositRetryResponse(arg) {
  if (!(arg instanceof lum$network_millions_tx_pb.MsgWithdrawDepositRetryResponse)) {
    throw new Error('Expected argument of type lum.network.millions.MsgWithdrawDepositRetryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_millions_MsgWithdrawDepositRetryResponse(buffer_arg) {
  return lum$network_millions_tx_pb.MsgWithdrawDepositRetryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  deposit: {
    path: '/lum.network.millions.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgDeposit,
    responseType: lum$network_millions_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_lum_network_millions_MsgDeposit,
    requestDeserialize: deserialize_lum_network_millions_MsgDeposit,
    responseSerialize: serialize_lum_network_millions_MsgDepositResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgDepositResponse,
  },
  depositRetry: {
    path: '/lum.network.millions.Msg/DepositRetry',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgDepositRetry,
    responseType: lum$network_millions_tx_pb.MsgDepositRetryResponse,
    requestSerialize: serialize_lum_network_millions_MsgDepositRetry,
    requestDeserialize: deserialize_lum_network_millions_MsgDepositRetry,
    responseSerialize: serialize_lum_network_millions_MsgDepositRetryResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgDepositRetryResponse,
  },
  claimPrize: {
    path: '/lum.network.millions.Msg/ClaimPrize',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgClaimPrize,
    responseType: lum$network_millions_tx_pb.MsgClaimPrizeResponse,
    requestSerialize: serialize_lum_network_millions_MsgClaimPrize,
    requestDeserialize: deserialize_lum_network_millions_MsgClaimPrize,
    responseSerialize: serialize_lum_network_millions_MsgClaimPrizeResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgClaimPrizeResponse,
  },
  withdrawDeposit: {
    path: '/lum.network.millions.Msg/WithdrawDeposit',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgWithdrawDeposit,
    responseType: lum$network_millions_tx_pb.MsgWithdrawDepositResponse,
    requestSerialize: serialize_lum_network_millions_MsgWithdrawDeposit,
    requestDeserialize: deserialize_lum_network_millions_MsgWithdrawDeposit,
    responseSerialize: serialize_lum_network_millions_MsgWithdrawDepositResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgWithdrawDepositResponse,
  },
  withdrawDepositRetry: {
    path: '/lum.network.millions.Msg/WithdrawDepositRetry',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgWithdrawDepositRetry,
    responseType: lum$network_millions_tx_pb.MsgWithdrawDepositRetryResponse,
    requestSerialize: serialize_lum_network_millions_MsgWithdrawDepositRetry,
    requestDeserialize: deserialize_lum_network_millions_MsgWithdrawDepositRetry,
    responseSerialize: serialize_lum_network_millions_MsgWithdrawDepositRetryResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgWithdrawDepositRetryResponse,
  },
  drawRetry: {
    path: '/lum.network.millions.Msg/DrawRetry',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgDrawRetry,
    responseType: lum$network_millions_tx_pb.MsgDrawRetryResponse,
    requestSerialize: serialize_lum_network_millions_MsgDrawRetry,
    requestDeserialize: deserialize_lum_network_millions_MsgDrawRetry,
    responseSerialize: serialize_lum_network_millions_MsgDrawRetryResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgDrawRetryResponse,
  },
  restoreInterchainAccounts: {
    path: '/lum.network.millions.Msg/RestoreInterchainAccounts',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_millions_tx_pb.MsgRestoreInterchainAccounts,
    responseType: lum$network_millions_tx_pb.MsgRestoreInterchainAccountsResponse,
    requestSerialize: serialize_lum_network_millions_MsgRestoreInterchainAccounts,
    requestDeserialize: deserialize_lum_network_millions_MsgRestoreInterchainAccounts,
    responseSerialize: serialize_lum_network_millions_MsgRestoreInterchainAccountsResponse,
    responseDeserialize: deserialize_lum_network_millions_MsgRestoreInterchainAccountsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
