// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_feerefunder_query_pb = require('../../neutron/feerefunder/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_feerefunder_params_pb = require('../../neutron/feerefunder/params_pb.js');
var neutron_feerefunder_genesis_pb = require('../../neutron/feerefunder/genesis_pb.js');

function serialize_neutron_feerefunder_FeeInfoRequest(arg) {
  if (!(arg instanceof neutron_feerefunder_query_pb.FeeInfoRequest)) {
    throw new Error('Expected argument of type neutron.feerefunder.FeeInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feerefunder_FeeInfoRequest(buffer_arg) {
  return neutron_feerefunder_query_pb.FeeInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feerefunder_FeeInfoResponse(arg) {
  if (!(arg instanceof neutron_feerefunder_query_pb.FeeInfoResponse)) {
    throw new Error('Expected argument of type neutron.feerefunder.FeeInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feerefunder_FeeInfoResponse(buffer_arg) {
  return neutron_feerefunder_query_pb.FeeInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feerefunder_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_feerefunder_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.feerefunder.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feerefunder_QueryParamsRequest(buffer_arg) {
  return neutron_feerefunder_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feerefunder_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_feerefunder_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.feerefunder.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feerefunder_QueryParamsResponse(buffer_arg) {
  return neutron_feerefunder_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/neutron.feerefunder.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_feerefunder_query_pb.QueryParamsRequest,
    responseType: neutron_feerefunder_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_feerefunder_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_feerefunder_QueryParamsRequest,
    responseSerialize: serialize_neutron_feerefunder_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_feerefunder_QueryParamsResponse,
  },
  feeInfo: {
    path: '/neutron.feerefunder.Query/FeeInfo',
    requestStream: false,
    responseStream: false,
    requestType: neutron_feerefunder_query_pb.FeeInfoRequest,
    responseType: neutron_feerefunder_query_pb.FeeInfoResponse,
    requestSerialize: serialize_neutron_feerefunder_FeeInfoRequest,
    requestDeserialize: deserialize_neutron_feerefunder_FeeInfoRequest,
    responseSerialize: serialize_neutron_feerefunder_FeeInfoResponse,
    responseDeserialize: deserialize_neutron_feerefunder_FeeInfoResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
