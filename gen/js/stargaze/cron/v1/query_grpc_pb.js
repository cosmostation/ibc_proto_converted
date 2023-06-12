// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_cron_v1_query_pb = require('../../../stargaze/cron/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest(arg) {
  if (!(arg instanceof stargaze_cron_v1_query_pb.QueryListPrivilegedRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.cron.v1.QueryListPrivilegedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest(buffer_arg) {
  return stargaze_cron_v1_query_pb.QueryListPrivilegedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse(arg) {
  if (!(arg instanceof stargaze_cron_v1_query_pb.QueryListPrivilegedResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.cron.v1.QueryListPrivilegedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse(buffer_arg) {
  return stargaze_cron_v1_query_pb.QueryListPrivilegedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ListPrivileged queries the contracts which have the priviledge status
listPrivileged: {
    path: '/publicawesome.stargaze.cron.v1.Query/ListPrivileged',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_cron_v1_query_pb.QueryListPrivilegedRequest,
    responseType: stargaze_cron_v1_query_pb.QueryListPrivilegedResponse,
    requestSerialize: serialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest,
    responseSerialize: serialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
