// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var confio_poe_v1beta1_tx_pb = require('../../../confio/poe/v1beta1/tx_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_staking_v1beta1_staking_pb = require('../../../cosmos/staking/v1beta1/staking_pb.js');

function serialize_confio_poe_v1beta1_MsgCreateValidator(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgCreateValidator)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgCreateValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgCreateValidator(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgCreateValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgCreateValidatorResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgCreateValidatorResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgCreateValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgCreateValidatorResponse(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgCreateValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgDelegate(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgDelegate)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgDelegate(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgDelegateResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgDelegateResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgDelegateResponse(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgUndelegate(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgUndelegate)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgUndelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgUndelegate(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgUndelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgUndelegateResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgUndelegateResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgUndelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgUndelegateResponse(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgUndelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgUpdateValidator(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgUpdateValidator)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgUpdateValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgUpdateValidator(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgUpdateValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_MsgUpdateValidatorResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_tx_pb.MsgUpdateValidatorResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.MsgUpdateValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_MsgUpdateValidatorResponse(buffer_arg) {
  return confio_poe_v1beta1_tx_pb.MsgUpdateValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the staking Msg service.
var MsgService = exports.MsgService = {
  // CreateValidator defines a method for creating a new validator.
createValidator: {
    path: '/confio.poe.v1beta1.Msg/CreateValidator',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_tx_pb.MsgCreateValidator,
    responseType: confio_poe_v1beta1_tx_pb.MsgCreateValidatorResponse,
    requestSerialize: serialize_confio_poe_v1beta1_MsgCreateValidator,
    requestDeserialize: deserialize_confio_poe_v1beta1_MsgCreateValidator,
    responseSerialize: serialize_confio_poe_v1beta1_MsgCreateValidatorResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_MsgCreateValidatorResponse,
  },
  // MsgCreateValidator defines a method for updating validator metadata
updateValidator: {
    path: '/confio.poe.v1beta1.Msg/UpdateValidator',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_tx_pb.MsgUpdateValidator,
    responseType: confio_poe_v1beta1_tx_pb.MsgUpdateValidatorResponse,
    requestSerialize: serialize_confio_poe_v1beta1_MsgUpdateValidator,
    requestDeserialize: deserialize_confio_poe_v1beta1_MsgUpdateValidator,
    responseSerialize: serialize_confio_poe_v1beta1_MsgUpdateValidatorResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_MsgUpdateValidatorResponse,
  },
  // Delegate defines a method for performing a self delegation of coins
// by a node operator
delegate: {
    path: '/confio.poe.v1beta1.Msg/Delegate',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_tx_pb.MsgDelegate,
    responseType: confio_poe_v1beta1_tx_pb.MsgDelegateResponse,
    requestSerialize: serialize_confio_poe_v1beta1_MsgDelegate,
    requestDeserialize: deserialize_confio_poe_v1beta1_MsgDelegate,
    responseSerialize: serialize_confio_poe_v1beta1_MsgDelegateResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_MsgDelegateResponse,
  },
  // Undelegate defines a method for performing an undelegation from a
// node operator
undelegate: {
    path: '/confio.poe.v1beta1.Msg/Undelegate',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_tx_pb.MsgUndelegate,
    responseType: confio_poe_v1beta1_tx_pb.MsgUndelegateResponse,
    requestSerialize: serialize_confio_poe_v1beta1_MsgUndelegate,
    requestDeserialize: deserialize_confio_poe_v1beta1_MsgUndelegate,
    responseSerialize: serialize_confio_poe_v1beta1_MsgUndelegateResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_MsgUndelegateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
