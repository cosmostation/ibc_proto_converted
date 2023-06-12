// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cudos_nft_tx_pb = require('../../cudos/nft/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_cudosnode_cudosnode_nft_MsgApproveAllNft(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgApproveAllNft)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgApproveAllNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgApproveAllNft(buffer_arg) {
  return cudos_nft_tx_pb.MsgApproveAllNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgApproveAllNftResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgApproveAllNftResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgApproveAllNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgApproveAllNftResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgApproveAllNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgApproveNft(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgApproveNft)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgApproveNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgApproveNft(buffer_arg) {
  return cudos_nft_tx_pb.MsgApproveNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgApproveNftResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgApproveNftResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgApproveNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgApproveNftResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgApproveNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgBurnNFT(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgBurnNFT)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgBurnNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgBurnNFT(buffer_arg) {
  return cudos_nft_tx_pb.MsgBurnNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgBurnNFTResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgBurnNFTResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgBurnNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgBurnNFTResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgBurnNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgEditNFT(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgEditNFT)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgEditNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgEditNFT(buffer_arg) {
  return cudos_nft_tx_pb.MsgEditNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgEditNFTResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgEditNFTResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgEditNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgEditNFTResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgEditNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgIssueDenom(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgIssueDenom)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgIssueDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgIssueDenom(buffer_arg) {
  return cudos_nft_tx_pb.MsgIssueDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgIssueDenomResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgIssueDenomResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgIssueDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgIssueDenomResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgIssueDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgMintNFT(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgMintNFT)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgMintNFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgMintNFT(buffer_arg) {
  return cudos_nft_tx_pb.MsgMintNFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgMintNFTResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgMintNFTResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgMintNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgMintNFTResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgMintNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgRevokeNft(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgRevokeNft)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgRevokeNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgRevokeNft(buffer_arg) {
  return cudos_nft_tx_pb.MsgRevokeNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgRevokeNftResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgRevokeNftResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgRevokeNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgRevokeNftResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgRevokeNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgTransferDenom(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgTransferDenom)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgTransferDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgTransferDenom(buffer_arg) {
  return cudos_nft_tx_pb.MsgTransferDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgTransferDenomResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgTransferDenomResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgTransferDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgTransferDenomResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgTransferDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgTransferNft(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgTransferNft)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgTransferNft');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgTransferNft(buffer_arg) {
  return cudos_nft_tx_pb.MsgTransferNft.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_MsgTransferNftResponse(arg) {
  if (!(arg instanceof cudos_nft_tx_pb.MsgTransferNftResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.MsgTransferNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_MsgTransferNftResponse(buffer_arg) {
  return cudos_nft_tx_pb.MsgTransferNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the NFT Msg service.
var MsgService = exports.MsgService = {
  // IssueDenom defines a method for issue a denom.
issueDenom: {
    path: '/cudosnode.cudosnode.nft.Msg/IssueDenom',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgIssueDenom,
    responseType: cudos_nft_tx_pb.MsgIssueDenomResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgIssueDenom,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgIssueDenom,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgIssueDenomResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgIssueDenomResponse,
  },
  // MintNFT defines a method for mint a new nft
mintNFT: {
    path: '/cudosnode.cudosnode.nft.Msg/MintNFT',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgMintNFT,
    responseType: cudos_nft_tx_pb.MsgMintNFTResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgMintNFT,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgMintNFT,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgMintNFTResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgMintNFTResponse,
  },
  // EditNFT defines a method for editing a nft.
editNFT: {
    path: '/cudosnode.cudosnode.nft.Msg/EditNFT',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgEditNFT,
    responseType: cudos_nft_tx_pb.MsgEditNFTResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgEditNFT,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgEditNFT,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgEditNFTResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgEditNFTResponse,
  },
  // TransferNft transfers ownership of the token to recipient account.
transferNft: {
    path: '/cudosnode.cudosnode.nft.Msg/TransferNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgTransferNft,
    responseType: cudos_nft_tx_pb.MsgTransferNftResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgTransferNft,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgTransferNft,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgTransferNftResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgTransferNftResponse,
  },
  // Approve grants permission to spender to transfer or send the given token.
approveNft: {
    path: '/cudosnode.cudosnode.nft.Msg/ApproveNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgApproveNft,
    responseType: cudos_nft_tx_pb.MsgApproveNftResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgApproveNft,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgApproveNft,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgApproveNftResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgApproveNftResponse,
  },
  // Approve grants permission to spender to transfer or send the given token.
approveAllNft: {
    path: '/cudosnode.cudosnode.nft.Msg/ApproveAllNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgApproveAllNft,
    responseType: cudos_nft_tx_pb.MsgApproveAllNftResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgApproveAllNft,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgApproveAllNft,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgApproveAllNftResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgApproveAllNftResponse,
  },
  // Revokes permission to spender to transfer or send the given token.
revokeNft: {
    path: '/cudosnode.cudosnode.nft.Msg/RevokeNft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgRevokeNft,
    responseType: cudos_nft_tx_pb.MsgRevokeNftResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgRevokeNft,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgRevokeNft,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgRevokeNftResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgRevokeNftResponse,
  },
  // BurnNFT defines a method for burning a nft.
burnNFT: {
    path: '/cudosnode.cudosnode.nft.Msg/BurnNFT',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgBurnNFT,
    responseType: cudos_nft_tx_pb.MsgBurnNFTResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgBurnNFT,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgBurnNFT,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgBurnNFTResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgBurnNFTResponse,
  },
  // TransferDenom defines a method for transferring a denom.
transferDenom: {
    path: '/cudosnode.cudosnode.nft.Msg/TransferDenom',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_tx_pb.MsgTransferDenom,
    responseType: cudos_nft_tx_pb.MsgTransferDenomResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_MsgTransferDenom,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_MsgTransferDenom,
    responseSerialize: serialize_cudosnode_cudosnode_nft_MsgTransferDenomResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_MsgTransferDenomResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
