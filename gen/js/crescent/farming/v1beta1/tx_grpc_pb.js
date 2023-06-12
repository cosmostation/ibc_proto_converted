// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_farming_v1beta1_tx_pb = require('../../../crescent/farming/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_crescent_farming_v1beta1_MsgAdvanceEpoch(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgAdvanceEpoch)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgAdvanceEpoch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgAdvanceEpoch(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgAdvanceEpoch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgAdvanceEpochResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgAdvanceEpochResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgAdvanceEpochResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgAdvanceEpochResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgAdvanceEpochResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlan(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlan)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgCreateFixedAmountPlan');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlan(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlan.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlanResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlanResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgCreateFixedAmountPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlanResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgCreateRatioPlan(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlan)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgCreateRatioPlan');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgCreateRatioPlan(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlan.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgCreateRatioPlanResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlanResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgCreateRatioPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgCreateRatioPlanResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgHarvest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgHarvest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgHarvest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgHarvest(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgHarvest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgHarvestResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgHarvestResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgHarvestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgHarvestResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgHarvestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgRemovePlan(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgRemovePlan)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgRemovePlan');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgRemovePlan(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgRemovePlan.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgRemovePlanResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgRemovePlanResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgRemovePlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgRemovePlanResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgRemovePlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgStake(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgStake)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgStake(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgStakeResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgStakeResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgStakeResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgUnstake(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgUnstake)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgUnstake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgUnstake(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgUnstake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_MsgUnstakeResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_tx_pb.MsgUnstakeResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.MsgUnstakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_MsgUnstakeResponse(buffer_arg) {
  return crescent_farming_v1beta1_tx_pb.MsgUnstakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the farming Msg service.
var MsgService = exports.MsgService = {
  // CreateFixedAmountPlan defines a method for creating a new fixed amount
// farming plan
createFixedAmountPlan: {
    path: '/crescent.farming.v1beta1.Msg/CreateFixedAmountPlan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlan,
    responseType: crescent_farming_v1beta1_tx_pb.MsgCreateFixedAmountPlanResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlan,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlan,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlanResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgCreateFixedAmountPlanResponse,
  },
  // CreateRatioPlan defines a method for creating a new ratio farming plan
createRatioPlan: {
    path: '/crescent.farming.v1beta1.Msg/CreateRatioPlan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlan,
    responseType: crescent_farming_v1beta1_tx_pb.MsgCreateRatioPlanResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgCreateRatioPlan,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgCreateRatioPlan,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgCreateRatioPlanResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgCreateRatioPlanResponse,
  },
  // Stake defines a method for staking coins into the farming plan
stake: {
    path: '/crescent.farming.v1beta1.Msg/Stake',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgStake,
    responseType: crescent_farming_v1beta1_tx_pb.MsgStakeResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgStake,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgStake,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgStakeResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgStakeResponse,
  },
  // Unstake defines a method for unstaking coins from the farming plan
unstake: {
    path: '/crescent.farming.v1beta1.Msg/Unstake',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgUnstake,
    responseType: crescent_farming_v1beta1_tx_pb.MsgUnstakeResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgUnstake,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgUnstake,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgUnstakeResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgUnstakeResponse,
  },
  // Harvest defines a method for claiming farming rewards
harvest: {
    path: '/crescent.farming.v1beta1.Msg/Harvest',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgHarvest,
    responseType: crescent_farming_v1beta1_tx_pb.MsgHarvestResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgHarvest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgHarvest,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgHarvestResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgHarvestResponse,
  },
  // RemovePlan defines a method for removing a terminated plan.
removePlan: {
    path: '/crescent.farming.v1beta1.Msg/RemovePlan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgRemovePlan,
    responseType: crescent_farming_v1beta1_tx_pb.MsgRemovePlanResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgRemovePlan,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgRemovePlan,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgRemovePlanResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgRemovePlanResponse,
  },
  // AdvanceEpoch defines a method for advancing epoch by one, just for testing purpose
// and shouldn't be used in real world
advanceEpoch: {
    path: '/crescent.farming.v1beta1.Msg/AdvanceEpoch',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_tx_pb.MsgAdvanceEpoch,
    responseType: crescent_farming_v1beta1_tx_pb.MsgAdvanceEpochResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_MsgAdvanceEpoch,
    requestDeserialize: deserialize_crescent_farming_v1beta1_MsgAdvanceEpoch,
    responseSerialize: serialize_crescent_farming_v1beta1_MsgAdvanceEpochResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_MsgAdvanceEpochResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
