// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_provider_v2_msg_pb = require('../../../sentinel/provider/v2/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var sentinel_types_v1_status_pb = require('../../../sentinel/types/v1/status_pb.js');

function serialize_sentinel_provider_v2_MsgRegisterRequest(arg) {
  if (!(arg instanceof sentinel_provider_v2_msg_pb.MsgRegisterRequest)) {
    throw new Error('Expected argument of type sentinel.provider.v2.MsgRegisterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_provider_v2_MsgRegisterRequest(buffer_arg) {
  return sentinel_provider_v2_msg_pb.MsgRegisterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_provider_v2_MsgRegisterResponse(arg) {
  if (!(arg instanceof sentinel_provider_v2_msg_pb.MsgRegisterResponse)) {
    throw new Error('Expected argument of type sentinel.provider.v2.MsgRegisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_provider_v2_MsgRegisterResponse(buffer_arg) {
  return sentinel_provider_v2_msg_pb.MsgRegisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_provider_v2_MsgUpdateRequest(arg) {
  if (!(arg instanceof sentinel_provider_v2_msg_pb.MsgUpdateRequest)) {
    throw new Error('Expected argument of type sentinel.provider.v2.MsgUpdateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_provider_v2_MsgUpdateRequest(buffer_arg) {
  return sentinel_provider_v2_msg_pb.MsgUpdateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_provider_v2_MsgUpdateResponse(arg) {
  if (!(arg instanceof sentinel_provider_v2_msg_pb.MsgUpdateResponse)) {
    throw new Error('Expected argument of type sentinel.provider.v2.MsgUpdateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_provider_v2_MsgUpdateResponse(buffer_arg) {
  return sentinel_provider_v2_msg_pb.MsgUpdateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgServiceService = exports.MsgServiceService = {
  msgRegister: {
    path: '/sentinel.provider.v2.MsgService/MsgRegister',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_provider_v2_msg_pb.MsgRegisterRequest,
    responseType: sentinel_provider_v2_msg_pb.MsgRegisterResponse,
    requestSerialize: serialize_sentinel_provider_v2_MsgRegisterRequest,
    requestDeserialize: deserialize_sentinel_provider_v2_MsgRegisterRequest,
    responseSerialize: serialize_sentinel_provider_v2_MsgRegisterResponse,
    responseDeserialize: deserialize_sentinel_provider_v2_MsgRegisterResponse,
  },
  msgUpdate: {
    path: '/sentinel.provider.v2.MsgService/MsgUpdate',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_provider_v2_msg_pb.MsgUpdateRequest,
    responseType: sentinel_provider_v2_msg_pb.MsgUpdateResponse,
    requestSerialize: serialize_sentinel_provider_v2_MsgUpdateRequest,
    requestDeserialize: deserialize_sentinel_provider_v2_MsgUpdateRequest,
    responseSerialize: serialize_sentinel_provider_v2_MsgUpdateResponse,
    responseDeserialize: deserialize_sentinel_provider_v2_MsgUpdateResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
