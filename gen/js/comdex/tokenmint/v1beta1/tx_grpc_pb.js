// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_tokenmint_v1beta1_tx_pb = require('../../../comdex/tokenmint/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_comdex_tokenmint_v1beta1_MsgMintNewTokensRequest(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensRequest)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.MsgMintNewTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_MsgMintNewTokensRequest(buffer_arg) {
  return comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_tokenmint_v1beta1_MsgMintNewTokensResponse(arg) {
  if (!(arg instanceof comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensResponse)) {
    throw new Error('Expected argument of type comdex.tokenmint.v1beta1.MsgMintNewTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_tokenmint_v1beta1_MsgMintNewTokensResponse(buffer_arg) {
  return comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  msgMintNewTokens: {
    path: '/comdex.tokenmint.v1beta1.Msg/MsgMintNewTokens',
    requestStream: false,
    responseStream: false,
    requestType: comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensRequest,
    responseType: comdex_tokenmint_v1beta1_tx_pb.MsgMintNewTokensResponse,
    requestSerialize: serialize_comdex_tokenmint_v1beta1_MsgMintNewTokensRequest,
    requestDeserialize: deserialize_comdex_tokenmint_v1beta1_MsgMintNewTokensRequest,
    responseSerialize: serialize_comdex_tokenmint_v1beta1_MsgMintNewTokensResponse,
    responseDeserialize: deserialize_comdex_tokenmint_v1beta1_MsgMintNewTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
