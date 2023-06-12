// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var xpla_reward_v1beta1_tx_pb = require('../../../xpla/reward/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_xpla_reward_v1beta1_MsgFundFeeCollector(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_tx_pb.MsgFundFeeCollector)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.MsgFundFeeCollector');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_MsgFundFeeCollector(buffer_arg) {
  return xpla_reward_v1beta1_tx_pb.MsgFundFeeCollector.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_xpla_reward_v1beta1_MsgFundFeeCollectorResponse(arg) {
  if (!(arg instanceof xpla_reward_v1beta1_tx_pb.MsgFundFeeCollectorResponse)) {
    throw new Error('Expected argument of type xpla.reward.v1beta1.MsgFundFeeCollectorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_xpla_reward_v1beta1_MsgFundFeeCollectorResponse(buffer_arg) {
  return xpla_reward_v1beta1_tx_pb.MsgFundFeeCollectorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  // FundFeeCollector defines a method to allow an account to directly
// fund the fee collector.
fundFeeCollector: {
    path: '/xpla.reward.v1beta1.Msg/FundFeeCollector',
    requestStream: false,
    responseStream: false,
    requestType: xpla_reward_v1beta1_tx_pb.MsgFundFeeCollector,
    responseType: xpla_reward_v1beta1_tx_pb.MsgFundFeeCollectorResponse,
    requestSerialize: serialize_xpla_reward_v1beta1_MsgFundFeeCollector,
    requestDeserialize: deserialize_xpla_reward_v1beta1_MsgFundFeeCollector,
    responseSerialize: serialize_xpla_reward_v1beta1_MsgFundFeeCollectorResponse,
    responseDeserialize: deserialize_xpla_reward_v1beta1_MsgFundFeeCollectorResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
