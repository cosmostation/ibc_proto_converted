// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_snapshot_v1beta1_tx_pb = require('../../../axelar/snapshot/v1beta1/tx_pb.js');
var axelar_tss_v1beta1_tx_pb = require('../../../axelar/tss/v1beta1/tx_pb.js');

function serialize_axelar_tss_v1beta1_HeartBeatRequest(arg) {
  if (!(arg instanceof axelar_tss_v1beta1_tx_pb.HeartBeatRequest)) {
    throw new Error('Expected argument of type axelar.tss.v1beta1.HeartBeatRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_tss_v1beta1_HeartBeatRequest(buffer_arg) {
  return axelar_tss_v1beta1_tx_pb.HeartBeatRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_tss_v1beta1_HeartBeatResponse(arg) {
  if (!(arg instanceof axelar_tss_v1beta1_tx_pb.HeartBeatResponse)) {
    throw new Error('Expected argument of type axelar.tss.v1beta1.HeartBeatResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_tss_v1beta1_HeartBeatResponse(buffer_arg) {
  return axelar_tss_v1beta1_tx_pb.HeartBeatResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the tss Msg service.
var MsgServiceService = exports.MsgServiceService = {
  heartBeat: {
    path: '/axelar.tss.v1beta1.MsgService/HeartBeat',
    requestStream: false,
    responseStream: false,
    requestType: axelar_tss_v1beta1_tx_pb.HeartBeatRequest,
    responseType: axelar_tss_v1beta1_tx_pb.HeartBeatResponse,
    requestSerialize: serialize_axelar_tss_v1beta1_HeartBeatRequest,
    requestDeserialize: deserialize_axelar_tss_v1beta1_HeartBeatRequest,
    responseSerialize: serialize_axelar_tss_v1beta1_HeartBeatResponse,
    responseDeserialize: deserialize_axelar_tss_v1beta1_HeartBeatResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// Query defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
