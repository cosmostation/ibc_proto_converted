// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_deployment_v1beta2_query_pb = require('../../../akash/deployment/v1beta2/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_deployment_v1beta2_deployment_pb = require('../../../akash/deployment/v1beta2/deployment_pb.js');
var akash_deployment_v1beta2_group_pb = require('../../../akash/deployment/v1beta2/group_pb.js');
var akash_deployment_v1beta2_groupid_pb = require('../../../akash/deployment/v1beta2/groupid_pb.js');
var akash_escrow_v1beta2_types_pb = require('../../../akash/escrow/v1beta2/types_pb.js');

function serialize_akash_deployment_v1beta2_QueryDeploymentRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryDeploymentRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryDeploymentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryDeploymentRequest(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryDeploymentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_QueryDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_QueryDeploymentsRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryDeploymentsRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryDeploymentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryDeploymentsRequest(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryDeploymentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_QueryDeploymentsResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryDeploymentsResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryDeploymentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryDeploymentsResponse(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryDeploymentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_QueryGroupRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryGroupRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryGroupRequest(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_QueryGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_query_pb.QueryGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.QueryGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_QueryGroupResponse(buffer_arg) {
  return akash_deployment_v1beta2_query_pb.QueryGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Deployments queries deployments
deployments: {
    path: '/akash.deployment.v1beta2.Query/Deployments',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_query_pb.QueryDeploymentsRequest,
    responseType: akash_deployment_v1beta2_query_pb.QueryDeploymentsResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_QueryDeploymentsRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta2_QueryDeploymentsRequest,
    responseSerialize: serialize_akash_deployment_v1beta2_QueryDeploymentsResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_QueryDeploymentsResponse,
  },
  // Deployment queries deployment details
deployment: {
    path: '/akash.deployment.v1beta2.Query/Deployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_query_pb.QueryDeploymentRequest,
    responseType: akash_deployment_v1beta2_query_pb.QueryDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_QueryDeploymentRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta2_QueryDeploymentRequest,
    responseSerialize: serialize_akash_deployment_v1beta2_QueryDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_QueryDeploymentResponse,
  },
  // Group queries group details
group: {
    path: '/akash.deployment.v1beta2.Query/Group',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_query_pb.QueryGroupRequest,
    responseType: akash_deployment_v1beta2_query_pb.QueryGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_QueryGroupRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta2_QueryGroupRequest,
    responseSerialize: serialize_akash_deployment_v1beta2_QueryGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_QueryGroupResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
