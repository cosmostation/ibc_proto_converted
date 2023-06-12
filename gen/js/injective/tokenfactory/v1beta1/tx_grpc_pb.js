// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_tokenfactory_v1beta1_tx_pb = require('../../../injective/tokenfactory/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var injective_tokenfactory_v1beta1_params_pb = require('../../../injective/tokenfactory/v1beta1/params_pb.js');

function serialize_injective_tokenfactory_v1beta1_MsgBurn(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgBurn(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgBurnResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgBurnResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgChangeAdmin(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgChangeAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgChangeAdmin(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgChangeAdminResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgChangeAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgChangeAdminResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgCreateDenom(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenom)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgCreateDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgCreateDenom(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgCreateDenomResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgCreateDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgCreateDenomResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgMint(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgMint(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgMintResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgMintResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadata(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgSetDenomMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadata(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadataResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgSetDenomMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadataResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_tokenfactory_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.tokenfactory.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_tokenfactory_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the tokefactory module's gRPC message service.
var MsgService = exports.MsgService = {
  createDenom: {
    path: '/injective.tokenfactory.v1beta1.Msg/CreateDenom',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenom,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgCreateDenom,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgCreateDenom,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgCreateDenomResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgCreateDenomResponse,
  },
  mint: {
    path: '/injective.tokenfactory.v1beta1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgMint,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgMintResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgMint,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgMint,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgMintResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgMintResponse,
  },
  burn: {
    path: '/injective.tokenfactory.v1beta1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgBurn,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgBurn,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgBurn,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgBurnResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgBurnResponse,
  },
  changeAdmin: {
    path: '/injective.tokenfactory.v1beta1.Msg/ChangeAdmin',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgChangeAdmin,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgChangeAdmin,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgChangeAdminResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgChangeAdminResponse,
  },
  setDenomMetadata: {
    path: '/injective.tokenfactory.v1beta1.Msg/SetDenomMetadata',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadata,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgSetDenomMetadataResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadata,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadata,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadataResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgSetDenomMetadataResponse,
  },
  updateParams: {
    path: '/injective.tokenfactory.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_tokenfactory_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_tokenfactory_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_tokenfactory_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_tokenfactory_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
