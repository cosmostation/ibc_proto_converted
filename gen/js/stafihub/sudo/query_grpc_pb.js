// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_sudo_query_pb = require('../../stafihub/sudo/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_stafihub_stafihub_sudo_QueryAdminRequest(arg) {
  if (!(arg instanceof stafihub_sudo_query_pb.QueryAdminRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.sudo.QueryAdminRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_sudo_QueryAdminRequest(buffer_arg) {
  return stafihub_sudo_query_pb.QueryAdminRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_sudo_QueryAdminResponse(arg) {
  if (!(arg instanceof stafihub_sudo_query_pb.QueryAdminResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.sudo.QueryAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_sudo_QueryAdminResponse(buffer_arg) {
  return stafihub_sudo_query_pb.QueryAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries a list of admin items.
admin: {
    path: '/stafihub.stafihub.sudo.Query/Admin',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_sudo_query_pb.QueryAdminRequest,
    responseType: stafihub_sudo_query_pb.QueryAdminResponse,
    requestSerialize: serialize_stafihub_stafihub_sudo_QueryAdminRequest,
    requestDeserialize: deserialize_stafihub_stafihub_sudo_QueryAdminRequest,
    responseSerialize: serialize_stafihub_stafihub_sudo_QueryAdminResponse,
    responseDeserialize: deserialize_stafihub_stafihub_sudo_QueryAdminResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
