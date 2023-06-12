// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_recovery_v1_query_pb = require('../../../evmos/recovery/v1/query_pb.js');
var evmos_recovery_v1_genesis_pb = require('../../../evmos/recovery/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_recovery_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof evmos_recovery_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type evmos.recovery.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_recovery_v1_QueryParamsRequest(buffer_arg) {
  return evmos_recovery_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_recovery_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof evmos_recovery_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type evmos.recovery.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_recovery_v1_QueryParamsResponse(buffer_arg) {
  return evmos_recovery_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params retrieves the total set of recovery parameters.
params: {
    path: '/evmos.recovery.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: evmos_recovery_v1_query_pb.QueryParamsRequest,
    responseType: evmos_recovery_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_evmos_recovery_v1_QueryParamsRequest,
    requestDeserialize: deserialize_evmos_recovery_v1_QueryParamsRequest,
    responseSerialize: serialize_evmos_recovery_v1_QueryParamsResponse,
    responseDeserialize: deserialize_evmos_recovery_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
