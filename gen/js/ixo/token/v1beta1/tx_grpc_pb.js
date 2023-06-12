// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_token_v1beta1_tx_pb = require('../../../ixo/token/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var ixo_iid_v1beta1_iid_pb = require('../../../ixo/iid/v1beta1/iid_pb.js');
var ixo_token_v1beta1_token_pb = require('../../../ixo/token/v1beta1/token_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_ixo_token_v1beta1_MsgCancelToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgCancelToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgCancelToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgCancelToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgCancelToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgCancelTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgCancelTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgCancelTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgCancelTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgCancelTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgCreateToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgCreateToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgCreateToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgCreateToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgCreateToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgCreateTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgCreateTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgCreateTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgCreateTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgCreateTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgMintToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgMintToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgMintToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgMintToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgMintToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgMintTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgMintTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgMintTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgMintTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgMintTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgPauseToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgPauseToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgPauseToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgPauseToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgPauseToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgPauseTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgPauseTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgPauseTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgPauseTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgPauseTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgRetireToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgRetireToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgRetireToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgRetireToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgRetireToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgRetireTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgRetireTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgRetireTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgRetireTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgRetireTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgStopToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgStopToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgStopToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgStopToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgStopToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgStopTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgStopTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgStopTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgStopTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgStopTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgTransferToken(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgTransferToken)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgTransferToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgTransferToken(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgTransferToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_token_v1beta1_MsgTransferTokenResponse(arg) {
  if (!(arg instanceof ixo_token_v1beta1_tx_pb.MsgTransferTokenResponse)) {
    throw new Error('Expected argument of type ixo.token.v1beta1.MsgTransferTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_token_v1beta1_MsgTransferTokenResponse(buffer_arg) {
  return ixo_token_v1beta1_tx_pb.MsgTransferTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the project Msg service.
var MsgService = exports.MsgService = {
  createToken: {
    path: '/ixo.token.v1beta1.Msg/CreateToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgCreateToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgCreateTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgCreateToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgCreateToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgCreateTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgCreateTokenResponse,
  },
  mintToken: {
    path: '/ixo.token.v1beta1.Msg/MintToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgMintToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgMintTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgMintToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgMintToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgMintTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgMintTokenResponse,
  },
  transferToken: {
    path: '/ixo.token.v1beta1.Msg/TransferToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgTransferToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgTransferTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgTransferToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgTransferToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgTransferTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgTransferTokenResponse,
  },
  retireToken: {
    path: '/ixo.token.v1beta1.Msg/RetireToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgRetireToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgRetireTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgRetireToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgRetireToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgRetireTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgRetireTokenResponse,
  },
  cancelToken: {
    path: '/ixo.token.v1beta1.Msg/CancelToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgCancelToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgCancelTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgCancelToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgCancelToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgCancelTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgCancelTokenResponse,
  },
  pauseToken: {
    path: '/ixo.token.v1beta1.Msg/PauseToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgPauseToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgPauseTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgPauseToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgPauseToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgPauseTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgPauseTokenResponse,
  },
  stopToken: {
    path: '/ixo.token.v1beta1.Msg/StopToken',
    requestStream: false,
    responseStream: false,
    requestType: ixo_token_v1beta1_tx_pb.MsgStopToken,
    responseType: ixo_token_v1beta1_tx_pb.MsgStopTokenResponse,
    requestSerialize: serialize_ixo_token_v1beta1_MsgStopToken,
    requestDeserialize: deserialize_ixo_token_v1beta1_MsgStopToken,
    responseSerialize: serialize_ixo_token_v1beta1_MsgStopTokenResponse,
    responseDeserialize: deserialize_ixo_token_v1beta1_MsgStopTokenResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
