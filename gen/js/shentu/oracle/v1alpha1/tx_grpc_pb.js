// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_oracle_v1alpha1_tx_pb = require('../../../shentu/oracle/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_shentu_oracle_v1alpha1_MsgAddCollateral(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgAddCollateral)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgAddCollateral');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgAddCollateral(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgAddCollateral.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgAddCollateralResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgAddCollateralResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgAddCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgAddCollateralResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgAddCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateOperator(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateOperator)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateOperator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateOperator(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateOperator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateOperatorResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateOperatorResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateOperatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateOperatorResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateOperatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateTask(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateTask)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateTask');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateTask(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateTask.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateTxTask(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTask)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateTxTask');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateTxTask(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTask.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgCreateTxTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgCreateTxTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgCreateTxTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgDeleteTask(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgDeleteTask)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgDeleteTask');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgDeleteTask(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgDeleteTask.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgDeleteTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgDeleteTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgDeleteTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgDeleteTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgDeleteTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgDeleteTxTask(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTask)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgDeleteTxTask');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgDeleteTxTask(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTask.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgDeleteTxTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgDeleteTxTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgReduceCollateral(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateral)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgReduceCollateral');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgReduceCollateral(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateral.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgReduceCollateralResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateralResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgReduceCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgReduceCollateralResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgRemoveOperator(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperator)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgRemoveOperator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgRemoveOperator(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgRemoveOperatorResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperatorResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgRemoveOperatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgRemoveOperatorResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgTaskResponseResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgTaskResponseResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgTaskResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgTaskResponseResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgTaskResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgTxTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgTxTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgTxTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgTxTaskResponseResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponseResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgTxTaskResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgTxTaskResponseResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgWithdrawReward(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgWithdrawReward)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgWithdrawReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgWithdrawReward(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgWithdrawReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_MsgWithdrawRewardResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_tx_pb.MsgWithdrawRewardResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.MsgWithdrawRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_MsgWithdrawRewardResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_tx_pb.MsgWithdrawRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the shield Msg service.
var MsgService = exports.MsgService = {
  createOperator: {
    path: '/shentu.oracle.v1alpha1.Msg/CreateOperator',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgCreateOperator,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgCreateOperatorResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateOperator,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateOperator,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateOperatorResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateOperatorResponse,
  },
  removeOperator: {
    path: '/shentu.oracle.v1alpha1.Msg/RemoveOperator',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperator,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgRemoveOperatorResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgRemoveOperator,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgRemoveOperator,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgRemoveOperatorResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgRemoveOperatorResponse,
  },
  addCollateral: {
    path: '/shentu.oracle.v1alpha1.Msg/AddCollateral',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgAddCollateral,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgAddCollateralResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgAddCollateral,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgAddCollateral,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgAddCollateralResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgAddCollateralResponse,
  },
  reduceCollateral: {
    path: '/shentu.oracle.v1alpha1.Msg/ReduceCollateral',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateral,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgReduceCollateralResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgReduceCollateral,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgReduceCollateral,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgReduceCollateralResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgReduceCollateralResponse,
  },
  withdrawReward: {
    path: '/shentu.oracle.v1alpha1.Msg/WithdrawReward',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgWithdrawReward,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgWithdrawRewardResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgWithdrawReward,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgWithdrawReward,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgWithdrawRewardResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgWithdrawRewardResponse,
  },
  createTask: {
    path: '/shentu.oracle.v1alpha1.Msg/CreateTask',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgCreateTask,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgCreateTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateTask,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateTask,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateTaskResponse,
  },
  taskResponse: {
    path: '/shentu.oracle.v1alpha1.Msg/TaskResponse',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgTaskResponse,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgTaskResponseResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgTaskResponse,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgTaskResponse,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgTaskResponseResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgTaskResponseResponse,
  },
  deleteTask: {
    path: '/shentu.oracle.v1alpha1.Msg/DeleteTask',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgDeleteTask,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgDeleteTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgDeleteTask,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgDeleteTask,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgDeleteTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgDeleteTaskResponse,
  },
  createTxTask: {
    path: '/shentu.oracle.v1alpha1.Msg/CreateTxTask',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTask,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgCreateTxTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateTxTask,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateTxTask,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgCreateTxTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgCreateTxTaskResponse,
  },
  txTaskResponse: {
    path: '/shentu.oracle.v1alpha1.Msg/TxTaskResponse',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponse,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgTxTaskResponseResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgTxTaskResponse,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgTxTaskResponse,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgTxTaskResponseResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgTxTaskResponseResponse,
  },
  deleteTxTask: {
    path: '/shentu.oracle.v1alpha1.Msg/DeleteTxTask',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTask,
    responseType: shentu_oracle_v1alpha1_tx_pb.MsgDeleteTxTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_MsgDeleteTxTask,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_MsgDeleteTxTask,
    responseSerialize: serialize_shentu_oracle_v1alpha1_MsgDeleteTxTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_MsgDeleteTxTaskResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
