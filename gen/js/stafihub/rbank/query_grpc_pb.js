// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rbank_query_pb = require('../../stafihub/rbank/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_rbank_params_pb = require('../../stafihub/rbank/params_pb.js');

function serialize_stafihub_stafihub_rbank_QueryAddressPrefixRequest(arg) {
  if (!(arg instanceof stafihub_rbank_query_pb.QueryAddressPrefixRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.QueryAddressPrefixRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_QueryAddressPrefixRequest(buffer_arg) {
  return stafihub_rbank_query_pb.QueryAddressPrefixRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rbank_QueryAddressPrefixResponse(arg) {
  if (!(arg instanceof stafihub_rbank_query_pb.QueryAddressPrefixResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.QueryAddressPrefixResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_QueryAddressPrefixResponse(buffer_arg) {
  return stafihub_rbank_query_pb.QueryAddressPrefixResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rbank_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_rbank_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_QueryParamsRequest(buffer_arg) {
  return stafihub_rbank_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rbank_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_rbank_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rbank.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rbank_QueryParamsResponse(buffer_arg) {
  return stafihub_rbank_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.rbank.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rbank_query_pb.QueryParamsRequest,
    responseType: stafihub_rbank_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_rbank_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rbank_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_rbank_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rbank_QueryParamsResponse,
  },
  // Queries a list of AddressPrefix items.
addressPrefix: {
    path: '/stafihub.stafihub.rbank.Query/AddressPrefix',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rbank_query_pb.QueryAddressPrefixRequest,
    responseType: stafihub_rbank_query_pb.QueryAddressPrefixResponse,
    requestSerialize: serialize_stafihub_stafihub_rbank_QueryAddressPrefixRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rbank_QueryAddressPrefixRequest,
    responseSerialize: serialize_stafihub_stafihub_rbank_QueryAddressPrefixResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rbank_QueryAddressPrefixResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
