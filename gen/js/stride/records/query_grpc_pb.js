// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_records_query_pb = require('../../stride/records/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stride_records_genesis_pb = require('../../stride/records/genesis_pb.js');

function serialize_stride_records_QueryAllDepositRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllDepositRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryAllDepositRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllDepositRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryAllDepositRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllDepositRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllDepositRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryAllDepositRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllDepositRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryAllDepositRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllEpochUnbondingRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllEpochUnbondingRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryAllEpochUnbondingRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllEpochUnbondingRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryAllEpochUnbondingRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllEpochUnbondingRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllEpochUnbondingRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryAllEpochUnbondingRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllEpochUnbondingRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryAllEpochUnbondingRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllUserRedemptionRecordForUserRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllUserRedemptionRecordForUserRequest)) {
    throw new Error('Expected argument of type stride.records.QueryAllUserRedemptionRecordForUserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllUserRedemptionRecordForUserRequest(buffer_arg) {
  return stride_records_query_pb.QueryAllUserRedemptionRecordForUserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllUserRedemptionRecordForUserResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllUserRedemptionRecordForUserResponse)) {
    throw new Error('Expected argument of type stride.records.QueryAllUserRedemptionRecordForUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllUserRedemptionRecordForUserResponse(buffer_arg) {
  return stride_records_query_pb.QueryAllUserRedemptionRecordForUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllUserRedemptionRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllUserRedemptionRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryAllUserRedemptionRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllUserRedemptionRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryAllUserRedemptionRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryAllUserRedemptionRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryAllUserRedemptionRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryAllUserRedemptionRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryAllUserRedemptionRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryAllUserRedemptionRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryDepositRecordByHostRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryDepositRecordByHostRequest)) {
    throw new Error('Expected argument of type stride.records.QueryDepositRecordByHostRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryDepositRecordByHostRequest(buffer_arg) {
  return stride_records_query_pb.QueryDepositRecordByHostRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryDepositRecordByHostResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryDepositRecordByHostResponse)) {
    throw new Error('Expected argument of type stride.records.QueryDepositRecordByHostResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryDepositRecordByHostResponse(buffer_arg) {
  return stride_records_query_pb.QueryDepositRecordByHostResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetDepositRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetDepositRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryGetDepositRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetDepositRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryGetDepositRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetDepositRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetDepositRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryGetDepositRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetDepositRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryGetDepositRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetEpochUnbondingRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetEpochUnbondingRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryGetEpochUnbondingRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetEpochUnbondingRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryGetEpochUnbondingRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetEpochUnbondingRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetEpochUnbondingRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryGetEpochUnbondingRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetEpochUnbondingRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryGetEpochUnbondingRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetUserRedemptionRecordRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetUserRedemptionRecordRequest)) {
    throw new Error('Expected argument of type stride.records.QueryGetUserRedemptionRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetUserRedemptionRecordRequest(buffer_arg) {
  return stride_records_query_pb.QueryGetUserRedemptionRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryGetUserRedemptionRecordResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryGetUserRedemptionRecordResponse)) {
    throw new Error('Expected argument of type stride.records.QueryGetUserRedemptionRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryGetUserRedemptionRecordResponse(buffer_arg) {
  return stride_records_query_pb.QueryGetUserRedemptionRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.records.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryParamsRequest(buffer_arg) {
  return stride_records_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_records_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_records_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.records.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_records_QueryParamsResponse(buffer_arg) {
  return stride_records_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stride.records.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryParamsRequest,
    responseType: stride_records_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_records_QueryParamsRequest,
    requestDeserialize: deserialize_stride_records_QueryParamsRequest,
    responseSerialize: serialize_stride_records_QueryParamsResponse,
    responseDeserialize: deserialize_stride_records_QueryParamsResponse,
  },
  // Queries a UserRedemptionRecord by id.
userRedemptionRecord: {
    path: '/stride.records.Query/UserRedemptionRecord',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryGetUserRedemptionRecordRequest,
    responseType: stride_records_query_pb.QueryGetUserRedemptionRecordResponse,
    requestSerialize: serialize_stride_records_QueryGetUserRedemptionRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryGetUserRedemptionRecordRequest,
    responseSerialize: serialize_stride_records_QueryGetUserRedemptionRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryGetUserRedemptionRecordResponse,
  },
  // Queries a list of UserRedemptionRecord items.
userRedemptionRecordAll: {
    path: '/stride.records.Query/UserRedemptionRecordAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryAllUserRedemptionRecordRequest,
    responseType: stride_records_query_pb.QueryAllUserRedemptionRecordResponse,
    requestSerialize: serialize_stride_records_QueryAllUserRedemptionRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryAllUserRedemptionRecordRequest,
    responseSerialize: serialize_stride_records_QueryAllUserRedemptionRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryAllUserRedemptionRecordResponse,
  },
  // Queries a list of UserRedemptionRecord items by chainId / userId pair.
userRedemptionRecordForUser: {
    path: '/stride.records.Query/UserRedemptionRecordForUser',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryAllUserRedemptionRecordForUserRequest,
    responseType: stride_records_query_pb.QueryAllUserRedemptionRecordForUserResponse,
    requestSerialize: serialize_stride_records_QueryAllUserRedemptionRecordForUserRequest,
    requestDeserialize: deserialize_stride_records_QueryAllUserRedemptionRecordForUserRequest,
    responseSerialize: serialize_stride_records_QueryAllUserRedemptionRecordForUserResponse,
    responseDeserialize: deserialize_stride_records_QueryAllUserRedemptionRecordForUserResponse,
  },
  // Queries a EpochUnbondingRecord by id.
epochUnbondingRecord: {
    path: '/stride.records.Query/EpochUnbondingRecord',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryGetEpochUnbondingRecordRequest,
    responseType: stride_records_query_pb.QueryGetEpochUnbondingRecordResponse,
    requestSerialize: serialize_stride_records_QueryGetEpochUnbondingRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryGetEpochUnbondingRecordRequest,
    responseSerialize: serialize_stride_records_QueryGetEpochUnbondingRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryGetEpochUnbondingRecordResponse,
  },
  // Queries a list of EpochUnbondingRecord items.
epochUnbondingRecordAll: {
    path: '/stride.records.Query/EpochUnbondingRecordAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryAllEpochUnbondingRecordRequest,
    responseType: stride_records_query_pb.QueryAllEpochUnbondingRecordResponse,
    requestSerialize: serialize_stride_records_QueryAllEpochUnbondingRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryAllEpochUnbondingRecordRequest,
    responseSerialize: serialize_stride_records_QueryAllEpochUnbondingRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryAllEpochUnbondingRecordResponse,
  },
  // this line is used by starport scaffolding # 2
//
// Queries a DepositRecord by id.
depositRecord: {
    path: '/stride.records.Query/DepositRecord',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryGetDepositRecordRequest,
    responseType: stride_records_query_pb.QueryGetDepositRecordResponse,
    requestSerialize: serialize_stride_records_QueryGetDepositRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryGetDepositRecordRequest,
    responseSerialize: serialize_stride_records_QueryGetDepositRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryGetDepositRecordResponse,
  },
  // Queries a list of DepositRecord items.
depositRecordAll: {
    path: '/stride.records.Query/DepositRecordAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryAllDepositRecordRequest,
    responseType: stride_records_query_pb.QueryAllDepositRecordResponse,
    requestSerialize: serialize_stride_records_QueryAllDepositRecordRequest,
    requestDeserialize: deserialize_stride_records_QueryAllDepositRecordRequest,
    responseSerialize: serialize_stride_records_QueryAllDepositRecordResponse,
    responseDeserialize: deserialize_stride_records_QueryAllDepositRecordResponse,
  },
  // Queries a list of DepositRecord items for a given host zone
depositRecordByHost: {
    path: '/stride.records.Query/DepositRecordByHost',
    requestStream: false,
    responseStream: false,
    requestType: stride_records_query_pb.QueryDepositRecordByHostRequest,
    responseType: stride_records_query_pb.QueryDepositRecordByHostResponse,
    requestSerialize: serialize_stride_records_QueryDepositRecordByHostRequest,
    requestDeserialize: deserialize_stride_records_QueryDepositRecordByHostRequest,
    responseSerialize: serialize_stride_records_QueryDepositRecordByHostResponse,
    responseDeserialize: deserialize_stride_records_QueryDepositRecordByHostResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
