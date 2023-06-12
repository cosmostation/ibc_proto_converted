// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_orm_query_v1alpha1_query_pb = require('../../../../cosmos/orm/query/v1alpha1/query_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_cosmos_orm_query_v1alpha1_GetRequest(arg) {
  if (!(arg instanceof cosmos_orm_query_v1alpha1_query_pb.GetRequest)) {
    throw new Error('Expected argument of type cosmos.orm.query.v1alpha1.GetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_orm_query_v1alpha1_GetRequest(buffer_arg) {
  return cosmos_orm_query_v1alpha1_query_pb.GetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_orm_query_v1alpha1_GetResponse(arg) {
  if (!(arg instanceof cosmos_orm_query_v1alpha1_query_pb.GetResponse)) {
    throw new Error('Expected argument of type cosmos.orm.query.v1alpha1.GetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_orm_query_v1alpha1_GetResponse(buffer_arg) {
  return cosmos_orm_query_v1alpha1_query_pb.GetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_orm_query_v1alpha1_ListRequest(arg) {
  if (!(arg instanceof cosmos_orm_query_v1alpha1_query_pb.ListRequest)) {
    throw new Error('Expected argument of type cosmos.orm.query.v1alpha1.ListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_orm_query_v1alpha1_ListRequest(buffer_arg) {
  return cosmos_orm_query_v1alpha1_query_pb.ListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_orm_query_v1alpha1_ListResponse(arg) {
  if (!(arg instanceof cosmos_orm_query_v1alpha1_query_pb.ListResponse)) {
    throw new Error('Expected argument of type cosmos.orm.query.v1alpha1.ListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_orm_query_v1alpha1_ListResponse(buffer_arg) {
  return cosmos_orm_query_v1alpha1_query_pb.ListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query is a generic gRPC service for querying ORM data.
var QueryService = exports.QueryService = {
  // Get queries an ORM table against an unique index.
get: {
    path: '/cosmos.orm.query.v1alpha1.Query/Get',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_orm_query_v1alpha1_query_pb.GetRequest,
    responseType: cosmos_orm_query_v1alpha1_query_pb.GetResponse,
    requestSerialize: serialize_cosmos_orm_query_v1alpha1_GetRequest,
    requestDeserialize: deserialize_cosmos_orm_query_v1alpha1_GetRequest,
    responseSerialize: serialize_cosmos_orm_query_v1alpha1_GetResponse,
    responseDeserialize: deserialize_cosmos_orm_query_v1alpha1_GetResponse,
  },
  // List queries an ORM table against an index.
list: {
    path: '/cosmos.orm.query.v1alpha1.Query/List',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_orm_query_v1alpha1_query_pb.ListRequest,
    responseType: cosmos_orm_query_v1alpha1_query_pb.ListResponse,
    requestSerialize: serialize_cosmos_orm_query_v1alpha1_ListRequest,
    requestDeserialize: deserialize_cosmos_orm_query_v1alpha1_ListRequest,
    responseSerialize: serialize_cosmos_orm_query_v1alpha1_ListResponse,
    responseDeserialize: deserialize_cosmos_orm_query_v1alpha1_ListResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
