// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_concentrated$liquidity_pool$model_tx_pb = require('../../../osmosis/concentrated-liquidity/pool-model/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPool(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPool)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.model.MsgCreateConcentratedPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPool(buffer_arg) {
  return osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPoolResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPoolResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.model.MsgCreateConcentratedPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPoolResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgCreatorService = exports.MsgCreatorService = {
  createConcentratedPool: {
    path: '/osmosis.concentratedliquidity.v1beta1.model.MsgCreator/CreateConcentratedPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPool,
    responseType: osmosis_concentrated$liquidity_pool$model_tx_pb.MsgCreateConcentratedPoolResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPool,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPool,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPoolResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_model_MsgCreateConcentratedPoolResponse,
  },
};

exports.MsgCreatorClient = grpc.makeGenericClientConstructor(MsgCreatorService);
