// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stargaze_globalfee_v1_tx_pb = require('../../../stargaze/globalfee/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var stargaze_globalfee_v1_globalfee_pb = require('../../../stargaze/globalfee/v1/globalfee_pb.js');

function serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorization(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorization)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorization(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgRemoveCodeAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorization(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorization)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorization(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgRemoveContractAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorization(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorization)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorization(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgSetCodeAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorization(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorization)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorization(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorizationResponse(arg) {
  if (!(arg instanceof stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorizationResponse)) {
    throw new Error('Expected argument of type publicawesome.stargaze.globalfee.v1.MsgSetContractAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorizationResponse(buffer_arg) {
  return stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the alloc Msg service.
var MsgService = exports.MsgService = {
  setCodeAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Msg/SetCodeAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorization,
    responseType: stargaze_globalfee_v1_tx_pb.MsgSetCodeAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorization,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorization,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgSetCodeAuthorizationResponse,
  },
  removeCodeAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Msg/RemoveCodeAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorization,
    responseType: stargaze_globalfee_v1_tx_pb.MsgRemoveCodeAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorization,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorization,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveCodeAuthorizationResponse,
  },
  setContractAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Msg/SetContractAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorization,
    responseType: stargaze_globalfee_v1_tx_pb.MsgSetContractAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorization,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorization,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgSetContractAuthorizationResponse,
  },
  removeContractAuthorization: {
    path: '/publicawesome.stargaze.globalfee.v1.Msg/RemoveContractAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorization,
    responseType: stargaze_globalfee_v1_tx_pb.MsgRemoveContractAuthorizationResponse,
    requestSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorization,
    requestDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorization,
    responseSerialize: serialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorizationResponse,
    responseDeserialize: deserialize_publicawesome_stargaze_globalfee_v1_MsgRemoveContractAuthorizationResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
