// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_icqueries_query_pb = require('../../lum-network/icqueries/query_pb.js');
var lum$network_icqueries_genesis_pb = require('../../lum-network/icqueries/genesis_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_lum_network_icqueries_QueryPendingQueriesRequest(arg) {
  if (!(arg instanceof lum$network_icqueries_query_pb.QueryPendingQueriesRequest)) {
    throw new Error('Expected argument of type lum.network.icqueries.QueryPendingQueriesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_QueryPendingQueriesRequest(buffer_arg) {
  return lum$network_icqueries_query_pb.QueryPendingQueriesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icqueries_QueryPendingQueriesResponse(arg) {
  if (!(arg instanceof lum$network_icqueries_query_pb.QueryPendingQueriesResponse)) {
    throw new Error('Expected argument of type lum.network.icqueries.QueryPendingQueriesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_QueryPendingQueriesResponse(buffer_arg) {
  return lum$network_icqueries_query_pb.QueryPendingQueriesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icqueries_QueryQueriesRequest(arg) {
  if (!(arg instanceof lum$network_icqueries_query_pb.QueryQueriesRequest)) {
    throw new Error('Expected argument of type lum.network.icqueries.QueryQueriesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_QueryQueriesRequest(buffer_arg) {
  return lum$network_icqueries_query_pb.QueryQueriesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icqueries_QueryQueriesResponse(arg) {
  if (!(arg instanceof lum$network_icqueries_query_pb.QueryQueriesResponse)) {
    throw new Error('Expected argument of type lum.network.icqueries.QueryQueriesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_QueryQueriesResponse(buffer_arg) {
  return lum$network_icqueries_query_pb.QueryQueriesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  queries: {
    path: '/lum.network.icqueries.QueryService/Queries',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icqueries_query_pb.QueryQueriesRequest,
    responseType: lum$network_icqueries_query_pb.QueryQueriesResponse,
    requestSerialize: serialize_lum_network_icqueries_QueryQueriesRequest,
    requestDeserialize: deserialize_lum_network_icqueries_QueryQueriesRequest,
    responseSerialize: serialize_lum_network_icqueries_QueryQueriesResponse,
    responseDeserialize: deserialize_lum_network_icqueries_QueryQueriesResponse,
  },
  pendingQueries: {
    path: '/lum.network.icqueries.QueryService/PendingQueries',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icqueries_query_pb.QueryPendingQueriesRequest,
    responseType: lum$network_icqueries_query_pb.QueryPendingQueriesResponse,
    requestSerialize: serialize_lum_network_icqueries_QueryPendingQueriesRequest,
    requestDeserialize: deserialize_lum_network_icqueries_QueryPendingQueriesRequest,
    responseSerialize: serialize_lum_network_icqueries_QueryPendingQueriesResponse,
    responseDeserialize: deserialize_lum_network_icqueries_QueryPendingQueriesResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
