// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datadeal_v2alpha1_query_pb = require('../../../panacea/datadeal/v2alpha1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var panacea_datadeal_v2alpha1_deal_pb = require('../../../panacea/datadeal/v2alpha1/deal_pb.js');
var panacea_datadeal_v2alpha1_tx_pb = require('../../../panacea/datadeal/v2alpha1/tx_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_panacea_datadeal_v2alpha1_QueryDataCertRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDataCertRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDataCertRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDataCertRequest(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDataCertRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDataCertResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDataCertResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDataCertResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDataCertResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDataCertResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDataCertsRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDataCertsRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDataCertsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDataCertsRequest(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDataCertsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDataCertsResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDataCertsResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDataCertsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDataCertsResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDataCertsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDealRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDealRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDealRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDealRequest(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDealRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDealsRequest(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDealsRequest)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDealsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDealsRequest(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDealsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha1_QueryDealsResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha1_query_pb.QueryDealsResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha1.QueryDealsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha1_QueryDealsResponse(buffer_arg) {
  return panacea_datadeal_v2alpha1_query_pb.QueryDealsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Deal returns a Deal.
deal: {
    path: '/panacea.datadeal.v2alpha1.Query/Deal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_query_pb.QueryDealRequest,
    responseType: panacea_datadeal_v2alpha1_query_pb.QueryDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_QueryDealRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDealRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_QueryDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDealResponse,
  },
  // Deals returns multiple deals
deals: {
    path: '/panacea.datadeal.v2alpha1.Query/Deals',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_query_pb.QueryDealsRequest,
    responseType: panacea_datadeal_v2alpha1_query_pb.QueryDealsResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_QueryDealsRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDealsRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_QueryDealsResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDealsResponse,
  },
  // DataCert returns a DataCert.
dataCert: {
    path: '/panacea.datadeal.v2alpha1.Query/DataCert',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_query_pb.QueryDataCertRequest,
    responseType: panacea_datadeal_v2alpha1_query_pb.QueryDataCertResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_QueryDataCertRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDataCertRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_QueryDataCertResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDataCertResponse,
  },
  // DataCerts return DataCerts.
dataCerts: {
    path: '/panacea.datadeal.v2alpha1.Query/DataCerts',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha1_query_pb.QueryDataCertsRequest,
    responseType: panacea_datadeal_v2alpha1_query_pb.QueryDataCertsResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha1_QueryDataCertsRequest,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDataCertsRequest,
    responseSerialize: serialize_panacea_datadeal_v2alpha1_QueryDataCertsResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha1_QueryDataCertsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
