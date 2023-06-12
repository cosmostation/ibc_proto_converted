// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_assets_queries_assets_query_request_pb = require('../../../../assetmantle/assets/queries/assets/query_request_pb.js');
var assetmantle_assets_queries_assets_query_response_pb = require('../../../../assetmantle/assets/queries/assets/query_response_pb.js');

function serialize_assetmantle_modules_assets_queries_assets_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_assets_queries_assets_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.queries.assets.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_queries_assets_QueryRequest(buffer_arg) {
  return assetmantle_assets_queries_assets_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_assets_queries_assets_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_assets_queries_assets_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.queries.assets.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_queries_assets_QueryResponse(buffer_arg) {
  return assetmantle_assets_queries_assets_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.assets.queries.assets.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_assets_queries_assets_query_request_pb.QueryRequest,
    responseType: assetmantle_assets_queries_assets_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_assets_queries_assets_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_assets_queries_assets_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_assets_queries_assets_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_assets_queries_assets_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
