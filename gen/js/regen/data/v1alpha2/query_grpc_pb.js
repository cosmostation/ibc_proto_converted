// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_data_v1alpha2_query_pb = require('../../../regen/data/v1alpha2/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var regen_data_v1alpha2_types_pb = require('../../../regen/data/v1alpha2/types_pb.js');

function serialize_regen_data_v1alpha2_QueryByIRIRequest(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QueryByIRIRequest)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QueryByIRIRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QueryByIRIRequest(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QueryByIRIRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_QueryByIRIResponse(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QueryByIRIResponse)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QueryByIRIResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QueryByIRIResponse(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QueryByIRIResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_QueryBySignerRequest(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QueryBySignerRequest)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QueryBySignerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QueryBySignerRequest(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QueryBySignerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_QueryBySignerResponse(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QueryBySignerResponse)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QueryBySignerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QueryBySignerResponse(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QueryBySignerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_QuerySignersRequest(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QuerySignersRequest)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QuerySignersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QuerySignersRequest(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QuerySignersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_QuerySignersResponse(arg) {
  if (!(arg instanceof regen_data_v1alpha2_query_pb.QuerySignersResponse)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.QuerySignersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_QuerySignersResponse(buffer_arg) {
  return regen_data_v1alpha2_query_pb.QuerySignersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query is the regen.data.v1alpha2 Query service
var QueryService = exports.QueryService = {
  // ByHash queries data based on its ContentHash.
byIRI: {
    path: '/regen.data.v1alpha2.Query/ByIRI',
    requestStream: false,
    responseStream: false,
    requestType: regen_data_v1alpha2_query_pb.QueryByIRIRequest,
    responseType: regen_data_v1alpha2_query_pb.QueryByIRIResponse,
    requestSerialize: serialize_regen_data_v1alpha2_QueryByIRIRequest,
    requestDeserialize: deserialize_regen_data_v1alpha2_QueryByIRIRequest,
    responseSerialize: serialize_regen_data_v1alpha2_QueryByIRIResponse,
    responseDeserialize: deserialize_regen_data_v1alpha2_QueryByIRIResponse,
  },
  // BySigner queries data based on signers.
bySigner: {
    path: '/regen.data.v1alpha2.Query/BySigner',
    requestStream: false,
    responseStream: false,
    requestType: regen_data_v1alpha2_query_pb.QueryBySignerRequest,
    responseType: regen_data_v1alpha2_query_pb.QueryBySignerResponse,
    requestSerialize: serialize_regen_data_v1alpha2_QueryBySignerRequest,
    requestDeserialize: deserialize_regen_data_v1alpha2_QueryBySignerRequest,
    responseSerialize: serialize_regen_data_v1alpha2_QueryBySignerResponse,
    responseDeserialize: deserialize_regen_data_v1alpha2_QueryBySignerResponse,
  },
  // Signers queries signers based on IRI.
signers: {
    path: '/regen.data.v1alpha2.Query/Signers',
    requestStream: false,
    responseStream: false,
    requestType: regen_data_v1alpha2_query_pb.QuerySignersRequest,
    responseType: regen_data_v1alpha2_query_pb.QuerySignersResponse,
    requestSerialize: serialize_regen_data_v1alpha2_QuerySignersRequest,
    requestDeserialize: deserialize_regen_data_v1alpha2_QuerySignersRequest,
    responseSerialize: serialize_regen_data_v1alpha2_QuerySignersResponse,
    responseDeserialize: deserialize_regen_data_v1alpha2_QuerySignersResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
