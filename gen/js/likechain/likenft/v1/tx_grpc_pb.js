// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var likechain_likenft_v1_tx_pb = require('../../../likechain/likenft/v1/tx_pb.js');
var cosmos_nft_v1beta1_nft_pb = require('../../../cosmos/nft/v1beta1/nft_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var likechain_likenft_v1_blind_box_content_pb = require('../../../likechain/likenft/v1/blind_box_content_pb.js');
var likechain_likenft_v1_class_input_pb = require('../../../likechain/likenft/v1/class_input_pb.js');
var likechain_likenft_v1_listing_pb = require('../../../likechain/likenft/v1/listing_pb.js');
var likechain_likenft_v1_nft_input_pb = require('../../../likechain/likenft/v1/nft_input_pb.js');
var likechain_likenft_v1_offer_pb = require('../../../likechain/likenft/v1/offer_pb.js');
var likechain_likenft_v1_royalty_config_pb = require('../../../likechain/likenft/v1/royalty_config_pb.js');

function serialize_likechain_likenft_v1_MsgBurnNFT(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgBurnNFT)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgBurnNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgBurnNFT(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgBurnNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgBurnNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgBurnNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgBurnNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgBurnNFTResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgBurnNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgBuyNFT(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgBuyNFT)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgBuyNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgBuyNFT(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgBuyNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgBuyNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgBuyNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgBuyNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgBuyNFTResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgBuyNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateBlindBoxContent(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContent)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateBlindBoxContent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateBlindBoxContent(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateBlindBoxContentResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContentResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateBlindBoxContentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateBlindBoxContentResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateListing(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateListing)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateListing');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateListing(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateListing.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateListingResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateListingResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateListingResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateOffer(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateOffer)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateOffer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateOffer(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateOffer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateOfferResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateOfferResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateOfferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateOfferResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateOfferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateRoyaltyConfig(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfig)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateRoyaltyConfig');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateRoyaltyConfig(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfig.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgCreateRoyaltyConfigResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfigResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgCreateRoyaltyConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgCreateRoyaltyConfigResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteBlindBoxContent(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContent)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteBlindBoxContent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteBlindBoxContent(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteBlindBoxContentResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContentResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteBlindBoxContentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteBlindBoxContentResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteListing(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteListing)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteListing');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteListing(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteListing.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteListingResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteListingResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteListingResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteOffer(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteOffer)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteOffer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteOffer(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteOffer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteOfferResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteOfferResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteOfferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteOfferResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteOfferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteRoyaltyConfig(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfig)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteRoyaltyConfig');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteRoyaltyConfig(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfig.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgDeleteRoyaltyConfigResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfigResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgDeleteRoyaltyConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgDeleteRoyaltyConfigResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgMintNFT(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgMintNFT)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgMintNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgMintNFT(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgMintNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgMintNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgMintNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgMintNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgMintNFTResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgMintNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgNewClass(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgNewClass)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgNewClass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgNewClass(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgNewClass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgNewClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgNewClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgNewClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgNewClassResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgNewClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgSellNFT(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgSellNFT)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgSellNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgSellNFT(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgSellNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgSellNFTResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgSellNFTResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgSellNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgSellNFTResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgSellNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateBlindBoxContent(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContent)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateBlindBoxContent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateBlindBoxContent(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateBlindBoxContentResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContentResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateBlindBoxContentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateBlindBoxContentResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateClass(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateClass)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateClass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateClass(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateClass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateClassResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateClassResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateClassResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateListing(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateListing)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateListing');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateListing(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateListing.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateListingResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateListingResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateListingResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateOffer(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateOffer)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateOffer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateOffer(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateOffer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateOfferResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateOfferResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateOfferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateOfferResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateOfferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateRoyaltyConfig(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfig)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateRoyaltyConfig');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateRoyaltyConfig(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfig.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse(arg) {
  if (!(arg instanceof likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfigResponse)) {
    throw new Error('Expected argument of type likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse(buffer_arg) {
  return likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  newClass: {
    path: '/likechain.likenft.v1.Msg/NewClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgNewClass,
    responseType: likechain_likenft_v1_tx_pb.MsgNewClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgNewClass,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgNewClass,
    responseSerialize: serialize_likechain_likenft_v1_MsgNewClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgNewClassResponse,
  },
  updateClass: {
    path: '/likechain.likenft.v1.Msg/UpdateClass',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgUpdateClass,
    responseType: likechain_likenft_v1_tx_pb.MsgUpdateClassResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgUpdateClass,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgUpdateClass,
    responseSerialize: serialize_likechain_likenft_v1_MsgUpdateClassResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgUpdateClassResponse,
  },
  mintNFT: {
    path: '/likechain.likenft.v1.Msg/MintNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgMintNFT,
    responseType: likechain_likenft_v1_tx_pb.MsgMintNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgMintNFT,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgMintNFT,
    responseSerialize: serialize_likechain_likenft_v1_MsgMintNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgMintNFTResponse,
  },
  burnNFT: {
    path: '/likechain.likenft.v1.Msg/BurnNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgBurnNFT,
    responseType: likechain_likenft_v1_tx_pb.MsgBurnNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgBurnNFT,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgBurnNFT,
    responseSerialize: serialize_likechain_likenft_v1_MsgBurnNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgBurnNFTResponse,
  },
  createBlindBoxContent: {
    path: '/likechain.likenft.v1.Msg/CreateBlindBoxContent',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContent,
    responseType: likechain_likenft_v1_tx_pb.MsgCreateBlindBoxContentResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgCreateBlindBoxContent,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgCreateBlindBoxContent,
    responseSerialize: serialize_likechain_likenft_v1_MsgCreateBlindBoxContentResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgCreateBlindBoxContentResponse,
  },
  updateBlindBoxContent: {
    path: '/likechain.likenft.v1.Msg/UpdateBlindBoxContent',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContent,
    responseType: likechain_likenft_v1_tx_pb.MsgUpdateBlindBoxContentResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgUpdateBlindBoxContent,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgUpdateBlindBoxContent,
    responseSerialize: serialize_likechain_likenft_v1_MsgUpdateBlindBoxContentResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgUpdateBlindBoxContentResponse,
  },
  deleteBlindBoxContent: {
    path: '/likechain.likenft.v1.Msg/DeleteBlindBoxContent',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContent,
    responseType: likechain_likenft_v1_tx_pb.MsgDeleteBlindBoxContentResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgDeleteBlindBoxContent,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgDeleteBlindBoxContent,
    responseSerialize: serialize_likechain_likenft_v1_MsgDeleteBlindBoxContentResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgDeleteBlindBoxContentResponse,
  },
  createOffer: {
    path: '/likechain.likenft.v1.Msg/CreateOffer',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgCreateOffer,
    responseType: likechain_likenft_v1_tx_pb.MsgCreateOfferResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgCreateOffer,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgCreateOffer,
    responseSerialize: serialize_likechain_likenft_v1_MsgCreateOfferResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgCreateOfferResponse,
  },
  updateOffer: {
    path: '/likechain.likenft.v1.Msg/UpdateOffer',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgUpdateOffer,
    responseType: likechain_likenft_v1_tx_pb.MsgUpdateOfferResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgUpdateOffer,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgUpdateOffer,
    responseSerialize: serialize_likechain_likenft_v1_MsgUpdateOfferResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgUpdateOfferResponse,
  },
  deleteOffer: {
    path: '/likechain.likenft.v1.Msg/DeleteOffer',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgDeleteOffer,
    responseType: likechain_likenft_v1_tx_pb.MsgDeleteOfferResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgDeleteOffer,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgDeleteOffer,
    responseSerialize: serialize_likechain_likenft_v1_MsgDeleteOfferResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgDeleteOfferResponse,
  },
  createListing: {
    path: '/likechain.likenft.v1.Msg/CreateListing',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgCreateListing,
    responseType: likechain_likenft_v1_tx_pb.MsgCreateListingResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgCreateListing,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgCreateListing,
    responseSerialize: serialize_likechain_likenft_v1_MsgCreateListingResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgCreateListingResponse,
  },
  updateListing: {
    path: '/likechain.likenft.v1.Msg/UpdateListing',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgUpdateListing,
    responseType: likechain_likenft_v1_tx_pb.MsgUpdateListingResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgUpdateListing,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgUpdateListing,
    responseSerialize: serialize_likechain_likenft_v1_MsgUpdateListingResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgUpdateListingResponse,
  },
  deleteListing: {
    path: '/likechain.likenft.v1.Msg/DeleteListing',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgDeleteListing,
    responseType: likechain_likenft_v1_tx_pb.MsgDeleteListingResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgDeleteListing,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgDeleteListing,
    responseSerialize: serialize_likechain_likenft_v1_MsgDeleteListingResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgDeleteListingResponse,
  },
  sellNFT: {
    path: '/likechain.likenft.v1.Msg/SellNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgSellNFT,
    responseType: likechain_likenft_v1_tx_pb.MsgSellNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgSellNFT,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgSellNFT,
    responseSerialize: serialize_likechain_likenft_v1_MsgSellNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgSellNFTResponse,
  },
  buyNFT: {
    path: '/likechain.likenft.v1.Msg/BuyNFT',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgBuyNFT,
    responseType: likechain_likenft_v1_tx_pb.MsgBuyNFTResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgBuyNFT,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgBuyNFT,
    responseSerialize: serialize_likechain_likenft_v1_MsgBuyNFTResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgBuyNFTResponse,
  },
  createRoyaltyConfig: {
    path: '/likechain.likenft.v1.Msg/CreateRoyaltyConfig',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfig,
    responseType: likechain_likenft_v1_tx_pb.MsgCreateRoyaltyConfigResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgCreateRoyaltyConfig,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgCreateRoyaltyConfig,
    responseSerialize: serialize_likechain_likenft_v1_MsgCreateRoyaltyConfigResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgCreateRoyaltyConfigResponse,
  },
  updateRoyaltyConfig: {
    path: '/likechain.likenft.v1.Msg/UpdateRoyaltyConfig',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfig,
    responseType: likechain_likenft_v1_tx_pb.MsgUpdateRoyaltyConfigResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgUpdateRoyaltyConfig,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgUpdateRoyaltyConfig,
    responseSerialize: serialize_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse,
  },
  deleteRoyaltyConfig: {
    path: '/likechain.likenft.v1.Msg/DeleteRoyaltyConfig',
    requestStream: false,
    responseStream: false,
    requestType: likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfig,
    responseType: likechain_likenft_v1_tx_pb.MsgDeleteRoyaltyConfigResponse,
    requestSerialize: serialize_likechain_likenft_v1_MsgDeleteRoyaltyConfig,
    requestDeserialize: deserialize_likechain_likenft_v1_MsgDeleteRoyaltyConfig,
    responseSerialize: serialize_likechain_likenft_v1_MsgDeleteRoyaltyConfigResponse,
    responseDeserialize: deserialize_likechain_likenft_v1_MsgDeleteRoyaltyConfigResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
