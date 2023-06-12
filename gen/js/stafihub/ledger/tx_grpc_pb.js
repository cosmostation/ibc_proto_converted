// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_ledger_tx_pb = require('../../stafihub/ledger/tx_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var stafihub_ledger_ledger_pb = require('../../stafihub/ledger/ledger_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShots(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShots)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShots(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShots.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShotsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShotsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShotsResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShotsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgInitPool(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgInitPool)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgInitPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgInitPool(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgInitPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgInitPoolResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgInitPoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgInitPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgInitPoolResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgInitPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgLiquidityUnbond(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgLiquidityUnbond)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgLiquidityUnbond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgLiquidityUnbond(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgLiquidityUnbond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgLiquidityUnbondResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgLiquidityUnbondResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgLiquidityUnbondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgLiquidityUnbondResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgLiquidityUnbondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgMigrateInit(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgMigrateInit)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgMigrateInit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgMigrateInit(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgMigrateInit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgMigrateInitResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgMigrateInitResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgMigrateInitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgMigrateInitResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgMigrateInitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgMigrateUnbondings(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgMigrateUnbondings)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgMigrateUnbondings');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgMigrateUnbondings(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgMigrateUnbondings.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgMigrateUnbondingsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgMigrateUnbondingsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgMigrateUnbondingsResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgMigrateUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgRegisterIcaPool(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgRegisterIcaPool)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgRegisterIcaPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgRegisterIcaPool(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgRegisterIcaPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgRegisterIcaPoolResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgRegisterIcaPoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgRegisterIcaPoolResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgRegisterIcaPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgRmBondedPool(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgRmBondedPool)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgRmBondedPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgRmBondedPool(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgRmBondedPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgRmBondedPoolResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgRmBondedPoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgRmBondedPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgRmBondedPoolResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgRmBondedPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetEraSeconds(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetEraSeconds)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetEraSeconds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetEraSeconds(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetEraSeconds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetEraSecondsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetEraSecondsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetEraSecondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetEraSecondsResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetEraSecondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimit(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetEraUnbondLimit)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetEraUnbondLimit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimit(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetEraUnbondLimit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimitResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetEraUnbondLimitResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimitResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetEraUnbondLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetLeastBond(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetLeastBond)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetLeastBond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetLeastBond(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetLeastBond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetLeastBondResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetLeastBondResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetLeastBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetLeastBondResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetLeastBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetPoolDetail(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetPoolDetail)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetPoolDetail');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetPoolDetail(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetPoolDetail.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetPoolDetailResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetPoolDetailResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetPoolDetailResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetPoolDetailResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetPoolDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetPoolStatus(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetPoolStatus)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetPoolStatus');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetPoolStatus(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetPoolStatus.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetPoolStatusResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetPoolStatusResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetPoolStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetPoolStatusResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetPoolStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiver(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiver)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiver(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiver.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiverResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRParams(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRParams)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRParams(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRParamsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRParamsResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiver(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRelayFeeReceiver)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRelayFeeReceiver');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiver(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRelayFeeReceiver.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRelayFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiverResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRelayFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRelayGasPrice(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRelayGasPrice)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRelayGasPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRelayGasPrice(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRelayGasPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetRelayGasPriceResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetRelayGasPriceResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetRelayGasPriceResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetRelayGasPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommission(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetStakingRewardCommission)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetStakingRewardCommission');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommission(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetStakingRewardCommission.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommissionResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetStakingRewardCommissionResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommissionResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetStakingRewardCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetUnbondCommission(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetUnbondCommission)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetUnbondCommission');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetUnbondCommission(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetUnbondCommission.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetUnbondCommissionResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetUnbondCommissionResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetUnbondCommissionResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetUnbondCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFee(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetUnbondRelayFee)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetUnbondRelayFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFee(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetUnbondRelayFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFeeResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetUnbondRelayFeeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFeeResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetUnbondRelayFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddr(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetWithdrawalAddr)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetWithdrawalAddr');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddr(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetWithdrawalAddr.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddrResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSetWithdrawalAddrResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddrResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSetWithdrawalAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSubmitSignature(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSubmitSignature)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSubmitSignature');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSubmitSignature(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSubmitSignature.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgSubmitSignatureResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgSubmitSignatureResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgSubmitSignatureResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgSubmitSignatureResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgSubmitSignatureResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitch(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgToggleUnbondSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgToggleUnbondSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitch(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgToggleUnbondSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitchResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgToggleUnbondSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitchResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgToggleUnbondSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgUnsealMigrateInit(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgUnsealMigrateInit)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgUnsealMigrateInit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgUnsealMigrateInit(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgUnsealMigrateInit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_MsgUnsealMigrateInitResponse(arg) {
  if (!(arg instanceof stafihub_ledger_tx_pb.MsgUnsealMigrateInitResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_MsgUnsealMigrateInitResponse(buffer_arg) {
  return stafihub_ledger_tx_pb.MsgUnsealMigrateInitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setEraUnbondLimit: {
    path: '/stafihub.stafihub.ledger.Msg/SetEraUnbondLimit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetEraUnbondLimit,
    responseType: stafihub_ledger_tx_pb.MsgSetEraUnbondLimitResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimit,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimit,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimitResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetEraUnbondLimitResponse,
  },
  setPoolDetail: {
    path: '/stafihub.stafihub.ledger.Msg/SetPoolDetail',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetPoolDetail,
    responseType: stafihub_ledger_tx_pb.MsgSetPoolDetailResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetPoolDetail,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetPoolDetail,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetPoolDetailResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetPoolDetailResponse,
  },
  setLeastBond: {
    path: '/stafihub.stafihub.ledger.Msg/SetLeastBond',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetLeastBond,
    responseType: stafihub_ledger_tx_pb.MsgSetLeastBondResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetLeastBond,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetLeastBond,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetLeastBondResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetLeastBondResponse,
  },
  clearCurrentEraSnapShots: {
    path: '/stafihub.stafihub.ledger.Msg/ClearCurrentEraSnapShots',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShots,
    responseType: stafihub_ledger_tx_pb.MsgClearCurrentEraSnapShotsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShots,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShots,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShotsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgClearCurrentEraSnapShotsResponse,
  },
  setStakingRewardCommission: {
    path: '/stafihub.stafihub.ledger.Msg/SetStakingRewardCommission',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetStakingRewardCommission,
    responseType: stafihub_ledger_tx_pb.MsgSetStakingRewardCommissionResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommission,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommission,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommissionResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetStakingRewardCommissionResponse,
  },
  setProtocolFeeReceiver: {
    path: '/stafihub.stafihub.ledger.Msg/SetProtocolFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiver,
    responseType: stafihub_ledger_tx_pb.MsgSetProtocolFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiver,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiver,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetProtocolFeeReceiverResponse,
  },
  setUnbondRelayFee: {
    path: '/stafihub.stafihub.ledger.Msg/SetUnbondRelayFee',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetUnbondRelayFee,
    responseType: stafihub_ledger_tx_pb.MsgSetUnbondRelayFeeResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFee,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFee,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFeeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetUnbondRelayFeeResponse,
  },
  liquidityUnbond: {
    path: '/stafihub.stafihub.ledger.Msg/LiquidityUnbond',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgLiquidityUnbond,
    responseType: stafihub_ledger_tx_pb.MsgLiquidityUnbondResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgLiquidityUnbond,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgLiquidityUnbond,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgLiquidityUnbondResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgLiquidityUnbondResponse,
  },
  setUnbondCommission: {
    path: '/stafihub.stafihub.ledger.Msg/SetUnbondCommission',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetUnbondCommission,
    responseType: stafihub_ledger_tx_pb.MsgSetUnbondCommissionResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetUnbondCommission,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetUnbondCommission,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetUnbondCommissionResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetUnbondCommissionResponse,
  },
  submitSignature: {
    path: '/stafihub.stafihub.ledger.Msg/SubmitSignature',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSubmitSignature,
    responseType: stafihub_ledger_tx_pb.MsgSubmitSignatureResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSubmitSignature,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSubmitSignature,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSubmitSignatureResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSubmitSignatureResponse,
  },
  setRParams: {
    path: '/stafihub.stafihub.ledger.Msg/SetRParams',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetRParams,
    responseType: stafihub_ledger_tx_pb.MsgSetRParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetRParams,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRParams,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetRParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRParamsResponse,
  },
  setRelayFeeReceiver: {
    path: '/stafihub.stafihub.ledger.Msg/SetRelayFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetRelayFeeReceiver,
    responseType: stafihub_ledger_tx_pb.MsgSetRelayFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiver,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiver,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRelayFeeReceiverResponse,
  },
  setRelayGasPrice: {
    path: '/stafihub.stafihub.ledger.Msg/SetRelayGasPrice',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetRelayGasPrice,
    responseType: stafihub_ledger_tx_pb.MsgSetRelayGasPriceResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetRelayGasPrice,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRelayGasPrice,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetRelayGasPriceResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetRelayGasPriceResponse,
  },
  setEraSeconds: {
    path: '/stafihub.stafihub.ledger.Msg/SetEraSeconds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetEraSeconds,
    responseType: stafihub_ledger_tx_pb.MsgSetEraSecondsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetEraSeconds,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetEraSeconds,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetEraSecondsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetEraSecondsResponse,
  },
  rmBondedPool: {
    path: '/stafihub.stafihub.ledger.Msg/RmBondedPool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgRmBondedPool,
    responseType: stafihub_ledger_tx_pb.MsgRmBondedPoolResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgRmBondedPool,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgRmBondedPool,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgRmBondedPoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgRmBondedPoolResponse,
  },
  migrateInit: {
    path: '/stafihub.stafihub.ledger.Msg/MigrateInit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgMigrateInit,
    responseType: stafihub_ledger_tx_pb.MsgMigrateInitResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgMigrateInit,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgMigrateInit,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgMigrateInitResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgMigrateInitResponse,
  },
  migrateUnbondings: {
    path: '/stafihub.stafihub.ledger.Msg/MigrateUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgMigrateUnbondings,
    responseType: stafihub_ledger_tx_pb.MsgMigrateUnbondingsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgMigrateUnbondings,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgMigrateUnbondings,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgMigrateUnbondingsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgMigrateUnbondingsResponse,
  },
  toggleUnbondSwitch: {
    path: '/stafihub.stafihub.ledger.Msg/ToggleUnbondSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgToggleUnbondSwitch,
    responseType: stafihub_ledger_tx_pb.MsgToggleUnbondSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitch,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgToggleUnbondSwitchResponse,
  },
  unsealMigrateInit: {
    path: '/stafihub.stafihub.ledger.Msg/UnsealMigrateInit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgUnsealMigrateInit,
    responseType: stafihub_ledger_tx_pb.MsgUnsealMigrateInitResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgUnsealMigrateInit,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgUnsealMigrateInit,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgUnsealMigrateInitResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgUnsealMigrateInitResponse,
  },
  registerIcaPool: {
    path: '/stafihub.stafihub.ledger.Msg/RegisterIcaPool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgRegisterIcaPool,
    responseType: stafihub_ledger_tx_pb.MsgRegisterIcaPoolResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgRegisterIcaPool,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgRegisterIcaPool,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgRegisterIcaPoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgRegisterIcaPoolResponse,
  },
  setWithdrawalAddr: {
    path: '/stafihub.stafihub.ledger.Msg/SetWithdrawalAddr',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetWithdrawalAddr,
    responseType: stafihub_ledger_tx_pb.MsgSetWithdrawalAddrResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddr,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddr,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddrResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetWithdrawalAddrResponse,
  },
  initPool: {
    path: '/stafihub.stafihub.ledger.Msg/InitPool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgInitPool,
    responseType: stafihub_ledger_tx_pb.MsgInitPoolResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgInitPool,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgInitPool,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgInitPoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgInitPoolResponse,
  },
  setPoolStatus: {
    path: '/stafihub.stafihub.ledger.Msg/SetPoolStatus',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_tx_pb.MsgSetPoolStatus,
    responseType: stafihub_ledger_tx_pb.MsgSetPoolStatusResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_MsgSetPoolStatus,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetPoolStatus,
    responseSerialize: serialize_stafihub_stafihub_ledger_MsgSetPoolStatusResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_MsgSetPoolStatusResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
