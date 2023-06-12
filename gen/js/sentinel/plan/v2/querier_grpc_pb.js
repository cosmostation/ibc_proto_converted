// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_plan_v2_querier_pb = require('../../../sentinel/plan/v2/querier_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sentinel_types_v1_status_pb = require('../../../sentinel/types/v1/status_pb.js');
var sentinel_plan_v2_plan_pb = require('../../../sentinel/plan/v2/plan_pb.js');

function serialize_sentinel_plan_v2_QueryPlanRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlanRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlanRequest(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_QueryPlanResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlanResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlanResponse(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_QueryPlansForProviderRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlansForProviderRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlansForProviderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlansForProviderRequest(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlansForProviderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_QueryPlansForProviderResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlansForProviderResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlansForProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlansForProviderResponse(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlansForProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_QueryPlansRequest(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlansRequest)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlansRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlansRequest(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlansRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_plan_v2_QueryPlansResponse(arg) {
  if (!(arg instanceof sentinel_plan_v2_querier_pb.QueryPlansResponse)) {
    throw new Error('Expected argument of type sentinel.plan.v2.QueryPlansResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_plan_v2_QueryPlansResponse(buffer_arg) {
  return sentinel_plan_v2_querier_pb.QueryPlansResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  queryPlans: {
    path: '/sentinel.plan.v2.QueryService/QueryPlans',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_querier_pb.QueryPlansRequest,
    responseType: sentinel_plan_v2_querier_pb.QueryPlansResponse,
    requestSerialize: serialize_sentinel_plan_v2_QueryPlansRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_QueryPlansRequest,
    responseSerialize: serialize_sentinel_plan_v2_QueryPlansResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_QueryPlansResponse,
  },
  queryPlansForProvider: {
    path: '/sentinel.plan.v2.QueryService/QueryPlansForProvider',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_querier_pb.QueryPlansForProviderRequest,
    responseType: sentinel_plan_v2_querier_pb.QueryPlansForProviderResponse,
    requestSerialize: serialize_sentinel_plan_v2_QueryPlansForProviderRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_QueryPlansForProviderRequest,
    responseSerialize: serialize_sentinel_plan_v2_QueryPlansForProviderResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_QueryPlansForProviderResponse,
  },
  queryPlan: {
    path: '/sentinel.plan.v2.QueryService/QueryPlan',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_plan_v2_querier_pb.QueryPlanRequest,
    responseType: sentinel_plan_v2_querier_pb.QueryPlanResponse,
    requestSerialize: serialize_sentinel_plan_v2_QueryPlanRequest,
    requestDeserialize: deserialize_sentinel_plan_v2_QueryPlanRequest,
    responseSerialize: serialize_sentinel_plan_v2_QueryPlanResponse,
    responseDeserialize: deserialize_sentinel_plan_v2_QueryPlanResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
