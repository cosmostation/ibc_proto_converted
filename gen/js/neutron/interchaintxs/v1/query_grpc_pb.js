// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_interchaintxs_v1_query_pb = require('../../../neutron/interchaintxs/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_interchaintxs_v1_params_pb = require('../../../neutron/interchaintxs/v1/params_pb.js');

function serialize_neutron_interchaintxs_QueryInterchainAccountAddressRequest(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressRequest)) {
    throw new Error('Expected argument of type neutron.interchaintxs.QueryInterchainAccountAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_QueryInterchainAccountAddressRequest(buffer_arg) {
  return neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_QueryInterchainAccountAddressResponse(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressResponse)) {
    throw new Error('Expected argument of type neutron.interchaintxs.QueryInterchainAccountAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_QueryInterchainAccountAddressResponse(buffer_arg) {
  return neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.interchaintxs.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_QueryParamsRequest(buffer_arg) {
  return neutron_interchaintxs_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.interchaintxs.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_QueryParamsResponse(buffer_arg) {
  return neutron_interchaintxs_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/neutron.interchaintxs.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchaintxs_v1_query_pb.QueryParamsRequest,
    responseType: neutron_interchaintxs_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_interchaintxs_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_interchaintxs_QueryParamsRequest,
    responseSerialize: serialize_neutron_interchaintxs_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_interchaintxs_QueryParamsResponse,
  },
  interchainAccountAddress: {
    path: '/neutron.interchaintxs.Query/InterchainAccountAddress',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressRequest,
    responseType: neutron_interchaintxs_v1_query_pb.QueryInterchainAccountAddressResponse,
    requestSerialize: serialize_neutron_interchaintxs_QueryInterchainAccountAddressRequest,
    requestDeserialize: deserialize_neutron_interchaintxs_QueryInterchainAccountAddressRequest,
    responseSerialize: serialize_neutron_interchaintxs_QueryInterchainAccountAddressResponse,
    responseDeserialize: deserialize_neutron_interchaintxs_QueryInterchainAccountAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
