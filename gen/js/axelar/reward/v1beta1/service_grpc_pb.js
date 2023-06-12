// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_reward_v1beta1_tx_pb = require('../../../axelar/reward/v1beta1/tx_pb.js');
var axelar_reward_v1beta1_query_pb = require('../../../axelar/reward/v1beta1/query_pb.js');

function serialize_axelar_reward_v1beta1_InflationRateRequest(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_query_pb.InflationRateRequest)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.InflationRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_InflationRateRequest(buffer_arg) {
  return axelar_reward_v1beta1_query_pb.InflationRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_reward_v1beta1_InflationRateResponse(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_query_pb.InflationRateResponse)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.InflationRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_InflationRateResponse(buffer_arg) {
  return axelar_reward_v1beta1_query_pb.InflationRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_reward_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_ParamsRequest(buffer_arg) {
  return axelar_reward_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_reward_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_ParamsResponse(buffer_arg) {
  return axelar_reward_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_reward_v1beta1_RefundMsgRequest(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_tx_pb.RefundMsgRequest)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.RefundMsgRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_RefundMsgRequest(buffer_arg) {
  return axelar_reward_v1beta1_tx_pb.RefundMsgRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_reward_v1beta1_RefundMsgResponse(arg) {
  if (!(arg instanceof axelar_reward_v1beta1_tx_pb.RefundMsgResponse)) {
    throw new Error('Expected argument of type axelar.reward.v1beta1.RefundMsgResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_reward_v1beta1_RefundMsgResponse(buffer_arg) {
  return axelar_reward_v1beta1_tx_pb.RefundMsgResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the axelarnet Msg service.
var MsgServiceService = exports.MsgServiceService = {
  refundMsg: {
    path: '/axelar.reward.v1beta1.MsgService/RefundMsg',
    requestStream: false,
    responseStream: false,
    requestType: axelar_reward_v1beta1_tx_pb.RefundMsgRequest,
    responseType: axelar_reward_v1beta1_tx_pb.RefundMsgResponse,
    requestSerialize: serialize_axelar_reward_v1beta1_RefundMsgRequest,
    requestDeserialize: deserialize_axelar_reward_v1beta1_RefundMsgRequest,
    responseSerialize: serialize_axelar_reward_v1beta1_RefundMsgResponse,
    responseDeserialize: deserialize_axelar_reward_v1beta1_RefundMsgResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// QueryService defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
  inflationRate: {
    path: '/axelar.reward.v1beta1.QueryService/InflationRate',
    requestStream: false,
    responseStream: false,
    requestType: axelar_reward_v1beta1_query_pb.InflationRateRequest,
    responseType: axelar_reward_v1beta1_query_pb.InflationRateResponse,
    requestSerialize: serialize_axelar_reward_v1beta1_InflationRateRequest,
    requestDeserialize: deserialize_axelar_reward_v1beta1_InflationRateRequest,
    responseSerialize: serialize_axelar_reward_v1beta1_InflationRateResponse,
    responseDeserialize: deserialize_axelar_reward_v1beta1_InflationRateResponse,
  },
  params: {
    path: '/axelar.reward.v1beta1.QueryService/Params',
    requestStream: false,
    responseStream: false,
    requestType: axelar_reward_v1beta1_query_pb.ParamsRequest,
    responseType: axelar_reward_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_axelar_reward_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_axelar_reward_v1beta1_ParamsRequest,
    responseSerialize: serialize_axelar_reward_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_axelar_reward_v1beta1_ParamsResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
