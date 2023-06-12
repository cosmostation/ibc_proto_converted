// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_liquidityprovider_v1_tx_pb = require('../../../em/liquidityprovider/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_em_liquidityprovider_v1_MsgBurnTokens(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_tx_pb.MsgBurnTokens)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.MsgBurnTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_MsgBurnTokens(buffer_arg) {
  return em_liquidityprovider_v1_tx_pb.MsgBurnTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_MsgBurnTokensResponse(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_tx_pb.MsgBurnTokensResponse)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.MsgBurnTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_MsgBurnTokensResponse(buffer_arg) {
  return em_liquidityprovider_v1_tx_pb.MsgBurnTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_MsgMintTokens(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_tx_pb.MsgMintTokens)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.MsgMintTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_MsgMintTokens(buffer_arg) {
  return em_liquidityprovider_v1_tx_pb.MsgMintTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_MsgMintTokensResponse(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_tx_pb.MsgMintTokensResponse)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.MsgMintTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_MsgMintTokensResponse(buffer_arg) {
  return em_liquidityprovider_v1_tx_pb.MsgMintTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  mintTokens: {
    path: '/em.liquidityprovider.v1.Msg/MintTokens',
    requestStream: false,
    responseStream: false,
    requestType: em_liquidityprovider_v1_tx_pb.MsgMintTokens,
    responseType: em_liquidityprovider_v1_tx_pb.MsgMintTokensResponse,
    requestSerialize: serialize_em_liquidityprovider_v1_MsgMintTokens,
    requestDeserialize: deserialize_em_liquidityprovider_v1_MsgMintTokens,
    responseSerialize: serialize_em_liquidityprovider_v1_MsgMintTokensResponse,
    responseDeserialize: deserialize_em_liquidityprovider_v1_MsgMintTokensResponse,
  },
  burnTokens: {
    path: '/em.liquidityprovider.v1.Msg/BurnTokens',
    requestStream: false,
    responseStream: false,
    requestType: em_liquidityprovider_v1_tx_pb.MsgBurnTokens,
    responseType: em_liquidityprovider_v1_tx_pb.MsgBurnTokensResponse,
    requestSerialize: serialize_em_liquidityprovider_v1_MsgBurnTokens,
    requestDeserialize: deserialize_em_liquidityprovider_v1_MsgBurnTokens,
    responseSerialize: serialize_em_liquidityprovider_v1_MsgBurnTokensResponse,
    responseDeserialize: deserialize_em_liquidityprovider_v1_MsgBurnTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
