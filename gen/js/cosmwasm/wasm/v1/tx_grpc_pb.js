// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmwasm_wasm_v1_tx_pb = require('../../../cosmwasm/wasm/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmwasm_wasm_v1_types_pb = require('../../../cosmwasm/wasm/v1/types_pb.js');

function serialize_cosmwasm_wasm_v1_MsgClearAdmin(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgClearAdmin)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgClearAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgClearAdmin(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgClearAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgClearAdminResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgClearAdminResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgClearAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgClearAdminResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgClearAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgExecuteContract(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgExecuteContract)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgExecuteContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgExecuteContract(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgExecuteContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgExecuteContractResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgExecuteContractResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgExecuteContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgExecuteContractResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgExecuteContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgInstantiateContract(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgInstantiateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgInstantiateContract(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgInstantiateContract2(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgInstantiateContract2');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgInstantiateContract2(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgInstantiateContract2Response(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2Response)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgInstantiateContract2Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgInstantiateContract2Response(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgInstantiateContractResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgInstantiateContractResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgInstantiateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgInstantiateContractResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgInstantiateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgMigrateContract(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgMigrateContract)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgMigrateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgMigrateContract(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgMigrateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgMigrateContractResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgMigrateContractResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgMigrateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgMigrateContractResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgMigrateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgStoreCode(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgStoreCode)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgStoreCode');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgStoreCode(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgStoreCode.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgStoreCodeResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgStoreCodeResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgStoreCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgStoreCodeResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgStoreCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgUpdateAdmin(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgUpdateAdmin)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgUpdateAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgUpdateAdmin(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgUpdateAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_MsgUpdateAdminResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_tx_pb.MsgUpdateAdminResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.MsgUpdateAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_MsgUpdateAdminResponse(buffer_arg) {
  return cosmwasm_wasm_v1_tx_pb.MsgUpdateAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the wasm Msg service.
var MsgService = exports.MsgService = {
  // StoreCode to submit Wasm code to the system
storeCode: {
    path: '/cosmwasm.wasm.v1.Msg/StoreCode',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgStoreCode,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgStoreCodeResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgStoreCode,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgStoreCode,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgStoreCodeResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgStoreCodeResponse,
  },
  //  InstantiateContract creates a new smart contract instance for the given
//  code id.
instantiateContract: {
    path: '/cosmwasm.wasm.v1.Msg/InstantiateContract',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgInstantiateContractResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgInstantiateContract,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgInstantiateContract,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgInstantiateContractResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgInstantiateContractResponse,
  },
  //  InstantiateContract2 creates a new smart contract instance for the given
//  code id with a predictable address
instantiateContract2: {
    path: '/cosmwasm.wasm.v1.Msg/InstantiateContract2',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgInstantiateContract2Response,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgInstantiateContract2,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgInstantiateContract2,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgInstantiateContract2Response,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgInstantiateContract2Response,
  },
  // Execute submits the given message data to a smart contract
executeContract: {
    path: '/cosmwasm.wasm.v1.Msg/ExecuteContract',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgExecuteContract,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgExecuteContractResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgExecuteContract,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgExecuteContract,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgExecuteContractResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgExecuteContractResponse,
  },
  // Migrate runs a code upgrade/ downgrade for a smart contract
migrateContract: {
    path: '/cosmwasm.wasm.v1.Msg/MigrateContract',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgMigrateContract,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgMigrateContractResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgMigrateContract,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgMigrateContract,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgMigrateContractResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgMigrateContractResponse,
  },
  // UpdateAdmin sets a new   admin for a smart contract
updateAdmin: {
    path: '/cosmwasm.wasm.v1.Msg/UpdateAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgUpdateAdmin,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgUpdateAdminResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgUpdateAdmin,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgUpdateAdmin,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgUpdateAdminResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgUpdateAdminResponse,
  },
  // ClearAdmin removes any admin stored for a smart contract
clearAdmin: {
    path: '/cosmwasm.wasm.v1.Msg/ClearAdmin',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_tx_pb.MsgClearAdmin,
    responseType: cosmwasm_wasm_v1_tx_pb.MsgClearAdminResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_MsgClearAdmin,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_MsgClearAdmin,
    responseSerialize: serialize_cosmwasm_wasm_v1_MsgClearAdminResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_MsgClearAdminResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
