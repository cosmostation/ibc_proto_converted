// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_locker_v1beta1_tx_pb = require('../../../comdex/locker/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_comdex_locker_v1beta1_MsgCloseLockerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgCloseLockerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgCloseLockerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgCloseLockerRequest(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgCloseLockerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgCloseLockerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgCloseLockerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgCloseLockerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgCloseLockerResponse(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgCloseLockerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgCreateLockerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgCreateLockerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgCreateLockerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgCreateLockerRequest(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgCreateLockerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgCreateLockerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgCreateLockerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgCreateLockerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgCreateLockerResponse(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgCreateLockerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgDepositAssetRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgDepositAssetRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgDepositAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgDepositAssetRequest(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgDepositAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgDepositAssetResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgDepositAssetResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgDepositAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgDepositAssetResponse(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgDepositAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgLockerRewardCalcRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgLockerRewardCalcRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgLockerRewardCalcRequest(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgLockerRewardCalcResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgLockerRewardCalcResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgLockerRewardCalcResponse(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgWithdrawAssetRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgWithdrawAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgWithdrawAssetRequest(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_MsgWithdrawAssetResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.MsgWithdrawAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_MsgWithdrawAssetResponse(buffer_arg) {
  return comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// For CLI Command & Proposals 
var MsgService = exports.MsgService = {
  msgCreateLocker: {
    path: '/comdex.locker.v1beta1.Msg/MsgCreateLocker',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_tx_pb.MsgCreateLockerRequest,
    responseType: comdex_locker_v1beta1_tx_pb.MsgCreateLockerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_MsgCreateLockerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_MsgCreateLockerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_MsgCreateLockerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_MsgCreateLockerResponse,
  },
  msgDepositAsset: {
    path: '/comdex.locker.v1beta1.Msg/MsgDepositAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_tx_pb.MsgDepositAssetRequest,
    responseType: comdex_locker_v1beta1_tx_pb.MsgDepositAssetResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_MsgDepositAssetRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_MsgDepositAssetRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_MsgDepositAssetResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_MsgDepositAssetResponse,
  },
  msgWithdrawAsset: {
    path: '/comdex.locker.v1beta1.Msg/MsgWithdrawAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetRequest,
    responseType: comdex_locker_v1beta1_tx_pb.MsgWithdrawAssetResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_MsgWithdrawAssetRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_MsgWithdrawAssetRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_MsgWithdrawAssetResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_MsgWithdrawAssetResponse,
  },
  msgCloseLocker: {
    path: '/comdex.locker.v1beta1.Msg/MsgCloseLocker',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_tx_pb.MsgCloseLockerRequest,
    responseType: comdex_locker_v1beta1_tx_pb.MsgCloseLockerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_MsgCloseLockerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_MsgCloseLockerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_MsgCloseLockerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_MsgCloseLockerResponse,
  },
  msgLockerRewardCalc: {
    path: '/comdex.locker.v1beta1.Msg/MsgLockerRewardCalc',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcRequest,
    responseType: comdex_locker_v1beta1_tx_pb.MsgLockerRewardCalcResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_MsgLockerRewardCalcRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_MsgLockerRewardCalcRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_MsgLockerRewardCalcResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_MsgLockerRewardCalcResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
