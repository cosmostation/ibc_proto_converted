// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_ugov_v1_tx_pb = require('../../../umee/ugov/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_umee_ugov_v1_MsgGovUpdateMinGasPrice(arg) {
  if (!(arg instanceof umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPrice)) {
    throw new Error('Expected argument of type umee.ugov.v1.MsgGovUpdateMinGasPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_ugov_v1_MsgGovUpdateMinGasPrice(buffer_arg) {
  return umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_ugov_v1_MsgGovUpdateMinGasPriceResponse(arg) {
  if (!(arg instanceof umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPriceResponse)) {
    throw new Error('Expected argument of type umee.ugov.v1.MsgGovUpdateMinGasPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_ugov_v1_MsgGovUpdateMinGasPriceResponse(buffer_arg) {
  return umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/ugov module's Msg service.
var MsgService = exports.MsgService = {
  // GovUpdateMinGasPrice sets protocol controlled tx min fees.
govUpdateMinGasPrice: {
    path: '/umee.ugov.v1.Msg/GovUpdateMinGasPrice',
    requestStream: false,
    responseStream: false,
    requestType: umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPrice,
    responseType: umee_ugov_v1_tx_pb.MsgGovUpdateMinGasPriceResponse,
    requestSerialize: serialize_umee_ugov_v1_MsgGovUpdateMinGasPrice,
    requestDeserialize: deserialize_umee_ugov_v1_MsgGovUpdateMinGasPrice,
    responseSerialize: serialize_umee_ugov_v1_MsgGovUpdateMinGasPriceResponse,
    responseDeserialize: deserialize_umee_ugov_v1_MsgGovUpdateMinGasPriceResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
