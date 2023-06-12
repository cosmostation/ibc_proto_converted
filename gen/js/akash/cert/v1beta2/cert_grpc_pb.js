// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_cert_v1beta2_cert_pb = require('../../../akash/cert/v1beta2/cert_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_akash_cert_v1beta2_MsgCreateCertificate(arg) {
  if (!(arg instanceof akash_cert_v1beta2_cert_pb.MsgCreateCertificate)) {
    throw new Error('Expected argument of type akash.cert.v1beta2.MsgCreateCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta2_MsgCreateCertificate(buffer_arg) {
  return akash_cert_v1beta2_cert_pb.MsgCreateCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_cert_v1beta2_MsgCreateCertificateResponse(arg) {
  if (!(arg instanceof akash_cert_v1beta2_cert_pb.MsgCreateCertificateResponse)) {
    throw new Error('Expected argument of type akash.cert.v1beta2.MsgCreateCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta2_MsgCreateCertificateResponse(buffer_arg) {
  return akash_cert_v1beta2_cert_pb.MsgCreateCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_cert_v1beta2_MsgRevokeCertificate(arg) {
  if (!(arg instanceof akash_cert_v1beta2_cert_pb.MsgRevokeCertificate)) {
    throw new Error('Expected argument of type akash.cert.v1beta2.MsgRevokeCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta2_MsgRevokeCertificate(buffer_arg) {
  return akash_cert_v1beta2_cert_pb.MsgRevokeCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_cert_v1beta2_MsgRevokeCertificateResponse(arg) {
  if (!(arg instanceof akash_cert_v1beta2_cert_pb.MsgRevokeCertificateResponse)) {
    throw new Error('Expected argument of type akash.cert.v1beta2.MsgRevokeCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta2_MsgRevokeCertificateResponse(buffer_arg) {
  return akash_cert_v1beta2_cert_pb.MsgRevokeCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the provider Msg service
var MsgService = exports.MsgService = {
  // CreateCertificate defines a method to create new certificate given proper inputs.
createCertificate: {
    path: '/akash.cert.v1beta2.Msg/CreateCertificate',
    requestStream: false,
    responseStream: false,
    requestType: akash_cert_v1beta2_cert_pb.MsgCreateCertificate,
    responseType: akash_cert_v1beta2_cert_pb.MsgCreateCertificateResponse,
    requestSerialize: serialize_akash_cert_v1beta2_MsgCreateCertificate,
    requestDeserialize: deserialize_akash_cert_v1beta2_MsgCreateCertificate,
    responseSerialize: serialize_akash_cert_v1beta2_MsgCreateCertificateResponse,
    responseDeserialize: deserialize_akash_cert_v1beta2_MsgCreateCertificateResponse,
  },
  // RevokeCertificate defines a method to revoke the certificate
revokeCertificate: {
    path: '/akash.cert.v1beta2.Msg/RevokeCertificate',
    requestStream: false,
    responseStream: false,
    requestType: akash_cert_v1beta2_cert_pb.MsgRevokeCertificate,
    responseType: akash_cert_v1beta2_cert_pb.MsgRevokeCertificateResponse,
    requestSerialize: serialize_akash_cert_v1beta2_MsgRevokeCertificate,
    requestDeserialize: deserialize_akash_cert_v1beta2_MsgRevokeCertificate,
    responseSerialize: serialize_akash_cert_v1beta2_MsgRevokeCertificateResponse,
    responseDeserialize: deserialize_akash_cert_v1beta2_MsgRevokeCertificateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
