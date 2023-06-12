// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_asset_nft_v1_tx_pb = require('../../../../coreum/asset/nft/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var coreum_asset_nft_v1_nft_pb = require('../../../../coreum/asset/nft/v1/nft_pb.js');

function serialize_coreum_asset_nft_v1_EmptyResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.EmptyResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.EmptyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_EmptyResponse(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.EmptyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgAddToWhitelist(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgAddToWhitelist)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgAddToWhitelist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgAddToWhitelist(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgAddToWhitelist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgBurn(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgBurn(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgFreeze(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgFreeze)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgFreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgFreeze(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgFreeze.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgIssueClass(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgIssueClass)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgIssueClass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgIssueClass(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgIssueClass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgMint(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgMint(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgRemoveFromWhitelist(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgRemoveFromWhitelist)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgRemoveFromWhitelist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgRemoveFromWhitelist(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgRemoveFromWhitelist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_MsgUnfreeze(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_tx_pb.MsgUnfreeze)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.MsgUnfreeze');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_MsgUnfreeze(buffer_arg) {
  return coreum_asset_nft_v1_tx_pb.MsgUnfreeze.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // IssueClass creates new non-fungible token class.
issueClass: {
    path: '/coreum.asset.nft.v1.Msg/IssueClass',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgIssueClass,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgIssueClass,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgIssueClass,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // Mint mints new non-fungible token in the class.
mint: {
    path: '/coreum.asset.nft.v1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgMint,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgMint,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgMint,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // Burn burns the existing non-fungible token in the class.
burn: {
    path: '/coreum.asset.nft.v1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgBurn,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgBurn,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgBurn,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // Freeze freezes an NFT
freeze: {
    path: '/coreum.asset.nft.v1.Msg/Freeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgFreeze,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgFreeze,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgFreeze,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // Unfreeze removes the freeze effect already put on an NFT
unfreeze: {
    path: '/coreum.asset.nft.v1.Msg/Unfreeze',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgUnfreeze,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgUnfreeze,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgUnfreeze,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // AddToWhitelist sets the account as whitelisted to hold the NFT
addToWhitelist: {
    path: '/coreum.asset.nft.v1.Msg/AddToWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgAddToWhitelist,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgAddToWhitelist,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgAddToWhitelist,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
  // RemoveFromWhitelist removes an account from whitelisted list of the NFT
removeFromWhitelist: {
    path: '/coreum.asset.nft.v1.Msg/RemoveFromWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_tx_pb.MsgRemoveFromWhitelist,
    responseType: coreum_asset_nft_v1_tx_pb.EmptyResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_MsgRemoveFromWhitelist,
    requestDeserialize: deserialize_coreum_asset_nft_v1_MsgRemoveFromWhitelist,
    responseSerialize: serialize_coreum_asset_nft_v1_EmptyResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_EmptyResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
