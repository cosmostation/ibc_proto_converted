// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_osmosis_tokenfactory_v1beta1_query_pb = require('../../../../neutron/osmosis/tokenfactory/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var neutron_osmosis_tokenfactory_v1beta1_authorityMetadata_pb = require('../../../../neutron/osmosis/tokenfactory/v1beta1/authorityMetadata_pb.js');
var neutron_osmosis_tokenfactory_v1beta1_params_pb = require('../../../../neutron/osmosis/tokenfactory/v1beta1/params_pb.js');

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryDenomAuthorityMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryDenomsFromCreatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryDenomsFromCreatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsRequest(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of minting parameters.
params: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsRequest,
    responseType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryParamsResponse,
  },
  denomAuthorityMetadata: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomAuthorityMetadata',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataRequest,
    responseType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomAuthorityMetadataResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataRequest,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse,
  },
  denomsFromCreator: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Query/DenomsFromCreator',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorRequest,
    responseType: neutron_osmosis_tokenfactory_v1beta1_query_pb.QueryDenomsFromCreatorResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorRequest,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_QueryDenomsFromCreatorResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
