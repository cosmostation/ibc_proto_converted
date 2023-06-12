// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_peggy_v1_msgs_pb = require('../../../injective/peggy/v1/msgs_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_peggy_v1_types_pb = require('../../../injective/peggy/v1/types_pb.js');
var injective_peggy_v1_params_pb = require('../../../injective/peggy/v1/params_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_injective_peggy_v1_MsgCancelSendToEth(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgCancelSendToEth)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgCancelSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgCancelSendToEth(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgCancelSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgCancelSendToEthResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgCancelSendToEthResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgCancelSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgCancelSendToEthResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgCancelSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgConfirmBatch(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgConfirmBatch)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgConfirmBatch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgConfirmBatch(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgConfirmBatch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgConfirmBatchResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgConfirmBatchResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgConfirmBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgConfirmBatchResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgConfirmBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgDepositClaim(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgDepositClaim)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgDepositClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgDepositClaim(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgDepositClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgDepositClaimResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgDepositClaimResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgDepositClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgDepositClaimResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgDepositClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgERC20DeployedClaim(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgERC20DeployedClaim)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgERC20DeployedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgERC20DeployedClaim(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgERC20DeployedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgERC20DeployedClaimResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgERC20DeployedClaimResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgERC20DeployedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgERC20DeployedClaimResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgERC20DeployedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgRequestBatch(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgRequestBatch)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgRequestBatch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgRequestBatch(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgRequestBatch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgRequestBatchResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgRequestBatchResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgRequestBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgRequestBatchResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgRequestBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSendToEth(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSendToEth)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSendToEth(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSendToEthResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSendToEthResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSendToEthResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSetOrchestratorAddresses(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddresses)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSetOrchestratorAddresses');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSetOrchestratorAddresses(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddresses.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSetOrchestratorAddressesResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddressesResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSetOrchestratorAddressesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSetOrchestratorAddressesResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddressesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSubmitBadSignatureEvidence(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidence)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSubmitBadSignatureEvidence');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSubmitBadSignatureEvidence(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidence.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgSubmitBadSignatureEvidenceResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgSubmitBadSignatureEvidenceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgSubmitBadSignatureEvidenceResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgUpdateParams(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgValsetConfirm(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgValsetConfirm)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgValsetConfirm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgValsetConfirm(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgValsetConfirm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgValsetConfirmResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgValsetConfirmResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgValsetConfirmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgValsetConfirmResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgValsetConfirmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgValsetUpdatedClaim(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaim)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgValsetUpdatedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgValsetUpdatedClaim(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgValsetUpdatedClaimResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaimResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgValsetUpdatedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgValsetUpdatedClaimResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgWithdrawClaim(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgWithdrawClaim)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgWithdrawClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgWithdrawClaim(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgWithdrawClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MsgWithdrawClaimResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_msgs_pb.MsgWithdrawClaimResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MsgWithdrawClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MsgWithdrawClaimResponse(buffer_arg) {
  return injective_peggy_v1_msgs_pb.MsgWithdrawClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  valsetConfirm: {
    path: '/injective.peggy.v1.Msg/ValsetConfirm',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgValsetConfirm,
    responseType: injective_peggy_v1_msgs_pb.MsgValsetConfirmResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgValsetConfirm,
    requestDeserialize: deserialize_injective_peggy_v1_MsgValsetConfirm,
    responseSerialize: serialize_injective_peggy_v1_MsgValsetConfirmResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgValsetConfirmResponse,
  },
  sendToEth: {
    path: '/injective.peggy.v1.Msg/SendToEth',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgSendToEth,
    responseType: injective_peggy_v1_msgs_pb.MsgSendToEthResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgSendToEth,
    requestDeserialize: deserialize_injective_peggy_v1_MsgSendToEth,
    responseSerialize: serialize_injective_peggy_v1_MsgSendToEthResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgSendToEthResponse,
  },
  requestBatch: {
    path: '/injective.peggy.v1.Msg/RequestBatch',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgRequestBatch,
    responseType: injective_peggy_v1_msgs_pb.MsgRequestBatchResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgRequestBatch,
    requestDeserialize: deserialize_injective_peggy_v1_MsgRequestBatch,
    responseSerialize: serialize_injective_peggy_v1_MsgRequestBatchResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgRequestBatchResponse,
  },
  confirmBatch: {
    path: '/injective.peggy.v1.Msg/ConfirmBatch',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgConfirmBatch,
    responseType: injective_peggy_v1_msgs_pb.MsgConfirmBatchResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgConfirmBatch,
    requestDeserialize: deserialize_injective_peggy_v1_MsgConfirmBatch,
    responseSerialize: serialize_injective_peggy_v1_MsgConfirmBatchResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgConfirmBatchResponse,
  },
  depositClaim: {
    path: '/injective.peggy.v1.Msg/DepositClaim',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgDepositClaim,
    responseType: injective_peggy_v1_msgs_pb.MsgDepositClaimResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgDepositClaim,
    requestDeserialize: deserialize_injective_peggy_v1_MsgDepositClaim,
    responseSerialize: serialize_injective_peggy_v1_MsgDepositClaimResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgDepositClaimResponse,
  },
  withdrawClaim: {
    path: '/injective.peggy.v1.Msg/WithdrawClaim',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgWithdrawClaim,
    responseType: injective_peggy_v1_msgs_pb.MsgWithdrawClaimResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgWithdrawClaim,
    requestDeserialize: deserialize_injective_peggy_v1_MsgWithdrawClaim,
    responseSerialize: serialize_injective_peggy_v1_MsgWithdrawClaimResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgWithdrawClaimResponse,
  },
  valsetUpdateClaim: {
    path: '/injective.peggy.v1.Msg/ValsetUpdateClaim',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaim,
    responseType: injective_peggy_v1_msgs_pb.MsgValsetUpdatedClaimResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgValsetUpdatedClaim,
    requestDeserialize: deserialize_injective_peggy_v1_MsgValsetUpdatedClaim,
    responseSerialize: serialize_injective_peggy_v1_MsgValsetUpdatedClaimResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgValsetUpdatedClaimResponse,
  },
  eRC20DeployedClaim: {
    path: '/injective.peggy.v1.Msg/ERC20DeployedClaim',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgERC20DeployedClaim,
    responseType: injective_peggy_v1_msgs_pb.MsgERC20DeployedClaimResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgERC20DeployedClaim,
    requestDeserialize: deserialize_injective_peggy_v1_MsgERC20DeployedClaim,
    responseSerialize: serialize_injective_peggy_v1_MsgERC20DeployedClaimResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgERC20DeployedClaimResponse,
  },
  setOrchestratorAddresses: {
    path: '/injective.peggy.v1.Msg/SetOrchestratorAddresses',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddresses,
    responseType: injective_peggy_v1_msgs_pb.MsgSetOrchestratorAddressesResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgSetOrchestratorAddresses,
    requestDeserialize: deserialize_injective_peggy_v1_MsgSetOrchestratorAddresses,
    responseSerialize: serialize_injective_peggy_v1_MsgSetOrchestratorAddressesResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgSetOrchestratorAddressesResponse,
  },
  cancelSendToEth: {
    path: '/injective.peggy.v1.Msg/CancelSendToEth',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgCancelSendToEth,
    responseType: injective_peggy_v1_msgs_pb.MsgCancelSendToEthResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgCancelSendToEth,
    requestDeserialize: deserialize_injective_peggy_v1_MsgCancelSendToEth,
    responseSerialize: serialize_injective_peggy_v1_MsgCancelSendToEthResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgCancelSendToEthResponse,
  },
  submitBadSignatureEvidence: {
    path: '/injective.peggy.v1.Msg/SubmitBadSignatureEvidence',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidence,
    responseType: injective_peggy_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgSubmitBadSignatureEvidence,
    requestDeserialize: deserialize_injective_peggy_v1_MsgSubmitBadSignatureEvidence,
    responseSerialize: serialize_injective_peggy_v1_MsgSubmitBadSignatureEvidenceResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgSubmitBadSignatureEvidenceResponse,
  },
  updateParams: {
    path: '/injective.peggy.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_msgs_pb.MsgUpdateParams,
    responseType: injective_peggy_v1_msgs_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_peggy_v1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_peggy_v1_MsgUpdateParams,
    responseSerialize: serialize_injective_peggy_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
