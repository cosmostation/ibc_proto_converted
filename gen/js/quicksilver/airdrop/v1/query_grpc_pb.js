// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_airdrop_v1_query_pb = require('../../../quicksilver/airdrop/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var quicksilver_airdrop_v1_params_pb = require('../../../quicksilver/airdrop/v1/params_pb.js');
var quicksilver_airdrop_v1_airdrop_pb = require('../../../quicksilver/airdrop/v1/airdrop_pb.js');

function serialize_quicksilver_airdrop_v1_QueryAccountBalanceRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryAccountBalanceRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryAccountBalanceRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryAccountBalanceResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryAccountBalanceResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryAccountBalanceResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryClaimRecordRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryClaimRecordRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryClaimRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryClaimRecordRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryClaimRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryClaimRecordResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryClaimRecordResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryClaimRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryClaimRecordResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryClaimRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryClaimRecordsRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryClaimRecordsRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryClaimRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryClaimRecordsRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryClaimRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryClaimRecordsResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryClaimRecordsResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryClaimRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryClaimRecordsResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryClaimRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryParamsRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryParamsResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryZoneDropRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryZoneDropRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryZoneDropRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryZoneDropRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryZoneDropRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryZoneDropResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryZoneDropResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryZoneDropResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryZoneDropResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryZoneDropResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryZoneDropsRequest(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryZoneDropsRequest)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryZoneDropsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryZoneDropsRequest(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryZoneDropsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_airdrop_v1_QueryZoneDropsResponse(arg) {
  if (!(arg instanceof quicksilver_airdrop_v1_query_pb.QueryZoneDropsResponse)) {
    throw new Error('Expected argument of type quicksilver.airdrop.v1.QueryZoneDropsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_airdrop_v1_QueryZoneDropsResponse(buffer_arg) {
  return quicksilver_airdrop_v1_query_pb.QueryZoneDropsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of airdrop parameters.
params: {
    path: '/quicksilver.airdrop.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryParamsRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryParamsRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryParamsRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryParamsResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryParamsResponse,
  },
  // ZoneDrop returns the details of the specified zone airdrop.
zoneDrop: {
    path: '/quicksilver.airdrop.v1.Query/ZoneDrop',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryZoneDropRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryZoneDropResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryZoneDropRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryZoneDropRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryZoneDropResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryZoneDropResponse,
  },
  // AccountBalance returns the module account balance of the specified zone.
accountBalance: {
    path: '/quicksilver.airdrop.v1.Query/AccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryAccountBalanceRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryAccountBalanceResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryAccountBalanceRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryAccountBalanceRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryAccountBalanceResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryAccountBalanceResponse,
  },
  // ZoneDrops returns all zone airdrops of the specified status.
zoneDrops: {
    path: '/quicksilver.airdrop.v1.Query/ZoneDrops',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryZoneDropsRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryZoneDropsResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryZoneDropsRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryZoneDropsRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryZoneDropsResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryZoneDropsResponse,
  },
  // ClaimRecord returns the claim record that corresponds to the given zone and
// address.
claimRecord: {
    path: '/quicksilver.airdrop.v1.Query/ClaimRecord',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryClaimRecordRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryClaimRecordResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryClaimRecordRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryClaimRecordRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryClaimRecordResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryClaimRecordResponse,
  },
  // ClaimRecords returns all the claim records of the given zone.
claimRecords: {
    path: '/quicksilver.airdrop.v1.Query/ClaimRecords',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_airdrop_v1_query_pb.QueryClaimRecordsRequest,
    responseType: quicksilver_airdrop_v1_query_pb.QueryClaimRecordsResponse,
    requestSerialize: serialize_quicksilver_airdrop_v1_QueryClaimRecordsRequest,
    requestDeserialize: deserialize_quicksilver_airdrop_v1_QueryClaimRecordsRequest,
    responseSerialize: serialize_quicksilver_airdrop_v1_QueryClaimRecordsResponse,
    responseDeserialize: deserialize_quicksilver_airdrop_v1_QueryClaimRecordsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
