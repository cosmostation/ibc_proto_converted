// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_fees_v1_query_pb = require('../../../canto/fees/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var canto_fees_v1_genesis_pb = require('../../../canto/fees/v1/genesis_pb.js');
var canto_fees_v1_fees_pb = require('../../../canto/fees/v1/fees_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_canto_fees_v1_QueryDeployerFeesRequest(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryDeployerFeesRequest)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryDeployerFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryDeployerFeesRequest(buffer_arg) {
  return canto_fees_v1_query_pb.QueryDeployerFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryDeployerFeesResponse(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryDeployerFeesResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryDeployerFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryDeployerFeesResponse(buffer_arg) {
  return canto_fees_v1_query_pb.QueryDeployerFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryFeeRequest(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryFeeRequest)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryFeeRequest(buffer_arg) {
  return canto_fees_v1_query_pb.QueryFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryFeeResponse(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryFeeResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryFeeResponse(buffer_arg) {
  return canto_fees_v1_query_pb.QueryFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryFeesRequest(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryFeesRequest)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryFeesRequest(buffer_arg) {
  return canto_fees_v1_query_pb.QueryFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryFeesResponse(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryFeesResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryFeesResponse(buffer_arg) {
  return canto_fees_v1_query_pb.QueryFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryParamsRequest(buffer_arg) {
  return canto_fees_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof canto_fees_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_QueryParamsResponse(buffer_arg) {
  return canto_fees_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Fees retrieves all registered contracts for fee distribution
fees: {
    path: '/canto.fees.v1.Query/Fees',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_query_pb.QueryFeesRequest,
    responseType: canto_fees_v1_query_pb.QueryFeesResponse,
    requestSerialize: serialize_canto_fees_v1_QueryFeesRequest,
    requestDeserialize: deserialize_canto_fees_v1_QueryFeesRequest,
    responseSerialize: serialize_canto_fees_v1_QueryFeesResponse,
    responseDeserialize: deserialize_canto_fees_v1_QueryFeesResponse,
  },
  // Fee retrieves a registered contract for fee distribution for a given
// address
fee: {
    path: '/canto.fees.v1.Query/Fee',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_query_pb.QueryFeeRequest,
    responseType: canto_fees_v1_query_pb.QueryFeeResponse,
    requestSerialize: serialize_canto_fees_v1_QueryFeeRequest,
    requestDeserialize: deserialize_canto_fees_v1_QueryFeeRequest,
    responseSerialize: serialize_canto_fees_v1_QueryFeeResponse,
    responseDeserialize: deserialize_canto_fees_v1_QueryFeeResponse,
  },
  // Params retrieves the fees module params
params: {
    path: '/canto.fees.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_query_pb.QueryParamsRequest,
    responseType: canto_fees_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_canto_fees_v1_QueryParamsRequest,
    requestDeserialize: deserialize_canto_fees_v1_QueryParamsRequest,
    responseSerialize: serialize_canto_fees_v1_QueryParamsResponse,
    responseDeserialize: deserialize_canto_fees_v1_QueryParamsResponse,
  },
  // DeployerFees retrieves all contracts that a given deployer has registered
// for fee distribution
deployerFees: {
    path: '/canto.fees.v1.Query/DeployerFees',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_query_pb.QueryDeployerFeesRequest,
    responseType: canto_fees_v1_query_pb.QueryDeployerFeesResponse,
    requestSerialize: serialize_canto_fees_v1_QueryDeployerFeesRequest,
    requestDeserialize: deserialize_canto_fees_v1_QueryDeployerFeesRequest,
    responseSerialize: serialize_canto_fees_v1_QueryDeployerFeesResponse,
    responseDeserialize: deserialize_canto_fees_v1_QueryDeployerFeesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
