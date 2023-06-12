// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_incentives_v1beta1_query_pb = require('../../../mars/incentives/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var mars_incentives_v1beta1_store_pb = require('../../../mars/incentives/v1beta1/store_pb.js');

function serialize_mars_incentives_v1beta1_QueryScheduleRequest(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_query_pb.QueryScheduleRequest)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.QueryScheduleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_QueryScheduleRequest(buffer_arg) {
  return mars_incentives_v1beta1_query_pb.QueryScheduleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_QueryScheduleResponse(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_query_pb.QueryScheduleResponse)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.QueryScheduleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_QueryScheduleResponse(buffer_arg) {
  return mars_incentives_v1beta1_query_pb.QueryScheduleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_QuerySchedulesRequest(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_query_pb.QuerySchedulesRequest)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.QuerySchedulesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_QuerySchedulesRequest(buffer_arg) {
  return mars_incentives_v1beta1_query_pb.QuerySchedulesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_QuerySchedulesResponse(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_query_pb.QuerySchedulesResponse)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.QuerySchedulesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_QuerySchedulesResponse(buffer_arg) {
  return mars_incentives_v1beta1_query_pb.QuerySchedulesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for the incentives module
var QueryService = exports.QueryService = {
  // Schedule queries an incentives schedule by identifier
schedule: {
    path: '/mars.incentives.v1beta1.Query/Schedule',
    requestStream: false,
    responseStream: false,
    requestType: mars_incentives_v1beta1_query_pb.QueryScheduleRequest,
    responseType: mars_incentives_v1beta1_query_pb.QueryScheduleResponse,
    requestSerialize: serialize_mars_incentives_v1beta1_QueryScheduleRequest,
    requestDeserialize: deserialize_mars_incentives_v1beta1_QueryScheduleRequest,
    responseSerialize: serialize_mars_incentives_v1beta1_QueryScheduleResponse,
    responseDeserialize: deserialize_mars_incentives_v1beta1_QueryScheduleResponse,
  },
  // Schedules queries all incentives schedules
schedules: {
    path: '/mars.incentives.v1beta1.Query/Schedules',
    requestStream: false,
    responseStream: false,
    requestType: mars_incentives_v1beta1_query_pb.QuerySchedulesRequest,
    responseType: mars_incentives_v1beta1_query_pb.QuerySchedulesResponse,
    requestSerialize: serialize_mars_incentives_v1beta1_QuerySchedulesRequest,
    requestDeserialize: deserialize_mars_incentives_v1beta1_QuerySchedulesRequest,
    responseSerialize: serialize_mars_incentives_v1beta1_QuerySchedulesResponse,
    responseDeserialize: deserialize_mars_incentives_v1beta1_QuerySchedulesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
