// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_cosmwasmpool_v1beta1_model_tx_pb = require('../../../../osmosis/cosmwasmpool/v1beta1/model/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPool(arg) {
  if (!(arg instanceof osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPool)) {
    throw new Error('Expected argument of type osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPool(buffer_arg) {
  return osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPoolResponse(arg) {
  if (!(arg instanceof osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPoolResponse)) {
    throw new Error('Expected argument of type osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPoolResponse(buffer_arg) {
  return osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgCreatorService = exports.MsgCreatorService = {
  createCosmWasmPool: {
    path: '/osmosis.cosmwasmpool.v1beta1.model.MsgCreator/CreateCosmWasmPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPool,
    responseType: osmosis_cosmwasmpool_v1beta1_model_tx_pb.MsgCreateCosmWasmPoolResponse,
    requestSerialize: serialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPool,
    requestDeserialize: deserialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPool,
    responseSerialize: serialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPoolResponse,
    responseDeserialize: deserialize_osmosis_cosmwasmpool_v1beta1_model_MsgCreateCosmWasmPoolResponse,
  },
};

exports.MsgCreatorClient = grpc.makeGenericClientConstructor(MsgCreatorService);
