// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_did_v2_query_pb = require('../../../panacea/did/v2/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var panacea_did_v2_did_pb = require('../../../panacea/did/v2/did_pb.js');

function serialize_panacea_did_v2_QueryDIDRequest(arg) {
  if (!(arg instanceof panacea_did_v2_query_pb.QueryDIDRequest)) {
    throw new Error('Expected argument of type panacea.did.v2.QueryDIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_QueryDIDRequest(buffer_arg) {
  return panacea_did_v2_query_pb.QueryDIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_did_v2_QueryDIDResponse(arg) {
  if (!(arg instanceof panacea_did_v2_query_pb.QueryDIDResponse)) {
    throw new Error('Expected argument of type panacea.did.v2.QueryDIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_did_v2_QueryDIDResponse(buffer_arg) {
  return panacea_did_v2_query_pb.QueryDIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // DID returns a DID Document with a sequence number.
dID: {
    path: '/panacea.did.v2.Query/DID',
    requestStream: false,
    responseStream: false,
    requestType: panacea_did_v2_query_pb.QueryDIDRequest,
    responseType: panacea_did_v2_query_pb.QueryDIDResponse,
    requestSerialize: serialize_panacea_did_v2_QueryDIDRequest,
    requestDeserialize: deserialize_panacea_did_v2_QueryDIDRequest,
    responseSerialize: serialize_panacea_did_v2_QueryDIDResponse,
    responseDeserialize: deserialize_panacea_did_v2_QueryDIDResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
