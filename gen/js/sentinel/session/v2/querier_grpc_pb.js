// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_session_v2_querier_pb = require('../../../sentinel/session/v2/querier_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sentinel_session_v2_params_pb = require('../../../sentinel/session/v2/params_pb.js');
var sentinel_session_v2_session_pb = require('../../../sentinel/session/v2/session_pb.js');

function serialize_sentinel_session_v2_QueryParamsRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QueryParamsRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QueryParamsResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QueryParamsResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForAccountRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForAccountRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForAccountRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForAccountResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForAccountResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForAccountResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForAllocationRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForAllocationRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForAllocationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForAllocationRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForAllocationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForAllocationResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForAllocationResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForAllocationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForAllocationResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForAllocationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForNodeRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForNodeRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForNodeRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForNodeResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForNodeResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForNodeResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForSubscriptionRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForSubscriptionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForSubscriptionRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsForSubscriptionResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsForSubscriptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsForSubscriptionResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsRequest(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsRequest)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsRequest(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_session_v2_QuerySessionsResponse(arg) {
  if (!(arg instanceof sentinel_session_v2_querier_pb.QuerySessionsResponse)) {
    throw new Error('Expected argument of type sentinel.session.v2.QuerySessionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_session_v2_QuerySessionsResponse(buffer_arg) {
  return sentinel_session_v2_querier_pb.QuerySessionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  querySessions: {
    path: '/sentinel.session.v2.QueryService/QuerySessions',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionsRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionsResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionsRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionsRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionsResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionsResponse,
  },
  querySessionsForAccount: {
    path: '/sentinel.session.v2.QueryService/QuerySessionsForAccount',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionsForAccountRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionsForAccountResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionsForAccountRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionsForAccountRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionsForAccountResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionsForAccountResponse,
  },
  querySessionsForNode: {
    path: '/sentinel.session.v2.QueryService/QuerySessionsForNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionsForNodeRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionsForNodeResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionsForNodeRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionsForNodeRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionsForNodeResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionsForNodeResponse,
  },
  querySessionsForSubscription: {
    path: '/sentinel.session.v2.QueryService/QuerySessionsForSubscription',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionsForSubscriptionResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionsForSubscriptionRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionsForSubscriptionRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionsForSubscriptionResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionsForSubscriptionResponse,
  },
  querySessionsForAllocation: {
    path: '/sentinel.session.v2.QueryService/QuerySessionsForAllocation',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionsForAllocationRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionsForAllocationResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionsForAllocationRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionsForAllocationRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionsForAllocationResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionsForAllocationResponse,
  },
  querySession: {
    path: '/sentinel.session.v2.QueryService/QuerySession',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QuerySessionRequest,
    responseType: sentinel_session_v2_querier_pb.QuerySessionResponse,
    requestSerialize: serialize_sentinel_session_v2_QuerySessionRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QuerySessionRequest,
    responseSerialize: serialize_sentinel_session_v2_QuerySessionResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QuerySessionResponse,
  },
  queryParams: {
    path: '/sentinel.session.v2.QueryService/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_session_v2_querier_pb.QueryParamsRequest,
    responseType: sentinel_session_v2_querier_pb.QueryParamsResponse,
    requestSerialize: serialize_sentinel_session_v2_QueryParamsRequest,
    requestDeserialize: deserialize_sentinel_session_v2_QueryParamsRequest,
    responseSerialize: serialize_sentinel_session_v2_QueryParamsResponse,
    responseDeserialize: deserialize_sentinel_session_v2_QueryParamsResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
