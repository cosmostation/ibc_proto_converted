// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_epochs_query_pb = require('../../stride/epochs/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stride_epochs_genesis_pb = require('../../stride/epochs/genesis_pb.js');

function serialize_stride_epochs_QueryCurrentEpochRequest(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryCurrentEpochRequest)) {
    throw new Error('Expected argument of type stride.epochs.QueryCurrentEpochRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryCurrentEpochRequest(buffer_arg) {
  return stride_epochs_query_pb.QueryCurrentEpochRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_epochs_QueryCurrentEpochResponse(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryCurrentEpochResponse)) {
    throw new Error('Expected argument of type stride.epochs.QueryCurrentEpochResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryCurrentEpochResponse(buffer_arg) {
  return stride_epochs_query_pb.QueryCurrentEpochResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_epochs_QueryEpochInfoRequest(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryEpochInfoRequest)) {
    throw new Error('Expected argument of type stride.epochs.QueryEpochInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryEpochInfoRequest(buffer_arg) {
  return stride_epochs_query_pb.QueryEpochInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_epochs_QueryEpochInfoResponse(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryEpochInfoResponse)) {
    throw new Error('Expected argument of type stride.epochs.QueryEpochInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryEpochInfoResponse(buffer_arg) {
  return stride_epochs_query_pb.QueryEpochInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_epochs_QueryEpochsInfoRequest(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryEpochsInfoRequest)) {
    throw new Error('Expected argument of type stride.epochs.QueryEpochsInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryEpochsInfoRequest(buffer_arg) {
  return stride_epochs_query_pb.QueryEpochsInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_epochs_QueryEpochsInfoResponse(arg) {
  if (!(arg instanceof stride_epochs_query_pb.QueryEpochsInfoResponse)) {
    throw new Error('Expected argument of type stride.epochs.QueryEpochsInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_epochs_QueryEpochsInfoResponse(buffer_arg) {
  return stride_epochs_query_pb.QueryEpochsInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // EpochInfos provide running epochInfos
epochInfos: {
    path: '/stride.epochs.Query/EpochInfos',
    requestStream: false,
    responseStream: false,
    requestType: stride_epochs_query_pb.QueryEpochsInfoRequest,
    responseType: stride_epochs_query_pb.QueryEpochsInfoResponse,
    requestSerialize: serialize_stride_epochs_QueryEpochsInfoRequest,
    requestDeserialize: deserialize_stride_epochs_QueryEpochsInfoRequest,
    responseSerialize: serialize_stride_epochs_QueryEpochsInfoResponse,
    responseDeserialize: deserialize_stride_epochs_QueryEpochsInfoResponse,
  },
  // CurrentEpoch provide current epoch of specified identifier
currentEpoch: {
    path: '/stride.epochs.Query/CurrentEpoch',
    requestStream: false,
    responseStream: false,
    requestType: stride_epochs_query_pb.QueryCurrentEpochRequest,
    responseType: stride_epochs_query_pb.QueryCurrentEpochResponse,
    requestSerialize: serialize_stride_epochs_QueryCurrentEpochRequest,
    requestDeserialize: deserialize_stride_epochs_QueryCurrentEpochRequest,
    responseSerialize: serialize_stride_epochs_QueryCurrentEpochResponse,
    responseDeserialize: deserialize_stride_epochs_QueryCurrentEpochResponse,
  },
  // CurrentEpoch provide current epoch of specified identifier
epochInfo: {
    path: '/stride.epochs.Query/EpochInfo',
    requestStream: false,
    responseStream: false,
    requestType: stride_epochs_query_pb.QueryEpochInfoRequest,
    responseType: stride_epochs_query_pb.QueryEpochInfoResponse,
    requestSerialize: serialize_stride_epochs_QueryEpochInfoRequest,
    requestDeserialize: deserialize_stride_epochs_QueryEpochInfoRequest,
    responseSerialize: serialize_stride_epochs_QueryEpochInfoResponse,
    responseDeserialize: deserialize_stride_epochs_QueryEpochInfoResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
