# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from desmos.subspaces.v3 import query_pb2 as desmos_dot_subspaces_dot_v3_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Subspaces = channel.unary_unary(
                '/desmos.subspaces.v3.Query/Subspaces',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesResponse.FromString,
                )
        self.Subspace = channel.unary_unary(
                '/desmos.subspaces.v3.Query/Subspace',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceResponse.FromString,
                )
        self.Sections = channel.unary_unary(
                '/desmos.subspaces.v3.Query/Sections',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsResponse.FromString,
                )
        self.Section = channel.unary_unary(
                '/desmos.subspaces.v3.Query/Section',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionResponse.FromString,
                )
        self.UserGroups = channel.unary_unary(
                '/desmos.subspaces.v3.Query/UserGroups',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsResponse.FromString,
                )
        self.UserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Query/UserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupResponse.FromString,
                )
        self.UserGroupMembers = channel.unary_unary(
                '/desmos.subspaces.v3.Query/UserGroupMembers',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersResponse.FromString,
                )
        self.UserPermissions = channel.unary_unary(
                '/desmos.subspaces.v3.Query/UserPermissions',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsResponse.FromString,
                )
        self.UserAllowances = channel.unary_unary(
                '/desmos.subspaces.v3.Query/UserAllowances',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesResponse.FromString,
                )
        self.GroupAllowances = channel.unary_unary(
                '/desmos.subspaces.v3.Query/GroupAllowances',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesRequest.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service
    """

    def Subspaces(self, request, context):
        """Subspaces queries all the subspaces inside Desmos
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Subspace(self, request, context):
        """Subspace queries all the information about the subspace with the given id
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Sections(self, request, context):
        """Sections allows to query for the sections of a specific subspace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Section(self, request, context):
        """Section queries all the information about the section with the given id
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserGroups(self, request, context):
        """UserGroups queries all the groups that are present inside the subspace with
        the given id
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserGroup(self, request, context):
        """UserGroup queries the user group having the given id inside the specific
        subspace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserGroupMembers(self, request, context):
        """UserGroupMembers queries all the members of a given user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserPermissions(self, request, context):
        """UserPermissions queries the permissions for the given user
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UserAllowances(self, request, context):
        """UserAllowances returns all the grants for users.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GroupAllowances(self, request, context):
        """GroupAllowances returns all the grants for groups.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Subspaces': grpc.unary_unary_rpc_method_handler(
                    servicer.Subspaces,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesResponse.SerializeToString,
            ),
            'Subspace': grpc.unary_unary_rpc_method_handler(
                    servicer.Subspace,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceResponse.SerializeToString,
            ),
            'Sections': grpc.unary_unary_rpc_method_handler(
                    servicer.Sections,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsResponse.SerializeToString,
            ),
            'Section': grpc.unary_unary_rpc_method_handler(
                    servicer.Section,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionResponse.SerializeToString,
            ),
            'UserGroups': grpc.unary_unary_rpc_method_handler(
                    servicer.UserGroups,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsResponse.SerializeToString,
            ),
            'UserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.UserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupResponse.SerializeToString,
            ),
            'UserGroupMembers': grpc.unary_unary_rpc_method_handler(
                    servicer.UserGroupMembers,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersResponse.SerializeToString,
            ),
            'UserPermissions': grpc.unary_unary_rpc_method_handler(
                    servicer.UserPermissions,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsResponse.SerializeToString,
            ),
            'UserAllowances': grpc.unary_unary_rpc_method_handler(
                    servicer.UserAllowances,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesResponse.SerializeToString,
            ),
            'GroupAllowances': grpc.unary_unary_rpc_method_handler(
                    servicer.GroupAllowances,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesRequest.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'desmos.subspaces.v3.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service
    """

    @staticmethod
    def Subspaces(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/Subspaces',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspacesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Subspace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/Subspace',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySubspaceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Sections(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/Sections',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Section(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/Section',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QuerySectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserGroups(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/UserGroups',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/UserGroup',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserGroupMembers(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/UserGroupMembers',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserGroupMembersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserPermissions(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/UserPermissions',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserPermissionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UserAllowances(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/UserAllowances',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryUserAllowancesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GroupAllowances(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Query/GroupAllowances',
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesRequest.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_query__pb2.QueryGroupAllowancesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
