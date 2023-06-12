// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_gamm_pool$models_balancer_tx_tx_pb = require('../../../../../osmosis/gamm/pool-models/balancer/tx/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../../../amino/amino_pb.js');
var osmosis_gamm_pool$models_balancer_balancerPool_pb = require('../../../../../osmosis/gamm/pool-models/balancer/balancerPool_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPool(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPool)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPool(buffer_arg) {
  return osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPoolResponse(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPoolResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.balancer.v1beta1.MsgCreateBalancerPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPoolResponse(buffer_arg) {
  return osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPosition(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPosition)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPosition(buffer_arg) {
  return osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPositionResponse(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPositionResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.balancer.v1beta1.MsgMigrateSharesToFullRangeConcentratedPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPositionResponse(buffer_arg) {
  return osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createBalancerPool: {
    path: '/osmosis.gamm.poolmodels.balancer.v1beta1.Msg/CreateBalancerPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPool,
    responseType: osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgCreateBalancerPoolResponse,
    requestSerialize: serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPool,
    requestDeserialize: deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPool,
    responseSerialize: serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPoolResponse,
    responseDeserialize: deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgCreateBalancerPoolResponse,
  },
  migrateSharesToFullRangeConcentratedPosition: {
    path: '/osmosis.gamm.poolmodels.balancer.v1beta1.Msg/MigrateSharesToFullRangeConcentratedPosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPosition,
    responseType: osmosis_gamm_pool$models_balancer_tx_tx_pb.MsgMigrateSharesToFullRangeConcentratedPositionResponse,
    requestSerialize: serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPosition,
    requestDeserialize: deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPosition,
    responseSerialize: serialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPositionResponse,
    responseDeserialize: deserialize_osmosis_gamm_poolmodels_balancer_v1beta1_MsgMigrateSharesToFullRangeConcentratedPositionResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
