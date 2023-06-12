// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_subspaces_v3_msgs_pb = require('../../../desmos/subspaces/v3/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var desmos_subspaces_v3_msgs_treasury_pb = require('../../../desmos/subspaces/v3/msgs_treasury_pb.js');
var desmos_subspaces_v3_msgs_feegrant_pb = require('../../../desmos/subspaces/v3/msgs_feegrant_pb.js');

function serialize_desmos_subspaces_v3_MsgAddUserToUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgAddUserToUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgAddUserToUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgAddUserToUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgAddUserToUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgAddUserToUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateSection(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateSection)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateSection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateSection(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateSection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateSectionResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateSectionResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateSectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateSectionResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateSectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateSubspace(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateSubspace)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateSubspace');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateSubspace(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateSubspace.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateSubspaceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateSubspaceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateSubspaceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateSubspaceResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateSubspaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgCreateUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgCreateUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgCreateUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgCreateUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgCreateUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteSection(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteSection)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteSection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteSection(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteSection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteSectionResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteSectionResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteSectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteSectionResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteSectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteSubspace(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteSubspace)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteSubspace');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteSubspace(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteSubspace.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteSubspaceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteSubspaceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteSubspaceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteSubspaceResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteSubspaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgDeleteUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgDeleteUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgDeleteUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditSection(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditSection)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditSection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditSection(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditSection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditSectionResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditSectionResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditSectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditSectionResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditSectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditSubspace(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditSubspace)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditSubspace');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditSubspace(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditSubspace.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditSubspaceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditSubspaceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditSubspaceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditSubspaceResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditSubspaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgEditUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgEditUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgEditUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgEditUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgEditUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgGrantAllowance(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowance)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgGrantAllowance');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgGrantAllowance(buffer_arg) {
  return desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowance.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgGrantAllowanceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowanceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgGrantAllowanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgGrantAllowanceResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorization(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorization)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgGrantTreasuryAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorization(buffer_arg) {
  return desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorizationResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorizationResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorizationResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgMoveSection(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgMoveSection)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgMoveSection');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgMoveSection(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgMoveSection.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgMoveSectionResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgMoveSectionResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgMoveSectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgMoveSectionResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgMoveSectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgMoveUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgMoveUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgMoveUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgMoveUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgMoveUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgMoveUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgMoveUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgMoveUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgMoveUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgMoveUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroup(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroup)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRemoveUserFromUserGroup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroup(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRevokeAllowance(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowance)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRevokeAllowance');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRevokeAllowance(buffer_arg) {
  return desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowance.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRevokeAllowanceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowanceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRevokeAllowanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRevokeAllowanceResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorization(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorization)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRevokeTreasuryAuthorization');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorization(buffer_arg) {
  return desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorization.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorizationResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorizationResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorizationResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorizationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgSetUserGroupPermissions(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissions)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgSetUserGroupPermissions');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgSetUserGroupPermissions(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissions.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgSetUserGroupPermissionsResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissionsResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgSetUserGroupPermissionsResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgSetUserPermissions(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgSetUserPermissions)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgSetUserPermissions');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgSetUserPermissions(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgSetUserPermissions.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_MsgSetUserPermissionsResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_msgs_pb.MsgSetUserPermissionsResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.MsgSetUserPermissionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_MsgSetUserPermissionsResponse(buffer_arg) {
  return desmos_subspaces_v3_msgs_pb.MsgSetUserPermissionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines subspaces Msg service.
var MsgService = exports.MsgService = {
  // CreateSubspace allows to create a subspace
createSubspace: {
    path: '/desmos.subspaces.v3.Msg/CreateSubspace',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgCreateSubspace,
    responseType: desmos_subspaces_v3_msgs_pb.MsgCreateSubspaceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgCreateSubspace,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgCreateSubspace,
    responseSerialize: serialize_desmos_subspaces_v3_MsgCreateSubspaceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgCreateSubspaceResponse,
  },
  // EditSubspace allows to edit a subspace
editSubspace: {
    path: '/desmos.subspaces.v3.Msg/EditSubspace',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgEditSubspace,
    responseType: desmos_subspaces_v3_msgs_pb.MsgEditSubspaceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgEditSubspace,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgEditSubspace,
    responseSerialize: serialize_desmos_subspaces_v3_MsgEditSubspaceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgEditSubspaceResponse,
  },
  // DeleteSubspace allows to delete a subspace
deleteSubspace: {
    path: '/desmos.subspaces.v3.Msg/DeleteSubspace',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgDeleteSubspace,
    responseType: desmos_subspaces_v3_msgs_pb.MsgDeleteSubspaceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgDeleteSubspace,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteSubspace,
    responseSerialize: serialize_desmos_subspaces_v3_MsgDeleteSubspaceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteSubspaceResponse,
  },
  // CreateSection allows to create a new subspace section
createSection: {
    path: '/desmos.subspaces.v3.Msg/CreateSection',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgCreateSection,
    responseType: desmos_subspaces_v3_msgs_pb.MsgCreateSectionResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgCreateSection,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgCreateSection,
    responseSerialize: serialize_desmos_subspaces_v3_MsgCreateSectionResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgCreateSectionResponse,
  },
  // EditSection allows to edit an existing section
editSection: {
    path: '/desmos.subspaces.v3.Msg/EditSection',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgEditSection,
    responseType: desmos_subspaces_v3_msgs_pb.MsgEditSectionResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgEditSection,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgEditSection,
    responseSerialize: serialize_desmos_subspaces_v3_MsgEditSectionResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgEditSectionResponse,
  },
  // MoveSection allows to move an existing section to another parent
moveSection: {
    path: '/desmos.subspaces.v3.Msg/MoveSection',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgMoveSection,
    responseType: desmos_subspaces_v3_msgs_pb.MsgMoveSectionResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgMoveSection,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgMoveSection,
    responseSerialize: serialize_desmos_subspaces_v3_MsgMoveSectionResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgMoveSectionResponse,
  },
  // DeleteSection allows to delete an existing section
deleteSection: {
    path: '/desmos.subspaces.v3.Msg/DeleteSection',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgDeleteSection,
    responseType: desmos_subspaces_v3_msgs_pb.MsgDeleteSectionResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgDeleteSection,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteSection,
    responseSerialize: serialize_desmos_subspaces_v3_MsgDeleteSectionResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteSectionResponse,
  },
  // CreateUserGroup allows to create a user group
createUserGroup: {
    path: '/desmos.subspaces.v3.Msg/CreateUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgCreateUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgCreateUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgCreateUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgCreateUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgCreateUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgCreateUserGroupResponse,
  },
  // EditUserGroup allows to edit a user group
editUserGroup: {
    path: '/desmos.subspaces.v3.Msg/EditUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgEditUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgEditUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgEditUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgEditUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgEditUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgEditUserGroupResponse,
  },
  // MoveUserGroup allows to move a user group from a section to another
moveUserGroup: {
    path: '/desmos.subspaces.v3.Msg/MoveUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgMoveUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgMoveUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgMoveUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgMoveUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgMoveUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgMoveUserGroupResponse,
  },
  // SetUserGroupPermissions allows to set the permissions for a specific group
setUserGroupPermissions: {
    path: '/desmos.subspaces.v3.Msg/SetUserGroupPermissions',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissions,
    responseType: desmos_subspaces_v3_msgs_pb.MsgSetUserGroupPermissionsResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgSetUserGroupPermissions,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgSetUserGroupPermissions,
    responseSerialize: serialize_desmos_subspaces_v3_MsgSetUserGroupPermissionsResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgSetUserGroupPermissionsResponse,
  },
  // DeleteUserGroup allows to delete an existing user group
deleteUserGroup: {
    path: '/desmos.subspaces.v3.Msg/DeleteUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgDeleteUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgDeleteUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgDeleteUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgDeleteUserGroupResponse,
  },
  // AddUserToUserGroup allows to add a specific user to a specific user group
addUserToUserGroup: {
    path: '/desmos.subspaces.v3.Msg/AddUserToUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgAddUserToUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgAddUserToUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgAddUserToUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgAddUserToUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgAddUserToUserGroupResponse,
  },
  // RemoveUserFromUserGroup allows to remove a specific user from a specific
// user group
removeUserFromUserGroup: {
    path: '/desmos.subspaces.v3.Msg/RemoveUserFromUserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroup,
    responseType: desmos_subspaces_v3_msgs_pb.MsgRemoveUserFromUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroup,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroup,
    responseSerialize: serialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgRemoveUserFromUserGroupResponse,
  },
  // SetUserPermissions allows to set the permissions for a specific user
setUserPermissions: {
    path: '/desmos.subspaces.v3.Msg/SetUserPermissions',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_pb.MsgSetUserPermissions,
    responseType: desmos_subspaces_v3_msgs_pb.MsgSetUserPermissionsResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgSetUserPermissions,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgSetUserPermissions,
    responseSerialize: serialize_desmos_subspaces_v3_MsgSetUserPermissionsResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgSetUserPermissionsResponse,
  },
  // GrantTreasuryAuthorization allows managers who have the permission to grant
// a treasury authorization to a user
grantTreasuryAuthorization: {
    path: '/desmos.subspaces.v3.Msg/GrantTreasuryAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorization,
    responseType: desmos_subspaces_v3_msgs_treasury_pb.MsgGrantTreasuryAuthorizationResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorization,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorization,
    responseSerialize: serialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorizationResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgGrantTreasuryAuthorizationResponse,
  },
  // RevokeTreasuryAuthorization allows managers who have the permission to
// revoke an existing treasury authorization
revokeTreasuryAuthorization: {
    path: '/desmos.subspaces.v3.Msg/RevokeTreasuryAuthorization',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorization,
    responseType: desmos_subspaces_v3_msgs_treasury_pb.MsgRevokeTreasuryAuthorizationResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorization,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorization,
    responseSerialize: serialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorizationResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgRevokeTreasuryAuthorizationResponse,
  },
  // GrantAllowance allows the granter to grant a fee allowance to the
// grantee
grantAllowance: {
    path: '/desmos.subspaces.v3.Msg/GrantAllowance',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowance,
    responseType: desmos_subspaces_v3_msgs_feegrant_pb.MsgGrantAllowanceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgGrantAllowance,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgGrantAllowance,
    responseSerialize: serialize_desmos_subspaces_v3_MsgGrantAllowanceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgGrantAllowanceResponse,
  },
  // RevokeAllowance allows a granter to revoke any existing treasury allowance
// that has been granted to the grantee
revokeAllowance: {
    path: '/desmos.subspaces.v3.Msg/RevokeAllowance',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowance,
    responseType: desmos_subspaces_v3_msgs_feegrant_pb.MsgRevokeAllowanceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_MsgRevokeAllowance,
    requestDeserialize: deserialize_desmos_subspaces_v3_MsgRevokeAllowance,
    responseSerialize: serialize_desmos_subspaces_v3_MsgRevokeAllowanceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_MsgRevokeAllowanceResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
