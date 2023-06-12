// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_claims_v1beta1_tx_pb = require('../../../ixo/claims/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var ixo_claims_v1beta1_claims_pb = require('../../../ixo/claims/v1beta1/claims_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var ixo_claims_v1beta1_cosmos_pb = require('../../../ixo/claims/v1beta1/cosmos_pb.js');

function serialize_ixo_claims_v1beta1_MsgCreateCollection(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgCreateCollection)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgCreateCollection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgCreateCollection(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgCreateCollection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgCreateCollectionResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgCreateCollectionResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgCreateCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgCreateCollectionResponse(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgCreateCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgDisputeClaim(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgDisputeClaim)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgDisputeClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgDisputeClaim(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgDisputeClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgDisputeClaimResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgDisputeClaimResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgDisputeClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgDisputeClaimResponse(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgDisputeClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgEvaluateClaim(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgEvaluateClaim)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgEvaluateClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgEvaluateClaim(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgEvaluateClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgEvaluateClaimResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgEvaluateClaimResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgEvaluateClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgEvaluateClaimResponse(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgEvaluateClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgSubmitClaim(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgSubmitClaim)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgSubmitClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgSubmitClaim(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgSubmitClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgSubmitClaimResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgSubmitClaimResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgSubmitClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgSubmitClaimResponse(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgSubmitClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgWithdrawPayment(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgWithdrawPayment)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgWithdrawPayment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgWithdrawPayment(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgWithdrawPayment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_MsgWithdrawPaymentResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_tx_pb.MsgWithdrawPaymentResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.MsgWithdrawPaymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_MsgWithdrawPaymentResponse(buffer_arg) {
  return ixo_claims_v1beta1_tx_pb.MsgWithdrawPaymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  createCollection: {
    path: '/ixo.claims.v1beta1.Msg/CreateCollection',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_tx_pb.MsgCreateCollection,
    responseType: ixo_claims_v1beta1_tx_pb.MsgCreateCollectionResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_MsgCreateCollection,
    requestDeserialize: deserialize_ixo_claims_v1beta1_MsgCreateCollection,
    responseSerialize: serialize_ixo_claims_v1beta1_MsgCreateCollectionResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_MsgCreateCollectionResponse,
  },
  submitClaim: {
    path: '/ixo.claims.v1beta1.Msg/SubmitClaim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_tx_pb.MsgSubmitClaim,
    responseType: ixo_claims_v1beta1_tx_pb.MsgSubmitClaimResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_MsgSubmitClaim,
    requestDeserialize: deserialize_ixo_claims_v1beta1_MsgSubmitClaim,
    responseSerialize: serialize_ixo_claims_v1beta1_MsgSubmitClaimResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_MsgSubmitClaimResponse,
  },
  evaluateClaim: {
    path: '/ixo.claims.v1beta1.Msg/EvaluateClaim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_tx_pb.MsgEvaluateClaim,
    responseType: ixo_claims_v1beta1_tx_pb.MsgEvaluateClaimResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_MsgEvaluateClaim,
    requestDeserialize: deserialize_ixo_claims_v1beta1_MsgEvaluateClaim,
    responseSerialize: serialize_ixo_claims_v1beta1_MsgEvaluateClaimResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_MsgEvaluateClaimResponse,
  },
  disputeClaim: {
    path: '/ixo.claims.v1beta1.Msg/DisputeClaim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_tx_pb.MsgDisputeClaim,
    responseType: ixo_claims_v1beta1_tx_pb.MsgDisputeClaimResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_MsgDisputeClaim,
    requestDeserialize: deserialize_ixo_claims_v1beta1_MsgDisputeClaim,
    responseSerialize: serialize_ixo_claims_v1beta1_MsgDisputeClaimResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_MsgDisputeClaimResponse,
  },
  withdrawPayment: {
    path: '/ixo.claims.v1beta1.Msg/WithdrawPayment',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_tx_pb.MsgWithdrawPayment,
    responseType: ixo_claims_v1beta1_tx_pb.MsgWithdrawPaymentResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_MsgWithdrawPayment,
    requestDeserialize: deserialize_ixo_claims_v1beta1_MsgWithdrawPayment,
    responseSerialize: serialize_ixo_claims_v1beta1_MsgWithdrawPaymentResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_MsgWithdrawPaymentResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
