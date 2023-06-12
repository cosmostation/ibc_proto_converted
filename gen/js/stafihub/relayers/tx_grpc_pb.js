// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_relayers_tx_pb = require('../../stafihub/relayers/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_stafihub_stafihub_relayers_MsgAddRelayer(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgAddRelayer)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgAddRelayer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgAddRelayer(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgAddRelayer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_MsgAddRelayerResponse(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgAddRelayerResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgAddRelayerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgAddRelayerResponse(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgAddRelayerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_MsgDeleteRelayer(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgDeleteRelayer)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgDeleteRelayer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgDeleteRelayer(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgDeleteRelayer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_MsgDeleteRelayerResponse(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgDeleteRelayerResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgDeleteRelayerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgDeleteRelayerResponse(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgDeleteRelayerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_MsgSetThreshold(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgSetThreshold)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgSetThreshold');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgSetThreshold(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgSetThreshold.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_MsgSetThresholdResponse(arg) {
  if (!(arg instanceof stafihub_relayers_tx_pb.MsgSetThresholdResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.MsgSetThresholdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_MsgSetThresholdResponse(buffer_arg) {
  return stafihub_relayers_tx_pb.MsgSetThresholdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  addRelayer: {
    path: '/stafihub.stafihub.relayers.Msg/AddRelayer',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_relayers_tx_pb.MsgAddRelayer,
    responseType: stafihub_relayers_tx_pb.MsgAddRelayerResponse,
    requestSerialize: serialize_stafihub_stafihub_relayers_MsgAddRelayer,
    requestDeserialize: deserialize_stafihub_stafihub_relayers_MsgAddRelayer,
    responseSerialize: serialize_stafihub_stafihub_relayers_MsgAddRelayerResponse,
    responseDeserialize: deserialize_stafihub_stafihub_relayers_MsgAddRelayerResponse,
  },
  deleteRelayer: {
    path: '/stafihub.stafihub.relayers.Msg/DeleteRelayer',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_relayers_tx_pb.MsgDeleteRelayer,
    responseType: stafihub_relayers_tx_pb.MsgDeleteRelayerResponse,
    requestSerialize: serialize_stafihub_stafihub_relayers_MsgDeleteRelayer,
    requestDeserialize: deserialize_stafihub_stafihub_relayers_MsgDeleteRelayer,
    responseSerialize: serialize_stafihub_stafihub_relayers_MsgDeleteRelayerResponse,
    responseDeserialize: deserialize_stafihub_stafihub_relayers_MsgDeleteRelayerResponse,
  },
  setThreshold: {
    path: '/stafihub.stafihub.relayers.Msg/SetThreshold',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_relayers_tx_pb.MsgSetThreshold,
    responseType: stafihub_relayers_tx_pb.MsgSetThresholdResponse,
    requestSerialize: serialize_stafihub_stafihub_relayers_MsgSetThreshold,
    requestDeserialize: deserialize_stafihub_stafihub_relayers_MsgSetThreshold,
    responseSerialize: serialize_stafihub_stafihub_relayers_MsgSetThresholdResponse,
    responseDeserialize: deserialize_stafihub_stafihub_relayers_MsgSetThresholdResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
