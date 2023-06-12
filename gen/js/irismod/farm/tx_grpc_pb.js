// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_farm_tx_pb = require('../../irismod/farm/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_farm_MsgAdjustPool(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgAdjustPool)) {
    throw new Error('Expected argument of type irismod.farm.MsgAdjustPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgAdjustPool(buffer_arg) {
  return irismod_farm_tx_pb.MsgAdjustPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgAdjustPoolResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgAdjustPoolResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgAdjustPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgAdjustPoolResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgAdjustPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgCreatePool(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type irismod.farm.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgCreatePool(buffer_arg) {
  return irismod_farm_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgCreatePoolResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgDestroyPool(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgDestroyPool)) {
    throw new Error('Expected argument of type irismod.farm.MsgDestroyPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgDestroyPool(buffer_arg) {
  return irismod_farm_tx_pb.MsgDestroyPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgDestroyPoolResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgDestroyPoolResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgDestroyPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgDestroyPoolResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgDestroyPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgHarvest(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgHarvest)) {
    throw new Error('Expected argument of type irismod.farm.MsgHarvest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgHarvest(buffer_arg) {
  return irismod_farm_tx_pb.MsgHarvest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgHarvestResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgHarvestResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgHarvestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgHarvestResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgHarvestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgStake(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgStake)) {
    throw new Error('Expected argument of type irismod.farm.MsgStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgStake(buffer_arg) {
  return irismod_farm_tx_pb.MsgStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgStakeResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgStakeResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgStakeResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgUnstake(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgUnstake)) {
    throw new Error('Expected argument of type irismod.farm.MsgUnstake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgUnstake(buffer_arg) {
  return irismod_farm_tx_pb.MsgUnstake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_MsgUnstakeResponse(arg) {
  if (!(arg instanceof irismod_farm_tx_pb.MsgUnstakeResponse)) {
    throw new Error('Expected argument of type irismod.farm.MsgUnstakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_MsgUnstakeResponse(buffer_arg) {
  return irismod_farm_tx_pb.MsgUnstakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the farm Msg service.
var MsgService = exports.MsgService = {
  // CreatePool defines a method for creating a new farm pool
createPool: {
    path: '/irismod.farm.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgCreatePool,
    responseType: irismod_farm_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_irismod_farm_MsgCreatePool,
    requestDeserialize: deserialize_irismod_farm_MsgCreatePool,
    responseSerialize: serialize_irismod_farm_MsgCreatePoolResponse,
    responseDeserialize: deserialize_irismod_farm_MsgCreatePoolResponse,
  },
  // DestroyPool defines a method for destroying a existed farm pool
destroyPool: {
    path: '/irismod.farm.Msg/DestroyPool',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgDestroyPool,
    responseType: irismod_farm_tx_pb.MsgDestroyPoolResponse,
    requestSerialize: serialize_irismod_farm_MsgDestroyPool,
    requestDeserialize: deserialize_irismod_farm_MsgDestroyPool,
    responseSerialize: serialize_irismod_farm_MsgDestroyPoolResponse,
    responseDeserialize: deserialize_irismod_farm_MsgDestroyPoolResponse,
  },
  // AdjustPool defines a method for adjusting the farm pool params
adjustPool: {
    path: '/irismod.farm.Msg/AdjustPool',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgAdjustPool,
    responseType: irismod_farm_tx_pb.MsgAdjustPoolResponse,
    requestSerialize: serialize_irismod_farm_MsgAdjustPool,
    requestDeserialize: deserialize_irismod_farm_MsgAdjustPool,
    responseSerialize: serialize_irismod_farm_MsgAdjustPoolResponse,
    responseDeserialize: deserialize_irismod_farm_MsgAdjustPoolResponse,
  },
  // Stake defines a method for staking some lp token to a farm pool
stake: {
    path: '/irismod.farm.Msg/Stake',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgStake,
    responseType: irismod_farm_tx_pb.MsgStakeResponse,
    requestSerialize: serialize_irismod_farm_MsgStake,
    requestDeserialize: deserialize_irismod_farm_MsgStake,
    responseSerialize: serialize_irismod_farm_MsgStakeResponse,
    responseDeserialize: deserialize_irismod_farm_MsgStakeResponse,
  },
  // Unstake defines a method for unstaking some lp token from a farm pool and
// withdraw some reward
unstake: {
    path: '/irismod.farm.Msg/Unstake',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgUnstake,
    responseType: irismod_farm_tx_pb.MsgUnstakeResponse,
    requestSerialize: serialize_irismod_farm_MsgUnstake,
    requestDeserialize: deserialize_irismod_farm_MsgUnstake,
    responseSerialize: serialize_irismod_farm_MsgUnstakeResponse,
    responseDeserialize: deserialize_irismod_farm_MsgUnstakeResponse,
  },
  // Harvest defines a method withdraw some reward from a farm pool
harvest: {
    path: '/irismod.farm.Msg/Harvest',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_tx_pb.MsgHarvest,
    responseType: irismod_farm_tx_pb.MsgHarvestResponse,
    requestSerialize: serialize_irismod_farm_MsgHarvest,
    requestDeserialize: deserialize_irismod_farm_MsgHarvest,
    responseSerialize: serialize_irismod_farm_MsgHarvestResponse,
    responseDeserialize: deserialize_irismod_farm_MsgHarvestResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
