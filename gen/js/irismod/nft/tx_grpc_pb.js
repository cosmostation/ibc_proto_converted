// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_nft_tx_pb = require('../../irismod/nft/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_nft_MsgBurnNFT(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgBurnNFT)) {
    throw new Error('Expected argument of type irismod.nft.MsgBurnNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgBurnNFT(buffer_arg) {
  return irismod_nft_tx_pb.MsgBurnNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgBurnNFTResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgBurnNFTResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgBurnNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgBurnNFTResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgBurnNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgEditNFT(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgEditNFT)) {
    throw new Error('Expected argument of type irismod.nft.MsgEditNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgEditNFT(buffer_arg) {
  return irismod_nft_tx_pb.MsgEditNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgEditNFTResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgEditNFTResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgEditNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgEditNFTResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgEditNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgIssueDenom(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgIssueDenom)) {
    throw new Error('Expected argument of type irismod.nft.MsgIssueDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgIssueDenom(buffer_arg) {
  return irismod_nft_tx_pb.MsgIssueDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgIssueDenomResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgIssueDenomResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgIssueDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgIssueDenomResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgIssueDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgMintNFT(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgMintNFT)) {
    throw new Error('Expected argument of type irismod.nft.MsgMintNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgMintNFT(buffer_arg) {
  return irismod_nft_tx_pb.MsgMintNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgMintNFTResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgMintNFTResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgMintNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgMintNFTResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgMintNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgTransferDenom(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgTransferDenom)) {
    throw new Error('Expected argument of type irismod.nft.MsgTransferDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgTransferDenom(buffer_arg) {
  return irismod_nft_tx_pb.MsgTransferDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgTransferDenomResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgTransferDenomResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgTransferDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgTransferDenomResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgTransferDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgTransferNFT(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgTransferNFT)) {
    throw new Error('Expected argument of type irismod.nft.MsgTransferNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgTransferNFT(buffer_arg) {
  return irismod_nft_tx_pb.MsgTransferNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_MsgTransferNFTResponse(arg) {
  if (!(arg instanceof irismod_nft_tx_pb.MsgTransferNFTResponse)) {
    throw new Error('Expected argument of type irismod.nft.MsgTransferNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_MsgTransferNFTResponse(buffer_arg) {
  return irismod_nft_tx_pb.MsgTransferNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the nft Msg service.
var MsgService = exports.MsgService = {
  // IssueDenom defines a method for issue a denom.
issueDenom: {
    path: '/irismod.nft.Msg/IssueDenom',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgIssueDenom,
    responseType: irismod_nft_tx_pb.MsgIssueDenomResponse,
    requestSerialize: serialize_irismod_nft_MsgIssueDenom,
    requestDeserialize: deserialize_irismod_nft_MsgIssueDenom,
    responseSerialize: serialize_irismod_nft_MsgIssueDenomResponse,
    responseDeserialize: deserialize_irismod_nft_MsgIssueDenomResponse,
  },
  // MintNFT defines a method for mint a new nft
mintNFT: {
    path: '/irismod.nft.Msg/MintNFT',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgMintNFT,
    responseType: irismod_nft_tx_pb.MsgMintNFTResponse,
    requestSerialize: serialize_irismod_nft_MsgMintNFT,
    requestDeserialize: deserialize_irismod_nft_MsgMintNFT,
    responseSerialize: serialize_irismod_nft_MsgMintNFTResponse,
    responseDeserialize: deserialize_irismod_nft_MsgMintNFTResponse,
  },
  // RefundHTLC defines a method for editing a nft.
editNFT: {
    path: '/irismod.nft.Msg/EditNFT',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgEditNFT,
    responseType: irismod_nft_tx_pb.MsgEditNFTResponse,
    requestSerialize: serialize_irismod_nft_MsgEditNFT,
    requestDeserialize: deserialize_irismod_nft_MsgEditNFT,
    responseSerialize: serialize_irismod_nft_MsgEditNFTResponse,
    responseDeserialize: deserialize_irismod_nft_MsgEditNFTResponse,
  },
  // TransferNFT defines a method for transferring a nft.
transferNFT: {
    path: '/irismod.nft.Msg/TransferNFT',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgTransferNFT,
    responseType: irismod_nft_tx_pb.MsgTransferNFTResponse,
    requestSerialize: serialize_irismod_nft_MsgTransferNFT,
    requestDeserialize: deserialize_irismod_nft_MsgTransferNFT,
    responseSerialize: serialize_irismod_nft_MsgTransferNFTResponse,
    responseDeserialize: deserialize_irismod_nft_MsgTransferNFTResponse,
  },
  // BurnNFT defines a method for burning a nft.
burnNFT: {
    path: '/irismod.nft.Msg/BurnNFT',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgBurnNFT,
    responseType: irismod_nft_tx_pb.MsgBurnNFTResponse,
    requestSerialize: serialize_irismod_nft_MsgBurnNFT,
    requestDeserialize: deserialize_irismod_nft_MsgBurnNFT,
    responseSerialize: serialize_irismod_nft_MsgBurnNFTResponse,
    responseDeserialize: deserialize_irismod_nft_MsgBurnNFTResponse,
  },
  // TransferDenom defines a method for transferring a denom.
transferDenom: {
    path: '/irismod.nft.Msg/TransferDenom',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_tx_pb.MsgTransferDenom,
    responseType: irismod_nft_tx_pb.MsgTransferDenomResponse,
    requestSerialize: serialize_irismod_nft_MsgTransferDenom,
    requestDeserialize: deserialize_irismod_nft_MsgTransferDenom,
    responseSerialize: serialize_irismod_nft_MsgTransferDenomResponse,
    responseDeserialize: deserialize_irismod_nft_MsgTransferDenomResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
