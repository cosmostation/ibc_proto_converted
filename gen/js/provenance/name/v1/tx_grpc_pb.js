// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_name_v1_tx_pb = require('../../../provenance/name/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var provenance_name_v1_name_pb = require('../../../provenance/name/v1/name_pb.js');

function serialize_provenance_name_v1_MsgBindNameRequest(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgBindNameRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgBindNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgBindNameRequest(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgBindNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgBindNameResponse(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgBindNameResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgBindNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgBindNameResponse(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgBindNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgCreateRootNameRequest(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgCreateRootNameRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgCreateRootNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgCreateRootNameRequest(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgCreateRootNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgCreateRootNameResponse(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgCreateRootNameResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgCreateRootNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgCreateRootNameResponse(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgCreateRootNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgDeleteNameRequest(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgDeleteNameRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgDeleteNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgDeleteNameRequest(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgDeleteNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgDeleteNameResponse(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgDeleteNameResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgDeleteNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgDeleteNameResponse(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgDeleteNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgModifyNameRequest(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgModifyNameRequest)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgModifyNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgModifyNameRequest(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgModifyNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_name_v1_MsgModifyNameResponse(arg) {
  if (!(arg instanceof provenance_name_v1_tx_pb.MsgModifyNameResponse)) {
    throw new Error('Expected argument of type provenance.name.v1.MsgModifyNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_name_v1_MsgModifyNameResponse(buffer_arg) {
  return provenance_name_v1_tx_pb.MsgModifyNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // BindName binds a name to an address under a root name.
bindName: {
    path: '/provenance.name.v1.Msg/BindName',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_tx_pb.MsgBindNameRequest,
    responseType: provenance_name_v1_tx_pb.MsgBindNameResponse,
    requestSerialize: serialize_provenance_name_v1_MsgBindNameRequest,
    requestDeserialize: deserialize_provenance_name_v1_MsgBindNameRequest,
    responseSerialize: serialize_provenance_name_v1_MsgBindNameResponse,
    responseDeserialize: deserialize_provenance_name_v1_MsgBindNameResponse,
  },
  // DeleteName defines a method to verify a particular invariance.
deleteName: {
    path: '/provenance.name.v1.Msg/DeleteName',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_tx_pb.MsgDeleteNameRequest,
    responseType: provenance_name_v1_tx_pb.MsgDeleteNameResponse,
    requestSerialize: serialize_provenance_name_v1_MsgDeleteNameRequest,
    requestDeserialize: deserialize_provenance_name_v1_MsgDeleteNameRequest,
    responseSerialize: serialize_provenance_name_v1_MsgDeleteNameResponse,
    responseDeserialize: deserialize_provenance_name_v1_MsgDeleteNameResponse,
  },
  // ModifyName defines a method to modify the attributes of an existing name.
modifyName: {
    path: '/provenance.name.v1.Msg/ModifyName',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_tx_pb.MsgModifyNameRequest,
    responseType: provenance_name_v1_tx_pb.MsgModifyNameResponse,
    requestSerialize: serialize_provenance_name_v1_MsgModifyNameRequest,
    requestDeserialize: deserialize_provenance_name_v1_MsgModifyNameRequest,
    responseSerialize: serialize_provenance_name_v1_MsgModifyNameResponse,
    responseDeserialize: deserialize_provenance_name_v1_MsgModifyNameResponse,
  },
  // CreateRootName defines a governance method for creating a root name.
createRootName: {
    path: '/provenance.name.v1.Msg/CreateRootName',
    requestStream: false,
    responseStream: false,
    requestType: provenance_name_v1_tx_pb.MsgCreateRootNameRequest,
    responseType: provenance_name_v1_tx_pb.MsgCreateRootNameResponse,
    requestSerialize: serialize_provenance_name_v1_MsgCreateRootNameRequest,
    requestDeserialize: deserialize_provenance_name_v1_MsgCreateRootNameRequest,
    responseSerialize: serialize_provenance_name_v1_MsgCreateRootNameResponse,
    responseDeserialize: deserialize_provenance_name_v1_MsgCreateRootNameResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
