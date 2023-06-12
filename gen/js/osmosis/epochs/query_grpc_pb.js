// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_epochs_query_pb = require('../../osmosis/epochs/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var osmosis_epochs_genesis_pb = require('../../osmosis/epochs/genesis_pb.js');

function serialize_osmosis_epochs_v1beta1_QueryCurrentEpochRequest(arg) {
  if (!(arg instanceof osmosis_epochs_query_pb.QueryCurrentEpochRequest)) {
    throw new Error('Expected argument of type osmosis.epochs.v1beta1.QueryCurrentEpochRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_epochs_v1beta1_QueryCurrentEpochRequest(buffer_arg) {
  return osmosis_epochs_query_pb.QueryCurrentEpochRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_epochs_v1beta1_QueryCurrentEpochResponse(arg) {
  if (!(arg instanceof osmosis_epochs_query_pb.QueryCurrentEpochResponse)) {
    throw new Error('Expected argument of type osmosis.epochs.v1beta1.QueryCurrentEpochResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_epochs_v1beta1_QueryCurrentEpochResponse(buffer_arg) {
  return osmosis_epochs_query_pb.QueryCurrentEpochResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_epochs_v1beta1_QueryEpochsInfoRequest(arg) {
  if (!(arg instanceof osmosis_epochs_query_pb.QueryEpochsInfoRequest)) {
    throw new Error('Expected argument of type osmosis.epochs.v1beta1.QueryEpochsInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_epochs_v1beta1_QueryEpochsInfoRequest(buffer_arg) {
  return osmosis_epochs_query_pb.QueryEpochsInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_epochs_v1beta1_QueryEpochsInfoResponse(arg) {
  if (!(arg instanceof osmosis_epochs_query_pb.QueryEpochsInfoResponse)) {
    throw new Error('Expected argument of type osmosis.epochs.v1beta1.QueryEpochsInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_epochs_v1beta1_QueryEpochsInfoResponse(buffer_arg) {
  return osmosis_epochs_query_pb.QueryEpochsInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // EpochInfos provide running epochInfos
epochInfos: {
    path: '/osmosis.epochs.v1beta1.Query/EpochInfos',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_epochs_query_pb.QueryEpochsInfoRequest,
    responseType: osmosis_epochs_query_pb.QueryEpochsInfoResponse,
    requestSerialize: serialize_osmosis_epochs_v1beta1_QueryEpochsInfoRequest,
    requestDeserialize: deserialize_osmosis_epochs_v1beta1_QueryEpochsInfoRequest,
    responseSerialize: serialize_osmosis_epochs_v1beta1_QueryEpochsInfoResponse,
    responseDeserialize: deserialize_osmosis_epochs_v1beta1_QueryEpochsInfoResponse,
  },
  // CurrentEpoch provide current epoch of specified identifier
currentEpoch: {
    path: '/osmosis.epochs.v1beta1.Query/CurrentEpoch',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_epochs_query_pb.QueryCurrentEpochRequest,
    responseType: osmosis_epochs_query_pb.QueryCurrentEpochResponse,
    requestSerialize: serialize_osmosis_epochs_v1beta1_QueryCurrentEpochRequest,
    requestDeserialize: deserialize_osmosis_epochs_v1beta1_QueryCurrentEpochRequest,
    responseSerialize: serialize_osmosis_epochs_v1beta1_QueryCurrentEpochResponse,
    responseDeserialize: deserialize_osmosis_epochs_v1beta1_QueryCurrentEpochResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
