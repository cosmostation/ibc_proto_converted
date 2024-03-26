// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_itc_v1_tx_pb = require('../../../OmniFlix/itc/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var OmniFlix_itc_v1_itc_pb = require('../../../OmniFlix/itc/v1/itc_pb.js');
var OmniFlix_itc_v1_params_pb = require('../../../OmniFlix/itc/v1/params_pb.js');

function serialize_OmniFlix_itc_v1_MsgCancelCampaign(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgCancelCampaign)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgCancelCampaign');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgCancelCampaign(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgCancelCampaign.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgCancelCampaignResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgCancelCampaignResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgCancelCampaignResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgCancelCampaignResponse(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgCancelCampaignResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgClaim(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgClaim(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgClaimResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgClaimResponse(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgCreateCampaign(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgCreateCampaign)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgCreateCampaign');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgCreateCampaign(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgCreateCampaign.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgCreateCampaignResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgCreateCampaignResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgCreateCampaignResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgCreateCampaignResponse(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgCreateCampaignResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgDepositCampaign(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgDepositCampaign)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgDepositCampaign');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgDepositCampaign(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgDepositCampaign.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgDepositCampaignResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgDepositCampaignResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgDepositCampaignResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgDepositCampaignResponse(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgDepositCampaignResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgUpdateParams(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_MsgUpdateParamsResponse(buffer_arg) {
  return OmniFlix_itc_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createCampaign: {
    path: '/OmniFlix.itc.v1.Msg/CreateCampaign',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_tx_pb.MsgCreateCampaign,
    responseType: OmniFlix_itc_v1_tx_pb.MsgCreateCampaignResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_MsgCreateCampaign,
    requestDeserialize: deserialize_OmniFlix_itc_v1_MsgCreateCampaign,
    responseSerialize: serialize_OmniFlix_itc_v1_MsgCreateCampaignResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_MsgCreateCampaignResponse,
  },
  cancelCampaign: {
    path: '/OmniFlix.itc.v1.Msg/CancelCampaign',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_tx_pb.MsgCancelCampaign,
    responseType: OmniFlix_itc_v1_tx_pb.MsgCancelCampaignResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_MsgCancelCampaign,
    requestDeserialize: deserialize_OmniFlix_itc_v1_MsgCancelCampaign,
    responseSerialize: serialize_OmniFlix_itc_v1_MsgCancelCampaignResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_MsgCancelCampaignResponse,
  },
  claim: {
    path: '/OmniFlix.itc.v1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_tx_pb.MsgClaim,
    responseType: OmniFlix_itc_v1_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_MsgClaim,
    requestDeserialize: deserialize_OmniFlix_itc_v1_MsgClaim,
    responseSerialize: serialize_OmniFlix_itc_v1_MsgClaimResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_MsgClaimResponse,
  },
  depositCampaign: {
    path: '/OmniFlix.itc.v1.Msg/DepositCampaign',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_tx_pb.MsgDepositCampaign,
    responseType: OmniFlix_itc_v1_tx_pb.MsgDepositCampaignResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_MsgDepositCampaign,
    requestDeserialize: deserialize_OmniFlix_itc_v1_MsgDepositCampaign,
    responseSerialize: serialize_OmniFlix_itc_v1_MsgDepositCampaignResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_MsgDepositCampaignResponse,
  },
  // UpdateParams defines a governance operation for updating the x/itc module
// parameters. The authority is hard-coded to the x/gov module account.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/OmniFlix.itc.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_tx_pb.MsgUpdateParams,
    responseType: OmniFlix_itc_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_MsgUpdateParams,
    requestDeserialize: deserialize_OmniFlix_itc_v1_MsgUpdateParams,
    responseSerialize: serialize_OmniFlix_itc_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
