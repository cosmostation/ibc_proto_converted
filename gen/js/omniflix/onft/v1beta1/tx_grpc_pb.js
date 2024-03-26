// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_onft_v1beta1_tx_pb = require('../../../OmniFlix/onft/v1beta1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var OmniFlix_onft_v1beta1_params_pb = require('../../../OmniFlix/onft/v1beta1/params_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var OmniFlix_onft_v1beta1_onft_pb = require('../../../OmniFlix/onft/v1beta1/onft_pb.js');

function serialize_OmniFlix_onft_v1beta1_MsgBurnONFT(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFT)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgBurnONFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgBurnONFT(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgBurnONFTResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgBurnONFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgBurnONFTResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgCreateDenom(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenom)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgCreateDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgCreateDenom(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgCreateDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgCreateDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgCreateDenomResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgMintONFT(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgMintONFT)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgMintONFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgMintONFT(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgMintONFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgMintONFTResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgMintONFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgMintONFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgMintONFTResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgMintONFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgPurgeDenom(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenom)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgPurgeDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgPurgeDenom(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgPurgeDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgPurgeDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgPurgeDenomResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgTransferDenom(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenom)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgTransferDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgTransferDenom(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgTransferDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgTransferDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgTransferDenomResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgTransferONFT(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFT)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgTransferONFT');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgTransferONFT(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFT.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgTransferONFTResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgTransferONFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgTransferONFTResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgUpdateDenom(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenom)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgUpdateDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgUpdateDenom(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgUpdateDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgUpdateDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgUpdateDenomResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgUpdateParams(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createDenom: {
    path: '/OmniFlix.onft.v1beta1.Msg/CreateDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenom,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgCreateDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgCreateDenom,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgCreateDenom,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgCreateDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgCreateDenomResponse,
  },
  updateDenom: {
    path: '/OmniFlix.onft.v1beta1.Msg/UpdateDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenom,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgUpdateDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgUpdateDenom,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgUpdateDenom,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgUpdateDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgUpdateDenomResponse,
  },
  transferDenom: {
    path: '/OmniFlix.onft.v1beta1.Msg/TransferDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenom,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgTransferDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgTransferDenom,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgTransferDenom,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgTransferDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgTransferDenomResponse,
  },
  purgeDenom: {
    path: '/OmniFlix.onft.v1beta1.Msg/PurgeDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenom,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgPurgeDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgPurgeDenom,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgPurgeDenom,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgPurgeDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgPurgeDenomResponse,
  },
  mintONFT: {
    path: '/OmniFlix.onft.v1beta1.Msg/MintONFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgMintONFT,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgMintONFTResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgMintONFT,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgMintONFT,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgMintONFTResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgMintONFTResponse,
  },
  transferONFT: {
    path: '/OmniFlix.onft.v1beta1.Msg/TransferONFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFT,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgTransferONFTResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgTransferONFT,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgTransferONFT,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgTransferONFTResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgTransferONFTResponse,
  },
  burnONFT: {
    path: '/OmniFlix.onft.v1beta1.Msg/BurnONFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFT,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgBurnONFTResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgBurnONFT,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgBurnONFT,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgBurnONFTResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgBurnONFTResponse,
  },
  // UpdateParams defines a governance operation for updating the onft module
// parameters. The authority is hard-coded to the onft module account.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/OmniFlix.onft.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParams,
    responseType: OmniFlix_onft_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
