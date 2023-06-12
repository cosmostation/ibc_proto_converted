// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_auction_v1_query_pb = require('../../../sommelier/auction/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sommelier_auction_v1_genesis_pb = require('../../../sommelier/auction/v1/genesis_pb.js');
var sommelier_auction_v1_auction_pb = require('../../../sommelier/auction/v1/auction_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_auction_v1_QueryActiveAuctionRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryActiveAuctionRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryActiveAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryActiveAuctionRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryActiveAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryActiveAuctionResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryActiveAuctionResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryActiveAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryActiveAuctionResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryActiveAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryActiveAuctionsRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryActiveAuctionsRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryActiveAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryActiveAuctionsRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryActiveAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryActiveAuctionsResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryActiveAuctionsResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryActiveAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryActiveAuctionsResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryActiveAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryBidRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryBidRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryBidRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryBidResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryBidResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryBidResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryBidsByAuctionRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryBidsByAuctionRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryBidsByAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryBidsByAuctionRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryBidsByAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryBidsByAuctionResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryBidsByAuctionResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryBidsByAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryBidsByAuctionResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryBidsByAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryEndedAuctionRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryEndedAuctionRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryEndedAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryEndedAuctionRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryEndedAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryEndedAuctionResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryEndedAuctionResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryEndedAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryEndedAuctionResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryEndedAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryEndedAuctionsRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryEndedAuctionsRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryEndedAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryEndedAuctionsRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryEndedAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryEndedAuctionsResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryEndedAuctionsResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryEndedAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryEndedAuctionsResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryEndedAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type auction.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryParamsRequest(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_auction_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_auction_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type auction.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_auction_v1_QueryParamsResponse(buffer_arg) {
  return sommelier_auction_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryParams: {
    path: '/auction.v1.Query/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryParamsRequest,
    responseType: sommelier_auction_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_auction_v1_QueryParamsRequest,
    requestDeserialize: deserialize_auction_v1_QueryParamsRequest,
    responseSerialize: serialize_auction_v1_QueryParamsResponse,
    responseDeserialize: deserialize_auction_v1_QueryParamsResponse,
  },
  queryActiveAuction: {
    path: '/auction.v1.Query/QueryActiveAuction',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryActiveAuctionRequest,
    responseType: sommelier_auction_v1_query_pb.QueryActiveAuctionResponse,
    requestSerialize: serialize_auction_v1_QueryActiveAuctionRequest,
    requestDeserialize: deserialize_auction_v1_QueryActiveAuctionRequest,
    responseSerialize: serialize_auction_v1_QueryActiveAuctionResponse,
    responseDeserialize: deserialize_auction_v1_QueryActiveAuctionResponse,
  },
  queryEndedAuction: {
    path: '/auction.v1.Query/QueryEndedAuction',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryEndedAuctionRequest,
    responseType: sommelier_auction_v1_query_pb.QueryEndedAuctionResponse,
    requestSerialize: serialize_auction_v1_QueryEndedAuctionRequest,
    requestDeserialize: deserialize_auction_v1_QueryEndedAuctionRequest,
    responseSerialize: serialize_auction_v1_QueryEndedAuctionResponse,
    responseDeserialize: deserialize_auction_v1_QueryEndedAuctionResponse,
  },
  queryActiveAuctions: {
    path: '/auction.v1.Query/QueryActiveAuctions',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryActiveAuctionsRequest,
    responseType: sommelier_auction_v1_query_pb.QueryActiveAuctionsResponse,
    requestSerialize: serialize_auction_v1_QueryActiveAuctionsRequest,
    requestDeserialize: deserialize_auction_v1_QueryActiveAuctionsRequest,
    responseSerialize: serialize_auction_v1_QueryActiveAuctionsResponse,
    responseDeserialize: deserialize_auction_v1_QueryActiveAuctionsResponse,
  },
  queryEndedAuctions: {
    path: '/auction.v1.Query/QueryEndedAuctions',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryEndedAuctionsRequest,
    responseType: sommelier_auction_v1_query_pb.QueryEndedAuctionsResponse,
    requestSerialize: serialize_auction_v1_QueryEndedAuctionsRequest,
    requestDeserialize: deserialize_auction_v1_QueryEndedAuctionsRequest,
    responseSerialize: serialize_auction_v1_QueryEndedAuctionsResponse,
    responseDeserialize: deserialize_auction_v1_QueryEndedAuctionsResponse,
  },
  queryBid: {
    path: '/auction.v1.Query/QueryBid',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryBidRequest,
    responseType: sommelier_auction_v1_query_pb.QueryBidResponse,
    requestSerialize: serialize_auction_v1_QueryBidRequest,
    requestDeserialize: deserialize_auction_v1_QueryBidRequest,
    responseSerialize: serialize_auction_v1_QueryBidResponse,
    responseDeserialize: deserialize_auction_v1_QueryBidResponse,
  },
  queryBidsByAuction: {
    path: '/auction.v1.Query/QueryBidsByAuction',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_auction_v1_query_pb.QueryBidsByAuctionRequest,
    responseType: sommelier_auction_v1_query_pb.QueryBidsByAuctionResponse,
    requestSerialize: serialize_auction_v1_QueryBidsByAuctionRequest,
    requestDeserialize: deserialize_auction_v1_QueryBidsByAuctionRequest,
    responseSerialize: serialize_auction_v1_QueryBidsByAuctionResponse,
    responseDeserialize: deserialize_auction_v1_QueryBidsByAuctionResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
