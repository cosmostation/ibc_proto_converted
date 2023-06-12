// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_name_v1_query_pb = require('../../../provenance/name/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var provenance_name_v1_name_pb = require('../../../provenance/name/v1/name_pb.js');

function serialize_provenance_name_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryParamsRequest(buffer_arg) {
  return provenance_name_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryParamsResponse(buffer_arg) {
  return provenance_name_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_QueryResolveRequest(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryResolveRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryResolveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryResolveRequest(buffer_arg) {
  return provenance_name_v1_query_pb.QueryResolveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_QueryResolveResponse(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryResolveResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryResolveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryResolveResponse(buffer_arg) {
  return provenance_name_v1_query_pb.QueryResolveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_QueryReverseLookupRequest(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryReverseLookupRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryReverseLookupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryReverseLookupRequest(buffer_arg) {
  return provenance_name_v1_query_pb.QueryReverseLookupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_QueryReverseLookupResponse(arg) {
  if (!(arg instanceof provenance_name_v1_query_pb.QueryReverseLookupResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.QueryReverseLookupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_QueryReverseLookupResponse(buffer_arg) {
  return provenance_name_v1_query_pb.QueryReverseLookupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for distribution module.
var QueryService = exports.QueryService = {
  // Params queries params of the name module.
params: {
    path: '/provenance.name.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_query_pb.QueryParamsRequest,
    responseType: provenance_name_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_provenance_name_v1_QueryParamsRequest,
    requestDeserialize: deserialize_provenance_name_v1_QueryParamsRequest,
    responseSerialize: serialize_provenance_name_v1_QueryParamsResponse,
    responseDeserialize: deserialize_provenance_name_v1_QueryParamsResponse,
  },
  // Resolve queries for the address associated with a given name
resolve: {
    path: '/provenance.name.v1.Query/Resolve',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_query_pb.QueryResolveRequest,
    responseType: provenance_name_v1_query_pb.QueryResolveResponse,
    requestSerialize: serialize_provenance_name_v1_QueryResolveRequest,
    requestDeserialize: deserialize_provenance_name_v1_QueryResolveRequest,
    responseSerialize: serialize_provenance_name_v1_QueryResolveResponse,
    responseDeserialize: deserialize_provenance_name_v1_QueryResolveResponse,
  },
  // ReverseLookup queries for all names bound against a given address
reverseLookup: {
    path: '/provenance.name.v1.Query/ReverseLookup',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_query_pb.QueryReverseLookupRequest,
    responseType: provenance_name_v1_query_pb.QueryReverseLookupResponse,
    requestSerialize: serialize_provenance_name_v1_QueryReverseLookupRequest,
    requestDeserialize: deserialize_provenance_name_v1_QueryReverseLookupRequest,
    responseSerialize: serialize_provenance_name_v1_QueryReverseLookupResponse,
    responseDeserialize: deserialize_provenance_name_v1_QueryReverseLookupResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
