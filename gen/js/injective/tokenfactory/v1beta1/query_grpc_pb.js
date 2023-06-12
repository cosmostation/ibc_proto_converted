// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_tokenfactory_v1beta1_query_pb = require('../../../injective/tokenfactory/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var injective_tokenfactory_v1beta1_authorityMetadata_pb = require('../../../injective/tokenfactory/v1beta1/authorityMetadata_pb.js');
var injective_tokenfactory_v1beta1_params_pb = require('../../../injective/tokenfactory/v1beta1/params_pb.js');
var injective_tokenfactory_v1beta1_genesis_pb = require('../../../injective/tokenfactory/v1beta1/genesis_pb.js');

function serialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryDenomAuthorityMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryDenomsFromCreatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryDenomsFromCreatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryParamsRequest(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_QueryParamsResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params defines a gRPC query method that returns the tokenfactory module's
// parameters.
params: {
    path: '/injective.tokenfactory.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_query_pb.QueryParamsRequest,
    responseType: injective_tokenfactory_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryParamsResponse,
  },
  // DenomAuthorityMetadata defines a gRPC query method for fetching
// DenomAuthorityMetadata for a particular denom.
denomAuthorityMetadata: {
    path: '/injective.tokenfactory.v1beta1.Query/DenomAuthorityMetadata',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest,
    responseType: injective_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
  },
  // DenomsFromCreator defines a gRPC query method for fetching all
// denominations created by a specific admin/creator.
denomsFromCreator: {
    path: '/injective.tokenfactory.v1beta1.Query/DenomsFromCreator',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest,
    responseType: injective_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
  },
  // Retrieves the entire auction module's state
tokenfactoryModuleState: {
    path: '/injective.tokenfactory.v1beta1.Query/TokenfactoryModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_tokenfactory_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_QueryModuleStateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
