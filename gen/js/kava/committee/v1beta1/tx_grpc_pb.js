// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_committee_v1beta1_tx_pb = require('../../../kava/committee/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var kava_committee_v1beta1_genesis_pb = require('../../../kava/committee/v1beta1/genesis_pb.js');

function serialize_kava_committee_v1beta1_MsgSubmitProposal(arg) {
  if (!(arg instanceof kava_committee_v1beta1_tx_pb.MsgSubmitProposal)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.MsgSubmitProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_MsgSubmitProposal(buffer_arg) {
  return kava_committee_v1beta1_tx_pb.MsgSubmitProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_MsgSubmitProposalResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_tx_pb.MsgSubmitProposalResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.MsgSubmitProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_MsgSubmitProposalResponse(buffer_arg) {
  return kava_committee_v1beta1_tx_pb.MsgSubmitProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_MsgVote(arg) {
  if (!(arg instanceof kava_committee_v1beta1_tx_pb.MsgVote)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.MsgVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_MsgVote(buffer_arg) {
  return kava_committee_v1beta1_tx_pb.MsgVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_committee_v1beta1_MsgVoteResponse(arg) {
  if (!(arg instanceof kava_committee_v1beta1_tx_pb.MsgVoteResponse)) {
    throw new Error('Expected argument of type kava.committee.v1beta1.MsgVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_committee_v1beta1_MsgVoteResponse(buffer_arg) {
  return kava_committee_v1beta1_tx_pb.MsgVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the committee Msg service
var MsgService = exports.MsgService = {
  // SubmitProposal defines a method for submitting a committee proposal
submitProposal: {
    path: '/kava.committee.v1beta1.Msg/SubmitProposal',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_tx_pb.MsgSubmitProposal,
    responseType: kava_committee_v1beta1_tx_pb.MsgSubmitProposalResponse,
    requestSerialize: serialize_kava_committee_v1beta1_MsgSubmitProposal,
    requestDeserialize: deserialize_kava_committee_v1beta1_MsgSubmitProposal,
    responseSerialize: serialize_kava_committee_v1beta1_MsgSubmitProposalResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_MsgSubmitProposalResponse,
  },
  // Vote defines a method for voting on a proposal
vote: {
    path: '/kava.committee.v1beta1.Msg/Vote',
    requestStream: false,
    responseStream: false,
    requestType: kava_committee_v1beta1_tx_pb.MsgVote,
    responseType: kava_committee_v1beta1_tx_pb.MsgVoteResponse,
    requestSerialize: serialize_kava_committee_v1beta1_MsgVote,
    requestDeserialize: deserialize_kava_committee_v1beta1_MsgVote,
    responseSerialize: serialize_kava_committee_v1beta1_MsgVoteResponse,
    responseDeserialize: deserialize_kava_committee_v1beta1_MsgVoteResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
