// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_inflation_v1_query_pb = require('../../../em/inflation/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var em_inflation_v1_inflation_pb = require('../../../em/inflation/v1/inflation_pb.js');

function serialize_em_inflation_v1_QueryInflationRequest(arg) {
  if (!(arg instanceof em_inflation_v1_query_pb.QueryInflationRequest)) {
    throw new Error('Expected argument of type em.inflation.v1.QueryInflationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_inflation_v1_QueryInflationRequest(buffer_arg) {
  return em_inflation_v1_query_pb.QueryInflationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_inflation_v1_QueryInflationResponse(arg) {
  if (!(arg instanceof em_inflation_v1_query_pb.QueryInflationResponse)) {
    throw new Error('Expected argument of type em.inflation.v1.QueryInflationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_inflation_v1_QueryInflationResponse(buffer_arg) {
  return em_inflation_v1_query_pb.QueryInflationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  inflation: {
    path: '/em.inflation.v1.Query/Inflation',
    requestStream: false,
    responseStream: false,
    requestType: em_inflation_v1_query_pb.QueryInflationRequest,
    responseType: em_inflation_v1_query_pb.QueryInflationResponse,
    requestSerialize: serialize_em_inflation_v1_QueryInflationRequest,
    requestDeserialize: deserialize_em_inflation_v1_QueryInflationRequest,
    responseSerialize: serialize_em_inflation_v1_QueryInflationResponse,
    responseDeserialize: deserialize_em_inflation_v1_QueryInflationResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
