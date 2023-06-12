// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bcna_bcna_tx_pb = require('../../bcna/bcna/tx_pb.js');
var bcna_bcna_bitcannaid_pb = require('../../bcna/bcna/bitcannaid_pb.js');
var bcna_bcna_supplychain_pb = require('../../bcna/bcna/supplychain_pb.js');

function serialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaid(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgCreateBitcannaid)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgCreateBitcannaid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaid(buffer_arg) {
  return bcna_bcna_tx_pb.MsgCreateBitcannaid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgCreateBitcannaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgCreateBitcannaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaidResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgCreateBitcannaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychain(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgCreateSupplychain)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgCreateSupplychain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychain(buffer_arg) {
  return bcna_bcna_tx_pb.MsgCreateSupplychain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychainResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgCreateSupplychainResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgCreateSupplychainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychainResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgCreateSupplychainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaid(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgDeleteBitcannaid)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgDeleteBitcannaid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaid(buffer_arg) {
  return bcna_bcna_tx_pb.MsgDeleteBitcannaid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgDeleteBitcannaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgDeleteBitcannaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaidResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgDeleteBitcannaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychain(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgDeleteSupplychain)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgDeleteSupplychain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychain(buffer_arg) {
  return bcna_bcna_tx_pb.MsgDeleteSupplychain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychainResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgDeleteSupplychainResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgDeleteSupplychainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychainResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgDeleteSupplychainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaid(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgUpdateBitcannaid)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgUpdateBitcannaid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaid(buffer_arg) {
  return bcna_bcna_tx_pb.MsgUpdateBitcannaid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgUpdateBitcannaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgUpdateBitcannaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaidResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgUpdateBitcannaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychain(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgUpdateSupplychain)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgUpdateSupplychain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychain(buffer_arg) {
  return bcna_bcna_tx_pb.MsgUpdateSupplychain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychainResponse(arg) {
  if (!(arg instanceof bcna_bcna_tx_pb.MsgUpdateSupplychainResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.MsgUpdateSupplychainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychainResponse(buffer_arg) {
  return bcna_bcna_tx_pb.MsgUpdateSupplychainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createBitcannaid: {
    path: '/bitcannaglobal.bcna.bcna.Msg/CreateBitcannaid',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgCreateBitcannaid,
    responseType: bcna_bcna_tx_pb.MsgCreateBitcannaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaid,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaid,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgCreateBitcannaidResponse,
  },
  updateBitcannaid: {
    path: '/bitcannaglobal.bcna.bcna.Msg/UpdateBitcannaid',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgUpdateBitcannaid,
    responseType: bcna_bcna_tx_pb.MsgUpdateBitcannaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaid,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaid,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgUpdateBitcannaidResponse,
  },
  deleteBitcannaid: {
    path: '/bitcannaglobal.bcna.bcna.Msg/DeleteBitcannaid',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgDeleteBitcannaid,
    responseType: bcna_bcna_tx_pb.MsgDeleteBitcannaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaid,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaid,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgDeleteBitcannaidResponse,
  },
  createSupplychain: {
    path: '/bitcannaglobal.bcna.bcna.Msg/CreateSupplychain',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgCreateSupplychain,
    responseType: bcna_bcna_tx_pb.MsgCreateSupplychainResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychain,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychain,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychainResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgCreateSupplychainResponse,
  },
  updateSupplychain: {
    path: '/bitcannaglobal.bcna.bcna.Msg/UpdateSupplychain',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgUpdateSupplychain,
    responseType: bcna_bcna_tx_pb.MsgUpdateSupplychainResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychain,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychain,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychainResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgUpdateSupplychainResponse,
  },
  deleteSupplychain: {
    path: '/bitcannaglobal.bcna.bcna.Msg/DeleteSupplychain',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_tx_pb.MsgDeleteSupplychain,
    responseType: bcna_bcna_tx_pb.MsgDeleteSupplychainResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychain,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychain,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychainResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_MsgDeleteSupplychainResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
