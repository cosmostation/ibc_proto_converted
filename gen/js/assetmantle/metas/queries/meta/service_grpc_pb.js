// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_metas_queries_meta_query_request_pb = require('../../../../assetmantle/metas/queries/meta/query_request_pb.js');
var assetmantle_metas_queries_meta_query_response_pb = require('../../../../assetmantle/metas/queries/meta/query_response_pb.js');

function serialize_assetmantle_modules_metas_queries_meta_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_metas_queries_meta_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.metas.queries.meta.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_metas_queries_meta_QueryRequest(buffer_arg) {
  return assetmantle_metas_queries_meta_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_metas_queries_meta_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_metas_queries_meta_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.metas.queries.meta.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_metas_queries_meta_QueryResponse(buffer_arg) {
  return assetmantle_metas_queries_meta_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.metas.queries.meta.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_metas_queries_meta_query_request_pb.QueryRequest,
    responseType: assetmantle_metas_queries_meta_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_metas_queries_meta_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_metas_queries_meta_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_metas_queries_meta_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_metas_queries_meta_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
