// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_splits_queries_ownable_query_request_pb = require('../../../../assetmantle/splits/queries/ownable/query_request_pb.js');
var assetmantle_splits_queries_ownable_query_response_pb = require('../../../../assetmantle/splits/queries/ownable/query_response_pb.js');

function serialize_assetmantle_modules_splits_queries_ownable_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_splits_queries_ownable_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.queries.ownable.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_queries_ownable_QueryRequest(buffer_arg) {
  return assetmantle_splits_queries_ownable_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_splits_queries_ownable_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_splits_queries_ownable_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.queries.ownable.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_queries_ownable_QueryResponse(buffer_arg) {
  return assetmantle_splits_queries_ownable_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.splits.queries.ownable.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_splits_queries_ownable_query_request_pb.QueryRequest,
    responseType: assetmantle_splits_queries_ownable_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_splits_queries_ownable_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_splits_queries_ownable_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_splits_queries_ownable_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_splits_queries_ownable_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
