// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_queries_v1_query_pb = require('../../../em/queries/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_em_queries_v1_QueryCirculatingRequest(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QueryCirculatingRequest)) {
    throw new Error('Expected argument of type em.queries.v1.QueryCirculatingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QueryCirculatingRequest(buffer_arg) {
  return em_queries_v1_query_pb.QueryCirculatingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_queries_v1_QueryCirculatingResponse(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QueryCirculatingResponse)) {
    throw new Error('Expected argument of type em.queries.v1.QueryCirculatingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QueryCirculatingResponse(buffer_arg) {
  return em_queries_v1_query_pb.QueryCirculatingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_queries_v1_QueryMissedBlocksRequest(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QueryMissedBlocksRequest)) {
    throw new Error('Expected argument of type em.queries.v1.QueryMissedBlocksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QueryMissedBlocksRequest(buffer_arg) {
  return em_queries_v1_query_pb.QueryMissedBlocksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_queries_v1_QueryMissedBlocksResponse(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QueryMissedBlocksResponse)) {
    throw new Error('Expected argument of type em.queries.v1.QueryMissedBlocksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QueryMissedBlocksResponse(buffer_arg) {
  return em_queries_v1_query_pb.QueryMissedBlocksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_queries_v1_QuerySpendableRequest(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QuerySpendableRequest)) {
    throw new Error('Expected argument of type em.queries.v1.QuerySpendableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QuerySpendableRequest(buffer_arg) {
  return em_queries_v1_query_pb.QuerySpendableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_queries_v1_QuerySpendableResponse(arg) {
  if (!(arg instanceof em_queries_v1_query_pb.QuerySpendableResponse)) {
    throw new Error('Expected argument of type em.queries.v1.QuerySpendableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_queries_v1_QuerySpendableResponse(buffer_arg) {
  return em_queries_v1_query_pb.QuerySpendableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  circulating: {
    path: '/em.queries.v1.Query/Circulating',
    requestStream: false,
    responseStream: false,
    requestType: em_queries_v1_query_pb.QueryCirculatingRequest,
    responseType: em_queries_v1_query_pb.QueryCirculatingResponse,
    requestSerialize: serialize_em_queries_v1_QueryCirculatingRequest,
    requestDeserialize: deserialize_em_queries_v1_QueryCirculatingRequest,
    responseSerialize: serialize_em_queries_v1_QueryCirculatingResponse,
    responseDeserialize: deserialize_em_queries_v1_QueryCirculatingResponse,
  },
  missedBlocks: {
    path: '/em.queries.v1.Query/MissedBlocks',
    requestStream: false,
    responseStream: false,
    requestType: em_queries_v1_query_pb.QueryMissedBlocksRequest,
    responseType: em_queries_v1_query_pb.QueryMissedBlocksResponse,
    requestSerialize: serialize_em_queries_v1_QueryMissedBlocksRequest,
    requestDeserialize: deserialize_em_queries_v1_QueryMissedBlocksRequest,
    responseSerialize: serialize_em_queries_v1_QueryMissedBlocksResponse,
    responseDeserialize: deserialize_em_queries_v1_QueryMissedBlocksResponse,
  },
  spendable: {
    path: '/em.queries.v1.Query/Spendable',
    requestStream: false,
    responseStream: false,
    requestType: em_queries_v1_query_pb.QuerySpendableRequest,
    responseType: em_queries_v1_query_pb.QuerySpendableResponse,
    requestSerialize: serialize_em_queries_v1_QuerySpendableRequest,
    requestDeserialize: deserialize_em_queries_v1_QuerySpendableRequest,
    responseSerialize: serialize_em_queries_v1_QuerySpendableResponse,
    responseDeserialize: deserialize_em_queries_v1_QuerySpendableResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
