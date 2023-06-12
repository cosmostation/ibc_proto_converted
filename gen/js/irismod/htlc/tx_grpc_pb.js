// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_htlc_tx_pb = require('../../irismod/htlc/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_htlc_MsgClaimHTLC(arg) {
  if (!(arg instanceof irismod_htlc_tx_pb.MsgClaimHTLC)) {
    throw new Error('Expected argument of type irismod.htlc.MsgClaimHTLC');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_MsgClaimHTLC(buffer_arg) {
  return irismod_htlc_tx_pb.MsgClaimHTLC.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_MsgClaimHTLCResponse(arg) {
  if (!(arg instanceof irismod_htlc_tx_pb.MsgClaimHTLCResponse)) {
    throw new Error('Expected argument of type irismod.htlc.MsgClaimHTLCResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_MsgClaimHTLCResponse(buffer_arg) {
  return irismod_htlc_tx_pb.MsgClaimHTLCResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_MsgCreateHTLC(arg) {
  if (!(arg instanceof irismod_htlc_tx_pb.MsgCreateHTLC)) {
    throw new Error('Expected argument of type irismod.htlc.MsgCreateHTLC');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_MsgCreateHTLC(buffer_arg) {
  return irismod_htlc_tx_pb.MsgCreateHTLC.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_MsgCreateHTLCResponse(arg) {
  if (!(arg instanceof irismod_htlc_tx_pb.MsgCreateHTLCResponse)) {
    throw new Error('Expected argument of type irismod.htlc.MsgCreateHTLCResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_MsgCreateHTLCResponse(buffer_arg) {
  return irismod_htlc_tx_pb.MsgCreateHTLCResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the HTLC Msg service
var MsgService = exports.MsgService = {
  // CreateHTLC defines a method for creating a HTLC
createHTLC: {
    path: '/irismod.htlc.Msg/CreateHTLC',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_tx_pb.MsgCreateHTLC,
    responseType: irismod_htlc_tx_pb.MsgCreateHTLCResponse,
    requestSerialize: serialize_irismod_htlc_MsgCreateHTLC,
    requestDeserialize: deserialize_irismod_htlc_MsgCreateHTLC,
    responseSerialize: serialize_irismod_htlc_MsgCreateHTLCResponse,
    responseDeserialize: deserialize_irismod_htlc_MsgCreateHTLCResponse,
  },
  // ClaimHTLC defines a method for claiming a HTLC
claimHTLC: {
    path: '/irismod.htlc.Msg/ClaimHTLC',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_tx_pb.MsgClaimHTLC,
    responseType: irismod_htlc_tx_pb.MsgClaimHTLCResponse,
    requestSerialize: serialize_irismod_htlc_MsgClaimHTLC,
    requestDeserialize: deserialize_irismod_htlc_MsgClaimHTLC,
    responseSerialize: serialize_irismod_htlc_MsgClaimHTLCResponse,
    responseDeserialize: deserialize_irismod_htlc_MsgClaimHTLCResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
