// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_audit_v1beta2_audit_pb = require('../../../akash/audit/v1beta2/audit_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var akash_base_v1beta2_attribute_pb = require('../../../akash/base/v1beta2/attribute_pb.js');

function serialize_akash_audit_v1beta2_MsgDeleteProviderAttributes(arg) {
  if (!(arg instanceof akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributes)) {
    throw new Error('Expected argument of type akash.audit.v1beta2.MsgDeleteProviderAttributes');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta2_MsgDeleteProviderAttributes(buffer_arg) {
  return akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributes.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta2_MsgDeleteProviderAttributesResponse(arg) {
  if (!(arg instanceof akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributesResponse)) {
    throw new Error('Expected argument of type akash.audit.v1beta2.MsgDeleteProviderAttributesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta2_MsgDeleteProviderAttributesResponse(buffer_arg) {
  return akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta2_MsgSignProviderAttributes(arg) {
  if (!(arg instanceof akash_audit_v1beta2_audit_pb.MsgSignProviderAttributes)) {
    throw new Error('Expected argument of type akash.audit.v1beta2.MsgSignProviderAttributes');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta2_MsgSignProviderAttributes(buffer_arg) {
  return akash_audit_v1beta2_audit_pb.MsgSignProviderAttributes.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_audit_v1beta2_MsgSignProviderAttributesResponse(arg) {
  if (!(arg instanceof akash_audit_v1beta2_audit_pb.MsgSignProviderAttributesResponse)) {
    throw new Error('Expected argument of type akash.audit.v1beta2.MsgSignProviderAttributesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_audit_v1beta2_MsgSignProviderAttributesResponse(buffer_arg) {
  return akash_audit_v1beta2_audit_pb.MsgSignProviderAttributesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the provider Msg service
var MsgService = exports.MsgService = {
  // SignProviderAttributes defines a method that signs provider attributes
signProviderAttributes: {
    path: '/akash.audit.v1beta2.Msg/SignProviderAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta2_audit_pb.MsgSignProviderAttributes,
    responseType: akash_audit_v1beta2_audit_pb.MsgSignProviderAttributesResponse,
    requestSerialize: serialize_akash_audit_v1beta2_MsgSignProviderAttributes,
    requestDeserialize: deserialize_akash_audit_v1beta2_MsgSignProviderAttributes,
    responseSerialize: serialize_akash_audit_v1beta2_MsgSignProviderAttributesResponse,
    responseDeserialize: deserialize_akash_audit_v1beta2_MsgSignProviderAttributesResponse,
  },
  // DeleteProviderAttributes defines a method that deletes provider attributes
deleteProviderAttributes: {
    path: '/akash.audit.v1beta2.Msg/DeleteProviderAttributes',
    requestStream: false,
    responseStream: false,
    requestType: akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributes,
    responseType: akash_audit_v1beta2_audit_pb.MsgDeleteProviderAttributesResponse,
    requestSerialize: serialize_akash_audit_v1beta2_MsgDeleteProviderAttributes,
    requestDeserialize: deserialize_akash_audit_v1beta2_MsgDeleteProviderAttributes,
    responseSerialize: serialize_akash_audit_v1beta2_MsgDeleteProviderAttributesResponse,
    responseDeserialize: deserialize_akash_audit_v1beta2_MsgDeleteProviderAttributesResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
