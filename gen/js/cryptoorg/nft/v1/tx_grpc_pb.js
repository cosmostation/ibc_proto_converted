// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright (c) 2016-2021 Shanghai Bianjie AI Technology Inc. (licensed under the Apache License, Version 2.0)
// Modifications Copyright (c) 2021-present Crypto.org (licensed under the Apache License, Version 2.0)
'use strict';
var grpc = require('grpc');
var cryptoorg_nft_v1_tx_pb = require('../../../cryptoorg/nft/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_chainmain_nft_v1_MsgBurnNFT(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgBurnNFT)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgBurnNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgBurnNFT(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgBurnNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgBurnNFTResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgBurnNFTResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgBurnNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgBurnNFTResponse(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgBurnNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgEditNFT(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgEditNFT)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgEditNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgEditNFT(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgEditNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgEditNFTResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgEditNFTResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgEditNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgEditNFTResponse(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgEditNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgIssueDenom(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgIssueDenom)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgIssueDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgIssueDenom(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgIssueDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgIssueDenomResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgIssueDenomResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgIssueDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgIssueDenomResponse(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgIssueDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgMintNFT(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgMintNFT)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgMintNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgMintNFT(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgMintNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgMintNFTResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgMintNFTResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgMintNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgMintNFTResponse(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgMintNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgTransferNFT(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgTransferNFT)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgTransferNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgTransferNFT(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgTransferNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_MsgTransferNFTResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_tx_pb.MsgTransferNFTResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.MsgTransferNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_MsgTransferNFTResponse(buffer_arg) {
  return cryptoorg_nft_v1_tx_pb.MsgTransferNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the NFT Msg service.
var MsgService = exports.MsgService = {
  // IssueDenom defines a method for issue a denom.
issueDenom: {
    path: '/chainmain.nft.v1.Msg/IssueDenom',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_tx_pb.MsgIssueDenom,
    responseType: cryptoorg_nft_v1_tx_pb.MsgIssueDenomResponse,
    requestSerialize: serialize_chainmain_nft_v1_MsgIssueDenom,
    requestDeserialize: deserialize_chainmain_nft_v1_MsgIssueDenom,
    responseSerialize: serialize_chainmain_nft_v1_MsgIssueDenomResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_MsgIssueDenomResponse,
  },
  // MintNFT defines a method for mint a new nft
mintNFT: {
    path: '/chainmain.nft.v1.Msg/MintNFT',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_tx_pb.MsgMintNFT,
    responseType: cryptoorg_nft_v1_tx_pb.MsgMintNFTResponse,
    requestSerialize: serialize_chainmain_nft_v1_MsgMintNFT,
    requestDeserialize: deserialize_chainmain_nft_v1_MsgMintNFT,
    responseSerialize: serialize_chainmain_nft_v1_MsgMintNFTResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_MsgMintNFTResponse,
  },
  // EditNFT defines a method for editing a nft.
editNFT: {
    path: '/chainmain.nft.v1.Msg/EditNFT',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_tx_pb.MsgEditNFT,
    responseType: cryptoorg_nft_v1_tx_pb.MsgEditNFTResponse,
    requestSerialize: serialize_chainmain_nft_v1_MsgEditNFT,
    requestDeserialize: deserialize_chainmain_nft_v1_MsgEditNFT,
    responseSerialize: serialize_chainmain_nft_v1_MsgEditNFTResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_MsgEditNFTResponse,
  },
  // TransferNFT defines a method for transferring a nft.
transferNFT: {
    path: '/chainmain.nft.v1.Msg/TransferNFT',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_tx_pb.MsgTransferNFT,
    responseType: cryptoorg_nft_v1_tx_pb.MsgTransferNFTResponse,
    requestSerialize: serialize_chainmain_nft_v1_MsgTransferNFT,
    requestDeserialize: deserialize_chainmain_nft_v1_MsgTransferNFT,
    responseSerialize: serialize_chainmain_nft_v1_MsgTransferNFTResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_MsgTransferNFTResponse,
  },
  // BurnNFT defines a method for burning a nft.
burnNFT: {
    path: '/chainmain.nft.v1.Msg/BurnNFT',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_tx_pb.MsgBurnNFT,
    responseType: cryptoorg_nft_v1_tx_pb.MsgBurnNFTResponse,
    requestSerialize: serialize_chainmain_nft_v1_MsgBurnNFT,
    requestDeserialize: deserialize_chainmain_nft_v1_MsgBurnNFT,
    responseSerialize: serialize_chainmain_nft_v1_MsgBurnNFTResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_MsgBurnNFTResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
