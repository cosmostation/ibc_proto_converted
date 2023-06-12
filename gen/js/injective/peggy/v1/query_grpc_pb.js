// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_peggy_v1_query_pb = require('../../../injective/peggy/v1/query_pb.js');
var injective_peggy_v1_genesis_pb = require('../../../injective/peggy/v1/genesis_pb.js');
var injective_peggy_v1_params_pb = require('../../../injective/peggy/v1/params_pb.js');
var injective_peggy_v1_types_pb = require('../../../injective/peggy/v1/types_pb.js');
var injective_peggy_v1_msgs_pb = require('../../../injective/peggy/v1/msgs_pb.js');
var injective_peggy_v1_pool_pb = require('../../../injective/peggy/v1/pool_pb.js');
var injective_peggy_v1_batch_pb = require('../../../injective/peggy/v1/batch_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_injective_peggy_v1_MissingNoncesRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.MissingNoncesRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.MissingNoncesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MissingNoncesRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.MissingNoncesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_MissingNoncesResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.MissingNoncesResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.MissingNoncesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_MissingNoncesResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.MissingNoncesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchConfirmsRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchConfirmsRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchConfirmsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchConfirmsRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchConfirmsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchConfirmsResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchConfirmsResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchConfirmsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchConfirmsResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchConfirmsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchFeeRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchFeeRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchFeeRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchFeeResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchFeeResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchFeeResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchRequestByNonceRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchRequestByNonceRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchRequestByNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchRequestByNonceRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchRequestByNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryBatchRequestByNonceResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryBatchRequestByNonceResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryBatchRequestByNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryBatchRequestByNonceResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryBatchRequestByNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryCurrentValsetRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryCurrentValsetRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryCurrentValsetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryCurrentValsetRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryCurrentValsetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryCurrentValsetResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryCurrentValsetResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryCurrentValsetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryCurrentValsetResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryCurrentValsetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByEthAddress(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddress)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByEthAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByEthAddress(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddressResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByEthAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddress(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddress)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByOrchestratorAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddress(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddressResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByOrchestratorAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddressResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddress(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddress)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByValidatorAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddress(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddressResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDelegateKeysByValidatorAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddressResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDenomToERC20Request(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDenomToERC20Request)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDenomToERC20Request');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDenomToERC20Request(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDenomToERC20Request.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryDenomToERC20Response(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryDenomToERC20Response)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryDenomToERC20Response');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryDenomToERC20Response(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryDenomToERC20Response.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryERC20ToDenomRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryERC20ToDenomRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryERC20ToDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryERC20ToDenomRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryERC20ToDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryERC20ToDenomResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryERC20ToDenomResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryERC20ToDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryERC20ToDenomResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryERC20ToDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastEventByAddrRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastEventByAddrRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastEventByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastEventByAddrRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastEventByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastEventByAddrResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastEventByAddrResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastEventByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastEventByAddrResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastEventByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastPendingBatchRequestByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastPendingBatchRequestByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastPendingValsetRequestByAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastPendingValsetRequestByAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastValsetRequestsRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastValsetRequestsRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastValsetRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastValsetRequestsRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastValsetRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryLastValsetRequestsResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryLastValsetRequestsResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryLastValsetRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryLastValsetRequestsResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryLastValsetRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryModuleStateRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryModuleStateResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryOutgoingTxBatchesRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryOutgoingTxBatchesRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryOutgoingTxBatchesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryOutgoingTxBatchesRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryOutgoingTxBatchesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryOutgoingTxBatchesResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryOutgoingTxBatchesResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryOutgoingTxBatchesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryOutgoingTxBatchesResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryOutgoingTxBatchesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryParamsRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryParamsResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryPendingSendToEth(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryPendingSendToEth)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryPendingSendToEth');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryPendingSendToEth(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryPendingSendToEth.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryPendingSendToEthResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryPendingSendToEthResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryPendingSendToEthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryPendingSendToEthResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryPendingSendToEthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetConfirmRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetConfirmRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetConfirmRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetConfirmRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetConfirmRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetConfirmResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetConfirmResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetConfirmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetConfirmResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetConfirmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetConfirmsByNonceRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetConfirmsByNonceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetConfirmsByNonceRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetConfirmsByNonceResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetConfirmsByNonceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetConfirmsByNonceResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetRequestRequest(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetRequestRequest)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetRequestRequest(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_peggy_v1_QueryValsetRequestResponse(arg) {
  if (!(arg instanceof injective_peggy_v1_query_pb.QueryValsetRequestResponse)) {
    throw new Error('Expected argument of type injective.peggy.v1.QueryValsetRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_peggy_v1_QueryValsetRequestResponse(buffer_arg) {
  return injective_peggy_v1_query_pb.QueryValsetRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Deployments queries deployments
params: {
    path: '/injective.peggy.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryParamsRequest,
    responseType: injective_peggy_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryParamsRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryParamsRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryParamsResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryParamsResponse,
  },
  // valset
currentValset: {
    path: '/injective.peggy.v1.Query/CurrentValset',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryCurrentValsetRequest,
    responseType: injective_peggy_v1_query_pb.QueryCurrentValsetResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryCurrentValsetRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryCurrentValsetRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryCurrentValsetResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryCurrentValsetResponse,
  },
  valsetRequest: {
    path: '/injective.peggy.v1.Query/ValsetRequest',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryValsetRequestRequest,
    responseType: injective_peggy_v1_query_pb.QueryValsetRequestResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryValsetRequestRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryValsetRequestRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryValsetRequestResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryValsetRequestResponse,
  },
  valsetConfirm: {
    path: '/injective.peggy.v1.Query/ValsetConfirm',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryValsetConfirmRequest,
    responseType: injective_peggy_v1_query_pb.QueryValsetConfirmResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryValsetConfirmRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryValsetConfirmRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryValsetConfirmResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryValsetConfirmResponse,
  },
  valsetConfirmsByNonce: {
    path: '/injective.peggy.v1.Query/ValsetConfirmsByNonce',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceRequest,
    responseType: injective_peggy_v1_query_pb.QueryValsetConfirmsByNonceResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryValsetConfirmsByNonceRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryValsetConfirmsByNonceRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryValsetConfirmsByNonceResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryValsetConfirmsByNonceResponse,
  },
  lastValsetRequests: {
    path: '/injective.peggy.v1.Query/LastValsetRequests',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryLastValsetRequestsRequest,
    responseType: injective_peggy_v1_query_pb.QueryLastValsetRequestsResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryLastValsetRequestsRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryLastValsetRequestsRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryLastValsetRequestsResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryLastValsetRequestsResponse,
  },
  lastPendingValsetRequestByAddr: {
    path: '/injective.peggy.v1.Query/LastPendingValsetRequestByAddr',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrRequest,
    responseType: injective_peggy_v1_query_pb.QueryLastPendingValsetRequestByAddrResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryLastPendingValsetRequestByAddrResponse,
  },
  // claim
lastEventByAddr: {
    path: '/injective.peggy.v1.Query/LastEventByAddr',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryLastEventByAddrRequest,
    responseType: injective_peggy_v1_query_pb.QueryLastEventByAddrResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryLastEventByAddrRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryLastEventByAddrRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryLastEventByAddrResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryLastEventByAddrResponse,
  },
  // batch
getPendingSendToEth: {
    path: '/injective.peggy.v1.Query/GetPendingSendToEth',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryPendingSendToEth,
    responseType: injective_peggy_v1_query_pb.QueryPendingSendToEthResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryPendingSendToEth,
    requestDeserialize: deserialize_injective_peggy_v1_QueryPendingSendToEth,
    responseSerialize: serialize_injective_peggy_v1_QueryPendingSendToEthResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryPendingSendToEthResponse,
  },
  batchFees: {
    path: '/injective.peggy.v1.Query/BatchFees',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryBatchFeeRequest,
    responseType: injective_peggy_v1_query_pb.QueryBatchFeeResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryBatchFeeRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryBatchFeeRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryBatchFeeResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryBatchFeeResponse,
  },
  outgoingTxBatches: {
    path: '/injective.peggy.v1.Query/OutgoingTxBatches',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryOutgoingTxBatchesRequest,
    responseType: injective_peggy_v1_query_pb.QueryOutgoingTxBatchesResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryOutgoingTxBatchesRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryOutgoingTxBatchesRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryOutgoingTxBatchesResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryOutgoingTxBatchesResponse,
  },
  lastPendingBatchRequestByAddr: {
    path: '/injective.peggy.v1.Query/LastPendingBatchRequestByAddr',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrRequest,
    responseType: injective_peggy_v1_query_pb.QueryLastPendingBatchRequestByAddrResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryLastPendingBatchRequestByAddrResponse,
  },
  batchRequestByNonce: {
    path: '/injective.peggy.v1.Query/BatchRequestByNonce',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryBatchRequestByNonceRequest,
    responseType: injective_peggy_v1_query_pb.QueryBatchRequestByNonceResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryBatchRequestByNonceRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryBatchRequestByNonceRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryBatchRequestByNonceResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryBatchRequestByNonceResponse,
  },
  batchConfirms: {
    path: '/injective.peggy.v1.Query/BatchConfirms',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryBatchConfirmsRequest,
    responseType: injective_peggy_v1_query_pb.QueryBatchConfirmsResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryBatchConfirmsRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryBatchConfirmsRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryBatchConfirmsResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryBatchConfirmsResponse,
  },
  eRC20ToDenom: {
    path: '/injective.peggy.v1.Query/ERC20ToDenom',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryERC20ToDenomRequest,
    responseType: injective_peggy_v1_query_pb.QueryERC20ToDenomResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryERC20ToDenomRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryERC20ToDenomRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryERC20ToDenomResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryERC20ToDenomResponse,
  },
  denomToERC20: {
    path: '/injective.peggy.v1.Query/DenomToERC20',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryDenomToERC20Request,
    responseType: injective_peggy_v1_query_pb.QueryDenomToERC20Response,
    requestSerialize: serialize_injective_peggy_v1_QueryDenomToERC20Request,
    requestDeserialize: deserialize_injective_peggy_v1_QueryDenomToERC20Request,
    responseSerialize: serialize_injective_peggy_v1_QueryDenomToERC20Response,
    responseDeserialize: deserialize_injective_peggy_v1_QueryDenomToERC20Response,
  },
  getDelegateKeyByValidator: {
    path: '/injective.peggy.v1.Query/GetDelegateKeyByValidator',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddress,
    responseType: injective_peggy_v1_query_pb.QueryDelegateKeysByValidatorAddressResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddress,
    requestDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddress,
    responseSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddressResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByValidatorAddressResponse,
  },
  getDelegateKeyByEth: {
    path: '/injective.peggy.v1.Query/GetDelegateKeyByEth',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddress,
    responseType: injective_peggy_v1_query_pb.QueryDelegateKeysByEthAddressResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByEthAddress,
    requestDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByEthAddress,
    responseSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse,
  },
  getDelegateKeyByOrchestrator: {
    path: '/injective.peggy.v1.Query/GetDelegateKeyByOrchestrator',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddress,
    responseType: injective_peggy_v1_query_pb.QueryDelegateKeysByOrchestratorAddressResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddress,
    requestDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddress,
    responseSerialize: serialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddressResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryDelegateKeysByOrchestratorAddressResponse,
  },
  // Retrieves the entire peggy module's state
peggyModuleState: {
    path: '/injective.peggy.v1.Query/PeggyModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.QueryModuleStateRequest,
    responseType: injective_peggy_v1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_peggy_v1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_peggy_v1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_peggy_v1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_peggy_v1_QueryModuleStateResponse,
  },
  missingPeggoNonces: {
    path: '/injective.peggy.v1.Query/MissingPeggoNonces',
    requestStream: false,
    responseStream: false,
    requestType: injective_peggy_v1_query_pb.MissingNoncesRequest,
    responseType: injective_peggy_v1_query_pb.MissingNoncesResponse,
    requestSerialize: serialize_injective_peggy_v1_MissingNoncesRequest,
    requestDeserialize: deserialize_injective_peggy_v1_MissingNoncesRequest,
    responseSerialize: serialize_injective_peggy_v1_MissingNoncesResponse,
    responseDeserialize: deserialize_injective_peggy_v1_MissingNoncesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
