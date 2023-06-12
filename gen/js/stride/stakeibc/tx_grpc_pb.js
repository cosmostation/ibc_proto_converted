// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_stakeibc_tx_pb = require('../../stride/stakeibc/tx_pb.js');
var stride_stakeibc_ica_account_pb = require('../../stride/stakeibc/ica_account_pb.js');
var stride_stakeibc_validator_pb = require('../../stride/stakeibc/validator_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');

function serialize_stride_stakeibc_MsgAddValidators(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgAddValidators)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgAddValidators');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgAddValidators(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgAddValidators.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgAddValidatorsResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgAddValidatorsResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgAddValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgAddValidatorsResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgAddValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgChangeValidatorWeight(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgChangeValidatorWeight)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgChangeValidatorWeight');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgChangeValidatorWeight(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgChangeValidatorWeight.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgChangeValidatorWeightResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgChangeValidatorWeightResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgChangeValidatorWeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgChangeValidatorWeightResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgChangeValidatorWeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgClaimUndelegatedTokens(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgClaimUndelegatedTokens)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgClaimUndelegatedTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgClaimUndelegatedTokens(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgClaimUndelegatedTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgClaimUndelegatedTokensResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgClaimUndelegatedTokensResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgClaimUndelegatedTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgClaimUndelegatedTokensResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgClaimUndelegatedTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgClearBalance(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgClearBalance)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgClearBalance');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgClearBalance(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgClearBalance.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgClearBalanceResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgClearBalanceResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgClearBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgClearBalanceResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgClearBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgDeleteValidator(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgDeleteValidator)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgDeleteValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgDeleteValidator(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgDeleteValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgDeleteValidatorResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgDeleteValidatorResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgDeleteValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgDeleteValidatorResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgDeleteValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgLiquidStake(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgLiquidStake)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgLiquidStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgLiquidStake(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgLiquidStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgLiquidStakeResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgLiquidStakeResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgLiquidStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgLiquidStakeResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgLiquidStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRebalanceValidators(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRebalanceValidators)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRebalanceValidators');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRebalanceValidators(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRebalanceValidators.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRebalanceValidatorsResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRebalanceValidatorsResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRebalanceValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRebalanceValidatorsResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRebalanceValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRedeemStake(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRedeemStake)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRedeemStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRedeemStake(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRedeemStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRedeemStakeResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRedeemStakeResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRedeemStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRedeemStakeResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRedeemStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRegisterHostZone(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRegisterHostZone)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRegisterHostZone');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRegisterHostZone(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRegisterHostZone.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRegisterHostZoneResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRegisterHostZoneResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRegisterHostZoneResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRegisterHostZoneResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRegisterHostZoneResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRestoreInterchainAccount(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRestoreInterchainAccount)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRestoreInterchainAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRestoreInterchainAccount(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRestoreInterchainAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgRestoreInterchainAccountResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgRestoreInterchainAccountResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgRestoreInterchainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgRestoreInterchainAccountResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgRestoreInterchainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgUpdateValidatorSharesExchRate(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRate)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgUpdateValidatorSharesExchRate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgUpdateValidatorSharesExchRate(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_MsgUpdateValidatorSharesExchRateResponse(arg) {
  if (!(arg instanceof stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRateResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.MsgUpdateValidatorSharesExchRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_MsgUpdateValidatorSharesExchRateResponse(buffer_arg) {
  return stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  liquidStake: {
    path: '/stride.stakeibc.Msg/LiquidStake',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgLiquidStake,
    responseType: stride_stakeibc_tx_pb.MsgLiquidStakeResponse,
    requestSerialize: serialize_stride_stakeibc_MsgLiquidStake,
    requestDeserialize: deserialize_stride_stakeibc_MsgLiquidStake,
    responseSerialize: serialize_stride_stakeibc_MsgLiquidStakeResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgLiquidStakeResponse,
  },
  redeemStake: {
    path: '/stride.stakeibc.Msg/RedeemStake',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgRedeemStake,
    responseType: stride_stakeibc_tx_pb.MsgRedeemStakeResponse,
    requestSerialize: serialize_stride_stakeibc_MsgRedeemStake,
    requestDeserialize: deserialize_stride_stakeibc_MsgRedeemStake,
    responseSerialize: serialize_stride_stakeibc_MsgRedeemStakeResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgRedeemStakeResponse,
  },
  registerHostZone: {
    path: '/stride.stakeibc.Msg/RegisterHostZone',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgRegisterHostZone,
    responseType: stride_stakeibc_tx_pb.MsgRegisterHostZoneResponse,
    requestSerialize: serialize_stride_stakeibc_MsgRegisterHostZone,
    requestDeserialize: deserialize_stride_stakeibc_MsgRegisterHostZone,
    responseSerialize: serialize_stride_stakeibc_MsgRegisterHostZoneResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgRegisterHostZoneResponse,
  },
  claimUndelegatedTokens: {
    path: '/stride.stakeibc.Msg/ClaimUndelegatedTokens',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgClaimUndelegatedTokens,
    responseType: stride_stakeibc_tx_pb.MsgClaimUndelegatedTokensResponse,
    requestSerialize: serialize_stride_stakeibc_MsgClaimUndelegatedTokens,
    requestDeserialize: deserialize_stride_stakeibc_MsgClaimUndelegatedTokens,
    responseSerialize: serialize_stride_stakeibc_MsgClaimUndelegatedTokensResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgClaimUndelegatedTokensResponse,
  },
  rebalanceValidators: {
    path: '/stride.stakeibc.Msg/RebalanceValidators',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgRebalanceValidators,
    responseType: stride_stakeibc_tx_pb.MsgRebalanceValidatorsResponse,
    requestSerialize: serialize_stride_stakeibc_MsgRebalanceValidators,
    requestDeserialize: deserialize_stride_stakeibc_MsgRebalanceValidators,
    responseSerialize: serialize_stride_stakeibc_MsgRebalanceValidatorsResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgRebalanceValidatorsResponse,
  },
  addValidators: {
    path: '/stride.stakeibc.Msg/AddValidators',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgAddValidators,
    responseType: stride_stakeibc_tx_pb.MsgAddValidatorsResponse,
    requestSerialize: serialize_stride_stakeibc_MsgAddValidators,
    requestDeserialize: deserialize_stride_stakeibc_MsgAddValidators,
    responseSerialize: serialize_stride_stakeibc_MsgAddValidatorsResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgAddValidatorsResponse,
  },
  changeValidatorWeight: {
    path: '/stride.stakeibc.Msg/ChangeValidatorWeight',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgChangeValidatorWeight,
    responseType: stride_stakeibc_tx_pb.MsgChangeValidatorWeightResponse,
    requestSerialize: serialize_stride_stakeibc_MsgChangeValidatorWeight,
    requestDeserialize: deserialize_stride_stakeibc_MsgChangeValidatorWeight,
    responseSerialize: serialize_stride_stakeibc_MsgChangeValidatorWeightResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgChangeValidatorWeightResponse,
  },
  deleteValidator: {
    path: '/stride.stakeibc.Msg/DeleteValidator',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgDeleteValidator,
    responseType: stride_stakeibc_tx_pb.MsgDeleteValidatorResponse,
    requestSerialize: serialize_stride_stakeibc_MsgDeleteValidator,
    requestDeserialize: deserialize_stride_stakeibc_MsgDeleteValidator,
    responseSerialize: serialize_stride_stakeibc_MsgDeleteValidatorResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgDeleteValidatorResponse,
  },
  restoreInterchainAccount: {
    path: '/stride.stakeibc.Msg/RestoreInterchainAccount',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgRestoreInterchainAccount,
    responseType: stride_stakeibc_tx_pb.MsgRestoreInterchainAccountResponse,
    requestSerialize: serialize_stride_stakeibc_MsgRestoreInterchainAccount,
    requestDeserialize: deserialize_stride_stakeibc_MsgRestoreInterchainAccount,
    responseSerialize: serialize_stride_stakeibc_MsgRestoreInterchainAccountResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgRestoreInterchainAccountResponse,
  },
  updateValidatorSharesExchRate: {
    path: '/stride.stakeibc.Msg/UpdateValidatorSharesExchRate',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRate,
    responseType: stride_stakeibc_tx_pb.MsgUpdateValidatorSharesExchRateResponse,
    requestSerialize: serialize_stride_stakeibc_MsgUpdateValidatorSharesExchRate,
    requestDeserialize: deserialize_stride_stakeibc_MsgUpdateValidatorSharesExchRate,
    responseSerialize: serialize_stride_stakeibc_MsgUpdateValidatorSharesExchRateResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgUpdateValidatorSharesExchRateResponse,
  },
  clearBalance: {
    path: '/stride.stakeibc.Msg/ClearBalance',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_tx_pb.MsgClearBalance,
    responseType: stride_stakeibc_tx_pb.MsgClearBalanceResponse,
    requestSerialize: serialize_stride_stakeibc_MsgClearBalance,
    requestDeserialize: deserialize_stride_stakeibc_MsgClearBalance,
    responseSerialize: serialize_stride_stakeibc_MsgClearBalanceResponse,
    responseDeserialize: deserialize_stride_stakeibc_MsgClearBalanceResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
