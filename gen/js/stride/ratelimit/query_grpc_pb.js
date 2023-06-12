// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_ratelimit_query_pb = require('../../stride/ratelimit/query_pb.js');
var stride_ratelimit_ratelimit_pb = require('../../stride/ratelimit/ratelimit_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_stride_ratelimit_QueryAllRateLimitsRequest(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryAllRateLimitsRequest)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryAllRateLimitsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryAllRateLimitsRequest(buffer_arg) {
  return stride_ratelimit_query_pb.QueryAllRateLimitsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryAllRateLimitsResponse(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryAllRateLimitsResponse)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryAllRateLimitsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryAllRateLimitsResponse(buffer_arg) {
  return stride_ratelimit_query_pb.QueryAllRateLimitsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitRequest(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitRequest)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitRequest(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitResponse(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitResponse)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitResponse(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitsByChainIdRequest(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitsByChainIdRequest)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitsByChainIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitsByChainIdRequest(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitsByChainIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitsByChainIdResponse(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitsByChainIdResponse)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitsByChainIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitsByChainIdResponse(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitsByChainIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitsByChannelIdRequest(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitsByChannelIdRequest)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitsByChannelIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitsByChannelIdRequest(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitsByChannelIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_ratelimit_QueryRateLimitsByChannelIdResponse(arg) {
  if (!(arg instanceof stride_ratelimit_query_pb.QueryRateLimitsByChannelIdResponse)) {
    throw new Error('Expected argument of type stride.ratelimit.QueryRateLimitsByChannelIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_ratelimit_QueryRateLimitsByChannelIdResponse(buffer_arg) {
  return stride_ratelimit_query_pb.QueryRateLimitsByChannelIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  allRateLimits: {
    path: '/stride.ratelimit.Query/AllRateLimits',
    requestStream: false,
    responseStream: false,
    requestType: stride_ratelimit_query_pb.QueryAllRateLimitsRequest,
    responseType: stride_ratelimit_query_pb.QueryAllRateLimitsResponse,
    requestSerialize: serialize_stride_ratelimit_QueryAllRateLimitsRequest,
    requestDeserialize: deserialize_stride_ratelimit_QueryAllRateLimitsRequest,
    responseSerialize: serialize_stride_ratelimit_QueryAllRateLimitsResponse,
    responseDeserialize: deserialize_stride_ratelimit_QueryAllRateLimitsResponse,
  },
  rateLimit: {
    path: '/stride.ratelimit.Query/RateLimit',
    requestStream: false,
    responseStream: false,
    requestType: stride_ratelimit_query_pb.QueryRateLimitRequest,
    responseType: stride_ratelimit_query_pb.QueryRateLimitResponse,
    requestSerialize: serialize_stride_ratelimit_QueryRateLimitRequest,
    requestDeserialize: deserialize_stride_ratelimit_QueryRateLimitRequest,
    responseSerialize: serialize_stride_ratelimit_QueryRateLimitResponse,
    responseDeserialize: deserialize_stride_ratelimit_QueryRateLimitResponse,
  },
  rateLimitsByChainId: {
    path: '/stride.ratelimit.Query/RateLimitsByChainId',
    requestStream: false,
    responseStream: false,
    requestType: stride_ratelimit_query_pb.QueryRateLimitsByChainIdRequest,
    responseType: stride_ratelimit_query_pb.QueryRateLimitsByChainIdResponse,
    requestSerialize: serialize_stride_ratelimit_QueryRateLimitsByChainIdRequest,
    requestDeserialize: deserialize_stride_ratelimit_QueryRateLimitsByChainIdRequest,
    responseSerialize: serialize_stride_ratelimit_QueryRateLimitsByChainIdResponse,
    responseDeserialize: deserialize_stride_ratelimit_QueryRateLimitsByChainIdResponse,
  },
  rateLimitsByChannelId: {
    path: '/stride.ratelimit.Query/RateLimitsByChannelId',
    requestStream: false,
    responseStream: false,
    requestType: stride_ratelimit_query_pb.QueryRateLimitsByChannelIdRequest,
    responseType: stride_ratelimit_query_pb.QueryRateLimitsByChannelIdResponse,
    requestSerialize: serialize_stride_ratelimit_QueryRateLimitsByChannelIdRequest,
    requestDeserialize: deserialize_stride_ratelimit_QueryRateLimitsByChannelIdRequest,
    responseSerialize: serialize_stride_ratelimit_QueryRateLimitsByChannelIdResponse,
    responseDeserialize: deserialize_stride_ratelimit_QueryRateLimitsByChannelIdResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
