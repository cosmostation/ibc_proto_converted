// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_esm_v1beta1_tx_pb = require('../../../comdex/esm/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var comdex_esm_v1beta1_esm_pb = require('../../../comdex/esm/v1beta1/esm_pb.js');

function serialize_comdex_esm_v1beta1_MsgCollateralRedemptionRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgCollateralRedemptionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgCollateralRedemptionRequest(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgCollateralRedemptionResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgCollateralRedemptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgCollateralRedemptionResponse(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgDepositESM(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgDepositESM)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgDepositESM');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgDepositESM(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgDepositESM.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgDepositESMResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgDepositESMResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgDepositESMResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgDepositESMResponse(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgDepositESMResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgExecuteESM(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgExecuteESM)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgExecuteESM');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgExecuteESM(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgExecuteESM.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgExecuteESMResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgExecuteESMResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgExecuteESMResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgExecuteESMResponse(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgExecuteESMResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgKillRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgKillRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgKillRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgKillRequest(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgKillRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_MsgKillResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_tx_pb.MsgKillResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.MsgKillResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_MsgKillResponse(buffer_arg) {
  return comdex_esm_v1beta1_tx_pb.MsgKillResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  depositESM: {
    path: '/comdex.esm.v1beta1.Msg/DepositESM',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_tx_pb.MsgDepositESM,
    responseType: comdex_esm_v1beta1_tx_pb.MsgDepositESMResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_MsgDepositESM,
    requestDeserialize: deserialize_comdex_esm_v1beta1_MsgDepositESM,
    responseSerialize: serialize_comdex_esm_v1beta1_MsgDepositESMResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_MsgDepositESMResponse,
  },
  executeESM: {
    path: '/comdex.esm.v1beta1.Msg/ExecuteESM',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_tx_pb.MsgExecuteESM,
    responseType: comdex_esm_v1beta1_tx_pb.MsgExecuteESMResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_MsgExecuteESM,
    requestDeserialize: deserialize_comdex_esm_v1beta1_MsgExecuteESM,
    responseSerialize: serialize_comdex_esm_v1beta1_MsgExecuteESMResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_MsgExecuteESMResponse,
  },
  msgKillSwitch: {
    path: '/comdex.esm.v1beta1.Msg/MsgKillSwitch',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_tx_pb.MsgKillRequest,
    responseType: comdex_esm_v1beta1_tx_pb.MsgKillResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_MsgKillRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_MsgKillRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_MsgKillResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_MsgKillResponse,
  },
  msgCollateralRedemption: {
    path: '/comdex.esm.v1beta1.Msg/MsgCollateralRedemption',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionRequest,
    responseType: comdex_esm_v1beta1_tx_pb.MsgCollateralRedemptionResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_MsgCollateralRedemptionRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_MsgCollateralRedemptionRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_MsgCollateralRedemptionResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_MsgCollateralRedemptionResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
