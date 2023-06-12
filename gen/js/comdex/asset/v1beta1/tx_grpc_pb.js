// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_asset_v1beta1_tx_pb = require('../../../comdex/asset/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var comdex_asset_v1beta1_asset_pb = require('../../../comdex/asset/v1beta1/asset_pb.js');

function serialize_comdex_asset_v1beta1_MsgAddAsset(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_tx_pb.MsgAddAsset)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.MsgAddAsset');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_MsgAddAsset(buffer_arg) {
  return comdex_asset_v1beta1_tx_pb.MsgAddAsset.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_MsgAddAssetResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_tx_pb.MsgAddAssetResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.MsgAddAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_MsgAddAssetResponse(buffer_arg) {
  return comdex_asset_v1beta1_tx_pb.MsgAddAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // AddAsset defines a method for adding new asset in asset module
addAsset: {
    path: '/comdex.asset.v1beta1.Msg/AddAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_tx_pb.MsgAddAsset,
    responseType: comdex_asset_v1beta1_tx_pb.MsgAddAssetResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_MsgAddAsset,
    requestDeserialize: deserialize_comdex_asset_v1beta1_MsgAddAsset,
    responseSerialize: serialize_comdex_asset_v1beta1_MsgAddAssetResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_MsgAddAssetResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
