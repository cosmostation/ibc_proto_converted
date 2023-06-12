// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_plan_v2_msg_pb = require('../../../sentinel/plan/v2/msg_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var sentinel_types_v1_status_pb = require('../../../sentinel/types/v1/status_pb.js');

function serialize_sentinel_plan_v2_MsgCreateRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgCreateRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgCreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgCreateRequest(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgCreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgCreateResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgCreateResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgCreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgCreateResponse(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgCreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgLinkNodeRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgLinkNodeRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgLinkNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgLinkNodeRequest(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgLinkNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgLinkNodeResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgLinkNodeResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgLinkNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgLinkNodeResponse(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgLinkNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgSubscribeRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgSubscribeRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgSubscribeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgSubscribeRequest(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgSubscribeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgSubscribeResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgSubscribeResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgSubscribeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgSubscribeResponse(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgSubscribeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgUnlinkNodeRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgUnlinkNodeRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgUnlinkNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgUnlinkNodeRequest(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgUnlinkNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgUnlinkNodeResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgUnlinkNodeResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgUnlinkNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgUnlinkNodeResponse(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgUnlinkNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgUpdateStatusRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgUpdateStatusRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgUpdateStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgUpdateStatusRequest(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgUpdateStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_MsgUpdateStatusResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_msg_pb.MsgUpdateStatusResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.MsgUpdateStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_MsgUpdateStatusResponse(buffer_arg) {
  return sentinel_plan_v2_msg_pb.MsgUpdateStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgServiceService = exports.MsgServiceService = {
  msgCreate: {
    path: '/sentinel.plan.v2.MsgService/MsgCreate',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_msg_pb.MsgCreateRequest,
    responseType: sentinel_plan_v2_msg_pb.MsgCreateResponse,
    requestSerialize: serialize_sentinel_plan_v2_MsgCreateRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_MsgCreateRequest,
    responseSerialize: serialize_sentinel_plan_v2_MsgCreateResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_MsgCreateResponse,
  },
  msgUpdateStatus: {
    path: '/sentinel.plan.v2.MsgService/MsgUpdateStatus',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_msg_pb.MsgUpdateStatusRequest,
    responseType: sentinel_plan_v2_msg_pb.MsgUpdateStatusResponse,
    requestSerialize: serialize_sentinel_plan_v2_MsgUpdateStatusRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_MsgUpdateStatusRequest,
    responseSerialize: serialize_sentinel_plan_v2_MsgUpdateStatusResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_MsgUpdateStatusResponse,
  },
  msgLinkNode: {
    path: '/sentinel.plan.v2.MsgService/MsgLinkNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_msg_pb.MsgLinkNodeRequest,
    responseType: sentinel_plan_v2_msg_pb.MsgLinkNodeResponse,
    requestSerialize: serialize_sentinel_plan_v2_MsgLinkNodeRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_MsgLinkNodeRequest,
    responseSerialize: serialize_sentinel_plan_v2_MsgLinkNodeResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_MsgLinkNodeResponse,
  },
  msgUnlinkNode: {
    path: '/sentinel.plan.v2.MsgService/MsgUnlinkNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_msg_pb.MsgUnlinkNodeRequest,
    responseType: sentinel_plan_v2_msg_pb.MsgUnlinkNodeResponse,
    requestSerialize: serialize_sentinel_plan_v2_MsgUnlinkNodeRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_MsgUnlinkNodeRequest,
    responseSerialize: serialize_sentinel_plan_v2_MsgUnlinkNodeResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_MsgUnlinkNodeResponse,
  },
  msgSubscribe: {
    path: '/sentinel.plan.v2.MsgService/MsgSubscribe',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_msg_pb.MsgSubscribeRequest,
    responseType: sentinel_plan_v2_msg_pb.MsgSubscribeResponse,
    requestSerialize: serialize_sentinel_plan_v2_MsgSubscribeRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_MsgSubscribeRequest,
    responseSerialize: serialize_sentinel_plan_v2_MsgSubscribeResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_MsgSubscribeResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
