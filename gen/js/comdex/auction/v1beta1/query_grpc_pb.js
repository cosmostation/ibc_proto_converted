// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_auction_v1beta1_query_pb = require('../../../comdex/auction/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_auction_v1beta1_auction_pb = require('../../../comdex/auction/v1beta1/auction_pb.js');
var comdex_auction_v1beta1_biddings_pb = require('../../../comdex/auction/v1beta1/biddings_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_comdex_auction_v1beta1_QueryDebtAuctionRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtAuctionRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtAuctionRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDebtAuctionResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtAuctionResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtAuctionResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDebtAuctionsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtAuctionsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtAuctionsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDebtAuctionsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtAuctionsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtAuctionsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDebtBiddingsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtBiddingsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtBiddingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtBiddingsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtBiddingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDebtBiddingsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDebtBiddingsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDebtBiddingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDebtBiddingsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDebtBiddingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchAuctionRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchAuctionRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchAuctionRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchAuctionResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchAuctionResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchAuctionResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchAuctionsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchAuctionsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchAuctionsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchAuctionsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchAuctionsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchAuctionsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchBiddingsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchBiddingsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchBiddingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchBiddingsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchBiddingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchBiddingsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchBiddingsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchBiddingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchBiddingsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchBiddingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendAuctionRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendAuctionResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendAuctionsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendAuctionsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendBiddingsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendBiddingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendBiddingsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryDutchLendBiddingsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryDutchLendBiddingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryDutchLendBiddingsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryGenericAuctionParamRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryGenericAuctionParamRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryGenericAuctionParamRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryGenericAuctionParamResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryGenericAuctionParamResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryGenericAuctionParamResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryProtocolStatisticsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryProtocolStatisticsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryProtocolStatisticsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QueryProtocolStatisticsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QueryProtocolStatisticsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QueryProtocolStatisticsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusAuctionRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusAuctionRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusAuctionRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusAuctionResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusAuctionResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusAuctionResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusAuctionsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusAuctionsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusAuctionsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusAuctionsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusBiddingsRequest(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsRequest)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusBiddingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusBiddingsRequest(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_auction_v1beta1_QuerySurplusBiddingsResponse(arg) {
  if (!(arg instanceof comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsResponse)) {
    throw new Error('Expected argument of type comdex.auction.v1beta1.QuerySurplusBiddingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_auction_v1beta1_QuerySurplusBiddingsResponse(buffer_arg) {
  return comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  querySurplusAuction: {
    path: '/comdex.auction.v1beta1.Query/QuerySurplusAuction',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QuerySurplusAuctionRequest,
    responseType: comdex_auction_v1beta1_query_pb.QuerySurplusAuctionResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QuerySurplusAuctionRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusAuctionRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QuerySurplusAuctionResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusAuctionResponse,
  },
  querySurplusAuctions: {
    path: '/comdex.auction.v1beta1.Query/QuerySurplusAuctions',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QuerySurplusAuctionsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QuerySurplusAuctionsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusAuctionsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QuerySurplusAuctionsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusAuctionsResponse,
  },
  querySurplusBiddings: {
    path: '/comdex.auction.v1beta1.Query/QuerySurplusBiddings',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QuerySurplusBiddingsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QuerySurplusBiddingsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusBiddingsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QuerySurplusBiddingsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QuerySurplusBiddingsResponse,
  },
  queryDebtAuction: {
    path: '/comdex.auction.v1beta1.Query/QueryDebtAuction',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDebtAuctionRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDebtAuctionResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDebtAuctionRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtAuctionRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDebtAuctionResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtAuctionResponse,
  },
  queryDebtAuctions: {
    path: '/comdex.auction.v1beta1.Query/QueryDebtAuctions',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDebtAuctionsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDebtAuctionsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDebtAuctionsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtAuctionsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDebtAuctionsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtAuctionsResponse,
  },
  queryDebtBiddings: {
    path: '/comdex.auction.v1beta1.Query/QueryDebtBiddings',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDebtBiddingsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDebtBiddingsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDebtBiddingsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtBiddingsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDebtBiddingsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDebtBiddingsResponse,
  },
  queryDutchAuction: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchAuction',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchAuctionRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchAuctionResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchAuctionRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchAuctionRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchAuctionResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchAuctionResponse,
  },
  queryDutchAuctions: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchAuctions',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchAuctionsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchAuctionsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchAuctionsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchAuctionsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchAuctionsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchAuctionsResponse,
  },
  queryDutchBiddings: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchBiddings',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchBiddingsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchBiddingsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchBiddingsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchBiddingsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchBiddingsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchBiddingsResponse,
  },
  queryProtocolStatistics: {
    path: '/comdex.auction.v1beta1.Query/QueryProtocolStatistics',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryProtocolStatisticsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryProtocolStatisticsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryProtocolStatisticsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryProtocolStatisticsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryProtocolStatisticsResponse,
  },
  queryGenericAuctionParams: {
    path: '/comdex.auction.v1beta1.Query/QueryGenericAuctionParams',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryGenericAuctionParamResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryGenericAuctionParamRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryGenericAuctionParamRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryGenericAuctionParamResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryGenericAuctionParamResponse,
  },
  queryDutchLendAuction: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchLendAuction',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendAuctionRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendAuctionResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionResponse,
  },
  queryDutchLendAuctions: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchLendAuctions',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchLendAuctionsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendAuctionsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendAuctionsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendAuctionsResponse,
  },
  queryDutchLendBiddings: {
    path: '/comdex.auction.v1beta1.Query/QueryDutchLendBiddings',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryDutchLendBiddingsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendBiddingsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendBiddingsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryDutchLendBiddingsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryDutchLendBiddingsResponse,
  },
  queryFilterDutchAuctions: {
    path: '/comdex.auction.v1beta1.Query/QueryFilterDutchAuctions',
    requestStream: false,
    responseStream: false,
    requestType: comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsRequest,
    responseType: comdex_auction_v1beta1_query_pb.QueryFilterDutchAuctionsResponse,
    requestSerialize: serialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsRequest,
    requestDeserialize: deserialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsRequest,
    responseSerialize: serialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsResponse,
    responseDeserialize: deserialize_comdex_auction_v1beta1_QueryFilterDutchAuctionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
