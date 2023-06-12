// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rvalidator_query_pb = require('../../stafihub/rvalidator/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_rvalidator_params_pb = require('../../stafihub/rvalidator/params_pb.js');
var stafihub_rvalidator_genesis_pb = require('../../stafihub/rvalidator/genesis_pb.js');

function serialize_stafihub_stafihub_rvalidator_QueryCycleSecondsRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryCycleSecondsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryCycleSecondsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryCycleSecondsRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryCycleSecondsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryCycleSecondsResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryCycleSecondsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryCycleSecondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryCycleSecondsResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryCycleSecondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryLatestDealedCycleRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryLatestDealedCycleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryLatestDealedCycleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryLatestDealedCycleResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryLatestDealedCycleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryLatestDealedCycleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryLatestVotedCycleRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryLatestVotedCycleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryLatestVotedCycleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryLatestVotedCycleResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryLatestVotedCycleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryParamsRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryParamsResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryRValidatorListRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryRValidatorListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryRValidatorListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryRValidatorListRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryRValidatorListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryRValidatorListResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryRValidatorListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryRValidatorListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryRValidatorListResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryRValidatorListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsRequest(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryShuffleSecondsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryShuffleSecondsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsRequest(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryShuffleSecondsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_query_pb.QueryShuffleSecondsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.QueryShuffleSecondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsResponse(buffer_arg) {
  return stafihub_rvalidator_query_pb.QueryShuffleSecondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.rvalidator.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryParamsRequest,
    responseType: stafihub_rvalidator_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryParamsResponse,
  },
  // Queries a list of RValidatorList items.
rValidatorList: {
    path: '/stafihub.stafihub.rvalidator.Query/RValidatorList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryRValidatorListRequest,
    responseType: stafihub_rvalidator_query_pb.QueryRValidatorListResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryRValidatorListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryRValidatorListRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryRValidatorListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryRValidatorListResponse,
  },
  // Queries a list of CycleSeconds items.
cycleSeconds: {
    path: '/stafihub.stafihub.rvalidator.Query/CycleSeconds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryCycleSecondsRequest,
    responseType: stafihub_rvalidator_query_pb.QueryCycleSecondsResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryCycleSecondsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryCycleSecondsRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryCycleSecondsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryCycleSecondsResponse,
  },
  // Queries a list of ShuffleSeconds items.
shuffleSeconds: {
    path: '/stafihub.stafihub.rvalidator.Query/ShuffleSeconds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryShuffleSecondsRequest,
    responseType: stafihub_rvalidator_query_pb.QueryShuffleSecondsResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryShuffleSecondsResponse,
  },
  // Queries a list of LatestVotedCycle items.
latestVotedCycle: {
    path: '/stafihub.stafihub.rvalidator.Query/LatestVotedCycle',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryLatestVotedCycleRequest,
    responseType: stafihub_rvalidator_query_pb.QueryLatestVotedCycleResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryLatestVotedCycleResponse,
  },
  // Queries a list of LatestDealedCycle items.
latestDealedCycle: {
    path: '/stafihub.stafihub.rvalidator.Query/LatestDealedCycle',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_query_pb.QueryLatestDealedCycleRequest,
    responseType: stafihub_rvalidator_query_pb.QueryLatestDealedCycleResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleRequest,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_QueryLatestDealedCycleResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
