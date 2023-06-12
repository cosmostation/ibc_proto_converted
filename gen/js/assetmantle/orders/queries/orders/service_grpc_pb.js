// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_orders_queries_orders_query_request_pb = require('../../../../assetmantle/orders/queries/orders/query_request_pb.js');
var assetmantle_orders_queries_orders_query_response_pb = require('../../../../assetmantle/orders/queries/orders/query_response_pb.js');

function serialize_assetmantle_modules_orders_queries_orders_QueryRequest(arg) {
  if (!(arg instanceof assetmantle_orders_queries_orders_query_request_pb.QueryRequest)) {
    throw new Error('Expected argument of type assetmantle.modules.orders.queries.orders.QueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_orders_queries_orders_QueryRequest(buffer_arg) {
  return assetmantle_orders_queries_orders_query_request_pb.QueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_orders_queries_orders_QueryResponse(arg) {
  if (!(arg instanceof assetmantle_orders_queries_orders_query_response_pb.QueryResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.orders.queries.orders.QueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_orders_queries_orders_QueryResponse(buffer_arg) {
  return assetmantle_orders_queries_orders_query_response_pb.QueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.orders.queries.orders.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_orders_queries_orders_query_request_pb.QueryRequest,
    responseType: assetmantle_orders_queries_orders_query_response_pb.QueryResponse,
    requestSerialize: serialize_assetmantle_modules_orders_queries_orders_QueryRequest,
    requestDeserialize: deserialize_assetmantle_modules_orders_queries_orders_QueryRequest,
    responseSerialize: serialize_assetmantle_modules_orders_queries_orders_QueryResponse,
    responseDeserialize: deserialize_assetmantle_modules_orders_queries_orders_QueryResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
