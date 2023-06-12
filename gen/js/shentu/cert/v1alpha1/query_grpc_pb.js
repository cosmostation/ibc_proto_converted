// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_cert_v1alpha1_query_pb = require('../../../shentu/cert/v1alpha1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var shentu_cert_v1alpha1_cert_pb = require('../../../shentu/cert/v1alpha1/cert_pb.js');
var shentu_cert_v1alpha1_genesis_pb = require('../../../shentu/cert/v1alpha1/genesis_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_shentu_cert_v1alpha1_QueryCertificateRequest(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertificateRequest)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertificateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertificateRequest(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertificateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertificateResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertificateResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertificateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertificateResponse(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertificateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertificatesRequest(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertificatesRequest)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertificatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertificatesRequest(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertificatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertificatesResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertificatesResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertificatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertificatesResponse(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertificatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertifierRequest(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertifierRequest)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertifierRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertifierRequest(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertifierRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertifierResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertifierResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertifierResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertifierResponse(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertifierResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertifiersRequest(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertifiersRequest)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertifiersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertifiersRequest(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertifiersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryCertifiersResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryCertifiersResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryCertifiersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryCertifiersResponse(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryCertifiersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryPlatformRequest(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryPlatformRequest)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryPlatformRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryPlatformRequest(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryPlatformRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cert_v1alpha1_QueryPlatformResponse(arg) {
  if (!(arg instanceof shentu_cert_v1alpha1_query_pb.QueryPlatformResponse)) {
    throw new Error('Expected argument of type shentu.cert.v1alpha1.QueryPlatformResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cert_v1alpha1_QueryPlatformResponse(buffer_arg) {
  return shentu_cert_v1alpha1_query_pb.QueryPlatformResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for cert module.
var QueryService = exports.QueryService = {
  certifier: {
    path: '/shentu.cert.v1alpha1.Query/Certifier',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_query_pb.QueryCertifierRequest,
    responseType: shentu_cert_v1alpha1_query_pb.QueryCertifierResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_QueryCertifierRequest,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertifierRequest,
    responseSerialize: serialize_shentu_cert_v1alpha1_QueryCertifierResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertifierResponse,
  },
  certifiers: {
    path: '/shentu.cert.v1alpha1.Query/Certifiers',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_query_pb.QueryCertifiersRequest,
    responseType: shentu_cert_v1alpha1_query_pb.QueryCertifiersResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_QueryCertifiersRequest,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertifiersRequest,
    responseSerialize: serialize_shentu_cert_v1alpha1_QueryCertifiersResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertifiersResponse,
  },
  platform: {
    path: '/shentu.cert.v1alpha1.Query/Platform',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_query_pb.QueryPlatformRequest,
    responseType: shentu_cert_v1alpha1_query_pb.QueryPlatformResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_QueryPlatformRequest,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_QueryPlatformRequest,
    responseSerialize: serialize_shentu_cert_v1alpha1_QueryPlatformResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_QueryPlatformResponse,
  },
  certificate: {
    path: '/shentu.cert.v1alpha1.Query/Certificate',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_query_pb.QueryCertificateRequest,
    responseType: shentu_cert_v1alpha1_query_pb.QueryCertificateResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_QueryCertificateRequest,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertificateRequest,
    responseSerialize: serialize_shentu_cert_v1alpha1_QueryCertificateResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertificateResponse,
  },
  certificates: {
    path: '/shentu.cert.v1alpha1.Query/Certificates',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cert_v1alpha1_query_pb.QueryCertificatesRequest,
    responseType: shentu_cert_v1alpha1_query_pb.QueryCertificatesResponse,
    requestSerialize: serialize_shentu_cert_v1alpha1_QueryCertificatesRequest,
    requestDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertificatesRequest,
    responseSerialize: serialize_shentu_cert_v1alpha1_QueryCertificatesResponse,
    responseDeserialize: deserialize_shentu_cert_v1alpha1_QueryCertificatesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
