// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_claim_v1beta1_tx_pb = require('../../../crescent/claim/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var crescent_claim_v1beta1_claim_pb = require('../../../crescent/claim/v1beta1/claim_pb.js');

function serialize_crescent_claim_v1beta1_MsgClaim(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_MsgClaim(buffer_arg) {
  return crescent_claim_v1beta1_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_MsgClaimResponse(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_MsgClaimResponse(buffer_arg) {
  return crescent_claim_v1beta1_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  claim: {
    path: '/crescent.claim.v1beta1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: crescent_claim_v1beta1_tx_pb.MsgClaim,
    responseType: crescent_claim_v1beta1_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_crescent_claim_v1beta1_MsgClaim,
    requestDeserialize: deserialize_crescent_claim_v1beta1_MsgClaim,
    responseSerialize: serialize_crescent_claim_v1beta1_MsgClaimResponse,
    responseDeserialize: deserialize_crescent_claim_v1beta1_MsgClaimResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
