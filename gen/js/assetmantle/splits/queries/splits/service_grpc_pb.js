// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_splits_queries_splits_query_request_pb = require('../../../../assetmantle/splits/queries/splits/query_request_pb.js');
var assetmantle_splits_queries_splits_query_response_pb = require('../../../../assetmantle/splits/queries/splits/query_response_pb.js');

function serialize_assetmantle_modules_splits_queries_splits_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_splits_queries_splits_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.queries.splits.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_queries_splits_QueryRequest(buffer_arg) {
  return assetmantle_splits_queries_splits_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_splits_queries_splits_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_splits_queries_splits_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.queries.splits.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_queries_splits_QueryResponse(buffer_arg) {
  return assetmantle_splits_queries_splits_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.splits.queries.splits.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_splits_queries_splits_query_request_pb.QueryRequest,
    responseType: assetmantle_splits_queries_splits_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_splits_queries_splits_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_splits_queries_splits_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_splits_queries_splits_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_splits_queries_splits_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
