// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bitsong_merkledrop_v1beta1_tx_pb = require('../../../bitsong/merkledrop/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_bitsong_merkledrop_v1beta1_MsgClaim(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_MsgClaim(buffer_arg) {
  return bitsong_merkledrop_v1beta1_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_MsgClaimResponse(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_MsgClaimResponse(buffer_arg) {
  return bitsong_merkledrop_v1beta1_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_MsgCreate(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_tx_pb.MsgCreate)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.MsgCreate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_MsgCreate(buffer_arg) {
  return bitsong_merkledrop_v1beta1_tx_pb.MsgCreate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_MsgCreateResponse(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_tx_pb.MsgCreateResponse)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.MsgCreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_MsgCreateResponse(buffer_arg) {
  return bitsong_merkledrop_v1beta1_tx_pb.MsgCreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  create: {
    path: '/bitsong.merkledrop.v1beta1.Msg/Create',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_merkledrop_v1beta1_tx_pb.MsgCreate,
    responseType: bitsong_merkledrop_v1beta1_tx_pb.MsgCreateResponse,
    requestSerialize: serialize_bitsong_merkledrop_v1beta1_MsgCreate,
    requestDeserialize: deserialize_bitsong_merkledrop_v1beta1_MsgCreate,
    responseSerialize: serialize_bitsong_merkledrop_v1beta1_MsgCreateResponse,
    responseDeserialize: deserialize_bitsong_merkledrop_v1beta1_MsgCreateResponse,
  },
  claim: {
    path: '/bitsong.merkledrop.v1beta1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_merkledrop_v1beta1_tx_pb.MsgClaim,
    responseType: bitsong_merkledrop_v1beta1_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_bitsong_merkledrop_v1beta1_MsgClaim,
    requestDeserialize: deserialize_bitsong_merkledrop_v1beta1_MsgClaim,
    responseSerialize: serialize_bitsong_merkledrop_v1beta1_MsgClaimResponse,
    responseDeserialize: deserialize_bitsong_merkledrop_v1beta1_MsgClaimResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
