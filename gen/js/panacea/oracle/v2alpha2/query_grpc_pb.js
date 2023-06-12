// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_oracle_v2alpha2_query_pb = require('../../../panacea/oracle/v2alpha2/query_pb.js');
var panacea_oracle_v2alpha2_oracle_pb = require('../../../panacea/oracle/v2alpha2/oracle_pb.js');
var panacea_oracle_v2alpha2_genesis_pb = require('../../../panacea/oracle/v2alpha2/genesis_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_panacea_oracle_v2alpha2_QueryOracleParamsRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleParamsRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleParamsRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleRegistrationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleRegistrationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOraclesRequest(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOraclesRequest)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOraclesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOraclesRequest(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOraclesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryOraclesResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryOraclesResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryOraclesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryOraclesResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryOraclesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_QueryParamsResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_QueryParamsResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Oracles returns a list of oracles.
oracles: {
    path: '/panacea.oracle.v2alpha2.Query/Oracles',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOraclesRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryOraclesResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOraclesRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOraclesRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryOraclesResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOraclesResponse,
  },
  // Oracle returns a oracle.
oracle: {
    path: '/panacea.oracle.v2alpha2.Query/Oracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOracleRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleResponse,
  },
  // OracleRegistration returns a OracleRegistration details.
oracleRegistration: {
    path: '/panacea.oracle.v2alpha2.Query/OracleRegistration',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse,
  },
  // OracleRegistrationVote a OracleRegistrationVote details.
oracleRegistrationVote: {
    path: '/panacea.oracle.v2alpha2.Query/OracleRegistrationVote',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryOracleRegistrationVoteResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse,
  },
  // Params returns params of oracle module.
params: {
    path: '/panacea.oracle.v2alpha2.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOracleParamsRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryParamsResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleParamsRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleParamsRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryParamsResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryParamsResponse,
  },
  // OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
oracleUpgradeInfo: {
    path: '/panacea.oracle.v2alpha2.Query/OracleUpgradeInfo',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoRequest,
    responseType: panacea_oracle_v2alpha2_query_pb.QueryOracleUpgradeInfoResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest,
    responseSerialize: serialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
