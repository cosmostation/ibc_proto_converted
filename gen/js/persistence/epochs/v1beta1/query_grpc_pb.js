// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var persistence_epochs_v1beta1_query_pb = require('../../../persistence/epochs/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var persistence_epochs_v1beta1_genesis_pb = require('../../../persistence/epochs/v1beta1/genesis_pb.js');

function serialize_persistence_epochs_v1beta1_QueryCurrentEpochRequest(arg) {
  if (!(arg instanceof persistence_epochs_v1beta1_query_pb.QueryCurrentEpochRequest)) {
    throw new Error('Expected argument of type persistence.epochs.v1beta1.QueryCurrentEpochRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_epochs_v1beta1_QueryCurrentEpochRequest(buffer_arg) {
  return persistence_epochs_v1beta1_query_pb.QueryCurrentEpochRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_epochs_v1beta1_QueryCurrentEpochResponse(arg) {
  if (!(arg instanceof persistence_epochs_v1beta1_query_pb.QueryCurrentEpochResponse)) {
    throw new Error('Expected argument of type persistence.epochs.v1beta1.QueryCurrentEpochResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_epochs_v1beta1_QueryCurrentEpochResponse(buffer_arg) {
  return persistence_epochs_v1beta1_query_pb.QueryCurrentEpochResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_epochs_v1beta1_QueryEpochsInfoRequest(arg) {
  if (!(arg instanceof persistence_epochs_v1beta1_query_pb.QueryEpochsInfoRequest)) {
    throw new Error('Expected argument of type persistence.epochs.v1beta1.QueryEpochsInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_epochs_v1beta1_QueryEpochsInfoRequest(buffer_arg) {
  return persistence_epochs_v1beta1_query_pb.QueryEpochsInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_epochs_v1beta1_QueryEpochsInfoResponse(arg) {
  if (!(arg instanceof persistence_epochs_v1beta1_query_pb.QueryEpochsInfoResponse)) {
    throw new Error('Expected argument of type persistence.epochs.v1beta1.QueryEpochsInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_epochs_v1beta1_QueryEpochsInfoResponse(buffer_arg) {
  return persistence_epochs_v1beta1_query_pb.QueryEpochsInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // EpochInfos provide running epochInfos
epochInfos: {
    path: '/persistence.epochs.v1beta1.Query/EpochInfos',
    requestStream: false,
    responseStream: false,
    requestType: persistence_epochs_v1beta1_query_pb.QueryEpochsInfoRequest,
    responseType: persistence_epochs_v1beta1_query_pb.QueryEpochsInfoResponse,
    requestSerialize: serialize_persistence_epochs_v1beta1_QueryEpochsInfoRequest,
    requestDeserialize: deserialize_persistence_epochs_v1beta1_QueryEpochsInfoRequest,
    responseSerialize: serialize_persistence_epochs_v1beta1_QueryEpochsInfoResponse,
    responseDeserialize: deserialize_persistence_epochs_v1beta1_QueryEpochsInfoResponse,
  },
  // CurrentEpoch provide current epoch of specified identifier
currentEpoch: {
    path: '/persistence.epochs.v1beta1.Query/CurrentEpoch',
    requestStream: false,
    responseStream: false,
    requestType: persistence_epochs_v1beta1_query_pb.QueryCurrentEpochRequest,
    responseType: persistence_epochs_v1beta1_query_pb.QueryCurrentEpochResponse,
    requestSerialize: serialize_persistence_epochs_v1beta1_QueryCurrentEpochRequest,
    requestDeserialize: deserialize_persistence_epochs_v1beta1_QueryCurrentEpochRequest,
    responseSerialize: serialize_persistence_epochs_v1beta1_QueryCurrentEpochResponse,
    responseDeserialize: deserialize_persistence_epochs_v1beta1_QueryCurrentEpochResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
