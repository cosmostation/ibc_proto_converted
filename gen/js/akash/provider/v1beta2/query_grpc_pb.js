// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_provider_v1beta2_query_pb = require('../../../akash/provider/v1beta2/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_provider_v1beta2_provider_pb = require('../../../akash/provider/v1beta2/provider_pb.js');

function serialize_akash_provider_v1beta2_QueryProviderRequest(arg) {
  if (!(arg instanceof akash_provider_v1beta2_query_pb.QueryProviderRequest)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.QueryProviderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_QueryProviderRequest(buffer_arg) {
  return akash_provider_v1beta2_query_pb.QueryProviderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_QueryProviderResponse(arg) {
  if (!(arg instanceof akash_provider_v1beta2_query_pb.QueryProviderResponse)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.QueryProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_QueryProviderResponse(buffer_arg) {
  return akash_provider_v1beta2_query_pb.QueryProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_QueryProvidersRequest(arg) {
  if (!(arg instanceof akash_provider_v1beta2_query_pb.QueryProvidersRequest)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.QueryProvidersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_QueryProvidersRequest(buffer_arg) {
  return akash_provider_v1beta2_query_pb.QueryProvidersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_QueryProvidersResponse(arg) {
  if (!(arg instanceof akash_provider_v1beta2_query_pb.QueryProvidersResponse)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.QueryProvidersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_QueryProvidersResponse(buffer_arg) {
  return akash_provider_v1beta2_query_pb.QueryProvidersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Providers queries providers
providers: {
    path: '/akash.provider.v1beta2.Query/Providers',
    requestStream: false,
    responseStream: false,
    requestType: akash_provider_v1beta2_query_pb.QueryProvidersRequest,
    responseType: akash_provider_v1beta2_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_akash_provider_v1beta2_QueryProvidersRequest,
    requestDeserialize: deserialize_akash_provider_v1beta2_QueryProvidersRequest,
    responseSerialize: serialize_akash_provider_v1beta2_QueryProvidersResponse,
    responseDeserialize: deserialize_akash_provider_v1beta2_QueryProvidersResponse,
  },
  // Provider queries provider details
provider: {
    path: '/akash.provider.v1beta2.Query/Provider',
    requestStream: false,
    responseStream: false,
    requestType: akash_provider_v1beta2_query_pb.QueryProviderRequest,
    responseType: akash_provider_v1beta2_query_pb.QueryProviderResponse,
    requestSerialize: serialize_akash_provider_v1beta2_QueryProviderRequest,
    requestDeserialize: deserialize_akash_provider_v1beta2_QueryProviderRequest,
    responseSerialize: serialize_akash_provider_v1beta2_QueryProviderResponse,
    responseDeserialize: deserialize_akash_provider_v1beta2_QueryProviderResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
