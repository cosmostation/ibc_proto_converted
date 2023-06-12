// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irishub_guardian_tx_pb = require('../../irishub/guardian/tx_pb.js');

function serialize_irishub_guardian_MsgAddSuper(arg) {
  if (!(arg instanceof irishub_guardian_tx_pb.MsgAddSuper)) {
    throw new Error('Expected argument of type irishub.guardian.MsgAddSuper');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_MsgAddSuper(buffer_arg) {
  return irishub_guardian_tx_pb.MsgAddSuper.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irishub_guardian_MsgAddSuperResponse(arg) {
  if (!(arg instanceof irishub_guardian_tx_pb.MsgAddSuperResponse)) {
    throw new Error('Expected argument of type irishub.guardian.MsgAddSuperResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_MsgAddSuperResponse(buffer_arg) {
  return irishub_guardian_tx_pb.MsgAddSuperResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irishub_guardian_MsgDeleteSuper(arg) {
  if (!(arg instanceof irishub_guardian_tx_pb.MsgDeleteSuper)) {
    throw new Error('Expected argument of type irishub.guardian.MsgDeleteSuper');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_MsgDeleteSuper(buffer_arg) {
  return irishub_guardian_tx_pb.MsgDeleteSuper.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irishub_guardian_MsgDeleteSuperResponse(arg) {
  if (!(arg instanceof irishub_guardian_tx_pb.MsgDeleteSuperResponse)) {
    throw new Error('Expected argument of type irishub.guardian.MsgDeleteSuperResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_MsgDeleteSuperResponse(buffer_arg) {
  return irishub_guardian_tx_pb.MsgDeleteSuperResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the guardian Msg service
var MsgService = exports.MsgService = {
  // AddSuper defines a method for adding a super account
addSuper: {
    path: '/irishub.guardian.Msg/AddSuper',
    requestStream: false,
    responseStream: false,
    requestType: irishub_guardian_tx_pb.MsgAddSuper,
    responseType: irishub_guardian_tx_pb.MsgAddSuperResponse,
    requestSerialize: serialize_irishub_guardian_MsgAddSuper,
    requestDeserialize: deserialize_irishub_guardian_MsgAddSuper,
    responseSerialize: serialize_irishub_guardian_MsgAddSuperResponse,
    responseDeserialize: deserialize_irishub_guardian_MsgAddSuperResponse,
  },
  // DeleteSuper defines a method for deleting a super account
deleteSuper: {
    path: '/irishub.guardian.Msg/DeleteSuper',
    requestStream: false,
    responseStream: false,
    requestType: irishub_guardian_tx_pb.MsgDeleteSuper,
    responseType: irishub_guardian_tx_pb.MsgDeleteSuperResponse,
    requestSerialize: serialize_irishub_guardian_MsgDeleteSuper,
    requestDeserialize: deserialize_irishub_guardian_MsgDeleteSuper,
    responseSerialize: serialize_irishub_guardian_MsgDeleteSuperResponse,
    responseDeserialize: deserialize_irishub_guardian_MsgDeleteSuperResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
