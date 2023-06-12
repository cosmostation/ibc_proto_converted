// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_market_v1beta3_query_pb = require('../../../akash/market/v1beta3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_market_v1beta3_order_pb = require('../../../akash/market/v1beta3/order_pb.js');
var akash_market_v1beta3_bid_pb = require('../../../akash/market/v1beta3/bid_pb.js');
var akash_market_v1beta3_lease_pb = require('../../../akash/market/v1beta3/lease_pb.js');
var akash_escrow_v1beta3_types_pb = require('../../../akash/escrow/v1beta3/types_pb.js');

function serialize_akash_market_v1beta3_QueryBidRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryBidRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryBidRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryBidResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryBidsRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryBidsRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryBidsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryBidsRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryBidsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryBidsResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryBidsResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryBidsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryBidsResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryBidsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryLeaseRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryLeaseRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryLeaseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryLeaseRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryLeaseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryLeaseResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryLeasesRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryLeasesRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryLeasesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryLeasesRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryLeasesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryLeasesResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryLeasesResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryLeasesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryLeasesResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryLeasesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryOrderRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryOrderRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryOrderRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryOrderResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryOrderResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryOrderResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryOrdersRequest(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryOrdersRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryOrdersRequest(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_QueryOrdersResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_query_pb.QueryOrdersResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.QueryOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_QueryOrdersResponse(buffer_arg) {
  return akash_market_v1beta3_query_pb.QueryOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Orders queries orders with filters
orders: {
    path: '/akash.market.v1beta3.Query/Orders',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryOrdersRequest,
    responseType: akash_market_v1beta3_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryOrdersRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryOrdersRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryOrdersResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryOrdersResponse,
  },
  // Order queries order details
order: {
    path: '/akash.market.v1beta3.Query/Order',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryOrderRequest,
    responseType: akash_market_v1beta3_query_pb.QueryOrderResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryOrderRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryOrderRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryOrderResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryOrderResponse,
  },
  // Bids queries bids with filters
bids: {
    path: '/akash.market.v1beta3.Query/Bids',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryBidsRequest,
    responseType: akash_market_v1beta3_query_pb.QueryBidsResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryBidsRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryBidsRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryBidsResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryBidsResponse,
  },
  // Bid queries bid details
bid: {
    path: '/akash.market.v1beta3.Query/Bid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryBidRequest,
    responseType: akash_market_v1beta3_query_pb.QueryBidResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryBidRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryBidRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryBidResponse,
  },
  // Leases queries leases with filters
leases: {
    path: '/akash.market.v1beta3.Query/Leases',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryLeasesRequest,
    responseType: akash_market_v1beta3_query_pb.QueryLeasesResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryLeasesRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryLeasesRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryLeasesResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryLeasesResponse,
  },
  // Lease queries lease details
lease: {
    path: '/akash.market.v1beta3.Query/Lease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_query_pb.QueryLeaseRequest,
    responseType: akash_market_v1beta3_query_pb.QueryLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta3_QueryLeaseRequest,
    requestDeserialize: deserialize_akash_market_v1beta3_QueryLeaseRequest,
    responseSerialize: serialize_akash_market_v1beta3_QueryLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_QueryLeaseResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
