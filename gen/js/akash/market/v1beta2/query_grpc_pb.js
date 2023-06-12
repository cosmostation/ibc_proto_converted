// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_market_v1beta2_query_pb = require('../../../akash/market/v1beta2/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_market_v1beta2_order_pb = require('../../../akash/market/v1beta2/order_pb.js');
var akash_market_v1beta2_bid_pb = require('../../../akash/market/v1beta2/bid_pb.js');
var akash_market_v1beta2_lease_pb = require('../../../akash/market/v1beta2/lease_pb.js');
var akash_escrow_v1beta2_types_pb = require('../../../akash/escrow/v1beta2/types_pb.js');

function serialize_akash_market_v1beta2_QueryBidRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryBidRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryBidRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryBidResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryBidsRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryBidsRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryBidsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryBidsRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryBidsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryBidsResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryBidsResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryBidsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryBidsResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryBidsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryLeaseRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryLeaseRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryLeaseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryLeaseRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryLeaseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryLeaseResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryLeasesRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryLeasesRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryLeasesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryLeasesRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryLeasesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryLeasesResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryLeasesResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryLeasesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryLeasesResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryLeasesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryOrderRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryOrderRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryOrderRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryOrderResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryOrderResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryOrderResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryOrdersRequest(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryOrdersRequest)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryOrdersRequest(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_QueryOrdersResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_query_pb.QueryOrdersResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.QueryOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_QueryOrdersResponse(buffer_arg) {
  return akash_market_v1beta2_query_pb.QueryOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Orders queries orders with filters
orders: {
    path: '/akash.market.v1beta2.Query/Orders',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryOrdersRequest,
    responseType: akash_market_v1beta2_query_pb.QueryOrdersResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryOrdersRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryOrdersRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryOrdersResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryOrdersResponse,
  },
  // Order queries order details
order: {
    path: '/akash.market.v1beta2.Query/Order',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryOrderRequest,
    responseType: akash_market_v1beta2_query_pb.QueryOrderResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryOrderRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryOrderRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryOrderResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryOrderResponse,
  },
  // Bids queries bids with filters
bids: {
    path: '/akash.market.v1beta2.Query/Bids',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryBidsRequest,
    responseType: akash_market_v1beta2_query_pb.QueryBidsResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryBidsRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryBidsRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryBidsResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryBidsResponse,
  },
  // Bid queries bid details
bid: {
    path: '/akash.market.v1beta2.Query/Bid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryBidRequest,
    responseType: akash_market_v1beta2_query_pb.QueryBidResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryBidRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryBidRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryBidResponse,
  },
  // Leases queries leases with filters
leases: {
    path: '/akash.market.v1beta2.Query/Leases',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryLeasesRequest,
    responseType: akash_market_v1beta2_query_pb.QueryLeasesResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryLeasesRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryLeasesRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryLeasesResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryLeasesResponse,
  },
  // Lease queries lease details
lease: {
    path: '/akash.market.v1beta2.Query/Lease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_query_pb.QueryLeaseRequest,
    responseType: akash_market_v1beta2_query_pb.QueryLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta2_QueryLeaseRequest,
    requestDeserialize: deserialize_akash_market_v1beta2_QueryLeaseRequest,
    responseSerialize: serialize_akash_market_v1beta2_QueryLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_QueryLeaseResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
