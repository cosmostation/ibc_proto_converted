// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_base_node_v1beta1_query_pb = require('../../../../cosmos/base/node/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');

function serialize_cosmos_base_node_v1beta1_ConfigRequest(arg) {
  if (!(arg instanceof cosmos_base_node_v1beta1_query_pb.ConfigRequest)) {
    throw new Error('Expected argument of type cosmos.base.node.v1beta1.ConfigRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_base_node_v1beta1_ConfigRequest(buffer_arg) {
  return cosmos_base_node_v1beta1_query_pb.ConfigRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_base_node_v1beta1_ConfigResponse(arg) {
  if (!(arg instanceof cosmos_base_node_v1beta1_query_pb.ConfigResponse)) {
    throw new Error('Expected argument of type cosmos.base.node.v1beta1.ConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_base_node_v1beta1_ConfigResponse(buffer_arg) {
  return cosmos_base_node_v1beta1_query_pb.ConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service defines the gRPC querier service for node related queries.
var ServiceService = exports.ServiceService = {
  // Config queries for the operator configuration.
config: {
    path: '/cosmos.base.node.v1beta1.Service/Config',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_base_node_v1beta1_query_pb.ConfigRequest,
    responseType: cosmos_base_node_v1beta1_query_pb.ConfigResponse,
    requestSerialize: serialize_cosmos_base_node_v1beta1_ConfigRequest,
    requestDeserialize: deserialize_cosmos_base_node_v1beta1_ConfigRequest,
    responseSerialize: serialize_cosmos_base_node_v1beta1_ConfigResponse,
    responseDeserialize: deserialize_cosmos_base_node_v1beta1_ConfigResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
