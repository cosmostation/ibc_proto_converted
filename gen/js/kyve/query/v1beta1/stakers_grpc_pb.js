// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_stakers_pb = require('../../../kyve/query/v1beta1/stakers_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_query_v1beta1_query_pb = require('../../../kyve/query/v1beta1/query_pb.js');
var kyve_stakers_v1beta1_stakers_pb = require('../../../kyve/stakers/v1beta1/stakers_pb.js');

function serialize_kyve_query_v1beta1_QueryStakerRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakerRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakerRequest(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakerResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakerResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakerResponse(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByPoolCountRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByPoolCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByPoolCountRequest(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByPoolCountResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByPoolCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByPoolCountResponse(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByPoolRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersByPoolRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByPoolRequest(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersByPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByPoolResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersByPoolResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByPoolResponse(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersByPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersRequest(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_stakers_pb.QueryStakersResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersResponse(buffer_arg) {
  return kyve_query_v1beta1_stakers_pb.QueryStakersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryStakers ...
var QueryStakersService = exports.QueryStakersService = {
  // Stakers queries for all stakers.
stakers: {
    path: '/kyve.query.v1beta1.QueryStakers/Stakers',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_stakers_pb.QueryStakersRequest,
    responseType: kyve_query_v1beta1_stakers_pb.QueryStakersResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryStakersRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryStakersRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryStakersResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryStakersResponse,
  },
  // Staker queries for all stakers.
staker: {
    path: '/kyve.query.v1beta1.QueryStakers/Staker',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_stakers_pb.QueryStakerRequest,
    responseType: kyve_query_v1beta1_stakers_pb.QueryStakerResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryStakerRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryStakerRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryStakerResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryStakerResponse,
  },
  // StakersByPool queries for all stakers that are currently participating in the given pool
stakersByPool: {
    path: '/kyve.query.v1beta1.QueryStakers/StakersByPool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_stakers_pb.QueryStakersByPoolRequest,
    responseType: kyve_query_v1beta1_stakers_pb.QueryStakersByPoolResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryStakersByPoolRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByPoolRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryStakersByPoolResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByPoolResponse,
  },
  // StakersByPool queries for all stakers and sorted them first by number of pools participating and
// then by delegation
stakersByPoolCount: {
    path: '/kyve.query.v1beta1.QueryStakers/StakersByPoolCount',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountRequest,
    responseType: kyve_query_v1beta1_stakers_pb.QueryStakersByPoolCountResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryStakersByPoolCountRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByPoolCountRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryStakersByPoolCountResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByPoolCountResponse,
  },
};

exports.QueryStakersClient = grpc.makeGenericClientConstructor(QueryStakersService);
