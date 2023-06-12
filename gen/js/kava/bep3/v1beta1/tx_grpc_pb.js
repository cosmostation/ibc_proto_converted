// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_bep3_v1beta1_tx_pb = require('../../../kava/bep3/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_bep3_v1beta1_MsgClaimAtomicSwap(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwap)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgClaimAtomicSwap');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgClaimAtomicSwap(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwap.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_MsgClaimAtomicSwapResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwapResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgClaimAtomicSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgClaimAtomicSwapResponse(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_MsgCreateAtomicSwap(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwap)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgCreateAtomicSwap');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgCreateAtomicSwap(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwap.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_MsgCreateAtomicSwapResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwapResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgCreateAtomicSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgCreateAtomicSwapResponse(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_MsgRefundAtomicSwap(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwap)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgRefundAtomicSwap');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgRefundAtomicSwap(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwap.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_MsgRefundAtomicSwapResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwapResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.MsgRefundAtomicSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_MsgRefundAtomicSwapResponse(buffer_arg) {
  return kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bep3 Msg service.
var MsgService = exports.MsgService = {
  // CreateAtomicSwap defines a method for creating an atomic swap
createAtomicSwap: {
    path: '/kava.bep3.v1beta1.Msg/CreateAtomicSwap',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwap,
    responseType: kava_bep3_v1beta1_tx_pb.MsgCreateAtomicSwapResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_MsgCreateAtomicSwap,
    requestDeserialize: deserialize_kava_bep3_v1beta1_MsgCreateAtomicSwap,
    responseSerialize: serialize_kava_bep3_v1beta1_MsgCreateAtomicSwapResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_MsgCreateAtomicSwapResponse,
  },
  // ClaimAtomicSwap defines a method for claiming an atomic swap
claimAtomicSwap: {
    path: '/kava.bep3.v1beta1.Msg/ClaimAtomicSwap',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwap,
    responseType: kava_bep3_v1beta1_tx_pb.MsgClaimAtomicSwapResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_MsgClaimAtomicSwap,
    requestDeserialize: deserialize_kava_bep3_v1beta1_MsgClaimAtomicSwap,
    responseSerialize: serialize_kava_bep3_v1beta1_MsgClaimAtomicSwapResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_MsgClaimAtomicSwapResponse,
  },
  // RefundAtomicSwap defines a method for refunding an atomic swap
refundAtomicSwap: {
    path: '/kava.bep3.v1beta1.Msg/RefundAtomicSwap',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwap,
    responseType: kava_bep3_v1beta1_tx_pb.MsgRefundAtomicSwapResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_MsgRefundAtomicSwap,
    requestDeserialize: deserialize_kava_bep3_v1beta1_MsgRefundAtomicSwap,
    responseSerialize: serialize_kava_bep3_v1beta1_MsgRefundAtomicSwapResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_MsgRefundAtomicSwapResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
