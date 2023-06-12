// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var pstake_liquidstakeibc_v1beta1_msgs_pb = require('../../../pstake/liquidstakeibc/v1beta1/msgs_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var pstake_liquidstakeibc_v1beta1_liquidstakeibc_pb = require('../../../pstake/liquidstakeibc/v1beta1/liquidstakeibc_pb.js');

function serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStake(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStake)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgLiquidStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStake(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStakeResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStakeResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgLiquidStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStakeResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstake(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstake)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgLiquidUnstake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstake(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstakeResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstakeResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgLiquidUnstakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstakeResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgRedeem(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeem)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgRedeem');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgRedeem(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeem.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgRedeemResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeemResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgRedeemResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgRedeemResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeemResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChain(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChain)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgRegisterHostChain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChain(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChainResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChainResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgRegisterHostChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChainResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChain(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChain)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgUpdateHostChain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChain(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChainResponse(arg) {
  if (!(arg instanceof pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChainResponse)) {
    throw new Error('Expected argument of type pstake.liquidstakeibc.v1beta1.MsgUpdateHostChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChainResponse(buffer_arg) {
  return pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the liquidstakeibc services.
var MsgService = exports.MsgService = {
  registerHostChain: {
    path: '/pstake.liquidstakeibc.v1beta1.Msg/RegisterHostChain',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChain,
    responseType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRegisterHostChainResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChain,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChain,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChainResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgRegisterHostChainResponse,
  },
  updateHostChain: {
    path: '/pstake.liquidstakeibc.v1beta1.Msg/UpdateHostChain',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChain,
    responseType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgUpdateHostChainResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChain,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChain,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChainResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgUpdateHostChainResponse,
  },
  liquidStake: {
    path: '/pstake.liquidstakeibc.v1beta1.Msg/LiquidStake',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStake,
    responseType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidStakeResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStake,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStake,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStakeResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidStakeResponse,
  },
  liquidUnstake: {
    path: '/pstake.liquidstakeibc.v1beta1.Msg/LiquidUnstake',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstake,
    responseType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgLiquidUnstakeResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstake,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstake,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstakeResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgLiquidUnstakeResponse,
  },
  redeem: {
    path: '/pstake.liquidstakeibc.v1beta1.Msg/Redeem',
    requestStream: false,
    responseStream: false,
    requestType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeem,
    responseType: pstake_liquidstakeibc_v1beta1_msgs_pb.MsgRedeemResponse,
    requestSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgRedeem,
    requestDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgRedeem,
    responseSerialize: serialize_pstake_liquidstakeibc_v1beta1_MsgRedeemResponse,
    responseDeserialize: deserialize_pstake_liquidstakeibc_v1beta1_MsgRedeemResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
