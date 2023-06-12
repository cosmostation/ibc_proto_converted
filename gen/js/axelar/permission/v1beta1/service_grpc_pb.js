// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_permission_v1beta1_tx_pb = require('../../../axelar/permission/v1beta1/tx_pb.js');
var axelar_permission_v1beta1_query_pb = require('../../../axelar/permission/v1beta1/query_pb.js');

function serialize_axelar_permission_v1beta1_DeregisterControllerRequest(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.DeregisterControllerRequest)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.DeregisterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_DeregisterControllerRequest(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.DeregisterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_DeregisterControllerResponse(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.DeregisterControllerResponse)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.DeregisterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_DeregisterControllerResponse(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.DeregisterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_QueryGovernanceKeyRequest(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_query_pb.QueryGovernanceKeyRequest)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.QueryGovernanceKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_QueryGovernanceKeyRequest(buffer_arg) {
  return axelar_permission_v1beta1_query_pb.QueryGovernanceKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_QueryGovernanceKeyResponse(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_query_pb.QueryGovernanceKeyResponse)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.QueryGovernanceKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_QueryGovernanceKeyResponse(buffer_arg) {
  return axelar_permission_v1beta1_query_pb.QueryGovernanceKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_RegisterControllerRequest(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.RegisterControllerRequest)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.RegisterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_RegisterControllerRequest(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.RegisterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_RegisterControllerResponse(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.RegisterControllerResponse)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.RegisterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_RegisterControllerResponse(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.RegisterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_UpdateGovernanceKeyRequest(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyRequest)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.UpdateGovernanceKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_UpdateGovernanceKeyRequest(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_permission_v1beta1_UpdateGovernanceKeyResponse(arg) {
  if (!(arg instanceof axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyResponse)) {
    throw new Error('Expected argument of type axelar.permission.v1beta1.UpdateGovernanceKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_permission_v1beta1_UpdateGovernanceKeyResponse(buffer_arg) {
  return axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the gov Msg service.
var MsgService = exports.MsgService = {
  registerController: {
    path: '/axelar.permission.v1beta1.Msg/RegisterController',
    requestStream: false,
    responseStream: false,
    requestType: axelar_permission_v1beta1_tx_pb.RegisterControllerRequest,
    responseType: axelar_permission_v1beta1_tx_pb.RegisterControllerResponse,
    requestSerialize: serialize_axelar_permission_v1beta1_RegisterControllerRequest,
    requestDeserialize: deserialize_axelar_permission_v1beta1_RegisterControllerRequest,
    responseSerialize: serialize_axelar_permission_v1beta1_RegisterControllerResponse,
    responseDeserialize: deserialize_axelar_permission_v1beta1_RegisterControllerResponse,
  },
  deregisterController: {
    path: '/axelar.permission.v1beta1.Msg/DeregisterController',
    requestStream: false,
    responseStream: false,
    requestType: axelar_permission_v1beta1_tx_pb.DeregisterControllerRequest,
    responseType: axelar_permission_v1beta1_tx_pb.DeregisterControllerResponse,
    requestSerialize: serialize_axelar_permission_v1beta1_DeregisterControllerRequest,
    requestDeserialize: deserialize_axelar_permission_v1beta1_DeregisterControllerRequest,
    responseSerialize: serialize_axelar_permission_v1beta1_DeregisterControllerResponse,
    responseDeserialize: deserialize_axelar_permission_v1beta1_DeregisterControllerResponse,
  },
  updateGovernanceKey: {
    path: '/axelar.permission.v1beta1.Msg/UpdateGovernanceKey',
    requestStream: false,
    responseStream: false,
    requestType: axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyRequest,
    responseType: axelar_permission_v1beta1_tx_pb.UpdateGovernanceKeyResponse,
    requestSerialize: serialize_axelar_permission_v1beta1_UpdateGovernanceKeyRequest,
    requestDeserialize: deserialize_axelar_permission_v1beta1_UpdateGovernanceKeyRequest,
    responseSerialize: serialize_axelar_permission_v1beta1_UpdateGovernanceKeyResponse,
    responseDeserialize: deserialize_axelar_permission_v1beta1_UpdateGovernanceKeyResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // GovernanceKey returns the multisig governance key
governanceKey: {
    path: '/axelar.permission.v1beta1.Query/GovernanceKey',
    requestStream: false,
    responseStream: false,
    requestType: axelar_permission_v1beta1_query_pb.QueryGovernanceKeyRequest,
    responseType: axelar_permission_v1beta1_query_pb.QueryGovernanceKeyResponse,
    requestSerialize: serialize_axelar_permission_v1beta1_QueryGovernanceKeyRequest,
    requestDeserialize: deserialize_axelar_permission_v1beta1_QueryGovernanceKeyRequest,
    responseSerialize: serialize_axelar_permission_v1beta1_QueryGovernanceKeyResponse,
    responseDeserialize: deserialize_axelar_permission_v1beta1_QueryGovernanceKeyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
