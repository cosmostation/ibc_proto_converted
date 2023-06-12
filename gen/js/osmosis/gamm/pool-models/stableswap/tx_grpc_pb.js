// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_gamm_pool$models_stableswap_tx_pb = require('../../../../osmosis/gamm/pool-models/stableswap/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../../amino/amino_pb.js');
var osmosis_gamm_pool$models_stableswap_stableswap_pool_pb = require('../../../../osmosis/gamm/pool-models/stableswap/stableswap_pool_pb.js');

function serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPool(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPool)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.stableswap.v1beta1.MsgCreateStableswapPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPool(buffer_arg) {
  return osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPoolResponse(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPoolResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.stableswap.v1beta1.MsgCreateStableswapPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPoolResponse(buffer_arg) {
  return osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactors(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactors)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactors(buffer_arg) {
  return osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactors.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactorsResponse(arg) {
  if (!(arg instanceof osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactorsResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactorsResponse(buffer_arg) {
  return osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createStableswapPool: {
    path: '/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/CreateStableswapPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPool,
    responseType: osmosis_gamm_pool$models_stableswap_tx_pb.MsgCreateStableswapPoolResponse,
    requestSerialize: serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPool,
    requestDeserialize: deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPool,
    responseSerialize: serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPoolResponse,
    responseDeserialize: deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgCreateStableswapPoolResponse,
  },
  stableSwapAdjustScalingFactors: {
    path: '/osmosis.gamm.poolmodels.stableswap.v1beta1.Msg/StableSwapAdjustScalingFactors',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactors,
    responseType: osmosis_gamm_pool$models_stableswap_tx_pb.MsgStableSwapAdjustScalingFactorsResponse,
    requestSerialize: serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactors,
    requestDeserialize: deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactors,
    responseSerialize: serialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactorsResponse,
    responseDeserialize: deserialize_osmosis_gamm_poolmodels_stableswap_v1beta1_MsgStableSwapAdjustScalingFactorsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
