// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bitsong_fantoken_v1beta1_query_pb = require('../../../bitsong/fantoken/v1beta1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var bitsong_fantoken_v1beta1_fantoken_pb = require('../../../bitsong/fantoken/v1beta1/fantoken_pb.js');
var bitsong_fantoken_v1beta1_params_pb = require('../../../bitsong/fantoken/v1beta1/params_pb.js');

function serialize_bitsong_fantoken_v1beta1_QueryFanTokenRequest(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryFanTokenRequest)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryFanTokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryFanTokenRequest(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryFanTokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_v1beta1_QueryFanTokenResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryFanTokenResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryFanTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryFanTokenResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryFanTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_v1beta1_QueryFanTokensRequest(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryFanTokensRequest)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryFanTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryFanTokensRequest(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryFanTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_v1beta1_QueryFanTokensResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryFanTokensResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryFanTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryFanTokensResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryFanTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryParamsRequest(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_v1beta1_QueryParamsResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with fantoken as RPC
var QueryService = exports.QueryService = {
  // FanToken returns fantoken with fantoken name
fanToken: {
    path: '/bitsong.fantoken.v1beta1.Query/FanToken',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_query_pb.QueryFanTokenRequest,
    responseType: bitsong_fantoken_v1beta1_query_pb.QueryFanTokenResponse,
    requestSerialize: serialize_bitsong_fantoken_v1beta1_QueryFanTokenRequest,
    requestDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryFanTokenRequest,
    responseSerialize: serialize_bitsong_fantoken_v1beta1_QueryFanTokenResponse,
    responseDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryFanTokenResponse,
  },
  // FanTokens returns the fantoken list
fanTokens: {
    path: '/bitsong.fantoken.v1beta1.Query/FanTokens',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_query_pb.QueryFanTokensRequest,
    responseType: bitsong_fantoken_v1beta1_query_pb.QueryFanTokensResponse,
    requestSerialize: serialize_bitsong_fantoken_v1beta1_QueryFanTokensRequest,
    requestDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryFanTokensRequest,
    responseSerialize: serialize_bitsong_fantoken_v1beta1_QueryFanTokensResponse,
    responseDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryFanTokensResponse,
  },
  // Params queries the fantoken parameters
params: {
    path: '/bitsong.fantoken.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_query_pb.QueryParamsRequest,
    responseType: bitsong_fantoken_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_bitsong_fantoken_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_bitsong_fantoken_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_bitsong_fantoken_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
