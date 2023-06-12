// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_snapshot_v1beta1_tx_pb = require('../../../axelar/snapshot/v1beta1/tx_pb.js');

function serialize_axelar_snapshot_v1beta1_DeactivateProxyRequest(arg) {
  if (!(arg instanceof axelar_snapshot_v1beta1_tx_pb.DeactivateProxyRequest)) {
    throw new Error('Expected argument of type axelar.snapshot.v1beta1.DeactivateProxyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_snapshot_v1beta1_DeactivateProxyRequest(buffer_arg) {
  return axelar_snapshot_v1beta1_tx_pb.DeactivateProxyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_snapshot_v1beta1_DeactivateProxyResponse(arg) {
  if (!(arg instanceof axelar_snapshot_v1beta1_tx_pb.DeactivateProxyResponse)) {
    throw new Error('Expected argument of type axelar.snapshot.v1beta1.DeactivateProxyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_snapshot_v1beta1_DeactivateProxyResponse(buffer_arg) {
  return axelar_snapshot_v1beta1_tx_pb.DeactivateProxyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_snapshot_v1beta1_RegisterProxyRequest(arg) {
  if (!(arg instanceof axelar_snapshot_v1beta1_tx_pb.RegisterProxyRequest)) {
    throw new Error('Expected argument of type axelar.snapshot.v1beta1.RegisterProxyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_snapshot_v1beta1_RegisterProxyRequest(buffer_arg) {
  return axelar_snapshot_v1beta1_tx_pb.RegisterProxyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_snapshot_v1beta1_RegisterProxyResponse(arg) {
  if (!(arg instanceof axelar_snapshot_v1beta1_tx_pb.RegisterProxyResponse)) {
    throw new Error('Expected argument of type axelar.snapshot.v1beta1.RegisterProxyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_snapshot_v1beta1_RegisterProxyResponse(buffer_arg) {
  return axelar_snapshot_v1beta1_tx_pb.RegisterProxyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the snapshot Msg service.
var MsgServiceService = exports.MsgServiceService = {
  // RegisterProxy defines a method for registering a proxy account that can act
// in a validator account's stead.
registerProxy: {
    path: '/axelar.snapshot.v1beta1.MsgService/RegisterProxy',
    requestStream: false,
    responseStream: false,
    requestType: axelar_snapshot_v1beta1_tx_pb.RegisterProxyRequest,
    responseType: axelar_snapshot_v1beta1_tx_pb.RegisterProxyResponse,
    requestSerialize: serialize_axelar_snapshot_v1beta1_RegisterProxyRequest,
    requestDeserialize: deserialize_axelar_snapshot_v1beta1_RegisterProxyRequest,
    responseSerialize: serialize_axelar_snapshot_v1beta1_RegisterProxyResponse,
    responseDeserialize: deserialize_axelar_snapshot_v1beta1_RegisterProxyResponse,
  },
  // DeactivateProxy defines a method for deregistering a proxy account.
deactivateProxy: {
    path: '/axelar.snapshot.v1beta1.MsgService/DeactivateProxy',
    requestStream: false,
    responseStream: false,
    requestType: axelar_snapshot_v1beta1_tx_pb.DeactivateProxyRequest,
    responseType: axelar_snapshot_v1beta1_tx_pb.DeactivateProxyResponse,
    requestSerialize: serialize_axelar_snapshot_v1beta1_DeactivateProxyRequest,
    requestDeserialize: deserialize_axelar_snapshot_v1beta1_DeactivateProxyRequest,
    responseSerialize: serialize_axelar_snapshot_v1beta1_DeactivateProxyResponse,
    responseDeserialize: deserialize_axelar_snapshot_v1beta1_DeactivateProxyResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
