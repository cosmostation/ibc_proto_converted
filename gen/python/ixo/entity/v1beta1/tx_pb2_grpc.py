# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from ixo.entity.v1beta1 import tx_pb2 as ixo_dot_entity_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the project Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateEntity = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/CreateEntity',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntity.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityResponse.FromString,
                )
        self.UpdateEntity = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/UpdateEntity',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntity.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityResponse.FromString,
                )
        self.UpdateEntityVerified = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/UpdateEntityVerified',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerified.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerifiedResponse.FromString,
                )
        self.TransferEntity = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/TransferEntity',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntity.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntityResponse.FromString,
                )
        self.CreateEntityAccount = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/CreateEntityAccount',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccount.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccountResponse.FromString,
                )
        self.GrantEntityAccountAuthz = channel.unary_unary(
                '/ixo.entity.v1beta1.Msg/GrantEntityAccountAuthz',
                request_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthz.SerializeToString,
                response_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthzResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the project Msg service.
    """

    def CreateEntity(self, request, context):
        """CreateEntity defines a method for creating a entity.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateEntity(self, request, context):
        """UpdateEntity defines a method for updating a entity
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateEntityVerified(self, request, context):
        """UpdateEntityVerified defines a method for updating if an entity is verified
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TransferEntity(self, request, context):
        """Transfers an entity and its nft to the recipient
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateEntityAccount(self, request, context):
        """Create a module account for an entity,
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GrantEntityAccountAuthz(self, request, context):
        """Create a authz grant from entity account
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateEntity': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateEntity,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntity.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityResponse.SerializeToString,
            ),
            'UpdateEntity': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEntity,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntity.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityResponse.SerializeToString,
            ),
            'UpdateEntityVerified': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateEntityVerified,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerified.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerifiedResponse.SerializeToString,
            ),
            'TransferEntity': grpc.unary_unary_rpc_method_handler(
                    servicer.TransferEntity,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntity.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntityResponse.SerializeToString,
            ),
            'CreateEntityAccount': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateEntityAccount,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccount.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccountResponse.SerializeToString,
            ),
            'GrantEntityAccountAuthz': grpc.unary_unary_rpc_method_handler(
                    servicer.GrantEntityAccountAuthz,
                    request_deserializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthz.FromString,
                    response_serializer=ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthzResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'ixo.entity.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the project Msg service.
    """

    @staticmethod
    def CreateEntity(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/CreateEntity',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntity.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEntity(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/UpdateEntity',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntity.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateEntityVerified(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/UpdateEntityVerified',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerified.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgUpdateEntityVerifiedResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TransferEntity(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/TransferEntity',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntity.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgTransferEntityResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateEntityAccount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/CreateEntityAccount',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccount.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgCreateEntityAccountResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GrantEntityAccountAuthz(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.entity.v1beta1.Msg/GrantEntityAccountAuthz',
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthz.SerializeToString,
            ixo_dot_entity_dot_v1beta1_dot_tx__pb2.MsgGrantEntityAccountAuthzResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)