// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_exchange_v1beta1_query_pb = require('../../../injective/exchange/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_exchange_v1beta1_exchange_pb = require('../../../injective/exchange/v1beta1/exchange_pb.js');
var injective_exchange_v1beta1_genesis_pb = require('../../../injective/exchange/v1beta1/genesis_pb.js');
var injective_oracle_v1beta1_oracle_pb = require('../../../injective/oracle/v1beta1/oracle_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_injective_exchange_v1beta1_MitoVaultInfosRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.MitoVaultInfosRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MitoVaultInfosRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MitoVaultInfosRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.MitoVaultInfosRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MitoVaultInfosResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.MitoVaultInfosResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MitoVaultInfosResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MitoVaultInfosResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.MitoVaultInfosResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateVolumeRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateVolumeRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateVolumeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateVolumeRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateVolumeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateVolumeResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateVolumeResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateVolumeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateVolumeResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateVolumeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateVolumesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateVolumesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateVolumesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateVolumesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateVolumesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryAggregateVolumesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryAggregateVolumesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryAggregateVolumesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryAggregateVolumesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryAggregateVolumesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBalanceMismatchesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBalanceMismatchesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBalanceMismatchesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBalanceMismatchesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBalanceMismatchesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBalanceMismatchesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBinaryMarketsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBinaryMarketsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBinaryMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBinaryMarketsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBinaryMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryBinaryMarketsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryBinaryMarketsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryBinaryMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryBinaryMarketsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryBinaryMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDenomDecimalRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDenomDecimalRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDenomDecimalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDenomDecimalRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDenomDecimalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDenomDecimalResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDenomDecimalResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDenomDecimalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDenomDecimalResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDenomDecimalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDenomDecimalsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDenomDecimalsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDenomDecimalsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDenomDecimalsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDenomDecimalsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDenomDecimalsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDenomDecimalsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDenomDecimalsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDenomDecimalsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDenomDecimalsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMarketsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMarketsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeOrderbookRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeOrderbookRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeOrderbookRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeOrderbookResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeOrderbookResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeOrderbookResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExchangeBalancesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExchangeBalancesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExchangeBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExchangeBalancesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExchangeBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExchangeBalancesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExchangeBalancesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExchangeBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExchangeBalancesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExchangeBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExchangeParamsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExchangeParamsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExchangeParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExchangeParamsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExchangeParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExchangeParamsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExchangeParamsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExchangeParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExchangeParamsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExchangeParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFullSpotMarketRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFullSpotMarketRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFullSpotMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFullSpotMarketRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFullSpotMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFullSpotMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFullSpotMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFullSpotMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFullSpotMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFullSpotMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFullSpotMarketsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFullSpotMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFullSpotMarketsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryFullSpotMarketsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryFullSpotMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryFullSpotMarketsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketIDFromVaultRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketIDFromVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketIDFromVaultRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketIDFromVaultResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketIDFromVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketIDFromVaultResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketVolatilityRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketVolatilityRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketVolatilityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketVolatilityRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketVolatilityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryMarketVolatilityResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryMarketVolatilityResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryMarketVolatilityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryMarketVolatilityResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryMarketVolatilityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPositionsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPositionsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPositionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPositionsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPositionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryPositionsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryPositionsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryPositionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryPositionsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryPositionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMarketRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMarketRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMarketRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMarketsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMarketsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMarketsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMarketsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMarketsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMarketsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotOrderbookRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotOrderbookRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotOrderbookRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotOrderbookRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotOrderbookRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotOrderbookResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotOrderbookResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotOrderbookResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotOrderbookResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotOrderbookResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountDepositRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountDepositRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountDepositRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountDepositResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountDepositResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountDepositResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountDepositsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountDepositsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountDepositsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountDepositsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountPositionsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountPositionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountPositionsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountPositionsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountPositionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountPositionsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTradeRewardCampaignRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTradeRewardCampaignRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTradeRewardCampaignRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTradeRewardCampaignResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTradeRewardCampaignResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTradeRewardCampaignResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTradeRewardPointsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTradeRewardPointsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersRequest)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderSpotOrdersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.QueryTraderSpotOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Retrieves exchange params
queryExchangeParams: {
    path: '/injective.exchange.v1beta1.Query/QueryExchangeParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryExchangeParamsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryExchangeParamsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryExchangeParamsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryExchangeParamsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryExchangeParamsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryExchangeParamsResponse,
  },
  // Retrieves a Subaccount's Deposits
subaccountDeposits: {
    path: '/injective.exchange.v1beta1.Query/SubaccountDeposits',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountDepositsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountDepositsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountDepositsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountDepositsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountDepositsResponse,
  },
  // Retrieves a Subaccount's Deposits
subaccountDeposit: {
    path: '/injective.exchange.v1beta1.Query/SubaccountDeposit',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountDepositRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountDepositResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountDepositRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountDepositRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountDepositResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountDepositResponse,
  },
  // Retrieves all of the balances of all users on the exchange.
exchangeBalances: {
    path: '/injective.exchange.v1beta1.Query/ExchangeBalances',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryExchangeBalancesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryExchangeBalancesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryExchangeBalancesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryExchangeBalancesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryExchangeBalancesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryExchangeBalancesResponse,
  },
  // Retrieves the aggregate volumes for the specified account or subaccount
aggregateVolume: {
    path: '/injective.exchange.v1beta1.Query/AggregateVolume',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAggregateVolumeRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAggregateVolumeResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAggregateVolumeRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateVolumeRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAggregateVolumeResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateVolumeResponse,
  },
  // Retrieves the aggregate volumes for specified accounts
aggregateVolumes: {
    path: '/injective.exchange.v1beta1.Query/AggregateVolumes',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAggregateVolumesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAggregateVolumesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAggregateVolumesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateVolumesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAggregateVolumesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateVolumesResponse,
  },
  // Retrieves the aggregate volume for the specified market
aggregateMarketVolume: {
    path: '/injective.exchange.v1beta1.Query/AggregateMarketVolume',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumeResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumeResponse,
  },
  // Retrieves the aggregate market volumes for specified markets
aggregateMarketVolumes: {
    path: '/injective.exchange.v1beta1.Query/AggregateMarketVolumes',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAggregateMarketVolumesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAggregateMarketVolumesResponse,
  },
  // Retrieves the denom decimals for a denom.
denomDecimal: {
    path: '/injective.exchange.v1beta1.Query/DenomDecimal',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDenomDecimalRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDenomDecimalResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDenomDecimalRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDenomDecimalRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDenomDecimalResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDenomDecimalResponse,
  },
  // Retrieves the denom decimals for multiple denoms. Returns all denom
// decimals if unspecified.
denomDecimals: {
    path: '/injective.exchange.v1beta1.Query/DenomDecimals',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDenomDecimalsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDenomDecimalsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDenomDecimalsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDenomDecimalsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDenomDecimalsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDenomDecimalsResponse,
  },
  // Retrieves a list of spot markets.
spotMarkets: {
    path: '/injective.exchange.v1beta1.Query/SpotMarkets',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySpotMarketsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySpotMarketsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySpotMarketsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMarketsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySpotMarketsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMarketsResponse,
  },
  // Retrieves a spot market by ticker
spotMarket: {
    path: '/injective.exchange.v1beta1.Query/SpotMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySpotMarketRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySpotMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySpotMarketRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMarketRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySpotMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMarketResponse,
  },
  // Retrieves a list of spot markets with extra information.
fullSpotMarkets: {
    path: '/injective.exchange.v1beta1.Query/FullSpotMarkets',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryFullSpotMarketsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryFullSpotMarketsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryFullSpotMarketsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryFullSpotMarketsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryFullSpotMarketsResponse,
  },
  // Retrieves a spot market with extra information.
fullSpotMarket: {
    path: '/injective.exchange.v1beta1.Query/FullSpotMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryFullSpotMarketRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryFullSpotMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryFullSpotMarketRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryFullSpotMarketRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryFullSpotMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryFullSpotMarketResponse,
  },
  // Retrieves a spot market's orderbook by marketID
spotOrderbook: {
    path: '/injective.exchange.v1beta1.Query/SpotOrderbook',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySpotOrderbookRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySpotOrderbookResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySpotOrderbookRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotOrderbookRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySpotOrderbookResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotOrderbookResponse,
  },
  // Retrieves a trader's spot orders
traderSpotOrders: {
    path: '/injective.exchange.v1beta1.Query/TraderSpotOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse,
  },
  // Retrieves all account address spot orders
accountAddressSpotOrders: {
    path: '/injective.exchange.v1beta1.Query/AccountAddressSpotOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAccountAddressSpotOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAccountAddressSpotOrdersResponse,
  },
  // Retrieves spot orders corresponding to specified order hashes for a given
// subaccountID and marketID
spotOrdersByHashes: {
    path: '/injective.exchange.v1beta1.Query/SpotOrdersByHashes',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySpotOrdersByHashesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotOrdersByHashesResponse,
  },
  // Retrieves subaccount's orders
subaccountOrders: {
    path: '/injective.exchange.v1beta1.Query/SubaccountOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountOrdersResponse,
  },
  // Retrieves a trader's transient spot orders
traderSpotTransientOrders: {
    path: '/injective.exchange.v1beta1.Query/TraderSpotTransientOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTraderSpotOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderSpotOrdersResponse,
  },
  // Retrieves a spot market's mid-price
spotMidPriceAndTOB: {
    path: '/injective.exchange.v1beta1.Query/SpotMidPriceAndTOB',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySpotMidPriceAndTOBResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySpotMidPriceAndTOBResponse,
  },
  // Retrieves a derivative market's mid-price
derivativeMidPriceAndTOB: {
    path: '/injective.exchange.v1beta1.Query/DerivativeMidPriceAndTOB',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeMidPriceAndTOBResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMidPriceAndTOBResponse,
  },
  // Retrieves a derivative market's orderbook by marketID
derivativeOrderbook: {
    path: '/injective.exchange.v1beta1.Query/DerivativeOrderbook',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeOrderbookResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeOrderbookRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeOrderbookRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeOrderbookResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeOrderbookResponse,
  },
  // Retrieves a trader's derivative orders
traderDerivativeOrders: {
    path: '/injective.exchange.v1beta1.Query/TraderDerivativeOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse,
  },
  // Retrieves all account address derivative orders
accountAddressDerivativeOrders: {
    path: '/injective.exchange.v1beta1.Query/AccountAddressDerivativeOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryAccountAddressDerivativeOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryAccountAddressDerivativeOrdersResponse,
  },
  // Retrieves a trader's derivative orders
derivativeOrdersByHashes: {
    path: '/injective.exchange.v1beta1.Query/DerivativeOrdersByHashes',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeOrdersByHashesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeOrdersByHashesResponse,
  },
  // Retrieves a trader's transient derivative orders
traderDerivativeTransientOrders: {
    path: '/injective.exchange.v1beta1.Query/TraderDerivativeTransientOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeOrdersResponse,
  },
  // Retrieves a list of derivative markets.
derivativeMarkets: {
    path: '/injective.exchange.v1beta1.Query/DerivativeMarkets',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketsResponse,
  },
  // Retrieves a derivative market by ticker
derivativeMarket: {
    path: '/injective.exchange.v1beta1.Query/DerivativeMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketResponse,
  },
  // Retrieves a derivative market's corresponding address for fees that
// contribute to the market's insurance fund
derivativeMarketAddress: {
    path: '/injective.exchange.v1beta1.Query/DerivativeMarketAddress',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryDerivativeMarketAddressResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryDerivativeMarketAddressResponse,
  },
  // Retrieves a subaccount's trade nonce
subaccountTradeNonce: {
    path: '/injective.exchange.v1beta1.Query/SubaccountTradeNonce',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountTradeNonceResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountTradeNonceResponse,
  },
  // Retrieves the entire exchange module's state
exchangeModuleState: {
    path: '/injective.exchange.v1beta1.Query/ExchangeModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryModuleStateResponse,
  },
  // Retrieves the entire exchange module's positions
positions: {
    path: '/injective.exchange.v1beta1.Query/Positions',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryPositionsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryPositionsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryPositionsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryPositionsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryPositionsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryPositionsResponse,
  },
  // Retrieves subaccount's positions
subaccountPositions: {
    path: '/injective.exchange.v1beta1.Query/SubaccountPositions',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountPositionsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountPositionsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountPositionsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountPositionsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountPositionsResponse,
  },
  // Retrieves subaccount's position in market
subaccountPositionInMarket: {
    path: '/injective.exchange.v1beta1.Query/SubaccountPositionInMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountPositionInMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountPositionInMarketResponse,
  },
  // Retrieves subaccount's position in market
subaccountEffectivePositionInMarket: {
    path: '/injective.exchange.v1beta1.Query/SubaccountEffectivePositionInMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountEffectivePositionInMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountEffectivePositionInMarketResponse,
  },
  // Retrieves perpetual market info
perpetualMarketInfo: {
    path: '/injective.exchange.v1beta1.Query/PerpetualMarketInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryPerpetualMarketInfoResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryPerpetualMarketInfoResponse,
  },
  // Retrieves expiry market info
expiryFuturesMarketInfo: {
    path: '/injective.exchange.v1beta1.Query/ExpiryFuturesMarketInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryExpiryFuturesMarketInfoResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryExpiryFuturesMarketInfoResponse,
  },
  // Retrieves perpetual market funding
perpetualMarketFunding: {
    path: '/injective.exchange.v1beta1.Query/PerpetualMarketFunding',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryPerpetualMarketFundingResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryPerpetualMarketFundingResponse,
  },
  // Retrieves subaccount's order metadata
subaccountOrderMetadata: {
    path: '/injective.exchange.v1beta1.Query/SubaccountOrderMetadata',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataRequest,
    responseType: injective_exchange_v1beta1_query_pb.QuerySubaccountOrderMetadataResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QuerySubaccountOrderMetadataResponse,
  },
  // Retrieves the account and total trade rewards points
tradeRewardPoints: {
    path: '/injective.exchange.v1beta1.Query/TradeRewardPoints',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse,
  },
  // Retrieves the pending account and total trade rewards points
pendingTradeRewardPoints: {
    path: '/injective.exchange.v1beta1.Query/PendingTradeRewardPoints',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTradeRewardPointsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardPointsResponse,
  },
  // Retrieves the trade reward campaign
tradeRewardCampaign: {
    path: '/injective.exchange.v1beta1.Query/TradeRewardCampaign',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTradeRewardCampaignResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardCampaignRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardCampaignRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTradeRewardCampaignResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTradeRewardCampaignResponse,
  },
  // Retrieves the account's fee discount info
feeDiscountAccountInfo: {
    path: '/injective.exchange.v1beta1.Query/FeeDiscountAccountInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountAccountInfoResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountAccountInfoResponse,
  },
  // Retrieves the fee discount schedule
feeDiscountSchedule: {
    path: '/injective.exchange.v1beta1.Query/FeeDiscountSchedule',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountScheduleResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountScheduleResponse,
  },
  // Retrieves mismatches between available vs. total balance
balanceMismatches: {
    path: '/injective.exchange.v1beta1.Query/BalanceMismatches',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryBalanceMismatchesResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryBalanceMismatchesRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryBalanceMismatchesRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryBalanceMismatchesResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryBalanceMismatchesResponse,
  },
  // Retrieves available and total balances with balance holds
balanceWithBalanceHolds: {
    path: '/injective.exchange.v1beta1.Query/BalanceWithBalanceHolds',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryBalanceWithBalanceHoldsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryBalanceWithBalanceHoldsResponse,
  },
  // Retrieves fee discount tier stats
feeDiscountTierStatistics: {
    path: '/injective.exchange.v1beta1.Query/FeeDiscountTierStatistics',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryFeeDiscountTierStatisticsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryFeeDiscountTierStatisticsResponse,
  },
  // Retrieves market making pool info
mitoVaultInfos: {
    path: '/injective.exchange.v1beta1.Query/MitoVaultInfos',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.MitoVaultInfosRequest,
    responseType: injective_exchange_v1beta1_query_pb.MitoVaultInfosResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MitoVaultInfosRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MitoVaultInfosRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_MitoVaultInfosResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MitoVaultInfosResponse,
  },
  // QueryMarketIDFromVault returns the market ID for a given vault subaccount ID
queryMarketIDFromVault: {
    path: '/injective.exchange.v1beta1.Query/QueryMarketIDFromVault',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryMarketIDFromVaultResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryMarketIDFromVaultRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketIDFromVaultRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryMarketIDFromVaultResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketIDFromVaultResponse,
  },
  // Retrieves historical trade records for a given market ID
historicalTradeRecords: {
    path: '/injective.exchange.v1beta1.Query/HistoricalTradeRecords',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryHistoricalTradeRecordsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryHistoricalTradeRecordsResponse,
  },
  // Retrieves if the account is opted out of rewards
isOptedOutOfRewards: {
    path: '/injective.exchange.v1beta1.Query/IsOptedOutOfRewards',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryIsOptedOutOfRewardsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryIsOptedOutOfRewardsResponse,
  },
  // Retrieves all accounts opted out of rewards
optedOutOfRewardsAccounts: {
    path: '/injective.exchange.v1beta1.Query/OptedOutOfRewardsAccounts',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryOptedOutOfRewardsAccountsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryOptedOutOfRewardsAccountsResponse,
  },
  // MarketVolatility computes the volatility for spot and derivative markets
// trading history.
marketVolatility: {
    path: '/injective.exchange.v1beta1.Query/MarketVolatility',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryMarketVolatilityRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryMarketVolatilityResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryMarketVolatilityRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketVolatilityRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryMarketVolatilityResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketVolatilityResponse,
  },
  // Retrieves a spot market's orderbook by marketID
binaryOptionsMarkets: {
    path: '/injective.exchange.v1beta1.Query/BinaryOptionsMarkets',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryBinaryMarketsRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryBinaryMarketsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryBinaryMarketsRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryBinaryMarketsRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryBinaryMarketsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryBinaryMarketsResponse,
  },
  // Retrieves a trader's derivative conditional orders
traderDerivativeConditionalOrders: {
    path: '/injective.exchange.v1beta1.Query/TraderDerivativeConditionalOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryTraderDerivativeConditionalOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryTraderDerivativeConditionalOrdersResponse,
  },
  marketAtomicExecutionFeeMultiplier: {
    path: '/injective.exchange.v1beta1.Query/MarketAtomicExecutionFeeMultiplier',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierRequest,
    responseType: injective_exchange_v1beta1_query_pb.QueryMarketAtomicExecutionFeeMultiplierResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierRequest,
    requestDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierRequest,
    responseSerialize: serialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_QueryMarketAtomicExecutionFeeMultiplierResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
