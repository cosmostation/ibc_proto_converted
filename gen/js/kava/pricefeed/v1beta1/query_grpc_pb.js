// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_pricefeed_v1beta1_query_pb = require('../../../kava/pricefeed/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var kava_pricefeed_v1beta1_store_pb = require('../../../kava/pricefeed/v1beta1/store_pb.js');

function serialize_kava_pricefeed_v1beta1_QueryMarketsRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryMarketsRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryMarketsRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryMarketsResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryMarketsResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryMarketsResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryOraclesRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryOraclesRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryOraclesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryOraclesRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryOraclesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryOraclesResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryOraclesResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryOraclesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryOraclesResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryOraclesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryPriceRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryPriceRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryPriceRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryPriceResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryPriceResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryPriceResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryPricesRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryPricesRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryPricesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryPricesRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryPricesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryPricesResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryPricesResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryPricesResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryRawPricesRequest(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryRawPricesRequest)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryRawPricesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryRawPricesRequest(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryRawPricesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_QueryRawPricesResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_query_pb.QueryRawPricesResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.QueryRawPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_QueryRawPricesResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_query_pb.QueryRawPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for pricefeed module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the pricefeed module.
params: {
    path: '/kava.pricefeed.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryParamsResponse,
  },
  // Price queries price details based on a market
price: {
    path: '/kava.pricefeed.v1beta1.Query/Price',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryPriceRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryPriceResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryPriceRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryPriceRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryPriceResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryPriceResponse,
  },
  // Prices queries all prices
prices: {
    path: '/kava.pricefeed.v1beta1.Query/Prices',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryPricesRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryPricesResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryPricesRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryPricesRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryPricesResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryPricesResponse,
  },
  // RawPrices queries all raw prices based on a market
rawPrices: {
    path: '/kava.pricefeed.v1beta1.Query/RawPrices',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryRawPricesRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryRawPricesResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryRawPricesRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryRawPricesRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryRawPricesResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryRawPricesResponse,
  },
  // Oracles queries all oracles based on a market
oracles: {
    path: '/kava.pricefeed.v1beta1.Query/Oracles',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryOraclesRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryOraclesResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryOraclesRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryOraclesRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryOraclesResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryOraclesResponse,
  },
  // Markets queries all markets
markets: {
    path: '/kava.pricefeed.v1beta1.Query/Markets',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_query_pb.QueryMarketsRequest,
    responseType: kava_pricefeed_v1beta1_query_pb.QueryMarketsResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_QueryMarketsRequest,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_QueryMarketsRequest,
    responseSerialize: serialize_kava_pricefeed_v1beta1_QueryMarketsResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_QueryMarketsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
