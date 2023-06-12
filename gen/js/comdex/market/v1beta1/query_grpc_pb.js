// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_market_v1beta1_query_pb = require('../../../comdex/market/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_market_v1beta1_market_pb = require('../../../comdex/market/v1beta1/market_pb.js');

function serialize_comdex_market_v1beta1_QueryMarketRequest(arg) {
  if (!(arg instanceof comdex_market_v1beta1_query_pb.QueryMarketRequest)) {
    throw new Error('Expected argument of type comdex.market.v1beta1.QueryMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_market_v1beta1_QueryMarketRequest(buffer_arg) {
  return comdex_market_v1beta1_query_pb.QueryMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_market_v1beta1_QueryMarketResponse(arg) {
  if (!(arg instanceof comdex_market_v1beta1_query_pb.QueryMarketResponse)) {
    throw new Error('Expected argument of type comdex.market.v1beta1.QueryMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_market_v1beta1_QueryMarketResponse(buffer_arg) {
  return comdex_market_v1beta1_query_pb.QueryMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_market_v1beta1_QueryMarketsRequest(arg) {
  if (!(arg instanceof comdex_market_v1beta1_query_pb.QueryMarketsRequest)) {
    throw new Error('Expected argument of type comdex.market.v1beta1.QueryMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_market_v1beta1_QueryMarketsRequest(buffer_arg) {
  return comdex_market_v1beta1_query_pb.QueryMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_market_v1beta1_QueryMarketsResponse(arg) {
  if (!(arg instanceof comdex_market_v1beta1_query_pb.QueryMarketsResponse)) {
    throw new Error('Expected argument of type comdex.market.v1beta1.QueryMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_market_v1beta1_QueryMarketsResponse(buffer_arg) {
  return comdex_market_v1beta1_query_pb.QueryMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryMarkets: {
    path: '/comdex.market.v1beta1.Query/QueryMarkets',
    requestStream: false,
    responseStream: false,
    requestType: comdex_market_v1beta1_query_pb.QueryMarketsRequest,
    responseType: comdex_market_v1beta1_query_pb.QueryMarketsResponse,
    requestSerialize: serialize_comdex_market_v1beta1_QueryMarketsRequest,
    requestDeserialize: deserialize_comdex_market_v1beta1_QueryMarketsRequest,
    responseSerialize: serialize_comdex_market_v1beta1_QueryMarketsResponse,
    responseDeserialize: deserialize_comdex_market_v1beta1_QueryMarketsResponse,
  },
  queryMarket: {
    path: '/comdex.market.v1beta1.Query/QueryMarket',
    requestStream: false,
    responseStream: false,
    requestType: comdex_market_v1beta1_query_pb.QueryMarketRequest,
    responseType: comdex_market_v1beta1_query_pb.QueryMarketResponse,
    requestSerialize: serialize_comdex_market_v1beta1_QueryMarketRequest,
    requestDeserialize: deserialize_comdex_market_v1beta1_QueryMarketRequest,
    responseSerialize: serialize_comdex_market_v1beta1_QueryMarketResponse,
    responseDeserialize: deserialize_comdex_market_v1beta1_QueryMarketResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
