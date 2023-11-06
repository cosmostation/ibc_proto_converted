// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.43
'use strict';
var grpc = require('grpc');
var cosmos_feegrant_v1beta1_query_pb = require('../../../cosmos/feegrant/v1beta1/query_pb.js');
var cosmos_feegrant_v1beta1_feegrant_pb = require('../../../cosmos/feegrant/v1beta1/feegrant_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_cosmos_feegrant_v1beta1_QueryAllowanceRequest(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowanceRequest)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowanceRequest(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_feegrant_v1beta1_QueryAllowanceResponse(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowanceResponse)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowanceResponse(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterRequest)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowancesByGranterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterResponse)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowancesByGranterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_feegrant_v1beta1_QueryAllowancesRequest(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowancesRequest)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowancesRequest(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_feegrant_v1beta1_QueryAllowancesResponse(arg) {
  if (!(arg instanceof cosmos_feegrant_v1beta1_query_pb.QueryAllowancesResponse)) {
    throw new Error('Expected argument of type cosmos.feegrant.v1beta1.QueryAllowancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_feegrant_v1beta1_QueryAllowancesResponse(buffer_arg) {
  return cosmos_feegrant_v1beta1_query_pb.QueryAllowancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Allowance returns granted allwance to the grantee by the granter.
allowance: {
    path: '/cosmos.feegrant.v1beta1.Query/Allowance',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_feegrant_v1beta1_query_pb.QueryAllowanceRequest,
    responseType: cosmos_feegrant_v1beta1_query_pb.QueryAllowanceResponse,
    requestSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowanceRequest,
    requestDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowanceRequest,
    responseSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowanceResponse,
    responseDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowanceResponse,
  },
  // Allowances returns all the grants for the given grantee address.
allowances: {
    path: '/cosmos.feegrant.v1beta1.Query/Allowances',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_feegrant_v1beta1_query_pb.QueryAllowancesRequest,
    responseType: cosmos_feegrant_v1beta1_query_pb.QueryAllowancesResponse,
    requestSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowancesRequest,
    requestDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowancesRequest,
    responseSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowancesResponse,
    responseDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowancesResponse,
  },
  // AllowancesByGranter returns all the grants given by an address
//
// Since: cosmos-sdk 0.46
allowancesByGranter: {
    path: '/cosmos.feegrant.v1beta1.Query/AllowancesByGranter',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterRequest,
    responseType: cosmos_feegrant_v1beta1_query_pb.QueryAllowancesByGranterResponse,
    requestSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest,
    requestDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest,
    responseSerialize: serialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse,
    responseDeserialize: deserialize_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
