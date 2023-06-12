// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_did_v2_tx_pb = require('../../../panacea/did/v2/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var panacea_did_v2_did_pb = require('../../../panacea/did/v2/did_pb.js');

function serialize_panacea_did_v2_MsgCreateDID(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgCreateDID)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgCreateDID');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgCreateDID(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgCreateDID.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_MsgCreateDIDResponse(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgCreateDIDResponse)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgCreateDIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgCreateDIDResponse(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgCreateDIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_MsgDeactivateDID(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgDeactivateDID)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgDeactivateDID');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgDeactivateDID(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgDeactivateDID.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_MsgDeactivateDIDResponse(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgDeactivateDIDResponse)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgDeactivateDIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgDeactivateDIDResponse(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgDeactivateDIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_MsgUpdateDID(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgUpdateDID)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgUpdateDID');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgUpdateDID(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgUpdateDID.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_MsgUpdateDIDResponse(arg) {
  if (!(arg instanceof panacea_did_v2_tx_pb.MsgUpdateDIDResponse)) {
    throw new Error('Expected argument of type panacea.did.v2.MsgUpdateDIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_MsgUpdateDIDResponse(buffer_arg) {
  return panacea_did_v2_tx_pb.MsgUpdateDIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreateDID defines a method for creating a DID.
createDID: {
    path: '/panacea.did.v2.Msg/CreateDID',
    requestStream: false,
    responseStream: false,
    requestType: panacea_did_v2_tx_pb.MsgCreateDID,
    responseType: panacea_did_v2_tx_pb.MsgCreateDIDResponse,
    requestSerialize: serialize_panacea_did_v2_MsgCreateDID,
    requestDeserialize: deserialize_panacea_did_v2_MsgCreateDID,
    responseSerialize: serialize_panacea_did_v2_MsgCreateDIDResponse,
    responseDeserialize: deserialize_panacea_did_v2_MsgCreateDIDResponse,
  },
  // UpdateDID defines a method for updating a DID.
updateDID: {
    path: '/panacea.did.v2.Msg/UpdateDID',
    requestStream: false,
    responseStream: false,
    requestType: panacea_did_v2_tx_pb.MsgUpdateDID,
    responseType: panacea_did_v2_tx_pb.MsgUpdateDIDResponse,
    requestSerialize: serialize_panacea_did_v2_MsgUpdateDID,
    requestDeserialize: deserialize_panacea_did_v2_MsgUpdateDID,
    responseSerialize: serialize_panacea_did_v2_MsgUpdateDIDResponse,
    responseDeserialize: deserialize_panacea_did_v2_MsgUpdateDIDResponse,
  },
  // DeactivateDID defines a method for deactivating a DID.
deactivateDID: {
    path: '/panacea.did.v2.Msg/DeactivateDID',
    requestStream: false,
    responseStream: false,
    requestType: panacea_did_v2_tx_pb.MsgDeactivateDID,
    responseType: panacea_did_v2_tx_pb.MsgDeactivateDIDResponse,
    requestSerialize: serialize_panacea_did_v2_MsgDeactivateDID,
    requestDeserialize: deserialize_panacea_did_v2_MsgDeactivateDID,
    responseSerialize: serialize_panacea_did_v2_MsgDeactivateDIDResponse,
    responseDeserialize: deserialize_panacea_did_v2_MsgDeactivateDIDResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
