// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_wasmx_v1_query_pb = require('../../../injective/wasmx/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_wasmx_v1_wasmx_pb = require('../../../injective/wasmx/v1/wasmx_pb.js');
var injective_wasmx_v1_genesis_pb = require('../../../injective/wasmx/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_injective_wasmx_v1_QueryContractRegistrationInfoRequest(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryContractRegistrationInfoRequest)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryContractRegistrationInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryContractRegistrationInfoRequest(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryContractRegistrationInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_QueryContractRegistrationInfoResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryContractRegistrationInfoResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryContractRegistrationInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryContractRegistrationInfoResponse(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryContractRegistrationInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryModuleStateRequest(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryModuleStateResponse(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_QueryWasmxParamsRequest(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryWasmxParamsRequest)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryWasmxParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryWasmxParamsRequest(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryWasmxParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_QueryWasmxParamsResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_query_pb.QueryWasmxParamsResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.QueryWasmxParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_QueryWasmxParamsResponse(buffer_arg) {
  return injective_wasmx_v1_query_pb.QueryWasmxParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Retrieves wasmx params
wasmxParams: {
    path: '/injective.wasmx.v1.Query/WasmxParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_query_pb.QueryWasmxParamsRequest,
    responseType: injective_wasmx_v1_query_pb.QueryWasmxParamsResponse,
    requestSerialize: serialize_injective_wasmx_v1_QueryWasmxParamsRequest,
    requestDeserialize: deserialize_injective_wasmx_v1_QueryWasmxParamsRequest,
    responseSerialize: serialize_injective_wasmx_v1_QueryWasmxParamsResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_QueryWasmxParamsResponse,
  },
  // Retrieves contract registration info
contractRegistrationInfo: {
    path: '/injective.wasmx.v1.Query/ContractRegistrationInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_query_pb.QueryContractRegistrationInfoRequest,
    responseType: injective_wasmx_v1_query_pb.QueryContractRegistrationInfoResponse,
    requestSerialize: serialize_injective_wasmx_v1_QueryContractRegistrationInfoRequest,
    requestDeserialize: deserialize_injective_wasmx_v1_QueryContractRegistrationInfoRequest,
    responseSerialize: serialize_injective_wasmx_v1_QueryContractRegistrationInfoResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_QueryContractRegistrationInfoResponse,
  },
  // Retrieves the entire wasmx module's state
wasmxModuleState: {
    path: '/injective.wasmx.v1.Query/WasmxModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_query_pb.QueryModuleStateRequest,
    responseType: injective_wasmx_v1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_wasmx_v1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_wasmx_v1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_wasmx_v1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_QueryModuleStateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
