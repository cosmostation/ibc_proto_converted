// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_supply_v1_query_pb = require('../../../desmos/supply/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_desmos_supply_v1_QueryCirculatingRequest(arg) {
  if (!(arg instanceof desmos_supply_v1_query_pb.QueryCirculatingRequest)) {
    throw new Error('Expected argument of type desmos.supply.v1.QueryCirculatingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_supply_v1_QueryCirculatingRequest(buffer_arg) {
  return desmos_supply_v1_query_pb.QueryCirculatingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_supply_v1_QueryCirculatingResponse(arg) {
  if (!(arg instanceof desmos_supply_v1_query_pb.QueryCirculatingResponse)) {
    throw new Error('Expected argument of type desmos.supply.v1.QueryCirculatingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_supply_v1_QueryCirculatingResponse(buffer_arg) {
  return desmos_supply_v1_query_pb.QueryCirculatingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_supply_v1_QueryTotalRequest(arg) {
  if (!(arg instanceof desmos_supply_v1_query_pb.QueryTotalRequest)) {
    throw new Error('Expected argument of type desmos.supply.v1.QueryTotalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_supply_v1_QueryTotalRequest(buffer_arg) {
  return desmos_supply_v1_query_pb.QueryTotalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_supply_v1_QueryTotalResponse(arg) {
  if (!(arg instanceof desmos_supply_v1_query_pb.QueryTotalResponse)) {
    throw new Error('Expected argument of type desmos.supply.v1.QueryTotalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_supply_v1_QueryTotalResponse(buffer_arg) {
  return desmos_supply_v1_query_pb.QueryTotalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Total queries the total supply of the given denom
total: {
    path: '/desmos.supply.v1.Query/Total',
    requestStream: false,
    responseStream: false,
    requestType: desmos_supply_v1_query_pb.QueryTotalRequest,
    responseType: desmos_supply_v1_query_pb.QueryTotalResponse,
    requestSerialize: serialize_desmos_supply_v1_QueryTotalRequest,
    requestDeserialize: deserialize_desmos_supply_v1_QueryTotalRequest,
    responseSerialize: serialize_desmos_supply_v1_QueryTotalResponse,
    responseDeserialize: deserialize_desmos_supply_v1_QueryTotalResponse,
  },
  // Circulating queries the amount of tokens circulating in the market of the
// given denom
circulating: {
    path: '/desmos.supply.v1.Query/Circulating',
    requestStream: false,
    responseStream: false,
    requestType: desmos_supply_v1_query_pb.QueryCirculatingRequest,
    responseType: desmos_supply_v1_query_pb.QueryCirculatingResponse,
    requestSerialize: serialize_desmos_supply_v1_QueryCirculatingRequest,
    requestDeserialize: deserialize_desmos_supply_v1_QueryCirculatingRequest,
    responseSerialize: serialize_desmos_supply_v1_QueryCirculatingResponse,
    responseDeserialize: deserialize_desmos_supply_v1_QueryCirculatingResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
