// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_store_streaming_abci_grpc_pb = require('../../../../cosmos/store/streaming/abci/grpc_pb.js');
var tendermint_abci_types_pb = require('../../../../tendermint/abci/types_pb.js');
var cosmos_store_v1beta1_listening_pb = require('../../../../cosmos/store/v1beta1/listening_pb.js');

function serialize_cosmos_store_streaming_abci_ListenCommitRequest(arg) {
  if (!(arg instanceof cosmos_store_streaming_abci_grpc_pb.ListenCommitRequest)) {
    throw new Error('Expected argument of type cosmos.store.streaming.abci.ListenCommitRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_store_streaming_abci_ListenCommitRequest(buffer_arg) {
  return cosmos_store_streaming_abci_grpc_pb.ListenCommitRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_store_streaming_abci_ListenCommitResponse(arg) {
  if (!(arg instanceof cosmos_store_streaming_abci_grpc_pb.ListenCommitResponse)) {
    throw new Error('Expected argument of type cosmos.store.streaming.abci.ListenCommitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_store_streaming_abci_ListenCommitResponse(buffer_arg) {
  return cosmos_store_streaming_abci_grpc_pb.ListenCommitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_store_streaming_abci_ListenFinalizeBlockRequest(arg) {
  if (!(arg instanceof cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockRequest)) {
    throw new Error('Expected argument of type cosmos.store.streaming.abci.ListenFinalizeBlockRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_store_streaming_abci_ListenFinalizeBlockRequest(buffer_arg) {
  return cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_store_streaming_abci_ListenFinalizeBlockResponse(arg) {
  if (!(arg instanceof cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockResponse)) {
    throw new Error('Expected argument of type cosmos.store.streaming.abci.ListenFinalizeBlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_store_streaming_abci_ListenFinalizeBlockResponse(buffer_arg) {
  return cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// ABCIListenerService is the service for the BaseApp ABCIListener interface
//
// Deprecated: Store v1 is deprecated as of v0.50.x, please use Store v2 types
// instead.
var ABCIListenerServiceService = exports.ABCIListenerServiceService = {
  // ListenFinalizeBlock is the corresponding endpoint for
// ABCIListener.ListenEndBlock
listenFinalizeBlock: {
    path: '/cosmos.store.streaming.abci.ABCIListenerService/ListenFinalizeBlock',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockRequest,
    responseType: cosmos_store_streaming_abci_grpc_pb.ListenFinalizeBlockResponse,
    requestSerialize: serialize_cosmos_store_streaming_abci_ListenFinalizeBlockRequest,
    requestDeserialize: deserialize_cosmos_store_streaming_abci_ListenFinalizeBlockRequest,
    responseSerialize: serialize_cosmos_store_streaming_abci_ListenFinalizeBlockResponse,
    responseDeserialize: deserialize_cosmos_store_streaming_abci_ListenFinalizeBlockResponse,
  },
  // ListenCommit is the corresponding endpoint for ABCIListener.ListenCommit
listenCommit: {
    path: '/cosmos.store.streaming.abci.ABCIListenerService/ListenCommit',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_store_streaming_abci_grpc_pb.ListenCommitRequest,
    responseType: cosmos_store_streaming_abci_grpc_pb.ListenCommitResponse,
    requestSerialize: serialize_cosmos_store_streaming_abci_ListenCommitRequest,
    requestDeserialize: deserialize_cosmos_store_streaming_abci_ListenCommitRequest,
    responseSerialize: serialize_cosmos_store_streaming_abci_ListenCommitResponse,
    responseDeserialize: deserialize_cosmos_store_streaming_abci_ListenCommitResponse,
  },
};

exports.ABCIListenerServiceClient = grpc.makeGenericClientConstructor(ABCIListenerServiceService);
