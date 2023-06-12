// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_lpfarm_v1beta1_tx_pb = require('../../../crescent/lpfarm/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var crescent_lpfarm_v1beta1_lpfarm_pb = require('../../../crescent/lpfarm/v1beta1/lpfarm_pb.js');

function serialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlan)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgCreatePrivatePlan');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlan.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlanResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgFarm(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgFarm)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgFarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgFarm(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgFarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgFarmResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgFarmResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgFarmResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgHarvest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgHarvest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgHarvest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgHarvest(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgHarvest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgHarvestResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgHarvestResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgHarvestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgHarvestResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgHarvestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgUnfarm(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgUnfarm)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgUnfarm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgUnfarm(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgUnfarm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_MsgUnfarmResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_tx_pb.MsgUnfarmResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.MsgUnfarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_MsgUnfarmResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_tx_pb.MsgUnfarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createPrivatePlan: {
    path: '/crescent.lpfarm.v1beta1.Msg/CreatePrivatePlan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlan,
    responseType: crescent_lpfarm_v1beta1_tx_pb.MsgCreatePrivatePlanResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse,
  },
  farm: {
    path: '/crescent.lpfarm.v1beta1.Msg/Farm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_tx_pb.MsgFarm,
    responseType: crescent_lpfarm_v1beta1_tx_pb.MsgFarmResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_MsgFarm,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgFarm,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_MsgFarmResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgFarmResponse,
  },
  unfarm: {
    path: '/crescent.lpfarm.v1beta1.Msg/Unfarm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_tx_pb.MsgUnfarm,
    responseType: crescent_lpfarm_v1beta1_tx_pb.MsgUnfarmResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_MsgUnfarm,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgUnfarm,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_MsgUnfarmResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgUnfarmResponse,
  },
  harvest: {
    path: '/crescent.lpfarm.v1beta1.Msg/Harvest',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_tx_pb.MsgHarvest,
    responseType: crescent_lpfarm_v1beta1_tx_pb.MsgHarvestResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_MsgHarvest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgHarvest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_MsgHarvestResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_MsgHarvestResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
