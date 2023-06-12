// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_identities_queries_identities_query_request_pb = require('../../../../assetmantle/identities/queries/identities/query_request_pb.js');
var assetmantle_identities_queries_identities_query_response_pb = require('../../../../assetmantle/identities/queries/identities/query_response_pb.js');

function serialize_assetmantle_modules_identities_queries_identities_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_identities_queries_identities_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.queries.identities.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_queries_identities_QueryRequest(buffer_arg) {
  return assetmantle_identities_queries_identities_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_identities_queries_identities_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_identities_queries_identities_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.queries.identities.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_queries_identities_QueryResponse(buffer_arg) {
  return assetmantle_identities_queries_identities_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.identities.queries.identities.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_identities_queries_identities_query_request_pb.QueryRequest,
    responseType: assetmantle_identities_queries_identities_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_identities_queries_identities_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_identities_queries_identities_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_identities_queries_identities_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_identities_queries_identities_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
