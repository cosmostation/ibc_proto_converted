// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_incentives_tx_pb = require('../../osmosis/incentives/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../amino/amino_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var osmosis_incentives_gauge_pb = require('../../osmosis/incentives/gauge_pb.js');
var osmosis_lockup_lock_pb = require('../../osmosis/lockup/lock_pb.js');

function serialize_osmosis_incentives_MsgAddToGauge(arg) {
  if (!(arg instanceof osmosis_incentives_tx_pb.MsgAddToGauge)) {
    throw new Error('Expected argument of type osmosis.incentives.MsgAddToGauge');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_MsgAddToGauge(buffer_arg) {
  return osmosis_incentives_tx_pb.MsgAddToGauge.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_MsgAddToGaugeResponse(arg) {
  if (!(arg instanceof osmosis_incentives_tx_pb.MsgAddToGaugeResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.MsgAddToGaugeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_MsgAddToGaugeResponse(buffer_arg) {
  return osmosis_incentives_tx_pb.MsgAddToGaugeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_MsgCreateGauge(arg) {
  if (!(arg instanceof osmosis_incentives_tx_pb.MsgCreateGauge)) {
    throw new Error('Expected argument of type osmosis.incentives.MsgCreateGauge');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_MsgCreateGauge(buffer_arg) {
  return osmosis_incentives_tx_pb.MsgCreateGauge.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_MsgCreateGaugeResponse(arg) {
  if (!(arg instanceof osmosis_incentives_tx_pb.MsgCreateGaugeResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.MsgCreateGaugeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_MsgCreateGaugeResponse(buffer_arg) {
  return osmosis_incentives_tx_pb.MsgCreateGaugeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createGauge: {
    path: '/osmosis.incentives.Msg/CreateGauge',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_tx_pb.MsgCreateGauge,
    responseType: osmosis_incentives_tx_pb.MsgCreateGaugeResponse,
    requestSerialize: serialize_osmosis_incentives_MsgCreateGauge,
    requestDeserialize: deserialize_osmosis_incentives_MsgCreateGauge,
    responseSerialize: serialize_osmosis_incentives_MsgCreateGaugeResponse,
    responseDeserialize: deserialize_osmosis_incentives_MsgCreateGaugeResponse,
  },
  addToGauge: {
    path: '/osmosis.incentives.Msg/AddToGauge',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_tx_pb.MsgAddToGauge,
    responseType: osmosis_incentives_tx_pb.MsgAddToGaugeResponse,
    requestSerialize: serialize_osmosis_incentives_MsgAddToGauge,
    requestDeserialize: deserialize_osmosis_incentives_MsgAddToGauge,
    responseSerialize: serialize_osmosis_incentives_MsgAddToGaugeResponse,
    responseDeserialize: deserialize_osmosis_incentives_MsgAddToGaugeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
