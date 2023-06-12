// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_ecocredit_v1alpha2_query_pb = require('../../../regen/ecocredit/v1alpha2/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var regen_ecocredit_v1alpha2_types_pb = require('../../../regen/ecocredit/v1alpha2/types_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBalanceRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBalanceRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBalanceResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBalanceResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketCreditsRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketCreditsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketCreditsRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketCreditsResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketCreditsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketCreditsResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketsRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketsRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketsRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBasketsResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBasketsResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBasketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBasketsResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBasketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBatchInfoRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBatchInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBatchInfoRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBatchInfoResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBatchInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBatchInfoResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBatchesRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBatchesRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBatchesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBatchesRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBatchesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBatchesResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBatchesResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBatchesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBatchesResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBatchesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrderRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrderRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrderResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrderResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryBuyOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryClassInfoRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryClassInfoRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryClassInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryClassInfoRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryClassInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryClassInfoResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryClassInfoResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryClassInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryClassInfoResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryClassInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryClassesRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryClassesRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryClassesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryClassesRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryClassesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryClassesResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryClassesResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryClassesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryClassesResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryClassesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryCreditTypesRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryCreditTypesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryCreditTypesRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryCreditTypesResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryCreditTypesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryCreditTypesResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryParamsRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryParamsRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryParamsResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryParamsResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryProjectInfoRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryProjectInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryProjectInfoRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryProjectInfoResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryProjectInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryProjectInfoResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryProjectsRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryProjectsRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryProjectsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryProjectsRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryProjectsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QueryProjectsResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QueryProjectsResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QueryProjectsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QueryProjectsResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QueryProjectsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrderRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrderRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrderRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrderResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrderResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrderResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySellOrdersResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySellOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySupplyRequest(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySupplyRequest(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_QuerySupplyResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_QuerySupplyResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg is the regen.ecocredit.v1alpha2 Query service.
var QueryService = exports.QueryService = {
  // Classes queries for all credit classes with pagination.
classes: {
    path: '/regen.ecocredit.v1alpha2.Query/Classes',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryClassesRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryClassesResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryClassesRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryClassesRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryClassesResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryClassesResponse,
  },
  // ClassInfo queries for information on a credit class.
classInfo: {
    path: '/regen.ecocredit.v1alpha2.Query/ClassInfo',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryClassInfoRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryClassInfoResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryClassInfoRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryClassInfoRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryClassInfoResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryClassInfoResponse,
  },
  // Projects queries for all projects within a class with pagination.
projects: {
    path: '/regen.ecocredit.v1alpha2.Query/Projects',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryProjectsRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryProjectsResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryProjectsRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryProjectsRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryProjectsResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryProjectsResponse,
  },
  // ClassInfo queries for information on a project.
projectInfo: {
    path: '/regen.ecocredit.v1alpha2.Query/ProjectInfo',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryProjectInfoResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryProjectInfoRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryProjectInfoRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryProjectInfoResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryProjectInfoResponse,
  },
  // Batches queries for all batches in the given project with pagination.
batches: {
    path: '/regen.ecocredit.v1alpha2.Query/Batches',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBatchesRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBatchesResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBatchesRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBatchesRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBatchesResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBatchesResponse,
  },
  // BatchInfo queries for information on a credit batch.
batchInfo: {
    path: '/regen.ecocredit.v1alpha2.Query/BatchInfo',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBatchInfoResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBatchInfoRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBatchInfoRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBatchInfoResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBatchInfoResponse,
  },
  // Balance queries the balance (both tradable and retired) of a given credit
// batch for a given account.
balance: {
    path: '/regen.ecocredit.v1alpha2.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBalanceRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBalanceRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBalanceRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBalanceResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBalanceResponse,
  },
  // Supply queries the tradable and retired supply of a credit batch.
supply: {
    path: '/regen.ecocredit.v1alpha2.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QuerySupplyRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QuerySupplyRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySupplyRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QuerySupplyResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySupplyResponse,
  },
  // CreditTypes returns the list of allowed types that credit classes can have.
// See Types/CreditType for more details.
creditTypes: {
    path: '/regen.ecocredit.v1alpha2.Query/CreditTypes',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryCreditTypesResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryCreditTypesRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryCreditTypesRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryCreditTypesResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryCreditTypesResponse,
  },
  // Params queries the ecocredit module parameters.
params: {
    path: '/regen.ecocredit.v1alpha2.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryParamsRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryParamsResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryParamsRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryParamsRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryParamsResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryParamsResponse,
  },
  // SellOrder queries a sell order by its ID
sellOrder: {
    path: '/regen.ecocredit.v1alpha2.Query/SellOrder',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrderRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrderResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrderRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrderRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrderResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrderResponse,
  },
  // SellOrders queries a paginated list of all sell orders
sellOrders: {
    path: '/regen.ecocredit.v1alpha2.Query/SellOrders',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersResponse,
  },
  // SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
sellOrdersByBatchDenom: {
    path: '/regen.ecocredit.v1alpha2.Query/SellOrdersByBatchDenom',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByBatchDenomResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByBatchDenomResponse,
  },
  // SellOrdersByAddress queries a paginated list of all sell orders from a specific address
sellOrdersByAddress: {
    path: '/regen.ecocredit.v1alpha2.Query/SellOrdersByAddress',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QuerySellOrdersByAddressResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QuerySellOrdersByAddressResponse,
  },
  // BuyOrder queries a buy order by its id
buyOrder: {
    path: '/regen.ecocredit.v1alpha2.Query/BuyOrder',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrderResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrderRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrderRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrderResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrderResponse,
  },
  // BuyOrders queries a paginated list of all buy orders
buyOrders: {
    path: '/regen.ecocredit.v1alpha2.Query/BuyOrders',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersResponse,
  },
  // BuyOrdersByAddress queries a paginated list of buy orders by creator address
buyOrdersByAddress: {
    path: '/regen.ecocredit.v1alpha2.Query/BuyOrdersByAddress',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBuyOrdersByAddressResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBuyOrdersByAddressResponse,
  },
  // AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
allowedAskDenoms: {
    path: '/regen.ecocredit.v1alpha2.Query/AllowedAskDenoms',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryAllowedAskDenomsResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryAllowedAskDenomsResponse,
  },
  // Basket queries one basket by denom.
basket: {
    path: '/regen.ecocredit.v1alpha2.Query/Basket',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBasketRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBasketResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketResponse,
  },
  // Baskets lists all baskets in the ecocredit module.
baskets: {
    path: '/regen.ecocredit.v1alpha2.Query/Baskets',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBasketsRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBasketsResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketsRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketsRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketsResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketsResponse,
  },
  // BasketCredits lists all ecocredits inside a given basket.
basketCredits: {
    path: '/regen.ecocredit.v1alpha2.Query/BasketCredits',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsRequest,
    responseType: regen_ecocredit_v1alpha2_query_pb.QueryBasketCreditsResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketCreditsRequest,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketCreditsRequest,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_QueryBasketCreditsResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_QueryBasketCreditsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
