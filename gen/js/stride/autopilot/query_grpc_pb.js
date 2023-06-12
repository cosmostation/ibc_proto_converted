// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_autopilot_query_pb = require('../../stride/autopilot/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var stride_autopilot_params_pb = require('../../stride/autopilot/params_pb.js');

function serialize_stride_autopilot_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_autopilot_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.autopilot.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_autopilot_QueryParamsRequest(buffer_arg) {
  return stride_autopilot_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_autopilot_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_autopilot_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.autopilot.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_autopilot_QueryParamsResponse(buffer_arg) {
  return stride_autopilot_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stride.autopilot.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_autopilot_query_pb.QueryParamsRequest,
    responseType: stride_autopilot_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_autopilot_QueryParamsRequest,
    requestDeserialize: deserialize_stride_autopilot_QueryParamsRequest,
    responseSerialize: serialize_stride_autopilot_QueryParamsResponse,
    responseDeserialize: deserialize_stride_autopilot_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
