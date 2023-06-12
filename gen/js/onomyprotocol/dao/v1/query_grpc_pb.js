// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var onomyprotocol_dao_v1_query_pb = require('../../../onomyprotocol/dao/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var onomyprotocol_dao_v1_params_pb = require('../../../onomyprotocol/dao/v1/params_pb.js');

function serialize_onomyprotocol_dao_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof onomyprotocol_dao_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type onomyprotocol.dao.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_onomyprotocol_dao_v1_QueryParamsRequest(buffer_arg) {
  return onomyprotocol_dao_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_onomyprotocol_dao_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof onomyprotocol_dao_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type onomyprotocol.dao.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_onomyprotocol_dao_v1_QueryParamsResponse(buffer_arg) {
  return onomyprotocol_dao_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_onomyprotocol_dao_v1_QueryTreasuryRequest(arg) {
  if (!(arg instanceof onomyprotocol_dao_v1_query_pb.QueryTreasuryRequest)) {
    throw new Error('Expected argument of type onomyprotocol.dao.v1.QueryTreasuryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_onomyprotocol_dao_v1_QueryTreasuryRequest(buffer_arg) {
  return onomyprotocol_dao_v1_query_pb.QueryTreasuryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_onomyprotocol_dao_v1_QueryTreasuryResponse(arg) {
  if (!(arg instanceof onomyprotocol_dao_v1_query_pb.QueryTreasuryResponse)) {
    throw new Error('Expected argument of type onomyprotocol.dao.v1.QueryTreasuryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_onomyprotocol_dao_v1_QueryTreasuryResponse(buffer_arg) {
  return onomyprotocol_dao_v1_query_pb.QueryTreasuryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/onomyprotocol.dao.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: onomyprotocol_dao_v1_query_pb.QueryParamsRequest,
    responseType: onomyprotocol_dao_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_onomyprotocol_dao_v1_QueryParamsRequest,
    requestDeserialize: deserialize_onomyprotocol_dao_v1_QueryParamsRequest,
    responseSerialize: serialize_onomyprotocol_dao_v1_QueryParamsResponse,
    responseDeserialize: deserialize_onomyprotocol_dao_v1_QueryParamsResponse,
  },
  // Treasury queries the dao treasury.
treasury: {
    path: '/onomyprotocol.dao.v1.Query/Treasury',
    requestStream: false,
    responseStream: false,
    requestType: onomyprotocol_dao_v1_query_pb.QueryTreasuryRequest,
    responseType: onomyprotocol_dao_v1_query_pb.QueryTreasuryResponse,
    requestSerialize: serialize_onomyprotocol_dao_v1_QueryTreasuryRequest,
    requestDeserialize: deserialize_onomyprotocol_dao_v1_QueryTreasuryRequest,
    responseSerialize: serialize_onomyprotocol_dao_v1_QueryTreasuryResponse,
    responseDeserialize: deserialize_onomyprotocol_dao_v1_QueryTreasuryResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
