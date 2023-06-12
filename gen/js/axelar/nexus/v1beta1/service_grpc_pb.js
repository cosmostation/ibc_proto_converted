// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_nexus_v1beta1_tx_pb = require('../../../axelar/nexus/v1beta1/tx_pb.js');
var axelar_nexus_v1beta1_query_pb = require('../../../axelar/nexus/v1beta1/query_pb.js');

function serialize_axelar_nexus_v1beta1_ActivateChainRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.ActivateChainRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ActivateChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ActivateChainRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.ActivateChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ActivateChainResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.ActivateChainResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ActivateChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ActivateChainResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.ActivateChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_AssetsRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.AssetsRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.AssetsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_AssetsRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.AssetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_AssetsResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.AssetsResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.AssetsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_AssetsResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.AssetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainMaintainersRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainMaintainersRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainMaintainersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainMaintainersRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainMaintainersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainMaintainersResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainMaintainersResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainMaintainersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainMaintainersResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainMaintainersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainStateRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainStateRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainStateRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainStateResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainStateResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainStateResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainsByAssetRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainsByAssetRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainsByAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainsByAssetRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainsByAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainsByAssetResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainsByAssetResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainsByAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainsByAssetResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainsByAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainsRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainsRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainsRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_ChainsResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.ChainsResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.ChainsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_ChainsResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.ChainsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_DeactivateChainRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.DeactivateChainRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.DeactivateChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_DeactivateChainRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.DeactivateChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_DeactivateChainResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.DeactivateChainResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.DeactivateChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_DeactivateChainResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.DeactivateChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_DeregisterChainMaintainerRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.DeregisterChainMaintainerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_DeregisterChainMaintainerRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_DeregisterChainMaintainerResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.DeregisterChainMaintainerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_DeregisterChainMaintainerResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_FeeInfoRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.FeeInfoRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.FeeInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_FeeInfoRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.FeeInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_FeeInfoResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.FeeInfoResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.FeeInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_FeeInfoResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.FeeInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_LatestDepositAddressRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.LatestDepositAddressRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.LatestDepositAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_LatestDepositAddressRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.LatestDepositAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_LatestDepositAddressResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.LatestDepositAddressResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.LatestDepositAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_LatestDepositAddressResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.LatestDepositAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_MessageRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.MessageRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.MessageRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_MessageRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.MessageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_MessageResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.MessageResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.MessageResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_MessageResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.MessageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RecipientAddressRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.RecipientAddressRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RecipientAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RecipientAddressRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.RecipientAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RecipientAddressResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.RecipientAddressResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RecipientAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RecipientAddressResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.RecipientAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RegisterAssetFeeRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RegisterAssetFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RegisterAssetFeeRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RegisterAssetFeeResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RegisterAssetFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RegisterAssetFeeResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RegisterChainMaintainerRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RegisterChainMaintainerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RegisterChainMaintainerRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_RegisterChainMaintainerResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.RegisterChainMaintainerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_RegisterChainMaintainerResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_SetTransferRateLimitRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.SetTransferRateLimitRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_SetTransferRateLimitRequest(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_SetTransferRateLimitResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.SetTransferRateLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_SetTransferRateLimitResponse(buffer_arg) {
  return axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransferFeeRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransferFeeRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransferFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransferFeeRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransferFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransferFeeResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransferFeeResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransferFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransferFeeResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransferFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransferRateLimitRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransferRateLimitRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransferRateLimitRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransferRateLimitRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransferRateLimitRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransferRateLimitResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransferRateLimitResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransferRateLimitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransferRateLimitResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransferRateLimitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransfersForChainRequest(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransfersForChainRequest)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransfersForChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransfersForChainRequest(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransfersForChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_nexus_v1beta1_TransfersForChainResponse(arg) {
  if (!(arg instanceof axelar_nexus_v1beta1_query_pb.TransfersForChainResponse)) {
    throw new Error('Expected argument of type axelar.nexus.v1beta1.TransfersForChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_nexus_v1beta1_TransfersForChainResponse(buffer_arg) {
  return axelar_nexus_v1beta1_query_pb.TransfersForChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the nexus Msg service.
var MsgServiceService = exports.MsgServiceService = {
  registerChainMaintainer: {
    path: '/axelar.nexus.v1beta1.MsgService/RegisterChainMaintainer',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.RegisterChainMaintainerResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_RegisterChainMaintainerRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_RegisterChainMaintainerRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_RegisterChainMaintainerResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_RegisterChainMaintainerResponse,
  },
  deregisterChainMaintainer: {
    path: '/axelar.nexus.v1beta1.MsgService/DeregisterChainMaintainer',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.DeregisterChainMaintainerResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_DeregisterChainMaintainerRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_DeregisterChainMaintainerRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_DeregisterChainMaintainerResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_DeregisterChainMaintainerResponse,
  },
  activateChain: {
    path: '/axelar.nexus.v1beta1.MsgService/ActivateChain',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.ActivateChainRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.ActivateChainResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_ActivateChainRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_ActivateChainRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_ActivateChainResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_ActivateChainResponse,
  },
  deactivateChain: {
    path: '/axelar.nexus.v1beta1.MsgService/DeactivateChain',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.DeactivateChainRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.DeactivateChainResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_DeactivateChainRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_DeactivateChainRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_DeactivateChainResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_DeactivateChainResponse,
  },
  registerAssetFee: {
    path: '/axelar.nexus.v1beta1.MsgService/RegisterAssetFee',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.RegisterAssetFeeResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_RegisterAssetFeeRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_RegisterAssetFeeRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_RegisterAssetFeeResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_RegisterAssetFeeResponse,
  },
  setTransferRateLimit: {
    path: '/axelar.nexus.v1beta1.MsgService/SetTransferRateLimit',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitRequest,
    responseType: axelar_nexus_v1beta1_tx_pb.SetTransferRateLimitResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_SetTransferRateLimitRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_SetTransferRateLimitRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_SetTransferRateLimitResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_SetTransferRateLimitResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// QueryService defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
  // LatestDepositAddress queries the a deposit address by recipient
latestDepositAddress: {
    path: '/axelar.nexus.v1beta1.QueryService/LatestDepositAddress',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.LatestDepositAddressRequest,
    responseType: axelar_nexus_v1beta1_query_pb.LatestDepositAddressResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_LatestDepositAddressRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_LatestDepositAddressRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_LatestDepositAddressResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_LatestDepositAddressResponse,
  },
  // TransfersForChain queries transfers by chain
transfersForChain: {
    path: '/axelar.nexus.v1beta1.QueryService/TransfersForChain',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.TransfersForChainRequest,
    responseType: axelar_nexus_v1beta1_query_pb.TransfersForChainResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_TransfersForChainRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_TransfersForChainRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_TransfersForChainResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_TransfersForChainResponse,
  },
  // FeeInfo queries the fee info by chain and asset
feeInfo: {
    path: '/axelar.nexus.v1beta1.QueryService/FeeInfo',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.FeeInfoRequest,
    responseType: axelar_nexus_v1beta1_query_pb.FeeInfoResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_FeeInfoRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_FeeInfoRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_FeeInfoResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_FeeInfoResponse,
  },
  // TransferFee queries the transfer fee by the source, destination chain,
// and amount. If amount is 0, the min fee is returned
transferFee: {
    path: '/axelar.nexus.v1beta1.QueryService/TransferFee',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.TransferFeeRequest,
    responseType: axelar_nexus_v1beta1_query_pb.TransferFeeResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_TransferFeeRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_TransferFeeRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_TransferFeeResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_TransferFeeResponse,
  },
  // Chains queries the chains registered on the network
chains: {
    path: '/axelar.nexus.v1beta1.QueryService/Chains',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.ChainsRequest,
    responseType: axelar_nexus_v1beta1_query_pb.ChainsResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_ChainsRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_ChainsRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_ChainsResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_ChainsResponse,
  },
  // Assets queries the assets registered for a chain
assets: {
    path: '/axelar.nexus.v1beta1.QueryService/Assets',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.AssetsRequest,
    responseType: axelar_nexus_v1beta1_query_pb.AssetsResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_AssetsRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_AssetsRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_AssetsResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_AssetsResponse,
  },
  // ChainState queries the state of a registered chain on the network
chainState: {
    path: '/axelar.nexus.v1beta1.QueryService/ChainState',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.ChainStateRequest,
    responseType: axelar_nexus_v1beta1_query_pb.ChainStateResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_ChainStateRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_ChainStateRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_ChainStateResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_ChainStateResponse,
  },
  // ChainsByAsset queries the chains that support an asset on the network
chainsByAsset: {
    path: '/axelar.nexus.v1beta1.QueryService/ChainsByAsset',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.ChainsByAssetRequest,
    responseType: axelar_nexus_v1beta1_query_pb.ChainsByAssetResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_ChainsByAssetRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_ChainsByAssetRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_ChainsByAssetResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_ChainsByAssetResponse,
  },
  // RecipientAddress queries the recipient address for a given deposit address
recipientAddress: {
    path: '/axelar.nexus.v1beta1.QueryService/RecipientAddress',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.RecipientAddressRequest,
    responseType: axelar_nexus_v1beta1_query_pb.RecipientAddressResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_RecipientAddressRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_RecipientAddressRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_RecipientAddressResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_RecipientAddressResponse,
  },
  // ChainMaintainers queries the chain maintainers for a given chain
chainMaintainers: {
    path: '/axelar.nexus.v1beta1.QueryService/ChainMaintainers',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.ChainMaintainersRequest,
    responseType: axelar_nexus_v1beta1_query_pb.ChainMaintainersResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_ChainMaintainersRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_ChainMaintainersRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_ChainMaintainersResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_ChainMaintainersResponse,
  },
  // TransferRateLimit queries the transfer rate limit for a given chain and
// asset. If a rate limit is not set, nil is returned.
transferRateLimit: {
    path: '/axelar.nexus.v1beta1.QueryService/TransferRateLimit',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.TransferRateLimitRequest,
    responseType: axelar_nexus_v1beta1_query_pb.TransferRateLimitResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_TransferRateLimitRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_TransferRateLimitRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_TransferRateLimitResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_TransferRateLimitResponse,
  },
  message: {
    path: '/axelar.nexus.v1beta1.QueryService/Message',
    requestStream: false,
    responseStream: false,
    requestType: axelar_nexus_v1beta1_query_pb.MessageRequest,
    responseType: axelar_nexus_v1beta1_query_pb.MessageResponse,
    requestSerialize: serialize_axelar_nexus_v1beta1_MessageRequest,
    requestDeserialize: deserialize_axelar_nexus_v1beta1_MessageRequest,
    responseSerialize: serialize_axelar_nexus_v1beta1_MessageResponse,
    responseDeserialize: deserialize_axelar_nexus_v1beta1_MessageResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
