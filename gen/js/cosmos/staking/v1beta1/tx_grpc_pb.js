// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_staking_v1beta1_tx_pb = require('../../../cosmos/staking/v1beta1/tx_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_staking_v1beta1_staking_pb = require('../../../cosmos/staking/v1beta1/staking_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_staking_v1beta1_MsgBeginRedelegate(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegate)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgBeginRedelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgBeginRedelegate(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgBeginRedelegateResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegateResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgBeginRedelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgBeginRedelegateResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegation(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegation)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgCancelUnbondingDelegation');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegation(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegation.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegationResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegationResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgCancelUnbondingDelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegationResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgCreateValidator(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgCreateValidator)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgCreateValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgCreateValidator(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgCreateValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgCreateValidatorResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgCreateValidatorResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgCreateValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgCreateValidatorResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgCreateValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgDelegate(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgDelegate)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgDelegate(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgDelegateResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgDelegateResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgDelegateResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgDisableTokenizeShares(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeShares)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgDisableTokenizeShares');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgDisableTokenizeShares(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeShares.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgDisableTokenizeSharesResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeSharesResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgDisableTokenizeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgDisableTokenizeSharesResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgEditValidator(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgEditValidator)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgEditValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgEditValidator(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgEditValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgEditValidatorResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgEditValidatorResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgEditValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgEditValidatorResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgEditValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgEnableTokenizeShares(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeShares)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgEnableTokenizeShares');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgEnableTokenizeShares(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeShares.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgEnableTokenizeSharesResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeSharesResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgEnableTokenizeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgEnableTokenizeSharesResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgRedeemTokensForShares(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForShares)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgRedeemTokensForShares');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgRedeemTokensForShares(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForShares.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgRedeemTokensForSharesResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForSharesResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgRedeemTokensForSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgRedeemTokensForSharesResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgTokenizeShares(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgTokenizeShares)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgTokenizeShares');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgTokenizeShares(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgTokenizeShares.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgTokenizeSharesResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgTokenizeSharesResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgTokenizeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgTokenizeSharesResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgTokenizeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecord(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecord)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgTransferTokenizeShareRecord');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecord(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecord.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecordResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecordResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgTransferTokenizeShareRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecordResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUnbondValidator(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUnbondValidator)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUnbondValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUnbondValidator(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUnbondValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUnbondValidatorResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUnbondValidatorResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUnbondValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUnbondValidatorResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUnbondValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUndelegate(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUndelegate)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUndelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUndelegate(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUndelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUndelegateResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUndelegateResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUndelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUndelegateResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUndelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUpdateParams(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgValidatorBond(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgValidatorBond)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgValidatorBond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgValidatorBond(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgValidatorBond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgValidatorBondResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgValidatorBondResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgValidatorBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgValidatorBondResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgValidatorBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the staking Msg service.
var MsgService = exports.MsgService = {
  // CreateValidator defines a method for creating a new validator.
createValidator: {
    path: '/cosmos.staking.v1beta1.Msg/CreateValidator',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgCreateValidator,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgCreateValidatorResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgCreateValidator,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgCreateValidator,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgCreateValidatorResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgCreateValidatorResponse,
  },
  // EditValidator defines a method for editing an existing validator.
editValidator: {
    path: '/cosmos.staking.v1beta1.Msg/EditValidator',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgEditValidator,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgEditValidatorResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgEditValidator,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgEditValidator,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgEditValidatorResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgEditValidatorResponse,
  },
  // Delegate defines a method for performing a delegation of coins
// from a delegator to a validator.
delegate: {
    path: '/cosmos.staking.v1beta1.Msg/Delegate',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgDelegate,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgDelegateResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgDelegate,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgDelegate,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgDelegateResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgDelegateResponse,
  },
  // BeginRedelegate defines a method for performing a redelegation
// of coins from a delegator and source validator to a destination validator.
beginRedelegate: {
    path: '/cosmos.staking.v1beta1.Msg/BeginRedelegate',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegate,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgBeginRedelegateResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgBeginRedelegate,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgBeginRedelegate,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgBeginRedelegateResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgBeginRedelegateResponse,
  },
  // Undelegate defines a method for performing an undelegation from a
// delegate and a validator.
undelegate: {
    path: '/cosmos.staking.v1beta1.Msg/Undelegate',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgUndelegate,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgUndelegateResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgUndelegate,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgUndelegate,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgUndelegateResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgUndelegateResponse,
  },
  // CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
// and delegate back to previous validator.
//
// Since: cosmos-sdk 0.46
cancelUnbondingDelegation: {
    path: '/cosmos.staking.v1beta1.Msg/CancelUnbondingDelegation',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegation,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgCancelUnbondingDelegationResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegation,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegation,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegationResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgCancelUnbondingDelegationResponse,
  },
  // UpdateParams defines an operation for updating the x/staking module
// parameters.
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.staking.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgUpdateParams,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgUpdateParamsResponse,
  },
  // UnbondValidator defines a method for performing the status transition for a validator
// from bonded to unbonding
// This allows a validator to stop their services and jail themselves without
// experiencing a slash
unbondValidator: {
    path: '/cosmos.staking.v1beta1.Msg/UnbondValidator',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgUnbondValidator,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgUnbondValidatorResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgUnbondValidator,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgUnbondValidator,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgUnbondValidatorResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgUnbondValidatorResponse,
  },
  // TokenizeShares defines a method for tokenizing shares from a validator.
tokenizeShares: {
    path: '/cosmos.staking.v1beta1.Msg/TokenizeShares',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgTokenizeShares,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgTokenizeSharesResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgTokenizeShares,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgTokenizeShares,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgTokenizeSharesResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgTokenizeSharesResponse,
  },
  // RedeemTokensForShares defines a method for redeeming tokens from a validator for
// shares.
redeemTokensForShares: {
    path: '/cosmos.staking.v1beta1.Msg/RedeemTokensForShares',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForShares,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgRedeemTokensForSharesResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgRedeemTokensForShares,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgRedeemTokensForShares,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgRedeemTokensForSharesResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgRedeemTokensForSharesResponse,
  },
  // TransferTokenizeShareRecord defines a method to transfer ownership of
// TokenizeShareRecord
transferTokenizeShareRecord: {
    path: '/cosmos.staking.v1beta1.Msg/TransferTokenizeShareRecord',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecord,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgTransferTokenizeShareRecordResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecord,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecord,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecordResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgTransferTokenizeShareRecordResponse,
  },
  // DisableTokenizeShares defines a method to prevent the tokenization of an addresses stake
disableTokenizeShares: {
    path: '/cosmos.staking.v1beta1.Msg/DisableTokenizeShares',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeShares,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgDisableTokenizeSharesResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgDisableTokenizeShares,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgDisableTokenizeShares,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgDisableTokenizeSharesResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgDisableTokenizeSharesResponse,
  },
  // EnableTokenizeShares defines a method to re-enable the tokenization of an addresseses stake
// after it has been disabled
enableTokenizeShares: {
    path: '/cosmos.staking.v1beta1.Msg/EnableTokenizeShares',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeShares,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgEnableTokenizeSharesResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgEnableTokenizeShares,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgEnableTokenizeShares,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgEnableTokenizeSharesResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgEnableTokenizeSharesResponse,
  },
  // ValidatorBond defines a method for performing a validator self-bond
validatorBond: {
    path: '/cosmos.staking.v1beta1.Msg/ValidatorBond',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgValidatorBond,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgValidatorBondResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgValidatorBond,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgValidatorBond,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgValidatorBondResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgValidatorBondResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
