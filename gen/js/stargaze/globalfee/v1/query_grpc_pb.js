// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_globalfee_v1_query_pb = require('../../../stargaze/globalfee/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var stargaze_globalfee_v1_globalfee_pb = require('../../../stargaze/globalfee/v1/globalfee_pb.js');

function serialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsRequest(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryAuthorizationsRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsRequest(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryAuthorizationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryAuthorizationsResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsResponse(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryAuthorizationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationRequest(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationRequest(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationRequest(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryContractAuthorizationRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationRequest(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryContractAuthorizationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryContractAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryContractAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryParamsRequest(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_QueryParamsResponse(buffer_arg) {
  return stargaze_globalfee_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  codeAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Query/CodeAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationRequest,
    responseType: stargaze_globalfee_v1_query_pb.QueryCodeAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationRequest,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryCodeAuthorizationResponse,
  },
  contractAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Query/ContractAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_query_pb.QueryContractAuthorizationRequest,
    responseType: stargaze_globalfee_v1_query_pb.QueryContractAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationRequest,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryContractAuthorizationResponse,
  },
  params: {
    path: '/publicawesome.stargaze.globalfee.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_query_pb.QueryParamsRequest,
    responseType: stargaze_globalfee_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryParamsRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryParamsRequest,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryParamsResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryParamsResponse,
  },
  authorizations: {
    path: '/publicawesome.stargaze.globalfee.v1.Query/Authorizations',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_query_pb.QueryAuthorizationsRequest,
    responseType: stargaze_globalfee_v1_query_pb.QueryAuthorizationsResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsRequest,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsRequest,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_QueryAuthorizationsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
