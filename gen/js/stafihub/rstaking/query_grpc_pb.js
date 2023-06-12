// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rstaking_query_pb = require('../../stafihub/rstaking/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var stafihub_rstaking_params_pb = require('../../stafihub/rstaking/params_pb.js');

function serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryDelegatorWhitelistRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryDelegatorWhitelistRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryDelegatorWhitelistRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryDelegatorWhitelistResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryDelegatorWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryDelegatorWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryInflationBaseRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryInflationBaseRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryInflationBaseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryInflationBaseRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryInflationBaseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryInflationBaseResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryInflationBaseResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryInflationBaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryInflationBaseResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryInflationBaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryParamsRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryParamsResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryValidatorWhitelistRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryValidatorWhitelistRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryValidatorWhitelistRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryValidatorWhitelistResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryValidatorWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryValidatorWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchRequest(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryValidatorWhitelistSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchRequest(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.QueryValidatorWhitelistSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchResponse(buffer_arg) {
  return stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.rstaking.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryParamsRequest,
    responseType: stafihub_rstaking_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryParamsResponse,
  },
  // Queries a list of InflationBase items.
inflationBase: {
    path: '/stafihub.stafihub.rstaking.Query/InflationBase',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryInflationBaseRequest,
    responseType: stafihub_rstaking_query_pb.QueryInflationBaseResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryInflationBaseRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryInflationBaseRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryInflationBaseResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryInflationBaseResponse,
  },
  // Queries a list of ValidatorWhitelist items.
validatorWhitelist: {
    path: '/stafihub.stafihub.rstaking.Query/ValidatorWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryValidatorWhitelistRequest,
    responseType: stafihub_rstaking_query_pb.QueryValidatorWhitelistResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistResponse,
  },
  // Queries a list of WhitelistSwitch items.
validatorWhitelistSwitch: {
    path: '/stafihub.stafihub.rstaking.Query/ValidatorWhitelistSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchRequest,
    responseType: stafihub_rstaking_query_pb.QueryValidatorWhitelistSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryValidatorWhitelistSwitchResponse,
  },
  // Queries a list of DelegatorWhitelist items.
delegatorWhitelist: {
    path: '/stafihub.stafihub.rstaking.Query/DelegatorWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryDelegatorWhitelistRequest,
    responseType: stafihub_rstaking_query_pb.QueryDelegatorWhitelistResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistResponse,
  },
  // Queries a list of DelegatorWhitelistSwitch items.
delegatorWhitelistSwitch: {
    path: '/stafihub.stafihub.rstaking.Query/DelegatorWhitelistSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchRequest,
    responseType: stafihub_rstaking_query_pb.QueryDelegatorWhitelistSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_QueryDelegatorWhitelistSwitchResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
