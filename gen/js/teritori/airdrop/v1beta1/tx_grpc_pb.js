// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var teritori_airdrop_v1beta1_tx_pb = require('../../../teritori/airdrop/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var teritori_airdrop_v1beta1_allocation_pb = require('../../../teritori/airdrop/v1beta1/allocation_pb.js');

function serialize_teritori_airdrop_v1beta1_MsgClaimAllocation(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocation)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgClaimAllocation');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgClaimAllocation(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocation.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgClaimAllocationResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocationResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgClaimAllocationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgClaimAllocationResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgDepositTokens(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgDepositTokens)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgDepositTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgDepositTokens(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgDepositTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgDepositTokensResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgDepositTokensResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgDepositTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgDepositTokensResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgDepositTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgSetAllocation(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgSetAllocation)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgSetAllocation');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgSetAllocation(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgSetAllocation.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgSetAllocationResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgSetAllocationResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgSetAllocationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgSetAllocationResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgSetAllocationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnership(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnership)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgTransferModuleOwnership');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnership(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnership.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnershipResponse(arg) {
  if (!(arg instanceof teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnershipResponse)) {
    throw new Error('Expected argument of type teritori.airdrop.v1beta1.MsgTransferModuleOwnershipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnershipResponse(buffer_arg) {
  return teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnershipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the staking Msg service.
var MsgService = exports.MsgService = {
  // ClaimAllocation defines a method to claim allocation
claimAllocation: {
    path: '/teritori.airdrop.v1beta1.Msg/ClaimAllocation',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocation,
    responseType: teritori_airdrop_v1beta1_tx_pb.MsgClaimAllocationResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_MsgClaimAllocation,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_MsgClaimAllocation,
    responseSerialize: serialize_teritori_airdrop_v1beta1_MsgClaimAllocationResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_MsgClaimAllocationResponse,
  },
  // SetAllocation defines a method to set allocation
setAllocation: {
    path: '/teritori.airdrop.v1beta1.Msg/SetAllocation',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_tx_pb.MsgSetAllocation,
    responseType: teritori_airdrop_v1beta1_tx_pb.MsgSetAllocationResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_MsgSetAllocation,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_MsgSetAllocation,
    responseSerialize: serialize_teritori_airdrop_v1beta1_MsgSetAllocationResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_MsgSetAllocationResponse,
  },
  // TransferModuleOwnership defines a method to transfer module ownership to other address
transferModuleOwnership: {
    path: '/teritori.airdrop.v1beta1.Msg/TransferModuleOwnership',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnership,
    responseType: teritori_airdrop_v1beta1_tx_pb.MsgTransferModuleOwnershipResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnership,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnership,
    responseSerialize: serialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnershipResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_MsgTransferModuleOwnershipResponse,
  },
  // DepositTokens defines a method to deposit tokens to the module
depositTokens: {
    path: '/teritori.airdrop.v1beta1.Msg/DepositTokens',
    requestStream: false,
    responseStream: false,
    requestType: teritori_airdrop_v1beta1_tx_pb.MsgDepositTokens,
    responseType: teritori_airdrop_v1beta1_tx_pb.MsgDepositTokensResponse,
    requestSerialize: serialize_teritori_airdrop_v1beta1_MsgDepositTokens,
    requestDeserialize: deserialize_teritori_airdrop_v1beta1_MsgDepositTokens,
    responseSerialize: serialize_teritori_airdrop_v1beta1_MsgDepositTokensResponse,
    responseDeserialize: deserialize_teritori_airdrop_v1beta1_MsgDepositTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
