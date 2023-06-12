// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_team_v1beta1_tx_pb = require('../../../kyve/team/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_kyve_team_v1beta1_MsgClaimAccountRewards(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimAccountRewards)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimAccountRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimAccountRewards(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimAccountRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClaimAccountRewardsResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimAccountRewardsResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimAccountRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimAccountRewardsResponse(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimAccountRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClaimAuthorityRewards(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewards)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimAuthorityRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimAuthorityRewards(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClaimAuthorityRewardsResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewardsResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimAuthorityRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimAuthorityRewardsResponse(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClaimUnlocked(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimUnlocked)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimUnlocked');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimUnlocked(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimUnlocked.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClaimUnlockedResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClaimUnlockedResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClaimUnlockedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClaimUnlockedResponse(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClaimUnlockedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClawback(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClawback)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClawback');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClawback(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClawback.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgClawbackResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgClawbackResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgClawbackResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgClawbackResponse(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgClawbackResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgCreateTeamVestingAccount(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccount)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgCreateTeamVestingAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgCreateTeamVestingAccount(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_MsgCreateTeamVestingAccountResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccountResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.MsgCreateTeamVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_MsgCreateTeamVestingAccountResponse(buffer_arg) {
  return kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // ClaimUnlocked ...
claimUnlocked: {
    path: '/kyve.team.v1beta1.Msg/ClaimUnlocked',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_tx_pb.MsgClaimUnlocked,
    responseType: kyve_team_v1beta1_tx_pb.MsgClaimUnlockedResponse,
    requestSerialize: serialize_kyve_team_v1beta1_MsgClaimUnlocked,
    requestDeserialize: deserialize_kyve_team_v1beta1_MsgClaimUnlocked,
    responseSerialize: serialize_kyve_team_v1beta1_MsgClaimUnlockedResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_MsgClaimUnlockedResponse,
  },
  // Clawback ...
clawback: {
    path: '/kyve.team.v1beta1.Msg/Clawback',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_tx_pb.MsgClawback,
    responseType: kyve_team_v1beta1_tx_pb.MsgClawbackResponse,
    requestSerialize: serialize_kyve_team_v1beta1_MsgClawback,
    requestDeserialize: deserialize_kyve_team_v1beta1_MsgClawback,
    responseSerialize: serialize_kyve_team_v1beta1_MsgClawbackResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_MsgClawbackResponse,
  },
  // CreateTeamVestingAccount ...
createTeamVestingAccount: {
    path: '/kyve.team.v1beta1.Msg/CreateTeamVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccount,
    responseType: kyve_team_v1beta1_tx_pb.MsgCreateTeamVestingAccountResponse,
    requestSerialize: serialize_kyve_team_v1beta1_MsgCreateTeamVestingAccount,
    requestDeserialize: deserialize_kyve_team_v1beta1_MsgCreateTeamVestingAccount,
    responseSerialize: serialize_kyve_team_v1beta1_MsgCreateTeamVestingAccountResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_MsgCreateTeamVestingAccountResponse,
  },
  // ClaimAuthorityRewards ...
claimAuthorityRewards: {
    path: '/kyve.team.v1beta1.Msg/ClaimAuthorityRewards',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewards,
    responseType: kyve_team_v1beta1_tx_pb.MsgClaimAuthorityRewardsResponse,
    requestSerialize: serialize_kyve_team_v1beta1_MsgClaimAuthorityRewards,
    requestDeserialize: deserialize_kyve_team_v1beta1_MsgClaimAuthorityRewards,
    responseSerialize: serialize_kyve_team_v1beta1_MsgClaimAuthorityRewardsResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_MsgClaimAuthorityRewardsResponse,
  },
  // ClaimInflationRewards ...
claimAccountRewards: {
    path: '/kyve.team.v1beta1.Msg/ClaimAccountRewards',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_tx_pb.MsgClaimAccountRewards,
    responseType: kyve_team_v1beta1_tx_pb.MsgClaimAccountRewardsResponse,
    requestSerialize: serialize_kyve_team_v1beta1_MsgClaimAccountRewards,
    requestDeserialize: deserialize_kyve_team_v1beta1_MsgClaimAccountRewards,
    responseSerialize: serialize_kyve_team_v1beta1_MsgClaimAccountRewardsResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_MsgClaimAccountRewardsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
