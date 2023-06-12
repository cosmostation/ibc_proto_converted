// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_authority_v1_tx_pb = require('../../../em/authority/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_upgrade_v1beta1_upgrade_pb = require('../../../cosmos/upgrade/v1beta1/upgrade_pb.js');
var cosmos_params_v1beta1_params_pb = require('../../../cosmos/params/v1beta1/params_pb.js');

function serialize_em_authority_v1_MsgCreateIssuer(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgCreateIssuer)) {
    throw new Error('Expected argument of type em.authority.v1.MsgCreateIssuer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgCreateIssuer(buffer_arg) {
  return em_authority_v1_tx_pb.MsgCreateIssuer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgCreateIssuerResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgCreateIssuerResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgCreateIssuerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgCreateIssuerResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgCreateIssuerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgDestroyIssuer(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgDestroyIssuer)) {
    throw new Error('Expected argument of type em.authority.v1.MsgDestroyIssuer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgDestroyIssuer(buffer_arg) {
  return em_authority_v1_tx_pb.MsgDestroyIssuer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgDestroyIssuerResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgDestroyIssuerResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgDestroyIssuerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgDestroyIssuerResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgDestroyIssuerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgReplaceAuthority(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgReplaceAuthority)) {
    throw new Error('Expected argument of type em.authority.v1.MsgReplaceAuthority');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgReplaceAuthority(buffer_arg) {
  return em_authority_v1_tx_pb.MsgReplaceAuthority.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgReplaceAuthorityResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgReplaceAuthorityResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgReplaceAuthorityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgReplaceAuthorityResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgReplaceAuthorityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgScheduleUpgrade(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgScheduleUpgrade)) {
    throw new Error('Expected argument of type em.authority.v1.MsgScheduleUpgrade');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgScheduleUpgrade(buffer_arg) {
  return em_authority_v1_tx_pb.MsgScheduleUpgrade.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgScheduleUpgradeResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgScheduleUpgradeResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgScheduleUpgradeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgScheduleUpgradeResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgScheduleUpgradeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgSetGasPrices(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgSetGasPrices)) {
    throw new Error('Expected argument of type em.authority.v1.MsgSetGasPrices');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgSetGasPrices(buffer_arg) {
  return em_authority_v1_tx_pb.MsgSetGasPrices.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgSetGasPricesResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgSetGasPricesResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgSetGasPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgSetGasPricesResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgSetGasPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgSetParameters(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgSetParameters)) {
    throw new Error('Expected argument of type em.authority.v1.MsgSetParameters');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgSetParameters(buffer_arg) {
  return em_authority_v1_tx_pb.MsgSetParameters.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_MsgSetParametersResponse(arg) {
  if (!(arg instanceof em_authority_v1_tx_pb.MsgSetParametersResponse)) {
    throw new Error('Expected argument of type em.authority.v1.MsgSetParametersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_MsgSetParametersResponse(buffer_arg) {
  return em_authority_v1_tx_pb.MsgSetParametersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createIssuer: {
    path: '/em.authority.v1.Msg/CreateIssuer',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgCreateIssuer,
    responseType: em_authority_v1_tx_pb.MsgCreateIssuerResponse,
    requestSerialize: serialize_em_authority_v1_MsgCreateIssuer,
    requestDeserialize: deserialize_em_authority_v1_MsgCreateIssuer,
    responseSerialize: serialize_em_authority_v1_MsgCreateIssuerResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgCreateIssuerResponse,
  },
  destroyIssuer: {
    path: '/em.authority.v1.Msg/DestroyIssuer',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgDestroyIssuer,
    responseType: em_authority_v1_tx_pb.MsgDestroyIssuerResponse,
    requestSerialize: serialize_em_authority_v1_MsgDestroyIssuer,
    requestDeserialize: deserialize_em_authority_v1_MsgDestroyIssuer,
    responseSerialize: serialize_em_authority_v1_MsgDestroyIssuerResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgDestroyIssuerResponse,
  },
  setGasPrices: {
    path: '/em.authority.v1.Msg/SetGasPrices',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgSetGasPrices,
    responseType: em_authority_v1_tx_pb.MsgSetGasPricesResponse,
    requestSerialize: serialize_em_authority_v1_MsgSetGasPrices,
    requestDeserialize: deserialize_em_authority_v1_MsgSetGasPrices,
    responseSerialize: serialize_em_authority_v1_MsgSetGasPricesResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgSetGasPricesResponse,
  },
  replaceAuthority: {
    path: '/em.authority.v1.Msg/ReplaceAuthority',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgReplaceAuthority,
    responseType: em_authority_v1_tx_pb.MsgReplaceAuthorityResponse,
    requestSerialize: serialize_em_authority_v1_MsgReplaceAuthority,
    requestDeserialize: deserialize_em_authority_v1_MsgReplaceAuthority,
    responseSerialize: serialize_em_authority_v1_MsgReplaceAuthorityResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgReplaceAuthorityResponse,
  },
  scheduleUpgrade: {
    path: '/em.authority.v1.Msg/ScheduleUpgrade',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgScheduleUpgrade,
    responseType: em_authority_v1_tx_pb.MsgScheduleUpgradeResponse,
    requestSerialize: serialize_em_authority_v1_MsgScheduleUpgrade,
    requestDeserialize: deserialize_em_authority_v1_MsgScheduleUpgrade,
    responseSerialize: serialize_em_authority_v1_MsgScheduleUpgradeResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgScheduleUpgradeResponse,
  },
  setParameters: {
    path: '/em.authority.v1.Msg/SetParameters',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_tx_pb.MsgSetParameters,
    responseType: em_authority_v1_tx_pb.MsgSetParametersResponse,
    requestSerialize: serialize_em_authority_v1_MsgSetParameters,
    requestDeserialize: deserialize_em_authority_v1_MsgSetParameters,
    responseSerialize: serialize_em_authority_v1_MsgSetParametersResponse,
    responseDeserialize: deserialize_em_authority_v1_MsgSetParametersResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
