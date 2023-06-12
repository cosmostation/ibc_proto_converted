// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_reports_v1_msgs_pb = require('../../../desmos/reports/v1/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var desmos_reports_v1_models_pb = require('../../../desmos/reports/v1/models_pb.js');

function serialize_desmos_reports_v1_MsgAddReason(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgAddReason)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgAddReason');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgAddReason(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgAddReason.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgAddReasonResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgAddReasonResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgAddReasonResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgAddReasonResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgAddReasonResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgCreateReport(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgCreateReport)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgCreateReport');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgCreateReport(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgCreateReport.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgCreateReportResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgCreateReportResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgCreateReportResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgCreateReportResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgCreateReportResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgDeleteReport(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgDeleteReport)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgDeleteReport');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgDeleteReport(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgDeleteReport.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgDeleteReportResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgDeleteReportResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgDeleteReportResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgDeleteReportResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgDeleteReportResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgRemoveReason(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgRemoveReason)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgRemoveReason');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgRemoveReason(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgRemoveReason.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgRemoveReasonResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgRemoveReasonResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgRemoveReasonResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgRemoveReasonResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgRemoveReasonResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgSupportStandardReason(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgSupportStandardReason)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgSupportStandardReason');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgSupportStandardReason(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgSupportStandardReason.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgSupportStandardReasonResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgSupportStandardReasonResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgSupportStandardReasonResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgSupportStandardReasonResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgSupportStandardReasonResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgUpdateParams(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_msgs_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_MsgUpdateParamsResponse(buffer_arg) {
  return desmos_reports_v1_msgs_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the reports Msg service.
var MsgService = exports.MsgService = {
  // CreateReport allows to create a new report
createReport: {
    path: '/desmos.reports.v1.Msg/CreateReport',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgCreateReport,
    responseType: desmos_reports_v1_msgs_pb.MsgCreateReportResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgCreateReport,
    requestDeserialize: deserialize_desmos_reports_v1_MsgCreateReport,
    responseSerialize: serialize_desmos_reports_v1_MsgCreateReportResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgCreateReportResponse,
  },
  // DeleteReport allows to delete an existing report
deleteReport: {
    path: '/desmos.reports.v1.Msg/DeleteReport',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgDeleteReport,
    responseType: desmos_reports_v1_msgs_pb.MsgDeleteReportResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgDeleteReport,
    requestDeserialize: deserialize_desmos_reports_v1_MsgDeleteReport,
    responseSerialize: serialize_desmos_reports_v1_MsgDeleteReportResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgDeleteReportResponse,
  },
  // SupportStandardReason allows to support one of the reasons present inside
// the module params
supportStandardReason: {
    path: '/desmos.reports.v1.Msg/SupportStandardReason',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgSupportStandardReason,
    responseType: desmos_reports_v1_msgs_pb.MsgSupportStandardReasonResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgSupportStandardReason,
    requestDeserialize: deserialize_desmos_reports_v1_MsgSupportStandardReason,
    responseSerialize: serialize_desmos_reports_v1_MsgSupportStandardReasonResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgSupportStandardReasonResponse,
  },
  // AddReason allows to add a new supported reporting reason
addReason: {
    path: '/desmos.reports.v1.Msg/AddReason',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgAddReason,
    responseType: desmos_reports_v1_msgs_pb.MsgAddReasonResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgAddReason,
    requestDeserialize: deserialize_desmos_reports_v1_MsgAddReason,
    responseSerialize: serialize_desmos_reports_v1_MsgAddReasonResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgAddReasonResponse,
  },
  // RemoveReason allows to remove a supported reporting reason
removeReason: {
    path: '/desmos.reports.v1.Msg/RemoveReason',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgRemoveReason,
    responseType: desmos_reports_v1_msgs_pb.MsgRemoveReasonResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgRemoveReason,
    requestDeserialize: deserialize_desmos_reports_v1_MsgRemoveReason,
    responseSerialize: serialize_desmos_reports_v1_MsgRemoveReasonResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgRemoveReasonResponse,
  },
  // UpdateParams defines a (governance) operation for updating the module
// parameters.
// The authority defaults to the x/gov module account.
//
// Since: Desmos 5.0.0
updateParams: {
    path: '/desmos.reports.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_msgs_pb.MsgUpdateParams,
    responseType: desmos_reports_v1_msgs_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_desmos_reports_v1_MsgUpdateParams,
    requestDeserialize: deserialize_desmos_reports_v1_MsgUpdateParams,
    responseSerialize: serialize_desmos_reports_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_desmos_reports_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
