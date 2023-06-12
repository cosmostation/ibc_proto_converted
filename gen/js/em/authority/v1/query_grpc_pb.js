// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_authority_v1_query_pb = require('../../../em/authority/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_upgrade_v1beta1_upgrade_pb = require('../../../cosmos/upgrade/v1beta1/upgrade_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');

function serialize_em_authority_v1_QueryGasPricesRequest(arg) {
  if (!(arg instanceof em_authority_v1_query_pb.QueryGasPricesRequest)) {
    throw new Error('Expected argument of type em.authority.v1.QueryGasPricesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_QueryGasPricesRequest(buffer_arg) {
  return em_authority_v1_query_pb.QueryGasPricesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_QueryGasPricesResponse(arg) {
  if (!(arg instanceof em_authority_v1_query_pb.QueryGasPricesResponse)) {
    throw new Error('Expected argument of type em.authority.v1.QueryGasPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_QueryGasPricesResponse(buffer_arg) {
  return em_authority_v1_query_pb.QueryGasPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_QueryUpgradePlanRequest(arg) {
  if (!(arg instanceof em_authority_v1_query_pb.QueryUpgradePlanRequest)) {
    throw new Error('Expected argument of type em.authority.v1.QueryUpgradePlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_QueryUpgradePlanRequest(buffer_arg) {
  return em_authority_v1_query_pb.QueryUpgradePlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_authority_v1_QueryUpgradePlanResponse(arg) {
  if (!(arg instanceof em_authority_v1_query_pb.QueryUpgradePlanResponse)) {
    throw new Error('Expected argument of type em.authority.v1.QueryUpgradePlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_authority_v1_QueryUpgradePlanResponse(buffer_arg) {
  return em_authority_v1_query_pb.QueryUpgradePlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  gasPrices: {
    path: '/em.authority.v1.Query/GasPrices',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_query_pb.QueryGasPricesRequest,
    responseType: em_authority_v1_query_pb.QueryGasPricesResponse,
    requestSerialize: serialize_em_authority_v1_QueryGasPricesRequest,
    requestDeserialize: deserialize_em_authority_v1_QueryGasPricesRequest,
    responseSerialize: serialize_em_authority_v1_QueryGasPricesResponse,
    responseDeserialize: deserialize_em_authority_v1_QueryGasPricesResponse,
  },
  upgradePlan: {
    path: '/em.authority.v1.Query/UpgradePlan',
    requestStream: false,
    responseStream: false,
    requestType: em_authority_v1_query_pb.QueryUpgradePlanRequest,
    responseType: em_authority_v1_query_pb.QueryUpgradePlanResponse,
    requestSerialize: serialize_em_authority_v1_QueryUpgradePlanRequest,
    requestDeserialize: deserialize_em_authority_v1_QueryUpgradePlanRequest,
    responseSerialize: serialize_em_authority_v1_QueryUpgradePlanResponse,
    responseDeserialize: deserialize_em_authority_v1_QueryUpgradePlanResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
