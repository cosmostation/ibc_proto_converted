// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rdex_tx_pb = require('../../stafihub/rdex/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_rdex_MsgAddLiquidity(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddLiquidity)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddLiquidity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddLiquidity(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddLiquidity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgAddLiquidityResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddLiquidityResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddLiquidityResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgAddPoolCreator(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddPoolCreator)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddPoolCreator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddPoolCreator(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddPoolCreator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgAddPoolCreatorResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddPoolCreatorResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddPoolCreatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddPoolCreatorResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddPoolCreatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgAddProvider(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddProvider)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddProvider(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgAddProviderResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgAddProviderResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgAddProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgAddProviderResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgAddProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgCreatePool(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgCreatePool(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgCreatePoolResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRemoveLiquidity(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRemoveLiquidity)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRemoveLiquidity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRemoveLiquidity(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRemoveLiquidity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRemoveLiquidityResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRemoveLiquidityResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRemoveLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRemoveLiquidityResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRemoveLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRmPoolCreator(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRmPoolCreator)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRmPoolCreator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRmPoolCreator(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRmPoolCreator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRmPoolCreatorResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRmPoolCreatorResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRmPoolCreatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRmPoolCreatorResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRmPoolCreatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRmProvider(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRmProvider)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRmProvider');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRmProvider(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRmProvider.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgRmProviderResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgRmProviderResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgRmProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgRmProviderResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgRmProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgSwap(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgSwap)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgSwap');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgSwap(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgSwap.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgSwapResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgSwapResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgSwapResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgToggleProviderSwitch(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgToggleProviderSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgToggleProviderSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgToggleProviderSwitch(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgToggleProviderSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_MsgToggleProviderSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rdex_tx_pb.MsgToggleProviderSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.MsgToggleProviderSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_MsgToggleProviderSwitchResponse(buffer_arg) {
  return stafihub_rdex_tx_pb.MsgToggleProviderSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createPool: {
    path: '/stafihub.stafihub.rdex.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgCreatePool,
    responseType: stafihub_rdex_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgCreatePool,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgCreatePool,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgCreatePoolResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgCreatePoolResponse,
  },
  addLiquidity: {
    path: '/stafihub.stafihub.rdex.Msg/AddLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgAddLiquidity,
    responseType: stafihub_rdex_tx_pb.MsgAddLiquidityResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgAddLiquidity,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddLiquidity,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgAddLiquidityResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddLiquidityResponse,
  },
  swap: {
    path: '/stafihub.stafihub.rdex.Msg/Swap',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgSwap,
    responseType: stafihub_rdex_tx_pb.MsgSwapResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgSwap,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgSwap,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgSwapResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgSwapResponse,
  },
  removeLiquidity: {
    path: '/stafihub.stafihub.rdex.Msg/RemoveLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgRemoveLiquidity,
    responseType: stafihub_rdex_tx_pb.MsgRemoveLiquidityResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgRemoveLiquidity,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgRemoveLiquidity,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgRemoveLiquidityResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgRemoveLiquidityResponse,
  },
  toggleProviderSwitch: {
    path: '/stafihub.stafihub.rdex.Msg/ToggleProviderSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgToggleProviderSwitch,
    responseType: stafihub_rdex_tx_pb.MsgToggleProviderSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgToggleProviderSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgToggleProviderSwitch,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgToggleProviderSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgToggleProviderSwitchResponse,
  },
  addProvider: {
    path: '/stafihub.stafihub.rdex.Msg/AddProvider',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgAddProvider,
    responseType: stafihub_rdex_tx_pb.MsgAddProviderResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgAddProvider,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddProvider,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgAddProviderResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddProviderResponse,
  },
  rmProvider: {
    path: '/stafihub.stafihub.rdex.Msg/RmProvider',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgRmProvider,
    responseType: stafihub_rdex_tx_pb.MsgRmProviderResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgRmProvider,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgRmProvider,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgRmProviderResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgRmProviderResponse,
  },
  addPoolCreator: {
    path: '/stafihub.stafihub.rdex.Msg/AddPoolCreator',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgAddPoolCreator,
    responseType: stafihub_rdex_tx_pb.MsgAddPoolCreatorResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgAddPoolCreator,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddPoolCreator,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgAddPoolCreatorResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgAddPoolCreatorResponse,
  },
  rmPoolCreator: {
    path: '/stafihub.stafihub.rdex.Msg/RmPoolCreator',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_tx_pb.MsgRmPoolCreator,
    responseType: stafihub_rdex_tx_pb.MsgRmPoolCreatorResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_MsgRmPoolCreator,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_MsgRmPoolCreator,
    responseSerialize: serialize_stafihub_stafihub_rdex_MsgRmPoolCreatorResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_MsgRmPoolCreatorResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
