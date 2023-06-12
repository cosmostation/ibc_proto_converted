// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var passage3d_claim_v1beta1_tx_pb = require('../../../passage3d/claim/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_passage3d_claim_v1beta1_MsgClaim(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_MsgClaim(buffer_arg) {
  return passage3d_claim_v1beta1_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_MsgClaimResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_MsgClaimResponse(buffer_arg) {
  return passage3d_claim_v1beta1_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // InitialClaim defines RPC service for claim
claim: {
    path: '/passage3d.claim.v1beta1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_tx_pb.MsgClaim,
    responseType: passage3d_claim_v1beta1_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_MsgClaim,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_MsgClaim,
    responseSerialize: serialize_passage3d_claim_v1beta1_MsgClaimResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_MsgClaimResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
