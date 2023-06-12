// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gravity_v1_msgs_pb = require('../../gravity/v1/msgs_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gravity_v1_types_pb = require('../../gravity/v1/types_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');

function serialize_gravity_v1_MsgBatchSendToEthClaim(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgBatchSendToEthClaim)) {
    throw new Error('Expected argument of type gravity.v1.MsgBatchSendToEthClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgBatchSendToEthClaim(buffer_arg) {
  return gravity_v1_msgs_pb.MsgBatchSendToEthClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgBatchSendToEthClaimResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgBatchSendToEthClaimResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgBatchSendToEthClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgBatchSendToEthClaimResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgBatchSendToEthClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgCancelSendToEth(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgCancelSendToEth)) {
    throw new Error('Expected argument of type gravity.v1.MsgCancelSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgCancelSendToEth(buffer_arg) {
  return gravity_v1_msgs_pb.MsgCancelSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgCancelSendToEthResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgCancelSendToEthResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgCancelSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgCancelSendToEthResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgCancelSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgConfirmBatch(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgConfirmBatch)) {
    throw new Error('Expected argument of type gravity.v1.MsgConfirmBatch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgConfirmBatch(buffer_arg) {
  return gravity_v1_msgs_pb.MsgConfirmBatch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgConfirmBatchResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgConfirmBatchResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgConfirmBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgConfirmBatchResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgConfirmBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgConfirmLogicCall(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgConfirmLogicCall)) {
    throw new Error('Expected argument of type gravity.v1.MsgConfirmLogicCall');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgConfirmLogicCall(buffer_arg) {
  return gravity_v1_msgs_pb.MsgConfirmLogicCall.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgConfirmLogicCallResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgConfirmLogicCallResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgConfirmLogicCallResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgConfirmLogicCallResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgConfirmLogicCallResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgERC20DeployedClaim(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgERC20DeployedClaim)) {
    throw new Error('Expected argument of type gravity.v1.MsgERC20DeployedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgERC20DeployedClaim(buffer_arg) {
  return gravity_v1_msgs_pb.MsgERC20DeployedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgERC20DeployedClaimResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgERC20DeployedClaimResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgERC20DeployedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgERC20DeployedClaimResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgERC20DeployedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgExecuteIbcAutoForwards(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgExecuteIbcAutoForwards)) {
    throw new Error('Expected argument of type gravity.v1.MsgExecuteIbcAutoForwards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgExecuteIbcAutoForwards(buffer_arg) {
  return gravity_v1_msgs_pb.MsgExecuteIbcAutoForwards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgExecuteIbcAutoForwardsResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgExecuteIbcAutoForwardsResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgExecuteIbcAutoForwardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgExecuteIbcAutoForwardsResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgExecuteIbcAutoForwardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgLogicCallExecutedClaim(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgLogicCallExecutedClaim)) {
    throw new Error('Expected argument of type gravity.v1.MsgLogicCallExecutedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgLogicCallExecutedClaim(buffer_arg) {
  return gravity_v1_msgs_pb.MsgLogicCallExecutedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgLogicCallExecutedClaimResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgLogicCallExecutedClaimResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgLogicCallExecutedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgLogicCallExecutedClaimResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgLogicCallExecutedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgRequestBatch(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgRequestBatch)) {
    throw new Error('Expected argument of type gravity.v1.MsgRequestBatch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgRequestBatch(buffer_arg) {
  return gravity_v1_msgs_pb.MsgRequestBatch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgRequestBatchResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgRequestBatchResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgRequestBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgRequestBatchResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgRequestBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSendToCosmosClaim(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSendToCosmosClaim)) {
    throw new Error('Expected argument of type gravity.v1.MsgSendToCosmosClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSendToCosmosClaim(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSendToCosmosClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSendToCosmosClaimResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSendToCosmosClaimResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgSendToCosmosClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSendToCosmosClaimResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSendToCosmosClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSendToEth(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSendToEth)) {
    throw new Error('Expected argument of type gravity.v1.MsgSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSendToEth(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSendToEthResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSendToEthResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSendToEthResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSetOrchestratorAddress(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSetOrchestratorAddress)) {
    throw new Error('Expected argument of type gravity.v1.MsgSetOrchestratorAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSetOrchestratorAddress(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSetOrchestratorAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSetOrchestratorAddressResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSetOrchestratorAddressResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgSetOrchestratorAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSetOrchestratorAddressResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSetOrchestratorAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSubmitBadSignatureEvidence(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidence)) {
    throw new Error('Expected argument of type gravity.v1.MsgSubmitBadSignatureEvidence');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSubmitBadSignatureEvidence(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidence.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgSubmitBadSignatureEvidenceResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgSubmitBadSignatureEvidenceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgSubmitBadSignatureEvidenceResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgValsetConfirm(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgValsetConfirm)) {
    throw new Error('Expected argument of type gravity.v1.MsgValsetConfirm');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgValsetConfirm(buffer_arg) {
  return gravity_v1_msgs_pb.MsgValsetConfirm.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgValsetConfirmResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgValsetConfirmResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgValsetConfirmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgValsetConfirmResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgValsetConfirmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgValsetUpdatedClaim(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgValsetUpdatedClaim)) {
    throw new Error('Expected argument of type gravity.v1.MsgValsetUpdatedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgValsetUpdatedClaim(buffer_arg) {
  return gravity_v1_msgs_pb.MsgValsetUpdatedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_MsgValsetUpdatedClaimResponse(arg) {
  if (!(arg instanceof gravity_v1_msgs_pb.MsgValsetUpdatedClaimResponse)) {
    throw new Error('Expected argument of type gravity.v1.MsgValsetUpdatedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_MsgValsetUpdatedClaimResponse(buffer_arg) {
  return gravity_v1_msgs_pb.MsgValsetUpdatedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the state transitions possible within gravity
var MsgService = exports.MsgService = {
  valsetConfirm: {
    path: '/gravity.v1.Msg/ValsetConfirm',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgValsetConfirm,
    responseType: gravity_v1_msgs_pb.MsgValsetConfirmResponse,
    requestSerialize: serialize_gravity_v1_MsgValsetConfirm,
    requestDeserialize: deserialize_gravity_v1_MsgValsetConfirm,
    responseSerialize: serialize_gravity_v1_MsgValsetConfirmResponse,
    responseDeserialize: deserialize_gravity_v1_MsgValsetConfirmResponse,
  },
  sendToEth: {
    path: '/gravity.v1.Msg/SendToEth',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgSendToEth,
    responseType: gravity_v1_msgs_pb.MsgSendToEthResponse,
    requestSerialize: serialize_gravity_v1_MsgSendToEth,
    requestDeserialize: deserialize_gravity_v1_MsgSendToEth,
    responseSerialize: serialize_gravity_v1_MsgSendToEthResponse,
    responseDeserialize: deserialize_gravity_v1_MsgSendToEthResponse,
  },
  requestBatch: {
    path: '/gravity.v1.Msg/RequestBatch',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgRequestBatch,
    responseType: gravity_v1_msgs_pb.MsgRequestBatchResponse,
    requestSerialize: serialize_gravity_v1_MsgRequestBatch,
    requestDeserialize: deserialize_gravity_v1_MsgRequestBatch,
    responseSerialize: serialize_gravity_v1_MsgRequestBatchResponse,
    responseDeserialize: deserialize_gravity_v1_MsgRequestBatchResponse,
  },
  confirmBatch: {
    path: '/gravity.v1.Msg/ConfirmBatch',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgConfirmBatch,
    responseType: gravity_v1_msgs_pb.MsgConfirmBatchResponse,
    requestSerialize: serialize_gravity_v1_MsgConfirmBatch,
    requestDeserialize: deserialize_gravity_v1_MsgConfirmBatch,
    responseSerialize: serialize_gravity_v1_MsgConfirmBatchResponse,
    responseDeserialize: deserialize_gravity_v1_MsgConfirmBatchResponse,
  },
  confirmLogicCall: {
    path: '/gravity.v1.Msg/ConfirmLogicCall',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgConfirmLogicCall,
    responseType: gravity_v1_msgs_pb.MsgConfirmLogicCallResponse,
    requestSerialize: serialize_gravity_v1_MsgConfirmLogicCall,
    requestDeserialize: deserialize_gravity_v1_MsgConfirmLogicCall,
    responseSerialize: serialize_gravity_v1_MsgConfirmLogicCallResponse,
    responseDeserialize: deserialize_gravity_v1_MsgConfirmLogicCallResponse,
  },
  sendToCosmosClaim: {
    path: '/gravity.v1.Msg/SendToCosmosClaim',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgSendToCosmosClaim,
    responseType: gravity_v1_msgs_pb.MsgSendToCosmosClaimResponse,
    requestSerialize: serialize_gravity_v1_MsgSendToCosmosClaim,
    requestDeserialize: deserialize_gravity_v1_MsgSendToCosmosClaim,
    responseSerialize: serialize_gravity_v1_MsgSendToCosmosClaimResponse,
    responseDeserialize: deserialize_gravity_v1_MsgSendToCosmosClaimResponse,
  },
  executeIbcAutoForwards: {
    path: '/gravity.v1.Msg/ExecuteIbcAutoForwards',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgExecuteIbcAutoForwards,
    responseType: gravity_v1_msgs_pb.MsgExecuteIbcAutoForwardsResponse,
    requestSerialize: serialize_gravity_v1_MsgExecuteIbcAutoForwards,
    requestDeserialize: deserialize_gravity_v1_MsgExecuteIbcAutoForwards,
    responseSerialize: serialize_gravity_v1_MsgExecuteIbcAutoForwardsResponse,
    responseDeserialize: deserialize_gravity_v1_MsgExecuteIbcAutoForwardsResponse,
  },
  batchSendToEthClaim: {
    path: '/gravity.v1.Msg/BatchSendToEthClaim',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgBatchSendToEthClaim,
    responseType: gravity_v1_msgs_pb.MsgBatchSendToEthClaimResponse,
    requestSerialize: serialize_gravity_v1_MsgBatchSendToEthClaim,
    requestDeserialize: deserialize_gravity_v1_MsgBatchSendToEthClaim,
    responseSerialize: serialize_gravity_v1_MsgBatchSendToEthClaimResponse,
    responseDeserialize: deserialize_gravity_v1_MsgBatchSendToEthClaimResponse,
  },
  valsetUpdateClaim: {
    path: '/gravity.v1.Msg/ValsetUpdateClaim',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgValsetUpdatedClaim,
    responseType: gravity_v1_msgs_pb.MsgValsetUpdatedClaimResponse,
    requestSerialize: serialize_gravity_v1_MsgValsetUpdatedClaim,
    requestDeserialize: deserialize_gravity_v1_MsgValsetUpdatedClaim,
    responseSerialize: serialize_gravity_v1_MsgValsetUpdatedClaimResponse,
    responseDeserialize: deserialize_gravity_v1_MsgValsetUpdatedClaimResponse,
  },
  eRC20DeployedClaim: {
    path: '/gravity.v1.Msg/ERC20DeployedClaim',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgERC20DeployedClaim,
    responseType: gravity_v1_msgs_pb.MsgERC20DeployedClaimResponse,
    requestSerialize: serialize_gravity_v1_MsgERC20DeployedClaim,
    requestDeserialize: deserialize_gravity_v1_MsgERC20DeployedClaim,
    responseSerialize: serialize_gravity_v1_MsgERC20DeployedClaimResponse,
    responseDeserialize: deserialize_gravity_v1_MsgERC20DeployedClaimResponse,
  },
  logicCallExecutedClaim: {
    path: '/gravity.v1.Msg/LogicCallExecutedClaim',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgLogicCallExecutedClaim,
    responseType: gravity_v1_msgs_pb.MsgLogicCallExecutedClaimResponse,
    requestSerialize: serialize_gravity_v1_MsgLogicCallExecutedClaim,
    requestDeserialize: deserialize_gravity_v1_MsgLogicCallExecutedClaim,
    responseSerialize: serialize_gravity_v1_MsgLogicCallExecutedClaimResponse,
    responseDeserialize: deserialize_gravity_v1_MsgLogicCallExecutedClaimResponse,
  },
  setOrchestratorAddress: {
    path: '/gravity.v1.Msg/SetOrchestratorAddress',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgSetOrchestratorAddress,
    responseType: gravity_v1_msgs_pb.MsgSetOrchestratorAddressResponse,
    requestSerialize: serialize_gravity_v1_MsgSetOrchestratorAddress,
    requestDeserialize: deserialize_gravity_v1_MsgSetOrchestratorAddress,
    responseSerialize: serialize_gravity_v1_MsgSetOrchestratorAddressResponse,
    responseDeserialize: deserialize_gravity_v1_MsgSetOrchestratorAddressResponse,
  },
  cancelSendToEth: {
    path: '/gravity.v1.Msg/CancelSendToEth',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgCancelSendToEth,
    responseType: gravity_v1_msgs_pb.MsgCancelSendToEthResponse,
    requestSerialize: serialize_gravity_v1_MsgCancelSendToEth,
    requestDeserialize: deserialize_gravity_v1_MsgCancelSendToEth,
    responseSerialize: serialize_gravity_v1_MsgCancelSendToEthResponse,
    responseDeserialize: deserialize_gravity_v1_MsgCancelSendToEthResponse,
  },
  submitBadSignatureEvidence: {
    path: '/gravity.v1.Msg/SubmitBadSignatureEvidence',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidence,
    responseType: gravity_v1_msgs_pb.MsgSubmitBadSignatureEvidenceResponse,
    requestSerialize: serialize_gravity_v1_MsgSubmitBadSignatureEvidence,
    requestDeserialize: deserialize_gravity_v1_MsgSubmitBadSignatureEvidence,
    responseSerialize: serialize_gravity_v1_MsgSubmitBadSignatureEvidenceResponse,
    responseDeserialize: deserialize_gravity_v1_MsgSubmitBadSignatureEvidenceResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
