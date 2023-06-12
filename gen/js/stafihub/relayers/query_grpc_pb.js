// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_relayers_query_pb = require('../../stafihub/relayers/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_stafihub_stafihub_relayers_QueryRelayersRequest(arg) {
  if (!(arg instanceof stafihub_relayers_query_pb.QueryRelayersRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.QueryRelayersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_QueryRelayersRequest(buffer_arg) {
  return stafihub_relayers_query_pb.QueryRelayersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_QueryRelayersResponse(arg) {
  if (!(arg instanceof stafihub_relayers_query_pb.QueryRelayersResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.QueryRelayersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_QueryRelayersResponse(buffer_arg) {
  return stafihub_relayers_query_pb.QueryRelayersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_QueryThresholdRequest(arg) {
  if (!(arg instanceof stafihub_relayers_query_pb.QueryThresholdRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.QueryThresholdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_QueryThresholdRequest(buffer_arg) {
  return stafihub_relayers_query_pb.QueryThresholdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_relayers_QueryThresholdResponse(arg) {
  if (!(arg instanceof stafihub_relayers_query_pb.QueryThresholdResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.relayers.QueryThresholdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_relayers_QueryThresholdResponse(buffer_arg) {
  return stafihub_relayers_query_pb.QueryThresholdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries a list of relayersByDenom items.
relayers: {
    path: '/stafihub.stafihub.relayers.Query/Relayers',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_relayers_query_pb.QueryRelayersRequest,
    responseType: stafihub_relayers_query_pb.QueryRelayersResponse,
    requestSerialize: serialize_stafihub_stafihub_relayers_QueryRelayersRequest,
    requestDeserialize: deserialize_stafihub_stafihub_relayers_QueryRelayersRequest,
    responseSerialize: serialize_stafihub_stafihub_relayers_QueryRelayersResponse,
    responseDeserialize: deserialize_stafihub_stafihub_relayers_QueryRelayersResponse,
  },
  // Queries a threshold by denom.
threshold: {
    path: '/stafihub.stafihub.relayers.Query/Threshold',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_relayers_query_pb.QueryThresholdRequest,
    responseType: stafihub_relayers_query_pb.QueryThresholdResponse,
    requestSerialize: serialize_stafihub_stafihub_relayers_QueryThresholdRequest,
    requestDeserialize: deserialize_stafihub_stafihub_relayers_QueryThresholdRequest,
    responseSerialize: serialize_stafihub_stafihub_relayers_QueryThresholdResponse,
    responseDeserialize: deserialize_stafihub_stafihub_relayers_QueryThresholdResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
