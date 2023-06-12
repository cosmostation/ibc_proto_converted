// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.43
'use strict';
var grpc = require('grpc');
var cosmos_authz_v1beta1_query_pb = require('../../../cosmos/authz/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_authz_v1beta1_authz_pb = require('../../../cosmos/authz/v1beta1/authz_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_cosmos_authz_v1beta1_QueryGranteeGrantsRequest(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsRequest)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGranteeGrantsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGranteeGrantsRequest(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_authz_v1beta1_QueryGranteeGrantsResponse(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsResponse)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGranteeGrantsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGranteeGrantsResponse(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_authz_v1beta1_QueryGranterGrantsRequest(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGranterGrantsRequest)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGranterGrantsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGranterGrantsRequest(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGranterGrantsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_authz_v1beta1_QueryGranterGrantsResponse(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGranterGrantsResponse)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGranterGrantsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGranterGrantsResponse(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGranterGrantsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_authz_v1beta1_QueryGrantsRequest(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGrantsRequest)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGrantsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGrantsRequest(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGrantsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_authz_v1beta1_QueryGrantsResponse(arg) {
  if (!(arg instanceof cosmos_authz_v1beta1_query_pb.QueryGrantsResponse)) {
    throw new Error('Expected argument of type cosmos.authz.v1beta1.QueryGrantsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_authz_v1beta1_QueryGrantsResponse(buffer_arg) {
  return cosmos_authz_v1beta1_query_pb.QueryGrantsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Returns list of `Authorization`, granted to the grantee by the granter.
grants: {
    path: '/cosmos.authz.v1beta1.Query/Grants',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_authz_v1beta1_query_pb.QueryGrantsRequest,
    responseType: cosmos_authz_v1beta1_query_pb.QueryGrantsResponse,
    requestSerialize: serialize_cosmos_authz_v1beta1_QueryGrantsRequest,
    requestDeserialize: deserialize_cosmos_authz_v1beta1_QueryGrantsRequest,
    responseSerialize: serialize_cosmos_authz_v1beta1_QueryGrantsResponse,
    responseDeserialize: deserialize_cosmos_authz_v1beta1_QueryGrantsResponse,
  },
  // GranterGrants returns list of `GrantAuthorization`, granted by granter.
//
// Since: cosmos-sdk 0.46
granterGrants: {
    path: '/cosmos.authz.v1beta1.Query/GranterGrants',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_authz_v1beta1_query_pb.QueryGranterGrantsRequest,
    responseType: cosmos_authz_v1beta1_query_pb.QueryGranterGrantsResponse,
    requestSerialize: serialize_cosmos_authz_v1beta1_QueryGranterGrantsRequest,
    requestDeserialize: deserialize_cosmos_authz_v1beta1_QueryGranterGrantsRequest,
    responseSerialize: serialize_cosmos_authz_v1beta1_QueryGranterGrantsResponse,
    responseDeserialize: deserialize_cosmos_authz_v1beta1_QueryGranterGrantsResponse,
  },
  // GranteeGrants returns a list of `GrantAuthorization` by grantee.
//
// Since: cosmos-sdk 0.46
granteeGrants: {
    path: '/cosmos.authz.v1beta1.Query/GranteeGrants',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsRequest,
    responseType: cosmos_authz_v1beta1_query_pb.QueryGranteeGrantsResponse,
    requestSerialize: serialize_cosmos_authz_v1beta1_QueryGranteeGrantsRequest,
    requestDeserialize: deserialize_cosmos_authz_v1beta1_QueryGranteeGrantsRequest,
    responseSerialize: serialize_cosmos_authz_v1beta1_QueryGranteeGrantsResponse,
    responseDeserialize: deserialize_cosmos_authz_v1beta1_QueryGranteeGrantsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
