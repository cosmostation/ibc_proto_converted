// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_insurance_v1beta1_tx_pb = require('../../../injective/insurance/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var injective_insurance_v1beta1_insurance_pb = require('../../../injective/insurance/v1beta1/insurance_pb.js');
var injective_oracle_v1beta1_oracle_pb = require('../../../injective/oracle/v1beta1/oracle_pb.js');

function serialize_injective_insurance_v1beta1_MsgCreateInsuranceFund(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFund)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgCreateInsuranceFund');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgCreateInsuranceFund(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFund.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgCreateInsuranceFundResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFundResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgCreateInsuranceFundResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgCreateInsuranceFundResponse(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFundResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgRequestRedemption(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgRequestRedemption)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgRequestRedemption');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgRequestRedemption(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgRequestRedemption.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgRequestRedemptionResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgRequestRedemptionResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgRequestRedemptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgRequestRedemptionResponse(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgRequestRedemptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgUnderwrite(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgUnderwrite)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgUnderwrite');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgUnderwrite(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgUnderwrite.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgUnderwriteResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgUnderwriteResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgUnderwriteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgUnderwriteResponse(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgUnderwriteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_insurance_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the insurance Msg service.
var MsgService = exports.MsgService = {
  // CreateInsuranceFund defines a method for creating an insurance fund
createInsuranceFund: {
    path: '/injective.insurance.v1beta1.Msg/CreateInsuranceFund',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFund,
    responseType: injective_insurance_v1beta1_tx_pb.MsgCreateInsuranceFundResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_MsgCreateInsuranceFund,
    requestDeserialize: deserialize_injective_insurance_v1beta1_MsgCreateInsuranceFund,
    responseSerialize: serialize_injective_insurance_v1beta1_MsgCreateInsuranceFundResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_MsgCreateInsuranceFundResponse,
  },
  // Underwrite defines a method for depositing tokens to underwrite an
// insurance fund
underwrite: {
    path: '/injective.insurance.v1beta1.Msg/Underwrite',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_tx_pb.MsgUnderwrite,
    responseType: injective_insurance_v1beta1_tx_pb.MsgUnderwriteResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_MsgUnderwrite,
    requestDeserialize: deserialize_injective_insurance_v1beta1_MsgUnderwrite,
    responseSerialize: serialize_injective_insurance_v1beta1_MsgUnderwriteResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_MsgUnderwriteResponse,
  },
  // RequestRedemption defines a method for requesting a redemption of the
// sender's insurance fund tokens
requestRedemption: {
    path: '/injective.insurance.v1beta1.Msg/RequestRedemption',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_tx_pb.MsgRequestRedemption,
    responseType: injective_insurance_v1beta1_tx_pb.MsgRequestRedemptionResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_MsgRequestRedemption,
    requestDeserialize: deserialize_injective_insurance_v1beta1_MsgRequestRedemption,
    responseSerialize: serialize_injective_insurance_v1beta1_MsgRequestRedemptionResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_MsgRequestRedemptionResponse,
  },
  updateParams: {
    path: '/injective.insurance.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_insurance_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_insurance_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_insurance_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
