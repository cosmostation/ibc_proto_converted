// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_deployment_v1beta3_query_pb = require('../../../akash/deployment/v1beta3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_deployment_v1beta3_deployment_pb = require('../../../akash/deployment/v1beta3/deployment_pb.js');
var akash_deployment_v1beta3_group_pb = require('../../../akash/deployment/v1beta3/group_pb.js');
var akash_deployment_v1beta3_groupid_pb = require('../../../akash/deployment/v1beta3/groupid_pb.js');
var akash_escrow_v1beta3_types_pb = require('../../../akash/escrow/v1beta3/types_pb.js');

function serialize_akash_deployment_v1beta3_QueryDeploymentRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryDeploymentRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryDeploymentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryDeploymentRequest(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryDeploymentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta3_QueryDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta3_QueryDeploymentsRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryDeploymentsRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryDeploymentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryDeploymentsRequest(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryDeploymentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta3_QueryDeploymentsResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryDeploymentsResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryDeploymentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryDeploymentsResponse(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryDeploymentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta3_QueryGroupRequest(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryGroupRequest)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryGroupRequest(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta3_QueryGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta3_query_pb.QueryGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta3.QueryGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta3_QueryGroupResponse(buffer_arg) {
  return akash_deployment_v1beta3_query_pb.QueryGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Deployments queries deployments
deployments: {
    path: '/akash.deployment.v1beta3.Query/Deployments',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta3_query_pb.QueryDeploymentsRequest,
    responseType: akash_deployment_v1beta3_query_pb.QueryDeploymentsResponse,
    requestSerialize: serialize_akash_deployment_v1beta3_QueryDeploymentsRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta3_QueryDeploymentsRequest,
    responseSerialize: serialize_akash_deployment_v1beta3_QueryDeploymentsResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta3_QueryDeploymentsResponse,
  },
  // Deployment queries deployment details
deployment: {
    path: '/akash.deployment.v1beta3.Query/Deployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta3_query_pb.QueryDeploymentRequest,
    responseType: akash_deployment_v1beta3_query_pb.QueryDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta3_QueryDeploymentRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta3_QueryDeploymentRequest,
    responseSerialize: serialize_akash_deployment_v1beta3_QueryDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta3_QueryDeploymentResponse,
  },
  // Group queries group details
group: {
    path: '/akash.deployment.v1beta3.Query/Group',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta3_query_pb.QueryGroupRequest,
    responseType: akash_deployment_v1beta3_query_pb.QueryGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta3_QueryGroupRequest,
    requestDeserialize: deserialize_akash_deployment_v1beta3_QueryGroupRequest,
    responseSerialize: serialize_akash_deployment_v1beta3_QueryGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta3_QueryGroupResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
