// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_marketplace_v1beta1_query_pb = require('../../../OmniFlix/marketplace/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var OmniFlix_marketplace_v1beta1_listing_pb = require('../../../OmniFlix/marketplace/v1beta1/listing_pb.js');
var OmniFlix_marketplace_v1beta1_params_pb = require('../../../OmniFlix/marketplace/v1beta1/params_pb.js');
var OmniFlix_marketplace_v1beta1_auction_pb = require('../../../OmniFlix/marketplace/v1beta1/auction_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionByNFTIDRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionByNFTIDRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionByNFTIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionByNFTIDRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionByNFTIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByOwnerRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByOwnerRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionsByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByOwnerRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByPriceDenomRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByPriceDenomRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionsByPriceDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByPriceDenomRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByPriceDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryBidRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryBidRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryBidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryBidRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryBidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryBidResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryBidResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryBidResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryBidsRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryBidsRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryBidsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryBidsRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryBidsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryBidsResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryBidsResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryBidsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryBidsResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryBidsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingByNFTIDRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingByNFTIDRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingByNFTIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingByNFTIDRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingByNFTIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsByPriceDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsByPriceDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryListingsResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryListingsResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryListingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryListingsResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryListingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryParamsRequest(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_QueryParamsResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // Params queries params of the marketplace module.
params: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryParamsRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryParamsResponse,
  },
  listings: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Listings',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsResponse,
  },
  listing: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Listing',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingResponse,
  },
  listingsByOwner: {
    path: '/OmniFlix.marketplace.v1beta1.Query/ListingsByOwner',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByOwnerResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByOwnerResponse,
  },
  listingsByPriceDenom: {
    path: '/OmniFlix.marketplace.v1beta1.Query/ListingsByPriceDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingsByPriceDenomResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingsByPriceDenomResponse,
  },
  listingByNftId: {
    path: '/OmniFlix.marketplace.v1beta1.Query/ListingByNftId',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingByNFTIDRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryListingResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingByNFTIDRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingByNFTIDRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryListingResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryListingResponse,
  },
  // auction queries
auctions: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Auctions',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
  },
  auction: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Auction',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse,
  },
  auctionsByOwner: {
    path: '/OmniFlix.marketplace.v1beta1.Query/AuctionsByOwner',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByOwnerRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByOwnerRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByOwnerRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
  },
  auctionsByPriceDenom: {
    path: '/OmniFlix.marketplace.v1beta1.Query/AuctionsByPriceDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsByPriceDenomRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByPriceDenomRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsByPriceDenomRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionsResponse,
  },
  auctionByNftId: {
    path: '/OmniFlix.marketplace.v1beta1.Query/AuctionByNftId',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionByNFTIDRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryAuctionResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionByNFTIDRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionByNFTIDRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryAuctionResponse,
  },
  bids: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Bids',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryBidsRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryBidsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryBidsRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryBidsRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryBidsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryBidsResponse,
  },
  bid: {
    path: '/OmniFlix.marketplace.v1beta1.Query/Bid',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_query_pb.QueryBidRequest,
    responseType: OmniFlix_marketplace_v1beta1_query_pb.QueryBidResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryBidRequest,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryBidRequest,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_QueryBidResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_QueryBidResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
