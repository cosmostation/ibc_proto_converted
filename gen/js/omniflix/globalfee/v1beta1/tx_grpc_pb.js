// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_globalfee_v1beta1_tx_pb = require('../../../OmniFlix/globalfee/v1beta1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var OmniFlix_globalfee_v1beta1_genesis_pb = require('../../../OmniFlix/globalfee/v1beta1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_OmniFlix_globalfee_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type OmniFlix.globalfee.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_globalfee_v1beta1_MsgUpdateParams(buffer_arg) {
  return OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_globalfee_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.globalfee.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_globalfee_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/globalfee Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defines a governance operation for updating the x/globalfee module
// parameters. The authority is hard-coded to the x/gov module account.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/OmniFlix.globalfee.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParams,
    responseType: OmniFlix_globalfee_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_OmniFlix_globalfee_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_OmniFlix_globalfee_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_OmniFlix_globalfee_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_OmniFlix_globalfee_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
