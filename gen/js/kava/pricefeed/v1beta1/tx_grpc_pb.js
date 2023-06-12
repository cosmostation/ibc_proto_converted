// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_pricefeed_v1beta1_tx_pb = require('../../../kava/pricefeed/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_kava_pricefeed_v1beta1_MsgPostPrice(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_tx_pb.MsgPostPrice)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.MsgPostPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_MsgPostPrice(buffer_arg) {
  return kava_pricefeed_v1beta1_tx_pb.MsgPostPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_pricefeed_v1beta1_MsgPostPriceResponse(arg) {
  if (!(arg instanceof kava_pricefeed_v1beta1_tx_pb.MsgPostPriceResponse)) {
    throw new Error('Expected argument of type kava.pricefeed.v1beta1.MsgPostPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_pricefeed_v1beta1_MsgPostPriceResponse(buffer_arg) {
  return kava_pricefeed_v1beta1_tx_pb.MsgPostPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the pricefeed Msg service.
var MsgService = exports.MsgService = {
  // PostPrice defines a method for creating a new post price
postPrice: {
    path: '/kava.pricefeed.v1beta1.Msg/PostPrice',
    requestStream: false,
    responseStream: false,
    requestType: kava_pricefeed_v1beta1_tx_pb.MsgPostPrice,
    responseType: kava_pricefeed_v1beta1_tx_pb.MsgPostPriceResponse,
    requestSerialize: serialize_kava_pricefeed_v1beta1_MsgPostPrice,
    requestDeserialize: deserialize_kava_pricefeed_v1beta1_MsgPostPrice,
    responseSerialize: serialize_kava_pricefeed_v1beta1_MsgPostPriceResponse,
    responseDeserialize: deserialize_kava_pricefeed_v1beta1_MsgPostPriceResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
