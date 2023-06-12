// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_evm_v1beta1_tx_pb = require('../../../axelar/evm/v1beta1/tx_pb.js');
var axelar_evm_v1beta1_query_pb = require('../../../axelar/evm/v1beta1/query_pb.js');

function serialize_axelar_evm_v1beta1_AddChainRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.AddChainRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.AddChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_AddChainRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.AddChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_AddChainResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.AddChainResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.AddChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_AddChainResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.AddChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BatchedCommandsRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BatchedCommandsRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BatchedCommandsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BatchedCommandsRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BatchedCommandsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BatchedCommandsResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BatchedCommandsResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BatchedCommandsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BatchedCommandsResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BatchedCommandsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BurnerInfoRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BurnerInfoRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BurnerInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BurnerInfoRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BurnerInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BurnerInfoResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BurnerInfoResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BurnerInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BurnerInfoResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BurnerInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BytecodeRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BytecodeRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BytecodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BytecodeRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BytecodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_BytecodeResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.BytecodeResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.BytecodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_BytecodeResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.BytecodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ChainsRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ChainsRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ChainsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ChainsRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ChainsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ChainsResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ChainsResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ChainsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ChainsResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ChainsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CommandRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.CommandRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CommandRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CommandRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.CommandRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CommandResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.CommandResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CommandResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CommandResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.CommandResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmDepositRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmDepositRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmDepositRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmDepositResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmDepositResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmDepositResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmGatewayTxRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmGatewayTxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmGatewayTxRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmGatewayTxResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmGatewayTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmGatewayTxResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmGatewayTxsRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmGatewayTxsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmGatewayTxsRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmGatewayTxsResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmGatewayTxsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmGatewayTxsResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmTokenRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmTokenRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmTokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmTokenRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmTokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmTokenResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmTokenResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmTokenResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmTransferKeyRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmTransferKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmTransferKeyRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmTransferKeyResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmTransferKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmTransferKeyResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmationHeightRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ConfirmationHeightRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmationHeightRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmationHeightRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ConfirmationHeightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ConfirmationHeightResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ConfirmationHeightResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ConfirmationHeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ConfirmationHeightResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ConfirmationHeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateBurnTokensRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateBurnTokensRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateBurnTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateBurnTokensRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateBurnTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateBurnTokensResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateBurnTokensResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateBurnTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateBurnTokensResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateBurnTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateDeployTokenRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateDeployTokenRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateDeployTokenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateDeployTokenRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateDeployTokenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateDeployTokenResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateDeployTokenResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateDeployTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateDeployTokenResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateDeployTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreatePendingTransfersRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreatePendingTransfersRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreatePendingTransfersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreatePendingTransfersRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreatePendingTransfersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreatePendingTransfersResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreatePendingTransfersResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreatePendingTransfersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreatePendingTransfersResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreatePendingTransfersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateTransferOperatorshipRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateTransferOperatorshipRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateTransferOperatorshipRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_CreateTransferOperatorshipResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.CreateTransferOperatorshipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_CreateTransferOperatorshipResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_DepositStateRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.DepositStateRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.DepositStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_DepositStateRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.DepositStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_DepositStateResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.DepositStateResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.DepositStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_DepositStateResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.DepositStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ERC20TokensRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ERC20TokensRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ERC20TokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ERC20TokensRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ERC20TokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_ERC20TokensResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.ERC20TokensResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.ERC20TokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_ERC20TokensResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.ERC20TokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_EventRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.EventRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.EventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_EventRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.EventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_EventResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.EventResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.EventResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_EventResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.EventResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_GatewayAddressRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.GatewayAddressRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.GatewayAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_GatewayAddressRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.GatewayAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_GatewayAddressResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.GatewayAddressResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.GatewayAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_GatewayAddressResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.GatewayAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_KeyAddressRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.KeyAddressRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.KeyAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_KeyAddressRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.KeyAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_KeyAddressResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.KeyAddressResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.KeyAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_KeyAddressResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.KeyAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_LinkRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.LinkRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.LinkRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_LinkRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.LinkRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_LinkResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.LinkResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.LinkResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_LinkResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.LinkResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_PendingCommandsRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.PendingCommandsRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.PendingCommandsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_PendingCommandsRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.PendingCommandsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_PendingCommandsResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.PendingCommandsResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.PendingCommandsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_PendingCommandsResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.PendingCommandsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_RetryFailedEventRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.RetryFailedEventRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.RetryFailedEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_RetryFailedEventRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.RetryFailedEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_RetryFailedEventResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.RetryFailedEventResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.RetryFailedEventResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_RetryFailedEventResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.RetryFailedEventResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_SetGatewayRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.SetGatewayRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.SetGatewayRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_SetGatewayRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.SetGatewayRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_SetGatewayResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.SetGatewayResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.SetGatewayResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_SetGatewayResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.SetGatewayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_SignCommandsRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.SignCommandsRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.SignCommandsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_SignCommandsRequest(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.SignCommandsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_SignCommandsResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_tx_pb.SignCommandsResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.SignCommandsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_SignCommandsResponse(buffer_arg) {
  return axelar_evm_v1beta1_tx_pb.SignCommandsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_TokenInfoRequest(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.TokenInfoRequest)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.TokenInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_TokenInfoRequest(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.TokenInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_evm_v1beta1_TokenInfoResponse(arg) {
  if (!(arg instanceof axelar_evm_v1beta1_query_pb.TokenInfoResponse)) {
    throw new Error('Expected argument of type axelar.evm.v1beta1.TokenInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_evm_v1beta1_TokenInfoResponse(buffer_arg) {
  return axelar_evm_v1beta1_query_pb.TokenInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the evm Msg service.
var MsgServiceService = exports.MsgServiceService = {
  setGateway: {
    path: '/axelar.evm.v1beta1.MsgService/SetGateway',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.SetGatewayRequest,
    responseType: axelar_evm_v1beta1_tx_pb.SetGatewayResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_SetGatewayRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_SetGatewayRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_SetGatewayResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_SetGatewayResponse,
  },
  // Deprecated: use ConfirmGatewayTxs instead
confirmGatewayTx: {
    path: '/axelar.evm.v1beta1.MsgService/ConfirmGatewayTx',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxRequest,
    responseType: axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmGatewayTxRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmGatewayTxRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmGatewayTxResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmGatewayTxResponse,
  },
  confirmGatewayTxs: {
    path: '/axelar.evm.v1beta1.MsgService/ConfirmGatewayTxs',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsRequest,
    responseType: axelar_evm_v1beta1_tx_pb.ConfirmGatewayTxsResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmGatewayTxsRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmGatewayTxsRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmGatewayTxsResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmGatewayTxsResponse,
  },
  link: {
    path: '/axelar.evm.v1beta1.MsgService/Link',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.LinkRequest,
    responseType: axelar_evm_v1beta1_tx_pb.LinkResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_LinkRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_LinkRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_LinkResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_LinkResponse,
  },
  confirmToken: {
    path: '/axelar.evm.v1beta1.MsgService/ConfirmToken',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.ConfirmTokenRequest,
    responseType: axelar_evm_v1beta1_tx_pb.ConfirmTokenResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmTokenRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmTokenRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmTokenResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmTokenResponse,
  },
  confirmDeposit: {
    path: '/axelar.evm.v1beta1.MsgService/ConfirmDeposit',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.ConfirmDepositRequest,
    responseType: axelar_evm_v1beta1_tx_pb.ConfirmDepositResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmDepositRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmDepositRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmDepositResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmDepositResponse,
  },
  confirmTransferKey: {
    path: '/axelar.evm.v1beta1.MsgService/ConfirmTransferKey',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyRequest,
    responseType: axelar_evm_v1beta1_tx_pb.ConfirmTransferKeyResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmTransferKeyRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmTransferKeyRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmTransferKeyResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmTransferKeyResponse,
  },
  createDeployToken: {
    path: '/axelar.evm.v1beta1.MsgService/CreateDeployToken',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.CreateDeployTokenRequest,
    responseType: axelar_evm_v1beta1_tx_pb.CreateDeployTokenResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_CreateDeployTokenRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_CreateDeployTokenRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_CreateDeployTokenResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_CreateDeployTokenResponse,
  },
  createBurnTokens: {
    path: '/axelar.evm.v1beta1.MsgService/CreateBurnTokens',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.CreateBurnTokensRequest,
    responseType: axelar_evm_v1beta1_tx_pb.CreateBurnTokensResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_CreateBurnTokensRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_CreateBurnTokensRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_CreateBurnTokensResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_CreateBurnTokensResponse,
  },
  createPendingTransfers: {
    path: '/axelar.evm.v1beta1.MsgService/CreatePendingTransfers',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.CreatePendingTransfersRequest,
    responseType: axelar_evm_v1beta1_tx_pb.CreatePendingTransfersResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_CreatePendingTransfersRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_CreatePendingTransfersRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_CreatePendingTransfersResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_CreatePendingTransfersResponse,
  },
  createTransferOperatorship: {
    path: '/axelar.evm.v1beta1.MsgService/CreateTransferOperatorship',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipRequest,
    responseType: axelar_evm_v1beta1_tx_pb.CreateTransferOperatorshipResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_CreateTransferOperatorshipRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_CreateTransferOperatorshipRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_CreateTransferOperatorshipResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_CreateTransferOperatorshipResponse,
  },
  signCommands: {
    path: '/axelar.evm.v1beta1.MsgService/SignCommands',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.SignCommandsRequest,
    responseType: axelar_evm_v1beta1_tx_pb.SignCommandsResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_SignCommandsRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_SignCommandsRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_SignCommandsResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_SignCommandsResponse,
  },
  addChain: {
    path: '/axelar.evm.v1beta1.MsgService/AddChain',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.AddChainRequest,
    responseType: axelar_evm_v1beta1_tx_pb.AddChainResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_AddChainRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_AddChainRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_AddChainResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_AddChainResponse,
  },
  retryFailedEvent: {
    path: '/axelar.evm.v1beta1.MsgService/RetryFailedEvent',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_tx_pb.RetryFailedEventRequest,
    responseType: axelar_evm_v1beta1_tx_pb.RetryFailedEventResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_RetryFailedEventRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_RetryFailedEventRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_RetryFailedEventResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_RetryFailedEventResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// QueryService defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
  // BatchedCommands queries the batched commands for a specified chain and
// BatchedCommandsID if no BatchedCommandsID is specified, then it returns the
// latest batched commands
batchedCommands: {
    path: '/axelar.evm.v1beta1.QueryService/BatchedCommands',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.BatchedCommandsRequest,
    responseType: axelar_evm_v1beta1_query_pb.BatchedCommandsResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_BatchedCommandsRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_BatchedCommandsRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_BatchedCommandsResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_BatchedCommandsResponse,
  },
  // BurnerInfo queries the burner info for the specified address
burnerInfo: {
    path: '/axelar.evm.v1beta1.QueryService/BurnerInfo',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.BurnerInfoRequest,
    responseType: axelar_evm_v1beta1_query_pb.BurnerInfoResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_BurnerInfoRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_BurnerInfoRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_BurnerInfoResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_BurnerInfoResponse,
  },
  // ConfirmationHeight queries the confirmation height for the specified chain
confirmationHeight: {
    path: '/axelar.evm.v1beta1.QueryService/ConfirmationHeight',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.ConfirmationHeightRequest,
    responseType: axelar_evm_v1beta1_query_pb.ConfirmationHeightResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ConfirmationHeightRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ConfirmationHeightRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ConfirmationHeightResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ConfirmationHeightResponse,
  },
  // DepositState queries the state of the specified deposit
depositState: {
    path: '/axelar.evm.v1beta1.QueryService/DepositState',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.DepositStateRequest,
    responseType: axelar_evm_v1beta1_query_pb.DepositStateResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_DepositStateRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_DepositStateRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_DepositStateResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_DepositStateResponse,
  },
  // PendingCommands queries the pending commands for the specified chain
pendingCommands: {
    path: '/axelar.evm.v1beta1.QueryService/PendingCommands',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.PendingCommandsRequest,
    responseType: axelar_evm_v1beta1_query_pb.PendingCommandsResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_PendingCommandsRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_PendingCommandsRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_PendingCommandsResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_PendingCommandsResponse,
  },
  // Chains queries the available evm chains
chains: {
    path: '/axelar.evm.v1beta1.QueryService/Chains',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.ChainsRequest,
    responseType: axelar_evm_v1beta1_query_pb.ChainsResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ChainsRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ChainsRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ChainsResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ChainsResponse,
  },
  // Command queries the command of a chain provided the command id
command: {
    path: '/axelar.evm.v1beta1.QueryService/Command',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.CommandRequest,
    responseType: axelar_evm_v1beta1_query_pb.CommandResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_CommandRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_CommandRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_CommandResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_CommandResponse,
  },
  // KeyAddress queries the address of key of a chain
keyAddress: {
    path: '/axelar.evm.v1beta1.QueryService/KeyAddress',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.KeyAddressRequest,
    responseType: axelar_evm_v1beta1_query_pb.KeyAddressResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_KeyAddressRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_KeyAddressRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_KeyAddressResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_KeyAddressResponse,
  },
  // GatewayAddress queries the address of axelar gateway at the specified
// chain
gatewayAddress: {
    path: '/axelar.evm.v1beta1.QueryService/GatewayAddress',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.GatewayAddressRequest,
    responseType: axelar_evm_v1beta1_query_pb.GatewayAddressResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_GatewayAddressRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_GatewayAddressRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_GatewayAddressResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_GatewayAddressResponse,
  },
  // Bytecode queries the bytecode of a specified gateway at the specified
// chain
bytecode: {
    path: '/axelar.evm.v1beta1.QueryService/Bytecode',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.BytecodeRequest,
    responseType: axelar_evm_v1beta1_query_pb.BytecodeResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_BytecodeRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_BytecodeRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_BytecodeResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_BytecodeResponse,
  },
  // Event queries an event at the specified chain
event: {
    path: '/axelar.evm.v1beta1.QueryService/Event',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.EventRequest,
    responseType: axelar_evm_v1beta1_query_pb.EventResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_EventRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_EventRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_EventResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_EventResponse,
  },
  // ERC20Tokens queries the ERC20 tokens registered for a chain
eRC20Tokens: {
    path: '/axelar.evm.v1beta1.QueryService/ERC20Tokens',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.ERC20TokensRequest,
    responseType: axelar_evm_v1beta1_query_pb.ERC20TokensResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_ERC20TokensRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_ERC20TokensRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_ERC20TokensResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_ERC20TokensResponse,
  },
  // TokenInfo queries the token info for a registered ERC20 Token
tokenInfo: {
    path: '/axelar.evm.v1beta1.QueryService/TokenInfo',
    requestStream: false,
    responseStream: false,
    requestType: axelar_evm_v1beta1_query_pb.TokenInfoRequest,
    responseType: axelar_evm_v1beta1_query_pb.TokenInfoResponse,
    requestSerialize: serialize_axelar_evm_v1beta1_TokenInfoRequest,
    requestDeserialize: deserialize_axelar_evm_v1beta1_TokenInfoRequest,
    responseSerialize: serialize_axelar_evm_v1beta1_TokenInfoResponse,
    responseDeserialize: deserialize_axelar_evm_v1beta1_TokenInfoResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
