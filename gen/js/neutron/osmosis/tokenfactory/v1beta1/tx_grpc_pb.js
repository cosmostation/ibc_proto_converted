// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_osmosis_tokenfactory_v1beta1_tx_pb = require('../../../../neutron/osmosis/tokenfactory/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurn(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurn(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurnResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurnResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdmin(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgChangeAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdmin(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgChangeAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenom(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgCreateDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenom(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgCreateDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgMint(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgMint(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_osmosis_tokenfactory_v1beta1_MsgMintResponse(arg) {
  if (!(arg instanceof neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type neutron.osmosis.tokenfactory.v1beta1.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgMintResponse(buffer_arg) {
  return neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createDenom: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Msg/CreateDenom',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenom,
    responseType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgCreateDenomResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenom,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenom,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgCreateDenomResponse,
  },
  mint: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMint,
    responseType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgMintResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgMint,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgMint,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgMintResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgMintResponse,
  },
  burn: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurn,
    responseType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurn,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurn,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurnResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgBurnResponse,
  },
  changeAdmin: {
    path: '/neutron.osmosis.tokenfactory.v1beta1.Msg/ChangeAdmin',
    requestStream: false,
    responseStream: false,
    requestType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdmin,
    responseType: neutron_osmosis_tokenfactory_v1beta1_tx_pb.MsgChangeAdminResponse,
    requestSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdmin,
    requestDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdmin,
    responseSerialize: serialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse,
    responseDeserialize: deserialize_neutron_osmosis_tokenfactory_v1beta1_MsgChangeAdminResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
