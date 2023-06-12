// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_auction_v1beta1_query_pb = require('../../../injective/auction/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_auction_v1beta1_auction_pb = require('../../../injective/auction/v1beta1/auction_pb.js');
var injective_auction_v1beta1_genesis_pb = require('../../../injective/auction/v1beta1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_injective_auction_v1beta1_QueryAuctionParamsRequest(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryAuctionParamsRequest)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryAuctionParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryAuctionParamsRequest(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryAuctionParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_QueryAuctionParamsResponse(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryAuctionParamsResponse)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryAuctionParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryAuctionParamsResponse(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryAuctionParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_QueryCurrentAuctionBasketRequest(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketRequest)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryCurrentAuctionBasketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryCurrentAuctionBasketRequest(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_QueryCurrentAuctionBasketResponse(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketResponse)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryCurrentAuctionBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryCurrentAuctionBasketResponse(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_auction_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_auction_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.auction.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_auction_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_auction_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Retrieves auction params
auctionParams: {
    path: '/injective.auction.v1beta1.Query/AuctionParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_auction_v1beta1_query_pb.QueryAuctionParamsRequest,
    responseType: injective_auction_v1beta1_query_pb.QueryAuctionParamsResponse,
    requestSerialize: serialize_injective_auction_v1beta1_QueryAuctionParamsRequest,
    requestDeserialize: deserialize_injective_auction_v1beta1_QueryAuctionParamsRequest,
    responseSerialize: serialize_injective_auction_v1beta1_QueryAuctionParamsResponse,
    responseDeserialize: deserialize_injective_auction_v1beta1_QueryAuctionParamsResponse,
  },
  // Retrieves current auction basket with current highest bid and bidder
currentAuctionBasket: {
    path: '/injective.auction.v1beta1.Query/CurrentAuctionBasket',
    requestStream: false,
    responseStream: false,
    requestType: injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketRequest,
    responseType: injective_auction_v1beta1_query_pb.QueryCurrentAuctionBasketResponse,
    requestSerialize: serialize_injective_auction_v1beta1_QueryCurrentAuctionBasketRequest,
    requestDeserialize: deserialize_injective_auction_v1beta1_QueryCurrentAuctionBasketRequest,
    responseSerialize: serialize_injective_auction_v1beta1_QueryCurrentAuctionBasketResponse,
    responseDeserialize: deserialize_injective_auction_v1beta1_QueryCurrentAuctionBasketResponse,
  },
  // Retrieves the entire auction module's state
auctionModuleState: {
    path: '/injective.auction.v1beta1.Query/AuctionModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_auction_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_auction_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_auction_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_auction_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_auction_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_auction_v1beta1_QueryModuleStateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
