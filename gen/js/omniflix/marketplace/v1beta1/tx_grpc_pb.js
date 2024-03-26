// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_marketplace_v1beta1_tx_pb = require('../../../OmniFlix/marketplace/v1beta1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var OmniFlix_marketplace_v1beta1_listing_pb = require('../../../OmniFlix/marketplace/v1beta1/listing_pb.js');
var OmniFlix_marketplace_v1beta1_auction_pb = require('../../../OmniFlix/marketplace/v1beta1/auction_pb.js');
var OmniFlix_marketplace_v1beta1_params_pb = require('../../../OmniFlix/marketplace/v1beta1/params_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_OmniFlix_marketplace_v1beta1_MsgBuyNFT(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFT)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgBuyNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgBuyNFT(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgBuyNFTResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgBuyNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgBuyNFTResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgCancelAuction(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuction)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgCancelAuction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgCancelAuction(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgCancelAuctionResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuctionResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgCancelAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgCancelAuctionResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgCreateAuction(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuction)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgCreateAuction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgCreateAuction(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgCreateAuctionResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuctionResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgCreateAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgCreateAuctionResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgDeListNFT(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFT)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgDeListNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgDeListNFT(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgDeListNFTResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgDeListNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgDeListNFTResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgEditListing(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListing)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgEditListing');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgEditListing(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListing.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgEditListingResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListingResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgEditListingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgEditListingResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgListNFT(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFT)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgListNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgListNFT(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgListNFTResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgListNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgListNFTResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgPlaceBid(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBid)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgPlaceBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgPlaceBid(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgPlaceBidResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBidResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgPlaceBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgPlaceBidResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgUpdateParams(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_marketplace_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.marketplace.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_marketplace_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  listNFT: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/ListNFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFT,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgListNFTResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgListNFT,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgListNFT,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgListNFTResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgListNFTResponse,
  },
  editListing: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/EditListing',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListing,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgEditListingResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgEditListing,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgEditListing,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgEditListingResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgEditListingResponse,
  },
  deListNFT: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/DeListNFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFT,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgDeListNFTResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgDeListNFT,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgDeListNFT,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgDeListNFTResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgDeListNFTResponse,
  },
  buyNFT: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/BuyNFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFT,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgBuyNFTResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgBuyNFT,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgBuyNFT,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgBuyNFTResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgBuyNFTResponse,
  },
  createAuction: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/CreateAuction',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuction,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgCreateAuctionResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgCreateAuction,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgCreateAuction,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgCreateAuctionResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgCreateAuctionResponse,
  },
  cancelAuction: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/CancelAuction',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuction,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgCancelAuctionResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgCancelAuction,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgCancelAuction,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgCancelAuctionResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgCancelAuctionResponse,
  },
  placeBid: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/PlaceBid',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBid,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgPlaceBidResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgPlaceBid,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgPlaceBid,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgPlaceBidResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgPlaceBidResponse,
  },
  // UpdateParams defines a governance operation for updating the x/marketplace module
// parameters. The authority is hard-coded to the x/marketplace module account.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/OmniFlix.marketplace.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParams,
    responseType: OmniFlix_marketplace_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_OmniFlix_marketplace_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_OmniFlix_marketplace_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
