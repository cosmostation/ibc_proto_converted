// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_claim_tx_pb = require('../../stride/claim/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stride_claim_MsgClaimFreeAmount(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgClaimFreeAmount)) {
    throw new Error('Expected argument of type stride.claim.MsgClaimFreeAmount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgClaimFreeAmount(buffer_arg) {
  return stride_claim_tx_pb.MsgClaimFreeAmount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgClaimFreeAmountResponse(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgClaimFreeAmountResponse)) {
    throw new Error('Expected argument of type stride.claim.MsgClaimFreeAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgClaimFreeAmountResponse(buffer_arg) {
  return stride_claim_tx_pb.MsgClaimFreeAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgCreateAirdrop(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgCreateAirdrop)) {
    throw new Error('Expected argument of type stride.claim.MsgCreateAirdrop');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgCreateAirdrop(buffer_arg) {
  return stride_claim_tx_pb.MsgCreateAirdrop.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgCreateAirdropResponse(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgCreateAirdropResponse)) {
    throw new Error('Expected argument of type stride.claim.MsgCreateAirdropResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgCreateAirdropResponse(buffer_arg) {
  return stride_claim_tx_pb.MsgCreateAirdropResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgDeleteAirdrop(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgDeleteAirdrop)) {
    throw new Error('Expected argument of type stride.claim.MsgDeleteAirdrop');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgDeleteAirdrop(buffer_arg) {
  return stride_claim_tx_pb.MsgDeleteAirdrop.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgDeleteAirdropResponse(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgDeleteAirdropResponse)) {
    throw new Error('Expected argument of type stride.claim.MsgDeleteAirdropResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgDeleteAirdropResponse(buffer_arg) {
  return stride_claim_tx_pb.MsgDeleteAirdropResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgSetAirdropAllocations(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgSetAirdropAllocations)) {
    throw new Error('Expected argument of type stride.claim.MsgSetAirdropAllocations');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgSetAirdropAllocations(buffer_arg) {
  return stride_claim_tx_pb.MsgSetAirdropAllocations.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_MsgSetAirdropAllocationsResponse(arg) {
  if (!(arg instanceof stride_claim_tx_pb.MsgSetAirdropAllocationsResponse)) {
    throw new Error('Expected argument of type stride.claim.MsgSetAirdropAllocationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_MsgSetAirdropAllocationsResponse(buffer_arg) {
  return stride_claim_tx_pb.MsgSetAirdropAllocationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setAirdropAllocations: {
    path: '/stride.claim.Msg/SetAirdropAllocations',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_tx_pb.MsgSetAirdropAllocations,
    responseType: stride_claim_tx_pb.MsgSetAirdropAllocationsResponse,
    requestSerialize: serialize_stride_claim_MsgSetAirdropAllocations,
    requestDeserialize: deserialize_stride_claim_MsgSetAirdropAllocations,
    responseSerialize: serialize_stride_claim_MsgSetAirdropAllocationsResponse,
    responseDeserialize: deserialize_stride_claim_MsgSetAirdropAllocationsResponse,
  },
  claimFreeAmount: {
    path: '/stride.claim.Msg/ClaimFreeAmount',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_tx_pb.MsgClaimFreeAmount,
    responseType: stride_claim_tx_pb.MsgClaimFreeAmountResponse,
    requestSerialize: serialize_stride_claim_MsgClaimFreeAmount,
    requestDeserialize: deserialize_stride_claim_MsgClaimFreeAmount,
    responseSerialize: serialize_stride_claim_MsgClaimFreeAmountResponse,
    responseDeserialize: deserialize_stride_claim_MsgClaimFreeAmountResponse,
  },
  createAirdrop: {
    path: '/stride.claim.Msg/CreateAirdrop',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_tx_pb.MsgCreateAirdrop,
    responseType: stride_claim_tx_pb.MsgCreateAirdropResponse,
    requestSerialize: serialize_stride_claim_MsgCreateAirdrop,
    requestDeserialize: deserialize_stride_claim_MsgCreateAirdrop,
    responseSerialize: serialize_stride_claim_MsgCreateAirdropResponse,
    responseDeserialize: deserialize_stride_claim_MsgCreateAirdropResponse,
  },
  deleteAirdrop: {
    path: '/stride.claim.Msg/DeleteAirdrop',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_tx_pb.MsgDeleteAirdrop,
    responseType: stride_claim_tx_pb.MsgDeleteAirdropResponse,
    requestSerialize: serialize_stride_claim_MsgDeleteAirdrop,
    requestDeserialize: deserialize_stride_claim_MsgDeleteAirdrop,
    responseSerialize: serialize_stride_claim_MsgDeleteAirdropResponse,
    responseDeserialize: deserialize_stride_claim_MsgDeleteAirdropResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
