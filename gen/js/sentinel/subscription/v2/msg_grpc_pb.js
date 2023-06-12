// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_subscription_v2_msg_pb = require('../../../sentinel/subscription/v2/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_sentinel_subscription_v2_MsgAllocateRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_msg_pb.MsgAllocateRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.MsgAllocateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_MsgAllocateRequest(buffer_arg) {
  return sentinel_subscription_v2_msg_pb.MsgAllocateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_MsgAllocateResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_msg_pb.MsgAllocateResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.MsgAllocateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_MsgAllocateResponse(buffer_arg) {
  return sentinel_subscription_v2_msg_pb.MsgAllocateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_MsgCancelRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_msg_pb.MsgCancelRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.MsgCancelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_MsgCancelRequest(buffer_arg) {
  return sentinel_subscription_v2_msg_pb.MsgCancelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_MsgCancelResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_msg_pb.MsgCancelResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.MsgCancelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_MsgCancelResponse(buffer_arg) {
  return sentinel_subscription_v2_msg_pb.MsgCancelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgServiceService = exports.MsgServiceService = {
  msgCancel: {
    path: '/sentinel.subscription.v2.MsgService/MsgCancel',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_msg_pb.MsgCancelRequest,
    responseType: sentinel_subscription_v2_msg_pb.MsgCancelResponse,
    requestSerialize: serialize_sentinel_subscription_v2_MsgCancelRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_MsgCancelRequest,
    responseSerialize: serialize_sentinel_subscription_v2_MsgCancelResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_MsgCancelResponse,
  },
  msgAllocate: {
    path: '/sentinel.subscription.v2.MsgService/MsgAllocate',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_msg_pb.MsgAllocateRequest,
    responseType: sentinel_subscription_v2_msg_pb.MsgAllocateResponse,
    requestSerialize: serialize_sentinel_subscription_v2_MsgAllocateRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_MsgAllocateRequest,
    responseSerialize: serialize_sentinel_subscription_v2_MsgAllocateResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_MsgAllocateResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
