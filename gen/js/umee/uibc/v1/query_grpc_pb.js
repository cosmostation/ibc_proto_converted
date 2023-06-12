// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_uibc_v1_query_pb = require('../../../umee/uibc/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var umee_uibc_v1_quota_pb = require('../../../umee/uibc/v1/quota_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_umee_uibc_v1_QueryAllOutflows(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryAllOutflows)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryAllOutflows');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryAllOutflows(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryAllOutflows.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_QueryAllOutflowsResponse(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryAllOutflowsResponse)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryAllOutflowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryAllOutflowsResponse(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryAllOutflowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_QueryOutflows(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryOutflows)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryOutflows');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryOutflows(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryOutflows.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_QueryOutflowsResponse(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryOutflowsResponse)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryOutflowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryOutflowsResponse(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryOutflowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_QueryParams(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryParams)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryParams(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof umee_uibc_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type umee.uibc.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_QueryParamsResponse(buffer_arg) {
  return umee_uibc_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of the x/uibc module.
params: {
    path: '/umee.uibc.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: umee_uibc_v1_query_pb.QueryParams,
    responseType: umee_uibc_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_umee_uibc_v1_QueryParams,
    requestDeserialize: deserialize_umee_uibc_v1_QueryParams,
    responseSerialize: serialize_umee_uibc_v1_QueryParamsResponse,
    responseDeserialize: deserialize_umee_uibc_v1_QueryParamsResponse,
  },
  // Outflow returns IBC denom outflows in the current quota period.
// If denom is not specified, returns sum of all registered outflows.
outflows: {
    path: '/umee.uibc.v1.Query/Outflows',
    requestStream: false,
    responseStream: false,
    requestType: umee_uibc_v1_query_pb.QueryOutflows,
    responseType: umee_uibc_v1_query_pb.QueryOutflowsResponse,
    requestSerialize: serialize_umee_uibc_v1_QueryOutflows,
    requestDeserialize: deserialize_umee_uibc_v1_QueryOutflows,
    responseSerialize: serialize_umee_uibc_v1_QueryOutflowsResponse,
    responseDeserialize: deserialize_umee_uibc_v1_QueryOutflowsResponse,
  },
  // AllOutflow returns outflows for each denom in the current quota period.
allOutflows: {
    path: '/umee.uibc.v1.Query/AllOutflows',
    requestStream: false,
    responseStream: false,
    requestType: umee_uibc_v1_query_pb.QueryAllOutflows,
    responseType: umee_uibc_v1_query_pb.QueryAllOutflowsResponse,
    requestSerialize: serialize_umee_uibc_v1_QueryAllOutflows,
    requestDeserialize: deserialize_umee_uibc_v1_QueryAllOutflows,
    responseSerialize: serialize_umee_uibc_v1_QueryAllOutflowsResponse,
    responseDeserialize: deserialize_umee_uibc_v1_QueryAllOutflowsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
