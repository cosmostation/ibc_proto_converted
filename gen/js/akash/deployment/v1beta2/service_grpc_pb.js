// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_deployment_v1beta2_deploymentmsg_pb = require('../../../akash/deployment/v1beta2/deploymentmsg_pb.js');
var akash_deployment_v1beta2_groupmsg_pb = require('../../../akash/deployment/v1beta2/groupmsg_pb.js');

function serialize_akash_deployment_v1beta2_MsgCloseDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCloseDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCloseDeployment(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgCloseDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCloseDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCloseDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgCloseGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCloseGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCloseGroup(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgCloseGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCloseGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCloseGroupResponse(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgCreateDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCreateDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCreateDeployment(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgCreateDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgCreateDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgCreateDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgDepositDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgDepositDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgDepositDeployment(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgDepositDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgDepositDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgDepositDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgPauseGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgPauseGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgPauseGroup(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgPauseGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgPauseGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgPauseGroupResponse(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgStartGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgStartGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgStartGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgStartGroup(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgStartGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgStartGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_groupmsg_pb.MsgStartGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgStartGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgStartGroupResponse(buffer_arg) {
  return akash_deployment_v1beta2_groupmsg_pb.MsgStartGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgUpdateDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgUpdateDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgUpdateDeployment(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta2_MsgUpdateDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta2.MsgUpdateDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta2_MsgUpdateDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the deployment Msg service.
var MsgService = exports.MsgService = {
  // CreateDeployment defines a method to create new deployment given proper inputs.
createDeployment: {
    path: '/akash.deployment.v1beta2.Msg/CreateDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeployment,
    responseType: akash_deployment_v1beta2_deploymentmsg_pb.MsgCreateDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgCreateDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgCreateDeployment,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgCreateDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgCreateDeploymentResponse,
  },
  // DepositDeployment deposits more funds into the deployment account
depositDeployment: {
    path: '/akash.deployment.v1beta2.Msg/DepositDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeployment,
    responseType: akash_deployment_v1beta2_deploymentmsg_pb.MsgDepositDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgDepositDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgDepositDeployment,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgDepositDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgDepositDeploymentResponse,
  },
  // UpdateDeployment defines a method to update a deployment given proper inputs.
updateDeployment: {
    path: '/akash.deployment.v1beta2.Msg/UpdateDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeployment,
    responseType: akash_deployment_v1beta2_deploymentmsg_pb.MsgUpdateDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgUpdateDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgUpdateDeployment,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgUpdateDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgUpdateDeploymentResponse,
  },
  // CloseDeployment defines a method to close a deployment given proper inputs.
closeDeployment: {
    path: '/akash.deployment.v1beta2.Msg/CloseDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeployment,
    responseType: akash_deployment_v1beta2_deploymentmsg_pb.MsgCloseDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgCloseDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgCloseDeployment,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgCloseDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgCloseDeploymentResponse,
  },
  // CloseGroup defines a method to close a group of a deployment given proper inputs.
closeGroup: {
    path: '/akash.deployment.v1beta2.Msg/CloseGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroup,
    responseType: akash_deployment_v1beta2_groupmsg_pb.MsgCloseGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgCloseGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgCloseGroup,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgCloseGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgCloseGroupResponse,
  },
  // PauseGroup defines a method to close a group of a deployment given proper inputs.
pauseGroup: {
    path: '/akash.deployment.v1beta2.Msg/PauseGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroup,
    responseType: akash_deployment_v1beta2_groupmsg_pb.MsgPauseGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgPauseGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgPauseGroup,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgPauseGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgPauseGroupResponse,
  },
  // StartGroup defines a method to close a group of a deployment given proper inputs.
startGroup: {
    path: '/akash.deployment.v1beta2.Msg/StartGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta2_groupmsg_pb.MsgStartGroup,
    responseType: akash_deployment_v1beta2_groupmsg_pb.MsgStartGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta2_MsgStartGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta2_MsgStartGroup,
    responseSerialize: serialize_akash_deployment_v1beta2_MsgStartGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta2_MsgStartGroupResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
