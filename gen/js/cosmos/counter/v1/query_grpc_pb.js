// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_counter_v1_query_pb = require('../../../cosmos/counter/v1/query_pb.js');

function serialize_cosmos_counter_v1_QueryGetCountRequest(arg) {
  if (!(arg instanceof cosmos_counter_v1_query_pb.QueryGetCountRequest)) {
    throw new Error('Expected argument of type cosmos.counter.v1.QueryGetCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_counter_v1_QueryGetCountRequest(buffer_arg) {
  return cosmos_counter_v1_query_pb.QueryGetCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_counter_v1_QueryGetCountResponse(arg) {
  if (!(arg instanceof cosmos_counter_v1_query_pb.QueryGetCountResponse)) {
    throw new Error('Expected argument of type cosmos.counter.v1.QueryGetCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_counter_v1_QueryGetCountResponse(buffer_arg) {
  return cosmos_counter_v1_query_pb.QueryGetCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // GetCount queries the parameters of x/Counter module.
getCount: {
    path: '/cosmos.counter.v1.Query/GetCount',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_counter_v1_query_pb.QueryGetCountRequest,
    responseType: cosmos_counter_v1_query_pb.QueryGetCountResponse,
    requestSerialize: serialize_cosmos_counter_v1_QueryGetCountRequest,
    requestDeserialize: deserialize_cosmos_counter_v1_QueryGetCountRequest,
    responseSerialize: serialize_cosmos_counter_v1_QueryGetCountResponse,
    responseDeserialize: deserialize_cosmos_counter_v1_QueryGetCountResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
