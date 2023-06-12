// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_revenue_v1_query_pb = require('../../../evmos/revenue/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var evmos_revenue_v1_genesis_pb = require('../../../evmos/revenue/v1/genesis_pb.js');
var evmos_revenue_v1_revenue_pb = require('../../../evmos/revenue/v1/revenue_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_revenue_v1_QueryDeployerRevenuesRequest(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryDeployerRevenuesRequest)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryDeployerRevenuesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryDeployerRevenuesRequest(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryDeployerRevenuesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryDeployerRevenuesResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryDeployerRevenuesResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryDeployerRevenuesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryDeployerRevenuesResponse(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryDeployerRevenuesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryParamsRequest(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryParamsResponse(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryRevenueRequest(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryRevenueRequest)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryRevenueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryRevenueRequest(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryRevenueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryRevenueResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryRevenueResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryRevenueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryRevenueResponse(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryRevenueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryRevenuesRequest(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryRevenuesRequest)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryRevenuesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryRevenuesRequest(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryRevenuesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryRevenuesResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryRevenuesResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryRevenuesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryRevenuesResponse(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryRevenuesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryWithdrawerRevenuesRequest(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesRequest)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryWithdrawerRevenuesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryWithdrawerRevenuesRequest(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_QueryWithdrawerRevenuesResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.QueryWithdrawerRevenuesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_QueryWithdrawerRevenuesResponse(buffer_arg) {
  return evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Revenues retrieves all registered revenues
revenues: {
    path: '/evmos.revenue.v1.Query/Revenues',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_query_pb.QueryRevenuesRequest,
    responseType: evmos_revenue_v1_query_pb.QueryRevenuesResponse,
    requestSerialize: serialize_evmos_revenue_v1_QueryRevenuesRequest,
    requestDeserialize: deserialize_evmos_revenue_v1_QueryRevenuesRequest,
    responseSerialize: serialize_evmos_revenue_v1_QueryRevenuesResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_QueryRevenuesResponse,
  },
  // Revenue retrieves a registered revenue for a given contract address
revenue: {
    path: '/evmos.revenue.v1.Query/Revenue',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_query_pb.QueryRevenueRequest,
    responseType: evmos_revenue_v1_query_pb.QueryRevenueResponse,
    requestSerialize: serialize_evmos_revenue_v1_QueryRevenueRequest,
    requestDeserialize: deserialize_evmos_revenue_v1_QueryRevenueRequest,
    responseSerialize: serialize_evmos_revenue_v1_QueryRevenueResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_QueryRevenueResponse,
  },
  // Params retrieves the revenue module params
params: {
    path: '/evmos.revenue.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_query_pb.QueryParamsRequest,
    responseType: evmos_revenue_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_evmos_revenue_v1_QueryParamsRequest,
    requestDeserialize: deserialize_evmos_revenue_v1_QueryParamsRequest,
    responseSerialize: serialize_evmos_revenue_v1_QueryParamsResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_QueryParamsResponse,
  },
  // DeployerRevenues retrieves all revenues that a given deployer has
// registered
deployerRevenues: {
    path: '/evmos.revenue.v1.Query/DeployerRevenues',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_query_pb.QueryDeployerRevenuesRequest,
    responseType: evmos_revenue_v1_query_pb.QueryDeployerRevenuesResponse,
    requestSerialize: serialize_evmos_revenue_v1_QueryDeployerRevenuesRequest,
    requestDeserialize: deserialize_evmos_revenue_v1_QueryDeployerRevenuesRequest,
    responseSerialize: serialize_evmos_revenue_v1_QueryDeployerRevenuesResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_QueryDeployerRevenuesResponse,
  },
  // WithdrawerRevenues retrieves all revenues with a given withdrawer
// address
withdrawerRevenues: {
    path: '/evmos.revenue.v1.Query/WithdrawerRevenues',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesRequest,
    responseType: evmos_revenue_v1_query_pb.QueryWithdrawerRevenuesResponse,
    requestSerialize: serialize_evmos_revenue_v1_QueryWithdrawerRevenuesRequest,
    requestDeserialize: deserialize_evmos_revenue_v1_QueryWithdrawerRevenuesRequest,
    responseSerialize: serialize_evmos_revenue_v1_QueryWithdrawerRevenuesResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_QueryWithdrawerRevenuesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
