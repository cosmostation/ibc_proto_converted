// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_lend_v1beta1_query_pb = require('../../../comdex/lend/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_lend_v1beta1_lend_pb = require('../../../comdex/lend/v1beta1/lend_pb.js');
var comdex_lend_v1beta1_params_pb = require('../../../comdex/lend/v1beta1/params_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllLendByOwnerRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllLendByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllLendByOwnerResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllLendByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllReserveStatsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllReserveStatsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllReserveStatsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllReserveStatsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllReserveStatsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAllReserveStatsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAllReserveStatsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAllReserveStatsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAllReserveStatsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAllReserveStatsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetRatesParamRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetRatesParamRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetRatesParamRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetRatesParamRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetRatesParamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetRatesParamResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetRatesParamResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetRatesParamResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetRatesParamResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetRatesParamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetRatesParamsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetRatesParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetRatesParamsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetRatesParamsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetRatesParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetRatesParamsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetToPairMappingRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetToPairMappingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetToPairMappingResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetToPairMappingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetToPairMappingsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetToPairMappingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAssetToPairMappingsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAssetToPairMappingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAuctionParamRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAuctionParamRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAuctionParamRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAuctionParamRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAuctionParamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryAuctionParamResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryAuctionParamResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryAuctionParamResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryAuctionParamResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryAuctionParamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowInterestRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowInterestRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowInterestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowInterestRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowInterestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowInterestResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowInterestResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowInterestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowInterestResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowInterestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryBorrowsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryBorrowsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryBorrowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryBorrowsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryBorrowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundModBalRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundModBalRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundModBalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundModBalRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundModBalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundModBalResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundModBalResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundModBalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundModBalResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundModBalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundReserveBalRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundReserveBalRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundReserveBalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundReserveBalRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundReserveBalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryFundReserveBalResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryFundReserveBalResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryFundReserveBalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryFundReserveBalResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryFundReserveBalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendInterestRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendInterestRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendInterestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendInterestRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendInterestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendInterestResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendInterestResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendInterestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendInterestResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendInterestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryLendsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryLendsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryLendsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryLendsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryLendsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryModuleBalanceRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryModuleBalanceRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryModuleBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryModuleBalanceRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryModuleBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryModuleBalanceResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryModuleBalanceResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryModuleBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryModuleBalanceResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryModuleBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPairRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPairRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPairRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPairResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPairResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPairResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPairsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPairsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPairsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPairsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPairsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPairsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolsRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryPoolsResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataRequest(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataRequest)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataRequest(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse(buffer_arg) {
  return comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryLends: {
    path: '/comdex.lend.v1beta1.Query/QueryLends',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryLendsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryLendsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryLendsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryLendsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryLendsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryLendsResponse,
  },
  queryLend: {
    path: '/comdex.lend.v1beta1.Query/QueryLend',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryLendRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryLendResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryLendRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryLendRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryLendResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryLendResponse,
  },
  queryAllLendByOwner: {
    path: '/comdex.lend.v1beta1.Query/QueryAllLendByOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAllLendByOwnerRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAllLendByOwnerResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerResponse,
  },
  queryAllLendByOwnerAndPool: {
    path: '/comdex.lend.v1beta1.Query/QueryAllLendByOwnerAndPool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAllLendByOwnerAndPoolResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAllLendByOwnerAndPoolResponse,
  },
  params: {
    path: '/comdex.lend.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryParamsResponse,
  },
  queryPairs: {
    path: '/comdex.lend.v1beta1.Query/QueryPairs',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryPairsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryPairsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryPairsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryPairsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryPairsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryPairsResponse,
  },
  queryPair: {
    path: '/comdex.lend.v1beta1.Query/QueryPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryPairRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryPairResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryPairRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryPairRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryPairResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryPairResponse,
  },
  queryAssetRatesParams: {
    path: '/comdex.lend.v1beta1.Query/QueryAssetRatesParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAssetRatesParamsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAssetRatesParamsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetRatesParamsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAssetRatesParamsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetRatesParamsResponse,
  },
  queryAssetRatesParam: {
    path: '/comdex.lend.v1beta1.Query/QueryAssetRatesParam',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAssetRatesParamRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAssetRatesParamResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAssetRatesParamRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetRatesParamRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAssetRatesParamResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetRatesParamResponse,
  },
  queryPools: {
    path: '/comdex.lend.v1beta1.Query/QueryPools',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryPoolsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolsResponse,
  },
  queryPool: {
    path: '/comdex.lend.v1beta1.Query/QueryPool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryPoolRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryPoolRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryPoolResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolResponse,
  },
  queryAssetToPairMappings: {
    path: '/comdex.lend.v1beta1.Query/QueryAssetToPairMappings',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAssetToPairMappingsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAssetToPairMappingsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingsResponse,
  },
  queryAssetToPairMapping: {
    path: '/comdex.lend.v1beta1.Query/QueryAssetToPairMapping',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAssetToPairMappingResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAssetToPairMappingRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAssetToPairMappingResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAssetToPairMappingResponse,
  },
  queryBorrows: {
    path: '/comdex.lend.v1beta1.Query/QueryBorrows',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryBorrowsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryBorrowsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryBorrowsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryBorrowsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowsResponse,
  },
  queryBorrow: {
    path: '/comdex.lend.v1beta1.Query/QueryBorrow',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryBorrowRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryBorrowResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryBorrowRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryBorrowResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowResponse,
  },
  queryAllBorrowByOwner: {
    path: '/comdex.lend.v1beta1.Query/QueryAllBorrowByOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerResponse,
  },
  queryAllBorrowByOwnerAndPool: {
    path: '/comdex.lend.v1beta1.Query/QueryAllBorrowByOwnerAndPool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAllBorrowByOwnerAndPoolResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAllBorrowByOwnerAndPoolResponse,
  },
  queryPoolAssetLBMapping: {
    path: '/comdex.lend.v1beta1.Query/QueryPoolAssetLBMapping',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryPoolAssetLBMappingResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryPoolAssetLBMappingResponse,
  },
  queryReserveBuybackAssetData: {
    path: '/comdex.lend.v1beta1.Query/QueryReserveBuybackAssetData',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryReserveBuybackAssetDataResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse,
  },
  queryAuctionParams: {
    path: '/comdex.lend.v1beta1.Query/QueryAuctionParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAuctionParamRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAuctionParamResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAuctionParamRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAuctionParamRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAuctionParamResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAuctionParamResponse,
  },
  queryModuleBalance: {
    path: '/comdex.lend.v1beta1.Query/QueryModuleBalance',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryModuleBalanceRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryModuleBalanceResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryModuleBalanceRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryModuleBalanceRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryModuleBalanceResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryModuleBalanceResponse,
  },
  queryFundModBal: {
    path: '/comdex.lend.v1beta1.Query/QueryFundModBal',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryFundModBalRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryFundModBalResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryFundModBalRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryFundModBalRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryFundModBalResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryFundModBalResponse,
  },
  queryFundReserveBal: {
    path: '/comdex.lend.v1beta1.Query/QueryFundReserveBal',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryFundReserveBalRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryFundReserveBalResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryFundReserveBalRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryFundReserveBalRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryFundReserveBalResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryFundReserveBalResponse,
  },
  queryAllReserveStats: {
    path: '/comdex.lend.v1beta1.Query/QueryAllReserveStats',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryAllReserveStatsRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryAllReserveStatsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryAllReserveStatsRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryAllReserveStatsRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryAllReserveStatsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryAllReserveStatsResponse,
  },
  queryFundModBalByAssetPool: {
    path: '/comdex.lend.v1beta1.Query/QueryFundModBalByAssetPool',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryFundModBalByAssetPoolResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryFundModBalByAssetPoolResponse,
  },
  queryLendInterest: {
    path: '/comdex.lend.v1beta1.Query/QueryLendInterest',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryLendInterestRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryLendInterestResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryLendInterestRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryLendInterestRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryLendInterestResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryLendInterestResponse,
  },
  queryBorrowInterest: {
    path: '/comdex.lend.v1beta1.Query/QueryBorrowInterest',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_query_pb.QueryBorrowInterestRequest,
    responseType: comdex_lend_v1beta1_query_pb.QueryBorrowInterestResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_QueryBorrowInterestRequest,
    requestDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowInterestRequest,
    responseSerialize: serialize_comdex_lend_v1beta1_QueryBorrowInterestResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_QueryBorrowInterestResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
