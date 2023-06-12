// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_autocli_v1_query_pb = require('../../../cosmos/autocli/v1/query_pb.js');
var cosmos_autocli_v1_options_pb = require('../../../cosmos/autocli/v1/options_pb.js');
var cosmos_query_v1_query_pb = require('../../../cosmos/query/v1/query_pb.js');

function serialize_cosmos_autocli_v1_AppOptionsRequest(arg) {
  if (!(arg instanceof cosmos_autocli_v1_query_pb.AppOptionsRequest)) {
    throw new Error('Expected argument of type cosmos.autocli.v1.AppOptionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_autocli_v1_AppOptionsRequest(buffer_arg) {
  return cosmos_autocli_v1_query_pb.AppOptionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_autocli_v1_AppOptionsResponse(arg) {
  if (!(arg instanceof cosmos_autocli_v1_query_pb.AppOptionsResponse)) {
    throw new Error('Expected argument of type cosmos.autocli.v1.AppOptionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_autocli_v1_AppOptionsResponse(buffer_arg) {
  return cosmos_autocli_v1_query_pb.AppOptionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// RemoteInfoService provides clients with the information they need
// to build dynamically CLI clients for remote chains.
var QueryService = exports.QueryService = {
  // AppOptions returns the autocli options for all of the modules in an app.
appOptions: {
    path: '/cosmos.autocli.v1.Query/AppOptions',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_autocli_v1_query_pb.AppOptionsRequest,
    responseType: cosmos_autocli_v1_query_pb.AppOptionsResponse,
    requestSerialize: serialize_cosmos_autocli_v1_AppOptionsRequest,
    requestDeserialize: deserialize_cosmos_autocli_v1_AppOptionsRequest,
    responseSerialize: serialize_cosmos_autocli_v1_AppOptionsResponse,
    responseDeserialize: deserialize_cosmos_autocli_v1_AppOptionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
