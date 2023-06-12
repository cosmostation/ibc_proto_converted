// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_random_query_pb = require('../../irismod/random/query_pb.js');
var irismod_random_random_pb = require('../../irismod/random/random_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_irismod_random_QueryRandomRequest(arg) {
  if (!(arg instanceof irismod_random_query_pb.QueryRandomRequest)) {
    throw new Error('Expected argument of type irismod.random.QueryRandomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_QueryRandomRequest(buffer_arg) {
  return irismod_random_query_pb.QueryRandomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_random_QueryRandomRequestQueueRequest(arg) {
  if (!(arg instanceof irismod_random_query_pb.QueryRandomRequestQueueRequest)) {
    throw new Error('Expected argument of type irismod.random.QueryRandomRequestQueueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_QueryRandomRequestQueueRequest(buffer_arg) {
  return irismod_random_query_pb.QueryRandomRequestQueueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_random_QueryRandomRequestQueueResponse(arg) {
  if (!(arg instanceof irismod_random_query_pb.QueryRandomRequestQueueResponse)) {
    throw new Error('Expected argument of type irismod.random.QueryRandomRequestQueueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_QueryRandomRequestQueueResponse(buffer_arg) {
  return irismod_random_query_pb.QueryRandomRequestQueueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_random_QueryRandomResponse(arg) {
  if (!(arg instanceof irismod_random_query_pb.QueryRandomResponse)) {
    throw new Error('Expected argument of type irismod.random.QueryRandomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_random_QueryRandomResponse(buffer_arg) {
  return irismod_random_query_pb.QueryRandomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with guardian as rpc
var QueryService = exports.QueryService = {
  // Random queries the random result
random: {
    path: '/irismod.random.Query/Random',
    requestStream: false,
    responseStream: false,
    requestType: irismod_random_query_pb.QueryRandomRequest,
    responseType: irismod_random_query_pb.QueryRandomResponse,
    requestSerialize: serialize_irismod_random_QueryRandomRequest,
    requestDeserialize: deserialize_irismod_random_QueryRandomRequest,
    responseSerialize: serialize_irismod_random_QueryRandomResponse,
    responseDeserialize: deserialize_irismod_random_QueryRandomResponse,
  },
  // RandomRequestQueue queries the random request queue
randomRequestQueue: {
    path: '/irismod.random.Query/RandomRequestQueue',
    requestStream: false,
    responseStream: false,
    requestType: irismod_random_query_pb.QueryRandomRequestQueueRequest,
    responseType: irismod_random_query_pb.QueryRandomRequestQueueResponse,
    requestSerialize: serialize_irismod_random_QueryRandomRequestQueueRequest,
    requestDeserialize: deserialize_irismod_random_QueryRandomRequestQueueRequest,
    responseSerialize: serialize_irismod_random_QueryRandomRequestQueueResponse,
    responseDeserialize: deserialize_irismod_random_QueryRandomRequestQueueResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
