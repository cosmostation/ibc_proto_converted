// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quasar_epochs_query_pb = require('../../quasar/epochs/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var quasar_epochs_genesis_pb = require('../../quasar/epochs/genesis_pb.js');

function serialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochRequest(arg) {
  if (!(arg instanceof quasar_epochs_query_pb.QueryCurrentEpochRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.epochs.QueryCurrentEpochRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochRequest(buffer_arg) {
  return quasar_epochs_query_pb.QueryCurrentEpochRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse(arg) {
  if (!(arg instanceof quasar_epochs_query_pb.QueryCurrentEpochResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse(buffer_arg) {
  return quasar_epochs_query_pb.QueryCurrentEpochResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoRequest(arg) {
  if (!(arg instanceof quasar_epochs_query_pb.QueryEpochsInfoRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.epochs.QueryEpochsInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoRequest(buffer_arg) {
  return quasar_epochs_query_pb.QueryEpochsInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoResponse(arg) {
  if (!(arg instanceof quasar_epochs_query_pb.QueryEpochsInfoResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.epochs.QueryEpochsInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoResponse(buffer_arg) {
  return quasar_epochs_query_pb.QueryEpochsInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // EpochInfos provide running epochInfos
epochInfos: {
    path: '/quasarlabs.quasarnode.epochs.Query/EpochInfos',
    requestStream: false,
    responseStream: false,
    requestType: quasar_epochs_query_pb.QueryEpochsInfoRequest,
    responseType: quasar_epochs_query_pb.QueryEpochsInfoResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_epochs_QueryEpochsInfoResponse,
  },
  // CurrentEpoch provide current epoch of specified identifier
currentEpoch: {
    path: '/quasarlabs.quasarnode.epochs.Query/CurrentEpoch',
    requestStream: false,
    responseStream: false,
    requestType: quasar_epochs_query_pb.QueryCurrentEpochRequest,
    responseType: quasar_epochs_query_pb.QueryCurrentEpochResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
