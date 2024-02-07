// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var dymension_rollapp_tx_pb = require('../../dymension/rollapp/tx_pb.js');
var dymension_rollapp_block_descriptor_pb = require('../../dymension/rollapp/block_descriptor_pb.js');
var dymension_rollapp_bank_pb = require('../../dymension/rollapp/bank_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_dymensionxyz_dymension_rollapp_MsgCreateRollapp(arg) {
  if (!(arg instanceof dymension_rollapp_tx_pb.MsgCreateRollapp)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.MsgCreateRollapp');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_MsgCreateRollapp(buffer_arg) {
  return dymension_rollapp_tx_pb.MsgCreateRollapp.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_MsgCreateRollappResponse(arg) {
  if (!(arg instanceof dymension_rollapp_tx_pb.MsgCreateRollappResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.MsgCreateRollappResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_MsgCreateRollappResponse(buffer_arg) {
  return dymension_rollapp_tx_pb.MsgCreateRollappResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_MsgUpdateState(arg) {
  if (!(arg instanceof dymension_rollapp_tx_pb.MsgUpdateState)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.MsgUpdateState');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_MsgUpdateState(buffer_arg) {
  return dymension_rollapp_tx_pb.MsgUpdateState.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_MsgUpdateStateResponse(arg) {
  if (!(arg instanceof dymension_rollapp_tx_pb.MsgUpdateStateResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.MsgUpdateStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_MsgUpdateStateResponse(buffer_arg) {
  return dymension_rollapp_tx_pb.MsgUpdateStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createRollapp: {
    path: '/dymensionxyz.dymension.rollapp.Msg/CreateRollapp',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_tx_pb.MsgCreateRollapp,
    responseType: dymension_rollapp_tx_pb.MsgCreateRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_MsgCreateRollapp,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_MsgCreateRollapp,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_MsgCreateRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_MsgCreateRollappResponse,
  },
  updateState: {
    path: '/dymensionxyz.dymension.rollapp.Msg/UpdateState',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_tx_pb.MsgUpdateState,
    responseType: dymension_rollapp_tx_pb.MsgUpdateStateResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_MsgUpdateState,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_MsgUpdateState,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_MsgUpdateStateResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_MsgUpdateStateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
