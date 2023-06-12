// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_tokenmint_v1beta1_query_pb = require('../../../comdex/tokenmint/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var comdex_tokenmint_v1beta1_mint_pb = require('../../../comdex/tokenmint/v1beta1/mint_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsRequest(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsRequest)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryAllTokenMintedForAllAppsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsRequest(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsResponse(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsResponse)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryAllTokenMintedForAllAppsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsResponse(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetRequest(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetRequest)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryTokenMintedByAppAndAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetRequest(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetResponse(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetResponse)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryTokenMintedByAppAndAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetResponse(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppRequest(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppRequest)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryTokenMintedByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppRequest(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppResponse(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppResponse)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppResponse(buffer_arg) {
  return comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryAllTokenMintedForAllApps: {
    path: '/comdex.tokenmint.v1beta1.Query/QueryAllTokenMintedForAllApps',
    requestStream: false,
    responseStream: false,
    requestType: comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsRequest,
    responseType: comdex_tokenmint_v1beta1_query_pb.QueryAllTokenMintedForAllAppsResponse,
    requestSerialize: serialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsRequest,
    requestDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsRequest,
    responseSerialize: serialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsResponse,
    responseDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryAllTokenMintedForAllAppsResponse,
  },
  queryTokenMintedByApp: {
    path: '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppRequest,
    responseType: comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppResponse,
    requestSerialize: serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppRequest,
    requestDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppRequest,
    responseSerialize: serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppResponse,
    responseDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppResponse,
  },
  queryTokenMintedByAppAndAsset: {
    path: '/comdex.tokenmint.v1beta1.Query/QueryTokenMintedByAppAndAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetRequest,
    responseType: comdex_tokenmint_v1beta1_query_pb.QueryTokenMintedByAppAndAssetResponse,
    requestSerialize: serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetRequest,
    requestDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetRequest,
    responseSerialize: serialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetResponse,
    responseDeserialize: deserialize_comdex_tokenmint_v1beta1_QueryTokenMintedByAppAndAssetResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
