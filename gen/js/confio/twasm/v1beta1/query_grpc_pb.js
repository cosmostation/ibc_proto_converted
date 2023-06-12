// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var confio_twasm_v1beta1_query_pb = require('../../../confio/twasm/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmwasm_wasm_v1_types_pb = require('../../../cosmwasm/wasm/v1/types_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeRequest(arg) {
  if (!(arg instanceof confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeRequest)) {
    throw new Error('Expected argument of type confio.twasm.v1beta1.QueryContractsByPrivilegeTypeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeRequest(buffer_arg) {
  return confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeResponse(arg) {
  if (!(arg instanceof confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeResponse)) {
    throw new Error('Expected argument of type confio.twasm.v1beta1.QueryContractsByPrivilegeTypeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeResponse(buffer_arg) {
  return confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_twasm_v1beta1_QueryPrivilegedContractsRequest(arg) {
  if (!(arg instanceof confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsRequest)) {
    throw new Error('Expected argument of type confio.twasm.v1beta1.QueryPrivilegedContractsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_twasm_v1beta1_QueryPrivilegedContractsRequest(buffer_arg) {
  return confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_twasm_v1beta1_QueryPrivilegedContractsResponse(arg) {
  if (!(arg instanceof confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsResponse)) {
    throw new Error('Expected argument of type confio.twasm.v1beta1.QueryPrivilegedContractsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_twasm_v1beta1_QueryPrivilegedContractsResponse(buffer_arg) {
  return confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service
var QueryService = exports.QueryService = {
  // PrivilegedContracts returns all privileged contracts
privilegedContracts: {
    path: '/confio.twasm.v1beta1.Query/PrivilegedContracts',
    requestStream: false,
    responseStream: false,
    requestType: confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsRequest,
    responseType: confio_twasm_v1beta1_query_pb.QueryPrivilegedContractsResponse,
    requestSerialize: serialize_confio_twasm_v1beta1_QueryPrivilegedContractsRequest,
    requestDeserialize: deserialize_confio_twasm_v1beta1_QueryPrivilegedContractsRequest,
    responseSerialize: serialize_confio_twasm_v1beta1_QueryPrivilegedContractsResponse,
    responseDeserialize: deserialize_confio_twasm_v1beta1_QueryPrivilegedContractsResponse,
  },
  // ContractsByPrivilegeType returns all contracts that have registered for the
// privilege type
contractsByPrivilegeType: {
    path: '/confio.twasm.v1beta1.Query/ContractsByPrivilegeType',
    requestStream: false,
    responseStream: false,
    requestType: confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeRequest,
    responseType: confio_twasm_v1beta1_query_pb.QueryContractsByPrivilegeTypeResponse,
    requestSerialize: serialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeRequest,
    requestDeserialize: deserialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeRequest,
    responseSerialize: serialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeResponse,
    responseDeserialize: deserialize_confio_twasm_v1beta1_QueryContractsByPrivilegeTypeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
