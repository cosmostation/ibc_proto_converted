// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_node_v2_querier_pb = require('../../../sentinel/node/v2/querier_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sentinel_types_v1_status_pb = require('../../../sentinel/types/v1/status_pb.js');
var sentinel_node_v2_node_pb = require('../../../sentinel/node/v2/node_pb.js');
var sentinel_node_v2_params_pb = require('../../../sentinel/node/v2/params_pb.js');

function serialize_sentinel_node_v2_QueryNodeRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodeRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodeRequest(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryNodeResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodeResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodeResponse(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryNodesForPlanRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodesForPlanRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodesForPlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodesForPlanRequest(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodesForPlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryNodesForPlanResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodesForPlanResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodesForPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodesForPlanResponse(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodesForPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryNodesRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodesRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodesRequest(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryNodesResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryNodesResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryNodesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryNodesResponse(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryNodesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryParamsRequest(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryParamsRequest(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_node_v2_QueryParamsResponse(arg) {
  if (!(arg instanceof sentinel_node_v2_querier_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type sentinel.node.v2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_node_v2_QueryParamsResponse(buffer_arg) {
  return sentinel_node_v2_querier_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  queryNodes: {
    path: '/sentinel.node.v2.QueryService/QueryNodes',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_querier_pb.QueryNodesRequest,
    responseType: sentinel_node_v2_querier_pb.QueryNodesResponse,
    requestSerialize: serialize_sentinel_node_v2_QueryNodesRequest,
    requestDeserialize: deserialize_sentinel_node_v2_QueryNodesRequest,
    responseSerialize: serialize_sentinel_node_v2_QueryNodesResponse,
    responseDeserialize: deserialize_sentinel_node_v2_QueryNodesResponse,
  },
  queryNodesForPlan: {
    path: '/sentinel.node.v2.QueryService/QueryNodesForPlan',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_querier_pb.QueryNodesForPlanRequest,
    responseType: sentinel_node_v2_querier_pb.QueryNodesForPlanResponse,
    requestSerialize: serialize_sentinel_node_v2_QueryNodesForPlanRequest,
    requestDeserialize: deserialize_sentinel_node_v2_QueryNodesForPlanRequest,
    responseSerialize: serialize_sentinel_node_v2_QueryNodesForPlanResponse,
    responseDeserialize: deserialize_sentinel_node_v2_QueryNodesForPlanResponse,
  },
  queryNode: {
    path: '/sentinel.node.v2.QueryService/QueryNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_querier_pb.QueryNodeRequest,
    responseType: sentinel_node_v2_querier_pb.QueryNodeResponse,
    requestSerialize: serialize_sentinel_node_v2_QueryNodeRequest,
    requestDeserialize: deserialize_sentinel_node_v2_QueryNodeRequest,
    responseSerialize: serialize_sentinel_node_v2_QueryNodeResponse,
    responseDeserialize: deserialize_sentinel_node_v2_QueryNodeResponse,
  },
  queryParams: {
    path: '/sentinel.node.v2.QueryService/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_node_v2_querier_pb.QueryParamsRequest,
    responseType: sentinel_node_v2_querier_pb.QueryParamsResponse,
    requestSerialize: serialize_sentinel_node_v2_QueryParamsRequest,
    requestDeserialize: deserialize_sentinel_node_v2_QueryParamsRequest,
    responseSerialize: serialize_sentinel_node_v2_QueryParamsResponse,
    responseDeserialize: deserialize_sentinel_node_v2_QueryParamsResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
