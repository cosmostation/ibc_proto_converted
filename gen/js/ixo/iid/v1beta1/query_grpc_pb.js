// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_iid_v1beta1_query_pb = require('../../../ixo/iid/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var ixo_iid_v1beta1_iid_pb = require('../../../ixo/iid/v1beta1/iid_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_ixo_iid_v1beta1_QueryIidDocumentRequest(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_query_pb.QueryIidDocumentRequest)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.QueryIidDocumentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_QueryIidDocumentRequest(buffer_arg) {
  return ixo_iid_v1beta1_query_pb.QueryIidDocumentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_QueryIidDocumentResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_query_pb.QueryIidDocumentResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.QueryIidDocumentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_QueryIidDocumentResponse(buffer_arg) {
  return ixo_iid_v1beta1_query_pb.QueryIidDocumentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_QueryIidDocumentsRequest(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_query_pb.QueryIidDocumentsRequest)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.QueryIidDocumentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_QueryIidDocumentsRequest(buffer_arg) {
  return ixo_iid_v1beta1_query_pb.QueryIidDocumentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_QueryIidDocumentsResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_query_pb.QueryIidDocumentsResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.QueryIidDocumentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_QueryIidDocumentsResponse(buffer_arg) {
  return ixo_iid_v1beta1_query_pb.QueryIidDocumentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // IidDocuments queries all iid documents that match the given status.
iidDocuments: {
    path: '/ixo.iid.v1beta1.Query/IidDocuments',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_query_pb.QueryIidDocumentsRequest,
    responseType: ixo_iid_v1beta1_query_pb.QueryIidDocumentsResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_QueryIidDocumentsRequest,
    requestDeserialize: deserialize_ixo_iid_v1beta1_QueryIidDocumentsRequest,
    responseSerialize: serialize_ixo_iid_v1beta1_QueryIidDocumentsResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_QueryIidDocumentsResponse,
  },
  // IidDocument queries a iid documents with an id.
iidDocument: {
    path: '/ixo.iid.v1beta1.Query/IidDocument',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_query_pb.QueryIidDocumentRequest,
    responseType: ixo_iid_v1beta1_query_pb.QueryIidDocumentResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_QueryIidDocumentRequest,
    requestDeserialize: deserialize_ixo_iid_v1beta1_QueryIidDocumentRequest,
    responseSerialize: serialize_ixo_iid_v1beta1_QueryIidDocumentResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_QueryIidDocumentResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
