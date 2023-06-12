// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datadeal_v2alpha2_query_pb = require('../../../panacea/datadeal/v2alpha2/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var panacea_datadeal_v2alpha2_deal_pb = require('../../../panacea/datadeal/v2alpha2/deal_pb.js');
var panacea_datadeal_v2alpha2_datasale_pb = require('../../../panacea/datadeal/v2alpha2/datasale_pb.js');
var panacea_datadeal_v2alpha2_tx_pb = require('../../../panacea/datadeal/v2alpha2/tx_pb.js');

function serialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataDeliveryVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataDeliveryVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataSaleRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataSaleRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataSaleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataSaleRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataSaleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataSaleResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataSaleResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataSaleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataSaleResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataSaleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataSalesRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataSalesRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataSalesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataSalesRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataSalesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataSalesResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataSalesResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataSalesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataSalesResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataSalesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataVerificationVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDataVerificationVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDealRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDealRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDealRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDealRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDealRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDealsRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDealsRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDealsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDealsRequest(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDealsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_QueryDealsResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_query_pb.QueryDealsResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.QueryDealsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_QueryDealsResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_query_pb.QueryDealsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Deal returns a Deal.
deal: {
    path: '/panacea.datadeal.v2alpha2.Query/Deal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDealRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDealRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDealRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDealResponse,
  },
  // Deals return a list of Deal.
deals: {
    path: '/panacea.datadeal.v2alpha2.Query/Deals',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDealsRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDealsResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDealsRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDealsRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDealsResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDealsResponse,
  },
  // DataSale returns a DataSale.
dataSale: {
    path: '/panacea.datadeal.v2alpha2.Query/DataSale',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDataSaleRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDataSaleResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataSaleRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataSaleRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataSaleResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataSaleResponse,
  },
  // DataSales returns a list of DataSale.
dataSales: {
    path: '/panacea.datadeal.v2alpha2.Query/DataSales',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDataSalesRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDataSalesResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataSalesRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataSalesRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataSalesResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataSalesResponse,
  },
  // DataVerificationVote returns a DataVerificationVote.
dataVerificationVote: {
    path: '/panacea.datadeal.v2alpha2.Query/DataVerificationVote',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDataVerificationVoteResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataVerificationVoteResponse,
  },
  // DataDeliveryVote returns a DataDeliveryVote.
dataDeliveryVote: {
    path: '/panacea.datadeal.v2alpha2.Query/DataDeliveryVote',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteRequest,
    responseType: panacea_datadeal_v2alpha2_query_pb.QueryDataDeliveryVoteResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_QueryDataDeliveryVoteResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
