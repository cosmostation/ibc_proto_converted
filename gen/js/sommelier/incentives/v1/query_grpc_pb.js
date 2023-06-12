// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_incentives_v1_query_pb = require('../../../sommelier/incentives/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sommelier_incentives_v1_genesis_pb = require('../../../sommelier/incentives/v1/genesis_pb.js');

function serialize_incentives_v1_QueryAPYRequest(arg) {
  if (!(arg instanceof sommelier_incentives_v1_query_pb.QueryAPYRequest)) {
    throw new Error('Expected argument of type incentives.v1.QueryAPYRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_incentives_v1_QueryAPYRequest(buffer_arg) {
  return sommelier_incentives_v1_query_pb.QueryAPYRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_incentives_v1_QueryAPYResponse(arg) {
  if (!(arg instanceof sommelier_incentives_v1_query_pb.QueryAPYResponse)) {
    throw new Error('Expected argument of type incentives.v1.QueryAPYResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_incentives_v1_QueryAPYResponse(buffer_arg) {
  return sommelier_incentives_v1_query_pb.QueryAPYResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_incentives_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_incentives_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type incentives.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_incentives_v1_QueryParamsRequest(buffer_arg) {
  return sommelier_incentives_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_incentives_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_incentives_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type incentives.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_incentives_v1_QueryParamsResponse(buffer_arg) {
  return sommelier_incentives_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the cork module.
var QueryService = exports.QueryService = {
  // QueryParams queries the allocation module parameters.
queryParams: {
    path: '/incentives.v1.Query/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_incentives_v1_query_pb.QueryParamsRequest,
    responseType: sommelier_incentives_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_incentives_v1_QueryParamsRequest,
    requestDeserialize: deserialize_incentives_v1_QueryParamsRequest,
    responseSerialize: serialize_incentives_v1_QueryParamsResponse,
    responseDeserialize: deserialize_incentives_v1_QueryParamsResponse,
  },
  // QueryAPY queries the APY returned from the incentives module.
queryAPY: {
    path: '/incentives.v1.Query/QueryAPY',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_incentives_v1_query_pb.QueryAPYRequest,
    responseType: sommelier_incentives_v1_query_pb.QueryAPYResponse,
    requestSerialize: serialize_incentives_v1_QueryAPYRequest,
    requestDeserialize: deserialize_incentives_v1_QueryAPYRequest,
    responseSerialize: serialize_incentives_v1_QueryAPYResponse,
    responseDeserialize: deserialize_incentives_v1_QueryAPYResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
