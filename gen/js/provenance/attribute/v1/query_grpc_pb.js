// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_attribute_v1_query_pb = require('../../../provenance/attribute/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var provenance_attribute_v1_attribute_pb = require('../../../provenance/attribute/v1/attribute_pb.js');

function serialize_provenance_attribute_v1_QueryAccountDataRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAccountDataRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAccountDataRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAccountDataResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAccountDataResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAccountDataResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributeAccountsRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributeAccountsRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributeAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributeAccountsRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributeAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributeAccountsResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributeAccountsResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributeAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributeAccountsResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributeAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributeRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributeRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributeRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributeResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributeResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributeResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributesRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributesRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributesRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryAttributesResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryAttributesResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryAttributesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryAttributesResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryAttributesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryParamsRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryParamsResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryScanRequest(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryScanRequest)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryScanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryScanRequest(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryScanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_attribute_v1_QueryScanResponse(arg) {
  if (!(arg instanceof provenance_attribute_v1_query_pb.QueryScanResponse)) {
    throw new Error('Expected argument of type provenance.attribute.v1.QueryScanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_attribute_v1_QueryScanResponse(buffer_arg) {
  return provenance_attribute_v1_query_pb.QueryScanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for attribute module.
var QueryService = exports.QueryService = {
  // Params queries params of the attribute module.
params: {
    path: '/provenance.attribute.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryParamsRequest,
    responseType: provenance_attribute_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryParamsRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryParamsRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryParamsResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryParamsResponse,
  },
  // Attribute queries attributes on a given account (address) for one (or more) with the given name
attribute: {
    path: '/provenance.attribute.v1.Query/Attribute',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryAttributeRequest,
    responseType: provenance_attribute_v1_query_pb.QueryAttributeResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryAttributeRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryAttributeRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryAttributeResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryAttributeResponse,
  },
  // Attributes queries attributes on a given account (address) for any defined attributes
attributes: {
    path: '/provenance.attribute.v1.Query/Attributes',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryAttributesRequest,
    responseType: provenance_attribute_v1_query_pb.QueryAttributesResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryAttributesRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryAttributesRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryAttributesResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryAttributesResponse,
  },
  // Scan queries attributes on a given account (address) for any that match the provided suffix
scan: {
    path: '/provenance.attribute.v1.Query/Scan',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryScanRequest,
    responseType: provenance_attribute_v1_query_pb.QueryScanResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryScanRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryScanRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryScanResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryScanResponse,
  },
  // AttributeAccounts queries accounts on a given attribute name
attributeAccounts: {
    path: '/provenance.attribute.v1.Query/AttributeAccounts',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryAttributeAccountsRequest,
    responseType: provenance_attribute_v1_query_pb.QueryAttributeAccountsResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryAttributeAccountsRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryAttributeAccountsRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryAttributeAccountsResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryAttributeAccountsResponse,
  },
  // AccountData returns the accountdata for a specified account.
accountData: {
    path: '/provenance.attribute.v1.Query/AccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_attribute_v1_query_pb.QueryAccountDataRequest,
    responseType: provenance_attribute_v1_query_pb.QueryAccountDataResponse,
    requestSerialize: serialize_provenance_attribute_v1_QueryAccountDataRequest,
    requestDeserialize: deserialize_provenance_attribute_v1_QueryAccountDataRequest,
    responseSerialize: serialize_provenance_attribute_v1_QueryAccountDataResponse,
    responseDeserialize: deserialize_provenance_attribute_v1_QueryAccountDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
