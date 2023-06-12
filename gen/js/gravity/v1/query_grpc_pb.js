// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gravity_v1_query_pb = require('../../gravity/v1/query_pb.js');
var gravity_v1_genesis_pb = require('../../gravity/v1/genesis_pb.js');
var gravity_v1_types_pb = require('../../gravity/v1/types_pb.js');
var gravity_v1_msgs_pb = require('../../gravity/v1/msgs_pb.js');
var gravity_v1_pool_pb = require('../../gravity/v1/pool_pb.js');
var gravity_v1_batch_pb = require('../../gravity/v1/batch_pb.js');
var gravity_v1_attestation_pb = require('../../gravity/v1/attestation_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_gravity_v1_QueryAttestationsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryAttestationsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryAttestationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryAttestationsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryAttestationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryAttestationsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryAttestationsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryAttestationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryAttestationsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryAttestationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchConfirmsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchConfirmsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchConfirmsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchConfirmsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchConfirmsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchConfirmsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchConfirmsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchConfirmsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchConfirmsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchConfirmsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchFeeRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchFeeRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchFeeRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchFeeResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchFeeResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchFeeResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchRequestByNonceRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchRequestByNonceRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchRequestByNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchRequestByNonceRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchRequestByNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryBatchRequestByNonceResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryBatchRequestByNonceResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryBatchRequestByNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryBatchRequestByNonceResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryBatchRequestByNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryCurrentValsetRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryCurrentValsetRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryCurrentValsetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryCurrentValsetRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryCurrentValsetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryCurrentValsetResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryCurrentValsetResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryCurrentValsetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryCurrentValsetResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryCurrentValsetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByEthAddress(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByEthAddress)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByEthAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByEthAddress(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByEthAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByEthAddressResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByEthAddressResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByEthAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByEthAddressResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByEthAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByOrchestratorAddress(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddress)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByOrchestratorAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByOrchestratorAddress(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByOrchestratorAddressResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByOrchestratorAddressResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByValidatorAddress(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByValidatorAddress)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByValidatorAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByValidatorAddress(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByValidatorAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDelegateKeysByValidatorAddressResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryDelegateKeysByValidatorAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDelegateKeysByValidatorAddressResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDenomToERC20Request(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDenomToERC20Request)) {
    throw new Error('Expected argument of type gravity.v1.QueryDenomToERC20Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDenomToERC20Request(buffer_arg) {
  return gravity_v1_query_pb.QueryDenomToERC20Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryDenomToERC20Response(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryDenomToERC20Response)) {
    throw new Error('Expected argument of type gravity.v1.QueryDenomToERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryDenomToERC20Response(buffer_arg) {
  return gravity_v1_query_pb.QueryDenomToERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryERC20ToDenomRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryERC20ToDenomRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryERC20ToDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryERC20ToDenomRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryERC20ToDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryERC20ToDenomResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryERC20ToDenomResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryERC20ToDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryERC20ToDenomResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryERC20ToDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastEventNonceByAddrRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastEventNonceByAddrRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastEventNonceByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastEventNonceByAddrRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastEventNonceByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastEventNonceByAddrResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastEventNonceByAddrResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastEventNonceByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastEventNonceByAddrResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastEventNonceByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastObservedEthBlockRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastObservedEthBlockRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastObservedEthBlockRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastObservedEthBlockRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastObservedEthBlockRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastObservedEthBlockResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastObservedEthBlockResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastObservedEthBlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastObservedEthBlockResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastObservedEthBlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastObservedEthNonceRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastObservedEthNonceRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastObservedEthNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastObservedEthNonceRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastObservedEthNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastObservedEthNonceResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastObservedEthNonceResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastObservedEthNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastObservedEthNonceResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastObservedEthNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingBatchRequestByAddrRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingBatchRequestByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingBatchRequestByAddrRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingBatchRequestByAddrResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingBatchRequestByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingBatchRequestByAddrResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingLogicCallByAddrRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingLogicCallByAddrRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingLogicCallByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingLogicCallByAddrRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingLogicCallByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingLogicCallByAddrResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingLogicCallByAddrResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingLogicCallByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingLogicCallByAddrResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingLogicCallByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingValsetRequestByAddrRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingValsetRequestByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingValsetRequestByAddrRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastPendingValsetRequestByAddrResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastPendingValsetRequestByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastPendingValsetRequestByAddrResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastValsetRequestsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastValsetRequestsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastValsetRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastValsetRequestsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLastValsetRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLastValsetRequestsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLastValsetRequestsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLastValsetRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLastValsetRequestsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLastValsetRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLogicConfirmsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLogicConfirmsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryLogicConfirmsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLogicConfirmsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryLogicConfirmsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryLogicConfirmsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryLogicConfirmsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryLogicConfirmsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryLogicConfirmsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryLogicConfirmsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryOutgoingLogicCallsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryOutgoingLogicCallsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryOutgoingLogicCallsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryOutgoingLogicCallsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryOutgoingLogicCallsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryOutgoingLogicCallsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryOutgoingLogicCallsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryOutgoingLogicCallsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryOutgoingLogicCallsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryOutgoingLogicCallsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryOutgoingTxBatchesRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryOutgoingTxBatchesRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryOutgoingTxBatchesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryOutgoingTxBatchesRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryOutgoingTxBatchesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryOutgoingTxBatchesResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryOutgoingTxBatchesResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryOutgoingTxBatchesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryOutgoingTxBatchesResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryOutgoingTxBatchesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryParamsRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryParamsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryPendingIbcAutoForwards(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryPendingIbcAutoForwards)) {
    throw new Error('Expected argument of type gravity.v1.QueryPendingIbcAutoForwards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryPendingIbcAutoForwards(buffer_arg) {
  return gravity_v1_query_pb.QueryPendingIbcAutoForwards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryPendingIbcAutoForwardsResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryPendingIbcAutoForwardsResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryPendingIbcAutoForwardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryPendingIbcAutoForwardsResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryPendingIbcAutoForwardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryPendingSendToEth(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryPendingSendToEth)) {
    throw new Error('Expected argument of type gravity.v1.QueryPendingSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryPendingSendToEth(buffer_arg) {
  return gravity_v1_query_pb.QueryPendingSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryPendingSendToEthResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryPendingSendToEthResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryPendingSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryPendingSendToEthResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryPendingSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetConfirmRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetConfirmRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetConfirmRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetConfirmRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetConfirmRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetConfirmResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetConfirmResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetConfirmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetConfirmResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetConfirmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetConfirmsByNonceRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetConfirmsByNonceRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetConfirmsByNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetConfirmsByNonceRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetConfirmsByNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetConfirmsByNonceResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetConfirmsByNonceResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetConfirmsByNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetConfirmsByNonceResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetConfirmsByNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetRequestRequest(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetRequestRequest)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetRequestRequest(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gravity_v1_QueryValsetRequestResponse(arg) {
  if (!(arg instanceof gravity_v1_query_pb.QueryValsetRequestResponse)) {
    throw new Error('Expected argument of type gravity.v1.QueryValsetRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gravity_v1_QueryValsetRequestResponse(buffer_arg) {
  return gravity_v1_query_pb.QueryValsetRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Deployments queries deployments
params: {
    path: '/gravity.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryParamsRequest,
    responseType: gravity_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_gravity_v1_QueryParamsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryParamsRequest,
    responseSerialize: serialize_gravity_v1_QueryParamsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryParamsResponse,
  },
  currentValset: {
    path: '/gravity.v1.Query/CurrentValset',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryCurrentValsetRequest,
    responseType: gravity_v1_query_pb.QueryCurrentValsetResponse,
    requestSerialize: serialize_gravity_v1_QueryCurrentValsetRequest,
    requestDeserialize: deserialize_gravity_v1_QueryCurrentValsetRequest,
    responseSerialize: serialize_gravity_v1_QueryCurrentValsetResponse,
    responseDeserialize: deserialize_gravity_v1_QueryCurrentValsetResponse,
  },
  valsetRequest: {
    path: '/gravity.v1.Query/ValsetRequest',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryValsetRequestRequest,
    responseType: gravity_v1_query_pb.QueryValsetRequestResponse,
    requestSerialize: serialize_gravity_v1_QueryValsetRequestRequest,
    requestDeserialize: deserialize_gravity_v1_QueryValsetRequestRequest,
    responseSerialize: serialize_gravity_v1_QueryValsetRequestResponse,
    responseDeserialize: deserialize_gravity_v1_QueryValsetRequestResponse,
  },
  valsetConfirm: {
    path: '/gravity.v1.Query/ValsetConfirm',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryValsetConfirmRequest,
    responseType: gravity_v1_query_pb.QueryValsetConfirmResponse,
    requestSerialize: serialize_gravity_v1_QueryValsetConfirmRequest,
    requestDeserialize: deserialize_gravity_v1_QueryValsetConfirmRequest,
    responseSerialize: serialize_gravity_v1_QueryValsetConfirmResponse,
    responseDeserialize: deserialize_gravity_v1_QueryValsetConfirmResponse,
  },
  valsetConfirmsByNonce: {
    path: '/gravity.v1.Query/ValsetConfirmsByNonce',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryValsetConfirmsByNonceRequest,
    responseType: gravity_v1_query_pb.QueryValsetConfirmsByNonceResponse,
    requestSerialize: serialize_gravity_v1_QueryValsetConfirmsByNonceRequest,
    requestDeserialize: deserialize_gravity_v1_QueryValsetConfirmsByNonceRequest,
    responseSerialize: serialize_gravity_v1_QueryValsetConfirmsByNonceResponse,
    responseDeserialize: deserialize_gravity_v1_QueryValsetConfirmsByNonceResponse,
  },
  lastValsetRequests: {
    path: '/gravity.v1.Query/LastValsetRequests',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastValsetRequestsRequest,
    responseType: gravity_v1_query_pb.QueryLastValsetRequestsResponse,
    requestSerialize: serialize_gravity_v1_QueryLastValsetRequestsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastValsetRequestsRequest,
    responseSerialize: serialize_gravity_v1_QueryLastValsetRequestsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastValsetRequestsResponse,
  },
  lastPendingValsetRequestByAddr: {
    path: '/gravity.v1.Query/LastPendingValsetRequestByAddr',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest,
    responseType: gravity_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse,
    requestSerialize: serialize_gravity_v1_QueryLastPendingValsetRequestByAddrRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastPendingValsetRequestByAddrRequest,
    responseSerialize: serialize_gravity_v1_QueryLastPendingValsetRequestByAddrResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastPendingValsetRequestByAddrResponse,
  },
  lastPendingBatchRequestByAddr: {
    path: '/gravity.v1.Query/LastPendingBatchRequestByAddr',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest,
    responseType: gravity_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse,
    requestSerialize: serialize_gravity_v1_QueryLastPendingBatchRequestByAddrRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastPendingBatchRequestByAddrRequest,
    responseSerialize: serialize_gravity_v1_QueryLastPendingBatchRequestByAddrResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastPendingBatchRequestByAddrResponse,
  },
  lastPendingLogicCallByAddr: {
    path: '/gravity.v1.Query/LastPendingLogicCallByAddr',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastPendingLogicCallByAddrRequest,
    responseType: gravity_v1_query_pb.QueryLastPendingLogicCallByAddrResponse,
    requestSerialize: serialize_gravity_v1_QueryLastPendingLogicCallByAddrRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastPendingLogicCallByAddrRequest,
    responseSerialize: serialize_gravity_v1_QueryLastPendingLogicCallByAddrResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastPendingLogicCallByAddrResponse,
  },
  lastEventNonceByAddr: {
    path: '/gravity.v1.Query/LastEventNonceByAddr',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastEventNonceByAddrRequest,
    responseType: gravity_v1_query_pb.QueryLastEventNonceByAddrResponse,
    requestSerialize: serialize_gravity_v1_QueryLastEventNonceByAddrRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastEventNonceByAddrRequest,
    responseSerialize: serialize_gravity_v1_QueryLastEventNonceByAddrResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastEventNonceByAddrResponse,
  },
  batchFees: {
    path: '/gravity.v1.Query/BatchFees',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryBatchFeeRequest,
    responseType: gravity_v1_query_pb.QueryBatchFeeResponse,
    requestSerialize: serialize_gravity_v1_QueryBatchFeeRequest,
    requestDeserialize: deserialize_gravity_v1_QueryBatchFeeRequest,
    responseSerialize: serialize_gravity_v1_QueryBatchFeeResponse,
    responseDeserialize: deserialize_gravity_v1_QueryBatchFeeResponse,
  },
  outgoingTxBatches: {
    path: '/gravity.v1.Query/OutgoingTxBatches',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryOutgoingTxBatchesRequest,
    responseType: gravity_v1_query_pb.QueryOutgoingTxBatchesResponse,
    requestSerialize: serialize_gravity_v1_QueryOutgoingTxBatchesRequest,
    requestDeserialize: deserialize_gravity_v1_QueryOutgoingTxBatchesRequest,
    responseSerialize: serialize_gravity_v1_QueryOutgoingTxBatchesResponse,
    responseDeserialize: deserialize_gravity_v1_QueryOutgoingTxBatchesResponse,
  },
  outgoingLogicCalls: {
    path: '/gravity.v1.Query/OutgoingLogicCalls',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryOutgoingLogicCallsRequest,
    responseType: gravity_v1_query_pb.QueryOutgoingLogicCallsResponse,
    requestSerialize: serialize_gravity_v1_QueryOutgoingLogicCallsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryOutgoingLogicCallsRequest,
    responseSerialize: serialize_gravity_v1_QueryOutgoingLogicCallsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryOutgoingLogicCallsResponse,
  },
  batchRequestByNonce: {
    path: '/gravity.v1.Query/BatchRequestByNonce',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryBatchRequestByNonceRequest,
    responseType: gravity_v1_query_pb.QueryBatchRequestByNonceResponse,
    requestSerialize: serialize_gravity_v1_QueryBatchRequestByNonceRequest,
    requestDeserialize: deserialize_gravity_v1_QueryBatchRequestByNonceRequest,
    responseSerialize: serialize_gravity_v1_QueryBatchRequestByNonceResponse,
    responseDeserialize: deserialize_gravity_v1_QueryBatchRequestByNonceResponse,
  },
  batchConfirms: {
    path: '/gravity.v1.Query/BatchConfirms',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryBatchConfirmsRequest,
    responseType: gravity_v1_query_pb.QueryBatchConfirmsResponse,
    requestSerialize: serialize_gravity_v1_QueryBatchConfirmsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryBatchConfirmsRequest,
    responseSerialize: serialize_gravity_v1_QueryBatchConfirmsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryBatchConfirmsResponse,
  },
  logicConfirms: {
    path: '/gravity.v1.Query/LogicConfirms',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLogicConfirmsRequest,
    responseType: gravity_v1_query_pb.QueryLogicConfirmsResponse,
    requestSerialize: serialize_gravity_v1_QueryLogicConfirmsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLogicConfirmsRequest,
    responseSerialize: serialize_gravity_v1_QueryLogicConfirmsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLogicConfirmsResponse,
  },
  eRC20ToDenom: {
    path: '/gravity.v1.Query/ERC20ToDenom',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryERC20ToDenomRequest,
    responseType: gravity_v1_query_pb.QueryERC20ToDenomResponse,
    requestSerialize: serialize_gravity_v1_QueryERC20ToDenomRequest,
    requestDeserialize: deserialize_gravity_v1_QueryERC20ToDenomRequest,
    responseSerialize: serialize_gravity_v1_QueryERC20ToDenomResponse,
    responseDeserialize: deserialize_gravity_v1_QueryERC20ToDenomResponse,
  },
  denomToERC20: {
    path: '/gravity.v1.Query/DenomToERC20',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryDenomToERC20Request,
    responseType: gravity_v1_query_pb.QueryDenomToERC20Response,
    requestSerialize: serialize_gravity_v1_QueryDenomToERC20Request,
    requestDeserialize: deserialize_gravity_v1_QueryDenomToERC20Request,
    responseSerialize: serialize_gravity_v1_QueryDenomToERC20Response,
    responseDeserialize: deserialize_gravity_v1_QueryDenomToERC20Response,
  },
  getLastObservedEthBlock: {
    path: '/gravity.v1.Query/GetLastObservedEthBlock',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastObservedEthBlockRequest,
    responseType: gravity_v1_query_pb.QueryLastObservedEthBlockResponse,
    requestSerialize: serialize_gravity_v1_QueryLastObservedEthBlockRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastObservedEthBlockRequest,
    responseSerialize: serialize_gravity_v1_QueryLastObservedEthBlockResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastObservedEthBlockResponse,
  },
  getLastObservedEthNonce: {
    path: '/gravity.v1.Query/GetLastObservedEthNonce',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryLastObservedEthNonceRequest,
    responseType: gravity_v1_query_pb.QueryLastObservedEthNonceResponse,
    requestSerialize: serialize_gravity_v1_QueryLastObservedEthNonceRequest,
    requestDeserialize: deserialize_gravity_v1_QueryLastObservedEthNonceRequest,
    responseSerialize: serialize_gravity_v1_QueryLastObservedEthNonceResponse,
    responseDeserialize: deserialize_gravity_v1_QueryLastObservedEthNonceResponse,
  },
  getAttestations: {
    path: '/gravity.v1.Query/GetAttestations',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryAttestationsRequest,
    responseType: gravity_v1_query_pb.QueryAttestationsResponse,
    requestSerialize: serialize_gravity_v1_QueryAttestationsRequest,
    requestDeserialize: deserialize_gravity_v1_QueryAttestationsRequest,
    responseSerialize: serialize_gravity_v1_QueryAttestationsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryAttestationsResponse,
  },
  getDelegateKeyByValidator: {
    path: '/gravity.v1.Query/GetDelegateKeyByValidator',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryDelegateKeysByValidatorAddress,
    responseType: gravity_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse,
    requestSerialize: serialize_gravity_v1_QueryDelegateKeysByValidatorAddress,
    requestDeserialize: deserialize_gravity_v1_QueryDelegateKeysByValidatorAddress,
    responseSerialize: serialize_gravity_v1_QueryDelegateKeysByValidatorAddressResponse,
    responseDeserialize: deserialize_gravity_v1_QueryDelegateKeysByValidatorAddressResponse,
  },
  getDelegateKeyByEth: {
    path: '/gravity.v1.Query/GetDelegateKeyByEth',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryDelegateKeysByEthAddress,
    responseType: gravity_v1_query_pb.QueryDelegateKeysByEthAddressResponse,
    requestSerialize: serialize_gravity_v1_QueryDelegateKeysByEthAddress,
    requestDeserialize: deserialize_gravity_v1_QueryDelegateKeysByEthAddress,
    responseSerialize: serialize_gravity_v1_QueryDelegateKeysByEthAddressResponse,
    responseDeserialize: deserialize_gravity_v1_QueryDelegateKeysByEthAddressResponse,
  },
  getDelegateKeyByOrchestrator: {
    path: '/gravity.v1.Query/GetDelegateKeyByOrchestrator',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddress,
    responseType: gravity_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse,
    requestSerialize: serialize_gravity_v1_QueryDelegateKeysByOrchestratorAddress,
    requestDeserialize: deserialize_gravity_v1_QueryDelegateKeysByOrchestratorAddress,
    responseSerialize: serialize_gravity_v1_QueryDelegateKeysByOrchestratorAddressResponse,
    responseDeserialize: deserialize_gravity_v1_QueryDelegateKeysByOrchestratorAddressResponse,
  },
  getPendingSendToEth: {
    path: '/gravity.v1.Query/GetPendingSendToEth',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryPendingSendToEth,
    responseType: gravity_v1_query_pb.QueryPendingSendToEthResponse,
    requestSerialize: serialize_gravity_v1_QueryPendingSendToEth,
    requestDeserialize: deserialize_gravity_v1_QueryPendingSendToEth,
    responseSerialize: serialize_gravity_v1_QueryPendingSendToEthResponse,
    responseDeserialize: deserialize_gravity_v1_QueryPendingSendToEthResponse,
  },
  getPendingIbcAutoForwards: {
    path: '/gravity.v1.Query/GetPendingIbcAutoForwards',
    requestStream: false,
    responseStream: false,
    requestType: gravity_v1_query_pb.QueryPendingIbcAutoForwards,
    responseType: gravity_v1_query_pb.QueryPendingIbcAutoForwardsResponse,
    requestSerialize: serialize_gravity_v1_QueryPendingIbcAutoForwards,
    requestDeserialize: deserialize_gravity_v1_QueryPendingIbcAutoForwards,
    responseSerialize: serialize_gravity_v1_QueryPendingIbcAutoForwardsResponse,
    responseDeserialize: deserialize_gravity_v1_QueryPendingIbcAutoForwardsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
