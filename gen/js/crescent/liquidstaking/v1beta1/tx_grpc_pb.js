// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_liquidstaking_v1beta1_tx_pb = require('../../../crescent/liquidstaking/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_crescent_liquidstaking_v1beta1_MsgLiquidStake(arg) {
  if (!(arg instanceof crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStake)) {
    throw new Error('Expected argument of type crescent.liquidstaking.v1beta1.MsgLiquidStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidstaking_v1beta1_MsgLiquidStake(buffer_arg) {
  return crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidstaking_v1beta1_MsgLiquidStakeResponse(arg) {
  if (!(arg instanceof crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStakeResponse)) {
    throw new Error('Expected argument of type crescent.liquidstaking.v1beta1.MsgLiquidStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidstaking_v1beta1_MsgLiquidStakeResponse(buffer_arg) {
  return crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstake(arg) {
  if (!(arg instanceof crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstake)) {
    throw new Error('Expected argument of type crescent.liquidstaking.v1beta1.MsgLiquidUnstake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstake(buffer_arg) {
  return crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstakeResponse(arg) {
  if (!(arg instanceof crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstakeResponse)) {
    throw new Error('Expected argument of type crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstakeResponse(buffer_arg) {
  return crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the liquid staking Msg service.
var MsgService = exports.MsgService = {
  // LiquidStake defines a method for performing a delegation of coins
// from a delegator to whitelisted validators.
liquidStake: {
    path: '/crescent.liquidstaking.v1beta1.Msg/LiquidStake',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStake,
    responseType: crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidStakeResponse,
    requestSerialize: serialize_crescent_liquidstaking_v1beta1_MsgLiquidStake,
    requestDeserialize: deserialize_crescent_liquidstaking_v1beta1_MsgLiquidStake,
    responseSerialize: serialize_crescent_liquidstaking_v1beta1_MsgLiquidStakeResponse,
    responseDeserialize: deserialize_crescent_liquidstaking_v1beta1_MsgLiquidStakeResponse,
  },
  // LiquidUnstake defines a method for performing an undelegation of liquid staking from a
// delegate.
liquidUnstake: {
    path: '/crescent.liquidstaking.v1beta1.Msg/LiquidUnstake',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstake,
    responseType: crescent_liquidstaking_v1beta1_tx_pb.MsgLiquidUnstakeResponse,
    requestSerialize: serialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstake,
    requestDeserialize: deserialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstake,
    responseSerialize: serialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstakeResponse,
    responseDeserialize: deserialize_crescent_liquidstaking_v1beta1_MsgLiquidUnstakeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
