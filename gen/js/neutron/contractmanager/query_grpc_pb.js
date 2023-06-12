// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_contractmanager_query_pb = require('../../neutron/contractmanager/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_contractmanager_params_pb = require('../../neutron/contractmanager/params_pb.js');
var neutron_contractmanager_genesis_pb = require('../../neutron/contractmanager/genesis_pb.js');

function serialize_neutron_contractmanager_QueryFailuresRequest(arg) {
  if (!(arg instanceof neutron_contractmanager_query_pb.QueryFailuresRequest)) {
    throw new Error('Expected argument of type neutron.contractmanager.QueryFailuresRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_contractmanager_QueryFailuresRequest(buffer_arg) {
  return neutron_contractmanager_query_pb.QueryFailuresRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_contractmanager_QueryFailuresResponse(arg) {
  if (!(arg instanceof neutron_contractmanager_query_pb.QueryFailuresResponse)) {
    throw new Error('Expected argument of type neutron.contractmanager.QueryFailuresResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_contractmanager_QueryFailuresResponse(buffer_arg) {
  return neutron_contractmanager_query_pb.QueryFailuresResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_contractmanager_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_contractmanager_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.contractmanager.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_contractmanager_QueryParamsRequest(buffer_arg) {
  return neutron_contractmanager_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_contractmanager_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_contractmanager_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.contractmanager.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_contractmanager_QueryParamsResponse(buffer_arg) {
  return neutron_contractmanager_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/neutron.contractmanager.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_contractmanager_query_pb.QueryParamsRequest,
    responseType: neutron_contractmanager_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_contractmanager_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_contractmanager_QueryParamsRequest,
    responseSerialize: serialize_neutron_contractmanager_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_contractmanager_QueryParamsResponse,
  },
  // Queries a Failure by address.
addressFailures: {
    path: '/neutron.contractmanager.Query/AddressFailures',
    requestStream: false,
    responseStream: false,
    requestType: neutron_contractmanager_query_pb.QueryFailuresRequest,
    responseType: neutron_contractmanager_query_pb.QueryFailuresResponse,
    requestSerialize: serialize_neutron_contractmanager_QueryFailuresRequest,
    requestDeserialize: deserialize_neutron_contractmanager_QueryFailuresRequest,
    responseSerialize: serialize_neutron_contractmanager_QueryFailuresResponse,
    responseDeserialize: deserialize_neutron_contractmanager_QueryFailuresResponse,
  },
  // Queries a list of Failure items.
failures: {
    path: '/neutron.contractmanager.Query/Failures',
    requestStream: false,
    responseStream: false,
    requestType: neutron_contractmanager_query_pb.QueryFailuresRequest,
    responseType: neutron_contractmanager_query_pb.QueryFailuresResponse,
    requestSerialize: serialize_neutron_contractmanager_QueryFailuresRequest,
    requestDeserialize: deserialize_neutron_contractmanager_QueryFailuresRequest,
    responseSerialize: serialize_neutron_contractmanager_QueryFailuresResponse,
    responseDeserialize: deserialize_neutron_contractmanager_QueryFailuresResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
