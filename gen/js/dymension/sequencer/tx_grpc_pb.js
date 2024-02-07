// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var dymension_sequencer_tx_pb = require('../../dymension/sequencer/tx_pb.js');
var dymension_sequencer_description_pb = require('../../dymension/sequencer/description_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_dymensionxyz_dymension_sequencer_MsgCreateSequencer(arg) {
  if (!(arg instanceof dymension_sequencer_tx_pb.MsgCreateSequencer)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.MsgCreateSequencer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_MsgCreateSequencer(buffer_arg) {
  return dymension_sequencer_tx_pb.MsgCreateSequencer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_MsgCreateSequencerResponse(arg) {
  if (!(arg instanceof dymension_sequencer_tx_pb.MsgCreateSequencerResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.MsgCreateSequencerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_MsgCreateSequencerResponse(buffer_arg) {
  return dymension_sequencer_tx_pb.MsgCreateSequencerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createSequencer: {
    path: '/dymensionxyz.dymension.sequencer.Msg/CreateSequencer',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_tx_pb.MsgCreateSequencer,
    responseType: dymension_sequencer_tx_pb.MsgCreateSequencerResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_MsgCreateSequencer,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_MsgCreateSequencer,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_MsgCreateSequencerResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_MsgCreateSequencerResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
