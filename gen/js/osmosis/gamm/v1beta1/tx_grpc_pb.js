// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_gamm_v1beta1_tx_pb = require('../../../osmosis/gamm/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var osmosis_poolmanager_v1beta1_swap_route_pb = require('../../../osmosis/poolmanager/v1beta1/swap_route_pb.js');

function serialize_osmosis_gamm_v1beta1_MsgExitPool(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitPool)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitPool(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgExitPoolResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitPoolResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitPoolResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOut(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOut)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOut(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOutResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountIn(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountIn)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountIn(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountIn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinPool(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinPool)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinPool(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinPoolResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinPoolResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinPoolResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountIn(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountIn)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountIn(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountIn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountInResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountInResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOut(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOut)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOut(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOutResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountIn(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountIn)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgSwapExactAmountIn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountIn(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountIn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountInResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountInResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOut(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOut)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgSwapExactAmountOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOut(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOutResponse(buffer_arg) {
  return osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  joinPool: {
    path: '/osmosis.gamm.v1beta1.Msg/JoinPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgJoinPool,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgJoinPoolResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinPool,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinPool,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinPoolResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinPoolResponse,
  },
  exitPool: {
    path: '/osmosis.gamm.v1beta1.Msg/ExitPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgExitPool,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgExitPoolResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgExitPool,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitPool,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgExitPoolResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitPoolResponse,
  },
  swapExactAmountIn: {
    path: '/osmosis.gamm.v1beta1.Msg/SwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountIn,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountIn,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountIn,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountInResponse,
  },
  swapExactAmountOut: {
    path: '/osmosis.gamm.v1beta1.Msg/SwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOut,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgSwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOut,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOut,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgSwapExactAmountOutResponse,
  },
  joinSwapExternAmountIn: {
    path: '/osmosis.gamm.v1beta1.Msg/JoinSwapExternAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountIn,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapExternAmountInResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountIn,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountIn,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountInResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinSwapExternAmountInResponse,
  },
  joinSwapShareAmountOut: {
    path: '/osmosis.gamm.v1beta1.Msg/JoinSwapShareAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOut,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgJoinSwapShareAmountOutResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOut,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOut,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOutResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgJoinSwapShareAmountOutResponse,
  },
  exitSwapExternAmountOut: {
    path: '/osmosis.gamm.v1beta1.Msg/ExitSwapExternAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOut,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgExitSwapExternAmountOutResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOut,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOut,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOutResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitSwapExternAmountOutResponse,
  },
  exitSwapShareAmountIn: {
    path: '/osmosis.gamm.v1beta1.Msg/ExitSwapShareAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountIn,
    responseType: osmosis_gamm_v1beta1_tx_pb.MsgExitSwapShareAmountInResponse,
    requestSerialize: serialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountIn,
    requestDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountIn,
    responseSerialize: serialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse,
    responseDeserialize: deserialize_osmosis_gamm_v1beta1_MsgExitSwapShareAmountInResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
