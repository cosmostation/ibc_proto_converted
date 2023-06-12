// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rmintreward_tx_pb = require('../../stafihub/rmintreward/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var stafihub_rmintreward_models_pb = require('../../stafihub/rmintreward/models_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_rmintreward_MsgAddMintRewardAct(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgAddMintRewardAct)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgAddMintRewardAct');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgAddMintRewardAct(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgAddMintRewardAct.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgAddMintRewardActResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgAddMintRewardActResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgAddMintRewardActResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgAddMintRewardActResponse(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgAddMintRewardActResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgClaimMintReward(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgClaimMintReward)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgClaimMintReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgClaimMintReward(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgClaimMintReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgClaimMintRewardResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgClaimMintRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgClaimMintRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgProvideRewardToken(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgProvideRewardToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgProvideRewardToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgProvideRewardToken(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgProvideRewardToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgProvideRewardTokenResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgProvideRewardTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgProvideRewardTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgProvideRewardTokenResponse(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgProvideRewardTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardAct(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgUpdateMintRewardAct)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgUpdateMintRewardAct');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardAct(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgUpdateMintRewardAct.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardActResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_tx_pb.MsgUpdateMintRewardActResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.MsgUpdateMintRewardActResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardActResponse(buffer_arg) {
  return stafihub_rmintreward_tx_pb.MsgUpdateMintRewardActResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  addMintRewardAct: {
    path: '/stafihub.stafihub.rmintreward.Msg/AddMintRewardAct',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_tx_pb.MsgAddMintRewardAct,
    responseType: stafihub_rmintreward_tx_pb.MsgAddMintRewardActResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_MsgAddMintRewardAct,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgAddMintRewardAct,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_MsgAddMintRewardActResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgAddMintRewardActResponse,
  },
  updateMintRewardAct: {
    path: '/stafihub.stafihub.rmintreward.Msg/UpdateMintRewardAct',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_tx_pb.MsgUpdateMintRewardAct,
    responseType: stafihub_rmintreward_tx_pb.MsgUpdateMintRewardActResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardAct,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardAct,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardActResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgUpdateMintRewardActResponse,
  },
  claimMintReward: {
    path: '/stafihub.stafihub.rmintreward.Msg/ClaimMintReward',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_tx_pb.MsgClaimMintReward,
    responseType: stafihub_rmintreward_tx_pb.MsgClaimMintRewardResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_MsgClaimMintReward,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgClaimMintReward,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgClaimMintRewardResponse,
  },
  provideRewardToken: {
    path: '/stafihub.stafihub.rmintreward.Msg/ProvideRewardToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_tx_pb.MsgProvideRewardToken,
    responseType: stafihub_rmintreward_tx_pb.MsgProvideRewardTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_MsgProvideRewardToken,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgProvideRewardToken,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_MsgProvideRewardTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_MsgProvideRewardTokenResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
