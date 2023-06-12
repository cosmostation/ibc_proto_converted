// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_oracle_v2alpha1_query_pb = require('../../../panacea/oracle/v2alpha1/query_pb.js');
var panacea_oracle_v2alpha1_oracle_pb = require('../../../panacea/oracle/v2alpha1/oracle_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_panacea_oracle_v2alpha1_QueryOracleRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_query_pb.QueryOracleRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.QueryOracleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_QueryOracleRequest(buffer_arg) {
  return panacea_oracle_v2alpha1_query_pb.QueryOracleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha1_QueryOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_query_pb.QueryOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.QueryOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_QueryOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha1_query_pb.QueryOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Oracle returns a Oracle.
oracle: {
    path: '/panacea.oracle.v2alpha1.Query/Oracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha1_query_pb.QueryOracleRequest,
    responseType: panacea_oracle_v2alpha1_query_pb.QueryOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha1_QueryOracleRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha1_QueryOracleRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha1_QueryOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha1_QueryOracleResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
