// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.46
'use strict';
var grpc = require('grpc');
var cosmos_upgrade_v1beta1_tx_pb = require('../../../cosmos/upgrade/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_upgrade_v1beta1_upgrade_pb = require('../../../cosmos/upgrade/v1beta1/upgrade_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_upgrade_v1beta1_MsgCancelUpgrade(arg) {
  if (!(arg instanceof cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgrade)) {
    throw new Error('Expected argument of type cosmos.upgrade.v1beta1.MsgCancelUpgrade');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_upgrade_v1beta1_MsgCancelUpgrade(buffer_arg) {
  return cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgrade.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_upgrade_v1beta1_MsgCancelUpgradeResponse(arg) {
  if (!(arg instanceof cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgradeResponse)) {
    throw new Error('Expected argument of type cosmos.upgrade.v1beta1.MsgCancelUpgradeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_upgrade_v1beta1_MsgCancelUpgradeResponse(buffer_arg) {
  return cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgradeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgrade(arg) {
  if (!(arg instanceof cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgrade)) {
    throw new Error('Expected argument of type cosmos.upgrade.v1beta1.MsgSoftwareUpgrade');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgrade(buffer_arg) {
  return cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgrade.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgradeResponse(arg) {
  if (!(arg instanceof cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgradeResponse)) {
    throw new Error('Expected argument of type cosmos.upgrade.v1beta1.MsgSoftwareUpgradeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgradeResponse(buffer_arg) {
  return cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgradeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the upgrade Msg service.
var MsgService = exports.MsgService = {
  // SoftwareUpgrade is a governance operation for initiating a software upgrade.
//
// Since: cosmos-sdk 0.46
softwareUpgrade: {
    path: '/cosmos.upgrade.v1beta1.Msg/SoftwareUpgrade',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgrade,
    responseType: cosmos_upgrade_v1beta1_tx_pb.MsgSoftwareUpgradeResponse,
    requestSerialize: serialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgrade,
    requestDeserialize: deserialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgrade,
    responseSerialize: serialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgradeResponse,
    responseDeserialize: deserialize_cosmos_upgrade_v1beta1_MsgSoftwareUpgradeResponse,
  },
  // CancelUpgrade is a governance operation for cancelling a previously
// approved software upgrade.
//
// Since: cosmos-sdk 0.46
cancelUpgrade: {
    path: '/cosmos.upgrade.v1beta1.Msg/CancelUpgrade',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgrade,
    responseType: cosmos_upgrade_v1beta1_tx_pb.MsgCancelUpgradeResponse,
    requestSerialize: serialize_cosmos_upgrade_v1beta1_MsgCancelUpgrade,
    requestDeserialize: deserialize_cosmos_upgrade_v1beta1_MsgCancelUpgrade,
    responseSerialize: serialize_cosmos_upgrade_v1beta1_MsgCancelUpgradeResponse,
    responseDeserialize: deserialize_cosmos_upgrade_v1beta1_MsgCancelUpgradeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
