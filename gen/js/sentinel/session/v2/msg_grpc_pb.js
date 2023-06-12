// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_session_v2_msg_pb = require('../../../sentinel/session/v2/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var sentinel_session_v2_proof_pb = require('../../../sentinel/session/v2/proof_pb.js');

function serialize_sentinel_session_v2_MsgEndRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgEndRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgEndRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgEndRequest(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgEndRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_MsgEndResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgEndResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgEndResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgEndResponse(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgEndResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_MsgStartRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgStartRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgStartRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgStartRequest(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgStartRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_MsgStartResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgStartResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgStartResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgStartResponse(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgStartResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_MsgUpdateDetailsRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgUpdateDetailsRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgUpdateDetailsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgUpdateDetailsRequest(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgUpdateDetailsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_MsgUpdateDetailsResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_msg_pb.MsgUpdateDetailsResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.MsgUpdateDetailsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_MsgUpdateDetailsResponse(buffer_arg) {
  return sentinel_session_v2_msg_pb.MsgUpdateDetailsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgServiceService = exports.MsgServiceService = {
  msgStart: {
    path: '/sentinel.session.v2.MsgService/MsgStart',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_msg_pb.MsgStartRequest,
    responseType: sentinel_session_v2_msg_pb.MsgStartResponse,
    requestSerialize: serialize_sentinel_session_v2_MsgStartRequest,
    requestDeserialize: deserialize_sentinel_session_v2_MsgStartRequest,
    responseSerialize: serialize_sentinel_session_v2_MsgStartResponse,
    responseDeserialize: deserialize_sentinel_session_v2_MsgStartResponse,
  },
  msgUpdateDetails: {
    path: '/sentinel.session.v2.MsgService/MsgUpdateDetails',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_msg_pb.MsgUpdateDetailsRequest,
    responseType: sentinel_session_v2_msg_pb.MsgUpdateDetailsResponse,
    requestSerialize: serialize_sentinel_session_v2_MsgUpdateDetailsRequest,
    requestDeserialize: deserialize_sentinel_session_v2_MsgUpdateDetailsRequest,
    responseSerialize: serialize_sentinel_session_v2_MsgUpdateDetailsResponse,
    responseDeserialize: deserialize_sentinel_session_v2_MsgUpdateDetailsResponse,
  },
  msgEnd: {
    path: '/sentinel.session.v2.MsgService/MsgEnd',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_msg_pb.MsgEndRequest,
    responseType: sentinel_session_v2_msg_pb.MsgEndResponse,
    requestSerialize: serialize_sentinel_session_v2_MsgEndRequest,
    requestDeserialize: deserialize_sentinel_session_v2_MsgEndRequest,
    responseSerialize: serialize_sentinel_session_v2_MsgEndResponse,
    responseDeserialize: deserialize_sentinel_session_v2_MsgEndResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
