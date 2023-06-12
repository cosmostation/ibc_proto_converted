// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_airdrop_v1_messages_pb = require('../../../quicksilver/airdrop/v1/messages_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var quicksilver_claimsmanager_v1_claimsmanager_pb = require('../../../quicksilver/claimsmanager/v1/claimsmanager_pb.js');

function serialize_quicksilver_airdrop_v1_MsgClaim(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_messages_pb.MsgClaim)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_MsgClaim(buffer_arg) {
  return quicksilver_airdrop_v1_messages_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_MsgClaimResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_messages_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_MsgClaimResponse(buffer_arg) {
  return quicksilver_airdrop_v1_messages_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the airdrop Msg service.
var MsgService = exports.MsgService = {
  claim: {
    path: '/quicksilver.airdrop.v1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_messages_pb.MsgClaim,
    responseType: quicksilver_airdrop_v1_messages_pb.MsgClaimResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_MsgClaim,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_MsgClaim,
    responseSerialize: serialize_quicksilver_airdrop_v1_MsgClaimResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_MsgClaimResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
