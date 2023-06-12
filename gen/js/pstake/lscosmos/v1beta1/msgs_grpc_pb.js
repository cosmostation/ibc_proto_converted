// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var pstake_lscosmos_v1beta1_msgs_pb = require('../../../pstake/lscosmos/v1beta1/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var pstake_lscosmos_v1beta1_lscosmos_pb = require('../../../pstake/lscosmos/v1beta1/lscosmos_pb.js');

function serialize_pstake_lscosmos_v1beta1_MsgChangeModuleState(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleState)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgChangeModuleState');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgChangeModuleState(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleState.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgChangeModuleStateResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleStateResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgChangeModuleStateResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgClaim(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgClaim)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgClaim(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgClaimResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgClaimResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgJumpStart(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStart)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgJumpStart');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgJumpStart(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStart.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgJumpStartResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStartResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgJumpStartResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgJumpStartResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStartResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgLiquidStake(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStake)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgLiquidStake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgLiquidStake(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgLiquidStakeResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStakeResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgLiquidStakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgLiquidStakeResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgLiquidUnstake(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstake)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgLiquidUnstake');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgLiquidUnstake(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstake.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgLiquidUnstakeResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstakeResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgLiquidUnstakeResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstakeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgRecreateICA(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICA)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgRecreateICA');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgRecreateICA(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICA.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgRecreateICAResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICAResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgRecreateICAResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgRecreateICAResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICAResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgRedeem(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgRedeem)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgRedeem');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgRedeem(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgRedeem.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgRedeemResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgRedeemResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgRedeemResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgRedeemResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgRedeemResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgReportSlashing(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashing)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgReportSlashing');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgReportSlashing(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashing.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_MsgReportSlashingResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashingResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.MsgReportSlashingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_MsgReportSlashingResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the lsCosmos services.
var MsgService = exports.MsgService = {
  liquidStake: {
    path: '/pstake.lscosmos.v1beta1.Msg/LiquidStake',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStake,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidStakeResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgLiquidStake,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgLiquidStake,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgLiquidStakeResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgLiquidStakeResponse,
  },
  liquidUnstake: {
    path: '/pstake.lscosmos.v1beta1.Msg/LiquidUnstake',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstake,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgLiquidUnstakeResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgLiquidUnstake,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgLiquidUnstake,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgLiquidUnstakeResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgLiquidUnstakeResponse,
  },
  redeem: {
    path: '/pstake.lscosmos.v1beta1.Msg/Redeem',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgRedeem,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgRedeemResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgRedeem,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgRedeem,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgRedeemResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgRedeemResponse,
  },
  claim: {
    path: '/pstake.lscosmos.v1beta1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgClaim,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgClaimResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgClaim,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgClaim,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgClaimResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgClaimResponse,
  },
  recreateICA: {
    path: '/pstake.lscosmos.v1beta1.Msg/RecreateICA',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICA,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgRecreateICAResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgRecreateICA,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgRecreateICA,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgRecreateICAResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgRecreateICAResponse,
  },
  jumpStart: {
    path: '/pstake.lscosmos.v1beta1.Msg/JumpStart',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStart,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgJumpStartResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgJumpStart,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgJumpStart,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgJumpStartResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgJumpStartResponse,
  },
  changeModuleState: {
    path: '/pstake.lscosmos.v1beta1.Msg/ChangeModuleState',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleState,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgChangeModuleStateResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgChangeModuleState,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgChangeModuleState,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgChangeModuleStateResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgChangeModuleStateResponse,
  },
  reportSlashing: {
    path: '/pstake.lscosmos.v1beta1.Msg/ReportSlashing',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashing,
    responseType: pstake_lscosmos_v1beta1_msgs_pb.MsgReportSlashingResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_MsgReportSlashing,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgReportSlashing,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_MsgReportSlashingResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_MsgReportSlashingResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
