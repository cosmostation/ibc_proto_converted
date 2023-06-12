// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_cosmwasmpool_v1beta1_query_pb = require('../../../osmosis/cosmwasmpool/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_cosmwasmpool_v1beta1_genesis_pb = require('../../../osmosis/cosmwasmpool/v1beta1/genesis_pb.js');
var osmosis_cosmwasmpool_v1beta1_tx_pb = require('../../../osmosis/cosmwasmpool/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_osmosis_cosmwasmpool_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof osmosis_cosmwasmpool_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type osmosis.cosmwasmpool.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_cosmwasmpool_v1beta1_ParamsRequest(buffer_arg) {
  return osmosis_cosmwasmpool_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_cosmwasmpool_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof osmosis_cosmwasmpool_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type osmosis.cosmwasmpool.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_cosmwasmpool_v1beta1_ParamsResponse(buffer_arg) {
  return osmosis_cosmwasmpool_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/osmosis.cosmwasmpool.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_cosmwasmpool_v1beta1_query_pb.ParamsRequest,
    responseType: osmosis_cosmwasmpool_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_osmosis_cosmwasmpool_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_osmosis_cosmwasmpool_v1beta1_ParamsRequest,
    responseSerialize: serialize_osmosis_cosmwasmpool_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_osmosis_cosmwasmpool_v1beta1_ParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
