// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_auction_v1beta1_query_pb = require('../../../kava/auction/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var kava_auction_v1beta1_genesis_pb = require('../../../kava/auction/v1beta1/genesis_pb.js');

function serialize_kava_auction_v1beta1_QueryAuctionRequest(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryAuctionRequest)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryAuctionRequest(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryAuctionResponse(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryAuctionResponse)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryAuctionResponse(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryAuctionsRequest(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryAuctionsRequest)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryAuctionsRequest(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryAuctionsResponse(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryAuctionsResponse)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryAuctionsResponse(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryNextAuctionIDRequest(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryNextAuctionIDRequest)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryNextAuctionIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryNextAuctionIDRequest(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryNextAuctionIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryNextAuctionIDResponse(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryNextAuctionIDResponse)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryNextAuctionIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryNextAuctionIDResponse(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryNextAuctionIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_auction_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_auction_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.auction.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_auction_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_auction_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for auction module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the auction module.
params: {
    path: '/kava.auction.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_auction_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_auction_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_auction_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_auction_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_auction_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_auction_v1beta1_QueryParamsResponse,
  },
  // Auction queries an individual Auction by auction ID
auction: {
    path: '/kava.auction.v1beta1.Query/Auction',
    requestStream: false,
    responseStream: false,
    requestType: kava_auction_v1beta1_query_pb.QueryAuctionRequest,
    responseType: kava_auction_v1beta1_query_pb.QueryAuctionResponse,
    requestSerialize: serialize_kava_auction_v1beta1_QueryAuctionRequest,
    requestDeserialize: deserialize_kava_auction_v1beta1_QueryAuctionRequest,
    responseSerialize: serialize_kava_auction_v1beta1_QueryAuctionResponse,
    responseDeserialize: deserialize_kava_auction_v1beta1_QueryAuctionResponse,
  },
  // Auctions queries auctions filtered by asset denom, owner address, phase, and auction type
auctions: {
    path: '/kava.auction.v1beta1.Query/Auctions',
    requestStream: false,
    responseStream: false,
    requestType: kava_auction_v1beta1_query_pb.QueryAuctionsRequest,
    responseType: kava_auction_v1beta1_query_pb.QueryAuctionsResponse,
    requestSerialize: serialize_kava_auction_v1beta1_QueryAuctionsRequest,
    requestDeserialize: deserialize_kava_auction_v1beta1_QueryAuctionsRequest,
    responseSerialize: serialize_kava_auction_v1beta1_QueryAuctionsResponse,
    responseDeserialize: deserialize_kava_auction_v1beta1_QueryAuctionsResponse,
  },
  // NextAuctionID queries the next auction ID
nextAuctionID: {
    path: '/kava.auction.v1beta1.Query/NextAuctionID',
    requestStream: false,
    responseStream: false,
    requestType: kava_auction_v1beta1_query_pb.QueryNextAuctionIDRequest,
    responseType: kava_auction_v1beta1_query_pb.QueryNextAuctionIDResponse,
    requestSerialize: serialize_kava_auction_v1beta1_QueryNextAuctionIDRequest,
    requestDeserialize: deserialize_kava_auction_v1beta1_QueryNextAuctionIDRequest,
    responseSerialize: serialize_kava_auction_v1beta1_QueryNextAuctionIDResponse,
    responseDeserialize: deserialize_kava_auction_v1beta1_QueryNextAuctionIDResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
