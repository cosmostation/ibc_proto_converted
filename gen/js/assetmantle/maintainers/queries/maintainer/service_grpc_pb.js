// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_maintainers_queries_maintainer_query_request_pb = require('../../../../assetmantle/maintainers/queries/maintainer/query_request_pb.js');
var assetmantle_maintainers_queries_maintainer_query_response_pb = require('../../../../assetmantle/maintainers/queries/maintainer/query_response_pb.js');

function serialize_assetmantle_modules_maintainers_queries_maintainer_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_maintainers_queries_maintainer_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.maintainers.queries.maintainer.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_maintainers_queries_maintainer_QueryRequest(buffer_arg) {
  return assetmantle_maintainers_queries_maintainer_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_maintainers_queries_maintainer_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_maintainers_queries_maintainer_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.maintainers.queries.maintainer.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_maintainers_queries_maintainer_QueryResponse(buffer_arg) {
  return assetmantle_maintainers_queries_maintainer_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.maintainers.queries.maintainer.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_maintainers_queries_maintainer_query_request_pb.QueryRequest,
    responseType: assetmantle_maintainers_queries_maintainer_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_maintainers_queries_maintainer_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_maintainers_queries_maintainer_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_maintainers_queries_maintainer_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_maintainers_queries_maintainer_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
