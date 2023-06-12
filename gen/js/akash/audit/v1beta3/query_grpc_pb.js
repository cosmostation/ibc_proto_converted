// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_audit_v1beta3_query_pb = require('../../../akash/audit/v1beta3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_audit_v1beta3_audit_pb = require('../../../akash/audit/v1beta3/audit_pb.js');

function serialize_akash_audit_v1beta3_QueryAllProvidersAttributesRequest(arg) {
  if (!(arg instanceof akash_audit_v1beta3_query_pb.QueryAllProvidersAttributesRequest)) {
    throw new Error('Expected argument of type akash.audit.v1beta3.QueryAllProvidersAttributesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta3_QueryAllProvidersAttributesRequest(buffer_arg) {
  return akash_audit_v1beta3_query_pb.QueryAllProvidersAttributesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta3_QueryAuditorAttributesRequest(arg) {
  if (!(arg instanceof akash_audit_v1beta3_query_pb.QueryAuditorAttributesRequest)) {
    throw new Error('Expected argument of type akash.audit.v1beta3.QueryAuditorAttributesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta3_QueryAuditorAttributesRequest(buffer_arg) {
  return akash_audit_v1beta3_query_pb.QueryAuditorAttributesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta3_QueryProviderAttributesRequest(arg) {
  if (!(arg instanceof akash_audit_v1beta3_query_pb.QueryProviderAttributesRequest)) {
    throw new Error('Expected argument of type akash.audit.v1beta3.QueryProviderAttributesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta3_QueryProviderAttributesRequest(buffer_arg) {
  return akash_audit_v1beta3_query_pb.QueryProviderAttributesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta3_QueryProviderAuditorRequest(arg) {
  if (!(arg instanceof akash_audit_v1beta3_query_pb.QueryProviderAuditorRequest)) {
    throw new Error('Expected argument of type akash.audit.v1beta3.QueryProviderAuditorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta3_QueryProviderAuditorRequest(buffer_arg) {
  return akash_audit_v1beta3_query_pb.QueryProviderAuditorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta3_QueryProvidersResponse(arg) {
  if (!(arg instanceof akash_audit_v1beta3_query_pb.QueryProvidersResponse)) {
    throw new Error('Expected argument of type akash.audit.v1beta3.QueryProvidersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta3_QueryProvidersResponse(buffer_arg) {
  return akash_audit_v1beta3_query_pb.QueryProvidersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // AllProvidersAttributes queries all providers
// buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
allProvidersAttributes: {
    path: '/akash.audit.v1beta3.Query/AllProvidersAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta3_query_pb.QueryAllProvidersAttributesRequest,
    responseType: akash_audit_v1beta3_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_akash_audit_v1beta3_QueryAllProvidersAttributesRequest,
    requestDeserialize: deserialize_akash_audit_v1beta3_QueryAllProvidersAttributesRequest,
    responseSerialize: serialize_akash_audit_v1beta3_QueryProvidersResponse,
    responseDeserialize: deserialize_akash_audit_v1beta3_QueryProvidersResponse,
  },
  // ProviderAttributes queries all provider signed attributes
// buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
providerAttributes: {
    path: '/akash.audit.v1beta3.Query/ProviderAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta3_query_pb.QueryProviderAttributesRequest,
    responseType: akash_audit_v1beta3_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_akash_audit_v1beta3_QueryProviderAttributesRequest,
    requestDeserialize: deserialize_akash_audit_v1beta3_QueryProviderAttributesRequest,
    responseSerialize: serialize_akash_audit_v1beta3_QueryProvidersResponse,
    responseDeserialize: deserialize_akash_audit_v1beta3_QueryProvidersResponse,
  },
  // ProviderAuditorAttributes queries provider signed attributes by specific auditor
// buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
providerAuditorAttributes: {
    path: '/akash.audit.v1beta3.Query/ProviderAuditorAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta3_query_pb.QueryProviderAuditorRequest,
    responseType: akash_audit_v1beta3_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_akash_audit_v1beta3_QueryProviderAuditorRequest,
    requestDeserialize: deserialize_akash_audit_v1beta3_QueryProviderAuditorRequest,
    responseSerialize: serialize_akash_audit_v1beta3_QueryProvidersResponse,
    responseDeserialize: deserialize_akash_audit_v1beta3_QueryProvidersResponse,
  },
  // AuditorAttributes queries all providers signed by this auditor
// buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
auditorAttributes: {
    path: '/akash.audit.v1beta3.Query/AuditorAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta3_query_pb.QueryAuditorAttributesRequest,
    responseType: akash_audit_v1beta3_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_akash_audit_v1beta3_QueryAuditorAttributesRequest,
    requestDeserialize: deserialize_akash_audit_v1beta3_QueryAuditorAttributesRequest,
    responseSerialize: serialize_akash_audit_v1beta3_QueryProvidersResponse,
    responseDeserialize: deserialize_akash_audit_v1beta3_QueryProvidersResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
