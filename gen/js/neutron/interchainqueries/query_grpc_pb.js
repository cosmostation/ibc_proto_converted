// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_interchainqueries_query_pb = require('../../neutron/interchainqueries/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var neutron_interchainqueries_params_pb = require('../../neutron/interchainqueries/params_pb.js');
var neutron_interchainqueries_genesis_pb = require('../../neutron/interchainqueries/genesis_pb.js');
var neutron_interchainqueries_tx_pb = require('../../neutron/interchainqueries/tx_pb.js');

function serialize_neutron_interchainqueries_QueryLastRemoteHeight(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryLastRemoteHeight)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryLastRemoteHeight');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryLastRemoteHeight(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryLastRemoteHeight.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryLastRemoteHeightResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryLastRemoteHeightResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryLastRemoteHeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryLastRemoteHeightResponse(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryLastRemoteHeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryParamsRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryParamsRequest(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryParamsResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryParamsResponse(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueriesRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueriesRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueriesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueriesRequest(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueriesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueriesResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueriesResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueriesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueriesResponse(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueriesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueryRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueryRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueryRequest(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueryResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueryResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueryResponse(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueryResultRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueryResultRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueryResultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueryResultRequest(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueryResultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_QueryRegisteredQueryResultResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_query_pb.QueryRegisteredQueryResultResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.QueryRegisteredQueryResultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_QueryRegisteredQueryResultResponse(buffer_arg) {
  return neutron_interchainqueries_query_pb.QueryRegisteredQueryResultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/neutron.interchainqueries.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_query_pb.QueryParamsRequest,
    responseType: neutron_interchainqueries_query_pb.QueryParamsResponse,
    requestSerialize: serialize_neutron_interchainqueries_QueryParamsRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_QueryParamsRequest,
    responseSerialize: serialize_neutron_interchainqueries_QueryParamsResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_QueryParamsResponse,
  },
  registeredQueries: {
    path: '/neutron.interchainqueries.Query/RegisteredQueries',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_query_pb.QueryRegisteredQueriesRequest,
    responseType: neutron_interchainqueries_query_pb.QueryRegisteredQueriesResponse,
    requestSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueriesRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueriesRequest,
    responseSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueriesResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueriesResponse,
  },
  registeredQuery: {
    path: '/neutron.interchainqueries.Query/RegisteredQuery',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_query_pb.QueryRegisteredQueryRequest,
    responseType: neutron_interchainqueries_query_pb.QueryRegisteredQueryResponse,
    requestSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueryRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueryRequest,
    responseSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueryResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueryResponse,
  },
  queryResult: {
    path: '/neutron.interchainqueries.Query/QueryResult',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_query_pb.QueryRegisteredQueryResultRequest,
    responseType: neutron_interchainqueries_query_pb.QueryRegisteredQueryResultResponse,
    requestSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueryResultRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueryResultRequest,
    responseSerialize: serialize_neutron_interchainqueries_QueryRegisteredQueryResultResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_QueryRegisteredQueryResultResponse,
  },
  lastRemoteHeight: {
    path: '/neutron.interchainqueries.Query/LastRemoteHeight',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_query_pb.QueryLastRemoteHeight,
    responseType: neutron_interchainqueries_query_pb.QueryLastRemoteHeightResponse,
    requestSerialize: serialize_neutron_interchainqueries_QueryLastRemoteHeight,
    requestDeserialize: deserialize_neutron_interchainqueries_QueryLastRemoteHeight,
    responseSerialize: serialize_neutron_interchainqueries_QueryLastRemoteHeightResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_QueryLastRemoteHeightResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
