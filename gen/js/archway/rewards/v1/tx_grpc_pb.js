// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var archway_rewards_v1_tx_pb = require('../../../archway/rewards/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var archway_rewards_v1_rewards_pb = require('../../../archway/rewards/v1/rewards_pb.js');

function serialize_archway_rewards_v1_MsgSetContractMetadata(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgSetContractMetadata)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgSetContractMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgSetContractMetadata(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgSetContractMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_MsgSetContractMetadataResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgSetContractMetadataResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgSetContractMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgSetContractMetadataResponse(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgSetContractMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_MsgSetFlatFee(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgSetFlatFee)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgSetFlatFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgSetFlatFee(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgSetFlatFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_MsgSetFlatFeeResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgSetFlatFeeResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgSetFlatFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgSetFlatFeeResponse(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgSetFlatFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_MsgWithdrawRewards(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgWithdrawRewards)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgWithdrawRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgWithdrawRewards(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgWithdrawRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_MsgWithdrawRewardsResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_tx_pb.MsgWithdrawRewardsResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.MsgWithdrawRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_MsgWithdrawRewardsResponse(buffer_arg) {
  return archway_rewards_v1_tx_pb.MsgWithdrawRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the module messaging service.
var MsgService = exports.MsgService = {
  // SetContractMetadata creates or updates an existing contract metadata.
// Method is authorized to the contract owner (admin if no metadata exists).
setContractMetadata: {
    path: '/archway.rewards.v1.Msg/SetContractMetadata',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_tx_pb.MsgSetContractMetadata,
    responseType: archway_rewards_v1_tx_pb.MsgSetContractMetadataResponse,
    requestSerialize: serialize_archway_rewards_v1_MsgSetContractMetadata,
    requestDeserialize: deserialize_archway_rewards_v1_MsgSetContractMetadata,
    responseSerialize: serialize_archway_rewards_v1_MsgSetContractMetadataResponse,
    responseDeserialize: deserialize_archway_rewards_v1_MsgSetContractMetadataResponse,
  },
  // WithdrawRewards performs collected rewards distribution.
// Rewards might be credited from multiple contracts (rewards_address must be
// set in the corresponding contract metadata).
withdrawRewards: {
    path: '/archway.rewards.v1.Msg/WithdrawRewards',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_tx_pb.MsgWithdrawRewards,
    responseType: archway_rewards_v1_tx_pb.MsgWithdrawRewardsResponse,
    requestSerialize: serialize_archway_rewards_v1_MsgWithdrawRewards,
    requestDeserialize: deserialize_archway_rewards_v1_MsgWithdrawRewards,
    responseSerialize: serialize_archway_rewards_v1_MsgWithdrawRewardsResponse,
    responseDeserialize: deserialize_archway_rewards_v1_MsgWithdrawRewardsResponse,
  },
  // SetFlatFee sets or updates or removes the flat fee to interact with the
// contract Method is authorized to the contract owner.
setFlatFee: {
    path: '/archway.rewards.v1.Msg/SetFlatFee',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_tx_pb.MsgSetFlatFee,
    responseType: archway_rewards_v1_tx_pb.MsgSetFlatFeeResponse,
    requestSerialize: serialize_archway_rewards_v1_MsgSetFlatFee,
    requestDeserialize: deserialize_archway_rewards_v1_MsgSetFlatFee,
    responseSerialize: serialize_archway_rewards_v1_MsgSetFlatFeeResponse,
    responseDeserialize: deserialize_archway_rewards_v1_MsgSetFlatFeeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
