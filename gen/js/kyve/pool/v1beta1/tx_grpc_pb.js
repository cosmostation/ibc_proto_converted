// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_pool_v1beta1_tx_pb = require('../../../kyve/pool/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgrade(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgrade)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgCancelRuntimeUpgrade');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgrade(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgrade.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgradeResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgradeResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgCancelRuntimeUpgradeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgradeResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgradeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgCreatePool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgCreatePool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgCreatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgCreatePool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgCreatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgCreatePoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgCreatePoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgCreatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgCreatePoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgCreatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgDefundPool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgDefundPool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgDefundPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgDefundPool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgDefundPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgDefundPoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgDefundPoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgDefundPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgDefundPoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgDefundPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgDisablePool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgDisablePool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgDisablePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgDisablePool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgDisablePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgDisablePoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgDisablePoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgDisablePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgDisablePoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgDisablePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgEnablePool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgEnablePool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgEnablePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgEnablePool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgEnablePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgEnablePoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgEnablePoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgEnablePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgEnablePoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgEnablePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgFundPool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgFundPool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgFundPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgFundPool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgFundPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgFundPoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgFundPoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgFundPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgFundPoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgFundPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgrade(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgrade)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgrade(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgrade.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgradeResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgradeResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgScheduleRuntimeUpgradeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgradeResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgradeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgUpdatePool(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgUpdatePool)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgUpdatePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgUpdatePool(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgUpdatePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_pool_v1beta1_MsgUpdatePoolResponse(arg) {
  if (!(arg instanceof kyve_pool_v1beta1_tx_pb.MsgUpdatePoolResponse)) {
    throw new Error('Expected argument of type kyve.pool.v1beta1.MsgUpdatePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_pool_v1beta1_MsgUpdatePoolResponse(buffer_arg) {
  return kyve_pool_v1beta1_tx_pb.MsgUpdatePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // FundPool ...
fundPool: {
    path: '/kyve.pool.v1beta1.Msg/FundPool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgFundPool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgFundPoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgFundPool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgFundPool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgFundPoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgFundPoolResponse,
  },
  // DefundPool ...
defundPool: {
    path: '/kyve.pool.v1beta1.Msg/DefundPool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgDefundPool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgDefundPoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgDefundPool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgDefundPool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgDefundPoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgDefundPoolResponse,
  },
  // CreatePool defines a governance operation for creating a new pool.
// The authority is hard-coded to the x/gov module account.
createPool: {
    path: '/kyve.pool.v1beta1.Msg/CreatePool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgCreatePool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgCreatePoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgCreatePool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgCreatePool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgCreatePoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgCreatePoolResponse,
  },
  // UpdatePool defines a governance operation for updating an existing pool.
// The authority is hard-coded to the x/gov module account.
updatePool: {
    path: '/kyve.pool.v1beta1.Msg/UpdatePool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgUpdatePool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgUpdatePoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgUpdatePool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgUpdatePool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgUpdatePoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgUpdatePoolResponse,
  },
  // DisablePool defines a governance operation for disabling an existing pool.
// The authority is hard-coded to the x/gov module account.
disablePool: {
    path: '/kyve.pool.v1beta1.Msg/DisablePool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgDisablePool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgDisablePoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgDisablePool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgDisablePool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgDisablePoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgDisablePoolResponse,
  },
  // EnablePool defines a governance operation for enabling an existing pool.
// The authority is hard-coded to the x/gov module account.
enablePool: {
    path: '/kyve.pool.v1beta1.Msg/EnablePool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgEnablePool,
    responseType: kyve_pool_v1beta1_tx_pb.MsgEnablePoolResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgEnablePool,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgEnablePool,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgEnablePoolResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgEnablePoolResponse,
  },
  // ScheduleRuntimeUpgrade defines a governance operation for scheduling a runtime upgrade.
// The authority is hard-coded to the x/gov module account.
scheduleRuntimeUpgrade: {
    path: '/kyve.pool.v1beta1.Msg/ScheduleRuntimeUpgrade',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgrade,
    responseType: kyve_pool_v1beta1_tx_pb.MsgScheduleRuntimeUpgradeResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgrade,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgrade,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgradeResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgScheduleRuntimeUpgradeResponse,
  },
  // CancelRuntimeUpgrade defines a governance operation for cancelling a runtime upgrade.
// The authority is hard-coded to the x/gov module account.
cancelRuntimeUpgrade: {
    path: '/kyve.pool.v1beta1.Msg/CancelRuntimeUpgrade',
    requestStream: false,
    responseStream: false,
    requestType: kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgrade,
    responseType: kyve_pool_v1beta1_tx_pb.MsgCancelRuntimeUpgradeResponse,
    requestSerialize: serialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgrade,
    requestDeserialize: deserialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgrade,
    responseSerialize: serialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgradeResponse,
    responseDeserialize: deserialize_kyve_pool_v1beta1_MsgCancelRuntimeUpgradeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
