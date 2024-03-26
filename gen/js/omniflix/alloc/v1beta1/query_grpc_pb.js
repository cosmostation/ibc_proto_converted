// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_alloc_v1beta1_query_pb = require('../../../OmniFlix/alloc/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var OmniFlix_alloc_v1beta1_params_pb = require('../../../OmniFlix/alloc/v1beta1/params_pb.js');

function serialize_OmniFlix_alloc_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof OmniFlix_alloc_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type OmniFlix.alloc.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_alloc_v1beta1_QueryParamsRequest(buffer_arg) {
  return OmniFlix_alloc_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_alloc_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_alloc_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.alloc.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_alloc_v1beta1_QueryParamsResponse(buffer_arg) {
  return OmniFlix_alloc_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/OmniFlix.alloc.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_alloc_v1beta1_query_pb.QueryParamsRequest,
    responseType: OmniFlix_alloc_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_OmniFlix_alloc_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_OmniFlix_alloc_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_OmniFlix_alloc_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_OmniFlix_alloc_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
