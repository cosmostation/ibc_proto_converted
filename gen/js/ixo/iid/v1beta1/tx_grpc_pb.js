// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_iid_v1beta1_tx_pb = require('../../../ixo/iid/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var ixo_iid_v1beta1_iid_pb = require('../../../ixo/iid/v1beta1/iid_pb.js');
var ixo_iid_v1beta1_types_pb = require('../../../ixo/iid/v1beta1/types_pb.js');

function serialize_ixo_iid_v1beta1_MsgAddAccordedRight(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddAccordedRight)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddAccordedRight');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddAccordedRight(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddAccordedRight.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddAccordedRightResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddAccordedRightResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddAccordedRightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddAccordedRightResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddAccordedRightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddController(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddController)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddController(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddControllerResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddControllerResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddControllerResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddIidContext(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddIidContext)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddIidContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddIidContext(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddIidContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddIidContextResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddIidContextResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddIidContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddIidContextResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddIidContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedClaim(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaim)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedClaim(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedClaimResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaimResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedClaimResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedEntity(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntity)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedEntity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedEntity(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedEntityResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntityResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedEntityResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedResource(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedResource)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedResource');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedResource(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedResource.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddLinkedResourceResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddLinkedResourceResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddLinkedResourceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddLinkedResourceResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddLinkedResourceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddService(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddService)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddService(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddServiceResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddServiceResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddServiceResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddVerification(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddVerification)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddVerification');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddVerification(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddVerification.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgAddVerificationResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgAddVerificationResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgAddVerificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgAddVerificationResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgAddVerificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgCreateIidDocument(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgCreateIidDocument)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgCreateIidDocument');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgCreateIidDocument(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgCreateIidDocument.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgCreateIidDocumentResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgCreateIidDocumentResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgCreateIidDocumentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgCreateIidDocumentResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgCreateIidDocumentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeactivateIID(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeactivateIID)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeactivateIID');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeactivateIID(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeactivateIID.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeactivateIIDResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeactivateIIDResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeactivateIIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeactivateIIDResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeactivateIIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteAccordedRight(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRight)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteAccordedRight');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteAccordedRight(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRight.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteAccordedRightResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRightResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteAccordedRightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteAccordedRightResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteController(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteController)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteController(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteControllerResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteControllerResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteControllerResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteIidContext(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteIidContext)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteIidContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteIidContext(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteIidContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteIidContextResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteIidContextResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteIidContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteIidContextResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteIidContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedClaim(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaim)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedClaim(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedClaimResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaimResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedClaimResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedEntity(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntity)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedEntity');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedEntity(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntity.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedEntityResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntityResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedEntityResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedResource(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResource)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedResource');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedResource(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResource.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteLinkedResourceResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResourceResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteLinkedResourceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteLinkedResourceResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResourceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteService(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteService)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteService(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgDeleteServiceResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgDeleteServiceResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgDeleteServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgDeleteServiceResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgDeleteServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgRevokeVerification(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgRevokeVerification)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgRevokeVerification');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgRevokeVerification(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgRevokeVerification.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgRevokeVerificationResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgRevokeVerificationResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgRevokeVerificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgRevokeVerificationResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgRevokeVerificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgSetVerificationRelationships(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationships)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgSetVerificationRelationships');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgSetVerificationRelationships(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationships.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgSetVerificationRelationshipsResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationshipsResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgSetVerificationRelationshipsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgSetVerificationRelationshipsResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationshipsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgUpdateIidDocument(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocument)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgUpdateIidDocument');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgUpdateIidDocument(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocument.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_iid_v1beta1_MsgUpdateIidDocumentResponse(arg) {
  if (!(arg instanceof ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocumentResponse)) {
    throw new Error('Expected argument of type ixo.iid.v1beta1.MsgUpdateIidDocumentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_iid_v1beta1_MsgUpdateIidDocumentResponse(buffer_arg) {
  return ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocumentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the identity Msg service.
var MsgService = exports.MsgService = {
  // CreateDidDocument defines a method for creating a new identity.
createIidDocument: {
    path: '/ixo.iid.v1beta1.Msg/CreateIidDocument',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgCreateIidDocument,
    responseType: ixo_iid_v1beta1_tx_pb.MsgCreateIidDocumentResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgCreateIidDocument,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgCreateIidDocument,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgCreateIidDocumentResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgCreateIidDocumentResponse,
  },
  // UpdateDidDocument defines a method for updating an identity.
updateIidDocument: {
    path: '/ixo.iid.v1beta1.Msg/UpdateIidDocument',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocument,
    responseType: ixo_iid_v1beta1_tx_pb.MsgUpdateIidDocumentResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgUpdateIidDocument,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgUpdateIidDocument,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgUpdateIidDocumentResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgUpdateIidDocumentResponse,
  },
  // AddVerificationMethod adds a new verification method
addVerification: {
    path: '/ixo.iid.v1beta1.Msg/AddVerification',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddVerification,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddVerificationResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddVerification,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddVerification,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddVerificationResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddVerificationResponse,
  },
  // RevokeVerification remove the verification method and all associated
// verification Relations
revokeVerification: {
    path: '/ixo.iid.v1beta1.Msg/RevokeVerification',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgRevokeVerification,
    responseType: ixo_iid_v1beta1_tx_pb.MsgRevokeVerificationResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgRevokeVerification,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgRevokeVerification,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgRevokeVerificationResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgRevokeVerificationResponse,
  },
  // SetVerificationRelationships overwrite current verification relationships
setVerificationRelationships: {
    path: '/ixo.iid.v1beta1.Msg/SetVerificationRelationships',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationships,
    responseType: ixo_iid_v1beta1_tx_pb.MsgSetVerificationRelationshipsResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgSetVerificationRelationships,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgSetVerificationRelationships,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgSetVerificationRelationshipsResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgSetVerificationRelationshipsResponse,
  },
  // AddService add a new service
addService: {
    path: '/ixo.iid.v1beta1.Msg/AddService',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddService,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddServiceResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddService,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddService,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddServiceResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddServiceResponse,
  },
  // DeleteService delete an existing service
deleteService: {
    path: '/ixo.iid.v1beta1.Msg/DeleteService',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteService,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteServiceResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteService,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteService,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteServiceResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteServiceResponse,
  },
  // AddService add a new service
addController: {
    path: '/ixo.iid.v1beta1.Msg/AddController',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddController,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddControllerResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddController,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddController,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddControllerResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddControllerResponse,
  },
  // DeleteService delete an existing service
deleteController: {
    path: '/ixo.iid.v1beta1.Msg/DeleteController',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteController,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteControllerResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteController,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteController,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteControllerResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteControllerResponse,
  },
  // Add / Delete Linked Resource
addLinkedResource: {
    path: '/ixo.iid.v1beta1.Msg/AddLinkedResource',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedResource,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedResourceResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedResource,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedResource,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedResourceResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedResourceResponse,
  },
  deleteLinkedResource: {
    path: '/ixo.iid.v1beta1.Msg/DeleteLinkedResource',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResource,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedResourceResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedResource,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedResource,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedResourceResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedResourceResponse,
  },
  // Add / Delete Linked Claims
addLinkedClaim: {
    path: '/ixo.iid.v1beta1.Msg/AddLinkedClaim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaim,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedClaimResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedClaim,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedClaim,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedClaimResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedClaimResponse,
  },
  deleteLinkedClaim: {
    path: '/ixo.iid.v1beta1.Msg/DeleteLinkedClaim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaim,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedClaimResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedClaim,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedClaim,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedClaimResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedClaimResponse,
  },
  // Add / Delete Linked Entity
addLinkedEntity: {
    path: '/ixo.iid.v1beta1.Msg/AddLinkedEntity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntity,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddLinkedEntityResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedEntity,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedEntity,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddLinkedEntityResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddLinkedEntityResponse,
  },
  deleteLinkedEntity: {
    path: '/ixo.iid.v1beta1.Msg/DeleteLinkedEntity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntity,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteLinkedEntityResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedEntity,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedEntity,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteLinkedEntityResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteLinkedEntityResponse,
  },
  // Add / Delete Accorded Right
addAccordedRight: {
    path: '/ixo.iid.v1beta1.Msg/AddAccordedRight',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddAccordedRight,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddAccordedRightResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddAccordedRight,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddAccordedRight,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddAccordedRightResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddAccordedRightResponse,
  },
  deleteAccordedRight: {
    path: '/ixo.iid.v1beta1.Msg/DeleteAccordedRight',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRight,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteAccordedRightResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteAccordedRight,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteAccordedRight,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteAccordedRightResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteAccordedRightResponse,
  },
  // Add / Delete Context
addIidContext: {
    path: '/ixo.iid.v1beta1.Msg/AddIidContext',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgAddIidContext,
    responseType: ixo_iid_v1beta1_tx_pb.MsgAddIidContextResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgAddIidContext,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgAddIidContext,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgAddIidContextResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgAddIidContextResponse,
  },
  deactivateIID: {
    path: '/ixo.iid.v1beta1.Msg/DeactivateIID',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeactivateIID,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeactivateIIDResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeactivateIID,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeactivateIID,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeactivateIIDResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeactivateIIDResponse,
  },
  deleteIidContext: {
    path: '/ixo.iid.v1beta1.Msg/DeleteIidContext',
    requestStream: false,
    responseStream: false,
    requestType: ixo_iid_v1beta1_tx_pb.MsgDeleteIidContext,
    responseType: ixo_iid_v1beta1_tx_pb.MsgDeleteIidContextResponse,
    requestSerialize: serialize_ixo_iid_v1beta1_MsgDeleteIidContext,
    requestDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteIidContext,
    responseSerialize: serialize_ixo_iid_v1beta1_MsgDeleteIidContextResponse,
    responseDeserialize: deserialize_ixo_iid_v1beta1_MsgDeleteIidContextResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
