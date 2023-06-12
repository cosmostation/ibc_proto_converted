// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_participationrewards_v1_query_pb = require('../../../quicksilver/participationrewards/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var quicksilver_participationrewards_v1_participationrewards_pb = require('../../../quicksilver/participationrewards/v1/participationrewards_pb.js');

function serialize_quicksilver_participationrewards_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_QueryParamsRequest(buffer_arg) {
  return quicksilver_participationrewards_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_participationrewards_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_QueryParamsResponse(buffer_arg) {
  return quicksilver_participationrewards_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_participationrewards_v1_QueryProtocolDataRequest(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_query_pb.QueryProtocolDataRequest)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.QueryProtocolDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_QueryProtocolDataRequest(buffer_arg) {
  return quicksilver_participationrewards_v1_query_pb.QueryProtocolDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_participationrewards_v1_QueryProtocolDataResponse(arg) {
  if (!(arg instanceof quicksilver_participationrewards_v1_query_pb.QueryProtocolDataResponse)) {
    throw new Error('Expected argument of type quicksilver.participationrewards.v1.QueryProtocolDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_participationrewards_v1_QueryProtocolDataResponse(buffer_arg) {
  return quicksilver_participationrewards_v1_query_pb.QueryProtocolDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of participation rewards parameters.
params: {
    path: '/quicksilver.participationrewards.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_participationrewards_v1_query_pb.QueryParamsRequest,
    responseType: quicksilver_participationrewards_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_quicksilver_participationrewards_v1_QueryParamsRequest,
    requestDeserialize: deserialize_quicksilver_participationrewards_v1_QueryParamsRequest,
    responseSerialize: serialize_quicksilver_participationrewards_v1_QueryParamsResponse,
    responseDeserialize: deserialize_quicksilver_participationrewards_v1_QueryParamsResponse,
  },
  // ProtocolData returns the requested protocol data.
protocolData: {
    path: '/quicksilver.participationrewards.v1.Query/ProtocolData',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_participationrewards_v1_query_pb.QueryProtocolDataRequest,
    responseType: quicksilver_participationrewards_v1_query_pb.QueryProtocolDataResponse,
    requestSerialize: serialize_quicksilver_participationrewards_v1_QueryProtocolDataRequest,
    requestDeserialize: deserialize_quicksilver_participationrewards_v1_QueryProtocolDataRequest,
    responseSerialize: serialize_quicksilver_participationrewards_v1_QueryProtocolDataResponse,
    responseDeserialize: deserialize_quicksilver_participationrewards_v1_QueryProtocolDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
