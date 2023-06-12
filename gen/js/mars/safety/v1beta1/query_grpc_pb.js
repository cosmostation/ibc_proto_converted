// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_safety_v1beta1_query_pb = require('../../../mars/safety/v1beta1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_mars_safety_v1beta1_QueryBalancesRequest(arg) {
  if (!(arg instanceof mars_safety_v1beta1_query_pb.QueryBalancesRequest)) {
    throw new Error('Expected argument of type mars.safety.v1beta1.QueryBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_safety_v1beta1_QueryBalancesRequest(buffer_arg) {
  return mars_safety_v1beta1_query_pb.QueryBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_safety_v1beta1_QueryBalancesResponse(arg) {
  if (!(arg instanceof mars_safety_v1beta1_query_pb.QueryBalancesResponse)) {
    throw new Error('Expected argument of type mars.safety.v1beta1.QueryBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_safety_v1beta1_QueryBalancesResponse(buffer_arg) {
  return mars_safety_v1beta1_query_pb.QueryBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for the safety fund module
var QueryService = exports.QueryService = {
  // Balances queries coins available in the safety fund
balances: {
    path: '/mars.safety.v1beta1.Query/Balances',
    requestStream: false,
    responseStream: false,
    requestType: mars_safety_v1beta1_query_pb.QueryBalancesRequest,
    responseType: mars_safety_v1beta1_query_pb.QueryBalancesResponse,
    requestSerialize: serialize_mars_safety_v1beta1_QueryBalancesRequest,
    requestDeserialize: deserialize_mars_safety_v1beta1_QueryBalancesRequest,
    responseSerialize: serialize_mars_safety_v1beta1_QueryBalancesResponse,
    responseDeserialize: deserialize_mars_safety_v1beta1_QueryBalancesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
