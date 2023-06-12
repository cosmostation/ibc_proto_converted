// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_icacallbacks_query_pb = require('../../stride/icacallbacks/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stride_icacallbacks_params_pb = require('../../stride/icacallbacks/params_pb.js');
var stride_icacallbacks_callback_data_pb = require('../../stride/icacallbacks/callback_data_pb.js');

function serialize_stride_icacallbacks_QueryAllCallbackDataRequest(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryAllCallbackDataRequest)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryAllCallbackDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryAllCallbackDataRequest(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryAllCallbackDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_icacallbacks_QueryAllCallbackDataResponse(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryAllCallbackDataResponse)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryAllCallbackDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryAllCallbackDataResponse(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryAllCallbackDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_icacallbacks_QueryGetCallbackDataRequest(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryGetCallbackDataRequest)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryGetCallbackDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryGetCallbackDataRequest(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryGetCallbackDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_icacallbacks_QueryGetCallbackDataResponse(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryGetCallbackDataResponse)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryGetCallbackDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryGetCallbackDataResponse(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryGetCallbackDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_icacallbacks_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryParamsRequest(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_icacallbacks_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_icacallbacks_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.icacallbacks.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_icacallbacks_QueryParamsResponse(buffer_arg) {
  return stride_icacallbacks_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stride.icacallbacks.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_icacallbacks_query_pb.QueryParamsRequest,
    responseType: stride_icacallbacks_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_icacallbacks_QueryParamsRequest,
    requestDeserialize: deserialize_stride_icacallbacks_QueryParamsRequest,
    responseSerialize: serialize_stride_icacallbacks_QueryParamsResponse,
    responseDeserialize: deserialize_stride_icacallbacks_QueryParamsResponse,
  },
  // Queries a CallbackData by index.
callbackData: {
    path: '/stride.icacallbacks.Query/CallbackData',
    requestStream: false,
    responseStream: false,
    requestType: stride_icacallbacks_query_pb.QueryGetCallbackDataRequest,
    responseType: stride_icacallbacks_query_pb.QueryGetCallbackDataResponse,
    requestSerialize: serialize_stride_icacallbacks_QueryGetCallbackDataRequest,
    requestDeserialize: deserialize_stride_icacallbacks_QueryGetCallbackDataRequest,
    responseSerialize: serialize_stride_icacallbacks_QueryGetCallbackDataResponse,
    responseDeserialize: deserialize_stride_icacallbacks_QueryGetCallbackDataResponse,
  },
  // Queries a list of CallbackData items.
callbackDataAll: {
    path: '/stride.icacallbacks.Query/CallbackDataAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_icacallbacks_query_pb.QueryAllCallbackDataRequest,
    responseType: stride_icacallbacks_query_pb.QueryAllCallbackDataResponse,
    requestSerialize: serialize_stride_icacallbacks_QueryAllCallbackDataRequest,
    requestDeserialize: deserialize_stride_icacallbacks_QueryAllCallbackDataRequest,
    responseSerialize: serialize_stride_icacallbacks_QueryAllCallbackDataResponse,
    responseDeserialize: deserialize_stride_icacallbacks_QueryAllCallbackDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
