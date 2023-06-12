// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_buyback_v1_query_pb = require('../../../em/buyback/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_em_buyback_v1_QueryBalanceRequest(arg) {
  if (!(arg instanceof em_buyback_v1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type em.buyback.v1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_buyback_v1_QueryBalanceRequest(buffer_arg) {
  return em_buyback_v1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_buyback_v1_QueryBalanceResponse(arg) {
  if (!(arg instanceof em_buyback_v1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type em.buyback.v1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_buyback_v1_QueryBalanceResponse(buffer_arg) {
  return em_buyback_v1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_buyback_v1_QueryBuybackTimeRequest(arg) {
  if (!(arg instanceof em_buyback_v1_query_pb.QueryBuybackTimeRequest)) {
    throw new Error('Expected argument of type em.buyback.v1.QueryBuybackTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_buyback_v1_QueryBuybackTimeRequest(buffer_arg) {
  return em_buyback_v1_query_pb.QueryBuybackTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_buyback_v1_QueryBuybackTimeResponse(arg) {
  if (!(arg instanceof em_buyback_v1_query_pb.QueryBuybackTimeResponse)) {
    throw new Error('Expected argument of type em.buyback.v1.QueryBuybackTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_buyback_v1_QueryBuybackTimeResponse(buffer_arg) {
  return em_buyback_v1_query_pb.QueryBuybackTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // Query for the current buyback balance
balance: {
    path: '/em.buyback.v1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: em_buyback_v1_query_pb.QueryBalanceRequest,
    responseType: em_buyback_v1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_em_buyback_v1_QueryBalanceRequest,
    requestDeserialize: deserialize_em_buyback_v1_QueryBalanceRequest,
    responseSerialize: serialize_em_buyback_v1_QueryBalanceResponse,
    responseDeserialize: deserialize_em_buyback_v1_QueryBalanceResponse,
  },
  // Query for buyback time periods
buybackTime: {
    path: '/em.buyback.v1.Query/BuybackTime',
    requestStream: false,
    responseStream: false,
    requestType: em_buyback_v1_query_pb.QueryBuybackTimeRequest,
    responseType: em_buyback_v1_query_pb.QueryBuybackTimeResponse,
    requestSerialize: serialize_em_buyback_v1_QueryBuybackTimeRequest,
    requestDeserialize: deserialize_em_buyback_v1_QueryBuybackTimeRequest,
    responseSerialize: serialize_em_buyback_v1_QueryBuybackTimeResponse,
    responseDeserialize: deserialize_em_buyback_v1_QueryBuybackTimeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
