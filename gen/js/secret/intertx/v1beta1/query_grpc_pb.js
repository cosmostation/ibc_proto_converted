// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_intertx_v1beta1_query_pb = require('../../../secret/intertx/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressRequest(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressRequest)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.QueryInterchainAccountFromAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressRequest(buffer_arg) {
  return secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressResponse(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressResponse)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.QueryInterchainAccountFromAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressResponse(buffer_arg) {
  return secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // QueryInterchainAccountFromAddress returns the interchain account for given owner address on a given connection pair
interchainAccountFromAddress: {
    path: '/secret.intertx.v1beta1.Query/InterchainAccountFromAddress',
    requestStream: false,
    responseStream: false,
    requestType: secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressRequest,
    responseType: secret_intertx_v1beta1_query_pb.QueryInterchainAccountFromAddressResponse,
    requestSerialize: serialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressRequest,
    requestDeserialize: deserialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressRequest,
    responseSerialize: serialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressResponse,
    responseDeserialize: deserialize_secret_intertx_v1beta1_QueryInterchainAccountFromAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
