// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rvote_query_pb = require('../../stafihub/rvote/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_stafihub_stafihub_rvote_QueryGetProposalLifeRequest(arg) {
  if (!(arg instanceof stafihub_rvote_query_pb.QueryGetProposalLifeRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.QueryGetProposalLifeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_QueryGetProposalLifeRequest(buffer_arg) {
  return stafihub_rvote_query_pb.QueryGetProposalLifeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_QueryGetProposalLifeResponse(arg) {
  if (!(arg instanceof stafihub_rvote_query_pb.QueryGetProposalLifeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.QueryGetProposalLifeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_QueryGetProposalLifeResponse(buffer_arg) {
  return stafihub_rvote_query_pb.QueryGetProposalLifeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_QueryGetProposalRequest(arg) {
  if (!(arg instanceof stafihub_rvote_query_pb.QueryGetProposalRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.QueryGetProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_QueryGetProposalRequest(buffer_arg) {
  return stafihub_rvote_query_pb.QueryGetProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvote_QueryGetProposalResponse(arg) {
  if (!(arg instanceof stafihub_rvote_query_pb.QueryGetProposalResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvote.QueryGetProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvote_QueryGetProposalResponse(buffer_arg) {
  return stafihub_rvote_query_pb.QueryGetProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries a list of getProposal items.
getProposal: {
    path: '/stafihub.stafihub.rvote.Query/GetProposal',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvote_query_pb.QueryGetProposalRequest,
    responseType: stafihub_rvote_query_pb.QueryGetProposalResponse,
    requestSerialize: serialize_stafihub_stafihub_rvote_QueryGetProposalRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvote_QueryGetProposalRequest,
    responseSerialize: serialize_stafihub_stafihub_rvote_QueryGetProposalResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvote_QueryGetProposalResponse,
  },
  // Queries a list of getProposalLife items.
getProposalLife: {
    path: '/stafihub.stafihub.rvote.Query/GetProposalLife',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvote_query_pb.QueryGetProposalLifeRequest,
    responseType: stafihub_rvote_query_pb.QueryGetProposalLifeResponse,
    requestSerialize: serialize_stafihub_stafihub_rvote_QueryGetProposalLifeRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rvote_QueryGetProposalLifeRequest,
    responseSerialize: serialize_stafihub_stafihub_rvote_QueryGetProposalLifeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvote_QueryGetProposalLifeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
