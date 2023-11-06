// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.50
'use strict';
var grpc = require('grpc');
var cosmos_protocolpool_v1_query_pb = require('../../../cosmos/protocolpool/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_cosmos_protocolpool_v1_QueryCommunityPoolRequest(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_query_pb.QueryCommunityPoolRequest)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.QueryCommunityPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_QueryCommunityPoolRequest(buffer_arg) {
  return cosmos_protocolpool_v1_query_pb.QueryCommunityPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_protocolpool_v1_QueryCommunityPoolResponse(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_query_pb.QueryCommunityPoolResponse)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.QueryCommunityPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_QueryCommunityPoolResponse(buffer_arg) {
  return cosmos_protocolpool_v1_query_pb.QueryCommunityPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for community pool module.
var QueryService = exports.QueryService = {
  // CommunityPool queries the community pool coins.
communityPool: {
    path: '/cosmos.protocolpool.v1.Query/CommunityPool',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_protocolpool_v1_query_pb.QueryCommunityPoolRequest,
    responseType: cosmos_protocolpool_v1_query_pb.QueryCommunityPoolResponse,
    requestSerialize: serialize_cosmos_protocolpool_v1_QueryCommunityPoolRequest,
    requestDeserialize: deserialize_cosmos_protocolpool_v1_QueryCommunityPoolRequest,
    responseSerialize: serialize_cosmos_protocolpool_v1_QueryCommunityPoolResponse,
    responseDeserialize: deserialize_cosmos_protocolpool_v1_QueryCommunityPoolResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
