// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_token_query_pb = require('../../irismod/token/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var irismod_token_token_pb = require('../../irismod/token/token_pb.js');

function serialize_irismod_token_QueryFeesRequest(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryFeesRequest)) {
    throw new Error('Expected argument of type irismod.token.QueryFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryFeesRequest(buffer_arg) {
  return irismod_token_query_pb.QueryFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryFeesResponse(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryFeesResponse)) {
    throw new Error('Expected argument of type irismod.token.QueryFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryFeesResponse(buffer_arg) {
  return irismod_token_query_pb.QueryFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryParamsRequest(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type irismod.token.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryParamsRequest(buffer_arg) {
  return irismod_token_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryParamsResponse(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type irismod.token.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryParamsResponse(buffer_arg) {
  return irismod_token_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTokenRequest(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTokenRequest)) {
    throw new Error('Expected argument of type irismod.token.QueryTokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTokenRequest(buffer_arg) {
  return irismod_token_query_pb.QueryTokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTokenResponse(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTokenResponse)) {
    throw new Error('Expected argument of type irismod.token.QueryTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTokenResponse(buffer_arg) {
  return irismod_token_query_pb.QueryTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTokensRequest(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTokensRequest)) {
    throw new Error('Expected argument of type irismod.token.QueryTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTokensRequest(buffer_arg) {
  return irismod_token_query_pb.QueryTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTokensResponse(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTokensResponse)) {
    throw new Error('Expected argument of type irismod.token.QueryTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTokensResponse(buffer_arg) {
  return irismod_token_query_pb.QueryTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTotalBurnRequest(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTotalBurnRequest)) {
    throw new Error('Expected argument of type irismod.token.QueryTotalBurnRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTotalBurnRequest(buffer_arg) {
  return irismod_token_query_pb.QueryTotalBurnRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_QueryTotalBurnResponse(arg) {
  if (!(arg instanceof irismod_token_query_pb.QueryTotalBurnResponse)) {
    throw new Error('Expected argument of type irismod.token.QueryTotalBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_QueryTotalBurnResponse(buffer_arg) {
  return irismod_token_query_pb.QueryTotalBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with token as RPC
var QueryService = exports.QueryService = {
  // Token returns token with token name
token: {
    path: '/irismod.token.Query/Token',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_query_pb.QueryTokenRequest,
    responseType: irismod_token_query_pb.QueryTokenResponse,
    requestSerialize: serialize_irismod_token_QueryTokenRequest,
    requestDeserialize: deserialize_irismod_token_QueryTokenRequest,
    responseSerialize: serialize_irismod_token_QueryTokenResponse,
    responseDeserialize: deserialize_irismod_token_QueryTokenResponse,
  },
  // Tokens returns the token list
tokens: {
    path: '/irismod.token.Query/Tokens',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_query_pb.QueryTokensRequest,
    responseType: irismod_token_query_pb.QueryTokensResponse,
    requestSerialize: serialize_irismod_token_QueryTokensRequest,
    requestDeserialize: deserialize_irismod_token_QueryTokensRequest,
    responseSerialize: serialize_irismod_token_QueryTokensResponse,
    responseDeserialize: deserialize_irismod_token_QueryTokensResponse,
  },
  // Fees returns the fees to issue or mint a token
fees: {
    path: '/irismod.token.Query/Fees',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_query_pb.QueryFeesRequest,
    responseType: irismod_token_query_pb.QueryFeesResponse,
    requestSerialize: serialize_irismod_token_QueryFeesRequest,
    requestDeserialize: deserialize_irismod_token_QueryFeesRequest,
    responseSerialize: serialize_irismod_token_QueryFeesResponse,
    responseDeserialize: deserialize_irismod_token_QueryFeesResponse,
  },
  // Params queries the token parameters
params: {
    path: '/irismod.token.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_query_pb.QueryParamsRequest,
    responseType: irismod_token_query_pb.QueryParamsResponse,
    requestSerialize: serialize_irismod_token_QueryParamsRequest,
    requestDeserialize: deserialize_irismod_token_QueryParamsRequest,
    responseSerialize: serialize_irismod_token_QueryParamsResponse,
    responseDeserialize: deserialize_irismod_token_QueryParamsResponse,
  },
  // TotalBurn queries all the burnt coins
totalBurn: {
    path: '/irismod.token.Query/TotalBurn',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_query_pb.QueryTotalBurnRequest,
    responseType: irismod_token_query_pb.QueryTotalBurnResponse,
    requestSerialize: serialize_irismod_token_QueryTotalBurnRequest,
    requestDeserialize: deserialize_irismod_token_QueryTotalBurnRequest,
    responseSerialize: serialize_irismod_token_QueryTotalBurnResponse,
    responseDeserialize: deserialize_irismod_token_QueryTotalBurnResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
