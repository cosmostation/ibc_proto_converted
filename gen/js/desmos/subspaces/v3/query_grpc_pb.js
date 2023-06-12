// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_subspaces_v3_query_pb = require('../../../desmos/subspaces/v3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var desmos_subspaces_v3_models_pb = require('../../../desmos/subspaces/v3/models_pb.js');
var desmos_subspaces_v3_models_feegrant_pb = require('../../../desmos/subspaces/v3/models_feegrant_pb.js');

function serialize_desmos_subspaces_v3_QueryGroupAllowancesRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryGroupAllowancesRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryGroupAllowancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryGroupAllowancesRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryGroupAllowancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryGroupAllowancesResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryGroupAllowancesResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryGroupAllowancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryGroupAllowancesResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryGroupAllowancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySectionRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySectionRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySectionRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySectionResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySectionResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySectionResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySectionsRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySectionsRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySectionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySectionsRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySectionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySectionsResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySectionsResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySectionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySectionsResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySectionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySubspaceRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySubspaceRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySubspaceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySubspaceRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySubspaceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySubspaceResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySubspaceResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySubspaceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySubspaceResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySubspaceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySubspacesRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySubspacesRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySubspacesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySubspacesRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySubspacesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QuerySubspacesResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QuerySubspacesResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QuerySubspacesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QuerySubspacesResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QuerySubspacesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserAllowancesRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserAllowancesRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserAllowancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserAllowancesRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserAllowancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserAllowancesResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserAllowancesResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserAllowancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserAllowancesResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserAllowancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupMembersRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupMembersRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupMembersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupMembersRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupMembersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupMembersResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupMembersResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupMembersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupMembersResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupMembersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupsRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupsRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupsRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserGroupsResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserGroupsResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserGroupsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserGroupsResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserGroupsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserPermissionsRequest(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserPermissionsRequest)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserPermissionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserPermissionsRequest(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserPermissionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_subspaces_v3_QueryUserPermissionsResponse(arg) {
  if (!(arg instanceof desmos_subspaces_v3_query_pb.QueryUserPermissionsResponse)) {
    throw new Error('Expected argument of type desmos.subspaces.v3.QueryUserPermissionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_subspaces_v3_QueryUserPermissionsResponse(buffer_arg) {
  return desmos_subspaces_v3_query_pb.QueryUserPermissionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Subspaces queries all the subspaces inside Desmos
subspaces: {
    path: '/desmos.subspaces.v3.Query/Subspaces',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QuerySubspacesRequest,
    responseType: desmos_subspaces_v3_query_pb.QuerySubspacesResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QuerySubspacesRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QuerySubspacesRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QuerySubspacesResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QuerySubspacesResponse,
  },
  // Subspace queries all the information about the subspace with the given id
subspace: {
    path: '/desmos.subspaces.v3.Query/Subspace',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QuerySubspaceRequest,
    responseType: desmos_subspaces_v3_query_pb.QuerySubspaceResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QuerySubspaceRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QuerySubspaceRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QuerySubspaceResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QuerySubspaceResponse,
  },
  // Sections allows to query for the sections of a specific subspace
sections: {
    path: '/desmos.subspaces.v3.Query/Sections',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QuerySectionsRequest,
    responseType: desmos_subspaces_v3_query_pb.QuerySectionsResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QuerySectionsRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QuerySectionsRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QuerySectionsResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QuerySectionsResponse,
  },
  // Section queries all the information about the section with the given id
section: {
    path: '/desmos.subspaces.v3.Query/Section',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QuerySectionRequest,
    responseType: desmos_subspaces_v3_query_pb.QuerySectionResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QuerySectionRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QuerySectionRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QuerySectionResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QuerySectionResponse,
  },
  // UserGroups queries all the groups that are present inside the subspace with
// the given id
userGroups: {
    path: '/desmos.subspaces.v3.Query/UserGroups',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryUserGroupsRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryUserGroupsResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryUserGroupsRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupsRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryUserGroupsResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupsResponse,
  },
  // UserGroup queries the user group having the given id inside the specific
// subspace
userGroup: {
    path: '/desmos.subspaces.v3.Query/UserGroup',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryUserGroupRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryUserGroupResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryUserGroupRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryUserGroupResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupResponse,
  },
  // UserGroupMembers queries all the members of a given user group
userGroupMembers: {
    path: '/desmos.subspaces.v3.Query/UserGroupMembers',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryUserGroupMembersRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryUserGroupMembersResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryUserGroupMembersRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupMembersRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryUserGroupMembersResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryUserGroupMembersResponse,
  },
  // UserPermissions queries the permissions for the given user
userPermissions: {
    path: '/desmos.subspaces.v3.Query/UserPermissions',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryUserPermissionsRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryUserPermissionsResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryUserPermissionsRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryUserPermissionsRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryUserPermissionsResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryUserPermissionsResponse,
  },
  // UserAllowances returns all the grants for users.
userAllowances: {
    path: '/desmos.subspaces.v3.Query/UserAllowances',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryUserAllowancesRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryUserAllowancesResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryUserAllowancesRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryUserAllowancesRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryUserAllowancesResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryUserAllowancesResponse,
  },
  // GroupAllowances returns all the grants for groups.
groupAllowances: {
    path: '/desmos.subspaces.v3.Query/GroupAllowances',
    requestStream: false,
    responseStream: false,
    requestType: desmos_subspaces_v3_query_pb.QueryGroupAllowancesRequest,
    responseType: desmos_subspaces_v3_query_pb.QueryGroupAllowancesResponse,
    requestSerialize: serialize_desmos_subspaces_v3_QueryGroupAllowancesRequest,
    requestDeserialize: deserialize_desmos_subspaces_v3_QueryGroupAllowancesRequest,
    responseSerialize: serialize_desmos_subspaces_v3_QueryGroupAllowancesResponse,
    responseDeserialize: deserialize_desmos_subspaces_v3_QueryGroupAllowancesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
