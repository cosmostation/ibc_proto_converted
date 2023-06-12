// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_shield_v1alpha1_tx_pb = require('../../../shentu/shield/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var shentu_shield_v1alpha1_shield_pb = require('../../../shentu/shield/v1alpha1/shield_pb.js');

function serialize_shentu_shield_v1alpha1_MsgCreatePool(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgCreatePool(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgCreatePoolResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgDepositCollateral(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgDepositCollateral)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgDepositCollateral');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgDepositCollateral(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgDepositCollateral.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgDepositCollateralResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgDepositCollateralResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgDepositCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgDepositCollateralResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgDepositCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgPausePool(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgPausePool)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgPausePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgPausePool(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgPausePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgPausePoolResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgPausePoolResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgPausePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgPausePoolResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgPausePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgPurchaseShield(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgPurchaseShield)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgPurchaseShield');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgPurchaseShield(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgPurchaseShield.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgPurchaseShieldResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgPurchaseShieldResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgPurchaseShieldResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgPurchaseShieldResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgPurchaseShieldResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgResumePool(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgResumePool)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgResumePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgResumePool(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgResumePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgResumePoolResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgResumePoolResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgResumePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgResumePoolResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgResumePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgStakeForShield(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgStakeForShield)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgStakeForShield');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgStakeForShield(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgStakeForShield.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgStakeForShieldResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgStakeForShieldResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgStakeForShieldResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgStakeForShieldResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgStakeForShieldResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUnstakeFromShield(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShield)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUnstakeFromShield');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUnstakeFromShield(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShield.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUnstakeFromShieldResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShieldResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUnstakeFromShieldResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUnstakeFromShieldResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShieldResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUpdatePool(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUpdatePool)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUpdatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUpdatePool(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUpdatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUpdatePoolResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUpdatePoolResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUpdatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUpdatePoolResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUpdatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUpdateSponsor(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsor)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUpdateSponsor');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUpdateSponsor(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsor.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgUpdateSponsorResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsorResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgUpdateSponsorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgUpdateSponsorResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawCollateral(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateral)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawCollateral');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawCollateral(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateral.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawCollateralResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateralResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawCollateralResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewards(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewards)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawForeignRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewards(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewardsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewardsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawForeignRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewardsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawReimbursement(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursement)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawReimbursement');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawReimbursement(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursement.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawReimbursementResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursementResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawReimbursementResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawReimbursementResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursementResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawRewards(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewards)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawRewards(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_MsgWithdrawRewardsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewardsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.MsgWithdrawRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_MsgWithdrawRewardsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the shield Msg service.
var MsgService = exports.MsgService = {
  createPool: {
    path: '/shentu.shield.v1alpha1.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgCreatePool,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgCreatePool,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgCreatePool,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgCreatePoolResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgCreatePoolResponse,
  },
  updatePool: {
    path: '/shentu.shield.v1alpha1.Msg/UpdatePool',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgUpdatePool,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgUpdatePoolResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgUpdatePool,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgUpdatePool,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgUpdatePoolResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgUpdatePoolResponse,
  },
  pausePool: {
    path: '/shentu.shield.v1alpha1.Msg/PausePool',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgPausePool,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgPausePoolResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgPausePool,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgPausePool,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgPausePoolResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgPausePoolResponse,
  },
  resumePool: {
    path: '/shentu.shield.v1alpha1.Msg/ResumePool',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgResumePool,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgResumePoolResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgResumePool,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgResumePool,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgResumePoolResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgResumePoolResponse,
  },
  depositCollateral: {
    path: '/shentu.shield.v1alpha1.Msg/DepositCollateral',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgDepositCollateral,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgDepositCollateralResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgDepositCollateral,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgDepositCollateral,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgDepositCollateralResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgDepositCollateralResponse,
  },
  withdrawCollateral: {
    path: '/shentu.shield.v1alpha1.Msg/WithdrawCollateral',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateral,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawCollateralResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawCollateral,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawCollateral,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawCollateralResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawCollateralResponse,
  },
  withdrawRewards: {
    path: '/shentu.shield.v1alpha1.Msg/WithdrawRewards',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewards,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawRewardsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawRewards,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawRewards,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawRewardsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawRewardsResponse,
  },
  withdrawForeignRewards: {
    path: '/shentu.shield.v1alpha1.Msg/WithdrawForeignRewards',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewards,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawForeignRewardsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewards,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewards,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewardsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawForeignRewardsResponse,
  },
  purchaseShield: {
    path: '/shentu.shield.v1alpha1.Msg/PurchaseShield',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgPurchaseShield,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgPurchaseShieldResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgPurchaseShield,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgPurchaseShield,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgPurchaseShieldResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgPurchaseShieldResponse,
  },
  withdrawReimbursement: {
    path: '/shentu.shield.v1alpha1.Msg/WithdrawReimbursement',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursement,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgWithdrawReimbursementResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawReimbursement,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawReimbursement,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgWithdrawReimbursementResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgWithdrawReimbursementResponse,
  },
  updateSponsor: {
    path: '/shentu.shield.v1alpha1.Msg/UpdateSponsor',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsor,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgUpdateSponsorResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgUpdateSponsor,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgUpdateSponsor,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgUpdateSponsorResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgUpdateSponsorResponse,
  },
  stakeForShield: {
    path: '/shentu.shield.v1alpha1.Msg/StakeForShield',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgStakeForShield,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgStakeForShieldResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgStakeForShield,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgStakeForShield,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgStakeForShieldResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgStakeForShieldResponse,
  },
  unstakeFromShield: {
    path: '/shentu.shield.v1alpha1.Msg/UnstakeFromShield',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShield,
    responseType: shentu_shield_v1alpha1_tx_pb.MsgUnstakeFromShieldResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_MsgUnstakeFromShield,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_MsgUnstakeFromShield,
    responseSerialize: serialize_shentu_shield_v1alpha1_MsgUnstakeFromShieldResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_MsgUnstakeFromShieldResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
