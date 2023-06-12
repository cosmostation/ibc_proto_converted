// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_asset_v1beta1_query_pb = require('../../../comdex/asset/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_asset_v1beta1_asset_pb = require('../../../comdex/asset/v1beta1/asset_pb.js');
var comdex_asset_v1beta1_app_pb = require('../../../comdex/asset/v1beta1/app_pb.js');
var comdex_asset_v1beta1_pair_pb = require('../../../comdex/asset/v1beta1/pair_pb.js');
var comdex_asset_v1beta1_extendedPairVault_pb = require('../../../comdex/asset/v1beta1/extendedPairVault_pb.js');
var comdex_asset_v1beta1_params_pb = require('../../../comdex/asset/v1beta1/params_pb.js');

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairStableVaultsByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairStableVaultsByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairStableVaultsIDByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairStableVaultsIDByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairVaultsByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairVaultsByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAllExtendedPairVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAppRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAppRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAppRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAppResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAppResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAppResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAppsRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAppsRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAppsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAppsRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAppsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAppsResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAppsResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAppsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAppsResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAppsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetPairRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetPairRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetPairRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetPairResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetPairResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetPairResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetPairsRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetPairsRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetPairsRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetPairsResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetPairsResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetPairsResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetsRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetsRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetsRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryAssetsResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryAssetsResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryAssetsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryAssetsResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryAssetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryExtendedPairVaultRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryExtendedPairVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryExtendedPairVaultResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryExtendedPairVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryExtendedPairVaultsByAppWithoutStableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryExtendedPairVaultsByAppWithoutStableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryGovTokenByAppRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryGovTokenByAppRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryGovTokenByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryGovTokenByAppRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryGovTokenByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryGovTokenByAppResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryGovTokenByAppResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryGovTokenByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryGovTokenByAppResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryGovTokenByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_asset_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_asset_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.asset.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_asset_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_asset_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // Params returns parameters of the module.
params: {
    path: '/comdex.asset.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryParamsResponse,
  },
  queryAssets: {
    path: '/comdex.asset.v1beta1.Query/QueryAssets',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAssetsRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAssetsResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAssetsRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetsRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAssetsResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetsResponse,
  },
  queryAsset: {
    path: '/comdex.asset.v1beta1.Query/QueryAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAssetRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAssetResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAssetRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAssetResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetResponse,
  },
  queryAssetPairs: {
    path: '/comdex.asset.v1beta1.Query/QueryAssetPairs',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAssetPairsRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAssetPairsResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAssetPairsRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetPairsRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAssetPairsResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetPairsResponse,
  },
  queryAssetPair: {
    path: '/comdex.asset.v1beta1.Query/QueryAssetPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAssetPairRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAssetPairResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAssetPairRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetPairRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAssetPairResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAssetPairResponse,
  },
  queryApps: {
    path: '/comdex.asset.v1beta1.Query/QueryApps',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAppsRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAppsResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAppsRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAppsRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAppsResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAppsResponse,
  },
  queryApp: {
    path: '/comdex.asset.v1beta1.Query/QueryApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAppRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAppResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAppRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAppRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAppResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAppResponse,
  },
  queryExtendedPairVault: {
    path: '/comdex.asset.v1beta1.Query/QueryExtendedPairVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryExtendedPairVaultRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryExtendedPairVaultResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultResponse,
  },
  queryAllExtendedPairVaults: {
    path: '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaults',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsResponse,
  },
  queryAllExtendedPairVaultsByApp: {
    path: '/comdex.asset.v1beta1.Query/QueryAllExtendedPairVaultsByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairVaultsByAppResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairVaultsByAppResponse,
  },
  queryAllExtendedPairStableVaultsIDByApp: {
    path: '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsIDByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsIDByAppResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsIDByAppResponse,
  },
  queryGovTokenByApp: {
    path: '/comdex.asset.v1beta1.Query/QueryGovTokenByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryGovTokenByAppRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryGovTokenByAppResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryGovTokenByAppRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryGovTokenByAppRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryGovTokenByAppResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryGovTokenByAppResponse,
  },
  queryAllExtendedPairStableVaultsByApp: {
    path: '/comdex.asset.v1beta1.Query/QueryAllExtendedPairStableVaultsByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryAllExtendedPairStableVaultsByAppResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryAllExtendedPairStableVaultsByAppResponse,
  },
  queryExtendedPairVaultsByAppWithoutStable: {
    path: '/comdex.asset.v1beta1.Query/QueryExtendedPairVaultsByAppWithoutStable',
    requestStream: false,
    responseStream: false,
    requestType: comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableRequest,
    responseType: comdex_asset_v1beta1_query_pb.QueryExtendedPairVaultsByAppWithoutStableResponse,
    requestSerialize: serialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableRequest,
    requestDeserialize: deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableRequest,
    responseSerialize: serialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableResponse,
    responseDeserialize: deserialize_comdex_asset_v1beta1_QueryExtendedPairVaultsByAppWithoutStableResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
