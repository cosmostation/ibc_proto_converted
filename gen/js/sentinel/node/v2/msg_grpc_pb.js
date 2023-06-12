// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_node_v2_msg_pb = require('../../../sentinel/node/v2/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var sentinel_types_v1_status_pb = require('../../../sentinel/types/v1/status_pb.js');

function serialize_sentinel_node_v2_MsgRegisterRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgRegisterRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgRegisterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgRegisterRequest(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgRegisterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgRegisterResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgRegisterResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgRegisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgRegisterResponse(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgRegisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgSubscribeRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgSubscribeRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgSubscribeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgSubscribeRequest(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgSubscribeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgSubscribeResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgSubscribeResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgSubscribeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgSubscribeResponse(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgSubscribeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgUpdateDetailsRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgUpdateDetailsRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgUpdateDetailsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgUpdateDetailsRequest(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgUpdateDetailsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgUpdateDetailsResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgUpdateDetailsResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgUpdateDetailsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgUpdateDetailsResponse(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgUpdateDetailsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgUpdateStatusRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgUpdateStatusRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgUpdateStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgUpdateStatusRequest(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgUpdateStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_MsgUpdateStatusResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_msg_pb.MsgUpdateStatusResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.MsgUpdateStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_MsgUpdateStatusResponse(buffer_arg) {
  return sentinel_node_v2_msg_pb.MsgUpdateStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgServiceService = exports.MsgServiceService = {
  msgRegister: {
    path: '/sentinel.node.v2.MsgService/MsgRegister',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_msg_pb.MsgRegisterRequest,
    responseType: sentinel_node_v2_msg_pb.MsgRegisterResponse,
    requestSerialize: serialize_sentinel_node_v2_MsgRegisterRequest,
    requestDeserialize: deserialize_sentinel_node_v2_MsgRegisterRequest,
    responseSerialize: serialize_sentinel_node_v2_MsgRegisterResponse,
    responseDeserialize: deserialize_sentinel_node_v2_MsgRegisterResponse,
  },
  msgUpdateDetails: {
    path: '/sentinel.node.v2.MsgService/MsgUpdateDetails',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_msg_pb.MsgUpdateDetailsRequest,
    responseType: sentinel_node_v2_msg_pb.MsgUpdateDetailsResponse,
    requestSerialize: serialize_sentinel_node_v2_MsgUpdateDetailsRequest,
    requestDeserialize: deserialize_sentinel_node_v2_MsgUpdateDetailsRequest,
    responseSerialize: serialize_sentinel_node_v2_MsgUpdateDetailsResponse,
    responseDeserialize: deserialize_sentinel_node_v2_MsgUpdateDetailsResponse,
  },
  msgUpdateStatus: {
    path: '/sentinel.node.v2.MsgService/MsgUpdateStatus',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_msg_pb.MsgUpdateStatusRequest,
    responseType: sentinel_node_v2_msg_pb.MsgUpdateStatusResponse,
    requestSerialize: serialize_sentinel_node_v2_MsgUpdateStatusRequest,
    requestDeserialize: deserialize_sentinel_node_v2_MsgUpdateStatusRequest,
    responseSerialize: serialize_sentinel_node_v2_MsgUpdateStatusResponse,
    responseDeserialize: deserialize_sentinel_node_v2_MsgUpdateStatusResponse,
  },
  msgSubscribe: {
    path: '/sentinel.node.v2.MsgService/MsgSubscribe',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_msg_pb.MsgSubscribeRequest,
    responseType: sentinel_node_v2_msg_pb.MsgSubscribeResponse,
    requestSerialize: serialize_sentinel_node_v2_MsgSubscribeRequest,
    requestDeserialize: deserialize_sentinel_node_v2_MsgSubscribeRequest,
    responseSerialize: serialize_sentinel_node_v2_MsgSubscribeResponse,
    responseDeserialize: deserialize_sentinel_node_v2_MsgSubscribeResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
