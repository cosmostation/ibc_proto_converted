// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_issuer_v1_query_pb = require('../../../em/issuer/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var em_issuer_v1_issuer_pb = require('../../../em/issuer/v1/issuer_pb.js');

function serialize_em_issuer_v1_QueryIssuersRequest(arg) {
  if (!(arg instanceof em_issuer_v1_query_pb.QueryIssuersRequest)) {
    throw new Error('Expected argument of type em.issuer.v1.QueryIssuersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_QueryIssuersRequest(buffer_arg) {
  return em_issuer_v1_query_pb.QueryIssuersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_issuer_v1_QueryIssuersResponse(arg) {
  if (!(arg instanceof em_issuer_v1_query_pb.QueryIssuersResponse)) {
    throw new Error('Expected argument of type em.issuer.v1.QueryIssuersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_issuer_v1_QueryIssuersResponse(buffer_arg) {
  return em_issuer_v1_query_pb.QueryIssuersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  issuers: {
    path: '/em.issuer.v1.Query/Issuers',
    requestStream: false,
    responseStream: false,
    requestType: em_issuer_v1_query_pb.QueryIssuersRequest,
    responseType: em_issuer_v1_query_pb.QueryIssuersResponse,
    requestSerialize: serialize_em_issuer_v1_QueryIssuersRequest,
    requestDeserialize: deserialize_em_issuer_v1_QueryIssuersRequest,
    responseSerialize: serialize_em_issuer_v1_QueryIssuersResponse,
    responseDeserialize: deserialize_em_issuer_v1_QueryIssuersResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
