// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bitsong_fantoken_v1beta1_tx_pb = require('../../../bitsong/fantoken/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_bitsong_fantoken_MsgBurn(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgBurn(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgBurnResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgBurnResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgDisableMint(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgDisableMint)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgDisableMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgDisableMint(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgDisableMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgDisableMintResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgDisableMintResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgDisableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgDisableMintResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgDisableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgIssue(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgIssue)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgIssue');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgIssue(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgIssue.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgIssueResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgIssueResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgIssueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgIssueResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgIssueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgMint(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgMint(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgMintResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgMintResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetAuthority(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthority)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetAuthority');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetAuthority(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthority.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetAuthorityResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthorityResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetAuthorityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetAuthorityResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthorityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetMinter(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetMinter)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetMinter(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetMinterResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetMinterResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetMinterResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetUri(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetUri)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetUri');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetUri(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetUri.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_fantoken_MsgSetUriResponse(arg) {
  if (!(arg instanceof bitsong_fantoken_v1beta1_tx_pb.MsgSetUriResponse)) {
    throw new Error('Expected argument of type bitsong.fantoken.MsgSetUriResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_fantoken_MsgSetUriResponse(buffer_arg) {
  return bitsong_fantoken_v1beta1_tx_pb.MsgSetUriResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // Issue defines a method for issuing a new fan token
issue: {
    path: '/bitsong.fantoken.Msg/Issue',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgIssue,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgIssueResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgIssue,
    requestDeserialize: deserialize_bitsong_fantoken_MsgIssue,
    responseSerialize: serialize_bitsong_fantoken_MsgIssueResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgIssueResponse,
  },
  // Mint defines a method for minting some fan tokens
mint: {
    path: '/bitsong.fantoken.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgMint,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgMintResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgMint,
    requestDeserialize: deserialize_bitsong_fantoken_MsgMint,
    responseSerialize: serialize_bitsong_fantoken_MsgMintResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgMintResponse,
  },
  // Burn defines a method for burning some fan tokens
burn: {
    path: '/bitsong.fantoken.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgBurn,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgBurn,
    requestDeserialize: deserialize_bitsong_fantoken_MsgBurn,
    responseSerialize: serialize_bitsong_fantoken_MsgBurnResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgBurnResponse,
  },
  // DisableMint defines a method for disable the mint function
disableMint: {
    path: '/bitsong.fantoken.Msg/DisableMint',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgDisableMint,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgDisableMintResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgDisableMint,
    requestDeserialize: deserialize_bitsong_fantoken_MsgDisableMint,
    responseSerialize: serialize_bitsong_fantoken_MsgDisableMintResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgDisableMintResponse,
  },
  setMinter: {
    path: '/bitsong.fantoken.Msg/SetMinter',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgSetMinter,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgSetMinterResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgSetMinter,
    requestDeserialize: deserialize_bitsong_fantoken_MsgSetMinter,
    responseSerialize: serialize_bitsong_fantoken_MsgSetMinterResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgSetMinterResponse,
  },
  setAuthority: {
    path: '/bitsong.fantoken.Msg/SetAuthority',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthority,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgSetAuthorityResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgSetAuthority,
    requestDeserialize: deserialize_bitsong_fantoken_MsgSetAuthority,
    responseSerialize: serialize_bitsong_fantoken_MsgSetAuthorityResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgSetAuthorityResponse,
  },
  setUri: {
    path: '/bitsong.fantoken.Msg/SetUri',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_fantoken_v1beta1_tx_pb.MsgSetUri,
    responseType: bitsong_fantoken_v1beta1_tx_pb.MsgSetUriResponse,
    requestSerialize: serialize_bitsong_fantoken_MsgSetUri,
    requestDeserialize: deserialize_bitsong_fantoken_MsgSetUri,
    responseSerialize: serialize_bitsong_fantoken_MsgSetUriResponse,
    responseDeserialize: deserialize_bitsong_fantoken_MsgSetUriResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
