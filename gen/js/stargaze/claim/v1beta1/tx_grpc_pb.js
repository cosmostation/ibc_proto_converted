// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_claim_v1beta1_tx_pb = require('../../../stargaze/claim/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var stargaze_claim_v1beta1_claim_record_pb = require('../../../stargaze/claim/v1beta1/claim_record_pb.js');

function serialize_publicawesome_stargaze_claim_v1beta1_MsgClaimFor(arg) {
  if (!(arg instanceof stargaze_claim_v1beta1_tx_pb.MsgClaimFor)) {
    throw new Error('Expected argument of type publicawesome.stargaze.claim.v1beta1.MsgClaimFor');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_claim_v1beta1_MsgClaimFor(buffer_arg) {
  return stargaze_claim_v1beta1_tx_pb.MsgClaimFor.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse(arg) {
  if (!(arg instanceof stargaze_claim_v1beta1_tx_pb.MsgClaimForResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse(buffer_arg) {
  return stargaze_claim_v1beta1_tx_pb.MsgClaimForResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaim(arg) {
  if (!(arg instanceof stargaze_claim_v1beta1_tx_pb.MsgInitialClaim)) {
    throw new Error('Expected argument of type publicawesome.stargaze.claim.v1beta1.MsgInitialClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaim(buffer_arg) {
  return stargaze_claim_v1beta1_tx_pb.MsgInitialClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaimResponse(arg) {
  if (!(arg instanceof stargaze_claim_v1beta1_tx_pb.MsgInitialClaimResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.claim.v1beta1.MsgInitialClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaimResponse(buffer_arg) {
  return stargaze_claim_v1beta1_tx_pb.MsgInitialClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  initialClaim: {
    path: '/publicawesome.stargaze.claim.v1beta1.Msg/InitialClaim',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_claim_v1beta1_tx_pb.MsgInitialClaim,
    responseType: stargaze_claim_v1beta1_tx_pb.MsgInitialClaimResponse,
    requestSerialize: serialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaim,
    requestDeserialize: deserialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaim,
    responseSerialize: serialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaimResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_claim_v1beta1_MsgInitialClaimResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
claimFor: {
    path: '/publicawesome.stargaze.claim.v1beta1.Msg/ClaimFor',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_claim_v1beta1_tx_pb.MsgClaimFor,
    responseType: stargaze_claim_v1beta1_tx_pb.MsgClaimForResponse,
    requestSerialize: serialize_publicawesome_stargaze_claim_v1beta1_MsgClaimFor,
    requestDeserialize: deserialize_publicawesome_stargaze_claim_v1beta1_MsgClaimFor,
    responseSerialize: serialize_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
