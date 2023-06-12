// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_pools_pb = require('../../../kyve/query/v1beta1/pools_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_bundles_v1beta1_bundles_pb = require('../../../kyve/bundles/v1beta1/bundles_pb.js');
var kyve_pool_v1beta1_pool_pb = require('../../../kyve/pool/v1beta1/pool_pb.js');

function serialize_kyve_query_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_pools_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryPoolRequest(buffer_arg) {
  return kyve_query_v1beta1_pools_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_pools_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryPoolResponse(buffer_arg) {
  return kyve_query_v1beta1_pools_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_pools_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryPoolsRequest(buffer_arg) {
  return kyve_query_v1beta1_pools_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_pools_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryPoolsResponse(buffer_arg) {
  return kyve_query_v1beta1_pools_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryPool ...
var QueryPoolService = exports.QueryPoolService = {
  // Pools queries for all pools.
pools: {
    path: '/kyve.query.v1beta1.QueryPool/Pools',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_pools_pb.QueryPoolsRequest,
    responseType: kyve_query_v1beta1_pools_pb.QueryPoolsResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryPoolsResponse,
  },
  // Pool queries a pool by its Id.
pool: {
    path: '/kyve.query.v1beta1.QueryPool/Pool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_pools_pb.QueryPoolRequest,
    responseType: kyve_query_v1beta1_pools_pb.QueryPoolResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryPoolResponse,
  },
};

exports.QueryPoolClient = grpc.makeGenericClientConstructor(QueryPoolService);
