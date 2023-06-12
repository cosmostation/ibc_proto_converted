// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_wasmx_v1_tx_pb = require('../../../injective/wasmx/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var injective_wasmx_v1_wasmx_pb = require('../../../injective/wasmx/v1/wasmx_pb.js');
var injective_wasmx_v1_proposal_pb = require('../../../injective/wasmx/v1/proposal_pb.js');

function serialize_injective_wasmx_v1_MsgActivateContract(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgActivateContract)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgActivateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgActivateContract(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgActivateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgActivateContractResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgActivateContractResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgActivateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgActivateContractResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgActivateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgDeactivateContract(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgDeactivateContract)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgDeactivateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgDeactivateContract(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgDeactivateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgDeactivateContractResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgDeactivateContractResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgDeactivateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgDeactivateContractResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgDeactivateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgExecuteContractCompat(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgExecuteContractCompat)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgExecuteContractCompat');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgExecuteContractCompat(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgExecuteContractCompat.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgExecuteContractCompatResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgExecuteContractCompatResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgExecuteContractCompatResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgExecuteContractCompatResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgExecuteContractCompatResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgRegisterContract(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgRegisterContract)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgRegisterContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgRegisterContract(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgRegisterContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgRegisterContractResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgRegisterContractResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgRegisterContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgRegisterContractResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgRegisterContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgUpdateContract(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgUpdateContract)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgUpdateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgUpdateContract(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgUpdateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgUpdateContractResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgUpdateContractResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgUpdateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgUpdateContractResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgUpdateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgUpdateParams(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_wasmx_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_wasmx_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.wasmx.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_wasmx_v1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_wasmx_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the wasmx Msg service.
var MsgService = exports.MsgService = {
  updateRegistryContractParams: {
    path: '/injective.wasmx.v1.Msg/UpdateRegistryContractParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgUpdateContract,
    responseType: injective_wasmx_v1_tx_pb.MsgUpdateContractResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgUpdateContract,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgUpdateContract,
    responseSerialize: serialize_injective_wasmx_v1_MsgUpdateContractResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgUpdateContractResponse,
  },
  activateRegistryContract: {
    path: '/injective.wasmx.v1.Msg/ActivateRegistryContract',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgActivateContract,
    responseType: injective_wasmx_v1_tx_pb.MsgActivateContractResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgActivateContract,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgActivateContract,
    responseSerialize: serialize_injective_wasmx_v1_MsgActivateContractResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgActivateContractResponse,
  },
  deactivateRegistryContract: {
    path: '/injective.wasmx.v1.Msg/DeactivateRegistryContract',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgDeactivateContract,
    responseType: injective_wasmx_v1_tx_pb.MsgDeactivateContractResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgDeactivateContract,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgDeactivateContract,
    responseSerialize: serialize_injective_wasmx_v1_MsgDeactivateContractResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgDeactivateContractResponse,
  },
  executeContractCompat: {
    path: '/injective.wasmx.v1.Msg/ExecuteContractCompat',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgExecuteContractCompat,
    responseType: injective_wasmx_v1_tx_pb.MsgExecuteContractCompatResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgExecuteContractCompat,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgExecuteContractCompat,
    responseSerialize: serialize_injective_wasmx_v1_MsgExecuteContractCompatResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgExecuteContractCompatResponse,
  },
  updateParams: {
    path: '/injective.wasmx.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgUpdateParams,
    responseType: injective_wasmx_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgUpdateParams,
    responseSerialize: serialize_injective_wasmx_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgUpdateParamsResponse,
  },
  registerContract: {
    path: '/injective.wasmx.v1.Msg/RegisterContract',
    requestStream: false,
    responseStream: false,
    requestType: injective_wasmx_v1_tx_pb.MsgRegisterContract,
    responseType: injective_wasmx_v1_tx_pb.MsgRegisterContractResponse,
    requestSerialize: serialize_injective_wasmx_v1_MsgRegisterContract,
    requestDeserialize: deserialize_injective_wasmx_v1_MsgRegisterContract,
    responseSerialize: serialize_injective_wasmx_v1_MsgRegisterContractResponse,
    responseDeserialize: deserialize_injective_wasmx_v1_MsgRegisterContractResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
