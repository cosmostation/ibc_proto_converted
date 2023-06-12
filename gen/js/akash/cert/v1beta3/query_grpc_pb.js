// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_cert_v1beta3_query_pb = require('../../../akash/cert/v1beta3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_cert_v1beta3_cert_pb = require('../../../akash/cert/v1beta3/cert_pb.js');

function serialize_akash_cert_v1beta3_QueryCertificatesRequest(arg) {
  if (!(arg instanceof akash_cert_v1beta3_query_pb.QueryCertificatesRequest)) {
    throw new Error('Expected argument of type akash.cert.v1beta3.QueryCertificatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta3_QueryCertificatesRequest(buffer_arg) {
  return akash_cert_v1beta3_query_pb.QueryCertificatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_cert_v1beta3_QueryCertificatesResponse(arg) {
  if (!(arg instanceof akash_cert_v1beta3_query_pb.QueryCertificatesResponse)) {
    throw new Error('Expected argument of type akash.cert.v1beta3.QueryCertificatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_cert_v1beta3_QueryCertificatesResponse(buffer_arg) {
  return akash_cert_v1beta3_query_pb.QueryCertificatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Certificates queries certificates
certificates: {
    path: '/akash.cert.v1beta3.Query/Certificates',
    requestStream: false,
    responseStream: false,
    requestType: akash_cert_v1beta3_query_pb.QueryCertificatesRequest,
    responseType: akash_cert_v1beta3_query_pb.QueryCertificatesResponse,
    requestSerialize: serialize_akash_cert_v1beta3_QueryCertificatesRequest,
    requestDeserialize: deserialize_akash_cert_v1beta3_QueryCertificatesRequest,
    responseSerialize: serialize_akash_cert_v1beta3_QueryCertificatesResponse,
    responseDeserialize: deserialize_akash_cert_v1beta3_QueryCertificatesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
