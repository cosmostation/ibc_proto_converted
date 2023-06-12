// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_erc20_v1_tx_pb = require('../../../evmos/erc20/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var evmos_erc20_v1_genesis_pb = require('../../../evmos/erc20/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_erc20_v1_MsgConvertCoin(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgConvertCoin)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgConvertCoin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgConvertCoin(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgConvertCoin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_erc20_v1_MsgConvertCoinResponse(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgConvertCoinResponse)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgConvertCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgConvertCoinResponse(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgConvertCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_erc20_v1_MsgConvertERC20(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgConvertERC20)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgConvertERC20');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgConvertERC20(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgConvertERC20.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_erc20_v1_MsgConvertERC20Response(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgConvertERC20Response)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgConvertERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgConvertERC20Response(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgConvertERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_erc20_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgUpdateParams(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_erc20_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof evmos_erc20_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type evmos.erc20.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_erc20_v1_MsgUpdateParamsResponse(buffer_arg) {
  return evmos_erc20_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the erc20 Msg service.
var MsgService = exports.MsgService = {
  // ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
// that is registered on the token mapping.
convertCoin: {
    path: '/evmos.erc20.v1.Msg/ConvertCoin',
    requestStream: false,
    responseStream: false,
    requestType: evmos_erc20_v1_tx_pb.MsgConvertCoin,
    responseType: evmos_erc20_v1_tx_pb.MsgConvertCoinResponse,
    requestSerialize: serialize_evmos_erc20_v1_MsgConvertCoin,
    requestDeserialize: deserialize_evmos_erc20_v1_MsgConvertCoin,
    responseSerialize: serialize_evmos_erc20_v1_MsgConvertCoinResponse,
    responseDeserialize: deserialize_evmos_erc20_v1_MsgConvertCoinResponse,
  },
  // ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
// contract that is registered on the token mapping.
convertERC20: {
    path: '/evmos.erc20.v1.Msg/ConvertERC20',
    requestStream: false,
    responseStream: false,
    requestType: evmos_erc20_v1_tx_pb.MsgConvertERC20,
    responseType: evmos_erc20_v1_tx_pb.MsgConvertERC20Response,
    requestSerialize: serialize_evmos_erc20_v1_MsgConvertERC20,
    requestDeserialize: deserialize_evmos_erc20_v1_MsgConvertERC20,
    responseSerialize: serialize_evmos_erc20_v1_MsgConvertERC20Response,
    responseDeserialize: deserialize_evmos_erc20_v1_MsgConvertERC20Response,
  },
  // UpdateParams defined a governance operation for updating the x/erc20 module parameters.
// The authority is hard-coded to the Cosmos SDK x/gov module account
updateParams: {
    path: '/evmos.erc20.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: evmos_erc20_v1_tx_pb.MsgUpdateParams,
    responseType: evmos_erc20_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_evmos_erc20_v1_MsgUpdateParams,
    requestDeserialize: deserialize_evmos_erc20_v1_MsgUpdateParams,
    responseSerialize: serialize_evmos_erc20_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_evmos_erc20_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
