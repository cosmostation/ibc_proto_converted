// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_revenue_v1_tx_pb = require('../../../evmos/revenue/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var evmos_revenue_v1_genesis_pb = require('../../../evmos/revenue/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_revenue_v1_MsgCancelRevenue(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgCancelRevenue)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgCancelRevenue');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgCancelRevenue(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgCancelRevenue.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgCancelRevenueResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgCancelRevenueResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgCancelRevenueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgCancelRevenueResponse(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgCancelRevenueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgRegisterRevenue(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgRegisterRevenue)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgRegisterRevenue');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgRegisterRevenue(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgRegisterRevenue.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgRegisterRevenueResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgRegisterRevenueResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgRegisterRevenueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgRegisterRevenueResponse(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgRegisterRevenueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgUpdateParams(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgUpdateParamsResponse(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgUpdateRevenue(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgUpdateRevenue)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgUpdateRevenue');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgUpdateRevenue(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgUpdateRevenue.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_revenue_v1_MsgUpdateRevenueResponse(arg) {
  if (!(arg instanceof evmos_revenue_v1_tx_pb.MsgUpdateRevenueResponse)) {
    throw new Error('Expected argument of type evmos.revenue.v1.MsgUpdateRevenueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_revenue_v1_MsgUpdateRevenueResponse(buffer_arg) {
  return evmos_revenue_v1_tx_pb.MsgUpdateRevenueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the fees Msg service.
var MsgService = exports.MsgService = {
  // RegisterRevenue registers a new contract for receiving transaction fees
registerRevenue: {
    path: '/evmos.revenue.v1.Msg/RegisterRevenue',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_tx_pb.MsgRegisterRevenue,
    responseType: evmos_revenue_v1_tx_pb.MsgRegisterRevenueResponse,
    requestSerialize: serialize_evmos_revenue_v1_MsgRegisterRevenue,
    requestDeserialize: deserialize_evmos_revenue_v1_MsgRegisterRevenue,
    responseSerialize: serialize_evmos_revenue_v1_MsgRegisterRevenueResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_MsgRegisterRevenueResponse,
  },
  // UpdateRevenue updates the withdrawer address of a revenue
updateRevenue: {
    path: '/evmos.revenue.v1.Msg/UpdateRevenue',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_tx_pb.MsgUpdateRevenue,
    responseType: evmos_revenue_v1_tx_pb.MsgUpdateRevenueResponse,
    requestSerialize: serialize_evmos_revenue_v1_MsgUpdateRevenue,
    requestDeserialize: deserialize_evmos_revenue_v1_MsgUpdateRevenue,
    responseSerialize: serialize_evmos_revenue_v1_MsgUpdateRevenueResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_MsgUpdateRevenueResponse,
  },
  // CancelRevenue cancels a contract's fee registration and further receival
// of transaction fees
cancelRevenue: {
    path: '/evmos.revenue.v1.Msg/CancelRevenue',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_tx_pb.MsgCancelRevenue,
    responseType: evmos_revenue_v1_tx_pb.MsgCancelRevenueResponse,
    requestSerialize: serialize_evmos_revenue_v1_MsgCancelRevenue,
    requestDeserialize: deserialize_evmos_revenue_v1_MsgCancelRevenue,
    responseSerialize: serialize_evmos_revenue_v1_MsgCancelRevenueResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_MsgCancelRevenueResponse,
  },
  // UpdateParams defined a governance operation for updating the x/revenue module parameters.
// The authority is hard-coded to the Cosmos SDK x/gov module account
updateParams: {
    path: '/evmos.revenue.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: evmos_revenue_v1_tx_pb.MsgUpdateParams,
    responseType: evmos_revenue_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_evmos_revenue_v1_MsgUpdateParams,
    requestDeserialize: deserialize_evmos_revenue_v1_MsgUpdateParams,
    responseSerialize: serialize_evmos_revenue_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_evmos_revenue_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
