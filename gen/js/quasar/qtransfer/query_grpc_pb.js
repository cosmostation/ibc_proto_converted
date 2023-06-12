// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quasar_qtransfer_query_pb = require('../../quasar/qtransfer/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var quasar_qtransfer_params_pb = require('../../quasar/qtransfer/params_pb.js');

function serialize_quasarlabs_quasarnode_qtransfer_QueryParamsRequest(arg) {
  if (!(arg instanceof quasar_qtransfer_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qtransfer.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qtransfer_QueryParamsRequest(buffer_arg) {
  return quasar_qtransfer_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qtransfer_QueryParamsResponse(arg) {
  if (!(arg instanceof quasar_qtransfer_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qtransfer.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qtransfer_QueryParamsResponse(buffer_arg) {
  return quasar_qtransfer_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/quasarlabs.quasarnode.qtransfer.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qtransfer_query_pb.QueryParamsRequest,
    responseType: quasar_qtransfer_query_pb.QueryParamsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qtransfer_QueryParamsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qtransfer_QueryParamsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qtransfer_QueryParamsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qtransfer_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
