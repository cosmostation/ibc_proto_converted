// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_feeburner_query_pb = require('../../neutron/feeburner/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_feeburner_params_pb = require('../../neutron/feeburner/params_pb.js');
var neutron_feeburner_total_burned_neutrons_amount_pb = require('../../neutron/feeburner/total_burned_neutrons_amount_pb.js');

function serialize_neutron_feeburner_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_feeburner_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.feeburner.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feeburner_QueryParamsRequest(buffer_arg) {
  return neutron_feeburner_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feeburner_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_feeburner_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.feeburner.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feeburner_QueryParamsResponse(buffer_arg) {
  return neutron_feeburner_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountRequest(arg) {
  if (!(arg instanceof neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountRequest)) {
    throw new Error('Expected argument of type neutron.feeburner.QueryTotalBurnedNeutronsAmountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountRequest(buffer_arg) {
  return neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountResponse(arg) {
  if (!(arg instanceof neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountResponse)) {
    throw new Error('Expected argument of type neutron.feeburner.QueryTotalBurnedNeutronsAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountResponse(buffer_arg) {
  return neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/neutron.feeburner.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_feeburner_query_pb.QueryParamsRequest,
    responseType: neutron_feeburner_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_feeburner_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_feeburner_QueryParamsRequest,
    responseSerialize: serialize_neutron_feeburner_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_feeburner_QueryParamsResponse,
  },
  // TotalBurnedNeutronsAmount queries total amount of burned neutron fees.
totalBurnedNeutronsAmount: {
    path: '/neutron.feeburner.Query/TotalBurnedNeutronsAmount',
    requestStream: false,
    responseStream: false,
    requestType: neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountRequest,
    responseType: neutron_feeburner_query_pb.QueryTotalBurnedNeutronsAmountResponse,
    requestSerialize: serialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountRequest,
    requestDeserialize: deserialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountRequest,
    responseSerialize: serialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountResponse,
    responseDeserialize: deserialize_neutron_feeburner_QueryTotalBurnedNeutronsAmountResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
