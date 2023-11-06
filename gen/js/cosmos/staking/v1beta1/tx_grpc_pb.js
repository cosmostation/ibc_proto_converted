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

function serialize_cosmos_staking_v1beta1_MsgRotateConsPubKey(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKey)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgRotateConsPubKey');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgRotateConsPubKey(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKey.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_MsgRotateConsPubKeyResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKeyResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.MsgRotateConsPubKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_MsgRotateConsPubKeyResponse(buffer_arg) {
  return cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
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
  // RotateConsPubKey defines an operation for rotating the consensus keys
// of a validator.
// Since: cosmos-sdk 0.48
rotateConsPubKey: {
    path: '/cosmos.staking.v1beta1.Msg/RotateConsPubKey',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKey,
    responseType: cosmos_staking_v1beta1_tx_pb.MsgRotateConsPubKeyResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_MsgRotateConsPubKey,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_MsgRotateConsPubKey,
    responseSerialize: serialize_cosmos_staking_v1beta1_MsgRotateConsPubKeyResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_MsgRotateConsPubKeyResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
