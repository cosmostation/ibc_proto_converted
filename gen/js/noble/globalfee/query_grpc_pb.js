// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var noble_globalfee_query_pb = require('../../noble/globalfee/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var noble_globalfee_genesis_pb = require('../../noble/globalfee/genesis_pb.js');

function serialize_noble_globalfee_QueryParamsRequest(arg) {
  if (!(arg instanceof noble_globalfee_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type noble.globalfee.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_globalfee_QueryParamsRequest(buffer_arg) {
  return noble_globalfee_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_globalfee_QueryParamsResponse(arg) {
  if (!(arg instanceof noble_globalfee_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type noble.globalfee.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_globalfee_QueryParamsResponse(buffer_arg) {
  return noble_globalfee_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/noble.globalfee.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: noble_globalfee_query_pb.QueryParamsRequest,
    responseType: noble_globalfee_query_pb.QueryParamsResponse,
    requestSerialize: serialize_noble_globalfee_QueryParamsRequest,
    requestDeserialize: deserialize_noble_globalfee_QueryParamsRequest,
    responseSerialize: serialize_noble_globalfee_QueryParamsResponse,
    responseDeserialize: deserialize_noble_globalfee_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
