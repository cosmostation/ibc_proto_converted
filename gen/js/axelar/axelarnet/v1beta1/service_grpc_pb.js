// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_axelarnet_v1beta1_tx_pb = require('../../../axelar/axelarnet/v1beta1/tx_pb.js');
var axelar_axelarnet_v1beta1_query_pb = require('../../../axelar/axelarnet/v1beta1/query_pb.js');

function serialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.AddCosmosBasedChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.AddCosmosBasedChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_CallContractRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.CallContractRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.CallContractRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_CallContractRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.CallContractRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_CallContractResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.CallContractResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.CallContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_CallContractResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.CallContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_ConfirmDepositRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.ConfirmDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_ConfirmDepositRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_ConfirmDepositResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.ConfirmDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_ConfirmDepositResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.ExecutePendingTransfersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_LinkRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.LinkRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.LinkRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_LinkRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.LinkRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_LinkResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.LinkResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.LinkResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_LinkResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.LinkResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.PendingIBCTransferCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.PendingIBCTransferCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RegisterAssetRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RegisterAssetRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RegisterAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RegisterAssetRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RegisterAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RegisterAssetResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RegisterAssetResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RegisterAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RegisterAssetResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RegisterAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RegisterFeeCollectorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RegisterFeeCollectorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RetryIBCTransferRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RetryIBCTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RetryIBCTransferRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RetryIBCTransferResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RetryIBCTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RetryIBCTransferResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RouteIBCTransfersRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RouteIBCTransfersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RouteIBCTransfersRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RouteIBCTransfersResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RouteIBCTransfersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RouteIBCTransfersResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RouteMessageRequest(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RouteMessageRequest)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RouteMessageRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RouteMessageRequest(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RouteMessageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_axelarnet_v1beta1_RouteMessageResponse(arg) {
  if (!(arg instanceof axelar_axelarnet_v1beta1_tx_pb.RouteMessageResponse)) {
    throw new Error('Expected argument of type axelar.axelarnet.v1beta1.RouteMessageResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_axelarnet_v1beta1_RouteMessageResponse(buffer_arg) {
  return axelar_axelarnet_v1beta1_tx_pb.RouteMessageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the axelarnet Msg service.
var MsgServiceService = exports.MsgServiceService = {
  link: {
    path: '/axelar.axelarnet.v1beta1.MsgService/Link',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.LinkRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.LinkResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_LinkRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_LinkRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_LinkResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_LinkResponse,
  },
  confirmDeposit: {
    path: '/axelar.axelarnet.v1beta1.MsgService/ConfirmDeposit',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.ConfirmDepositResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_ConfirmDepositRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_ConfirmDepositRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_ConfirmDepositResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_ConfirmDepositResponse,
  },
  executePendingTransfers: {
    path: '/axelar.axelarnet.v1beta1.MsgService/ExecutePendingTransfers',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.ExecutePendingTransfersResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_ExecutePendingTransfersResponse,
  },
  addCosmosBasedChain: {
    path: '/axelar.axelarnet.v1beta1.MsgService/AddCosmosBasedChain',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.AddCosmosBasedChainResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_AddCosmosBasedChainResponse,
  },
  registerAsset: {
    path: '/axelar.axelarnet.v1beta1.MsgService/RegisterAsset',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.RegisterAssetRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.RegisterAssetResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_RegisterAssetRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_RegisterAssetRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_RegisterAssetResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_RegisterAssetResponse,
  },
  routeIBCTransfers: {
    path: '/axelar.axelarnet.v1beta1.MsgService/RouteIBCTransfers',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.RouteIBCTransfersResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_RouteIBCTransfersRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_RouteIBCTransfersRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_RouteIBCTransfersResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_RouteIBCTransfersResponse,
  },
  registerFeeCollector: {
    path: '/axelar.axelarnet.v1beta1.MsgService/RegisterFeeCollector',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.RegisterFeeCollectorResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_RegisterFeeCollectorResponse,
  },
  retryIBCTransfer: {
    path: '/axelar.axelarnet.v1beta1.MsgService/RetryIBCTransfer',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.RetryIBCTransferResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_RetryIBCTransferRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_RetryIBCTransferRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_RetryIBCTransferResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_RetryIBCTransferResponse,
  },
  routeMessage: {
    path: '/axelar.axelarnet.v1beta1.MsgService/RouteMessage',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.RouteMessageRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.RouteMessageResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_RouteMessageRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_RouteMessageRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_RouteMessageResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_RouteMessageResponse,
  },
  callContract: {
    path: '/axelar.axelarnet.v1beta1.MsgService/CallContract',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_tx_pb.CallContractRequest,
    responseType: axelar_axelarnet_v1beta1_tx_pb.CallContractResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_CallContractRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_CallContractRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_CallContractResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_CallContractResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// QueryService defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
  // PendingIBCTransferCount queries the pending ibc transfers for all chains
pendingIBCTransferCount: {
    path: '/axelar.axelarnet.v1beta1.QueryService/PendingIBCTransferCount',
    requestStream: false,
    responseStream: false,
    requestType: axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountRequest,
    responseType: axelar_axelarnet_v1beta1_query_pb.PendingIBCTransferCountResponse,
    requestSerialize: serialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountRequest,
    requestDeserialize: deserialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountRequest,
    responseSerialize: serialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountResponse,
    responseDeserialize: deserialize_axelar_axelarnet_v1beta1_PendingIBCTransferCountResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
