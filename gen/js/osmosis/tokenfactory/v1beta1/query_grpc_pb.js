// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_tokenfactory_v1beta1_query_pb = require('../../../osmosis/tokenfactory/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var osmosis_tokenfactory_v1beta1_authorityMetadata_pb = require('../../../osmosis/tokenfactory/v1beta1/authorityMetadata_pb.js');
var osmosis_tokenfactory_v1beta1_params_pb = require('../../../osmosis/tokenfactory/v1beta1/params_pb.js');

function serialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressRequest(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressRequest)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryBeforeSendHookAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressRequest(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryBeforeSendHookAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryDenomAuthorityMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryDenomsFromCreatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryDenomsFromCreatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryParamsRequest(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_QueryParamsResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params defines a gRPC query method that returns the tokenfactory module's
// parameters.
params: {
    path: '/osmosis.tokenfactory.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest,
    responseType: osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryParamsResponse,
  },
  // DenomAuthorityMetadata defines a gRPC query method for fetching
// DenomAuthorityMetadata for a particular denom.
denomAuthorityMetadata: {
    path: '/osmosis.tokenfactory.v1beta1.Query/DenomAuthorityMetadata',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest,
    responseType: osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
  },
  // DenomsFromCreator defines a gRPC query method for fetching all
// denominations created by a specific admin/creator.
denomsFromCreator: {
    path: '/osmosis.tokenfactory.v1beta1.Query/DenomsFromCreator',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest,
    responseType: osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
  },
  // BeforeSendHookAddress defines a gRPC query method for
// getting the address registered for the before send hook.
beforeSendHookAddress: {
    path: '/osmosis.tokenfactory.v1beta1.Query/BeforeSendHookAddress',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressRequest,
    responseType: osmosis_tokenfactory_v1beta1_query_pb.QueryBeforeSendHookAddressResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressRequest,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressRequest,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_QueryBeforeSendHookAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
