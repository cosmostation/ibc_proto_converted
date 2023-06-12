// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_bandoracle_v1beta1_query_pb = require('../../../comdex/bandoracle/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_bandoracle_v1beta1_fetch_price_pb = require('../../../comdex/bandoracle/v1beta1/fetch_price_pb.js');
var comdex_bandoracle_v1beta1_params_pb = require('../../../comdex/bandoracle/v1beta1/params_pb.js');
var comdex_bandoracle_v1beta1_tx_pb = require('../../../comdex/bandoracle/v1beta1/tx_pb.js');

function serialize_comdex_bandoracle_v1beta1_QueryDiscardDataRequest(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataRequest)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryDiscardDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryDiscardDataRequest(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryDiscardDataResponse(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataResponse)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryDiscardDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryDiscardDataResponse(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataRequest(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataRequest)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryFetchPriceDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataRequest(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataResponse)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryFetchPriceRequest(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceRequest)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryFetchPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceRequest(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryFetchPriceResponse(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceResponse)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryFetchPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceResponse(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdRequest(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdRequest)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryLastFetchPriceIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdRequest(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdResponse(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdResponse)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryLastFetchPriceIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdResponse(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_bandoracle_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_bandoracle_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.bandoracle.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_bandoracle_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_bandoracle_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/comdex.bandoracle.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_bandoracle_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_bandoracle_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_bandoracle_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_bandoracle_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryParamsResponse,
  },
  fetchPriceResult: {
    path: '/comdex.bandoracle.v1beta1.Query/FetchPriceResult',
    requestStream: false,
    responseStream: false,
    requestType: comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceRequest,
    responseType: comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceResponse,
    requestSerialize: serialize_comdex_bandoracle_v1beta1_QueryFetchPriceRequest,
    requestDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceRequest,
    responseSerialize: serialize_comdex_bandoracle_v1beta1_QueryFetchPriceResponse,
    responseDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceResponse,
  },
  lastFetchPriceID: {
    path: '/comdex.bandoracle.v1beta1.Query/LastFetchPriceID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdRequest,
    responseType: comdex_bandoracle_v1beta1_query_pb.QueryLastFetchPriceIdResponse,
    requestSerialize: serialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdRequest,
    requestDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdRequest,
    responseSerialize: serialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdResponse,
    responseDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryLastFetchPriceIdResponse,
  },
  fetchPriceData: {
    path: '/comdex.bandoracle.v1beta1.Query/FetchPriceData',
    requestStream: false,
    responseStream: false,
    requestType: comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataRequest,
    responseType: comdex_bandoracle_v1beta1_query_pb.QueryFetchPriceDataResponse,
    requestSerialize: serialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataRequest,
    requestDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataRequest,
    responseSerialize: serialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse,
    responseDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryFetchPriceDataResponse,
  },
  discardData: {
    path: '/comdex.bandoracle.v1beta1.Query/DiscardData',
    requestStream: false,
    responseStream: false,
    requestType: comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataRequest,
    responseType: comdex_bandoracle_v1beta1_query_pb.QueryDiscardDataResponse,
    requestSerialize: serialize_comdex_bandoracle_v1beta1_QueryDiscardDataRequest,
    requestDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryDiscardDataRequest,
    responseSerialize: serialize_comdex_bandoracle_v1beta1_QueryDiscardDataResponse,
    responseDeserialize: deserialize_comdex_bandoracle_v1beta1_QueryDiscardDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
