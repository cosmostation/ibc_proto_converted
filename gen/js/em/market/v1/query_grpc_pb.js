// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_market_v1_query_pb = require('../../../em/market/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var em_market_v1_market_pb = require('../../../em/market/v1/market_pb.js');

function serialize_em_market_v1_QueryByAccountRequest(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryByAccountRequest)) {
    throw new Error('Expected argument of type em.market.v1.QueryByAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryByAccountRequest(buffer_arg) {
  return em_market_v1_query_pb.QueryByAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_QueryByAccountResponse(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryByAccountResponse)) {
    throw new Error('Expected argument of type em.market.v1.QueryByAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryByAccountResponse(buffer_arg) {
  return em_market_v1_query_pb.QueryByAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_QueryInstrumentRequest(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryInstrumentRequest)) {
    throw new Error('Expected argument of type em.market.v1.QueryInstrumentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryInstrumentRequest(buffer_arg) {
  return em_market_v1_query_pb.QueryInstrumentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_QueryInstrumentResponse(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryInstrumentResponse)) {
    throw new Error('Expected argument of type em.market.v1.QueryInstrumentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryInstrumentResponse(buffer_arg) {
  return em_market_v1_query_pb.QueryInstrumentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_QueryInstrumentsRequest(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryInstrumentsRequest)) {
    throw new Error('Expected argument of type em.market.v1.QueryInstrumentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryInstrumentsRequest(buffer_arg) {
  return em_market_v1_query_pb.QueryInstrumentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_market_v1_QueryInstrumentsResponse(arg) {
  if (!(arg instanceof em_market_v1_query_pb.QueryInstrumentsResponse)) {
    throw new Error('Expected argument of type em.market.v1.QueryInstrumentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_market_v1_QueryInstrumentsResponse(buffer_arg) {
  return em_market_v1_query_pb.QueryInstrumentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  byAccount: {
    path: '/em.market.v1.Query/ByAccount',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_query_pb.QueryByAccountRequest,
    responseType: em_market_v1_query_pb.QueryByAccountResponse,
    requestSerialize: serialize_em_market_v1_QueryByAccountRequest,
    requestDeserialize: deserialize_em_market_v1_QueryByAccountRequest,
    responseSerialize: serialize_em_market_v1_QueryByAccountResponse,
    responseDeserialize: deserialize_em_market_v1_QueryByAccountResponse,
  },
  instruments: {
    path: '/em.market.v1.Query/Instruments',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_query_pb.QueryInstrumentsRequest,
    responseType: em_market_v1_query_pb.QueryInstrumentsResponse,
    requestSerialize: serialize_em_market_v1_QueryInstrumentsRequest,
    requestDeserialize: deserialize_em_market_v1_QueryInstrumentsRequest,
    responseSerialize: serialize_em_market_v1_QueryInstrumentsResponse,
    responseDeserialize: deserialize_em_market_v1_QueryInstrumentsResponse,
  },
  instrument: {
    path: '/em.market.v1.Query/Instrument',
    requestStream: false,
    responseStream: false,
    requestType: em_market_v1_query_pb.QueryInstrumentRequest,
    responseType: em_market_v1_query_pb.QueryInstrumentResponse,
    requestSerialize: serialize_em_market_v1_QueryInstrumentRequest,
    requestDeserialize: deserialize_em_market_v1_QueryInstrumentRequest,
    responseSerialize: serialize_em_market_v1_QueryInstrumentResponse,
    responseDeserialize: deserialize_em_market_v1_QueryInstrumentResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
