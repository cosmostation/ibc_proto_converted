// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_asset_ft_v1_tx_pb = require('../../../../coreum/asset/ft/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../../cosmos/msg/v1/msg_pb.js');
var coreum_asset_ft_v1_token_pb = require('../../../../coreum/asset/ft/v1/token_pb.js');

function serialize_coreum_asset_ft_v1_EmptyResponse(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.EmptyResponse)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.EmptyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_EmptyResponse(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.EmptyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgBurn(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgBurn(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgFreeze(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgFreeze)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgFreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgFreeze(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgFreeze.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgGloballyFreeze(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgGloballyFreeze)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgGloballyFreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgGloballyFreeze(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgGloballyFreeze.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgGloballyUnfreeze(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgGloballyUnfreeze)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgGloballyUnfreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgGloballyUnfreeze(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgGloballyUnfreeze.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgIssue(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgIssue)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgIssue');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgIssue(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgIssue.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgMint(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgMint(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgSetWhitelistedLimit(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgSetWhitelistedLimit)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgSetWhitelistedLimit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgSetWhitelistedLimit(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgSetWhitelistedLimit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_ft_v1_MsgUnfreeze(arg) {
  if (!(arg instanceof coreum_asset_ft_v1_tx_pb.MsgUnfreeze)) {
    throw new Error('Expected argument of type coreum.asset.ft.v1.MsgUnfreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_ft_v1_MsgUnfreeze(buffer_arg) {
  return coreum_asset_ft_v1_tx_pb.MsgUnfreeze.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // Issue defines a method to issue a new fungible token.
issue: {
    path: '/coreum.asset.ft.v1.Msg/Issue',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgIssue,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgIssue,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgIssue,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // Mint mints new fungible tokens.
mint: {
    path: '/coreum.asset.ft.v1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgMint,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgMint,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgMint,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // Burn burns the specified fungible tokens from senders balance if the sender has enough balance.
burn: {
    path: '/coreum.asset.ft.v1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgBurn,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgBurn,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgBurn,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // Freeze freezes a part of the fungible tokens in an
// account, only if the freezable feature is enabled on that token.
freeze: {
    path: '/coreum.asset.ft.v1.Msg/Freeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgFreeze,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgFreeze,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgFreeze,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // Unfreeze unfreezes a part of the frozen fungible tokens in an
// account, only if there are such frozen tokens on that account.
unfreeze: {
    path: '/coreum.asset.ft.v1.Msg/Unfreeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgUnfreeze,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgUnfreeze,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgUnfreeze,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // GloballyFreeze freezes fungible token so no operations are allowed with it before unfrozen.
// This operation is idempotent so global freeze of already frozen token does nothing.
globallyFreeze: {
    path: '/coreum.asset.ft.v1.Msg/GloballyFreeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgGloballyFreeze,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgGloballyFreeze,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgGloballyFreeze,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // GloballyUnfreeze unfreezes fungible token and unblocks basic operations on it.
// This operation is idempotent so global unfreezing of non-frozen token does nothing.
globallyUnfreeze: {
    path: '/coreum.asset.ft.v1.Msg/GloballyUnfreeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgGloballyUnfreeze,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgGloballyUnfreeze,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgGloballyUnfreeze,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
  // SetWhitelistedLimit sets the limit of how many tokens a specific account may hold.
setWhitelistedLimit: {
    path: '/coreum.asset.ft.v1.Msg/SetWhitelistedLimit',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_ft_v1_tx_pb.MsgSetWhitelistedLimit,
    responseType: coreum_asset_ft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_ft_v1_MsgSetWhitelistedLimit,
    requestDeserialize: deserialize_coreum_asset_ft_v1_MsgSetWhitelistedLimit,
    responseSerialize: serialize_coreum_asset_ft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_ft_v1_EmptyResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
