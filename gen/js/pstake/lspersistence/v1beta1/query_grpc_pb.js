// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var pstake_lspersistence_v1beta1_query_pb = require('../../../pstake/lspersistence/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var pstake_lspersistence_v1beta1_liquidstaking_pb = require('../../../pstake/lspersistence/v1beta1/liquidstaking_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsRequest(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsRequest)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryLiquidValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsRequest(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsResponse(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsResponse)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryLiquidValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsResponse(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lspersistence_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryParamsRequest(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lspersistence_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryParamsResponse(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lspersistence_v1beta1_QueryStatesRequest(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryStatesRequest)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryStatesRequest(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lspersistence_v1beta1_QueryStatesResponse(arg) {
  if (!(arg instanceof pstake_lspersistence_v1beta1_query_pb.QueryStatesResponse)) {
    throw new Error('Expected argument of type pstake.lspersistence.v1beta1.QueryStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lspersistence_v1beta1_QueryStatesResponse(buffer_arg) {
  return pstake_lspersistence_v1beta1_query_pb.QueryStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the liquidstaking module.
var QueryService = exports.QueryService = {
  // Params returns parameters of the liquidstaking module.
params: {
    path: '/pstake.lspersistence.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lspersistence_v1beta1_query_pb.QueryParamsRequest,
    responseType: pstake_lspersistence_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_pstake_lspersistence_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_pstake_lspersistence_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryParamsResponse,
  },
  // LiquidValidators returns liquid validators with states of the liquidstaking module.
liquidValidators: {
    path: '/pstake.lspersistence.v1beta1.Query/LiquidValidators',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsRequest,
    responseType: pstake_lspersistence_v1beta1_query_pb.QueryLiquidValidatorsResponse,
    requestSerialize: serialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsRequest,
    requestDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsRequest,
    responseSerialize: serialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsResponse,
    responseDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryLiquidValidatorsResponse,
  },
  // States returns states of the liquidstaking module.
states: {
    path: '/pstake.lspersistence.v1beta1.Query/States',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lspersistence_v1beta1_query_pb.QueryStatesRequest,
    responseType: pstake_lspersistence_v1beta1_query_pb.QueryStatesResponse,
    requestSerialize: serialize_pstake_lspersistence_v1beta1_QueryStatesRequest,
    requestDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryStatesRequest,
    responseSerialize: serialize_pstake_lspersistence_v1beta1_QueryStatesResponse,
    responseDeserialize: deserialize_pstake_lspersistence_v1beta1_QueryStatesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
