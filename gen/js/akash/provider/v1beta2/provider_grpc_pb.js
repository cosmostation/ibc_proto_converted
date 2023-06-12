// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_provider_v1beta2_provider_pb = require('../../../akash/provider/v1beta2/provider_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var akash_base_v1beta2_attribute_pb = require('../../../akash/base/v1beta2/attribute_pb.js');

function serialize_akash_provider_v1beta2_MsgCreateProvider(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgCreateProvider)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgCreateProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgCreateProvider(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgCreateProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_MsgCreateProviderResponse(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgCreateProviderResponse)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgCreateProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgCreateProviderResponse(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgCreateProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_MsgDeleteProvider(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgDeleteProvider)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgDeleteProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgDeleteProvider(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgDeleteProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_MsgDeleteProviderResponse(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgDeleteProviderResponse)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgDeleteProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgDeleteProviderResponse(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgDeleteProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_MsgUpdateProvider(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgUpdateProvider)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgUpdateProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgUpdateProvider(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgUpdateProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_provider_v1beta2_MsgUpdateProviderResponse(arg) {
  if (!(arg instanceof akash_provider_v1beta2_provider_pb.MsgUpdateProviderResponse)) {
    throw new Error('Expected argument of type akash.provider.v1beta2.MsgUpdateProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_provider_v1beta2_MsgUpdateProviderResponse(buffer_arg) {
  return akash_provider_v1beta2_provider_pb.MsgUpdateProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the provider Msg service
var MsgService = exports.MsgService = {
  // CreateProvider defines a method that creates a provider given the proper inputs
createProvider: {
    path: '/akash.provider.v1beta2.Msg/CreateProvider',
    requestStream: false,
    responseStream: false,
    requestType: akash_provider_v1beta2_provider_pb.MsgCreateProvider,
    responseType: akash_provider_v1beta2_provider_pb.MsgCreateProviderResponse,
    requestSerialize: serialize_akash_provider_v1beta2_MsgCreateProvider,
    requestDeserialize: deserialize_akash_provider_v1beta2_MsgCreateProvider,
    responseSerialize: serialize_akash_provider_v1beta2_MsgCreateProviderResponse,
    responseDeserialize: deserialize_akash_provider_v1beta2_MsgCreateProviderResponse,
  },
  // UpdateProvider defines a method that updates a provider given the proper inputs
updateProvider: {
    path: '/akash.provider.v1beta2.Msg/UpdateProvider',
    requestStream: false,
    responseStream: false,
    requestType: akash_provider_v1beta2_provider_pb.MsgUpdateProvider,
    responseType: akash_provider_v1beta2_provider_pb.MsgUpdateProviderResponse,
    requestSerialize: serialize_akash_provider_v1beta2_MsgUpdateProvider,
    requestDeserialize: deserialize_akash_provider_v1beta2_MsgUpdateProvider,
    responseSerialize: serialize_akash_provider_v1beta2_MsgUpdateProviderResponse,
    responseDeserialize: deserialize_akash_provider_v1beta2_MsgUpdateProviderResponse,
  },
  // DeleteProvider defines a method that deletes a provider given the proper inputs
deleteProvider: {
    path: '/akash.provider.v1beta2.Msg/DeleteProvider',
    requestStream: false,
    responseStream: false,
    requestType: akash_provider_v1beta2_provider_pb.MsgDeleteProvider,
    responseType: akash_provider_v1beta2_provider_pb.MsgDeleteProviderResponse,
    requestSerialize: serialize_akash_provider_v1beta2_MsgDeleteProvider,
    requestDeserialize: deserialize_akash_provider_v1beta2_MsgDeleteProvider,
    responseSerialize: serialize_akash_provider_v1beta2_MsgDeleteProviderResponse,
    responseDeserialize: deserialize_akash_provider_v1beta2_MsgDeleteProviderResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
