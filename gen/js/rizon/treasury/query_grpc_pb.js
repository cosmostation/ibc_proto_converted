// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var rizon_treasury_query_pb = require('../../rizon/treasury/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var rizon_treasury_treasury_pb = require('../../rizon/treasury/treasury_pb.js');
var rizon_treasury_params_pb = require('../../rizon/treasury/params_pb.js');

function serialize_rizonworld_rizon_treasury_QueryCurrenciesRequest(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryCurrenciesRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryCurrenciesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryCurrenciesRequest(buffer_arg) {
  return rizon_treasury_query_pb.QueryCurrenciesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryCurrenciesResponse(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryCurrenciesResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryCurrenciesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryCurrenciesResponse(buffer_arg) {
  return rizon_treasury_query_pb.QueryCurrenciesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryCurrencyRequest(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryCurrencyRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryCurrencyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryCurrencyRequest(buffer_arg) {
  return rizon_treasury_query_pb.QueryCurrencyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryCurrencyResponse(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryCurrencyResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryCurrencyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryCurrencyResponse(buffer_arg) {
  return rizon_treasury_query_pb.QueryCurrencyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryMaxRequest(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryMaxRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryMaxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryMaxRequest(buffer_arg) {
  return rizon_treasury_query_pb.QueryMaxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryMaxResponse(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryMaxResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryMaxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryMaxResponse(buffer_arg) {
  return rizon_treasury_query_pb.QueryMaxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryParamsRequest(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryParamsRequest(buffer_arg) {
  return rizon_treasury_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_rizonworld_rizon_treasury_QueryParamsResponse(arg) {
  if (!(arg instanceof rizon_treasury_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type rizonworld.rizon.treasury.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_rizonworld_rizon_treasury_QueryParamsResponse(buffer_arg) {
  return rizon_treasury_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Currencies queries all supported currency denom list
currencies: {
    path: '/rizonworld.rizon.treasury.Query/Currencies',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_query_pb.QueryCurrenciesRequest,
    responseType: rizon_treasury_query_pb.QueryCurrenciesResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_QueryCurrenciesRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_QueryCurrenciesRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_QueryCurrenciesResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_QueryCurrenciesResponse,
  },
  // Currency queries a currency info
currency: {
    path: '/rizonworld.rizon.treasury.Query/Currency',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_query_pb.QueryCurrencyRequest,
    responseType: rizon_treasury_query_pb.QueryCurrencyResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_QueryCurrencyRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_QueryCurrencyRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_QueryCurrencyResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_QueryCurrencyResponse,
  },
  // MaxAtoloSupply queries maximum mintable amount of uatolo
maxAtoloSupply: {
    path: '/rizonworld.rizon.treasury.Query/MaxAtoloSupply',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_query_pb.QueryMaxRequest,
    responseType: rizon_treasury_query_pb.QueryMaxResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_QueryMaxRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_QueryMaxRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_QueryMaxResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_QueryMaxResponse,
  },
  // Params queries parameters of treasury
params: {
    path: '/rizonworld.rizon.treasury.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: rizon_treasury_query_pb.QueryParamsRequest,
    responseType: rizon_treasury_query_pb.QueryParamsResponse,
    requestSerialize: serialize_rizonworld_rizon_treasury_QueryParamsRequest,
    requestDeserialize: deserialize_rizonworld_rizon_treasury_QueryParamsRequest,
    responseSerialize: serialize_rizonworld_rizon_treasury_QueryParamsResponse,
    responseDeserialize: deserialize_rizonworld_rizon_treasury_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
