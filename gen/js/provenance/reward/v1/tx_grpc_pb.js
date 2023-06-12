// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_reward_v1_tx_pb = require('../../../provenance/reward/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var provenance_reward_v1_reward_pb = require('../../../provenance/reward/v1/reward_pb.js');

function serialize_provenance_reward_v1_MsgClaimAllRewardsRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgClaimAllRewardsRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgClaimAllRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgClaimAllRewardsRequest(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgClaimAllRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgClaimAllRewardsResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgClaimAllRewardsResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgClaimAllRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgClaimAllRewardsResponse(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgClaimAllRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgClaimRewardsRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgClaimRewardsRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgClaimRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgClaimRewardsRequest(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgClaimRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgClaimRewardsResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgClaimRewardsResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgClaimRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgClaimRewardsResponse(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgClaimRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgCreateRewardProgramRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgCreateRewardProgramRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgCreateRewardProgramRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgCreateRewardProgramRequest(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgCreateRewardProgramRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgCreateRewardProgramResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgCreateRewardProgramResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgCreateRewardProgramResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgCreateRewardProgramResponse(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgCreateRewardProgramResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgEndRewardProgramRequest(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgEndRewardProgramRequest)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgEndRewardProgramRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgEndRewardProgramRequest(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgEndRewardProgramRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_reward_v1_MsgEndRewardProgramResponse(arg) {
  if (!(arg instanceof provenance_reward_v1_tx_pb.MsgEndRewardProgramResponse)) {
    throw new Error('Expected argument of type provenance.reward.v1.MsgEndRewardProgramResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_reward_v1_MsgEndRewardProgramResponse(buffer_arg) {
  return provenance_reward_v1_tx_pb.MsgEndRewardProgramResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg
var MsgService = exports.MsgService = {
  // CreateRewardProgram is the RPC endpoint for creating a rewards program
createRewardProgram: {
    path: '/provenance.reward.v1.Msg/CreateRewardProgram',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_tx_pb.MsgCreateRewardProgramRequest,
    responseType: provenance_reward_v1_tx_pb.MsgCreateRewardProgramResponse,
    requestSerialize: serialize_provenance_reward_v1_MsgCreateRewardProgramRequest,
    requestDeserialize: deserialize_provenance_reward_v1_MsgCreateRewardProgramRequest,
    responseSerialize: serialize_provenance_reward_v1_MsgCreateRewardProgramResponse,
    responseDeserialize: deserialize_provenance_reward_v1_MsgCreateRewardProgramResponse,
  },
  // EndRewardProgram is the RPC endpoint for ending a rewards program
endRewardProgram: {
    path: '/provenance.reward.v1.Msg/EndRewardProgram',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_tx_pb.MsgEndRewardProgramRequest,
    responseType: provenance_reward_v1_tx_pb.MsgEndRewardProgramResponse,
    requestSerialize: serialize_provenance_reward_v1_MsgEndRewardProgramRequest,
    requestDeserialize: deserialize_provenance_reward_v1_MsgEndRewardProgramRequest,
    responseSerialize: serialize_provenance_reward_v1_MsgEndRewardProgramResponse,
    responseDeserialize: deserialize_provenance_reward_v1_MsgEndRewardProgramResponse,
  },
  // ClaimRewards is the RPC endpoint for claiming rewards belonging to completed claim periods of a reward program
claimRewards: {
    path: '/provenance.reward.v1.Msg/ClaimRewards',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_tx_pb.MsgClaimRewardsRequest,
    responseType: provenance_reward_v1_tx_pb.MsgClaimRewardsResponse,
    requestSerialize: serialize_provenance_reward_v1_MsgClaimRewardsRequest,
    requestDeserialize: deserialize_provenance_reward_v1_MsgClaimRewardsRequest,
    responseSerialize: serialize_provenance_reward_v1_MsgClaimRewardsResponse,
    responseDeserialize: deserialize_provenance_reward_v1_MsgClaimRewardsResponse,
  },
  // ClaimAllRewards is the RPC endpoint for claiming rewards for completed claim periods of every reward program for
// the signer of the tx.
claimAllRewards: {
    path: '/provenance.reward.v1.Msg/ClaimAllRewards',
    requestStream: false,
    responseStream: false,
    requestType: provenance_reward_v1_tx_pb.MsgClaimAllRewardsRequest,
    responseType: provenance_reward_v1_tx_pb.MsgClaimAllRewardsResponse,
    requestSerialize: serialize_provenance_reward_v1_MsgClaimAllRewardsRequest,
    requestDeserialize: deserialize_provenance_reward_v1_MsgClaimAllRewardsRequest,
    responseSerialize: serialize_provenance_reward_v1_MsgClaimAllRewardsResponse,
    responseDeserialize: deserialize_provenance_reward_v1_MsgClaimAllRewardsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
