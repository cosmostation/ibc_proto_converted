// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_record_query_pb = require('../../irismod/record/query_pb.js');
var irismod_record_record_pb = require('../../irismod/record/record_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_irismod_record_QueryRecordRequest(arg) {
  if (!(arg instanceof irismod_record_query_pb.QueryRecordRequest)) {
    throw new Error('Expected argument of type irismod.record.QueryRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_record_QueryRecordRequest(buffer_arg) {
  return irismod_record_query_pb.QueryRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_record_QueryRecordResponse(arg) {
  if (!(arg instanceof irismod_record_query_pb.QueryRecordResponse)) {
    throw new Error('Expected argument of type irismod.record.QueryRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_record_QueryRecordResponse(buffer_arg) {
  return irismod_record_query_pb.QueryRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for record module
var QueryService = exports.QueryService = {
  // Record queries the record by the given record ID
record: {
    path: '/irismod.record.Query/Record',
    requestStream: false,
    responseStream: false,
    requestType: irismod_record_query_pb.QueryRecordRequest,
    responseType: irismod_record_query_pb.QueryRecordResponse,
    requestSerialize: serialize_irismod_record_QueryRecordRequest,
    requestDeserialize: deserialize_irismod_record_QueryRecordRequest,
    responseSerialize: serialize_irismod_record_QueryRecordResponse,
    responseDeserialize: deserialize_irismod_record_QueryRecordResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
