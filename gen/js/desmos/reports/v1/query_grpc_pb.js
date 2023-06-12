// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_reports_v1_query_pb = require('../../../desmos/reports/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var desmos_reports_v1_models_pb = require('../../../desmos/reports/v1/models_pb.js');

function serialize_desmos_reports_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryParamsRequest(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryParamsResponse(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReasonRequest(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReasonRequest)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReasonRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReasonRequest(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReasonRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReasonResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReasonResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReasonResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReasonResponse(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReasonResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReasonsRequest(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReasonsRequest)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReasonsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReasonsRequest(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReasonsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReasonsResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReasonsResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReasonsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReasonsResponse(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReasonsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReportRequest(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReportRequest)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReportRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReportRequest(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReportRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReportResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReportResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReportResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReportResponse(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReportResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReportsRequest(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReportsRequest)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReportsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReportsRequest(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReportsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reports_v1_QueryReportsResponse(arg) {
  if (!(arg instanceof desmos_reports_v1_query_pb.QueryReportsResponse)) {
    throw new Error('Expected argument of type desmos.reports.v1.QueryReportsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reports_v1_QueryReportsResponse(buffer_arg) {
  return desmos_reports_v1_query_pb.QueryReportsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Reports allows to query the reports for a specific target
reports: {
    path: '/desmos.reports.v1.Query/Reports',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_query_pb.QueryReportsRequest,
    responseType: desmos_reports_v1_query_pb.QueryReportsResponse,
    requestSerialize: serialize_desmos_reports_v1_QueryReportsRequest,
    requestDeserialize: deserialize_desmos_reports_v1_QueryReportsRequest,
    responseSerialize: serialize_desmos_reports_v1_QueryReportsResponse,
    responseDeserialize: deserialize_desmos_reports_v1_QueryReportsResponse,
  },
  // Report allows to query the report having the given id
report: {
    path: '/desmos.reports.v1.Query/Report',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_query_pb.QueryReportRequest,
    responseType: desmos_reports_v1_query_pb.QueryReportResponse,
    requestSerialize: serialize_desmos_reports_v1_QueryReportRequest,
    requestDeserialize: deserialize_desmos_reports_v1_QueryReportRequest,
    responseSerialize: serialize_desmos_reports_v1_QueryReportResponse,
    responseDeserialize: deserialize_desmos_reports_v1_QueryReportResponse,
  },
  // Reasons allows to query the supported reporting reasons for a subspace
reasons: {
    path: '/desmos.reports.v1.Query/Reasons',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_query_pb.QueryReasonsRequest,
    responseType: desmos_reports_v1_query_pb.QueryReasonsResponse,
    requestSerialize: serialize_desmos_reports_v1_QueryReasonsRequest,
    requestDeserialize: deserialize_desmos_reports_v1_QueryReasonsRequest,
    responseSerialize: serialize_desmos_reports_v1_QueryReasonsResponse,
    responseDeserialize: deserialize_desmos_reports_v1_QueryReasonsResponse,
  },
  // Reason allows to query the reason having the given id
reason: {
    path: '/desmos.reports.v1.Query/Reason',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_query_pb.QueryReasonRequest,
    responseType: desmos_reports_v1_query_pb.QueryReasonResponse,
    requestSerialize: serialize_desmos_reports_v1_QueryReasonRequest,
    requestDeserialize: deserialize_desmos_reports_v1_QueryReasonRequest,
    responseSerialize: serialize_desmos_reports_v1_QueryReasonResponse,
    responseDeserialize: deserialize_desmos_reports_v1_QueryReasonResponse,
  },
  // Params allows to query the module parameters
params: {
    path: '/desmos.reports.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reports_v1_query_pb.QueryParamsRequest,
    responseType: desmos_reports_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_desmos_reports_v1_QueryParamsRequest,
    requestDeserialize: deserialize_desmos_reports_v1_QueryParamsRequest,
    responseSerialize: serialize_desmos_reports_v1_QueryParamsResponse,
    responseDeserialize: deserialize_desmos_reports_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
