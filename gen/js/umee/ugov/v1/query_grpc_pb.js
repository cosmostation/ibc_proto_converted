// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_ugov_v1_query_pb = require('../../../umee/ugov/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_umee_ugov_v1_QueryMinGasPrice(arg) {
  if (!(arg instanceof umee_ugov_v1_query_pb.QueryMinGasPrice)) {
    throw new Error('Expected argument of type umee.ugov.v1.QueryMinGasPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_ugov_v1_QueryMinGasPrice(buffer_arg) {
  return umee_ugov_v1_query_pb.QueryMinGasPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_ugov_v1_QueryMinGasPriceResponse(arg) {
  if (!(arg instanceof umee_ugov_v1_query_pb.QueryMinGasPriceResponse)) {
    throw new Error('Expected argument of type umee.ugov.v1.QueryMinGasPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_ugov_v1_QueryMinGasPriceResponse(buffer_arg) {
  return umee_ugov_v1_query_pb.QueryMinGasPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // MinGasPrice returns minimum transaction fees.
minGasPrice: {
    path: '/umee.ugov.v1.Query/MinGasPrice',
    requestStream: false,
    responseStream: false,
    requestType: umee_ugov_v1_query_pb.QueryMinGasPrice,
    responseType: umee_ugov_v1_query_pb.QueryMinGasPriceResponse,
    requestSerialize: serialize_umee_ugov_v1_QueryMinGasPrice,
    requestDeserialize: deserialize_umee_ugov_v1_QueryMinGasPrice,
    responseSerialize: serialize_umee_ugov_v1_QueryMinGasPriceResponse,
    responseDeserialize: deserialize_umee_ugov_v1_QueryMinGasPriceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
