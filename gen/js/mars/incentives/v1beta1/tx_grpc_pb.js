// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_incentives_v1beta1_tx_pb = require('../../../mars/incentives/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_mars_incentives_v1beta1_MsgCreateSchedule(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_tx_pb.MsgCreateSchedule)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.MsgCreateSchedule');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_MsgCreateSchedule(buffer_arg) {
  return mars_incentives_v1beta1_tx_pb.MsgCreateSchedule.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_MsgCreateScheduleResponse(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_tx_pb.MsgCreateScheduleResponse)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.MsgCreateScheduleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_MsgCreateScheduleResponse(buffer_arg) {
  return mars_incentives_v1beta1_tx_pb.MsgCreateScheduleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_MsgTerminateSchedules(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_tx_pb.MsgTerminateSchedules)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.MsgTerminateSchedules');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_MsgTerminateSchedules(buffer_arg) {
  return mars_incentives_v1beta1_tx_pb.MsgTerminateSchedules.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_incentives_v1beta1_MsgTerminateSchedulesResponse(arg) {
  if (!(arg instanceof mars_incentives_v1beta1_tx_pb.MsgTerminateSchedulesResponse)) {
    throw new Error('Expected argument of type mars.incentives.v1beta1.MsgTerminateSchedulesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_incentives_v1beta1_MsgTerminateSchedulesResponse(buffer_arg) {
  return mars_incentives_v1beta1_tx_pb.MsgTerminateSchedulesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the incentives module's Msg service
var MsgService = exports.MsgService = {
  // CreateSchedule is a governance operation for creating a new incentives
// schedule.
createSchedule: {
    path: '/mars.incentives.v1beta1.Msg/CreateSchedule',
    requestStream: false,
    responseStream: false,
    requestType: mars_incentives_v1beta1_tx_pb.MsgCreateSchedule,
    responseType: mars_incentives_v1beta1_tx_pb.MsgCreateScheduleResponse,
    requestSerialize: serialize_mars_incentives_v1beta1_MsgCreateSchedule,
    requestDeserialize: deserialize_mars_incentives_v1beta1_MsgCreateSchedule,
    responseSerialize: serialize_mars_incentives_v1beta1_MsgCreateScheduleResponse,
    responseDeserialize: deserialize_mars_incentives_v1beta1_MsgCreateScheduleResponse,
  },
  // TerminateSchedule is a governance operation for terminating one or more
// existing incentives schedules.
terminateSchedules: {
    path: '/mars.incentives.v1beta1.Msg/TerminateSchedules',
    requestStream: false,
    responseStream: false,
    requestType: mars_incentives_v1beta1_tx_pb.MsgTerminateSchedules,
    responseType: mars_incentives_v1beta1_tx_pb.MsgTerminateSchedulesResponse,
    requestSerialize: serialize_mars_incentives_v1beta1_MsgTerminateSchedules,
    requestDeserialize: deserialize_mars_incentives_v1beta1_MsgTerminateSchedules,
    responseSerialize: serialize_mars_incentives_v1beta1_MsgTerminateSchedulesResponse,
    responseDeserialize: deserialize_mars_incentives_v1beta1_MsgTerminateSchedulesResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
