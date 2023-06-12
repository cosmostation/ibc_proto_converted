// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_relationships_v1_query_pb = require('../../../desmos/relationships/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var desmos_relationships_v1_models_pb = require('../../../desmos/relationships/v1/models_pb.js');

function serialize_desmos_relationships_v1_QueryBlocksRequest(arg) {
  if (!(arg instanceof desmos_relationships_v1_query_pb.QueryBlocksRequest)) {
    throw new Error('Expected argument of type desmos.relationships.v1.QueryBlocksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_QueryBlocksRequest(buffer_arg) {
  return desmos_relationships_v1_query_pb.QueryBlocksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_QueryBlocksResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_query_pb.QueryBlocksResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.QueryBlocksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_QueryBlocksResponse(buffer_arg) {
  return desmos_relationships_v1_query_pb.QueryBlocksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_QueryRelationshipsRequest(arg) {
  if (!(arg instanceof desmos_relationships_v1_query_pb.QueryRelationshipsRequest)) {
    throw new Error('Expected argument of type desmos.relationships.v1.QueryRelationshipsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_QueryRelationshipsRequest(buffer_arg) {
  return desmos_relationships_v1_query_pb.QueryRelationshipsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_QueryRelationshipsResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_query_pb.QueryRelationshipsResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.QueryRelationshipsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_QueryRelationshipsResponse(buffer_arg) {
  return desmos_relationships_v1_query_pb.QueryRelationshipsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Relationships queries all relationships present inside a specific subspace
relationships: {
    path: '/desmos.relationships.v1.Query/Relationships',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_query_pb.QueryRelationshipsRequest,
    responseType: desmos_relationships_v1_query_pb.QueryRelationshipsResponse,
    requestSerialize: serialize_desmos_relationships_v1_QueryRelationshipsRequest,
    requestDeserialize: deserialize_desmos_relationships_v1_QueryRelationshipsRequest,
    responseSerialize: serialize_desmos_relationships_v1_QueryRelationshipsResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_QueryRelationshipsResponse,
  },
  // Blocks queries the blocks for the given user, if provided.
// Otherwise, it queries all the stored blocks.
blocks: {
    path: '/desmos.relationships.v1.Query/Blocks',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_query_pb.QueryBlocksRequest,
    responseType: desmos_relationships_v1_query_pb.QueryBlocksResponse,
    requestSerialize: serialize_desmos_relationships_v1_QueryBlocksRequest,
    requestDeserialize: deserialize_desmos_relationships_v1_QueryBlocksRequest,
    responseSerialize: serialize_desmos_relationships_v1_QueryBlocksResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_QueryBlocksResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
