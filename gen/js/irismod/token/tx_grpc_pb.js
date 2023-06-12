// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_token_tx_pb = require('../../irismod/token/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_token_MsgBurnToken(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgBurnToken)) {
    throw new Error('Expected argument of type irismod.token.MsgBurnToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgBurnToken(buffer_arg) {
  return irismod_token_tx_pb.MsgBurnToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgBurnTokenResponse(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgBurnTokenResponse)) {
    throw new Error('Expected argument of type irismod.token.MsgBurnTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgBurnTokenResponse(buffer_arg) {
  return irismod_token_tx_pb.MsgBurnTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgEditToken(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgEditToken)) {
    throw new Error('Expected argument of type irismod.token.MsgEditToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgEditToken(buffer_arg) {
  return irismod_token_tx_pb.MsgEditToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgEditTokenResponse(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgEditTokenResponse)) {
    throw new Error('Expected argument of type irismod.token.MsgEditTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgEditTokenResponse(buffer_arg) {
  return irismod_token_tx_pb.MsgEditTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgIssueToken(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgIssueToken)) {
    throw new Error('Expected argument of type irismod.token.MsgIssueToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgIssueToken(buffer_arg) {
  return irismod_token_tx_pb.MsgIssueToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgIssueTokenResponse(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgIssueTokenResponse)) {
    throw new Error('Expected argument of type irismod.token.MsgIssueTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgIssueTokenResponse(buffer_arg) {
  return irismod_token_tx_pb.MsgIssueTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgMintToken(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgMintToken)) {
    throw new Error('Expected argument of type irismod.token.MsgMintToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgMintToken(buffer_arg) {
  return irismod_token_tx_pb.MsgMintToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgMintTokenResponse(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgMintTokenResponse)) {
    throw new Error('Expected argument of type irismod.token.MsgMintTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgMintTokenResponse(buffer_arg) {
  return irismod_token_tx_pb.MsgMintTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgTransferTokenOwner(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgTransferTokenOwner)) {
    throw new Error('Expected argument of type irismod.token.MsgTransferTokenOwner');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgTransferTokenOwner(buffer_arg) {
  return irismod_token_tx_pb.MsgTransferTokenOwner.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_token_MsgTransferTokenOwnerResponse(arg) {
  if (!(arg instanceof irismod_token_tx_pb.MsgTransferTokenOwnerResponse)) {
    throw new Error('Expected argument of type irismod.token.MsgTransferTokenOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_token_MsgTransferTokenOwnerResponse(buffer_arg) {
  return irismod_token_tx_pb.MsgTransferTokenOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // IssueToken defines a method for issuing a new token
issueToken: {
    path: '/irismod.token.Msg/IssueToken',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_tx_pb.MsgIssueToken,
    responseType: irismod_token_tx_pb.MsgIssueTokenResponse,
    requestSerialize: serialize_irismod_token_MsgIssueToken,
    requestDeserialize: deserialize_irismod_token_MsgIssueToken,
    responseSerialize: serialize_irismod_token_MsgIssueTokenResponse,
    responseDeserialize: deserialize_irismod_token_MsgIssueTokenResponse,
  },
  // EditToken defines a method for editing a token
editToken: {
    path: '/irismod.token.Msg/EditToken',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_tx_pb.MsgEditToken,
    responseType: irismod_token_tx_pb.MsgEditTokenResponse,
    requestSerialize: serialize_irismod_token_MsgEditToken,
    requestDeserialize: deserialize_irismod_token_MsgEditToken,
    responseSerialize: serialize_irismod_token_MsgEditTokenResponse,
    responseDeserialize: deserialize_irismod_token_MsgEditTokenResponse,
  },
  // MintToken defines a method for minting some tokens
mintToken: {
    path: '/irismod.token.Msg/MintToken',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_tx_pb.MsgMintToken,
    responseType: irismod_token_tx_pb.MsgMintTokenResponse,
    requestSerialize: serialize_irismod_token_MsgMintToken,
    requestDeserialize: deserialize_irismod_token_MsgMintToken,
    responseSerialize: serialize_irismod_token_MsgMintTokenResponse,
    responseDeserialize: deserialize_irismod_token_MsgMintTokenResponse,
  },
  // BurnToken defines a method for burning some tokens
burnToken: {
    path: '/irismod.token.Msg/BurnToken',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_tx_pb.MsgBurnToken,
    responseType: irismod_token_tx_pb.MsgBurnTokenResponse,
    requestSerialize: serialize_irismod_token_MsgBurnToken,
    requestDeserialize: deserialize_irismod_token_MsgBurnToken,
    responseSerialize: serialize_irismod_token_MsgBurnTokenResponse,
    responseDeserialize: deserialize_irismod_token_MsgBurnTokenResponse,
  },
  // TransferTokenOwner defines a method for minting some tokens
transferTokenOwner: {
    path: '/irismod.token.Msg/TransferTokenOwner',
    requestStream: false,
    responseStream: false,
    requestType: irismod_token_tx_pb.MsgTransferTokenOwner,
    responseType: irismod_token_tx_pb.MsgTransferTokenOwnerResponse,
    requestSerialize: serialize_irismod_token_MsgTransferTokenOwner,
    requestDeserialize: deserialize_irismod_token_MsgTransferTokenOwner,
    responseSerialize: serialize_irismod_token_MsgTransferTokenOwnerResponse,
    responseDeserialize: deserialize_irismod_token_MsgTransferTokenOwnerResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
