// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_registration_v1beta1_query_pb = require('../../../secret/registration/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var secret_registration_v1beta1_msg_pb = require('../../../secret/registration/v1beta1/msg_pb.js');
var secret_registration_v1beta1_genesis_pb = require('../../../secret/registration/v1beta1/genesis_pb.js');

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_registration_v1beta1_Key(arg) {
  if (!(arg instanceof secret_registration_v1beta1_msg_pb.Key)) {
    throw new Error('Expected argument of type secret.registration.v1beta1.Key');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_registration_v1beta1_Key(buffer_arg) {
  return secret_registration_v1beta1_msg_pb.Key.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_registration_v1beta1_QueryEncryptedSeedRequest(arg) {
  if (!(arg instanceof secret_registration_v1beta1_query_pb.QueryEncryptedSeedRequest)) {
    throw new Error('Expected argument of type secret.registration.v1beta1.QueryEncryptedSeedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_registration_v1beta1_QueryEncryptedSeedRequest(buffer_arg) {
  return secret_registration_v1beta1_query_pb.QueryEncryptedSeedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_registration_v1beta1_QueryEncryptedSeedResponse(arg) {
  if (!(arg instanceof secret_registration_v1beta1_query_pb.QueryEncryptedSeedResponse)) {
    throw new Error('Expected argument of type secret.registration.v1beta1.QueryEncryptedSeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_registration_v1beta1_QueryEncryptedSeedResponse(buffer_arg) {
  return secret_registration_v1beta1_query_pb.QueryEncryptedSeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Returns the key used for transactions
txKey: {
    path: '/secret.registration.v1beta1.Query/TxKey',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: secret_registration_v1beta1_msg_pb.Key,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_secret_registration_v1beta1_Key,
    responseDeserialize: deserialize_secret_registration_v1beta1_Key,
  },
  // Returns the key used for registration
registrationKey: {
    path: '/secret.registration.v1beta1.Query/RegistrationKey',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: secret_registration_v1beta1_msg_pb.Key,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_secret_registration_v1beta1_Key,
    responseDeserialize: deserialize_secret_registration_v1beta1_Key,
  },
  // Returns the encrypted seed for a registered node by public key
encryptedSeed: {
    path: '/secret.registration.v1beta1.Query/EncryptedSeed',
    requestStream: false,
    responseStream: false,
    requestType: secret_registration_v1beta1_query_pb.QueryEncryptedSeedRequest,
    responseType: secret_registration_v1beta1_query_pb.QueryEncryptedSeedResponse,
    requestSerialize: serialize_secret_registration_v1beta1_QueryEncryptedSeedRequest,
    requestDeserialize: deserialize_secret_registration_v1beta1_QueryEncryptedSeedRequest,
    responseSerialize: serialize_secret_registration_v1beta1_QueryEncryptedSeedResponse,
    responseDeserialize: deserialize_secret_registration_v1beta1_QueryEncryptedSeedResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
