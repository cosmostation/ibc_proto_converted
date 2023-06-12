// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_cron_query_pb = require('../../neutron/cron/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_cron_params_pb = require('../../neutron/cron/params_pb.js');
var neutron_cron_schedule_pb = require('../../neutron/cron/schedule_pb.js');

function serialize_neutron_cron_QueryGetScheduleRequest(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QueryGetScheduleRequest)) {
    throw new Error('Expected argument of type neutron.cron.QueryGetScheduleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QueryGetScheduleRequest(buffer_arg) {
  return neutron_cron_query_pb.QueryGetScheduleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_cron_QueryGetScheduleResponse(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QueryGetScheduleResponse)) {
    throw new Error('Expected argument of type neutron.cron.QueryGetScheduleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QueryGetScheduleResponse(buffer_arg) {
  return neutron_cron_query_pb.QueryGetScheduleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_cron_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.cron.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QueryParamsRequest(buffer_arg) {
  return neutron_cron_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_cron_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.cron.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QueryParamsResponse(buffer_arg) {
  return neutron_cron_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_cron_QuerySchedulesRequest(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QuerySchedulesRequest)) {
    throw new Error('Expected argument of type neutron.cron.QuerySchedulesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QuerySchedulesRequest(buffer_arg) {
  return neutron_cron_query_pb.QuerySchedulesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_cron_QuerySchedulesResponse(arg) {
  if (!(arg instanceof neutron_cron_query_pb.QuerySchedulesResponse)) {
    throw new Error('Expected argument of type neutron.cron.QuerySchedulesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_cron_QuerySchedulesResponse(buffer_arg) {
  return neutron_cron_query_pb.QuerySchedulesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries the parameters of the module.
params: {
    path: '/neutron.cron.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_cron_query_pb.QueryParamsRequest,
    responseType: neutron_cron_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_cron_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_cron_QueryParamsRequest,
    responseSerialize: serialize_neutron_cron_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_cron_QueryParamsResponse,
  },
  // Queries a Schedule by name.
schedule: {
    path: '/neutron.cron.Query/Schedule',
    requestStream: false,
    responseStream: false,
    requestType: neutron_cron_query_pb.QueryGetScheduleRequest,
    responseType: neutron_cron_query_pb.QueryGetScheduleResponse,
    requestSerialize: serialize_neutron_cron_QueryGetScheduleRequest,
    requestDeserialize: deserialize_neutron_cron_QueryGetScheduleRequest,
    responseSerialize: serialize_neutron_cron_QueryGetScheduleResponse,
    responseDeserialize: deserialize_neutron_cron_QueryGetScheduleResponse,
  },
  // Queries a list of Schedule items.
schedules: {
    path: '/neutron.cron.Query/Schedules',
    requestStream: false,
    responseStream: false,
    requestType: neutron_cron_query_pb.QuerySchedulesRequest,
    responseType: neutron_cron_query_pb.QuerySchedulesResponse,
    requestSerialize: serialize_neutron_cron_QuerySchedulesRequest,
    requestDeserialize: deserialize_neutron_cron_QuerySchedulesRequest,
    responseSerialize: serialize_neutron_cron_QuerySchedulesResponse,
    responseDeserialize: deserialize_neutron_cron_QuerySchedulesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
