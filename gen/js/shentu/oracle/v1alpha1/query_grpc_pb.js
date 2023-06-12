// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_oracle_v1alpha1_query_pb = require('../../../shentu/oracle/v1alpha1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var shentu_oracle_v1alpha1_oracle_pb = require('../../../shentu/oracle/v1alpha1/oracle_pb.js');

function serialize_shentu_oracle_v1alpha1_QueryOperatorRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryOperatorRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryOperatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryOperatorRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryOperatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryOperatorResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryOperatorResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryOperatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryOperatorResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryOperatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryOperatorsRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryOperatorsRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryOperatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryOperatorsRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryOperatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryOperatorsResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryOperatorsResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryOperatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryOperatorsResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryOperatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryParamsRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryParamsRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryParamsResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryParamsResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryResponseRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryResponseRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryResponseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryResponseRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryResponseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryResponseResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryResponseResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryResponseResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTaskRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTaskRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTaskRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTaskRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTaskRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTxResponseRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTxResponseRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTxResponseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTxResponseRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTxResponseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTxResponseResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTxResponseResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTxResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTxResponseResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTxResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTxTaskRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTxTaskRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTxTaskRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTxTaskRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTxTaskRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryTxTaskResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryTxTaskResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryTxTaskResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryTxTaskResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryTxTaskResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryWithdrawsRequest(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryWithdrawsRequest)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryWithdrawsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryWithdrawsRequest(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryWithdrawsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_oracle_v1alpha1_QueryWithdrawsResponse(arg) {
  if (!(arg instanceof shentu_oracle_v1alpha1_query_pb.QueryWithdrawsResponse)) {
    throw new Error('Expected argument of type shentu.oracle.v1alpha1.QueryWithdrawsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_oracle_v1alpha1_QueryWithdrawsResponse(buffer_arg) {
  return shentu_oracle_v1alpha1_query_pb.QueryWithdrawsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for oracle module.
var QueryService = exports.QueryService = {
  operator: {
    path: '/shentu.oracle.v1alpha1.Query/Operator',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryOperatorRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryOperatorResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryOperatorRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryOperatorRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryOperatorResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryOperatorResponse,
  },
  operators: {
    path: '/shentu.oracle.v1alpha1.Query/Operators',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryOperatorsRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryOperatorsResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryOperatorsRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryOperatorsRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryOperatorsResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryOperatorsResponse,
  },
  withdraws: {
    path: '/shentu.oracle.v1alpha1.Query/Withdraws',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryWithdrawsRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryWithdrawsResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryWithdrawsRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryWithdrawsRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryWithdrawsResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryWithdrawsResponse,
  },
  task: {
    path: '/shentu.oracle.v1alpha1.Query/Task',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryTaskRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryTaskRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTaskRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTaskResponse,
  },
  txTask: {
    path: '/shentu.oracle.v1alpha1.Query/TxTask',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryTxTaskRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryTxTaskResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryTxTaskRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTxTaskRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryTxTaskResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTxTaskResponse,
  },
  response: {
    path: '/shentu.oracle.v1alpha1.Query/Response',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryResponseRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryResponseResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryResponseRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryResponseRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryResponseResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryResponseResponse,
  },
  txResponse: {
    path: '/shentu.oracle.v1alpha1.Query/TxResponse',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryTxResponseRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryTxResponseResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryTxResponseRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTxResponseRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryTxResponseResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryTxResponseResponse,
  },
  // Params queries all parameters of the oracle module.
params: {
    path: '/shentu.oracle.v1alpha1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: shentu_oracle_v1alpha1_query_pb.QueryParamsRequest,
    responseType: shentu_oracle_v1alpha1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_shentu_oracle_v1alpha1_QueryParamsRequest,
    requestDeserialize: deserialize_shentu_oracle_v1alpha1_QueryParamsRequest,
    responseSerialize: serialize_shentu_oracle_v1alpha1_QueryParamsResponse,
    responseDeserialize: deserialize_shentu_oracle_v1alpha1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
