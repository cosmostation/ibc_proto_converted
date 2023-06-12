// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_marker_v1_tx_pb = require('../../../provenance/marker/v1/tx_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var ibc_applications_transfer_v1_tx_pb = require('../../../ibc/applications/transfer/v1/tx_pb.js');
var provenance_marker_v1_marker_pb = require('../../../provenance/marker/v1/marker_pb.js');
var provenance_marker_v1_accessgrant_pb = require('../../../provenance/marker/v1/accessgrant_pb.js');

function serialize_provenance_marker_v1_MsgActivateRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgActivateRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgActivateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgActivateRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgActivateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgActivateResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgActivateResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgActivateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgActivateResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgActivateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddAccessRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddAccessRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddAccessRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddAccessResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddAccessResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddAccessResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddMarkerRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddMarkerRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddMarkerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddMarkerRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddMarkerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgAddMarkerResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgAddMarkerResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgAddMarkerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgAddMarkerResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgAddMarkerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgBurnRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgBurnRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgBurnRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgBurnRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgBurnRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgBurnResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgBurnResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgCancelRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgCancelRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgCancelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgCancelRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgCancelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgCancelResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgCancelResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgCancelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgCancelResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgCancelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgDeleteAccessRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgDeleteAccessRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgDeleteAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgDeleteAccessRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgDeleteAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgDeleteAccessResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgDeleteAccessResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgDeleteAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgDeleteAccessResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgDeleteAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgDeleteRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgDeleteRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgDeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgDeleteRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgDeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgDeleteResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgDeleteResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgDeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgDeleteResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgDeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgFinalizeRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgFinalizeRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgFinalizeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgFinalizeRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgFinalizeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgFinalizeResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgFinalizeResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgFinalizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgFinalizeResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgFinalizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgGrantAllowanceRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgGrantAllowanceRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgGrantAllowanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgGrantAllowanceRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgGrantAllowanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgGrantAllowanceResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgGrantAllowanceResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgGrantAllowanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgGrantAllowanceResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgGrantAllowanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgIbcTransferRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgIbcTransferRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgIbcTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgIbcTransferRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgIbcTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgIbcTransferResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgIbcTransferResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgIbcTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgIbcTransferResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgIbcTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgMintRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgMintRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgMintRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgMintResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgMintResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSetAccountDataRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSetAccountDataRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSetAccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSetAccountDataRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSetAccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSetAccountDataResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSetAccountDataResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSetAccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSetAccountDataResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSetAccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSetDenomMetadataRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSetDenomMetadataRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSetDenomMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSetDenomMetadataRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSetDenomMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSetDenomMetadataResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSetDenomMetadataResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSetDenomMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSetDenomMetadataResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSetDenomMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSupplyIncreaseProposalRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSupplyIncreaseProposalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSupplyIncreaseProposalRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgSupplyIncreaseProposalResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgSupplyIncreaseProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgSupplyIncreaseProposalResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgTransferRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgTransferRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgTransferRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgTransferResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgTransferResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgTransferResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgUpdateForcedTransferRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgUpdateForcedTransferRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgUpdateForcedTransferRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgUpdateForcedTransferRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgUpdateForcedTransferRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgUpdateForcedTransferResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgUpdateForcedTransferResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgUpdateForcedTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgUpdateForcedTransferResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgUpdateForcedTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgUpdateRequiredAttributesRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgUpdateRequiredAttributesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgUpdateRequiredAttributesRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgUpdateRequiredAttributesResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgUpdateRequiredAttributesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgUpdateRequiredAttributesResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgWithdrawRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgWithdrawRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgWithdrawRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgWithdrawRequest(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgWithdrawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_MsgWithdrawResponse(buffer_arg) {
  return provenance_marker_v1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Marker Msg service.
var MsgService = exports.MsgService = {
  // Finalize
finalize: {
    path: '/provenance.marker.v1.Msg/Finalize',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgFinalizeRequest,
    responseType: provenance_marker_v1_tx_pb.MsgFinalizeResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgFinalizeRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgFinalizeRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgFinalizeResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgFinalizeResponse,
  },
  // Activate
activate: {
    path: '/provenance.marker.v1.Msg/Activate',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgActivateRequest,
    responseType: provenance_marker_v1_tx_pb.MsgActivateResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgActivateRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgActivateRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgActivateResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgActivateResponse,
  },
  // Cancel
cancel: {
    path: '/provenance.marker.v1.Msg/Cancel',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgCancelRequest,
    responseType: provenance_marker_v1_tx_pb.MsgCancelResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgCancelRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgCancelRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgCancelResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgCancelResponse,
  },
  // Delete
delete: {
    path: '/provenance.marker.v1.Msg/Delete',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgDeleteRequest,
    responseType: provenance_marker_v1_tx_pb.MsgDeleteResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgDeleteRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgDeleteRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgDeleteResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgDeleteResponse,
  },
  // Mint
mint: {
    path: '/provenance.marker.v1.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgMintRequest,
    responseType: provenance_marker_v1_tx_pb.MsgMintResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgMintRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgMintRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgMintResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgMintResponse,
  },
  // Burn
burn: {
    path: '/provenance.marker.v1.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgBurnRequest,
    responseType: provenance_marker_v1_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgBurnRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgBurnRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgBurnResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgBurnResponse,
  },
  // AddAccess
addAccess: {
    path: '/provenance.marker.v1.Msg/AddAccess',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgAddAccessRequest,
    responseType: provenance_marker_v1_tx_pb.MsgAddAccessResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgAddAccessRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgAddAccessRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgAddAccessResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgAddAccessResponse,
  },
  // DeleteAccess
deleteAccess: {
    path: '/provenance.marker.v1.Msg/DeleteAccess',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgDeleteAccessRequest,
    responseType: provenance_marker_v1_tx_pb.MsgDeleteAccessResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgDeleteAccessRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgDeleteAccessRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgDeleteAccessResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgDeleteAccessResponse,
  },
  // Withdraw
withdraw: {
    path: '/provenance.marker.v1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgWithdrawRequest,
    responseType: provenance_marker_v1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgWithdrawRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgWithdrawRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgWithdrawResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgWithdrawResponse,
  },
  // AddMarker
addMarker: {
    path: '/provenance.marker.v1.Msg/AddMarker',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgAddMarkerRequest,
    responseType: provenance_marker_v1_tx_pb.MsgAddMarkerResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgAddMarkerRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgAddMarkerRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgAddMarkerResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgAddMarkerResponse,
  },
  // Transfer marker denominated coin between accounts
transfer: {
    path: '/provenance.marker.v1.Msg/Transfer',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgTransferRequest,
    responseType: provenance_marker_v1_tx_pb.MsgTransferResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgTransferRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgTransferRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgTransferResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgTransferResponse,
  },
  // Transfer over ibc any marker(including restricted markers) between ibc accounts.
// The relayer is still needed to accomplish ibc middleware relays.
ibcTransfer: {
    path: '/provenance.marker.v1.Msg/IbcTransfer',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgIbcTransferRequest,
    responseType: provenance_marker_v1_tx_pb.MsgIbcTransferResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgIbcTransferRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgIbcTransferRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgIbcTransferResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgIbcTransferResponse,
  },
  // Allows Denom Metadata (see bank module) to be set for the Marker's Denom
setDenomMetadata: {
    path: '/provenance.marker.v1.Msg/SetDenomMetadata',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgSetDenomMetadataRequest,
    responseType: provenance_marker_v1_tx_pb.MsgSetDenomMetadataResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgSetDenomMetadataRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgSetDenomMetadataRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgSetDenomMetadataResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgSetDenomMetadataResponse,
  },
  // GrantAllowance grants fee allowance to the grantee on the granter's
// account with the provided expiration time.
grantAllowance: {
    path: '/provenance.marker.v1.Msg/GrantAllowance',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgGrantAllowanceRequest,
    responseType: provenance_marker_v1_tx_pb.MsgGrantAllowanceResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgGrantAllowanceRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgGrantAllowanceRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgGrantAllowanceResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgGrantAllowanceResponse,
  },
  // AddFinalizeActivateMarker
addFinalizeActivateMarker: {
    path: '/provenance.marker.v1.Msg/AddFinalizeActivateMarker',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerRequest,
    responseType: provenance_marker_v1_tx_pb.MsgAddFinalizeActivateMarkerResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgAddFinalizeActivateMarkerResponse,
  },
  // SupplyIncreaseProposal can only be called via gov proposal
supplyIncreaseProposal: {
    path: '/provenance.marker.v1.Msg/SupplyIncreaseProposal',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalRequest,
    responseType: provenance_marker_v1_tx_pb.MsgSupplyIncreaseProposalResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgSupplyIncreaseProposalRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgSupplyIncreaseProposalRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgSupplyIncreaseProposalResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgSupplyIncreaseProposalResponse,
  },
  // UpdateRequiredAttributes will only succeed if signer has transfer authority
updateRequiredAttributes: {
    path: '/provenance.marker.v1.Msg/UpdateRequiredAttributes',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesRequest,
    responseType: provenance_marker_v1_tx_pb.MsgUpdateRequiredAttributesResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgUpdateRequiredAttributesRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgUpdateRequiredAttributesRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgUpdateRequiredAttributesResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgUpdateRequiredAttributesResponse,
  },
  // UpdateForcedTransfer updates the allow_forced_transfer field of a marker via governance proposal.
updateForcedTransfer: {
    path: '/provenance.marker.v1.Msg/UpdateForcedTransfer',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgUpdateForcedTransferRequest,
    responseType: provenance_marker_v1_tx_pb.MsgUpdateForcedTransferResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgUpdateForcedTransferRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgUpdateForcedTransferRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgUpdateForcedTransferResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgUpdateForcedTransferResponse,
  },
  // SetAccountData sets the accountdata for a denom. Signer must have deposit authority.
setAccountData: {
    path: '/provenance.marker.v1.Msg/SetAccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_tx_pb.MsgSetAccountDataRequest,
    responseType: provenance_marker_v1_tx_pb.MsgSetAccountDataResponse,
    requestSerialize: serialize_provenance_marker_v1_MsgSetAccountDataRequest,
    requestDeserialize: deserialize_provenance_marker_v1_MsgSetAccountDataRequest,
    responseSerialize: serialize_provenance_marker_v1_MsgSetAccountDataResponse,
    responseDeserialize: deserialize_provenance_marker_v1_MsgSetAccountDataResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
