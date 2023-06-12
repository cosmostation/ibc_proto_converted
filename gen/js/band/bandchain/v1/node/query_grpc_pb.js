// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var band_bandchain_v1_node_query_pb = require('../../../../band/bandchain/v1/node/query_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');

function serialize_bandchain_v1_node_QueryChainIDRequest(arg) {
  if (!(arg instanceof band_bandchain_v1_node_query_pb.QueryChainIDRequest)) {
    throw new Error('Expected argument of type bandchain.v1.node.QueryChainIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_node_QueryChainIDRequest(buffer_arg) {
  return band_bandchain_v1_node_query_pb.QueryChainIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_node_QueryChainIDResponse(arg) {
  if (!(arg instanceof band_bandchain_v1_node_query_pb.QueryChainIDResponse)) {
    throw new Error('Expected argument of type bandchain.v1.node.QueryChainIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_node_QueryChainIDResponse(buffer_arg) {
  return band_bandchain_v1_node_query_pb.QueryChainIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_node_QueryEVMValidatorsRequest(arg) {
  if (!(arg instanceof band_bandchain_v1_node_query_pb.QueryEVMValidatorsRequest)) {
    throw new Error('Expected argument of type bandchain.v1.node.QueryEVMValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_node_QueryEVMValidatorsRequest(buffer_arg) {
  return band_bandchain_v1_node_query_pb.QueryEVMValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_node_QueryEVMValidatorsResponse(arg) {
  if (!(arg instanceof band_bandchain_v1_node_query_pb.QueryEVMValidatorsResponse)) {
    throw new Error('Expected argument of type bandchain.v1.node.QueryEVMValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_node_QueryEVMValidatorsResponse(buffer_arg) {
  return band_bandchain_v1_node_query_pb.QueryEVMValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service defines the gRPC querier service.
var ServiceService = exports.ServiceService = {
  // ChainID queries the chain ID of this node
chainID: {
    path: '/bandchain.v1.node.Service/ChainID',
    requestStream: false,
    responseStream: false,
    requestType: band_bandchain_v1_node_query_pb.QueryChainIDRequest,
    responseType: band_bandchain_v1_node_query_pb.QueryChainIDResponse,
    requestSerialize: serialize_bandchain_v1_node_QueryChainIDRequest,
    requestDeserialize: deserialize_bandchain_v1_node_QueryChainIDRequest,
    responseSerialize: serialize_bandchain_v1_node_QueryChainIDResponse,
    responseDeserialize: deserialize_bandchain_v1_node_QueryChainIDResponse,
  },
  // EVMValidators queries current list of validator's address and power
eVMValidators: {
    path: '/bandchain.v1.node.Service/EVMValidators',
    requestStream: false,
    responseStream: false,
    requestType: band_bandchain_v1_node_query_pb.QueryEVMValidatorsRequest,
    responseType: band_bandchain_v1_node_query_pb.QueryEVMValidatorsResponse,
    requestSerialize: serialize_bandchain_v1_node_QueryEVMValidatorsRequest,
    requestDeserialize: deserialize_bandchain_v1_node_QueryEVMValidatorsRequest,
    responseSerialize: serialize_bandchain_v1_node_QueryEVMValidatorsResponse,
    responseDeserialize: deserialize_bandchain_v1_node_QueryEVMValidatorsResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
