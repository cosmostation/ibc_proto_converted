// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_crisis_v1beta1_tx_pb = require('../../../cosmos/crisis/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_cosmos_crisis_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_crisis_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.crisis.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_crisis_v1beta1_MsgUpdateParams(buffer_arg) {
  return cosmos_crisis_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_crisis_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_crisis_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.crisis.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_crisis_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_crisis_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_crisis_v1beta1_MsgVerifyInvariant(arg) {
  if (!(arg instanceof cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariant)) {
    throw new Error('Expected argument of type cosmos.crisis.v1beta1.MsgVerifyInvariant');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_crisis_v1beta1_MsgVerifyInvariant(buffer_arg) {
  return cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariant.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse(arg) {
  if (!(arg instanceof cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariantResponse)) {
    throw new Error('Expected argument of type cosmos.crisis.v1beta1.MsgVerifyInvariantResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse(buffer_arg) {
  return cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariantResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // VerifyInvariant defines a method to verify a particular invariant.
verifyInvariant: {
    path: '/cosmos.crisis.v1beta1.Msg/VerifyInvariant',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariant,
    responseType: cosmos_crisis_v1beta1_tx_pb.MsgVerifyInvariantResponse,
    requestSerialize: serialize_cosmos_crisis_v1beta1_MsgVerifyInvariant,
    requestDeserialize: deserialize_cosmos_crisis_v1beta1_MsgVerifyInvariant,
    responseSerialize: serialize_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse,
    responseDeserialize: deserialize_cosmos_crisis_v1beta1_MsgVerifyInvariantResponse,
  },
  // UpdateParams defines a governance operation for updating the x/crisis module
// parameters. The authority is defined in the keeper.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.crisis.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_crisis_v1beta1_tx_pb.MsgUpdateParams,
    responseType: cosmos_crisis_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_crisis_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_crisis_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_crisis_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_crisis_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
