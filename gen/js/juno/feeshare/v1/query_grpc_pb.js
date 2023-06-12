// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var juno_feeshare_v1_query_pb = require('../../../juno/feeshare/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var juno_feeshare_v1_genesis_pb = require('../../../juno/feeshare/v1/genesis_pb.js');
var juno_feeshare_v1_feeshare_pb = require('../../../juno/feeshare/v1/feeshare_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_juno_feeshare_v1_QueryDeployerFeeSharesRequest(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryDeployerFeeSharesRequest)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryDeployerFeeSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryDeployerFeeSharesRequest(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryDeployerFeeSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryDeployerFeeSharesResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryDeployerFeeSharesResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryDeployerFeeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryDeployerFeeSharesResponse(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryDeployerFeeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryFeeShareRequest(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryFeeShareRequest)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryFeeShareRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryFeeShareRequest(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryFeeShareRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryFeeShareResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryFeeShareResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryFeeShareResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryFeeShareResponse(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryFeeShareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryFeeSharesRequest(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryFeeSharesRequest)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryFeeSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryFeeSharesRequest(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryFeeSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryFeeSharesResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryFeeSharesResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryFeeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryFeeSharesResponse(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryFeeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryParamsRequest(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryParamsResponse(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryWithdrawerFeeSharesRequest(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesRequest)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryWithdrawerFeeSharesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryWithdrawerFeeSharesRequest(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_QueryWithdrawerFeeSharesResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.QueryWithdrawerFeeSharesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_QueryWithdrawerFeeSharesResponse(buffer_arg) {
  return juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // FeeShares retrieves all registered FeeShares
feeShares: {
    path: '/juno.feeshare.v1.Query/FeeShares',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_query_pb.QueryFeeSharesRequest,
    responseType: juno_feeshare_v1_query_pb.QueryFeeSharesResponse,
    requestSerialize: serialize_juno_feeshare_v1_QueryFeeSharesRequest,
    requestDeserialize: deserialize_juno_feeshare_v1_QueryFeeSharesRequest,
    responseSerialize: serialize_juno_feeshare_v1_QueryFeeSharesResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_QueryFeeSharesResponse,
  },
  // FeeShare retrieves a registered FeeShare for a given contract address
feeShare: {
    path: '/juno.feeshare.v1.Query/FeeShare',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_query_pb.QueryFeeShareRequest,
    responseType: juno_feeshare_v1_query_pb.QueryFeeShareResponse,
    requestSerialize: serialize_juno_feeshare_v1_QueryFeeShareRequest,
    requestDeserialize: deserialize_juno_feeshare_v1_QueryFeeShareRequest,
    responseSerialize: serialize_juno_feeshare_v1_QueryFeeShareResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_QueryFeeShareResponse,
  },
  // Params retrieves the FeeShare module params
params: {
    path: '/juno.feeshare.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_query_pb.QueryParamsRequest,
    responseType: juno_feeshare_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_juno_feeshare_v1_QueryParamsRequest,
    requestDeserialize: deserialize_juno_feeshare_v1_QueryParamsRequest,
    responseSerialize: serialize_juno_feeshare_v1_QueryParamsResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_QueryParamsResponse,
  },
  // DeployerFeeShares retrieves all FeeShares that a given deployer has
// registered
deployerFeeShares: {
    path: '/juno.feeshare.v1.Query/DeployerFeeShares',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_query_pb.QueryDeployerFeeSharesRequest,
    responseType: juno_feeshare_v1_query_pb.QueryDeployerFeeSharesResponse,
    requestSerialize: serialize_juno_feeshare_v1_QueryDeployerFeeSharesRequest,
    requestDeserialize: deserialize_juno_feeshare_v1_QueryDeployerFeeSharesRequest,
    responseSerialize: serialize_juno_feeshare_v1_QueryDeployerFeeSharesResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_QueryDeployerFeeSharesResponse,
  },
  // WithdrawerFeeShares retrieves all FeeShares with a given withdrawer
// address
withdrawerFeeShares: {
    path: '/juno.feeshare.v1.Query/WithdrawerFeeShares',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesRequest,
    responseType: juno_feeshare_v1_query_pb.QueryWithdrawerFeeSharesResponse,
    requestSerialize: serialize_juno_feeshare_v1_QueryWithdrawerFeeSharesRequest,
    requestDeserialize: deserialize_juno_feeshare_v1_QueryWithdrawerFeeSharesRequest,
    responseSerialize: serialize_juno_feeshare_v1_QueryWithdrawerFeeSharesResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_QueryWithdrawerFeeSharesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
