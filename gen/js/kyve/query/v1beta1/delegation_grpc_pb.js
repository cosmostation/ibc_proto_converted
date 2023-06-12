// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_delegation_pb = require('../../../kyve/query/v1beta1/delegation_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_query_v1beta1_query_pb = require('../../../kyve/query/v1beta1/query_pb.js');

function serialize_kyve_query_v1beta1_QueryDelegatorRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryDelegatorRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryDelegatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryDelegatorRequest(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryDelegatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryDelegatorResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryDelegatorResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryDelegatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryDelegatorResponse(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryDelegatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryDelegatorsByStakerRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryDelegatorsByStakerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryDelegatorsByStakerRequest(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryDelegatorsByStakerResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryDelegatorsByStakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryDelegatorsByStakerResponse(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByDelegatorRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByDelegatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByDelegatorRequest(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryStakersByDelegatorResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryStakersByDelegatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryStakersByDelegatorResponse(buffer_arg) {
  return kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryDelegation contains all rpc requests related to direct delegation data
var QueryDelegationService = exports.QueryDelegationService = {
  // Delegator returns delegation information for a specific delegator of a specific staker.
delegator: {
    path: '/kyve.query.v1beta1.QueryDelegation/Delegator',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_delegation_pb.QueryDelegatorRequest,
    responseType: kyve_query_v1beta1_delegation_pb.QueryDelegatorResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryDelegatorRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryDelegatorRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryDelegatorResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryDelegatorResponse,
  },
  // DelegatorsByStaker returns all delegators that have delegated to the given staker
// This query is paginated.
delegatorsByStaker: {
    path: '/kyve.query.v1beta1.QueryDelegation/DelegatorsByStaker',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerRequest,
    responseType: kyve_query_v1beta1_delegation_pb.QueryDelegatorsByStakerResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryDelegatorsByStakerRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryDelegatorsByStakerRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryDelegatorsByStakerResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryDelegatorsByStakerResponse,
  },
  // StakersByPoolAndDelegator returns all stakers the given delegator has delegated to.
// This query is paginated.
stakersByDelegator: {
    path: '/kyve.query.v1beta1.QueryDelegation/StakersByDelegator',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorRequest,
    responseType: kyve_query_v1beta1_delegation_pb.QueryStakersByDelegatorResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryStakersByDelegatorRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByDelegatorRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryStakersByDelegatorResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryStakersByDelegatorResponse,
  },
};

exports.QueryDelegationClient = grpc.makeGenericClientConstructor(QueryDelegationService);
