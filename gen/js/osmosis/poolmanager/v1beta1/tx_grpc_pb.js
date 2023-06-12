// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_poolmanager_v1beta1_tx_pb = require('../../../osmosis/poolmanager/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var osmosis_poolmanager_v1beta1_swap_route_pb = require('../../../osmosis/poolmanager/v1beta1/swap_route_pb.js');

function serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountIn(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountIn)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountIn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountIn(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountIn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountInResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountInResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOut(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOut)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOut(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOutResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountIn(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountIn)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSwapExactAmountIn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountIn(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountIn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountInResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSwapExactAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountInResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOut(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOut)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSwapExactAmountOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOut(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.MsgSwapExactAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOutResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  swapExactAmountIn: {
    path: '/osmosis.poolmanager.v1beta1.Msg/SwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountIn,
    responseType: osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountIn,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountIn,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountInResponse,
  },
  swapExactAmountOut: {
    path: '/osmosis.poolmanager.v1beta1.Msg/SwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOut,
    responseType: osmosis_poolmanager_v1beta1_tx_pb.MsgSwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOut,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOut,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSwapExactAmountOutResponse,
  },
  splitRouteSwapExactAmountIn: {
    path: '/osmosis.poolmanager.v1beta1.Msg/SplitRouteSwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountIn,
    responseType: osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountIn,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountIn,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountInResponse,
  },
  splitRouteSwapExactAmountOut: {
    path: '/osmosis.poolmanager.v1beta1.Msg/SplitRouteSwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOut,
    responseType: osmosis_poolmanager_v1beta1_tx_pb.MsgSplitRouteSwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOut,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOut,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_MsgSplitRouteSwapExactAmountOutResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
