// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_icacallbacks_query_pb = require('../../lum-network/icacallbacks/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var lum$network_icacallbacks_params_pb = require('../../lum-network/icacallbacks/params_pb.js');
var lum$network_icacallbacks_callback_data_pb = require('../../lum-network/icacallbacks/callback_data_pb.js');

function serialize_lum_network_icacallbacks_QueryAllCallbackDataRequest(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryAllCallbackDataRequest)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryAllCallbackDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryAllCallbackDataRequest(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryAllCallbackDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icacallbacks_QueryAllCallbackDataResponse(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryAllCallbackDataResponse)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryAllCallbackDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryAllCallbackDataResponse(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryAllCallbackDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icacallbacks_QueryGetCallbackDataRequest(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryGetCallbackDataRequest)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryGetCallbackDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryGetCallbackDataRequest(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryGetCallbackDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icacallbacks_QueryGetCallbackDataResponse(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryGetCallbackDataResponse)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryGetCallbackDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryGetCallbackDataResponse(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryGetCallbackDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icacallbacks_QueryParamsRequest(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryParamsRequest(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icacallbacks_QueryParamsResponse(arg) {
  if (!(arg instanceof lum$network_icacallbacks_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type lum.network.icacallbacks.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icacallbacks_QueryParamsResponse(buffer_arg) {
  return lum$network_icacallbacks_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/lum.network.icacallbacks.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icacallbacks_query_pb.QueryParamsRequest,
    responseType: lum$network_icacallbacks_query_pb.QueryParamsResponse,
    requestSerialize: serialize_lum_network_icacallbacks_QueryParamsRequest,
    requestDeserialize: deserialize_lum_network_icacallbacks_QueryParamsRequest,
    responseSerialize: serialize_lum_network_icacallbacks_QueryParamsResponse,
    responseDeserialize: deserialize_lum_network_icacallbacks_QueryParamsResponse,
  },
  // Queries a CallbackData by index.
callbackData: {
    path: '/lum.network.icacallbacks.Query/CallbackData',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icacallbacks_query_pb.QueryGetCallbackDataRequest,
    responseType: lum$network_icacallbacks_query_pb.QueryGetCallbackDataResponse,
    requestSerialize: serialize_lum_network_icacallbacks_QueryGetCallbackDataRequest,
    requestDeserialize: deserialize_lum_network_icacallbacks_QueryGetCallbackDataRequest,
    responseSerialize: serialize_lum_network_icacallbacks_QueryGetCallbackDataResponse,
    responseDeserialize: deserialize_lum_network_icacallbacks_QueryGetCallbackDataResponse,
  },
  // Queries a list of CallbackData items.
callbackDataAll: {
    path: '/lum.network.icacallbacks.Query/CallbackDataAll',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icacallbacks_query_pb.QueryAllCallbackDataRequest,
    responseType: lum$network_icacallbacks_query_pb.QueryAllCallbackDataResponse,
    requestSerialize: serialize_lum_network_icacallbacks_QueryAllCallbackDataRequest,
    requestDeserialize: deserialize_lum_network_icacallbacks_QueryAllCallbackDataRequest,
    responseSerialize: serialize_lum_network_icacallbacks_QueryAllCallbackDataResponse,
    responseDeserialize: deserialize_lum_network_icacallbacks_QueryAllCallbackDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
