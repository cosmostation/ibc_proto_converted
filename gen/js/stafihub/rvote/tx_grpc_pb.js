// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rvote_tx_pb = require('../../stafihub/rvote/tx_pb.js');
var stafihub_rvote_proposal_pb = require('../../stafihub/rvote/proposal_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');

function serialize_stafihub_stafihub_rvote_MsgSetProposalLife(arg) {
  if (!(arg instanceof stafihub_rvote_tx_pb.MsgSetProposalLife)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.MsgSetProposalLife');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_MsgSetProposalLife(buffer_arg) {
  return stafihub_rvote_tx_pb.MsgSetProposalLife.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_MsgSetProposalLifeResponse(arg) {
  if (!(arg instanceof stafihub_rvote_tx_pb.MsgSetProposalLifeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.MsgSetProposalLifeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_MsgSetProposalLifeResponse(buffer_arg) {
  return stafihub_rvote_tx_pb.MsgSetProposalLifeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_MsgSubmitProposal(arg) {
  if (!(arg instanceof stafihub_rvote_tx_pb.MsgSubmitProposal)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.MsgSubmitProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_MsgSubmitProposal(buffer_arg) {
  return stafihub_rvote_tx_pb.MsgSubmitProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_MsgSubmitProposalResponse(arg) {
  if (!(arg instanceof stafihub_rvote_tx_pb.MsgSubmitProposalResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.MsgSubmitProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_MsgSubmitProposalResponse(buffer_arg) {
  return stafihub_rvote_tx_pb.MsgSubmitProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setProposalLife: {
    path: '/stafihub.stafihub.rvote.Msg/SetProposalLife',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvote_tx_pb.MsgSetProposalLife,
    responseType: stafihub_rvote_tx_pb.MsgSetProposalLifeResponse,
    requestSerialize: serialize_stafihub_stafihub_rvote_MsgSetProposalLife,
    requestDeserialize: deserialize_stafihub_stafihub_rvote_MsgSetProposalLife,
    responseSerialize: serialize_stafihub_stafihub_rvote_MsgSetProposalLifeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvote_MsgSetProposalLifeResponse,
  },
  submitProposal: {
    path: '/stafihub.stafihub.rvote.Msg/SubmitProposal',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvote_tx_pb.MsgSubmitProposal,
    responseType: stafihub_rvote_tx_pb.MsgSubmitProposalResponse,
    requestSerialize: serialize_stafihub_stafihub_rvote_MsgSubmitProposal,
    requestDeserialize: deserialize_stafihub_stafihub_rvote_MsgSubmitProposal,
    responseSerialize: serialize_stafihub_stafihub_rvote_MsgSubmitProposalResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvote_MsgSubmitProposalResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
