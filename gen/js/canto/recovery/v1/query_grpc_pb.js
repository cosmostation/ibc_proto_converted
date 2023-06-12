// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_recovery_v1_query_pb = require('../../../canto/recovery/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var canto_recovery_v1_genesis_pb = require('../../../canto/recovery/v1/genesis_pb.js');

function serialize_canto_recovery_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof canto_recovery_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type canto.recovery.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_recovery_v1_QueryParamsRequest(buffer_arg) {
  return canto_recovery_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_recovery_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof canto_recovery_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type canto.recovery.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_recovery_v1_QueryParamsResponse(buffer_arg) {
  return canto_recovery_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params retrieves the total set of recovery parameters.
params: {
    path: '/canto.recovery.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: canto_recovery_v1_query_pb.QueryParamsRequest,
    responseType: canto_recovery_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_canto_recovery_v1_QueryParamsRequest,
    requestDeserialize: deserialize_canto_recovery_v1_QueryParamsRequest,
    responseSerialize: serialize_canto_recovery_v1_QueryParamsResponse,
    responseDeserialize: deserialize_canto_recovery_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
