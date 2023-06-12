// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
//
// Copyright [2019] - [2021], PERSISTENCE TECHNOLOGIES PTE. LTD. and the persistenceCore contributors
// SPDX-License-Identifier: Apache-2.0
//
'use strict';
var grpc = require('grpc');
var persistence_halving_v1beta1_query_pb = require('../../../persistence/halving/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var persistence_halving_v1beta1_halving_pb = require('../../../persistence/halving/v1beta1/halving_pb.js');

function serialize_persistence_halving_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof persistence_halving_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type persistence.halving.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_halving_v1beta1_QueryParamsRequest(buffer_arg) {
  return persistence_halving_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_halving_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof persistence_halving_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type persistence.halving.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_halving_v1beta1_QueryParamsResponse(buffer_arg) {
  return persistence_halving_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of halving parameters.
params: {
    path: '/persistence.halving.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: persistence_halving_v1beta1_query_pb.QueryParamsRequest,
    responseType: persistence_halving_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_persistence_halving_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_persistence_halving_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_persistence_halving_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_persistence_halving_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
