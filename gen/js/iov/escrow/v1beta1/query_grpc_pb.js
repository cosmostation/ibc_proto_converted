// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var iov_escrow_v1beta1_query_pb = require('../../../iov/escrow/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var iov_escrow_v1beta1_types_pb = require('../../../iov/escrow/v1beta1/types_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_starnamed_x_escrow_v1beta1_QueryEscrowRequest(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_query_pb.QueryEscrowRequest)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.QueryEscrowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_QueryEscrowRequest(buffer_arg) {
  return iov_escrow_v1beta1_query_pb.QueryEscrowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_QueryEscrowResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_query_pb.QueryEscrowResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.QueryEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_QueryEscrowResponse(buffer_arg) {
  return iov_escrow_v1beta1_query_pb.QueryEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_QueryEscrowsRequest(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_query_pb.QueryEscrowsRequest)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.QueryEscrowsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_QueryEscrowsRequest(buffer_arg) {
  return iov_escrow_v1beta1_query_pb.QueryEscrowsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_QueryEscrowsResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_query_pb.QueryEscrowsResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.QueryEscrowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_QueryEscrowsResponse(buffer_arg) {
  return iov_escrow_v1beta1_query_pb.QueryEscrowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Escrow queries the escrow by the specified id
escrow: {
    path: '/starnamed.x.escrow.v1beta1.Query/Escrow',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_query_pb.QueryEscrowRequest,
    responseType: iov_escrow_v1beta1_query_pb.QueryEscrowResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_QueryEscrowRequest,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_QueryEscrowRequest,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_QueryEscrowResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_QueryEscrowResponse,
  },
  // Escrows queries escrows by the specified key-value pairs
escrows: {
    path: '/starnamed.x.escrow.v1beta1.Query/Escrows',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_query_pb.QueryEscrowsRequest,
    responseType: iov_escrow_v1beta1_query_pb.QueryEscrowsResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_QueryEscrowsRequest,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_QueryEscrowsRequest,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_QueryEscrowsResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_QueryEscrowsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
