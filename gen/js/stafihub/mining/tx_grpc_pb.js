// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_mining_tx_pb = require('../../stafihub/mining/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_mining_MsgAddMiningProvider(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddMiningProvider)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddMiningProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddMiningProvider(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddMiningProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddMiningProviderResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddMiningProviderResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddMiningProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddMiningProviderResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddMiningProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddReward(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddReward)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddReward(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddRewardPool(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddRewardPool)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddRewardPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddRewardPool(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddRewardPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddRewardPoolResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddRewardPoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddRewardPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddRewardPoolResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddRewardPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddRewardResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddRewardResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddRewardResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddRewardToken(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddRewardToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddRewardToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddRewardToken(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddRewardToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddRewardTokenResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddRewardTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddRewardTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddRewardTokenResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddRewardTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakeItem(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakeItem)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakeItem');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakeItem(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakeItem.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakeItemResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakeItemResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakeItemResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakeItemResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakeItemResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakePool(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakePool)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakePool(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakePoolResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakePoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakePoolResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakeToken(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakeToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakeToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakeToken(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakeToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgAddStakeTokenResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgAddStakeTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgAddStakeTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgAddStakeTokenResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgAddStakeTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgClaimReward(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgClaimReward)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgClaimReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgClaimReward(buffer_arg) {
  return stafihub_mining_tx_pb.MsgClaimReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgClaimRewardResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgClaimRewardResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgClaimRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgClaimRewardResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgClaimRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgEmergencyWithdraw(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgEmergencyWithdraw)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgEmergencyWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgEmergencyWithdraw(buffer_arg) {
  return stafihub_mining_tx_pb.MsgEmergencyWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgEmergencyWithdrawResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgEmergencyWithdrawResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgEmergencyWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgEmergencyWithdrawResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgEmergencyWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmMiningProvider(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmMiningProvider)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmMiningProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmMiningProvider(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmMiningProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmMiningProviderResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmMiningProviderResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmMiningProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmMiningProviderResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmMiningProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmRewardToken(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmRewardToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmRewardToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmRewardToken(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmRewardToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmRewardTokenResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmRewardTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmRewardTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmRewardTokenResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmRewardTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmStakeToken(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmStakeToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmStakeToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmStakeToken(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmStakeToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgRmStakeTokenResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgRmStakeTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgRmStakeTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgRmStakeTokenResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgRmStakeTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumber(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumber)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumber(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumber.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumberResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumberResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumberResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumber(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetMaxStakeItemNumber)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetMaxStakeItemNumber');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumber(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetMaxStakeItemNumber.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumberResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetMaxStakeItemNumberResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumberResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetMaxStakeItemNumberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetStakeItemLimit(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetStakeItemLimit)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetStakeItemLimit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetStakeItemLimit(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetStakeItemLimit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgSetStakeItemLimitResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgSetStakeItemLimitResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgSetStakeItemLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgSetStakeItemLimitResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgSetStakeItemLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgStake(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgStake)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgStake(buffer_arg) {
  return stafihub_mining_tx_pb.MsgStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgStakeResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgStakeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgStakeResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgToggleEmergencySwitch(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgToggleEmergencySwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgToggleEmergencySwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgToggleEmergencySwitch(buffer_arg) {
  return stafihub_mining_tx_pb.MsgToggleEmergencySwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgToggleEmergencySwitchResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgToggleEmergencySwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgToggleEmergencySwitchResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgToggleEmergencySwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgToggleProviderSwitch(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgToggleProviderSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgToggleProviderSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgToggleProviderSwitch(buffer_arg) {
  return stafihub_mining_tx_pb.MsgToggleProviderSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgToggleProviderSwitchResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgToggleProviderSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgToggleProviderSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgToggleProviderSwitchResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgToggleProviderSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgUpdateRewardPool(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgUpdateRewardPool)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgUpdateRewardPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgUpdateRewardPool(buffer_arg) {
  return stafihub_mining_tx_pb.MsgUpdateRewardPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgUpdateRewardPoolResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgUpdateRewardPoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgUpdateRewardPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgUpdateRewardPoolResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgUpdateRewardPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgUpdateStakeItem(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgUpdateStakeItem)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgUpdateStakeItem');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgUpdateStakeItem(buffer_arg) {
  return stafihub_mining_tx_pb.MsgUpdateStakeItem.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgUpdateStakeItemResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgUpdateStakeItemResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgUpdateStakeItemResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgUpdateStakeItemResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgUpdateStakeItemResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgWithdraw(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgWithdraw(buffer_arg) {
  return stafihub_mining_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgWithdrawResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgWithdrawResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgWithdrawRewardToken(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgWithdrawRewardToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgWithdrawRewardToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgWithdrawRewardToken(buffer_arg) {
  return stafihub_mining_tx_pb.MsgWithdrawRewardToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_MsgWithdrawRewardTokenResponse(arg) {
  if (!(arg instanceof stafihub_mining_tx_pb.MsgWithdrawRewardTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.MsgWithdrawRewardTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_MsgWithdrawRewardTokenResponse(buffer_arg) {
  return stafihub_mining_tx_pb.MsgWithdrawRewardTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  addStakePool: {
    path: '/stafihub.stafihub.mining.Msg/AddStakePool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddStakePool,
    responseType: stafihub_mining_tx_pb.MsgAddStakePoolResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddStakePool,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakePool,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddStakePoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakePoolResponse,
  },
  addStakeItem: {
    path: '/stafihub.stafihub.mining.Msg/AddStakeItem',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddStakeItem,
    responseType: stafihub_mining_tx_pb.MsgAddStakeItemResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddStakeItem,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakeItem,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddStakeItemResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakeItemResponse,
  },
  addRewardPool: {
    path: '/stafihub.stafihub.mining.Msg/AddRewardPool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddRewardPool,
    responseType: stafihub_mining_tx_pb.MsgAddRewardPoolResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddRewardPool,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddRewardPool,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddRewardPoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddRewardPoolResponse,
  },
  stake: {
    path: '/stafihub.stafihub.mining.Msg/Stake',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgStake,
    responseType: stafihub_mining_tx_pb.MsgStakeResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgStake,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgStake,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgStakeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgStakeResponse,
  },
  claimReward: {
    path: '/stafihub.stafihub.mining.Msg/ClaimReward',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgClaimReward,
    responseType: stafihub_mining_tx_pb.MsgClaimRewardResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgClaimReward,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgClaimReward,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgClaimRewardResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgClaimRewardResponse,
  },
  withdraw: {
    path: '/stafihub.stafihub.mining.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgWithdraw,
    responseType: stafihub_mining_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgWithdraw,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgWithdraw,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgWithdrawResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgWithdrawResponse,
  },
  updateStakeItem: {
    path: '/stafihub.stafihub.mining.Msg/UpdateStakeItem',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgUpdateStakeItem,
    responseType: stafihub_mining_tx_pb.MsgUpdateStakeItemResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgUpdateStakeItem,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgUpdateStakeItem,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgUpdateStakeItemResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgUpdateStakeItemResponse,
  },
  addMiningProvider: {
    path: '/stafihub.stafihub.mining.Msg/AddMiningProvider',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddMiningProvider,
    responseType: stafihub_mining_tx_pb.MsgAddMiningProviderResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddMiningProvider,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddMiningProvider,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddMiningProviderResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddMiningProviderResponse,
  },
  rmMiningProvider: {
    path: '/stafihub.stafihub.mining.Msg/RmMiningProvider',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgRmMiningProvider,
    responseType: stafihub_mining_tx_pb.MsgRmMiningProviderResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgRmMiningProvider,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgRmMiningProvider,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgRmMiningProviderResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgRmMiningProviderResponse,
  },
  addRewardToken: {
    path: '/stafihub.stafihub.mining.Msg/AddRewardToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddRewardToken,
    responseType: stafihub_mining_tx_pb.MsgAddRewardTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddRewardToken,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddRewardToken,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddRewardTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddRewardTokenResponse,
  },
  setMaxRewardPoolNumber: {
    path: '/stafihub.stafihub.mining.Msg/SetMaxRewardPoolNumber',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumber,
    responseType: stafihub_mining_tx_pb.MsgSetMaxRewardPoolNumberResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumber,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumber,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumberResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgSetMaxRewardPoolNumberResponse,
  },
  updateRewardPool: {
    path: '/stafihub.stafihub.mining.Msg/UpdateRewardPool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgUpdateRewardPool,
    responseType: stafihub_mining_tx_pb.MsgUpdateRewardPoolResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgUpdateRewardPool,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgUpdateRewardPool,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgUpdateRewardPoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgUpdateRewardPoolResponse,
  },
  toggleProviderSwitch: {
    path: '/stafihub.stafihub.mining.Msg/ToggleProviderSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgToggleProviderSwitch,
    responseType: stafihub_mining_tx_pb.MsgToggleProviderSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgToggleProviderSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgToggleProviderSwitch,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgToggleProviderSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgToggleProviderSwitchResponse,
  },
  setMaxStakeItemNumber: {
    path: '/stafihub.stafihub.mining.Msg/SetMaxStakeItemNumber',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgSetMaxStakeItemNumber,
    responseType: stafihub_mining_tx_pb.MsgSetMaxStakeItemNumberResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumber,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumber,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumberResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgSetMaxStakeItemNumberResponse,
  },
  addReward: {
    path: '/stafihub.stafihub.mining.Msg/AddReward',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddReward,
    responseType: stafihub_mining_tx_pb.MsgAddRewardResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddReward,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddReward,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddRewardResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddRewardResponse,
  },
  toggleEmergencySwitch: {
    path: '/stafihub.stafihub.mining.Msg/ToggleEmergencySwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgToggleEmergencySwitch,
    responseType: stafihub_mining_tx_pb.MsgToggleEmergencySwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgToggleEmergencySwitch,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgToggleEmergencySwitch,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgToggleEmergencySwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgToggleEmergencySwitchResponse,
  },
  emergencyWithdraw: {
    path: '/stafihub.stafihub.mining.Msg/EmergencyWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgEmergencyWithdraw,
    responseType: stafihub_mining_tx_pb.MsgEmergencyWithdrawResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgEmergencyWithdraw,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgEmergencyWithdraw,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgEmergencyWithdrawResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgEmergencyWithdrawResponse,
  },
  addStakeToken: {
    path: '/stafihub.stafihub.mining.Msg/AddStakeToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgAddStakeToken,
    responseType: stafihub_mining_tx_pb.MsgAddStakeTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgAddStakeToken,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakeToken,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgAddStakeTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgAddStakeTokenResponse,
  },
  rmRewardToken: {
    path: '/stafihub.stafihub.mining.Msg/RmRewardToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgRmRewardToken,
    responseType: stafihub_mining_tx_pb.MsgRmRewardTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgRmRewardToken,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgRmRewardToken,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgRmRewardTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgRmRewardTokenResponse,
  },
  rmStakeToken: {
    path: '/stafihub.stafihub.mining.Msg/RmStakeToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgRmStakeToken,
    responseType: stafihub_mining_tx_pb.MsgRmStakeTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgRmStakeToken,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgRmStakeToken,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgRmStakeTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgRmStakeTokenResponse,
  },
  setStakeItemLimit: {
    path: '/stafihub.stafihub.mining.Msg/SetStakeItemLimit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgSetStakeItemLimit,
    responseType: stafihub_mining_tx_pb.MsgSetStakeItemLimitResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgSetStakeItemLimit,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgSetStakeItemLimit,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgSetStakeItemLimitResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgSetStakeItemLimitResponse,
  },
  withdrawRewardToken: {
    path: '/stafihub.stafihub.mining.Msg/WithdrawRewardToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_tx_pb.MsgWithdrawRewardToken,
    responseType: stafihub_mining_tx_pb.MsgWithdrawRewardTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_MsgWithdrawRewardToken,
    requestDeserialize: deserialize_stafihub_stafihub_mining_MsgWithdrawRewardToken,
    responseSerialize: serialize_stafihub_stafihub_mining_MsgWithdrawRewardTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_MsgWithdrawRewardTokenResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
