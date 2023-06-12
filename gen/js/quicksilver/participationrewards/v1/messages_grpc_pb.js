// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_participationrewards_v1_messages_pb = require('../../../quicksilver/participationrewards/v1/messages_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var tendermint_crypto_proof_pb = require('../../../tendermint/crypto/proof_pb.js');
var quicksilver_participationrewards_v1_participationrewards_pb = require('../../../quicksilver/participationrewards/v1/participationrewards_pb.js');
var quicksilver_claimsmanager_v1_claimsmanager_pb = require('../../../quicksilver/claimsmanager/v1/claimsmanager_pb.js');

function serialize_quicksilver_participationrewards_v1_MsgSubmitClaim(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaim)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.MsgSubmitClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_MsgSubmitClaim(buffer_arg) {
  return quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_participationrewards_v1_MsgSubmitClaimResponse(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaimResponse)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.MsgSubmitClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_MsgSubmitClaimResponse(buffer_arg) {
  return quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the participationrewards Msg service.
var MsgService = exports.MsgService = {
  submitClaim: {
    path: '/quicksilver.participationrewards.v1.Msg/SubmitClaim',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaim,
    responseType: quicksilver_participationrewards_v1_messages_pb.MsgSubmitClaimResponse,
    requestSerialize: serialize_quicksilver_participationrewards_v1_MsgSubmitClaim,
    requestDeserialize: deserialize_quicksilver_participationrewards_v1_MsgSubmitClaim,
    responseSerialize: serialize_quicksilver_participationrewards_v1_MsgSubmitClaimResponse,
    responseDeserialize: deserialize_quicksilver_participationrewards_v1_MsgSubmitClaimResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
