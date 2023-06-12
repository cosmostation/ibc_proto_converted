// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_esm_v1beta1_query_pb = require('../../../comdex/esm/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_esm_v1beta1_params_pb = require('../../../comdex/esm/v1beta1/params_pb.js');
var comdex_esm_v1beta1_esm_pb = require('../../../comdex/esm/v1beta1/esm_pb.js');

function serialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryCurrentDepositStatsRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryCurrentDepositStatsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryCurrentDepositStatsRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryCurrentDepositStatsResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryCurrentDepositStatsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryCurrentDepositStatsResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryDataAfterCoolOffRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryDataAfterCoolOffRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryDataAfterCoolOffRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryDataAfterCoolOffResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryDataAfterCoolOffResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryDataAfterCoolOffResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryESMStatusRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryESMStatusRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryESMStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryESMStatusRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryESMStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryESMStatusResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryESMStatusResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryESMStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryESMStatusResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryESMStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryESMTriggerParamsRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryESMTriggerParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryESMTriggerParamsRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryESMTriggerParamsResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryESMTriggerParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryESMTriggerParamsResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QuerySnapshotPriceRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QuerySnapshotPriceRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QuerySnapshotPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QuerySnapshotPriceRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QuerySnapshotPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QuerySnapshotPriceResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QuerySnapshotPriceResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QuerySnapshotPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QuerySnapshotPriceResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QuerySnapshotPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryUsersDepositMappingRequest(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingRequest)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryUsersDepositMappingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryUsersDepositMappingRequest(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_esm_v1beta1_QueryUsersDepositMappingResponse(arg) {
  if (!(arg instanceof comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingResponse)) {
    throw new Error('Expected argument of type comdex.esm.v1beta1.QueryUsersDepositMappingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_esm_v1beta1_QueryUsersDepositMappingResponse(buffer_arg) {
  return comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/comdex.esm.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryParamsResponse,
  },
  queryESMTriggerParams: {
    path: '/comdex.esm.v1beta1.Query/QueryESMTriggerParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryESMTriggerParamsResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryESMTriggerParamsRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryESMTriggerParamsRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryESMTriggerParamsResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryESMTriggerParamsResponse,
  },
  queryESMStatus: {
    path: '/comdex.esm.v1beta1.Query/QueryESMStatus',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryESMStatusRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryESMStatusResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryESMStatusRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryESMStatusRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryESMStatusResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryESMStatusResponse,
  },
  queryCurrentDepositStats: {
    path: '/comdex.esm.v1beta1.Query/QueryCurrentDepositStats',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryCurrentDepositStatsResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryCurrentDepositStatsRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryCurrentDepositStatsRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryCurrentDepositStatsResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryCurrentDepositStatsResponse,
  },
  queryUsersDepositMapping: {
    path: '/comdex.esm.v1beta1.Query/QueryUsersDepositMapping',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryUsersDepositMappingResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryUsersDepositMappingRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryUsersDepositMappingRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryUsersDepositMappingResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryUsersDepositMappingResponse,
  },
  queryDataAfterCoolOff: {
    path: '/comdex.esm.v1beta1.Query/QueryDataAfterCoolOff',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryDataAfterCoolOffResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryDataAfterCoolOffRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryDataAfterCoolOffRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryDataAfterCoolOffResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryDataAfterCoolOffResponse,
  },
  querySnapshotPrice: {
    path: '/comdex.esm.v1beta1.Query/QuerySnapshotPrice',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QuerySnapshotPriceRequest,
    responseType: comdex_esm_v1beta1_query_pb.QuerySnapshotPriceResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QuerySnapshotPriceRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QuerySnapshotPriceRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QuerySnapshotPriceResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QuerySnapshotPriceResponse,
  },
  queryAssetDataAfterCoolOff: {
    path: '/comdex.esm.v1beta1.Query/QueryAssetDataAfterCoolOff',
    requestStream: false,
    responseStream: false,
    requestType: comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffRequest,
    responseType: comdex_esm_v1beta1_query_pb.QueryAssetDataAfterCoolOffResponse,
    requestSerialize: serialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffRequest,
    requestDeserialize: deserialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffRequest,
    responseSerialize: serialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffResponse,
    responseDeserialize: deserialize_comdex_esm_v1beta1_QueryAssetDataAfterCoolOffResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
