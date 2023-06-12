// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_emergencybutton_v1beta1_tx_pb = require('../../../secret/emergencybutton/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitch(arg) {
  if (!(arg instanceof secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitch)) {
    throw new Error('Expected argument of type secret.emergencybutton.v1beta1.MsgToggleIbcSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitch(buffer_arg) {
  return secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitchResponse(arg) {
  if (!(arg instanceof secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitchResponse)) {
    throw new Error('Expected argument of type secret.emergencybutton.v1beta1.MsgToggleIbcSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitchResponse(buffer_arg) {
  return secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // ToggleIbcSwitch defines a method for toggling the status of the emergencybutton.
toggleIbcSwitch: {
    path: '/secret.emergencybutton.v1beta1.Msg/ToggleIbcSwitch',
    requestStream: false,
    responseStream: false,
    requestType: secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitch,
    responseType: secret_emergencybutton_v1beta1_tx_pb.MsgToggleIbcSwitchResponse,
    requestSerialize: serialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitch,
    requestDeserialize: deserialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitch,
    responseSerialize: serialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitchResponse,
    responseDeserialize: deserialize_secret_emergencybutton_v1beta1_MsgToggleIbcSwitchResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
