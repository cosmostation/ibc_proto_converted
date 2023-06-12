// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_token_v1beta1_query_pb = require('../../../ixo/token/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var ixo_token_v1beta1_token_pb = require('../../../ixo/token/v1beta1/token_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_ixo_token_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryParamsRequest(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryParamsResponse(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenDocRequest(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenDocRequest)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenDocRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenDocRequest(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenDocRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenDocResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenDocResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenDocResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenDocResponse(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenDocResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenListRequest(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenListRequest)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenListRequest(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenListResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenListResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenListResponse(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenMetadataRequest(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenMetadataRequest)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenMetadataRequest(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_QueryTokenMetadataResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_query_pb.QueryTokenMetadataResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.QueryTokenMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_QueryTokenMetadataResponse(buffer_arg) {
  return ixo_token_v1beta1_query_pb.QueryTokenMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/ixo.token.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_query_pb.QueryParamsRequest,
    responseType: ixo_token_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ixo_token_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_ixo_token_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_ixo_token_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_QueryParamsResponse,
  },
  tokenList: {
    path: '/ixo.token.v1beta1.Query/TokenList',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_query_pb.QueryTokenListRequest,
    responseType: ixo_token_v1beta1_query_pb.QueryTokenListResponse,
    requestSerialize: serialize_ixo_token_v1beta1_QueryTokenListRequest,
    requestDeserialize: deserialize_ixo_token_v1beta1_QueryTokenListRequest,
    responseSerialize: serialize_ixo_token_v1beta1_QueryTokenListResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_QueryTokenListResponse,
  },
  tokenDoc: {
    path: '/ixo.token.v1beta1.Query/TokenDoc',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_query_pb.QueryTokenDocRequest,
    responseType: ixo_token_v1beta1_query_pb.QueryTokenDocResponse,
    requestSerialize: serialize_ixo_token_v1beta1_QueryTokenDocRequest,
    requestDeserialize: deserialize_ixo_token_v1beta1_QueryTokenDocRequest,
    responseSerialize: serialize_ixo_token_v1beta1_QueryTokenDocResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_QueryTokenDocResponse,
  },
  tokenMetadata: {
    path: '/ixo.token.v1beta1.Query/TokenMetadata',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_query_pb.QueryTokenMetadataRequest,
    responseType: ixo_token_v1beta1_query_pb.QueryTokenMetadataResponse,
    requestSerialize: serialize_ixo_token_v1beta1_QueryTokenMetadataRequest,
    requestDeserialize: deserialize_ixo_token_v1beta1_QueryTokenMetadataRequest,
    responseSerialize: serialize_ixo_token_v1beta1_QueryTokenMetadataResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_QueryTokenMetadataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
