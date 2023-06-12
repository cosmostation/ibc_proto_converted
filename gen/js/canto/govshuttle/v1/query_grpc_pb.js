// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_govshuttle_v1_query_pb = require('../../../canto/govshuttle/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var canto_govshuttle_v1_govshuttle_pb = require('../../../canto/govshuttle/v1/govshuttle_pb.js');

function serialize_canto_govshuttle_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof canto_govshuttle_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type canto.govshuttle.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_govshuttle_v1_QueryParamsRequest(buffer_arg) {
  return canto_govshuttle_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_govshuttle_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof canto_govshuttle_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type canto.govshuttle.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_govshuttle_v1_QueryParamsResponse(buffer_arg) {
  return canto_govshuttle_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/canto.govshuttle.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: canto_govshuttle_v1_query_pb.QueryParamsRequest,
    responseType: canto_govshuttle_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_canto_govshuttle_v1_QueryParamsRequest,
    requestDeserialize: deserialize_canto_govshuttle_v1_QueryParamsRequest,
    responseSerialize: serialize_canto_govshuttle_v1_QueryParamsResponse,
    responseDeserialize: deserialize_canto_govshuttle_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
