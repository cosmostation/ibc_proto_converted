// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_aol_v2_query_pb = require('../../../panacea/aol/v2/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var panacea_aol_v2_owner_pb = require('../../../panacea/aol/v2/owner_pb.js');
var panacea_aol_v2_record_pb = require('../../../panacea/aol/v2/record_pb.js');
var panacea_aol_v2_writer_pb = require('../../../panacea/aol/v2/writer_pb.js');
var panacea_aol_v2_topic_pb = require('../../../panacea/aol/v2/topic_pb.js');

function serialize_panacea_aol_v2_QueryRecordRequest(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryRecordRequest)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryRecordRequest(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryRecordResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryRecordResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryRecordResponse(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryTopicRequest(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryTopicRequest)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryTopicRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryTopicRequest(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryTopicRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryTopicResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryTopicResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryTopicResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryTopicResponse(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryTopicResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryTopicsRequest(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryTopicsRequest)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryTopicsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryTopicsRequest(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryTopicsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryTopicsResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryTopicsResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryTopicsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryTopicsResponse(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryTopicsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryWriterRequest(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryWriterRequest)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryWriterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryWriterRequest(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryWriterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryWriterResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryWriterResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryWriterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryWriterResponse(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryWriterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryWritersRequest(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryWritersRequest)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryWritersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryWritersRequest(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryWritersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_QueryWritersResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_query_pb.QueryWritersResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.QueryWritersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_QueryWritersResponse(buffer_arg) {
  return panacea_aol_v2_query_pb.QueryWritersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Topic returns topic details.
topic: {
    path: '/panacea.aol.v2.Query/Topic',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_query_pb.QueryTopicRequest,
    responseType: panacea_aol_v2_query_pb.QueryTopicResponse,
    requestSerialize: serialize_panacea_aol_v2_QueryTopicRequest,
    requestDeserialize: deserialize_panacea_aol_v2_QueryTopicRequest,
    responseSerialize: serialize_panacea_aol_v2_QueryTopicResponse,
    responseDeserialize: deserialize_panacea_aol_v2_QueryTopicResponse,
  },
  // Topics returns topic names.
topics: {
    path: '/panacea.aol.v2.Query/Topics',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_query_pb.QueryTopicsRequest,
    responseType: panacea_aol_v2_query_pb.QueryTopicsResponse,
    requestSerialize: serialize_panacea_aol_v2_QueryTopicsRequest,
    requestDeserialize: deserialize_panacea_aol_v2_QueryTopicsRequest,
    responseSerialize: serialize_panacea_aol_v2_QueryTopicsResponse,
    responseDeserialize: deserialize_panacea_aol_v2_QueryTopicsResponse,
  },
  // Writer returns writer details.
writer: {
    path: '/panacea.aol.v2.Query/Writer',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_query_pb.QueryWriterRequest,
    responseType: panacea_aol_v2_query_pb.QueryWriterResponse,
    requestSerialize: serialize_panacea_aol_v2_QueryWriterRequest,
    requestDeserialize: deserialize_panacea_aol_v2_QueryWriterRequest,
    responseSerialize: serialize_panacea_aol_v2_QueryWriterResponse,
    responseDeserialize: deserialize_panacea_aol_v2_QueryWriterResponse,
  },
  // Writers returns writer addresses.
writers: {
    path: '/panacea.aol.v2.Query/Writers',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_query_pb.QueryWritersRequest,
    responseType: panacea_aol_v2_query_pb.QueryWritersResponse,
    requestSerialize: serialize_panacea_aol_v2_QueryWritersRequest,
    requestDeserialize: deserialize_panacea_aol_v2_QueryWritersRequest,
    responseSerialize: serialize_panacea_aol_v2_QueryWritersResponse,
    responseDeserialize: deserialize_panacea_aol_v2_QueryWritersResponse,
  },
  // Record returns record details.
record: {
    path: '/panacea.aol.v2.Query/Record',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_query_pb.QueryRecordRequest,
    responseType: panacea_aol_v2_query_pb.QueryRecordResponse,
    requestSerialize: serialize_panacea_aol_v2_QueryRecordRequest,
    requestDeserialize: deserialize_panacea_aol_v2_QueryRecordRequest,
    responseSerialize: serialize_panacea_aol_v2_QueryRecordResponse,
    responseDeserialize: deserialize_panacea_aol_v2_QueryRecordResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
