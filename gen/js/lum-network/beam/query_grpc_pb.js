// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_beam_query_pb = require('../../lum-network/beam/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var lum$network_beam_beam_pb = require('../../lum-network/beam/beam_pb.js');

function serialize_lum_network_beam_QueryFetchBeamsOpenQueueRequest(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryFetchBeamsOpenQueueRequest)) {
    throw new Error('Expected argument of type lum.network.beam.QueryFetchBeamsOpenQueueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryFetchBeamsOpenQueueRequest(buffer_arg) {
  return lum$network_beam_query_pb.QueryFetchBeamsOpenQueueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_beam_QueryFetchBeamsOpenQueueResponse(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryFetchBeamsOpenQueueResponse)) {
    throw new Error('Expected argument of type lum.network.beam.QueryFetchBeamsOpenQueueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryFetchBeamsOpenQueueResponse(buffer_arg) {
  return lum$network_beam_query_pb.QueryFetchBeamsOpenQueueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_beam_QueryFetchBeamsRequest(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryFetchBeamsRequest)) {
    throw new Error('Expected argument of type lum.network.beam.QueryFetchBeamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryFetchBeamsRequest(buffer_arg) {
  return lum$network_beam_query_pb.QueryFetchBeamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_beam_QueryFetchBeamsResponse(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryFetchBeamsResponse)) {
    throw new Error('Expected argument of type lum.network.beam.QueryFetchBeamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryFetchBeamsResponse(buffer_arg) {
  return lum$network_beam_query_pb.QueryFetchBeamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_beam_QueryGetBeamRequest(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryGetBeamRequest)) {
    throw new Error('Expected argument of type lum.network.beam.QueryGetBeamRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryGetBeamRequest(buffer_arg) {
  return lum$network_beam_query_pb.QueryGetBeamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_beam_QueryGetBeamResponse(arg) {
  if (!(arg instanceof lum$network_beam_query_pb.QueryGetBeamResponse)) {
    throw new Error('Expected argument of type lum.network.beam.QueryGetBeamResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_beam_QueryGetBeamResponse(buffer_arg) {
  return lum$network_beam_query_pb.QueryGetBeamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  beam: {
    path: '/lum.network.beam.Query/Beam',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_beam_query_pb.QueryGetBeamRequest,
    responseType: lum$network_beam_query_pb.QueryGetBeamResponse,
    requestSerialize: serialize_lum_network_beam_QueryGetBeamRequest,
    requestDeserialize: deserialize_lum_network_beam_QueryGetBeamRequest,
    responseSerialize: serialize_lum_network_beam_QueryGetBeamResponse,
    responseDeserialize: deserialize_lum_network_beam_QueryGetBeamResponse,
  },
  beams: {
    path: '/lum.network.beam.Query/Beams',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_beam_query_pb.QueryFetchBeamsRequest,
    responseType: lum$network_beam_query_pb.QueryFetchBeamsResponse,
    requestSerialize: serialize_lum_network_beam_QueryFetchBeamsRequest,
    requestDeserialize: deserialize_lum_network_beam_QueryFetchBeamsRequest,
    responseSerialize: serialize_lum_network_beam_QueryFetchBeamsResponse,
    responseDeserialize: deserialize_lum_network_beam_QueryFetchBeamsResponse,
  },
  beamsOpenQueue: {
    path: '/lum.network.beam.Query/BeamsOpenQueue',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_beam_query_pb.QueryFetchBeamsOpenQueueRequest,
    responseType: lum$network_beam_query_pb.QueryFetchBeamsOpenQueueResponse,
    requestSerialize: serialize_lum_network_beam_QueryFetchBeamsOpenQueueRequest,
    requestDeserialize: deserialize_lum_network_beam_QueryFetchBeamsOpenQueueRequest,
    responseSerialize: serialize_lum_network_beam_QueryFetchBeamsOpenQueueResponse,
    responseDeserialize: deserialize_lum_network_beam_QueryFetchBeamsOpenQueueResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
