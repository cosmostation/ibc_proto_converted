// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_issuance_v1beta1_tx_pb = require('../../../kava/issuance/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_issuance_v1beta1_MsgBlockAddress(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgBlockAddress)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgBlockAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgBlockAddress(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgBlockAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgBlockAddressResponse(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgBlockAddressResponse)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgBlockAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgBlockAddressResponse(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgBlockAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgIssueTokens(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgIssueTokens)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgIssueTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgIssueTokens(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgIssueTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgIssueTokensResponse(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgIssueTokensResponse)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgIssueTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgIssueTokensResponse(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgIssueTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgRedeemTokens(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgRedeemTokens)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgRedeemTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgRedeemTokens(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgRedeemTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgRedeemTokensResponse(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgRedeemTokensResponse)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgRedeemTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgRedeemTokensResponse(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgRedeemTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgSetPauseStatus(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgSetPauseStatus)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgSetPauseStatus');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgSetPauseStatus(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgSetPauseStatus.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgSetPauseStatusResponse(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgSetPauseStatusResponse)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgSetPauseStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgSetPauseStatusResponse(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgSetPauseStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgUnblockAddress(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgUnblockAddress)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgUnblockAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgUnblockAddress(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgUnblockAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_issuance_v1beta1_MsgUnblockAddressResponse(arg) {
  if (!(arg instanceof kava_issuance_v1beta1_tx_pb.MsgUnblockAddressResponse)) {
    throw new Error('Expected argument of type kava.issuance.v1beta1.MsgUnblockAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_issuance_v1beta1_MsgUnblockAddressResponse(buffer_arg) {
  return kava_issuance_v1beta1_tx_pb.MsgUnblockAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the issuance Msg service.
var MsgService = exports.MsgService = {
  // IssueTokens message type used by the issuer to issue new tokens
issueTokens: {
    path: '/kava.issuance.v1beta1.Msg/IssueTokens',
    requestStream: false,
    responseStream: false,
    requestType: kava_issuance_v1beta1_tx_pb.MsgIssueTokens,
    responseType: kava_issuance_v1beta1_tx_pb.MsgIssueTokensResponse,
    requestSerialize: serialize_kava_issuance_v1beta1_MsgIssueTokens,
    requestDeserialize: deserialize_kava_issuance_v1beta1_MsgIssueTokens,
    responseSerialize: serialize_kava_issuance_v1beta1_MsgIssueTokensResponse,
    responseDeserialize: deserialize_kava_issuance_v1beta1_MsgIssueTokensResponse,
  },
  // RedeemTokens message type used by the issuer to redeem (burn) tokens
redeemTokens: {
    path: '/kava.issuance.v1beta1.Msg/RedeemTokens',
    requestStream: false,
    responseStream: false,
    requestType: kava_issuance_v1beta1_tx_pb.MsgRedeemTokens,
    responseType: kava_issuance_v1beta1_tx_pb.MsgRedeemTokensResponse,
    requestSerialize: serialize_kava_issuance_v1beta1_MsgRedeemTokens,
    requestDeserialize: deserialize_kava_issuance_v1beta1_MsgRedeemTokens,
    responseSerialize: serialize_kava_issuance_v1beta1_MsgRedeemTokensResponse,
    responseDeserialize: deserialize_kava_issuance_v1beta1_MsgRedeemTokensResponse,
  },
  // BlockAddress message type used by the issuer to block an address from holding or transferring tokens
blockAddress: {
    path: '/kava.issuance.v1beta1.Msg/BlockAddress',
    requestStream: false,
    responseStream: false,
    requestType: kava_issuance_v1beta1_tx_pb.MsgBlockAddress,
    responseType: kava_issuance_v1beta1_tx_pb.MsgBlockAddressResponse,
    requestSerialize: serialize_kava_issuance_v1beta1_MsgBlockAddress,
    requestDeserialize: deserialize_kava_issuance_v1beta1_MsgBlockAddress,
    responseSerialize: serialize_kava_issuance_v1beta1_MsgBlockAddressResponse,
    responseDeserialize: deserialize_kava_issuance_v1beta1_MsgBlockAddressResponse,
  },
  // UnblockAddress message type used by the issuer to unblock an address from holding or transferring tokens
unblockAddress: {
    path: '/kava.issuance.v1beta1.Msg/UnblockAddress',
    requestStream: false,
    responseStream: false,
    requestType: kava_issuance_v1beta1_tx_pb.MsgUnblockAddress,
    responseType: kava_issuance_v1beta1_tx_pb.MsgUnblockAddressResponse,
    requestSerialize: serialize_kava_issuance_v1beta1_MsgUnblockAddress,
    requestDeserialize: deserialize_kava_issuance_v1beta1_MsgUnblockAddress,
    responseSerialize: serialize_kava_issuance_v1beta1_MsgUnblockAddressResponse,
    responseDeserialize: deserialize_kava_issuance_v1beta1_MsgUnblockAddressResponse,
  },
  // SetPauseStatus message type used to pause or unpause status
setPauseStatus: {
    path: '/kava.issuance.v1beta1.Msg/SetPauseStatus',
    requestStream: false,
    responseStream: false,
    requestType: kava_issuance_v1beta1_tx_pb.MsgSetPauseStatus,
    responseType: kava_issuance_v1beta1_tx_pb.MsgSetPauseStatusResponse,
    requestSerialize: serialize_kava_issuance_v1beta1_MsgSetPauseStatus,
    requestDeserialize: deserialize_kava_issuance_v1beta1_MsgSetPauseStatus,
    responseSerialize: serialize_kava_issuance_v1beta1_MsgSetPauseStatusResponse,
    responseDeserialize: deserialize_kava_issuance_v1beta1_MsgSetPauseStatusResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
