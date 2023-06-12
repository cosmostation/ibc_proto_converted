// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_marker_v1beta1_query_pb = require('../../../crescent/marker/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var crescent_marker_v1beta1_marker_pb = require('../../../crescent/marker/v1beta1/marker_pb.js');

function serialize_crescent_marker_v1beta1_QueryLastBlockTimeRequest(arg) {
  if (!(arg instanceof crescent_marker_v1beta1_query_pb.QueryLastBlockTimeRequest)) {
    throw new Error('Expected argument of type crescent.marker.v1beta1.QueryLastBlockTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marker_v1beta1_QueryLastBlockTimeRequest(buffer_arg) {
  return crescent_marker_v1beta1_query_pb.QueryLastBlockTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marker_v1beta1_QueryLastBlockTimeResponse(arg) {
  if (!(arg instanceof crescent_marker_v1beta1_query_pb.QueryLastBlockTimeResponse)) {
    throw new Error('Expected argument of type crescent.marker.v1beta1.QueryLastBlockTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marker_v1beta1_QueryLastBlockTimeResponse(buffer_arg) {
  return crescent_marker_v1beta1_query_pb.QueryLastBlockTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marker_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_marker_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.marker.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marker_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_marker_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marker_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_marker_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.marker.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marker_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_marker_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/crescent.marker.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marker_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_marker_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_marker_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_marker_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_marker_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_marker_v1beta1_QueryParamsResponse,
  },
  lastBlockTime: {
    path: '/crescent.marker.v1beta1.Query/LastBlockTime',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marker_v1beta1_query_pb.QueryLastBlockTimeRequest,
    responseType: crescent_marker_v1beta1_query_pb.QueryLastBlockTimeResponse,
    requestSerialize: serialize_crescent_marker_v1beta1_QueryLastBlockTimeRequest,
    requestDeserialize: deserialize_crescent_marker_v1beta1_QueryLastBlockTimeRequest,
    responseSerialize: serialize_crescent_marker_v1beta1_QueryLastBlockTimeResponse,
    responseDeserialize: deserialize_crescent_marker_v1beta1_QueryLastBlockTimeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
