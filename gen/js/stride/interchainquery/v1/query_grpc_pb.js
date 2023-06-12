// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_interchainquery_v1_query_pb = require('../../../stride/interchainquery/v1/query_pb.js');
var stride_interchainquery_v1_genesis_pb = require('../../../stride/interchainquery/v1/genesis_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_stride_interchainquery_v1_QueryPendingQueriesRequest(arg) {
  if (!(arg instanceof stride_interchainquery_v1_query_pb.QueryPendingQueriesRequest)) {
    throw new Error('Expected argument of type stride.interchainquery.v1.QueryPendingQueriesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_interchainquery_v1_QueryPendingQueriesRequest(buffer_arg) {
  return stride_interchainquery_v1_query_pb.QueryPendingQueriesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_interchainquery_v1_QueryPendingQueriesResponse(arg) {
  if (!(arg instanceof stride_interchainquery_v1_query_pb.QueryPendingQueriesResponse)) {
    throw new Error('Expected argument of type stride.interchainquery.v1.QueryPendingQueriesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_interchainquery_v1_QueryPendingQueriesResponse(buffer_arg) {
  return stride_interchainquery_v1_query_pb.QueryPendingQueriesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  pendingQueries: {
    path: '/stride.interchainquery.v1.QueryService/PendingQueries',
    requestStream: false,
    responseStream: false,
    requestType: stride_interchainquery_v1_query_pb.QueryPendingQueriesRequest,
    responseType: stride_interchainquery_v1_query_pb.QueryPendingQueriesResponse,
    requestSerialize: serialize_stride_interchainquery_v1_QueryPendingQueriesRequest,
    requestDeserialize: deserialize_stride_interchainquery_v1_QueryPendingQueriesRequest,
    responseSerialize: serialize_stride_interchainquery_v1_QueryPendingQueriesResponse,
    responseDeserialize: deserialize_stride_interchainquery_v1_QueryPendingQueriesResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
