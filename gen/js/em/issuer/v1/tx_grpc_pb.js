// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_issuer_v1_tx_pb = require('../../../em/issuer/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_em_issuer_v1_MsgDecreaseMintable(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgDecreaseMintable)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgDecreaseMintable');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgDecreaseMintable(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgDecreaseMintable.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgDecreaseMintableResponse(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgDecreaseMintableResponse)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgDecreaseMintableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgDecreaseMintableResponse(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgDecreaseMintableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgIncreaseMintable(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgIncreaseMintable)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgIncreaseMintable');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgIncreaseMintable(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgIncreaseMintable.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgIncreaseMintableResponse(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgIncreaseMintableResponse)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgIncreaseMintableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgIncreaseMintableResponse(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgIncreaseMintableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgRevokeLiquidityProvider(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgRevokeLiquidityProvider)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgRevokeLiquidityProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgRevokeLiquidityProvider(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgRevokeLiquidityProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgRevokeLiquidityProviderResponse(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgRevokeLiquidityProviderResponse)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgRevokeLiquidityProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgRevokeLiquidityProviderResponse(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgRevokeLiquidityProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgSetInflation(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgSetInflation)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgSetInflation');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgSetInflation(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgSetInflation.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_MsgSetInflationResponse(arg) {
  if (!(arg instanceof em_issuer_v1_tx_pb.MsgSetInflationResponse)) {
    throw new Error('Expected argument of type em.issuer.v1.MsgSetInflationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_MsgSetInflationResponse(buffer_arg) {
  return em_issuer_v1_tx_pb.MsgSetInflationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  increaseMintable: {
    path: '/em.issuer.v1.Msg/IncreaseMintable',
    requestStream: false,
    responseStream: false,
    requestType: em_issuer_v1_tx_pb.MsgIncreaseMintable,
    responseType: em_issuer_v1_tx_pb.MsgIncreaseMintableResponse,
    requestSerialize: serialize_em_issuer_v1_MsgIncreaseMintable,
    requestDeserialize: deserialize_em_issuer_v1_MsgIncreaseMintable,
    responseSerialize: serialize_em_issuer_v1_MsgIncreaseMintableResponse,
    responseDeserialize: deserialize_em_issuer_v1_MsgIncreaseMintableResponse,
  },
  decreaseMintable: {
    path: '/em.issuer.v1.Msg/DecreaseMintable',
    requestStream: false,
    responseStream: false,
    requestType: em_issuer_v1_tx_pb.MsgDecreaseMintable,
    responseType: em_issuer_v1_tx_pb.MsgDecreaseMintableResponse,
    requestSerialize: serialize_em_issuer_v1_MsgDecreaseMintable,
    requestDeserialize: deserialize_em_issuer_v1_MsgDecreaseMintable,
    responseSerialize: serialize_em_issuer_v1_MsgDecreaseMintableResponse,
    responseDeserialize: deserialize_em_issuer_v1_MsgDecreaseMintableResponse,
  },
  revokeLiquidityProvider: {
    path: '/em.issuer.v1.Msg/RevokeLiquidityProvider',
    requestStream: false,
    responseStream: false,
    requestType: em_issuer_v1_tx_pb.MsgRevokeLiquidityProvider,
    responseType: em_issuer_v1_tx_pb.MsgRevokeLiquidityProviderResponse,
    requestSerialize: serialize_em_issuer_v1_MsgRevokeLiquidityProvider,
    requestDeserialize: deserialize_em_issuer_v1_MsgRevokeLiquidityProvider,
    responseSerialize: serialize_em_issuer_v1_MsgRevokeLiquidityProviderResponse,
    responseDeserialize: deserialize_em_issuer_v1_MsgRevokeLiquidityProviderResponse,
  },
  setInflation: {
    path: '/em.issuer.v1.Msg/SetInflation',
    requestStream: false,
    responseStream: false,
    requestType: em_issuer_v1_tx_pb.MsgSetInflation,
    responseType: em_issuer_v1_tx_pb.MsgSetInflationResponse,
    requestSerialize: serialize_em_issuer_v1_MsgSetInflation,
    requestDeserialize: deserialize_em_issuer_v1_MsgSetInflation,
    responseSerialize: serialize_em_issuer_v1_MsgSetInflationResponse,
    responseDeserialize: deserialize_em_issuer_v1_MsgSetInflationResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
