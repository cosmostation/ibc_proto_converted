// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datapool_v2alpha1_tx_pb = require('../../../panacea/datapool/v2alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var panacea_datapool_v2alpha1_pool_pb = require('../../../panacea/datapool/v2alpha1/pool_pb.js');

function serialize_panacea_datapool_v2alpha1_MsgBuyDataPass(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPass)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgBuyDataPass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgBuyDataPass(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgBuyDataPassResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPassResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgBuyDataPassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgBuyDataPassResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgCreatePool(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgCreatePool(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgCreatePoolResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgRedeemDataPass(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPass)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgRedeemDataPass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgRedeemDataPass(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgRedeemDataPassResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPassResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgRedeemDataPassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgRedeemDataPassResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgSellData(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgSellData)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgSellData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgSellData(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgSellData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_MsgSellDataResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_tx_pb.MsgSellDataResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.MsgSellDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_MsgSellDataResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_tx_pb.MsgSellDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreatePool defines a method for creating data pool.
createPool: {
    path: '/panacea.datapool.v2alpha1.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_tx_pb.MsgCreatePool,
    responseType: panacea_datapool_v2alpha1_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_MsgCreatePool,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_MsgCreatePool,
    responseSerialize: serialize_panacea_datapool_v2alpha1_MsgCreatePoolResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_MsgCreatePoolResponse,
  },
  // SellData defines a method for selling data
sellData: {
    path: '/panacea.datapool.v2alpha1.Msg/SellData',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_tx_pb.MsgSellData,
    responseType: panacea_datapool_v2alpha1_tx_pb.MsgSellDataResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_MsgSellData,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_MsgSellData,
    responseSerialize: serialize_panacea_datapool_v2alpha1_MsgSellDataResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_MsgSellDataResponse,
  },
  // BuyDataPass defines a method for buying data pass
buyDataPass: {
    path: '/panacea.datapool.v2alpha1.Msg/BuyDataPass',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPass,
    responseType: panacea_datapool_v2alpha1_tx_pb.MsgBuyDataPassResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_MsgBuyDataPass,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_MsgBuyDataPass,
    responseSerialize: serialize_panacea_datapool_v2alpha1_MsgBuyDataPassResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_MsgBuyDataPassResponse,
  },
  // RedeemDataPass defines a method for redeeming data pass to get data
redeemDataPass: {
    path: '/panacea.datapool.v2alpha1.Msg/RedeemDataPass',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPass,
    responseType: panacea_datapool_v2alpha1_tx_pb.MsgRedeemDataPassResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_MsgRedeemDataPass,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_MsgRedeemDataPass,
    responseSerialize: serialize_panacea_datapool_v2alpha1_MsgRedeemDataPassResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_MsgRedeemDataPassResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
