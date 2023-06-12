// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quasar_qoracle_query_pb = require('../../quasar/qoracle/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var quasar_qoracle_params_pb = require('../../quasar/qoracle/params_pb.js');
var quasar_qoracle_pool_pb = require('../../quasar/qoracle/pool_pb.js');

function serialize_quasarlabs_quasarnode_qoracle_QueryParamsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_QueryParamsRequest(buffer_arg) {
  return quasar_qoracle_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_QueryParamsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_QueryParamsResponse(buffer_arg) {
  return quasar_qoracle_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_QueryPoolsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_QueryPoolsRequest(buffer_arg) {
  return quasar_qoracle_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_QueryPoolsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_QueryPoolsResponse(buffer_arg) {
  return quasar_qoracle_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of the module.
params: {
    path: '/quasarlabs.quasarnode.qoracle.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_query_pb.QueryParamsRequest,
    responseType: quasar_qoracle_query_pb.QueryParamsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_QueryParamsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_QueryParamsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_QueryParamsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_QueryParamsResponse,
  },
  //
// // DenomMappings queries list of denom-> symbol mappings which maps the denoms to their corresponding symbol fetched from price oracles.
// rpc DenomMappings(QueryDenomMappingsRequest) returns (QueryDenomMappingsResponse) {
// option (google.api.http).get = "/quasarlabs/quasarnode/qoracle/denom_mappings";
// }
//
// // DenomPrices queries list of denom prices.
// rpc DenomPrices(QueryDenomPricesRequest) returns (QueryDenomPricesResponse) {
// option (google.api.http).get = "/quasarlabs/quasarnode/qoracle/denom_prices";
// }
//
// Pools queries the pools collected from pool oracles.
pools: {
    path: '/quasarlabs.quasarnode.qoracle.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_query_pb.QueryPoolsRequest,
    responseType: quasar_qoracle_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_QueryPoolsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_QueryPoolsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_QueryPoolsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_QueryPoolsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
