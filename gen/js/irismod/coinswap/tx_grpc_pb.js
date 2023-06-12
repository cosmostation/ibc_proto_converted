// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_coinswap_tx_pb = require('../../irismod/coinswap/tx_pb.js');
var irismod_coinswap_coinswap_pb = require('../../irismod/coinswap/coinswap_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_coinswap_MsgAddLiquidity(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgAddLiquidity)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgAddLiquidity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgAddLiquidity(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgAddLiquidity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_MsgAddLiquidityResponse(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgAddLiquidityResponse)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgAddLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgAddLiquidityResponse(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgAddLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_MsgRemoveLiquidity(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgRemoveLiquidity)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgRemoveLiquidity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgRemoveLiquidity(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgRemoveLiquidity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_MsgRemoveLiquidityResponse(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgRemoveLiquidityResponse)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgRemoveLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgRemoveLiquidityResponse(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgRemoveLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_MsgSwapCoinResponse(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgSwapCoinResponse)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgSwapCoinResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgSwapCoinResponse(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgSwapCoinResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_coinswap_MsgSwapOrder(arg) {
  if (!(arg instanceof irismod_coinswap_tx_pb.MsgSwapOrder)) {
    throw new Error('Expected argument of type irismod.coinswap.MsgSwapOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_coinswap_MsgSwapOrder(buffer_arg) {
  return irismod_coinswap_tx_pb.MsgSwapOrder.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the coinswap Msg service
var MsgService = exports.MsgService = {
  // AddLiquidity defines a method for depositing some tokens to the liquidity pool
addLiquidity: {
    path: '/irismod.coinswap.Msg/AddLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: irismod_coinswap_tx_pb.MsgAddLiquidity,
    responseType: irismod_coinswap_tx_pb.MsgAddLiquidityResponse,
    requestSerialize: serialize_irismod_coinswap_MsgAddLiquidity,
    requestDeserialize: deserialize_irismod_coinswap_MsgAddLiquidity,
    responseSerialize: serialize_irismod_coinswap_MsgAddLiquidityResponse,
    responseDeserialize: deserialize_irismod_coinswap_MsgAddLiquidityResponse,
  },
  // RemoveLiquidity defines a method for withdraw some tokens from the liquidity pool
removeLiquidity: {
    path: '/irismod.coinswap.Msg/RemoveLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: irismod_coinswap_tx_pb.MsgRemoveLiquidity,
    responseType: irismod_coinswap_tx_pb.MsgRemoveLiquidityResponse,
    requestSerialize: serialize_irismod_coinswap_MsgRemoveLiquidity,
    requestDeserialize: deserialize_irismod_coinswap_MsgRemoveLiquidity,
    responseSerialize: serialize_irismod_coinswap_MsgRemoveLiquidityResponse,
    responseDeserialize: deserialize_irismod_coinswap_MsgRemoveLiquidityResponse,
  },
  // SwapCoin defines a method for swapping a token with the other token from the liquidity pool
swapCoin: {
    path: '/irismod.coinswap.Msg/SwapCoin',
    requestStream: false,
    responseStream: false,
    requestType: irismod_coinswap_tx_pb.MsgSwapOrder,
    responseType: irismod_coinswap_tx_pb.MsgSwapCoinResponse,
    requestSerialize: serialize_irismod_coinswap_MsgSwapOrder,
    requestDeserialize: deserialize_irismod_coinswap_MsgSwapOrder,
    responseSerialize: serialize_irismod_coinswap_MsgSwapCoinResponse,
    responseDeserialize: deserialize_irismod_coinswap_MsgSwapCoinResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
