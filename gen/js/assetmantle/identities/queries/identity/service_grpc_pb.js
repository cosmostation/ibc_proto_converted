// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_identities_queries_identity_query_request_pb = require('../../../../assetmantle/identities/queries/identity/query_request_pb.js');
var assetmantle_identities_queries_identity_query_response_pb = require('../../../../assetmantle/identities/queries/identity/query_response_pb.js');

function serialize_assetmantle_modules_identities_queries_identity_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_identities_queries_identity_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.queries.identity.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_queries_identity_QueryRequest(buffer_arg) {
  return assetmantle_identities_queries_identity_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_identities_queries_identity_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_identities_queries_identity_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.queries.identity.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_queries_identity_QueryResponse(buffer_arg) {
  return assetmantle_identities_queries_identity_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.identities.queries.identity.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_identities_queries_identity_query_request_pb.QueryRequest,
    responseType: assetmantle_identities_queries_identity_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_identities_queries_identity_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_identities_queries_identity_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_identities_queries_identity_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_identities_queries_identity_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
