// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_cert_v1alpha1_tx_pb = require('../../../shentu/cert/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var shentu_cert_v1alpha1_cert_pb = require('../../../shentu/cert/v1alpha1/cert_pb.js');

function serialize_shentu_cert_v1alpha1_MsgCertifyPlatform(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatform)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgCertifyPlatform');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgCertifyPlatform(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatform.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgCertifyPlatformResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatformResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgCertifyPlatformResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgCertifyPlatformResponse(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatformResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgIssueCertificate(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgIssueCertificate)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgIssueCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgIssueCertificate(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgIssueCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgIssueCertificateResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgIssueCertificateResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgIssueCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgIssueCertificateResponse(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgIssueCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgProposeCertifier(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgProposeCertifier)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgProposeCertifier');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgProposeCertifier(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgProposeCertifier.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgProposeCertifierResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgProposeCertifierResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgProposeCertifierResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgProposeCertifierResponse(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgProposeCertifierResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgRevokeCertificate(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificate)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgRevokeCertificate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgRevokeCertificate(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_MsgRevokeCertificateResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificateResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.MsgRevokeCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_MsgRevokeCertificateResponse(buffer_arg) {
  return shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the shield Msg service.
var MsgService = exports.MsgService = {
  proposeCertifier: {
    path: '/shentu.cert.v1alpha1.Msg/ProposeCertifier',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_tx_pb.MsgProposeCertifier,
    responseType: shentu_cert_v1alpha1_tx_pb.MsgProposeCertifierResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_MsgProposeCertifier,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_MsgProposeCertifier,
    responseSerialize: serialize_shentu_cert_v1alpha1_MsgProposeCertifierResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_MsgProposeCertifierResponse,
  },
  issueCertificate: {
    path: '/shentu.cert.v1alpha1.Msg/IssueCertificate',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_tx_pb.MsgIssueCertificate,
    responseType: shentu_cert_v1alpha1_tx_pb.MsgIssueCertificateResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_MsgIssueCertificate,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_MsgIssueCertificate,
    responseSerialize: serialize_shentu_cert_v1alpha1_MsgIssueCertificateResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_MsgIssueCertificateResponse,
  },
  revokeCertificate: {
    path: '/shentu.cert.v1alpha1.Msg/RevokeCertificate',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificate,
    responseType: shentu_cert_v1alpha1_tx_pb.MsgRevokeCertificateResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_MsgRevokeCertificate,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_MsgRevokeCertificate,
    responseSerialize: serialize_shentu_cert_v1alpha1_MsgRevokeCertificateResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_MsgRevokeCertificateResponse,
  },
  certifyPlatform: {
    path: '/shentu.cert.v1alpha1.Msg/CertifyPlatform',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatform,
    responseType: shentu_cert_v1alpha1_tx_pb.MsgCertifyPlatformResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_MsgCertifyPlatform,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_MsgCertifyPlatform,
    responseSerialize: serialize_shentu_cert_v1alpha1_MsgCertifyPlatformResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_MsgCertifyPlatformResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
