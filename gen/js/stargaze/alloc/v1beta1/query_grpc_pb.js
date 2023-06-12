// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_alloc_v1beta1_query_pb = require('../../../stargaze/alloc/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var stargaze_alloc_v1beta1_params_pb = require('../../../stargaze/alloc/v1beta1/params_pb.js');

function serialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsRequest(buffer_arg) {
  return stargaze_alloc_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof stargaze_alloc_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.alloc.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse(buffer_arg) {
  return stargaze_alloc_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // this line is used by starport scaffolding # 2
params: {
    path: '/publicawesome.stargaze.alloc.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_alloc_v1beta1_query_pb.QueryParamsRequest,
    responseType: stargaze_alloc_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_alloc_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
