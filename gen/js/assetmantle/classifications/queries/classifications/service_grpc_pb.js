// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_classifications_queries_classifications_query_request_pb = require('../../../../assetmantle/classifications/queries/classifications/query_request_pb.js');
var assetmantle_classifications_queries_classifications_query_response_pb = require('../../../../assetmantle/classifications/queries/classifications/query_response_pb.js');

function serialize_assetmantle_modules_classifications_queries_classifications_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_classifications_queries_classifications_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.classifications.queries.classifications.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_classifications_queries_classifications_QueryRequest(buffer_arg) {
  return assetmantle_classifications_queries_classifications_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_classifications_queries_classifications_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_classifications_queries_classifications_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.classifications.queries.classifications.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_classifications_queries_classifications_QueryResponse(buffer_arg) {
  return assetmantle_classifications_queries_classifications_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.classifications.queries.classifications.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_classifications_queries_classifications_query_request_pb.QueryRequest,
    responseType: assetmantle_classifications_queries_classifications_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_classifications_queries_classifications_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_classifications_queries_classifications_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_classifications_queries_classifications_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_classifications_queries_classifications_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
