// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_tokenfactory_v1beta1_tx_pb = require('../../../osmosis/tokenfactory/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');

function serialize_osmosis_tokenfactory_v1beta1_MsgBurn(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgBurn(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgBurnResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgBurnResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgChangeAdmin(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgChangeAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgChangeAdmin(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgChangeAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgCreateDenom(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgCreateDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgCreateDenom(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgCreateDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgForceTransfer(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransfer)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgForceTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgForceTransfer(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgForceTransferResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransferResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgForceTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgForceTransferResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgMint(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgMint(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgMintResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgMintResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHook(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHook)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgSetBeforeSendHook');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHook(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHook.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHookResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHookResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgSetBeforeSendHookResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHookResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHookResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadata(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgSetDenomMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadata(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadataResponse(arg) {
  if (!(arg instanceof osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse)) {
    throw new Error('Expected argument of type osmosis.tokenfactory.v1beta1.MsgSetDenomMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadataResponse(buffer_arg) {
  return osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the tokefactory module's gRPC message service.
var MsgService = exports.MsgService = {
  createDenom: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/CreateDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgCreateDenom,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgCreateDenom,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse,
  },
  mint: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgMint,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgMint,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgMint,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgMintResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgMintResponse,
  },
  burn: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgBurn,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgBurn,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgBurnResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgBurnResponse,
  },
  changeAdmin: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/ChangeAdmin',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgChangeAdmin,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgChangeAdmin,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse,
  },
  setDenomMetadata: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/SetDenomMetadata',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadata,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadata,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadataResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgSetDenomMetadataResponse,
  },
  setBeforeSendHook: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/SetBeforeSendHook',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHook,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgSetBeforeSendHookResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHook,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHook,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHookResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgSetBeforeSendHookResponse,
  },
  forceTransfer: {
    path: '/osmosis.tokenfactory.v1beta1.Msg/ForceTransfer',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransfer,
    responseType: osmosis_tokenfactory_v1beta1_tx_pb.MsgForceTransferResponse,
    requestSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgForceTransfer,
    requestDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgForceTransfer,
    responseSerialize: serialize_osmosis_tokenfactory_v1beta1_MsgForceTransferResponse,
    responseDeserialize: deserialize_osmosis_tokenfactory_v1beta1_MsgForceTransferResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
