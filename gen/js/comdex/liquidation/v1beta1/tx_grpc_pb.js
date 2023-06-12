// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_liquidation_v1beta1_tx_pb = require('../../../comdex/liquidation/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.MsgLiquidateBorrowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.MsgLiquidateBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_MsgLiquidateVaultRequest(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultRequest)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.MsgLiquidateVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_MsgLiquidateVaultRequest(buffer_arg) {
  return comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_liquidation_v1beta1_MsgLiquidateVaultResponse(arg) {
  if (!(arg instanceof comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultResponse)) {
    throw new Error('Expected argument of type comdex.liquidation.v1beta1.MsgLiquidateVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_liquidation_v1beta1_MsgLiquidateVaultResponse(buffer_arg) {
  return comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  msgLiquidateVault: {
    path: '/comdex.liquidation.v1beta1.Msg/MsgLiquidateVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultRequest,
    responseType: comdex_liquidation_v1beta1_tx_pb.MsgLiquidateVaultResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_MsgLiquidateVaultRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_MsgLiquidateVaultRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_MsgLiquidateVaultResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_MsgLiquidateVaultResponse,
  },
  msgLiquidateBorrow: {
    path: '/comdex.liquidation.v1beta1.Msg/MsgLiquidateBorrow',
    requestStream: false,
    responseStream: false,
    requestType: comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowRequest,
    responseType: comdex_liquidation_v1beta1_tx_pb.MsgLiquidateBorrowResponse,
    requestSerialize: serialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowRequest,
    requestDeserialize: deserialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowRequest,
    responseSerialize: serialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowResponse,
    responseDeserialize: deserialize_comdex_liquidation_v1beta1_MsgLiquidateBorrowResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
