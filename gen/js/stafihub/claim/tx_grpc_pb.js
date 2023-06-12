// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_claim_tx_pb = require('../../stafihub/claim/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_claim_MsgClaim(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgClaim(buffer_arg) {
  return stafihub_claim_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgClaimResponse(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgClaimResponse(buffer_arg) {
  return stafihub_claim_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgProvideToken(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgProvideToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgProvideToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgProvideToken(buffer_arg) {
  return stafihub_claim_tx_pb.MsgProvideToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgProvideTokenResponse(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgProvideTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgProvideTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgProvideTokenResponse(buffer_arg) {
  return stafihub_claim_tx_pb.MsgProvideTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgSetMerkleRoot(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgSetMerkleRoot)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgSetMerkleRoot');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgSetMerkleRoot(buffer_arg) {
  return stafihub_claim_tx_pb.MsgSetMerkleRoot.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgSetMerkleRootResponse(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgSetMerkleRootResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgSetMerkleRootResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgSetMerkleRootResponse(buffer_arg) {
  return stafihub_claim_tx_pb.MsgSetMerkleRootResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgToggleClaimSwitch(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgToggleClaimSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgToggleClaimSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgToggleClaimSwitch(buffer_arg) {
  return stafihub_claim_tx_pb.MsgToggleClaimSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgToggleClaimSwitchResponse(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgToggleClaimSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgToggleClaimSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgToggleClaimSwitchResponse(buffer_arg) {
  return stafihub_claim_tx_pb.MsgToggleClaimSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgWithdrawToken(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgWithdrawToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgWithdrawToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgWithdrawToken(buffer_arg) {
  return stafihub_claim_tx_pb.MsgWithdrawToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_MsgWithdrawTokenResponse(arg) {
  if (!(arg instanceof stafihub_claim_tx_pb.MsgWithdrawTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.MsgWithdrawTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_MsgWithdrawTokenResponse(buffer_arg) {
  return stafihub_claim_tx_pb.MsgWithdrawTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setMerkleRoot: {
    path: '/stafihub.stafihub.claim.Msg/SetMerkleRoot',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_tx_pb.MsgSetMerkleRoot,
    responseType: stafihub_claim_tx_pb.MsgSetMerkleRootResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_MsgSetMerkleRoot,
    requestDeserialize: deserialize_stafihub_stafihub_claim_MsgSetMerkleRoot,
    responseSerialize: serialize_stafihub_stafihub_claim_MsgSetMerkleRootResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_MsgSetMerkleRootResponse,
  },
  claim: {
    path: '/stafihub.stafihub.claim.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_tx_pb.MsgClaim,
    responseType: stafihub_claim_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_MsgClaim,
    requestDeserialize: deserialize_stafihub_stafihub_claim_MsgClaim,
    responseSerialize: serialize_stafihub_stafihub_claim_MsgClaimResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_MsgClaimResponse,
  },
  toggleClaimSwitch: {
    path: '/stafihub.stafihub.claim.Msg/ToggleClaimSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_tx_pb.MsgToggleClaimSwitch,
    responseType: stafihub_claim_tx_pb.MsgToggleClaimSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_MsgToggleClaimSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_claim_MsgToggleClaimSwitch,
    responseSerialize: serialize_stafihub_stafihub_claim_MsgToggleClaimSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_MsgToggleClaimSwitchResponse,
  },
  provideToken: {
    path: '/stafihub.stafihub.claim.Msg/ProvideToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_tx_pb.MsgProvideToken,
    responseType: stafihub_claim_tx_pb.MsgProvideTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_MsgProvideToken,
    requestDeserialize: deserialize_stafihub_stafihub_claim_MsgProvideToken,
    responseSerialize: serialize_stafihub_stafihub_claim_MsgProvideTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_MsgProvideTokenResponse,
  },
  withdrawToken: {
    path: '/stafihub.stafihub.claim.Msg/WithdrawToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_tx_pb.MsgWithdrawToken,
    responseType: stafihub_claim_tx_pb.MsgWithdrawTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_MsgWithdrawToken,
    requestDeserialize: deserialize_stafihub_stafihub_claim_MsgWithdrawToken,
    responseSerialize: serialize_stafihub_stafihub_claim_MsgWithdrawTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_MsgWithdrawTokenResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
