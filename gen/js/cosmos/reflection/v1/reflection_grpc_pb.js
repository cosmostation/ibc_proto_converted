// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_reflection_v1_reflection_pb = require('../../../cosmos/reflection/v1/reflection_pb.js');
var google_protobuf_descriptor_pb = require('google-protobuf/google/protobuf/descriptor_pb.js');
var cosmos_query_v1_query_pb = require('../../../cosmos/query/v1/query_pb.js');

function serialize_cosmos_reflection_v1_FileDescriptorsRequest(arg) {
  if (!(arg instanceof cosmos_reflection_v1_reflection_pb.FileDescriptorsRequest)) {
    throw new Error('Expected argument of type cosmos.reflection.v1.FileDescriptorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_reflection_v1_FileDescriptorsRequest(buffer_arg) {
  return cosmos_reflection_v1_reflection_pb.FileDescriptorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_reflection_v1_FileDescriptorsResponse(arg) {
  if (!(arg instanceof cosmos_reflection_v1_reflection_pb.FileDescriptorsResponse)) {
    throw new Error('Expected argument of type cosmos.reflection.v1.FileDescriptorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_reflection_v1_FileDescriptorsResponse(buffer_arg) {
  return cosmos_reflection_v1_reflection_pb.FileDescriptorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Package cosmos.reflection.v1 provides support for inspecting protobuf
// file descriptors.
var ReflectionServiceService = exports.ReflectionServiceService = {
  // FileDescriptors queries all the file descriptors in the app in order
// to enable easier generation of dynamic clients.
fileDescriptors: {
    path: '/cosmos.reflection.v1.ReflectionService/FileDescriptors',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_reflection_v1_reflection_pb.FileDescriptorsRequest,
    responseType: cosmos_reflection_v1_reflection_pb.FileDescriptorsResponse,
    requestSerialize: serialize_cosmos_reflection_v1_FileDescriptorsRequest,
    requestDeserialize: deserialize_cosmos_reflection_v1_FileDescriptorsRequest,
    responseSerialize: serialize_cosmos_reflection_v1_FileDescriptorsResponse,
    responseDeserialize: deserialize_cosmos_reflection_v1_FileDescriptorsResponse,
  },
};

exports.ReflectionServiceClient = grpc.makeGenericClientConstructor(ReflectionServiceService);
