// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_envoy_v1beta1_query_pb = require('../../../mars/envoy/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_mars_envoy_v1beta1_QueryAccountRequest(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_query_pb.QueryAccountRequest)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.QueryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_QueryAccountRequest(buffer_arg) {
  return mars_envoy_v1beta1_query_pb.QueryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_QueryAccountResponse(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_query_pb.QueryAccountResponse)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.QueryAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_QueryAccountResponse(buffer_arg) {
  return mars_envoy_v1beta1_query_pb.QueryAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_QueryAccountsRequest(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_QueryAccountsRequest(buffer_arg) {
  return mars_envoy_v1beta1_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_QueryAccountsResponse(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_query_pb.QueryAccountsResponse)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.QueryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_QueryAccountsResponse(buffer_arg) {
  return mars_envoy_v1beta1_query_pb.QueryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the module's gRPC query service.
var QueryService = exports.QueryService = {
  // Account returns the interchain account owned by the module on a given
// connection pair.
account: {
    path: '/mars.envoy.v1beta1.Query/Account',
    requestStream: false,
    responseStream: false,
    requestType: mars_envoy_v1beta1_query_pb.QueryAccountRequest,
    responseType: mars_envoy_v1beta1_query_pb.QueryAccountResponse,
    requestSerialize: serialize_mars_envoy_v1beta1_QueryAccountRequest,
    requestDeserialize: deserialize_mars_envoy_v1beta1_QueryAccountRequest,
    responseSerialize: serialize_mars_envoy_v1beta1_QueryAccountResponse,
    responseDeserialize: deserialize_mars_envoy_v1beta1_QueryAccountResponse,
  },
  // Accounts returns all interchain accounts owned by the module.
accounts: {
    path: '/mars.envoy.v1beta1.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: mars_envoy_v1beta1_query_pb.QueryAccountsRequest,
    responseType: mars_envoy_v1beta1_query_pb.QueryAccountsResponse,
    requestSerialize: serialize_mars_envoy_v1beta1_QueryAccountsRequest,
    requestDeserialize: deserialize_mars_envoy_v1beta1_QueryAccountsRequest,
    responseSerialize: serialize_mars_envoy_v1beta1_QueryAccountsResponse,
    responseDeserialize: deserialize_mars_envoy_v1beta1_QueryAccountsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
