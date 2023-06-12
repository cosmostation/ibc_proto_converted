// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_metadata_v1_tx_pb = require('../../../provenance/metadata/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var provenance_metadata_v1_metadata_pb = require('../../../provenance/metadata/v1/metadata_pb.js');
var provenance_metadata_v1_objectstore_pb = require('../../../provenance/metadata/v1/objectstore_pb.js');
var provenance_metadata_v1_p8e_p8e_pb = require('../../../provenance/metadata/v1/p8e/p8e_pb.js');
var provenance_metadata_v1_scope_pb = require('../../../provenance/metadata/v1/scope_pb.js');
var provenance_metadata_v1_specification_pb = require('../../../provenance/metadata/v1/specification_pb.js');

function serialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgAddScopeDataAccessRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddScopeDataAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddScopeDataAccessRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgAddScopeDataAccessResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddScopeDataAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddScopeDataAccessResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgAddScopeOwnerRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddScopeOwnerRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddScopeOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddScopeOwnerRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddScopeOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgAddScopeOwnerResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgAddScopeOwnerResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgAddScopeOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgAddScopeOwnerResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgAddScopeOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgBindOSLocatorRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgBindOSLocatorRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgBindOSLocatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgBindOSLocatorRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgBindOSLocatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgBindOSLocatorResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgBindOSLocatorResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgBindOSLocatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgBindOSLocatorResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgBindOSLocatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteContractSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteContractSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteContractSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteContractSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteContractSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteContractSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteOSLocatorRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteOSLocatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteOSLocatorRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteOSLocatorResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteOSLocatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteOSLocatorResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteRecordRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteRecordRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteRecordRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteRecordResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteRecordResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteRecordResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteRecordSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteRecordSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteRecordSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteRecordSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteRecordSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteRecordSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeDataAccessRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeDataAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeDataAccessRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeDataAccessResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeDataAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeDataAccessResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeOwnerRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeOwnerRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeOwnerResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeOwnerResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgDeleteScopeSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgDeleteScopeSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgDeleteScopeSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgMigrateValueOwnerRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgMigrateValueOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgMigrateValueOwnerRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgMigrateValueOwnerResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgMigrateValueOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgMigrateValueOwnerResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgModifyOSLocatorRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgModifyOSLocatorRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgModifyOSLocatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgModifyOSLocatorRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgModifyOSLocatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgModifyOSLocatorResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgModifyOSLocatorResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgModifyOSLocatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgModifyOSLocatorResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgModifyOSLocatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgSetAccountDataRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgSetAccountDataRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgSetAccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgSetAccountDataRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgSetAccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgSetAccountDataResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgSetAccountDataResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgSetAccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgSetAccountDataResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgSetAccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgUpdateValueOwnersRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgUpdateValueOwnersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgUpdateValueOwnersRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgUpdateValueOwnersResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgUpdateValueOwnersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgUpdateValueOwnersResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteContractSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteContractSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteContractSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteContractSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteContractSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteContractSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteRecordRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteRecordRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteRecordRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteRecordResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteRecordResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteRecordResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteRecordSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteRecordSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteRecordSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteRecordSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteRecordSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteRecordSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteScopeRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteScopeRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteScopeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteScopeRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteScopeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteScopeResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteScopeResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteScopeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteScopeResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteScopeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteScopeSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteScopeSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteScopeSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteScopeSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteScopeSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteScopeSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteSessionRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteSessionRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteSessionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteSessionRequest(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteSessionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_MsgWriteSessionResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_tx_pb.MsgWriteSessionResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.MsgWriteSessionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_MsgWriteSessionResponse(buffer_arg) {
  return provenance_metadata_v1_tx_pb.MsgWriteSessionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Metadata Msg service.
var MsgService = exports.MsgService = {
  // WriteScope adds or updates a scope.
writeScope: {
    path: '/provenance.metadata.v1.Msg/WriteScope',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteScopeRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteScopeResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteScopeRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteScopeRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteScopeResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteScopeResponse,
  },
  // DeleteScope deletes a scope and all associated Records, Sessions.
deleteScope: {
    path: '/provenance.metadata.v1.Msg/DeleteScope',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteScopeRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteScopeResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeResponse,
  },
  // AddScopeDataAccess adds data access AccAddress to scope
addScopeDataAccess: {
    path: '/provenance.metadata.v1.Msg/AddScopeDataAccess',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgAddScopeDataAccessResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgAddScopeDataAccessRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgAddScopeDataAccessRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgAddScopeDataAccessResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgAddScopeDataAccessResponse,
  },
  // DeleteScopeDataAccess removes data access AccAddress from scope
deleteScopeDataAccess: {
    path: '/provenance.metadata.v1.Msg/DeleteScopeDataAccess',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteScopeDataAccessResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeDataAccessRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeDataAccessRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeDataAccessResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeDataAccessResponse,
  },
  // AddScopeOwner adds new owner parties to a scope
addScopeOwner: {
    path: '/provenance.metadata.v1.Msg/AddScopeOwner',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgAddScopeOwnerRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgAddScopeOwnerResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgAddScopeOwnerRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgAddScopeOwnerRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgAddScopeOwnerResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgAddScopeOwnerResponse,
  },
  // DeleteScopeOwner removes owner parties (by addresses) from a scope
deleteScopeOwner: {
    path: '/provenance.metadata.v1.Msg/DeleteScopeOwner',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteScopeOwnerResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeOwnerRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeOwnerRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeOwnerResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeOwnerResponse,
  },
  // UpdateValueOwners sets the value owner of one or more scopes.
updateValueOwners: {
    path: '/provenance.metadata.v1.Msg/UpdateValueOwners',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgUpdateValueOwnersResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgUpdateValueOwnersRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgUpdateValueOwnersRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgUpdateValueOwnersResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgUpdateValueOwnersResponse,
  },
  // MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
migrateValueOwner: {
    path: '/provenance.metadata.v1.Msg/MigrateValueOwner',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgMigrateValueOwnerResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgMigrateValueOwnerRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgMigrateValueOwnerRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgMigrateValueOwnerResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgMigrateValueOwnerResponse,
  },
  // WriteSession adds or updates a session context.
writeSession: {
    path: '/provenance.metadata.v1.Msg/WriteSession',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteSessionRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteSessionResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteSessionRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteSessionRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteSessionResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteSessionResponse,
  },
  // WriteRecord adds or updates a record.
writeRecord: {
    path: '/provenance.metadata.v1.Msg/WriteRecord',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteRecordRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteRecordResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteRecordRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteRecordRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteRecordResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteRecordResponse,
  },
  // DeleteRecord deletes a record.
deleteRecord: {
    path: '/provenance.metadata.v1.Msg/DeleteRecord',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteRecordRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteRecordResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteRecordRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteRecordRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteRecordResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteRecordResponse,
  },
  // ---- Specification Management -----
//
// WriteScopeSpecification adds or updates a scope specification.
writeScopeSpecification: {
    path: '/provenance.metadata.v1.Msg/WriteScopeSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteScopeSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteScopeSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteScopeSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteScopeSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteScopeSpecificationResponse,
  },
  // DeleteScopeSpecification deletes a scope specification.
deleteScopeSpecification: {
    path: '/provenance.metadata.v1.Msg/DeleteScopeSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteScopeSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteScopeSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteScopeSpecificationResponse,
  },
  // WriteContractSpecification adds or updates a contract specification.
writeContractSpecification: {
    path: '/provenance.metadata.v1.Msg/WriteContractSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteContractSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteContractSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteContractSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteContractSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteContractSpecificationResponse,
  },
  // DeleteContractSpecification deletes a contract specification.
deleteContractSpecification: {
    path: '/provenance.metadata.v1.Msg/DeleteContractSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteContractSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteContractSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteContractSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteContractSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteContractSpecificationResponse,
  },
  // AddContractSpecToScopeSpec adds contract specification to a scope specification.
addContractSpecToScopeSpec: {
    path: '/provenance.metadata.v1.Msg/AddContractSpecToScopeSpec',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgAddContractSpecToScopeSpecResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgAddContractSpecToScopeSpecResponse,
  },
  // DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
deleteContractSpecFromScopeSpec: {
    path: '/provenance.metadata.v1.Msg/DeleteContractSpecFromScopeSpec',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteContractSpecFromScopeSpecResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteContractSpecFromScopeSpecResponse,
  },
  // WriteRecordSpecification adds or updates a record specification.
writeRecordSpecification: {
    path: '/provenance.metadata.v1.Msg/WriteRecordSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgWriteRecordSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgWriteRecordSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgWriteRecordSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgWriteRecordSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgWriteRecordSpecificationResponse,
  },
  // DeleteRecordSpecification deletes a record specification.
deleteRecordSpecification: {
    path: '/provenance.metadata.v1.Msg/DeleteRecordSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteRecordSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteRecordSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteRecordSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteRecordSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteRecordSpecificationResponse,
  },
  // ---- Object Store Locator Management -----
//
// BindOSLocator binds an owner address to a uri.
bindOSLocator: {
    path: '/provenance.metadata.v1.Msg/BindOSLocator',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgBindOSLocatorRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgBindOSLocatorResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgBindOSLocatorRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgBindOSLocatorRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgBindOSLocatorResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgBindOSLocatorResponse,
  },
  // DeleteOSLocator deletes an existing ObjectStoreLocator record.
deleteOSLocator: {
    path: '/provenance.metadata.v1.Msg/DeleteOSLocator',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgDeleteOSLocatorResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgDeleteOSLocatorRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgDeleteOSLocatorRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgDeleteOSLocatorResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgDeleteOSLocatorResponse,
  },
  // ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
modifyOSLocator: {
    path: '/provenance.metadata.v1.Msg/ModifyOSLocator',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgModifyOSLocatorRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgModifyOSLocatorResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgModifyOSLocatorRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgModifyOSLocatorRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgModifyOSLocatorResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgModifyOSLocatorResponse,
  },
  // SetAccountData associates some basic data with a metadata address.
// Currently, only scope ids are supported.
setAccountData: {
    path: '/provenance.metadata.v1.Msg/SetAccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_tx_pb.MsgSetAccountDataRequest,
    responseType: provenance_metadata_v1_tx_pb.MsgSetAccountDataResponse,
    requestSerialize: serialize_provenance_metadata_v1_MsgSetAccountDataRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_MsgSetAccountDataRequest,
    responseSerialize: serialize_provenance_metadata_v1_MsgSetAccountDataResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_MsgSetAccountDataResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
// ---- Primary Data Management -----
