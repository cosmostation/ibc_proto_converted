// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_vote_v1beta1_tx_pb = require('../../../axelar/vote/v1beta1/tx_pb.js');

function serialize_axelar_vote_v1beta1_VoteRequest(arg) {
  if (!(arg instanceof axelar_vote_v1beta1_tx_pb.VoteRequest)) {
    throw new Error('Expected argument of type axelar.vote.v1beta1.VoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_vote_v1beta1_VoteRequest(buffer_arg) {
  return axelar_vote_v1beta1_tx_pb.VoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_vote_v1beta1_VoteResponse(arg) {
  if (!(arg instanceof axelar_vote_v1beta1_tx_pb.VoteResponse)) {
    throw new Error('Expected argument of type axelar.vote.v1beta1.VoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_vote_v1beta1_VoteResponse(buffer_arg) {
  return axelar_vote_v1beta1_tx_pb.VoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the vote Msg service.
var MsgServiceService = exports.MsgServiceService = {
  vote: {
    path: '/axelar.vote.v1beta1.MsgService/Vote',
    requestStream: false,
    responseStream: false,
    requestType: axelar_vote_v1beta1_tx_pb.VoteRequest,
    responseType: axelar_vote_v1beta1_tx_pb.VoteResponse,
    requestSerialize: serialize_axelar_vote_v1beta1_VoteRequest,
    requestDeserialize: deserialize_axelar_vote_v1beta1_VoteRequest,
    responseSerialize: serialize_axelar_vote_v1beta1_VoteResponse,
    responseDeserialize: deserialize_axelar_vote_v1beta1_VoteResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
