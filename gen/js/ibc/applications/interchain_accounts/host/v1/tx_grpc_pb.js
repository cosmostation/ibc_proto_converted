// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_interchain_accounts_host_v1_tx_pb = require('../../../../../ibc/applications/interchain_accounts/host/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../../gogoproto/gogo_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../../../cosmos/msg/v1/msg_pb.js');
var ibc_applications_interchain_accounts_host_v1_host_pb = require('../../../../../ibc/applications/interchain_accounts/host/v1/host_pb.js');

function serialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.host.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParams(buffer_arg) {
  return ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.host.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParamsResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the 27-interchain-accounts/host Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defines a rpc handler for MsgUpdateParams.
updateParams: {
    path: '/ibc.applications.interchain_accounts.host.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParams,
    responseType: ibc_applications_interchain_accounts_host_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParams,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParams,
    responseSerialize: serialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_host_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
