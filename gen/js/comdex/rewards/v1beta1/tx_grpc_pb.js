// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_rewards_v1beta1_tx_pb = require('../../../comdex/rewards/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var comdex_rewards_v1beta1_gauge_pb = require('../../../comdex/rewards/v1beta1/gauge_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLend(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLend)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsLend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLend(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLendResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLendResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsLendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLendResponse(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockers(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockers)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsLockers');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockers(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockers.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockersResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockersResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsLockersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockersResponse(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMint(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMint)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsStableMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMint(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMintResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMintResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsStableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMintResponse(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsVault(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVault)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsVault');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsVault(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVault.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_ActivateExternalRewardsVaultResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVaultResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.ActivateExternalRewardsVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsVaultResponse(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_MsgCreateGauge(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.MsgCreateGauge)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.MsgCreateGauge');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_MsgCreateGauge(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.MsgCreateGauge.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_MsgCreateGaugeResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_tx_pb.MsgCreateGaugeResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.MsgCreateGaugeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_MsgCreateGaugeResponse(buffer_arg) {
  return comdex_rewards_v1beta1_tx_pb.MsgCreateGaugeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createGauge: {
    path: '/comdex.rewards.v1beta1.Msg/CreateGauge',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_tx_pb.MsgCreateGauge,
    responseType: comdex_rewards_v1beta1_tx_pb.MsgCreateGaugeResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_MsgCreateGauge,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_MsgCreateGauge,
    responseSerialize: serialize_comdex_rewards_v1beta1_MsgCreateGaugeResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_MsgCreateGaugeResponse,
  },
  externalRewardsLockers: {
    path: '/comdex.rewards.v1beta1.Msg/ExternalRewardsLockers',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockers,
    responseType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLockersResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockers,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockers,
    responseSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockersResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLockersResponse,
  },
  externalRewardsVault: {
    path: '/comdex.rewards.v1beta1.Msg/ExternalRewardsVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVault,
    responseType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsVaultResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsVault,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsVault,
    responseSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsVaultResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsVaultResponse,
  },
  externalRewardsLend: {
    path: '/comdex.rewards.v1beta1.Msg/ExternalRewardsLend',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLend,
    responseType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsLendResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLend,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLend,
    responseSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsLendResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsLendResponse,
  },
  externalRewardsStableMint: {
    path: '/comdex.rewards.v1beta1.Msg/ExternalRewardsStableMint',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMint,
    responseType: comdex_rewards_v1beta1_tx_pb.ActivateExternalRewardsStableMintResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMint,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMint,
    responseSerialize: serialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMintResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_ActivateExternalRewardsStableMintResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
