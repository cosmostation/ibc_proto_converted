// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cryptoorg_nft_transfer_v1_query_pb = require('../../../cryptoorg/nft_transfer/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cryptoorg_nft_transfer_v1_trace_pb = require('../../../cryptoorg/nft_transfer/v1/trace_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_chainmain_nft_transfer_v1_QueryClassHashRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassHashRequest)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassHashRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassHashRequest(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassHashRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryClassHashResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassHashResponse)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassHashResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassHashResponse(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassHashResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryClassTraceRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceRequest)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassTraceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassTraceRequest(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryClassTraceResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceResponse)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassTraceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassTraceResponse(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryClassTracesRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesRequest)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassTracesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassTracesRequest(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryClassTracesResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesResponse)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryClassTracesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryClassTracesResponse(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryEscrowAddressRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressRequest)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryEscrowAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryEscrowAddressRequest(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_QueryEscrowAddressResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressResponse)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.QueryEscrowAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_QueryEscrowAddressResponse(buffer_arg) {
  return cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ClassTrace queries a class trace information.
classTrace: {
    path: '/chainmain.nft_transfer.v1.Query/ClassTrace',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceRequest,
    responseType: cryptoorg_nft_transfer_v1_query_pb.QueryClassTraceResponse,
    requestSerialize: serialize_chainmain_nft_transfer_v1_QueryClassTraceRequest,
    requestDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassTraceRequest,
    responseSerialize: serialize_chainmain_nft_transfer_v1_QueryClassTraceResponse,
    responseDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassTraceResponse,
  },
  // ClassTraces queries all class traces.
classTraces: {
    path: '/chainmain.nft_transfer.v1.Query/ClassTraces',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesRequest,
    responseType: cryptoorg_nft_transfer_v1_query_pb.QueryClassTracesResponse,
    requestSerialize: serialize_chainmain_nft_transfer_v1_QueryClassTracesRequest,
    requestDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassTracesRequest,
    responseSerialize: serialize_chainmain_nft_transfer_v1_QueryClassTracesResponse,
    responseDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassTracesResponse,
  },
  // ClassHash queries a class hash information.
classHash: {
    path: '/chainmain.nft_transfer.v1.Query/ClassHash',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_transfer_v1_query_pb.QueryClassHashRequest,
    responseType: cryptoorg_nft_transfer_v1_query_pb.QueryClassHashResponse,
    requestSerialize: serialize_chainmain_nft_transfer_v1_QueryClassHashRequest,
    requestDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassHashRequest,
    responseSerialize: serialize_chainmain_nft_transfer_v1_QueryClassHashResponse,
    responseDeserialize: deserialize_chainmain_nft_transfer_v1_QueryClassHashResponse,
  },
  // EscrowAddress returns the escrow address for a particular port and channel id.
escrowAddress: {
    path: '/chainmain.nft_transfer.v1.Query/EscrowAddress',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressRequest,
    responseType: cryptoorg_nft_transfer_v1_query_pb.QueryEscrowAddressResponse,
    requestSerialize: serialize_chainmain_nft_transfer_v1_QueryEscrowAddressRequest,
    requestDeserialize: deserialize_chainmain_nft_transfer_v1_QueryEscrowAddressRequest,
    responseSerialize: serialize_chainmain_nft_transfer_v1_QueryEscrowAddressResponse,
    responseDeserialize: deserialize_chainmain_nft_transfer_v1_QueryEscrowAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
