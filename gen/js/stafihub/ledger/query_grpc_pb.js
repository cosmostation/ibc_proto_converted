// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_ledger_query_pb = require('../../stafihub/ledger/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var stafihub_ledger_ledger_pb = require('../../stafihub/ledger/ledger_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');

function serialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryBondedPoolsByDenomRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryBondedPoolsByDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryBondedPoolsByDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryBondedPoolsByDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryExchangeRateAllRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryExchangeRateAllRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryExchangeRateAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryExchangeRateAllRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryExchangeRateAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryExchangeRateAllResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryExchangeRateAllResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryExchangeRateAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryExchangeRateAllResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryExchangeRateAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetBondPipelineRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetBondPipelineRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetBondPipelineRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetBondPipelineRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetBondPipelineRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetBondPipelineResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetBondPipelineResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetBondPipelineResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetBondPipelineResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetBondPipelineResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetBondRecordRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetBondRecordRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetBondRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetBondRecordRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetBondRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetBondRecordResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetBondRecordResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetBondRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetBondRecordResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetBondRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetChainEraRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetChainEraRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetChainEraRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetChainEraRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetChainEraRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetChainEraResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetChainEraResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetChainEraResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetChainEraResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetChainEraResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraExchangeRateRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraExchangeRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraExchangeRateResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraExchangeRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraSnapshotRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraSnapshotRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraSnapshotRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraSnapshotRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraSnapshotRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraSnapshotResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraSnapshotResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraSnapshotResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraSnapshotResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraSnapshotResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraUnbondLimitRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraUnbondLimitRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetEraUnbondLimitResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetEraUnbondLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetExchangeRateRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetExchangeRateRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetExchangeRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetExchangeRateRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetExchangeRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetExchangeRateResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetExchangeRateResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetExchangeRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetExchangeRateResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetExchangeRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetPoolDetailRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetPoolDetailRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetPoolDetailRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetPoolDetailRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetPoolDetailRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetPoolDetailResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetPoolDetailResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetPoolDetailResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetPoolDetailResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetPoolDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetRParamsRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetRParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetRParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetRParamsRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetRParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetRParamsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetRParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetRParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetRParamsResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetRParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetSignatureRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetSignatureRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetSignatureRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetSignatureRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetSignatureRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetSignatureResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetSignatureResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetSignatureResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetSignatureResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetSignatureResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetSnapshotRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetSnapshotRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetSnapshotRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetSnapshotRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetSnapshotRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetSnapshotResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetSnapshotResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetSnapshotResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetSnapshotResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetSnapshotResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetStakingRewardCommissionRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetStakingRewardCommissionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetStakingRewardCommissionResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetStakingRewardCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetTotalExpectedActiveRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetTotalExpectedActiveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetTotalExpectedActiveResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetTotalExpectedActiveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetUnbondCommissionRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetUnbondCommissionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetUnbondCommissionResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetUnbondCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetUnbondRelayFeeRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetUnbondRelayFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryGetUnbondRelayFeeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryGetUnbondRelayFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryIcaPoolListRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryIcaPoolListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryIcaPoolListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryIcaPoolListRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryIcaPoolListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryIcaPoolListResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryIcaPoolListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryIcaPoolListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryIcaPoolListResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryIcaPoolListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryInterchainTxStatusRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryInterchainTxStatusRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryInterchainTxStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryInterchainTxStatusRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryInterchainTxStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryInterchainTxStatusResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryInterchainTxStatusResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryInterchainTxStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryInterchainTxStatusResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryInterchainTxStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryPoolUnbondingsRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryPoolUnbondingsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryPoolUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryPoolUnbondingsRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryPoolUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryPoolUnbondingsResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryPoolUnbondingsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryPoolUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryPoolUnbondingsResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryPoolUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryRelayFeeReceiverRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryRelayFeeReceiverRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryRelayFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryRelayFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryTotalProtocolFeeRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryTotalProtocolFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryTotalProtocolFeeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryTotalProtocolFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryUnbondSwitchRequest(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryUnbondSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryUnbondSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryUnbondSwitchRequest(buffer_arg) {
  return stafihub_ledger_query_pb.QueryUnbondSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_ledger_QueryUnbondSwitchResponse(arg) {
  if (!(arg instanceof stafihub_ledger_query_pb.QueryUnbondSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.ledger.QueryUnbondSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_ledger_QueryUnbondSwitchResponse(buffer_arg) {
  return stafihub_ledger_query_pb.QueryUnbondSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Queries a list of getExchangeRate items.
getExchangeRate: {
    path: '/stafihub.stafihub.ledger.Query/GetExchangeRate',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetExchangeRateRequest,
    responseType: stafihub_ledger_query_pb.QueryGetExchangeRateResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetExchangeRateRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetExchangeRateRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetExchangeRateResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetExchangeRateResponse,
  },
  // Queries a list of exchangeRateAll items.
exchangeRateAll: {
    path: '/stafihub.stafihub.ledger.Query/ExchangeRateAll',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryExchangeRateAllRequest,
    responseType: stafihub_ledger_query_pb.QueryExchangeRateAllResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryExchangeRateAllRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryExchangeRateAllRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryExchangeRateAllResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryExchangeRateAllResponse,
  },
  // Queries a list of getEraExchangeRate items.
getEraExchangeRate: {
    path: '/stafihub.stafihub.ledger.Query/GetEraExchangeRate',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetEraExchangeRateRequest,
    responseType: stafihub_ledger_query_pb.QueryGetEraExchangeRateResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraExchangeRateResponse,
  },
  // Queries a list of eraExchangeRatesByDenom items.
eraExchangeRatesByDenom: {
    path: '/stafihub.stafihub.ledger.Query/EraExchangeRatesByDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomRequest,
    responseType: stafihub_ledger_query_pb.QueryEraExchangeRatesByDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryEraExchangeRatesByDenomResponse,
  },
  // Queries a list of bondedPoolsByDenom items.
bondedPoolsByDenom: {
    path: '/stafihub.stafihub.ledger.Query/BondedPoolsByDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryBondedPoolsByDenomRequest,
    responseType: stafihub_ledger_query_pb.QueryBondedPoolsByDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryBondedPoolsByDenomResponse,
  },
  // Queries a list of getPoolDetail items.
getPoolDetail: {
    path: '/stafihub.stafihub.ledger.Query/GetPoolDetail',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetPoolDetailRequest,
    responseType: stafihub_ledger_query_pb.QueryGetPoolDetailResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetPoolDetailRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetPoolDetailRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetPoolDetailResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetPoolDetailResponse,
  },
  // Queries a list of getChainEra items.
getChainEra: {
    path: '/stafihub.stafihub.ledger.Query/GetChainEra',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetChainEraRequest,
    responseType: stafihub_ledger_query_pb.QueryGetChainEraResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetChainEraRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetChainEraRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetChainEraResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetChainEraResponse,
  },
  // Queries a list of getCurrentEraSnapshot items.
getCurrentEraSnapshot: {
    path: '/stafihub.stafihub.ledger.Query/GetCurrentEraSnapshot',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotRequest,
    responseType: stafihub_ledger_query_pb.QueryGetCurrentEraSnapshotResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetCurrentEraSnapshotResponse,
  },
  // Queries a list of getReceiver items.
getProtocolFeeReceiver: {
    path: '/stafihub.stafihub.ledger.Query/GetProtocolFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverRequest,
    responseType: stafihub_ledger_query_pb.QueryGetProtocolFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetProtocolFeeReceiverResponse,
  },
  // Queries a list of getCommission items.
getStakingRewardCommission: {
    path: '/stafihub.stafihub.ledger.Query/GetStakingRewardCommission',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetStakingRewardCommissionRequest,
    responseType: stafihub_ledger_query_pb.QueryGetStakingRewardCommissionResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetStakingRewardCommissionResponse,
  },
  // Queries a list of getUnbondFee items.
getUnbondRelayFee: {
    path: '/stafihub.stafihub.ledger.Query/GetUnbondRelayFee',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetUnbondRelayFeeRequest,
    responseType: stafihub_ledger_query_pb.QueryGetUnbondRelayFeeResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetUnbondRelayFeeResponse,
  },
  // Queries a list of getUnbondCommission items.
getUnbondCommission: {
    path: '/stafihub.stafihub.ledger.Query/GetUnbondCommission',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetUnbondCommissionRequest,
    responseType: stafihub_ledger_query_pb.QueryGetUnbondCommissionResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetUnbondCommissionResponse,
  },
  // Queries a list of getEraUnbondLimit items.
getEraUnbondLimit: {
    path: '/stafihub.stafihub.ledger.Query/GetEraUnbondLimit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetEraUnbondLimitRequest,
    responseType: stafihub_ledger_query_pb.QueryGetEraUnbondLimitResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraUnbondLimitResponse,
  },
  // Queries a list of getBondPipeline items.
getBondPipeline: {
    path: '/stafihub.stafihub.ledger.Query/GetBondPipeline',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetBondPipelineRequest,
    responseType: stafihub_ledger_query_pb.QueryGetBondPipelineResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetBondPipelineRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetBondPipelineRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetBondPipelineResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetBondPipelineResponse,
  },
  // Queries a list of getEraSnapshot items.
getEraSnapshot: {
    path: '/stafihub.stafihub.ledger.Query/GetEraSnapshot',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetEraSnapshotRequest,
    responseType: stafihub_ledger_query_pb.QueryGetEraSnapshotResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraSnapshotRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraSnapshotRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetEraSnapshotResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetEraSnapshotResponse,
  },
  // Queries a list of getSnapshot items.
getSnapshot: {
    path: '/stafihub.stafihub.ledger.Query/GetSnapshot',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetSnapshotRequest,
    responseType: stafihub_ledger_query_pb.QueryGetSnapshotResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetSnapshotRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetSnapshotRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetSnapshotResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetSnapshotResponse,
  },
  // Queries a list of getTotalExpectedActive items.
getTotalExpectedActive: {
    path: '/stafihub.stafihub.ledger.Query/GetTotalExpectedActive',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetTotalExpectedActiveRequest,
    responseType: stafihub_ledger_query_pb.QueryGetTotalExpectedActiveResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetTotalExpectedActiveResponse,
  },
  // Queries a list of getBondRecord items.
getBondRecord: {
    path: '/stafihub.stafihub.ledger.Query/GetBondRecord',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetBondRecordRequest,
    responseType: stafihub_ledger_query_pb.QueryGetBondRecordResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetBondRecordRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetBondRecordRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetBondRecordResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetBondRecordResponse,
  },
  // Queries a list of getSignature items.
getSignature: {
    path: '/stafihub.stafihub.ledger.Query/GetSignature',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetSignatureRequest,
    responseType: stafihub_ledger_query_pb.QueryGetSignatureResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetSignatureRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetSignatureRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetSignatureResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetSignatureResponse,
  },
  // Queries a list of GetRParams items.
getRParams: {
    path: '/stafihub.stafihub.ledger.Query/GetRParams',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryGetRParamsRequest,
    responseType: stafihub_ledger_query_pb.QueryGetRParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryGetRParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetRParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryGetRParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryGetRParamsResponse,
  },
  // Queries a list of TotalFeeList items.
totalProtocolFee: {
    path: '/stafihub.stafihub.ledger.Query/TotalProtocolFee',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryTotalProtocolFeeRequest,
    responseType: stafihub_ledger_query_pb.QueryTotalProtocolFeeResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryTotalProtocolFeeResponse,
  },
  // Queries a list of RelayFeeReceiver items.
relayFeeReceiver: {
    path: '/stafihub.stafihub.ledger.Query/RelayFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryRelayFeeReceiverRequest,
    responseType: stafihub_ledger_query_pb.QueryRelayFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryRelayFeeReceiverResponse,
  },
  // Queries a list of UnbondSwitch items.
unbondSwitch: {
    path: '/stafihub.stafihub.ledger.Query/UnbondSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryUnbondSwitchRequest,
    responseType: stafihub_ledger_query_pb.QueryUnbondSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryUnbondSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryUnbondSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryUnbondSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryUnbondSwitchResponse,
  },
  // Queries a list of PoolUnbondNextSequence items.
poolUnbondNextSequence: {
    path: '/stafihub.stafihub.ledger.Query/PoolUnbondNextSequence',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceRequest,
    responseType: stafihub_ledger_query_pb.QueryPoolUnbondNextSequenceResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceResponse,
  },
  // Queries a list of PoolUnbondings items.
poolUnbondings: {
    path: '/stafihub.stafihub.ledger.Query/PoolUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryPoolUnbondingsRequest,
    responseType: stafihub_ledger_query_pb.QueryPoolUnbondingsResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryPoolUnbondingsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryPoolUnbondingsRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryPoolUnbondingsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryPoolUnbondingsResponse,
  },
  // Queries a list of IcaPoolList items.
icaPoolList: {
    path: '/stafihub.stafihub.ledger.Query/IcaPoolList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryIcaPoolListRequest,
    responseType: stafihub_ledger_query_pb.QueryIcaPoolListResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryIcaPoolListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryIcaPoolListRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryIcaPoolListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryIcaPoolListResponse,
  },
  // Queries a list of InterchainTxStatus items.
interchainTxStatus: {
    path: '/stafihub.stafihub.ledger.Query/InterchainTxStatus',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_ledger_query_pb.QueryInterchainTxStatusRequest,
    responseType: stafihub_ledger_query_pb.QueryInterchainTxStatusResponse,
    requestSerialize: serialize_stafihub_stafihub_ledger_QueryInterchainTxStatusRequest,
    requestDeserialize: deserialize_stafihub_stafihub_ledger_QueryInterchainTxStatusRequest,
    responseSerialize: serialize_stafihub_stafihub_ledger_QueryInterchainTxStatusResponse,
    responseDeserialize: deserialize_stafihub_stafihub_ledger_QueryInterchainTxStatusResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
