// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_ecocredit_v1alpha2_tx_pb = require('../../../regen/ecocredit/v1alpha2/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var regen_ecocredit_v1alpha2_types_pb = require('../../../regen/ecocredit/v1alpha2/types_pb.js');

function serialize_regen_ecocredit_v1alpha2_MsgAddToBasket(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasket)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgAddToBasket');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgAddToBasket(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasket.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgAddToBasketResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasketResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgAddToBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgAddToBasketResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgAllowAskDenom(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenom)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgAllowAskDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgAllowAskDenom(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgAllowAskDenomResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenomResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgAllowAskDenomResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgBuy(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgBuy)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgBuy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgBuy(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgBuy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgBuyResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgBuyResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgBuyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgBuyResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgBuyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCancel(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCancel)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCancel');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCancel(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCancel.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCancelResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCancelResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCancelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCancelResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCancelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateBasket(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasket)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateBasket');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateBasket(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasket.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateBasketResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasketResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateBasketResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateBatch(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatch)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateBatch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateBatch(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateBatchResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatchResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateBatchResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateClass(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateClass)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateClass');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateClass(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateClass.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateClassResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateClassResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateClassResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateProject(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateProject)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateProject');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateProject(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateProject.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgCreateProjectResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgCreateProjectResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgCreateProjectResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgCreateProjectResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgCreateProjectResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgPickFromBasket(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasket)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgPickFromBasket');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgPickFromBasket(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasket.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgPickFromBasketResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasketResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgPickFromBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgPickFromBasketResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgRetire(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgRetire)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgRetire');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgRetire(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgRetire.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgRetireResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgRetireResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgRetireResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgRetireResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgRetireResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgSell(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgSell)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgSell');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgSell(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgSell.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgSellResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgSellResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgSellResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgSellResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgSellResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgSend(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgSend)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgSend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgSend(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgSend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgSendResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgSendResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgSendResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgTakeFromBasket(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasket)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgTakeFromBasket');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgTakeFromBasket(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasket.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgTakeFromBasketResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasketResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgTakeFromBasketResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdmin(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdmin)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassAdmin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdmin(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdmin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdminResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdminResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdminResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdminResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuers(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuers)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassIssuers');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuers(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuers.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuersResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuersResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuersResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadata)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadataResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadataResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadataResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrders(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrders)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateSellOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrders(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrdersResponse(arg) {
  if (!(arg instanceof regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrdersResponse)) {
    throw new Error('Expected argument of type regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrdersResponse(buffer_arg) {
  return regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg is the regen.ecocredit.v1alpha1 Msg service.
var MsgService = exports.MsgService = {
  // CreateClass creates a new credit class with an approved list of issuers and
// optional metadata.
createClass: {
    path: '/regen.ecocredit.v1alpha2.Msg/CreateClass',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateClass,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateClassResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateClass,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateClass,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateClassResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateClassResponse,
  },
  // CreateProject creates a new project within a credit class.
createProject: {
    path: '/regen.ecocredit.v1alpha2.Msg/CreateProject',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateProject,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateProjectResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateProject,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateProject,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateProjectResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateProjectResponse,
  },
  // CreateBatch creates a new batch of credits for an existing project.
// This will create a new batch denom with a fixed supply. Issued credits can
// be distributed to recipients in either tradable or retired form.
createBatch: {
    path: '/regen.ecocredit.v1alpha2.Msg/CreateBatch',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatch,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateBatchResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateBatch,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateBatch,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateBatchResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateBatchResponse,
  },
  // Send sends tradable credits from one account to another account. Sent
// credits can either be tradable or retired on receipt.
send: {
    path: '/regen.ecocredit.v1alpha2.Msg/Send',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgSend,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgSendResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgSend,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgSend,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgSendResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgSendResponse,
  },
  // Retire retires a specified number of credits in the holder's account.
retire: {
    path: '/regen.ecocredit.v1alpha2.Msg/Retire',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgRetire,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgRetireResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgRetire,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgRetire,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgRetireResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgRetireResponse,
  },
  // Cancel removes a number of credits from the holder's account and also
// deducts them from the tradable supply, effectively cancelling their
// issuance on Regen Ledger
cancel: {
    path: '/regen.ecocredit.v1alpha2.Msg/Cancel',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgCancel,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgCancelResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgCancel,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCancel,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgCancelResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCancelResponse,
  },
  // UpdateClassAdmin updates the credit class admin
updateClassAdmin: {
    path: '/regen.ecocredit.v1alpha2.Msg/UpdateClassAdmin',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdmin,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassAdminResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdmin,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdmin,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdminResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassAdminResponse,
  },
  // UpdateClassIssuers updates the credit class issuer list
updateClassIssuers: {
    path: '/regen.ecocredit.v1alpha2.Msg/UpdateClassIssuers',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuers,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassIssuersResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuers,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuers,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuersResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassIssuersResponse,
  },
  // UpdateClassMetadata updates the credit class metadata
updateClassMetadata: {
    path: '/regen.ecocredit.v1alpha2.Msg/UpdateClassMetadata',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadata,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateClassMetadataResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadata,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadataResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateClassMetadataResponse,
  },
  // Sell creates new sell orders.
sell: {
    path: '/regen.ecocredit.v1alpha2.Msg/Sell',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgSell,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgSellResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgSell,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgSell,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgSellResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgSellResponse,
  },
  // UpdateSellOrders updates existing sell orders.
updateSellOrders: {
    path: '/regen.ecocredit.v1alpha2.Msg/UpdateSellOrders',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrders,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgUpdateSellOrdersResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrders,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrders,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrdersResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgUpdateSellOrdersResponse,
  },
  // Buy creates credit buy orders.
buy: {
    path: '/regen.ecocredit.v1alpha2.Msg/Buy',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgBuy,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgBuyResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgBuy,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgBuy,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgBuyResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgBuyResponse,
  },
  // AllowAskDenom is a governance operation which authorizes a new ask denom to be used in sell orders
allowAskDenom: {
    path: '/regen.ecocredit.v1alpha2.Msg/AllowAskDenom',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenom,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgAllowAskDenomResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgAllowAskDenom,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgAllowAskDenom,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgAllowAskDenomResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgAllowAskDenomResponse,
  },
  // CreateBasket creates a bank denom which wraps credits.
createBasket: {
    path: '/regen.ecocredit.v1alpha2.Msg/CreateBasket',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasket,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgCreateBasketResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateBasket,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateBasket,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgCreateBasketResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgCreateBasketResponse,
  },
  // AddToBasket adds credits to a basket in return for basket tokens.
addToBasket: {
    path: '/regen.ecocredit.v1alpha2.Msg/AddToBasket',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasket,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgAddToBasketResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgAddToBasket,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgAddToBasket,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgAddToBasketResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgAddToBasketResponse,
  },
  // TakeFromBasket takes credits from a basket without regard for which
// credits they are. The credits will be auto-retired if disable_auto_retire
// is false. Credits will be chosen randomly using the previous block hash
// as a consensus source of randomness.
// More concretely, the implementation is as follows:
// - take the previous block hash and convert it into an uint64,
// - given the total number of different credits within the basket `n`, the
//   first credits that will get picked correspond to: hash modulo n (in
//   terms of order),
// - then if we need to take more credits, we get some from the next one and
//   so on.
takeFromBasket: {
    path: '/regen.ecocredit.v1alpha2.Msg/TakeFromBasket',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasket,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgTakeFromBasketResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgTakeFromBasket,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgTakeFromBasket,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgTakeFromBasketResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgTakeFromBasketResponse,
  },
  // PickFromBasket picks specific credits from a basket. If allow_picking is
// set to false, then only an address which deposited credits in the basket
// can pick those credits. All other addresses will be blocked from picking
// those credits. The credits will be auto-retired if disable_auto_retire is
// false unless the credits were previously put into the basket by the
// address picking them from the basket, in which case they will remain
// tradable. This functionality allows the owner of a credit to have more
// control over the credits they are putting in baskets then ordinary users
// to deal with the scenario where basket tokens end up being worth
// significantly less than the credits on their own.
pickFromBasket: {
    path: '/regen.ecocredit.v1alpha2.Msg/PickFromBasket',
    requestStream: false,
    responseStream: false,
    requestType: regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasket,
    responseType: regen_ecocredit_v1alpha2_tx_pb.MsgPickFromBasketResponse,
    requestSerialize: serialize_regen_ecocredit_v1alpha2_MsgPickFromBasket,
    requestDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgPickFromBasket,
    responseSerialize: serialize_regen_ecocredit_v1alpha2_MsgPickFromBasketResponse,
    responseDeserialize: deserialize_regen_ecocredit_v1alpha2_MsgPickFromBasketResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
