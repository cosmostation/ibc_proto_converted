// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_deployment_v1beta1_deployment_pb = require('../../../akash/deployment/v1beta1/deployment_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var akash_deployment_v1beta1_group_pb = require('../../../akash/deployment/v1beta1/group_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_akash_deployment_v1beta1_MsgCloseDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgCloseDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCloseDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCloseDeployment(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgCloseDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgCloseDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgCloseDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCloseDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCloseDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgCloseDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgCloseGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgCloseGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCloseGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCloseGroup(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgCloseGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgCloseGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgCloseGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCloseGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCloseGroupResponse(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgCloseGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgCreateDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgCreateDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCreateDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCreateDeployment(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgCreateDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgCreateDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgCreateDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgCreateDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgCreateDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgCreateDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgDepositDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgDepositDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgDepositDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgDepositDeployment(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgDepositDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgDepositDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgDepositDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgDepositDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgDepositDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgDepositDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgPauseGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgPauseGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgPauseGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgPauseGroup(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgPauseGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgPauseGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgPauseGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgPauseGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgPauseGroupResponse(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgPauseGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgStartGroup(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgStartGroup)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgStartGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgStartGroup(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgStartGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgStartGroupResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_group_pb.MsgStartGroupResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgStartGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgStartGroupResponse(buffer_arg) {
  return akash_deployment_v1beta1_group_pb.MsgStartGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgUpdateDeployment(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgUpdateDeployment)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgUpdateDeployment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgUpdateDeployment(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgUpdateDeployment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_deployment_v1beta1_MsgUpdateDeploymentResponse(arg) {
  if (!(arg instanceof akash_deployment_v1beta1_deployment_pb.MsgUpdateDeploymentResponse)) {
    throw new Error('Expected argument of type akash.deployment.v1beta1.MsgUpdateDeploymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_deployment_v1beta1_MsgUpdateDeploymentResponse(buffer_arg) {
  return akash_deployment_v1beta1_deployment_pb.MsgUpdateDeploymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the deployment Msg service.
var MsgService = exports.MsgService = {
  // CreateDeployment defines a method to create new deployment given proper inputs.
createDeployment: {
    path: '/akash.deployment.v1beta1.Msg/CreateDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_deployment_pb.MsgCreateDeployment,
    responseType: akash_deployment_v1beta1_deployment_pb.MsgCreateDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgCreateDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgCreateDeployment,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgCreateDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgCreateDeploymentResponse,
  },
  // DepositDeployment deposits more funds into the deployment account
depositDeployment: {
    path: '/akash.deployment.v1beta1.Msg/DepositDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_deployment_pb.MsgDepositDeployment,
    responseType: akash_deployment_v1beta1_deployment_pb.MsgDepositDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgDepositDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgDepositDeployment,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgDepositDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgDepositDeploymentResponse,
  },
  // UpdateDeployment defines a method to update a deployment given proper inputs.
updateDeployment: {
    path: '/akash.deployment.v1beta1.Msg/UpdateDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_deployment_pb.MsgUpdateDeployment,
    responseType: akash_deployment_v1beta1_deployment_pb.MsgUpdateDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgUpdateDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgUpdateDeployment,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgUpdateDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgUpdateDeploymentResponse,
  },
  // CloseDeployment defines a method to close a deployment given proper inputs.
closeDeployment: {
    path: '/akash.deployment.v1beta1.Msg/CloseDeployment',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_deployment_pb.MsgCloseDeployment,
    responseType: akash_deployment_v1beta1_deployment_pb.MsgCloseDeploymentResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgCloseDeployment,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgCloseDeployment,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgCloseDeploymentResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgCloseDeploymentResponse,
  },
  // CloseGroup defines a method to close a group of a deployment given proper inputs.
closeGroup: {
    path: '/akash.deployment.v1beta1.Msg/CloseGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_group_pb.MsgCloseGroup,
    responseType: akash_deployment_v1beta1_group_pb.MsgCloseGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgCloseGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgCloseGroup,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgCloseGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgCloseGroupResponse,
  },
  // PauseGroup defines a method to close a group of a deployment given proper inputs.
pauseGroup: {
    path: '/akash.deployment.v1beta1.Msg/PauseGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_group_pb.MsgPauseGroup,
    responseType: akash_deployment_v1beta1_group_pb.MsgPauseGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgPauseGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgPauseGroup,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgPauseGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgPauseGroupResponse,
  },
  // StartGroup defines a method to close a group of a deployment given proper inputs.
startGroup: {
    path: '/akash.deployment.v1beta1.Msg/StartGroup',
    requestStream: false,
    responseStream: false,
    requestType: akash_deployment_v1beta1_group_pb.MsgStartGroup,
    responseType: akash_deployment_v1beta1_group_pb.MsgStartGroupResponse,
    requestSerialize: serialize_akash_deployment_v1beta1_MsgStartGroup,
    requestDeserialize: deserialize_akash_deployment_v1beta1_MsgStartGroup,
    responseSerialize: serialize_akash_deployment_v1beta1_MsgStartGroupResponse,
    responseDeserialize: deserialize_akash_deployment_v1beta1_MsgStartGroupResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
