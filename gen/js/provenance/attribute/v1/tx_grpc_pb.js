// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_attribute_v1_tx_pb = require('../../../provenance/attribute/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var provenance_attribute_v1_attribute_pb = require('../../../provenance/attribute/v1/attribute_pb.js');

function serialize_provenance_attribute_v1_MsgAddAttributeRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgAddAttributeRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgAddAttributeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgAddAttributeRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgAddAttributeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgAddAttributeResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgAddAttributeResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgAddAttributeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgAddAttributeResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgAddAttributeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgDeleteAttributeRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgDeleteAttributeRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgDeleteAttributeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgDeleteAttributeRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgDeleteAttributeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgDeleteAttributeResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgDeleteAttributeResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgDeleteAttributeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgDeleteAttributeResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgDeleteAttributeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgDeleteDistinctAttributeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgDeleteDistinctAttributeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgSetAccountDataRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgSetAccountDataRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgSetAccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgSetAccountDataRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgSetAccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgSetAccountDataResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgSetAccountDataResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgSetAccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgSetAccountDataResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgSetAccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgUpdateAttributeExpirationRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgUpdateAttributeExpirationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgUpdateAttributeExpirationRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgUpdateAttributeExpirationResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgUpdateAttributeExpirationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgUpdateAttributeExpirationResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgUpdateAttributeRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgUpdateAttributeRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgUpdateAttributeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgUpdateAttributeRequest(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgUpdateAttributeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_MsgUpdateAttributeResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_tx_pb.MsgUpdateAttributeResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.MsgUpdateAttributeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_MsgUpdateAttributeResponse(buffer_arg) {
  return provenance_attribute_v1_tx_pb.MsgUpdateAttributeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the attribute module Msg service.
var MsgService = exports.MsgService = {
  // AddAttribute defines a method to verify a particular invariance.
addAttribute: {
    path: '/provenance.attribute.v1.Msg/AddAttribute',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgAddAttributeRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgAddAttributeResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgAddAttributeRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgAddAttributeRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgAddAttributeResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgAddAttributeResponse,
  },
  // UpdateAttribute defines a method to verify a particular invariance.
updateAttribute: {
    path: '/provenance.attribute.v1.Msg/UpdateAttribute',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgUpdateAttributeRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgUpdateAttributeResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgUpdateAttributeRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgUpdateAttributeRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgUpdateAttributeResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgUpdateAttributeResponse,
  },
  // UpdateAttributeExpiration defines a method to verify a particular invariance.
updateAttributeExpiration: {
    path: '/provenance.attribute.v1.Msg/UpdateAttributeExpiration',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgUpdateAttributeExpirationResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgUpdateAttributeExpirationRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgUpdateAttributeExpirationRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgUpdateAttributeExpirationResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgUpdateAttributeExpirationResponse,
  },
  // DeleteAttribute defines a method to verify a particular invariance.
deleteAttribute: {
    path: '/provenance.attribute.v1.Msg/DeleteAttribute',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgDeleteAttributeRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgDeleteAttributeResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgDeleteAttributeRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgDeleteAttributeRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgDeleteAttributeResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgDeleteAttributeResponse,
  },
  // DeleteDistinctAttribute defines a method to verify a particular invariance.
deleteDistinctAttribute: {
    path: '/provenance.attribute.v1.Msg/DeleteDistinctAttribute',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgDeleteDistinctAttributeResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgDeleteDistinctAttributeRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgDeleteDistinctAttributeResponse,
  },
  // SetAccountData defines a method for setting/updating an account's accountdata attribute.
setAccountData: {
    path: '/provenance.attribute.v1.Msg/SetAccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_tx_pb.MsgSetAccountDataRequest,
    responseType: provenance_attribute_v1_tx_pb.MsgSetAccountDataResponse,
    requestSerialize: serialize_provenance_attribute_v1_MsgSetAccountDataRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_MsgSetAccountDataRequest,
    responseSerialize: serialize_provenance_attribute_v1_MsgSetAccountDataResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_MsgSetAccountDataResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
