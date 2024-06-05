// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var feemarket_feemarket_v1_query_pb = require('../../../feemarket/feemarket/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var feemarket_feemarket_v1_params_pb = require('../../../feemarket/feemarket/v1/params_pb.js');
var feemarket_feemarket_v1_genesis_pb = require('../../../feemarket/feemarket/v1/genesis_pb.js');

function serialize_feemarket_feemarket_v1_BaseFeeRequest(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.BaseFeeRequest)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.BaseFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_BaseFeeRequest(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.BaseFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_BaseFeeResponse(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.BaseFeeResponse)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.BaseFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_BaseFeeResponse(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.BaseFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_ParamsRequest(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_ParamsRequest(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_ParamsResponse(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_ParamsResponse(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_StateRequest(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.StateRequest)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.StateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_StateRequest(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.StateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_feemarket_feemarket_v1_StateResponse(arg) {
  if (!(arg instanceof feemarket_feemarket_v1_query_pb.StateResponse)) {
    throw new Error('Expected argument of type feemarket.feemarket.v1.StateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_feemarket_feemarket_v1_StateResponse(buffer_arg) {
  return feemarket_feemarket_v1_query_pb.StateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query Service for the feemarket module.
var QueryService = exports.QueryService = {
  // Params returns the current feemarket module parameters.
params: {
    path: '/feemarket.feemarket.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: feemarket_feemarket_v1_query_pb.ParamsRequest,
    responseType: feemarket_feemarket_v1_query_pb.ParamsResponse,
    requestSerialize: serialize_feemarket_feemarket_v1_ParamsRequest,
    requestDeserialize: deserialize_feemarket_feemarket_v1_ParamsRequest,
    responseSerialize: serialize_feemarket_feemarket_v1_ParamsResponse,
    responseDeserialize: deserialize_feemarket_feemarket_v1_ParamsResponse,
  },
  // State returns the current feemarket module state.
state: {
    path: '/feemarket.feemarket.v1.Query/State',
    requestStream: false,
    responseStream: false,
    requestType: feemarket_feemarket_v1_query_pb.StateRequest,
    responseType: feemarket_feemarket_v1_query_pb.StateResponse,
    requestSerialize: serialize_feemarket_feemarket_v1_StateRequest,
    requestDeserialize: deserialize_feemarket_feemarket_v1_StateRequest,
    responseSerialize: serialize_feemarket_feemarket_v1_StateResponse,
    responseDeserialize: deserialize_feemarket_feemarket_v1_StateResponse,
  },
  // BaseFee returns the current feemarket module base fee.
baseFee: {
    path: '/feemarket.feemarket.v1.Query/BaseFee',
    requestStream: false,
    responseStream: false,
    requestType: feemarket_feemarket_v1_query_pb.BaseFeeRequest,
    responseType: feemarket_feemarket_v1_query_pb.BaseFeeResponse,
    requestSerialize: serialize_feemarket_feemarket_v1_BaseFeeRequest,
    requestDeserialize: deserialize_feemarket_feemarket_v1_BaseFeeRequest,
    responseSerialize: serialize_feemarket_feemarket_v1_BaseFeeResponse,
    responseDeserialize: deserialize_feemarket_feemarket_v1_BaseFeeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
