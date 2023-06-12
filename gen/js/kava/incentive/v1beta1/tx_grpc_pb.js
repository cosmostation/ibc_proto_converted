// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_incentive_v1beta1_tx_pb = require('../../../kava/incentive/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_incentive_v1beta1_MsgClaimDelegatorReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimDelegatorReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimDelegatorReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimDelegatorRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimDelegatorRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimDelegatorRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimEarnReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimEarnReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimEarnReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimEarnReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimEarnReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimEarnRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimEarnRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimEarnRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimEarnRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimEarnRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimHardReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimHardReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimHardReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimHardReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimHardReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimHardRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimHardRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimHardRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimHardRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimHardRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimSavingsReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimSavingsReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimSavingsReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimSavingsReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimSavingsReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimSavingsRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimSavingsRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimSavingsRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimSavingsRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimSavingsRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimSwapReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimSwapReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimSwapReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimSwapReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimSwapReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimSwapRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimSwapRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimSwapRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimSwapRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimSwapRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimUSDXMintingReward(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingReward)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimUSDXMintingReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimUSDXMintingReward(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_incentive_v1beta1_MsgClaimUSDXMintingRewardResponse(arg) {
  if (!(arg instanceof kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingRewardResponse)) {
    throw new Error('Expected argument of type kava.incentive.v1beta1.MsgClaimUSDXMintingRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_incentive_v1beta1_MsgClaimUSDXMintingRewardResponse(buffer_arg) {
  return kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the incentive Msg service.
var MsgService = exports.MsgService = {
  // ClaimUSDXMintingReward is a message type used to claim USDX minting rewards
claimUSDXMintingReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimUSDXMintingReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimUSDXMintingRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimUSDXMintingReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimUSDXMintingReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimUSDXMintingRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimUSDXMintingRewardResponse,
  },
  // ClaimHardReward is a message type used to claim Hard liquidity provider rewards
claimHardReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimHardReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimHardReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimHardRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimHardReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimHardReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimHardRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimHardRewardResponse,
  },
  // ClaimDelegatorReward is a message type used to claim delegator rewards
claimDelegatorReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimDelegatorReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimDelegatorRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimDelegatorReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimDelegatorReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimDelegatorRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimDelegatorRewardResponse,
  },
  // ClaimSwapReward is a message type used to claim swap rewards
claimSwapReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimSwapReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimSwapReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimSwapRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimSwapReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimSwapReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimSwapRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimSwapRewardResponse,
  },
  // ClaimSavingsReward is a message type used to claim savings rewards
claimSavingsReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimSavingsReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimSavingsReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimSavingsRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimSavingsReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimSavingsReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimSavingsRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimSavingsRewardResponse,
  },
  // ClaimEarnReward is a message type used to claim earn rewards
claimEarnReward: {
    path: '/kava.incentive.v1beta1.Msg/ClaimEarnReward',
    requestStream: false,
    responseStream: false,
    requestType: kava_incentive_v1beta1_tx_pb.MsgClaimEarnReward,
    responseType: kava_incentive_v1beta1_tx_pb.MsgClaimEarnRewardResponse,
    requestSerialize: serialize_kava_incentive_v1beta1_MsgClaimEarnReward,
    requestDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimEarnReward,
    responseSerialize: serialize_kava_incentive_v1beta1_MsgClaimEarnRewardResponse,
    responseDeserialize: deserialize_kava_incentive_v1beta1_MsgClaimEarnRewardResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
