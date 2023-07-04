// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var archway_tracking_v1_query_pb = require('../../../archway/tracking/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var archway_tracking_v1_tracking_pb = require('../../../archway/tracking/v1/tracking_pb.js');

function serialize_archway_tracking_v1_QueryBlockGasTrackingRequest(arg) {
  if (!(arg instanceof archway_tracking_v1_query_pb.QueryBlockGasTrackingRequest)) {
    throw new Error('Expected argument of type archway.tracking.v1.QueryBlockGasTrackingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_tracking_v1_QueryBlockGasTrackingRequest(buffer_arg) {
  return archway_tracking_v1_query_pb.QueryBlockGasTrackingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_tracking_v1_QueryBlockGasTrackingResponse(arg) {
  if (!(arg instanceof archway_tracking_v1_query_pb.QueryBlockGasTrackingResponse)) {
    throw new Error('Expected argument of type archway.tracking.v1.QueryBlockGasTrackingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_tracking_v1_QueryBlockGasTrackingResponse(buffer_arg) {
  return archway_tracking_v1_query_pb.QueryBlockGasTrackingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query service for the tracking module.
var QueryService = exports.QueryService = {
  // BlockGasTracking returns block gas tracking for the current block
blockGasTracking: {
    path: '/archway.tracking.v1.Query/BlockGasTracking',
    requestStream: false,
    responseStream: false,
    requestType: archway_tracking_v1_query_pb.QueryBlockGasTrackingRequest,
    responseType: archway_tracking_v1_query_pb.QueryBlockGasTrackingResponse,
    requestSerialize: serialize_archway_tracking_v1_QueryBlockGasTrackingRequest,
    requestDeserialize: deserialize_archway_tracking_v1_QueryBlockGasTrackingRequest,
    responseSerialize: serialize_archway_tracking_v1_QueryBlockGasTrackingResponse,
    responseDeserialize: deserialize_archway_tracking_v1_QueryBlockGasTrackingResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
