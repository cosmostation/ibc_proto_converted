// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_locker_v1beta1_query_pb = require('../../../comdex/locker/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_locker_v1beta1_locker_pb = require('../../../comdex/locker/v1beta1/locker_pb.js');
var comdex_asset_v1beta1_asset_pb = require('../../../comdex/asset/v1beta1/asset_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerCountByAppIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerCountByAppIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerCountByAppIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerCountByAppIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerCountByAppIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerCountByAppIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerInfoRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerInfoRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerInfoRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerInfoResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerInfoResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerInfoResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDRequest(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDRequest)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDRequest(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDResponse(arg) {
  if (!(arg instanceof comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDResponse)) {
    throw new Error('Expected argument of type comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDResponse(buffer_arg) {
  return comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryLockerInfo: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerInfo',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerInfoRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerInfoResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerInfoRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerInfoRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerInfoResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerInfoResponse,
  },
  queryLockersByAppToAssetID: {
    path: '/comdex.locker.v1beta1.Query/QueryLockersByAppToAssetID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockersByAppToAssetIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockersByAppToAssetIDResponse,
  },
  queryLockerInfoByAppID: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerInfoByAppID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerInfoByAppIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerInfoByAppIDResponse,
  },
  queryTotalDepositByAppAndAssetID: {
    path: '/comdex.locker.v1beta1.Query/QueryTotalDepositByAppAndAssetID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryTotalDepositByAppAndAssetIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryTotalDepositByAppAndAssetIDResponse,
  },
  queryOwnerLockerByAppIDbyOwner: {
    path: '/comdex.locker.v1beta1.Query/QueryOwnerLockerByAppIDbyOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppIDbyOwnerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppIDbyOwnerResponse,
  },
  queryOwnerLockerOfAllAppsByOwner: {
    path: '/comdex.locker.v1beta1.Query/QueryOwnerLockerOfAllAppsByOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerOfAllAppsByOwnerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerOfAllAppsByOwnerResponse,
  },
  queryOwnerTxDetailsLockerOfAppByOwnerByAsset: {
    path: '/comdex.locker.v1beta1.Query/QueryOwnerTxDetailsLockerOfAppByOwnerByAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse,
  },
  queryOwnerLockerByAppToAssetIDbyOwner: {
    path: '/comdex.locker.v1beta1.Query/QueryOwnerLockerByAppToAssetIDbyOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryOwnerLockerByAppToAssetIDbyOwnerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryOwnerLockerByAppToAssetIDbyOwnerResponse,
  },
  queryLockerByAppByOwner: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerByAppByOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerByAppByOwnerResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerByAppByOwnerResponse,
  },
  queryLockerCountByAppID: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerCountByAppID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerCountByAppIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerCountByAppIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerCountByAppIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerCountByAppIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerCountByAppIDResponse,
  },
  queryLockerCountByAppToAssetID: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerCountByAppToAssetID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerCountByAppToAssetIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerCountByAppToAssetIDResponse,
  },
  queryWhiteListedAssetIDsByAppID: {
    path: '/comdex.locker.v1beta1.Query/QueryWhiteListedAssetIDsByAppID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetIDsByAppIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetIDsByAppIDResponse,
  },
  queryWhiteListedAssetByAllApps: {
    path: '/comdex.locker.v1beta1.Query/QueryWhiteListedAssetByAllApps',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryWhiteListedAssetByAllAppsResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryWhiteListedAssetByAllAppsResponse,
  },
  queryLockerLookupTableByApp: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerLookupTableByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppResponse,
  },
  queryLockerLookupTableByAppAndAssetID: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerLookupTableByAppAndAssetID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerLookupTableByAppAndAssetIDResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerLookupTableByAppAndAssetIDResponse,
  },
  queryLockerTotalRewardsByAssetAppWise: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerTotalRewardsByAssetAppWise',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerTotalRewardsByAssetAppWiseResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerTotalRewardsByAssetAppWiseResponse,
  },
  queryLockerTotalDepositedByApp: {
    path: '/comdex.locker.v1beta1.Query/QueryLockerTotalDepositedByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppRequest,
    responseType: comdex_locker_v1beta1_query_pb.QueryLockerTotalDepositedByAppResponse,
    requestSerialize: serialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppRequest,
    requestDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppRequest,
    responseSerialize: serialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppResponse,
    responseDeserialize: deserialize_comdex_locker_v1beta1_QueryLockerTotalDepositedByAppResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
