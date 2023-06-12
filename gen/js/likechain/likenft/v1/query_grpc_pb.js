// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var likechain_likenft_v1_query_pb = require('../../../likechain/likenft/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_nft_v1beta1_nft_pb = require('../../../cosmos/nft/v1beta1/nft_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var likechain_iscn_query_pb = require('../../../likechain/iscn/query_pb.js');
var likechain_likenft_v1_blind_box_content_pb = require('../../../likechain/likenft/v1/blind_box_content_pb.js');
var likechain_likenft_v1_classes_by_account_pb = require('../../../likechain/likenft/v1/classes_by_account_pb.js');
var likechain_likenft_v1_classes_by_iscn_pb = require('../../../likechain/likenft/v1/classes_by_iscn_pb.js');
var likechain_likenft_v1_listing_pb = require('../../../likechain/likenft/v1/listing_pb.js');
var likechain_likenft_v1_offer_pb = require('../../../likechain/likenft/v1/offer_pb.js');
var likechain_likenft_v1_params_pb = require('../../../likechain/likenft/v1/params_pb.js');
var likechain_likenft_v1_royalty_config_pb = require('../../../likechain/likenft/v1/royalty_config_pb.js');

function serialize_likechain_likenft_v1_QueryAccountByClassRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryAccountByClassRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryAccountByClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryAccountByClassRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryAccountByClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryAccountByClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryAccountByClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryAccountByClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryAccountByClassResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryAccountByClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentsRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentsRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentsRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryBlindBoxContentsResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryBlindBoxContentsResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryBlindBoxContentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryBlindBoxContentsResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryBlindBoxContentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByAccountIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByAccountIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByAccountIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByAccountIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByAccountIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByAccountIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByAccountIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByAccountIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByAccountIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByAccountIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByAccountRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByAccountRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByAccountRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByAccountResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByAccountResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByAccountResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByISCNIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByISCNIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByISCNIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByISCNIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByISCNIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByISCNIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByISCNIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByISCNIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByISCNIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByISCNIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByISCNRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByISCNRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByISCNRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByISCNRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByISCNRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryClassesByISCNResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryClassesByISCNResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryClassesByISCNResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryClassesByISCNResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryClassesByISCNResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryISCNByClassRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryISCNByClassRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryISCNByClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryISCNByClassRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryISCNByClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryISCNByClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryISCNByClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryISCNByClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryISCNByClassResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryISCNByClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingsByClassRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingsByClassRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingsByClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingsByClassRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingsByClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingsByClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingsByClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingsByClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingsByClassResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingsByClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingsByNFTRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingsByNFTRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingsByNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingsByNFTRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingsByNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryListingsByNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryListingsByNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryListingsByNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryListingsByNFTResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryListingsByNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOfferIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOfferIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOfferIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOfferIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOfferIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOfferIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOfferIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOfferIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOfferIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOfferIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOfferRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOfferRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOfferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOfferRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOfferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOfferResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOfferResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOfferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOfferResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOfferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOffersByClassRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOffersByClassRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOffersByClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOffersByClassRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOffersByClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOffersByClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOffersByClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOffersByClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOffersByClassResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOffersByClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOffersByNFTRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOffersByNFTRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOffersByNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOffersByNFTRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOffersByNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryOffersByNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryOffersByNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryOffersByNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryOffersByNFTResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryOffersByNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryParamsRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryParamsResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryRoyaltyConfigIndexRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryRoyaltyConfigIndexRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryRoyaltyConfigIndexRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryRoyaltyConfigIndexResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryRoyaltyConfigIndexResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryRoyaltyConfigIndexResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryRoyaltyConfigRequest(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryRoyaltyConfigRequest)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryRoyaltyConfigRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryRoyaltyConfigRequest(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryRoyaltyConfigRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_QueryRoyaltyConfigResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_query_pb.QueryRoyaltyConfigResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.QueryRoyaltyConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_QueryRoyaltyConfigResponse(buffer_arg) {
  return likechain_likenft_v1_query_pb.QueryRoyaltyConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/likechain.likenft.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryParamsRequest,
    responseType: likechain_likenft_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryParamsRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryParamsRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryParamsResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryParamsResponse,
  },
  // Queries a ClassesByISCN by index.
classesByISCN: {
    path: '/likechain.likenft.v1.Query/ClassesByISCN',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryClassesByISCNRequest,
    responseType: likechain_likenft_v1_query_pb.QueryClassesByISCNResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryClassesByISCNRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryClassesByISCNRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryClassesByISCNResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryClassesByISCNResponse,
  },
  // Queries a list of ClassesByISCN items.
classesByISCNIndex: {
    path: '/likechain.likenft.v1.Query/ClassesByISCNIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryClassesByISCNIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryClassesByISCNIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryClassesByISCNIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryClassesByISCNIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryClassesByISCNIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryClassesByISCNIndexResponse,
  },
  // Queries a list of ISCNByClass items.
iSCNByClass: {
    path: '/likechain.likenft.v1.Query/ISCNByClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryISCNByClassRequest,
    responseType: likechain_likenft_v1_query_pb.QueryISCNByClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryISCNByClassRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryISCNByClassRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryISCNByClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryISCNByClassResponse,
  },
  // Queries a ClassesByAccount by index.
classesByAccount: {
    path: '/likechain.likenft.v1.Query/ClassesByAccount',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryClassesByAccountRequest,
    responseType: likechain_likenft_v1_query_pb.QueryClassesByAccountResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryClassesByAccountRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryClassesByAccountRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryClassesByAccountResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryClassesByAccountResponse,
  },
  // Queries a list of ClassesByAccount items.
classesByAccountIndex: {
    path: '/likechain.likenft.v1.Query/ClassesByAccountIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryClassesByAccountIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryClassesByAccountIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryClassesByAccountIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryClassesByAccountIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryClassesByAccountIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryClassesByAccountIndexResponse,
  },
  // Queries a list of AccountByClass items.
accountByClass: {
    path: '/likechain.likenft.v1.Query/AccountByClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryAccountByClassRequest,
    responseType: likechain_likenft_v1_query_pb.QueryAccountByClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryAccountByClassRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryAccountByClassRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryAccountByClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryAccountByClassResponse,
  },
  // Queries a BlindBoxContent by index.
blindBoxContent: {
    path: '/likechain.likenft.v1.Query/BlindBoxContent',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryBlindBoxContentRequest,
    responseType: likechain_likenft_v1_query_pb.QueryBlindBoxContentResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentResponse,
  },
  // Queries a list of BlindBoxContent items.
blindBoxContentIndex: {
    path: '/likechain.likenft.v1.Query/BlindBoxContentIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryBlindBoxContentIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentIndexResponse,
  },
  // Queries a list of BlindBoxContents by class_id
blindBoxContents: {
    path: '/likechain.likenft.v1.Query/BlindBoxContents',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryBlindBoxContentsRequest,
    responseType: likechain_likenft_v1_query_pb.QueryBlindBoxContentsResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentsRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentsRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryBlindBoxContentsResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryBlindBoxContentsResponse,
  },
  // Queries a Offer by index.
offer: {
    path: '/likechain.likenft.v1.Query/Offer',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryOfferRequest,
    responseType: likechain_likenft_v1_query_pb.QueryOfferResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryOfferRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryOfferRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryOfferResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryOfferResponse,
  },
  // Queries a list of Offer items.
offerIndex: {
    path: '/likechain.likenft.v1.Query/OfferIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryOfferIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryOfferIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryOfferIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryOfferIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryOfferIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryOfferIndexResponse,
  },
  // Queries a list of OffersByClass items.
offersByClass: {
    path: '/likechain.likenft.v1.Query/OffersByClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryOffersByClassRequest,
    responseType: likechain_likenft_v1_query_pb.QueryOffersByClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryOffersByClassRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryOffersByClassRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryOffersByClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryOffersByClassResponse,
  },
  // Queries a list of OffersByNFT items.
offersByNFT: {
    path: '/likechain.likenft.v1.Query/OffersByNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryOffersByNFTRequest,
    responseType: likechain_likenft_v1_query_pb.QueryOffersByNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryOffersByNFTRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryOffersByNFTRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryOffersByNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryOffersByNFTResponse,
  },
  // Queries a Listing by index.
listing: {
    path: '/likechain.likenft.v1.Query/Listing',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryListingRequest,
    responseType: likechain_likenft_v1_query_pb.QueryListingResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryListingRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryListingRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryListingResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryListingResponse,
  },
  // Queries a list of Listing items.
listingIndex: {
    path: '/likechain.likenft.v1.Query/ListingIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryListingIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryListingIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryListingIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryListingIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryListingIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryListingIndexResponse,
  },
  // Queries a list of Listing items by class
listingsByClass: {
    path: '/likechain.likenft.v1.Query/ListingsByClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryListingsByClassRequest,
    responseType: likechain_likenft_v1_query_pb.QueryListingsByClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryListingsByClassRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryListingsByClassRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryListingsByClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryListingsByClassResponse,
  },
  // Queries a list of Listing items by nft
listingsByNFT: {
    path: '/likechain.likenft.v1.Query/ListingsByNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryListingsByNFTRequest,
    responseType: likechain_likenft_v1_query_pb.QueryListingsByNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryListingsByNFTRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryListingsByNFTRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryListingsByNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryListingsByNFTResponse,
  },
  // Queries a RoyaltyConfig by class
royaltyConfig: {
    path: '/likechain.likenft.v1.Query/RoyaltyConfig',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryRoyaltyConfigRequest,
    responseType: likechain_likenft_v1_query_pb.QueryRoyaltyConfigResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryRoyaltyConfigRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryRoyaltyConfigRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryRoyaltyConfigResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryRoyaltyConfigResponse,
  },
  // Queries index of RoyaltyConfig of all classes
royaltyConfigIndex: {
    path: '/likechain.likenft.v1.Query/RoyaltyConfigIndex',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexRequest,
    responseType: likechain_likenft_v1_query_pb.QueryRoyaltyConfigIndexResponse,
    requestSerialize: serialize_likechain_likenft_v1_QueryRoyaltyConfigIndexRequest,
    requestDeserialize: deserialize_likechain_likenft_v1_QueryRoyaltyConfigIndexRequest,
    responseSerialize: serialize_likechain_likenft_v1_QueryRoyaltyConfigIndexResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_QueryRoyaltyConfigIndexResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
