// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_entity_v1beta1_tx_pb = require('../../../ixo/entity/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var ixo_iid_v1beta1_iid_pb = require('../../../ixo/iid/v1beta1/iid_pb.js');
var ixo_iid_v1beta1_tx_pb = require('../../../ixo/iid/v1beta1/tx_pb.js');
var ixo_iid_v1beta1_types_pb = require('../../../ixo/iid/v1beta1/types_pb.js');
var ixo_entity_v1beta1_entity_pb = require('../../../ixo/entity/v1beta1/entity_pb.js');
var ixo_entity_v1beta1_cosmos_pb = require('../../../ixo/entity/v1beta1/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_ixo_entity_v1beta1_MsgCreateEntity(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgCreateEntity)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgCreateEntity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgCreateEntity(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgCreateEntity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgCreateEntityAccount(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccount)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgCreateEntityAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgCreateEntityAccount(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgCreateEntityAccountResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccountResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgCreateEntityAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgCreateEntityAccountResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgCreateEntityResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgCreateEntityResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgCreateEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgCreateEntityResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgCreateEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthz(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthz)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgGrantEntityAccountAuthz');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthz(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthz.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthzResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthzResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgGrantEntityAccountAuthzResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthzResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthzResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgTransferEntity(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgTransferEntity)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgTransferEntity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgTransferEntity(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgTransferEntity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgTransferEntityResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgTransferEntityResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgTransferEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgTransferEntityResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgTransferEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgUpdateEntity(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgUpdateEntity)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgUpdateEntity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgUpdateEntity(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgUpdateEntity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgUpdateEntityResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgUpdateEntityResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgUpdateEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgUpdateEntityResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgUpdateEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgUpdateEntityVerified(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerified)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgUpdateEntityVerified');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgUpdateEntityVerified(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerified.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_MsgUpdateEntityVerifiedResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerifiedResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.MsgUpdateEntityVerifiedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_MsgUpdateEntityVerifiedResponse(buffer_arg) {
  return ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerifiedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the project Msg service.
var MsgService = exports.MsgService = {
  // CreateEntity defines a method for creating a entity.
createEntity: {
    path: '/ixo.entity.v1beta1.Msg/CreateEntity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgCreateEntity,
    responseType: ixo_entity_v1beta1_tx_pb.MsgCreateEntityResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgCreateEntity,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgCreateEntity,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgCreateEntityResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgCreateEntityResponse,
  },
  // UpdateEntity defines a method for updating a entity
updateEntity: {
    path: '/ixo.entity.v1beta1.Msg/UpdateEntity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgUpdateEntity,
    responseType: ixo_entity_v1beta1_tx_pb.MsgUpdateEntityResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgUpdateEntity,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgUpdateEntity,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgUpdateEntityResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgUpdateEntityResponse,
  },
  // UpdateEntityVerified defines a method for updating if an entity is verified
updateEntityVerified: {
    path: '/ixo.entity.v1beta1.Msg/UpdateEntityVerified',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerified,
    responseType: ixo_entity_v1beta1_tx_pb.MsgUpdateEntityVerifiedResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgUpdateEntityVerified,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgUpdateEntityVerified,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgUpdateEntityVerifiedResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgUpdateEntityVerifiedResponse,
  },
  // Transfers an entity and its nft to the recipient
transferEntity: {
    path: '/ixo.entity.v1beta1.Msg/TransferEntity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgTransferEntity,
    responseType: ixo_entity_v1beta1_tx_pb.MsgTransferEntityResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgTransferEntity,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgTransferEntity,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgTransferEntityResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgTransferEntityResponse,
  },
  // Create a module account for an entity,
createEntityAccount: {
    path: '/ixo.entity.v1beta1.Msg/CreateEntityAccount',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccount,
    responseType: ixo_entity_v1beta1_tx_pb.MsgCreateEntityAccountResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgCreateEntityAccount,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgCreateEntityAccount,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgCreateEntityAccountResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgCreateEntityAccountResponse,
  },
  // Create a authz grant from entity account
grantEntityAccountAuthz: {
    path: '/ixo.entity.v1beta1.Msg/GrantEntityAccountAuthz',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthz,
    responseType: ixo_entity_v1beta1_tx_pb.MsgGrantEntityAccountAuthzResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthz,
    requestDeserialize: deserialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthz,
    responseSerialize: serialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthzResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_MsgGrantEntityAccountAuthzResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
