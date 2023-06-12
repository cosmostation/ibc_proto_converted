// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_router_v1beta1_tx_pb = require('../../../kava/router/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_router_v1beta1_MsgDelegateMintDeposit(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgDelegateMintDeposit)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgDelegateMintDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgDelegateMintDeposit(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgDelegateMintDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgDelegateMintDepositResponse(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgDelegateMintDepositResponse)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgDelegateMintDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgDelegateMintDepositResponse(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgDelegateMintDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgMintDeposit(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgMintDeposit)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgMintDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgMintDeposit(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgMintDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgMintDepositResponse(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgMintDepositResponse)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgMintDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgMintDepositResponse(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgMintDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgWithdrawBurn(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgWithdrawBurn)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgWithdrawBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgWithdrawBurn(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgWithdrawBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgWithdrawBurnResponse(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgWithdrawBurnResponse)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgWithdrawBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgWithdrawBurnResponse(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgWithdrawBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgWithdrawBurnUndelegate(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegate)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgWithdrawBurnUndelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgWithdrawBurnUndelegate(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_router_v1beta1_MsgWithdrawBurnUndelegateResponse(arg) {
  if (!(arg instanceof kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegateResponse)) {
    throw new Error('Expected argument of type kava.router.v1beta1.MsgWithdrawBurnUndelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_router_v1beta1_MsgWithdrawBurnUndelegateResponse(buffer_arg) {
  return kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the router Msg service.
var MsgService = exports.MsgService = {
  // MintDeposit converts a delegation into staking derivatives and deposits it all into an earn vault.
mintDeposit: {
    path: '/kava.router.v1beta1.Msg/MintDeposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_router_v1beta1_tx_pb.MsgMintDeposit,
    responseType: kava_router_v1beta1_tx_pb.MsgMintDepositResponse,
    requestSerialize: serialize_kava_router_v1beta1_MsgMintDeposit,
    requestDeserialize: deserialize_kava_router_v1beta1_MsgMintDeposit,
    responseSerialize: serialize_kava_router_v1beta1_MsgMintDepositResponse,
    responseDeserialize: deserialize_kava_router_v1beta1_MsgMintDepositResponse,
  },
  // DelegateMintDeposit delegates tokens to a validator, then converts them into staking derivatives,
// then deposits to an earn vault.
delegateMintDeposit: {
    path: '/kava.router.v1beta1.Msg/DelegateMintDeposit',
    requestStream: false,
    responseStream: false,
    requestType: kava_router_v1beta1_tx_pb.MsgDelegateMintDeposit,
    responseType: kava_router_v1beta1_tx_pb.MsgDelegateMintDepositResponse,
    requestSerialize: serialize_kava_router_v1beta1_MsgDelegateMintDeposit,
    requestDeserialize: deserialize_kava_router_v1beta1_MsgDelegateMintDeposit,
    responseSerialize: serialize_kava_router_v1beta1_MsgDelegateMintDepositResponse,
    responseDeserialize: deserialize_kava_router_v1beta1_MsgDelegateMintDepositResponse,
  },
  // WithdrawBurn removes staking derivatives from an earn vault and converts them back to a staking delegation.
withdrawBurn: {
    path: '/kava.router.v1beta1.Msg/WithdrawBurn',
    requestStream: false,
    responseStream: false,
    requestType: kava_router_v1beta1_tx_pb.MsgWithdrawBurn,
    responseType: kava_router_v1beta1_tx_pb.MsgWithdrawBurnResponse,
    requestSerialize: serialize_kava_router_v1beta1_MsgWithdrawBurn,
    requestDeserialize: deserialize_kava_router_v1beta1_MsgWithdrawBurn,
    responseSerialize: serialize_kava_router_v1beta1_MsgWithdrawBurnResponse,
    responseDeserialize: deserialize_kava_router_v1beta1_MsgWithdrawBurnResponse,
  },
  // WithdrawBurnUndelegate removes staking derivatives from an earn vault, converts them to a staking delegation,
// then undelegates them from their validator.
withdrawBurnUndelegate: {
    path: '/kava.router.v1beta1.Msg/WithdrawBurnUndelegate',
    requestStream: false,
    responseStream: false,
    requestType: kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegate,
    responseType: kava_router_v1beta1_tx_pb.MsgWithdrawBurnUndelegateResponse,
    requestSerialize: serialize_kava_router_v1beta1_MsgWithdrawBurnUndelegate,
    requestDeserialize: deserialize_kava_router_v1beta1_MsgWithdrawBurnUndelegate,
    responseSerialize: serialize_kava_router_v1beta1_MsgWithdrawBurnUndelegateResponse,
    responseDeserialize: deserialize_kava_router_v1beta1_MsgWithdrawBurnUndelegateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
