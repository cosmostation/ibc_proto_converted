// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cudos_marketplace_tx_pb = require('../../cudos/marketplace/tx_pb.js');
var cudos_marketplace_royalty_pb = require('../../cudos/marketplace/royalty_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_cudoventures_cudosnode_marketplace_MsgAddAdmin(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgAddAdmin)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgAddAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgAddAdmin(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgAddAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgAddAdminResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgAddAdminResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgAddAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgAddAdminResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgAddAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgBuyNft(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgBuyNft)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgBuyNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgBuyNft(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgBuyNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgBuyNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgBuyNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgBuyNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgBuyNftResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgBuyNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgCreateCollection(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgCreateCollection)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgCreateCollection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgCreateCollection(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgCreateCollection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgCreateCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgCreateCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgCreateCollectionResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgCreateCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgMintNft(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgMintNft)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgMintNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgMintNft(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgMintNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgMintNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgMintNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgMintNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgMintNftResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgMintNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgPublishCollection(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgPublishCollection)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgPublishCollection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgPublishCollection(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgPublishCollection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgPublishCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgPublishCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgPublishCollectionResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgPublishCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgPublishNft(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgPublishNft)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgPublishNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgPublishNft(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgPublishNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgPublishNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgPublishNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgPublishNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgPublishNftResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgPublishNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgRemoveAdmin(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgRemoveAdmin)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgRemoveAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgRemoveAdmin(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgRemoveAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgRemoveAdminResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgRemoveAdminResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgRemoveAdminResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgRemoveAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgRemoveNft(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgRemoveNft)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgRemoveNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgRemoveNft(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgRemoveNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgRemoveNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgRemoveNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgRemoveNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgRemoveNftResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgRemoveNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollection(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUnverifyCollection)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUnverifyCollection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollection(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUnverifyCollection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUnverifyCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollectionResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUnverifyCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUpdatePrice(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUpdatePrice)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUpdatePrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUpdatePrice(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUpdatePrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUpdatePriceResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUpdatePriceResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUpdatePriceResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUpdatePriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyalties(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUpdateRoyalties)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUpdateRoyalties');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyalties(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUpdateRoyalties.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyaltiesResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgUpdateRoyaltiesResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyaltiesResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgUpdateRoyaltiesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgVerifyCollection(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgVerifyCollection)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgVerifyCollection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgVerifyCollection(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgVerifyCollection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_MsgVerifyCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_tx_pb.MsgVerifyCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_MsgVerifyCollectionResponse(buffer_arg) {
  return cudos_marketplace_tx_pb.MsgVerifyCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  publishCollection: {
    path: '/cudoventures.cudosnode.marketplace.Msg/PublishCollection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgPublishCollection,
    responseType: cudos_marketplace_tx_pb.MsgPublishCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgPublishCollection,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgPublishCollection,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgPublishCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgPublishCollectionResponse,
  },
  publishNft: {
    path: '/cudoventures.cudosnode.marketplace.Msg/PublishNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgPublishNft,
    responseType: cudos_marketplace_tx_pb.MsgPublishNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgPublishNft,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgPublishNft,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgPublishNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgPublishNftResponse,
  },
  buyNft: {
    path: '/cudoventures.cudosnode.marketplace.Msg/BuyNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgBuyNft,
    responseType: cudos_marketplace_tx_pb.MsgBuyNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgBuyNft,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgBuyNft,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgBuyNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgBuyNftResponse,
  },
  mintNft: {
    path: '/cudoventures.cudosnode.marketplace.Msg/MintNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgMintNft,
    responseType: cudos_marketplace_tx_pb.MsgMintNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgMintNft,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgMintNft,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgMintNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgMintNftResponse,
  },
  removeNft: {
    path: '/cudoventures.cudosnode.marketplace.Msg/RemoveNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgRemoveNft,
    responseType: cudos_marketplace_tx_pb.MsgRemoveNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgRemoveNft,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgRemoveNft,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgRemoveNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgRemoveNftResponse,
  },
  verifyCollection: {
    path: '/cudoventures.cudosnode.marketplace.Msg/VerifyCollection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgVerifyCollection,
    responseType: cudos_marketplace_tx_pb.MsgVerifyCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgVerifyCollection,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgVerifyCollection,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgVerifyCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgVerifyCollectionResponse,
  },
  unverifyCollection: {
    path: '/cudoventures.cudosnode.marketplace.Msg/UnverifyCollection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgUnverifyCollection,
    responseType: cudos_marketplace_tx_pb.MsgUnverifyCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollection,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollection,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUnverifyCollectionResponse,
  },
  createCollection: {
    path: '/cudoventures.cudosnode.marketplace.Msg/CreateCollection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgCreateCollection,
    responseType: cudos_marketplace_tx_pb.MsgCreateCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgCreateCollection,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgCreateCollection,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgCreateCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgCreateCollectionResponse,
  },
  updateRoyalties: {
    path: '/cudoventures.cudosnode.marketplace.Msg/UpdateRoyalties',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgUpdateRoyalties,
    responseType: cudos_marketplace_tx_pb.MsgUpdateRoyaltiesResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyalties,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyalties,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyaltiesResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUpdateRoyaltiesResponse,
  },
  updatePrice: {
    path: '/cudoventures.cudosnode.marketplace.Msg/UpdatePrice',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgUpdatePrice,
    responseType: cudos_marketplace_tx_pb.MsgUpdatePriceResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUpdatePrice,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUpdatePrice,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgUpdatePriceResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgUpdatePriceResponse,
  },
  addAdmin: {
    path: '/cudoventures.cudosnode.marketplace.Msg/AddAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgAddAdmin,
    responseType: cudos_marketplace_tx_pb.MsgAddAdminResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgAddAdmin,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgAddAdmin,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgAddAdminResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgAddAdminResponse,
  },
  removeAdmin: {
    path: '/cudoventures.cudosnode.marketplace.Msg/RemoveAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_tx_pb.MsgRemoveAdmin,
    responseType: cudos_marketplace_tx_pb.MsgRemoveAdminResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_MsgRemoveAdmin,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgRemoveAdmin,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_MsgRemoveAdminResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_MsgRemoveAdminResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
