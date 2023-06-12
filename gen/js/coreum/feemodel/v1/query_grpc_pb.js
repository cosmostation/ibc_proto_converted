// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_feemodel_v1_query_pb = require('../../../coreum/feemodel/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var coreum_feemodel_v1_params_pb = require('../../../coreum/feemodel/v1/params_pb.js');

function serialize_coreum_feemodel_v1_QueryMinGasPriceRequest(arg) {
  if (!(arg instanceof coreum_feemodel_v1_query_pb.QueryMinGasPriceRequest)) {
    throw new Error('Expected argument of type coreum.feemodel.v1.QueryMinGasPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_feemodel_v1_QueryMinGasPriceRequest(buffer_arg) {
  return coreum_feemodel_v1_query_pb.QueryMinGasPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_feemodel_v1_QueryMinGasPriceResponse(arg) {
  if (!(arg instanceof coreum_feemodel_v1_query_pb.QueryMinGasPriceResponse)) {
    throw new Error('Expected argument of type coreum.feemodel.v1.QueryMinGasPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_feemodel_v1_QueryMinGasPriceResponse(buffer_arg) {
  return coreum_feemodel_v1_query_pb.QueryMinGasPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_feemodel_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof coreum_feemodel_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type coreum.feemodel.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_feemodel_v1_QueryParamsRequest(buffer_arg) {
  return coreum_feemodel_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_feemodel_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof coreum_feemodel_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type coreum.feemodel.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_feemodel_v1_QueryParamsResponse(buffer_arg) {
  return coreum_feemodel_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // MinGasPrice queries the current minimum gas price required by the network.
minGasPrice: {
    path: '/coreum.feemodel.v1.Query/MinGasPrice',
    requestStream: false,
    responseStream: false,
    requestType: coreum_feemodel_v1_query_pb.QueryMinGasPriceRequest,
    responseType: coreum_feemodel_v1_query_pb.QueryMinGasPriceResponse,
    requestSerialize: serialize_coreum_feemodel_v1_QueryMinGasPriceRequest,
    requestDeserialize: deserialize_coreum_feemodel_v1_QueryMinGasPriceRequest,
    responseSerialize: serialize_coreum_feemodel_v1_QueryMinGasPriceResponse,
    responseDeserialize: deserialize_coreum_feemodel_v1_QueryMinGasPriceResponse,
  },
  // Params queries the parameters of x/feemodel module.
params: {
    path: '/coreum.feemodel.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: coreum_feemodel_v1_query_pb.QueryParamsRequest,
    responseType: coreum_feemodel_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_coreum_feemodel_v1_QueryParamsRequest,
    requestDeserialize: deserialize_coreum_feemodel_v1_QueryParamsRequest,
    responseSerialize: serialize_coreum_feemodel_v1_QueryParamsResponse,
    responseDeserialize: deserialize_coreum_feemodel_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
