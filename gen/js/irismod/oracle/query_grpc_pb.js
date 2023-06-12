// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_oracle_query_pb = require('../../irismod/oracle/query_pb.js');
var irismod_oracle_oracle_pb = require('../../irismod/oracle/oracle_pb.js');
var irismod_service_service_pb = require('../../irismod/service/service_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_irismod_oracle_QueryFeedRequest(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedRequest)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedRequest(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_QueryFeedResponse(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedResponse)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedResponse(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_QueryFeedValueRequest(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedValueRequest)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedValueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedValueRequest(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedValueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_QueryFeedValueResponse(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedValueResponse)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedValueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedValueResponse(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedValueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_QueryFeedsRequest(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedsRequest)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedsRequest(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_QueryFeedsResponse(arg) {
  if (!(arg instanceof irismod_oracle_query_pb.QueryFeedsResponse)) {
    throw new Error('Expected argument of type irismod.oracle.QueryFeedsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_QueryFeedsResponse(buffer_arg) {
  return irismod_oracle_query_pb.QueryFeedsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with guardian as rpc
var QueryService = exports.QueryService = {
  // Feed queries the feed
feed: {
    path: '/irismod.oracle.Query/Feed',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_query_pb.QueryFeedRequest,
    responseType: irismod_oracle_query_pb.QueryFeedResponse,
    requestSerialize: serialize_irismod_oracle_QueryFeedRequest,
    requestDeserialize: deserialize_irismod_oracle_QueryFeedRequest,
    responseSerialize: serialize_irismod_oracle_QueryFeedResponse,
    responseDeserialize: deserialize_irismod_oracle_QueryFeedResponse,
  },
  // Feeds queries the feed list
feeds: {
    path: '/irismod.oracle.Query/Feeds',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_query_pb.QueryFeedsRequest,
    responseType: irismod_oracle_query_pb.QueryFeedsResponse,
    requestSerialize: serialize_irismod_oracle_QueryFeedsRequest,
    requestDeserialize: deserialize_irismod_oracle_QueryFeedsRequest,
    responseSerialize: serialize_irismod_oracle_QueryFeedsResponse,
    responseDeserialize: deserialize_irismod_oracle_QueryFeedsResponse,
  },
  // FeedValue queries the feed value
feedValue: {
    path: '/irismod.oracle.Query/FeedValue',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_query_pb.QueryFeedValueRequest,
    responseType: irismod_oracle_query_pb.QueryFeedValueResponse,
    requestSerialize: serialize_irismod_oracle_QueryFeedValueRequest,
    requestDeserialize: deserialize_irismod_oracle_QueryFeedValueRequest,
    responseSerialize: serialize_irismod_oracle_QueryFeedValueResponse,
    responseDeserialize: deserialize_irismod_oracle_QueryFeedValueResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
