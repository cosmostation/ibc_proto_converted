// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datadeal_v2alpha1_tx_pb = require('../../../panacea/datadeal/v2alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_panacea_datadeal_v2alpha1_MsgCreateDeal(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgCreateDeal)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgCreateDeal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgCreateDeal(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgCreateDeal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_MsgCreateDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgCreateDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgCreateDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgCreateDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgCreateDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_MsgDeactivateDeal(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDeal)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgDeactivateDeal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgDeactivateDeal(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDeal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_MsgDeactivateDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgDeactivateDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgDeactivateDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_MsgSellData(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgSellData)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgSellData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgSellData(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgSellData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_MsgSellDataResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_tx_pb.MsgSellDataResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.MsgSellDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_MsgSellDataResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_tx_pb.MsgSellDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreateDeal defines a method for creating a deal.
createDeal: {
    path: '/panacea.datadeal.v2alpha1.Msg/CreateDeal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_tx_pb.MsgCreateDeal,
    responseType: panacea_datadeal_v2alpha1_tx_pb.MsgCreateDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_MsgCreateDeal,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgCreateDeal,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_MsgCreateDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgCreateDealResponse,
  },
  // SellData defines a method for selling a data.
sellData: {
    path: '/panacea.datadeal.v2alpha1.Msg/SellData',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_tx_pb.MsgSellData,
    responseType: panacea_datadeal_v2alpha1_tx_pb.MsgSellDataResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_MsgSellData,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgSellData,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_MsgSellDataResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgSellDataResponse,
  },
  // DeactivateDeal defines a method for deactivating a deal.
deactivateDeal: {
    path: '/panacea.datadeal.v2alpha1.Msg/DeactivateDeal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDeal,
    responseType: panacea_datadeal_v2alpha1_tx_pb.MsgDeactivateDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_MsgDeactivateDeal,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgDeactivateDeal,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_MsgDeactivateDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_MsgDeactivateDealResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
