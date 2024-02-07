// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var dymension_rollapp_query_pb = require('../../dymension/rollapp/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var dymension_rollapp_params_pb = require('../../dymension/rollapp/params_pb.js');
var dymension_rollapp_rollapp_pb = require('../../dymension/rollapp/rollapp_pb.js');
var dymension_rollapp_state_info_pb = require('../../dymension/rollapp/state_info_pb.js');

function serialize_dymensionxyz_dymension_rollapp_QueryAllRollappRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryAllRollappRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryAllRollappRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryAllRollappRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryAllRollappRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryAllRollappResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryAllRollappResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryAllRollappResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryAllRollappResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryAllRollappResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryAllStateInfoRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryAllStateInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryAllStateInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryAllStateInfoResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryAllStateInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryAllStateInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetLatestStateIndexRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetLatestStateIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetLatestStateIndexResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetLatestStateIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetRollappByEIP155Request(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetRollappByEIP155Request)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetRollappByEIP155Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappByEIP155Request(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetRollappByEIP155Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetRollappRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetRollappRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetRollappRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetRollappRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetRollappResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetRollappResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetRollappResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetStateInfoRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetStateInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetStateInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryGetStateInfoResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryGetStateInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryGetStateInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryParamsRequest(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryParamsRequest(buffer_arg) {
  return dymension_rollapp_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_rollapp_QueryParamsResponse(arg) {
  if (!(arg instanceof dymension_rollapp_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.rollapp.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_rollapp_QueryParamsResponse(buffer_arg) {
  return dymension_rollapp_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/dymensionxyz.dymension.rollapp.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryParamsRequest,
    responseType: dymension_rollapp_query_pb.QueryParamsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryParamsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryParamsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryParamsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryParamsResponse,
  },
  // Queries a Rollapp by index.
rollapp: {
    path: '/dymensionxyz.dymension.rollapp.Query/Rollapp',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryGetRollappRequest,
    responseType: dymension_rollapp_query_pb.QueryGetRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetRollappRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse,
  },
  // Queries a Rollapp by index.
rollappByEIP155: {
    path: '/dymensionxyz.dymension.rollapp.Query/RollappByEIP155',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryGetRollappByEIP155Request,
    responseType: dymension_rollapp_query_pb.QueryGetRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetRollappByEIP155Request,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappByEIP155Request,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetRollappResponse,
  },
  // Queries a list of Rollapp items.
rollappAll: {
    path: '/dymensionxyz.dymension.rollapp.Query/RollappAll',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryAllRollappRequest,
    responseType: dymension_rollapp_query_pb.QueryAllRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryAllRollappRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryAllRollappRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryAllRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryAllRollappResponse,
  },
  // Queries a LatestStateIndex by rollapp-id.
latestStateIndex: {
    path: '/dymensionxyz.dymension.rollapp.Query/LatestStateIndex',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryGetLatestStateIndexRequest,
    responseType: dymension_rollapp_query_pb.QueryGetLatestStateIndexResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetLatestStateIndexResponse,
  },
  // Queries a StateInfo by index.
stateInfo: {
    path: '/dymensionxyz.dymension.rollapp.Query/StateInfo',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryGetStateInfoRequest,
    responseType: dymension_rollapp_query_pb.QueryGetStateInfoResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryGetStateInfoResponse,
  },
  // Queries a list of StateInfo items.
stateInfoAll: {
    path: '/dymensionxyz.dymension.rollapp.Query/StateInfoAll',
    requestStream: false,
    responseStream: false,
    requestType: dymension_rollapp_query_pb.QueryAllStateInfoRequest,
    responseType: dymension_rollapp_query_pb.QueryAllStateInfoResponse,
    requestSerialize: serialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoRequest,
    responseSerialize: serialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_rollapp_QueryAllStateInfoResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
