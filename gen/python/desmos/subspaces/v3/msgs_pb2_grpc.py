# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from desmos.subspaces.v3 import msgs_feegrant_pb2 as desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2
from desmos.subspaces.v3 import msgs_pb2 as desmos_dot_subspaces_dot_v3_dot_msgs__pb2
from desmos.subspaces.v3 import msgs_treasury_pb2 as desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2


class MsgStub(object):
    """Msg defines subspaces Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateSubspace = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/CreateSubspace',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspace.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspaceResponse.FromString,
                )
        self.EditSubspace = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/EditSubspace',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspace.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspaceResponse.FromString,
                )
        self.DeleteSubspace = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/DeleteSubspace',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspace.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspaceResponse.FromString,
                )
        self.CreateSection = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/CreateSection',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSection.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSectionResponse.FromString,
                )
        self.EditSection = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/EditSection',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSection.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSectionResponse.FromString,
                )
        self.MoveSection = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/MoveSection',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSection.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSectionResponse.FromString,
                )
        self.DeleteSection = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/DeleteSection',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSection.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSectionResponse.FromString,
                )
        self.CreateUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/CreateUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroupResponse.FromString,
                )
        self.EditUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/EditUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroupResponse.FromString,
                )
        self.MoveUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/MoveUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroupResponse.FromString,
                )
        self.SetUserGroupPermissions = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/SetUserGroupPermissions',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissions.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissionsResponse.FromString,
                )
        self.DeleteUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/DeleteUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroupResponse.FromString,
                )
        self.AddUserToUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/AddUserToUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroupResponse.FromString,
                )
        self.RemoveUserFromUserGroup = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/RemoveUserFromUserGroup',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroup.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroupResponse.FromString,
                )
        self.SetUserPermissions = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/SetUserPermissions',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissions.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissionsResponse.FromString,
                )
        self.GrantTreasuryAuthorization = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/GrantTreasuryAuthorization',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorization.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorizationResponse.FromString,
                )
        self.RevokeTreasuryAuthorization = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/RevokeTreasuryAuthorization',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorization.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorizationResponse.FromString,
                )
        self.GrantAllowance = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/GrantAllowance',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowance.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowanceResponse.FromString,
                )
        self.RevokeAllowance = channel.unary_unary(
                '/desmos.subspaces.v3.Msg/RevokeAllowance',
                request_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowance.SerializeToString,
                response_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowanceResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines subspaces Msg service.
    """

    def CreateSubspace(self, request, context):
        """CreateSubspace allows to create a subspace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditSubspace(self, request, context):
        """EditSubspace allows to edit a subspace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteSubspace(self, request, context):
        """DeleteSubspace allows to delete a subspace
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateSection(self, request, context):
        """CreateSection allows to create a new subspace section
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditSection(self, request, context):
        """EditSection allows to edit an existing section
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MoveSection(self, request, context):
        """MoveSection allows to move an existing section to another parent
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteSection(self, request, context):
        """DeleteSection allows to delete an existing section
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateUserGroup(self, request, context):
        """CreateUserGroup allows to create a user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditUserGroup(self, request, context):
        """EditUserGroup allows to edit a user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MoveUserGroup(self, request, context):
        """MoveUserGroup allows to move a user group from a section to another
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetUserGroupPermissions(self, request, context):
        """SetUserGroupPermissions allows to set the permissions for a specific group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteUserGroup(self, request, context):
        """DeleteUserGroup allows to delete an existing user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddUserToUserGroup(self, request, context):
        """AddUserToUserGroup allows to add a specific user to a specific user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveUserFromUserGroup(self, request, context):
        """RemoveUserFromUserGroup allows to remove a specific user from a specific
        user group
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetUserPermissions(self, request, context):
        """SetUserPermissions allows to set the permissions for a specific user
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GrantTreasuryAuthorization(self, request, context):
        """GrantTreasuryAuthorization allows managers who have the permission to grant
        a treasury authorization to a user
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RevokeTreasuryAuthorization(self, request, context):
        """RevokeTreasuryAuthorization allows managers who have the permission to
        revoke an existing treasury authorization
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GrantAllowance(self, request, context):
        """GrantAllowance allows the granter to grant a fee allowance to the
        grantee
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RevokeAllowance(self, request, context):
        """RevokeAllowance allows a granter to revoke any existing treasury allowance
        that has been granted to the grantee
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateSubspace': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateSubspace,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspace.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspaceResponse.SerializeToString,
            ),
            'EditSubspace': grpc.unary_unary_rpc_method_handler(
                    servicer.EditSubspace,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspace.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspaceResponse.SerializeToString,
            ),
            'DeleteSubspace': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteSubspace,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspace.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspaceResponse.SerializeToString,
            ),
            'CreateSection': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateSection,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSection.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSectionResponse.SerializeToString,
            ),
            'EditSection': grpc.unary_unary_rpc_method_handler(
                    servicer.EditSection,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSection.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSectionResponse.SerializeToString,
            ),
            'MoveSection': grpc.unary_unary_rpc_method_handler(
                    servicer.MoveSection,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSection.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSectionResponse.SerializeToString,
            ),
            'DeleteSection': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteSection,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSection.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSectionResponse.SerializeToString,
            ),
            'CreateUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroupResponse.SerializeToString,
            ),
            'EditUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.EditUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroupResponse.SerializeToString,
            ),
            'MoveUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.MoveUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroupResponse.SerializeToString,
            ),
            'SetUserGroupPermissions': grpc.unary_unary_rpc_method_handler(
                    servicer.SetUserGroupPermissions,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissions.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissionsResponse.SerializeToString,
            ),
            'DeleteUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroupResponse.SerializeToString,
            ),
            'AddUserToUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.AddUserToUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroupResponse.SerializeToString,
            ),
            'RemoveUserFromUserGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveUserFromUserGroup,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroup.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroupResponse.SerializeToString,
            ),
            'SetUserPermissions': grpc.unary_unary_rpc_method_handler(
                    servicer.SetUserPermissions,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissions.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissionsResponse.SerializeToString,
            ),
            'GrantTreasuryAuthorization': grpc.unary_unary_rpc_method_handler(
                    servicer.GrantTreasuryAuthorization,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorization.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorizationResponse.SerializeToString,
            ),
            'RevokeTreasuryAuthorization': grpc.unary_unary_rpc_method_handler(
                    servicer.RevokeTreasuryAuthorization,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorization.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorizationResponse.SerializeToString,
            ),
            'GrantAllowance': grpc.unary_unary_rpc_method_handler(
                    servicer.GrantAllowance,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowance.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowanceResponse.SerializeToString,
            ),
            'RevokeAllowance': grpc.unary_unary_rpc_method_handler(
                    servicer.RevokeAllowance,
                    request_deserializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowance.FromString,
                    response_serializer=desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowanceResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'desmos.subspaces.v3.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines subspaces Msg service.
    """

    @staticmethod
    def CreateSubspace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/CreateSubspace',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspace.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSubspaceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditSubspace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/EditSubspace',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspace.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSubspaceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteSubspace(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/DeleteSubspace',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspace.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSubspaceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateSection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/CreateSection',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSection.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateSectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditSection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/EditSection',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSection.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditSectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MoveSection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/MoveSection',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSection.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveSectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteSection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/DeleteSection',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSection.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteSectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/CreateUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgCreateUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/EditUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgEditUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MoveUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/MoveUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgMoveUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetUserGroupPermissions(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/SetUserGroupPermissions',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissions.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserGroupPermissionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/DeleteUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgDeleteUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddUserToUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/AddUserToUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgAddUserToUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveUserFromUserGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/RemoveUserFromUserGroup',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroup.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgRemoveUserFromUserGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetUserPermissions(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/SetUserPermissions',
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissions.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__pb2.MsgSetUserPermissionsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GrantTreasuryAuthorization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/GrantTreasuryAuthorization',
            desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorization.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgGrantTreasuryAuthorizationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RevokeTreasuryAuthorization(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/RevokeTreasuryAuthorization',
            desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorization.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2.MsgRevokeTreasuryAuthorizationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GrantAllowance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/GrantAllowance',
            desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowance.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgGrantAllowanceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RevokeAllowance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.subspaces.v3.Msg/RevokeAllowance',
            desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowance.SerializeToString,
            desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2.MsgRevokeAllowanceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)